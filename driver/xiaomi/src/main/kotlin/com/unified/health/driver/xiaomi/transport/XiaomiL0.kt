package com.unified.health.driver.xiaomi.transport

/**
 * L0 -- BLE chunking and reassembly (protocol §2 [V]). Pure byte-level logic; GATT I/O and the
 * write-serialization mutex live in [XiaomiLink].
 */
internal object XiaomiL0 {
    /** `0xA5 0xA5`, the 2-byte magic opening every L1 frame (protocol §3.1 [V]). */
    const val MAGIC_LO = 0xA5
    const val MAGIC_HI = 0xA5

    /** Fixed L1 header: magic(2) + type/frx(1) + seq(1) + dataLength(2) + crc16(2) (protocol §3.1 [V]). */
    const val HEADER_SIZE = 8

    private const val DATA_LENGTH_OFFSET = 4
    private const val CRC_OFFSET = 6

    /** `dataLength` is u16 (max 65535); guards the reassembler against buffering forever. */
    private const val MAX_FRAME_SIZE = HEADER_SIZE + 0xFFFF

    /** Splits one complete L1 frame into chunks of at most [chunkSize] bytes, in wire order. */
    fun chunk(frame: ByteArray, chunkSize: Int): List<ByteArray> {
        require(chunkSize > 0) { "chunkSize must be positive, was $chunkSize" }
        require(frame.isNotEmpty()) { "frame must not be empty" }
        val chunks = ArrayList<ByteArray>((frame.size + chunkSize - 1) / chunkSize)
        var offset = 0
        while (offset < frame.size) {
            val end = minOf(offset + chunkSize, frame.size)
            chunks += frame.copyOfRange(offset, end)
            offset = end
        }
        return chunks
    }

    /**
     * Reassembles notification bytes into complete, CRC-valid L1 frames (8-byte header + payload).
     *
     * Protocol §2 [V]: scans for the `0xA5A5` magic, dropping bytes until it is found; once 8
     * header bytes are buffered, reads `dataLength`; once `8 + dataLength` bytes are buffered,
     * validates the CRC-16/ARC ([Crc16Arc], over the payload only) and delivers the frame, or
     * drops one byte and rescans on a bad CRC. There is no per-chunk sequence number, so [feed]
     * assumes chunks arrive in wire order -- the sender side ([XiaomiLink]) must never interleave
     * two frames' chunks.
     *
     * Not thread-safe: feed from a single coroutine/thread (the link's own receive loop).
     */
    class Reassembler {
        private var buffer = ByteArray(0)

        /** Feeds newly-received bytes; returns zero or more complete frames found so far, in order. */
        fun feed(chunk: ByteArray): List<ByteArray> {
            buffer += chunk
            val frames = ArrayList<ByteArray>()
            while (true) {
                val magicAt = findMagic(buffer)
                if (magicAt < 0) {
                    // Keep at most the trailing byte: it could be the first half of a split magic.
                    buffer = if (buffer.isNotEmpty()) buffer.copyOfRange(buffer.size - 1, buffer.size) else buffer
                    return frames
                }
                if (magicAt > 0) buffer = buffer.copyOfRange(magicAt, buffer.size)
                if (buffer.size < HEADER_SIZE) return frames

                val dataLength = (buffer[DATA_LENGTH_OFFSET].toInt() and 0xFF) or
                    ((buffer[DATA_LENGTH_OFFSET + 1].toInt() and 0xFF) shl 8)
                val frameSize = HEADER_SIZE + dataLength
                if (frameSize > MAX_FRAME_SIZE) {
                    // A corrupt/spurious magic match could still produce an implausible length;
                    // resync one byte in rather than buffering towards MAX_FRAME_SIZE forever.
                    buffer = buffer.copyOfRange(1, buffer.size)
                    continue
                }
                if (buffer.size < frameSize) return frames

                val candidate = buffer.copyOfRange(0, frameSize)
                buffer = buffer.copyOfRange(frameSize, buffer.size)
                val crc = (candidate[CRC_OFFSET].toInt() and 0xFF) or ((candidate[CRC_OFFSET + 1].toInt() and 0xFF) shl 8)
                val computed = Crc16Arc.compute(candidate, HEADER_SIZE, dataLength)
                if (crc == computed) {
                    frames += candidate
                } else {
                    // Protocol §2 [V]: "drop one byte and rescan after a bad CRC" -- the magic match
                    // was spurious (e.g. 0xA5A5 occurring inside another frame's payload); resume
                    // scanning one byte into the candidate instead of discarding it wholesale.
                    buffer = candidate.copyOfRange(1, candidate.size) + buffer
                }
            }
        }

        private fun findMagic(data: ByteArray): Int {
            for (i in 0 until data.size - 1) {
                if ((data[i].toInt() and 0xFF) == MAGIC_LO && (data[i + 1].toInt() and 0xFF) == MAGIC_HI) return i
            }
            return -1
        }
    }
}
