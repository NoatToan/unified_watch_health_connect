package com.unified.health.driver.zepp.codec

import com.unified.health.core.ble.protocol.MalformedPayloadException
import com.unified.health.core.ble.protocol.bytesOf
import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Test

class ChannelCodecTest {

    @Test
    fun `parses the version reply with and without the encrypt byte`() {
        assertEquals(ChannelVersionInfo(2, true), ChannelCodec.parseVersionReply(bytesOf(0x02, 0x02, 0x01)))
        assertEquals(ChannelVersionInfo(1, null), ChannelCodec.parseVersionReply(bytesOf(0x02, 0x01)))
        assertNull(ChannelCodec.parseVersionReply(bytesOf(0x04, 0x00, 0x01, 0x01, 0x00)))
        assertNull(ChannelCodec.parseVersionReply(bytesOf(0x02)))
    }

    @Test
    fun `encodes a v2 first packet`() {
        val packet = ChannelDataPacket(
            flags = ChannelFlags.FIRST or ChannelFlags.LAST or ChannelFlags.NEED_REPLY,
            sessionId = 0x07,
            index = 0,
            payload = bytesOf(0xAA, 0xBB),
            totalSize = 2,
            module = 0x0082,
        )
        assertArrayEquals(
            bytesOf(0x03, 0x07, 0x00, 0x07, 0x00, 0x02, 0x00, 0x00, 0x00, 0x82, 0x00, 0xAA, 0xBB),
            ChannelCodec.encodeData(ChannelProtocol.V2, packet),
        )
        // v1 omits the appId byte
        assertArrayEquals(
            bytesOf(0x03, 0x07, 0x07, 0x00, 0x02, 0x00, 0x00, 0x00, 0x82, 0x00, 0xAA, 0xBB),
            ChannelCodec.encodeData(ChannelProtocol.V1, packet),
        )
    }

    @Test
    fun `decodes first and continuation packets`() {
        val first = ChannelCodec.decodeData(ChannelProtocol.V2, bytesOf(0x03, 0x09, 0x00, 0x05, 0x00, 0x30, 0x00, 0x00, 0x00, 0x82, 0x00, 0x10))
        assertTrue(first.isFirst && first.isEncrypted)
        assertEquals(0x30L, first.totalSize)
        assertEquals(0x82, first.module)
        assertArrayEquals(bytesOf(0x10), first.payload)

        val next = ChannelCodec.decodeData(ChannelProtocol.V2, bytesOf(0x03, 0x06, 0x00, 0x05, 0x01, 0x11, 0x12))
        assertTrue(next.isLast && next.needsReply)
        assertEquals(null, next.module)
        assertEquals(1, next.index)
        assertArrayEquals(bytesOf(0x11, 0x12), next.payload)
    }

    @Test(expected = MalformedPayloadException::class)
    fun `truncated first packet is malformed`() {
        ChannelCodec.decodeData(ChannelProtocol.V2, bytesOf(0x03, 0x01, 0x00, 0x05, 0x00, 0x30))
    }

    @Test(expected = MalformedPayloadException::class)
    fun `non data frame is malformed`() {
        ChannelCodec.decodeData(ChannelProtocol.V2, bytesOf(0x04, 0x00, 0x05, 0x01, 0x00))
    }

    @Test
    fun `ack round trip`() {
        val ack = ChannelAck(sessionId = 5, code = 1, index = 3)
        assertArrayEquals(bytesOf(0x04, 0x00, 0x05, 0x01, 0x03), ChannelCodec.encodeAck(ChannelProtocol.V2, ack))
        assertArrayEquals(bytesOf(0x04, 0x05, 0x01, 0x03), ChannelCodec.encodeAck(ChannelProtocol.V1, ack))
        assertEquals(ack, ChannelCodec.decodeAck(ChannelProtocol.V2, bytesOf(0x04, 0x00, 0x05, 0x01, 0x03)))
        assertEquals(ack, ChannelCodec.decodeAck(ChannelProtocol.V1, bytesOf(0x04, 0x05, 0x01, 0x03)))
        assertNull(ChannelCodec.decodeAck(ChannelProtocol.V2, bytesOf(0x04, 0x05, 0x01, 0x03)))
    }

    @Test
    fun `split respects the packet size and flags`() {
        val payload = ByteArray(52) { it.toByte() }
        val packets = ChannelCodec.split(ChannelProtocol.V2, sessionId = 3, module = 0x82, payload = payload, packetSize = 20)
        // first carries 20 - 11 = 9 bytes, the rest 20 - 5 = 15 bytes
        assertEquals(listOf(9, 15, 15, 13), packets.map { it.payload.size })
        assertEquals(listOf(0, 1, 2, 3), packets.map { it.index })
        assertEquals(ChannelFlags.FIRST, packets[0].flags)
        assertEquals(0, packets[1].flags)
        assertEquals(ChannelFlags.LAST or ChannelFlags.NEED_REPLY, packets[3].flags)
        packets.forEach { assertTrue(ChannelCodec.encodeData(ChannelProtocol.V2, it).size <= 20) }
        assertArrayEquals(payload, packets.fold(ByteArray(0)) { acc, p -> acc + p.payload })
    }

    @Test
    fun `split asks for a reply every replyFrequency packets and marks encryption`() {
        val packets = ChannelCodec.split(
            ChannelProtocol.V2, sessionId = 1, module = 0x0A, payload = ByteArray(40), packetSize = 16,
            totalSize = 30, encrypted = true, replyFrequency = 2, needTailReply = false,
        )
        assertEquals(30L, packets.first().totalSize)
        assertTrue(packets.all { it.isEncrypted })
        assertEquals(packets.indices.map { (it + 1) % 2 == 0 }, packets.map { it.needsReply })
    }
}
