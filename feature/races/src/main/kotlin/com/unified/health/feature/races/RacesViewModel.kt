package com.unified.health.feature.races

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.unified.health.core.domain.repository.RacesRepository
import com.unified.health.core.domain.repository.RacesState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RacesViewModel @Inject constructor(
    private val racesRepository: RacesRepository,
) : ViewModel() {

    val uiState: StateFlow<RacesState> =
        racesRepository.races.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), RacesState.Loading)

    private val _isRefreshing = MutableStateFlow(false)
    val isRefreshing: StateFlow<Boolean> = _isRefreshing.asStateFlow()

    /** Pull-to-refresh / "Retry": always hits the network regardless of cache age (D-1107). */
    fun refresh() {
        viewModelScope.launch {
            _isRefreshing.value = true
            racesRepository.refresh()
            _isRefreshing.value = false
        }
    }
}
