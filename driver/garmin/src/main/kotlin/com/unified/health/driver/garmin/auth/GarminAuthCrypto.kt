package com.unified.health.driver.garmin.auth

import com.unified.health.driver.garmin.codec.Xxtea
import java.util.Random

/**
 * Crypto core for Garmin's app-level auth fallback (`ss2/a.java`, `ss2/c.java`, `ss2/p.java` [V]).
 *
 * The passkey comes from the watch/user, the LTK is distributed by the watch, and the session key is
 * derived from the LTK — no Garmin server secret is involved. See
 * `docs/analysis/GARMIN_AUTH_CRYPTO_ANALYSIS.md`.
 */
internal object GarminAuthCrypto {

    const val KEY_SIZE = 16

    /**
     * `F(passkey, r)` — `ss2/a.a` [V]:
     * `XXTEA( XXTEA(r, passkey) XOR mac16 XOR r , passkey )` where `mac16` is the 6 MAC bytes in
     * reverse order followed by ten zeros.
     */
    fun confirm(passkey: ByteArray, random: ByteArray, mac: String): ByteArray {
        require(passkey.size == KEY_SIZE) { "passkey must be 16 bytes" }
        require(random.size == KEY_SIZE) { "random must be 16 bytes" }
        val inner = Xxtea.encrypt(random, passkey)
        val macBlock = macBlock(mac)
        val mixed = ByteArray(KEY_SIZE) { i -> (inner[i].toInt() xor macBlock[i].toInt() xor random[i].toInt()).toByte() }
        return Xxtea.encrypt(mixed, passkey)
    }

    /** `STK = XXTEA( phoneRandom[0..7] || watchRandom[0..7], passkey )` — `ss2/c.a` [V]. */
    fun deriveStk(passkey: ByteArray, phoneRandom: ByteArray, watchRandom: ByteArray): ByteArray {
        require(passkey.size == KEY_SIZE)
        require(phoneRandom.size >= 8 && watchRandom.size >= 8)
        val block = ByteArray(KEY_SIZE)
        phoneRandom.copyInto(block, 0, 0, 8)
        watchRandom.copyInto(block, 8, 0, 8)
        return Xxtea.encrypt(block, passkey)
    }

    /** `sessionKey = XXTEA( watchDiversifier[0..7] || localRandom[8], ltk )` — message 5108 [V]. */
    fun deriveSessionKey(ltk: ByteArray, diversifier: ByteArray, localRandom: ByteArray): ByteArray {
        require(ltk.size == KEY_SIZE)
        require(diversifier.size >= 8 && localRandom.size >= 8)
        val block = ByteArray(KEY_SIZE)
        diversifier.copyInto(block, 0, 0, 8)
        localRandom.copyInto(block, 8, 0, 8)
        return Xxtea.encrypt(block, ltk)
    }

    /**
     * Message 5109: the payload carries a status byte then a 24-byte blob encrypted with the session
     * key; the first 16 bytes of the decrypted blob must equal the session key [V].
     */
    fun verifySessionKey(sessionKey: ByteArray, payload: ByteArray): Boolean {
        if (payload.size < 25) return false
        val decrypted = Xxtea.decrypt(payload.copyOfRange(1, 25), sessionKey)
        return decrypted.copyOfRange(0, 16).contentEquals(sessionKey)
    }

    /**
     * Message 5111: decrypt the 16-byte blob, take the device IV from bytes 8..11, generate a host
     * seed, and return the ACK plus the active [GarminSecureSession] [V].
     */
    fun openSecureSession(
        sessionKey: ByteArray,
        encrypted: ByteArray,
        random: Random = Random(),
    ): SecureSessionOpen {
        require(sessionKey.size == KEY_SIZE)
        require(encrypted.size >= 16)
        val decrypted = Xxtea.decrypt(encrypted.copyOfRange(0, 16), sessionKey)
        val deviceIv = decrypted.copyOfRange(8, 12)
        val hostSeed = ByteArray(4).also(random::nextBytes)
        val hostRandom = ByteArray(4).also(random::nextBytes)
        val ackBlock = ByteArray(KEY_SIZE)
        ackBlock[0] = decrypted[0]
        hostSeed.copyInto(ackBlock, 8)
        hostRandom.copyInto(ackBlock, 12)
        val ack = Xxtea.encrypt(ackBlock, sessionKey)
        return SecureSessionOpen(
            ack = ack,
            deviceIv = deviceIv,
            session = GarminSecureSession(sessionKey, hostSeed),
        )
    }

    /** `AuthInfo` persisted per MAC (`da2/a.java`, `AuthRegistry`) [V]. */
    data class AuthInfo(val ltk: ByteArray, val ediv: ByteArray, val rand: ByteArray) {
        init {
            require(ltk.size == 16 && ediv.size == 2 && rand.size == 8)
        }
    }

    /** `ss2/p` traffic cipher: `u16 LE(cipherLen)` then XXTEA(counter u32 LE || hostIv[4] || plain). */
    class GarminSecureSession(
        private val sessionKey: ByteArray,
        private val hostIv: ByteArray,
        startCounter: Long = 0,
    ) {
        private var counter: Long = startCounter and 0xFFFFFFFFL

        init {
            require(sessionKey.size == KEY_SIZE)
            require(hostIv.size >= 4)
        }

        fun encrypt(plain: ByteArray): ByteArray {
            val total = plain.size + 8
            val padded = total + (4 - total % 4) // vendor always pads at least 4 bytes when aligned
            val block = ByteArray(padded)
            writeU32Le(block, 0, counter)
            hostIv.copyInto(block, 4, 0, 4)
            plain.copyInto(block, 8)
            val cipher = Xxtea.encrypt(block, sessionKey)
            val out = ByteArray(cipher.size + 2)
            writeU16Le(out, 0, cipher.size + 2)
            cipher.copyInto(out, 2)
            counter = (counter + 1) and 0xFFFFFFFFL
            return out
        }

        /** Test/verification helper: strips the length prefix, decrypts and returns the padded block. */
        fun decrypt(frame: ByteArray): ByteArray {
            require(frame.size >= 2)
            require(readU16Le(frame, 0) == frame.size) { "bad frame length" }
            val block = Xxtea.decrypt(frame.copyOfRange(2, frame.size), sessionKey)
            val packetCounter = readU32Le(block, 0)
            require(packetCounter >= 0) { "bad counter" }
            return block.copyOfRange(8, block.size)
        }

        /**
         * Decrypts one transport frame and trims the XXTEA padding using the inner GFDI length field
         * (`ss2/p` pads with zeroes; the vendor decryptor trims on the GFDI length).
         */
        fun decryptFrame(frame: ByteArray): ByteArray {
            val padded = decrypt(frame)
            require(padded.size >= 2) { "decrypted frame too short" }
            val innerLength = readU16Le(padded, 0)
            require(innerLength in 2..padded.size) { "decrypted GFDI length $innerLength out of range" }
            return padded.copyOf(innerLength)
        }
    }

    data class SecureSessionOpen(val ack: ByteArray, val deviceIv: ByteArray, val session: GarminSecureSession)

    private fun macBlock(mac: String): ByteArray {
        val parts = mac.split(':', '-').filter { it.isNotEmpty() }
        require(parts.size == 6) { "MAC must have six octets" }
        val out = ByteArray(KEY_SIZE)
        for (i in 0 until 6) {
            out[i] = Integer.parseInt(parts[5 - i], 16).toByte()
        }
        return out
    }

    private fun writeU16Le(out: ByteArray, offset: Int, value: Int) {
        out[offset] = (value and 0xFF).toByte()
        out[offset + 1] = ((value ushr 8) and 0xFF).toByte()
    }

    private fun writeU32Le(out: ByteArray, offset: Int, value: Long) {
        for (i in 0 until 4) out[offset + i] = ((value ushr (8 * i)) and 0xFF).toByte()
    }

    private fun readU16Le(data: ByteArray, offset: Int): Int =
        (data[offset].toInt() and 0xFF) or ((data[offset + 1].toInt() and 0xFF) shl 8)

    private fun readU32Le(data: ByteArray, offset: Int): Long {
        var value = 0L
        for (i in 0 until 4) value = value or ((data[offset + i].toLong() and 0xFF) shl (8 * i))
        return value
    }
}
