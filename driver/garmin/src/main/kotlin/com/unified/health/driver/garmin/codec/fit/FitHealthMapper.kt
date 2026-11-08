package com.unified.health.driver.garmin.codec.fit

import com.unified.health.core.model.HealthRecord
import com.unified.health.core.model.SleepStage
import com.unified.health.driver.garmin.codec.FitTime
import java.time.LocalDate
import java.time.ZoneId
import java.time.ZoneOffset
import kotlin.math.roundToInt

/**
 * Maps decoded FIT messages onto [HealthRecord]s. Message and field numbers come from the public
 * FIT SDK profile ([Ext], `Profile.xlsx`), confirmed as the right source by
 * `GARMIN_IMPLEMENTATION_BRIEF.md` TODO-4 (RESOLVED). The few *behaviours* that brief still lists
 * for a real MONITORING_B file carry their own TODO below.
 *
 * Daily step/calorie/distance counters are cumulative within a day, so they are collected in a
 * [DailyActivityAccumulator] shared by every file of one sync and emitted once at the end.
 */
internal object FitHealthMapper {

    // Global message numbers [Ext].
    const val MESG_SESSION = 18
    const val MESG_MONITORING = 55
    const val MESG_MONITORING_INFO = 103
    const val MESG_STRESS_LEVEL = 227
    const val MESG_SPO2_DATA = 269
    const val MESG_SLEEP_LEVEL = 275

    /** Daily resting heart rate, synced alongside `monitoring` (55) in MONITORING_B files [Ext]. */
    const val MESG_MONITORING_HR_DATA = 273

    /** Nightly HRV status, a newer message not in every firmware's FIT profile [Ext]. */
    const val MESG_HRV_STATUS_SUMMARY = 389

    /** Fitness metrics incl. `vo2_max`, synced in a METRICS file (§6.1 FIT_TYPE_44) [Ext]. */
    const val MESG_USER_METRICS = 140

    /** Some firmware reports `vo2_max` on `user_profile` instead of [MESG_USER_METRICS] [Ext] (D-1000). */
    const val MESG_USER_PROFILE = 42

    // monitoring (55) fields [Ext].
    private const val MON_DISTANCE = 2 // uint32, scale 100 → m, cumulative per activity type
    private const val MON_CYCLES = 3 // uint32; "steps" sub-field for walking/running
    private const val MON_ACTIVITY_TYPE = 5 // enum activity_type
    private const val MON_ACTIVE_CALORIES = 19 // uint16 kcal, cumulative per activity type
    private const val MON_CURRENT_ACTIVITY_TYPE_INTENSITY = 24 // bits 0-4 activity type
    private const val MON_TIMESTAMP_16 = 26
    private const val MON_HEART_RATE = 27
    private const val MONITORING_INFO_LOCAL_TIMESTAMP = 0

    private const val STRESS_VALUE = 0 // sint16 0..100, negative = not measurable
    private const val STRESS_TIME = 1 // date_time
    private const val SPO2_READING = 0 // uint8 %
    private const val SLEEP_LEVEL = 0 // enum sleep_level

    // monitoring_hr_data (273) fields [Ext]; current_day wins over the plain resting field when both are present.
    private const val MONITORING_HR_RESTING = 0 // uint8 bpm
    private const val MONITORING_HR_CURRENT_DAY_RESTING = 1 // uint8 bpm

    // hrv_status_summary (389) fields [Ext]: one record per night, scale 128 -> milliseconds.
    private const val HRV_LAST_NIGHT_AVERAGE = 4 // uint16, scale 128
    private const val HRV_SCALE = 128.0

    // user_metrics (140) / user_profile (42) fields [Ext]; same field number assumed on both
    // messages — only the user_metrics one is confirmed against the public FIT SDK profile, the
    // user_profile fallback is a guess pending a real file that actually carries it (D-1000).
    private const val VO2_MAX = 7 // plain integer (no scale), mL/kg/min

    /** Plausible human VO2max range used to reject garbage/sentinel values [Ext]. */
    private val VO2_MAX_RANGE = 10..95

    // session (18) fields [Ext].
    private const val SESSION_START_TIME = 2
    private const val SESSION_SPORT = 5
    private const val SESSION_TOTAL_ELAPSED_TIME = 7 // uint32, scale 1000 → s
    private const val SESSION_TOTAL_DISTANCE = 9 // uint32, scale 100 → m
    private const val SESSION_TOTAL_CALORIES = 11 // uint16 kcal
    private const val SESSION_AVG_HEART_RATE = 16
    private const val SESSION_MAX_HEART_RATE = 17

    private const val DISTANCE_SCALE = 100.0
    private const val ELAPSED_TIME_SCALE = 1000
    private const val ACTIVITY_TYPE_MASK = 0x1F

    /** Longest believable gap between two sleep_level samples; longer gaps are not filled. */
    private const val MAX_SLEEP_SEGMENT_SECONDS = 2 * 3600L

    /**
     * @param fallbackZone used to bucket daily counters when the file has no monitoring_info
     *  with a local timestamp.
     * @return every non-daily record in [file], in file order.
     */
    fun map(file: FitFile, fallbackZone: ZoneId, daily: DailyActivityAccumulator): List<HealthRecord> {
        val zone = deviceOffset(file) ?: fallbackZone
        val records = mutableListOf<HealthRecord>()
        val sleepLevels = mutableListOf<Pair<Long, Int>>()
        var lastTimestamp: Long? = null
        for (message in file.messages) {
            message.timestamp?.let { lastTimestamp = it }
            when (message.globalNumber) {
                MESG_MONITORING -> {
                    val time = message.timestamp ?: expandTimestamp16(lastTimestamp, message.value(MON_TIMESTAMP_16)) ?: continue
                    lastTimestamp = time
                    mapMonitoring(message, time, zone, daily)?.let(records::add)
                }
                MESG_STRESS_LEVEL -> mapStress(message)?.let(records::add)
                MESG_SPO2_DATA -> mapSpo2(message)?.let(records::add)
                MESG_MONITORING_HR_DATA -> mapRestingHeartRate(message, zone)?.let(records::add)
                MESG_HRV_STATUS_SUMMARY -> mapHrv(message)?.let(records::add)
                MESG_SLEEP_LEVEL -> {
                    val time = message.timestamp ?: continue
                    val level = message.value(SLEEP_LEVEL) ?: continue
                    sleepLevels += time to level.toInt()
                }
                MESG_SESSION -> mapSession(message)?.let(records::add)
                MESG_USER_METRICS, MESG_USER_PROFILE -> lastTimestamp?.let { mapVo2Max(message, it) }?.let(records::add)
            }
        }
        records += sleepIntervals(sleepLevels)
        return records
    }

    /** monitoring_info carries both UTC and local timestamps; their difference is the watch's offset. */
    private fun deviceOffset(file: FitFile): ZoneOffset? {
        val info = file.messages.firstOrNull { it.globalNumber == MESG_MONITORING_INFO } ?: return null
        val utc = info.timestamp ?: return null
        val local = info.value(MONITORING_INFO_LOCAL_TIMESTAMP) ?: return null
        val offset = (local - utc).toInt()
        return if (offset in -18 * 3600..18 * 3600) ZoneOffset.ofTotalSeconds(offset) else null
    }

    /** timestamp_16 holds the low 16 bits of a FIT timestamp after the last full one [Ext]. */
    internal fun expandTimestamp16(last: Long?, timestamp16: Long?): Long? {
        if (last == null || timestamp16 == null) return null
        return last + ((timestamp16 - (last and 0xFFFF)) and 0xFFFF)
    }

    private fun mapMonitoring(message: FitMessage, time: Long, zone: ZoneId, daily: DailyActivityAccumulator): HealthRecord? {
        val activityType = message.value(MON_ACTIVITY_TYPE)
            ?: message.value(MON_CURRENT_ACTIVITY_TYPE_INTENSITY)?.and(ACTIVITY_TYPE_MASK.toLong())
        if (activityType != null) {
            val cycles = message.value(MON_CYCLES)
            val calories = message.value(MON_ACTIVE_CALORIES)
            val distance = message.value(MON_DISTANCE)
            if (cycles != null || calories != null || distance != null) {
                val date = FitTime.toInstant(time).atZone(zone).toLocalDate()
                daily.add(date, activityType.toInt(), cycles, calories, distance)
            }
        }
        val bpm = message.value(MON_HEART_RATE)?.toInt()?.takeIf { it > 0 } ?: return null
        return HealthRecord.HeartRate(FitTime.toInstant(time), bpm)
    }

    private fun mapStress(message: FitMessage): HealthRecord? {
        val score = message.value(STRESS_VALUE)?.toInt()?.takeIf { it in 0..100 } ?: return null
        val time = message.value(STRESS_TIME) ?: message.timestamp ?: return null
        return HealthRecord.Stress(FitTime.toInstant(time), score)
    }

    private fun mapSpo2(message: FitMessage): HealthRecord? {
        val percent = message.value(SPO2_READING)?.toInt()?.takeIf { it in 1..100 } ?: return null
        val time = message.timestamp ?: return null
        return HealthRecord.SpO2(FitTime.toInstant(time), percent)
    }

    /**
     * monitoring_hr_data (273) [Ext]: the device's own daily resting HR, recomputed through the day.
     * `current_day_resting_heart_rate` (1) is the running estimate and wins over the plain field (0)
     * when both are present.
     * TODO(garmin-protocol): NEEDS-REAL-WATCH (brief TODO-4 item 1) — confirm field 1 is actually
     * present in real type-32 files and that preferring it over field 0 is right.
     */
    private fun mapRestingHeartRate(message: FitMessage, zone: ZoneId): HealthRecord? {
        val time = message.timestamp ?: return null
        val bpm = (message.value(MONITORING_HR_CURRENT_DAY_RESTING) ?: message.value(MONITORING_HR_RESTING))
            ?.toInt()?.takeIf { it in 20..120 } ?: return null
        val date = FitTime.toInstant(time).atZone(zone).toLocalDate()
        return HealthRecord.RestingHeartRate(date, bpm)
    }

    /**
     * hrv_status_summary (389) [Ext]: nightly HRV status, one message per morning. We report
     * `last_night_average` as the device's SDNN-like summary (scale 128, §FIT profile "Base Types").
     * Newer firmware only; older watches may use a different/no HRV message.
     * TODO(garmin-protocol): NEEDS-REAL-WATCH (brief TODO-4 item 2) — confirm scale 128 on a real file.
     */
    private fun mapHrv(message: FitMessage): HealthRecord? {
        val time = message.timestamp ?: return null
        val raw = message.value(HRV_LAST_NIGHT_AVERAGE) ?: return null
        val milliseconds = (raw / HRV_SCALE).roundToInt().takeIf { it in 1..300 } ?: return null
        return HealthRecord.HeartRateVariability(FitTime.toInstant(time), milliseconds)
    }

    /**
     * user_metrics (140), or user_profile (42) on firmware that reports it there instead [Ext] —
     * both read as the device's own VO2max estimate, never recomputed here (D-1000, D-803). Neither
     * message reliably carries its own `timestamp` (253) field, so the record is stamped with the
     * last timestamp seen earlier in the file.
     * TODO(garmin-protocol): NEEDS-REAL-WATCH — confirm field number 7 on a real METRICS file and
     * whether user_profile (42) ever actually carries vo2_max in practice.
     */
    private fun mapVo2Max(message: FitMessage, time: Long): HealthRecord? {
        val value = message.value(VO2_MAX)?.toInt()?.takeIf { it in VO2_MAX_RANGE } ?: return null
        return HealthRecord.Vo2Max(FitTime.toInstant(time), value)
    }

    private fun mapSession(message: FitMessage): HealthRecord? {
        val start = message.value(SESSION_START_TIME) ?: return null
        val end = message.value(SESSION_TOTAL_ELAPSED_TIME)?.let { start + it / ELAPSED_TIME_SCALE } ?: message.timestamp ?: return null
        if (end <= start) return null
        return HealthRecord.Workout(
            start = FitTime.toInstant(start),
            end = FitTime.toInstant(end),
            sport = FitSport.name(message.value(SESSION_SPORT)?.toInt()),
            distanceMeters = message.value(SESSION_TOTAL_DISTANCE)?.let { it / DISTANCE_SCALE },
            // FIT sessions only carry total_calories; reported as the workout's calories [I].
            activeKcal = message.value(SESSION_TOTAL_CALORIES)?.toInt(),
            avgHeartRate = message.value(SESSION_AVG_HEART_RATE)?.toInt(),
            maxHeartRate = message.value(SESSION_MAX_HEART_RATE)?.toInt(),
        )
    }

    /**
     * Each sleep_level sample starts a stage that lasts until the next sample [Ext]. The last
     * sample has no end and is dropped.
     * TODO(garmin-protocol): NEEDS-REAL-WATCH (brief TODO-4 item 4) — confirm samples are on stage
     * change (so [MAX_SLEEP_SEGMENT_SECONDS] is sound) and whether type-49 files carry them.
     */
    private fun sleepIntervals(levels: List<Pair<Long, Int>>): List<HealthRecord.Sleep> {
        val result = mutableListOf<HealthRecord.Sleep>()
        val sorted = levels.sortedBy { it.first }
        for (i in 0 until sorted.size - 1) {
            val (start, level) = sorted[i]
            val end = sorted[i + 1].first
            val stage = sleepStage(level) ?: continue
            if (end <= start || end - start > MAX_SLEEP_SEGMENT_SECONDS) continue
            val previous = result.lastOrNull()
            if (previous != null && previous.stage == stage && previous.end == FitTime.toInstant(start)) {
                result[result.lastIndex] = previous.copy(end = FitTime.toInstant(end))
            } else {
                result += HealthRecord.Sleep(FitTime.toInstant(start), FitTime.toInstant(end), stage)
            }
        }
        return result
    }

    /** sleep_level enum [Ext]: 0 unmeasurable, 1 awake, 2 light, 3 deep, 4 rem. */
    private fun sleepStage(level: Int): SleepStage? = when (level) {
        1 -> SleepStage.AWAKE
        2 -> SleepStage.LIGHT
        3 -> SleepStage.DEEP
        4 -> SleepStage.REM
        else -> null
    }
}

/**
 * Collects cumulative monitoring counters per local day and activity type. The watch resets them
 * at local midnight and each record holds the running total for its activity type, so a day's
 * value is the sum over activity types of each type's maximum [Ext].
 *
 * TODO(garmin-protocol): NEEDS-REAL-WATCH (brief TODO-4 item 3) — verify counters are per activity type (not global)
 * and that `cycles` is already in steps for walking/running (FIT sub-field `steps`, scale 1).
 */
internal class DailyActivityAccumulator {

    private class Totals(var steps: Long? = null, var calories: Long? = null, var distance: Long? = null)

    private val days = sortedMapOf<LocalDate, MutableMap<Int, Totals>>()

    fun add(date: LocalDate, activityType: Int, cycles: Long?, activeCalories: Long?, distance: Long?) {
        val totals = days.getOrPut(date) { mutableMapOf() }.getOrPut(activityType) { Totals() }
        if (activityType in STEP_ACTIVITY_TYPES) totals.steps = larger(totals.steps, cycles)
        totals.calories = larger(totals.calories, activeCalories)
        totals.distance = larger(totals.distance, distance)
    }

    fun build(): List<HealthRecord.DailyActivity> = days.map { (date, byType) ->
        val totals = byType.values
        HealthRecord.DailyActivity(
            date = date,
            steps = totals.sumOf { it.steps ?: 0L }.toInt(),
            activeKcal = totals.mapNotNull { it.calories }.takeIf { it.isNotEmpty() }?.sum()?.toInt(),
            distanceMeters = totals.mapNotNull { it.distance }.takeIf { it.isNotEmpty() }?.sum()?.div(DISTANCE_SCALE),
        )
    }

    private fun larger(current: Long?, candidate: Long?): Long? = when {
        candidate == null -> current
        current == null -> candidate
        else -> kotlin.math.max(current, candidate)
    }

    private companion object {
        /** FIT activity_type running (1) and walking (6) [Ext]. */
        val STEP_ACTIVITY_TYPES = setOf(1, 6)
        const val DISTANCE_SCALE = 100.0
    }
}

/** FIT `sport` enum → lower_snake_case names ([Ext] FIT profile). */
internal object FitSport {
    private val NAMES = listOf(
        "generic", "running", "cycling", "transition", "fitness_equipment", "swimming", "basketball",
        "soccer", "tennis", "american_football", "training", "walking", "cross_country_skiing",
        "alpine_skiing", "snowboarding", "rowing", "mountaineering", "hiking", "multisport", "paddling",
        "flying", "e_biking", "motorcycling", "boating", "driving", "golf", "hang_gliding",
        "horseback_riding", "hunting", "fishing", "inline_skating", "rock_climbing", "sailing",
        "ice_skating", "sky_diving", "snowshoeing", "snowmobiling", "stand_up_paddleboarding",
        "surfing", "wakeboarding", "water_skiing", "kayaking", "rafting", "windsurfing", "kitesurfing",
        "tactical", "jumpmaster", "boxing", "floor_climbing",
    )

    fun name(sport: Int?): String = when {
        sport == null -> "generic"
        sport in NAMES.indices -> NAMES[sport]
        else -> "sport_$sport"
    }
}
