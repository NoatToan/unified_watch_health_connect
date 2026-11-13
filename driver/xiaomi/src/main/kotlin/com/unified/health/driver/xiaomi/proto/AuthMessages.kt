package com.unified.health.driver.xiaomi.proto

import com.unified.health.core.ble.protocol.MalformedPayloadException

/**
 * `w90` -- step 1 of `WearAuthV2`'s nonce handshake, `sendAppVerify` (protocol §6.1 [V]):
 * `{1: bytes appRandom(16), 2: string appDeviceId, 3: bool hasOob}`.
 *
 * [appDeviceId] is "optional; required by Wear OS watches, optional for bands" per the doc; this
 * driver never targets Wear OS (protocol §0.3 [V]), so it is only emitted when non-empty.
 * [hasOob] is hardcoded to `false` by the caller -- see the TODO on
 * `XiaomiAuthenticatorImpl.sendAppVerify`.
 */
internal data class W90(
    val appRandom: ByteArray,
    val appDeviceId: String? = null,
    val hasOob: Boolean = false,
) {
    init {
        require(appRandom.size == RANDOM_SIZE) { "appRandom must be $RANDOM_SIZE bytes, was ${appRandom.size}" }
    }

    fun encode(): ByteArray {
        val writer = ProtoWriter()
        writer.bytesField(FIELD_APP_RANDOM, appRandom)
        if (!appDeviceId.isNullOrEmpty()) writer.stringField(FIELD_APP_DEVICE_ID, appDeviceId)
        writer.boolField(FIELD_HAS_OOB, hasOob)
        return writer.toByteArray()
    }

    companion object {
        const val RANDOM_SIZE = 16
        private const val FIELD_APP_RANDOM = 1
        private const val FIELD_APP_DEVICE_ID = 2
        private const val FIELD_HAS_OOB = 3
    }
}

/**
 * `ca0` -- `WearAuthV2`'s `DeviceVerify` reply to [W90] (protocol §6.1 [V]):
 * `{1: bytes deviceRandom(16), 2: bytes deviceSign(32)}`. This driver only ever receives a `ca0`
 * (the watch sends it), so [encode] exists only for tests that script the watch side.
 */
internal data class Ca0(val deviceRandom: ByteArray, val deviceSign: ByteArray) {
    fun encode(): ByteArray = ProtoWriter()
        .bytesField(FIELD_DEVICE_RANDOM, deviceRandom)
        .bytesField(FIELD_DEVICE_SIGN, deviceSign)
        .toByteArray()

    companion object {
        private const val FIELD_DEVICE_RANDOM = 1
        private const val FIELD_DEVICE_SIGN = 2

        /** @throws MalformedPayloadException if either field is missing. */
        fun decode(bytes: ByteArray): Ca0 {
            val reader = ProtoReader(bytes)
            var deviceRandom: ByteArray? = null
            var deviceSign: ByteArray? = null
            while (reader.hasRemaining) {
                val tag = reader.readTag()
                when (tag.fieldNumber) {
                    FIELD_DEVICE_RANDOM -> reader.lengthDelimitedOrSkip(tag)?.let { deviceRandom = it }
                    FIELD_DEVICE_SIGN -> reader.lengthDelimitedOrSkip(tag)?.let { deviceSign = it }
                    else -> reader.skip(tag.wireType)
                }
            }
            return Ca0(
                deviceRandom = deviceRandom ?: throw MalformedPayloadException("ca0 is missing field 1 (deviceRandom)"),
                deviceSign = deviceSign ?: throw MalformedPayloadException("ca0 is missing field 2 (deviceSign)"),
            )
        }
    }
}

/**
 * `dc0` (protocol §6.1 step 3 [V]) / `cc0` (protocol §7.2 step 11 [V]) -- identical wire layout,
 * the app's own device-info blob, AES-CCM-encrypted and sent as `t90.encryptedInfo` /
 * `wa0.cc0` respectively: `{1: int32 0, 2: float sdkInt, 3: string model, 4: uint32
 * appCapability, 5: string region, 6: string "" (unused)}`.
 *
 * Byte-for-byte confirmed against `XIAOMI_TEST_VECTORS.json`'s `authCcm.dc0_hex` [V]: that vector
 * has no field 4 at all when `appCapability == 0` and no field 6 ever, which [encode] matches --
 * field 6 is "unused" per the doc and is never emitted; field 4 is emitted only when non-zero.
 * Given a named type `dc0`/`cc0` depending on call site would duplicate this class for no benefit,
 * since both the doc and the vendor source model them as the exact same fields.
 */
internal data class AppDeviceInfo(
    val sdkInt: Float,
    val model: String,
    val appCapability: Int = 0,
    val region: String = "",
) {
    fun encode(): ByteArray {
        val writer = ProtoWriter()
        writer.int32Field(FIELD_CONST_ZERO, 0)
        writer.floatField(FIELD_SDK_INT, sdkInt)
        writer.stringField(FIELD_MODEL, model)
        if (appCapability != 0) writer.int32Field(FIELD_APP_CAPABILITY, appCapability)
        if (region.isNotEmpty()) writer.stringField(FIELD_REGION, region)
        return writer.toByteArray()
    }

    private companion object {
        const val FIELD_CONST_ZERO = 1
        const val FIELD_SDK_INT = 2
        const val FIELD_MODEL = 3
        const val FIELD_APP_CAPABILITY = 4
        const val FIELD_REGION = 5
    }
}

/**
 * `t90` -- step 3 of `WearAuthV2`'s nonce handshake, `sendAppConfirm` (protocol §6.1 [V]):
 * `{1: bytes appSign(32), 2: bytes encryptedInfo}`, where [encryptedInfo] is an
 * AES-CCM-encrypted [AppDeviceInfo].
 */
internal data class T90(val appSign: ByteArray, val encryptedInfo: ByteArray) {
    fun encode(): ByteArray {
        val writer = ProtoWriter()
        writer.bytesField(FIELD_APP_SIGN, appSign)
        writer.bytesField(FIELD_ENCRYPTED_INFO, encryptedInfo)
        return writer.toByteArray()
    }

    private companion object {
        const val FIELD_APP_SIGN = 1
        const val FIELD_ENCRYPTED_INFO = 2
    }
}

/**
 * `z90` -- `WearAuthV2`'s final `DeviceConfirm` reply (protocol §6.1 [V]):
 * `{1: bool confirmed, 2: int32 deviceCapability, 3: int32 deviceCapabilityV2}`. This driver only
 * ever receives a `z90`, so [encode] exists only for tests that script the watch side.
 */
internal data class Z90(
    val confirmed: Boolean,
    val deviceCapability: Int? = null,
    val deviceCapabilityV2: Int? = null,
) {
    fun encode(): ByteArray {
        val writer = ProtoWriter().boolField(FIELD_CONFIRMED, confirmed)
        deviceCapability?.let { writer.int32Field(FIELD_DEVICE_CAPABILITY, it) }
        deviceCapabilityV2?.let { writer.int32Field(FIELD_DEVICE_CAPABILITY_V2, it) }
        return writer.toByteArray()
    }

    companion object {
        private const val FIELD_CONFIRMED = 1
        private const val FIELD_DEVICE_CAPABILITY = 2
        private const val FIELD_DEVICE_CAPABILITY_V2 = 3

        fun decode(bytes: ByteArray): Z90 {
            val reader = ProtoReader(bytes)
            var confirmed = false
            var deviceCapability: Int? = null
            var deviceCapabilityV2: Int? = null
            while (reader.hasRemaining) {
                val tag = reader.readTag()
                when (tag.fieldNumber) {
                    FIELD_CONFIRMED -> reader.varintOrSkip(tag)?.let { confirmed = it != 0L }
                    FIELD_DEVICE_CAPABILITY -> reader.varintOrSkip(tag)?.let { deviceCapability = it.toInt() }
                    FIELD_DEVICE_CAPABILITY_V2 -> reader.varintOrSkip(tag)?.let { deviceCapabilityV2 = it.toInt() }
                    else -> reader.skip(tag.wireType)
                }
            }
            return Z90(confirmed, deviceCapability, deviceCapabilityV2)
        }
    }
}
