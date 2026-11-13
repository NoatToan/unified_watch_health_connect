package com.unified.health.driver.xiaomi.crypto

import java.math.BigInteger
import java.security.AlgorithmParameters
import java.security.GeneralSecurityException
import java.security.KeyFactory
import java.security.KeyPairGenerator
import java.security.MessageDigest
import java.security.PrivateKey
import java.security.Provider
import java.security.SecureRandom
import java.security.interfaces.ECPublicKey
import java.security.spec.ECGenParameterSpec
import java.security.spec.ECParameterSpec
import java.security.spec.ECPoint
import java.security.spec.ECPublicKeySpec
import javax.crypto.Cipher
import javax.crypto.KeyAgreement
import javax.crypto.Mac
import javax.crypto.spec.IvParameterSpec
import javax.crypto.spec.SecretKeySpec
import org.bouncycastle.jcajce.spec.AEADParameterSpec
import org.bouncycastle.jce.provider.BouncyCastleProvider

/**
 * MiWear symmetric primitives shared by session auth and the cloud signer (protocol §5.1-§5.4
 * [V], `iql`/`ucb`/`i0`).
 *
 * Secret-bearing: nothing here logs, and callers must not log inputs or outputs. `require`/
 * `requireNotNull` messages only ever name sizes and counts, never key material.
 */

/** Explicit BC provider instance: Android's built-in `"BC"` provider is an older, different BC build. */
private val bouncyCastleProvider: Provider = BouncyCastleProvider()

private const val AES_KEY_BYTES = 16
private const val AES_BLOCK_BYTES = 16
private const val CCM_NONCE_BYTES = 12
private const val CCM_TAG_BITS = 32
private const val SHA256_BYTES = 32

/** HKDF-Expand's counter is one byte, so at most 255 blocks (protocol §5.1 [V]). */
private const val HKDF_MAX_OUTPUT_BYTES = 255 * SHA256_BYTES

/** HKDF info label for the MiWear session key schedule (protocol §5.1/§6.1 [V]). */
private const val AUTH_LABEL = "miwear-auth"

/** HKDF info label for the MiWear local-bind key schedule (protocol §7.2 step 8 [V]). */
private const val BIND_LABEL = "miwear-bind"

/** `LocalWearBinderV2`'s ECDH curve (protocol §7.2 step 1 [V]): NIST P-256, JCE name `secp256r1`. */
private const val EC_CURVE_NAME = "secp256r1"

/** One EC-P256 coordinate's fixed byte width; `appPub`/`devicePub` are `X(32) || Y(32)`, no `0x04` tag (protocol §7.2 [V]). */
private const val EC_COORDINATE_BYTES = 32

/**
 * `ucb.a(key, message)` (protocol §5.2 [V]): HMAC-SHA256 over [message], raw 32 bytes.
 *
 * @throws IllegalArgumentException if [key] is empty (JCE `SecretKeySpec` rejects it).
 */
internal fun hmacSha256(key: ByteArray, message: ByteArray): ByteArray {
    val mac = Mac.getInstance("HmacSHA256")
    mac.init(SecretKeySpec(key, "HmacSHA256"))
    return mac.doFinal(message)
}

/**
 * HKDF-SHA256 exactly as `iql.i(label, ikm, saltInput)` (protocol §5.1 [V]):
 * `PRK = HMAC-SHA256(key = saltInput, message = ikm)`, then RFC 5869 expand with
 * `info = ASCII(label)` and a one-byte counter starting at 1.
 *
 * Note the argument order: the IKM (token/shared key) is the HMAC *message* of the extract step;
 * [saltInput] is the HMAC *key*, which the protocol fills with the concatenated randoms.
 *
 * @param label ASCII info string; the vendor uses `miwear-auth`.
 * @param ikm input keying material (the 16-byte MiWear token).
 * @param saltInput HKDF salt (in practice `appRandom || deviceRandom`).
 * @param length output length, 1..8160 bytes (255 SHA-256 blocks).
 * @throws IllegalArgumentException if [length] is outside 1..8160 or [label] is not ASCII.
 */
internal fun hkdfSha256(
    label: String,
    ikm: ByteArray,
    saltInput: ByteArray,
    length: Int = 64,
): ByteArray {
    require(length in 1..HKDF_MAX_OUTPUT_BYTES) {
        "HKDF output length must be in 1..$HKDF_MAX_OUTPUT_BYTES bytes, was $length"
    }
    require(label.all { it.code in 0..0x7F }) { "HKDF label must be ASCII" }

    val prk = hmacSha256(saltInput, ikm)
    val info = label.toByteArray(Charsets.US_ASCII)
    val output = ByteArray(length)
    var previousBlock = ByteArray(0)
    var offset = 0
    var counter = 1
    while (offset < length) {
        val mac = Mac.getInstance("HmacSHA256")
        mac.init(SecretKeySpec(prk, "HmacSHA256"))
        mac.update(previousBlock)
        mac.update(info)
        mac.update(counter.toByte())
        previousBlock = mac.doFinal()
        val chunk = minOf(previousBlock.size, length - offset)
        previousBlock.copyInto(output, destinationOffset = offset, startIndex = 0, endIndex = chunk)
        offset += chunk
        counter++
    }
    return output
}

/**
 * Session key schedule from the 64-byte `miwear-auth` HKDF output (protocol §5.1/§6.1 [V]):
 * `deviceKey = okm[0..16)`, `appKey = okm[16..32)`, `deviceIV = okm[32..36)`,
 * `appIV = okm[36..40)`.
 *
 * [toString] is redacted: this object holds live key material.
 */
internal class XiaomiAuthKeys(
    val deviceKey: ByteArray,
    val appKey: ByteArray,
    val deviceIV: ByteArray,
    val appIV: ByteArray,
) {

    /**
     * `deviceSign = HMAC-SHA256(deviceKey, deviceRandom || appRandom)` (protocol §5.1 [V]).
     * Note the concatenation order differs from [appSign].
     */
    fun deviceSign(deviceRandom: ByteArray, appRandom: ByteArray): ByteArray =
        hmacSha256(deviceKey, deviceRandom + appRandom)

    /**
     * `appSign = HMAC-SHA256(appKey, appRandom || deviceRandom)` (protocol §5.1 [V]).
     * Note the concatenation order differs from [deviceSign].
     */
    fun appSign(appRandom: ByteArray, deviceRandom: ByteArray): ByteArray =
        hmacSha256(appKey, appRandom + deviceRandom)

    override fun toString(): String = "XiaomiAuthKeys(redacted)"
}

/**
 * Derives the session keys the way `iql.i("miwear-auth", token, appRandom||deviceRandom)` does
 * (protocol §5.1 [V]): [ikm] is the token, the HKDF salt is `appRandom || deviceRandom`.
 *
 * @throws IllegalArgumentException if HKDF's own argument constraints fail.
 */
internal fun deriveAuthKeys(
    ikm: ByteArray,
    appRandom: ByteArray,
    deviceRandom: ByteArray,
): XiaomiAuthKeys {
    val okm = hkdfSha256(AUTH_LABEL, ikm, appRandom + deviceRandom, length = 64)
    return try {
        XiaomiAuthKeys(
            deviceKey = okm.copyOfRange(0, 16),
            appKey = okm.copyOfRange(16, 32),
            deviceIV = okm.copyOfRange(32, 36),
            appIV = okm.copyOfRange(36, 40),
        )
    } finally {
        okm.fill(0)
    }
}

/**
 * `iql.d(key, nonce, plaintext, aad?)` (protocol §5.3 [V]): AES-CCM with a 4-byte tag, returning
 * `ciphertext || tag(4)` -- the layout `t90` field 2 carries.
 *
 * Uses an explicit [BouncyCastleProvider] instance rather than the ambient `"BC"` name because
 * Android ships a different BC build under that name.
 *
 * @param key 16-byte AES-128 key (the session `appKey`).
 * @param nonce 12-byte CCM nonce (e.g. `appIV || 8 zero bytes`).
 * @param aad optional additional authenticated data (`"bind-data"` for the bind result).
 * @throws IllegalArgumentException if the key/nonce sizes are wrong.
 * @throws GeneralSecurityException on any cipher failure (including a bad tag when decrypting).
 */
internal fun aesCcmEncrypt(
    key: ByteArray,
    nonce: ByteArray,
    plaintext: ByteArray,
    aad: ByteArray? = null,
): ByteArray = ccm(Cipher.ENCRYPT_MODE, key, nonce, plaintext, aad)

/**
 * `iql.a(key, nonce, ciphertextWithTag, aad?)` (protocol §5.3 [V]): decrypts the
 * `ciphertext || tag(4)` layout produced by [aesCcmEncrypt].
 *
 * @throws IllegalArgumentException if the key/nonce sizes are wrong.
 * @throws GeneralSecurityException on any cipher failure; a wrong tag or wrong AAD surfaces as
 *  `AEADBadTagException` (a [GeneralSecurityException] subclass).
 */
internal fun aesCcmDecrypt(
    key: ByteArray,
    nonce: ByteArray,
    ciphertextWithTag: ByteArray,
    aad: ByteArray? = null,
): ByteArray = ccm(Cipher.DECRYPT_MODE, key, nonce, ciphertextWithTag, aad)

private fun ccm(mode: Int, key: ByteArray, nonce: ByteArray, input: ByteArray, aad: ByteArray?): ByteArray {
    require(key.size == AES_KEY_BYTES) { "AES-CCM key must be 16 bytes, was ${key.size}" }
    require(nonce.size == CCM_NONCE_BYTES) { "AES-CCM nonce must be 12 bytes, was ${nonce.size}" }
    val cipher = Cipher.getInstance("AES/CCM/NoPadding", bouncyCastleProvider)
    cipher.init(mode, SecretKeySpec(key, "AES"), AEADParameterSpec(nonce, CCM_TAG_BITS))
    if (aad != null) cipher.updateAAD(aad)
    return cipher.doFinal(input)
}

/**
 * `i0.b(key, iv, data)` / `i0.a(key, iv, data)` (protocol §5.4 [V]): AES-128-CTR. CTR is its own
 * inverse, so one function serves both directions; the L2 caller passes the same 16-byte session
 * key as [key] and [iv].
 *
 * @throws IllegalArgumentException if [key] or [iv] is not 16 bytes.
 * @throws GeneralSecurityException if the platform has no AES-CTR implementation.
 */
internal fun aesCtrCrypt(key: ByteArray, iv: ByteArray, data: ByteArray): ByteArray {
    require(key.size == AES_KEY_BYTES) { "AES-CTR key must be 16 bytes, was ${key.size}" }
    require(iv.size == AES_BLOCK_BYTES) { "AES-CTR IV must be 16 bytes, was ${iv.size}" }
    val cipher = Cipher.getInstance("AES/CTR/NoPadding")
    cipher.init(Cipher.ENCRYPT_MODE, SecretKeySpec(key, "AES"), IvParameterSpec(iv))
    return cipher.doFinal(data)
}

/**
 * Constant-time content comparison via [MessageDigest.isEqual]. Lengths are not secret here
 * (both sides are fixed-size keys/signatures), but different lengths return `false`.
 */
internal fun constantTimeEquals(a: ByteArray, b: ByteArray): Boolean = MessageDigest.isEqual(a, b)

/**
 * `MD5(userId)` (protocol §7.1 [V], `sb0.userIdMd5`): the only MD5 use in this module, a
 * non-secret identity hint sent in the plaintext `getBindInfo` probe. Not secret-bearing --
 * `userId` is the app's own locally-generated bind identity, not a credential.
 */
internal fun md5(data: ByteArray): ByteArray = MessageDigest.getInstance("MD5").digest(data)

/** Cached NIST P-256 domain parameters, reused by every [generateEcKeyPair]/[ecdhSharedSecret] call. */
private val ecParameterSpec: ECParameterSpec by lazy {
    val params = AlgorithmParameters.getInstance("EC")
    params.init(ECGenParameterSpec(EC_CURVE_NAME))
    params.getParameterSpec(ECParameterSpec::class.java)
}

/**
 * One side of a MiWear local-bind ECDH-P256 exchange (protocol §7.2 [V]: `LocalWearBinderV2`
 * generates an app keypair at step 1, the watch generates its own and replies with `devicePub`).
 * Holds the private key only in memory; [sharedSecret] is the only operation exposed on it.
 */
internal class XiaomiEcKeyPair(
    /** Raw uncompressed point `X(32) || Y(32)` -- the wire format `na0.appPub` carries (protocol §7.2 [V]). */
    val publicKey: ByteArray,
    private val privateKey: PrivateKey,
) {
    /**
     * `sharedKey = ECDH-P256(appPriv, devicePub)` (protocol §7.2 step 5 [V]): the 32-byte X
     * coordinate of the shared point.
     * @throws IllegalArgumentException if [peerPublicKey] is not 64 raw bytes.
     * @throws GeneralSecurityException if [peerPublicKey] does not decode to a valid P-256 point.
     */
    fun sharedSecret(peerPublicKey: ByteArray): ByteArray = ecdhSharedSecret(privateKey, peerPublicKey)
}

/** `LocalWearBinderV2` step 1 (protocol §7.2 [V]): generates the app's own EC-P256 keypair. */
internal fun generateEcKeyPair(random: SecureRandom = SecureRandom()): XiaomiEcKeyPair {
    val generator = KeyPairGenerator.getInstance("EC")
    generator.initialize(ecParameterSpec, random)
    val pair = generator.generateKeyPair()
    val point = (pair.public as ECPublicKey).w
    return XiaomiEcKeyPair(encodeEcPoint(point), pair.private)
}

private fun encodeEcPoint(point: ECPoint): ByteArray =
    fixedWidth(point.affineX) + fixedWidth(point.affineY)

/** Big-endian, exactly [EC_COORDINATE_BYTES] wide: strips [BigInteger]'s optional sign byte, pads short values. */
private fun fixedWidth(value: BigInteger): ByteArray {
    val raw = value.toByteArray()
    return when {
        raw.size == EC_COORDINATE_BYTES -> raw
        raw.size > EC_COORDINATE_BYTES -> raw.copyOfRange(raw.size - EC_COORDINATE_BYTES, raw.size)
        else -> ByteArray(EC_COORDINATE_BYTES - raw.size) + raw
    }
}

private fun ecdhSharedSecret(privateKey: PrivateKey, peerPublicKey: ByteArray): ByteArray {
    require(peerPublicKey.size == EC_COORDINATE_BYTES * 2) {
        "EC public key must be ${EC_COORDINATE_BYTES * 2} bytes (X||Y, no 0x04 prefix), was ${peerPublicKey.size}"
    }
    val x = BigInteger(1, peerPublicKey.copyOfRange(0, EC_COORDINATE_BYTES))
    val y = BigInteger(1, peerPublicKey.copyOfRange(EC_COORDINATE_BYTES, EC_COORDINATE_BYTES * 2))
    val publicKey = KeyFactory.getInstance("EC").generatePublic(ECPublicKeySpec(ECPoint(x, y), ecParameterSpec))
    val agreement = KeyAgreement.getInstance("ECDH")
    agreement.init(privateKey)
    agreement.doPhase(publicKey, true)
    val secret = agreement.generateSecret()
    // Some JCE providers drop the X coordinate's leading zero bytes; pad back to the fixed field width.
    return if (secret.size == EC_COORDINATE_BYTES) secret else ByteArray(EC_COORDINATE_BYTES - secret.size) + secret
}

/**
 * Session key schedule from the 64-byte `miwear-bind` HKDF output (protocol §7.2 step 8 [V]):
 * same layout as [XiaomiAuthKeys] plus a 16-byte permanent [token] (`okm[40..56)`).
 *
 * [toString] is redacted: this object holds live key material including the new long-lived token.
 */
internal class XiaomiBindKeys(
    val deviceKey: ByteArray,
    val appKey: ByteArray,
    val deviceIV: ByteArray,
    val appIV: ByteArray,
    val token: ByteArray,
) {
    override fun toString(): String = "XiaomiBindKeys(redacted)"
}

/**
 * Derives the local-bind session keys and the new permanent token (protocol §7.2 step 8 [V]):
 * `OKM = HKDF-SHA256(ikm = sharedKey, salt = appRandom||deviceRandom, info = "miwear-bind", L = 64)`.
 *
 * @throws IllegalArgumentException if HKDF's own argument constraints fail.
 */
internal fun deriveBindKeys(
    sharedKey: ByteArray,
    appRandom: ByteArray,
    deviceRandom: ByteArray,
): XiaomiBindKeys {
    val okm = hkdfSha256(BIND_LABEL, sharedKey, appRandom + deviceRandom, length = 64)
    return try {
        XiaomiBindKeys(
            deviceKey = okm.copyOfRange(0, 16),
            appKey = okm.copyOfRange(16, 32),
            deviceIV = okm.copyOfRange(32, 36),
            appIV = okm.copyOfRange(36, 40),
            token = okm.copyOfRange(40, 56),
        )
    } finally {
        okm.fill(0)
    }
}
