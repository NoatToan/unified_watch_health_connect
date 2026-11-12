package com.unified.health.core.domain

import com.unified.health.core.domain.usecase.WorkoutElevation
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test

class WorkoutElevationTest {

    @Test
    fun `null without any altitude sample`() {
        assertNull(WorkoutElevation.fromAltitudeSamples(emptyList()))
    }

    @Test
    fun `a single sample is zero gain and descent, min equals max`() {
        val profile = WorkoutElevation.fromAltitudeSamples(listOf(42.0))!!
        assertEquals(0.0, profile.gainMeters, 0.0)
        assertEquals(0.0, profile.descentMeters, 0.0)
        assertEquals(42.0, profile.maxAltitudeMeters, 0.0)
        assertEquals(42.0, profile.minAltitudeMeters, 0.0)
    }

    @Test
    fun `a clean climb then descent sums exactly, with no hysteresis band`() {
        val profile = WorkoutElevation.fromAltitudeSamples(listOf(100.0, 110.0, 120.0, 105.0), hysteresisMeters = 0.0)!!
        assertEquals(20.0, profile.gainMeters, 0.001)
        assertEquals(15.0, profile.descentMeters, 0.001)
    }

    @Test
    fun `noise under the hysteresis band never accumulates`() {
        // Each step wobbles +/-1m around 100m - well under a 2.5m band - so this should read as flat.
        val noisy = listOf(100.0, 101.0, 100.0, 99.0, 100.5, 99.5, 100.0)
        val profile = WorkoutElevation.fromAltitudeSamples(noisy, hysteresisMeters = 2.5)!!
        assertEquals(0.0, profile.gainMeters, 0.0)
        assertEquals(0.0, profile.descentMeters, 0.0)
    }

    @Test
    fun `a real climb clears the hysteresis band and is counted`() {
        // A real net +10m climb across several noisy samples should still show up once the band is cleared.
        val samples = listOf(100.0, 101.0, 100.0, 105.0, 104.0, 110.0)
        val profile = WorkoutElevation.fromAltitudeSamples(samples, hysteresisMeters = 2.5)!!
        assertEquals(10.0, profile.gainMeters, 0.001)
        assertEquals(0.0, profile.descentMeters, 0.0)
    }

    @Test
    fun `max and min altitude are the sample extremes regardless of hysteresis`() {
        val profile = WorkoutElevation.fromAltitudeSamples(listOf(50.0, 80.0, 40.0, 60.0))!!
        assertEquals(80.0, profile.maxAltitudeMeters, 0.0)
        assertEquals(40.0, profile.minAltitudeMeters, 0.0)
    }
}
