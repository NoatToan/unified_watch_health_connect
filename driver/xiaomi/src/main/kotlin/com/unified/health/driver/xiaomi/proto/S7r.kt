package com.unified.health.driver.xiaomi.proto

import com.unified.health.core.ble.driver.WearableProtocolException
import com.unified.health.core.ble.protocol.MalformedPayloadException

/**
 * `s7r` -- the envelope for every post-auth device command/response, sent as L2 channel 1 / type
 * 101 (AES-CTR once authenticated) or type 100 (plaintext, e.g. the bind probe) (protocol §9.1
 * [V]). [e] is the device/message class (`1` bind, `2` system, `8` fitness, `22` mass); [f] is the
 * command id inside that class. [errorCode] (field 100) is non-null only on a failure response; a
 * response with no payload and no error is a bare success (protocol §9.1 [V]: `s7r.J()`/`s7r.s()`).
 *
 * Field numbers 1/2/100 and the three oneof slots modelled here ([p90] field 3, [txo] field 4,
 * [ur9] field 10) were confirmed byte-for-byte against `docs/protocols/XIAOMI_TEST_VECTORS.json`
 * (`getBindInfo`, `timeSync`, `batteryRequest`, `fitnessTodayIds`/`fitnessRequestOne`/
 * `fitnessConfirm`) [V]. The doc's remaining oneof slots (6 v5r, 7 csg, 9 qxg, 11 ive, 12 e9r,
 * 13 xgo, 14 z93, 15 x69, 16 m01, 17 m5f, 18 x0b, 19 k14, 20 vkf, 21 udd, 22 jcp, 23 dg4, 24 f6f,
 * 25 ude) are not exercised by any command this module implements and are intentionally left
 * unmodelled; add a slot here if a later milestone needs one -- this is the extension point.
 */
internal data class S7r(
    val e: Int,
    val f: Int,
    val p90: ByteArray? = null,
    val txo: ByteArray? = null,
    val ur9: ByteArray? = null,
    val errorCode: Int? = null,
) {
    fun encode(): ByteArray {
        val writer = ProtoWriter()
        writer.int32Field(FIELD_E, e)
        writer.int32Field(FIELD_F, f)
        p90?.let { writer.messageField(FIELD_P90, it) }
        txo?.let { writer.messageField(FIELD_TXO, it) }
        ur9?.let { writer.messageField(FIELD_UR9, it) }
        errorCode?.let { writer.int32Field(FIELD_ERROR, it) }
        return writer.toByteArray()
    }

    /** @throws XiaomiDeviceErrorException when [errorCode] is set (field 100, protocol §9.1/§9.6 [V]). */
    fun throwOnError() {
        val code = errorCode
        if (code != null && code != 0) throw XiaomiDeviceErrorException(code, e, f)
    }

    companion object {
        const val FIELD_E = 1
        const val FIELD_F = 2
        const val FIELD_P90 = 3
        const val FIELD_TXO = 4
        const val FIELD_UR9 = 10
        const val FIELD_ERROR = 100

        /** Device/message classes this module addresses (protocol §9.1/§9.2/§9.3 [V]). */
        const val CLASS_BIND = 1
        const val CLASS_SYSTEM = 2
        const val CLASS_FITNESS = 8

        /**
         * The oneof field MiWear uses for [e]'s payload -- confirmed for the three classes this
         * module implements (see the class KDoc); `null` for any other class.
         */
        fun payloadFieldFor(e: Int): Int? = when (e) {
            CLASS_BIND -> FIELD_P90
            CLASS_SYSTEM -> FIELD_TXO
            CLASS_FITNESS -> FIELD_UR9
            else -> null
        }

        /**
         * Builds a request for `(e, f)`, placing [payload] in the oneof slot [payloadFieldFor]
         * selects for [e].
         * @throws MalformedPayloadException if [payload] is non-null but [e] has no known slot.
         */
        fun request(e: Int, f: Int, payload: ByteArray? = null): S7r {
            if (payload == null) return S7r(e, f)
            return when (payloadFieldFor(e)) {
                FIELD_P90 -> S7r(e, f, p90 = payload)
                FIELD_TXO -> S7r(e, f, txo = payload)
                FIELD_UR9 -> S7r(e, f, ur9 = payload)
                else -> throw MalformedPayloadException("No known s7r payload slot for class $e")
            }
        }

        fun decode(bytes: ByteArray): S7r {
            val reader = ProtoReader(bytes)
            var e = 0
            var f = 0
            var p90: ByteArray? = null
            var txo: ByteArray? = null
            var ur9: ByteArray? = null
            var error: Int? = null
            while (reader.hasRemaining) {
                val tag = reader.readTag()
                when (tag.fieldNumber) {
                    FIELD_E -> reader.varintOrSkip(tag)?.let { e = it.toInt() }
                    FIELD_F -> reader.varintOrSkip(tag)?.let { f = it.toInt() }
                    FIELD_P90 -> reader.lengthDelimitedOrSkip(tag)?.let { p90 = it }
                    FIELD_TXO -> reader.lengthDelimitedOrSkip(tag)?.let { txo = it }
                    FIELD_UR9 -> reader.lengthDelimitedOrSkip(tag)?.let { ur9 = it }
                    FIELD_ERROR -> reader.varintOrSkip(tag)?.let { error = it.toInt() }
                    else -> reader.skip(tag.wireType)
                }
            }
            return S7r(e, f, p90, txo, ur9, error)
        }
    }
}

/** `s7r.field100` ([S7r.errorCode]) was non-zero (protocol §9.1/§9.6 [V]). */
internal class XiaomiDeviceErrorException(val errorCode: Int, val e: Int, val f: Int) :
    WearableProtocolException(messageFor(errorCode, e, f)) {

    private companion object {
        /**
         * Code 4 = not bound / wrong app identity (protocol §6.1/§9.6 [V]); every other non-zero
         * code is "treat as retryable failure" per §9.6, so the message stays generic for those.
         */
        fun messageFor(code: Int, e: Int, f: Int): String = when (code) {
            4 -> "Xiaomi watch reported error 4 (not bound / wrong app identity) for class $e command $f"
            else -> "Xiaomi watch reported error $code for class $e command $f"
        }
    }
}
