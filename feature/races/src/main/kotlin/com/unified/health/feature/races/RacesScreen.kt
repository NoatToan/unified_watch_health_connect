package com.unified.health.feature.races

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.Text
import androidx.compose.material3.pulltorefresh.PullToRefreshBox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.unified.health.core.designsystem.component.AppScreen
import com.unified.health.core.designsystem.component.EmptyState
import com.unified.health.core.designsystem.component.ErrorState
import com.unified.health.core.designsystem.component.LoadingState
import com.unified.health.core.designsystem.component.RaceCard
import com.unified.health.core.designsystem.theme.Gaps
import java.time.YearMonth
import java.time.format.DateTimeFormatter
import java.util.Locale

@Composable
internal fun RacesRoute(onBack: () -> Unit, onOpenRaceDetail: (String) -> Unit, viewModel: RacesViewModel = hiltViewModel()) {
    val state by viewModel.uiState.collectAsStateWithLifecycle()
    val refreshing by viewModel.isRefreshing.collectAsStateWithLifecycle()
    RacesScreen(
        state = state,
        isRefreshing = refreshing,
        onRefresh = viewModel::refresh,
        onBack = onBack,
        onOpenRaceDetail = onOpenRaceDetail,
        onProvinceFilterChange = viewModel::setProvinceFilter,
        onMonthFilterChange = viewModel::setMonthFilter,
        onShowPastChange = viewModel::setShowPast,
    )
}

/**
 * Full "Giải chạy sắp tới" list (docs/DECISIONS.md D-1105), with province/month filters and a
 * "Đã diễn ra" (show past) toggle on top (D-1113) — using the exact same [RaceCard] as Home's
 * carousel. Unlike Home — which hides its section entirely on [RacesUiState.Empty]/[RacesUiState.Error]
 * — this screen shows them, since the user navigated here on purpose and a silent blank screen would
 * look broken. Tapping a card opens [onOpenRaceDetail] (D-1114) instead of a webview directly.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun RacesScreen(
    state: RacesUiState,
    isRefreshing: Boolean,
    onRefresh: () -> Unit,
    onBack: () -> Unit,
    onOpenRaceDetail: (String) -> Unit,
    onProvinceFilterChange: (String?) -> Unit,
    onMonthFilterChange: (YearMonth?) -> Unit,
    onShowPastChange: (Boolean) -> Unit,
) {
    AppScreen(title = "Giải chạy sắp tới", onBack = onBack) { contentPadding ->
        when (state) {
            RacesUiState.Loading -> LoadingState(Modifier.padding(contentPadding))
            is RacesUiState.Error -> ErrorState(state.message, Modifier.padding(contentPadding), onRetry = onRefresh)
            RacesUiState.Empty -> EmptyState(
                title = "Chưa có giải chạy nào",
                message = "Dữ liệu giải chạy đang được cập nhật, quay lại sau nhé.",
                modifier = Modifier.padding(contentPadding),
                actionLabel = "Thử lại",
                onAction = onRefresh,
            )
            is RacesUiState.Success -> PullToRefreshBox(
                isRefreshing = isRefreshing,
                onRefresh = onRefresh,
                modifier = Modifier.fillMaxSize(),
            ) {
                // D-1194: contentPadding merged into this LazyColumn's own contentPadding (never as
                // an outer Modifier.padding) — the list scrolls fully behind the gesture bar instead
                // of stopping in a dead strip above it.
                LazyColumn(
                    modifier = Modifier.fillMaxSize().testTag("races_list"),
                    contentPadding = PaddingValues(
                        top = contentPadding.calculateTopPadding() + Gaps.screenTop,
                        bottom = contentPadding.calculateBottomPadding() + Gaps.sectionGap,
                    ),
                    verticalArrangement = Arrangement.spacedBy(Gaps.itemGap),
                ) {
                    item {
                        RaceFiltersSection(
                            state = state,
                            onProvinceFilterChange = onProvinceFilterChange,
                            onMonthFilterChange = onMonthFilterChange,
                            onShowPastChange = onShowPastChange,
                        )
                    }
                    if (state.races.isEmpty()) {
                        item {
                            EmptyState(
                                title = "Không có giải nào khớp bộ lọc",
                                message = "Thử bỏ bớt bộ lọc hoặc bật \"Đã diễn ra\" để xem thêm.",
                                modifier = Modifier.fillMaxWidth().padding(horizontal = Gaps.screenHorizontal),
                            )
                        }
                    } else {
                        items(state.races, key = { it.id }) { race ->
                            RaceCard(
                                race = race,
                                onClick = { onOpenRaceDetail(race.id) },
                                modifier = Modifier.fillMaxWidth().padding(horizontal = Gaps.screenHorizontal).testTag("race_card_${race.id}"),
                            )
                        }
                    }
                }
            }
        }
    }
}

private val MonthLabelFormat: DateTimeFormatter = DateTimeFormatter.ofPattern("MM/yyyy", Locale.US)

/** "Th.11/2026" — Vietnamese-style month label for a [YearMonth] filter chip. */
private fun YearMonth.vnLabel(): String = "Th.${MonthLabelFormat.format(this)}"

/** D-1113: a province chip row, a month chip row, and a standalone "Đã diễn ra" toggle chip — all
 *  derived from the currently-loaded race list, not a separate fetch. */
@Composable
private fun RaceFiltersSection(
    state: RacesUiState.Success,
    onProvinceFilterChange: (String?) -> Unit,
    onMonthFilterChange: (YearMonth?) -> Unit,
    onShowPastChange: (Boolean) -> Unit,
) {
    Column(
        modifier = Modifier.fillMaxWidth().testTag("races_filters"),
        verticalArrangement = Arrangement.spacedBy(Gaps.itemGap),
    ) {
        if (state.availableProvinces.isNotEmpty()) {
            FilterChipRow(
                modifier = Modifier.testTag("races_filter_province"),
                options = state.availableProvinces,
                selected = state.filters.province,
                label = { it },
                onSelect = onProvinceFilterChange,
            )
        }
        if (state.availableMonths.isNotEmpty()) {
            FilterChipRow(
                modifier = Modifier.testTag("races_filter_month"),
                options = state.availableMonths,
                selected = state.filters.month,
                label = { it.vnLabel() },
                onSelect = onMonthFilterChange,
            )
        }
        FilterChip(
            selected = state.filters.showPast,
            onClick = { onShowPastChange(!state.filters.showPast) },
            label = { Text("Đã diễn ra") },
            modifier = Modifier.padding(horizontal = Gaps.screenHorizontal).testTag("races_filter_show_past"),
        )
    }
}

/** One scrollable row of chips: "Tất cả" (= null, clears the filter) plus one chip per [options]
 *  entry, single-select. */
@Composable
private fun <T> FilterChipRow(
    options: List<T>,
    selected: T?,
    label: (T) -> String,
    onSelect: (T?) -> Unit,
    modifier: Modifier = Modifier,
) {
    LazyRow(
        modifier = modifier.fillMaxWidth(),
        contentPadding = PaddingValues(horizontal = Gaps.screenHorizontal),
        horizontalArrangement = Arrangement.spacedBy(Gaps.chipGap),
    ) {
        item {
            FilterChip(selected = selected == null, onClick = { onSelect(null) }, label = { Text("Tất cả") })
        }
        items(options) { option ->
            FilterChip(selected = selected == option, onClick = { onSelect(option) }, label = { Text(label(option)) })
        }
    }
}
