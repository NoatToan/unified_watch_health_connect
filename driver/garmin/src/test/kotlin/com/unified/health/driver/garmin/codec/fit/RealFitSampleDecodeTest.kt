package com.unified.health.driver.garmin.codec.fit

import com.unified.health.core.model.HealthRecord
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test
import java.io.File
import java.time.ZoneOffset

/**
 * Decodes real Garmin ACTIVITY FIT files against [FitDecoder] + [FitHealthMapper] (H2 of the
 * "no Garmin workouts" investigation, D-garmin13/14): confirms the decoder — compressed-timestamp
 * headers, developer data fields (flag 0x20), big/little-endian architectures, invalid-value
 * sentinels — handles files a real watch/Garmin FIT SDK produces, not just hand-built test vectors.
 *
 * Fixtures are Garmin's own public FIT SDK sample/test activities (Garmin FIT Protocol License,
 * royalty-free for using the FIT protocol; not GPL), copied from
 * https://github.com/garmin/fit-python-sdk/tree/master/tests/fits into `src/test/resources/fit-samples/`.
 */
class RealFitSampleDecodeTest {

    private fun sample(name: String) = File("src/test/resources/fit-samples/$name").readBytes()

    @Test
    fun `ActivityDevFields decodes to one stand_up_paddleboarding workout`() {
        val file = FitDecoder.decode(sample("ActivityDevFields.fit"))
        assertEquals(32, file.protocolVersion)
        val workouts = FitHealthMapper.map(file, ZoneOffset.UTC, DailyActivityAccumulator()).filterIsInstance<HealthRecord.Workout>()
        val workout = workouts.single()
        assertEquals("stand_up_paddleboarding", workout.sport)
        assertEquals(3601, workout.end.epochSecond - workout.start.epochSecond)
    }

    @Test
    fun `HrmPluginTestActivity decodes to one walking workout with sensible distance and HR`() {
        val file = FitDecoder.decode(sample("HrmPluginTestActivity.fit"))
        val workouts = FitHealthMapper.map(file, ZoneOffset.UTC, DailyActivityAccumulator()).filterIsInstance<HealthRecord.Workout>()
        val workout = workouts.single()
        assertEquals("walking", workout.sport)
        assertEquals(60.0, workout.distanceMeters)
        assertEquals(12, workout.activeKcal)
        assertEquals(73, workout.avgHeartRate)
        assertEquals(93, workout.maxHeartRate)
        assertEquals(309, workout.end.epochSecond - workout.start.epochSecond)
    }

    @Test
    fun `WithGearChangeData decodes without a session message but does not throw`() {
        // Gear-change fixture: records only, no session (18) summary. Exercises the decoder (1979
        // record messages, developer/compressed-timestamp paths) without expecting a Workout.
        val file = FitDecoder.decode(sample("WithGearChangeData.fit"))
        assertTrue(file.messages.isNotEmpty())
        val workouts = FitHealthMapper.map(file, ZoneOffset.UTC, DailyActivityAccumulator()).filterIsInstance<HealthRecord.Workout>()
        assertTrue(workouts.isEmpty())
    }
}
