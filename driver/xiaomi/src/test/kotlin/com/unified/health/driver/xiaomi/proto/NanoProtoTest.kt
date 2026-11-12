package com.unified.health.driver.xiaomi.proto

import com.unified.health.core.ble.protocol.MalformedPayloadException
import com.unified.health.core.ble.protocol.toHex
import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertThrows
import org.junit.Assert.assertTrue
import org.junit.Test

class NanoProtoTest {

    @Test
    fun `varint round-trips single and multi-byte values`() {
        listOf(0L, 1L, 127L, 128L, 300L, 16384L, 0xFFFFFFFFL, Long.MAX_VALUE / 2).forEach { value ->
            val bytes = ProtoWriter().varint(value).toByteArray()
            val decoded = ProtoReader(bytes).readVarint()
            assertEquals("varint round-trip for $value", value, decoded)
        }
    }

    @Test
    fun `a single-byte varint uses exactly one byte`() {
        assertEquals(1, ProtoWriter().varint(5).toByteArray().size)
    }

    @Test
    fun `a 300 value varint uses exactly two bytes, matching the protobuf spec example`() {
        // 300 = 0b1_0010_1100 -> low7=0101100|cont, next=00000010 -> bytes 0xAC 0x02.
        val bytes = ProtoWriter().varint(300).toByteArray()
        assertEquals("ac02", bytes.toHex())
    }

    @Test
    fun `tag encodes fieldNumber and wireType and decodes back`() {
        val bytes = ProtoWriter().tag(fieldNumber = 4, wireType = WireType.LENGTH_DELIMITED).toByteArray()
        val tag = ProtoReader(bytes).readTag()
        assertEquals(4, tag.fieldNumber)
        assertEquals(WireType.LENGTH_DELIMITED, tag.wireType)
    }

    @Test
    fun `tag rejects a non-positive field number`() {
        assertThrows(IllegalArgumentException::class.java) { ProtoWriter().tag(0, WireType.VARINT) }
    }

    @Test
    fun `bytesField and messageField round-trip length-delimited payloads`() {
        val payload = byteArrayOf(1, 2, 3, 4, 5)
        val bytes = ProtoWriter().bytesField(2, payload).toByteArray()
        val reader = ProtoReader(bytes)
        val tag = reader.readTag()
        assertEquals(2, tag.fieldNumber)
        assertEquals(WireType.LENGTH_DELIMITED, tag.wireType)
        assertArrayEquals(payload, reader.readLengthDelimited())
    }

    @Test
    fun `stringField round-trips UTF-8 text`() {
        val bytes = ProtoWriter().stringField(3, "Asia/Ho_Chi_Minh").toByteArray()
        val reader = ProtoReader(bytes)
        reader.readTag()
        assertEquals("Asia/Ho_Chi_Minh", reader.readString())
    }

    @Test
    fun `boolField round-trips true and false`() {
        assertTrue(ProtoReader(ProtoWriter().boolField(1, true).toByteArray()).let { it.readTag(); it.readBool() })
        assertFalse(ProtoReader(ProtoWriter().boolField(1, false).toByteArray()).let { it.readTag(); it.readBool() })
    }

    @Test
    fun `zigzag32 round-trips positive, negative and zero`() {
        listOf(0, 1, -1, 28, -28, Int.MAX_VALUE, Int.MIN_VALUE).forEach { value ->
            val bytes = ProtoWriter().zigzag32Field(1, value).toByteArray()
            val reader = ProtoReader(bytes)
            reader.readTag()
            assertEquals("zigzag round-trip for $value", value, reader.readZigZag32())
        }
    }

    @Test
    fun `zigzag32 of 28 matches the doc's utcOffset15min example (UTC+7)`() {
        // XIAOMI_MIWEAR_DEVICE_PROTOCOL.md timeSync example: raw varint byte is 0x38 (56) for offset 28.
        val bytes = ProtoWriter().zigzag32Field(1, 28).toByteArray()
        assertEquals(0x38, bytes[1].toInt() and 0xFF)
    }

    @Test
    fun `skip tolerates an unknown field between two known ones`() {
        val bytes = ProtoWriter()
            .int32Field(1, 7)
            .bytesField(50, byteArrayOf(0xAA.toByte(), 0xBB.toByte()))
            .int32Field(2, 9)
            .toByteArray()
        val reader = ProtoReader(bytes)
        var first = 0
        var second = 0
        while (reader.hasRemaining) {
            val tag = reader.readTag()
            when (tag.fieldNumber) {
                1 -> first = reader.readInt32()
                2 -> second = reader.readInt32()
                else -> reader.skip(tag.wireType)
            }
        }
        assertEquals(7, first)
        assertEquals(9, second)
    }

    @Test
    fun `varintOrSkip skips a field whose wire type does not match and leaves the target untouched`() {
        val bytes = ProtoWriter().bytesField(1, byteArrayOf(1, 2)).toByteArray()
        val reader = ProtoReader(bytes)
        val tag = reader.readTag()
        var value: Long? = -1 // sentinel: must stay unassigned (not overwritten with null either)
        reader.varintOrSkip(tag)?.let { value = it }
        assertEquals(-1L, value)
        assertFalse(reader.hasRemaining)
    }

    @Test
    fun `readVarint throws on a truncated continuation byte`() {
        assertThrows(MalformedPayloadException::class.java) { ProtoReader(byteArrayOf(0x80.toByte())).readVarint() }
    }

    @Test
    fun `readVarint throws past the 10-byte varint limit`() {
        val malformed = ByteArray(11) { 0x80.toByte() }
        assertThrows(MalformedPayloadException::class.java) { ProtoReader(malformed).readVarint() }
    }

    @Test
    fun `readLengthDelimited throws when the declared length exceeds the buffer`() {
        val bytes = byteArrayOf(0x05, 0x01, 0x02) // says "5 bytes follow" but only 2 are present
        assertThrows(MalformedPayloadException::class.java) { ProtoReader(bytes).readLengthDelimited() }
    }

    @Test
    fun `readTag throws on a zero field number`() {
        assertThrows(MalformedPayloadException::class.java) { ProtoReader(byteArrayOf(0x00)).readTag() }
    }
}
