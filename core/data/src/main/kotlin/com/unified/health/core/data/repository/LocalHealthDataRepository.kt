package com.unified.health.core.data.repository

import com.unified.health.core.data.database.HealthRecordDao
import com.unified.health.core.data.database.HealthSampleEntity
import com.unified.health.core.data.database.SampleType
import com.unified.health.core.data.database.WorkoutEntity
import com.unified.health.core.domain.repository.HealthDataRepository
import com.unified.health.core.domain.repository.UserPreferencesRepository
import com.unified.health.core.model.CaloriesSummary
import com.unified.health.core.model.ChartPoint
import com.unified.health.core.model.DailyHealthSummary
import com.unified.health.core.model.HealthMetricType
import com.unified.health.core.model.HeartRateSample
import com.unified.health.core.model.HeartRateSummary
import com.unified.health.core.model.SleepSession
import com.unified.health.core.model.SpO2Reading
import com.unified.health.core.model.StepsSummary
import com.unified.health.core.model.StressReading
import com.unified.health.core.model.TimeRange
import com.unified.health.core.model.Workout
import com.unified.health.core.model.WorkoutType
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.map
import java.time.DayOfWeek
import java.time.Instant
import java.time.LocalDate
import java.time.ZoneId
import java.time.format.TextStyle
import java.util.Locale
import javax.inject.Inject
import kotlin.math.roundToInt

/**
 * Local-first source for every screen: reads what wearable syncs stored in Room, so history is
 * available offline and with no device connected. Every flow re-emits when a sync writes rows.
 */
class LocalHealthDataRepository @Inject constructor(
    private val dao: HealthRecordDao,
    private val preferences: UserPreferencesRepository,
) : HealthDataRepository {

    private val zone: ZoneId = ZoneId.systemDefault()

    override fun observeDailySummary(date: LocalDate): Flow<DailyHealthSummary> {
        val day = samples(SUMMARY_TYPES, date.startMs(), date.plusDays(1).startMs())
        val night = samples(listOf(SampleType.SLEEP_STAGE), sleepWindowStart(date), sleepWindowEnd(date))
        return combine(day, night, preferences.userPreferences) { samples, sleep, prefs ->
            val heartRate = samples.filter { it.type == SampleType.HEART_RATE }
            val steps = HealthAggregation.steps(samples)
            DailyHealthSummary(
                date = date,
                steps = StepsSummary(
                    date = date,
                    count = steps,
                    goal = prefs.dailyStepGoal,
                    distanceMeters = HealthAggregation.dailyMax(samples, SampleType.DAILY_DISTANCE) ?: 0.0,
                    hourly = HealthAggregation.stepsByHour(samples, zone),
                ),
                heartRate = HeartRateSummary(
                    latestBpm = heartRate.lastOrNull()?.value?.roundToInt(),
                    restingBpm = null, // No device reports it through the sync yet.
                    minBpm = heartRate.minOfOrNull { it.value }?.roundToInt(),
                    maxBpm = heartRate.maxOfOrNull { it.value }?.roundToInt(),
                    samples = heartRate.map { HeartRateSample(Instant.ofEpochMilli(it.startEpochMs), it.value.roundToInt()) },
                ),
                sleep = HealthAggregation.sleepSession(sleep),
                spO2 = HealthAggregation.latest(samples, SampleType.SPO2)?.let { SpO2Reading(Instant.ofEpochMilli(it.startEpochMs), it.value.roundToInt()) },
                stress = HealthAggregation.latest(samples, SampleType.STRESS)?.let { StressReading(Instant.ofEpochMilli(it.startEpochMs), it.value.roundToInt()) },
                calories = CaloriesSummary(
                    activeKcal = HealthAggregation.dailyMax(samples, SampleType.DAILY_ACTIVE_KCAL)?.roundToInt() ?: 0,
                    goalKcal = DEFAULT_ACTIVE_KCAL_GOAL,
                ),
                activeMinutes = 0, // Not derived yet.
                activeMinutesGoal = DEFAULT_ACTIVE_MINUTES_GOAL,
            )
        }
    }

    override fun observeMetricSeries(metric: HealthMetricType, range: TimeRange, endDate: LocalDate): Flow<List<ChartPoint>> {
        val days = when (range) {
            TimeRange.DAY -> 1L
            TimeRange.WEEK -> 7L
            TimeRange.MONTH -> 30L
        }
        val firstDay = endDate.minusDays(days - 1)
        val types = typesFor(metric)
        val from = if (metric == HealthMetricType.SLEEP) sleepWindowStart(firstDay) else firstDay.startMs()
        val to = if (metric == HealthMetricType.SLEEP) sleepWindowEnd(endDate) else endDate.plusDays(1).startMs()
        return samples(types, from, to).map { samples ->
            if (range == TimeRange.DAY && metric != HealthMetricType.SLEEP) {
                hourly(metric, samples)
            } else {
                (0 until days).map { offset ->
                    val day = firstDay.plusDays(offset)
                    val dayRows = if (metric == HealthMetricType.SLEEP) {
                        samples.filter { it.startEpochMs in sleepWindowStart(day) until sleepWindowEnd(day) }
                    } else {
                        samples.filter { it.startEpochMs in day.startMs() until day.plusDays(1).startMs() }
                    }
                    ChartPoint(label(range, day), dailyValue(metric, dayRows).toFloat())
                }
            }
        }
    }

    override fun observeWorkouts(): Flow<List<Workout>> =
        dao.observeWorkouts(WORKOUT_LIMIT).map { rows -> rows.map { it.toModel() } }

    override fun observeSleep(date: LocalDate): Flow<SleepSession?> =
        samples(listOf(SampleType.SLEEP_STAGE), sleepWindowStart(date), sleepWindowEnd(date)).map(HealthAggregation::sleepSession)

    private fun samples(types: List<String>, from: Long, to: Long) = dao.observeSamples(types, from, to)

    private fun hourly(metric: HealthMetricType, samples: List<HealthSampleEntity>): List<ChartPoint> {
        val byHour = samples.groupBy { Instant.ofEpochMilli(it.startEpochMs).atZone(zone).hour }
        return (0 until 24).map { hour ->
            val rows = byHour[hour].orEmpty()
            val value = when (metric) {
                HealthMetricType.STEPS -> rows.filter { it.type == SampleType.STEPS }.sumOf { it.value }
                else -> rows.map { it.value }.takeIf { it.isNotEmpty() }?.average() ?: 0.0
            }
            ChartPoint("${hour}h", value.toFloat())
        }
    }

    private fun dailyValue(metric: HealthMetricType, rows: List<HealthSampleEntity>): Double = when (metric) {
        HealthMetricType.STEPS -> HealthAggregation.steps(rows).toDouble()
        HealthMetricType.HEART_RATE -> HealthAggregation.average(rows, SampleType.HEART_RATE) ?: 0.0
        HealthMetricType.SPO2 -> HealthAggregation.average(rows, SampleType.SPO2) ?: 0.0
        HealthMetricType.STRESS -> HealthAggregation.average(rows, SampleType.STRESS) ?: 0.0
        HealthMetricType.CALORIES -> HealthAggregation.dailyMax(rows, SampleType.DAILY_ACTIVE_KCAL) ?: 0.0
        HealthMetricType.SLEEP -> HealthAggregation.sleepMinutes(rows).toDouble()
        HealthMetricType.WEIGHT -> 0.0 // No wearable source yet (Health Connect import is a later step).
    }

    private fun typesFor(metric: HealthMetricType): List<String> = when (metric) {
        HealthMetricType.STEPS -> listOf(SampleType.STEPS, SampleType.DAILY_STEPS)
        HealthMetricType.HEART_RATE -> listOf(SampleType.HEART_RATE)
        HealthMetricType.SPO2 -> listOf(SampleType.SPO2)
        HealthMetricType.STRESS -> listOf(SampleType.STRESS)
        HealthMetricType.CALORIES -> listOf(SampleType.DAILY_ACTIVE_KCAL)
        HealthMetricType.SLEEP -> listOf(SampleType.SLEEP_STAGE)
        HealthMetricType.WEIGHT -> emptyList()
    }

    private fun label(range: TimeRange, day: LocalDate) = when (range) {
        TimeRange.MONTH -> day.dayOfMonth.toString()
        else -> day.dayOfWeek.shortLabel()
    }

    private fun LocalDate.startMs() = atStartOfDay(zone).toInstant().toEpochMilli()

    /** A night belongs to the morning it ends on: 18:00 the day before until 12:00. */
    private fun sleepWindowStart(date: LocalDate) = date.minusDays(1).atTime(18, 0).atZone(zone).toInstant().toEpochMilli()

    private fun sleepWindowEnd(date: LocalDate) = date.atTime(12, 0).atZone(zone).toInstant().toEpochMilli()

    private fun DayOfWeek.shortLabel(): String = getDisplayName(TextStyle.SHORT, Locale.getDefault())

    private fun WorkoutEntity.toModel() = Workout(
        id = "$deviceId@$startEpochMs",
        type = workoutType(sport),
        start = Instant.ofEpochMilli(startEpochMs),
        end = Instant.ofEpochMilli(endEpochMs),
        distanceMeters = distanceMeters,
        activeKcal = activeKcal,
        avgHeartRate = avgHeartRate,
        maxHeartRate = maxHeartRate,
    )

    private fun workoutType(sport: String): WorkoutType = when {
        sport.contains("run") -> WorkoutType.RUNNING
        sport.contains("walk") || sport.contains("hik") -> WorkoutType.WALKING
        sport.contains("cycl") || sport.contains("bik") -> WorkoutType.CYCLING
        sport.contains("swim") -> WorkoutType.SWIMMING
        sport.contains("strength") || sport.contains("training") -> WorkoutType.STRENGTH
        sport.contains("yoga") -> WorkoutType.YOGA
        else -> WorkoutType.OTHER
    }

    private companion object {
        val SUMMARY_TYPES = listOf(
            SampleType.HEART_RATE, SampleType.SPO2, SampleType.STRESS, SampleType.STEPS,
            SampleType.DAILY_STEPS, SampleType.DAILY_ACTIVE_KCAL, SampleType.DAILY_DISTANCE,
        )
        const val DEFAULT_ACTIVE_KCAL_GOAL = 500
        const val DEFAULT_ACTIVE_MINUTES_GOAL = 30
        const val WORKOUT_LIMIT = 200
    }
}
