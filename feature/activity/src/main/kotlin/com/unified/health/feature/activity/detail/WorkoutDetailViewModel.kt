package com.unified.health.feature.activity.detail

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.unified.health.core.domain.model.DefaultMetricThresholds
import com.unified.health.core.domain.repository.HealthDataRepository
import com.unified.health.core.domain.repository.WearableDeviceRepository
import com.unified.health.core.domain.usecase.HeartRateStats
import com.unified.health.core.domain.usecase.HeartRateZoneBreakdown
import com.unified.health.core.domain.usecase.HeartRateZoneShare
import com.unified.health.core.domain.usecase.WorkoutHeartRateSeries
import com.unified.health.core.domain.usecase.WorkoutSampleSeries
import com.unified.health.core.model.ChartPoint
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
import javax.inject.Inject
import kotlin.math.roundToInt

sealed interface WorkoutDetailUiState {
    data object Loading : WorkoutDetailUiState
    data object NotFound : WorkoutDetailUiState
    data class Success(
        val workout: Workout,
        /** "Name · Brand" of the recording device, its id when no longer paired, null when unknown. */
        val source: String?,
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
        /** % of workout time in each of the 5 HR zones (D-1030 thresholds); all 0 without HR samples. */
        val hrZones: List<HeartRateZoneShare> = emptyList(),
        val avgCadence: Int? = null,
        val maxCadence: Int? = null,
        /** Summed across laps; null when no lap carried this field. */
        val totalAscentMeters: Double? = null,
        val totalDescentMeters: Double? = null,
    ) : WorkoutDetailUiState {
        /** The watch's own summary wins; the samples fill in when the watch did not report one. */
        val avgHeartRate: Int? get() = workout.avgHeartRate ?: sampleStats?.average
        val maxHeartRate: Int? get() = workout.maxHeartRate ?: sampleStats?.max
        val hasHeartRateChart: Boolean get() = heartRate.any { it.hasData }
        val hasSplits: Boolean get() = laps.isNotEmpty()
        val hasSampleTrend: Boolean get() = paceSeries.any { it.hasData } || elevationSeries.any { it.hasData } || sampleHeartRateSeries.any { it.hasData }
        val hasHrZones: Boolean get() = hrZones.any { it.percentOfTime > 0.0 }
    }
}

@OptIn(ExperimentalCoroutinesApi::class)
@HiltViewModel
class WorkoutDetailViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    healthData: HealthDataRepository,
    devices: WearableDeviceRepository,
) : ViewModel() {

    /** Argument of [com.unified.health.feature.activity.WorkoutDetailDestination], stored under its property name. */
    private val workoutId: String = checkNotNull(savedStateHandle[ARG_WORKOUT_ID]) { "Missing $ARG_WORKOUT_ID" }

    val uiState: StateFlow<WorkoutDetailUiState> = healthData.observeWorkout(workoutId)
        .flatMapLatest { workout ->
            if (workout == null) {
                flowOf(WorkoutDetailUiState.NotFound)
            } else {
                combine(
                    healthData.observeHeartRateSamples(workout.start, workout.end, workout.sourceDeviceId),
                    devices.pairedDevices,
                    healthData.observeWorkoutLaps(workout.id),
                    healthData.observeWorkoutSamples(workout.id),
                ) { samples, paired, laps, workoutSamples ->
                    val device = paired.firstOrNull { it.id == workout.sourceDeviceId }
                    val maxHeartRateBpm = DefaultMetricThresholds.VALUES.estimatedMaxHeartRateBpm()
                    val cadenceSamples = workoutSamples.mapNotNull { it.cadence }.filter { it > 0 }
                    val lapAvgCadence = laps.mapNotNull { it.avgCadence }
                    val lapMaxCadence = laps.mapNotNull { it.maxCadence }
                    val lapAscent = laps.mapNotNull { it.ascentMeters }
                    val lapDescent = laps.mapNotNull { it.descentMeters }
                    WorkoutDetailUiState.Success(
                        workout = workout,
                        source = device?.let { "${it.name} · ${it.vendor.displayName}" } ?: workout.sourceDeviceId,
                        heartRate = WorkoutHeartRateSeries.buckets(samples, workout.start, workout.end),
                        sampleStats = WorkoutHeartRateSeries.stats(samples),
                        laps = laps,
                        paceSeries = WorkoutSampleSeries.paceSecondsPerKm(workoutSamples, workout.start, workout.end),
                        elevationSeries = WorkoutSampleSeries.elevation(workoutSamples, workout.start, workout.end),
                        sampleHeartRateSeries = WorkoutSampleSeries.heartRate(workoutSamples, workout.start, workout.end),
                        hrZones = HeartRateZoneBreakdown.percentages(workoutSamples, DefaultMetricThresholds.VALUES, maxHeartRateBpm),
                        avgCadence = cadenceSamples.takeIf { it.isNotEmpty() }?.average()?.roundToInt()
                            ?: lapAvgCadence.takeIf { it.isNotEmpty() }?.average()?.roundToInt(),
                        maxCadence = cadenceSamples.maxOrNull() ?: lapMaxCadence.maxOrNull(),
                        totalAscentMeters = lapAscent.takeIf { it.isNotEmpty() }?.sum(),
                        totalDescentMeters = lapDescent.takeIf { it.isNotEmpty() }?.sum(),
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
