package com.unified.health.driver.garmin.codec.fit

import com.unified.health.core.ble.protocol.ByteReader
import com.unified.health.core.ble.protocol.MalformedPayloadException
import com.unified.health.driver.garmin.codec.GarminCrc16

/**
 * Minimal, profile-agnostic FIT decoder ([Ext] public FIT protocol, "Flexible and Interoperable
 * Data Transfer" spec). Supports:
 * - 12/14-byte file headers and the trailing file CRC (FIT CRC-16, same as GFDI);
 * - definition messages (little- and big-endian architectures) including developer fields, whose
 *   bytes are skipped;
 * - normal and compressed-timestamp record headers (the latter inject field 253);
 * - invalid-value sentinels (see [FitBaseType]).
 *
 * Chained FIT files (several headers back to back) are not supported; only the first is decoded.
 */
internal object FitDecoder {

    private const val MIN_HEADER_SIZE = 12
    private const val HEADER_WITH_CRC_SIZE = 14
    private const val FILE_CRC_SIZE = 2
    private const val LOCAL_TYPES = 16

    private const val HEADER_COMPRESSED = 0x80
    private const val HEADER_DEFINITION = 0x40
    private const val HEADER_DEVELOPER_DATA = 0x20
    private const val COMPRESSED_TIME_MASK = 0x1F

    fun decode(bytes: ByteArray): FitFile = try {
        decodeChecked(bytes)
    } catch (e: MalformedPayloadException) {
        throw FitDecodeException("Truncated FIT data: ${e.message}")
    }

    private fun decodeChecked(bytes: ByteArray): FitFile {
        if (bytes.size < MIN_HEADER_SIZE + FILE_CRC_SIZE) throw FitDecodeException("FIT file too short: ${bytes.size} bytes")
        val header = ByteReader(bytes)
        val headerSize = header.u8()
        val protocolVersion = header.u8()
        val profileVersion = header.u16le()
        val dataSize = header.u32le()
        val magic = String(header.bytes(4), Charsets.US_ASCII)
        if (headerSize < MIN_HEADER_SIZE || magic != ".FIT") throw FitDecodeException("Not a FIT file (header $headerSize, magic '$magic')")
        if (headerSize >= HEADER_WITH_CRC_SIZE) {
            val headerCrc = header.u16le()
            if (headerCrc != 0 && headerCrc != GarminCrc16.compute(bytes, 0, MIN_HEADER_SIZE)) {
                throw FitDecodeException("FIT header CRC mismatch")
            }
        }
        val dataEnd = headerSize + dataSize
        if (dataEnd + FILE_CRC_SIZE > bytes.size) throw FitDecodeException("FIT data size $dataSize exceeds file of ${bytes.size} bytes")
        val end = dataEnd.toInt()
        val fileCrc = ByteReader(bytes, end).u16le()
        if (fileCrc != GarminCrc16.compute(bytes, 0, end)) throw FitDecodeException("FIT file CRC mismatch")

        val messages = RecordReader(ByteReader(bytes, headerSize, end)).readAll()
        return FitFile(protocolVersion, profileVersion, messages)
    }

    private class FieldDef(val number: Int, val size: Int, val baseType: FitBaseType?)

    private class Definition(
        val globalNumber: Int,
        val bigEndian: Boolean,
        val fields: List<FieldDef>,
        val developerBytes: Int,
    )

    private class RecordReader(private val r: ByteReader) {
        private val definitions = arrayOfNulls<Definition>(LOCAL_TYPES)
        private var lastTimestamp: Long? = null

        fun readAll(): List<FitMessage> {
            val messages = mutableListOf<FitMessage>()
            while (r.hasRemaining) {
                val header = r.u8()
                when {
                    header and HEADER_COMPRESSED != 0 -> {
                        val local = (header shr 5) and 0x03
                        val timestamp = compressedTimestamp(header and COMPRESSED_TIME_MASK)
                        messages += readData(definitionFor(local), injectedTimestamp = timestamp)
                    }
                    header and HEADER_DEFINITION != 0 ->
                        definitions[header and 0x0F] = readDefinition(header and HEADER_DEVELOPER_DATA != 0)
                    else -> messages += readData(definitionFor(header and 0x0F), injectedTimestamp = null)
                }
            }
            return messages
        }

        private fun definitionFor(local: Int): Definition =
            definitions[local] ?: throw FitDecodeException("Data message for undefined local type $local")

        /** FIT spec: the 5-bit offset rolls over relative to the last full timestamp. */
        private fun compressedTimestamp(offset: Int): Long {
            val last = lastTimestamp ?: throw FitDecodeException("Compressed timestamp before any full timestamp")
            val base = last and COMPRESSED_TIME_MASK.toLong().inv()
            val timestamp = if (offset >= (last and COMPRESSED_TIME_MASK.toLong())) base + offset else base + offset + 0x20
            lastTimestamp = timestamp
            return timestamp
        }

        private fun readDefinition(hasDeveloperFields: Boolean): Definition {
            r.skip(1) // reserved
            val bigEndian = when (val architecture = r.u8()) {
                0 -> false
                1 -> true
                else -> throw FitDecodeException("Unknown FIT architecture $architecture")
            }
            val globalNumber = if (bigEndian) r.u16be() else r.u16le()
            val fields = List(r.u8()) { FieldDef(number = r.u8(), size = r.u8(), baseType = FitBaseType.of(r.u8())) }
            var developerBytes = 0
            if (hasDeveloperFields) {
                repeat(r.u8()) {
                    r.skip(1) // field number
                    developerBytes += r.u8()
                    r.skip(1) // developer data index
                }
            }
            return Definition(globalNumber, bigEndian, fields, developerBytes)
        }

        private fun readData(definition: Definition, injectedTimestamp: Long?): FitMessage {
            val numbers = mutableMapOf<Int, List<Long?>>()
            val strings = mutableMapOf<Int, String>()
            for (field in definition.fields) {
                val raw = r.bytes(field.size)
                val type = field.baseType ?: continue
                when {
                    type == FitBaseType.STRING -> strings[field.number] = decodeString(raw)
                    type.isNumeric && field.size % type.size == 0 ->
                        numbers[field.number] = decodeNumbers(raw, type, definition.bigEndian)
                    // floats and size/type mismatches are skipped: no mapped field needs them.
                }
            }
            r.skip(definition.developerBytes)
            if (injectedTimestamp != null) {
                numbers[FitMessage.FIELD_TIMESTAMP] = listOf(injectedTimestamp)
            } else {
                numbers[FitMessage.FIELD_TIMESTAMP]?.firstOrNull()?.let { lastTimestamp = it }
            }
            return FitMessage(definition.globalNumber, numbers, strings)
        }
    }

    private fun decodeString(raw: ByteArray): String {
        val end = raw.indexOf(0).let { if (it < 0) raw.size else it }
        return String(raw, 0, end, Charsets.UTF_8)
    }

    private fun decodeNumbers(raw: ByteArray, type: FitBaseType, bigEndian: Boolean): List<Long?> =
        List(raw.size / type.size) { index ->
            var bits = 0L
            for (i in 0 until type.size) {
                val byteIndex = index * type.size + if (bigEndian) i else type.size - 1 - i
                bits = (bits shl 8) or (raw[byteIndex].toLong() and 0xFF)
            }
            when {
                bits == type.invalid -> null
                type.signed && type.size < Long.SIZE_BYTES -> {
                    val shift = 64 - type.size * 8
                    (bits shl shift) shr shift
                }
                else -> bits
            }
        }
}
