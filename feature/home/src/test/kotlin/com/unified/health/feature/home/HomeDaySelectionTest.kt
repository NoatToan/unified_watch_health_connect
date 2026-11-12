package com.unified.health.feature.home

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test
import java.time.LocalDate

/** Pure-logic coverage for [HomeDaySelection] — no ViewModel/SavedStateHandle/clock involved, every
 *  date is a plain fixed [LocalDate] the test picks itself (D-1215 brief's explicit cases: toggle
 *  back to today, future rejected, out-of-week reset). */
class HomeDaySelectionTest {

    private val monday = LocalDate.of(2026, 11, 9)
    private val tuesday = LocalDate.of(2026, 11, 10)
    private val wednesday = LocalDate.of(2026, 11, 11)
    private val sunday = LocalDate.of(2026, 11, 15)
    private val nextMonday = LocalDate.of(2026, 11, 16)
    private val today = wednesday
    private val currentWeek = listOf(monday, tuesday, wednesday, LocalDate.of(2026, 11, 12), LocalDate.of(2026, 11, 13), LocalDate.of(2026, 11, 14), sunday)

    // -------------------------------------------------------------- onDayTapped

    @Test
    fun `tapping a day other than today selects it`() {
        assertEquals(tuesday, HomeDaySelection.onDayTapped(current = null, tapped = tuesday, today = today))
    }

    @Test
    fun `tapping the already-selected day toggles back to today`() {
        assertNull(HomeDaySelection.onDayTapped(current = tuesday, tapped = tuesday, today = today))
    }

    @Test
    fun `tapping today while it's already showing is a no-op that stays today`() {
        assertNull(HomeDaySelection.onDayTapped(current = null, tapped = today, today = today))
    }

    @Test
    fun `tapping today while another day is selected jumps back to today`() {
        assertNull(HomeDaySelection.onDayTapped(current = tuesday, tapped = today, today = today))
    }

    @Test
    fun `a future day is rejected, current selection is unchanged`() {
        val future = today.plusDays(3)
        assertEquals(tuesday, HomeDaySelection.onDayTapped(current = tuesday, tapped = future, today = today))
        assertNull(HomeDaySelection.onDayTapped(current = null, tapped = future, today = today))
    }

    @Test
    fun `switching from one non-today day to another just reselects`() {
        assertEquals(monday, HomeDaySelection.onDayTapped(current = tuesday, tapped = monday, today = today))
    }

    // -------------------------------------------------------------- onJumpToToday

    @Test
    fun `jump to today always returns null regardless of current selection`() {
        assertNull(HomeDaySelection.onJumpToToday())
    }

    // -------------------------------------------------------------- resolveRestoredSelection

    @Test
    fun `no persisted selection resolves to today`() {
        assertNull(HomeDaySelection.resolveRestoredSelection(persisted = null, persistedAsOfToday = today, today = today, week = currentWeek))
    }

    @Test
    fun `a valid same-day in-week selection survives restore`() {
        assertEquals(
            tuesday,
            HomeDaySelection.resolveRestoredSelection(persisted = tuesday, persistedAsOfToday = today, today = today, week = currentWeek),
        )
    }

    @Test
    fun `a new day resets the selection even if the date is still inside the same week`() {
        // Persisted on Wednesday (today = wednesday back then); restored a day later, Thursday is
        // "today" now — tuesday is still inside the same calendar week, but the day itself rolled
        // over, which alone must reset the selection per the brief.
        val thursday = LocalDate.of(2026, 11, 12)
        assertNull(
            HomeDaySelection.resolveRestoredSelection(persisted = tuesday, persistedAsOfToday = wednesday, today = thursday, week = currentWeek),
        )
    }

    @Test
    fun `a selection that fell out of the current week resets to today`() {
        // persistedAsOfToday still matches "today" (no day-rollover reset triggered), but the date
        // itself (tuesday) is no longer part of the week passed in (a new week's dates).
        val nextWeek = listOf(nextMonday, nextMonday.plusDays(1))
        assertNull(
            HomeDaySelection.resolveRestoredSelection(persisted = tuesday, persistedAsOfToday = today, today = nextMonday, week = nextWeek),
        )
    }

    @Test
    fun `a persisted selection equal to today normalizes to null`() {
        assertNull(
            HomeDaySelection.resolveRestoredSelection(persisted = today, persistedAsOfToday = today, today = today, week = currentWeek),
        )
    }

    @Test
    fun `a persisted future date is rejected defensively`() {
        val future = today.plusDays(2)
        assertNull(
            HomeDaySelection.resolveRestoredSelection(persisted = future, persistedAsOfToday = today, today = today, week = currentWeek + future),
        )
    }
}
