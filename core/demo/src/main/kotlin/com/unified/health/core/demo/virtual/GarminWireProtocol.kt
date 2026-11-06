package com.unified.health.core.demo.virtual

import com.unified.health.core.ble.protocol.ByteReader
import com.unified.health.core.ble.protocol.buildBytes
import java.io.ByteArrayOutputStream

/**
 * Minimal, independent re-implementation of the Garmin GFDI wire format (COBS framing, CRC-16,
 * message header, ACK) used only by the debug-only watch simulator ([GarminVirtualWatch]).
 *
 * This restates the same public protocol as `driver/garmin/.../codec/{Cobs,GarminCrc16,GfdiMessage}.kt`
 * (see `docs/protocols/GARMIN_DEVICE_PROTOCOL.md` §3.4), but that module's codec classes are
 * `internal` and this one lives in a different Gradle module (`:core:demo`), so the handful of
 * primitives this simulator needs are rewritten here rather than shared.
 */
internal object GarminWire {

    /** CRC-16/ARC (seed 0, reflected polynomial 0xA001), same nibble table as `GarminCrc16` (§3.4.3). */
    private val CRC_TABLE = intArrayOf(
        0x0000, 0xCC01, 0xD801, 0x1400, 0xF001, 0x3C00, 0x2800, 0xE401,
        0xA001, 0x6C00, 0x7800, 0xB401, 0x5000, 0x9C01, 0x8801, 0x4400,
    )

    /** Incremental: `crc16(all, seed=0) == crc16(tail, seed=crc16(head, seed=0))`. */
    fun crc16(data: ByteArray, from: Int = 0, to: Int = data.size, seed: Int = 0): Int {
        var crc = seed
        for (i in from until to) {
            val b = data[i].toInt()
            crc = ((crc ushr 4) and 0x0FFF) xor CRC_TABLE[crc and 0xF] xor CRC_TABLE[b and 0xF]
            crc = CRC_TABLE[(b ushr 4) and 0xF] xor ((crc ushr 4) and 0x0FFF) xor CRC_TABLE[crc and 0xF]
        }
        return crc and 0xFFFF
    }

    /** `0x00 | COBS(message) | 0x00` (§3.4.1); blocks of at most 254 data bytes. */
    fun cobsFrame(message: ByteArray): ByteArray {
        val out = ByteArrayOutputStream(message.size + message.size / MAX_BLOCK + 3)
        out.write(0)
        val block = ByteArray(MAX_BLOCK)
        var length = 0
        fun flush() {
            out.write(length + 1)
            out.write(block, 0, length)
            length = 0
        }
        for (b in message) {
            if (b == 0.toByte()) {
                flush()
            } else {
                block[length++] = b
                if (length == MAX_BLOCK) flush()
            }
        }
        flush()
        out.write(0)
        return out.toByteArray()
    }

    /** Decodes one COBS frame body (the bytes between two `0x00` delimiters). */
    fun cobsDecode(encoded: ByteArray): ByteArray? {
        val out = ByteArrayOutputStream(encoded.size)
        var i = 0
        while (i < encoded.size) {
            val code = encoded[i++].toInt() and 0xFF
            if (code == 0) return null
            val end = i + code - 1
            if (end > encoded.size) return null
            out.write(encoded, i, code - 1)
            i = end
            if (code < 0xFF && i < encoded.size) out.write(0)
        }
        return out.toByteArray()
    }

    /** `[len u16 LE][msgId u16 LE][payload][crc u16 LE]` (§3.4.2), normal (non-compact) header only. */
    fun encodeMessage(id: Int, payload: ByteArray): ByteArray {
        val length = HEADER_SIZE + payload.size + CRC_SIZE
        val body = buildBytes(length) {
            u16le(length)
            u16le(id)
            bytes(payload)
        }
        return buildBytes(length) {
            bytes(body)
            u16le(crc16(body))
        }
    }

    class Message(val id: Int, val payload: ByteArray)

    /** Null for a corrupt/incomplete frame (dropped, like a real watch would retry). */
    fun decodeMessage(frame: ByteArray): Message? {
        if (frame.size < HEADER_SIZE + CRC_SIZE) return null
        val reader = ByteReader(frame)
        val length = reader.u16le()
        if (length != frame.size) return null
        val expected = crc16(frame, 0, frame.size - CRC_SIZE)
        val actual = ByteReader(frame, frame.size - CRC_SIZE).u16le()
        if (expected != actual) return null
        val id = reader.u16le()
        return Message(id, frame.copyOfRange(HEADER_SIZE, frame.size - CRC_SIZE))
    }

    /** 5000 Acknowledgement payload: `origMsgId u16 | status u8 | data` (§3.4.4). */
    fun encodeAck(originalId: Int, status: Int, data: ByteArray = ByteArray(0)): ByteArray =
        buildBytes(3 + data.size) {
            u16le(originalId)
            u8(status)
            bytes(data)
        }

    class Ack(val originalId: Int, val status: Int, val data: ByteArray)

    fun decodeAck(payload: ByteArray): Ack? {
        if (payload.size < 3) return null
        val r = ByteReader(payload)
        return Ack(r.u16le(), r.u8(), r.rest())
    }

    const val ACK_ID = 5000
    const val STATUS_OK = 0
    const val STATUS_NOT_FOUND = 1
    const val STATUS_UNSUPPORTED = 2

    private const val HEADER_SIZE = 4
    private const val CRC_SIZE = 2
    private const val MAX_BLOCK = 254

    /**
     * Splits an inbound byte stream (arbitrary-sized BLE write chunks) into COBS frame bodies at
     * `0x00` delimiters, mirroring `driver/garmin`'s `CobsFrameAccumulator`.
     */
    class FrameAccumulator {
        private val buffer = ByteArrayOutputStream()

        fun feed(chunk: ByteArray): List<ByteArray> {
            val frames = mutableListOf<ByteArray>()
            for (b in chunk) {
                if (b == 0.toByte()) {
                    if (buffer.size() > 0) frames += buffer.toByteArray()
                    buffer.reset()
                } else {
                    buffer.write(b.toInt())
                }
            }
            return frames
        }
    }
}
