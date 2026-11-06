package com.unified.health.core.domain.usecase

import com.unified.health.core.domain.repository.HealthDataRepository
import com.unified.health.core.model.Workout
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import java.time.Clock
import java.time.Duration
import java.time.LocalDate
import java.time.ZoneId
import javax.inject.Inject

/** Seven local days, [start]..[end] inclusive, and what was recorded in them. */
data class WeeklyLoad(
    val start: LocalDate,
    val end: LocalDate,
    /** Heart-rate-weighted minutes, see [ActivityLoadCalculator]. */
    val load: Double,
    val workouts: Int,
    val duration: Duration,
    val distanceMeters: Double,
)

/** How the current week compares with the user's own recent baseline. */
enum class LoadTrend {
    /** Fewer than one earlier week with workouts: nothing to compare against yet. */
    NO_BASELINE,
    BELOW,
    STEADY,
    ABOVE,
}

data class ActivityLoadSummary(
    /** The last 7 days, today included. Same object as `weeks.last()`. */
    val current: WeeklyLoad,
    /** [ActivityLoadCalculator.WEEKS_SHOWN] rolling weeks, oldest first. */
    val weeks: List<WeeklyLoad>,
    /** Mean load of the [ActivityLoadCalculator.BASELINE_WEEKS] weeks before [current]; null without history. */
    val baseline: Double?,
    val trend: LoadTrend,
) {
    /** current / baseline, or null without a baseline. */
    val ratio: Double? get() = baseline?.takeIf { it > 0.0 }?.let { current.load / it }
}

/**
 * Generic, unbranded weekly activity load (docs/DECISIONS.md D-805). It is deliberately simple and
 * transparent, and is **not** a reproduction of any vendor score (Training Load, Body Battery, PAI…).
 *
 * - **Per workout:** `load = duration in minutes × intensity`, where `intensity = avgHR / 100`
 *   clamped to [MIN_INTENSITY]..[MAX_INTENSITY], or `1.0` when the workout has no average heart
 *   rate. So 45 min at 140 bpm = 63, 45 min without heart rate = 45.
 * - **Week:** rolling 7 local days ending on `today` (week 0 = today and the 6 days before), so the
 *   current week is never "half empty" on a Monday. A workout belongs to the day it started.
 * - **Baseline:** mean load of the [BASELINE_WEEKS] weeks before the current one, weeks without
 *   workouts counting as 0; only defined when at least one of them has a workout.
 * - **Trend:** `ratio = current / baseline`; below [LOW_RATIO] → [LoadTrend.BELOW], above
 *   [HIGH_RATIO] → [LoadTrend.ABOVE], otherwise [LoadTrend.STEADY]. The thresholds follow the
 *   common, public "acute vs. chronic load" rule of thumb from sports science.
 *
 * Inputs are only what drivers already store (workout start/end + average heart rate).
 */
object ActivityLoadCalculator {
    const val WEEKS_SHOWN = 8
    const val BASELINE_WEEKS = 4
    const val MIN_INTENSITY = 0.5
    const val MAX_INTENSITY = 2.0
    const val LOW_RATIO = 0.8
    const val HIGH_RATIO = 1.3

    fun workoutLoad(workout: Workout): Double {
        val minutes = workout.duration.toMillis().coerceAtLeast(0) / 60_000.0
        val intensity = workout.avgHeartRate?.takeIf { it > 0 }?.let { (it / 100.0).coerceIn(MIN_INTENSITY, MAX_INTENSITY) } ?: 1.0
        return minutes * intensity
    }

    fun summarize(workouts: List<Workout>, today: LocalDate, zone: ZoneId): ActivityLoadSummary {
        val weeks = (WEEKS_SHOWN - 1 downTo 0).map { back ->
            val end = today.minusDays(7L * back)
            val start = end.minusDays(6)
            val inWeek = workouts.filter { w ->
                val day = w.start.atZone(zone).toLocalDate()
                !day.isBefore(start) && !day.isAfter(end)
            }
            WeeklyLoad(
                start = start,
                end = end,
                load = inWeek.sumOf(::workoutLoad),
                workouts = inWeek.size,
                duration = inWeek.fold(Duration.ZERO) { acc, w -> acc + w.duration.coerceAtLeastZero() },
                distanceMeters = inWeek.sumOf { it.distanceMeters ?: 0.0 },
            )
        }
        val current = weeks.last()
        val previous = weeks.dropLast(1).takeLast(BASELINE_WEEKS)
        val baseline = if (previous.any { it.workouts > 0 }) previous.sumOf { it.load } / previous.size else null
        val trend = when {
            baseline == null || baseline <= 0.0 -> LoadTrend.NO_BASELINE
            current.load / baseline < LOW_RATIO -> LoadTrend.BELOW
            current.load / baseline > HIGH_RATIO -> LoadTrend.ABOVE
            else -> LoadTrend.STEADY
        }
        return ActivityLoadSummary(current, weeks, baseline, trend)
    }

    private fun Duration.coerceAtLeastZero(): Duration = if (isNegative) Duration.ZERO else this
}

class ObserveActivityLoadUseCase @Inject constructor(
    private val repository: HealthDataRepository,
) {
    operator fun invoke(clock: Clock = Clock.systemDefaultZone()): Flow<ActivityLoadSummary> =
        repository.observeWorkouts().map { ActivityLoadCalculator.summarize(it, LocalDate.now(clock), clock.zone) }
}
