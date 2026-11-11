package com.unified.health.feature.activity

import androidx.lifecycle.SavedStateHandle
import com.unified.health.core.model.HeartRateSample
import com.unified.health.core.model.UnitSystem
import com.unified.health.core.model.WearableDevice
import com.unified.health.core.model.WearableVendor
import com.unified.health.core.model.Workout
import com.unified.health.core.model.WorkoutLap
import com.unified.health.core.model.WorkoutSample
import com.unified.health.core.model.WorkoutType
import com.unified.health.feature.activity.detail.WorkoutDetailUiState
import com.unified.health.feature.activity.detail.WorkoutDetailViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.launch
import kotlinx.coroutines.test.UnconfinedTestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import java.time.Duration
import java.time.Instant

@OptIn(ExperimentalCoroutinesApi::class)
class WorkoutDetailViewModelTest {

    private val start = Instant.parse("2026-11-06T07:00:00Z")
    private val workout = Workout(
        id = "AA:BB@${start.toEpochMilli()}",
        type = WorkoutType.RUNNING,
        start = start,
        end = start.plus(Duration.ofMinutes(30)),
        distanceMeters = 5_000.0,
        activeKcal = 320,
        sourceDeviceId = "AA:BB",
    )
    private val health = FakeHealthDataRepository()
    private val devices = FakeWearableDeviceRepository()
    private val preferences = FakeUserPreferencesRepository()

    /** Shared with runTest so the ViewModel's Main work and the test run on one scheduler. */
    private val dispatcher = UnconfinedTestDispatcher()

    @Before
    fun setUp() = Dispatchers.setMain(dispatcher)

    @After
    fun tearDown() = Dispatchers.resetMain()

    private fun viewModel(id: String = workout.id) =
        WorkoutDetailViewModel(SavedStateHandle(mapOf("workoutId" to id)), health, devices, preferences)

    @Test
    fun `unknown workout is not found`() = runTest(dispatcher) {
        val vm = viewModel("nope@1")
        backgroundScope.launch { vm.uiState.collect {} }
        assertEquals(WorkoutDetailUiState.NotFound, vm.uiState.value)
    }

    @Test
    fun `heart rate comes from the workout's own device and fills missing averages`() = runTest(dispatcher) {
        health.workouts.value = listOf(workout)
        health.heartRate.value = listOf(
            "AA:BB" to HeartRateSample(start.plusSeconds(60), 140),
            "AA:BB" to HeartRateSample(start.plusSeconds(600), 160),
            "OTHER" to HeartRateSample(start.plusSeconds(60), 60), // another watch: ignored
        )
        devices.devices.value = listOf(WearableDevice("AA:BB", "Forerunner", "AA:BB", WearableVendor.GARMIN))
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }
        val state = vm.uiState.value as WorkoutDetailUiState.Success
        assertEquals("Forerunner · Garmin", state.source)
        assertTrue(state.hasHeartRateChart)
        assertEquals(30, state.heartRate.size)
        assertEquals(150, state.avgHeartRate)
        assertEquals(160, state.maxHeartRate)
    }

    @Test
    fun `watch summary wins over samples, unpaired source falls back to its id`() = runTest(dispatcher) {
        health.workouts.value = listOf(workout.copy(avgHeartRate = 151, maxHeartRate = 175))
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }
        val state = vm.uiState.value as WorkoutDetailUiState.Success
        assertEquals("AA:BB", state.source)
        assertFalse(state.hasHeartRateChart)
        assertEquals(151, state.avgHeartRate)
        assertEquals(175, state.maxHeartRate)
    }

    @Test
    fun `laps and samples feed splits, cadence and elevation summaries`() = runTest(dispatcher) {
        health.workouts.value = listOf(workout)
        health.laps.value = mapOf(
            workout.id to listOf(
                WorkoutLap(
                    index = 0, start = start, end = start.plusSeconds(600),
                    distanceMeters = 1000.0, calories = 80, avgSpeedMps = 3.0, maxSpeedMps = 4.0,
                    avgHeartRate = 140, maxHeartRate = 160, avgCadence = 80, maxCadence = 90,
                    ascentMeters = 15.0, descentMeters = 5.0,
                ),
                WorkoutLap(
                    index = 1, start = start.plusSeconds(600), end = start.plusSeconds(1200),
                    distanceMeters = 1000.0, calories = 85, avgCadence = 82, maxCadence = 95,
                    ascentMeters = 10.0, descentMeters = 8.0,
                ),
            ),
        )
        health.workoutSamples.value = mapOf(
            workout.id to listOf(
                WorkoutSample(time = start.plusSeconds(10), heartRate = 120, cadence = 80, speedMps = 3.0, altitudeMeters = 100.0),
                WorkoutSample(time = start.plusSeconds(20), heartRate = 170, cadence = 88, speedMps = 3.2, altitudeMeters = 105.0),
            ),
        )
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }
        val state = vm.uiState.value as WorkoutDetailUiState.Success

        assertEquals(2, state.laps.size)
        assertTrue(state.hasSplits)
        assertEquals(25.0, state.totalAscentMeters)
        assertEquals(13.0, state.totalDescentMeters)
        assertEquals(84, state.avgCadence) // average of the two per-second cadence samples
        assertEquals(88, state.maxCadence)
        assertTrue(state.hasSampleTrend)
        assertTrue(state.hasHrZones)
    }

    @Test
    fun `unit system follows the preferences repository`() = runTest(dispatcher) {
        health.workouts.value = listOf(workout)
        preferences.setUnitSystem(UnitSystem.IMPERIAL)
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }
        val state = vm.uiState.value as WorkoutDetailUiState.Success
        assertEquals(UnitSystem.IMPERIAL, state.unitSystem)
    }
}
