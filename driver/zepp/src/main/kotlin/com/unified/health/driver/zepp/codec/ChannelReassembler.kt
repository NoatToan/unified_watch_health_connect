package com.unified.health.driver.zepp.codec

import java.io.ByteArrayOutputStream

/** A complete inbound module message, still encrypted when [isEncrypted]. */
internal class ChannelMessage(
    val module: Int,
    val sessionId: Int,
    val flags: Int,
    /** Size of the plaintext as announced by the FIRST packet. */
    val totalSize: Int,
    val data: ByteArray,
) {
    val isEncrypted: Boolean get() = flags and ChannelFlags.ENCRYPTED != 0
}

/**
 * Rebuilds inbound messages from DATA packets, mirroring `ChannelDataBuf.append` (§3.3 [V]):
 * same session, consecutive index (mod 256), and a size check against totalSize (for encrypted
 * messages: `pad16(totalSize + 8)`, i.e. data ‖ nonce ‖ CRC32 padded, §5.4). Not thread-safe.
 */
internal class ChannelReassembler(private val maxMessageSize: Int = DEFAULT_MAX_MESSAGE_SIZE) {

    sealed interface Result {
        /** Accepted; more packets expected. */
        data object Pending : Result

        data class Complete(val message: ChannelMessage) : Result

        /** Rejected; the caller ACKs with [code] (a [ChannelReplyCode]) and the buffer is reset. */
        data class Rejected(val code: Int) : Result
    }

    private class Buffer(val module: Int, val sessionId: Int, val totalSize: Int) {
        val bytes = ByteArrayOutputStream()
        var lastIndex = -1
        var flags = 0
    }

    private var buffer: Buffer? = null

    fun append(packet: ChannelDataPacket): Result {
        if (packet.isFirst) {
            val totalSize = packet.totalSize ?: return reject(ChannelReplyCode.SIZE_MISMATCH)
            val module = packet.module ?: return reject(ChannelReplyCode.SIZE_MISMATCH)
            if (totalSize <= 0 || totalSize > maxMessageSize) return reject(ChannelReplyCode.SIZE_MISMATCH)
            buffer = Buffer(module, packet.sessionId, totalSize.toInt())
        }
        val current = buffer ?: return reject(ChannelReplyCode.SESSION_MISMATCH)
        if (current.sessionId != packet.sessionId) return reject(ChannelReplyCode.SESSION_MISMATCH)
        if ((current.lastIndex + 1) % 256 != packet.index) return reject(ChannelReplyCode.PACKET_LOST)

        current.flags = current.flags or packet.flags
        if (!sizeAcceptable(current, packet)) return reject(ChannelReplyCode.SIZE_MISMATCH)
        current.lastIndex = packet.index
        current.bytes.write(packet.payload)
        if (!packet.isLast) return Result.Pending

        buffer = null
        return Result.Complete(ChannelMessage(current.module, current.sessionId, current.flags, current.totalSize, current.bytes.toByteArray()))
    }

    fun reset() {
        buffer = null
    }

    private fun sizeAcceptable(current: Buffer, packet: ChannelDataPacket): Boolean {
        val size = packet.payload.size
        if (size <= 0) return false
        val cached = current.bytes.size()
        if (current.flags and ChannelFlags.ENCRYPTED != 0) {
            val expected = encryptedSize(current.totalSize)
            return if (packet.isLast) cached + size == expected else cached + size < expected
        }
        val received = cached + size
        return received <= current.totalSize && (!packet.isLast || received == current.totalSize)
    }

    private fun reject(code: Int): Result {
        buffer = null
        return Result.Rejected(code)
    }

    companion object {
        /** Guards memory against a corrupt totalSize; module messages are small (auth ≤ 65 bytes). */
        const val DEFAULT_MAX_MESSAGE_SIZE = 1 shl 20

        /** data ‖ nonce(4) ‖ CRC32(4), zero-padded to the AES block size (§5.4 [V]). */
        fun encryptedSize(totalSize: Int): Int {
            val raw = totalSize + ChannelCipher.TRAILER_SIZE
            return (raw + AesEcb.BLOCK_SIZE - 1) / AesEcb.BLOCK_SIZE * AesEcb.BLOCK_SIZE
        }
    }
}
