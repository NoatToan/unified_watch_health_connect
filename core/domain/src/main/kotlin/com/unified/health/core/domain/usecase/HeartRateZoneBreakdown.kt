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
    fun percentages(samples: List<WorkoutSample>, thresholds: MetricThresholds, maxHeartRateBpm: Int): List<HeartRateZoneShare> {
        val zones = thresholds.heartRateZones
        val readings = samples.mapNotNull { it.heartRate }.filter { it > 0 }
        if (readings.isEmpty() || maxHeartRateBpm <= 0) return zones.map { HeartRateZoneShare(it, 0.0) }
        val counts = zones.associateWith { 0 }.toMutableMap()
        readings.forEach { bpm ->
            val percentOfMax = (bpm * 100.0 / maxHeartRateBpm).roundToInt()
            thresholds.heartRateZoneFor(percentOfMax)?.let { zone -> counts[zone] = counts.getValue(zone) + 1 }
        }
        val total = readings.size.toDouble()
        return zones.map { zone -> HeartRateZoneShare(zone, counts.getValue(zone) / total * 100.0) }
    }
}
