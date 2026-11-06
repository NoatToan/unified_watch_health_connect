package com.unified.health.core.domain

import com.unified.health.core.domain.usecase.ActivityLoadCalculator
import com.unified.health.core.domain.usecase.LoadTrend
import com.unified.health.core.model.Workout
import com.unified.health.core.model.WorkoutType
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test
import java.time.Duration
import java.time.LocalDate
import java.time.ZoneOffset

class ActivityLoadCalculatorTest {

    private val zone = ZoneOffset.UTC
    private val today = LocalDate.of(2026, 11, 6)

    private fun workout(daysAgo: Long, minutes: Long, avgHr: Int?, distance: Double? = null): Workout {
        val start = today.minusDays(daysAgo).atTime(7, 0).toInstant(zone)
        return Workout("w$daysAgo-$minutes", WorkoutType.RUNNING, start, start.plus(Duration.ofMinutes(minutes)), distanceMeters = distance, avgHeartRate = avgHr)
    }

    @Test
    fun `workout load is minutes times clamped heart rate intensity`() {
        assertEquals(63.0, ActivityLoadCalculator.workoutLoad(workout(0, 45, 140)), 1e-9)
        assertEquals(45.0, ActivityLoadCalculator.workoutLoad(workout(0, 45, null)), 1e-9)
        // 40 bpm → clamped to 0.5, 250 bpm → clamped to 2.0
        assertEquals(30.0, ActivityLoadCalculator.workoutLoad(workout(0, 60, 40)), 1e-9)
        assertEquals(120.0, ActivityLoadCalculator.workoutLoad(workout(0, 60, 250)), 1e-9)
    }

    @Test
    fun `no workouts gives eight empty weeks and no baseline`() {
        val summary = ActivityLoadCalculator.summarize(emptyList(), today, zone)
        assertEquals(ActivityLoadCalculator.WEEKS_SHOWN, summary.weeks.size)
        assertEquals(0.0, summary.current.load, 0.0)
        assertNull(summary.baseline)
        assertEquals(LoadTrend.NO_BASELINE, summary.trend)
    }

    @Test
    fun `weeks are rolling seven day windows ending today, oldest first`() {
        val summary = ActivityLoadCalculator.summarize(listOf(workout(6, 30, null), workout(7, 20, null)), today, zone)
        assertEquals(today, summary.current.end)
        assertEquals(today.minusDays(6), summary.current.start)
        assertEquals(30.0, summary.current.load, 1e-9) // 6 days ago is still this week
        assertEquals(20.0, summary.weeks[summary.weeks.size - 2].load, 1e-9) // 7 days ago is last week
        assertEquals(today.minusDays(7L * 7 + 6), summary.weeks.first().start)
    }

    @Test
    fun `baseline averages the previous four weeks including empty ones`() {
        // Previous weeks: 100, 0, 0, 100 → baseline 50. Current: 100 → ratio 2.0 → ABOVE.
        val workouts = listOf(workout(1, 100, null), workout(8, 100, null), workout(29, 100, null))
        val summary = ActivityLoadCalculator.summarize(workouts, today, zone)
        assertEquals(50.0, summary.baseline!!, 1e-9)
        assertEquals(2.0, summary.ratio!!, 1e-9)
        assertEquals(LoadTrend.ABOVE, summary.trend)
    }

    @Test
    fun `trend bands around the baseline`() {
        fun trendFor(currentMinutes: Long): LoadTrend {
            val history = (1..4).map { workout(7L * it, 100, null) }
            return ActivityLoadCalculator.summarize(history + workout(0, currentMinutes, null), today, zone).trend
        }
        assertEquals(LoadTrend.BELOW, trendFor(70))
        assertEquals(LoadTrend.STEADY, trendFor(80))
        assertEquals(LoadTrend.STEADY, trendFor(130))
        assertEquals(LoadTrend.ABOVE, trendFor(131))
    }

    @Test
    fun `current week totals count, duration and distance`() {
        val summary = ActivityLoadCalculator.summarize(listOf(workout(0, 30, 120, 5_000.0), workout(2, 45, null, null)), today, zone)
        assertEquals(2, summary.current.workouts)
        assertEquals(Duration.ofMinutes(75), summary.current.duration)
        assertEquals(5_000.0, summary.current.distanceMeters, 0.0)
    }
}
