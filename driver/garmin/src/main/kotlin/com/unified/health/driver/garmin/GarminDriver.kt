package com.unified.health.driver.garmin

import android.os.Build
import com.unified.health.core.ble.driver.LinkRequirements
import com.unified.health.core.ble.driver.RecognitionScore
import com.unified.health.core.ble.driver.SessionContext
import com.unified.health.core.ble.driver.WearableDriver
import com.unified.health.core.ble.driver.WearableSession
import com.unified.health.core.ble.gatt.GattClient
import com.unified.health.core.ble.pairing.PairingCodeRequester
import com.unified.health.core.ble.scan.Advertisement
import com.unified.health.core.model.HealthRecord
import com.unified.health.core.model.VendorIdentifierKeys
import com.unified.health.core.model.WearableVendor
import com.unified.health.driver.garmin.codec.GarminFitFileType
import com.unified.health.driver.garmin.codec.HostIdentity
import javax.inject.Inject

/**
 * Garmin watches over GFDI (dedicated GFDI service or Multi-Link), syncing FIT files
 * (`GARMIN_DEVICE_PROTOCOL.md` §8.B). Requires an OS bond; no user credentials.
 */
class GarminDriver @Inject constructor(
    private val pairingCodes: PairingCodeRequester,
) : WearableDriver {

    override val vendor = WearableVendor.GARMIN

    /**
     * Bond before the handshake (§2.2, §5.1 [V]); MTU 515 as Garmin Connect requests (§3.2 [V], `pj2/g.java:18`).
     * If the OS bond fails, continue unbonded so the watch can drive app-level Garmin Auth (5101).
     */
    override val linkRequirements = LinkRequirements(bond = true, bondOptional = true, mtu = REQUESTED_MTU)

    override fun recognize(advertisement: Advertisement): Int = when {
        advertisement.manufacturerData.keys.any { it == GarminUuids.GARMIN_COMPANY_ID || it == GarminUuids.GARMIN_COMPANY_ID_SWAPPED } ->
            RecognitionScore.VENDOR_MANUFACTURER_DATA
        hasGarminService(advertisement) -> RecognitionScore.VENDOR_SERVICE
        advertisement.name?.let { MODEL_NAME.containsMatchIn(it) } == true -> RecognitionScore.NAME
        else -> RecognitionScore.NONE
    }

    /**
     * Product number for QR-code pairing (`DevicesViewModel`'s Garmin match), best-effort decoded
     * from manufacturer data. See [GarminUuids.productNumberFrom] for the confidence caveat.
     */
    override fun identifiers(advertisement: Advertisement): Map<String, String> {
        val productNumber = GarminUuids.productNumberFrom(advertisement.manufacturerData) ?: return emptyMap()
        return mapOf(VendorIdentifierKeys.GARMIN_PRODUCT_NUMBER to productNumber)
    }

    private fun hasGarminService(advertisement: Advertisement): Boolean =
        (advertisement.serviceUuids + advertisement.serviceData.keys).any {
            GarminUuids.isGarminFamily(it) || it == GarminUuids.GFDI_V1_SERVICE || it in GarminUuids.ADVERTISED_SERVICE_DATA
        }

    override suspend fun openSession(gatt: GattClient, context: SessionContext): WearableSession =
        GarminSession.open(
            gatt,
            GarminSessionConfig(
                host = hostIdentity(),
                multiLinkClientId = MULTI_LINK_CLIENT_ID,
                address = context.address,
                credentials = context.credentials,
                credentialWriter = context.credentialWriter,
                pairingCodes = pairingCodes,
            ),
        )

    /**
     * Re-decodes a stored `fit_activity` payload (§6.1 [V], D-420), now also recovering
     * [HealthRecord.WorkoutLap]/[HealthRecord.WorkoutSample] for the D-1176 backfill (a workout
     * synced before D-1093 only ever got its `session`(18) summary parsed, never `lap`(19)/`record`(20));
     * other raw kinds (monitoring/metrics/wellness) depend on cross-file daily accumulation, so they
     * are only reprocessed as part of a real [openSession] sync, not here.
     */
    override suspend fun reprocess(payload: HealthRecord.RawPayload): List<HealthRecord> {
        if (payload.vendor != WearableVendor.GARMIN || payload.kind != GarminFitFileType.ACTIVITY.kind) return emptyList()
        return decodeGarminActivityRecords(payload.bytes)
    }

    private fun hostIdentity() = HostIdentity(
        appVersion = HOST_APP_VERSION,
        friendlyName = HOST_FRIENDLY_NAME,
        manufacturer = Build.MANUFACTURER.orEmpty(),
        model = Build.MODEL.orEmpty(),
    )

    internal companion object {
        const val REQUESTED_MTU = 515

        /**
         * Multi-Link client id this app registers with (§3.3, §5.3).
         *
         * Garmin Connect uses `0x01` (`assets/client_config.xml`), and Garmin *allocates* client ids
         * per app (Connect, Health SDK, Connect IQ…; see the confluence link in that file). The
         * watch firmware may keep a whitelist and answer an unknown id with REJECTED (4) or leave it
         * in PENDING_AUTH (2): risk medium-high, unverified (§5.3 [I], §9 question 1).
         *
         * We deliberately do NOT reuse Garmin Connect's `0x01`: impersonating it is not acceptable in
         * a released app (§8.B "Risks") and would make the two apps fight over the same registration.
         * The value below is an arbitrary app-chosen id ("UHEALTH" + 1). If a watch rejects it,
         * [com.unified.health.driver.garmin.transport.MultiLinkRegistrationException] surfaces a clear
         * error; only watches with a dedicated GFDI service avoid Multi-Link entirely.
         */
        const val MULTI_LINK_CLIENT_ID: Long = 0x5548_4541_4C54_4801L

        /** u16 app version announced in the 5024 reply; the watch only displays/logs it [I]. */
        const val HOST_APP_VERSION = 1
        const val HOST_FRIENDLY_NAME = "Unified Health"

        /**
         * Garmin product families seen in advertised names (`Forerunner 265`, `fēnix 7`, `vívoactive 5`…).
         * Matched as whole words so e.g. "Knowledge" does not match "Edge".
         */
        val MODEL_NAME = Regex(
            "\\b(garmin|forerunner|f[eē]nix|venu|v[iíì]voactive|instinct|epix|enduro|edge|approach|lily|quatix|marq|tactix|descent)\\b",
            RegexOption.IGNORE_CASE,
        )
    }
}
