package com.unified.health.driver.xiaomi

import android.util.Log
import com.unified.health.core.ble.driver.AuthenticationException
import com.unified.health.core.ble.driver.LinkRequirements
import com.unified.health.core.ble.driver.MissingCredentialException
import com.unified.health.core.ble.driver.RecognitionScore
import com.unified.health.core.ble.driver.SessionContext
import com.unified.health.core.ble.driver.UnsupportedDeviceException
import com.unified.health.core.ble.driver.WearableDriver
import com.unified.health.core.ble.driver.WearableProtocolException
import com.unified.health.core.ble.driver.WearableSession
import com.unified.health.core.ble.gatt.GattClient
import com.unified.health.core.ble.scan.Advertisement
import com.unified.health.core.model.CredentialFormat
import com.unified.health.core.model.CredentialRequirement
import com.unified.health.core.model.HealthRecord
import com.unified.health.core.model.WearableVendor
import com.unified.health.driver.xiaomi.auth.XiaomiAuthResult
import com.unified.health.driver.xiaomi.auth.XiaomiAuthenticator
import com.unified.health.driver.xiaomi.auth.XiaomiBindProbe
import com.unified.health.driver.xiaomi.codec.FitnessPayloadDecoder
import com.unified.health.driver.xiaomi.device.XiaomiDeviceCommands
import com.unified.health.driver.xiaomi.proto.Ha0
import com.unified.health.driver.xiaomi.sync.XiaomiFitnessSync
import com.unified.health.driver.xiaomi.transport.XiaomiLink
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.withTimeoutOrNull
import java.time.Instant
import java.time.ZoneId
import javax.inject.Inject

/**
 * Xiaomi MiWear V2 and V1 watches/bands (protocol §0-§9 [V]: Xiaomi Smart Band 8/9/10, Redmi Watch
 * 3/4/5, Xiaomi Watch S1/S2/S3/S4 non-Wear-OS for V2; some Mi Band 8 units, Redmi Watch 2 Lite,
 * Xiaomi Watch S1 Active for V1). Wear OS devices (Mi Watch 2019, Xiaomi Watch 2) are out of scope
 * -- see [readProtocolVersion]'s KDoc.
 *
 * Which generation a device speaks is only knowable *after* connecting (protocol §0.1 [V]: read a
 * version characteristic once service discovery is done), so [linkRequirements] -- read by the
 * connection manager *before* that -- can never request a bond by itself; [doOpenSession] instead
 * calls [com.unified.health.core.ble.gatt.GattClient.ensureBonded] mid-session, once it has
 * learned this is a V1 device. V2 is unaffected either way: it never calls that method, and
 * [linkRequirements]`.bond` stays `false`, exactly as before this driver supported V1.
 *
 * No cryptography lives here: [openSession] delegates the handshake to [authenticator] and the
 * post-auth system commands to [XiaomiDeviceCommands]; those (plus `transport/XiaomiLink.kt`) are
 * the only places session keys/tokens are touched.
 */
class XiaomiDriver internal constructor(
    private val authenticator: XiaomiAuthenticator,
    private val fitnessSync: XiaomiFitnessSync,
    private val dispatcher: CoroutineDispatcher,
    private val zoneProvider: () -> ZoneId,
    private val now: () -> Instant = Instant::now,
) : WearableDriver {

    @Inject
    internal constructor(authenticator: XiaomiAuthenticator, fitnessSync: XiaomiFitnessSync) :
        this(authenticator, fitnessSync, Dispatchers.Default, ZoneId::systemDefault)

    override val vendor = WearableVendor.XIAOMI

    /**
     * No OS bond here (protocol §6.1 [V]: "No OS bond is required..." for V2) -- `bond` must stay
     * `false`, not `true`/`bondOptional`, because at this point the driver cannot yet tell V1 from
     * V2 (see the class KDoc); V1's own *mandatory* bond (protocol §6.2 step 1) happens later, in
     * [doOpenSession], once [readProtocolVersion] says it is needed. MTU 512 (protocol §1.2
     * [V]: `e7r.J(512)`); 45 s connect / 30 s discovery / 10 s per GATT operation and a GATT-cache
     * refresh before discovery, matching `XIAOMI_IMPLEMENTATION_BRIEF.md` §3.1 (which in turn
     * mirrors the vendor's own connect/discovery timeouts and status-133 workaround, protocol
     * §1.2/§10.1 [V]).
     */
    override val linkRequirements = LinkRequirements(
        bond = false,
        mtu = REQUESTED_MTU,
        connectTimeoutMs = CONNECT_TIMEOUT_MS,
        discoveryTimeoutMs = DISCOVERY_TIMEOUT_MS,
        operationTimeoutMs = GATT_OPERATION_TIMEOUT_MS,
        refreshGattCacheBeforeDiscovery = true,
    )

    override val credentialRequirements: List<CredentialRequirement> = listOf(AUTH_TOKEN, USER_ID, APP_DEVICE_ID)

    /**
     * FE95 MiBeacon service *data* (protocol §1.1 [V]: the watch's advertisement carries a MiBeacon
     * frame under 0xFE95), the FE95 GATT service UUID itself, or a Xiaomi/Redmi/Mi name prefix
     * (`XIAOMI_IMPLEMENTATION_BRIEF.md` §3.1).
     *
     * "Mi Watch" is in the name-prefix list even though it also starts the Wear OS "Mi Watch
     * (2019)"'s advertised name: `recognize()` is a cheap, best-effort scan-time heuristic (lowest
     * score, [RecognitionScore.NAME]), not a protocol check -- a Wear OS device has no FE95 service
     * at all, so [openSession] below is what actually, reliably rejects it.
     */
    override fun recognize(advertisement: Advertisement): Int = when {
        advertisement.serviceData.containsKey(XiaomiUuids.SERVICE) -> RecognitionScore.VENDOR_MANUFACTURER_DATA
        advertisement.serviceUuids.contains(XiaomiUuids.SERVICE) -> RecognitionScore.VENDOR_SERVICE
        advertisement.nameStartsWith(*NAME_PREFIXES) -> RecognitionScore.NAME
        else -> RecognitionScore.NONE
    }

    override suspend fun openSession(gatt: GattClient, context: SessionContext): WearableSession {
        val scope = CoroutineScope(SupervisorJob() + dispatcher)
        try {
            return withTimeoutOrNull(HANDSHAKE_TIMEOUT_MS) { doOpenSession(gatt, context, scope) }
                ?: throw WearableProtocolException(
                    "Xiaomi handshake did not complete within ${HANDSHAKE_TIMEOUT_MS / 1000} s " +
                        "(version read, link open, authentication, time sync, device info). Move closer to " +
                        "the watch and retry.",
                )
        } catch (e: Throwable) {
            scope.cancel()
            throw e
        }
    }

    /**
     * Re-decodes a stored fitness-file [HealthRecord.RawPayload] (M3/M4, protocol §9.3-§9.5 [V]):
     * dispatches to the exact same [FitnessPayloadDecoder.decode] the live sync path
     * ([com.unified.health.driver.xiaomi.sync.XiaomiFitnessSyncImpl]) calls, keyed off the same
     * `kind` string that path chose
     * ([com.unified.health.driver.xiaomi.codec.FitnessKind]). `bytes` is `id.encode() + payload`
     * (see [com.unified.health.driver.xiaomi.codec.FitnessFilePayload.Decoded.rawPayloadBytes]),
     * so the original [com.unified.health.driver.xiaomi.proto.FitnessDataId] (version/timezone/
     * dataType/subType/fileType) a parser needs is recovered without a live link. Every fitness
     * kind without a parser (daytime sleep, user profile, manual measure, weight, ECG,
     * temperature, any sport kind, GPS, ...) already returns `emptyList()` from
     * [FitnessPayloadDecoder.decode] itself -- there is nothing this driver can re-derive for
     * those yet, same scoping as `driver/garmin`'s `GarminDriver.reprocess`.
     */
    override suspend fun reprocess(payload: HealthRecord.RawPayload): List<HealthRecord> {
        if (payload.vendor != WearableVendor.XIAOMI) return emptyList()
        return FitnessPayloadDecoder.decodeStored(payload.bytes)
    }

    private suspend fun doOpenSession(gatt: GattClient, context: SessionContext, scope: CoroutineScope): WearableSession {
        val version = readProtocolVersion(gatt)
        Log.i(TAG, "MiWear protocol version $version (${version.generation})")

        val (write, notify) = when (version.generation) {
            XiaomiGeneration.V2 ->
                gatt.findCharacteristic(XiaomiUuids.V2_WRITE, XiaomiUuids.SERVICE) to
                    gatt.findCharacteristic(XiaomiUuids.V2_NOTIFY, XiaomiUuids.SERVICE)
            XiaomiGeneration.V1 ->
                gatt.findCharacteristic(XiaomiUuids.V1_COMMAND_WRITE, XiaomiUuids.SERVICE) to
                    gatt.findCharacteristic(XiaomiUuids.V1_COMMAND_READ, XiaomiUuids.SERVICE)
        }
        if (write == null || notify == null) {
            throw UnsupportedDeviceException(
                "${gatt.address} reports MiWear protocol $version (${version.generation}) but its 0xFE95 " +
                    "service is missing the matching write/notify characteristics.",
            )
        }

        if (version.generation == XiaomiGeneration.V1) {
            // Mandatory OS bond, before enabling notifications / starting L1 (protocol §6.2 step 1
            // [V]). linkRequirements.bond cannot express this: it is read by the connection manager
            // before this driver can tell V1 from V2 apart (see the class KDoc), so the bond is
            // requested here instead, now that readProtocolVersion has made that call. V2 never
            // reaches this branch, so its link stays unbonded exactly as before.
            if (!gatt.ensureBonded()) {
                throw AuthenticationException(
                    "Could not create the Bluetooth pairing this MiWear V1 watch requires. Accept the " +
                        "pairing request on the watch (and phone, if prompted) and try again.",
                )
            }
        }

        // V1 never tags a frame WRITE_ENC, even post-auth (protocol §6.2 [V]; see XiaomiLink's
        // plaintextPostAuth KDoc) -- it has no session crypto to justify that opcode at all.
        val link = XiaomiLink(gatt, write, notify, scope, plaintextPostAuth = version.generation == XiaomiGeneration.V1)
        link.start()

        val authResult = authenticate(link, context, version.generation)

        // Best-effort (protocol §9.2 [V]: needResponse=false); a failure here must not fail pairing.
        XiaomiDeviceCommands.setTime(link, now(), zoneProvider())

        return XiaomiSession(link, fitnessSync, authResult)
    }

    /**
     * V1 vs. V2, then first-bind vs. reauth within V2 (protocol §6.1/§6.2/§7.2 [V]). V1 has no
     * bind flow this driver can run (see [XiaomiAuthenticator.authenticateV1]'s KDoc), so it always
     * goes straight to session auth. For V2, the `xiaomi.auth_token.unbound` marker is set only on
     * a credential this app generated itself and has not yet had accepted by the watch (see
     * [CredentialRequirement.unboundMarkerKey], mirroring the `driver/zepp` driver's own
     * first-bind detection). The connect flow above the driver already requires every
     * [credentialRequirements] to have a value before `openSession` runs (so [AUTH_TOKEN] itself
     * is never missing here) -- the marker is what actually distinguishes "freshly generated,
     * still needs binding" from "a real token, either local-bound earlier or imported from Mi
     * Fitness".
     */
    private suspend fun authenticate(link: XiaomiLink, context: SessionContext, generation: XiaomiGeneration): XiaomiAuthResult {
        if (generation == XiaomiGeneration.V1) return authenticator.authenticateV1(link, context.credentials)

        val needsBind = context.credentials.get(AUTH_TOKEN.unboundMarkerKey) != null
        if (!needsBind) return authenticator.authenticateV2(link, context.credentials)

        val userId = context.credentials.get(USER_ID.key)?.toString(Charsets.UTF_8)?.takeIf { it.isNotEmpty() }
            ?: throw MissingCredentialException(USER_ID)
        val appDeviceId = context.credentials.get(APP_DEVICE_ID.key)?.toString(Charsets.UTF_8).orEmpty()

        val probe: XiaomiBindProbe = authenticator.probeBindMode(link, userId)
        val result = when (probe.verifyMode) {
            Ha0.VERIFY_MODE_LOCAL_ECDH -> authenticator.localBind(link, userId, appDeviceId, context.credentialWriter)
            Ha0.VERIFY_MODE_PSK_CLOUD -> throw UnsupportedDeviceException(
                "This Xiaomi watch requires a cloud-signed bind (Xiaomi account), which Unified Health does " +
                    "not perform (protocol §7.3/§8.5 -- D-1193). Bind it once in Mi Fitness, extract the 16-byte " +
                    "token from its Transfer.device.log via adb, and paste it as the Xiaomi auth token instead.",
            )
            else -> throw UnsupportedDeviceException("Xiaomi watch reported an unrecognised bind verify mode ${probe.verifyMode}")
        }
        // The watch accepted the bind; this credential is no longer "generated but unconfirmed".
        context.credentialWriter.remove(AUTH_TOKEN.unboundMarkerKey)
        return result
    }

    /**
     * Reads the 3-byte version characteristic (protocol §0.1/§1.2 [V]). A missing FE95 service
     * (and so a missing 0x0050) is the normal signature of a Wear OS watch (protocol §0.3 [V]).
     */
    private suspend fun readProtocolVersion(gatt: GattClient): XiaomiProtocolVersion {
        val characteristic = gatt.findCharacteristic(XiaomiUuids.VERSION, XiaomiUuids.SERVICE)
            ?: throw UnsupportedDeviceException(
                "${gatt.address} does not expose the MiWear service (0xFE95). This is expected for a Wear OS " +
                    "watch (Mi Watch 2019, Xiaomi Watch 2); those sync through Health Connect, not this driver.",
            )
        return XiaomiUuids.parseProtocolVersion(gatt.read(characteristic))
    }

    companion object {
        private const val TAG = "XiaomiDriver"

        /** `e7r.J(512)` (protocol §1.2 [V]). */
        const val REQUESTED_MTU = 512

        /** `XIAOMI_IMPLEMENTATION_BRIEF.md` §3.1 (mirrors the vendor's connect/discovery timeouts, protocol §10.1/§10.2 [V]). */
        const val CONNECT_TIMEOUT_MS = 45_000L
        const val DISCOVERY_TIMEOUT_MS = 30_000L
        const val GATT_OPERATION_TIMEOUT_MS = 10_000L

        /** Overall connection watchdog (protocol §10.1 [V]: "a link that is not READY within ~120 s should be torn down"). */
        const val HANDSHAKE_TIMEOUT_MS = 120_000L

        val AUTH_TOKEN = CredentialRequirement(
            key = "xiaomi.auth_token",
            label = "Xiaomi auth token",
            description = "A 32-character hex key. Created automatically by binding the watch to this app " +
                "(local bind), or copied from Mi Fitness's own log after pairing there once. This app never " +
                "contacts Xiaomi's cloud to create or fetch this token.",
            format = CredentialFormat.HEX_16_BYTES,
            generatable = true,
        )

        val USER_ID = CredentialRequirement(
            key = "xiaomi.user_id",
            label = "Xiaomi local user id",
            description = "A random id generated once for local bind; not a Xiaomi account id. Usually created " +
                "automatically. Exception: a legacy MiWear V1 watch (some Mi Band 8, Redmi Watch 2 Lite, Xiaomi " +
                "Watch S1 Active) that is already bound in Mi Fitness needs the *real* id Mi Fitness used instead " +
                "-- extract it from Mi Fitness's own log via adb and paste it here; the auto-generated default " +
                "will not work on those watches (this app cannot perform a first-time V1 bind).",
            format = CredentialFormat.TEXT,
            generatable = true,
        )

        val APP_DEVICE_ID = CredentialRequirement(
            key = "xiaomi.app_device_id",
            label = "Xiaomi app device id",
            description = "Only required by some firmwares during bind; left empty unless the watch asks for it.",
            format = CredentialFormat.TEXT,
            generatable = true,
        )

        /** Xiaomi/Redmi/Mi Band/Watch name prefixes (`XIAOMI_IMPLEMENTATION_BRIEF.md` §3.1). */
        internal val NAME_PREFIXES = arrayOf(
            "Xiaomi", "Redmi", "Mi Watch", "Mi Band", "Xiaomi Smart Band", "Mi Smart Band",
        )
    }
}
