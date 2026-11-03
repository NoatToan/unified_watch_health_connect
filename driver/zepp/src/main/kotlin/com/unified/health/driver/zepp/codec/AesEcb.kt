package com.unified.health.driver.zepp.codec

import android.annotation.SuppressLint
import java.util.zip.CRC32
import javax.crypto.Cipher
import javax.crypto.spec.SecretKeySpec

/**
 * AES-128 in ECB mode without padding, the only block cipher mode the protocol uses
 * (`AuthUtilsKt.encrypt` and `EncryptApiImpl`, §5.2 step 6 and §5.4 [V]).
 *
 * ECB is weak in general; it is used here only because the watch requires it.
 */
internal object AesEcb {
    const val BLOCK_SIZE = 16
    private const val TRANSFORMATION = "AES/ECB/NoPadding"

    fun encrypt(key: ByteArray, plaintext: ByteArray): ByteArray = run(Cipher.ENCRYPT_MODE, key, plaintext)

    fun decrypt(key: ByteArray, ciphertext: ByteArray): ByteArray = run(Cipher.DECRYPT_MODE, key, ciphertext)

    // ECB is mandated by the watch firmware; there is no alternative mode to negotiate.
    @SuppressLint("GetInstance")
    private fun run(mode: Int, key: ByteArray, input: ByteArray): ByteArray {
        require(key.size == BLOCK_SIZE) { "AES key must be $BLOCK_SIZE bytes, was ${key.size}" }
        require(input.size % BLOCK_SIZE == 0) { "AES/ECB/NoPadding input must be a multiple of $BLOCK_SIZE bytes, was ${input.size}" }
        val cipher = Cipher.getInstance(TRANSFORMATION)
        cipher.init(mode, SecretKeySpec(key, "AES"))
        return cipher.doFinal(input)
    }
}

/** Standard CRC-32 (`java.util.zip.CRC32`, `CRCUtilsKt.getCRC32`, §5.4 [V]). */
internal fun crc32(vararg parts: ByteArray): Long = CRC32().apply { parts.forEach { update(it) } }.value

/** Zero-pads [data] up to the next multiple of [blockSize] (no-op when already aligned). */
internal fun zeroPad(data: ByteArray, blockSize: Int = AesEcb.BLOCK_SIZE): ByteArray {
    val padded = (data.size + blockSize - 1) / blockSize * blockSize
    return if (padded == data.size) data else data.copyOf(padded)
}
