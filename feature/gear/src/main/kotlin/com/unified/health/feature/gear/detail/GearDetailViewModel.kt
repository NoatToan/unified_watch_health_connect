package com.unified.health.feature.gear.detail

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.toRoute
import com.unified.health.core.domain.repository.GearRepository
import com.unified.health.core.domain.repository.GearState
import com.unified.health.core.model.GearItem
import com.unified.health.core.model.GearVariant
import com.unified.health.feature.gear.GearDetailDestination
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

sealed interface GearDetailUiState {
    data object Loading : GearDetailUiState

    /** Also covers [GearState.Error] — a network failure hitting right as the user drills into one
     *  specific item is rare and not worth its own distinct message/retry UI here (same rationale as
     *  `RaceDetailViewModel`); the user can back out to [com.unified.health.feature.gear.GearScreen],
     *  which already has its own retry. */
    data object NotFound : GearDetailUiState

    /**
     * [selectedVariant] is the color the user tapped, or null for the item's own default photo/link.
     * [displayImageUrl]/[productUrl] fold that selection in once here, so the screen itself never has
     * to re-derive "variant's own field, else the item's" at each call site.
     */
    data class Success(val item: GearItem, val selectedVariant: GearVariant?) : GearDetailUiState {
        val displayImageUrl: String? get() = selectedVariant?.imageUrl ?: item.imageUrl
        val productUrl: String get() = selectedVariant?.productUrl ?: item.productUrl
    }
}

/**
 * Looks up one [GearItem] by id from [GearRepository]'s already-loaded state — the same in-memory
 * lookup pattern as `RaceDetailViewModel`/`WorkoutDetailViewModel`; no separate "fetch one item" API
 * is needed since the full catalog is already held in memory by [GearRepository].
 *
 * Also owns the color-variant selection ([selectVariant]): the follow-up "add to my wardrobe" task
 * will build directly on this same picker, so the selection is modeled here rather than as throwaway
 * `rememberSaveable` state in the composable.
 */
@HiltViewModel
class GearDetailViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    gearRepository: GearRepository,
) : ViewModel() {

    private val itemId = savedStateHandle.toRoute<GearDetailDestination>().itemId

    /** Keyed by [GearVariant.color] rather than holding the [GearVariant] itself, so a background
     *  refresh that reconstructs the item/variant list doesn't lose the user's selection. */
    private val selectedColor = MutableStateFlow<String?>(null)

    val uiState: StateFlow<GearDetailUiState> = combine(gearRepository.items, selectedColor) { state, color ->
        val item = (state as? GearState.Success)?.items?.firstOrNull { it.id == itemId }
        when {
            item != null -> GearDetailUiState.Success(item, item.variants.firstOrNull { it.color == color })
            state is GearState.Success || state is GearState.Empty || state is GearState.Error -> GearDetailUiState.NotFound
            else -> GearDetailUiState.Loading
        }
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), GearDetailUiState.Loading)

    fun selectVariant(color: String?) {
        selectedColor.value = color
    }
}
