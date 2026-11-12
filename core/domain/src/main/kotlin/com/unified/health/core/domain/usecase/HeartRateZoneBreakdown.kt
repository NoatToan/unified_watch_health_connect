package com.unified.health.core.domain.usecase

import com.unified.health.core.domain.model.HeartRateZone
import com.unified.health.core.domain.model.MetricThresholds
import com.unified.health.core.model.WorkoutSample
import kotlin.math.roundToInt

/** One HR zone with the percent of a workout's heart-rate samples that fell inside it. */
data class HeartRateZoneShare(val zone: HeartRateZone, val percentOfTime: Double)

/**
 * Percent-of-workout-time spent in each [MetricThresholds.heartRateZones] band (docs/DECISIONS.md
 * D-1093): a sample count proportion is a reasonable stand-in for time since FIT `record` messages
 * are recorded at a roughly constant rate (about 1 Hz).
 */
object HeartRateZoneBreakdown {

    /** One entry per zone, Z1..Z5, in order; all 0% when there is no usable heart-rate data. */
    fun percentages(samples: List<WorkoutSample>, thresholds: MetricThresholds, maxHeartRateBpm: Int): List<HeartRateZoneShare> =
        percentagesFromReadings(samples.mapNotNull { it.heartRate }, thresholds, maxHeartRateBpm)

    /**
     * Same calculation directly from raw bpm readings (docs/DECISIONS.md D-1195): the fallback used
     * when a workout has no per-second [WorkoutSample]s with heart rate (e.g. a demo workout before
     * synthesis, or a real device whose FIT file only has a `session` summary) — the minute-level
     * heart-rate stream (`HealthDataRepository.observeHeartRateSamples`) is passed here instead, so
     * the workout detail screen still gets zone percentages.
     */
    fun percentagesFromReadings(readings: List<Int>, thresholds: MetricThresholds, maxHeartRateBpm: Int): List<HeartRateZoneShare> {
        val zones = thresholds.heartRateZones
        val usable = readings.filter { it > 0 }
        if (usable.isEmpty() || maxHeartRateBpm <= 0) return zones.map { HeartRateZoneShare(it, 0.0) }
        val counts = zones.associateWith { 0 }.toMutableMap()
        usable.forEach { bpm ->
            val percentOfMax = (bpm * 100.0 / maxHeartRateBpm).roundToInt()
            thresholds.heartRateZoneFor(percentOfMax)?.let { zone -> counts[zone] = counts.getValue(zone) + 1 }
        }
        val total = usable.size.toDouble()
        return zones.map { zone -> HeartRateZoneShare(zone, counts.getValue(zone) / total * 100.0) }
    }
}
