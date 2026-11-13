package com.unified.health.driver.xiaomi.proto

import com.unified.health.core.ble.protocol.MalformedPayloadException

/**
 * `na0` -- `LocalWearBinderV2` step 3, the app's ECDH offer (protocol §7.2 [V]):
 * `{1: string appDeviceId, 2: bytes appPub(64)}`. [appPub] is the raw uncompressed EC point
 * `X(32) || Y(32)`, no `0x04` tag (see `crypto/XiaomiCrypto.kt`'s `XiaomiEcKeyPair`).
 */
internal data class Na0(val appDeviceId: String, val appPub: ByteArray) {
    fun encode(): ByteArray {
        val writer = ProtoWriter()
        writer.stringField(FIELD_APP_DEVICE_ID, appDeviceId)
        writer.bytesField(FIELD_APP_PUB, appPub)
        return writer.toByteArray()
    }

    private companion object {
        const val FIELD_APP_DEVICE_ID = 1
        const val FIELD_APP_PUB = 2
    }
}

/**
 * `ta0` -- `LocalWearBinderV2` step 4, the watch's ECDH reply (protocol §7.2 [V]):
 * `{1: bytes devicePub(64), 2: bytes deviceSign(32), 3: bytes deviceRandom(16)}`. This driver only
 * ever receives a `ta0`, so [encode] exists only for tests that script the watch side.
 */
internal data class Ta0(val devicePub: ByteArray, val deviceSign: ByteArray, val deviceRandom: ByteArray) {
    fun encode(): ByteArray = ProtoWriter()
        .bytesField(FIELD_DEVICE_PUB, devicePub)
        .bytesField(FIELD_DEVICE_SIGN, deviceSign)
        .bytesField(FIELD_DEVICE_RANDOM, deviceRandom)
        .toByteArray()

    companion object {
        private const val FIELD_DEVICE_PUB = 1
        private const val FIELD_DEVICE_SIGN = 2
        private const val FIELD_DEVICE_RANDOM = 3

        /** @throws MalformedPayloadException if any field is missing. */
        fun decode(bytes: ByteArray): Ta0 {
            val reader = ProtoReader(bytes)
            var devicePub: ByteArray? = null
            var deviceSign: ByteArray? = null
            var deviceRandom: ByteArray? = null
            while (reader.hasRemaining) {
                val tag = reader.readTag()
                when (tag.fieldNumber) {
                    FIELD_DEVICE_PUB -> reader.lengthDelimitedOrSkip(tag)?.let { devicePub = it }
                    FIELD_DEVICE_SIGN -> reader.lengthDelimitedOrSkip(tag)?.let { deviceSign = it }
                    FIELD_DEVICE_RANDOM -> reader.lengthDelimitedOrSkip(tag)?.let { deviceRandom = it }
                    else -> reader.skip(tag.wireType)
                }
            }
            return Ta0(
                devicePub = devicePub ?: throw MalformedPayloadException("ta0 is missing field 1 (devicePub)"),
                deviceSign = deviceSign ?: throw MalformedPayloadException("ta0 is missing field 2 (deviceSign)"),
                deviceRandom = deviceRandom ?: throw MalformedPayloadException("ta0 is missing field 3 (deviceRandom)"),
            )
        }
    }
}

/**
 * `ka0` -- `LocalWearBinderV2` step 9, the app's confirmation (protocol §7.2 [V]):
 * `{1: bytes appRandom, 2: bytes sign}`, where `sign = HMAC-SHA256(sharedKey, appRandom [|| oob])`.
 */
internal data class Ka0(val appRandom: ByteArray, val sign: ByteArray) {
    fun encode(): ByteArray {
        val writer = ProtoWriter()
        writer.bytesField(FIELD_APP_RANDOM, appRandom)
        writer.bytesField(FIELD_SIGN, sign)
        return writer.toByteArray()
    }

    private companion object {
        const val FIELD_APP_RANDOM = 1
        const val FIELD_SIGN = 2
    }
}

/**
 * `qa0` -- `LocalWearBinderV2` step 10, the watch's confirmation (protocol §7.2 [V]):
 * `{1: bool confirmed}`. The watch may require a button press first (`oobMode == 3`); see
 * `XiaomiAuthenticatorImpl.OOB_CONFIRM_TIMEOUT_MS`. This driver only ever receives a `qa0`, so
 * [encode] exists only for tests that script the watch side.
 */
internal data class Qa0(val confirmed: Boolean) {
    fun encode(): ByteArray = ProtoWriter().boolField(FIELD_CONFIRMED, confirmed).toByteArray()

    companion object {
        private const val FIELD_CONFIRMED = 1

        fun decode(bytes: ByteArray): Qa0 {
            val reader = ProtoReader(bytes)
            var confirmed = false
            while (reader.hasRemaining) {
                val tag = reader.readTag()
                when (tag.fieldNumber) {
                    FIELD_CONFIRMED -> reader.varintOrSkip(tag)?.let { confirmed = it != 0L }
                    else -> reader.skip(tag.wireType)
                }
            }
            return Qa0(confirmed)
        }
    }
}

/**
 * `wa0` -- the plaintext bind-result payload, AES-CCM-encrypted before it is sent as `pb0`
 * (protocol §7.2 step 11 [V]): `{1: string userId, 2: message cc0}`, where `cc0` is an
 * [AppDeviceInfo].
 */
internal data class Wa0(val userId: String, val deviceInfo: AppDeviceInfo) {
    fun encode(): ByteArray {
        val writer = ProtoWriter()
        writer.stringField(FIELD_USER_ID, userId)
        writer.messageField(FIELD_DEVICE_INFO, deviceInfo.encode())
        return writer.toByteArray()
    }

    private companion object {
        const val FIELD_USER_ID = 1
        const val FIELD_DEVICE_INFO = 2
    }
}

/**
 * `pb0` -- `LocalWearBinderV2` step 11, the AES-CCM-wrapped [Wa0] (protocol §7.2 [V]):
 * `{1: bytes encryptedBindResult}`.
 */
internal data class Pb0(val encryptedBindResult: ByteArray) {
    fun encode(): ByteArray = ProtoWriter().bytesField(FIELD_ENCRYPTED_BIND_RESULT, encryptedBindResult).toByteArray()

    private companion object {
        const val FIELD_ENCRYPTED_BIND_RESULT = 1
    }
}
