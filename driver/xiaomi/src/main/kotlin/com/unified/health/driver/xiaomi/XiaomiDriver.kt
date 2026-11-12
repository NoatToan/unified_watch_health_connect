package com.unified.health.driver.xiaomi

import android.util.Log
import com.unified.health.core.ble.driver.LinkRequirements
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
import com.unified.health.core.model.WearableVendor
import com.unified.health.driver.xiaomi.auth.XiaomiAuthenticator
import com.unified.health.driver.xiaomi.device.XiaomiDeviceCommands
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
 * Xiaomi MiWear V2 watches/bands (protocol §0-§9 [V]: Xiaomi Smart Band 8/9/10, Redmi Watch
 * 3/4/5, Xiaomi Watch S1/S2/S3/S4 non-Wear-OS). MiWear V1 (legacy, protocol version 0) and Wear OS
 * devices (Mi Watch 2019, Xiaomi Watch 2) are out of scope -- see [XiaomiAuthenticator.authenticateV1]
 * and [openSession]'s version check below.
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
     * No OS bond for V2 (protocol §6.1 [V]: "No OS bond is required..."); MTU 512 (protocol §1.2
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

    private suspend fun doOpenSession(gatt: GattClient, context: SessionContext, scope: CoroutineScope): WearableSession {
        val version = readProtocolVersion(gatt)
        Log.i(TAG, "MiWear protocol version $version (${version.generation})")

        val write = gatt.findCharacteristic(XiaomiUuids.V2_WRITE, XiaomiUuids.SERVICE)
        val notify = gatt.findCharacteristic(XiaomiUuids.V2_NOTIFY, XiaomiUuids.SERVICE)
        if (version.generation != XiaomiGeneration.V2 || write == null || notify == null) {
            throw UnsupportedDeviceException(
                "${gatt.address} reports MiWear protocol $version, which needs the legacy V1 characteristics " +
                    "(0x51/0x52/0x53/0x55). This driver only supports the V2 stack (0x5E notify / 0x5F write) " +
                    "for now; see XiaomiAuthenticator.authenticateV1.",
            )
        }

        val link = XiaomiLink(gatt, write, notify, scope)
        link.start()

        val authResult = authenticator.authenticateV2(link, context.credentials)

        // Best-effort (protocol §9.2 [V]: needResponse=false); a failure here must not fail pairing.
        XiaomiDeviceCommands.setTime(link, now(), zoneProvider())

        return XiaomiSession(link, fitnessSync, authResult)
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
            description = "A random id generated once for local bind; not a Xiaomi account id. Usually created automatically.",
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
