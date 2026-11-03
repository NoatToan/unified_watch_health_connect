package com.unified.health.driver.huawei.codec

import com.unified.health.core.ble.protocol.MalformedPayloadException
import com.unified.health.core.ble.protocol.hexToBytes
import com.unified.health.core.ble.protocol.toHex
import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test
import java.security.SecureRandom
import javax.crypto.Cipher
import javax.crypto.spec.IvParameterSpec
import javax.crypto.spec.SecretKeySpec

class PayloadCipherTest {

    private val key = "000102030405060708090a0b0c0d0e0f".hexToBytes()
    private val clear = "07030100".hexToBytes()

    @Test
    fun `cbc envelope keeps ids in clear and matches AES-CBC of the tlvs`() {
        val zeroRandom = object : SecureRandom() {
            override fun nextBytes(bytes: ByteArray) = bytes.fill(0)
        }
        val cipher = PayloadCipher(key, CipherMode.AES_CBC_PKCS5, IvGenerator(null, zeroRandom))
        val encrypted = cipher.encrypt(clear)

        val expectedCt = Cipher.getInstance("AES/CBC/PKCS5Padding").run {
            init(Cipher.ENCRYPT_MODE, SecretKeySpec(key, "AES"), IvParameterSpec(ByteArray(16)))
            doFinal("0100".hexToBytes())
        }
        assertEquals("0703" + "7c0101" + "7d10" + "00".repeat(16) + "7e10" + expectedCt.toHex(), encrypted.toHex())
        assertTrue(PayloadCipher.isEncrypted(encrypted))
        assertArrayEquals(clear, cipher.decrypt(encrypted))
    }

    @Test
    fun `gcm round trip and tamper detection`() {
        val cipher = PayloadCipher(key, CipherMode.AES_GCM, IvGenerator(null))
        val encrypted = cipher.encrypt(clear)
        assertArrayEquals(clear, cipher.decrypt(encrypted))
        encrypted[encrypted.size - 1] = (encrypted[encrypted.size - 1] + 1).toByte()
        try {
            cipher.decrypt(encrypted)
            throw AssertionError("Tampered GCM payload must not decrypt")
        } catch (_: MalformedPayloadException) {
        }
    }

    @Test
    fun `clear payloads pass through decrypt`() {
        val cipher = PayloadCipher(key, CipherMode.AES_CBC_PKCS5, IvGenerator(null))
        assertFalse(PayloadCipher.isEncrypted(clear))
        assertArrayEquals(clear, cipher.decrypt(clear))
    }

    @Test
    fun `iv counter increments into the last four bytes and wraps to 1`() {
        val zeroRandom = object : SecureRandom() {
            override fun nextBytes(bytes: ByteArray) = bytes.fill(0)
        }
        val generator = IvGenerator(counterSeed = 0xFFFF_FFFEL, random = zeroRandom)
        assertEquals("00".repeat(12) + "ffffffff", generator.next().toHex())
        assertEquals("00".repeat(12) + "00000001", generator.next().toHex())
        assertEquals("00".repeat(12) + "00000000", IvGenerator(null, zeroRandom).next().toHex())
    }
}
