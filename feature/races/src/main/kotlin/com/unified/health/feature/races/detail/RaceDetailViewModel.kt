package com.unified.health.feature.races.detail

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.toRoute
import com.unified.health.core.domain.repository.RacesRepository
import com.unified.health.core.domain.repository.RacesState
import com.unified.health.core.model.Race
import com.unified.health.feature.races.RaceDetailDestination
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

sealed interface RaceDetailUiState {
    data object Loading : RaceDetailUiState
    data class Success(val race: Race) : RaceDetailUiState

    /** Also covers [RacesState.Error] (D-1125): a network failure hitting right as the user drills
     *  into one specific race is rare and not worth its own distinct message/retry UI here — the
     *  user can back out to `RacesScreen`, which already has its own retry. */
    data object NotFound : RaceDetailUiState
}

/**
 * Looks up one [Race] by id from [RacesRepository]'s already-loaded state (D-1114/D-1125) — the
 * exact same `savedStateHandle.toRoute<...>()` + in-memory lookup pattern as
 * `WorkoutDetailViewModel`/`MetricDetailViewModel`; no separate "fetch one race" API is needed since
 * the full list is already held in memory by [RacesRepository].
 */
@HiltViewModel
class RaceDetailViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    racesRepository: RacesRepository,
) : ViewModel() {

    private val raceId = savedStateHandle.toRoute<RaceDetailDestination>().raceId

    val uiState: StateFlow<RaceDetailUiState> = racesRepository.races
        .map { state ->
            val race = (state as? RacesState.Success)?.races?.firstOrNull { it.id == raceId }
            when {
                race != null -> RaceDetailUiState.Success(race)
                state is RacesState.Success || state is RacesState.Empty || state is RacesState.Error -> RaceDetailUiState.NotFound
                else -> RaceDetailUiState.Loading
            }
        }
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), RaceDetailUiState.Loading)
}
