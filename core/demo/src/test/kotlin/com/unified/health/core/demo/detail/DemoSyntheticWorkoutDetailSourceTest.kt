package com.unified.health.core.demo.detail

import com.unified.health.core.demo.DemoDeviceIds
import com.unified.health.core.model.Workout
import com.unified.health.core.model.WorkoutType
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertNull
import org.junit.Test
import java.time.Duration
import java.time.Instant

class DemoSyntheticWorkoutDetailSourceTest {

    private val start = Instant.parse("2026-11-06T07:00:00Z")
    private val source = DemoSyntheticWorkoutDetailSource()

    private fun workout(deviceId: String?) = Workout(
        id = "${deviceId}@${start.toEpochMilli()}",
        type = WorkoutType.RUNNING,
        start = start,
        end = start.plus(Duration.ofMinutes(30)),
        distanceMeters = 5_000.0,
        sourceDeviceId = deviceId,
    )

    @Test
    fun `every demo device id gets synthesized detail`() {
        DemoDeviceIds.ALL.forEach { deviceId ->
            assertNotNull("expected a supplement for demo device $deviceId", source.supplement(workout(deviceId)))
        }
    }

    @Test
    fun `a real device never gets synthesized detail`() {
        assertNull(source.supplement(workout("AA:BB:CC:DD:EE:FF")))
    }

    @Test
    fun `no device id (unknown source) never gets synthesized detail`() {
        assertNull(source.supplement(workout(null)))
    }
}
