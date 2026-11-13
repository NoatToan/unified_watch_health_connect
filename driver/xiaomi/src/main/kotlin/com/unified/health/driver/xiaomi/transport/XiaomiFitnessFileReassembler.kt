package com.unified.health.driver.xiaomi.transport

import com.unified.health.core.ble.protocol.ByteReader
import com.unified.health.core.ble.protocol.MalformedPayloadException
import java.io.ByteArrayOutputStream

/**
 * Reassembles one channel-5 fitness-file transfer (protocol §9.4 [V]; evidence:
 * `docs/re-evidence/mi/jadx-base/sources/com/xiaomi/fit/fitness/device/mi/receive/FitnessDataReceiver.java`,
 * `onReceive`/`merge`). Each L2 payload on `XiaomiChannel.FILE_FITNESS` is:
 * ```
 * u16 LE totalSegments
 * u16 LE sequence   // 1-based; must arrive 1..totalSegments in order
 * bytes segmentData
 * ```
 * [feed] concatenates `segmentData` in sequence order and returns the merged bytes once the final
 * segment (`sequence == totalSegments`) has arrived.
 *
 * One instance is good for exactly one transfer: the fitness sync loop downloads one id at a time
 * (protocol §9.3 [V], `f=4` one-id-at-a-time requests), so unlike the vendor's own
 * `FitnessDataReceiver` -- which keeps one receiver per `did` and resets on a sequence mismatch to
 * keep serving further transfers on the same connection -- this reassembler does not need reset
 * logic; a malformed/out-of-order segment is a hard failure for its transfer (caller creates a
 * fresh instance to retry).
 */
internal class XiaomiFitnessFileReassembler {
    private val buffer = ByteArrayOutputStream()
    private var totalSegments = -1
    private var nextSequence = 1

    /**
     * @return the merged bytes once the final segment has arrived, else `null` (more segments
     * expected).
     * @throws MalformedPayloadException if [packet] is shorter than its 4-byte header, or the
     * sequence is out of order, or `totalSegments` changes mid-transfer.
     */
    fun feed(packet: ByteArray): ByteArray? {
        if (packet.size < HEADER_SIZE) {
            throw MalformedPayloadException("Fitness file segment shorter than its $HEADER_SIZE-byte header: ${packet.size} bytes")
        }
        val reader = ByteReader(packet)
        val total = reader.u16le()
        val sequence = reader.u16le()
        if (total < 1 || sequence != nextSequence || (totalSegments != -1 && totalSegments != total)) {
            throw MalformedPayloadException(
                "Fitness file segment out of order (total=$total, sequence=$sequence, expected sequence=$nextSequence" +
                    if (totalSegments != -1) ", previously total=$totalSegments)" else ")",
            )
        }
        totalSegments = total
        buffer.write(reader.rest())
        nextSequence++
        return if (sequence == total) buffer.toByteArray() else null
    }

    private companion object {
        const val HEADER_SIZE = 4
    }
}
