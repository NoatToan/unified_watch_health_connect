package com.unified.health.driver.zepp.codec

import com.unified.health.core.ble.protocol.ByteReader
import com.unified.health.core.ble.protocol.MalformedPayloadException
import com.unified.health.core.ble.protocol.buildBytes

/** First byte of every channel frame (`ChannelPacketType.java:11-15`, §3.3 [V]). */
internal object ChannelPacketType {
    const val VERSION_QUERY = 0x01
    const val VERSION_REPLY = 0x02
    const val DATA = 0x03
    const val DATA_REPLY = 0x04
}

/** DATA packet flags (`ChannelDataPacket.java:21-33`, §3.3 [V]). */
internal object ChannelFlags {
    const val FIRST = 0x01
    const val LAST = 0x02
    const val NEED_REPLY = 0x04
    const val ENCRYPTED = 0x08
}

/** DATA_REPLY result codes (`BaseChannelApiImpl.java:629-660`, `ChannelDataBuf.append`, §3.3 [V]). */
internal object ChannelReplyCode {
    const val OK = 1
    const val SESSION_MISMATCH = 2
    const val PACKET_LOST = 3
    const val SIZE_MISMATCH = 4
    const val UNKNOWN_MODULE = 5
}

/**
 * Channel header variants (§3.3 [V]): v1 (`ChannelApiImpl`) has no appId byte, v2 (`ChannelApiImpl2`,
 * Zepp OS / Huami OS) adds one after the flags.
 */
internal enum class ChannelProtocol(val hasAppId: Boolean) {
    V1(hasAppId = false),
    V2(hasAppId = true),
    ;

    /** type, flags, [appId], session, index, totalSize u32, module u16. */
    val firstHeaderSize: Int get() = if (hasAppId) 11 else 10

    /** type, flags, [appId], session, index. */
    val subsequentHeaderSize: Int get() = if (hasAppId) 5 else 4
}

/** Parsed VERSION_REPLY `[0x02, version, encryptEnable?]` (`ChannelVersion.java:37-46`, §3.3 [V]). */
internal data class ChannelVersionInfo(
    val version: Int,
    /** Null when the watch omitted the byte; the vendor app then uses the 0x80 auth module (§4 step 5). */
    val encryptEnabled: Boolean?,
)

/**
 * One DATA packet. [totalSize] and [module] are present only on the FIRST packet.
 * @property appId v2 only (`HMBleConfig.APP_ID`, default 0); ignored for v1.
 */
internal class ChannelDataPacket(
    val flags: Int,
    val sessionId: Int,
    val index: Int,
    val payload: ByteArray,
    val totalSize: Long? = null,
    val module: Int? = null,
    val appId: Int = ChannelCodec.APP_ID,
) {
    val isFirst: Boolean get() = flags and ChannelFlags.FIRST != 0
    val isLast: Boolean get() = flags and ChannelFlags.LAST != 0
    val needsReply: Boolean get() = flags and ChannelFlags.NEED_REPLY != 0
    val isEncrypted: Boolean get() = flags and ChannelFlags.ENCRYPTED != 0
}

/** Parsed DATA_REPLY (ACK). v2 `[0x04, appId, session, code, index]`, v1 `[0x04, session, code, index]`. */
internal data class ChannelAck(val sessionId: Int, val code: Int, val index: Int, val appId: Int = ChannelCodec.APP_ID)

/** Pure encode/decode of channel frames on 0x0016/0x0017 (§3.3). All integers little-endian. */
internal object ChannelCodec {
    /** `HMBleConfig.APP_ID` default (§3.3 [V]). */
    const val APP_ID = 0

    /** Packets per NEED_REPLY flag when the caller does not override it (`ChannelRequest.REPLY_FREQ`, [V]). */
    const val DEFAULT_REPLY_FREQUENCY = 16

    /** The phone's answer when the watch asks for our channel version (`BaseChannelApiImpl.e`, [V]). */
    val APP_VERSION_REPLY: ByteArray = byteArrayOf(ChannelPacketType.VERSION_REPLY.toByte(), 0x01)

    val VERSION_QUERY: ByteArray = byteArrayOf(ChannelPacketType.VERSION_QUERY.toByte())

    /** @return null when [frame] is not a VERSION_REPLY. */
    fun parseVersionReply(frame: ByteArray): ChannelVersionInfo? {
        if (frame.size < 2 || frame[0].toInt() != ChannelPacketType.VERSION_REPLY) return null
        val reader = ByteReader(frame, start = 1)
        val version = reader.u8()
        val encrypt = if (reader.hasRemaining) reader.u8() != 0 else null
        return ChannelVersionInfo(version, encrypt)
    }

    fun encodeData(protocol: ChannelProtocol, packet: ChannelDataPacket): ByteArray = buildBytes(protocol.firstHeaderSize + packet.payload.size) {
        u8(ChannelPacketType.DATA)
        u8(packet.flags)
        if (protocol.hasAppId) u8(packet.appId)
        u8(packet.sessionId)
        u8(packet.index)
        if (packet.isFirst) {
            u32le(requireNotNull(packet.totalSize) { "FIRST packet needs totalSize" })
            u16le(requireNotNull(packet.module) { "FIRST packet needs module" })
        }
        bytes(packet.payload)
    }

    /** @throws MalformedPayloadException for a truncated frame or a non-DATA type byte. */
    fun decodeData(protocol: ChannelProtocol, frame: ByteArray): ChannelDataPacket {
        val reader = ByteReader(frame)
        val type = reader.u8()
        if (type != ChannelPacketType.DATA) throw MalformedPayloadException("Not a DATA packet: type $type")
        val flags = reader.u8()
        val appId = if (protocol.hasAppId) reader.u8() else APP_ID
        val sessionId = reader.u8()
        val index = reader.u8()
        return if (flags and ChannelFlags.FIRST != 0) {
            val totalSize = reader.u32le()
            val module = reader.u16le()
            ChannelDataPacket(flags, sessionId, index, reader.rest(), totalSize, module, appId)
        } else {
            ChannelDataPacket(flags, sessionId, index, reader.rest(), appId = appId)
        }
    }

    fun encodeAck(protocol: ChannelProtocol, ack: ChannelAck): ByteArray = buildBytes(5) {
        u8(ChannelPacketType.DATA_REPLY)
        if (protocol.hasAppId) u8(ack.appId)
        u8(ack.sessionId)
        u8(ack.code)
        u8(ack.index)
    }

    /** @return null when [frame] is not a well-formed DATA_REPLY (`ReplyParseV1Impl`/`ReplyParseV2Impl`). */
    fun decodeAck(protocol: ChannelProtocol, frame: ByteArray): ChannelAck? {
        val expectedSize = if (protocol.hasAppId) 5 else 4
        if (frame.size != expectedSize || frame[0].toInt() != ChannelPacketType.DATA_REPLY) return null
        val reader = ByteReader(frame, start = 1)
        val appId = if (protocol.hasAppId) reader.u8() else APP_ID
        return ChannelAck(sessionId = reader.u8(), code = reader.u8(), index = reader.u8(), appId = appId)
    }

    /**
     * Splits one module message into packets of at most [packetSize] bytes, mirroring
     * `BaseChannelApiImpl.packetRawData` (§3.3 [V]): index counts from 0 (mod 256), the first packet
     * carries FIRST + totalSize + module, the last LAST (+ NEED_REPLY when [needTailReply]), and every
     * [replyFrequency]-th packet also asks for a reply.
     *
     * @param totalSize size of the message before encryption (the watch checks it, §5.4).
     */
    fun split(
        protocol: ChannelProtocol,
        sessionId: Int,
        module: Int,
        payload: ByteArray,
        packetSize: Int,
        totalSize: Int = payload.size,
        encrypted: Boolean = false,
        replyFrequency: Int = DEFAULT_REPLY_FREQUENCY,
        needTailReply: Boolean = true,
    ): List<ChannelDataPacket> {
        require(payload.isNotEmpty()) { "Channel message must not be empty" }
        require(packetSize > protocol.firstHeaderSize) { "Packet size $packetSize too small for the channel header" }
        require(replyFrequency > 0) { "replyFrequency must be positive" }
        val packets = ArrayList<ChannelDataPacket>()
        var offset = 0
        while (offset < payload.size) {
            val first = packets.isEmpty()
            val room = packetSize - if (first) protocol.firstHeaderSize else protocol.subsequentHeaderSize
            val end = minOf(offset + room, payload.size)
            var flags = if (encrypted) ChannelFlags.ENCRYPTED else 0
            if (end == payload.size) flags = flags or ChannelFlags.LAST or (if (needTailReply) ChannelFlags.NEED_REPLY else 0)
            if (first) flags = flags or ChannelFlags.FIRST
            if ((packets.size + 1) % replyFrequency == 0) flags = flags or ChannelFlags.NEED_REPLY
            packets += ChannelDataPacket(
                flags = flags,
                sessionId = sessionId and 0xFF,
                index = packets.size % 256,
                payload = payload.copyOfRange(offset, end),
                totalSize = if (first) totalSize.toLong() else null,
                module = if (first) module else null,
            )
            offset = end
        }
        return packets
    }
}
