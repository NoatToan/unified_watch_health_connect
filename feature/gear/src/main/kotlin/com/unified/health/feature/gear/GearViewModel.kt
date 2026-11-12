package com.unified.health.feature.gear

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.unified.health.core.domain.repository.GearRepository
import com.unified.health.core.domain.repository.GearState
import com.unified.health.core.domain.usecase.ColorFamily
import com.unified.health.core.domain.usecase.GearColorFamilyCount
import com.unified.health.core.domain.usecase.firstVariantMatchingColorFamilies
import com.unified.health.core.domain.usecase.gearColorFamilyCounts
import com.unified.health.core.domain.usecase.gearPriceBoundsVnd
import com.unified.health.core.domain.usecase.hasKidsItems
import com.unified.health.core.domain.usecase.matchesColorFamilies
import com.unified.health.core.domain.usecase.matchesGenderFilter
import com.unified.health.core.domain.usecase.matchesPriceRange
import com.unified.health.core.model.GearCategory
import com.unified.health.core.model.GearGender
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

    /**
     * [items] is the catalog after category + price + color + gender all applied. [priceBoundsVnd],
     * [availableColorFamilies] and [hasKidsAvailable] are deliberately computed from the
     * category-filtered set *before* price/color/gender are applied (D-1203; gender joined the same
     * way, gender-filter task 2026-11-12) — so switching a color/gender on/off, or dragging the price
     * slider, never makes another chip/bound in the still-open bottom sheet disappear out from under
     * the user; only changing the category chip (a bigger, separate gesture) recomputes them.
     */
    data class Success(
        val items: List<GearCardDisplay>,
        val categoryFilter: GearCategory?,
        val priceRangeFilter: LongRange?,
        val priceBoundsVnd: LongRange?,
        val colorFilter: Set<ColorFamily>,
        val availableColorFamilies: List<GearColorFamilyCount>,
        /** Gender filter (gender-filter task, 2026-11-12): single-select, like [categoryFilter] — but
         *  (unlike category) counted in [activeFilterCount] since its chips live in the sheet, not an
         *  always-visible row of their own (brief). */
        val genderFilter: GearGender?,
        /** Computed from the category-filtered set, same [priceBoundsVnd]/[availableColorFamilies]
         *  rationale — the sheet's "Trẻ em" chip only ever appears when this is true, and does not
         *  flicker away just because a price/color filter happens to currently hide every kids item. */
        val hasKidsAvailable: Boolean,
    ) : GearUiState {
        /** Drives the "Lọc" button's badge — category has its own always-visible chip row, so it's
         *  deliberately not counted as one of "the filters" here. */
        val activeFilterCount: Int get() = (if (priceRangeFilter != null) 1 else 0) + colorFilter.size + (if (genderFilter != null) 1 else 0)
    }
}

/**
 * D-1209 (on-device review, gear-grid performance for large catalogs — 486+ items): everything
 * `GearCard` (`GearScreen.kt`) needs to render one grid cell, with the color-filter-aware "which
 * variant's image to show" lookup ([GearItem.firstVariantMatchingColorFamilies]) already resolved
 * here in [GearViewModel.buildSuccess] — once per item per state emission — instead of inside the
 * grid's own item composable, where it used to re-run for every *visible* card on every recomposition
 * of the grid (not just when [GearUiState.Success.colorFilter] itself changed). Every field is a
 * primitive/[String]/nullable-of-those, so the Compose compiler infers this as stable on its own —
 * unlike [GearItem] (whose `variants: List<GearVariant>` field makes it compiler-unstable), this type
 * is safe to key a `LazyVerticalGrid` item's parameters on without extra `@Immutable` plumbing.
 */
data class GearCardDisplay(
    val id: String,
    val brand: String,
    val name: String,
    val priceVnd: Long?,
    val displayImageUrl: String?,
    /** The variant the detail screen should preselect — null opens on the item's own default. */
    val displayVariantColor: String?,
)

private const val KEY_CATEGORY = "gear_category_filter"
private const val KEY_COLOR_FAMILIES = "gear_color_filter"
private const val KEY_PRICE_MIN_VND = "gear_price_min_vnd"
private const val KEY_PRICE_MAX_VND = "gear_price_max_vnd"
private const val KEY_GENDER = "gear_gender_filter"

/**
 * "Trang bị tham khảo" (reference gear) list — mirrors
 * [com.unified.health.feature.races.RacesViewModel]'s own shape: category/price/color/gender filters
 * all applied in the UI layer on top of [GearRepository]'s already-parsed state.
 *
 * D-1203: every filter (category + the price/color ones; gender joined the same way, gender-filter
 * task 2026-11-12) is [SavedStateHandle]-backed via [SavedStateHandle.getStateFlow] rather than a
 * plain [MutableStateFlow], so re-opening the screen after a process death (the bottom sheet, chips,
 * slider position) comes back exactly as the user left it — same rationale as every other
 * `*DetailViewModel`'s route-arg handling in this module, just applied to filter state instead of a
 * nav arg. [GearCategory], `Set<`[ColorFamily]`>` and [GearGender] are all plain JVM `Serializable`
 * (every Kotlin `enum class`/[HashSet] is), so they're storable as-is; no manual (de)serialization to
 * `String`/`Bundle` primitives is needed.
 */
@HiltViewModel
class GearViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle,
    private val gearRepository: GearRepository,
) : ViewModel() {

    private val categoryFilter: StateFlow<GearCategory?> = savedStateHandle.getStateFlow(KEY_CATEGORY, null)
    private val colorFilter: StateFlow<Set<ColorFamily>> = savedStateHandle.getStateFlow(KEY_COLOR_FAMILIES, emptySet())
    private val priceMinVnd: StateFlow<Long?> = savedStateHandle.getStateFlow(KEY_PRICE_MIN_VND, null)
    private val priceMaxVnd: StateFlow<Long?> = savedStateHandle.getStateFlow(KEY_PRICE_MAX_VND, null)
    private val genderFilter: StateFlow<GearGender?> = savedStateHandle.getStateFlow(KEY_GENDER, null)

    val uiState: StateFlow<GearUiState> = combine(
        gearRepository.items,
        categoryFilter,
        colorFilter,
        // Gender-filter task, 2026-11-12: nested rather than adding a 6th flow to the outer `combine`
        // (kotlinx.coroutines only has typed overloads up to 5 flows) — price min/max + gender collapse
        // into one `Triple` flow first, keeping the outer `combine` at a type-safe 4.
        combine(priceMinVnd, priceMaxVnd, genderFilter, ::Triple),
    ) { state, category, colors, (priceMin, priceMax, gender) ->
        when (state) {
            GearState.Loading -> GearUiState.Loading
            is GearState.Error -> GearUiState.Error(state.message)
            GearState.Empty -> GearUiState.Empty
            is GearState.Success -> buildSuccess(state.items, category, colors, priceMin, priceMax, gender)
        }
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), GearUiState.Loading)

    private val _isRefreshing = MutableStateFlow(false)
    val isRefreshing: StateFlow<Boolean> = _isRefreshing.asStateFlow()

    private fun buildSuccess(
        allItems: List<GearItem>,
        category: GearCategory?,
        colors: Set<ColorFamily>,
        priceMinVnd: Long?,
        priceMaxVnd: Long?,
        gender: GearGender?,
    ): GearUiState.Success {
        val categoryItems = allItems.filter { category == null || it.category == category }
        val priceRange = if (priceMinVnd != null && priceMaxVnd != null) priceMinVnd..priceMaxVnd else null
        val filtered = categoryItems.filter {
            it.matchesPriceRange(priceRange) && it.matchesColorFamilies(colors) && it.matchesGenderFilter(gender)
        }
        val display = filtered.map { item ->
            val matchedVariant = item.firstVariantMatchingColorFamilies(colors)
            GearCardDisplay(
                id = item.id,
                brand = item.brand,
                name = item.name,
                priceVnd = item.priceVnd,
                displayImageUrl = matchedVariant?.imageUrl ?: item.imageUrl,
                displayVariantColor = matchedVariant?.color,
            )
        }
        return GearUiState.Success(
            items = display,
            categoryFilter = category,
            priceRangeFilter = priceRange,
            priceBoundsVnd = categoryItems.gearPriceBoundsVnd(),
            colorFilter = colors,
            availableColorFamilies = categoryItems.gearColorFamilyCounts(),
            genderFilter = gender,
            hasKidsAvailable = categoryItems.hasKidsItems(),
        )
    }

    fun setCategoryFilter(category: GearCategory?) {
        savedStateHandle[KEY_CATEGORY] = category
    }

    /** Sets both the RangeSlider and the quick-preset chips (brief: they resolve to the same single
     *  filter value) — null clears the price filter entirely. */
    fun setPriceRangeFilter(range: LongRange?) {
        savedStateHandle[KEY_PRICE_MIN_VND] = range?.first
        savedStateHandle[KEY_PRICE_MAX_VND] = range?.last
    }

    /** Multi-select: adds [family] if absent, removes it if already selected. */
    fun toggleColorFamily(family: ColorFamily) {
        val current = colorFilter.value
        savedStateHandle[KEY_COLOR_FAMILIES] = if (family in current) current - family else current + family
    }

    fun removeColorFamily(family: ColorFamily) {
        savedStateHandle[KEY_COLOR_FAMILIES] = colorFilter.value - family
    }

    /** Single-select, like [setCategoryFilter] — null ("Tất cả") clears it. */
    fun setGenderFilter(gender: GearGender?) {
        savedStateHandle[KEY_GENDER] = gender
    }

    /** "Xoá lọc" (sheet) / the empty-state's clear action — resets price + color + gender only; the
     *  category chip row already has its own "Tất cả" to reset itself. */
    fun clearFilters() {
        savedStateHandle[KEY_PRICE_MIN_VND] = null
        savedStateHandle[KEY_PRICE_MAX_VND] = null
        savedStateHandle[KEY_COLOR_FAMILIES] = emptySet<ColorFamily>()
        savedStateHandle[KEY_GENDER] = null
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
