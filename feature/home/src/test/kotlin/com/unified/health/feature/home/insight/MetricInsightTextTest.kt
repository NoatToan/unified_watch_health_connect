package com.unified.health.feature.home.insight

import com.unified.health.core.domain.usecase.Highlight
import com.unified.health.core.domain.usecase.MetricStats
import com.unified.health.core.domain.usecase.StatKind
import com.unified.health.core.model.HealthMetricType
import com.unified.health.core.model.UnitSystem
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Before
import org.junit.Test
import java.util.Locale

/** Formatted numbers (e.g. "7,840") depend on the default locale, so it's pinned to en-US for these assertions. */
class MetricInsightTextTest {

    private lateinit var originalLocale: Locale

    @Before
    fun fixLocale() {
        originalLocale = Locale.getDefault()
        Locale.setDefault(Locale.US)
    }

    @After
    fun restoreLocale() {
        Locale.setDefault(originalLocale)
    }

    @Test
    fun `cumulative metric with an upward highlight gets a per-day trend line`() {
        val highlight = Highlight(HealthMetricType.STEPS, recentAverage = 7_840.0, previousAverage = 7_000.0)
        val line = metricInsightLine(HealthMetricType.STEPS, highlight, weekStats = null)
        assertEquals("Averaged 7,840 steps/day this week, +12% vs last week.", line)
    }

    @Test
    fun `discrete metric with a downward highlight has no per-day suffix`() {
        val highlight = Highlight(HealthMetricType.HEART_RATE, recentAverage = 64.0, previousAverage = 70.0)
        val line = metricInsightLine(HealthMetricType.HEART_RATE, highlight, weekStats = null)
        assertEquals("Averaged 64 bpm this week, -9% vs last week.", line)
    }

    @Test
    fun `sleep uses its own verb and no unit suffix`() {
        val highlight = Highlight(HealthMetricType.SLEEP, recentAverage = 432.0, previousAverage = 420.0)
        val line = metricInsightLine(HealthMetricType.SLEEP, highlight, weekStats = null)
        assertEquals("Slept 7 hr 12 min this week, +3% vs last week.", line)
    }

    @Test
    fun `steady trend reads as about the same`() {
        val highlight = Highlight(HealthMetricType.CALORIES, recentAverage = 500.0, previousAverage = 505.0)
        val line = metricInsightLine(HealthMetricType.CALORIES, highlight, weekStats = null)
        assertEquals("Averaged 500 kcal/day this week, about the same as last week.", line)
    }

    @Test
    fun `without two weeks of history falls back to this week's range for heart rate`() {
        val stats = MetricStats(StatKind.RANGE, value = 68.0, min = 58.0, max = 140.0)
        val line = metricInsightLine(HealthMetricType.HEART_RATE, highlight = null, weekStats = stats)
        assertEquals("This week 58–140 bpm.", line)
    }

    @Test
    fun `without two weeks of history falls back to this week's average`() {
        val stats = MetricStats(StatKind.AVERAGE, value = 96.0, min = 94.0, max = 99.0)
        val line = metricInsightLine(HealthMetricType.SPO2, highlight = null, weekStats = stats)
        assertEquals("This week's average 96%.", line)
    }

    @Test
    fun `nothing to say returns null`() {
        assertNull(metricInsightLine(HealthMetricType.WEIGHT, highlight = null, weekStats = null))
    }

    @Test
    fun `D-1183 Imperial switches a distance highlight's unit to mi`() {
        val highlight = Highlight(HealthMetricType.DISTANCE, recentAverage = 5_000.0, previousAverage = 4_500.0)
        val line = metricInsightLine(HealthMetricType.DISTANCE, highlight, weekStats = null, unitSystem = UnitSystem.IMPERIAL)
        assertEquals("Averaged 3.1 mi/day this week, +11% vs last week.", line)
    }
}
