package com.unified.health.core.ble.protocol

/**
 * Sequential reader over a byte array. Every read is bounds-checked and throws
 * [MalformedPayloadException] instead of an index exception, so decoders can treat a short or
 * corrupt frame as a protocol error.
 */
class ByteReader(private val data: ByteArray, start: Int = 0, end: Int = data.size) {
    private val limit = end
    var position: Int = start
        private set

    val remaining: Int get() = limit - position
    val hasRemaining: Boolean get() = remaining > 0

    private fun need(count: Int) {
        if (count > remaining) throw MalformedPayloadException("Need $count bytes at offset $position, only $remaining left")
    }

    fun u8(): Int { need(1); return data[position++].toInt() and 0xFF }

    fun s8(): Int { need(1); return data[position++].toInt() }

    fun u16le(): Int = u8() or (u8() shl 8)

    fun u16be(): Int = (u8() shl 8) or u8()

    fun s16le(): Int = u16le().toShort().toInt()

    fun u32le(): Long = u16le().toLong() or (u16le().toLong() shl 16)

    fun u32be(): Long = (u16be().toLong() shl 16) or u16be().toLong()

    fun s32le(): Int = u32le().toInt()

    fun u64le(): Long = u32le() or (u32le() shl 32)

    fun bytes(count: Int): ByteArray { need(count); return data.copyOfRange(position, position + count).also { position += count } }

    fun rest(): ByteArray = bytes(remaining)

    fun skip(count: Int) { need(count); position += count }

    /** String prefixed by a one-byte length. */
    fun string8(): String = String(bytes(u8()), Charsets.UTF_8)
}

class MalformedPayloadException(message: String) : IllegalArgumentException(message)

fun ByteArray.toHex(): String = joinToString("") { "%02x".format(it) }

/** Parses hex with optional `0x` prefix and whitespace/colon separators. */
fun String.hexToBytes(): ByteArray {
    val clean = trim().removePrefix("0x").removePrefix("0X").filterNot { it.isWhitespace() || it == ':' }
    require(clean.length % 2 == 0) { "Hex string must have an even number of digits" }
    return ByteArray(clean.length / 2) { i -> clean.substring(i * 2, i * 2 + 2).toInt(16).toByte() }
}

fun bytesOf(vararg values: Int): ByteArray = ByteArray(values.size) { values[it].toByte() }
