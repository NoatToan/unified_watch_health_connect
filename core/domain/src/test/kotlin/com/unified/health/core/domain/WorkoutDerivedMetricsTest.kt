package com.unified.health.core.domain

import com.unified.health.core.domain.model.DefaultMetricThresholds
import com.unified.health.core.domain.usecase.WorkoutDerivedMetrics
import com.unified.health.core.model.Workout
import com.unified.health.core.model.WorkoutSample
import com.unified.health.core.model.WorkoutType
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Test
import java.time.Duration
import java.time.Instant

class WorkoutDerivedMetricsTest {

    private val start = Instant.parse("2026-11-06T07:00:00Z")

    private fun workout(activeKcal: Int?, duration: Duration) = Workout(
        id = "AA:BB@${start.toEpochMilli()}",
        type = WorkoutType.RUNNING,
        start = start,
        end = start.plus(duration),
        activeKcal = activeKcal,
    )

    @Test
    fun `kcal per minute divides active energy by the duration in minutes`() {
        val w = workout(activeKcal = 300, duration = Duration.ofMinutes(30))
        assertEquals(10.0, WorkoutDerivedMetrics.kcalPerMinute(w)!!, 0.0001)
    }

    @Test
    fun `fractional minutes are not truncated to zero`() {
        val w = workout(activeKcal = 20, duration = Duration.ofSeconds(90)) // 1.5 min
        assertEquals(20.0 / 1.5, WorkoutDerivedMetrics.kcalPerMinute(w)!!, 0.0001)
    }

    @Test
    fun `null without active energy`() {
        assertNull(WorkoutDerivedMetrics.kcalPerMinute(workout(activeKcal = null, duration = Duration.ofMinutes(10))))
    }

    @Test
    fun `null for a non-positive duration`() {
        assertNull(WorkoutDerivedMetrics.kcalPerMinute(workout(activeKcal = 100, duration = Duration.ZERO)))
    }

    @Test
    fun `null for zero or negative active energy`() {
        assertNull(WorkoutDerivedMetrics.kcalPerMinute(workout(activeKcal = 0, duration = Duration.ofMinutes(10))))
    }

    @Test
    fun `derive bundles kcal per minute and hr zones from the per-second samples`() {
        val thresholds = DefaultMetricThresholds.VALUES
        val maxHr = thresholds.estimatedMaxHeartRateBpm()
        val w = workout(activeKcal = 300, duration = Duration.ofMinutes(30))
        val detail = WorkoutDerivedMetrics.derive(
            workout = w,
            workoutSamples = listOf(WorkoutSample(time = w.start, heartRate = 150)),
            minuteHeartRateBpm = listOf(90), // must be ignored: the per-second sample above has usable HR
            thresholds = thresholds,
            maxHeartRateBpm = maxHr,
        )
        assertEquals(10.0, detail.kcalPerMinute!!, 0.0001)
        assertTrue(detail.hrZones.any { it.percentOfTime > 0.0 })
    }

    @Test
    fun `derive falls back to the minute-level stream without per-second heart rate`() {
        val thresholds = DefaultMetricThresholds.VALUES
        val maxHr = thresholds.estimatedMaxHeartRateBpm()
        val w = workout(activeKcal = null, duration = Duration.ofMinutes(30))
        val detail = WorkoutDerivedMetrics.derive(
            workout = w,
            workoutSamples = listOf(WorkoutSample(time = w.start, heartRate = null)), // no usable HR
            minuteHeartRateBpm = listOf(100, 140, 160),
            thresholds = thresholds,
            maxHeartRateBpm = maxHr,
        )
        assertEquals(100.0, detail.hrZones.sumOf { it.percentOfTime }, 0.001)
    }
}
