package com.unified.health.driver.xiaomi.transport

import com.unified.health.core.ble.protocol.MalformedPayloadException
import com.unified.health.core.ble.protocol.bytesOf
import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Assert.fail
import org.junit.Test

class XiaomiFitnessFileReassemblerTest {

    /** `u16 LE totalSegments, u16 LE sequence, segmentData` (protocol §9.4 [V]). */
    private fun segment(total: Int, sequence: Int, vararg data: Int): ByteArray =
        byteArrayOf(total.toByte(), (total ushr 8).toByte(), sequence.toByte(), (sequence ushr 8).toByte()) + bytesOf(*data)

    @Test
    fun `a single segment completes immediately`() {
        val reassembler = XiaomiFitnessFileReassembler()
        val merged = reassembler.feed(segment(total = 1, sequence = 1, 1, 2, 3))
        assertArrayEquals(bytesOf(1, 2, 3), merged)
    }

    @Test
    fun `multiple segments are concatenated in sequence order`() {
        val reassembler = XiaomiFitnessFileReassembler()
        assertNull(reassembler.feed(segment(total = 3, sequence = 1, 1, 2)))
        assertNull(reassembler.feed(segment(total = 3, sequence = 2, 3, 4)))
        val merged = reassembler.feed(segment(total = 3, sequence = 3, 5, 6))
        assertArrayEquals(bytesOf(1, 2, 3, 4, 5, 6), merged)
    }

    @Test
    fun `an out-of-order sequence is rejected`() {
        val reassembler = XiaomiFitnessFileReassembler()
        reassembler.feed(segment(total = 3, sequence = 1, 1))
        try {
            reassembler.feed(segment(total = 3, sequence = 3, 2))
            fail("expected MalformedPayloadException")
        } catch (e: MalformedPayloadException) {
            assertTrue(e.message!!.contains("out of order"))
        }
    }

    @Test
    fun `totalSegments changing mid-transfer is rejected`() {
        val reassembler = XiaomiFitnessFileReassembler()
        reassembler.feed(segment(total = 3, sequence = 1, 1))
        try {
            reassembler.feed(segment(total = 5, sequence = 2, 2))
            fail("expected MalformedPayloadException")
        } catch (e: MalformedPayloadException) {
            assertTrue(e.message!!.contains("out of order"))
        }
    }

    @Test
    fun `a packet shorter than the 4-byte header is rejected`() {
        val reassembler = XiaomiFitnessFileReassembler()
        try {
            reassembler.feed(byteArrayOf(1, 2, 3))
            fail("expected MalformedPayloadException")
        } catch (e: MalformedPayloadException) {
            assertTrue(e.message!!.contains("header"))
        }
    }
}
