package com.unified.health.core.domain.usecase

import com.unified.health.core.model.UnitSystem
import com.unified.health.core.model.Workout
import com.unified.health.core.model.WorkoutLap
import com.unified.health.core.model.WorkoutSample
import com.unified.health.core.model.metersPerDistanceUnit
import java.time.Duration
import java.time.Instant
import kotlin.math.roundToInt
import kotlin.math.roundToLong

/**
 * One per-km/per-mile split in a workout's splits table (Huawei's "Pace" tab, §4 of
 * docs/re-evidence/huawei/workout_detail_metrics.md, docs/DECISIONS.md D-1201). [isPartial] marks the
 * final, shorter-than-a-full-unit split (shown as "< 1 km"/"< 1 mi" in the UI).
 */
data class WorkoutSplit(
    val index: Int,
    val distanceMeters: Double,
    val duration: Duration,
    val avgHeartRate: Int? = null,
    val isPartial: Boolean = false,
)

/**
 * The whole splits table plus its header figures (§4.2): fastest/average pace and half/full marathon
 * split times, each populated only when the workout actually reached that distance.
 */
data class WorkoutSplitsSummary(
    val splits: List<WorkoutSplit> = emptyList(),
    /** Index into [splits] of the shortest-duration *complete* split; null without one (§4.2: the
     * partial final split is excluded from "fastest", which is also why average pace can read faster
     * than every row — Huawei's own caveat). */
    val fastestSplitIndex: Int? = null,
    /** Seconds per [UnitSystem] distance unit, from the workout's own total distance/time. */
    val averagePaceSecondsPerUnit: Double? = null,
    val halfMarathonDuration: Duration? = null,
    val marathonDuration: Duration? = null,
)

/**
 * Builds [WorkoutSplitsSummary] the way Huawei's Pace tab does (§4/§12, D-1201): one split per km
 * (metric) or mile (imperial), from the device's own laps when present — ours already default to
 * 1 km/5 km auto-laps (D-1093/D-1195) — or, failing that, integrated from per-second samples.
 */
object WorkoutSplits {
    private const val HALF_MARATHON_METERS = 21_097.5
    private const val MARATHON_METERS = 42_195.0

    /** A split within this many meters of a full unit counts as complete, not partial (lap/GPS
     * rounding noise); a trailing remainder under this is dropped instead of becoming a near-zero
     * partial split. */
    private const val PARTIAL_SLACK_METERS = 1.0

    fun compute(workout: Workout, laps: List<WorkoutLap>, samples: List<WorkoutSample>, unitSystem: UnitSystem): WorkoutSplitsSummary {
        val unitMeters = unitSystem.metersPerDistanceUnit()
        val splits = if (laps.isNotEmpty()) {
            fromLaps(laps, unitMeters)
        } else {
            fromSamples(workout.start, workout.end, samples, unitMeters)
        }
        val averagePace = WorkoutRunningMetrics.avgPaceSecondsPerUnit(workout, unitSystem)
        if (splits.isEmpty()) return WorkoutSplitsSummary(averagePaceSecondsPerUnit = averagePace)

        val fastestIndex = splits.withIndex().filterNot { it.value.isPartial }.minByOrNull { it.value.duration }?.index
        return WorkoutSplitsSummary(
            splits = splits,
            fastestSplitIndex = fastestIndex,
            averagePaceSecondsPerUnit = averagePace,
            halfMarathonDuration = timeAtDistance(splits, HALF_MARATHON_METERS),
            marathonDuration = timeAtDistance(splits, MARATHON_METERS),
        )
    }

    /** Device/synthesized laps are already ~1 unit chunks (D-1093/D-1195); only the last one may be
     * short, which is exactly the "< 1 km" partial row. */
    private fun fromLaps(laps: List<WorkoutLap>, unitMeters: Double): List<WorkoutSplit> =
        laps.sortedBy { it.index }.mapIndexed { i, lap ->
            val distance = lap.distanceMeters ?: 0.0
            WorkoutSplit(
                index = i,
                distanceMeters = distance,
                duration = lap.duration,
                avgHeartRate = lap.avgHeartRate,
                isPartial = i == laps.lastIndex && distance > 0.0 && distance < unitMeters - PARTIAL_SLACK_METERS,
            )
        }

    /**
     * Integrates instantaneous [WorkoutSample.speedMps] into cumulative distance (trapezoidal between
     * consecutive samples) and cuts a split every [unitMeters], interpolating the exact crossing time
     * within the sample pair it falls in.
     */
    private fun fromSamples(start: Instant, end: Instant, samples: List<WorkoutSample>, unitMeters: Double): List<WorkoutSplit> {
        val sorted = samples.filter { !it.time.isBefore(start) && !it.time.isAfter(end) }.sortedBy { it.time }
        if (sorted.size < 2) return emptyList()

        data class Point(val time: Instant, val cumulativeMeters: Double, val heartRate: Int?)

        val points = mutableListOf(Point(sorted.first().time, 0.0, sorted.first().heartRate.usable()))
        for (i in 1 until sorted.size) {
            val prev = sorted[i - 1]
            val cur = sorted[i]
            val dtSeconds = Duration.between(prev.time, cur.time).seconds.toDouble()
            val speeds = listOfNotNull(prev.speedMps, cur.speedMps)
            val avgSpeed = if (speeds.isNotEmpty()) speeds.average() else 0.0
            points += Point(cur.time, points.last().cumulativeMeters + avgSpeed * dtSeconds, cur.heartRate.usable())
        }
        val totalMeters = points.last().cumulativeMeters
        if (totalMeters <= 0.0) return emptyList()

        val result = mutableListOf<WorkoutSplit>()
        var splitIndex = 0
        var splitStartTime = points.first().time
        var splitStartMeters = 0.0
        var threshold = unitMeters
        val heartRatesInSplit = mutableListOf<Int>()
        points.first().heartRate?.let { heartRatesInSplit += it }

        for (i in 1 until points.size) {
            val prev = points[i - 1]
            val cur = points[i]
            cur.heartRate?.let { heartRatesInSplit += it }
            while (cur.cumulativeMeters >= threshold - 1e-6) {
                val segmentMeters = cur.cumulativeMeters - prev.cumulativeMeters
                val fraction = if (segmentMeters > 0) ((threshold - prev.cumulativeMeters) / segmentMeters).coerceIn(0.0, 1.0) else 0.0
                val segmentMillis = Duration.between(prev.time, cur.time).toMillis().toDouble()
                val crossingTime = prev.time.plusMillis((segmentMillis * fraction).roundToLong())
                result += WorkoutSplit(
                    index = splitIndex,
                    distanceMeters = threshold - splitStartMeters,
                    duration = Duration.between(splitStartTime, crossingTime),
                    avgHeartRate = heartRatesInSplit.takeIf { it.isNotEmpty() }?.average()?.roundToInt(),
                    isPartial = false,
                )
                heartRatesInSplit.clear()
                splitIndex++
                splitStartTime = crossingTime
                splitStartMeters = threshold
                threshold += unitMeters
            }
        }
        val remainder = totalMeters - splitStartMeters
        if (remainder > PARTIAL_SLACK_METERS) {
            result += WorkoutSplit(
                index = splitIndex,
                distanceMeters = remainder,
                duration = Duration.between(splitStartTime, points.last().time),
                avgHeartRate = heartRatesInSplit.takeIf { it.isNotEmpty() }?.average()?.roundToInt(),
                isPartial = true,
            )
        }
        return result
    }

    private fun Int?.usable(): Int? = this?.takeIf { it > 0 }

    /**
     * Linear interpolation of elapsed time at [targetMeters] across contiguous [splits]; null when
     * the workout never actually covered that distance (§4.2: half/full marathon rows only show when
     * reached).
     */
    private fun timeAtDistance(splits: List<WorkoutSplit>, targetMeters: Double): Duration? {
        var cumulativeMeters = 0.0
        var cumulativeSeconds = 0L
        for (split in splits) {
            val splitMeters = split.distanceMeters
            if (splitMeters <= 0.0) continue
            if (cumulativeMeters + splitMeters >= targetMeters) {
                val remaining = targetMeters - cumulativeMeters
                val fraction = (remaining / splitMeters).coerceIn(0.0, 1.0)
                val splitSeconds = split.duration.seconds
                return Duration.ofSeconds(cumulativeSeconds + (splitSeconds * fraction).roundToLong())
            }
            cumulativeMeters += splitMeters
            cumulativeSeconds += split.duration.seconds
        }
        return null
    }
}
