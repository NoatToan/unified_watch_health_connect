package com.unified.health.driver.huawei.codec

import com.unified.health.core.ble.protocol.ByteReader
import com.unified.health.core.ble.protocol.ByteWriter
import com.unified.health.core.ble.protocol.MalformedPayloadException
import com.unified.health.core.ble.protocol.toHex

/**
 * One Huawei TLV (HUAWEI_DEVICE_PROTOCOL.md §4.4): a one-byte tag, a base-128 varint length and
 * the value. A tag with bit 0x80 set (e.g. 0x81) is a "father" TLV whose value is itself a TLV
 * list ([V] `cqe.java:37-38`, `lxp.java:181`); read it with [children].
 */
internal class Tlv(val tag: Int, val value: ByteArray = EMPTY) {

    init {
        require(tag in 0..0xFF) { "TLV tag must fit in one byte: $tag" }
    }

    val isNested: Boolean get() = tag and NESTED_BIT != 0

    /** Parses [value] as a nested TLV list. Throws [MalformedPayloadException] when it is not one. */
    fun children(): List<Tlv> = TlvCodec.decode(value)

    /** Value as an unsigned big-endian integer (1..4 bytes), the way the app reads numeric TLVs ([V] `cpb.a`). */
    fun uint(): Long {
        if (value.isEmpty() || value.size > 4) throw MalformedPayloadException("TLV 0x%02x: ${value.size}-byte value is not a uint".format(tag))
        return value.fold(0L) { acc, b -> (acc shl 8) or (b.toLong() and 0xFF) }
    }

    fun int(): Int = uint().toInt()

    override fun equals(other: Any?): Boolean = other is Tlv && other.tag == tag && other.value.contentEquals(value)

    override fun hashCode(): Int = 31 * tag + value.contentHashCode()

    override fun toString(): String = "Tlv(0x%02x, %s)".format(tag, value.toHex())

    companion object {
        const val NESTED_BIT = 0x80
        private val EMPTY = ByteArray(0)

        fun u8(tag: Int, value: Int) = Tlv(tag, byteArrayOf(value.toByte()))

        fun u16(tag: Int, value: Int) = Tlv(tag, ByteWriter(2).u16be(value).toByteArray())

        fun u32(tag: Int, value: Long) = Tlv(tag, ByteWriter(4).u32be(value).toByteArray())

        fun nested(tag: Int, children: List<Tlv>): Tlv {
            require(tag and NESTED_BIT != 0) { "Nested TLV tag must have bit 0x80 set: $tag" }
            return Tlv(tag, TlvCodec.encode(children))
        }
    }
}

internal fun List<Tlv>.find(tag: Int): Tlv? = firstOrNull { it.tag == tag }

/** Encoding/decoding of TLV lists; pure and allocation-light. */
internal object TlvCodec {

    /** Largest length a 3-byte varint can carry ([V] `cph.java:132-143`). */
    const val MAX_LENGTH = (1 shl 21) - 1

    private const val MAX_LENGTH_BYTES = 3

    /** Base-128 big-endian varint: every byte but the last has bit 0x80 set. */
    fun encodeLength(length: Int): ByteArray = when {
        length < 0 || length > MAX_LENGTH -> throw IllegalArgumentException("TLV length out of range: $length")
        length < 0x80 -> byteArrayOf(length.toByte())
        length < 0x4000 -> byteArrayOf(((length ushr 7) or 0x80).toByte(), (length and 0x7F).toByte())
        else -> byteArrayOf(
            ((length ushr 14) or 0x80).toByte(),
            (((length ushr 7) and 0x7F) or 0x80).toByte(),
            (length and 0x7F).toByte(),
        )
    }

    fun decodeLength(reader: ByteReader): Int {
        var length = 0
        repeat(MAX_LENGTH_BYTES) {
            val b = reader.u8()
            length = (length shl 7) or (b and 0x7F)
            if (b and 0x80 == 0) return length
        }
        throw MalformedPayloadException("TLV length varint longer than $MAX_LENGTH_BYTES bytes")
    }

    fun encode(tlvs: List<Tlv>): ByteArray = ByteWriter(tlvs.sumOf { it.value.size + 4 }).apply {
        for (tlv in tlvs) {
            u8(tlv.tag)
            bytes(encodeLength(tlv.value.size))
            bytes(tlv.value)
        }
    }.toByteArray()

    /** Decodes the TLV list in `data[start, end)`. Truncated or overlong input throws [MalformedPayloadException]. */
    fun decode(data: ByteArray, start: Int = 0, end: Int = data.size): List<Tlv> {
        val reader = ByteReader(data, start, end)
        val out = ArrayList<Tlv>()
        while (reader.hasRemaining) {
            val tag = reader.u8()
            val length = decodeLength(reader)
            out += Tlv(tag, reader.bytes(length))
        }
        return out
    }
}
