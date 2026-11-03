package com.unified.health.driver.huawei.codec

/**
 * CRC-16/XMODEM: polynomial 0x1021, init 0x0000, no reflection, no final XOR
 * (HUAWEI_DEVICE_PROTOCOL.md §4.3, [V] `cov.java:8-22`). Check value for "123456789" is 0x31C3.
 */
internal object Crc16Xmodem {

    private val TABLE = IntArray(256) { index ->
        var crc = index shl 8
        repeat(8) { crc = if (crc and 0x8000 != 0) (crc shl 1) xor POLYNOMIAL else crc shl 1 }
        crc and 0xFFFF
    }

    private const val POLYNOMIAL = 0x1021

    fun compute(data: ByteArray, start: Int = 0, end: Int = data.size): Int {
        var crc = 0
        for (i in start until end) {
            crc = ((crc shl 8) xor TABLE[((crc ushr 8) xor data[i].toInt()) and 0xFF]) and 0xFFFF
        }
        return crc
    }
}
