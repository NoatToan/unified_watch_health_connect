package com.unified.health.feature.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior
import androidx.compose.foundation.interaction.DragInteraction
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.DirectionsRun
import androidx.compose.material.icons.automirrored.outlined.KeyboardArrowRight
import androidx.compose.material.icons.automirrored.outlined.TrendingDown
import androidx.compose.material.icons.automirrored.outlined.TrendingFlat
import androidx.compose.material.icons.automirrored.outlined.TrendingUp
import androidx.compose.material.icons.automirrored.outlined.ViewList
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.outlined.BatteryStd
import androidx.compose.material.icons.outlined.GridView
import androidx.compose.material.icons.outlined.KeyboardArrowDown
import androidx.compose.material.icons.outlined.KeyboardArrowUp
import androidx.compose.material.icons.outlined.ShoppingBag
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItem
import androidx.compose.material3.ListItemDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.pulltorefresh.PullToRefreshBox
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.unified.health.core.designsystem.component.ActivityRings
import com.unified.health.core.designsystem.component.ErrorState
import com.unified.health.core.designsystem.component.HealthBarChart
import com.unified.health.core.designsystem.component.HealthRangeChart
import com.unified.health.core.designsystem.component.LiveDot
import com.unified.health.core.designsystem.component.LoadingState
import com.unified.health.core.designsystem.component.RaceCard
import com.unified.health.core.designsystem.component.RingSpec
import com.unified.health.core.designsystem.component.SectionHeader
import com.unified.health.core.designsystem.component.SleepStageChart
import com.unified.health.core.designsystem.component.SleepStageLegend
import com.unified.health.core.designsystem.component.SummaryMetricCard
import com.unified.health.core.designsystem.component.scheduledDayDescription
import com.unified.health.core.designsystem.component.WatchImage
import com.unified.health.core.designsystem.component.compactNumber
import com.unified.health.core.designsystem.component.formatMinutes
import com.unified.health.core.designsystem.component.formatValueLocalized
import com.unified.health.core.designsystem.component.icon
import com.unified.health.core.designsystem.component.label
import com.unified.health.core.designsystem.component.timeLabel
import com.unified.health.core.designsystem.component.unit
import com.unified.health.core.designsystem.theme.MetricValueTextStyle
import com.unified.health.core.designsystem.theme.Spacing
import com.unified.health.core.designsystem.theme.UnifiedHealthTheme
import com.unified.health.core.domain.repository.RacesState
import com.unified.health.core.domain.usecase.Highlight
import com.unified.health.core.domain.usecase.Trend
import com.unified.health.core.model.CaloriesSummary
import com.unified.health.core.model.ChartPoint
import com.unified.health.core.model.ConnectionState
import com.unified.health.core.model.DailyHealthSummary
import com.unified.health.core.model.HealthMetricType
import com.unified.health.core.model.HeartRateSummary
import com.unified.health.core.model.HomeMetricsViewMode
import com.unified.health.core.model.LiveHeartRate
import com.unified.health.core.model.MetricAggregation
import com.unified.health.core.model.Race
import com.unified.health.core.model.RaceStatus
import com.unified.health.core.model.ScheduledDay
import com.unified.health.core.model.SleepSession
import com.unified.health.core.model.StepsSummary
import com.unified.health.core.model.SyncState
import com.unified.health.core.model.UnitSystem
import com.unified.health.core.model.WatchModelMatcher
import com.unified.health.core.model.WearableDevice
import com.unified.health.core.model.WearableVendor
import com.unified.health.core.model.Workout
import com.unified.health.core.model.distanceUnitLabel
import com.unified.health.core.model.metersToDisplayDistance
import com.unified.health.feature.home.insight.localizedInsightStrings
import com.unified.health.feature.home.insight.metricInsightLine
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.first
import kotlin.math.abs
import java.time.Duration
import java.time.Instant
import java.time.LocalDate
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle
import com.unified.health.core.designsystem.R as DesignSystemR

@Composable
internal fun HomeRoute(
    onMetricClick: (HealthMetricType) -> Unit,
    onOpenDevices: () -> Unit,
    onOpenWorkouts: () -> Unit,
    onOpenRaces: () -> Unit,
    onOpenRaceDetail: (String) -> Unit,
    onOpenTraining: () -> Unit,
    onOpenGear: () -> Unit,
    viewModel: HomeViewModel = hiltViewModel(),
) {
    val state by viewModel.uiState.collectAsStateWithLifecycle()
    val refreshing by viewModel.isRefreshing.collectAsStateWithLifecycle()
    val live by viewModel.liveHeartRate.collectAsStateWithLifecycle()
    val liveMetrics by viewModel.liveMetrics.collectAsStateWithLifecycle()
    val racesState by viewModel.racesState.collectAsStateWithLifecycle()
    HomeScreen(
        state = state,
        liveHeartRate = live,
        liveMetrics = liveMetrics,
        racesState = racesState,
        isRefreshing = refreshing,
        onRefresh = viewModel::refresh,
        onMetricClick = onMetricClick,
        onOpenDevices = onOpenDevices,
        onOpenWorkouts = onOpenWorkouts,
        onOpenRaces = onOpenRaces,
        onOpenRaceDetail = onOpenRaceDetail,
        onOpenTraining = onOpenTraining,
        onOpenGear = onOpenGear,
        onFeedCardsChanged = viewModel::setFeedCards,
        onMetricsViewModeChange = viewModel::setMetricsViewMode,
        onCheckInToday = viewModel::checkInToday,
    )
}

/**
 * Apple Health's Summary merged with the Huawei Health-style flat feed (D-1010): activity rings,
 * every metric's own card, then highlights — one scrolling list, no separate "Health" tab. The
 * "Pinned" subset was dropped (D-1072): this feed already shows every metric. D-1147 removed the
 * device banner that used to sit above the rings — the only device affordance left on Home is the
 * small chip in the TopAppBar's `actions` (see [DeviceChip]).
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun HomeScreen(
    state: HomeUiState,
    liveHeartRate: LiveHeartRate? = null,
    liveMetrics: Set<HealthMetricType> = emptySet(),
    racesState: RacesState = RacesState.Loading,
    isRefreshing: Boolean,
    onRefresh: () -> Unit,
    onMetricClick: (HealthMetricType) -> Unit,
    onOpenDevices: () -> Unit,
    onOpenWorkouts: () -> Unit = {},
    onOpenRaces: () -> Unit = {},
    onOpenRaceDetail: (String) -> Unit = {},
    onOpenTraining: () -> Unit = {},
    onOpenGear: () -> Unit = {},
    onFeedCardsChanged: (List<String>, Set<String>) -> Unit = { _, _ -> },
    onMetricsViewModeChange: (HomeMetricsViewMode) -> Unit = {},
    onCheckInToday: (Int) -> Unit = {},
) {
    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()
    val listState = rememberLazyListState()
    // D-1147: DeviceBanner (the full-size device row that used to be list item 0) is gone from Home's
    // body entirely — D-1083/1088's scroll-collapse fraction and D-1143's auto-collapse LaunchedEffect
    // existed only to animate that banner away, so both are deleted outright rather than kept as dead
    // code with nothing left to collapse.
    val device = (state as? HomeUiState.Success)?.device
    val syncState = (state as? HomeUiState.Success)?.syncState ?: SyncState.Idle
    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            TopAppBar(
                title = { Text(stringResource(R.string.home_title)) },
                actions = {
                    // D-1147: the only device affordance left on Home — always visible now (no banner
                    // left in the body for it to reveal alongside), with a status dot (D-1054's LiveDot)
                    // showing whether the device is connected and actively syncing right now.
                    if (device != null) {
                        DeviceChip(device, syncState, Modifier.testTag("device_chip"))
                    }
                },
                scrollBehavior = scrollBehavior,
            )
        },
    ) { padding ->
        when (state) {
            HomeUiState.Loading -> LoadingState(Modifier.padding(padding))
            is HomeUiState.Error -> ErrorState(state.message, Modifier.padding(padding), onRetry = onRefresh)
            is HomeUiState.Success -> PullToRefreshBox(
                isRefreshing = isRefreshing,
                onRefresh = onRefresh,
                modifier = Modifier.fillMaxSize().padding(padding),
            ) {
                Summary(
                    state = state,
                    liveHeartRate = liveHeartRate,
                    liveMetrics = liveMetrics,
                    racesState = racesState,
                    onMetricClick = onMetricClick,
                    onOpenDevices = onOpenDevices,
                    onOpenWorkouts = onOpenWorkouts,
                    onOpenRaces = onOpenRaces,
                    onOpenRaceDetail = onOpenRaceDetail,
                    onOpenTraining = onOpenTraining,
                    onOpenGear = onOpenGear,
                    onFeedCardsChanged = onFeedCardsChanged,
                    onMetricsViewModeChange = onMetricsViewModeChange,
                    onCheckInToday = onCheckInToday,
                    listState = listState,
                )
            }
        }
    }
}

@Composable
private fun Summary(
    state: HomeUiState.Success,
    liveHeartRate: LiveHeartRate?,
    liveMetrics: Set<HealthMetricType>,
    racesState: RacesState,
    onMetricClick: (HealthMetricType) -> Unit,
    onOpenDevices: () -> Unit,
    onOpenWorkouts: () -> Unit,
    onOpenRaces: () -> Unit,
    onOpenRaceDetail: (String) -> Unit,
    onOpenTraining: () -> Unit,
    onOpenGear: () -> Unit,
    onFeedCardsChanged: (List<String>, Set<String>) -> Unit,
    onMetricsViewModeChange: (HomeMetricsViewMode) -> Unit,
    onCheckInToday: (Int) -> Unit,
    listState: LazyListState,
) {
    var editingFeed by rememberSaveable { mutableStateOf(false) }
    // The live bpm (while fresh) used to override the Pinned heart-rate card's value; now that Pinned
    // is gone (D-1072) it overrides the heart-rate feed card's value/timestamp instead, so the "Live"
    // reading is still visible somewhere on Home, next to the green dot (D-1054).
    val liveBpm = freshBpm(liveHeartRate)
    LazyColumn(
        state = listState,
        modifier = Modifier.fillMaxSize().testTag("summary_list"),
        // D-1117/D-1128: vertical only here — horizontal insets move onto each item individually
        // (below) instead, specifically so the Races carousel can skip it and get the LazyColumn's
        // *true* full width to scroll within. A shared contentPadding here previously left every
        // item, including the carousel, permanently constrained to (screen width - 2*lg): no
        // Modifier trick on a child can claw back space a LazyColumn already decided not to give it.
        // D-1144: bottom clearance is now Spacing.bottomNavClearance (was Spacing.xxl) — the pill nav
        // floats as a Box overlay over this list instead of reserving Scaffold space, so without this
        // the last item would permanently sit behind it instead of merely scrolling behind it.
        contentPadding = PaddingValues(top = Spacing.sm, bottom = Spacing.bottomNavClearance),
        verticalArrangement = Arrangement.spacedBy(Spacing.md),
    ) {
        // D-1147: DeviceBanner removed entirely from Home's body — the small header chip (TopAppBar
        // actions, DeviceChip below) is now the only device affordance on Home.
        item { RingsCard(state.summary, onClick = { onMetricClick(HealthMetricType.CALORIES) }, modifier = Modifier.padding(horizontal = Spacing.lg)) }
        item {
            Row(modifier = Modifier.padding(horizontal = Spacing.lg), verticalAlignment = Alignment.CenterVertically) {
                SectionHeader(stringResource(R.string.metrics_section_title), Modifier.weight(1f))
                ViewModeToggle(
                    mode = state.metricsViewMode,
                    onChange = onMetricsViewModeChange,
                    modifier = Modifier.testTag("metrics_view_mode_toggle"),
                )
                TextButton(onClick = { editingFeed = true }, modifier = Modifier.testTag("edit_feed_cards")) { Text(stringResource(R.string.edit_cards)) }
            }
        }
        // D-1119/D-1188: Home only ever shows metrics that actually have data — decluttered, not just
        // dimmed/grayed. Hidden-via-"Edit cards" filtering already happened in the ViewModel; this is
        // an *additional* filter on top of it. The "Xem tất cả" escape hatch to an unfiltered list
        // (D-1119) was removed outright (D-1188): the only reason to ever see empty-data cards is
        // debugging the app's own code, which now lives in Profile's debug-only Developer section
        // instead (`showEmptyMetricCards`), applied right here on Home itself.
        val cardsWithData = if (state.showEmptyMetricCards) state.feedCards else state.feedCards.filter { it.hasData() }
        if (cardsWithData.isEmpty()) {
            item {
                Text(
                    stringResource(R.string.no_metrics_with_data),
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    modifier = Modifier.padding(horizontal = Spacing.lg).testTag("feed_empty"),
                )
            }
        }
        feedCardItems(cardsWithData, state.metricsViewMode, state.unitSystem, onMetricClick, onOpenWorkouts, liveMetrics, liveBpm)
        if (state.highlights.isNotEmpty()) {
            item { SectionHeader(stringResource(R.string.highlights_section_title), Modifier.padding(horizontal = Spacing.lg)) }
            items(state.highlights, key = { "highlight_${it.metric.name}" }) { highlight ->
                HighlightCard(highlight, state.unitSystem, onClick = { onMetricClick(highlight.metric) }, modifier = Modifier.padding(horizontal = Spacing.lg))
            }
        }
        // D-1110: moved to the end of the content (was right after RingsCard, D-1105) — marketing/
        // discovery content shouldn't sit above the user's own health data. Still rendered only on a
        // non-empty Success, never a visible empty/error placeholder, since the sibling data source
        // may not be live yet.
        // D-1125: RacesRepository no longer drops past races itself (D-1113 needs them available for
        // RacesScreen's toggle), so the carousel filters to upcoming-only here — it's pure marketing
        // for races the user can still register for, never a toggle like the full list.
        val upcomingRaces = (racesState as? RacesState.Success)?.races?.filter { it.raceStatus == RaceStatus.UPCOMING }
        if (!upcomingRaces.isNullOrEmpty()) {
            // D-1181: a stable key (not just the default index-derived one) so RacesCarousel can find
            // its own item inside listState.layoutInfo.visibleItemsInfo to detect "scrolled into
            // Home's viewport", regardless of how many items sit above it.
            item(key = RACES_CAROUSEL_ITEM_KEY) {
                RacesCarousel(
                    races = upcomingRaces,
                    onOpenRaces = onOpenRaces,
                    onOpenRaceDetail = onOpenRaceDetail,
                    homeListState = listState,
                )
            }
        }
        // Same "marketing/discovery content goes last, not above the user's own data" placement as
        // the Races carousel above (D-1110) — Home's second entry point into feature/gear's read-only
        // catalog (D-1186 added the first one, a Profile row; this is purely additional, not a
        // replacement). Sits before TrainingEntryCard so the end-of-list reads Races → Gear → Training.
        item {
            GearEntryCard(onClick = onOpenGear, modifier = Modifier.padding(horizontal = Spacing.lg))
        }
        // D-1190: a plan actively being followed replaces the plain static TrainingEntryCard with a
        // richer "today's workout" card (still linking through to the same feature/training screen) —
        // favors not cluttering Home with both at once, per the task brief. Same "marketing/discovery
        // content goes last, not above the user's own data" placement as the Races carousel above
        // (D-1110) either way.
        item {
            val todayWorkout = state.todayWorkout
            if (todayWorkout != null) {
                TodayWorkoutCard(
                    workout = todayWorkout,
                    onClick = onOpenTraining,
                    onCheckIn = { onCheckInToday(todayWorkout.dayOffset) },
                    modifier = Modifier.padding(horizontal = Spacing.lg),
                )
            } else {
                TrainingEntryCard(onClick = onOpenTraining, modifier = Modifier.padding(horizontal = Spacing.lg))
            }
        }
    }
    if (editingFeed) {
        EditFeedCardsDialog(
            order = state.feedOrder,
            hidden = state.hiddenFeedCards,
            onDone = { newOrder, newHidden -> onFeedCardsChanged(newOrder, newHidden); editingFeed = false },
            onDismiss = { editingFeed = false },
        )
    }
}

/** D-1073: switches "All metrics" between List (full-width, chart visible) and Grid (D-1050, compact). */
@Composable
private fun ViewModeToggle(mode: HomeMetricsViewMode, onChange: (HomeMetricsViewMode) -> Unit, modifier: Modifier = Modifier) {
    val target = if (mode == HomeMetricsViewMode.GRID) HomeMetricsViewMode.LIST else HomeMetricsViewMode.GRID
    IconButton(onClick = { onChange(target) }, modifier = modifier) {
        Icon(
            if (mode == HomeMetricsViewMode.GRID) Icons.AutoMirrored.Outlined.ViewList else Icons.Outlined.GridView,
            contentDescription = if (target == HomeMetricsViewMode.GRID) stringResource(R.string.switch_to_grid_view) else stringResource(R.string.switch_to_list_view),
        )
    }
}

/** Dispatches to the Workouts/Metric card, in its full ([compact] = false, List) or compact (Grid) form. */
@Composable
private fun FeedCard(
    card: FeedCardData,
    unitSystem: UnitSystem,
    onMetricClick: (HealthMetricType) -> Unit,
    onOpenWorkouts: () -> Unit,
    liveMetrics: Set<HealthMetricType>,
    liveBpm: Int?,
    compact: Boolean,
    modifier: Modifier = Modifier,
) {
    when (card) {
        is FeedCardData.Workouts -> WorkoutsFeedCard(recent = card.recent, unitSystem = unitSystem, onClick = onOpenWorkouts, compact = compact, modifier = modifier)
        is FeedCardData.Metric -> MetricFeedCard(
            card = card,
            unitSystem = unitSystem,
            onClick = { onMetricClick(card.metric) },
            modifier = modifier,
            isLive = card.metric.liveDotOrNull(liveMetrics),
            liveBpm = liveBpm.takeIf { card.metric == HealthMetricType.HEART_RATE },
            compact = compact,
        )
    }
}

/** D-1119/D-1188: whether this card has anything to show — Home filters to only these, unless the
 *  Developer section's "Show empty metric cards" debug toggle is on (see [Summary]'s `cardsWithData`). */
private fun FeedCardData.hasData(): Boolean = when (this) {
    is FeedCardData.Metric -> hasData
    is FeedCardData.Workouts -> recent.isNotEmpty()
}

/**
 * D-1119: the List/Grid metric-card layout, factored out of [Summary] so a differently-filtered (or
 * unfiltered, D-1188) [cards] collection can reuse the exact same rendering instead of duplicating it.
 */
private fun LazyListScope.feedCardItems(
    cards: List<FeedCardData>,
    viewMode: HomeMetricsViewMode,
    unitSystem: UnitSystem,
    onMetricClick: (HealthMetricType) -> Unit,
    onOpenWorkouts: () -> Unit,
    liveMetrics: Set<HealthMetricType>,
    liveBpm: Int?,
) {
    // D-1128: this horizontal inset lives here (not in the caller's LazyColumn contentPadding) so
    // every card gets the same inset without duplicating the constant elsewhere.
    when (viewMode) {
        HomeMetricsViewMode.LIST -> items(cards, key = { "feed_${it.id}" }) { card ->
            FeedCard(card, unitSystem, onMetricClick, onOpenWorkouts, liveMetrics, liveBpm, compact = false, modifier = Modifier.padding(horizontal = Spacing.lg).testTag("card_${card.id}"))
        }
        // D-1050/1073: 2-column grid — a plain Row per pair (not a nested LazyVerticalGrid, which
        // cannot be sized inside this LazyColumn) keeps the existing per-card composables and
        // "Edit cards" ordering untouched; cards render in their compact (no/tiny chart) form.
        HomeMetricsViewMode.GRID -> items(cards.chunked(2), key = { pair -> pair.joinToString("_") { it.id } }) { pair ->
            Row(Modifier.fillMaxWidth().padding(horizontal = Spacing.lg), horizontalArrangement = Arrangement.spacedBy(Spacing.md)) {
                pair.forEach { card ->
                    Box(Modifier.weight(1f)) {
                        FeedCard(card, unitSystem, onMetricClick, onOpenWorkouts, liveMetrics, liveBpm, compact = true, modifier = Modifier.testTag("card_${card.id}"))
                    }
                }
                if (pair.size == 1) Spacer(Modifier.weight(1f))
            }
        }
    }
}

@Composable
private fun HighlightCard(highlight: Highlight, unitSystem: UnitSystem, onClick: () -> Unit, modifier: Modifier = Modifier) {
    val metric = highlight.metric
    val accent = UnifiedHealthTheme.metricColors.forMetric(metric)
    val recent = metric.formatValueLocalized(highlight.recentAverage, unitSystem = unitSystem)
    val unit = metric.unit(unitSystem).let { if (it.isEmpty()) "" else " $it" }
    val verb = if (metric.aggregation == MetricAggregation.SLEEP) stringResource(R.string.highlight_verb_slept) else stringResource(R.string.highlight_verb_averaged)
    val change = when (highlight.trend) {
        Trend.UP -> stringResource(R.string.highlight_change_more, abs(highlight.changePercent))
        Trend.DOWN -> stringResource(R.string.highlight_change_less, abs(highlight.changePercent))
        Trend.STEADY -> stringResource(R.string.highlight_change_steady)
    }
    val perDay = if (metric.aggregation == MetricAggregation.CUMULATIVE) stringResource(R.string.highlight_per_day_suffix) else ""
    ElevatedCard(onClick = onClick, modifier = modifier.fillMaxWidth().testTag("highlight_${metric.name}")) {
        Column(Modifier.padding(Spacing.lg), verticalArrangement = Arrangement.spacedBy(Spacing.sm)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    when (highlight.trend) {
                        Trend.UP -> Icons.AutoMirrored.Outlined.TrendingUp
                        Trend.DOWN -> Icons.AutoMirrored.Outlined.TrendingDown
                        Trend.STEADY -> Icons.AutoMirrored.Outlined.TrendingFlat
                    },
                    contentDescription = null,
                    tint = accent,
                    modifier = Modifier.size(18.dp),
                )
                Spacer(Modifier.width(Spacing.sm))
                Text(metric.label(), style = MaterialTheme.typography.titleSmall, color = accent)
            }
            Text(
                stringResource(R.string.highlight_body, verb, recent, unit, perDay, change),
                style = MaterialTheme.typography.bodyMedium,
            )
            ComparisonBar(stringResource(R.string.comparison_last_7_days), highlight.recentAverage, maxOf(highlight.recentAverage, highlight.previousAverage), metric, unitSystem, accent)
            ComparisonBar(stringResource(R.string.comparison_previous_7_days), highlight.previousAverage, maxOf(highlight.recentAverage, highlight.previousAverage), metric, unitSystem, MaterialTheme.colorScheme.outline)
        }
    }
}

@Composable
private fun ComparisonBar(label: String, value: Double, max: Double, metric: HealthMetricType, unitSystem: UnitSystem, color: Color) {
    Column {
        Text("$label · ${metric.formatValueLocalized(value, unitSystem = unitSystem)} ${metric.unit(unitSystem)}".trim(), style = MaterialTheme.typography.labelMedium, color = MaterialTheme.colorScheme.onSurfaceVariant)
        Spacer(Modifier.height(2.dp))
        Box(
            Modifier
                .fillMaxWidth(if (max <= 0) 0f else (value / max).toFloat().coerceIn(0.02f, 1f))
                .height(8.dp)
                .background(color, RoundedCornerShape(4.dp)),
        )
    }
}

/**
 * The live reading while it is recent. Each new reading restarts a one-shot timer that expires it, so
 * the value disappears without new data and no endless loop keeps the composition busy.
 */
@Composable
private fun freshBpm(live: LiveHeartRate?): Int? {
    var expired by remember(live) { mutableStateOf(live == null || Duration.between(live.time, Instant.now()) > LIVE_MAX_AGE) }
    LaunchedEffect(live) {
        if (live == null || expired) return@LaunchedEffect
        delay((LIVE_MAX_AGE - Duration.between(live.time, Instant.now())).toMillis().coerceAtLeast(0))
        expired = true
    }
    return live?.takeUnless { expired }?.bpm
}

private val LIVE_MAX_AGE: Duration = Duration.ofSeconds(15)

/** Metrics with a live mode at all (D-1054); only these ever show the green/gray dot. */
private val METRICS_WITH_LIVE_MODE = setOf(HealthMetricType.HEART_RATE)

/** Null (no dot) for a metric with no live mode; otherwise whether it is live right now. */
private fun HealthMetricType.liveDotOrNull(liveMetrics: Set<HealthMetricType>): Boolean? =
    if (this in METRICS_WITH_LIVE_MODE) this in liveMetrics else null

/**
 * D-1147: Home's only device affordance now that `DeviceBanner` is gone from its scrolling body —
 * watch image + name + a connected/syncing status dot, in the TopAppBar's `actions`. Always visible
 * (there's nothing left in the body to collapse from, so the D-1083/1088/1098 scroll-driven reveal
 * tied to the banner's collapse fraction is gone too) — just a light one-shot fade-in driven purely
 * by composition, for polish, the first time Home composes this chip.
 */
@Composable
private fun DeviceChip(device: WearableDevice, syncState: SyncState, modifier: Modifier = Modifier) {
    var revealed by remember { mutableStateOf(false) }
    LaunchedEffect(Unit) { revealed = true }
    val alpha by animateFloatAsState(if (revealed) 1f else 0f, label = "deviceChipReveal")
    Row(
        modifier = modifier
            .graphicsLayer { this.alpha = alpha }
            .padding(end = Spacing.md),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        WatchImage(
            model = remember(device.vendor, device.name, device.model) { WatchModelMatcher.match(device) },
            size = 28.dp,
            interactive = true,
            // D-1098: same flip-in-from -90° rotationY effect WatchImage already does on Devices
            // (D-803). Keyed on [revealed] (now a one-shot composition flag, not a scroll fraction —
            // there's no banner left to derive one from) so it plays once when the chip first appears.
            revealKey = revealed,
        )
        Spacer(Modifier.width(Spacing.xs))
        Text(
            device.name,
            style = MaterialTheme.typography.labelMedium,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.widthIn(max = 96.dp),
        )
        Spacer(Modifier.width(Spacing.xs))
        // D-1147: green while connected AND actively syncing right now, gray otherwise (disconnected
        // or idle) — reuses D-1054's LiveDot as-is rather than a new dot component.
        LiveDot(isLive = device.connectionState == ConnectionState.Connected && syncState is SyncState.InProgress)
    }
}

@Composable
private fun RingsCard(summary: DailyHealthSummary, onClick: () -> Unit, modifier: Modifier = Modifier) {
    val colors = UnifiedHealthTheme.metricColors
    val moveLabel = stringResource(R.string.ring_move)
    val exerciseLabel = stringResource(R.string.ring_exercise)
    val stepsLabel = stringResource(R.string.ring_steps)
    val exerciseProgress = (summary.activeMinutes.toFloat() / summary.activeMinutesGoal).coerceIn(0f, 1f)
    val rings = listOf(
        RingSpec(moveLabel, summary.calories.progress, colors.calories),
        RingSpec(exerciseLabel, exerciseProgress, colors.exercise),
        RingSpec(stepsLabel, summary.steps.progress, colors.steps),
    )
    // D-1157: no background box behind the rings on Home — they sit directly on Home's own
    // background. Surface(color = Color.Transparent) instead of a plain Modifier.clickable so onClick
    // keeps its ripple + semantics/role exactly as the old Card gave it, just with zero fill/elevation
    // of its own to paint.
    Surface(
        onClick = onClick,
        modifier = modifier.fillMaxWidth().testTag("activity_rings"),
        color = Color.Transparent,
        tonalElevation = 0.dp,
        shadowElevation = 0.dp,
    ) {
        Row(modifier = Modifier.padding(Spacing.lg), verticalAlignment = Alignment.CenterVertically) {
            ActivityRings(rings = rings, size = 120.dp, strokeWidth = 12.dp)
            Spacer(Modifier.width(Spacing.xl))
            Column(verticalArrangement = Arrangement.spacedBy(Spacing.sm)) {
                RingLegend(moveLabel, stringResource(R.string.ring_calories_progress, summary.calories.activeKcal, summary.calories.goalKcal), colors.calories)
                RingLegend(exerciseLabel, stringResource(R.string.ring_minutes_progress, summary.activeMinutes, summary.activeMinutesGoal), colors.exercise)
                RingLegend(stepsLabel, stringResource(R.string.ring_count_progress, summary.steps.count, summary.steps.goal), colors.steps)
            }
        }
    }
}

/** D-1181: the carousel's own key inside Home's `Summary` LazyColumn (see the `item(key = ...)` call
 *  there) — matched against `homeListState.layoutInfo.visibleItemsInfo` below to tell whether this
 *  item has actually scrolled into Home's viewport, as opposed to merely being composed. */
private const val RACES_CAROUSEL_ITEM_KEY = "races_carousel_item"

/** D-1181: how many times [RacesCarousel] nudges the user by auto-advancing once it enters the
 *  viewport — twice, then never again for the life of this composable instance. */
private const val RACES_CAROUSEL_AUTO_ADVANCES = 2
private val RACES_CAROUSEL_AUTO_ADVANCE_DELAY: Duration = Duration.ofSeconds(3)

/**
 * "Giải chạy sắp tới" (D-1105): a horizontally-scrolling carousel of upcoming Vietnam races, right
 * after [RingsCard] and before "All metrics" — the marketing/discovery spot, not buried in the feed.
 * Each card opens the in-app [onOpenRaceDetail] screen first (D-1114, no longer a Custom Tab
 * directly); "Xem tất cả" opens the full [onOpenRaces] list screen instead.
 *
 * D-1181: once this item actually scrolls into [homeListState]'s viewport (not just whenever Home
 * composes), it nudges the user twice — wait 3s, animate to the next card, wait 3s again, animate to
 * the card after that, then stop for good — so a passive user discovers there's more than one race
 * without the carousel looping forever. A real drag on the carousel itself cancels whatever is left
 * of that sequence immediately.
 */
@Composable
private fun RacesCarousel(
    races: List<Race>,
    onOpenRaces: () -> Unit,
    onOpenRaceDetail: (String) -> Unit,
    homeListState: LazyListState,
) {
    // D-1117/D-1128: Summary's own LazyColumn no longer applies a shared horizontal contentPadding
    // (see Summary) — every *other* item insets itself instead, specifically so this carousel can be
    // the one exception that gets the LazyColumn's true, unconstrained full width. A Modifier trick
    // on the LazyRow itself (tried first, D-1117) could not claw back width an ancestor had already
    // excluded from this item's constraints; this way there is no ancestor constraint to fight.
    Column(verticalArrangement = Arrangement.spacedBy(Spacing.sm)) {
        Row(modifier = Modifier.padding(horizontal = Spacing.lg), verticalAlignment = Alignment.CenterVertically) {
            SectionHeader(stringResource(R.string.races_carousel_title), Modifier.weight(1f))
            TextButton(onClick = onOpenRaces, modifier = Modifier.testTag("races_see_all")) { Text(stringResource(R.string.see_all)) }
        }
        // D-1133: snap-to-card paging, so a fling always settles on one card (never halfway between
        // two) — pairs naturally with each card being ~80% of the viewport width below, which leaves
        // a ~20% peek of the next card as a scroll affordance. D-1181 reuses this same LazyListState
        // as its "pager" — animateScrollToItem is this carousel's equivalent of a PagerState's
        // animateScrollToPage, since it's a snap-fling LazyRow rather than an actual HorizontalPager.
        val listState = rememberLazyListState()
        LazyRow(
            state = listState,
            flingBehavior = rememberSnapFlingBehavior(listState),
            horizontalArrangement = Arrangement.spacedBy(Spacing.md),
            // Same Spacing.lg as every other item's own inset (above, and in feedCardItems/DeviceBanner/
            // RingsCard/etc.) — the first/last card lines up with them at rest, while the row itself
            // spans the full screen width so scrolling reaches the true edge on either side.
            contentPadding = PaddingValues(horizontal = Spacing.lg),
            modifier = Modifier.fillMaxWidth().testTag("races_carousel"),
        ) {
            // D-1133: items(...) keeps this genuinely lazy — only cards near the viewport compose at
            // all — which matters once the race list is much larger than what's on screen at once.
            items(races, key = { it.id }) { race ->
                RaceCard(
                    race = race,
                    onClick = { onOpenRaceDetail(race.id) },
                    // D-1133: ~80% of the row's own width (not a fixed dp), so one card shows fully
                    // plus a ~20% peek of the next at rest.
                    modifier = Modifier.fillParentMaxWidth(0.8f).testTag("race_card_${race.id}"),
                )
            }
        }

        // D-1181: a real drag on the carousel cancels the rest of the auto-advance sequence — never
        // fight the user's own input. `listState.interactionSource` is the same public interaction
        // source the LazyRow's own scrollable gesture already reports through; no separate pointer-
        // input handling needed.
        var userInteracted by remember { mutableStateOf(false) }
        LaunchedEffect(listState) {
            listState.interactionSource.interactions.collect { interaction ->
                if (interaction is DragInteraction.Start) userInteracted = true
            }
        }
        // D-1181: "entered the viewport" reuses Home's own LazyListState.layoutInfo (the same
        // position-tracking data D-1117/1133 already rely on for this item), matched by the stable
        // key Summary's `item(key = RACES_CAROUSEL_ITEM_KEY)` gives this item — not a new
        // onGloballyPositioned/viewport tracker. Plain `remember` (not rememberSaveable) for all this
        // state is intentional: if the user leaves Home (this composable leaves composition) and
        // comes back, it is recreated fresh and the whole sequence is eligible to run again, exactly
        // as D-1181 asks — no explicit "already showed this nudge" flag to persist.
        LaunchedEffect(homeListState, races) {
            snapshotFlow {
                homeListState.layoutInfo.visibleItemsInfo.any { it.key == RACES_CAROUSEL_ITEM_KEY }
            }.first { isVisible -> isVisible }
            repeat(RACES_CAROUSEL_AUTO_ADVANCES) {
                delay(RACES_CAROUSEL_AUTO_ADVANCE_DELAY.toMillis())
                if (userInteracted) return@LaunchedEffect
                val nextIndex = listState.firstVisibleItemIndex + 1
                if (nextIndex > races.lastIndex) return@LaunchedEffect
                listState.animateScrollToItem(nextIndex)
            }
        }
    }
}

/**
 * Home's entry point into `feature/training`'s static "Chế độ luyện tập" reference guide — a plain
 * row card (icon, title, one-line teaser, chevron), the same shape as [WorkoutsFeedCard] but without
 * any live data of its own since the destination is purely static reference content, not tied to the
 * user's own activity/workout data.
 */
@Composable
private fun TrainingEntryCard(onClick: () -> Unit, modifier: Modifier = Modifier) {
    ElevatedCard(onClick = onClick, modifier = modifier.fillMaxWidth().testTag("training_entry_card")) {
        Row(Modifier.padding(Spacing.lg).fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            Icon(
                Icons.AutoMirrored.Outlined.DirectionsRun,
                contentDescription = null,
                tint = UnifiedHealthTheme.metricColors.exercise,
                modifier = Modifier.size(28.dp),
            )
            Spacer(Modifier.width(Spacing.md))
            Column(Modifier.weight(1f)) {
                Text("Chế độ luyện tập", style = MaterialTheme.typography.titleSmall)
                Text(
                    "Lộ trình tập chạy cho 5K, 10K, Half và Full marathon",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                )
            }
            Icon(Icons.AutoMirrored.Outlined.KeyboardArrowRight, contentDescription = null, tint = MaterialTheme.colorScheme.onSurfaceVariant)
        }
    }
}

/**
 * D-1190: shown instead of [TrainingEntryCard] once a plan is active and today has an uncompleted
 * entry — "Hôm nay: chạy 4.8 km" + a one-tap check-in right here on Home (the user's explicit ask:
 * check in from Home itself, not only from `feature/training`'s own calendar screen). Tapping the row
 * itself still opens the same `feature/training` screen as [TrainingEntryCard] did; the checkmark
 * button is a separate, smaller tap target so the two actions don't fight each other.
 */
@Composable
private fun TodayWorkoutCard(workout: ScheduledDay, onClick: () -> Unit, onCheckIn: () -> Unit, modifier: Modifier = Modifier) {
    ElevatedCard(onClick = onClick, modifier = modifier.fillMaxWidth().testTag("today_workout_card")) {
        Row(Modifier.padding(Spacing.lg).fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            Icon(
                Icons.AutoMirrored.Outlined.DirectionsRun,
                contentDescription = null,
                tint = UnifiedHealthTheme.metricColors.exercise,
                modifier = Modifier.size(28.dp),
            )
            Spacer(Modifier.width(Spacing.md))
            Column(Modifier.weight(1f)) {
                Text("Hôm nay: ${scheduledDayDescription(workout)}", style = MaterialTheme.typography.titleSmall)
                Text(
                    "Chạm để xem lịch tập đầy đủ",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
            }
            IconButton(onClick = onCheckIn, modifier = Modifier.testTag("today_workout_check_in")) {
                Icon(Icons.Filled.CheckCircle, contentDescription = "Đã hoàn thành", tint = UnifiedHealthTheme.metricColors.exercise)
            }
        }
    }
}

/**
 * Home's second entry point into `feature/gear`'s read-only "Trang bị tham khảo" catalog (D-1186
 * added the first one, a Profile row — this is purely additional, same shape/placement rationale as
 * [TrainingEntryCard] above: a plain row card (icon, title, one-line teaser, chevron), no live data
 * of its own since the destination is a static browse-only catalog, not tied to the user's own gear.
 */
@Composable
private fun GearEntryCard(onClick: () -> Unit, modifier: Modifier = Modifier) {
    ElevatedCard(onClick = onClick, modifier = modifier.fillMaxWidth().testTag("gear_entry_card")) {
        Row(Modifier.padding(Spacing.lg).fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            Icon(
                Icons.Outlined.ShoppingBag,
                contentDescription = null,
                tint = UnifiedHealthTheme.metricColors.exercise,
                modifier = Modifier.size(28.dp),
            )
            Spacer(Modifier.width(Spacing.md))
            Column(Modifier.weight(1f)) {
                Text("Trang bị tham khảo", style = MaterialTheme.typography.titleSmall)
                Text(
                    "Giày, quần áo và phụ kiện chạy bộ từ các thương hiệu lớn",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                )
            }
            Icon(Icons.AutoMirrored.Outlined.KeyboardArrowRight, contentDescription = null, tint = MaterialTheme.colorScheme.onSurfaceVariant)
        }
    }
}

@Composable
private fun RingLegend(label: String, value: String, color: Color) {
    Column {
        Text(label, style = MaterialTheme.typography.labelMedium, color = color)
        Text(value, style = MaterialTheme.typography.bodyMedium)
    }
}

// ---------------------------------------------------------------- full metric feed (merged from the old Health tab, D-1010)

@Composable
private fun WorkoutsFeedCard(recent: List<Workout>, unitSystem: UnitSystem, onClick: () -> Unit, compact: Boolean = false, modifier: Modifier = Modifier) {
    ElevatedCard(onClick = onClick, modifier = modifier.fillMaxWidth()) {
        Column(Modifier.padding(Spacing.lg), verticalArrangement = Arrangement.spacedBy(Spacing.sm)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(stringResource(R.string.workouts_card_title), style = MaterialTheme.typography.titleSmall, color = UnifiedHealthTheme.metricColors.exercise, modifier = Modifier.weight(1f))
                Icon(Icons.AutoMirrored.Outlined.KeyboardArrowRight, contentDescription = null, tint = MaterialTheme.colorScheme.onSurfaceVariant)
            }
            when {
                recent.isEmpty() -> Text(
                    stringResource(R.string.workouts_card_empty),
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                )
                // Grid (D-1073): just name + value — the count of recent workouts, no per-workout rows.
                // D-1099: dropped the "Last <type>: " prefix and the year (when it's this year) — with
                // both, "Last running: Nov 8, 2026" was getting cut to "Last running: Nov 8, 20...".
                compact -> {
                    Text("${recent.size}", style = MetricValueTextStyle)
                    Text(
                        shortWorkoutDate(recent.first().start),
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
                else -> recent.forEach { workout -> WorkoutRow(workout, unitSystem) }
            }
        }
    }
}

@Composable
private fun WorkoutRow(workout: Workout, unitSystem: UnitSystem) {
    val accent = UnifiedHealthTheme.metricColors.exercise
    val zone = ZoneId.systemDefault()
    val details = listOfNotNull(
        formatMinutes(workout.duration.toMinutes().toInt(), stringResource(DesignSystemR.string.duration_hour_unit), stringResource(DesignSystemR.string.duration_minute_unit)),
        workout.distanceMeters?.takeIf { it > 0 }?.let {
            String.format(java.util.Locale.getDefault(), "%.2f %s", it.metersToDisplayDistance(unitSystem), unitSystem.distanceUnitLabel())
        },
        workout.activeKcal?.let { "$it kcal" },
    ).joinToString(" · ")
    Row(verticalAlignment = Alignment.CenterVertically) {
        Icon(workout.type.feedIcon(), contentDescription = null, tint = accent, modifier = Modifier.size(20.dp))
        Spacer(Modifier.width(Spacing.sm))
        Column(Modifier.weight(1f)) {
            Text(workout.type.feedLabel(), style = MaterialTheme.typography.bodyMedium)
            Text(
                "${WORKOUT_DATE.format(workout.start.atZone(zone))} · $details",
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
        }
    }
}

private val WORKOUT_DATE: DateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)

/** D-1099: "Nov 8" this year, "Nov 8, 2025" otherwise — short enough for the Grid card's Workouts tile. */
private val WORKOUT_DATE_SHORT_THIS_YEAR: DateTimeFormatter = DateTimeFormatter.ofPattern("MMM d", java.util.Locale.getDefault())

private fun shortWorkoutDate(start: Instant, zone: ZoneId = ZoneId.systemDefault()): String {
    val date = start.atZone(zone)
    return if (date.year == LocalDate.now(zone).year) WORKOUT_DATE_SHORT_THIS_YEAR.format(date) else WORKOUT_DATE.format(date)
}

@Composable
private fun MetricFeedCard(
    card: FeedCardData.Metric,
    unitSystem: UnitSystem,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    isLive: Boolean? = null,
    /** Overrides [FeedCardData.Metric.reading] with the live bpm while fresh (D-1054); only ever
     *  non-null for [HealthMetricType.HEART_RATE] — see [FeedCard]. */
    liveBpm: Int? = null,
    /** D-1085: Grid — abbreviated name + value only, no chart at all (was a tiny chart per D-1073;
     *  dropped after direct feedback that the shrunk chart looked bad). No resting-bpm/sleep-score/
     *  insight lines either, same as before. */
    compact: Boolean = false,
) {
    val metric = card.metric
    val accent = UnifiedHealthTheme.metricColors.forMetric(metric)
    if (!card.hasData) {
        EmptyMetricCard(metric, accent, onClick, modifier, compact = compact)
        return
    }
    val insight = metricInsightLine(metric, card.highlight, card.weekStats, unitSystem, localizedInsightStrings())
    val sleepSession = card.sleepSession
    val value = if (liveBpm != null) liveBpm.toString() else card.reading?.let { metric.formatValueLocalized(it.value, unitSystem = unitSystem) }
    val liveNowLabel = stringResource(DesignSystemR.string.live_dot_live)
    val cardTimeLabel = if (liveBpm != null) liveNowLabel else card.reading?.let { timeLabel(metric, it) }
    val noReadingToday = stringResource(R.string.feed_card_no_reading_today)
    val liveSuffix = stringResource(R.string.feed_card_live_suffix)
    val notLiveSuffix = stringResource(R.string.feed_card_not_live_suffix)
    val description = buildString {
        append(metric.label()).append(", ")
        append(value?.let { "$it ${metric.unit(unitSystem)}".trim() } ?: noReadingToday)
        if (!compact) insight?.let { append(", ").append(it) }
        if (isLive != null) append(if (isLive) liveSuffix else notLiveSuffix)
    }
    ElevatedCard(onClick = onClick, modifier = modifier.fillMaxWidth().semantics(mergeDescendants = true) { contentDescription = description }) {
        Column(Modifier.padding(Spacing.lg), verticalArrangement = Arrangement.spacedBy(Spacing.sm)) {
            FeedCardHeader(metric, accent, value, metric.unit(unitSystem), cardTimeLabel, isLive, compact = compact)
            if (!compact) {
                card.restingBpm?.let {
                    Text(stringResource(R.string.feed_resting_heart_rate, it), style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant)
                }
                sleepSession?.score?.let {
                    Text(stringResource(R.string.feed_sleep_score, it), style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant)
                }
                MiniChart(metric, card.weekPoints, sleepSession, unitSystem, accent)
                if (metric.aggregation == MetricAggregation.SLEEP && sleepSession != null) {
                    SleepStageLegend(sleepSession, Modifier.testTag("feed_sleep_legend"))
                }
                if (insight != null) {
                    Text(insight, style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant)
                }
            }
        }
    }
}

@Composable
private fun FeedCardHeader(
    metric: HealthMetricType,
    accent: Color,
    value: String?,
    unit: String,
    timeLabel: String?,
    isLive: Boolean? = null,
    /** D-1085: Grid shows [compactLabel] ("HR", "Cal", "RHR"...) instead of the full name, so a long
     *  metric name never forces the 2-column card to wrap or overflow. */
    compact: Boolean = false,
) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Icon(metric.icon(), contentDescription = null, tint = accent, modifier = Modifier.size(18.dp))
        Spacer(Modifier.width(Spacing.sm))
        Text(
            if (compact) metric.compactLabel() else metric.label(),
            style = MaterialTheme.typography.titleSmall,
            color = accent,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
        )
        if (isLive != null) {
            Spacer(Modifier.width(Spacing.xs))
            LiveDot(isLive)
        }
        Spacer(Modifier.weight(1f))
        if (!compact) timeLabel?.let { Text(it, style = MaterialTheme.typography.labelMedium, color = MaterialTheme.colorScheme.onSurfaceVariant) }
    }
    Row(verticalAlignment = Alignment.Bottom) {
        Text(value ?: "--", style = MetricValueTextStyle)
        if (value != null && unit.isNotEmpty()) {
            Spacer(Modifier.width(Spacing.xs))
            Text(
                unit,
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                modifier = Modifier.padding(bottom = 4.dp),
            )
        }
    }
}

/** Bars for cumulative metrics, min–max capsules for discrete ones, a compact stage bar for sleep.
 *  List mode only (D-1085 removed Grid's shrunk chart entirely after it looked bad). */
@Composable
private fun MiniChart(
    metric: HealthMetricType,
    weekPoints: List<ChartPoint>,
    sleepSession: SleepSession?,
    unitSystem: UnitSystem,
    accent: Color,
) {
    val axis: (Float) -> String = when (metric) {
        HealthMetricType.DISTANCE -> { v -> compactNumber(v.toDouble().metersToDisplayDistance(unitSystem).toFloat()) }
        else -> ::compactNumber
    }
    // D-1132: drag-to-scrub (D-1020) is off here — this chart is too small for it, and a drag would
    // fight the card's own tap-to-open-detail. MetricDetailScreen's own, bigger chart keeps scrub on.
    when {
        metric.aggregation == MetricAggregation.SLEEP && sleepSession != null ->
            SleepStageChart(sleepSession, Modifier.testTag("feed_sleep_chart"), height = 110.dp)
        metric.aggregation == MetricAggregation.DISCRETE ->
            HealthRangeChart(weekPoints, accent, Modifier.testTag("feed_mini_range"), height = 90.dp, axisLabel = axis, scrubEnabled = false)
        else ->
            HealthBarChart(weekPoints, accent, Modifier.testTag("feed_mini_bar"), height = 90.dp, axisLabel = axis, scrubEnabled = false)
    }
}

/** Compact hint instead of a big empty card, per metric without data. */
@Composable
private fun EmptyMetricCard(metric: HealthMetricType, accent: Color, onClick: () -> Unit, modifier: Modifier = Modifier, compact: Boolean = false) {
    ElevatedCard(onClick = onClick, modifier = modifier.fillMaxWidth()) {
        ListItem(
            modifier = Modifier.testTag("feed_empty_${metric.name}"),
            colors = ListItemDefaults.colors(containerColor = Color.Transparent),
            leadingContent = { Icon(metric.icon(), contentDescription = null, tint = accent) },
            headlineContent = { Text(if (compact) metric.compactLabel() else metric.label(), color = accent, maxLines = 1, overflow = TextOverflow.Ellipsis) },
            // D-1099: maxLines/ellipsis so this never wraps to a 2nd line — was making Grid cards
            // with no data taller than their row neighbours.
            supportingContent = { Text(stringResource(R.string.no_data), maxLines = 1, overflow = TextOverflow.Ellipsis) },
            trailingContent = { Icon(Icons.AutoMirrored.Outlined.KeyboardArrowRight, contentDescription = null, tint = MaterialTheme.colorScheme.onSurfaceVariant) },
        )
    }
}

/**
 * D-1085/D-1099: short form of a metric's name for the Grid card, chosen to stay legible at
 * 2-column width. D-1085 only covered 4 metrics on the assumption the rest ([label] output) already
 * fit — real-device feedback (D-1099) showed several full labels ("Blood oxygen", "Heart rate
 * variability", "Walking + running distance") were truncating mid-word, and even the "Exercise"
 * abbreviation itself was still too long. Every metric that can appear in the feed now gets an
 * explicit short form, each kept to at most "Stress"/"SpO2"-length (6 characters) — the longest
 * strings D-1099's screenshot showed rendering fine — rather than guessing a shorter string will fit
 * without a real device to check against; "Distance" (8 chars, the same length as the "Exercise" that
 * just failed) was deliberately not used for [HealthMetricType.DISTANCE] for that reason.
 */
private fun HealthMetricType.compactLabel(): String = when (this) {
    HealthMetricType.STEPS -> "Steps"
    HealthMetricType.HEART_RATE -> "HR"
    HealthMetricType.SLEEP -> "Sleep"
    HealthMetricType.SPO2 -> "SpO2"
    HealthMetricType.STRESS -> "Stress"
    HealthMetricType.CALORIES -> "Cal"
    HealthMetricType.WEIGHT -> "Weight"
    HealthMetricType.DISTANCE -> "Dist"
    HealthMetricType.EXERCISE_MINUTES -> "Active"
    HealthMetricType.RESTING_HEART_RATE -> "RHR"
    HealthMetricType.HRV -> "HRV"
    HealthMetricType.VO2_MAX -> "VO2max"
}

// ---------------------------------------------------------------- edit feed cards

@Composable
private fun EditFeedCardsDialog(order: List<String>, hidden: Set<String>, onDone: (List<String>, Set<String>) -> Unit, onDismiss: () -> Unit) {
    val items = remember { mutableStateListOf<String>().apply { addAll(order) } }
    val hiddenIds = remember { mutableStateListOf<String>().apply { addAll(hidden) } }
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text(stringResource(R.string.edit_cards_title)) },
        text = {
            Column(Modifier.verticalScroll(rememberScrollState())) {
                items.forEachIndexed { index, id ->
                    val checked = id !in hiddenIds
                    ListItem(
                        modifier = Modifier.testTag("edit_card_$id"),
                        headlineContent = { Text(feedCardTitle(id)) },
                        leadingContent = {
                            Checkbox(
                                checked = checked,
                                onCheckedChange = { show -> if (show) hiddenIds.remove(id) else if (id !in hiddenIds) hiddenIds.add(id) },
                                modifier = Modifier.testTag("toggle_card_$id"),
                            )
                        },
                        trailingContent = {
                            Row {
                                IconButton(
                                    onClick = { items.swap(index, index - 1) },
                                    enabled = index > 0,
                                    modifier = Modifier.testTag("move_up_$id"),
                                ) { Icon(Icons.Outlined.KeyboardArrowUp, contentDescription = stringResource(R.string.move_up)) }
                                IconButton(
                                    onClick = { items.swap(index, index + 1) },
                                    enabled = index < items.lastIndex,
                                    modifier = Modifier.testTag("move_down_$id"),
                                ) { Icon(Icons.Outlined.KeyboardArrowDown, contentDescription = stringResource(R.string.move_down)) }
                            }
                        },
                    )
                }
            }
        },
        confirmButton = {
            TextButton(onClick = { onDone(items.toList(), hiddenIds.toSet()) }, modifier = Modifier.testTag("edit_cards_done")) { Text(stringResource(DesignSystemR.string.action_done)) }
        },
        dismissButton = { TextButton(onClick = onDismiss) { Text(stringResource(DesignSystemR.string.action_cancel)) } },
    )
}

private fun SnapshotStateList<String>.swap(i: Int, j: Int) {
    if (i < 0 || j < 0 || i >= size || j >= size) return
    val t = this[i]
    this[i] = this[j]
    this[j] = t
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
    val date = LocalDate.of(2026, 10, 31)
    val summary = DailyHealthSummary(
        date = date,
        steps = StepsSummary(date, 6_240, 8_000, 4_680.0),
        heartRate = HeartRateSummary(72, 58, 55, 140),
        sleep = null,
        spO2 = null,
        stress = null,
        calories = CaloriesSummary(320, 500),
        activeMinutes = 24,
        activeMinutesGoal = 30,
    )
    UnifiedHealthTheme(dynamicColor = false) {
        HomeScreen(
            state = HomeUiState.Success(
                summary,
                WearableDevice("1", "Demo Watch", "00:11", WearableVendor.GARMIN, batteryPercent = 76, connectionState = ConnectionState.Connected),
            ),
            isRefreshing = false,
            onRefresh = {},
            onMetricClick = {},
            onOpenDevices = {},
        )
    }
}
