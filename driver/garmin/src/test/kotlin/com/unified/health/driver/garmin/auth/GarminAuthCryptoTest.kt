package com.unified.health.driver.garmin.auth

import com.unified.health.core.ble.protocol.hexToBytes
import com.unified.health.core.ble.protocol.toHex
import com.unified.health.driver.garmin.codec.Xxtea
import java.util.Random
import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class GarminAuthCryptoTest {

    private val passkey = "000102030405060708090a0b0c0d0e0f".hexToBytes()

    @Test
    fun `confirm matches the vendor ss2 a vector`() {
        val random = "101112131415161718191a1b1c1d1e1f".hexToBytes()
        assertEquals(
            "17932ffbee7d6adccd2fa8bd4b6ae9ab",
            GarminAuthCrypto.confirm(passkey, random, "AA:BB:CC:DD:EE:FF").toHex(),
        )
    }

    @Test
    fun `stk matches the vendor block construction`() {
        val phone = "2021222324252627".hexToBytes()
        val watch = "3031323334353637".hexToBytes()
        assertEquals(
            "e5a98afa29ef7248547d8afc456953d1",
            GarminAuthCrypto.deriveStk(passkey, phone, watch).toHex(),
        )
    }

    @Test
    fun `session key verification accepts a correctly encrypted blob`() {
        val sessionKey = "a0a1a2a3a4a5a6a7a8a9aaabacadaeaf".hexToBytes()
        val blob = sessionKey + "0102030405060708".hexToBytes()
        val payload = byteArrayOf(0) + Xxtea.encrypt(blob, sessionKey)
        assertTrue(GarminAuthCrypto.verifySessionKey(sessionKey, payload))
        assertFalse(GarminAuthCrypto.verifySessionKey(sessionKey, payload.copyOf().also { it[1] = 0 }))
    }

    @Test
    fun `secure session frames carry a length prefix and increment the counter`() {
        val key = "00112233445566778899aabbccddeeff".hexToBytes()
        val hostIv = "0a0b0c0d".hexToBytes()
        val session = GarminAuthCrypto.GarminSecureSession(key, hostIv)
        val plain = "deadbeef".hexToBytes()
        val first = session.encrypt(plain)
        val second = session.encrypt(plain)
        assertEquals(first.size, ((first[0].toInt() and 0xFF) or ((first[1].toInt() and 0xFF) shl 8)))
        assertEquals(first.size, second.size)
        // The counter is the first field inside the ciphertext; two frames must differ.
        assertFalse(first.contentEquals(second))
        val decrypted = session.decrypt(first)
        assertArrayEquals(plain, decrypted.copyOfRange(0, plain.size))
    }

    @Test
    fun `decryptFrame trims XXTEA padding using the inner gfdi length`() {
        val key = "00112233445566778899aabbccddeeff".hexToBytes()
        val session = GarminAuthCrypto.GarminSecureSession(key, "0a0b0c0d".hexToBytes())
        val gfdiFrame = com.unified.health.driver.garmin.codec.GfdiMessage(
            5024,
            "010203040506070809".hexToBytes(),
        ).encode()
        val sealed = session.encrypt(gfdiFrame)
        assertArrayEquals(gfdiFrame, session.decryptFrame(sealed))
    }

    @Test
    fun `open secure session returns a 16-byte ack and a working cipher`() {
        val sessionKey = "101112131415161718191a1b1c1d1e1f".hexToBytes()
        val payload = "0123456789abcdef0123456789abcdef".hexToBytes()
        val opened = GarminAuthCrypto.openSecureSession(sessionKey, Xxtea.encrypt(payload, sessionKey), Random(7))
        assertEquals(16, opened.ack.size)
        assertEquals(4, opened.deviceIv.size)
        val frame = opened.session.encrypt("cafe".hexToBytes())
        assertArrayEquals("cafe".hexToBytes(), opened.session.decrypt(frame).copyOfRange(0, 2))
    }
}
