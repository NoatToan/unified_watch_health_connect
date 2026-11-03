package com.unified.health.core.data

import com.unified.health.core.data.database.HealthSampleEntity
import com.unified.health.core.data.database.SampleType
import com.unified.health.core.data.repository.HealthAggregation
import com.unified.health.core.model.SleepStage
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test
import java.time.ZoneOffset

class HealthAggregationTest {

    private fun sample(type: String, start: Long, value: Double, end: Long = start, device: String = "d1") =
        HealthSampleEntity(device, type, start, end, value)

    @Test
    fun `daily total wins over intervals and is not double counted across devices`() {
        val rows = listOf(
            sample(SampleType.STEPS, 0, 100.0),
            sample(SampleType.DAILY_STEPS, 0, 5_000.0, device = "watch"),
            sample(SampleType.DAILY_STEPS, 0, 4_800.0, device = "band"),
        )
        assertEquals(5_000, HealthAggregation.steps(rows))
    }

    @Test
    fun `intervals are summed when no daily total exists`() {
        val rows = listOf(sample(SampleType.STEPS, 0, 100.0), sample(SampleType.STEPS, 60_000, 40.0))
        assertEquals(140, HealthAggregation.steps(rows))
        assertEquals(140, HealthAggregation.stepsByHour(rows, ZoneOffset.UTC)[0])
    }

    @Test
    fun `sleep minutes exclude awake segments`() {
        val min = 60_000L
        val rows = listOf(
            sample(SampleType.SLEEP_STAGE, 0, SleepStage.LIGHT.ordinal.toDouble(), end = 30 * min),
            sample(SampleType.SLEEP_STAGE, 30 * min, SleepStage.AWAKE.ordinal.toDouble(), end = 40 * min),
            sample(SampleType.SLEEP_STAGE, 40 * min, SleepStage.DEEP.ordinal.toDouble(), end = 100 * min),
        )
        assertEquals(90, HealthAggregation.sleepMinutes(rows))
        assertEquals(100 * min, HealthAggregation.sleepSession(rows)!!.end.toEpochMilli())
        assertNull(HealthAggregation.sleepSession(emptyList()))
    }
}
