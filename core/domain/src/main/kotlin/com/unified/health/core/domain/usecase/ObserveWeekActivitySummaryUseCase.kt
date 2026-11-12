package com.unified.health.core.domain.usecase

import com.unified.health.core.domain.repository.HealthDataRepository
import com.unified.health.core.model.WeekActivityDay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.map
import java.time.Clock
import java.time.DayOfWeek
import java.time.LocalDate
import java.time.temporal.TemporalAdjusters
import javax.inject.Inject

/**
 * Monday→Sunday dates of the calendar week [date] falls in (Vietnam convention, D-1196) — fixed
 * positions (index 0 = Monday, index 6 = Sunday), never a rolling 7-day window. Pure [LocalDate]
 * arithmetic throughout, so this is unaffected by DST transitions (no [java.time.Instant]/zone math
 * involved once "today" has been resolved to a date).
 */
object WeekRange {
    fun mondayOf(date: LocalDate): LocalDate = date.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY))

    fun daysOf(date: LocalDate): List<LocalDate> {
        val monday = mondayOf(date)
        return List(7) { monday.plusDays(it.toLong()) }
    }
}

/**
 * D-1196: the 7 days (Monday→Sunday) of the current calendar week, each with its own
 * [com.unified.health.core.model.DailyHealthSummary] — backs Home's "7 mini rings" week strip under
 * the big ring. Reuses [HealthDataRepository.observeDailySummary] per day, the exact same source
 * [ObserveTodaySummaryUseCase] uses for "today", so today's entry here always matches the big ring's
 * numbers exactly. Updates live: each day is its own repository flow, so a change to any day's data
 * (e.g. today's steps ticking up) recomposes only that day.
 */
class ObserveWeekActivitySummaryUseCase @Inject constructor(
    private val repository: HealthDataRepository,
) {
    operator fun invoke(clock: Clock = Clock.systemDefaultZone()): Flow<List<WeekActivityDay>> {
        val today = LocalDate.now(clock)
        val dayFlows = WeekRange.daysOf(today).map { date ->
            repository.observeDailySummary(date).map { summary ->
                WeekActivityDay(summary = summary, isToday = date == today, isFuture = date.isAfter(today))
            }
        }
        return combine(dayFlows) { it.toList() }
    }
}
