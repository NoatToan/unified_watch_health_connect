package com.unified.health.core.domain

import com.unified.health.core.domain.usecase.WorkoutHeartRateSeries
import com.unified.health.core.model.HeartRateSample
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Test
import java.time.Duration
import java.time.Instant

class WorkoutHeartRateSeriesTest {

    private val start = Instant.parse("2026-11-06T07:00:00Z")

    private fun sample(minute: Long, bpm: Int) = HeartRateSample(start.plus(Duration.ofMinutes(minute)), bpm)

    @Test
    fun `long workout is capped at max buckets with elapsed minute labels`() {
        val points = WorkoutHeartRateSeries.buckets(emptyList(), start, start.plus(Duration.ofMinutes(60)))
        assertEquals(WorkoutHeartRateSeries.MAX_BUCKETS, points.size)
        assertEquals("0m", points.first().label)
        assertEquals("2m", points[1].label)
        assertTrue(points.none { it.hasData })
    }

    @Test
    fun `short workout has one bucket per minute`() {
        assertEquals(10, WorkoutHeartRateSeries.buckets(emptyList(), start, start.plus(Duration.ofMinutes(10))).size)
    }

    @Test
    fun `buckets carry average and range, samples outside the workout are ignored`() {
        val samples = listOf(sample(-1, 200), sample(0, 100), sample(0, 120), sample(5, 150), sample(10, 200))
        val points = WorkoutHeartRateSeries.buckets(samples, start, start.plus(Duration.ofMinutes(10)))
        assertEquals(110f, points[0].value, 0f)
        assertEquals(100f, points[0].min)
        assertEquals(120f, points[0].max)
        assertEquals(150f, points[5].value, 0f)
        assertEquals(0f, points[9].value, 0f) // 10:00 is the end, exclusive
    }

    @Test
    fun `empty or inverted window gives no points`() {
        assertTrue(WorkoutHeartRateSeries.buckets(listOf(sample(0, 100)), start, start).isEmpty())
    }

    @Test
    fun `stats from samples`() {
        val stats = WorkoutHeartRateSeries.stats(listOf(sample(0, 100), sample(1, 140), sample(2, 0)))!!
        assertEquals(120, stats.average)
        assertEquals(100, stats.min)
        assertEquals(140, stats.max)
        assertNull(WorkoutHeartRateSeries.stats(emptyList()))
    }
}
