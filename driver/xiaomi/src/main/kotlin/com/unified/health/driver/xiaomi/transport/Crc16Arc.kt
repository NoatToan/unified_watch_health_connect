package com.unified.health.driver.xiaomi.transport

/**
 * CRC-16/ARC: poly `0x8005` normal / `0xA001` reflected, init `0x0000`, refin/refout, xorout
 * `0x0000`. Computed over the L1 payload only -- never the 8-byte header (protocol §3.1 [V],
 * matches `CRCUtil.TABLE_16`).
 *
 * Deliberately isolated in its own file: this is a checksum, not a cryptographic primitive, so the
 * agent implementing session encryption (HKDF/HMAC/AES-CCM/AES-CTR) never needs to open it.
 */
internal object Crc16Arc {
    private val TABLE = IntArray(256).also { table ->
        for (i in table.indices) {
            var crc = i
            repeat(8) {
                crc = if (crc and 1 != 0) (crc ushr 1) xor 0xA001 else crc ushr 1
            }
            table[i] = crc and 0xFFFF
        }
    }

    init {
        // Protocol §3.1 [V]: "matches CRCUtil.TABLE_16, table[1]=0xC0C1". A cheap one-time guard
        // against a future edit silently breaking the table generation below.
        check(TABLE[1] == 0xC0C1) { "CRC-16/ARC table is wrong: table[1] = 0x${TABLE[1].toString(16)}" }
    }

    /** `crc = 0; for byte b in data: crc = table[(crc ^ b) & 0xFF] ^ (crc >> 8)` (protocol §3.1 [V]). */
    fun compute(data: ByteArray, offset: Int = 0, length: Int = data.size - offset): Int {
        require(offset >= 0 && length >= 0 && offset + length <= data.size) {
            "Invalid range offset=$offset length=$length for ${data.size} bytes"
        }
        var crc = 0
        for (i in offset until offset + length) {
            val b = data[i].toInt() and 0xFF
            crc = TABLE[(crc xor b) and 0xFF] xor (crc ushr 8)
        }
        return crc and 0xFFFF
    }
}
