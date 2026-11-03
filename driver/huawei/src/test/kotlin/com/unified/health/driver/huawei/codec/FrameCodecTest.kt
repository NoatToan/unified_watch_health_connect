package com.unified.health.driver.huawei.codec

import com.unified.health.core.ble.protocol.MalformedPayloadException
import com.unified.health.core.ble.protocol.hexToBytes
import com.unified.health.core.ble.protocol.toHex
import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class FrameCodecTest {

    @Test
    fun `crc16 xmodem matches the standard check value`() {
        assertEquals(0x31C3, Crc16Xmodem.compute("123456789".toByteArray()))
        assertEquals(0, Crc16Xmodem.compute(ByteArray(0)))
    }

    @Test
    fun `link negotiation request is one single frame`() {
        val frames = FrameCodec.encode(LinkParameters.request().encode(), maxFrame = 255)
        assertEquals(listOf("5a000d00010101000200030004001000afdc"), frames.map { it.toHex() })
    }

    @Test
    fun `payload larger than maxFrame is sliced with flags and indexes`() {
        // maxFrame 9 -> slices of 9 - 7 = 2 bytes; 5 + 6 > 9 so slicing is required.
        val frames = FrameCodec.encode(byteArrayOf(1, 2, 3, 4, 5), maxFrame = 9)
        assertEquals(listOf("5a000401000102f518", "5a0004020103045f50", "5a000303020502dd"), frames.map { it.toHex() })
    }

    @Test
    fun `single frame boundary is payload plus 6`() {
        assertEquals(1, FrameCodec.encode(ByteArray(10), maxFrame = 16).size)
        assertEquals(2, FrameCodec.encode(ByteArray(11), maxFrame = 16).size)
    }

    @Test
    fun `decode validates crc and length`() {
        val good = "5a000d00010101000200030004001000afdc".hexToBytes()
        val frame = FrameCodec.decode(good)
        assertEquals(FrameCodec.FLAG_SINGLE, frame.flag)
        assertEquals("010101000200030004001000", frame.data.toHex())

        val badCrc = good.copyOf().also { it[it.size - 1] = 0 }
        assertThrows { FrameCodec.decode(badCrc) }
        assertThrows { FrameCodec.decode(good.copyOf(good.size - 1)) }
        assertThrows { FrameCodec.decode("4b000d00".hexToBytes()) }
    }

    @Test
    fun `reassembles a frame split across notifications`() {
        val frame = "5a000d00010101000200030004001000afdc".hexToBytes()
        val reassembler = FrameReassembler()
        assertTrue(reassembler.feed(frame.copyOfRange(0, 2)).isEmpty())
        assertTrue(reassembler.feed(frame.copyOfRange(2, 10)).isEmpty())
        val events = reassembler.feed(frame.copyOfRange(10, frame.size))
        assertEquals(1, events.size)
        assertEquals("010101000200030004001000", (events[0] as FrameReassembler.Event.Payload).bytes.toHex())
    }

    @Test
    fun `joins slices and handles several frames in one notification`() {
        val payload = ByteArray(300) { it.toByte() }
        val stream = FrameCodec.encode(payload, maxFrame = 64).reduce { a, b -> a + b }
        val reassembler = FrameReassembler()
        val events = stream.toList().chunked(20).flatMap { reassembler.feed(it.toByteArray()) }
        assertEquals(1, events.size)
        assertArrayEquals(payload, (events[0] as FrameReassembler.Event.Payload).bytes)
    }

    @Test
    fun `corrupt input is reported and reassembly recovers`() {
        val reassembler = FrameReassembler()
        val good = FrameCodec.encode(byteArrayOf(1, 1), maxFrame = 255).single()
        val badCrc = good.copyOf().also { it[it.size - 1] = (it[it.size - 1] + 1).toByte() }
        val events = reassembler.feed(byteArrayOf(0x00, 0x11) + badCrc + good)
        assertEquals(3, events.size)
        assertTrue(events[0] is FrameReassembler.Event.Corrupt) // garbage before 0x5A
        assertTrue(events[1] is FrameReassembler.Event.Corrupt) // CRC mismatch
        assertEquals("0101", (events[2] as FrameReassembler.Event.Payload).bytes.toHex())
    }

    @Test
    fun `out of order slice drops the sequence`() {
        val frames = FrameCodec.encode(byteArrayOf(1, 2, 3, 4, 5), maxFrame = 9)
        val reassembler = FrameReassembler()
        reassembler.feed(frames[0])
        val events = reassembler.feed(frames[2])
        assertTrue(events.single() is FrameReassembler.Event.Corrupt)
    }

    private fun assertThrows(block: () -> Unit) {
        try {
            block()
        } catch (_: MalformedPayloadException) {
            return
        }
        throw AssertionError("Expected MalformedPayloadException")
    }
}
