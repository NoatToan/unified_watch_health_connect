package com.unified.health.driver.xiaomi.proto

import com.unified.health.core.ble.protocol.ByteReader
import com.unified.health.core.ble.protocol.ByteWriter
import com.unified.health.core.ble.protocol.MalformedPayloadException

/**
 * Minimal protobuf wire-format reader/writer for the MiWear envelope messages (`s7r`/`p90`/`t7r`/
 * `q90`/`txo`/`ur9`/...). This is not a general-purpose protobuf library: only varint,
 * length-delimited and the two fixed-width wire types (needed to *skip* unknown fields) are
 * supported -- exactly what protocol §6/§7/§9 use. Field layouts were cross-checked byte-for-byte
 * against `docs/protocols/XIAOMI_TEST_VECTORS.json` (see the codec tests).
 *
 * Every malformed/truncated input throws [MalformedPayloadException] instead of crashing
 * (engineering rule: a corrupt frame is a logged protocol error, never a crash).
 */
internal object WireType {
    const val VARINT = 0
    const val FIXED64 = 1
    const val LENGTH_DELIMITED = 2
    const val FIXED32 = 5
}

internal data class ProtoTag(val fieldNumber: Int, val wireType: Int)

/** Sequential protobuf reader over one message's bytes. */
internal class ProtoReader(data: ByteArray) {
    private val reader = ByteReader(data)

    val hasRemaining: Boolean get() = reader.hasRemaining

    /** Reads one `(fieldNumber, wireType)` tag (`tag = fieldNumber << 3 | wireType`). */
    fun readTag(): ProtoTag {
        val raw = readVarint()
        val fieldNumber = (raw ushr 3).toInt()
        val wireType = (raw and 0x7L).toInt()
        if (fieldNumber <= 0) throw MalformedPayloadException("Invalid protobuf field number $fieldNumber")
        return ProtoTag(fieldNumber, wireType)
    }

    /** Reads a base-128 varint (protobuf spec); up to 10 bytes, enough for a full 64-bit value. */
    fun readVarint(): Long {
        var result = 0L
        var shift = 0
        var bytesRead = 0
        while (true) {
            if (bytesRead >= MAX_VARINT_BYTES) throw MalformedPayloadException("Varint longer than $MAX_VARINT_BYTES bytes")
            val b = reader.u8()
            bytesRead++
            result = result or ((b.toLong() and 0x7F) shl shift)
            if (b and 0x80 == 0) return result
            shift += 7
        }
    }

    fun readInt32(): Int = readVarint().toInt()

    fun readBool(): Boolean = readVarint() != 0L

    /** Zigzag-decodes a 32-bit `sint32` varint (protocol §9.2 `v64` offsets [V]). */
    fun readZigZag32(): Int {
        val raw = readVarint()
        return ((raw ushr 1) xor -(raw and 1)).toInt()
    }

    fun readLengthDelimited(): ByteArray {
        val length = readVarint()
        if (length < 0 || length > MAX_LENGTH) throw MalformedPayloadException("Invalid protobuf length $length")
        return reader.bytes(length.toInt())
    }

    fun readString(): String = readLengthDelimited().toString(Charsets.UTF_8)

    /** Skips the value belonging to a tag of [wireType] (unknown-field tolerance). */
    fun skip(wireType: Int) {
        when (wireType) {
            WireType.VARINT -> readVarint()
            WireType.LENGTH_DELIMITED -> readLengthDelimited()
            WireType.FIXED32 -> reader.bytes(4)
            WireType.FIXED64 -> reader.bytes(8)
            else -> throw MalformedPayloadException("Unsupported protobuf wire type $wireType")
        }
    }

    private companion object {
        /** Standard protobuf cap: 10 bytes * 7 bits comfortably covers 64 bits. */
        const val MAX_VARINT_BYTES = 10

        /** Guards against a corrupt length field; every MiWear payload here is at most a few KB. */
        const val MAX_LENGTH = 1 shl 20
    }
}

/** Sequential protobuf writer. Callers decide which fields to emit (no proto3 default-omission). */
internal class ProtoWriter {
    private val writer = ByteWriter()

    fun tag(fieldNumber: Int, wireType: Int) = apply {
        require(fieldNumber > 0) { "Field number must be positive, was $fieldNumber" }
        varint((fieldNumber.toLong() shl 3) or wireType.toLong())
    }

    fun varint(value: Long) = apply {
        var v = value
        while (true) {
            val b = (v and 0x7F).toInt()
            v = v ushr 7
            if (v == 0L) {
                writer.u8(b)
                return@apply
            }
            writer.u8(b or 0x80)
        }
    }

    fun int32Field(fieldNumber: Int, value: Int) = apply {
        tag(fieldNumber, WireType.VARINT)
        varint(value.toLong() and 0xFFFFFFFFL)
    }

    fun boolField(fieldNumber: Int, value: Boolean) = apply {
        tag(fieldNumber, WireType.VARINT)
        varint(if (value) 1L else 0L)
    }

    /** Zigzag-encodes a signed 32-bit value (protocol §9.2 `v64` offsets [V]). */
    fun zigzag32Field(fieldNumber: Int, value: Int) = apply {
        tag(fieldNumber, WireType.VARINT)
        varint(((value shl 1) xor (value shr 31)).toLong() and 0xFFFFFFFFL)
    }

    /** Little-endian 4-byte `fixed32`/`float` wire value (protocol §6.1 `dc0`/§7.2 `cc0` field 2 [V]). */
    fun fixed32Field(fieldNumber: Int, bits: Int) = apply {
        tag(fieldNumber, WireType.FIXED32)
        writer.u8(bits and 0xFF)
        writer.u8((bits ushr 8) and 0xFF)
        writer.u8((bits ushr 16) and 0xFF)
        writer.u8((bits ushr 24) and 0xFF)
    }

    /** `dc0`/`cc0` field 2, `SDK_INT` as a protobuf `float` (protocol §6.1/§7.2 [V]). */
    fun floatField(fieldNumber: Int, value: Float) = fixed32Field(fieldNumber, value.toRawBits())

    fun bytesField(fieldNumber: Int, value: ByteArray) = apply {
        tag(fieldNumber, WireType.LENGTH_DELIMITED)
        varint(value.size.toLong())
        writer.bytes(value)
    }

    fun stringField(fieldNumber: Int, value: String) = bytesField(fieldNumber, value.toByteArray(Charsets.UTF_8))

    fun messageField(fieldNumber: Int, message: ByteArray) = bytesField(fieldNumber, message)

    fun toByteArray(): ByteArray = writer.toByteArray()
}

/**
 * Reads [tag]'s value as a varint only if its wire type actually matches, otherwise skips it.
 * Every message codec in this package uses this (and [lengthDelimitedOrSkip]) instead of calling
 * `readVarint`/`readLengthDelimited` directly off a field-number `when`, so a field whose wire
 * type does not match what we expect is tolerated as an unknown/foreign field (protobuf's own
 * forward-compatibility rule) rather than desynchronising the rest of the message.
 */
internal fun ProtoReader.varintOrSkip(tag: ProtoTag): Long? =
    if (tag.wireType == WireType.VARINT) readVarint() else { skip(tag.wireType); null }

/** See [varintOrSkip]; the length-delimited counterpart (submessages, strings, bytes). */
internal fun ProtoReader.lengthDelimitedOrSkip(tag: ProtoTag): ByteArray? =
    if (tag.wireType == WireType.LENGTH_DELIMITED) readLengthDelimited() else { skip(tag.wireType); null }

/** Zigzag-decodes a raw varint already read via [varintOrSkip] (protocol §9.2 `v64` offsets [V]). */
internal fun zigzagDecode32(raw: Long): Int = ((raw ushr 1) xor -(raw and 1)).toInt()

