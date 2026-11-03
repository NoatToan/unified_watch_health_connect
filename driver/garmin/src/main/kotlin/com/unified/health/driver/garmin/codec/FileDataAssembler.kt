package com.unified.health.driver.garmin.codec

import com.unified.health.core.ble.protocol.ByteReader
import com.unified.health.core.ble.protocol.MalformedPayloadException
import com.unified.health.core.ble.protocol.buildBytes
import java.io.ByteArrayOutputStream

/**
 * Reassembles one file pushed by the watch as 5004 File Data messages and produces the ACK data
 * for each (§6.1 [V], `xs2/i.java:51-120`).
 *
 * 5004 payload: `u8 flags | u16 crc | u32 offset | data`, where `crc` is the running CRC-16 over
 * every data byte so far (seed 0, the `crcSeed` we sent in 5002). ACK data: `u8 status | u32 nextOffset`.
 *
 * Not thread-safe; the owner serialises calls.
 */
internal class FileDataAssembler(private val maxSize: Long = DEFAULT_MAX_SIZE) {

    private val data = ByteArrayOutputStream()
    private var runningCrc = 0
    private var lastOffset = -1L
    private var consecutiveInvalid = 0

    /** Size announced in the 5002 response, or null until known. */
    var expectedSize: Long? = null
        private set

    /** Non-null once the transfer must be abandoned. */
    var failure: String? = null
        private set

    val receivedBytes: Long get() = data.size().toLong()

    val isComplete: Boolean get() = failure == null && expectedSize?.let { receivedBytes >= it } == true

    fun expect(size: Long) {
        if (size > maxSize) failure = "File of $size bytes exceeds the $maxSize byte limit"
        expectedSize = size
        if (receivedBytes > size) failure = "Received $receivedBytes bytes but the file has $size"
    }

    fun bytes(): ByteArray = data.toByteArray()

    /** Consumes one 5004 payload and returns the ACK data to send back. */
    fun accept(payload: ByteArray): ByteArray {
        if (failure != null) return ack(STATUS_ABORT)
        val header = try {
            ByteReader(payload).let { Triple(it.u8(), it.u16le(), it.u32le()) }
        } catch (e: MalformedPayloadException) {
            failure = "Malformed file data: ${e.message}"
            return ack(STATUS_ABORT)
        }
        val (_, crc, offset) = header
        val chunk = payload.copyOfRange(HEADER_SIZE, payload.size)
        if (offset != receivedBytes) {
            if (consecutiveInvalid >= MAX_INVALID_PACKETS) {
                failure = "Too many consecutive invalid file packets (last offset $offset, expected $receivedBytes)"
                return ack(STATUS_ABORT)
            }
            consecutiveInvalid++
            // A retransmission of the previous packet is acknowledged as OK with the current offset.
            return ack(if (offset == lastOffset) STATUS_OK else STATUS_OFFSET_MISMATCH)
        }
        val newCrc = GarminCrc16.compute(chunk, seed = runningCrc)
        if (newCrc != crc) {
            failure = "File data CRC mismatch at offset $offset"
            return ack(STATUS_CRC_MISMATCH)
        }
        if (receivedBytes + chunk.size > (expectedSize ?: maxSize)) {
            failure = "File data overruns the announced size"
            return ack(STATUS_ABORT)
        }
        data.write(chunk)
        runningCrc = newCrc
        lastOffset = offset
        consecutiveInvalid = 0
        return ack(STATUS_OK)
    }

    private fun ack(status: Int): ByteArray = buildBytes(5) {
        u8(status)
        u32le(receivedBytes)
    }

    companion object {
        const val HEADER_SIZE = 7
        const val STATUS_OK = 0
        const val STATUS_ABORT = 2
        const val STATUS_CRC_MISMATCH = 3
        const val STATUS_OFFSET_MISMATCH = 4

        /** `xs2/i.java` MAX_INVALID_PACKETS. */
        const val MAX_INVALID_PACKETS = 3

        /** Monitoring/activity FIT files are tens of KB; anything this large is treated as corrupt. */
        const val DEFAULT_MAX_SIZE = 16L * 1024 * 1024
    }
}
