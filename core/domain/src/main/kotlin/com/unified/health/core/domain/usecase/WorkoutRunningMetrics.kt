package com.unified.health.core.domain.usecase

import com.unified.health.core.model.UnitSystem
import com.unified.health.core.model.Workout
import com.unified.health.core.model.WorkoutSample
import com.unified.health.core.model.metersPerDistanceUnit
import kotlin.math.roundToInt

/**
 * Pace/speed/stride numbers Huawei's "Details" grid shows (§2.2/§9 of
 * docs/re-evidence/huawei/workout_detail_metrics.md, docs/DECISIONS.md D-1201), computed purely from
 * a [Workout]'s own stored summary and optional per-second samples — no laps required. These are raw
 * numbers; feature/activity formats them for display, the same way it already formats
 * [com.unified.health.feature.activity.paceOrSpeed].
 */
object WorkoutRunningMetrics {

    /** Above this stride length (cm) the value is unreliable and hidden (§2.3's "Avg stride" row). */
    const val MAX_STRIDE_LENGTH_CM = 200.0

    /**
     * Seconds per [unitSystem] distance unit (km or mi), from the workout's own total distance/time;
     * null without a positive distance or duration. Matches Huawei's
     * `elapsed_seconds * 1000 / distance_m` (§9), just expressed per display unit instead of per km.
     */
    fun avgPaceSecondsPerUnit(workout: Workout, unitSystem: UnitSystem): Double? {
        val meters = workout.distanceMeters?.takeIf { it > 0 } ?: return null
        val seconds = workout.duration.seconds.takeIf { it > 0 } ?: return null
        return seconds / (meters / unitSystem.metersPerDistanceUnit())
    }

    /** [unitSystem] distance units per hour; null under the same conditions as [avgPaceSecondsPerUnit]. */
    fun avgSpeedPerHour(workout: Workout, unitSystem: UnitSystem): Double? =
        avgPaceSecondsPerUnit(workout, unitSystem)?.let { 3_600.0 / it }

    /**
     * The fastest instantaneous sample speed, in [unitSystem] distance units per hour — Huawei only
     * shows this on the Route tab from a device extend field (`bestSpeed`, §1.5); we compute it from
     * samples instead (§9). Null without any positive [WorkoutSample.speedMps].
     */
    fun maxSpeedPerHour(samples: List<WorkoutSample>, unitSystem: UnitSystem): Double? {
        val maxMetersPerSecond = samples.mapNotNull { it.speedMps }.filter { it > 0 }.maxOrNull() ?: return null
        return maxMetersPerSecond * 3_600.0 / unitSystem.metersPerDistanceUnit()
    }

    /**
     * `avgCadenceSpm * durationSeconds / 60` (§9's fallback) — [Workout] never carries a real total
     * step count today, so every caller goes through this estimate rather than a device pedometer
     * value. Null without a usable cadence/duration.
     */
    fun estimatedTotalSteps(avgCadenceSpm: Int?, durationSeconds: Long): Int? {
        val cadence = avgCadenceSpm?.takeIf { it > 0 } ?: return null
        if (durationSeconds <= 0) return null
        return (cadence * durationSeconds / 60.0).roundToInt()
    }

    /**
     * `distance_m / steps * 100` cm (§9/§2.3's "Avg stride"); null above [MAX_STRIDE_LENGTH_CM] or
     * without a usable distance/step count.
     */
    fun avgStrideLengthCm(distanceMeters: Double?, totalSteps: Int?): Double? {
        val distance = distanceMeters?.takeIf { it > 0 } ?: return null
        val steps = totalSteps?.takeIf { it > 0 } ?: return null
        val strideCm = distance / steps * 100.0
        return strideCm.takeIf { it in 0.0..MAX_STRIDE_LENGTH_CM }
    }
}
