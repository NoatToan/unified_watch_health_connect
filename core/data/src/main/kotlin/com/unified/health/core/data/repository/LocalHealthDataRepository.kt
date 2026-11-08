package com.unified.health.core.data.repository

import com.unified.health.core.data.database.HealthRecordDao
import com.unified.health.core.data.database.HealthSampleEntity
import com.unified.health.core.data.database.SampleType
import com.unified.health.core.data.database.WorkoutEntity
import com.unified.health.core.domain.model.DefaultMetricThresholds
import com.unified.health.core.domain.repository.HealthDataRepository
import com.unified.health.core.domain.repository.UserPreferencesRepository
import com.unified.health.core.model.CaloriesSummary
import com.unified.health.core.model.ChartPoint
import com.unified.health.core.model.DailyHealthSummary
import com.unified.health.core.model.HealthMetricType
import com.unified.health.core.model.HeartRateSample
import com.unified.health.core.model.HeartRateSummary
import com.unified.health.core.model.MetricAggregation
import com.unified.health.core.model.MetricReading
import com.unified.health.core.model.SleepSession
import com.unified.health.core.model.SpO2Reading
import com.unified.health.core.model.StepsSummary
import com.unified.health.core.model.StressReading
import com.unified.health.core.model.TimeRange
import com.unified.health.core.model.Workout
import com.unified.health.core.model.WorkoutType
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.map
import java.time.Instant
import java.time.LocalDate
import java.time.ZoneId
import javax.inject.Inject
import kotlin.math.roundToInt

/**
 * Local-first source for every screen: reads what wearable syncs stored in Room, so history is
 * available offline and with no device connected. Every flow re-emits when a sync writes rows.
 * Chart rules live in [MetricSeriesBuilder].
 */
class LocalHealthDataRepository internal constructor(
    private val dao: HealthRecordDao,
    private val preferences: UserPreferencesRepository,
    private val zone: ZoneId,
) : HealthDataRepository {

    @Inject
    constructor(dao: HealthRecordDao, preferences: UserPreferencesRepository) : this(dao, preferences, ZoneId.systemDefault())

    private val series = MetricSeriesBuilder(zone)

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
                    restingBpm = HealthAggregation.latest(samples, SampleType.RESTING_HEART_RATE)?.value?.roundToInt(),
                    minBpm = heartRate.minOfOrNull { it.value }?.roundToInt(),
                    maxBpm = heartRate.maxOfOrNull { it.value }?.roundToInt(),
                    samples = heartRate.map { HeartRateSample(Instant.ofEpochMilli(it.startEpochMs), it.value.roundToInt()) },
                ),
                sleep = HealthAggregation.sleepSession(sleep),
                spO2 = HealthAggregation.latest(samples, SampleType.SPO2)?.let { SpO2Reading(Instant.ofEpochMilli(it.startEpochMs), it.value.roundToInt()) },
                stress = HealthAggregation.latest(samples, SampleType.STRESS)?.let { StressReading(Instant.ofEpochMilli(it.startEpochMs), it.value.roundToInt()) },
                calories = CaloriesSummary(
                    activeKcal = HealthAggregation.dailyMax(samples, SampleType.DAILY_ACTIVE_KCAL)?.roundToInt() ?: 0,
                    goalKcal = prefs.activeCalorieGoalOverride ?: DefaultMetricThresholds.VALUES.activeCalorieGoal(profile = null),
                ),
                activeMinutes = HealthAggregation.dailyMax(samples, SampleType.DAILY_EXERCISE_MINUTES)?.roundToInt() ?: 0,
                activeMinutesGoal = DefaultMetricThresholds.VALUES.defaultActiveMinutesGoal,
                hrvMs = HealthAggregation.latest(samples, SampleType.HRV)?.value?.roundToInt(),
            )
        }
    }

    override fun observeMetricSeries(metric: HealthMetricType, range: TimeRange, endDate: LocalDate): Flow<List<ChartPoint>> {
        val types = MetricSeriesBuilder.typesFor(metric)
        if (types.isEmpty()) return flowOf(series.buckets(metric, range, endDate).map { ChartPoint(it.label, 0f) })
        val window = series.window(metric, range, endDate)
        return samples(types, window.first, window.last + 1)
            .map { rows -> series.build(metric, range, endDate, rows) }
            .flowOn(Dispatchers.Default)
    }

    override fun observeWorkouts(): Flow<List<Workout>> =
        dao.observeWorkouts(WORKOUT_LIMIT).map { rows -> rows.map { it.toModel() } }

    override fun observeWorkout(id: String): Flow<Workout?> {
        val key = WorkoutKey.parse(id) ?: return flowOf(null)
        return dao.observeWorkout(key.deviceId, key.startEpochMs).map { it?.toModel() }
    }

    override fun observeHeartRateSamples(from: Instant, to: Instant, deviceId: String?): Flow<List<HeartRateSample>> {
        val rows = if (deviceId == null) {
            samples(listOf(SampleType.HEART_RATE), from.toEpochMilli(), to.toEpochMilli())
        } else {
            dao.observeDeviceSamples(SampleType.HEART_RATE, deviceId, from.toEpochMilli(), to.toEpochMilli())
        }
        return rows.map { list -> list.map { HeartRateSample(Instant.ofEpochMilli(it.startEpochMs), it.value.roundToInt()) } }
    }

    override fun observeSleep(date: LocalDate): Flow<SleepSession?> =
        samples(listOf(SampleType.SLEEP_STAGE), sleepWindowStart(date), sleepWindowEnd(date)).map(HealthAggregation::sleepSession)

    override fun observeLatestReading(metric: HealthMetricType, today: LocalDate): Flow<MetricReading?> {
        val types = MetricSeriesBuilder.typesFor(metric)
        if (types.isEmpty()) return flowOf(null)
        val from = today.minusDays(LATEST_LOOKBACK_DAYS).let { if (metric.aggregation == MetricAggregation.SLEEP) sleepWindowStart(it) else it.startMs() }
        return samples(types, from, today.plusDays(1).startMs())
            .map { rows -> latest(metric, rows, today) }
            .distinctUntilChanged()
            .flowOn(Dispatchers.Default)
    }

    override fun observeMetricReadings(metric: HealthMetricType, limit: Int): Flow<List<MetricReading>> {
        val types = when (metric.aggregation) {
            MetricAggregation.CUMULATIVE -> listOfNotNull(MetricSeriesBuilder.dailyType(metric))
            else -> MetricSeriesBuilder.typesFor(metric)
        }
        if (types.isEmpty()) return flowOf(emptyList())
        // A night has ~15–25 stage rows; read enough of them to fill [limit] nights.
        val rowLimit = if (metric.aggregation == MetricAggregation.SLEEP) limit * SLEEP_ROWS_PER_NIGHT else limit * types.size
        val latest = dao.observeLatestSamples(types, rowLimit)
        // Interval steps are far more rows than daily totals, so they get their own window (the last
        // [limit] days) instead of crowding the row limit; readings() only uses them for days without a total.
        val rows = if (metric != HealthMetricType.STEPS) {
            latest
        } else {
            val today = LocalDate.now(zone)
            val intervals = samples(listOf(SampleType.STEPS), today.minusDays(limit - 1L).startMs(), today.plusDays(1).startMs())
            combine(latest, intervals) { daily, steps -> daily + steps }
        }
        return rows
            .map { rows -> series.readings(metric, rows, limit) }
            .flowOn(Dispatchers.Default)
    }

    private fun latest(metric: HealthMetricType, rows: List<HealthSampleEntity>, today: LocalDate): MetricReading? = when (metric.aggregation) {
        MetricAggregation.CUMULATIVE -> {
            val totals = series.dailyTotals(metric, rows)
            // Today's running total, even if still zero, once anything was recorded today; otherwise the last day with data.
            val day = if (rows.any { !Instant.ofEpochMilli(it.startEpochMs).atZone(zone).toLocalDate().isBefore(today) }) today else totals.keys.maxOrNull()
            day?.let { MetricReading(metric, totals[it] ?: 0.0, it.atStartOfDay(zone).toInstant()) }
        }
        MetricAggregation.SLEEP -> {
            val nights = series.sleepMinutesByNight(rows)
            nights.keys.maxOrNull()?.let { night ->
                val session = HealthAggregation.sleepSession(rows.filter { series.nightOf(it.startEpochMs) == night })
                MetricReading(metric, nights.getValue(night), session?.start ?: night.atStartOfDay(zone).toInstant(), session?.end)
            }
        }
        MetricAggregation.DISCRETE -> rows.maxByOrNull { it.startEpochMs }?.let {
            MetricReading(metric, it.value, Instant.ofEpochMilli(it.startEpochMs), sourceId = it.deviceId)
        }
    }

    private fun samples(types: List<String>, from: Long, to: Long) = dao.observeSamples(types, from, to)

    private fun LocalDate.startMs() = atStartOfDay(zone).toInstant().toEpochMilli()

    /** A night belongs to the morning it ends on: 18:00 the day before until 12:00. */
    private fun sleepWindowStart(date: LocalDate) = date.minusDays(1).atTime(18, 0).atZone(zone).toInstant().toEpochMilli()

    private fun sleepWindowEnd(date: LocalDate) = date.atTime(12, 0).atZone(zone).toInstant().toEpochMilli()

    private fun WorkoutEntity.toModel() = Workout(
        id = WorkoutKey(deviceId, startEpochMs).id,
        type = workoutType(sport),
        start = Instant.ofEpochMilli(startEpochMs),
        end = Instant.ofEpochMilli(endEpochMs),
        distanceMeters = distanceMeters,
        activeKcal = activeKcal,
        avgHeartRate = avgHeartRate,
        maxHeartRate = maxHeartRate,
        sourceDeviceId = deviceId,
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

    /** A workout's id is its primary key: `<deviceId>@<startEpochMs>` (device ids never contain '@'). */
    internal data class WorkoutKey(val deviceId: String, val startEpochMs: Long) {
        val id: String get() = "$deviceId@$startEpochMs"

        companion object {
            fun parse(id: String): WorkoutKey? {
                val at = id.lastIndexOf('@')
                if (at <= 0) return null
                val start = id.substring(at + 1).toLongOrNull() ?: return null
                return WorkoutKey(id.substring(0, at), start)
            }
        }
    }

    private companion object {
        val SUMMARY_TYPES = listOf(
            SampleType.HEART_RATE, SampleType.SPO2, SampleType.STRESS, SampleType.STEPS,
            SampleType.DAILY_STEPS, SampleType.DAILY_ACTIVE_KCAL, SampleType.DAILY_DISTANCE,
            SampleType.DAILY_EXERCISE_MINUTES, SampleType.RESTING_HEART_RATE, SampleType.HRV,
        )
        const val WORKOUT_LIMIT = 200
        const val LATEST_LOOKBACK_DAYS = 30L
        const val SLEEP_ROWS_PER_NIGHT = 40
    }
}
