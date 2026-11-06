package com.unified.health.feature.activity

import androidx.lifecycle.SavedStateHandle
import com.unified.health.core.model.HeartRateSample
import com.unified.health.core.model.WearableDevice
import com.unified.health.core.model.WearableVendor
import com.unified.health.core.model.Workout
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

    /** Shared with runTest so the ViewModel's Main work and the test run on one scheduler. */
    private val dispatcher = UnconfinedTestDispatcher()

    @Before
    fun setUp() = Dispatchers.setMain(dispatcher)

    @After
    fun tearDown() = Dispatchers.resetMain()

    private fun viewModel(id: String = workout.id) =
        WorkoutDetailViewModel(SavedStateHandle(mapOf("workoutId" to id)), health, devices)

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
}
