package com.unified.health.driver.zepp.codec

import org.bouncycastle.asn1.sec.SECNamedCurves
import org.bouncycastle.math.ec.ECPoint
import java.math.BigInteger
import java.security.SecureRandom
import java.util.Random

/** An ephemeral key pair in the watch's wire encoding (see [B163Ecdh]). */
internal class B163KeyPair(
    /** 24-byte little-endian scalar, already masked (never log it). */
    val privateKey: ByteArray,
    /** 48 bytes: x ‖ y, each 24-byte little-endian. */
    val publicKey: ByteArray,
)

/**
 * ECDH on NIST B-163 (`sect163r2`), as done by the vendor's native `libdevice-encrypt.so`.
 *
 * - Curve: the library's `.rodata` holds exactly the B-163 constants (§5.2 [V]).
 * - Sizes: private key 24 bytes, public key 48 bytes (`PRV_KEY_SIZE`, `ECDH_PUB_KEY_LEN`, §5.2 [V]).
 * - Encoding: [I]/[Ext]. The library exports the tiny-ECDH-c API (`ecdh_generate_keys`,
 *   `ecdh_shared_secret`), which stores every 163-bit value as six little-endian `uint32` words,
 *   i.e. a 24-byte little-endian integer on the ARM target. A public key / shared point is x ‖ y.
 *   Must be confirmed against a real watch or an HCI snoop log (§9 question 2).
 * - Private key preparation follows tiny-ECDH [Ext]: reject when the random value's degree is below
 *   `CURVE_DEGREE / 2` (= 81), then clear every bit from `degree(order) - 1` upward so the scalar is
 *   below the group order. The watch never sees the scalar, so this only has to be self-consistent.
 *
 * Uses BouncyCastle's lightweight math API only (Android's JCA has no binary curves).
 */
internal object B163Ecdh {
    const val PRIVATE_KEY_SIZE = 24
    const val COORDINATE_SIZE = 24
    const val PUBLIC_KEY_SIZE = 2 * COORDINATE_SIZE

    private const val CURVE_NAME = "sect163r2"
    private const val CURVE_DEGREE = 163
    private const val MIN_PRIVATE_KEY_DEGREE = CURVE_DEGREE / 2
    private const val MAX_KEYGEN_ATTEMPTS = 64

    private val params = requireNotNull(SECNamedCurves.getByName(CURVE_NAME)) { "BouncyCastle lacks $CURVE_NAME" }

    /** First bit index cleared in a private key: `degree(order) - 1` (tiny-ECDH convention). */
    val PRIVATE_KEY_MASK_FROM_BIT: Int = params.n.bitLength() - 1

    fun generateKeyPair(random: Random = SecureRandom()): B163KeyPair {
        repeat(MAX_KEYGEN_ATTEMPTS) {
            val raw = ByteArray(PRIVATE_KEY_SIZE).also(random::nextBytes)
            val privateKey = preparePrivateKey(raw) ?: return@repeat
            return B163KeyPair(privateKey, publicKey(privateKey))
        }
        error("Could not draw a usable B-163 private key")
    }

    /**
     * Applies the tiny-ECDH acceptance rule and mask to 24 random bytes.
     * @return the masked little-endian scalar, or null when [raw] is too small to be used.
     */
    fun preparePrivateKey(raw: ByteArray): ByteArray? {
        require(raw.size == PRIVATE_KEY_SIZE) { "Private key must be $PRIVATE_KEY_SIZE bytes" }
        val value = littleEndianToBigInteger(raw)
        if (value.bitLength() < MIN_PRIVATE_KEY_DEGREE) return null
        val masked = value.and(BigInteger.ONE.shiftLeft(PRIVATE_KEY_MASK_FROM_BIT).subtract(BigInteger.ONE))
        return bigIntegerToLittleEndian(masked, PRIVATE_KEY_SIZE)
    }

    fun publicKey(privateKey: ByteArray): ByteArray = encodePoint(params.g.multiply(scalar(privateKey)))

    /**
     * @return k·Q as x ‖ y (48 bytes). The protocol consumes the first 24 bytes (x) only (§5.2).
     * @throws IllegalArgumentException when [peerPublicKey] is malformed or not on the curve.
     */
    fun sharedSecret(privateKey: ByteArray, peerPublicKey: ByteArray): ByteArray {
        val point = decodePoint(peerPublicKey).multiply(scalar(privateKey)).normalize()
        require(!point.isInfinity) { "Shared point is at infinity" }
        return encodePoint(point)
    }

    fun decodePoint(encoded: ByteArray): ECPoint {
        require(encoded.size == PUBLIC_KEY_SIZE) { "Public key must be $PUBLIC_KEY_SIZE bytes, was ${encoded.size}" }
        val x = littleEndianToBigInteger(encoded.copyOfRange(0, COORDINATE_SIZE))
        val y = littleEndianToBigInteger(encoded.copyOfRange(COORDINATE_SIZE, PUBLIC_KEY_SIZE))
        // validatePoint throws IllegalArgumentException for coordinates outside the field or off the curve.
        val point = params.curve.validatePoint(x, y)
        require(!point.isInfinity) { "Public key is the point at infinity" }
        return point
    }

    fun encodePoint(point: ECPoint): ByteArray {
        val normalized = point.normalize()
        require(!normalized.isInfinity) { "Cannot encode the point at infinity" }
        return bigIntegerToLittleEndian(normalized.affineXCoord.toBigInteger(), COORDINATE_SIZE) +
            bigIntegerToLittleEndian(normalized.affineYCoord.toBigInteger(), COORDINATE_SIZE)
    }

    private fun scalar(privateKey: ByteArray): BigInteger {
        require(privateKey.size == PRIVATE_KEY_SIZE) { "Private key must be $PRIVATE_KEY_SIZE bytes" }
        val k = littleEndianToBigInteger(privateKey)
        require(k.signum() > 0 && k < params.n) { "Private key out of range" }
        return k
    }

    internal fun littleEndianToBigInteger(bytes: ByteArray): BigInteger = BigInteger(1, bytes.reversedArray())

    internal fun bigIntegerToLittleEndian(value: BigInteger, size: Int): ByteArray {
        require(value.signum() >= 0 && value.bitLength() <= size * 8) { "Value does not fit in $size bytes" }
        val bigEndian = value.toByteArray().let { if (it.size > size) it.copyOfRange(it.size - size, it.size) else it }
        val out = ByteArray(size)
        for (i in bigEndian.indices) out[i] = bigEndian[bigEndian.size - 1 - i]
        return out
    }
}
