package com.unified.health.driver.garmin

import com.unified.health.core.ble.gatt.sigUuid
import java.util.UUID

/**
 * GATT identifiers used by Garmin watches. Section numbers refer to `GARMIN_DEVICE_PROTOCOL.md`.
 */
internal object GarminUuids {

    private const val GARMIN_BASE_SUFFIX = "-667b-11e3-949a-0800200c9a66"

    /** Builds `6A4Exxxx-667B-11E3-949A-0800200C9A66`, the family every modern Garmin service uses (§2.4 [V]). */
    fun garminUuid(shortId: Int): UUID = UUID.fromString("6a4e%04x%s".format(shortId, GARMIN_BASE_SUFFIX))

    /** True for any `6A4E????-667B-11E3-949A-0800200C9A66` UUID (§2.4 [V], `ma2/a.java:342-397`). */
    fun isGarminFamily(uuid: UUID): Boolean {
        val text = uuid.toString()
        return text.startsWith("6a4e") && text.endsWith(GARMIN_BASE_SUFFIX)
    }

    // --- Multi-Link (§3.1 [V], ml2/m.java:11, eh2/f.java:281-288, ml2/e0.java:52-56) ---

    val MULTI_LINK_SERVICE: UUID = garminUuid(0x2800)

    /** Number of notify/write characteristic pairs a Multi-Link service may expose (`0x2810 + i`, i = 0..9). */
    const val MULTI_LINK_CHANNEL_COUNT = 10

    /** Notify characteristic `6A4E2810 + index`. */
    fun multiLinkNotify(index: Int): UUID = garminUuid(0x2810 + index)

    /** Write characteristic paired with [multiLinkNotify] (`2810 → 2820`). */
    fun multiLinkWrite(index: Int): UUID = garminUuid(0x2820 + index)

    // --- Dedicated GFDI services (§3.1 [V], ma2/h.java:65-75) ---

    /** Current dedicated GFDI service; read/notify [GFDI_V2_READ], write [GFDI_V2_WRITE]. */
    /** Dedicated realtime service (`ma2/h.java:81`, `zm2/a.java:12`); watches with it skip realtime over ML (`eh2/f.java:183-184`). */
    val REALTIME_SERVICE: UUID = garminUuid(0x2500)

    /** Realtime HEART_RATE characteristic (`zm2/a.java:15`, mapped at `:138-139`). */
    val REALTIME_HEART_RATE: UUID = garminUuid(0x2501)

    val GFDI_V2_SERVICE: UUID = garminUuid(0x2401)
    val GFDI_V2_READ: UUID = garminUuid(0xCD28)
    val GFDI_V2_WRITE: UUID = garminUuid(0x4C80)

    /** Legacy "Connect Mobile" dedicated GFDI service (`client_config.xml`, §2.4 [V]). */
    val GFDI_V1_SERVICE: UUID = UUID.fromString("9b012401-bc30-ce9a-e111-0f67e491abde")
    val GFDI_V1_READ: UUID = UUID.fromString("4acbcd28-7425-868e-f447-915c8f00d0cb")
    val GFDI_V1_WRITE: UUID = UUID.fromString("df334c80-e6a7-d082-274d-78fc66f85e16")

    // --- Advertising (§2.1 [V], dk2/d.java:384-520, ik2/c.java:29-35) ---

    /** Bluetooth SIG company identifier of Garmin. */
    const val GARMIN_COMPANY_ID = 0x0087

    /** The same id byte-swapped, which some firmwares advertise (`dk2/d.java:391`). */
    const val GARMIN_COMPANY_ID_SWAPPED = 0x8700

    /** 16-bit member service UUIDs carrying "GarminGenericServiceData". */
    val ADVERTISED_SERVICE_DATA: Set<UUID> = setOf(sigUuid(0x2401), sigUuid(0x3E10), sigUuid(0xFE1F))

    /**
     * Best-effort product-number extraction for QR-code pairing (`QR_PAIRING_ANALYSIS.md` §4.4-§4.5,
     * `dk2/d.java:384-399` [V] for the clean part of this method; the decompiled source is corrupted
     * by duplicated/inlined jadx blocks past this point, so the exact semantics of the bytes that
     * follow are **not** trusted here [I]).
     *
     * The two bytes right after the company id form a big-endian u16 that the Garmin Connect app
     * turns into a decimal "product number" string via a model lookup table we do not have. We
     * return the raw decimal of those two bytes, which is close enough to disambiguate between
     * different *models* advertising nearby but has not been verified byte-for-byte against a real
     * device/QR capture (`docs/analysis/QR_PAIRING_ANALYSIS.md` §6.3.6). Callers must treat a
     * mismatch as inconclusive, not as proof the device is wrong — see
     * `DevicesViewModel`'s Garmin match fallback and `docs/DECISIONS.md` D-903.
     */
    fun productNumberFrom(manufacturerData: Map<Int, ByteArray>): String? {
        val data = manufacturerData[GARMIN_COMPANY_ID] ?: manufacturerData[GARMIN_COMPANY_ID_SWAPPED]
        if (data == null || data.size < 2) return null
        val value = ((data[0].toInt() and 0xFF) shl 8) or (data[1].toInt() and 0xFF)
        return value.toString()
    }
}
