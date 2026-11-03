package com.unified.health.driver.garmin.codec

import com.unified.health.core.ble.protocol.hexToBytes
import com.unified.health.core.ble.protocol.toHex
import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Test

class GfdiFramingTest {

    @Test
    fun `crc matches the CRC-16 ARC check value`() {
        assertEquals(0xBB3D, GarminCrc16.compute("123456789".toByteArray()))
    }

    @Test
    fun `crc can be continued from a seed`() {
        val data = "123456789".toByteArray()
        val first = GarminCrc16.compute(data, 0, 4)
        assertEquals(0xBB3D, GarminCrc16.compute(data, 4, data.size, seed = first))
    }

    @Test
    fun `cobs known vectors`() {
        assertEquals("01", Cobs.encode(ByteArray(0)).toHex())
        assertEquals("0101", Cobs.encode("00".hexToBytes()).toHex())
        assertEquals("0311220233", Cobs.encode("11220033".hexToBytes()).toHex())
        assertArrayEquals("11220033".hexToBytes(), Cobs.decode("0311220233".hexToBytes()))
        assertArrayEquals("00".hexToBytes(), Cobs.decode("0101".hexToBytes()))
    }

    @Test
    fun `cobs splits runs of 254 non-zero bytes`() {
        val data = ByteArray(300) { (it % 255 + 1).toByte() }
        val encoded = Cobs.encode(data)
        assertEquals(0xFF, encoded[0].toInt() and 0xFF)
        assertEquals(47, encoded[255].toInt() and 0xFF) // 46 remaining bytes + 1
        assertTrue(encoded.none { it == 0.toByte() })
        assertArrayEquals(data, Cobs.decode(encoded))
    }

    @Test
    fun `cobs round trips exactly 254 bytes`() {
        val data = ByteArray(254) { 7 }
        assertArrayEquals(data, Cobs.decode(Cobs.encode(data)))
    }

    @Test(expected = CobsException::class)
    fun `cobs rejects a block that overruns the frame`() {
        Cobs.decode("051122".hexToBytes())
    }

    @Test(expected = CobsException::class)
    fun `cobs rejects a zero code byte`() {
        Cobs.decode("021100".hexToBytes())
    }

    @Test
    fun `accumulator reassembles frames across chunks and skips empty ones`() {
        val accumulator = CobsFrameAccumulator()
        assertTrue(accumulator.feed("00031122".hexToBytes()).isEmpty())
        val frames = accumulator.feed("0233000002AA00".hexToBytes())
        assertEquals(listOf("0311220233", "02aa"), frames.map { it.toHex() })
    }

    @Test
    fun `accumulator drops oversized frames`() {
        val accumulator = CobsFrameAccumulator(maxFrameSize = 4)
        val frames = accumulator.feed("000102030405060700020100".hexToBytes())
        assertEquals(listOf("0201"), frames.map { it.toHex() })
        assertEquals(1, accumulator.droppedFrames)
    }

    @Test
    fun `encodes a system event message`() {
        // len=8, id=5030 (0x13A6), payload 08 00, CRC computed with an independent bitwise CRC-16/ARC.
        val message = GfdiMessage(GfdiMessageId.SYSTEM_EVENT, GfdiPayloads.systemEvent(GarminSystemEvent.HANDSHAKE_COMPLETE))
        assertEquals("0800a6130800d5c5", message.encode().toHex())
        assertEquals("000208" + "04a61308" + "03d5c5" + "00", Cobs.frame(message.encode()).toHex())
    }

    @Test
    fun `decodes normal and compact headers`() {
        val normal = GfdiMessage.decode("0800a6130800d5c5".hexToBytes())
        assertEquals(5030, normal.id)
        assertNull(normal.transactionId)
        assertEquals("0800", normal.payload.toHex())

        val compact = GfdiMessage.decode("09000085a613005d1f".hexToBytes())
        assertEquals(GfdiMessageId.ACK, compact.id)
        assertEquals(5, compact.transactionId)
        assertEquals("a61300", compact.payload.toHex())
    }

    @Test
    fun `compact reply reuses the transaction id`() {
        val encoded = GfdiMessage(GfdiMessageId.ACK, "a61300".hexToBytes(), transactionId = 5).encode()
        assertEquals("09000085a613005d1f", encoded.toHex())
    }

    @Test(expected = GfdiFrameException::class)
    fun `rejects a bad crc`() {
        GfdiMessage.decode("0800a6130800d5c6".hexToBytes())
    }

    @Test(expected = GfdiFrameException::class)
    fun `rejects a length mismatch`() {
        GfdiMessage.decode("0900a6130800d5c5".hexToBytes())
    }

    @Test(expected = GfdiFrameException::class)
    fun `rejects a truncated frame`() {
        GfdiMessage.decode("0800a6".hexToBytes())
    }

    @Test
    fun `ack round trip`() {
        val ack = GfdiAck(5024, GfdiStatus.ACK, "0102".hexToBytes())
        assertEquals("a01300" + "0102", ack.encode().toHex())
        val decoded = GfdiAck.decode(ack.encode())
        assertEquals(5024, decoded.originalId)
        assertTrue(decoded.isAck)
        assertEquals("0102", decoded.data.toHex())
    }
}
