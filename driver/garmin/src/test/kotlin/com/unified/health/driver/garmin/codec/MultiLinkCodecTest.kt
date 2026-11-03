package com.unified.health.driver.garmin.codec

import com.unified.health.core.ble.protocol.hexToBytes
import com.unified.health.core.ble.protocol.toHex
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test

class MultiLinkCodecTest {

    private val clientId = 0x0102030405060708L

    @Test
    fun `command layouts`() {
        assertEquals("0000" + "0807060504030201" + "0100" + "00", MultiLinkCodec.register(clientId, 1).toHex())
        assertEquals("0005" + "0807060504030201" + "0000", MultiLinkCodec.closeAll(clientId).toHex())
        assertEquals("0002" + "0807060504030201" + "0100" + "03", MultiLinkCodec.closeHandle(clientId, 1, 3).toHex())
    }

    @Test
    fun `parses a successful register response`() {
        val response = MultiLinkCodec.parseResponse(hex("0001", "0807060504030201", "0100", "00", "05", "01", "02"))
        assertEquals(MultiLinkResponse.Register(clientId, 1, RegisterStatus.SUCCESS, handle = 5, reliableFlags = 1), response)
    }

    @Test
    fun `parses failing register responses without handle`() {
        val rejected = MultiLinkCodec.parseResponse(hex("0001", "0807060504030201", "0100", "04"))
        assertEquals(MultiLinkResponse.Register(clientId, 1, RegisterStatus.REJECTED, 0, 0), rejected)
        val inUse = MultiLinkCodec.parseResponse(hex("0001", "0807060504030201", "0100", "03", "0124"))
        assertEquals(RegisterStatus.ALREADY_IN_USE, (inUse as MultiLinkResponse.Register).status)
    }

    @Test
    fun `parses close all response and ignores other packets`() {
        assertEquals(MultiLinkResponse.CloseAll(clientId), MultiLinkCodec.parseResponse(hex("0006", "0807060504030201")))
        assertEquals(MultiLinkResponse.CloseAll(null), MultiLinkCodec.parseResponse(hex("0006")))
        assertNull(MultiLinkCodec.parseResponse(hex("0001080706"))) // truncated
        assertNull(MultiLinkCodec.parseResponse(hex("0104"))) // data handle
        assertNull(MultiLinkCodec.parseResponse(hex("0009")))
    }

    private fun hex(vararg parts: String): ByteArray = parts.joinToString("").hexToBytes()
}
