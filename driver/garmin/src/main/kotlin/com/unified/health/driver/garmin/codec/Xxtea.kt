package com.unified.health.driver.garmin.codec

/**
 * XXTEA (Corrected Block TEA) used by Garmin's app-level auth fallback (`ss2/n.java` [V]).
 *
 * Key is a 16-byte value expanded little-endian into four 32-bit words; input length must be a
 * multiple of 4 (the caller pads). Delta is `0x9E3779B9`, rounds are `6 + 52/n`.
 *
 * Verified against the vendor class itself: key `000102…0f`, data `0102…08` →
 * `56f7991fe6946d54` (`ss2/n.c(8, false, data, key)`).
 */
internal object Xxtea {

    private const val DELTA = 0x9E3779B9.toInt()

    fun encrypt(data: ByteArray, key: ByteArray): ByteArray {
        require(data.size % 4 == 0) { "XXTEA input length must be a multiple of 4" }
        require(data.size >= 8) { "XXTEA needs at least two words (the vendor never uses n=1)" }
        if (data.isEmpty()) return data.copyOf()
        val v = toInts(data)
        val k = keyWords(key)
        val n = v.size
        var rounds = 6 + 52 / n
        var sum = 0
        var z = v[n - 1]
        do {
            sum += DELTA
            val e = (sum ushr 2) and 3
            var p = 0
            while (p < n - 1) {
                val y = v[p + 1]
                z = v[p] + mx(sum, y, z, p, e, k)
                v[p] = z
                p++
            }
            val y = v[0]
            z = v[n - 1] + mx(sum, y, z, n - 1, e, k)
            v[n - 1] = z
            rounds--
        } while (rounds > 0)
        return toBytes(v)
    }

    fun decrypt(data: ByteArray, key: ByteArray): ByteArray {
        require(data.size % 4 == 0) { "XXTEA input length must be a multiple of 4" }
        require(data.size >= 8) { "XXTEA needs at least two words (the vendor never uses n=1)" }
        if (data.isEmpty()) return data.copyOf()
        val v = toInts(data)
        val k = keyWords(key)
        val n = v.size
        var rounds = 6 + 52 / n
        var sum = rounds * DELTA
        var y = v[0]
        do {
            val e = (sum ushr 2) and 3
            var p = n - 1
            while (p > 0) {
                val z = v[p - 1]
                v[p] -= mx(sum, y, z, p, e, k)
                y = v[p]
                p--
            }
            val z = v[n - 1]
            v[0] -= mx(sum, y, z, 0, e, k)
            y = v[0]
            sum -= DELTA
            rounds--
        } while (rounds > 0)
        return toBytes(v)
    }

    private fun mx(sum: Int, y: Int, z: Int, p: Int, e: Int, key: IntArray): Int =
        (((z ushr 5) xor (y shl 2)) + ((y ushr 3) xor (z shl 4))) xor
            ((sum xor y) + (key[(p and 3) xor e] xor z))

    private fun toInts(bytes: ByteArray): IntArray {
        val out = IntArray((bytes.size + 3) / 4)
        for (i in bytes.indices) {
            out[i ushr 2] = out[i ushr 2] or ((bytes[i].toInt() and 0xFF) shl ((i and 3) shl 3))
        }
        return out
    }

    private fun toBytes(words: IntArray): ByteArray {
        val out = ByteArray(words.size * 4)
        for (i in out.indices) {
            out[i] = (words[i ushr 2] ushr ((i and 3) shl 3)).toByte()
        }
        return out
    }

    private fun keyWords(key: ByteArray): IntArray {
        // Garmin always uses a 16-byte key (four words); longer keys are legal XXTEA.
        require(key.size >= 16 && key.size % 4 == 0) { "XXTEA key must be >= 16 bytes, multiple of 4" }
        return toInts(key)
    }
}
