package com.unified.health.core.demo.virtual.huawei

import java.io.ByteArrayOutputStream

/**
 * A from-scratch, minimal re-implementation of the wire shapes described in
 * `docs/protocols/HUAWEI_DEVICE_PROTOCOL.md` §4 (0x5A framing, CRC-16/XMODEM, TLV) — enough for
 * [HuaweiVirtualGattClient] to hold a clear-text conversation with the real `:driver:huawei`
 * transport on the vendor's `authenticVersion == 0` branch. Deliberately independent of
 * `:driver:huawei`'s own codec (which is `internal` to that module and not meant to be reused by a
 * test double): CRC-16/XMODEM is a public, vendor-neutral algorithm, not a vendor secret.
 *
 * Only single (unsliced) 0x5A frames are produced and understood: every request/reply exchanged
 * with the simulator is a few dozen bytes, far under the generous `maxFrame` the simulator
 * advertises during link negotiation, so the driver never needs the slice-flag (0x01/0x02/0x03)
 * layer. The raw GATT write/notify size (ATT MTU − 3) is still small by default, so a byte-stream
 * reassembler is still required on both sides.
 */
internal object HuaweiWireCodec {
    const val MAGIC = 0x5A

    fun u16(value: Int): ByteArray = byteArrayOf((value ushr 8).toByte(), value.toByte())

    /** Wraps `serviceId|commandId|TLVs` into one single-frame 0x5A message, ready to chunk onto the wire. */
    fun wrapFrame(payload: ByteArray): ByteArray {
        val head = ByteArrayOutputStream(payload.size + 6)
        head.write(MAGIC)
        val length = payload.size + 1 // +1 for the flag byte, matching the real frame's length field
        head.write((length ushr 8) and 0xFF)
        head.write(length and 0xFF)
        head.write(FLAG_SINGLE)
        head.write(payload)
        val withoutCrc = head.toByteArray()
        val crc = Crc16Xmodem.compute(withoutCrc)
        return withoutCrc + byteArrayOf((crc ushr 8).toByte(), crc.toByte())
    }

    /** Validates magic/length/CRC and strips the envelope of a single (non-sliced) frame, or null. */
    fun unwrapSingleFrame(frame: ByteArray): ByteArray? {
        if (frame.size < 7 || (frame[0].toInt() and 0xFF) != MAGIC) return null
        val length = ((frame[1].toInt() and 0xFF) shl 8) or (frame[2].toInt() and 0xFF)
        if (length + 5 != frame.size) return null
        val expected = Crc16Xmodem.compute(frame, frame.size - 2)
        val actual = ((frame[frame.size - 2].toInt() and 0xFF) shl 8) or (frame[frame.size - 1].toInt() and 0xFF)
        if (expected != actual) return null
        val flag = frame[3].toInt() and 0x03
        return if (flag == FLAG_SINGLE) frame.copyOfRange(4, frame.size - 2) else null // slicing unsupported, see class doc
    }

    private const val FLAG_SINGLE = 0
}

/** CRC-16/XMODEM: poly 0x1021, init 0x0000, no reflect, no final XOR. Same standard algorithm the real driver uses, reimplemented independently. */
internal object Crc16Xmodem {
    private const val POLYNOMIAL = 0x1021
    private val TABLE = IntArray(256) { index ->
        var crc = index shl 8
        repeat(8) { crc = if (crc and 0x8000 != 0) (crc shl 1) xor POLYNOMIAL else crc shl 1 }
        crc and 0xFFFF
    }

    fun compute(data: ByteArray, end: Int = data.size): Int {
        var crc = 0
        for (i in 0 until end) crc = ((crc shl 8) xor TABLE[((crc ushr 8) xor data[i].toInt()) and 0xFF]) and 0xFFFF
        return crc
    }
}

/** One TLV: a one-byte tag, a base-128 varint length, the value. */
internal class HuaweiSimTlv(val tag: Int, val value: ByteArray = ByteArray(0))

internal object HuaweiSimTlvCodec {
    fun encode(tlvs: List<HuaweiSimTlv>): ByteArray {
        val out = ByteArrayOutputStream()
        for (tlv in tlvs) {
            out.write(tlv.tag)
            encodeLength(tlv.value.size, out)
            out.write(tlv.value)
        }
        return out.toByteArray()
    }

    /** Decodes the TLV list in `data[start, data.size)`. */
    fun decode(data: ByteArray, start: Int): List<HuaweiSimTlv> {
        val out = mutableListOf<HuaweiSimTlv>()
        var i = start
        while (i < data.size) {
            val tag = data[i].toInt() and 0xFF
            i++
            var length = 0
            while (true) {
                val b = data[i].toInt() and 0xFF
                i++
                length = (length shl 7) or (b and 0x7F)
                if (b and 0x80 == 0) break
            }
            out += HuaweiSimTlv(tag, data.copyOfRange(i, i + length))
            i += length
        }
        return out
    }

    private fun encodeLength(length: Int, out: ByteArrayOutputStream) {
        require(length < 0x4000) { "Simulator replies are always short" }
        if (length < 0x80) {
            out.write(length)
        } else {
            out.write((length ushr 7) or 0x80)
            out.write(length and 0x7F)
        }
    }
}

internal fun List<HuaweiSimTlv>.findTag(tag: Int): HuaweiSimTlv? = firstOrNull { it.tag == tag }
