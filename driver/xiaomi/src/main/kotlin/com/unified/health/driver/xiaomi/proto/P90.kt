package com.unified.health.driver.xiaomi.proto

import com.unified.health.core.ble.protocol.MalformedPayloadException

/**
 * `p90` -- the generic binding envelope carried in `s7r.field3` for every `e = 1` (bind) message
 * (protocol §7 [V]). Only the oneof slots the non-secret bind *probe* needs are modelled here:
 * field 11 ([Sb0], outgoing `getBindInfo` request) and field 12 ([Ha0], its response), plus `p90`'s
 * own `field 3` error code (distinct from `s7r.field100`; protocol §7.1/§7.5 [V], e.g. code `1`
 * means "device already bound").
 *
 * The many other oneof slots used by the local-bind / PSK-bind handshakes (§7.2-§7.4: fields
 * 13-20, 29) carry cryptographic material (ECDH public keys, HMAC signs, AES-CCM ciphertext) and
 * are intentionally **not** modelled here -- see `auth/XiaomiAuthenticator.kt`, which owns the
 * full bind handshake and is the extension point for those slots.
 */
internal data class P90(
    val sb0: ByteArray? = null,
    val ha0: ByteArray? = null,
    val errorCode: Int? = null,
) {
    fun encode(): ByteArray {
        val writer = ProtoWriter()
        sb0?.let { writer.messageField(FIELD_SB0, it) }
        ha0?.let { writer.messageField(FIELD_HA0, it) }
        errorCode?.let { writer.int32Field(FIELD_ERROR, it) }
        return writer.toByteArray()
    }

    companion object {
        const val FIELD_ERROR = 3
        const val FIELD_SB0 = 11
        const val FIELD_HA0 = 12

        fun decode(bytes: ByteArray): P90 {
            val reader = ProtoReader(bytes)
            var sb0: ByteArray? = null
            var ha0: ByteArray? = null
            var error: Int? = null
            while (reader.hasRemaining) {
                val tag = reader.readTag()
                when (tag.fieldNumber) {
                    FIELD_SB0 -> reader.lengthDelimitedOrSkip(tag)?.let { sb0 = it }
                    FIELD_HA0 -> reader.lengthDelimitedOrSkip(tag)?.let { ha0 = it }
                    FIELD_ERROR -> reader.varintOrSkip(tag)?.let { error = it.toInt() }
                    else -> reader.skip(tag.wireType)
                }
            }
            return P90(sb0, ha0, error)
        }
    }
}

/**
 * `sb0` -- `getBindInfo` request payload (protocol §7.1 [V]):
 * `{1: bool dynamicCode, 2: bytes userIdMd5(16)}`. Fields 3 (string) and 4 (int) are normally
 * empty/0 per the doc and are not emitted here.
 */
internal data class Sb0(val dynamicCode: Boolean, val userIdMd5: ByteArray) {
    fun encode(): ByteArray {
        require(userIdMd5.size == MD5_SIZE) { "userIdMd5 must be $MD5_SIZE bytes, was ${userIdMd5.size}" }
        val writer = ProtoWriter()
        writer.boolField(FIELD_DYNAMIC_CODE, dynamicCode)
        writer.bytesField(FIELD_USER_ID_MD5, userIdMd5)
        return writer.toByteArray()
    }

    companion object {
        const val FIELD_DYNAMIC_CODE = 1
        const val FIELD_USER_ID_MD5 = 2
        const val MD5_SIZE = 16
    }
}

/**
 * `ha0` -- `getBindInfo` response payload (protocol §7.1 [V]):
 * `{1: int32 verifyMode, 2: string sn, 3: string mac, 4: string model, 5: int32 oobMode,
 * 6: int32 reserved, 7: string did}`.
 *
 * [verifyMode] `1` = PSK/cloud bind, `2` = local ECDH bind (the only no-cloud path, Gate 0 in the
 * doc §7.1/§12). [oobMode] `0`/`2`/`3` (`3` = button confirm on the watch).
 */
internal data class Ha0(
    val verifyMode: Int,
    val serialNumber: String? = null,
    val mac: String? = null,
    val model: String? = null,
    val oobMode: Int? = null,
    val reserved: Int? = null,
    val did: String? = null,
) {
    companion object {
        const val VERIFY_MODE_PSK_CLOUD = 1
        const val VERIFY_MODE_LOCAL_ECDH = 2
        const val OOB_MODE_BUTTON_CONFIRM = 3

        private const val FIELD_VERIFY_MODE = 1
        private const val FIELD_SN = 2
        private const val FIELD_MAC = 3
        private const val FIELD_MODEL = 4
        private const val FIELD_OOB_MODE = 5
        private const val FIELD_RESERVED = 6
        private const val FIELD_DID = 7

        /** @throws MalformedPayloadException if field 1 (verifyMode) is missing. */
        fun decode(bytes: ByteArray): Ha0 {
            val reader = ProtoReader(bytes)
            var verifyMode: Int? = null
            var sn: String? = null
            var mac: String? = null
            var model: String? = null
            var oobMode: Int? = null
            var reserved: Int? = null
            var did: String? = null
            while (reader.hasRemaining) {
                val tag = reader.readTag()
                when (tag.fieldNumber) {
                    FIELD_VERIFY_MODE -> reader.varintOrSkip(tag)?.let { verifyMode = it.toInt() }
                    FIELD_SN -> reader.lengthDelimitedOrSkip(tag)?.let { sn = it.toString(Charsets.UTF_8) }
                    FIELD_MAC -> reader.lengthDelimitedOrSkip(tag)?.let { mac = it.toString(Charsets.UTF_8) }
                    FIELD_MODEL -> reader.lengthDelimitedOrSkip(tag)?.let { model = it.toString(Charsets.UTF_8) }
                    FIELD_OOB_MODE -> reader.varintOrSkip(tag)?.let { oobMode = it.toInt() }
                    FIELD_RESERVED -> reader.varintOrSkip(tag)?.let { reserved = it.toInt() }
                    FIELD_DID -> reader.lengthDelimitedOrSkip(tag)?.let { did = it.toString(Charsets.UTF_8) }
                    else -> reader.skip(tag.wireType)
                }
            }
            return Ha0(
                verifyMode = verifyMode ?: throw MalformedPayloadException("ha0 is missing field 1 (verifyMode)"),
                serialNumber = sn,
                mac = mac,
                model = model,
                oobMode = oobMode,
                reserved = reserved,
                did = did,
            )
        }
    }
}
