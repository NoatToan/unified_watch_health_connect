package com.unified.health.driver.xiaomi.proto

import com.unified.health.core.ble.protocol.MalformedPayloadException

/**
 * `p90` -- the generic binding envelope carried in `s7r.field3` for every `e = 1` (bind) message
 * (protocol §7 [V]). The bind *probe* slots are field 11 ([Sb0], outgoing `getBindInfo` request)
 * and field 12 ([Ha0], its response); `p90`'s own `field 3` error code is distinct from
 * `s7r.field100` (protocol §7.1/§7.5 [V], e.g. code `1` means "device already bound").
 *
 * Fields 17/18/19/20/29 are the `LocalWearBinderV2` no-cloud bind handshake (protocol §7.2 [V]:
 * [Na0] app ECDH key, [Ta0] device ECDH key + sign, [Ka0] app confirm, [Qa0] device confirm,
 * [Pb0] the AES-CCM-wrapped bind result) -- added here by `auth/XiaomiAuthenticatorImpl.kt`
 * (M2), which this class's own KDoc had flagged as the extension point for them. The PSK/cloud
 * slots (§7.3/§7.4: fields 13-16) remain unmodelled -- that bind mode is out of scope (D-1193).
 */
internal data class P90(
    val sb0: ByteArray? = null,
    val ha0: ByteArray? = null,
    val errorCode: Int? = null,
    val na0: ByteArray? = null,
    val ta0: ByteArray? = null,
    val ka0: ByteArray? = null,
    val qa0: ByteArray? = null,
    val pb0: ByteArray? = null,
) {
    fun encode(): ByteArray {
        val writer = ProtoWriter()
        sb0?.let { writer.messageField(FIELD_SB0, it) }
        ha0?.let { writer.messageField(FIELD_HA0, it) }
        errorCode?.let { writer.int32Field(FIELD_ERROR, it) }
        na0?.let { writer.messageField(FIELD_NA0, it) }
        ta0?.let { writer.messageField(FIELD_TA0, it) }
        ka0?.let { writer.messageField(FIELD_KA0, it) }
        qa0?.let { writer.messageField(FIELD_QA0, it) }
        pb0?.let { writer.messageField(FIELD_PB0, it) }
        return writer.toByteArray()
    }

    companion object {
        const val FIELD_ERROR = 3
        const val FIELD_SB0 = 11
        const val FIELD_HA0 = 12
        const val FIELD_NA0 = 17
        const val FIELD_TA0 = 18
        const val FIELD_KA0 = 19
        const val FIELD_QA0 = 20
        const val FIELD_PB0 = 29

        /** "Device already bound" (protocol §7.1/§7.5 [V]; distinct from the §7.5 vendor-callback codes 1002+). */
        const val ERROR_ALREADY_BOUND = 1

        fun decode(bytes: ByteArray): P90 {
            val reader = ProtoReader(bytes)
            var sb0: ByteArray? = null
            var ha0: ByteArray? = null
            var error: Int? = null
            var na0: ByteArray? = null
            var ta0: ByteArray? = null
            var ka0: ByteArray? = null
            var qa0: ByteArray? = null
            var pb0: ByteArray? = null
            while (reader.hasRemaining) {
                val tag = reader.readTag()
                when (tag.fieldNumber) {
                    FIELD_SB0 -> reader.lengthDelimitedOrSkip(tag)?.let { sb0 = it }
                    FIELD_HA0 -> reader.lengthDelimitedOrSkip(tag)?.let { ha0 = it }
                    FIELD_ERROR -> reader.varintOrSkip(tag)?.let { error = it.toInt() }
                    FIELD_NA0 -> reader.lengthDelimitedOrSkip(tag)?.let { na0 = it }
                    FIELD_TA0 -> reader.lengthDelimitedOrSkip(tag)?.let { ta0 = it }
                    FIELD_KA0 -> reader.lengthDelimitedOrSkip(tag)?.let { ka0 = it }
                    FIELD_QA0 -> reader.lengthDelimitedOrSkip(tag)?.let { qa0 = it }
                    FIELD_PB0 -> reader.lengthDelimitedOrSkip(tag)?.let { pb0 = it }
                    else -> reader.skip(tag.wireType)
                }
            }
            return P90(sb0, ha0, error, na0, ta0, ka0, qa0, pb0)
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
