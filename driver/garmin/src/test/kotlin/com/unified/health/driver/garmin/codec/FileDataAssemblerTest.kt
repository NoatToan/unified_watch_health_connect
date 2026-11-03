package com.unified.health.driver.garmin.codec

import com.unified.health.core.ble.protocol.buildBytes
import com.unified.health.core.ble.protocol.toHex
import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Test

class FileDataAssemblerTest {

    private val file = ByteArray(20) { it.toByte() }
    private val crcAfterFirst = GarminCrc16.compute(file, 0, 12)
    private val crcAfterAll = GarminCrc16.compute(file)

    private fun chunk(offset: Int, end: Int, crc: Int) = buildBytes {
        u8(0)
        u16le(crc)
        u32le(offset.toLong())
        bytes(file.copyOfRange(offset, end))
    }

    @Test
    fun `assembles chunks with a running crc`() {
        val assembler = FileDataAssembler()
        assertEquals("00" + "0c000000", assembler.accept(chunk(0, 12, crcAfterFirst)).toHex())
        assembler.expect(20)
        assertFalse(assembler.isComplete)
        assertEquals("00" + "14000000", assembler.accept(chunk(12, 20, crcAfterAll)).toHex())
        assertTrue(assembler.isComplete)
        assertArrayEquals(file, assembler.bytes())
    }

    @Test
    fun `duplicate packet is acknowledged with the current offset`() {
        val assembler = FileDataAssembler().apply { expect(20) }
        assembler.accept(chunk(0, 12, crcAfterFirst))
        assertEquals("00" + "0c000000", assembler.accept(chunk(0, 12, crcAfterFirst)).toHex())
        assertEquals(12L, assembler.receivedBytes)
    }

    @Test
    fun `offset gap reports offset mismatch then aborts after three`() {
        val assembler = FileDataAssembler().apply { expect(20) }
        repeat(FileDataAssembler.MAX_INVALID_PACKETS) {
            assertEquals("04" + "00000000", assembler.accept(chunk(12, 20, crcAfterAll)).toHex())
        }
        assertEquals("02" + "00000000", assembler.accept(chunk(12, 20, crcAfterAll)).toHex())
        assertNotNull(assembler.failure)
    }

    @Test
    fun `crc mismatch aborts the transfer`() {
        val assembler = FileDataAssembler().apply { expect(20) }
        assertEquals("03" + "00000000", assembler.accept(chunk(0, 12, crcAfterFirst xor 1)).toHex())
        assertNotNull(assembler.failure)
        assertFalse(assembler.isComplete)
    }

    @Test
    fun `malformed and oversized input fail`() {
        assertEquals("02", FileDataAssembler().apply { accept(byteArrayOf(0, 1)) }.accept(chunk(0, 12, crcAfterFirst)).toHex().take(2))
        val small = FileDataAssembler().apply { expect(5) }
        small.accept(chunk(0, 12, crcAfterFirst))
        assertNotNull(small.failure)
        assertNotNull(FileDataAssembler(maxSize = 10).apply { expect(20) }.failure)
    }

    @Test
    fun `empty file is complete immediately`() {
        assertTrue(FileDataAssembler().apply { expect(0) }.isComplete)
    }
}
