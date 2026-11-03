package com.unified.health.core.model

import java.time.Duration
import java.time.Instant
import java.time.LocalDate

/** Every metric surfaced on the dashboard / detail screens. */
enum class HealthMetricType {
    STEPS,
    HEART_RATE,
    SLEEP,
    SPO2,
    STRESS,
    CALORIES,
    WEIGHT,
}

/** Time window used by detail screens and charts. */
enum class TimeRange { DAY, WEEK, MONTH }

/** A single point in a chart series (x = bucket label, y = value). */
data class ChartPoint(val label: String, val value: Float)

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

data class StressReading(val time: Instant, val score: Int) {
    /** Score bands follow the common 0..100 convention used by wearables. */
    val level: StressLevel
        get() = when (score) {
            in 0..29 -> StressLevel.RELAXED
            in 30..59 -> StressLevel.NORMAL
            in 60..79 -> StressLevel.MEDIUM
            else -> StressLevel.HIGH
        }
}

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
)
