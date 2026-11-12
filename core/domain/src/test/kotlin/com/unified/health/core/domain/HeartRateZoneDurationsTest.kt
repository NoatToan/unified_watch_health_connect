package com.unified.health.core.domain

import com.unified.health.core.domain.model.DefaultMetricThresholds
import com.unified.health.core.domain.usecase.HeartRateZoneDurations
import com.unified.health.core.model.WorkoutSample
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test
import java.time.Instant

class HeartRateZoneDurationsTest {

    private val thresholds = DefaultMetricThresholds.VALUES
    private val maxHr = 190 // so 90-100% zone (Z5) is 171-190 bpm, chosen to land cleanly below.
    private val start = Instant.parse("2026-11-06T07:00:00Z")

    @Test
    fun `all zero without usable heart rate`() {
        val result = HeartRateZoneDurations.minutes(emptyList(), 600, thresholds, maxHr, averageGapSeconds = 5)
        assertTrue(result.all { it.seconds == 0L })
    }

    @Test
    fun `dense readings accumulate 5 seconds per reading`() {
        // 100% in zone 5 (90-100% of 190 = 171-190bpm): 10 readings * 5s = 50s.
        val readings = List(10) { 180 }
        val result = HeartRateZoneDurations.minutes(readings, workoutDurationSeconds = 600, thresholds, maxHr, averageGapSeconds = 5)
        val z5 = result.first { it.zone.zone == 5 }
        assertEquals(50L, z5.seconds)
        assertTrue(z5.isUnderOneMinute)
    }

    @Test
    fun `sparse readings accumulate 60 seconds per reading`() {
        val readings = List(10) { 180 } // 10 one-per-minute readings over a 10 minute workout.
        val result = HeartRateZoneDurations.minutes(readings, workoutDurationSeconds = 600, thresholds, maxHr, averageGapSeconds = 60)
        val z5 = result.first { it.zone.zone == 5 }
        assertEquals(600L, z5.seconds)
        assertEquals(10L, z5.minutes)
    }

    @Test
    fun `a count times 60s that exceeds the workout duration forces the dense interval`() {
        // 20 one-per-minute-shaped readings but only a 10 minute (600s) workout: 20*60=1200 > 600.
        val readings = List(20) { 180 }
        val result = HeartRateZoneDurations.minutes(readings, workoutDurationSeconds = 600, thresholds, maxHr, averageGapSeconds = 60)
        val z5 = result.first { it.zone.zone == 5 }
        assertEquals(100L, z5.seconds) // 20 * 5s, not 20 * 60s
    }

    @Test
    fun `fromWorkoutSamples computes the average gap from timestamps and picks the dense interval`() {
        val samples = (0 until 12).map { i -> WorkoutSample(time = start.plusSeconds(i * 5L), heartRate = 180) }
        val result = HeartRateZoneDurations.fromWorkoutSamples(samples, workoutDurationSeconds = 600, thresholds, maxHr)
        val z5 = result.first { it.zone.zone == 5 }
        assertEquals(60L, z5.seconds) // 12 readings * 5s
    }

    @Test
    fun `fromMinuteReadings always uses the sparse 60s interval`() {
        val result = HeartRateZoneDurations.fromMinuteReadings(List(5) { 180 }, workoutDurationSeconds = 600, thresholds, maxHr)
        val z5 = result.first { it.zone.zone == 5 }
        assertEquals(300L, z5.seconds)
    }
}
