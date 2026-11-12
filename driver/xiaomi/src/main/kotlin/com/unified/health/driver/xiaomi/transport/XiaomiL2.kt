package com.unified.health.driver.xiaomi.transport

import com.unified.health.core.ble.protocol.ByteReader
import com.unified.health.core.ble.protocol.ByteWriter
import com.unified.health.core.ble.protocol.MalformedPayloadException
import com.unified.health.driver.xiaomi.XiaomiChannel

/** `opCode` values for [L2Frame] (protocol §4 [V]). */
internal object XiaomiOpCode {
    const val WRITE = 1
    const val WRITE_ENC = 2
    const val READ = 3
}

/**
 * L2 -- channel + opCode framing (protocol §4 [V]). The L1 payload is exactly one L2 frame:
 * `byte0 = channel, byte1 = opCode, byte2.. = payload` (protobuf in every channel this module
 * uses). Responses are matched by the *derived type* (channel + opCode folded together, see
 * [L2Frame.typeFor]), not by a request id.
 *
 * Encryption (AES-128-CTR, key = IV) is **not** implemented here: [L2Frame.encode]/[L2Frame.decode]
 * take `encrypt`/`decrypt` hooks supplied by the session (identity by default), applied exactly
 * where the doc says to -- outgoing `opCode == WRITE_ENC`, incoming `opCode == WRITE_ENC` -- so
 * the crypto/auth agent only has to implement those two functions and never has to touch framing.
 *
 * TODO(xiaomi-protocol): the doc also marks channel 8 (Lyra, type 112) as always-encrypted
 * outgoing regardless of the opCode byte (§4); no command in this module uses channel 8, so that
 * case is intentionally not wired up here -- apply the same `encrypt` hook there too if a later
 * milestone adds Lyra support.
 */
internal data class L2Frame(val channel: Int, val opCode: Int, val payload: ByteArray) {

    companion object {
        const val TYPE_PB_PLAINTEXT = 100
        const val TYPE_PB_ENCRYPTED = 101

        /**
         * Derived "type" used to match a response to the request that caused it (protocol §4 [V]):
         * channel 1 ([XiaomiChannel.PROTOBUF]) splits into [TYPE_PB_PLAINTEXT]/[TYPE_PB_ENCRYPTED]
         * by opCode; every other channel maps to one fixed type regardless of opCode.
         */
        private val FIXED_TYPES: Map<Int, Int> = mapOf(
            XiaomiChannel.MASS.id to 104,
            XiaomiChannel.MASS_VOICE.id to 103,
            XiaomiChannel.FILE_SENSOR.id to 107,
            XiaomiChannel.FILE_FITNESS.id to 102,
            XiaomiChannel.OTA.id to 105,
            XiaomiChannel.NETWORK.id to 108,
            XiaomiChannel.LYRA.id to 112,
            XiaomiChannel.RESEARCH.id to 113,
        )

        /** @return the derived type for `(channel, opCode)`, or null for an unmapped channel. */
        fun typeFor(channel: Int, opCode: Int): Int? {
            if (channel == XiaomiChannel.PROTOBUF.id) {
                return if (opCode == XiaomiOpCode.WRITE_ENC) TYPE_PB_ENCRYPTED else TYPE_PB_PLAINTEXT
            }
            return FIXED_TYPES[channel]
        }

        /**
         * Reverse of [typeFor]: the `(channel, opCode)` that produces [type], used by
         * [XiaomiLink.requestRaw] to frame an outgoing message from a target type.
         *
         * [TYPE_PB_PLAINTEXT]/[TYPE_PB_ENCRYPTED] map back to channel 1 with [XiaomiOpCode.WRITE]/
         * [XiaomiOpCode.WRITE_ENC] [V]. For the other, single-type channels this module never
         * requests on (mass/voice/sensor/fitness-file/OTA/network/Lyra/research), [XiaomiOpCode.WRITE]
         * is the inferred opCode [I] -- TODO(xiaomi-protocol): confirm against a real watch before a
         * later milestone issues a [XiaomiLink.requestRaw] on one of those channels.
         */
        fun channelAndOpCodeFor(type: Int): Pair<Int, Int>? = when (type) {
            TYPE_PB_PLAINTEXT -> XiaomiChannel.PROTOBUF.id to XiaomiOpCode.WRITE
            TYPE_PB_ENCRYPTED -> XiaomiChannel.PROTOBUF.id to XiaomiOpCode.WRITE_ENC
            else -> FIXED_TYPES.entries.firstOrNull { it.value == type }?.let { it.key to XiaomiOpCode.WRITE }
        }

        /**
         * Builds the L1-payload bytes for one outgoing L2 message, applying [encrypt] to
         * [plaintextPayload] exactly when `opCode == WRITE_ENC` (protocol §4 [V]). `encrypt`
         * defaults to identity, i.e. plaintext, for every channel/opCode that does not need it.
         */
        fun encode(
            channel: Int,
            opCode: Int,
            plaintextPayload: ByteArray,
            encrypt: (ByteArray) -> ByteArray = { it },
        ): ByteArray {
            require(channel in 0..0xFF) { "channel must fit a byte, was $channel" }
            require(opCode in 0..0xFF) { "opCode must fit a byte, was $opCode" }
            val payload = if (opCode == XiaomiOpCode.WRITE_ENC) encrypt(plaintextPayload) else plaintextPayload
            val writer = ByteWriter(2 + payload.size)
            writer.u8(channel)
            writer.u8(opCode)
            writer.bytes(payload)
            return writer.toByteArray()
        }

        /**
         * Parses an inbound L1-payload into an [L2Frame], applying [decrypt] to the payload
         * exactly when `opCode == WRITE_ENC` (protocol §4 [V]: "incoming opCode == 2 is encrypted;
         * decrypt before parsing"). `decrypt` defaults to identity.
         * @throws MalformedPayloadException if [bytes] is shorter than the 2-byte channel/opCode header.
         */
        fun decode(bytes: ByteArray, decrypt: (ByteArray) -> ByteArray = { it }): L2Frame {
            if (bytes.size < 2) throw MalformedPayloadException("L2 frame shorter than its 2-byte header: ${bytes.size} bytes")
            val reader = ByteReader(bytes)
            val channel = reader.u8()
            val opCode = reader.u8()
            val rest = reader.rest()
            val payload = if (opCode == XiaomiOpCode.WRITE_ENC) decrypt(rest) else rest
            return L2Frame(channel, opCode, payload)
        }
    }
}
