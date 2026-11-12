package com.unified.health.core.model

import java.time.Instant
import java.time.LocalDate

/**
 * The 4 Hal Higdon "Novice" plans a user can actually select and follow (docs/DECISIONS.md D-1190) —
 * scoped deliberately narrower than `feature/training`'s full static reference guide (D-1185), which
 * still describes other plans (Couch to 5K, Galloway, Daniels VDOT, Hanson's, Pfitzinger,
 * Intermediate 10K) read-only with no calendar. [totalWeeks] is also [HigdonNoviceSchedules]'
 * week count for this plan — kept here too since it's cheap to show ("tuần 3/8") without generating
 * the full schedule first.
 */
enum class TrainingPlanId(val displayName: String, val totalWeeks: Int) {
    NOVICE_5K("Hal Higdon Novice 5K", 8),
    NOVICE_10K("Hal Higdon Novice 10K", 8),
    NOVICE_HALF("Hal Higdon Novice 1 Half Marathon", 12),
    NOVICE_MARATHON("Hal Higdon Novice 1 Marathon", 18),
}

/** What kind of session one [ScheduledDay] is. */
enum class ScheduledDayKind { RUN, CROSS, REST, RACE }

/**
 * One day of a [TrainingPlanId]'s generated calendar (D-1190) — produced by
 * [HigdonNoviceSchedules.generate] from a plan + `startDate`, then overlaid with whatever check-in
 * state `core:data`'s Room-backed repository has stored for it.
 */
data class ScheduledDay(
    val planId: TrainingPlanId,
    /** 0-based position within the whole plan (day 0 is the user's chosen start date). */
    val dayOffset: Int,
    val date: LocalDate,
    val kind: ScheduledDayKind,
    /** Set for [ScheduledDayKind.RUN], and for a handful of [ScheduledDayKind.RACE] days whose
     *  distance is known (e.g. "5K Race"). Null for [ScheduledDayKind.CROSS]/[ScheduledDayKind.REST]. */
    val distanceMeters: Double? = null,
    /** Set for [ScheduledDayKind.CROSS] days whose source material states a duration (e.g. "40min
     *  cross"); some marathon-plan Sundays are just "Cross" with no duration given, so this stays null. */
    val durationMinutes: Int? = null,
    /** Race-day display label, e.g. "5K Race"/"10K Race"/"Half Marathon"/"Marathon". Null otherwise. */
    val label: String? = null,
    val completed: Boolean = false,
    val completedAt: Instant? = null,
)

/**
 * The one plan a user is currently following (v1: only one active at a time, D-1190) — [schedule] is
 * the plan's full day list, [startDate] onward, already overlaid with check-in state.
 */
data class ActiveTrainingPlan(
    val planId: TrainingPlanId,
    val startDate: LocalDate,
    val schedule: List<ScheduledDay>,
) {
    /** 1-based current week ("tuần 3/8"), clamped to [TrainingPlanId.totalWeeks] so a plan that has
     *  run past its last day still reads as "tuần N/N" instead of counting forever. */
    fun currentWeek(today: LocalDate = LocalDate.now()): Int {
        val daysIn = java.time.temporal.ChronoUnit.DAYS.between(startDate, today).toInt()
        val week = (daysIn / 7) + 1
        return week.coerceIn(1, planId.totalWeeks)
    }

    /** The entry whose [ScheduledDay.date] is [today], or null once the plan's schedule doesn't cover
     *  that date (before `startDate`, or past the plan's last day). */
    fun entryOn(today: LocalDate = LocalDate.now()): ScheduledDay? = schedule.firstOrNull { it.date == today }
}
