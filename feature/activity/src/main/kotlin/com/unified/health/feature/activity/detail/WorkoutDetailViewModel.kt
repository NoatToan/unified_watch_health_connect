package com.unified.health.feature.activity.detail

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.unified.health.core.domain.repository.HealthDataRepository
import com.unified.health.core.domain.repository.WearableDeviceRepository
import com.unified.health.core.domain.usecase.HeartRateStats
import com.unified.health.core.domain.usecase.WorkoutHeartRateSeries
import com.unified.health.core.model.ChartPoint
import com.unified.health.core.model.Workout
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
    ) : WorkoutDetailUiState {
        /** The watch's own summary wins; the samples fill in when the watch did not report one. */
        val avgHeartRate: Int? get() = workout.avgHeartRate ?: sampleStats?.average
        val maxHeartRate: Int? get() = workout.maxHeartRate ?: sampleStats?.max
        val hasHeartRateChart: Boolean get() = heartRate.any { it.hasData }
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
                ) { samples, paired ->
                    val device = paired.firstOrNull { it.id == workout.sourceDeviceId }
                    WorkoutDetailUiState.Success(
                        workout = workout,
                        source = device?.let { "${it.name} · ${it.vendor.displayName}" } ?: workout.sourceDeviceId,
                        heartRate = WorkoutHeartRateSeries.buckets(samples, workout.start, workout.end),
                        sampleStats = WorkoutHeartRateSeries.stats(samples),
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
