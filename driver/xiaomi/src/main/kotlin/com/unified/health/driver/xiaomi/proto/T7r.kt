package com.unified.health.driver.xiaomi.proto

/**
 * `t7r` (`WearPacket`) -- the V2 session-auth envelope, sent/received over L2 channel 1, type 100
 * (plaintext) during the pre-auth handshake (protocol §6.1 [V]):
 * `{1: varint always 1, 2: varint msgId, 3: message q90}`.
 *
 * This file only implements the envelope framing; the actual auth messages carried in field 3
 * ([Q90]'s `w90`/`ca0`/`t90`/`z90` oneof slots) are cryptographic payloads owned by
 * `auth/XiaomiAuthenticator.kt` (HKDF/HMAC/AES-CCM) and are passed through here as opaque bytes.
 */
internal data class T7r(val msgId: Int, val q90: ByteArray? = null) {
    fun encode(): ByteArray {
        val writer = ProtoWriter()
        writer.int32Field(FIELD_CONST, CONST_VALUE)
        writer.int32Field(FIELD_MSG_ID, msgId)
        q90?.let { writer.messageField(FIELD_Q90, it) }
        return writer.toByteArray()
    }

    companion object {
        /** `CMD_NONCE`: step 1, `sendAppVerify` (protocol §6.1 [V]). */
        const val CMD_NONCE = 26

        /** `CMD_AUTH`: step 3, `sendAppConfirm` (protocol §6.1 [V]). */
        const val CMD_AUTH = 27

        /** `CMD_SEND_USERID`: V1's only auth message (protocol §6.2 [V], `WearAuthV1.e()`). */
        const val CMD_SEND_USERID = 5

        private const val FIELD_CONST = 1
        private const val FIELD_MSG_ID = 2
        private const val FIELD_Q90 = 3
        private const val CONST_VALUE = 1

        fun decode(bytes: ByteArray): T7r {
            val reader = ProtoReader(bytes)
            var msgId = 0
            var q90: ByteArray? = null
            while (reader.hasRemaining) {
                val tag = reader.readTag()
                when (tag.fieldNumber) {
                    FIELD_MSG_ID -> reader.varintOrSkip(tag)?.let { msgId = it.toInt() }
                    FIELD_Q90 -> reader.lengthDelimitedOrSkip(tag)?.let { q90 = it }
                    // field 1 is always the literal constant 1; nothing to validate against.
                    else -> reader.skip(tag.wireType)
                }
            }
            return T7r(msgId, q90)
        }
    }
}
