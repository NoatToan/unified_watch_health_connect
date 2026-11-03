package com.unified.health.driver.huawei.codec

import com.unified.health.core.ble.protocol.MalformedPayloadException
import com.unified.health.core.ble.protocol.hexToBytes
import com.unified.health.core.ble.protocol.toHex
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Test
import java.time.Instant
import java.time.ZoneOffset

class TlvTest {

    @Test
    fun `varint lengths follow cph rules`() {
        assertEquals("7f", TlvCodec.encodeLength(127).toHex())
        assertEquals("8100", TlvCodec.encodeLength(128).toHex())
        assertEquals("ff7f", TlvCodec.encodeLength(16383).toHex())
        assertEquals("818000", TlvCodec.encodeLength(16384).toHex())
        for (n in listOf(0, 1, 127, 128, 300, 16383, 16384, TlvCodec.MAX_LENGTH)) {
            val encoded = TlvCodec.encodeLength(n)
            assertEquals(n, TlvCodec.decodeLength(com.unified.health.core.ble.protocol.ByteReader(encoded)))
        }
    }

    @Test
    fun `round trips long values and nested tags`() {
        val long = ByteArray(200) { it.toByte() }
        val tlvs = listOf(Tlv(1), Tlv(2, long), Tlv.nested(0x81, listOf(Tlv.u16(2, 7), Tlv.u8(3, 9))))
        val decoded = TlvCodec.decode(TlvCodec.encode(tlvs))
        assertEquals(tlvs, decoded)
        assertTrue(decoded[2].isNested)
        assertEquals(listOf(Tlv.u16(2, 7), Tlv.u8(3, 9)), decoded[2].children())
        assertEquals(7, decoded[2].children()[0].int())
    }

    @Test
    fun `truncated or overlong input is malformed`() {
        for (hex in listOf("0105aabb", "01", "01ffffff7f")) {
            try {
                TlvCodec.decode(hex.hexToBytes())
                throw AssertionError("$hex should not decode")
            } catch (_: MalformedPayloadException) {
            }
        }
    }

    @Test
    fun `command encodes service command and tlvs`() {
        val command = HuaweiCommand.decode("0703 0100".hexToBytes())
        assertEquals("0703", command.tag)
        assertEquals("07030100", command.encode().toHex())
        assertNull(command.errorCode())
        assertEquals(100_000L, HuaweiCommand.decode("0105 7f04000186a0".hexToBytes()).errorCode())
    }

    @Test
    fun `time payload encodes epoch seconds and signed offset`() {
        val instant = Instant.ofEpochSecond(0x65000000, 600_000_000) // rounds up
        val plus = DeviceConfigCommands.setDateTime(instant, ZoneOffset.ofHoursMinutes(5, 30))
        assertEquals("0105 0104 65000001 0202 051e".replace(" ", ""), plus.encode().toHex())
        val minus = DeviceConfigCommands.setDateTime(Instant.ofEpochSecond(0x65000000), ZoneOffset.ofHoursMinutes(-3, -30))
        assertEquals("0105 0104 65000000 0202 831e".replace(" ", ""), minus.encode().toHex())
    }

    @Test
    fun `fitness requests match the app builders`() {
        assertEquals("07030100", FitnessCommands.todayTotal().encode().toHex())
        assertEquals("0704 0100 030465000000 040465000e10".replace(" ", ""), FitnessCommands.healthFrameCount(0x65000000, 0x65000E10).encode().toHex())
        assertEquals("07040100", FitnessCommands.healthFrameCount(0, 0x65000E10).encode().toHex())
        assertEquals("0705 8104 02020003".replace(" ", ""), FitnessCommands.healthFrameCompressed(3).encode().toHex())
        assertEquals("0708 8108 02020003 03020003".replace(" ", ""), FitnessCommands.healthFrame(3).encode().toHex())
        assertEquals("070a 8100 030465000000 040465000e10".replace(" ", ""), FitnessCommands.sampleFrameCount(0x65000000, 0x65000E10).encode().toHex())
        assertEquals("070b 8104 02020102".replace(" ", ""), FitnessCommands.sampleFrame(0x0102).encode().toHex())
        assertEquals("070c8100", FitnessCommands.statusFrameCount(0, 0).encode().toHex())
        assertEquals("070d 8104 02020001".replace(" ", ""), FitnessCommands.statusFrame(1).encode().toHex())
    }
}
