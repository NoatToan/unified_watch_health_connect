package com.unified.health.driver.xiaomi.codec

import com.unified.health.core.ble.protocol.ByteReader
import com.unified.health.core.model.HealthRecord
import com.unified.health.driver.xiaomi.proto.FitnessDataId
import java.time.Instant

/**
 * `dataType=1 (sport), fileType=1` summary report for the outdoor-run sportType family
 * (`OutdoorSportReportParser`, protocol §9.5 [V]). Evidence:
 * `docs/re-evidence/mi/jadx-base/sources/com/xiaomi/fit/fitness/parser/sport/report/OutdoorSportReportParser.java`
 * (field table) and `.../sport/base/SportReportBaseParser.java`'s nested `ReportType` class (field
 * *names*, confirmed real `int` constants, not guessed -- `startTime=1, endTime=2, duration=3,
 * distance=5, calories=6, avgHr=16, maxHr=17`, matching `OutdoorSportReportParser`'s own
 * `reportDataTypeArray` type numbers one-for-one).
 *
 * Same flat, single-struct `OneDimenDataType` mechanism as [DailyReportCodec] (one bit per field in
 * a leading validity bitmap, then every field's bytes back-to-back in wire order, present whenever
 * `supportVersion <= dataId.version` regardless of that field's own valid bit -- see
 * [DailyReportCodec]'s KDoc for the citation). A fresh, self-contained [FIELDS] table is used here
 * rather than retrofitting [DailyReportCodec]'s `Field`/loop: this report's fields need `isFloat`
 * awareness for the ones *after* [HR_MAX] (`maxSpeed` etc., not decoded here) and sharing one
 * generic mechanism across both codecs was judged not to pay for itself within this milestone --
 * flagged as a possible follow-up, not done to avoid risking [DailyReportCodec]'s existing,
 * passing tests.
 *
 * Only `startTime`/`endTime`/`duration`/`distance`/`calories`/`avgHr`/`maxHr` are decoded (the
 * fields [HealthRecord.Workout] has a slot for); every field in between is still *read* (to keep
 * the cursor aligned) but discarded, exactly like [DailyRecordCodec]'s discarded daily groups.
 * Parsing stops right after `maxHr` -- the report has many more fields (training effect, VO2max,
 * HR-zone durations, goal targets, an optional dependent `serverCourseId`...) that
 * [HealthRecord.Workout] has no slot for and this milestone does not need.
 */
internal object SportReportCodec {

    private const val TYPE_START_TIME = 1
    private const val TYPE_END_TIME = 2
    private const val TYPE_DURATION = 3
    private const val TYPE_DISTANCE = 5
    private const val TYPE_CALORIES = 6
    private const val TYPE_AVG_HR = 16
    private const val TYPE_MAX_HR = 17

    private data class Field(val type: Int, val byteCount: Int, val supportVersion: Int)

    /**
     * `reportDataTypeArray` prefix (`OutdoorSportReportParser.java`), in wire order, up to and
     * including `maxHr` -- see class KDoc for why parsing stops there.
     */
    private val FIELDS = listOf(
        Field(TYPE_START_TIME, byteCount = 4, supportVersion = 1),
        Field(TYPE_END_TIME, byteCount = 4, supportVersion = 1),
        Field(TYPE_DURATION, byteCount = 4, supportVersion = 1),
        Field(TYPE_DISTANCE, byteCount = 4, supportVersion = 1),
        Field(TYPE_CALORIES, byteCount = 2, supportVersion = 1),
        Field(type = 8, byteCount = 4, supportVersion = 1), // maxPace: decoded to stay aligned, not emitted.
        Field(type = 9, byteCount = 4, supportVersion = 1), // minPace
        Field(type = 12, byteCount = 4, supportVersion = 1), // maxSpeed (float32)
        Field(type = 13, byteCount = 4, supportVersion = 1), // steps
        Field(type = 14, byteCount = 2, supportVersion = 1), // maxCadence
        Field(TYPE_AVG_HR, byteCount = 1, supportVersion = 1),
        Field(TYPE_MAX_HR, byteCount = 1, supportVersion = 1),
    )

    /**
     * `getSportOutdoorReportValidityLen` (protocol §9.5 [V], evidence: `FitnessDataValidity.java`).
     */
    private fun dataValidLen(version: Int): Int? = when (version) {
        1, 2, 3 -> 4
        4 -> 5
        else -> null
    }

    /**
     * @return a single [HealthRecord.Workout] when both a start time and either an end time or a
     * duration are present and valid; empty for an unsupported version, a payload too short for
     * its own header, or a record this driver cannot anchor in time at all.
     */
    fun decode(id: FitnessDataId, payload: ByteArray): List<HealthRecord> {
        if (id.subType !in XiaomiSportTypes.OUTDOOR_REPORT_SPORT_TYPES) return emptyList()
        val validLen = dataValidLen(id.version) ?: return emptyList()
        if (payload.size < 1 + validLen) return emptyList()
        val dataValid = payload.copyOfRange(1, 1 + validLen)
        val reader = ByteReader(payload, 1 + validLen, payload.size)

        var startTime: Long? = null
        var endTime: Long? = null
        var duration: Long? = null
        var distance: Long? = null
        var calories: Int? = null
        var avgHr: Int? = null
        var maxHr: Int? = null
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
                TYPE_START_TIME -> startTime = value
                TYPE_END_TIME -> endTime = value
                TYPE_DURATION -> duration = value
                TYPE_DISTANCE -> distance = value
                TYPE_CALORIES -> calories = value.toInt()
                TYPE_AVG_HR -> avgHr = value.toInt()
                TYPE_MAX_HR -> maxHr = value.toInt()
            }
        }

        val start = startTime ?: return emptyList()
        val end = endTime ?: duration?.let { start + it } ?: return emptyList()
        return listOf(
            HealthRecord.Workout(
                start = Instant.ofEpochSecond(start),
                end = Instant.ofEpochSecond(end),
                sport = XiaomiSportTypes.lowerSnakeCaseName(id.subType),
                // TODO(xiaomi-protocol): distance/calorie units are not spelled out in the doc;
                // assuming whole metres and whole kcal by analogy with the rest of this wire
                // format (DailyReportCodec's steps/calories are also raw ints) -- verify on a
                // real watch against the companion app's own displayed totals.
                distanceMeters = distance?.toDouble(),
                activeKcal = calories,
                avgHeartRate = avgHr,
                maxHeartRate = maxHr,
            ),
        )
    }

    /** `startTime`/`endTime`/`duration`/`distance` are u32 LE; `calories`/HR fields are narrower. */
    private fun readField(reader: ByteReader, byteCount: Int): Long = when (byteCount) {
        1 -> reader.u8().toLong()
        2 -> reader.u16le().toLong()
        4 -> reader.u32le()
        else -> error("Unsupported sport report field byteCount $byteCount")
    }
}
