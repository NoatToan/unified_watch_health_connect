package com.unified.health.feature.gear

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items as rowItems
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.pulltorefresh.PullToRefreshBox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.style.TextOverflow
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.unified.health.core.designsystem.component.EmptyState
import com.unified.health.core.designsystem.component.ErrorState
import com.unified.health.core.designsystem.component.GearImage
import com.unified.health.core.designsystem.component.LoadingState
import com.unified.health.core.designsystem.component.formatVnd
import com.unified.health.core.designsystem.theme.ChromeRipple
import com.unified.health.core.designsystem.theme.Spacing
import com.unified.health.core.model.GearCategory
import com.unified.health.core.model.GearItem

@Composable
internal fun GearRoute(onBack: () -> Unit, onOpenGearDetail: (String) -> Unit, viewModel: GearViewModel = hiltViewModel()) {
    val state by viewModel.uiState.collectAsStateWithLifecycle()
    val refreshing by viewModel.isRefreshing.collectAsStateWithLifecycle()
    GearScreen(
        state = state,
        isRefreshing = refreshing,
        onRefresh = viewModel::refresh,
        onBack = onBack,
        onOpenGearDetail = onOpenGearDetail,
        onCategoryFilterChange = viewModel::setCategoryFilter,
    )
}

/**
 * "Trang bị tham khảo" — a read-only browse of running gear (shoes/apparel/accessories) from real
 * brands, pushed from Profile. Mirrors `RacesScreen`'s own shape (category chips + pull-to-refresh +
 * Loading/Empty/Error states), a grid instead of a one-column list since each card is mostly a
 * product photo. Tapping a card opens [onOpenGearDetail] (a pushed detail screen, same pattern as
 * `RaceDetailScreen`) where the color-variant picker and the actual link-out live.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun GearScreen(
    state: GearUiState,
    isRefreshing: Boolean,
    onRefresh: () -> Unit,
    onBack: () -> Unit,
    onOpenGearDetail: (String) -> Unit,
    onCategoryFilterChange: (GearCategory?) -> Unit,
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Trang bị tham khảo") },
                // D-1189: app chrome, not this screen's own content — restores the normal ripple.
                navigationIcon = { ChromeRipple { IconButton(onClick = onBack) { Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back") } } },
            )
        },
    ) { padding ->
        when (state) {
            GearUiState.Loading -> LoadingState(Modifier.padding(padding))
            is GearUiState.Error -> ErrorState(state.message, Modifier.padding(padding), onRetry = onRefresh)
            GearUiState.Empty -> EmptyState(
                title = "Chưa có trang bị nào",
                message = "Danh mục trang bị đang được cập nhật, quay lại sau nhé.",
                modifier = Modifier.padding(padding),
                actionLabel = "Thử lại",
                onAction = onRefresh,
            )
            is GearUiState.Success -> PullToRefreshBox(
                isRefreshing = isRefreshing,
                onRefresh = onRefresh,
                modifier = Modifier.fillMaxSize().padding(padding),
            ) {
                Column(Modifier.fillMaxSize()) {
                    CategoryFilterRow(
                        selected = state.categoryFilter,
                        onSelect = onCategoryFilterChange,
                        modifier = Modifier.testTag("gear_filter_category"),
                    )
                    if (state.items.isEmpty()) {
                        EmptyState(
                            title = "Không có trang bị khớp bộ lọc",
                            message = "Thử chọn danh mục khác.",
                            modifier = Modifier.fillMaxWidth().padding(horizontal = Spacing.lg),
                        )
                    } else {
                        LazyVerticalGrid(
                            columns = GridCells.Fixed(2),
                            modifier = Modifier.fillMaxSize().testTag("gear_grid"),
                            contentPadding = PaddingValues(start = Spacing.lg, top = Spacing.sm, end = Spacing.lg, bottom = Spacing.lg),
                            horizontalArrangement = Arrangement.spacedBy(Spacing.md),
                            verticalArrangement = Arrangement.spacedBy(Spacing.md),
                        ) {
                            items(state.items, key = { it.id }) { item ->
                                GearCard(item = item, onClick = { onOpenGearDetail(item.id) }, modifier = Modifier.testTag("gear_card_${item.id}"))
                            }
                        }
                    }
                }
            }
        }
    }
}

/** "Tất cả" (= null, clears the filter) plus one chip per [GearCategory], single-select — same
 *  pattern as `RacesScreen`'s own `FilterChipRow`. */
@Composable
private fun CategoryFilterRow(selected: GearCategory?, onSelect: (GearCategory?) -> Unit, modifier: Modifier = Modifier) {
    LazyRow(
        modifier = modifier.fillMaxWidth(),
        contentPadding = PaddingValues(horizontal = Spacing.lg, vertical = Spacing.sm),
        horizontalArrangement = Arrangement.spacedBy(Spacing.xs),
    ) {
        rowItems(listOf(null) + GearCategory.entries) { category ->
            FilterChip(
                selected = selected == category,
                onClick = { onSelect(category) },
                label = { Text(category.label()) },
                modifier = Modifier.testTag("gear_filter_${category?.name ?: "ALL"}"),
            )
        }
    }
}

private fun GearCategory?.label(): String = when (this) {
    null -> "Tất cả"
    GearCategory.SHOES -> "Giày"
    GearCategory.APPAREL -> "Quần áo"
    GearCategory.ACCESSORIES -> "Phụ kiện"
}

/** One card in [GearScreen]'s grid: image, name, brand, price, category — tapping opens the detail
 *  screen where the color-variant picker and link-out CTA live. */
@Composable
private fun GearCard(item: GearItem, onClick: () -> Unit, modifier: Modifier = Modifier) {
    Card(onClick = onClick, modifier = modifier.fillMaxWidth()) {
        GearImage(item.imageUrl, Modifier.fillMaxWidth().aspectRatio(1f))
        Column(Modifier.padding(Spacing.md), verticalArrangement = Arrangement.spacedBy(Spacing.xxs)) {
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
