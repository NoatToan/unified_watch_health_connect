package com.unified.health.feature.gear

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items as rowItems
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.outlined.FilterList
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.InputChip
import androidx.compose.material3.InputChipDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.RangeSlider
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.VerticalDivider
import androidx.compose.material3.pulltorefresh.PullToRefreshBox
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.unified.health.core.designsystem.component.AppScreen
import com.unified.health.core.designsystem.component.ChipRow
import com.unified.health.core.designsystem.component.EmptyState
import com.unified.health.core.designsystem.component.ErrorState
import com.unified.health.core.designsystem.component.GearImage
import com.unified.health.core.designsystem.component.LoadingState
import com.unified.health.core.designsystem.component.formatVnd
import com.unified.health.core.designsystem.theme.ChromeRipple
import com.unified.health.core.designsystem.theme.Gaps
import com.unified.health.core.designsystem.theme.Spacing
import com.unified.health.core.domain.usecase.ColorFamily
import com.unified.health.core.domain.usecase.GearColorFamilyCount
import com.unified.health.core.domain.usecase.GearPricePreset
import com.unified.health.core.domain.usecase.toRangeVnd
import com.unified.health.core.model.GearCategory
import com.unified.health.core.model.GearGender

@Composable
internal fun GearRoute(onBack: () -> Unit, onOpenGearDetail: (String, String?) -> Unit, viewModel: GearViewModel = hiltViewModel()) {
    val state by viewModel.uiState.collectAsStateWithLifecycle()
    val refreshing by viewModel.isRefreshing.collectAsStateWithLifecycle()
    GearScreen(
        state = state,
        isRefreshing = refreshing,
        onRefresh = viewModel::refresh,
        onBack = onBack,
        onOpenGearDetail = onOpenGearDetail,
        onCategoryFilterChange = viewModel::setCategoryFilter,
        onPriceRangeChange = viewModel::setPriceRangeFilter,
        onToggleColorFamily = viewModel::toggleColorFamily,
        onRemoveColorFamily = viewModel::removeColorFamily,
        onGenderFilterChange = viewModel::setGenderFilter,
        onClearFilters = viewModel::clearFilters,
    )
}

/**
 * "Trang bị tham khảo" — a read-only browse of running gear (shoes/apparel/accessories) from real
 * brands, pushed from Profile. Mirrors `RacesScreen`'s own shape (category chips + pull-to-refresh +
 * Loading/Empty/Error states), a grid instead of a one-column list since each card is mostly a
 * product photo. Tapping a card opens [onOpenGearDetail] (a pushed detail screen, same pattern as
 * `RaceDetailScreen`) where the color-variant picker and the actual link-out live.
 *
 * D-1203: price + color filtering on top of the existing category chips (gender joined the same way,
 * gender-filter task 2026-11-12) — a "Lọc" button (badged with [GearUiState.Success.activeFilterCount])
 * opens [GearFilterSheet]; active price/color/gender filters also surface as removable chips, merged
 * into the same always-visible row as the category chips ([GearChipRow] — chip-row-vertical-gap task,
 * 2026-11-12; was two separately-padded rows before, `CategoryFilterRow` + `ActiveFilterChipsRow`,
 * whose vertical insets stacked into a visibly oversized gap between them, see [ChipRow]'s own KDoc).
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun GearScreen(
    state: GearUiState,
    isRefreshing: Boolean,
    onRefresh: () -> Unit,
    onBack: () -> Unit,
    onOpenGearDetail: (String, String?) -> Unit,
    onCategoryFilterChange: (GearCategory?) -> Unit,
    onPriceRangeChange: (LongRange?) -> Unit,
    onToggleColorFamily: (ColorFamily) -> Unit,
    onRemoveColorFamily: (ColorFamily) -> Unit,
    onGenderFilterChange: (GearGender?) -> Unit,
    onClearFilters: () -> Unit,
) {
    var showFilterSheet by rememberSaveable { mutableStateOf(false) }
    val activeFilterCount = (state as? GearUiState.Success)?.activeFilterCount ?: 0

    AppScreen(
        title = "Trang bị tham khảo",
        onBack = onBack,
        actions = {
            // D-1189: this IconButton sits in the TopAppBar's own `actions` slot — app chrome, not
            // this screen's content — so it opts back into the normal ripple with ChromeRipple,
            // same treatment as AppScreen's own back icon.
            ChromeRipple {
                IconButton(onClick = { showFilterSheet = true }, modifier = Modifier.testTag("gear_filter_button")) {
                    BadgedBox(badge = { if (activeFilterCount > 0) Badge { Text(activeFilterCount.toString()) } }) {
                        Icon(Icons.Outlined.FilterList, contentDescription = "Lọc")
                    }
                }
            }
        },
    ) { contentPadding ->
        when (state) {
            GearUiState.Loading -> LoadingState(Modifier.padding(contentPadding))
            is GearUiState.Error -> ErrorState(state.message, Modifier.padding(contentPadding), onRetry = onRefresh)
            GearUiState.Empty -> EmptyState(
                title = "Chưa có trang bị nào",
                message = "Danh mục trang bị đang được cập nhật, quay lại sau nhé.",
                modifier = Modifier.padding(contentPadding),
                actionLabel = "Thử lại",
                onAction = onRefresh,
            )
            is GearUiState.Success -> PullToRefreshBox(
                isRefreshing = isRefreshing,
                onRefresh = onRefresh,
                // D-1194: only the top inset goes on this outer Box (GearChipRow, the first child,
                // doesn't scroll so it needs its own top clearance below the app bar) — bottom flows
                // into the grid's own trailing contentPadding below instead, so the grid itself
                // extends the full remaining height and scrolls behind the gesture bar.
                modifier = Modifier.fillMaxSize().padding(top = contentPadding.calculateTopPadding()),
            ) {
                Column(Modifier.fillMaxSize()) {
                    GearChipRow(
                        state = state,
                        onCategorySelect = onCategoryFilterChange,
                        onRemovePriceRange = { onPriceRangeChange(null) },
                        onRemoveColorFamily = onRemoveColorFamily,
                        onRemoveGender = { onGenderFilterChange(null) },
                        modifier = Modifier.testTag("gear_filter_category"),
                    )
                    if (state.items.isEmpty()) {
                        EmptyState(
                            title = "Không có trang bị khớp bộ lọc",
                            message = if (state.activeFilterCount > 0) {
                                "Thử bỏ bớt bộ lọc giá/màu/giới tính hoặc chọn danh mục khác."
                            } else {
                                "Thử chọn danh mục khác."
                            },
                            modifier = Modifier.fillMaxWidth().padding(horizontal = Gaps.screenHorizontal),
                            actionLabel = if (state.activeFilterCount > 0) "Xoá lọc" else null,
                            onAction = onClearFilters,
                        )
                    } else {
                        LazyVerticalGrid(
                            columns = GridCells.Fixed(2),
                            modifier = Modifier.fillMaxSize().testTag("gear_grid"),
                            // D-1204: top = 0 — GearChipRow above already ends in its own
                            // Gaps.chipRowVertical bottom inset, so adding another gap here would stack
                            // two gaps into one that reads as too large (the user's "below the chips,
                            // too large" feedback). bottom keeps its own trailing clearance.
                            contentPadding = PaddingValues(
                                start = Gaps.screenHorizontal,
                                top = 0.dp,
                                end = Gaps.screenHorizontal,
                                bottom = contentPadding.calculateBottomPadding() + Gaps.sectionGap,
                            ),
                            horizontalArrangement = Arrangement.spacedBy(Gaps.gridGap),
                            verticalArrangement = Arrangement.spacedBy(Gaps.gridGap),
                        ) {
                            // Gear-grid-perf task, 2026-11-12: stable key (already present) + an
                            // explicit contentType — every cell here is the same shape today, but a
                            // grid this size (486+ items) still benefits from Compose never having to
                            // guess at reusing a departing node's layout for an incoming one of a
                            // different kind, and it costs nothing to say so explicitly.
                            items(state.items, key = { it.id }, contentType = { GEAR_CARD_CONTENT_TYPE }) { item ->
                                GearCard(
                                    item = item,
                                    onClick = { onOpenGearDetail(item.id, item.displayVariantColor) },
                                    modifier = Modifier.testTag("gear_card_${item.id}"),
                                )
                            }
                        }
                    }
                }
            }
        }
        if (showFilterSheet && state is GearUiState.Success) {
            GearFilterSheet(
                state = state,
                onDismiss = { showFilterSheet = false },
                onPriceRangeChange = onPriceRangeChange,
                onToggleColorFamily = onToggleColorFamily,
                onGenderFilterChange = onGenderFilterChange,
                onClearFilters = onClearFilters,
            )
        }
    }
}

private const val GEAR_CARD_CONTENT_TYPE = "gear_card"

/**
 * The category chips, an active-filter separator, and every removable active-filter chip
 * (price/color/gender), merged into one horizontally scrolling [ChipRow] (chip-row-vertical-gap task,
 * 2026-11-12) — was two stacked rows (`CategoryFilterRow` + `ActiveFilterChipsRow`) with their own
 * vertical insets, which compounded into a visibly too-large gap below the app bar and between the
 * two rows; see [ChipRow]'s own KDoc for the full root cause (Material3's per-chip invisible
 * touch-target padding, not just [Gaps.chipRowVertical] itself).
 */
@Composable
private fun GearChipRow(
    state: GearUiState.Success,
    onCategorySelect: (GearCategory?) -> Unit,
    onRemovePriceRange: () -> Unit,
    onRemoveColorFamily: (ColorFamily) -> Unit,
    onRemoveGender: () -> Unit,
    modifier: Modifier = Modifier,
) {
    ChipRow(
        modifier = modifier,
        contentPadding = PaddingValues(horizontal = Gaps.screenHorizontal, vertical = Gaps.chipRowVertical),
    ) {
        rowItems(listOf(null) + GearCategory.entries) { category ->
            FilterChip(
                selected = state.categoryFilter == category,
                onClick = { onCategorySelect(category) },
                label = { Text(category.label()) },
                modifier = Modifier.testTag("gear_filter_${category?.name ?: "ALL"}"),
            )
        }
        if (state.activeFilterCount > 0) {
            item {
                VerticalDivider(Modifier.height(Spacing.xl))
            }
            state.priceRangeFilter?.let { range ->
                item {
                    InputChip(
                        selected = false,
                        onClick = onRemovePriceRange,
                        label = { Text("${formatVnd(range.first)} - ${formatVnd(range.last)}") },
                        trailingIcon = { Icon(Icons.Filled.Close, contentDescription = "Bỏ lọc giá", modifier = Modifier.size(InputChipDefaults.IconSize)) },
                        modifier = Modifier.testTag("gear_active_filter_price"),
                    )
                }
            }
            rowItems(state.colorFilter.toList()) { family ->
                InputChip(
                    selected = false,
                    onClick = { onRemoveColorFamily(family) },
                    label = { Text(family.label()) },
                    leadingIcon = { ColorSwatch(family, size = Spacing.lg) },
                    trailingIcon = { Icon(Icons.Filled.Close, contentDescription = "Bỏ lọc ${family.label()}", modifier = Modifier.size(InputChipDefaults.IconSize)) },
                    modifier = Modifier.testTag("gear_active_filter_color_${family.name}"),
                )
            }
            state.genderFilter?.let { gender ->
                item {
                    InputChip(
                        selected = false,
                        onClick = onRemoveGender,
                        label = { Text(gender.sheetLabel()) },
                        trailingIcon = { Icon(Icons.Filled.Close, contentDescription = "Bỏ lọc ${gender.sheetLabel()}", modifier = Modifier.size(InputChipDefaults.IconSize)) },
                        modifier = Modifier.testTag("gear_active_filter_gender"),
                    )
                }
            }
        }
    }
}

private fun GearCategory?.label(): String = when (this) {
    null -> "Tất cả"
    GearCategory.SHOES -> "Giày"
    GearCategory.APPAREL -> "Quần áo"
    GearCategory.ACCESSORIES -> "Phụ kiện"
}

/** Gender filter (gender-filter task, 2026-11-12): the sheet's "Giới tính" section chips and the
 *  merged [GearChipRow]'s removable gender chip share this one label mapping. [GearGender.UNISEX]
 *  is not itself a selectable sheet chip (brief only lists Nam/Nữ/Trẻ em) but still needs a label for
 *  exhaustiveness/future-proofing. */
private fun GearGender?.sheetLabel(): String = when (this) {
    null -> "Tất cả"
    GearGender.MEN -> "Nam"
    GearGender.WOMEN -> "Nữ"
    GearGender.KIDS -> "Trẻ em"
    GearGender.UNISEX -> "Unisex"
}

/**
 * One card in [GearScreen]'s grid: image, name, brand, price — tapping opens the detail screen where
 * the color-variant picker and link-out CTA live. [item] is already the fully resolved display data
 * (gear-grid-perf task, 2026-11-12: [GearCardDisplay]'s own KDoc) — no per-item color-filter lookup
 * runs here anymore, it was precomputed once in [GearViewModel.buildSuccess].
 */
@Composable
private fun GearCard(item: GearCardDisplay, onClick: () -> Unit, modifier: Modifier = Modifier) {
    Card(onClick = onClick, modifier = modifier.fillMaxWidth()) {
        GearImage(item.displayImageUrl, Modifier.fillMaxWidth().aspectRatio(1f))
        Column(Modifier.padding(Gaps.cardPadding), verticalArrangement = Arrangement.spacedBy(Gaps.cardContentGap)) {
            Text(item.brand, style = MaterialTheme.typography.labelMedium, color = MaterialTheme.colorScheme.primary)
            Text(
                item.name,
                style = MaterialTheme.typography.bodyMedium,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
            )
            item.priceVnd?.let {
                Text(formatVnd(it), style = MaterialTheme.typography.titleSmall)
            }
        }
    }
}

/**
 * D-1203 decision 3: price (presets + RangeSlider) and color (swatches, multi-select) filters.
 * Every change applies straight to the ViewModel's already-live state (no separate "pending" draft
 * the way the "Áp dụng" label might suggest) — so the sheet's own color-family counts/chips are
 * always showing the truth, and "Áp dụng" only needs to close the sheet; "Xoá lọc" resets both.
 *
 * Bug fix (on-device review, 2026-11-12, D-1207): the action row used to be two plain, left-aligned
 * `TextButton`s — easy to miss as the sheet's primary action, and with no visual weight difference
 * between "commit" and "reset". "Áp dụng" is now a filled primary `Button` with `Modifier.weight(1f)`
 * (the obvious, full-width-feeling default action of a bottom sheet), "Xoá lọc" a fixed-width
 * `OutlinedButton` beside it — already sitting at the sheet's bottom via the `Column`'s own
 * `navigationBarsPadding()` + bottom `Gaps.sheetPadding` above (unchanged).
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun GearFilterSheet(
    state: GearUiState.Success,
    onDismiss: () -> Unit,
    onPriceRangeChange: (LongRange?) -> Unit,
    onToggleColorFamily: (ColorFamily) -> Unit,
    onGenderFilterChange: (GearGender?) -> Unit,
    onClearFilters: () -> Unit,
) {
    val sheetState = rememberModalBottomSheetState()
    ModalBottomSheet(onDismissRequest = onDismiss, sheetState = sheetState, modifier = Modifier.testTag("gear_filter_sheet")) {
        Column(
            modifier = Modifier.fillMaxWidth().navigationBarsPadding().padding(horizontal = Gaps.sheetPadding).padding(bottom = Gaps.sheetPadding),
            verticalArrangement = Arrangement.spacedBy(Gaps.sectionGap),
        ) {
            state.priceBoundsVnd?.let { bounds ->
                PriceFilterSection(bounds = bounds, selected = state.priceRangeFilter, onPriceRangeChange = onPriceRangeChange)
            }
            if (state.availableColorFamilies.isNotEmpty()) {
                ColorFilterSection(
                    families = state.availableColorFamilies,
                    selected = state.colorFilter,
                    onToggle = onToggleColorFamily,
                )
            }
            GenderFilterSection(
                selected = state.genderFilter,
                hasKidsAvailable = state.hasKidsAvailable,
                onSelect = onGenderFilterChange,
            )
            Row(horizontalArrangement = Arrangement.spacedBy(Spacing.sm)) {
                OutlinedButton(onClick = onClearFilters, modifier = Modifier.testTag("gear_filter_clear")) {
                    Text("Xoá lọc")
                }
                Button(
                    onClick = onDismiss,
                    modifier = Modifier.weight(1f).testTag("gear_filter_apply"),
                ) {
                    Text("Áp dụng")
                }
            }
        }
    }
}

@Composable
private fun PriceFilterSection(bounds: LongRange, selected: LongRange?, onPriceRangeChange: (LongRange?) -> Unit) {
    Column(verticalArrangement = Arrangement.spacedBy(Gaps.itemGap)) {
        Text("Giá", style = MaterialTheme.typography.titleSmall)
        FlowRow(horizontalArrangement = Arrangement.spacedBy(Gaps.chipGap), verticalArrangement = Arrangement.spacedBy(Gaps.chipGap)) {
            GearPricePreset.entries.forEach { preset ->
                val presetRange = preset.toRangeVnd(bounds.last)
                FilterChip(
                    selected = selected == presetRange,
                    onClick = { onPriceRangeChange(if (selected == presetRange) null else presetRange) },
                    label = { Text(preset.label()) },
                    modifier = Modifier.testTag("gear_price_preset_${preset.name}"),
                )
            }
        }
        val current = selected ?: bounds
        Text(
            "${formatVnd(current.first)} - ${formatVnd(current.last)}",
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
        )
        if (bounds.first < bounds.last) {
            RangeSlider(
                value = current.first.toFloat()..current.last.toFloat(),
                onValueChange = { onPriceRangeChange(it.start.toLong()..it.endInclusive.toLong()) },
                valueRange = bounds.first.toFloat()..bounds.last.toFloat(),
                modifier = Modifier.fillMaxWidth().testTag("gear_price_range_slider"),
            )
        }
    }
}

private fun GearPricePreset.label(): String = when (this) {
    GearPricePreset.UNDER_500K -> "< 500k"
    GearPricePreset.FROM_500K_TO_1M -> "500k - 1tr"
    GearPricePreset.FROM_1M_TO_2M -> "1tr - 2tr"
    GearPricePreset.FROM_2M_TO_3M -> "2tr - 3tr"
    GearPricePreset.OVER_3M -> "> 3tr"
}

@Composable
private fun ColorFilterSection(families: List<GearColorFamilyCount>, selected: Set<ColorFamily>, onToggle: (ColorFamily) -> Unit) {
    Column(verticalArrangement = Arrangement.spacedBy(Gaps.itemGap)) {
        Text("Màu sắc", style = MaterialTheme.typography.titleSmall)
        FlowRow(horizontalArrangement = Arrangement.spacedBy(Gaps.chipGap), verticalArrangement = Arrangement.spacedBy(Gaps.chipGap)) {
            families.forEach { (family, count) ->
                ColorFamilyChip(
                    family = family,
                    count = count,
                    isSelected = family in selected,
                    onClick = { onToggle(family) },
                )
            }
        }
    }
}

/**
 * Gender filter (gender-filter task, 2026-11-12): single-select, same "Tất cả clears it" convention
 * as the always-visible category row — "Trẻ em" only ever shows up when [hasKidsAvailable] is true
 * (brief: the live feed has no kids items at all today, [GearGender.KIDS] exists purely as a fallback-
 * classifier outcome for names like "Giày chạy bộ trẻ em ...", so showing an always-empty "Trẻ em"
 * chip would be worse than not offering it).
 */
@Composable
private fun GenderFilterSection(selected: GearGender?, hasKidsAvailable: Boolean, onSelect: (GearGender?) -> Unit) {
    Column(verticalArrangement = Arrangement.spacedBy(Gaps.itemGap)) {
        Text("Giới tính", style = MaterialTheme.typography.titleSmall)
        FlowRow(horizontalArrangement = Arrangement.spacedBy(Gaps.chipGap), verticalArrangement = Arrangement.spacedBy(Gaps.chipGap)) {
            val options = buildList {
                add(null)
                add(GearGender.MEN)
                add(GearGender.WOMEN)
                if (hasKidsAvailable) add(GearGender.KIDS)
            }
            options.forEach { gender ->
                FilterChip(
                    selected = selected == gender,
                    onClick = { onSelect(gender) },
                    label = { Text(gender.sheetLabel()) },
                    modifier = Modifier.testTag("gear_filter_gender_${gender?.name ?: "ALL"}"),
                )
            }
        }
    }
}

@Composable
private fun ColorFamilyChip(family: ColorFamily, count: Int, isSelected: Boolean, onClick: () -> Unit) {
    FilterChip(
        selected = isSelected,
        onClick = onClick,
        leadingIcon = { ColorSwatch(family, size = Spacing.lg) },
        label = { Text("${family.label()} ($count)") },
        modifier = Modifier.testTag("gear_color_filter_${family.name}"),
    )
}

/** A small round swatch standing in for [family] — [ColorFamily.MULTI] gets a multi-color gradient
 *  instead of one flat color, since it represents an all-over-print/mixed item, not one hue. Always
 *  outlined, since [ColorFamily.WHITE]'s own swatch would otherwise vanish against a light surface. */
@Composable
private fun ColorSwatch(family: ColorFamily, size: Dp) {
    val shape = Modifier.size(size).clip(CircleShape)
    val filled = if (family == ColorFamily.MULTI) shape.background(MultiColorBrush) else shape.background(family.swatchColor())
    Box(modifier = filled.border(SwatchBorderWidth, MaterialTheme.colorScheme.outlineVariant, CircleShape))
}

private val SwatchBorderWidth = 1.dp

private val MultiColorBrush = Brush.sweepGradient(
    listOf(Color(0xFFE53935), Color(0xFFFDD835), Color(0xFF43A047), Color(0xFF1E88E5), Color(0xFF8E24AA), Color(0xFFE53935)),
)

private fun ColorFamily.label(): String = when (this) {
    ColorFamily.BLACK -> "Đen"
    ColorFamily.WHITE -> "Trắng"
    ColorFamily.GREY -> "Xám"
    ColorFamily.BLUE -> "Xanh dương"
    ColorFamily.GREEN -> "Xanh lá"
    ColorFamily.RED -> "Đỏ"
    ColorFamily.PINK -> "Hồng"
    ColorFamily.ORANGE -> "Cam"
    ColorFamily.YELLOW -> "Vàng"
    ColorFamily.PURPLE -> "Tím"
    ColorFamily.BROWN_BEIGE -> "Nâu/Be"
    ColorFamily.MULTI -> "Nhiều màu"
}

private fun ColorFamily.swatchColor(): Color = when (this) {
    ColorFamily.BLACK -> Color(0xFF1C1C1C)
    ColorFamily.WHITE -> Color(0xFFF5F5F5)
    ColorFamily.GREY -> Color(0xFF9E9E9E)
    ColorFamily.BLUE -> Color(0xFF1E88E5)
    ColorFamily.GREEN -> Color(0xFF43A047)
    ColorFamily.RED -> Color(0xFFE53935)
    ColorFamily.PINK -> Color(0xFFEC407A)
    ColorFamily.ORANGE -> Color(0xFFFB8C00)
    ColorFamily.YELLOW -> Color(0xFFFDD835)
    ColorFamily.PURPLE -> Color(0xFF8E24AA)
    ColorFamily.BROWN_BEIGE -> Color(0xFFA1887F)
    ColorFamily.MULTI -> Color.Transparent
}
