package com.unified.health.core.domain.usecase

import com.unified.health.core.domain.model.HeartRateZone
import com.unified.health.core.domain.model.MetricThresholds
import com.unified.health.core.model.WorkoutSample
import java.time.Duration
import java.time.Instant
import kotlin.math.roundToInt

/**
 * One HR zone with accumulated time inside it (§3.2 of docs/re-evidence/huawei/
 * workout_detail_metrics.md, docs/DECISIONS.md D-1201). [isUnderOneMinute] mirrors Huawei's "<1 min"
 * display for a non-zero sub-minute duration.
 */
data class HeartRateZoneDuration(val zone: HeartRateZone, val seconds: Long) {
    val minutes: Long get() = seconds / 60
    val isUnderOneMinute: Boolean get() = seconds in 1 until 60
}

/**
 * Minutes spent in each [MetricThresholds.heartRateZones] band, accumulated the way Huawei's detail
 * plugin does it (§3.2, D-1201) rather than as a percent-of-sample-count (that's
 * [HeartRateZoneBreakdown], kept as-is for the ring/percent display D-1195 already shipped): every HR
 * reading adds a fixed accumulation interval to its own zone. The boundaries are method 0 (%HRmax) —
 * the same ones [MetricThresholds.heartRateZones] already uses app-wide (D-1030), which happen to
 * match Huawei's method-0 bands (50/60/70/80/90/100%) exactly, so D-1201 did not add a second
 * threshold table for this.
 */
object HeartRateZoneDurations {

    /** Consecutive readings closer together than this are "dense" (§3.2) and get the 5 s interval. */
    private const val DENSE_GAP_SECONDS = 40L
    private const val DENSE_INTERVAL_SECONDS = 5L
    private const val SPARSE_INTERVAL_SECONDS = 60L

    /** From a workout's own per-second-ish [WorkoutSample]s (real or synthesized, D-1195). */
    fun fromWorkoutSamples(
        samples: List<WorkoutSample>,
        workoutDurationSeconds: Long,
        thresholds: MetricThresholds,
        maxHeartRateBpm: Int,
    ): List<HeartRateZoneDuration> {
        val timed = samples.filter { (it.heartRate ?: 0) > 0 }.sortedBy { it.time }
        return minutes(
            readings = timed.map { it.heartRate!! },
            workoutDurationSeconds = workoutDurationSeconds,
            thresholds = thresholds,
            maxHeartRateBpm = maxHeartRateBpm,
            averageGapSeconds = averageGapSeconds(timed.map { it.time }),
        )
    }

    /**
     * From the minute-level heart-rate stream (`HealthDataRepository.observeHeartRateSamples`), the
     * D-1195 fallback when a workout has no per-second heart rate — always one reading per minute by
     * construction, so the interval is always [SPARSE_INTERVAL_SECONDS].
     */
    fun fromMinuteReadings(
        readings: List<Int>,
        workoutDurationSeconds: Long,
        thresholds: MetricThresholds,
        maxHeartRateBpm: Int,
    ): List<HeartRateZoneDuration> =
        minutes(readings, workoutDurationSeconds, thresholds, maxHeartRateBpm, averageGapSeconds = SPARSE_INTERVAL_SECONDS)

    /**
     * Exposed directly (not just via the two convenience overloads above) so §3.2's density rule
     * itself — "5 s when dense, else 60 s" — is unit-testable without fabricating a timestamped
     * sample list for every case.
     */
    fun minutes(
        readings: List<Int>,
        workoutDurationSeconds: Long,
        thresholds: MetricThresholds,
        maxHeartRateBpm: Int,
        averageGapSeconds: Long,
    ): List<HeartRateZoneDuration> {
        val zones = thresholds.heartRateZones
        val usable = readings.filter { it > 0 }
        if (usable.isEmpty() || maxHeartRateBpm <= 0) return zones.map { HeartRateZoneDuration(it, 0L) }
        val interval = accumulationIntervalSeconds(usable.size, workoutDurationSeconds, averageGapSeconds)
        val seconds = zones.associateWith { 0L }.toMutableMap()
        usable.forEach { bpm ->
            val percentOfMax = (bpm * 100.0 / maxHeartRateBpm).roundToInt()
            thresholds.heartRateZoneFor(percentOfMax)?.let { zone -> seconds[zone] = seconds.getValue(zone) + interval }
        }
        return zones.map { zone -> HeartRateZoneDuration(zone, seconds.getValue(zone)) }
    }

    /** §3.2: 5 s when readings are dense, or when count×60s alone would already exceed the workout's
     * real duration; otherwise 60 s. */
    private fun accumulationIntervalSeconds(count: Int, workoutDurationSeconds: Long, averageGapSeconds: Long): Long =
        if (averageGapSeconds < DENSE_GAP_SECONDS || count.toLong() * SPARSE_INTERVAL_SECONDS > workoutDurationSeconds) {
            DENSE_INTERVAL_SECONDS
        } else {
            SPARSE_INTERVAL_SECONDS
        }

    private fun averageGapSeconds(times: List<Instant>): Long {
        if (times.size < 2) return SPARSE_INTERVAL_SECONDS
        val totalSeconds = Duration.between(times.first(), times.last()).seconds
        return (totalSeconds / (times.size - 1)).coerceAtLeast(1)
    }
}
