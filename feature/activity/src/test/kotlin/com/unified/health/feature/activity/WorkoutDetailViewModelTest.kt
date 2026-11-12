package com.unified.health.feature.activity

import androidx.lifecycle.SavedStateHandle
import com.unified.health.core.domain.repository.SyntheticWorkoutDetailSource
import com.unified.health.core.domain.repository.WorkoutDetailSupplement
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
import com.unified.health.feature.activity.detail.WorkoutSourceDisplay
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
import java.util.Optional

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
    private val synthetic = FakeSyntheticWorkoutDetailSource()

    /** Shared with runTest so the ViewModel's Main work and the test run on one scheduler. */
    private val dispatcher = UnconfinedTestDispatcher()

    @Before
    fun setUp() = Dispatchers.setMain(dispatcher)

    @After
    fun tearDown() = Dispatchers.resetMain()

    /** [syntheticSource] defaults to the shared fake; pass `Optional.empty()` for a "release build" test. */
    private fun viewModel(id: String = workout.id, syntheticSource: Optional<SyntheticWorkoutDetailSource> = Optional.of(synthetic)) =
        WorkoutDetailViewModel(SavedStateHandle(mapOf("workoutId" to id)), health, devices, preferences, syntheticSource)

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
        assertEquals(WorkoutSourceDisplay.Paired("Forerunner", "Garmin"), state.source)
        assertTrue(state.hasHeartRateChart)
        assertEquals(30, state.heartRate.size)
        assertEquals(150, state.avgHeartRate)
        assertEquals(160, state.maxHeartRate)
    }

    @Test
    fun `watch summary wins over samples, unpaired non-demo source falls back to Unknown`() = runTest(dispatcher) {
        health.workouts.value = listOf(workout.copy(avgHeartRate = 151, maxHeartRate = 175))
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }
        val state = vm.uiState.value as WorkoutDetailUiState.Success
        assertEquals(WorkoutSourceDisplay.Unknown("AA:BB"), state.source)
        assertFalse(state.hasHeartRateChart)
        assertEquals(151, state.avgHeartRate)
        assertEquals(175, state.maxHeartRate)
    }

    // ---------------------------------------------------------------- D-1197 round 2

    @Test
    fun `an unpaired demo device shows the friendly Demo label, never its raw id`() = runTest(dispatcher) {
        health.workouts.value = listOf(workout)
        synthetic.demoDeviceIds = setOf("AA:BB")
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }
        val state = vm.uiState.value as WorkoutDetailUiState.Success
        assertEquals(WorkoutSourceDisplay.Demo, state.source)
    }

    @Test
    fun `a paired device wins over a demo id (still shows Name times Brand)`() = runTest(dispatcher) {
        health.workouts.value = listOf(workout)
        devices.devices.value = listOf(WearableDevice("AA:BB", "Forerunner", "AA:BB", WearableVendor.GARMIN))
        synthetic.demoDeviceIds = setOf("AA:BB")
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }
        val state = vm.uiState.value as WorkoutDetailUiState.Success
        assertEquals(WorkoutSourceDisplay.Paired("Forerunner", "Garmin"), state.source)
    }

    @Test
    fun `without a synthetic source at all, a demo-shaped id still falls back to Unknown`() = runTest(dispatcher) {
        // Mirrors the release graph (Optional-empty, no :core:demo binding): there is nothing to ask
        // "is this a demo device", so it must not be misreported as one.
        health.workouts.value = listOf(workout)
        val vm = viewModel(syntheticSource = Optional.empty())
        backgroundScope.launch { vm.uiState.collect {} }
        val state = vm.uiState.value as WorkoutDetailUiState.Success
        assertEquals(WorkoutSourceDisplay.Unknown("AA:BB"), state.source)
    }

    @Test
    fun `the heart rate card's avg and max follow the watch summary, min follows the samples`() = runTest(dispatcher) {
        // The exact reported inconsistency: summary grid showed 154/167 (the watch's own fields) while
        // a separate card showed 151/156 (purely sample-derived) for the same workout.
        health.workouts.value = listOf(workout.copy(avgHeartRate = 154, maxHeartRate = 167))
        health.heartRate.value = listOf(
            "AA:BB" to HeartRateSample(start.plusSeconds(60), 148),
            "AA:BB" to HeartRateSample(start.plusSeconds(600), 156),
        )
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }
        val state = vm.uiState.value as WorkoutDetailUiState.Success
        assertEquals(154, state.avgHeartRate) // watch wins, not the samples' 152.0 average
        assertEquals(167, state.maxHeartRate) // watch wins, not the samples' 156 max
        assertEquals(148, state.minHeartRate) // Workout carries no min field: samples always win here
        assertTrue(state.hasHeartRateChart)
    }

    @Test
    fun `the heart rate chart also shows from dense per-second samples alone, no minute stream needed`() = runTest(dispatcher) {
        health.workouts.value = listOf(workout)
        health.workoutSamples.value = mapOf(workout.id to listOf(WorkoutSample(time = start.plusSeconds(10), heartRate = 140)))
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }
        val state = vm.uiState.value as WorkoutDetailUiState.Success
        assertTrue(state.hasHeartRateChart)
        assertTrue(state.heartRate.none { it.hasData }) // the minute-level stream itself is still empty
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

    // ---------------------------------------------------------------- D-1195

    @Test
    fun `synthesized laps and samples fill in when the device recorded none`() = runTest(dispatcher) {
        health.workouts.value = listOf(workout)
        synthetic.supplements = mapOf(
            workout.id to WorkoutDetailSupplement(
                laps = listOf(WorkoutLap(index = 0, start = start, end = start.plusSeconds(1800), distanceMeters = 5000.0)),
                samples = listOf(WorkoutSample(time = start.plusSeconds(10), heartRate = 150, cadence = 170, speedMps = 2.8)),
            ),
        )
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }
        val state = vm.uiState.value as WorkoutDetailUiState.Success

        assertEquals(1, state.laps.size)
        assertTrue(state.hasSplits)
        assertEquals(170, state.avgCadence)
        assertTrue(state.hasHrZones)
    }

    @Test
    fun `real laps and samples win over synthesized ones`() = runTest(dispatcher) {
        health.workouts.value = listOf(workout)
        health.laps.value = mapOf(
            workout.id to listOf(WorkoutLap(index = 0, start = start, end = start.plusSeconds(1800), distanceMeters = 5000.0, avgCadence = 165)),
        )
        health.workoutSamples.value = mapOf(
            workout.id to listOf(WorkoutSample(time = start.plusSeconds(10), heartRate = 140, cadence = 165, speedMps = 2.9)),
        )
        // A synthesized fallback is present too, but must never be consulted once real rows exist.
        synthetic.supplements = mapOf(
            workout.id to WorkoutDetailSupplement(
                laps = listOf(WorkoutLap(index = 0, start = start, end = start.plusSeconds(1800), distanceMeters = 9999.0)),
                samples = listOf(WorkoutSample(time = start.plusSeconds(10), heartRate = 199, cadence = 199, speedMps = 9.9)),
            ),
        )
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }
        val state = vm.uiState.value as WorkoutDetailUiState.Success

        assertEquals(5000.0, state.laps.single().distanceMeters)
        assertEquals(165, state.avgCadence)
    }

    @Test
    fun `no synthetic source means no synthesized data, even for a demo-shaped workout`() = runTest(dispatcher) {
        health.workouts.value = listOf(workout)
        synthetic.supplements = mapOf(
            workout.id to WorkoutDetailSupplement(
                laps = listOf(WorkoutLap(index = 0, start = start, end = start.plusSeconds(1800), distanceMeters = 5000.0)),
                samples = listOf(WorkoutSample(time = start.plusSeconds(10), heartRate = 150)),
            ),
        )
        // Mirrors the release graph: `@BindsOptionalOf` with no `:core:demo` binding present.
        val vm = viewModel(syntheticSource = Optional.empty())
        backgroundScope.launch { vm.uiState.collect {} }
        val state = vm.uiState.value as WorkoutDetailUiState.Success

        assertTrue(state.laps.isEmpty())
        assertFalse(state.hasSplits)
        assertEquals(0, synthetic.callCount)
    }

    @Test
    fun `hr zones fall back to the minute-level stream without per-second samples`() = runTest(dispatcher) {
        health.workouts.value = listOf(workout.copy(avgHeartRate = 150, maxHeartRate = 170))
        health.heartRate.value = listOf(
            "AA:BB" to HeartRateSample(start.plusSeconds(60), 150),
            "AA:BB" to HeartRateSample(start.plusSeconds(600), 170),
        )
        val vm = viewModel(syntheticSource = Optional.empty())
        backgroundScope.launch { vm.uiState.collect {} }
        val state = vm.uiState.value as WorkoutDetailUiState.Success

        assertTrue(state.hasHrZones)
    }

    @Test
    fun `kcal per minute is derived from active energy and duration`() = runTest(dispatcher) {
        health.workouts.value = listOf(workout.copy(activeKcal = 300)) // 30 min workout -> 10 kcal/min
        val vm = viewModel()
        backgroundScope.launch { vm.uiState.collect {} }
        val state = vm.uiState.value as WorkoutDetailUiState.Success

        assertEquals(10.0, state.derived.kcalPerMinute!!, 0.001)
    }
}
