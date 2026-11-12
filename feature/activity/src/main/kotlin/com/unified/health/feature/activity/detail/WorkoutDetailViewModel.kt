package com.unified.health.feature.activity.detail

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.unified.health.core.domain.model.DefaultMetricThresholds
import com.unified.health.core.domain.repository.HealthDataRepository
import com.unified.health.core.domain.repository.SyntheticWorkoutDetailSource
import com.unified.health.core.domain.repository.UserPreferencesRepository
import com.unified.health.core.domain.repository.WearableDeviceRepository
import com.unified.health.core.domain.repository.WorkoutDetailSupplement
import com.unified.health.core.domain.usecase.HeartRateStats
import com.unified.health.core.domain.usecase.WorkoutDerivedDetail
import com.unified.health.core.domain.usecase.WorkoutDerivedMetrics
import com.unified.health.core.domain.usecase.WorkoutHeartRateSeries
import com.unified.health.core.domain.usecase.WorkoutSampleSeries
import com.unified.health.core.model.ChartPoint
import com.unified.health.core.model.UnitSystem
import com.unified.health.core.model.Workout
import com.unified.health.core.model.WorkoutLap
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.stateIn
import java.util.Optional
import javax.inject.Inject
import kotlin.math.roundToInt

/**
 * Friendly display for a workout's recording device (docs/DECISIONS.md D-1197 round 2): a raw BLE MAC
 * is never shown as the primary label — only as [Unknown]'s secondary detail, and only once there is
 * no better name for it.
 */
sealed interface WorkoutSourceDisplay {
    /** Still in the paired list: "Name · Brand". */
    data class Paired(val name: String, val brand: String) : WorkoutSourceDisplay
    /** One of this build's demo/virtual watches (never actually paired — see [SyntheticWorkoutDetailSource.isDemoDevice]). */
    data object Demo : WorkoutSourceDisplay
    /** Neither paired nor a known demo id; [deviceId] (null when the workout carries no device id at
     * all) is kept only as secondary detail in the UI. */
    data class Unknown(val deviceId: String?) : WorkoutSourceDisplay
}

sealed interface WorkoutDetailUiState {
    data object Loading : WorkoutDetailUiState
    data object NotFound : WorkoutDetailUiState
    data class Success(
        val workout: Workout,
        /** D-1197 round 2: never the raw MAC by itself — see [WorkoutSourceDisplay]. */
        val source: WorkoutSourceDisplay,
        /** Heart rate over the workout; empty when no samples were recorded. */
        val heartRate: List<ChartPoint>,
        /** From the samples; null without samples. */
        val sampleStats: HeartRateStats?,
        /** FIT `lap` splits (D-1093), in lap order; empty when the device recorded none. */
        val laps: List<WorkoutLap> = emptyList(),
        /** FIT `record`-derived trend series (D-1093); empty series mean no usable samples. */
        val paceSeries: List<ChartPoint> = emptyList(),
        val elevationSeries: List<ChartPoint> = emptyList(),
        val sampleHeartRateSeries: List<ChartPoint> = emptyList(),
        /** D-1201: cadence over elapsed time, for the Charts section's cadence chart. */
        val cadenceSeries: List<ChartPoint> = emptyList(),
        val avgCadence: Int? = null,
        val maxCadence: Int? = null,
        /** Summed across laps; null when no lap carried this field. */
        val totalAscentMeters: Double? = null,
        val totalDescentMeters: Double? = null,
        /** D-1183: Metric (km/kg) vs Imperial (mi/lb) distance display, from Profile's toggle. */
        val unitSystem: UnitSystem = UnitSystem.METRIC,
        /**
         * Everything computed on the fly rather than read straight from laps/samples (D-1195/D-1201):
         * HR zones (+ minutes), kcal/min, pace/speed/stride, per-km splits, elevation-from-samples;
         * training load/recovery (the still-device-only part of the Huawei-detail-parity follow-up,
         * §9) is meant to land here too, not as new `Success` fields.
         */
        val derived: WorkoutDerivedDetail = WorkoutDerivedDetail(),
    ) : WorkoutDetailUiState {
        /** The watch's own summary wins; the samples fill in when the watch did not report one. */
        val avgHeartRate: Int? get() = workout.avgHeartRate ?: sampleStats?.average
        val maxHeartRate: Int? get() = workout.maxHeartRate ?: sampleStats?.max
        /** [Workout] carries no summary min field (D-1201); samples win, [WorkoutDerivedDetail.minHeartRate] falls back. */
        val minHeartRate: Int? get() = sampleStats?.min ?: derived.minHeartRate
        /** D-1197 round 2: the single "Heart rate" card prefers the dense per-sample series (workout
         * samples) and falls back to the sparser minute-level stream — either one is enough to show it. */
        val hasHeartRateChart: Boolean get() = sampleHeartRateSeries.any { it.hasData } || heartRate.any { it.hasData }
        val hasSplits: Boolean get() = derived.splits.splits.isNotEmpty()
        /** D-1197 round 2: heart rate no longer renders here — it moved into the "Heart rate" card above
         * (see [hasHeartRateChart]) so it is never drawn twice. */
        val hasSampleTrend: Boolean get() =
            paceSeries.any { it.hasData } || elevationSeries.any { it.hasData } || cadenceSeries.any { it.hasData }
        val hasHrZones: Boolean get() = derived.hrZones.any { it.percentOfTime > 0.0 }
    }
}

@OptIn(ExperimentalCoroutinesApi::class)
@HiltViewModel
class WorkoutDetailViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    healthData: HealthDataRepository,
    devices: WearableDeviceRepository,
    preferences: UserPreferencesRepository,
    synthetic: Optional<SyntheticWorkoutDetailSource>,
) : ViewModel() {

    /** Argument of [com.unified.health.feature.activity.WorkoutDetailDestination], stored under its property name. */
    private val workoutId: String = checkNotNull(savedStateHandle[ARG_WORKOUT_ID]) { "Missing $ARG_WORKOUT_ID" }

    /** Present only in debug/androidTest builds (`:core:demo`); release always gets `Optional.empty()`. */
    private val syntheticSource: SyntheticWorkoutDetailSource? = synthetic.orElse(null)

    /**
     * D-1195: computed at most once per workout (never persisted) and kept here so rotation/
     * recomposition — which re-collects [uiState] but doesn't recreate this ViewModel — doesn't
     * recompute it. A workout with no synthesized detail (every real device, or a demo workout once
     * [syntheticSource] is absent in release) maps to `null` and stays that way.
     */
    private val syntheticCache = mutableMapOf<String, WorkoutDetailSupplement?>()

    private fun syntheticFor(workout: Workout): WorkoutDetailSupplement? =
        syntheticCache.getOrPut(workout.id) { syntheticSource?.supplement(workout) }

    val uiState: StateFlow<WorkoutDetailUiState> = healthData.observeWorkout(workoutId)
        .flatMapLatest { workout ->
            if (workout == null) {
                flowOf(WorkoutDetailUiState.NotFound)
            } else {
                val supplement = syntheticFor(workout)
                combine(
                    healthData.observeHeartRateSamples(workout.start, workout.end, workout.sourceDeviceId),
                    devices.pairedDevices,
                    healthData.observeWorkoutLaps(workout.id),
                    healthData.observeWorkoutSamples(workout.id),
                    preferences.userPreferences,
                ) { samples, paired, storedLaps, storedSamples, prefs ->
                    // Real laps/samples always win; the synthesized ones (demo only) only fill the gap
                    // when the device/sync recorded none at all (docs/DECISIONS.md D-1195).
                    val laps = storedLaps.ifEmpty { supplement?.laps.orEmpty() }
                    val workoutSamples = storedSamples.ifEmpty { supplement?.samples.orEmpty() }

                    val device = paired.firstOrNull { it.id == workout.sourceDeviceId }
                    // D-1197 round 2: a demo watch is never actually in `paired` (it is not a real BLE
                    // peripheral), so without this check its raw synthetic MAC would show as "source".
                    val sourceDeviceId = workout.sourceDeviceId
                    val source = when {
                        device != null -> WorkoutSourceDisplay.Paired(device.name, device.vendor.displayName)
                        sourceDeviceId != null && syntheticSource?.isDemoDevice(sourceDeviceId) == true -> WorkoutSourceDisplay.Demo
                        else -> WorkoutSourceDisplay.Unknown(sourceDeviceId)
                    }
                    val maxHeartRateBpm = DefaultMetricThresholds.VALUES.estimatedMaxHeartRateBpm()
                    val cadenceSamples = workoutSamples.mapNotNull { it.cadence }.filter { it > 0 }
                    val lapAvgCadence = laps.mapNotNull { it.avgCadence }
                    val lapMaxCadence = laps.mapNotNull { it.maxCadence }
                    val lapAscent = laps.mapNotNull { it.ascentMeters }
                    val lapDescent = laps.mapNotNull { it.descentMeters }
                    val avgCadence = cadenceSamples.takeIf { it.isNotEmpty() }?.average()?.roundToInt()
                        ?: lapAvgCadence.takeIf { it.isNotEmpty() }?.average()?.roundToInt()

                    // D-1195/D-1201: HR zones fall back to the minute-level stream when workoutSamples
                    // have no usable HR of their own (e.g. a real device whose FIT file only has a
                    // `session` summary) — see WorkoutDerivedMetrics.derive for the actual fallback logic.
                    // laps/unitSystem/avgCadence feed the D-1201 additions (splits, pace/speed/stride,
                    // HR-zone minutes) in the same bundle, computed from the already-merged real/synth data.
                    val derived = WorkoutDerivedMetrics.derive(
                        workout = workout,
                        workoutSamples = workoutSamples,
                        minuteHeartRateBpm = samples.map { it.bpm },
                        thresholds = DefaultMetricThresholds.VALUES,
                        maxHeartRateBpm = maxHeartRateBpm,
                        laps = laps,
                        unitSystem = prefs.unitSystem,
                        avgCadence = avgCadence,
                    )
                    WorkoutDetailUiState.Success(
                        workout = workout,
                        source = source,
                        heartRate = WorkoutHeartRateSeries.buckets(samples, workout.start, workout.end),
                        sampleStats = WorkoutHeartRateSeries.stats(samples),
                        laps = laps,
                        paceSeries = WorkoutSampleSeries.paceSecondsPerKm(workoutSamples, workout.start, workout.end),
                        elevationSeries = WorkoutSampleSeries.elevation(workoutSamples, workout.start, workout.end),
                        sampleHeartRateSeries = WorkoutSampleSeries.heartRate(workoutSamples, workout.start, workout.end),
                        cadenceSeries = WorkoutSampleSeries.cadence(workoutSamples, workout.start, workout.end),
                        avgCadence = avgCadence,
                        maxCadence = cadenceSamples.maxOrNull() ?: lapMaxCadence.maxOrNull(),
                        // D-1201: laps carrying their own ascent/descent always win; the hysteresis-based
                        // altitude-sample computation (WorkoutElevation, bundled in `derived`) is only the
                        // fallback for workouts whose laps don't carry it at all.
                        totalAscentMeters = lapAscent.takeIf { it.isNotEmpty() }?.sum() ?: derived.elevation?.gainMeters,
                        totalDescentMeters = lapDescent.takeIf { it.isNotEmpty() }?.sum() ?: derived.elevation?.descentMeters,
                        unitSystem = prefs.unitSystem,
                        derived = derived,
                    )
                }
            }
        }
        .catch { emit(WorkoutDetailUiState.NotFound) }
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), WorkoutDetailUiState.Loading)

    internal companion object {
        const val ARG_WORKOUT_ID = "workoutId"
    }
}
