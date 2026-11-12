package com.unified.health.core.domain

import com.unified.health.core.domain.repository.HealthDataRepository
import com.unified.health.core.domain.usecase.ObserveTodaySummaryUseCase
import com.unified.health.core.domain.usecase.ObserveWeekActivitySummaryUseCase
import com.unified.health.core.model.CaloriesSummary
import com.unified.health.core.model.ChartPoint
import com.unified.health.core.model.DailyHealthSummary
import com.unified.health.core.model.HealthMetricType
import com.unified.health.core.model.HeartRateSample
import com.unified.health.core.model.HeartRateSummary
import com.unified.health.core.model.MetricReading
import com.unified.health.core.model.SleepSession
import com.unified.health.core.model.StepsSummary
import com.unified.health.core.model.TimeRange
import com.unified.health.core.model.Workout
import com.unified.health.core.model.WorkoutLap
import com.unified.health.core.model.WorkoutSample
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.drop
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.launch
import kotlinx.coroutines.test.advanceUntilIdle
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test
import java.time.Clock
import java.time.Instant
import java.time.LocalDate
import java.time.ZoneId
import java.time.ZoneOffset

/** D-1196: Home's "7 mini rings" week strip — one [DailyHealthSummary] per Mon..Sun day. */
@OptIn(ExperimentalCoroutinesApi::class)
class ObserveWeekActivitySummaryUseCaseTest {

    /** Keyed by date so each day's flow can be driven independently, mirroring how
     *  [HealthDataRepository.observeDailySummary] is actually used (one call per date). */
    private inner class FakeHealthDataRepository : HealthDataRepository {
        val perDate = mutableMapOf<LocalDate, MutableStateFlow<DailyHealthSummary>>()

        private fun flowFor(date: LocalDate) = perDate.getOrPut(date) { MutableStateFlow(emptySummary(date)) }

        override fun observeDailySummary(date: LocalDate): Flow<DailyHealthSummary> = flowFor(date)
        override fun observeMetricSeries(metric: HealthMetricType, range: TimeRange, endDate: LocalDate): Flow<List<ChartPoint>> = flowOf(emptyList())
        override fun observeWorkouts(): Flow<List<Workout>> = flowOf(emptyList())
        override fun observeWorkout(id: String): Flow<Workout?> = flowOf(null)
        override fun observeWorkoutLaps(workoutId: String): Flow<List<WorkoutLap>> = flowOf(emptyList())
        override fun observeWorkoutSamples(workoutId: String): Flow<List<WorkoutSample>> = flowOf(emptyList())
        override fun observeHeartRateSamples(from: Instant, to: Instant, deviceId: String?): Flow<List<HeartRateSample>> = flowOf(emptyList())
        override fun observeSleep(date: LocalDate): Flow<SleepSession?> = flowOf(null)
        override fun observeLatestReading(metric: HealthMetricType, today: LocalDate): Flow<MetricReading?> = flowOf(null)
        override fun observeMetricReadings(metric: HealthMetricType, limit: Int): Flow<List<MetricReading>> = flowOf(emptyList())
    }

    private fun emptySummary(date: LocalDate) = DailyHealthSummary(
        date = date,
        steps = StepsSummary(date, 0, 8_000, 0.0),
        heartRate = HeartRateSummary(null, null, null, null),
        sleep = null,
        spO2 = null,
        stress = null,
        calories = CaloriesSummary(0, 500),
        activeMinutes = 0,
        activeMinutesGoal = 30,
    )

    // 2026-11-12 is a Thursday -> week runs 2026-11-09 (Mon) .. 2026-11-15 (Sun).
    private val today = LocalDate.of(2026, 11, 12)
    private val clock = Clock.fixed(today.atStartOfDay(ZoneOffset.UTC).toInstant(), ZoneOffset.UTC)

    @Test
    fun `emits exactly 7 entries, Monday through Sunday`() = runTest {
        val useCase = ObserveWeekActivitySummaryUseCase(FakeHealthDataRepository())

        val week = useCase(clock).first()

        assertEquals(7, week.size)
        assertEquals(LocalDate.of(2026, 11, 9), week.first().summary.date)
        assertEquals(LocalDate.of(2026, 11, 15), week.last().summary.date)
    }

    @Test
    fun `days after today are flagged future, past and today are not`() = runTest {
        val useCase = ObserveWeekActivitySummaryUseCase(FakeHealthDataRepository())

        val week = useCase(clock).first()

        val byDate = week.associateBy { it.summary.date }
        assertFalse(byDate.getValue(LocalDate.of(2026, 11, 9)).isFuture) // Mon, past
        assertFalse(byDate.getValue(today).isFuture) // Thu, today
        assertTrue(byDate.getValue(LocalDate.of(2026, 11, 13)).isFuture) // Fri, future
        assertTrue(byDate.getValue(LocalDate.of(2026, 11, 15)).isFuture) // Sun, future
    }

    @Test
    fun `exactly one day is flagged today, and it is the clock's today`() = runTest {
        val useCase = ObserveWeekActivitySummaryUseCase(FakeHealthDataRepository())

        val week = useCase(clock).first()

        val todays = week.filter { it.isToday }
        assertEquals(1, todays.size)
        assertEquals(today, todays.single().summary.date)
    }

    @Test
    fun `today's entry matches ObserveTodaySummaryUseCase's own value exactly`() = runTest {
        val repository = FakeHealthDataRepository()
        repository.perDate[today] = MutableStateFlow(emptySummary(today).copy(activeMinutes = 22, calories = CaloriesSummary(640, 500)))
        val weekUseCase = ObserveWeekActivitySummaryUseCase(repository)
        val todayUseCase = ObserveTodaySummaryUseCase(repository)

        val week = weekUseCase(clock).first()
        val todaySummary = todayUseCase(clock).first()

        val weekToday = week.single { it.isToday }.summary
        assertEquals(todaySummary, weekToday)
    }

    @Test
    fun `updates live when today's underlying data changes`() = runTest {
        val repository = FakeHealthDataRepository()
        val todayFlow = MutableStateFlow(emptySummary(today))
        repository.perDate[today] = todayFlow
        val useCase = ObserveWeekActivitySummaryUseCase(repository)

        val collected = mutableListOf<Int>()
        val job = launch { useCase(clock).drop(1).collect { collected.add(it.single { d -> d.isToday }.summary.activeMinutes) } }
        // Let the combine() latch onto its initial values before pushing an update.
        advanceUntilIdle()
        todayFlow.value = emptySummary(today).copy(activeMinutes = 15)
        advanceUntilIdle()

        assertEquals(listOf(15), collected)
        job.cancel()
    }

    @Test
    fun `week range math is DST-safe across a spring-forward boundary in the device zone`() = runTest {
        // America/New_York springs forward on 2027-03-14; pick a "today" the same week so the use
        // case's LocalDate.now(clock) resolution crosses it.
        val zone = ZoneId.of("America/New_York")
        val localToday = LocalDate.of(2027, 3, 16) // Tuesday that week
        val dstClock = Clock.fixed(localToday.atTime(12, 0).atZone(zone).toInstant(), zone)
        val useCase = ObserveWeekActivitySummaryUseCase(FakeHealthDataRepository())

        val week = useCase(dstClock).first()

        assertEquals(7, week.size)
        assertEquals(LocalDate.of(2027, 3, 15), week.first().summary.date) // Monday
        assertEquals(LocalDate.of(2027, 3, 21), week.last().summary.date) // Sunday
        // Strictly consecutive calendar days, no skipped/duplicated day across the DST transition.
        week.map { it.summary.date }.zipWithNext().forEach { (a, b) -> assertEquals(a.plusDays(1), b) }
    }
}
