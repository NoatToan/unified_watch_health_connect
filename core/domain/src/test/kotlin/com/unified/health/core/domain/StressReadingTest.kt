package com.unified.health.core.domain

import com.unified.health.core.domain.model.DefaultMetricThresholds
import com.unified.health.core.model.StepsSummary
import com.unified.health.core.model.StressLevel
import org.junit.Assert.assertEquals
import org.junit.Test
import java.time.LocalDate

class StressReadingTest {
    @Test
    fun `stress score maps to level bands`() {
        val thresholds = DefaultMetricThresholds.VALUES
        assertEquals(StressLevel.RELAXED, thresholds.stressLevelFor(10))
        assertEquals(StressLevel.NORMAL, thresholds.stressLevelFor(45))
        assertEquals(StressLevel.MEDIUM, thresholds.stressLevelFor(70))
        assertEquals(StressLevel.HIGH, thresholds.stressLevelFor(95))
    }

    @Test
    fun `steps progress is clamped to 0_1`() {
        val date = LocalDate.of(2026, 1, 1)
        assertEquals(1f, StepsSummary(date, 12_000, 8_000, 0.0).progress)
        assertEquals(0f, StepsSummary(date, 100, 0, 0.0).progress)
        assertEquals(0.5f, StepsSummary(date, 4_000, 8_000, 0.0).progress)
    }
}
