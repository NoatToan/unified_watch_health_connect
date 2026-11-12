package com.unified.health.core.domain.usecase

import com.unified.health.core.domain.model.MetricThresholds
import com.unified.health.core.model.UnitSystem
import com.unified.health.core.model.Workout
import com.unified.health.core.model.WorkoutLap
import com.unified.health.core.model.WorkoutSample
import java.time.Duration

/**
 * Every value [WorkoutDerivedMetrics.derive] computes on the fly for one workout's detail screen
 * (docs/DECISIONS.md D-1195/D-1201) — one holder instead of a growing list of loose
 * `WorkoutDetailUiState` fields, so a future metric (training load/recovery — the device-only part of
 * the Huawei-detail-parity follow-up that still needs a real field) is a new field *here* plus one
 * new line in [derive], not another constructor parameter threaded through the ViewModel and every
 * call site.
 */
data class WorkoutDerivedDetail(
    /** activeKcal/duration; null without [Workout.activeKcal] or a non-positive duration. */
    val kcalPerMinute: Double? = null,
    /** % of workout time in each HR zone; see [HeartRateZoneBreakdown]. All 0 without usable HR data. */
    val hrZones: List<HeartRateZoneShare> = emptyList(),
    /** Minutes-in-zone version of [hrZones] (D-1201 §3.2's accumulation rule — not a sample-count
     * percentage, see [HeartRateZoneDurations]). */
    val hrZoneDurations: List<HeartRateZoneDuration> = emptyList(),
    /** Min of whichever HR source [hrZones] itself used (samples, else the minute-level stream). */
    val minHeartRate: Int? = null,
    /** Seconds per the caller's [UnitSystem] distance unit; null without distance/duration. */
    val avgPaceSecondsPerUnit: Double? = null,
    /** [UnitSystem] distance units per hour; null under the same conditions as [avgPaceSecondsPerUnit]. */
    val avgSpeedPerHour: Double? = null,
    /** From the fastest instantaneous sample — Huawei doesn't display its own summary field either (§9). */
    val maxSpeedPerHour: Double? = null,
    /** `cadence * duration` (D-1201 §9: no real step count field exists on [Workout] yet). */
    val estimatedTotalSteps: Int? = null,
    /** cm; null when hidden (>200 cm, see [WorkoutRunningMetrics]) or not derivable. */
    val avgStrideLengthCm: Double? = null,
    val splits: WorkoutSplitsSummary = WorkoutSplitsSummary(),
    /** Null without any altitude sample; a workout's laps carrying their own ascent/descent win over
     * this (see [com.unified.health.feature.activity.detail.WorkoutDetailViewModel]). */
    val elevation: WorkoutElevationProfile? = null,
)

/**
 * Metrics computed on the fly from a [Workout]'s own stored summary fields, or from its minute-level
 * heart-rate stream as a fallback (docs/DECISIONS.md D-1195) — no FIT laps/samples needed for most of
 * these, so they are always available, for every workout (real or demo), the moment its detail is
 * opened. D-1201 extended this with the rest of docs/re-evidence/huawei/workout_detail_metrics.md §9's
 * "can compute ourselves" list: pace/speed/stride/splits/elevation/HR-zone minutes.
 */
object WorkoutDerivedMetrics {

    /**
     * [WorkoutDerivedDetail] for [workout]. [workoutSamples] should already be the "effective" ones
     * (real rows, or a demo fallback — see [com.unified.health.core.domain.repository.SyntheticWorkoutDetailSource]):
     * this function only decides *within* that list whether HR is usable, and falls back to
     * [minuteHeartRateBpm] (the workout's own device, `HealthDataRepository#observeHeartRateSamples`)
     * when it isn't. [laps] should likewise already be the effective ones; [avgCadence] is the
     * ViewModel's own sample/lap-cadence average (D-1093), passed in rather than recomputed here so
     * there is exactly one place that decides cadence precedence.
     */
    fun derive(
        workout: Workout,
        workoutSamples: List<WorkoutSample>,
        minuteHeartRateBpm: List<Int>,
        thresholds: MetricThresholds,
        maxHeartRateBpm: Int,
        laps: List<WorkoutLap> = emptyList(),
        unitSystem: UnitSystem = UnitSystem.METRIC,
        avgCadence: Int? = null,
    ): WorkoutDerivedDetail {
        val sampleHeartRates = workoutSamples.mapNotNull { it.heartRate }.filter { it > 0 }
        val usingSampleHr = sampleHeartRates.isNotEmpty()
        val hrZones = if (usingSampleHr) {
            HeartRateZoneBreakdown.percentages(workoutSamples, thresholds, maxHeartRateBpm)
        } else {
            HeartRateZoneBreakdown.percentagesFromReadings(minuteHeartRateBpm, thresholds, maxHeartRateBpm)
        }
        val hrZoneDurations = if (usingSampleHr) {
            HeartRateZoneDurations.fromWorkoutSamples(workoutSamples, workout.duration.seconds, thresholds, maxHeartRateBpm)
        } else {
            HeartRateZoneDurations.fromMinuteReadings(minuteHeartRateBpm, workout.duration.seconds, thresholds, maxHeartRateBpm)
        }
        val minHeartRate = (if (usingSampleHr) sampleHeartRates else minuteHeartRateBpm.filter { it > 0 }).minOrNull()
        val estimatedSteps = WorkoutRunningMetrics.estimatedTotalSteps(avgCadence, workout.duration.seconds)

        return WorkoutDerivedDetail(
            kcalPerMinute = kcalPerMinute(workout),
            hrZones = hrZones,
            hrZoneDurations = hrZoneDurations,
            minHeartRate = minHeartRate,
            avgPaceSecondsPerUnit = WorkoutRunningMetrics.avgPaceSecondsPerUnit(workout, unitSystem),
            avgSpeedPerHour = WorkoutRunningMetrics.avgSpeedPerHour(workout, unitSystem),
            maxSpeedPerHour = WorkoutRunningMetrics.maxSpeedPerHour(workoutSamples, unitSystem),
            estimatedTotalSteps = estimatedSteps,
            avgStrideLengthCm = WorkoutRunningMetrics.avgStrideLengthCm(workout.distanceMeters, estimatedSteps),
            splits = WorkoutSplits.compute(workout, laps, workoutSamples, unitSystem),
            elevation = WorkoutElevation.fromAltitudeSamples(workoutSamples.mapNotNull { it.altitudeMeters }),
        )
    }

    /** Active kcal burned per minute; null without [Workout.activeKcal] or a non-positive duration. */
    fun kcalPerMinute(workout: Workout): Double? {
        val kcal = workout.activeKcal?.takeIf { it > 0 } ?: return null
        val minutes = workout.duration.toMinutesExact()
        return (kcal / minutes).takeIf { it.isFinite() }
    }

    /** Fractional minutes (unlike [Duration.toMinutes], which truncates), so a 90s workout isn't 0. */
    private fun Duration.toMinutesExact(): Double = seconds / 60.0
}
