package com.unified.health.driver.zepp.codec

import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class ChannelReassemblerTest {

    private val payload = ByteArray(40) { (it * 3).toByte() }
    private fun packets() = ChannelCodec.split(ChannelProtocol.V2, sessionId = 9, module = 0x82, payload = payload, packetSize = 20)

    @Test
    fun `reassembles a split message`() {
        val reassembler = ChannelReassembler()
        val results = packets().map { reassembler.append(it) }
        assertTrue(results.dropLast(1).all { it == ChannelReassembler.Result.Pending })
        val message = (results.last() as ChannelReassembler.Result.Complete).message
        assertEquals(0x82, message.module)
        assertEquals(9, message.sessionId)
        assertArrayEquals(payload, message.data)
    }

    @Test
    fun `missing packet is reported as lost`() {
        val reassembler = ChannelReassembler()
        val all = packets()
        reassembler.append(all[0])
        assertEquals(ChannelReassembler.Result.Rejected(ChannelReplyCode.PACKET_LOST), reassembler.append(all[2]))
    }

    @Test
    fun `continuation without a first packet is a session mismatch`() {
        assertEquals(
            ChannelReassembler.Result.Rejected(ChannelReplyCode.SESSION_MISMATCH),
            ChannelReassembler().append(packets()[1]),
        )
    }

    @Test
    fun `size mismatch is rejected`() {
        val bad = ChannelCodec.split(ChannelProtocol.V2, 1, 0x82, ByteArray(10), packetSize = 40, totalSize = 12)
        assertEquals(ChannelReassembler.Result.Rejected(ChannelReplyCode.SIZE_MISMATCH), ChannelReassembler().append(bad.single()))
    }

    @Test
    fun `encrypted message must fill padded blocks`() {
        assertEquals(16, ChannelReassembler.encryptedSize(5))
        assertEquals(32, ChannelReassembler.encryptedSize(9))
        val packets = ChannelCodec.split(ChannelProtocol.V2, 2, 0x0A, ByteArray(32), packetSize = 60, totalSize = 9, encrypted = true)
        assertTrue(ChannelReassembler().append(packets.single()) is ChannelReassembler.Result.Complete)
    }
}
