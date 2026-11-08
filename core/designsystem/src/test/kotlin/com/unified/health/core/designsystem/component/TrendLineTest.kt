package com.unified.health.core.designsystem.component

import com.unified.health.core.model.ChartPoint
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Test

class TrendLineTest {

    @Test
    fun `linear regression fits an exact straight line`() {
        val points = (0..4).map { ChartPoint(it.toString(), (10 + it * 2).toFloat()) }
        val trend = TrendLine.linearRegression(points)!!
        trend.forEachIndexed { i, v -> assertEquals((10 + i * 2).toFloat(), v, 0.01f) }
    }

    @Test
    fun `linear regression skips empty buckets when fitting`() {
        val points = listOf(
            ChartPoint("0", 10f),
            ChartPoint("1", 0f), // no data
            ChartPoint("2", 20f),
            ChartPoint("3", 30f),
        )
        val trend = TrendLine.linearRegression(points)!!
        // Least-squares fit of (0,10),(2,20),(3,30): slope 90/14, intercept 130/14 — still an
        // increasing line evaluated at every index, including the empty bucket at index 1.
        assertEquals(4, trend.size)
        assertEquals(9.2857f, trend[0], 0.01f)
        assertEquals(28.5714f, trend[3], 0.01f)
        assertTrue(trend[0] < trend[1] && trend[1] < trend[2] && trend[2] < trend[3])
    }

    @Test
    fun `linear regression is null with fewer than 2 data points`() {
        assertNull(TrendLine.linearRegression(listOf(ChartPoint("0", 10f), ChartPoint("1", 0f))))
        assertNull(TrendLine.linearRegression(emptyList()))
    }

    @Test
    fun `moving average smooths a noisy series`() {
        val points = listOf(10f, 50f, 10f, 50f, 10f, 50f, 10f).mapIndexed { i, v -> ChartPoint(i.toString(), v) }
        val trend = TrendLine.movingAverage(points, window = 3)!!
        assertEquals(7, trend.size)
        // Every smoothed value sits strictly between the series' min and max.
        trend.forEach { assertEquals(30f, it, 25f) }
    }

    @Test
    fun `moving average is null with fewer than 2 data points`() {
        assertNull(TrendLine.movingAverage(listOf(ChartPoint("0", 0f), ChartPoint("1", 0f)), window = 3))
    }
}
