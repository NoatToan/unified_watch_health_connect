package com.unified.health.driver.standard.codec

import com.unified.health.core.ble.protocol.ByteReader
import com.unified.health.core.ble.protocol.ByteWriter
import java.time.DayOfWeek
import java.time.LocalDateTime
import java.time.ZonedDateTime
import java.time.temporal.ChronoField
import kotlin.math.pow

/**
 * Shared GATT value types [Ext: Bluetooth SIG GATT Specification Supplement (GSS) §2.x;
 * IEEE 11073-20601 §F.8 for SFLOAT/FLOAT].
 */
internal object SigTypes {

    /**
     * IEEE-11073 16-bit SFLOAT: 4-bit signed exponent (high nibble), 12-bit signed mantissa.
     * @return the value, or null for NaN / NRes / ±INFINITY / reserved.
     */
    fun sfloat(raw: Int): Double? {
        val bits = raw and 0xFFFF
        if (bits in SFLOAT_SPECIALS) return null
        var mantissa = bits and 0x0FFF
        if (mantissa >= 0x0800) mantissa -= 0x1000
        var exponent = bits shr 12
        if (exponent >= 0x8) exponent -= 0x10
        return mantissa * 10.0.pow(exponent)
    }

    /** IEEE-11073 32-bit FLOAT: 8-bit signed exponent (high byte), 24-bit signed mantissa. */
    fun float32(raw: Long): Double? {
        val bits = raw and 0xFFFF_FFFFL
        val mantissaBits = (bits and 0x00FF_FFFF).toInt()
        if (mantissaBits in FLOAT_SPECIALS) return null
        val mantissa = if (mantissaBits >= 0x0080_0000) mantissaBits - 0x0100_0000 else mantissaBits
        val exponent = (bits shr 24).toInt().toByte().toInt()
        return mantissa * 10.0.pow(exponent)
    }

    /**
     * Date Time (0x2A08), 7 bytes: year u16, month, day, hours, minutes, seconds. A zero year,
     * month or day means "unknown" and yields null (the bytes are still consumed).
     */
    fun dateTime(reader: ByteReader): LocalDateTime? {
        val year = reader.u16le()
        val month = reader.u8()
        val day = reader.u8()
        val hour = reader.u8()
        val minute = reader.u8()
        val second = reader.u8()
        if (year == 0 || month == 0 || day == 0) return null
        return runCatching { LocalDateTime.of(year, month, day, hour, minute, second) }.getOrNull()
    }

    fun writeDateTime(writer: ByteWriter, time: LocalDateTime) {
        writer.u16le(time.year).u8(time.monthValue).u8(time.dayOfMonth).u8(time.hour).u8(time.minute).u8(time.second)
    }

    /**
     * Current Time (0x2A2B), 10 bytes [Ext: CTS 1.1 §3.1]: Date Time, Day of Week (1 = Monday),
     * Fractions256, Adjust Reason (bit 0 = manual time update).
     */
    fun currentTime(time: ZonedDateTime, adjustReason: Int = ADJUST_REASON_MANUAL): ByteArray = ByteWriter(CURRENT_TIME_SIZE).apply {
        writeDateTime(this, time.toLocalDateTime())
        u8(time.dayOfWeek.toSigDay())
        u8((time.get(ChronoField.MILLI_OF_SECOND) * 256) / 1000)
        u8(adjustReason)
    }.toByteArray()

    /**
     * Local Time Information (0x2A0F), 2 bytes [Ext: CTS 1.1 §3.2]: time zone as signed
     * 15-minute steps from UTC (standard time), DST offset in 15-minute steps (0, 2, 4, 8).
     */
    fun localTimeInformation(time: ZonedDateTime): ByteArray {
        val rules = time.zone.rules
        val instant = time.toInstant()
        val standardQuarters = rules.getStandardOffset(instant).totalSeconds / QUARTER_HOUR_SECONDS
        val dstQuarters = rules.getDaylightSavings(instant).seconds.toInt() / QUARTER_HOUR_SECONDS
        return byteArrayOf(standardQuarters.toByte(), dstQuarters.toByte())
    }

    private fun DayOfWeek.toSigDay(): Int = value // java.time: MONDAY = 1 … SUNDAY = 7, same as SIG.

    const val CURRENT_TIME_SIZE = 10
    const val ADJUST_REASON_MANUAL = 0x01
    private const val QUARTER_HOUR_SECONDS = 15 * 60

    /** NaN, NRes, +INF, −INF, reserved [Ext: IEEE 11073-20601 §F.8]. */
    private val SFLOAT_SPECIALS = setOf(0x07FF, 0x0800, 0x07FE, 0x0802, 0x0801)
    private val FLOAT_SPECIALS = setOf(0x007F_FFFF, 0x0080_0000, 0x007F_FFFE, 0x0080_0002, 0x0080_0001)
}

/** Reads one SFLOAT from the stream. */
internal fun ByteReader.sfloat(): Double? = SigTypes.sfloat(u16le())

/** Reads one 32-bit FLOAT from the stream. */
internal fun ByteReader.float32(): Double? = SigTypes.float32(u32le())

/** Reads a 24-bit little-endian unsigned integer. */
internal fun ByteReader.u24le(): Int = u16le() or (u8() shl 16)

internal fun Int.hasFlag(bit: Int): Boolean = this and (1 shl bit) != 0
