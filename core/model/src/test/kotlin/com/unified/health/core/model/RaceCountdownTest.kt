package com.unified.health.core.model

import org.junit.Assert.assertEquals
import org.junit.Test
import java.time.LocalDate

class RaceCountdownTest {

    private val today = LocalDate.of(2026, 11, 8)

    @Test
    fun `before the race it counts down the days until startDate`() {
        val countdown = RaceCountdown.of(startDate = today.plusDays(21), endDate = null, today = today)
        assertEquals(RaceCountdown.DaysUntilStart(21L), countdown)
    }

    @Test
    fun `the day before start is 1 day left`() {
        val countdown = RaceCountdown.of(startDate = today.plusDays(1), endDate = null, today = today)
        assertEquals(RaceCountdown.DaysUntilStart(1L), countdown)
    }

    @Test
    fun `on startDate with no endDate it is ongoing, not 0 days left`() {
        assertEquals(RaceCountdown.Ongoing, RaceCountdown.of(startDate = today, endDate = null, today = today))
    }

    @Test
    fun `a multi-day race is ongoing from startDate through endDate inclusive`() {
        val start = today.minusDays(1)
        val end = today.plusDays(1)
        assertEquals(RaceCountdown.Ongoing, RaceCountdown.of(start, end, today))
        assertEquals(RaceCountdown.Ongoing, RaceCountdown.of(today, end, today))
        assertEquals(RaceCountdown.Ongoing, RaceCountdown.of(start, today, today))
    }

    @Test
    fun `after endDate (or startDate when there is no endDate) it is past`() {
        assertEquals(RaceCountdown.Past, RaceCountdown.of(startDate = today.minusDays(1), endDate = null, today = today))
        assertEquals(RaceCountdown.Past, RaceCountdown.of(startDate = today.minusDays(5), endDate = today.minusDays(1), today = today))
    }
}
