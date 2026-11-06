package com.unified.health.core.demo.virtual

import com.unified.health.core.ble.protocol.buildBytes
import java.io.ByteArrayOutputStream
import java.time.Instant

/** Garmin/FIT epoch: seconds since 1989-12-31T00:00:00Z ([Ext] FIT profile, same as `driver/garmin`'s `FitTime`). */
internal fun garminFitTime(instant: Instant): Long = instant.epochSecond - 631_065_600L

/**
 * Minimal writer for the public FIT binary file format, just rich enough to script the records the
 * watch simulator pushes during sync (one local message type per message, little-endian, no
 * compressed timestamps or developer fields). Independent of `driver/garmin`'s `FitDecoder` for the
 * same module-boundary reason as [GarminWire]; both read/write the same public spec.
 */
internal class GarminFitFileWriter {

    class Field(val number: Int, val size: Int, val baseType: Int)

    private val body = ByteArrayOutputStream()
    private val definitions = mutableMapOf<Int, List<Field>>()

    /** Defines local message type [local] as global message [global] with [fields] in order. */
    fun define(local: Int, global: Int, vararg fields: Field) = apply {
        body.write(0x40 or local) // definition record, no developer fields
        body.write(0) // reserved
        body.write(0) // architecture: little-endian
        writeInt(global.toLong(), 2)
        body.write(fields.size)
        fields.forEach { body.write(it.number); body.write(it.size); body.write(it.baseType) }
        definitions[local] = fields.toList()
    }

    /** One data message for local type [local]; [values] follow the field order given to [define]. */
    fun record(local: Int, vararg values: Long) = apply {
        val fields = definitions.getValue(local)
        require(values.size == fields.size) { "Expected ${fields.size} values for local type $local, got ${values.size}" }
        body.write(local)
        fields.forEachIndexed { i, field -> writeInt(values[i], field.size) }
    }

    private fun writeInt(value: Long, size: Int) {
        for (i in 0 until size) body.write(((value ushr (8 * i)) and 0xFF).toInt())
    }

    fun build(): ByteArray {
        val data = body.toByteArray()
        val header = buildBytes(HEADER_SIZE) {
            u8(HEADER_SIZE)
            u8(0x20) // protocol version
            u16le(2132) // profile version, arbitrary
            u32le(data.size.toLong())
            bytes(".FIT".toByteArray())
        }
        val headerWithCrc = header + buildBytes { u16le(GarminWire.crc16(header)) }
        val content = headerWithCrc + data
        return content + buildBytes { u16le(GarminWire.crc16(content)) }
    }

    companion object {
        private const val HEADER_SIZE = 14

        // Lower 5 bits of the FIT base-type byte; FitDecoder masks away any upper bits.
        const val ENUM = 0x00
        const val UINT8 = 0x02
        const val SINT16 = 0x03
        const val UINT16 = 0x04
        const val UINT32 = 0x06

        fun u8(number: Int) = Field(number, 1, UINT8)
        fun enum(number: Int) = Field(number, 1, ENUM)
        fun s16(number: Int) = Field(number, 2, SINT16)
        fun u16(number: Int) = Field(number, 2, UINT16)
        fun u32(number: Int) = Field(number, 4, UINT32)
    }
}
