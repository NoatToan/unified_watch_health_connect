package com.unified.health.driver.xiaomi.proto

/**
 * `q90` -- the oneof payload carried in [T7r]'s field 3 during V2 session auth (protocol §6.1
 * [V]): `{30: message w90 (AppVerify), 31: message ca0 (DeviceVerify), 32: message t90
 * (AppConfirm), 33: message z90 (DeviceConfirm), 3: varint errorCode}`.
 *
 * Only the envelope -- which oneof slot is present, plus the local error code -- is modelled
 * here; `w90`/`ca0`/`t90`/`z90` themselves carry nonces, HMAC signs and AES-CCM ciphertext and are
 * owned by `auth/XiaomiAuthenticator.kt`, which reads/writes them directly as the raw bytes these
 * accessors expose. This is the extension point: the auth agent builds those messages with
 * [com.unified.health.driver.xiaomi.proto.ProtoWriter]/[com.unified.health.driver.xiaomi.proto.ProtoReader]
 * and hands the resulting bytes to [Q90]'s constructor/accessors.
 */
internal data class Q90(
    val appVerify: ByteArray? = null,
    val deviceVerify: ByteArray? = null,
    val appConfirm: ByteArray? = null,
    val deviceConfirm: ByteArray? = null,
    val errorCode: Int? = null,
) {
    fun encode(): ByteArray {
        val writer = ProtoWriter()
        errorCode?.let { writer.int32Field(FIELD_ERROR, it) }
        appVerify?.let { writer.messageField(FIELD_APP_VERIFY, it) }
        deviceVerify?.let { writer.messageField(FIELD_DEVICE_VERIFY, it) }
        appConfirm?.let { writer.messageField(FIELD_APP_CONFIRM, it) }
        deviceConfirm?.let { writer.messageField(FIELD_DEVICE_CONFIRM, it) }
        return writer.toByteArray()
    }

    companion object {
        const val FIELD_ERROR = 3
        const val FIELD_APP_VERIFY = 30
        const val FIELD_DEVICE_VERIFY = 31
        const val FIELD_APP_CONFIRM = 32
        const val FIELD_DEVICE_CONFIRM = 33

        /** Device not bound / wrong app identity (protocol §6.1 [V]). */
        const val ERROR_NOT_BOUND = 4

        fun decode(bytes: ByteArray): Q90 {
            val reader = ProtoReader(bytes)
            var appVerify: ByteArray? = null
            var deviceVerify: ByteArray? = null
            var appConfirm: ByteArray? = null
            var deviceConfirm: ByteArray? = null
            var error: Int? = null
            while (reader.hasRemaining) {
                val tag = reader.readTag()
                when (tag.fieldNumber) {
                    FIELD_APP_VERIFY -> reader.lengthDelimitedOrSkip(tag)?.let { appVerify = it }
                    FIELD_DEVICE_VERIFY -> reader.lengthDelimitedOrSkip(tag)?.let { deviceVerify = it }
                    FIELD_APP_CONFIRM -> reader.lengthDelimitedOrSkip(tag)?.let { appConfirm = it }
                    FIELD_DEVICE_CONFIRM -> reader.lengthDelimitedOrSkip(tag)?.let { deviceConfirm = it }
                    FIELD_ERROR -> reader.varintOrSkip(tag)?.let { error = it.toInt() }
                    else -> reader.skip(tag.wireType)
                }
            }
            return Q90(appVerify, deviceVerify, appConfirm, deviceConfirm, error)
        }
    }
}
