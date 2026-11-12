package com.unified.health.core.domain

import com.unified.health.core.domain.usecase.WeekRange
import org.junit.Assert.assertEquals
import org.junit.Test
import java.time.DayOfWeek
import java.time.LocalDate

/** D-1196: Monday→Sunday week-range computation backing Home's week-rings strip. */
class WeekRangeTest {

    @Test
    fun `mondayOf returns the same date when it is already a Monday`() {
        val monday = LocalDate.of(2026, 11, 9) // a Monday
        assertEquals(DayOfWeek.MONDAY, monday.dayOfWeek)
        assertEquals(monday, WeekRange.mondayOf(monday))
    }

    @Test
    fun `mondayOf walks back to the most recent Monday for any day of the week`() {
        // 2026-11-09 (Mon) .. 2026-11-15 (Sun)
        val monday = LocalDate.of(2026, 11, 9)
        for (offset in 0..6) {
            val day = monday.plusDays(offset.toLong())
            assertEquals("offset $offset ($day, ${day.dayOfWeek})", monday, WeekRange.mondayOf(day))
        }
    }

    @Test
    fun `daysOf returns 7 consecutive days starting Monday ending Sunday`() {
        val days = WeekRange.daysOf(LocalDate.of(2026, 11, 12)) // a Thursday
        assertEquals(7, days.size)
        assertEquals(DayOfWeek.MONDAY, days.first().dayOfWeek)
        assertEquals(DayOfWeek.SUNDAY, days.last().dayOfWeek)
        assertEquals(LocalDate.of(2026, 11, 9), days.first())
        assertEquals(LocalDate.of(2026, 11, 15), days.last())
        // strictly consecutive, fixed positions (not a rolling window)
        days.zipWithNext().forEach { (a, b) -> assertEquals(a.plusDays(1), b) }
    }

    @Test
    fun `week spanning a month boundary stays Monday to Sunday`() {
        // 2026-11-30 is a Monday; the week it starts crosses straight into December.
        val days = WeekRange.daysOf(LocalDate.of(2026, 12, 2)) // the Wednesday after
        assertEquals(LocalDate.of(2026, 11, 30), days.first())
        assertEquals(LocalDate.of(2026, 12, 6), days.last())
    }

    @Test
    fun `week spanning a year boundary stays Monday to Sunday`() {
        // 2026-12-28 is a Monday; the week it starts crosses into 2027.
        val days = WeekRange.daysOf(LocalDate.of(2026, 12, 31)) // the Thursday that week
        assertEquals(LocalDate.of(2026, 12, 28), days.first())
        assertEquals(LocalDate.of(2027, 1, 3), days.last())
    }

    @Test
    fun `leap-year February boundary is handled by plain LocalDate arithmetic`() {
        // 2028 is a leap year; 2028-02-28 is a Monday, so the week runs straight through Feb 29.
        val days = WeekRange.daysOf(LocalDate.of(2028, 3, 1)) // the Wednesday that week
        assertEquals(LocalDate.of(2028, 2, 28), days.first())
        assertEquals(LocalDate.of(2028, 2, 29), days[1])
        assertEquals(LocalDate.of(2028, 3, 5), days.last())
    }
}
