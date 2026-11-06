package com.unified.health.driver.zepp.codec

import com.unified.health.core.ble.protocol.ByteReader
import com.unified.health.core.ble.protocol.MalformedPayloadException
import com.unified.health.core.ble.protocol.buildBytes
import java.time.DateTimeException
import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.ZoneOffset

/** GDSP data types requested by this driver (`HMGDSPType`, §6.1 [V]). */
internal enum class GdspDataType(val code: Int) {
    ACTIVITY(0x01),

    /** Single-event stress reading, `HMProSyncDataProfile.parsePressureSingleData()` (brief TODO, [V]). */
    STRESS_SINGLE(0x12),
    STRESS_ALL_DAY(0x13),
    SPO2_POINT(0x25),

    /**
     * Resting heart rate. Type constant is [V] (`HMProSyncDataBaseProfile.java:71`); the record
     * layout is [I] (inferred from [STRESS_SINGLE]'s shape, see `GdspRecordParsers.parseRestingHeartRate`).
     */
    RESTING_HEART_RATE(0x3A),
}

/** Header answer to `[0x01, type, time…]`: [count] items available from [start] (§6.1 [V]). */
internal data class GdspHeader(
    /**
     * Item count; for [GdspDataType.ACTIVITY] and [GdspDataType.STRESS_ALL_DAY] this is a number of
     * minutes (§6.1). For the event-based types (SpO2, stress-single, resting HR) it is a record
     * count instead; only its positivity is used to decide whether to fetch (`ZeppSession.syncType`).
     */
    val count: Long,
    val start: Instant,
)

/**
 * Byte layouts of GDSP ("General Data Sensing Procedure") on 0x0004 (control) / 0x0005 (data),
 * `HMProSyncDataBaseProfile` and `GDSPApiImpl` (§6.1 [V]). Integers little-endian.
 */
internal object GdspCodec {
    const val CMD_QUERY_VERSION = 0x00
    const val CMD_REQUEST_HEADER = 0x01
    const val CMD_START_TRANSFER = 0x02
    const val CMD_STOP_TRANSFER = 0x03

    /**
     * Code sent with `[0x03, code]` after a successful fetch (`GDSPErrorCode.SUCCESS`, §6.1 [V]).
     *
     * WARNING (§8 "Rủi ro", §9 question 8, [I]): this confirmation may make the watch treat the
     * data as delivered, so the official Zepp app might not receive it again. Unverified.
     */
    const val STOP_CODE_CONFIRM_DELIVERED = 0x01

    /** GDSP version from which the header request carries a `compress` byte (`GdspSyncProfileImpl:602`, [V]). */
    const val VERSION_WITH_COMPRESS_FLAG = 2

    val QUERY_VERSION: ByteArray = byteArrayOf(CMD_QUERY_VERSION.toByte())
    val START_TRANSFER: ByteArray = byteArrayOf(CMD_START_TRANSFER.toByte())
    val STOP_TRANSFER: ByteArray = byteArrayOf(CMD_STOP_TRANSFER.toByte())

    fun stopTransfer(code: Int): ByteArray = byteArrayOf(CMD_STOP_TRANSFER.toByte(), code.toByte())

    /**
     * `[0x01, type, year u16, month, day, hour, min, sec, tzKey]` with the wall-clock time of [since] in
     * [zone], plus `compress = 0` for GDSP v2 (we never ask for compressed data; the codec is unknown).
     */
    fun requestHeader(type: GdspDataType, since: Instant, zone: ZoneId, gdspVersion: Int?): ByteArray {
        val offset = zone.rules.getOffset(since)
        val local = LocalDateTime.ofInstant(since, offset)
        return buildBytes(11) {
            u8(CMD_REQUEST_HEADER)
            u8(type.code)
            u16le(local.year)
            u8(local.monthValue)
            u8(local.dayOfMonth)
            u8(local.hour)
            u8(local.minute)
            u8(local.second)
            u8(timezoneKey(offset.totalSeconds))
            if (gdspVersion == VERSION_WITH_COMPRESS_FLAG) u8(0)
        }
    }

    /**
     * Parses the data of a successful header response:
     * `count u32, year u16, month, day, hour, min, sec, tzKey(s8), [expansion…]` (`parseDataHeader`, [V]).
     */
    fun parseHeader(data: ByteArray): GdspHeader {
        val reader = ByteReader(data)
        val count = reader.u32le()
        val year = reader.u16le()
        val month = reader.u8()
        val day = reader.u8()
        val hour = reader.u8()
        val minute = reader.u8()
        val second = reader.u8()
        val tzKey = reader.s8()
        val start = try {
            LocalDateTime.of(year, month, day, hour, minute, second).toEpochSecond(ZoneOffset.UTC) - tzKey * SECONDS_PER_TZ_STEP
        } catch (e: DateTimeException) {
            // An empty answer may carry a zeroed time; only a header announcing data needs a valid one.
            if (count == 0L) return GdspHeader(0, Instant.EPOCH)
            throw MalformedPayloadException("Invalid GDSP header time: ${e.message}")
        }
        return GdspHeader(count, Instant.ofEpochSecond(start))
    }

    /** CRC32 announced in the transfer-complete notification `[0x10, 0x02, code, crc u32]` (`GDSPApiImpl.e`). */
    fun parseTransferCrc(data: ByteArray): Long? = if (data.size >= 4) ByteReader(data).u32le() else null

    /** GDSP version from `[0x10, 0x00, 0x01, ver]` (`HMProSyncDataBaseProfile.getVersion`, [V]). */
    fun parseVersion(data: ByteArray): Int? = data.firstOrNull()?.toInt()?.and(0xFF)

    /**
     * Quarter-hour offset key (`ProfileUtils.getTimezoneKey`, [V]): sign × (hours × 4 + minutes / 15).
     */
    fun timezoneKey(offsetSeconds: Int): Int {
        val minutes = offsetSeconds / 60
        val sign = if (minutes < 0) -1 else 1
        val abs = kotlin.math.abs(minutes)
        return sign * ((abs / 60) * 4 + (abs % 60) / 15)
    }

    private const val SECONDS_PER_TZ_STEP = 15 * 60L
}
