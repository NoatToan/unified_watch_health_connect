package com.unified.health.core.domain

import com.unified.health.core.domain.usecase.HighlightCalculator
import com.unified.health.core.domain.usecase.MetricStatsCalculator
import com.unified.health.core.domain.usecase.StatKind
import com.unified.health.core.domain.usecase.Trend
import com.unified.health.core.model.ChartPoint
import com.unified.health.core.model.HealthMetricType
import com.unified.health.core.model.TimeRange
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test

class MetricInsightsTest {

    private fun points(vararg values: Float) = values.mapIndexed { i, v -> ChartPoint("$i", v) }

    @Test
    fun `cumulative day is a total, longer ranges average days with data`() {
        val day = MetricStatsCalculator.of(HealthMetricType.STEPS, TimeRange.DAY, points(100f, 0f, 300f))!!
        assertEquals(StatKind.TOTAL, day.kind)
        assertEquals(400.0, day.value, 0.0)
        val week = MetricStatsCalculator.of(HealthMetricType.STEPS, TimeRange.WEEK, points(1000f, 0f, 3000f))!!
        assertEquals(StatKind.AVERAGE, week.kind)
        assertEquals(2000.0, week.value, 0.0)
    }

    @Test
    fun `heart rate shows the range across bucket minima and maxima`() {
        val pts = listOf(ChartPoint("a", 70f, 55f, 120f), ChartPoint("b", 0f), ChartPoint("c", 80f, 60f, 150f))
        val stats = MetricStatsCalculator.of(HealthMetricType.HEART_RATE, TimeRange.WEEK, pts)!!
        assertEquals(StatKind.RANGE, stats.kind)
        assertEquals(55.0, stats.min!!, 0.0)
        assertEquals(150.0, stats.max!!, 0.0)
        assertEquals(75.0, stats.value, 0.0)
        assertEquals(StatKind.AVERAGE, MetricStatsCalculator.of(HealthMetricType.RESTING_HEART_RATE, TimeRange.WEEK, pts)!!.kind)
    }

    @Test
    fun `no data gives no stats`() {
        assertNull(MetricStatsCalculator.of(HealthMetricType.SPO2, TimeRange.MONTH, points(0f, 0f)))
    }

    @Test
    fun `highlight compares the last week with the one before`() {
        val daily = points(*FloatArray(16) { if (it < 9) 5_000f else 6_000f })
        val h = HighlightCalculator.compute(HealthMetricType.STEPS, daily)!!
        assertEquals(6_000.0, h.recentAverage, 0.0)
        assertEquals(5_000.0, h.previousAverage, 0.0)
        assertEquals(20, h.changePercent)
        assertEquals(Trend.UP, h.trend)
        assertNull(HighlightCalculator.compute(HealthMetricType.STEPS, points(1f, 2f)))
        assertNull(HighlightCalculator.compute(HealthMetricType.STEPS, points(*FloatArray(14))))
    }
}
