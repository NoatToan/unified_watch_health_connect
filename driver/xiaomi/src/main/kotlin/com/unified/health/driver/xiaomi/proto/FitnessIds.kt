package com.unified.health.driver.xiaomi.proto

import com.unified.health.core.ble.protocol.ByteReader
import com.unified.health.core.ble.protocol.ByteWriter
import com.unified.health.core.ble.protocol.MalformedPayloadException

/**
 * 7-byte `FitnessDataId`, little-endian (protocol §9.3 [V]):
 * ```
 * bytes 0..3 : uint32 timestamp (seconds)
 * byte  4    : int8   timezone, 15-minute units (signed)
 * byte  5    : uint8  version
 * byte  6    : uint8  typeByte = (dataType << 7) | (subType << 2) | fileType
 * ```
 * `dataType 0` = daily data (`subType` is the doc's `dailyType`), `dataType 1` = sport (`subType`
 * is `sportType`). The doc also mentions a 6-byte "server-ID" variant that drops the type byte for
 * daily data; this driver always encodes/decodes the full 7-byte device id ([SIZE]), since every
 * command this module implements (§9.3 table) uses it.
 */
internal data class FitnessDataId(
    val timestampSeconds: Long,
    val timezone15min: Int,
    val version: Int,
    val dataType: Int,
    val subType: Int,
    val fileType: Int,
) {
    fun encode(): ByteArray {
        require(timestampSeconds in 0..0xFFFFFFFFL) { "timestampSeconds out of u32 range: $timestampSeconds" }
        require(timezone15min in -128..127) { "timezone15min out of s8 range: $timezone15min" }
        require(version in 0..0xFF) { "version out of u8 range: $version" }
        require(dataType in 0..1) { "dataType must be 0 (daily) or 1 (sport), was $dataType" }
        require(subType in 0..0x1F) { "subType must fit 5 bits, was $subType" }
        require(fileType in 0..0x3) { "fileType must fit 2 bits, was $fileType" }
        val typeByte = (dataType shl 7) or (subType shl 2) or fileType
        val writer = ByteWriter(SIZE)
        writer.u32le(timestampSeconds)
        writer.u8(timezone15min and 0xFF)
        writer.u8(version)
        writer.u8(typeByte)
        return writer.toByteArray()
    }

    companion object {
        const val SIZE = 7
        const val SERVER_ID_SIZE = 6
        const val DATA_TYPE_DAILY = 0
        const val DATA_TYPE_SPORT = 1

        /** @throws MalformedPayloadException if [bytes] is not exactly [SIZE] bytes long. */
        fun decode(bytes: ByteArray): FitnessDataId {
            if (bytes.size != SIZE) throw MalformedPayloadException("FitnessDataId must be $SIZE bytes, was ${bytes.size}")
            val reader = ByteReader(bytes)
            val timestamp = reader.u32le()
            val timezone = reader.s8()
            val version = reader.u8()
            val typeByte = reader.u8()
            val dataType = (typeByte ushr 7) and 0x1
            val subType = (typeByte ushr 2) and 0x1F
            val fileType = typeByte and 0x3
            return FitnessDataId(timestamp, timezone, version, dataType, subType, fileType)
        }
    }
}

/**
 * `ur9` -- the fitness-ID exchange payload, `s7r.field10` for every `e = 8` (fitness) command
 * (protocol §9.3 [V]). The vendor reuses the same field numbers for different purposes depending
 * on which `f` command is in play, so this class exposes them by wire position rather than a
 * fixed request/response name; the factory functions below pick the right one for each request.
 *
 * Confirmed byte-for-byte against `docs/protocols/XIAOMI_TEST_VECTORS.json`:
 * - `fitnessTodayIds` (f=1 request): field 5 = [Nu9].
 * - `fitnessRequestOne`/`fitnessConfirm` (f=4/f=5 request): field 3 = one raw [FitnessDataId].
 *
 * TODO(xiaomi-protocol): the doc's prose for the *response* to f=1/f=2 ("field 2 = one raw id,
 * field 3 = concatenated ids") reads backwards from the request-side mapping above and has no
 * byte vector to confirm it (`ur9.d0()`/`ur9.e0()` in the evidence accept either). Verify on a
 * real watch which field the response actually uses before the fitness-sync milestone relies on
 * it; until then, treat both [field2Bytes] and [field3Bytes] on a *decoded* `Ur9` as "ids, exact
 * field TBD" and use [decodeIds] on whichever one is non-null.
 */
internal data class Ur9(
    val field2Bytes: ByteArray? = null,
    val field3Bytes: ByteArray? = null,
    val nu9: ByteArray? = null,
) {
    fun encode(): ByteArray {
        val writer = ProtoWriter()
        field2Bytes?.let { writer.bytesField(FIELD_2, it) }
        field3Bytes?.let { writer.bytesField(FIELD_3, it) }
        nu9?.let { writer.messageField(FIELD_NU9, it) }
        return writer.toByteArray()
    }

    companion object {
        const val FIELD_2 = 2
        const val FIELD_3 = 3
        const val FIELD_NU9 = 5

        /** f=3 request: multiple concatenated 7-byte ids. */
        fun requestMany(ids: List<FitnessDataId>): Ur9 = Ur9(field2Bytes = concatenate(ids))

        /** f=4 request (one id) / f=5 request (confirm one id): a single 7-byte id. */
        fun requestOne(id: FitnessDataId): Ur9 = Ur9(field3Bytes = id.encode())

        /** f=1 request: today's ids, `nu9{1: isAutoSync}`. */
        fun requestToday(isAutoSync: Boolean): Ur9 = Ur9(nu9 = Nu9(isAutoSync).encode())

        private fun concatenate(ids: List<FitnessDataId>): ByteArray {
            val writer = ByteWriter(ids.size * FitnessDataId.SIZE)
            ids.forEach { writer.bytes(it.encode()) }
            return writer.toByteArray()
        }

        /** Splits a concatenated id blob ([field2Bytes]/[field3Bytes]) into 7-byte ids. */
        fun decodeIds(bytes: ByteArray): List<FitnessDataId> {
            if (bytes.size % FitnessDataId.SIZE != 0) {
                throw MalformedPayloadException("Fitness id blob of ${bytes.size} bytes is not a multiple of ${FitnessDataId.SIZE}")
            }
            return bytes.toList().chunked(FitnessDataId.SIZE).map { FitnessDataId.decode(it.toByteArray()) }
        }

        fun decode(bytes: ByteArray): Ur9 {
            val reader = ProtoReader(bytes)
            var field2: ByteArray? = null
            var field3: ByteArray? = null
            var nu9: ByteArray? = null
            while (reader.hasRemaining) {
                val tag = reader.readTag()
                when (tag.fieldNumber) {
                    FIELD_2 -> reader.lengthDelimitedOrSkip(tag)?.let { field2 = it }
                    FIELD_3 -> reader.lengthDelimitedOrSkip(tag)?.let { field3 = it }
                    FIELD_NU9 -> reader.lengthDelimitedOrSkip(tag)?.let { nu9 = it }
                    else -> reader.skip(tag.wireType)
                }
            }
            return Ur9(field2, field3, nu9)
        }
    }
}

/** `nu9` -- `ur9.field5`'s sub-message for the f=1 "today ids" request (protocol §9.3 [V]). */
internal data class Nu9(val isAutoSync: Boolean) {
    fun encode(): ByteArray = ProtoWriter().boolField(FIELD_IS_AUTO_SYNC, isAutoSync).toByteArray()

    companion object {
        private const val FIELD_IS_AUTO_SYNC = 1

        fun decode(bytes: ByteArray): Nu9 {
            val reader = ProtoReader(bytes)
            var isAutoSync = false
            while (reader.hasRemaining) {
                val tag = reader.readTag()
                if (tag.fieldNumber == FIELD_IS_AUTO_SYNC) {
                    reader.varintOrSkip(tag)?.let { isAutoSync = it != 0L }
                } else {
                    reader.skip(tag.wireType)
                }
            }
            return Nu9(isAutoSync)
        }
    }
}
