package com.unified.health.core.ble.protocol

import java.io.ByteArrayOutputStream

/** Builds binary payloads. Endianness is chosen per call because vendors mix them. */
class ByteWriter(initialCapacity: Int = 32) {
    private val out = ByteArrayOutputStream(initialCapacity)

    val size: Int get() = out.size()

    fun u8(value: Int) = apply { out.write(value and 0xFF) }

    fun u16le(value: Int) = apply { u8(value); u8(value ushr 8) }

    fun u16be(value: Int) = apply { u8(value ushr 8); u8(value) }

    fun u32le(value: Long) = apply { u16le((value and 0xFFFF).toInt()); u16le(((value ushr 16) and 0xFFFF).toInt()) }

    fun u32be(value: Long) = apply { u16be(((value ushr 16) and 0xFFFF).toInt()); u16be((value and 0xFFFF).toInt()) }

    fun u64le(value: Long) = apply { u32le(value and 0xFFFF_FFFFL); u32le(value ushr 32) }

    fun bytes(value: ByteArray) = apply { out.write(value) }

    /** UTF-8 string prefixed by a one-byte length (truncated to 255 bytes). */
    fun string8(value: String) = apply {
        val encoded = value.toByteArray(Charsets.UTF_8).let { if (it.size > 255) it.copyOf(255) else it }
        u8(encoded.size)
        bytes(encoded)
    }

    fun toByteArray(): ByteArray = out.toByteArray()
}

inline fun buildBytes(capacity: Int = 32, block: ByteWriter.() -> Unit): ByteArray =
    ByteWriter(capacity).apply(block).toByteArray()
