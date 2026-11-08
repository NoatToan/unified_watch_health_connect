package com.unified.health.core.model

import java.time.Duration
import java.time.Instant
import java.time.LocalDate

/**
 * Every metric surfaced on the dashboard / detail screens. Names are persisted (pinned metrics,
 * navigation arguments), so never rename an existing value; append new ones.
 */
enum class HealthMetricType {
    STEPS,
    HEART_RATE,
    SLEEP,
    SPO2,
    STRESS,

    /** Active energy (kcal). */
    CALORIES,
    WEIGHT,

    /** Walking + running distance (meters). */
    DISTANCE,
    EXERCISE_MINUTES,
    RESTING_HEART_RATE,

    /** Heart rate variability (ms). */
    HRV,
    ;

    /** How values of this metric combine over time. */
    val aggregation: MetricAggregation
        get() = when (this) {
            STEPS, CALORIES, DISTANCE, EXERCISE_MINUTES -> MetricAggregation.CUMULATIVE
            SLEEP -> MetricAggregation.SLEEP
            HEART_RATE, SPO2, STRESS, WEIGHT, RESTING_HEART_RATE, HRV -> MetricAggregation.DISCRETE
        }
}

enum class MetricAggregation {
    /** Summed per day (steps, energy…). Charts show totals; longer ranges show daily averages. */
    CUMULATIVE,

    /** Point samples (heart rate, SpO2…). Charts show min–max ranges and averages. */
    DISCRETE,

    /** Nightly sessions made of stage intervals; value = minutes asleep. */
    SLEEP,
}

/** Time window used by detail screens and charts (Apple Health's D / W / M / 6M / Y). */
enum class TimeRange(val shortLabel: String) {
    DAY("D"),
    WEEK("W"),
    MONTH("M"),
    SIX_MONTHS("6M"),
    YEAR("Y"),
}

/**
 * A single bucket in a chart series (x = bucket label, y = value). [min]/[max] carry the spread
 * of discrete metrics inside the bucket (null for cumulative metrics or empty buckets).
 */
data class ChartPoint(
    val label: String,
    val value: Float,
    val min: Float? = null,
    val max: Float? = null,
) {
    val hasData: Boolean get() = value > 0f || (max ?: 0f) > 0f
}

/**
 * One value as listed by "Show All Data": a raw sample for discrete metrics, a daily total for
 * cumulative ones, minutes asleep for a night.
 */
data class MetricReading(
    val metric: HealthMetricType,
    val value: Double,
    val time: Instant,
    val endTime: Instant? = null,
    /** Device id (MAC) that recorded it, for "Data sources" attribution; null when merged/unknown. */
    val sourceId: String? = null,
)

data class StepsSummary(
    val date: LocalDate,
    val count: Int,
    val goal: Int,
    val distanceMeters: Double,
    /** 24 buckets, one per hour of the day. */
    val hourly: List<Int> = emptyList(),
) {
    val progress: Float get() = if (goal <= 0) 0f else (count.toFloat() / goal).coerceIn(0f, 1f)
}

data class HeartRateSample(val time: Instant, val bpm: Int)

data class HeartRateSummary(
    val latestBpm: Int?,
    val restingBpm: Int?,
    val minBpm: Int?,
    val maxBpm: Int?,
    val samples: List<HeartRateSample> = emptyList(),
)

enum class SleepStage { AWAKE, REM, LIGHT, DEEP }

data class SleepStageSegment(val stage: SleepStage, val start: Instant, val end: Instant) {
    val duration: Duration get() = Duration.between(start, end)
}

data class SleepSession(
    val start: Instant,
    val end: Instant,
    val segments: List<SleepStageSegment> = emptyList(),
    /** 0..100, computed by the wearable or locally. */
    val score: Int? = null,
) {
    val totalDuration: Duration get() = Duration.between(start, end)

    fun durationOf(stage: SleepStage): Duration =
        segments.filter { it.stage == stage }.fold(Duration.ZERO) { acc, s -> acc + s.duration }
}

data class SpO2Reading(val time: Instant, val percent: Int)

enum class StressLevel { RELAXED, NORMAL, MEDIUM, HIGH }

/**
 * Score follows the common 0..100 convention used by wearables. The score-to-[StressLevel] band
 * boundaries live in `MetricThresholds` (`:core:domain`), not here — see
 * `MetricThresholds.stressLevelFor` (docs/DECISIONS.md D-1030).
 */
data class StressReading(val time: Instant, val score: Int)

data class CaloriesSummary(val activeKcal: Int, val goalKcal: Int) {
    val progress: Float get() = if (goalKcal <= 0) 0f else (activeKcal.toFloat() / goalKcal).coerceIn(0f, 1f)
}

data class WeightEntry(val time: Instant, val kilograms: Double, val bodyFatPercent: Double? = null)

/** Aggregated "today" snapshot shown on the Home dashboard. */
data class DailyHealthSummary(
    val date: LocalDate,
    val steps: StepsSummary,
    val heartRate: HeartRateSummary,
    val sleep: SleepSession?,
    val spO2: SpO2Reading?,
    val stress: StressReading?,
    val calories: CaloriesSummary,
    val activeMinutes: Int,
    val activeMinutesGoal: Int,
    /** Latest heart rate variability of the day, in ms. */
    val hrvMs: Int? = null,
)
