package com.unified.health.core.domain

import com.unified.health.core.model.StepsSummary
import com.unified.health.core.model.StressLevel
import com.unified.health.core.model.StressReading
import org.junit.Assert.assertEquals
import org.junit.Test
import java.time.Instant
import java.time.LocalDate

class StressReadingTest {
    @Test
    fun `stress score maps to level bands`() {
        val now = Instant.EPOCH
        assertEquals(StressLevel.RELAXED, StressReading(now, 10).level)
        assertEquals(StressLevel.NORMAL, StressReading(now, 45).level)
        assertEquals(StressLevel.MEDIUM, StressReading(now, 70).level)
        assertEquals(StressLevel.HIGH, StressReading(now, 95).level)
    }

    @Test
    fun `steps progress is clamped to 0_1`() {
        val date = LocalDate.of(2026, 1, 1)
        assertEquals(1f, StepsSummary(date, 12_000, 8_000, 0.0).progress)
        assertEquals(0f, StepsSummary(date, 100, 0, 0.0).progress)
        assertEquals(0.5f, StepsSummary(date, 4_000, 8_000, 0.0).progress)
    }
}
