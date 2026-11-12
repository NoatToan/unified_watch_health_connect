package com.unified.health.driver.xiaomi.transport

import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Assert.assertThrows
import org.junit.Test

class XiaomiL0Test {

    @Test
    fun `chunk splits into equal pieces with a shorter tail`() {
        val frame = ByteArray(20) { it.toByte() }
        val chunks = XiaomiL0.chunk(frame, chunkSize = 7)
        assertEquals(listOf(7, 7, 6), chunks.map { it.size })
        assertArrayEquals(frame, chunks.reduce { a, b -> a + b })
    }

    @Test
    fun `chunk returns one piece when the frame already fits`() {
        val frame = byteArrayOf(1, 2, 3)
        assertEquals(1, XiaomiL0.chunk(frame, chunkSize = 50).size)
    }

    @Test
    fun `chunk rejects a non-positive size`() {
        assertThrows(IllegalArgumentException::class.java) { XiaomiL0.chunk(byteArrayOf(1), 0) }
    }

    @Test
    fun `chunk rejects an empty frame`() {
        assertThrows(IllegalArgumentException::class.java) { XiaomiL0.chunk(ByteArray(0), 10) }
    }

    @Test
    fun `reassembles a frame delivered in one notification`() {
        val payload = byteArrayOf(0x10, 0x20, 0x30)
        val frame = L1Frame.encode(L1Frame.TYPE_DATA, seq = 1, payload = payload)
        val frames = XiaomiL0.Reassembler().feed(frame)
        assertEquals(1, frames.size)
        assertArrayEquals(payload, L1Frame.decode(frames[0]).payload)
    }

    @Test
    fun `reassembles a frame split across many small notification chunks`() {
        val payload = ByteArray(50) { it.toByte() }
        val frame = L1Frame.encode(L1Frame.TYPE_DATA, seq = 9, payload = payload)
        val reassembler = XiaomiL0.Reassembler()
        val collected = mutableListOf<ByteArray>()
        XiaomiL0.chunk(frame, chunkSize = 7).forEach { collected += reassembler.feed(it) }
        assertEquals(1, collected.size)
        val decoded = L1Frame.decode(collected[0])
        assertEquals(9, decoded.seq)
        assertArrayEquals(payload, decoded.payload)
    }

    @Test
    fun `delivers two back-to-back frames from a single feed`() {
        val first = L1Frame.encode(L1Frame.TYPE_DATA, seq = 0, payload = byteArrayOf(1))
        val second = L1Frame.encode(L1Frame.TYPE_DATA, seq = 1, payload = byteArrayOf(2, 3))
        val frames = XiaomiL0.Reassembler().feed(first + second)
        assertEquals(2, frames.size)
        assertEquals(0, L1Frame.decode(frames[0]).seq)
        assertEquals(1, L1Frame.decode(frames[1]).seq)
    }

    @Test
    fun `drops junk bytes preceding the magic`() {
        val frame = L1Frame.encode(L1Frame.TYPE_ACK, seq = 3)
        val junk = byteArrayOf(0x00, 0x11, 0x22, 0x44)
        val frames = XiaomiL0.Reassembler().feed(junk + frame)
        assertEquals(1, frames.size)
        assertEquals(3, L1Frame.decode(frames[0]).seq)
    }

    @Test
    fun `recovers a magic split across two feed calls`() {
        val frame = L1Frame.encode(L1Frame.TYPE_DATA, seq = 2, payload = byteArrayOf(0x7A))
        val reassembler = XiaomiL0.Reassembler()
        val first = reassembler.feed(byteArrayOf(0x00) + frame[0]) // junk + first magic byte only
        assertEquals(0, first.size)
        val rest = reassembler.feed(frame.copyOfRange(1, frame.size))
        assertEquals(1, rest.size)
        assertEquals(2, L1Frame.decode(rest[0]).seq)
    }

    @Test
    fun `drops one byte and rescans after a bad CRC instead of getting stuck`() {
        val goodFrame = L1Frame.encode(L1Frame.TYPE_DATA, seq = 5, payload = byteArrayOf(0x01, 0x02, 0x03))
        val corrupted = goodFrame.copyOf()
        corrupted[corrupted.size - 1] = (corrupted[corrupted.size - 1].toInt() xor 0xFF).toByte()
        val nextFrame = L1Frame.encode(L1Frame.TYPE_DATA, seq = 6, payload = byteArrayOf(0x09, 0x08))

        val frames = XiaomiL0.Reassembler().feed(corrupted + nextFrame)

        assertEquals(1, frames.size)
        val decoded = L1Frame.decode(frames[0])
        assertEquals(6, decoded.seq)
        assertArrayEquals(byteArrayOf(0x09, 0x08), decoded.payload)
    }

    @Test
    fun `waits for more data when the frame is not fully buffered yet`() {
        val frame = L1Frame.encode(L1Frame.TYPE_DATA, seq = 1, payload = ByteArray(20))
        val reassembler = XiaomiL0.Reassembler()
        val partial = reassembler.feed(frame.copyOfRange(0, 10))
        assertEquals(0, partial.size)
        val rest = reassembler.feed(frame.copyOfRange(10, frame.size))
        assertEquals(1, rest.size)
    }
}
