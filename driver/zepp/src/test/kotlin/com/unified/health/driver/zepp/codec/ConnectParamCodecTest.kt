package com.unified.health.driver.zepp.codec

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test

class ConnectParamCodecTest {

    @Test
    fun `parses ATT MTU as skip byte plus little-endian payload plus 3`() {
        // ConnectionParamCodec.decode: readByte() then readShort() (LE) + 3 (Mtu.setAttMtuSize).
        assertEquals(247, ConnectParamCodec.parseAttMtu(byteArrayOf(0x02, 0xF4.toByte(), 0x00)))
        assertEquals(103, ConnectParamCodec.parseAttMtu(byteArrayOf(0x02, 0x64, 0x00)))
    }

    @Test
    fun `caps an oversized payload at the vendor maximum 247`() {
        assertEquals(247, ConnectParamCodec.parseAttMtu(byteArrayOf(0x02, 0xFF.toByte(), 0xFF.toByte())))
    }

    @Test
    fun `rejects a wrong command, a short reply and an unusable MTU`() {
        assertNull(ConnectParamCodec.parseAttMtu(byteArrayOf(0x01, 0x64, 0x00)))
        assertNull(ConnectParamCodec.parseAttMtu(byteArrayOf(0x02, 0x64)))
        assertNull(ConnectParamCodec.parseAttMtu(ByteArray(0)))
        // payload 0 -> ATT MTU 3, below Mtu.ATT_MTU_MIN; the vendor ignores it and keeps its default.
        assertNull(ConnectParamCodec.parseAttMtu(byteArrayOf(0x02, 0x00, 0x00)))
    }
}
