package com.unified.health.driver.zepp.codec

import com.unified.health.core.ble.protocol.hexToBytes
import com.unified.health.core.ble.protocol.toHex
import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertNull
import org.junit.Test
import java.math.BigInteger
import java.util.Random

class B163EcdhTest {

    /** SEC 2 sect163r2 base point, little-endian 24-byte coordinates. */
    private val generatorLe = (
        "363e34e8374699d4681199a07ed5a28662a1ebf003000000" +
            "f12473790c5c1cb145d5cda24f09a0716cbc1fd500000000"
        ).hexToBytes()

    @Test
    fun `scalar one encodes the base point little-endian`() {
        val one = ByteArray(24).also { it[0] = 1 }
        assertEquals(generatorLe.toHex(), B163Ecdh.publicKey(one).toHex())
    }

    @Test
    fun `shared secret is symmetric`() {
        val random = Random(42)
        repeat(5) {
            val a = B163Ecdh.generateKeyPair(random)
            val b = B163Ecdh.generateKeyPair(random)
            val ab = B163Ecdh.sharedSecret(a.privateKey, b.publicKey)
            val ba = B163Ecdh.sharedSecret(b.privateKey, a.publicKey)
            assertEquals(48, ab.size)
            assertArrayEquals(ab, ba)
        }
    }

    @Test
    fun `point encoding round-trips`() {
        val pair = B163Ecdh.generateKeyPair(Random(3))
        assertEquals(48, pair.publicKey.size)
        assertArrayEquals(pair.publicKey, B163Ecdh.encodePoint(B163Ecdh.decodePoint(pair.publicKey)))
    }

    @Test
    fun `private key preparation follows tiny-ECDH`() {
        assertEquals(162, B163Ecdh.PRIVATE_KEY_MASK_FROM_BIT)
        val allOnes = ByteArray(24) { 0xFF.toByte() }
        val masked = B163Ecdh.littleEndianToBigInteger(B163Ecdh.preparePrivateKey(allOnes)!!)
        assertEquals(BigInteger.ONE.shiftLeft(162).subtract(BigInteger.ONE), masked)

        // degree 80 (< 163 / 2) is rejected, degree 81 accepted
        val degree80 = B163Ecdh.bigIntegerToLittleEndian(BigInteger.ONE.shiftLeft(79), 24)
        val degree81 = B163Ecdh.bigIntegerToLittleEndian(BigInteger.ONE.shiftLeft(80), 24)
        assertNull(B163Ecdh.preparePrivateKey(degree80))
        assertNotNull(B163Ecdh.preparePrivateKey(degree81))
    }

    @Test
    fun `generated private keys stay below bit 162`() {
        val random = Random(9)
        repeat(20) {
            val k = B163Ecdh.littleEndianToBigInteger(B163Ecdh.generateKeyPair(random).privateKey)
            assertFalse(k.bitLength() > 162)
        }
    }

    @Test(expected = IllegalArgumentException::class)
    fun `rejects a point that is not on the curve`() {
        val bad = generatorLe.copyOf().also { it[30] = (it[30].toInt() xor 1).toByte() }
        B163Ecdh.decodePoint(bad)
    }

    @Test(expected = IllegalArgumentException::class)
    fun `rejects a short public key`() {
        B163Ecdh.decodePoint(ByteArray(47))
    }
}
