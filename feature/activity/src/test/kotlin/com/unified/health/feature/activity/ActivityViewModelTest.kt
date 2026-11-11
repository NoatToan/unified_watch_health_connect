package com.unified.health.feature.activity

import com.unified.health.core.domain.usecase.LoadTrend
import com.unified.health.core.model.UnitSystem
import com.unified.health.core.model.Workout
import com.unified.health.core.model.WorkoutType
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import kotlinx.coroutines.test.UnconfinedTestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import java.time.Clock
import java.time.Duration
import java.time.Instant
import java.time.YearMonth
import java.time.ZoneOffset

@OptIn(ExperimentalCoroutinesApi::class)
class ActivityViewModelTest {

    private val now = Instant.parse("2026-11-06T12:00:00Z")
    private val clock = Clock.fixed(now, ZoneOffset.UTC)
    private val repository = FakeHealthDataRepository()
    private val preferences = FakeUserPreferencesRepository()

    /** Shared with runTest so the ViewModel's Main work and the test run on one scheduler. */
    private val dispatcher = UnconfinedTestDispatcher()

    @Before
    fun setUp() = Dispatchers.setMain(dispatcher)

    @After
    fun tearDown() = Dispatchers.resetMain()

    private fun workout(daysAgo: Long, minutes: Long = 30, hr: Int? = 140): Workout {
        val start = now.minus(Duration.ofDays(daysAgo))
        return Workout("dev@${start.toEpochMilli()}", WorkoutType.RUNNING, start, start.plus(Duration.ofMinutes(minutes)), avgHeartRate = hr, sourceDeviceId = "dev")
    }

    @Test
    fun `no workouts is the empty state`() = runTest(dispatcher) {
        val vm = ActivityViewModel(repository, preferences, clock)
        backgroundScope.launch { vm.uiState.collect {} }
        assertEquals(ActivityUiState.Empty, vm.uiState.first { it != ActivityUiState.Loading })
    }

    @Test
    fun `workouts are grouped by month newest first with a load summary`() = runTest(dispatcher) {
        repository.workouts.value = listOf(workout(10), workout(0), workout(40))
        val vm = ActivityViewModel(repository, preferences, clock)
        backgroundScope.launch { vm.uiState.collect {} }
        val state = vm.uiState.first { it is ActivityUiState.Success } as ActivityUiState.Success
        assertEquals(listOf(YearMonth.of(2026, 11), YearMonth.of(2026, 10), YearMonth.of(2026, 9)), state.months.map { it.month })
        assertEquals(42.0, state.load.current.load, 1e-9) // 30 min × 1.4
        assertEquals(1, state.load.current.workouts)
        assertTrue(state.load.trend != LoadTrend.NO_BASELINE) // the workout 10 days ago is in the baseline
    }

    @Test
    fun `state follows the repository`() = runTest(dispatcher) {
        val vm = ActivityViewModel(repository, preferences, clock)
        backgroundScope.launch { vm.uiState.collect {} }
        repository.workouts.value = listOf(workout(0))
        assertTrue(vm.uiState.value is ActivityUiState.Success)
        repository.workouts.value = emptyList()
        assertEquals(ActivityUiState.Empty, vm.uiState.value)
    }

    @Test
    fun `unit system follows the preferences repository`() = runTest(dispatcher) {
        repository.workouts.value = listOf(workout(0))
        val vm = ActivityViewModel(repository, preferences, clock)
        backgroundScope.launch { vm.uiState.collect {} }
        assertEquals(UnitSystem.METRIC, (vm.uiState.value as ActivityUiState.Success).unitSystem)
        preferences.setUnitSystem(UnitSystem.IMPERIAL)
        assertEquals(UnitSystem.IMPERIAL, (vm.uiState.value as ActivityUiState.Success).unitSystem)
    }
}
