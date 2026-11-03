package com.unified.health.driver.huawei.codec

import com.unified.health.core.ble.protocol.MalformedPayloadException
import java.security.GeneralSecurityException
import java.security.SecureRandom
import javax.crypto.Cipher
import javax.crypto.spec.GCMParameterSpec
import javax.crypto.spec.IvParameterSpec
import javax.crypto.spec.SecretKeySpec

/** Payload cipher selected per link (HUAWEI_DEVICE_PROTOCOL.md §6.4). */
internal enum class CipherMode(val transformation: String) {
    /** Default. [V] `cjy.java:197` */
    AES_CBC_PKCS5("AES/CBC/PKCS5Padding"),

    /** HiChain3 links, or link parameter 12 == 1. 128-bit tag, 16-byte IV. [V] `cjy.java:193-195`, `ckg.java:94` */
    AES_GCM("AES/GCM/NoPadding"),
}

/**
 * Produces the 16-byte IV of each encrypted message.
 *
 * [V] `cjy.java:89-112`: the IV is 16 random bytes; when the link has a non-zero base counter, the
 * counter is incremented before each message (wrapping from 0xFFFFFFFF back to 1) and written
 * big-endian into IV bytes 12..15. The counter is seeded from TLV 9 of the 0x010F
 * QueryBtBindStatus response ([V] `cla.java:155-158`), i.e. by the authentication/bind flow.
 * [I] whether the watch rejects an IV whose counter does not increase is unverified; the
 * decrypt path of the app does not check it.
 */
internal class IvGenerator(
    counterSeed: Long?,
    private val random: SecureRandom = SecureRandom(),
) {
    private var counter: Long = counterSeed ?: 0L

    @Synchronized
    fun next(): ByteArray {
        val iv = ByteArray(IV_SIZE).also(random::nextBytes)
        if (counter != 0L) {
            counter = if (counter >= MAX_COUNTER) 1L else counter + 1
            for (i in 0 until 4) iv[12 + i] = (counter ushr (24 - 8 * i)).toByte()
        }
        return iv
    }

    companion object {
        const val IV_SIZE = 16
        private const val MAX_COUNTER = 0xFFFF_FFFFL
    }
}

/**
 * Encrypts/decrypts the TLV part of a [HuaweiCommand] payload with the session work key
 * (HUAWEI_DEVICE_PROTOCOL.md §6.4, [V] `cjy.java:80-161, 256-278, 573-647`). Service and command
 * ids stay in clear; the rest becomes three TLVs:
 * `7C 01 01` (encrypted flag) | `7D len IV` | `7E len ciphertext`.
 */
internal class PayloadCipher(
    key: ByteArray,
    private val mode: CipherMode,
    private val ivGenerator: IvGenerator,
) {
    private val keySpec: SecretKeySpec

    init {
        require(key.size == 16 || key.size == 24 || key.size == 32) { "AES work key must be 16, 24 or 32 bytes, got ${key.size}" }
        keySpec = SecretKeySpec(key.copyOf(), "AES")
    }

    /** @param payload clear `serviceId | commandId | TLV...` */
    fun encrypt(payload: ByteArray): ByteArray {
        require(payload.size >= 2) { "Payload must start with service and command ids" }
        val iv = ivGenerator.next()
        val cipherText = cipher(Cipher.ENCRYPT_MODE, iv).doFinal(payload, 2, payload.size - 2)
        return payload.copyOf(2) + TlvCodec.encode(
            listOf(Tlv(TAG_ENCRYPTED, byteArrayOf(1)), Tlv(TAG_IV, iv), Tlv(TAG_CIPHERTEXT, cipherText)),
        )
    }

    /**
     * @return the clear payload. A payload without `7C = 1` is returned unchanged, matching the app
     *  ([V] `cjy.java:600-601`).
     * @throws MalformedPayloadException when the TLVs are missing or decryption fails.
     */
    fun decrypt(payload: ByteArray): ByteArray {
        if (!isEncrypted(payload)) return payload
        val tlvs = TlvCodec.decode(payload, 2)
        val iv = tlvs.find(TAG_IV)?.value ?: throw MalformedPayloadException("Encrypted payload without IV (0x7D)")
        val cipherText = tlvs.find(TAG_CIPHERTEXT)?.value ?: throw MalformedPayloadException("Encrypted payload without ciphertext (0x7E)")
        if (iv.isEmpty() || cipherText.isEmpty()) throw MalformedPayloadException("Empty IV or ciphertext")
        val clear = try {
            cipher(Cipher.DECRYPT_MODE, iv).doFinal(cipherText)
        } catch (e: GeneralSecurityException) {
            throw MalformedPayloadException("Payload decryption failed (${e.javaClass.simpleName})")
        }
        return payload.copyOf(2) + clear
    }

    private fun cipher(opMode: Int, iv: ByteArray): Cipher = Cipher.getInstance(mode.transformation).apply {
        val params = when (mode) {
            CipherMode.AES_CBC_PKCS5 -> IvParameterSpec(iv)
            CipherMode.AES_GCM -> GCMParameterSpec(GCM_TAG_BITS, iv)
        }
        init(opMode, keySpec, params)
    }

    companion object {
        const val TAG_ENCRYPTED = 0x7C
        const val TAG_IV = 0x7D
        const val TAG_CIPHERTEXT = 0x7E
        private const val GCM_TAG_BITS = 128

        /** True when the payload's TLVs start the encrypted envelope (`7C` with value 1). */
        fun isEncrypted(payload: ByteArray): Boolean {
            if (payload.size < 5) return false
            val tlvs = try {
                TlvCodec.decode(payload, 2)
            } catch (_: MalformedPayloadException) {
                return false
            }
            val flag = tlvs.find(TAG_ENCRYPTED)?.value ?: return false
            return flag.size == 1 && flag[0].toInt() == 1
        }
    }
}
