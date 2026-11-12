package com.unified.health.driver.xiaomi.proto

/**
 * `txo` -- the `s7r.field4` payload for every `e = 2` (system) command (protocol §9.1/§9.2 [V]):
 * `{2: message vwo (battery), 3: message swo (watch info), 4: message wxo (set time)}`. Field
 * numbers 2/3 are as documented; field 4 was additionally confirmed byte-for-byte against
 * `docs/protocols/XIAOMI_TEST_VECTORS.json`'s `timeSync` vector (see the codec test).
 */
internal data class Txo(
    val vwo: ByteArray? = null,
    val swo: ByteArray? = null,
    val wxo: ByteArray? = null,
) {
    fun encode(): ByteArray {
        val writer = ProtoWriter()
        vwo?.let { writer.messageField(FIELD_VWO, it) }
        swo?.let { writer.messageField(FIELD_SWO, it) }
        wxo?.let { writer.messageField(FIELD_WXO, it) }
        return writer.toByteArray()
    }

    companion object {
        const val FIELD_VWO = 2
        const val FIELD_SWO = 3
        const val FIELD_WXO = 4

        fun decode(bytes: ByteArray): Txo {
            val reader = ProtoReader(bytes)
            var vwo: ByteArray? = null
            var swo: ByteArray? = null
            var wxo: ByteArray? = null
            while (reader.hasRemaining) {
                val tag = reader.readTag()
                when (tag.fieldNumber) {
                    FIELD_VWO -> reader.lengthDelimitedOrSkip(tag)?.let { vwo = it }
                    FIELD_SWO -> reader.lengthDelimitedOrSkip(tag)?.let { swo = it }
                    FIELD_WXO -> reader.lengthDelimitedOrSkip(tag)?.let { wxo = it }
                    else -> reader.skip(tag.wireType)
                }
            }
            return Txo(vwo, swo, wxo)
        }
    }
}

/**
 * `vwo` -- battery response (protocol §9.2 [V]): `{1: message a{1: uint32 batteryPercent,
 * 2: uint32 chargeStatus, 3: message ChargeInfo{1: uint32 state, 2: uint32 timestampSeconds}}}`.
 * The vendor's own field accessors are named generically (`a.c`/`a.d`/`a.e.c`/`a.e.d`); this
 * driver flattens the two levels of nesting since nothing else needs the intermediate messages.
 */
internal data class Vwo(
    val batteryPercent: Int? = null,
    val chargeStatus: Int? = null,
    val chargeState: Int? = null,
    val chargeTimestampSeconds: Long? = null,
) {
    companion object {
        private const val FIELD_A = 1
        private const val FIELD_A_BATTERY = 1
        private const val FIELD_A_CHARGE_STATUS = 2
        private const val FIELD_A_CHARGE_INFO = 3
        private const val FIELD_CHARGE_INFO_STATE = 1
        private const val FIELD_CHARGE_INFO_TIMESTAMP = 2

        fun decode(bytes: ByteArray): Vwo {
            val reader = ProtoReader(bytes)
            var batteryPercent: Int? = null
            var chargeStatus: Int? = null
            var chargeState: Int? = null
            var chargeTimestamp: Long? = null
            while (reader.hasRemaining) {
                val tag = reader.readTag()
                if (tag.fieldNumber != FIELD_A) {
                    reader.skip(tag.wireType)
                    continue
                }
                val aBytes = reader.lengthDelimitedOrSkip(tag) ?: continue
                val aReader = ProtoReader(aBytes)
                while (aReader.hasRemaining) {
                    val aTag = aReader.readTag()
                    when (aTag.fieldNumber) {
                        FIELD_A_BATTERY -> aReader.varintOrSkip(aTag)?.let { batteryPercent = it.toInt() }
                        FIELD_A_CHARGE_STATUS -> aReader.varintOrSkip(aTag)?.let { chargeStatus = it.toInt() }
                        FIELD_A_CHARGE_INFO -> {
                            val infoBytes = aReader.lengthDelimitedOrSkip(aTag) ?: continue
                            val infoReader = ProtoReader(infoBytes)
                            while (infoReader.hasRemaining) {
                                val infoTag = infoReader.readTag()
                                when (infoTag.fieldNumber) {
                                    FIELD_CHARGE_INFO_STATE -> infoReader.varintOrSkip(infoTag)?.let { chargeState = it.toInt() }
                                    FIELD_CHARGE_INFO_TIMESTAMP -> infoReader.varintOrSkip(infoTag)?.let { chargeTimestamp = it }
                                    else -> infoReader.skip(infoTag.wireType)
                                }
                            }
                        }
                        else -> aReader.skip(aTag.wireType)
                    }
                }
            }
            return Vwo(batteryPercent, chargeStatus, chargeState, chargeTimestamp)
        }
    }
}

/**
 * `swo` -- watch info response (protocol §9.2 [V]): `{1: string serialNumber,
 * 2: string firmwareVersion, 3: unused, 4: string model, 5: unused}`.
 */
internal data class Swo(
    val serialNumber: String? = null,
    val firmwareVersion: String? = null,
    val model: String? = null,
) {
    companion object {
        private const val FIELD_SERIAL = 1
        private const val FIELD_FIRMWARE = 2
        private const val FIELD_MODEL = 4

        fun decode(bytes: ByteArray): Swo {
            val reader = ProtoReader(bytes)
            var serial: String? = null
            var firmware: String? = null
            var model: String? = null
            while (reader.hasRemaining) {
                val tag = reader.readTag()
                when (tag.fieldNumber) {
                    FIELD_SERIAL -> reader.lengthDelimitedOrSkip(tag)?.let { serial = it.toString(Charsets.UTF_8) }
                    FIELD_FIRMWARE -> reader.lengthDelimitedOrSkip(tag)?.let { firmware = it.toString(Charsets.UTF_8) }
                    FIELD_MODEL -> reader.lengthDelimitedOrSkip(tag)?.let { model = it.toString(Charsets.UTF_8) }
                    else -> reader.skip(tag.wireType)
                }
            }
            return Swo(serial, firmware, model)
        }
    }
}

/**
 * `wxo` -- set time/date/timezone request, `txo.field4` (protocol §9.2 [V]):
 * ```
 * wxo { 1: n64{1:u32 year, 2:u32 month, 3:u32 day},
 *       2: t64{1:u32 hour, 2:u32 minute, 3:u32 second, 4:u32 millis},
 *       3: v64{1:sint32 utcOffset15min, 2:sint32 dstOffset15min, 3:string tzId, 4:string unknown},
 *       4: bool is24HourFormat }
 * ```
 * [utcOffset15min]/[dstOffset15min] are `TimeZone.getRawOffset()`/`getDSTSavings()` in 15-minute
 * units, zigzag-encoded. Round-trip and field numbers confirmed byte-for-byte against
 * `docs/protocols/XIAOMI_TEST_VECTORS.json`'s `timeSync` vector (19:30:00.250, UTC+7, "Asia/Ho_Chi_Minh").
 */
internal data class Wxo(
    val year: Int,
    val month: Int,
    val day: Int,
    val hour: Int,
    val minute: Int,
    val second: Int,
    val millis: Int,
    val utcOffset15min: Int,
    val dstOffset15min: Int,
    val tzId: String,
    val is24HourFormat: Boolean,
    val unknown: String? = null,
) {
    fun encode(): ByteArray {
        val n64 = ProtoWriter().int32Field(1, year).int32Field(2, month).int32Field(3, day).toByteArray()
        val t64 = ProtoWriter().int32Field(1, hour).int32Field(2, minute).int32Field(3, second).int32Field(4, millis).toByteArray()
        val v64 = ProtoWriter().zigzag32Field(1, utcOffset15min).zigzag32Field(2, dstOffset15min).stringField(3, tzId).let {
            if (unknown != null) it.stringField(4, unknown) else it
        }.toByteArray()
        return ProtoWriter()
            .messageField(FIELD_N64, n64)
            .messageField(FIELD_T64, t64)
            .messageField(FIELD_V64, v64)
            .boolField(FIELD_IS_24H, is24HourFormat)
            .toByteArray()
    }

    companion object {
        private const val FIELD_N64 = 1
        private const val FIELD_T64 = 2
        private const val FIELD_V64 = 3
        private const val FIELD_IS_24H = 4

        fun decode(bytes: ByteArray): Wxo {
            var year = 0; var month = 0; var day = 0
            var hour = 0; var minute = 0; var second = 0; var millis = 0
            var utcOffset15min = 0; var dstOffset15min = 0; var tzId = ""; var unknown: String? = null
            var is24HourFormat = false
            val reader = ProtoReader(bytes)
            while (reader.hasRemaining) {
                val tag = reader.readTag()
                when (tag.fieldNumber) {
                    FIELD_N64 -> reader.lengthDelimitedOrSkip(tag)?.let { sub ->
                        val r = ProtoReader(sub)
                        while (r.hasRemaining) {
                            val t = r.readTag()
                            when (t.fieldNumber) {
                                1 -> r.varintOrSkip(t)?.let { year = it.toInt() }
                                2 -> r.varintOrSkip(t)?.let { month = it.toInt() }
                                3 -> r.varintOrSkip(t)?.let { day = it.toInt() }
                                else -> r.skip(t.wireType)
                            }
                        }
                    }
                    FIELD_T64 -> reader.lengthDelimitedOrSkip(tag)?.let { sub ->
                        val r = ProtoReader(sub)
                        while (r.hasRemaining) {
                            val t = r.readTag()
                            when (t.fieldNumber) {
                                1 -> r.varintOrSkip(t)?.let { hour = it.toInt() }
                                2 -> r.varintOrSkip(t)?.let { minute = it.toInt() }
                                3 -> r.varintOrSkip(t)?.let { second = it.toInt() }
                                4 -> r.varintOrSkip(t)?.let { millis = it.toInt() }
                                else -> r.skip(t.wireType)
                            }
                        }
                    }
                    FIELD_V64 -> reader.lengthDelimitedOrSkip(tag)?.let { sub ->
                        val r = ProtoReader(sub)
                        while (r.hasRemaining) {
                            val t = r.readTag()
                            when (t.fieldNumber) {
                                1 -> r.varintOrSkip(t)?.let { utcOffset15min = zigzagDecode32(it) }
                                2 -> r.varintOrSkip(t)?.let { dstOffset15min = zigzagDecode32(it) }
                                3 -> r.lengthDelimitedOrSkip(t)?.let { tzId = it.toString(Charsets.UTF_8) }
                                4 -> r.lengthDelimitedOrSkip(t)?.let { unknown = it.toString(Charsets.UTF_8) }
                                else -> r.skip(t.wireType)
                            }
                        }
                    }
                    FIELD_IS_24H -> reader.varintOrSkip(tag)?.let { is24HourFormat = it != 0L }
                    else -> reader.skip(tag.wireType)
                }
            }
            return Wxo(year, month, day, hour, minute, second, millis, utcOffset15min, dstOffset15min, tzId, is24HourFormat, unknown)
        }
    }
}
