package com.unified.health.core.data.repository

import com.unified.health.core.domain.repository.HealthDataRepository
import com.unified.health.core.domain.repository.UserPreferencesRepository
import com.unified.health.core.model.CaloriesSummary
import com.unified.health.core.model.ChartPoint
import com.unified.health.core.model.DailyHealthSummary
import com.unified.health.core.model.HealthMetricType
import com.unified.health.core.model.HeartRateSample
import com.unified.health.core.model.HeartRateSummary
import com.unified.health.core.model.SleepSession
import com.unified.health.core.model.SleepStage
import com.unified.health.core.model.SleepStageSegment
import com.unified.health.core.model.SpO2Reading
import com.unified.health.core.model.StepsSummary
import com.unified.health.core.model.StressReading
import com.unified.health.core.model.TimeRange
import com.unified.health.core.model.Workout
import com.unified.health.core.model.WorkoutType
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.map
import java.time.DayOfWeek
import java.time.LocalDate
import java.time.ZoneId
import java.time.format.TextStyle
import java.util.Locale
import javax.inject.Inject
import kotlin.random.Random

/**
 * Deterministic fake data (seeded by date) so the UI looks stable across recompositions/restarts.
 * TODO: replace with a Room-backed repository fed by [com.unified.health.core.ble.HealthDataSync]
 *  and Health Connect.
 */
class FakeHealthDataRepository @Inject constructor(
    private val preferences: UserPreferencesRepository,
) : HealthDataRepository {

    private val zone: ZoneId = ZoneId.systemDefault()

    override fun observeDailySummary(date: LocalDate): Flow<DailyHealthSummary> =
        preferences.userPreferences.map { prefs -> summaryFor(date, prefs.dailyStepGoal) }

    override fun observeMetricSeries(
        metric: HealthMetricType,
        range: TimeRange,
        endDate: LocalDate,
    ): Flow<List<ChartPoint>> = flowOf(
        when (range) {
            TimeRange.DAY -> (0 until 24).map { hour ->
                ChartPoint("${hour}h", valueFor(metric, endDate, hour).toFloat())
            }
            TimeRange.WEEK -> (6 downTo 0).map { back ->
                val d = endDate.minusDays(back.toLong())
                ChartPoint(d.dayOfWeek.shortLabel(), dailyValueFor(metric, d).toFloat())
            }
            TimeRange.MONTH -> (29 downTo 0).map { back ->
                val d = endDate.minusDays(back.toLong())
                ChartPoint(d.dayOfMonth.toString(), dailyValueFor(metric, d).toFloat())
            }
        },
    )

    override fun observeWorkouts(): Flow<List<Workout>> {
        val today = LocalDate.now(zone)
        val types = listOf(WorkoutType.RUNNING, WorkoutType.WALKING, WorkoutType.CYCLING, WorkoutType.STRENGTH)
        return flowOf(
            (1..6).map { i ->
                val start = today.minusDays(i.toLong()).atTime(6 + i, 30).atZone(zone).toInstant()
                Workout(
                    id = "fake-$i",
                    type = types[i % types.size],
                    start = start,
                    end = start.plusSeconds(1_800L + i * 300),
                    distanceMeters = 2_500.0 + i * 700,
                    activeKcal = 180 + i * 25,
                    avgHeartRate = 128 + i,
                    maxHeartRate = 160 + i,
                )
            },
        )
    }

    override fun observeSleep(date: LocalDate): Flow<SleepSession?> = flowOf(sleepFor(date))

    private fun summaryFor(date: LocalDate, stepGoal: Int): DailyHealthSummary {
        val rnd = Random(date.toEpochDay())
        val hourly = (0 until 24).map { h -> if (h in 7..21) rnd.nextInt(100, 900) else rnd.nextInt(0, 40) }
        val now = date.atTime(12, 0).atZone(zone).toInstant()
        val hrSamples = (0 until 48).map { i -> HeartRateSample(now.minusSeconds(i * 900L), 62 + rnd.nextInt(0, 40)) }
        return DailyHealthSummary(
            date = date,
            steps = StepsSummary(date, hourly.sum(), stepGoal, distanceMeters = hourly.sum() * 0.75, hourly = hourly),
            heartRate = HeartRateSummary(
                latestBpm = hrSamples.first().bpm,
                restingBpm = 58 + rnd.nextInt(0, 6),
                minBpm = hrSamples.minOf { it.bpm },
                maxBpm = hrSamples.maxOf { it.bpm },
                samples = hrSamples,
            ),
            sleep = sleepFor(date),
            spO2 = SpO2Reading(now, 95 + rnd.nextInt(0, 4)),
            stress = StressReading(now, rnd.nextInt(15, 70)),
            calories = CaloriesSummary(activeKcal = 250 + rnd.nextInt(0, 300), goalKcal = 500),
            activeMinutes = 20 + rnd.nextInt(0, 40),
            activeMinutesGoal = 30,
        )
    }

    private fun sleepFor(date: LocalDate): SleepSession {
        val rnd = Random(date.toEpochDay() * 31)
        var cursor = date.minusDays(1).atTime(23, rnd.nextInt(0, 50)).atZone(zone).toInstant()
        val start = cursor
        val pattern = listOf(SleepStage.LIGHT, SleepStage.DEEP, SleepStage.LIGHT, SleepStage.REM, SleepStage.AWAKE)
        val segments = (0 until 15).map { i ->
            val minutes = rnd.nextInt(10, 50).toLong()
            val seg = SleepStageSegment(pattern[i % pattern.size], cursor, cursor.plusSeconds(minutes * 60))
            cursor = seg.end
            seg
        }
        return SleepSession(start = start, end = cursor, segments = segments, score = 70 + rnd.nextInt(0, 25))
    }

    private fun valueFor(metric: HealthMetricType, date: LocalDate, hour: Int): Int {
        val rnd = Random(date.toEpochDay() * 100 + hour + metric.ordinal * 7)
        return when (metric) {
            HealthMetricType.STEPS -> if (hour in 7..21) rnd.nextInt(100, 900) else rnd.nextInt(0, 40)
            HealthMetricType.HEART_RATE -> 60 + rnd.nextInt(0, 45)
            HealthMetricType.SPO2 -> 94 + rnd.nextInt(0, 5)
            HealthMetricType.STRESS -> rnd.nextInt(10, 80)
            HealthMetricType.CALORIES -> rnd.nextInt(5, 60)
            HealthMetricType.SLEEP -> if (hour < 7) 60 else 0
            HealthMetricType.WEIGHT -> 70
        }
    }

    private fun dailyValueFor(metric: HealthMetricType, date: LocalDate): Int {
        val rnd = Random(date.toEpochDay() + metric.ordinal * 1_000)
        return when (metric) {
            HealthMetricType.STEPS -> rnd.nextInt(3_000, 13_000)
            HealthMetricType.HEART_RATE -> rnd.nextInt(56, 66)
            HealthMetricType.SPO2 -> rnd.nextInt(94, 99)
            HealthMetricType.STRESS -> rnd.nextInt(20, 65)
            HealthMetricType.CALORIES -> rnd.nextInt(200, 650)
            HealthMetricType.SLEEP -> rnd.nextInt(300, 520)
            HealthMetricType.WEIGHT -> 70 + rnd.nextInt(-2, 2)
        }
    }

    private fun DayOfWeek.shortLabel(): String = getDisplayName(TextStyle.SHORT, Locale.getDefault())
}
