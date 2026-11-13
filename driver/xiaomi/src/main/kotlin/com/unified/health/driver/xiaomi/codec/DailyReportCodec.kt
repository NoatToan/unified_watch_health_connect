package com.unified.health.driver.xiaomi.codec

import com.unified.health.core.ble.protocol.ByteReader
import com.unified.health.core.model.HealthRecord
import com.unified.health.driver.xiaomi.proto.FitnessDataId
import java.time.Instant
import java.time.ZoneOffset

/**
 * `dailyType=0, fileType=1` daily summary (`DailyReportParser`, protocol §9.5 [V]). One-bit-per-
 * field validity bitmap plus a fixed byte layout per field (`OneDimenDataParser`, evidence:
 * `docs/re-evidence/mi/jadx-base/sources/com/xiaomi/fit/fitness/parser/{daily/DailyReportParser,
 * base/OneDimenDataParser}.java` [V]).
 *
 * This milestone only needs steps/calories/restHr (protocol brief's scoped M4). The report's
 * fields after `restHr` (curHr, maxHr, spo2, stress, training load, vitality, ...) are not
 * decoded: unlike the per-minute daily record, this report is one flat struct, not a repeating
 * one, so there is no later field whose byte offset this driver still needs -- once `restHr` is
 * read, parsing simply stops.
 *
 * Both the per-field bit validity and the per-field byte width are version-gated by
 * [Field.supportVersion], but (confirmed in `OneDimenDataParser.isDataExist`/`parseOneRecord`) a
 * field's *bytes* are present in the payload whenever `supportVersion <= dataId.version`,
 * regardless of its own valid bit -- the valid bit only says whether the device actually computed
 * a value for that field this day, not whether the slot exists at all.
 */
internal object DailyReportCodec {
    private const val TYPE_STEPS = 0
    private const val TYPE_CALORIES = 1
    private const val TYPE_REST_HR = 3

    private data class Field(val type: Int, val byteCount: Int, val supportVersion: Int)

    /** `reportDataTypeArray[0..3]` (`DailyReportParser.java`); stops at `restHr`, see class KDoc. */
    private val FIELDS = listOf(
        Field(TYPE_STEPS, byteCount = 4, supportVersion = 1),
        Field(TYPE_CALORIES, byteCount = 2, supportVersion = 1),
        Field(type = 2, byteCount = 1, supportVersion = 1), // curHr: decoded to stay aligned, not emitted.
        Field(TYPE_REST_HR, byteCount = 1, supportVersion = 1),
    )

    /** `getDailyReportValidityLen` (protocol §9.5 [V], evidence: `FitnessDataValidity.java`). */
    private fun dataValidLen(version: Int): Int? = when (version) {
        1, 2 -> 2
        3, 4 -> 3
        5 -> 4
        6 -> 5
        else -> null
    }

    /**
     * @return [HealthRecord.DailyActivity] (steps + calories, when steps has a valid reading) and
     * [HealthRecord.RestingHeartRate] (when present), or an empty list for an unsupported version
     * or a payload too short for its own header.
     */
    fun decode(id: FitnessDataId, payload: ByteArray): List<HealthRecord> {
        val validLen = dataValidLen(id.version) ?: return emptyList()
        if (payload.size < 1 + validLen) return emptyList()
        val dataValid = payload.copyOfRange(1, 1 + validLen)
        val reader = ByteReader(payload, 1 + validLen, payload.size)

        var steps: Int? = null
        var calories: Int? = null
        var restHr: Int? = null
        var bitIndex = 0
        for (field in FIELDS) {
            if (field.supportVersion > id.version) continue
            val byteIndex = bitIndex / 8
            if (byteIndex >= dataValid.size || reader.remaining < field.byteCount) break
            val bit = dataValid[byteIndex].toInt() and (1 shl (7 - bitIndex % 8)) != 0
            bitIndex++
            val value = readField(reader, field.byteCount)
            if (!bit) continue
            when (field.type) {
                TYPE_STEPS -> steps = value
                TYPE_CALORIES -> calories = value
                TYPE_REST_HR -> restHr = value
            }
        }

        val zone = ZoneOffset.ofTotalSeconds(id.timezone15min * SECONDS_PER_15_MIN)
        // LocalDate.ofInstant needs API 34; min SDK here is 26, so go through ZonedDateTime instead
        // (same pattern as MetricSeriesBuilder/FitHealthMapper/GdspRecordParsers in this codebase).
        val date = Instant.ofEpochSecond(id.timestampSeconds).atZone(zone).toLocalDate()
        val records = mutableListOf<HealthRecord>()
        steps?.let { records += HealthRecord.DailyActivity(date = date, steps = it, activeKcal = calories) }
        restHr?.let { records += HealthRecord.RestingHeartRate(date = date, bpm = it) }
        return records
    }

    private fun readField(reader: ByteReader, byteCount: Int): Int = when (byteCount) {
        1 -> reader.s8()
        2 -> reader.s16le()
        4 -> reader.s32le()
        else -> error("Unsupported daily report field byteCount $byteCount")
    }

    private const val SECONDS_PER_15_MIN = 15 * 60
}
