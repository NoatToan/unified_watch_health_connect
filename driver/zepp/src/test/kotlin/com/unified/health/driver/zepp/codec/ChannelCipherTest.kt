package com.unified.health.driver.zepp.codec

import com.unified.health.core.ble.protocol.ByteReader
import com.unified.health.core.ble.protocol.bytesOf
import com.unified.health.core.ble.protocol.hexToBytes
import com.unified.health.core.ble.protocol.toHex
import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Test

class ChannelCipherTest {

    private val authKey = "000102030405060708090a0b0c0d0e0f".hexToBytes()

    /** r0 = 5, r1 = 5, key material = 0x10..0x1f. */
    private val shared = bytesOf(5, 0, 0, 0, 5, 0, 0, 0) + ByteArray(16) { (0x10 + it).toByte() } + ByteArray(24)

    @Test
    fun `AES-ECB matches the FIPS-197 vector`() {
        val out = AesEcb.encrypt(authKey, "00112233445566778899aabbccddeeff".hexToBytes())
        assertEquals("69c4e0d86a7b0430d8cdb78070b4c55a", out.toHex())
        assertEquals("00112233445566778899aabbccddeeff", AesEcb.decrypt(authKey, out).toHex())
    }

    @Test
    fun `session key is shared bytes 8-23 xor auth key`() {
        assertEquals("10101010101010101010101010101010", ChannelCipher.deriveSessionKey(shared, authKey).toHex())
    }

    @Test
    fun `encrypt frames data, nonce and crc and pads to 16`() {
        val cipher = ChannelCipher(shared, authKey)
        val data = bytesOf(0x01, 0x02, 0x03)
        val encrypted = cipher.encrypt(sessionId = 0x22, data = data)
        assertEquals(16, encrypted.size)

        val packetKey = ByteArray(16) { (0x10 xor 0x22).toByte() }
        val plain = AesEcb.decrypt(packetKey, encrypted)
        val reader = ByteReader(plain)
        assertArrayEquals(data, reader.bytes(3))
        assertEquals(5L, reader.u32le())
        assertEquals(crc32(data, bytesOf(5, 0, 0, 0)), reader.u32le())
        assertArrayEquals(ByteArray(5), reader.rest())

        // the nonce advances
        val second = AesEcb.decrypt(packetKey, cipher.encrypt(0x22, data))
        assertEquals(6L, ByteReader(second, start = 3).u32le())
    }

    @Test
    fun `decrypts what the peer encrypted and enforces the nonce window`() {
        val phone = ChannelCipher(shared, authKey)
        val watch = ChannelCipher(shared, authKey) // r1 == phone's r0, as when the watch mirrors the keystore
        val data = ByteArray(20) { it.toByte() }
        assertArrayEquals(data, watch.decrypt(0x01, data.size, phone.encrypt(0x01, data)))
        assertArrayEquals(data, watch.decrypt(0x01, data.size, phone.encrypt(0x01, data)))
    }

    @Test(expected = ChannelCryptoException::class)
    fun `nonce far ahead is rejected`() {
        val farShared = bytesOf(0x00, 0x00, 0x10, 0x00, 5, 0, 0, 0) + shared.copyOfRange(8, 24)
        val sender = ChannelCipher(farShared, authKey) // r0 = 0x100000 > r1 + 100000
        ChannelCipher(shared, authKey).decrypt(0x01, 3, sender.encrypt(0x01, bytesOf(1, 2, 3)))
    }

    @Test(expected = ChannelCryptoException::class)
    fun `corrupted ciphertext fails the crc`() {
        val encrypted = ChannelCipher(shared, authKey).encrypt(0x01, bytesOf(1, 2, 3))
        encrypted[0] = (encrypted[0].toInt() xor 1).toByte()
        ChannelCipher(shared, authKey).decrypt(0x01, 3, encrypted)
    }

    @Test(expected = ChannelCryptoException::class)
    fun `wrong session id fails`() {
        val encrypted = ChannelCipher(shared, authKey).encrypt(0x01, bytesOf(1, 2, 3))
        ChannelCipher(shared, authKey).decrypt(0x02, 3, encrypted)
    }
}
