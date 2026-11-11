package com.unified.health.feature.gear

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.unified.health.core.domain.repository.GearRepository
import com.unified.health.core.domain.repository.GearState
import com.unified.health.core.model.GearCategory
import com.unified.health.core.model.GearItem
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import javax.inject.Inject

sealed interface GearUiState {
    data object Loading : GearUiState
    data class Error(val message: String) : GearUiState

    /** The feed itself has no valid item at all — distinct from [Success] filtering down to zero. */
    data object Empty : GearUiState

    data class Success(val items: List<GearItem>, val categoryFilter: GearCategory?) : GearUiState
}

/**
 * "Trang bị tham khảo" (reference gear) list — mirrors
 * [com.unified.health.feature.races.RacesViewModel]'s own shape: a single-select category filter
 * ("Tất cả" = null) applied in the UI layer on top of [GearRepository]'s already-parsed state.
 */
@HiltViewModel
class GearViewModel @Inject constructor(
    private val gearRepository: GearRepository,
) : ViewModel() {

    private val categoryFilter = MutableStateFlow<GearCategory?>(null)

    val uiState: StateFlow<GearUiState> = combine(gearRepository.items, categoryFilter) { state, filter ->
        when (state) {
            GearState.Loading -> GearUiState.Loading
            is GearState.Error -> GearUiState.Error(state.message)
            GearState.Empty -> GearUiState.Empty
            is GearState.Success -> GearUiState.Success(
                items = state.items.filter { filter == null || it.category == filter },
                categoryFilter = filter,
            )
        }
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), GearUiState.Loading)

    private val _isRefreshing = MutableStateFlow(false)
    val isRefreshing: StateFlow<Boolean> = _isRefreshing.asStateFlow()

    fun setCategoryFilter(category: GearCategory?) {
        categoryFilter.value = category
    }

    /** Pull-to-refresh / "Retry": always hits the network regardless of cache age. */
    fun refresh() {
        viewModelScope.launch {
            _isRefreshing.value = true
            gearRepository.refresh()
            _isRefreshing.value = false
        }
    }
}
