package com.unified.health.driver.garmin.testing

import com.unified.health.core.ble.protocol.buildBytes
import com.unified.health.driver.garmin.codec.FitTime
import com.unified.health.driver.garmin.codec.GarminCrc16
import java.io.ByteArrayOutputStream
import java.time.Instant

/** Writes small FIT files for tests, following the public FIT file layout. */
internal class FitFileBuilder {

    class Field(val number: Int, val size: Int, val baseType: Int)

    private class Definition(val fields: List<Field>, val bigEndian: Boolean, val developerBytes: Int)

    private val body = ByteArrayOutputStream()
    private val definitions = mutableMapOf<Int, Definition>()

    fun define(
        local: Int,
        global: Int,
        vararg fields: Field,
        bigEndian: Boolean = false,
        developerFieldSizes: List<Int> = emptyList(),
    ) = apply {
        val developer = developerFieldSizes.isNotEmpty()
        body.write(0x40 or local or if (developer) 0x20 else 0)
        body.write(0)
        body.write(if (bigEndian) 1 else 0)
        writeInt(global.toLong(), 2, bigEndian)
        body.write(fields.size)
        fields.forEach { body.write(it.number); body.write(it.size); body.write(it.baseType) }
        if (developer) {
            body.write(developerFieldSizes.size)
            developerFieldSizes.forEachIndexed { i, size -> body.write(i); body.write(size); body.write(0) }
        }
        definitions[local] = Definition(fields.toList(), bigEndian, developerFieldSizes.sum())
    }

    /** A data message; [values] follow the field order of the local definition. */
    fun record(local: Int, vararg values: Long) = apply {
        body.write(local)
        writeValues(local, values)
    }

    fun compressed(local: Int, timeOffset: Int, vararg values: Long) = apply {
        body.write(0x80 or (local shl 5) or (timeOffset and 0x1F))
        writeValues(local, values)
    }

    /** Appends bytes verbatim (to build malformed files). */
    fun raw(vararg bytes: Int) = apply { bytes.forEach { body.write(it) } }

    fun string(local: Int, text: String, size: Int) = apply {
        body.write(local)
        body.write(text.toByteArray().copyOf(size))
    }

    private fun writeValues(local: Int, values: LongArray) {
        val definition = definitions.getValue(local)
        require(values.size == definition.fields.size) { "Expected ${definition.fields.size} values" }
        definition.fields.forEachIndexed { i, field -> writeInt(values[i], field.size, definition.bigEndian) }
        repeat(definition.developerBytes) { body.write(0xAB) }
    }

    private fun writeInt(value: Long, size: Int, bigEndian: Boolean) {
        val bytes = ByteArray(size) { i -> (value ushr (8 * i)).toByte() }
        body.write(if (bigEndian) bytes.reversedArray() else bytes)
    }

    fun build(corruptFileCrc: Boolean = false): ByteArray {
        val data = body.toByteArray()
        val header = buildBytes(14) {
            u8(14)
            u8(0x20)
            u16le(2132)
            u32le(data.size.toLong())
            bytes(".FIT".toByteArray())
        }
        val headerWithCrc = header + buildBytes { u16le(GarminCrc16.compute(header)) }
        val content = headerWithCrc + data
        val crc = GarminCrc16.compute(content) xor if (corruptFileCrc) 1 else 0
        return content + buildBytes { u16le(crc) }
    }

    companion object {
        const val ENUM = 0x00
        const val SINT8 = 0x01
        const val UINT8 = 0x02
        const val SINT16 = 0x83
        const val UINT16 = 0x84
        const val SINT32 = 0x85
        const val UINT32 = 0x86
        const val STRING = 0x07

        fun u8(number: Int) = Field(number, 1, UINT8)
        fun s8(number: Int) = Field(number, 1, SINT8)
        fun enum(number: Int) = Field(number, 1, ENUM)
        fun s16(number: Int) = Field(number, 2, SINT16)
        fun u16(number: Int) = Field(number, 2, UINT16)
        fun s32(number: Int) = Field(number, 4, SINT32)
        fun u32(number: Int) = Field(number, 4, UINT32)

        fun fit(instant: String): Long = FitTime.fromInstant(Instant.parse(instant))
    }
}
