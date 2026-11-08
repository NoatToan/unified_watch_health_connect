package com.unified.health.core.domain.repository

import com.unified.health.core.model.ChartPoint
import com.unified.health.core.model.DailyHealthSummary
import com.unified.health.core.model.HealthMetricType
import com.unified.health.core.model.HeartRateSample
import com.unified.health.core.model.MetricReading
import com.unified.health.core.model.SleepSession
import com.unified.health.core.model.TimeRange
import com.unified.health.core.model.Workout
import com.unified.health.core.model.WorkoutLap
import com.unified.health.core.model.WorkoutSample
import kotlinx.coroutines.flow.Flow
import java.time.Instant
import java.time.LocalDate

/** Read access to health metrics, regardless of origin (wearable, Health Connect, manual). */
interface HealthDataRepository {
    fun observeDailySummary(date: LocalDate): Flow<DailyHealthSummary>
    fun observeMetricSeries(metric: HealthMetricType, range: TimeRange, endDate: LocalDate): Flow<List<ChartPoint>>
    fun observeWorkouts(): Flow<List<Workout>>

    /** One workout by [Workout.id]; emits null when it does not exist (or was deleted). */
    fun observeWorkout(id: String): Flow<Workout?>

    /** Splits recorded for the workout [Workout.id] (D-1093), in lap order; empty when none were recorded. */
    fun observeWorkoutLaps(workoutId: String): Flow<List<WorkoutLap>>

    /** Per-second-ish samples recorded for the workout [Workout.id] (D-1093), oldest first. */
    fun observeWorkoutSamples(workoutId: String): Flow<List<WorkoutSample>>

    /**
     * Heart-rate samples with `from <= time < to`, oldest first. With [deviceId], only that device's
     * samples (a workout's own watch), otherwise every source.
     */
    fun observeHeartRateSamples(from: Instant, to: Instant, deviceId: String? = null): Flow<List<HeartRateSample>>
    fun observeSleep(date: LocalDate): Flow<SleepSession?>

    /**
     * Value shown on a Summary card: today's total for cumulative metrics, otherwise the most recent
     * reading (looking back up to a few weeks). Null when nothing was recorded.
     */
    fun observeLatestReading(metric: HealthMetricType, today: LocalDate): Flow<MetricReading?>

    /** "Show All Data": newest first, at most [limit] rows. */
    fun observeMetricReadings(metric: HealthMetricType, limit: Int = DEFAULT_READINGS_LIMIT): Flow<List<MetricReading>>

    companion object {
        const val DEFAULT_READINGS_LIMIT = 500
    }
}
