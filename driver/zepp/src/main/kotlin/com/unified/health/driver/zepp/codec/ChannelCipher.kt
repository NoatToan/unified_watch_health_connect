package com.unified.health.driver.zepp.codec

import com.unified.health.core.ble.protocol.ByteReader
import com.unified.health.core.ble.protocol.MalformedPayloadException
import com.unified.health.core.ble.protocol.buildBytes

/** A channel payload failed to decrypt or verify (bad CRC, replayed nonce…). */
internal class ChannelCryptoException(message: String) : Exception(message)

/**
 * Channel payload encryption after a Zepp OS (module 0x82) session auth. Mirrors
 * `EncryptKeyStore` (key material) and `EncryptApiImpl` (framing), §5.2 step 8 and §5.4 [V]:
 *
 * - `r0` = shared[0..3] (u32 LE) is the nonce we send, `r1` = shared[4..7] the last nonce received,
 *   `sessionKey` = shared[8..23] XOR authKey.
 * - Per packet key = sessionKey with every byte XOR the channel session id.
 * - Plaintext = data ‖ r0 (u32 LE) ‖ CRC32(data ‖ r0) (u32 LE), zero-padded to 16, AES/ECB/NoPadding.
 *
 * Not thread-safe: callers serialize sends, and the receive path runs on a single reader.
 */
internal class ChannelCipher(sharedSecret: ByteArray, authKey: ByteArray) {

    private val sessionKey: ByteArray
    private var localNonce: Long
    private var remoteNonce: Long

    init {
        require(sharedSecret.size >= SHARED_SECRET_SIZE) { "Shared secret must be at least $SHARED_SECRET_SIZE bytes" }
        require(authKey.size == KEY_SIZE) { "Auth key must be $KEY_SIZE bytes" }
        val reader = ByteReader(sharedSecret, end = SHARED_SECRET_SIZE)
        localNonce = reader.u32le()
        remoteNonce = reader.u32le()
        sessionKey = deriveSessionKey(sharedSecret, authKey)
    }

    /** Encrypts [data] for channel session [sessionId] and advances the local nonce. */
    fun encrypt(sessionId: Int, data: ByteArray): ByteArray {
        val nonce = buildBytes(4) { u32le(localNonce) }
        val plain = data + nonce + buildBytes(4) { u32le(crc32(data, nonce)) }
        localNonce = (localNonce + 1) % NONCE_MODULUS
        return AesEcb.encrypt(packetKey(sessionId), zeroPad(plain))
    }

    /**
     * @param totalSize plaintext size announced by the FIRST packet.
     * @throws ChannelCryptoException on a CRC mismatch, an empty payload or a nonce outside the window.
     */
    fun decrypt(sessionId: Int, totalSize: Int, ciphertext: ByteArray): ByteArray {
        if (ciphertext.isEmpty() || ciphertext.size % AesEcb.BLOCK_SIZE != 0) {
            throw ChannelCryptoException("Encrypted payload of ${ciphertext.size} bytes is not block aligned")
        }
        val plain = AesEcb.decrypt(packetKey(sessionId), ciphertext)
        val reader = ByteReader(plain)
        val (data, nonce, crc) = try {
            Triple(reader.bytes(totalSize), reader.u32le(), reader.u32le())
        } catch (e: MalformedPayloadException) {
            throw ChannelCryptoException("Encrypted payload shorter than announced size $totalSize")
        }
        if (data.isEmpty()) throw ChannelCryptoException("Empty encrypted payload")
        if (crc32(data, buildBytes(4) { u32le(nonce) }) != crc) throw ChannelCryptoException("CRC mismatch")
        if (!acceptRemoteNonce(nonce)) throw ChannelCryptoException("Nonce outside the replay window")
        return data
    }

    /**
     * `EncryptKeyStore.validRemoteNOnce` [V]: accepted when `(nonce - r1) mod (2^32 - 1)` is at most
     * [NONCE_WINDOW]; the vendor check also accepts a repeat of the last nonce (difference 0).
     */
    private fun acceptRemoteNonce(nonce: Long): Boolean {
        val distance = ((nonce - remoteNonce) + NONCE_MODULUS) % NONCE_MODULUS
        if (distance > NONCE_WINDOW) return false
        remoteNonce = nonce
        return true
    }

    private fun packetKey(sessionId: Int): ByteArray = ByteArray(KEY_SIZE) { (sessionKey[it].toInt() xor sessionId).toByte() }

    companion object {
        const val KEY_SIZE = 16

        /** r0 (4) + r1 (4) + key material (16). */
        const val SHARED_SECRET_SIZE = 24

        /** nonce u32 + CRC32 u32 appended before padding. */
        const val TRAILER_SIZE = 8

        /** The vendor wraps nonces modulo 2^32 - 1 (`EncryptKeyStore`, [V]). */
        const val NONCE_MODULUS = 0xFFFF_FFFFL

        const val NONCE_WINDOW = 100_000L

        /** sessionKey[i] = shared[8 + i] XOR authKey[i] (`DeviceAuthorizationImpl2.java:135-144`, [V]). */
        fun deriveSessionKey(sharedSecret: ByteArray, authKey: ByteArray): ByteArray {
            require(sharedSecret.size >= SHARED_SECRET_SIZE && authKey.size == KEY_SIZE)
            return ByteArray(KEY_SIZE) { (sharedSecret[8 + it].toInt() xor authKey[it].toInt()).toByte() }
        }
    }
}
