package com.unified.health.driver.xiaomi.crypto

import com.unified.health.core.ble.protocol.hexToBytes
import com.unified.health.core.ble.protocol.toHex
import javax.crypto.AEADBadTagException
import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertThrows
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * `XIAOMI_TEST_VECTORS.json`'s `authCrypto`/`authCcm` vectors, hand-decoded from the doc's own
 * worked example (protocol §5.1/§5.3/§5.6 [V]) -- run before wiring this crypto into the
 * handshake, per the brief: a derivation bug must surface here, not three steps into
 * [com.unified.health.driver.xiaomi.auth.XiaomiAuthenticatorImpl].
 */
class XiaomiCryptoTest {

    // ---- authCrypto: HKDF-SHA256 / deriveAuthKeys / HMAC signs ----

    private val token = "000102030405060708090a0b0c0d0e0f".hexToBytes()
    private val appRandom = "a0a1a2a3a4a5a6a7a8a9aaabacadaeaf".hexToBytes()
    private val deviceRandom = "b0b1b2b3b4b5b6b7b8b9babbbcbdbebf".hexToBytes()

    @Test
    fun `hkdfSha256 matches the 64-byte OKM test vector`() {
        val okm = hkdfSha256("miwear-auth", token, appRandom + deviceRandom, length = 64)
        assertEquals(
            "e056f56a92e2e5310b681165b043a8b896d98ddbd7e59381ccf81334d7fe6215" +
                "5cf69b67831425513eaa4017c360e676ba96ded7c4194fcc6309e3e57e815de0",
            okm.toHex(),
        )
    }

    @Test
    fun `deriveAuthKeys splits the OKM into deviceKey appKey deviceIV appIV`() {
        val keys = deriveAuthKeys(token, appRandom, deviceRandom)
        assertEquals("e056f56a92e2e5310b681165b043a8b8", keys.deviceKey.toHex())
        assertEquals("96d98ddbd7e59381ccf81334d7fe6215", keys.appKey.toHex())
        assertEquals("5cf69b67", keys.deviceIV.toHex())
        assertEquals("83142551", keys.appIV.toHex())
    }

    @Test
    fun `deviceSign and appSign match the test vector`() {
        val keys = deriveAuthKeys(token, appRandom, deviceRandom)
        assertEquals(
            "901134d0b9b5890d02e0f92db264e8bb956de03ca9a7f5343e992e9e84a2fe5c",
            keys.deviceSign(deviceRandom, appRandom).toHex(),
        )
        assertEquals(
            "3137d4f6a3e822a9f9381973f20a38734b3457e0aae03b40dc3e4e4d294baf32",
            keys.appSign(appRandom, deviceRandom).toHex(),
        )
    }

    // ---- authCcm: AES-CCM(appKey, nonce = appIV||8 zero bytes) over the dc0 example ----

    @Test
    fun `aesCcmEncrypt matches the dc0 ciphertext plus 4-byte tag vector`() {
        val dc0 = "08001500000c421a07506978656c20392a02564e".hexToBytes()
        val key = "96d98ddbd7e59381ccf81334d7fe6215".hexToBytes()
        val nonce = "831425510000000000000000".hexToBytes()
        val ciphertextPlusTag = aesCcmEncrypt(key, nonce, dc0)
        assertEquals("4d6daa007f881ae828d8107de55e8e8f93ac79d42c3afed1", ciphertextPlusTag.toHex())
    }

    @Test
    fun `aesCcmDecrypt recovers the dc0 plaintext from the vector`() {
        val key = "96d98ddbd7e59381ccf81334d7fe6215".hexToBytes()
        val nonce = "831425510000000000000000".hexToBytes()
        val ciphertextPlusTag = "4d6daa007f881ae828d8107de55e8e8f93ac79d42c3afed1".hexToBytes()
        val plaintext = aesCcmDecrypt(key, nonce, ciphertextPlusTag)
        assertEquals("08001500000c421a07506978656c20392a02564e", plaintext.toHex())
    }

    @Test
    fun `aesCcmDecrypt rejects a tampered ciphertext`() {
        val key = "96d98ddbd7e59381ccf81334d7fe6215".hexToBytes()
        val nonce = "831425510000000000000000".hexToBytes()
        val tampered = "4d6daa007f881ae828d8107de55e8e8f93ac79d42c3afed2".hexToBytes() // last tag byte flipped
        assertThrows(AEADBadTagException::class.java) { aesCcmDecrypt(key, nonce, tampered) }
    }

    @Test
    fun `aesCcmEncrypt round-trips with an AAD`() {
        val key = ByteArray(16) { it.toByte() }
        val nonce = ByteArray(12) { (it + 1).toByte() }
        val plaintext = "hello bind-data".toByteArray()
        val aad = "bind-data".toByteArray()
        val wrapped = aesCcmEncrypt(key, nonce, plaintext, aad)
        assertArrayEquals(plaintext, aesCcmDecrypt(key, nonce, wrapped, aad))
    }

    // ---- authCrypto l2Ctr: AES-128-CTR, key == IV ----

    @Test
    fun `aesCtrCrypt matches the L2 time-sync ciphertext vector`() {
        val plaintext = (
            "080210032230222e0a0708ea0f100b180c12090813101e180020fa011a16083810001a10" +
                "417369612f486f5f4368695f4d696e682001"
            ).hexToBytes()
        val keyAndIv = "96d98ddbd7e59381ccf81334d7fe6215".hexToBytes()
        val ciphertext = aesCtrCrypt(keyAndIv, keyAndIv, plaintext)
        assertEquals(
            "0a5df840493f4b7804eef1b2927e0a52e74e220f1095ac05434128ec5efd5224c1e52279ee819a9b20f466add348adf585b48e636e38",
            ciphertext.toHex(),
        )
    }

    @Test
    fun `aesCtrCrypt is its own inverse`() {
        val keyAndIv = ByteArray(16) { it.toByte() }
        val plaintext = "a somewhat longer plaintext to cross a 16-byte CTR block boundary".toByteArray()
        val ciphertext = aesCtrCrypt(keyAndIv, keyAndIv, plaintext)
        assertArrayEquals(plaintext, aesCtrCrypt(keyAndIv, keyAndIv, ciphertext))
    }

    // ---- md5 (sb0.userIdMd5, protocol §7.1) ----

    @Test
    fun `md5 matches the getBindInfo userId vector`() {
        // XIAOMI_TEST_VECTORS.json getBindInfo: userId "1234567890".
        assertEquals("e807f1fcf82d132f9bb018ca6738a19f", md5("1234567890".toByteArray()).toHex())
    }

    // ---- constantTimeEquals ----

    @Test
    fun `constantTimeEquals compares content not identity`() {
        assertTrue(constantTimeEquals(byteArrayOf(1, 2, 3), byteArrayOf(1, 2, 3)))
        assertFalse(constantTimeEquals(byteArrayOf(1, 2, 3), byteArrayOf(1, 2, 4)))
        assertFalse(constantTimeEquals(byteArrayOf(1, 2, 3), byteArrayOf(1, 2)))
    }

    // ---- ECDH-P256 (no vendor test vector; the doc gives none, so this is a round-trip check) ----

    @Test
    fun `generateEcKeyPair produces a 64-byte raw public key`() {
        val keyPair = generateEcKeyPair()
        assertEquals(64, keyPair.publicKey.size)
    }

    @Test
    fun `ECDH shared secrets agree between both sides`() {
        val app = generateEcKeyPair()
        val device = generateEcKeyPair()
        val fromApp = app.sharedSecret(device.publicKey)
        val fromDevice = device.sharedSecret(app.publicKey)
        assertEquals(32, fromApp.size)
        assertArrayEquals(fromApp, fromDevice)
    }

    @Test
    fun `ECDH shared secrets differ for different keypairs`() {
        val app = generateEcKeyPair()
        val otherDevice = generateEcKeyPair()
        val yetAnotherDevice = generateEcKeyPair()
        assertFalse(app.sharedSecret(otherDevice.publicKey).contentEquals(app.sharedSecret(yetAnotherDevice.publicKey)))
    }

    @Test
    fun `ecdhSharedSecret rejects a malformed peer public key`() {
        val app = generateEcKeyPair()
        assertThrows(IllegalArgumentException::class.java) { app.sharedSecret(ByteArray(10)) }
    }

    // ---- deriveBindKeys (protocol §7.2 step 8; no vendor vector, but the layout mirrors deriveAuthKeys) ----

    @Test
    fun `deriveBindKeys splits the 64-byte miwear-bind OKM including the 16-byte token`() {
        val sharedKey = ByteArray(32) { it.toByte() }
        val keys = deriveBindKeys(sharedKey, appRandom, deviceRandom)
        val expectedOkm = hkdfSha256("miwear-bind", sharedKey, appRandom + deviceRandom, length = 64)
        assertEquals(expectedOkm.copyOfRange(0, 16).toHex(), keys.deviceKey.toHex())
        assertEquals(expectedOkm.copyOfRange(16, 32).toHex(), keys.appKey.toHex())
        assertEquals(expectedOkm.copyOfRange(32, 36).toHex(), keys.deviceIV.toHex())
        assertEquals(expectedOkm.copyOfRange(36, 40).toHex(), keys.appIV.toHex())
        assertEquals(expectedOkm.copyOfRange(40, 56).toHex(), keys.token.toHex())
        assertEquals(16, keys.token.size)
    }
}
