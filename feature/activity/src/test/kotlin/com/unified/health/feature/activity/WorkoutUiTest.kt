package com.unified.health.feature.activity

import com.unified.health.core.model.Workout
import com.unified.health.core.model.WorkoutType
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test
import java.time.Duration
import java.time.Instant
import java.util.Locale

class WorkoutUiTest {

    private val start = Instant.parse("2026-11-06T07:00:00Z")
    private fun workout(type: WorkoutType, minutes: Long, meters: Double?) =
        Workout("x", type, start, start.plus(Duration.ofMinutes(minutes)), distanceMeters = meters)

    @Test
    fun `stopwatch formatting`() {
        assertEquals("45:00", Duration.ofMinutes(45).stopwatch())
        assertEquals("1:05:09", Duration.ofSeconds(3909).stopwatch())
    }

    @Test
    fun `pace for running, speed for cycling, nothing without distance`() {
        assertEquals("5'00\"", workout(WorkoutType.RUNNING, 25, 5_000.0).paceOrSpeed(Locale.US)!!.value)
        assertEquals("24.0", workout(WorkoutType.CYCLING, 60, 24_000.0).paceOrSpeed(Locale.US)!!.value)
        assertNull(workout(WorkoutType.STRENGTH, 30, 1_000.0).paceOrSpeed(Locale.US))
        assertNull(workout(WorkoutType.RUNNING, 30, null).paceOrSpeed(Locale.US))
    }
}
