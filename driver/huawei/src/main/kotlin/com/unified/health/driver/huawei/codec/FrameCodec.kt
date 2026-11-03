package com.unified.health.driver.huawei.codec

import com.unified.health.core.ble.protocol.ByteReader
import com.unified.health.core.ble.protocol.ByteWriter
import com.unified.health.core.ble.protocol.MalformedPayloadException

/**
 * 0x5A link frames (HUAWEI_DEVICE_PROTOCOL.md §4.1-4.2, [V] `coa.java:56-178`).
 *
 * ```
 * single : 5A | len(u16be) = payload+1 | 00            | payload       | crc16(u16be)
 * sliced : 5A | len(u16be) = slice+2   | 01/02/03 | idx | slice payload | crc16(u16be)
 * ```
 * The CRC covers every byte before it. A payload is sent as one frame when
 * `payload + 6 <= maxFrame`, otherwise as slices of at most `maxFrame - 7` bytes flagged
 * 1 (first), 2 (middle), 3 (last) with a one-byte running index.
 */
internal object FrameCodec {
    const val MAGIC = 0x5A

    /** magic + length(2) + crc(2): the bytes not counted by the length field. */
    const val ENVELOPE = 5
    const val SINGLE_OVERHEAD = 6
    const val SLICE_OVERHEAD = 7

    const val FLAG_SINGLE = 0
    const val FLAG_FIRST = 1
    const val FLAG_MIDDLE = 2
    const val FLAG_LAST = 3

    /** Splits [payload] into ready-to-send frames for a link whose max frame is [maxFrame]. */
    fun encode(payload: ByteArray, maxFrame: Int): List<ByteArray> {
        require(payload.isNotEmpty()) { "Empty Huawei payload" }
        if (payload.size + SINGLE_OVERHEAD <= maxFrame) return listOf(frame(FLAG_SINGLE, null, payload, 0, payload.size))
        val sliceSize = maxFrame - SLICE_OVERHEAD
        require(sliceSize > 0) { "maxFrame $maxFrame too small to slice" }
        val count = (payload.size + sliceSize - 1) / sliceSize
        return List(count) { i ->
            val flag = when (i) {
                0 -> FLAG_FIRST
                count - 1 -> FLAG_LAST
                else -> FLAG_MIDDLE
            }
            val from = i * sliceSize
            frame(flag, i and 0xFF, payload, from, minOf(from + sliceSize, payload.size))
        }
    }

    private fun frame(flag: Int, index: Int?, data: ByteArray, from: Int, to: Int): ByteArray {
        val body = to - from
        val length = body + if (index == null) 1 else 2
        val head = ByteWriter(body + SLICE_OVERHEAD).u8(MAGIC).u16be(length).u8(flag)
        if (index != null) head.u8(index)
        head.bytes(data.copyOfRange(from, to))
        val withoutCrc = head.toByteArray()
        return head.u16be(Crc16Xmodem.compute(withoutCrc)).toByteArray()
    }

    /** One decoded frame. [index] is null for single frames. */
    class Frame(val flag: Int, val index: Int?, val data: ByteArray)

    /** Total byte count of the frame starting at `buffer[0]` once its header is available, else null. */
    fun frameLength(buffer: ByteArray, size: Int): Int? =
        if (size < 3) null else (((buffer[1].toInt() and 0xFF) shl 8) or (buffer[2].toInt() and 0xFF)) + ENVELOPE

    /** Validates magic, length and CRC of one complete frame. Throws [MalformedPayloadException]. */
    fun decode(frame: ByteArray): Frame {
        val reader = ByteReader(frame)
        if (reader.u8() != MAGIC) throw MalformedPayloadException("Frame does not start with 0x5A")
        val length = reader.u16be()
        if (length + ENVELOPE != frame.size) throw MalformedPayloadException("Frame length field $length does not match ${frame.size} bytes")
        val expectedCrc = Crc16Xmodem.compute(frame, 0, frame.size - 2)
        val actualCrc = ByteReader(frame, frame.size - 2).u16be()
        if (expectedCrc != actualCrc) throw MalformedPayloadException("Frame CRC mismatch: 0x%04x != 0x%04x".format(actualCrc, expectedCrc))
        // The app masks the flag with 3 ([V] `coa.java:398`); upper bits are unused.
        val flag = reader.u8() and 0x03
        if (length < if (flag == FLAG_SINGLE) 1 else 2) throw MalformedPayloadException("Frame length $length too short for flag $flag")
        val index = if (flag == FLAG_SINGLE) null else reader.u8()
        val data = reader.bytes(frame.size - 2 - reader.position)
        return Frame(flag, index, data)
    }
}
