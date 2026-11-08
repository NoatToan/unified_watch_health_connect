package com.unified.health.driver.garmin.codec.fit

import com.unified.health.core.model.HealthRecord
import com.unified.health.core.model.SleepStage
import com.unified.health.driver.garmin.codec.FitTime
import java.time.Instant
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
    const val MESG_LAP = 19
    const val MESG_RECORD = 20
    const val MESG_MONITORING = 55
    const val MESG_MONITORING_INFO = 103
    const val MESG_STRESS_LEVEL = 227
    const val MESG_SPO2_DATA = 269
    const val MESG_SLEEP_LEVEL = 275

    /**
     * Daily resting heart rate, synced alongside `monitoring` (55) in MONITORING_B files. [V]
     * against the real FIT profile bundled in Garmin Connect Mobile (`bs2/uk.java`:
     * `new bk("monitoring_hr_data", 211)`) — see D-1080. Was wrongly 273 before that check.
     */
    const val MESG_MONITORING_HR_DATA = 211

    /**
     * Nightly HRV status. [V] against `bs2/wg.java`: `new bk("hrv_status_summary", 370)` — D-1080.
     * Was wrongly 389 before that check.
     */
    const val MESG_HRV_STATUS_SUMMARY = 370

    /**
     * Fitness metrics incl. `vo2_max`, synced in a METRICS file (§6.1 FIT_TYPE_44). [V] against
     * `bs2/pj.java`: `new bk("max_met_data", 229)` — D-1080. Replaces the earlier wrong guess of
     * `user_metrics`(140)/`user_profile`(42), which never appear in real monitoring/metrics files
     * on this watch (confirmed D-1071/D-1080: zero occurrences across a full week of real sync).
     */
    const val MESG_MAX_MET_DATA = 229

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

    // monitoring_hr_data (211) fields. [V] against bs2/uk.java — current_day wins over the plain
    // resting field when both are present.
    private const val MONITORING_HR_RESTING = 0 // uint8 bpm
    private const val MONITORING_HR_CURRENT_DAY_RESTING = 1 // uint8 bpm

    // hrv_status_summary (370) fields. [V] against bs2/wg.java: field 1 `last_night_average`,
    // scale 128 -> milliseconds (D-1080; field number was wrongly 4 before that check).
    private const val HRV_LAST_NIGHT_AVERAGE = 1 // uint16, scale 128
    private const val HRV_SCALE = 128.0

    // max_met_data (229) field 2 `vo2_max`. [V] against bs2/pj.java:
    // `new rc("vo2_max", 2, 132, 10.0d, 0.0d, "mL/kg/min", false, ...)` — field 2, scale 10 (D-1080).
    private const val VO2_MAX = 2 // uint16, scale 10 -> mL/kg/min
    private const val VO2_MAX_SCALE = 10.0
    private const val MAX_MET_UPDATE_TIME = 0 // date_time, this message's own timestamp field (not 253)

    /** Plausible human VO2max range (post-scale) used to reject garbage/sentinel values. */
    private val VO2_MAX_RANGE = 10..95

    // session (18) fields. [V] against the FIT profile bundled in Garmin Connect Mobile
    // (docs/re-evidence/garmin/jadx-base/sources/bs2/fs.java) — all 7 fields and scales below
    // match exactly, no fix needed (D-1086).
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

    // lap (19) fields. [V] against the FIT profile bundled in Garmin Connect Mobile
    // (docs/re-evidence/garmin/jadx-base/sources/bs2/ti.java) — D-1093.
    private const val LAP_START_TIME = 2
    private const val LAP_TOTAL_ELAPSED_TIME = 7 // uint32, scale 1000 → s
    private const val LAP_TOTAL_DISTANCE = 9 // uint32, scale 100 → m
    private const val LAP_TOTAL_CALORIES = 11 // uint16 kcal
    private const val LAP_AVG_SPEED = 13 // uint16, scale 1000 → m/s
    private const val LAP_MAX_SPEED = 14 // uint16, scale 1000 → m/s
    private const val LAP_AVG_HEART_RATE = 15 // uint8 bpm
    private const val LAP_MAX_HEART_RATE = 16 // uint8 bpm
    private const val LAP_AVG_CADENCE = 17 // uint8 rpm
    private const val LAP_MAX_CADENCE = 18 // uint8 rpm
    private const val LAP_TOTAL_ASCENT = 21 // uint16 m
    private const val LAP_TOTAL_DESCENT = 22 // uint16 m

    // record (20) fields. [V] against docs/re-evidence/garmin/jadx-base/sources/bs2/zp.java — D-1093.
    // `distance` (5) is also on this message (cumulative, scale 100) but is not needed: laps already
    // carry their own total_distance, and the per-second pace chart is derived from `speed` instead.
    private const val RECORD_POSITION_LAT = 0 // sint32 semicircles
    private const val RECORD_POSITION_LONG = 1 // sint32 semicircles
    private const val RECORD_ALTITUDE = 2 // uint16, scale 5 offset 500 → m
    private const val RECORD_HEART_RATE = 3 // uint8 bpm
    private const val RECORD_CADENCE = 4 // uint8 rpm
    private const val RECORD_SPEED = 6 // uint16, scale 1000 → m/s

    private const val SPEED_SCALE = 1000.0
    private const val ALTITUDE_SCALE = 5.0
    private const val ALTITUDE_OFFSET = 500.0

    /** FIT semicircles → degrees: 2^31 semicircles span 180°. */
    private const val SEMICIRCLE_TO_DEGREES = 180.0 / 2147483648.0

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
        // Laps/records recorded so far for the session that hasn't closed yet (D-1093): a FIT
        // ACTIVITY file lists a sport segment's record(20)/lap(19) messages before its session(18)
        // summary, so flushing on MESG_SESSION naturally keys each lap/sample to the right workout
        // even for a multi-sport file with several sessions. Dropped (never flushed) if the file ends
        // without a session — same as WithGearChangeData.fit (no session, no workout to attach to).
        val pendingLaps = mutableListOf<PendingLap>()
        val pendingSamples = mutableListOf<PendingSample>()
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
                MESG_LAP -> mapLap(message)?.let(pendingLaps::add)
                MESG_RECORD -> mapRecordSample(message)?.let(pendingSamples::add)
                MESG_SESSION -> mapSession(message)?.let { workout ->
                    records.add(workout)
                    pendingLaps.forEachIndexed { index, lap -> records.add(lap.toRecord(workout.start, index)) }
                    pendingSamples.forEach { records.add(it.toRecord(workout.start)) }
                    pendingLaps.clear()
                    pendingSamples.clear()
                }
                MESG_MAX_MET_DATA -> lastTimestamp?.let { mapVo2Max(message, it) }?.let(records::add)
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
     * max_met_data (229), field 2 `vo2_max` — the device's own VO2max estimate, never recomputed
     * here (D-803, D-1080). Its own timestamp lives in field 0 `update_time` (not the usual 253),
     * so that's tried first; falls back to the last timestamp seen earlier in the file if absent.
     */
    private fun mapVo2Max(message: FitMessage, fallbackTime: Long): HealthRecord? {
        val raw = message.value(VO2_MAX)?.toInt() ?: return null
        val value = (raw / VO2_MAX_SCALE).roundToInt().takeIf { it in VO2_MAX_RANGE } ?: return null
        val time = message.value(MAX_MET_UPDATE_TIME) ?: fallbackTime
        return HealthRecord.Vo2Max(FitTime.toInstant(time), value)
    }

    private fun mapSession(message: FitMessage): HealthRecord.Workout? {
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
     * lap (19) → one split, buffered until the enclosing session(18) closes and supplies the
     * workout's start time (D-1093). Elapsed time is truncated to the second, same as [mapSession].
     */
    private fun mapLap(message: FitMessage): PendingLap? {
        val start = message.value(LAP_START_TIME) ?: return null
        val end = message.value(LAP_TOTAL_ELAPSED_TIME)?.let { start + it / ELAPSED_TIME_SCALE } ?: return null
        if (end <= start) return null
        return PendingLap(
            start = FitTime.toInstant(start),
            end = FitTime.toInstant(end),
            distanceMeters = message.value(LAP_TOTAL_DISTANCE)?.let { it / DISTANCE_SCALE },
            calories = message.value(LAP_TOTAL_CALORIES)?.toInt(),
            avgSpeedMps = message.value(LAP_AVG_SPEED)?.let { it / SPEED_SCALE },
            maxSpeedMps = message.value(LAP_MAX_SPEED)?.let { it / SPEED_SCALE },
            avgHeartRate = message.value(LAP_AVG_HEART_RATE)?.toInt(),
            maxHeartRate = message.value(LAP_MAX_HEART_RATE)?.toInt(),
            avgCadence = message.value(LAP_AVG_CADENCE)?.toInt(),
            maxCadence = message.value(LAP_MAX_CADENCE)?.toInt(),
            ascentMeters = message.value(LAP_TOTAL_ASCENT)?.toDouble(),
            descentMeters = message.value(LAP_TOTAL_DESCENT)?.toDouble(),
        )
    }

    /**
     * record (20) → one instantaneous sample, buffered the same way as [mapLap]. GPS lat/long are
     * parsed and stored (cheap fields, already decoded) but have no map UI yet — route rendering is
     * P2 (D-1093). Dropped when none of its fields decoded (e.g. a record with only `distance`, which
     * this mapper does not use — see the field comment on [RECORD_SPEED]'s block above).
     */
    private fun mapRecordSample(message: FitMessage): PendingSample? {
        val time = message.timestamp ?: return null
        val lat = message.value(RECORD_POSITION_LAT)
        val lon = message.value(RECORD_POSITION_LONG)
        val altitude = message.value(RECORD_ALTITUDE)
        val heartRate = message.value(RECORD_HEART_RATE)?.toInt()?.takeIf { it > 0 }
        val cadence = message.value(RECORD_CADENCE)?.toInt()
        val speed = message.value(RECORD_SPEED)
        if (lat == null && lon == null && altitude == null && heartRate == null && cadence == null && speed == null) return null
        return PendingSample(
            time = FitTime.toInstant(time),
            latitude = lat?.let { it * SEMICIRCLE_TO_DEGREES },
            longitude = lon?.let { it * SEMICIRCLE_TO_DEGREES },
            altitudeMeters = altitude?.let { it / ALTITUDE_SCALE - ALTITUDE_OFFSET },
            heartRate = heartRate,
            cadence = cadence,
            speedMps = speed?.let { it / SPEED_SCALE },
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

/** One lap(19) message, held until its session(18) supplies the workout start time (D-1093). */
private data class PendingLap(
    val start: Instant,
    val end: Instant,
    val distanceMeters: Double?,
    val calories: Int?,
    val avgSpeedMps: Double?,
    val maxSpeedMps: Double?,
    val avgHeartRate: Int?,
    val maxHeartRate: Int?,
    val avgCadence: Int?,
    val maxCadence: Int?,
    val ascentMeters: Double?,
    val descentMeters: Double?,
) {
    fun toRecord(workoutStart: Instant, index: Int) = HealthRecord.WorkoutLap(
        workoutStart = workoutStart,
        index = index,
        start = start,
        end = end,
        distanceMeters = distanceMeters,
        calories = calories,
        avgSpeedMps = avgSpeedMps,
        maxSpeedMps = maxSpeedMps,
        avgHeartRate = avgHeartRate,
        maxHeartRate = maxHeartRate,
        avgCadence = avgCadence,
        maxCadence = maxCadence,
        ascentMeters = ascentMeters,
        descentMeters = descentMeters,
    )
}

/** One record(20) message, held the same way as [PendingLap]. */
private data class PendingSample(
    val time: Instant,
    val latitude: Double?,
    val longitude: Double?,
    val altitudeMeters: Double?,
    val heartRate: Int?,
    val cadence: Int?,
    val speedMps: Double?,
) {
    fun toRecord(workoutStart: Instant) = HealthRecord.WorkoutSample(
        workoutStart = workoutStart,
        time = time,
        latitude = latitude,
        longitude = longitude,
        altitudeMeters = altitudeMeters,
        heartRate = heartRate,
        cadence = cadence,
        speedMps = speedMps,
    )
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
