package com.unified.health.feature.home

import java.time.LocalDate

/**
 * Pure selection logic for Home's "tap a mini ring in the week strip to preview that day on the big
 * ring" feature (D-1215) — no Android/Compose/clock dependency, so it's plain JVM-unit-testable on
 * its own (see `HomeDaySelectionTest`). [HomeViewModel] is the only caller; it always supplies
 * "today" from the already-loaded week ([com.unified.health.core.model.WeekActivityDay.isToday]'s
 * date), never a fresh `LocalDate.now()` read here, so this logic can never disagree with what the
 * week strip/big ring are already showing for "today".
 *
 * `null` is the selection's own "today" value throughout — never a date equal to today itself; every
 * entry point below normalizes a tap/restore that lands back on today to `null` rather than
 * `today`, so [com.unified.health.feature.home.HomeUiState.Success.selectedDate] == today never
 * happens (the "today" backdrop marker and the "selected" outline in `DayRing` are therefore always
 * mutually exclusive by construction, not by a separate UI-side check).
 */
internal object HomeDaySelection {

    /**
     * What tapping [tapped]'s mini ring does to the current selection ([current], `null` = today):
     *  - a future day (after [today]) is never tappable — returns [current] unchanged. Defensive
     *    only: the week strip itself disables future rings (no click, no ripple), so this branch
     *    shouldn't normally be reached from the UI at all.
     *  - tapping the day that's already effectively selected (`current ?: today`) toggles back to
     *    today (`null`) — covers both "tap the selected day again" and "tap today while it's already
     *    showing" (both are no-ops that read as "back to today").
     *  - otherwise selects [tapped], normalized to `null` if [tapped] happens to be today itself.
     */
    fun onDayTapped(current: LocalDate?, tapped: LocalDate, today: LocalDate): LocalDate? {
        if (tapped.isAfter(today)) return current
        val effectivelySelected = current ?: today
        return if (tapped == effectivelySelected) null else tapped.takeUnless { it == today }
    }

    /** The "Today" chip/action next to the date label: always jumps back to today, regardless of
     *  whatever is currently selected. */
    fun onJumpToToday(): LocalDate? = null

    /**
     * Resolves a selection restored from `SavedStateHandle` ([persisted], saved alongside
     * [persistedAsOfToday] — whatever date *was* "today" at the moment it was saved) against the
     * live week, dropping back to today (`null`) the moment any of these no longer hold:
     *  - there was a persisted selection at all;
     *  - it's still the same calendar day it was saved on — a new day always resets the selection,
     *    even one that stays inside the same calendar week (brief: "resets to today on a new day /
     *    when the week range changes" are two independent triggers, not one);
     *  - it's still one of the dates in the current [week];
     *  - it isn't today itself, or in the future (both defensive normalizations, same as
     *    [onDayTapped]).
     */
    fun resolveRestoredSelection(
        persisted: LocalDate?,
        persistedAsOfToday: LocalDate?,
        today: LocalDate,
        week: List<LocalDate>,
    ): LocalDate? {
        if (persisted == null) return null
        if (persistedAsOfToday != today) return null
        if (persisted !in week) return null
        if (persisted == today || persisted.isAfter(today)) return null
        return persisted
    }
}
