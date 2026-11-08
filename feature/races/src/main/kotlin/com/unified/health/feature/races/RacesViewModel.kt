package com.unified.health.feature.races

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.unified.health.core.domain.repository.RacesRepository
import com.unified.health.core.domain.repository.RacesState
import com.unified.health.core.model.Race
import com.unified.health.core.model.RaceStatus
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import java.time.YearMonth
import javax.inject.Inject

/**
 * [province]/[month] are single-select ("Tất cả" = null, D-1113); [showPast] additionally brings
 * `raceStatus == past` races into view (also off by default — D-1113 doesn't show them alongside
 * upcoming ones unless the user opts in).
 */
data class RaceFilters(
    val province: String? = null,
    val month: YearMonth? = null,
    val showPast: Boolean = false,
)

sealed interface RacesUiState {
    data object Loading : RacesUiState
    data class Error(val message: String) : RacesUiState

    /** The feed itself has no valid race at all — distinct from [Success] filtering down to zero. */
    data object Empty : RacesUiState

    data class Success(
        val races: List<Race>,
        val availableProvinces: List<String>,
        val availableMonths: List<YearMonth>,
        val filters: RaceFilters,
    ) : RacesUiState
}

@HiltViewModel
class RacesViewModel @Inject constructor(
    private val racesRepository: RacesRepository,
) : ViewModel() {

    private val filters = MutableStateFlow(RaceFilters())

    /**
     * Province/month options are derived straight from whatever's currently loaded (D-1125) — no
     * separate cache, since the feed is small (~50 races) and already held in memory by
     * [RacesRepository]. Filtering (status default-to-upcoming, province, month) happens here, not
     * in the repository, so [RacesRepository]'s own [RacesState] keeps meaning "everything parsed".
     */
    val uiState: StateFlow<RacesUiState> = combine(racesRepository.races, filters) { state, f ->
        when (state) {
            RacesState.Loading -> RacesUiState.Loading
            is RacesState.Error -> RacesUiState.Error(state.message)
            RacesState.Empty -> RacesUiState.Empty
            is RacesState.Success -> buildSuccessState(state.races, f)
        }
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), RacesUiState.Loading)

    private val _isRefreshing = MutableStateFlow(false)
    val isRefreshing: StateFlow<Boolean> = _isRefreshing.asStateFlow()

    private fun buildSuccessState(races: List<Race>, f: RaceFilters): RacesUiState.Success {
        val filtered = races.filter { race ->
            (f.showPast || race.raceStatus == RaceStatus.UPCOMING) &&
                (f.province == null || race.province == f.province) &&
                (f.month == null || YearMonth.from(race.startDate) == f.month)
        }
        return RacesUiState.Success(
            races = filtered,
            availableProvinces = races.mapNotNull { it.province }.distinct().sorted(),
            availableMonths = races.map { YearMonth.from(it.startDate) }.distinct().sorted(),
            filters = f,
        )
    }

    fun setProvinceFilter(province: String?) {
        filters.update { it.copy(province = province) }
    }

    fun setMonthFilter(month: YearMonth?) {
        filters.update { it.copy(month = month) }
    }

    fun setShowPast(showPast: Boolean) {
        filters.update { it.copy(showPast = showPast) }
    }

    /** Pull-to-refresh / "Retry": always hits the network regardless of cache age (D-1107). */
    fun refresh() {
        viewModelScope.launch {
            _isRefreshing.value = true
            racesRepository.refresh()
            _isRefreshing.value = false
        }
    }
}
