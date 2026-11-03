package com.unified.health.driver.garmin.codec

/**
 * CRC-16 used by GFDI frames, file transfers and FIT files: the FIT/ANSI CRC (reflected polynomial
 * 0xA001) computed with Garmin's nibble table, seed 0 (§3.4.3 [V], `bs2/q4.java:11`).
 *
 * Equivalent to CRC-16/ARC, whose standard check value for `"123456789"` is `0xBB3D`.
 */
internal object GarminCrc16 {

    private val TABLE = intArrayOf(
        0x0000, 0xCC01, 0xD801, 0x1400, 0xF001, 0x3C00, 0x2800, 0xE401,
        0xA001, 0x6C00, 0x7800, 0xB401, 0x5000, 0x9C01, 0x8801, 0x4400,
    )

    /** Feeds one byte into [crc] and returns the new value. */
    fun update(crc: Int, byte: Int): Int {
        var c = ((crc ushr 4) and 0x0FFF) xor TABLE[crc and 0xF] xor TABLE[byte and 0xF]
        c = TABLE[(byte ushr 4) and 0xF] xor ((c ushr 4) and 0x0FFF) xor TABLE[c and 0xF]
        return c and 0xFFFF
    }

    fun compute(data: ByteArray, from: Int = 0, to: Int = data.size, seed: Int = 0): Int {
        var crc = seed
        for (i in from until to) crc = update(crc, data[i].toInt())
        return crc
    }
}
