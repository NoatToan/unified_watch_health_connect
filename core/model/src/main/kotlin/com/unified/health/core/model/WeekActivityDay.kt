package com.unified.health.core.model

/**
 * One day's activity-ring data for Home's "7 mini rings" week strip (D-1196). [summary]'s own
 * `date` is the calendar day it covers; [isToday]/[isFuture] are relative to whatever clock the
 * producing use case was given — see `ObserveWeekActivitySummaryUseCase` (`:core:domain`).
 */
data class WeekActivityDay(
    val summary: DailyHealthSummary,
    val isToday: Boolean,
    val isFuture: Boolean,
)
