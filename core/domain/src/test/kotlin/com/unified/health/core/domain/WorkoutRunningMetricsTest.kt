package com.unified.health.core.domain

import com.unified.health.core.domain.usecase.WorkoutRunningMetrics
import com.unified.health.core.model.UnitSystem
import com.unified.health.core.model.Workout
import com.unified.health.core.model.WorkoutSample
import com.unified.health.core.model.WorkoutType
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test
import java.time.Duration
import java.time.Instant

class WorkoutRunningMetricsTest {

    private val start = Instant.parse("2026-11-06T07:00:00Z")

    private fun workout(distanceMeters: Double?, duration: Duration) = Workout(
        id = "AA:BB@${start.toEpochMilli()}",
        type = WorkoutType.RUNNING,
        start = start,
        end = start.plus(duration),
        distanceMeters = distanceMeters,
    )

    @Test
    fun `avg pace is seconds per km for a 5km 30 minute run`() {
        val w = workout(5_000.0, Duration.ofMinutes(30))
        assertEquals(360.0, WorkoutRunningMetrics.avgPaceSecondsPerUnit(w, UnitSystem.METRIC)!!, 0.001)
    }

    @Test
    fun `avg pace converts to miles under imperial`() {
        val w = workout(5_000.0, Duration.ofMinutes(30))
        // 5000 m / 1609.344 m-per-mile = 3.10686 mi; 1800 s / 3.10686 mi ~= 579.4 s/mi
        assertEquals(579.4, WorkoutRunningMetrics.avgPaceSecondsPerUnit(w, UnitSystem.IMPERIAL)!!, 0.1)
    }

    @Test
    fun `avg speed is the inverse of avg pace, 3600 over seconds-per-unit`() {
        val w = workout(5_000.0, Duration.ofMinutes(30))
        assertEquals(10.0, WorkoutRunningMetrics.avgSpeedPerHour(w, UnitSystem.METRIC)!!, 0.001) // 10 km/h
    }

    @Test
    fun `pace and speed are null without a distance`() {
        val w = workout(null, Duration.ofMinutes(30))
        assertNull(WorkoutRunningMetrics.avgPaceSecondsPerUnit(w, UnitSystem.METRIC))
        assertNull(WorkoutRunningMetrics.avgSpeedPerHour(w, UnitSystem.METRIC))
    }

    @Test
    fun `pace and speed are null for a zero duration`() {
        val w = workout(5_000.0, Duration.ZERO)
        assertNull(WorkoutRunningMetrics.avgPaceSecondsPerUnit(w, UnitSystem.METRIC))
    }

    @Test
    fun `max speed is the fastest positive sample, converted to kmh`() {
        val samples = listOf(
            WorkoutSample(time = start, speedMps = 2.0),
            WorkoutSample(time = start.plusSeconds(10), speedMps = 4.0),
            WorkoutSample(time = start.plusSeconds(20), speedMps = 3.0),
        )
        assertEquals(14.4, WorkoutRunningMetrics.maxSpeedPerHour(samples, UnitSystem.METRIC)!!, 0.001) // 4 m/s * 3.6
    }

    @Test
    fun `max speed ignores zero and negative samples, null without any positive one`() {
        val samples = listOf(WorkoutSample(time = start, speedMps = 0.0), WorkoutSample(time = start, speedMps = -1.0))
        assertNull(WorkoutRunningMetrics.maxSpeedPerHour(samples, UnitSystem.METRIC))
    }

    @Test
    fun `estimated steps is cadence times minutes`() {
        assertEquals(5_400, WorkoutRunningMetrics.estimatedTotalSteps(avgCadenceSpm = 180, durationSeconds = 1_800)) // 180 spm * 30 min
    }

    @Test
    fun `estimated steps is null without a usable cadence`() {
        assertNull(WorkoutRunningMetrics.estimatedTotalSteps(avgCadenceSpm = null, durationSeconds = 1_800))
        assertNull(WorkoutRunningMetrics.estimatedTotalSteps(avgCadenceSpm = 0, durationSeconds = 1_800))
    }

    @Test
    fun `avg stride is distance over steps times 100`() {
        // 5000 m / 5400 steps * 100 = ~92.6 cm, a normal running stride.
        assertEquals(92.59, WorkoutRunningMetrics.avgStrideLengthCm(distanceMeters = 5_000.0, totalSteps = 5_400)!!, 0.01)
    }

    @Test
    fun `avg stride is hidden above 200cm`() {
        // 5000 m over only 2000 steps would be a 250cm stride - clearly bad data, not a real one.
        assertNull(WorkoutRunningMetrics.avgStrideLengthCm(distanceMeters = 5_000.0, totalSteps = 2_000))
    }

    @Test
    fun `avg stride is null without distance or steps`() {
        assertNull(WorkoutRunningMetrics.avgStrideLengthCm(distanceMeters = null, totalSteps = 5_400))
        assertNull(WorkoutRunningMetrics.avgStrideLengthCm(distanceMeters = 5_000.0, totalSteps = null))
    }
}
