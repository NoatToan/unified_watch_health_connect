package com.unified.health.core.model

import java.time.LocalDate

/**
 * Generates a [TrainingPlanId]'s full day-by-day calendar from a `startDate` (docs/DECISIONS.md
 * D-1190) — pure function of (plan, startDate), no Android/Room dependency, so it lives in
 * `core/model` next to [TrainingPlan] and is unit-testable with plain JUnit.
 *
 * Numbers verified against halhigdon.com's own published km tables for all 4 "Novice" plans (checked
 * 2026-11-12, see the task brief that introduced this): [WEEKS_5K]/[WEEKS_10K]/[WEEKS_HALF]/
 * [WEEKS_MARATHON] below transcribe those tables exactly, nothing derived or invented.
 *
 * **Week-position model, not real-calendar-weekday**: each [DaySpec] in a week is a *position*
 * (0=the table's "Monday" column ... 6="Sunday"), and [generate] just lays [dayOffset] = weekIndex*7 +
 * position onto `startDate.plusDays(dayOffset)` — it does **not** snap `startDate` to an actual
 * Monday. So if a user starts on, say, a Wednesday, "position 0" of week 1 (always Rest in every one
 * of these 4 plans) simply falls on that Wednesday, and the plan's weekly rhythm continues correctly
 * from there; the calendar UI shows the *real* date/weekday for every entry, it just doesn't force a
 * Monday start. This was a deliberate simplification over normalizing to the Monday on/before
 * `startDate` — simpler to reason about and test, and nothing in the task brief requires real-weekday
 * alignment.
 */
object HigdonNoviceSchedules {

    fun generate(planId: TrainingPlanId, startDate: LocalDate): List<ScheduledDay> {
        val weeks = weeksFor(planId)
        val days = mutableListOf<ScheduledDay>()
        weeks.forEachIndexed { weekIndex, week ->
            week.forEachIndexed { position, spec ->
                val offset = weekIndex * 7 + position
                days += ScheduledDay(
                    planId = planId,
                    dayOffset = offset,
                    date = startDate.plusDays(offset.toLong()),
                    kind = spec.kind,
                    distanceMeters = spec.distanceMeters,
                    durationMinutes = spec.durationMinutes,
                    label = spec.label,
                )
            }
        }
        return days
    }

    private fun weeksFor(planId: TrainingPlanId): List<List<DaySpec>> = when (planId) {
        TrainingPlanId.NOVICE_5K -> WEEKS_5K
        TrainingPlanId.NOVICE_10K -> WEEKS_10K
        TrainingPlanId.NOVICE_HALF -> WEEKS_HALF
        TrainingPlanId.NOVICE_MARATHON -> WEEKS_MARATHON
    }

    private data class DaySpec(
        val kind: ScheduledDayKind,
        val distanceMeters: Double? = null,
        val durationMinutes: Int? = null,
        val label: String? = null,
    )

    private fun rest() = DaySpec(ScheduledDayKind.REST)
    private fun run(km: Double) = DaySpec(ScheduledDayKind.RUN, distanceMeters = km * 1000.0)
    private fun cross(minutes: Int) = DaySpec(ScheduledDayKind.CROSS, durationMinutes = minutes)
    private fun cross() = DaySpec(ScheduledDayKind.CROSS)
    private fun walk(minutes: Int) = DaySpec(ScheduledDayKind.CROSS, durationMinutes = minutes, label = "Đi bộ")
    private fun race(label: String, km: Double? = null) = DaySpec(ScheduledDayKind.RACE, distanceMeters = km?.times(1000.0), label = label)

    /** One week, position 0 ("Monday" column) through 6 ("Sunday" column) — [mon]/[fri] are Rest in
     *  every one of these 4 plans' own tables, so they default here instead of being repeated below. */
    private fun week(tue: DaySpec, wed: DaySpec, thu: DaySpec, sat: DaySpec, sun: DaySpec, mon: DaySpec = rest(), fri: DaySpec = rest()): List<DaySpec> =
        listOf(mon, tue, wed, thu, fri, sat, sun)

    /** Novice 5K (8 weeks) — Mon/Wed/Fri Rest every week; Sunday is a walk (minutes), not a run. */
    private val WEEKS_5K: List<List<DaySpec>> = listOf(
        week(tue = run(2.4), wed = rest(), thu = run(2.4), sat = run(2.4), sun = walk(30)),
        week(tue = run(2.8), wed = rest(), thu = run(2.4), sat = run(2.8), sun = walk(35)),
        week(tue = run(3.2), wed = rest(), thu = run(2.4), sat = run(3.2), sun = walk(40)),
        week(tue = run(3.6), wed = rest(), thu = run(2.4), sat = run(3.6), sun = walk(45)),
        week(tue = run(4.0), wed = rest(), thu = run(3.2), sat = run(4.0), sun = walk(50)),
        week(tue = run(4.4), wed = rest(), thu = run(3.2), sat = run(4.4), sun = walk(55)),
        week(tue = run(4.8), wed = rest(), thu = run(3.2), sat = run(4.8), sun = walk(60)),
        week(tue = run(4.8), wed = rest(), thu = run(3.2), sat = rest(), sun = race("5K Race", 5.0)),
    )

    /** Novice 10K (8 weeks) — Mon/Fri Rest; Wed/Sat are cross-training (minutes). */
    private val WEEKS_10K: List<List<DaySpec>> = listOf(
        week(tue = run(4.0), wed = cross(30), thu = run(3.2), sat = cross(40), sun = run(4.8)),
        week(tue = run(4.0), wed = cross(30), thu = run(3.2), sat = cross(40), sun = run(5.9)),
        week(tue = run(4.0), wed = cross(35), thu = run(3.2), sat = cross(50), sun = run(6.4)),
        week(tue = run(4.8), wed = cross(35), thu = run(3.2), sat = cross(50), sun = run(6.4)),
        week(tue = run(4.8), wed = cross(40), thu = run(3.2), sat = cross(60), sun = run(7.3)),
        week(tue = run(4.8), wed = cross(40), thu = run(3.2), sat = cross(60), sun = run(8.1)),
        week(tue = run(4.8), wed = cross(45), thu = run(3.2), sat = cross(60), sun = run(8.9)),
        week(tue = run(4.8), wed = cross(30), thu = run(3.2), sat = rest(), sun = race("10K Run", 10.0)),
    )

    /** Novice 1 Half Marathon (12 weeks) — Mon/Fri Rest; Wed is run-or-cross (treated as a run here,
     *  same as every other weekday km entry); Sat is cross-training (minutes) except weeks 6/9/12
     *  (tune-up race weeks / final taper week), which are Rest. */
    private val WEEKS_HALF: List<List<DaySpec>> = listOf(
        week(tue = run(4.8), wed = run(3.2), thu = run(4.8), sat = cross(30), sun = run(6.4)),
        week(tue = run(4.8), wed = run(3.2), thu = run(4.8), sat = cross(30), sun = run(6.4)),
        week(tue = run(5.6), wed = run(3.2), thu = run(5.6), sat = cross(40), sun = run(8.1)),
        week(tue = run(5.9), wed = run(3.2), thu = run(5.9), sat = cross(40), sun = run(8.1)),
        week(tue = run(6.4), wed = run(3.2), thu = run(6.4), sat = cross(40), sun = run(9.7)),
        week(tue = run(6.4), wed = run(3.2), thu = run(6.4), sat = rest(), sun = race("5K Race", 5.0)),
        week(tue = run(7.3), wed = run(4.8), thu = run(7.3), sat = cross(50), sun = run(11.3)),
        week(tue = run(7.3), wed = run(4.8), thu = run(7.3), sat = cross(50), sun = run(12.9)),
        week(tue = run(8.1), wed = run(4.8), thu = run(8.1), sat = rest(), sun = race("10K Race", 10.0)),
        week(tue = run(8.1), wed = run(4.8), thu = run(8.1), sat = cross(60), sun = run(14.5)),
        week(tue = run(8.1), wed = run(4.8), thu = run(8.1), sat = cross(60), sun = run(16.1)),
        week(tue = run(6.4), wed = run(4.8), thu = run(3.2), sat = rest(), sun = race("Half Marathon", 21.0975)),
    )

    /** Novice 1 Marathon (18 weeks) — Mon/Fri Rest; Tue/Wed/Thu are runs; Sat is the long run (or Rest
     *  on the 2 tune-up-race weeks and the final taper week); Sun is cross-training every week except
     *  those same 2 race weeks + the marathon itself — the source table gives no duration for these
     *  Sundays (unlike the Half plan's Saturdays), so [cross] with no minutes is used instead of
     *  inventing one. */
    private val WEEKS_MARATHON: List<List<DaySpec>> = listOf(
        week(tue = run(4.8), wed = run(4.8), thu = run(4.8), sat = run(9.7), sun = cross()),
        week(tue = run(4.8), wed = run(4.8), thu = run(4.8), sat = run(11.3), sun = cross()),
        week(tue = run(4.8), wed = run(6.4), thu = run(4.8), sat = run(8.1), sun = cross()),
        week(tue = run(4.8), wed = run(6.4), thu = run(4.8), sat = run(14.5), sun = cross()),
        week(tue = run(4.8), wed = run(8.1), thu = run(4.8), sat = run(16.1), sun = cross()),
        week(tue = run(4.8), wed = run(8.1), thu = run(4.8), sat = run(11.3), sun = cross()),
        week(tue = run(4.8), wed = run(9.7), thu = run(4.8), sat = run(19.3), sun = cross()),
        week(tue = run(4.8), wed = run(9.7), thu = run(4.8), sat = rest(), sun = race("Half Marathon", 21.0975)),
        week(tue = run(4.8), wed = run(11.3), thu = run(6.4), sat = run(16.1), sun = cross()),
        week(tue = run(4.8), wed = run(11.3), thu = run(6.4), sat = run(24.1), sun = cross()),
        week(tue = run(6.4), wed = run(12.9), thu = run(6.4), sat = run(25.7), sun = cross()),
        week(tue = run(6.4), wed = run(12.9), thu = run(8.1), sat = run(19.3), sun = cross()),
        week(tue = run(6.4), wed = run(14.5), thu = run(8.1), sat = run(29.0), sun = cross()),
        week(tue = run(8.1), wed = run(14.5), thu = run(8.1), sat = run(22.5), sun = cross()),
        week(tue = run(8.1), wed = run(16.1), thu = run(8.1), sat = run(32.2), sun = cross()),
        week(tue = run(8.1), wed = run(12.9), thu = run(6.4), sat = run(19.3), sun = cross()),
        week(tue = run(6.4), wed = run(9.7), thu = run(4.8), sat = run(12.9), sun = cross()),
        week(tue = run(4.8), wed = run(6.4), thu = run(3.2), sat = rest(), sun = race("Marathon", 42.195)),
    )
}
