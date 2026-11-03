package com.unified.health.driver.garmin.codec

import com.unified.health.core.ble.driver.WearableProtocolException
import java.io.ByteArrayOutputStream

internal class CobsException(message: String) : WearableProtocolException(message)

/**
 * Consistent Overhead Byte Stuffing as used around every GFDI message: the wire form is
 * `0x00 | COBS(message) | 0x00` (§3.4.1 [V], encoder `it2/e.java:27-98`, decoder `it2/b.java:37-121`).
 * Blocks hold at most 254 data bytes (code byte 0xFF, no implied zero).
 */
internal object Cobs {

    const val DELIMITER: Byte = 0
    private const val MAX_BLOCK = 254

    fun encode(data: ByteArray): ByteArray {
        val out = ByteArrayOutputStream(data.size + data.size / MAX_BLOCK + 2)
        val block = ByteArray(MAX_BLOCK)
        var length = 0
        fun flush() {
            out.write(length + 1)
            out.write(block, 0, length)
            length = 0
        }
        for (b in data) {
            if (b == DELIMITER) {
                flush()
            } else {
                block[length++] = b
                if (length == MAX_BLOCK) flush()
            }
        }
        flush()
        return out.toByteArray()
    }

    /** [encode] wrapped in the leading and trailing delimiters written on the link. */
    fun frame(message: ByteArray): ByteArray {
        val encoded = encode(message)
        return ByteArray(encoded.size + 2).also { encoded.copyInto(it, destinationOffset = 1) }
    }

    /** Decodes one frame body (the bytes between two delimiters). */
    fun decode(encoded: ByteArray): ByteArray {
        val out = ByteArrayOutputStream(encoded.size)
        var i = 0
        while (i < encoded.size) {
            val code = encoded[i++].toInt() and 0xFF
            if (code == 0) throw CobsException("Zero code byte at offset ${i - 1}")
            val end = i + code - 1
            if (end > encoded.size) throw CobsException("Block of ${code - 1} bytes overruns frame of ${encoded.size}")
            out.write(encoded, i, code - 1)
            i = end
            if (code < 0xFF && i < encoded.size) out.write(0)
        }
        return out.toByteArray()
    }
}

/**
 * Splits a byte stream (arbitrary BLE chunks) into COBS frame bodies at `0x00` delimiters.
 * Frames longer than [maxFrameSize] are discarded so a lost delimiter cannot grow memory forever.
 */
internal class CobsFrameAccumulator(private val maxFrameSize: Int = DEFAULT_MAX_FRAME) {

    private val buffer = ByteArrayOutputStream()
    private var overflowed = false

    /** Number of oversized frames dropped so far (for logging). */
    var droppedFrames: Int = 0
        private set

    fun feed(chunk: ByteArray): List<ByteArray> {
        val frames = mutableListOf<ByteArray>()
        for (b in chunk) {
            if (b == Cobs.DELIMITER) {
                if (overflowed) droppedFrames++ else if (buffer.size() > 0) frames += buffer.toByteArray()
                buffer.reset()
                overflowed = false
            } else if (!overflowed) {
                if (buffer.size() >= maxFrameSize) {
                    overflowed = true
                    buffer.reset()
                } else {
                    buffer.write(b.toInt())
                }
            }
        }
        return frames
    }

    companion object {
        /** Far above any GFDI packet size a watch reports in 5024 (typically a few hundred bytes). */
        const val DEFAULT_MAX_FRAME = 64 * 1024
    }
}
