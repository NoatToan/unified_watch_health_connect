package com.unified.health.feature.activity

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.unified.health.core.domain.repository.HealthDataRepository
import com.unified.health.core.domain.usecase.ActivityLoadCalculator
import com.unified.health.core.domain.usecase.ActivityLoadSummary
import com.unified.health.core.model.Workout
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import java.time.Clock
import java.time.LocalDate
import java.time.YearMonth
import javax.inject.Inject

/** Workouts of one calendar month, newest first (Apple Health groups its workout list this way). */
data class WorkoutMonth(val month: YearMonth, val workouts: List<Workout>)

sealed interface ActivityUiState {
    data object Loading : ActivityUiState
    data object Empty : ActivityUiState
    data class Success(val load: ActivityLoadSummary, val months: List<WorkoutMonth>) : ActivityUiState
    data class Error(val message: String) : ActivityUiState
}

@HiltViewModel
class ActivityViewModel internal constructor(
    repository: HealthDataRepository,
    private val clock: Clock,
) : ViewModel() {

    @Inject
    constructor(repository: HealthDataRepository) : this(repository, Clock.systemDefaultZone())

    val uiState: StateFlow<ActivityUiState> = repository.observeWorkouts()
        .map { workouts ->
            if (workouts.isEmpty()) {
                ActivityUiState.Empty
            } else {
                val zone = clock.zone
                val months = workouts
                    .sortedByDescending { it.start }
                    .groupBy { YearMonth.from(it.start.atZone(zone)) }
                    .map { (month, list) -> WorkoutMonth(month, list) }
                ActivityUiState.Success(ActivityLoadCalculator.summarize(workouts, LocalDate.now(clock), zone), months)
            }
        }
        .catch { emit(ActivityUiState.Error(it.message ?: "Unable to load workouts")) }
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), ActivityUiState.Loading)
}
