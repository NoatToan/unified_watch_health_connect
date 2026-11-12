package com.unified.health.driver.xiaomi.transport

import com.unified.health.core.ble.protocol.MalformedPayloadException
import com.unified.health.core.ble.protocol.hexToBytes
import com.unified.health.core.ble.protocol.toHex
import com.unified.health.driver.xiaomi.XiaomiChannel
import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Assert.assertThrows
import org.junit.Test

class XiaomiL2Test {

    @Test
    fun `channel 1 type depends on opCode, every other channel is fixed`() {
        assertEquals(100, L2Frame.typeFor(XiaomiChannel.PROTOBUF.id, XiaomiOpCode.WRITE))
        assertEquals(101, L2Frame.typeFor(XiaomiChannel.PROTOBUF.id, XiaomiOpCode.WRITE_ENC))
        assertEquals(100, L2Frame.typeFor(XiaomiChannel.PROTOBUF.id, XiaomiOpCode.READ))
        assertEquals(104, L2Frame.typeFor(XiaomiChannel.MASS.id, XiaomiOpCode.WRITE))
        assertEquals(103, L2Frame.typeFor(XiaomiChannel.MASS_VOICE.id, XiaomiOpCode.WRITE_ENC))
        assertEquals(107, L2Frame.typeFor(XiaomiChannel.FILE_SENSOR.id, XiaomiOpCode.WRITE))
        assertEquals(102, L2Frame.typeFor(XiaomiChannel.FILE_FITNESS.id, XiaomiOpCode.WRITE))
        assertEquals(105, L2Frame.typeFor(XiaomiChannel.OTA.id, XiaomiOpCode.WRITE))
        assertEquals(108, L2Frame.typeFor(XiaomiChannel.NETWORK.id, XiaomiOpCode.WRITE))
        assertEquals(112, L2Frame.typeFor(XiaomiChannel.LYRA.id, XiaomiOpCode.WRITE))
        assertEquals(113, L2Frame.typeFor(XiaomiChannel.RESEARCH.id, XiaomiOpCode.WRITE))
    }

    @Test
    fun `typeFor returns null for an unmapped channel`() {
        assertNull(L2Frame.typeFor(channel = 42, opCode = XiaomiOpCode.WRITE))
    }

    @Test
    fun `channelAndOpCodeFor is the exact reverse of typeFor for every known type`() {
        val cases = listOf(
            XiaomiChannel.PROTOBUF.id to XiaomiOpCode.WRITE,
            XiaomiChannel.PROTOBUF.id to XiaomiOpCode.WRITE_ENC,
            XiaomiChannel.MASS.id to XiaomiOpCode.WRITE,
            XiaomiChannel.FILE_FITNESS.id to XiaomiOpCode.WRITE,
            XiaomiChannel.LYRA.id to XiaomiOpCode.WRITE,
        )
        cases.forEach { (channel, opCode) ->
            val type = checkNotNull(L2Frame.typeFor(channel, opCode))
            val (reversedChannel, _) = checkNotNull(L2Frame.channelAndOpCodeFor(type))
            assertEquals(channel, reversedChannel)
            assertEquals(type, L2Frame.typeFor(reversedChannel, L2Frame.channelAndOpCodeFor(type)!!.second))
        }
    }

    @Test
    fun `channelAndOpCodeFor returns null for an unknown type`() {
        assertNull(L2Frame.channelAndOpCodeFor(999))
    }

    @Test
    fun `encode does not call encrypt for a plaintext opCode`() {
        var called = false
        val bytes = L2Frame.encode(XiaomiChannel.PROTOBUF.id, XiaomiOpCode.WRITE, byteArrayOf(1, 2, 3)) { called = true; it }
        assertEquals(false, called)
        assertEquals(1, bytes[0].toInt())
        assertEquals(XiaomiOpCode.WRITE, bytes[1].toInt())
        assertArrayEquals(byteArrayOf(1, 2, 3), bytes.copyOfRange(2, bytes.size))
    }

    @Test
    fun `encode applies encrypt exactly for opCode WRITE_ENC`() {
        val bytes = L2Frame.encode(XiaomiChannel.PROTOBUF.id, XiaomiOpCode.WRITE_ENC, byteArrayOf(1, 2, 3)) { it.reversedArray() }
        assertArrayEquals(byteArrayOf(3, 2, 1), bytes.copyOfRange(2, bytes.size))
    }

    @Test
    fun `decode applies decrypt exactly for opCode WRITE_ENC`() {
        val plaintext = L2Frame.decode(byteArrayOf(1, XiaomiOpCode.WRITE.toByte(), 1, 2, 3))
        assertArrayEquals(byteArrayOf(1, 2, 3), plaintext.payload)

        val decrypted = L2Frame.decode(byteArrayOf(1, XiaomiOpCode.WRITE_ENC.toByte(), 1, 2, 3)) { it.reversedArray() }
        assertArrayEquals(byteArrayOf(3, 2, 1), decrypted.payload)
    }

    @Test
    fun `decode rejects a frame shorter than the 2-byte header`() {
        assertThrows(MalformedPayloadException::class.java) { L2Frame.decode(byteArrayOf(1)) }
    }

    @Test
    fun `round-trips the getBindInfo l2 vector as plaintext channel 1`() {
        // XIAOMI_TEST_VECTORS.json getBindInfo.l2_hex = "01 01" + s7r_hex.
        val l2Hex = "0101080110111a165a1408001210e807f1fcf82d132f9bb018ca6738a19f"
        val s7rHex = "080110111a165a1408001210e807f1fcf82d132f9bb018ca6738a19f"
        val decoded = L2Frame.decode(l2Hex.hexToBytes())
        assertEquals(XiaomiChannel.PROTOBUF.id, decoded.channel)
        assertEquals(XiaomiOpCode.WRITE, decoded.opCode)
        assertEquals(s7rHex, decoded.payload.toHex())
        assertEquals(100, L2Frame.typeFor(decoded.channel, decoded.opCode))

        val reEncoded = L2Frame.encode(decoded.channel, decoded.opCode, decoded.payload)
        assertEquals(l2Hex, reEncoded.toHex())
    }
}
