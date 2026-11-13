package com.unified.health.driver.xiaomi.codec

import com.unified.health.core.ble.protocol.ByteReader
import com.unified.health.core.ble.protocol.MalformedPayloadException
import com.unified.health.driver.xiaomi.proto.FitnessDataId
import java.util.zip.CRC32

/**
 * Splits one reassembled channel-5 transfer (see
 * [com.unified.health.driver.xiaomi.transport.XiaomiFitnessFileReassembler]) into its
 * [FitnessDataId] and payload bytes (protocol §9.4 [V]):
 * ```
 * [0..7)  7-byte FitnessDataId
 * [7..]   payload, with a trailing CRC32 over everything before it
 * ```
 *
 * The protocol doc does not give a bitflag for whether a given transfer carries the trailing
 * CRC32 ("the vendor's `crc32Verify=true` path verifies then strips it"). The evidence resolves
 * this instead of leaving it a guess: `FitnessReceiverHandler.handleData` always constructs its
 * receiver as `new FitnessDataReceiver(did, true)` [V] -- every channel-5 transfer the vendor's own
 * app ever decodes has `crc32Verify` hardcoded `true`, so this driver always expects and strips
 * the trailing CRC32 too (no device ever skips it in this evidence).
 */
internal object FitnessFilePayload {
    private const val CRC_LENGTH = 4

    data class Decoded(val id: FitnessDataId, val payload: ByteArray) {
        /**
         * `id.encode() + payload` -- what [com.unified.health.core.model.HealthRecord.RawPayload.bytes]
         * stores for this transfer (CRC32 stripped, id kept) so
         * [com.unified.health.driver.xiaomi.XiaomiDriver.reprocess] can recover the same
         * [FitnessDataId] (version/timezone/dataType/subType/fileType) a stored file needs without
         * a live link. See [FitnessPayloadDecoder] for the matching re-split.
         */
        val rawPayloadBytes: ByteArray get() = id.encode() + payload
    }

    /**
     * @throws MalformedPayloadException if [merged] is too short for a [FitnessDataId] plus a
     * CRC32 trailer, the CRC32 does not match, or the decoded id does not equal [expectedId] (the
     * watch answered a different id than the one requested -- a protocol error, not something to
     * silently trust positional ordering for).
     */
    fun decode(merged: ByteArray, expectedId: FitnessDataId): Decoded {
        val minSize = FitnessDataId.SIZE + CRC_LENGTH
        if (merged.size < minSize) {
            throw MalformedPayloadException("Fitness file transfer too short: ${merged.size} bytes, need at least $minSize")
        }
        val body = merged.copyOfRange(0, merged.size - CRC_LENGTH)
        val expectedCrc = ByteReader(merged, merged.size - CRC_LENGTH, merged.size).u32le()
        val actualCrc = crc32(body)
        if (expectedCrc != actualCrc) {
            throw MalformedPayloadException("Fitness file CRC32 mismatch for $expectedId (expected $expectedCrc, computed $actualCrc)")
        }
        val id = FitnessDataId.decode(body.copyOfRange(0, FitnessDataId.SIZE))
        if (id != expectedId) {
            throw MalformedPayloadException("Fitness file answered id ($id) does not match the requested id ($expectedId)")
        }
        return Decoded(id, body.copyOfRange(FitnessDataId.SIZE, body.size))
    }

    private fun crc32(bytes: ByteArray): Long = CRC32().apply { update(bytes) }.value
}
