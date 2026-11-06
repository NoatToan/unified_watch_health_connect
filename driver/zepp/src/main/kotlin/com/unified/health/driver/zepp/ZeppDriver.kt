package com.unified.health.driver.zepp

import android.util.Log
import com.unified.health.core.ble.driver.AuthenticationException
import com.unified.health.core.ble.driver.LinkRequirements
import com.unified.health.core.ble.driver.MissingCredentialException
import com.unified.health.core.ble.driver.RecognitionScore
import com.unified.health.core.ble.driver.SessionContext
import com.unified.health.core.ble.driver.WearableDriver
import com.unified.health.core.ble.driver.WearableSession
import com.unified.health.core.ble.gatt.GattClient
import com.unified.health.core.ble.gatt.GattException
import com.unified.health.core.ble.gatt.StandardUuids
import com.unified.health.core.ble.scan.Advertisement
import com.unified.health.core.model.CredentialFormat
import com.unified.health.core.model.CredentialRequirement
import com.unified.health.core.model.WearableVendor
import com.unified.health.driver.zepp.codec.TimeSync
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import java.security.SecureRandom
import java.time.Instant
import java.time.ZoneId
import java.util.Random
import javax.inject.Inject

/**
 * Zepp / Amazfit (Huami) watches. Authenticates with the auth key created when the watch was
 * bound in the official Zepp app (§5.1) and pulls history over GDSP (§6.1).
 *
 * When the credential carries the "unbound" marker (the app generated the key) the key is first
 * written to the watch (local bind, §5.3/§5.5). The driver never contacts Huami servers and never
 * performs the cloud-signed bind.
 */
class ZeppDriver internal constructor(
    private val dispatcher: CoroutineDispatcher,
    private val zoneProvider: () -> ZoneId,
    private val random: Random,
    private val now: () -> Instant = Instant::now,
) : WearableDriver {

    @Inject constructor() : this(Dispatchers.Default, ZoneId::systemDefault, SecureRandom())

    override val vendor = WearableVendor.ZEPP

    /** No OS bond: security lives in the auth key + channel encryption (§2.3 [I]); MTU 247 (§3.2). */
    override val linkRequirements = LinkRequirements(bond = false, mtu = 247)

    override val credentialRequirements: List<CredentialRequirement> = listOf(AUTH_KEY)

    override fun recognize(advertisement: Advertisement): Int = when {
        ZeppUuids.HUAMI_COMPANY_ID in advertisement.manufacturerData -> RecognitionScore.VENDOR_MANUFACTURER_DATA
        advertisement.hasService(ZeppUuids.SERVICE_MILI) || advertisement.hasService(ZeppUuids.SERVICE_MILI_SECONDARY) ->
            RecognitionScore.VENDOR_SERVICE
        advertisement.nameStartsWith(*NAME_PREFIXES) -> RecognitionScore.NAME
        else -> RecognitionScore.NONE
    }

    override suspend fun openSession(gatt: GattClient, context: SessionContext): WearableSession {
        val authKey = context.credentials.get(AUTH_KEY.key) ?: throw MissingCredentialException(AUTH_KEY)
        if (authKey.size != AUTH_KEY_SIZE) {
            throw AuthenticationException("The stored Zepp auth key has ${authKey.size} bytes; it must be $AUTH_KEY_SIZE (32 hex characters)")
        }
        val scope = CoroutineScope(SupervisorJob() + dispatcher)
        try {
            val confirmBind: (suspend () -> Unit)? = if (context.credentials.get(AUTH_KEY.unboundMarkerKey) != null) {
                { context.credentialWriter.remove(AUTH_KEY.unboundMarkerKey) }
            } else {
                null
            }
            // ZeppHandshake already loads the module list itself (to pick the auth module); reused here
            // for ZeppSession's live-heart-rate routing (OpenAppModule vs 0x2A39).
            val channel = ZeppHandshake(gatt, scope, random).authenticate(authKey, confirmBind)
            val zone = zoneProvider()
            syncTime(gatt, zone)
            return ZeppSession(gatt, channel, scope, zone)
        } catch (e: Throwable) {
            scope.cancel()
            throw e
        }
    }

    /**
     * Writes the Current Time (§4 step 7 [V]); best effort, like the vendor flow it never blocks
     * pairing on this (a watch without `2A2B`, or one that refuses the write, still syncs fine).
     */
    private suspend fun syncTime(gatt: GattClient, zone: ZoneId) {
        val characteristic = gatt.findCharacteristic(StandardUuids.CURRENT_TIME, StandardUuids.CURRENT_TIME_SERVICE) ?: return
        try {
            gatt.write(characteristic, TimeSync.encode(now(), zone))
        } catch (e: CancellationException) {
            throw e
        } catch (e: GattException) {
            Log.w(TAG, "Time sync failed: ${e.message}")
        }
    }

    companion object {
        private const val TAG = "ZeppDriver"
        const val AUTH_KEY_SIZE = 16

        val AUTH_KEY = CredentialRequirement(
            key = "zepp.auth_key",
            label = "Zepp auth key",
            description = "A 32-character hex key. Either paste the key created when the watch was bound with the " +
                "official Zepp app (device list, \"auth_key\"), or let this app generate a key and bind the watch to " +
                "itself. Binding replaces the link with the Zepp app, and the watch may ask you to confirm on its " +
                "screen. This app never contacts Zepp servers, so watches that require a server-signed first bind " +
                "must be bound in the Zepp app first.",
            format = CredentialFormat.HEX_16_BYTES,
            generatable = true,
        )

        /** Advertised name prefixes of Huami watches and bands (§2.1: the vendor filters by name too). */
        internal val NAME_PREFIXES = arrayOf(
            "Amazfit", "Zepp", "Mi Band", "Xiaomi Smart Band", "T-Rex", "GTR", "GTS",
            "Bip", "Balance", "Active", "Cheetah", "Falcon",
        )
    }
}
