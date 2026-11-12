package com.unified.health.core.domain

import com.unified.health.core.domain.model.DefaultMetricThresholds
import com.unified.health.core.domain.usecase.HeartRateZoneBreakdown
import com.unified.health.core.model.WorkoutSample
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test
import java.time.Instant

class HeartRateZoneBreakdownTest {

    private val thresholds = DefaultMetricThresholds.VALUES
    private val maxHr = thresholds.estimatedMaxHeartRateBpm()
    private val start = Instant.parse("2026-11-06T07:00:00Z")

    @Test
    fun `all zones are zero without usable heart-rate data`() {
        val zones = HeartRateZoneBreakdown.percentages(emptyList(), thresholds, maxHr)
        assertEquals(thresholds.heartRateZones.size, zones.size)
        assertTrue(zones.all { it.percentOfTime == 0.0 })
    }

    @Test
    fun `percentages from samples and from raw readings agree`() {
        val samples = listOf(
            WorkoutSample(time = start, heartRate = 120),
            WorkoutSample(time = start.plusSeconds(1), heartRate = 150),
            WorkoutSample(time = start.plusSeconds(2), heartRate = 170),
            WorkoutSample(time = start.plusSeconds(3), heartRate = null), // ignored
            WorkoutSample(time = start.plusSeconds(4), heartRate = 0), // ignored
        )
        val fromSamples = HeartRateZoneBreakdown.percentages(samples, thresholds, maxHr)
        val fromReadings = HeartRateZoneBreakdown.percentagesFromReadings(listOf(120, 150, 170), thresholds, maxHr)
        assertEquals(fromReadings, fromSamples)
        assertEquals(100.0, fromSamples.sumOf { it.percentOfTime }, 0.001)
    }

    @Test
    fun `percentages from readings fall back to this when a workout has no per-second samples`() {
        // The minute-level heart-rate stream (HealthDataRepository#observeHeartRateSamples), used
        // when a workout's own samples carried no heart rate at all (docs/DECISIONS.md D-1195).
        val zones = HeartRateZoneBreakdown.percentagesFromReadings(listOf(100, 140, 180), thresholds, maxHr)
        assertEquals(100.0, zones.sumOf { it.percentOfTime }, 0.001)
        assertTrue(zones.any { it.percentOfTime > 0.0 })
    }

    @Test
    fun `zero or negative readings are excluded`() {
        val zones = HeartRateZoneBreakdown.percentagesFromReadings(listOf(0, -5, 140), thresholds, maxHr)
        // Only the single usable reading (140) counts, so it alone makes up 100% of whichever zone it falls in.
        assertEquals(100.0, zones.sumOf { it.percentOfTime }, 0.001)
    }
}
