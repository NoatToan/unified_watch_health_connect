package com.unified.health.driver.garmin.codec.fit

import com.unified.health.core.ble.driver.WearableProtocolException

internal class FitDecodeException(message: String) : WearableProtocolException(message)

/** A decoded FIT file: header versions and data messages in file order. */
internal class FitFile(
    val protocolVersion: Int,
    val profileVersion: Int,
    val messages: List<FitMessage>,
)

/**
 * One data message. Numeric fields hold one element per array entry, with invalid sentinels
 * already turned into null; strings are kept separately. Scale/offset are NOT applied (the
 * mapper knows the profile).
 */
internal class FitMessage(
    val globalNumber: Int,
    private val numbers: Map<Int, List<Long?>>,
    private val strings: Map<Int, String> = emptyMap(),
) {
    /** First element of a numeric field, or null when absent or invalid. */
    fun value(field: Int): Long? = numbers[field]?.firstOrNull()

    fun values(field: Int): List<Long?> = numbers[field].orEmpty()

    fun string(field: Int): String? = strings[field]

    /** `timestamp` (field 253, FIT seconds), present on most time-based messages. */
    val timestamp: Long? get() = value(FIELD_TIMESTAMP)

    override fun toString(): String = "FitMessage($globalNumber, fields=${numbers.keys + strings.keys})"

    companion object {
        const val FIELD_TIMESTAMP = 253
    }
}

/**
 * FIT base types ([Ext] FIT SDK profile, "Base Types" table): number (low 5 bits of the base type
 * byte), element size, and the invalid sentinel as an unsigned bit pattern.
 */
internal enum class FitBaseType(val number: Int, val size: Int, val invalid: Long, val signed: Boolean = false) {
    ENUM(0x00, 1, 0xFF),
    SINT8(0x01, 1, 0x7F, signed = true),
    UINT8(0x02, 1, 0xFF),
    SINT16(0x03, 2, 0x7FFF, signed = true),
    UINT16(0x04, 2, 0xFFFF),
    SINT32(0x05, 4, 0x7FFF_FFFF, signed = true),
    UINT32(0x06, 4, 0xFFFF_FFFFL),
    STRING(0x07, 1, 0x00),
    FLOAT32(0x08, 4, 0xFFFF_FFFFL),
    FLOAT64(0x09, 8, -1L),
    UINT8Z(0x0A, 1, 0x00),
    UINT16Z(0x0B, 2, 0x00),
    UINT32Z(0x0C, 4, 0x00),
    BYTE(0x0D, 1, 0xFF),
    SINT64(0x0E, 8, Long.MAX_VALUE, signed = true),
    UINT64(0x0F, 8, -1L),
    UINT64Z(0x10, 8, 0x00),
    ;

    val isNumeric: Boolean get() = this != STRING && this != FLOAT32 && this != FLOAT64

    companion object {
        private val byNumber = entries.associateBy { it.number }

        fun of(baseTypeByte: Int): FitBaseType? = byNumber[baseTypeByte and 0x1F]
    }
}
