package com.unified.health.feature.home

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.sizeIn
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
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.CircleShape
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
import androidx.compose.runtime.key
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.clearAndSetSemantics
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.stateDescription
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.unified.health.core.designsystem.component.ActivityRings
import com.unified.health.core.designsystem.component.AppScreen
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
import com.unified.health.core.designsystem.theme.Gaps
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
import com.unified.health.core.model.WeekActivityDay
import com.unified.health.core.model.Workout
import com.unified.health.core.model.distanceUnitLabel
import com.unified.health.core.model.metersToDisplayDistance
import com.unified.health.feature.home.insight.localizedInsightStrings
import com.unified.health.feature.home.insight.metricInsightLine
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.first
import kotlin.math.abs
import java.time.DayOfWeek
import java.time.Duration
import java.time.Instant
import java.time.LocalDate
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle
import java.time.format.TextStyle
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
        onSelectDay = viewModel::selectDay,
        onJumpToToday = viewModel::jumpToToday,
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
    onSelectDay: (LocalDate) -> Unit = {},
    onJumpToToday: () -> Unit = {},
) {
    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()
    val listState = rememberLazyListState()
    // D-1147: DeviceBanner (the full-size device row that used to be list item 0) is gone from Home's
    // body entirely — D-1083/1088's scroll-collapse fraction and D-1143's auto-collapse LaunchedEffect
    // existed only to animate that banner away, so both are deleted outright rather than kept as dead
    // code with nothing left to collapse.
    val device = (state as? HomeUiState.Success)?.device
    val syncState = (state as? HomeUiState.Success)?.syncState ?: SyncState.Idle
    // D-1194: top-level tab (inside the main pager) — bottomClearance clears PillBottomNavigation's
    // floating pill, routed through AppScreen instead of this screen adding it manually.
    AppScreen(
        title = stringResource(R.string.home_title),
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        actions = {
            // D-1147: the only device affordance left on Home — always visible now (no banner left in
            // the body for it to reveal alongside), with a status dot (D-1054's LiveDot) showing
            // whether the device is connected and actively syncing right now.
            if (device != null) {
                DeviceChip(device, syncState, Modifier.testTag("device_chip"))
            }
        },
        topBarScrollBehavior = scrollBehavior,
        bottomClearance = Spacing.bottomNavClearance,
    ) { contentPadding ->
        when (state) {
            HomeUiState.Loading -> LoadingState(Modifier.padding(contentPadding))
            is HomeUiState.Error -> ErrorState(state.message, Modifier.padding(contentPadding), onRetry = onRefresh)
            is HomeUiState.Success -> PullToRefreshBox(
                isRefreshing = isRefreshing,
                onRefresh = onRefresh,
                modifier = Modifier.fillMaxSize(),
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
                    onSelectDay = onSelectDay,
                    onJumpToToday = onJumpToToday,
                    listState = listState,
                    contentPadding = contentPadding,
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
    onSelectDay: (LocalDate) -> Unit,
    onJumpToToday: () -> Unit,
    listState: LazyListState,
    contentPadding: PaddingValues,
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
        // D-1194: contentPadding (AppScreen's own, already including Spacing.bottomNavClearance via
        // HomeScreen's bottomClearance param) merged with Gaps.screenTop (D-1204) — passed straight to the
        // LazyColumn's own contentPadding, never as an outer Modifier.padding, so the list scrolls
        // fully behind the gesture bar instead of stopping in a dead strip above it (D-1144's original
        // bottomNavClearance intent carries over unchanged, just sourced from AppScreen now).
        contentPadding = PaddingValues(
            top = contentPadding.calculateTopPadding() + Gaps.screenTop,
            bottom = contentPadding.calculateBottomPadding(),
        ),
        verticalArrangement = Arrangement.spacedBy(Gaps.itemGap),
    ) {
        // D-1147: DeviceBanner removed entirely from Home's body — the small header chip (TopAppBar
        // actions, DeviceChip below) is now the only device affordance on Home.
        item {
            RingsCard(
                summary = state.selectedDaySummary,
                selectedDate = state.selectedDate,
                onClick = { onMetricClick(HealthMetricType.CALORIES) },
                onJumpToToday = onJumpToToday,
                modifier = Modifier.padding(horizontal = Gaps.screenHorizontal),
            )
        }
        // D-1196/D-1215: always-on "7 mini rings" week strip, directly under the big ring — tapping
        // a day previews it on the big ring above (RingsCard); the strip itself always shows every
        // day's own data regardless of the current selection.
        item {
            WeekRingsStrip(
                week = state.week,
                selectedDate = state.selectedDate,
                onSelectDay = onSelectDay,
                modifier = Modifier.padding(horizontal = Gaps.screenHorizontal),
            )
        }
        item {
            Row(modifier = Modifier.padding(horizontal = Gaps.screenHorizontal), verticalAlignment = Alignment.CenterVertically) {
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
                    modifier = Modifier.padding(horizontal = Gaps.screenHorizontal).testTag("feed_empty"),
                )
            }
        }
        feedCardItems(cardsWithData, state.metricsViewMode, state.unitSystem, onMetricClick, onOpenWorkouts, liveMetrics, liveBpm)
        if (state.highlights.isNotEmpty()) {
            item { SectionHeader(stringResource(R.string.highlights_section_title), Modifier.padding(horizontal = Gaps.screenHorizontal)) }
            items(state.highlights, key = { "highlight_${it.metric.name}" }) { highlight ->
                HighlightCard(highlight, state.unitSystem, onClick = { onMetricClick(highlight.metric) }, modifier = Modifier.padding(horizontal = Gaps.screenHorizontal))
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
            GearEntryCard(onClick = onOpenGear, modifier = Modifier.padding(horizontal = Gaps.screenHorizontal))
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
                    modifier = Modifier.padding(horizontal = Gaps.screenHorizontal),
                )
            } else {
                TrainingEntryCard(onClick = onOpenTraining, modifier = Modifier.padding(horizontal = Gaps.screenHorizontal))
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
            FeedCard(card, unitSystem, onMetricClick, onOpenWorkouts, liveMetrics, liveBpm, compact = false, modifier = Modifier.padding(horizontal = Gaps.screenHorizontal).testTag("card_${card.id}"))
        }
        // D-1050/1073: 2-column grid — a plain Row per pair (not a nested LazyVerticalGrid, which
        // cannot be sized inside this LazyColumn) keeps the existing per-card composables and
        // "Edit cards" ordering untouched; cards render in their compact (no/tiny chart) form.
        // D-1196: `height(IntrinsicSize.Max)` + `fillMaxHeight()` on each card — without it, a row
        // with e.g. a taller "Workouts" card next to a shorter "VO2max" card left the shorter card's
        // own height (and the ElevatedCard's own background) stopping short, a visibly ragged row.
        // D-1204: horizontalArrangement uses Gaps.gridGap (halved from the old Spacing.md) — the
        // outer LazyColumn's own Gaps.itemGap vertical arrangement (see Summary()) already supplies
        // the matching vertical gap between grid rows, so both axes of this 2-column grid are 8dp.
        HomeMetricsViewMode.GRID -> items(cards.chunked(2), key = { pair -> pair.joinToString("_") { it.id } }) { pair ->
            Row(
                Modifier.fillMaxWidth().padding(horizontal = Gaps.screenHorizontal).height(IntrinsicSize.Max),
                horizontalArrangement = Arrangement.spacedBy(Gaps.gridGap),
            ) {
                pair.forEach { card ->
                    Box(Modifier.weight(1f).fillMaxHeight()) {
                        FeedCard(card, unitSystem, onMetricClick, onOpenWorkouts, liveMetrics, liveBpm, compact = true, modifier = Modifier.fillMaxHeight().testTag("card_${card.id}"))
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
        Column(Modifier.padding(Gaps.cardPadding), verticalArrangement = Arrangement.spacedBy(Gaps.cardContentGap)) {
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
                highlightCardBody(stringResource(R.string.highlight_body), verb, recent, unit, perDay, change),
                style = MaterialTheme.typography.bodyMedium,
            )
            ComparisonBar(stringResource(R.string.comparison_last_7_days), highlight.recentAverage, maxOf(highlight.recentAverage, highlight.previousAverage), metric, unitSystem, accent)
            ComparisonBar(stringResource(R.string.comparison_previous_7_days), highlight.previousAverage, maxOf(highlight.recentAverage, highlight.previousAverage), metric, unitSystem, MaterialTheme.colorScheme.outline)
        }
    }
}

/**
 * D-1205: pure composer behind [HighlightCard]'s body sentence — "Over the last 7 days, you
 * averaged 7,606 steps a day. That's 12% more than the 7 days before." Every piece ([template],
 * [verb], [value], [unitSuffix], [perDaySuffix], [change]) is already resolved by the caller (from
 * `stringResource`), so this is a plain JVM-testable format call with no Compose/Android dependency
 * (see `HighlightCardBodyTest`) — it only concatenates them in the right order/positions. The bug
 * this followed from a bare leading space in the `highlight_per_day_suffix` *string resource* being
 * silently trimmed by the Android resource compiler (fixed with an escaped leading space in
 * `strings.xml`), not in this function, but this still guards the sentence's overall shape against
 * a future regression.
 */
internal fun highlightCardBody(
    template: String,
    verb: String,
    value: String,
    unitSuffix: String,
    perDaySuffix: String,
    change: String,
): String = template.format(verb, value, unitSuffix, perDaySuffix, change)

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

/**
 * D-1215: [summary] is now whichever day is selected (see [HomeUiState.Success.selectedDaySummary]),
 * not always today's — [selectedDate] (`null` = today) drives the optional date-label header above
 * the rings and which day's `ActivityRings` instance is composed. Today's own rendering is
 * byte-for-byte unchanged from before this feature: [selectedDate] is `null`, so the header is
 * skipped entirely and [summary] is exactly the same `DailyHealthSummary` passed in previously.
 */
@Composable
private fun RingsCard(
    summary: DailyHealthSummary,
    selectedDate: LocalDate?,
    onClick: () -> Unit,
    onJumpToToday: () -> Unit,
    modifier: Modifier = Modifier,
) {
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
    Column(modifier = modifier.fillMaxWidth()) {
        // D-1215: only shown once a day other than today is selected — the date label + "Today"
        // action to jump back. Absent entirely while viewing today, so there's no extra header row
        // to account for in that (unchanged) case.
        if (selectedDate != null) {
            Row(
                modifier = Modifier.fillMaxWidth().padding(bottom = Spacing.xs),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    selectedDayLabel(selectedDate),
                    style = MaterialTheme.typography.titleSmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    modifier = Modifier.testTag("selected_day_label"),
                )
                TextButton(onClick = onJumpToToday, modifier = Modifier.testTag("jump_to_today")) {
                    Text(stringResource(R.string.selected_day_today_action))
                }
            }
        }
        // D-1157: no background box behind the rings on Home — they sit directly on Home's own
        // background. Surface(color = Color.Transparent) instead of a plain Modifier.clickable so
        // onClick keeps its ripple + semantics/role exactly as the old Card gave it, just with zero
        // fill/elevation of its own to paint.
        Surface(
            onClick = onClick,
            modifier = Modifier.fillMaxWidth().testTag("activity_rings"),
            color = Color.Transparent,
            tonalElevation = 0.dp,
            shadowElevation = 0.dp,
        ) {
            Row(modifier = Modifier.padding(Gaps.cardPadding), verticalAlignment = Alignment.CenterVertically) {
                // D-1215: keyed on the selected day so switching days discards the previous
                // `ActivityRings` composition and starts a fresh one — its own one-shot intro
                // animation (`core:designsystem`, D-1157) then replays from 0 toward the new day's
                // progress instead of silently snapping, reusing that existing animation as-is rather
                // than adding a second one here. Today's own key never changes while just viewing
                // today, so nothing re-animates on every unrelated recomposition (e.g. a live heart
                // rate tick) — only an actual day switch changes this key.
                key(selectedDate) {
                    ActivityRings(rings = rings, size = 120.dp, strokeWidth = 12.dp)
                }
                Spacer(Modifier.width(Spacing.xl))
                Column(verticalArrangement = Arrangement.spacedBy(Gaps.cardContentGap)) {
                    RingLegend(moveLabel, stringResource(R.string.ring_calories_progress, summary.calories.activeKcal, summary.calories.goalKcal), colors.calories)
                    RingLegend(exerciseLabel, stringResource(R.string.ring_minutes_progress, summary.activeMinutes, summary.activeMinutesGoal), colors.exercise)
                    RingLegend(stepsLabel, stringResource(R.string.ring_count_progress, summary.steps.count, summary.steps.goal), colors.steps)
                }
            }
        }
    }
}

/** D-1215: "Thứ 3, 10/11" (VI) / "Tue, Nov 10" (EN) — the big ring's header label for a selected day
 *  other than today. The weekday piece and the overall arg order come from `selected_day_label`
 *  (string resource, differs in shape per locale: VI is pure `dd/mm` numerals, EN needs the month's
 *  short English name) — [monthShortName] is computed here in plain `java.time` (always English,
 *  [Locale.ENGLISH] explicit, independent of the device's locale) since only the EN template
 *  references it; the VI template ignores that argument entirely. */
@Composable
private fun selectedDayLabel(date: LocalDate): String {
    val weekday = selectedDayWeekdayLabel(date.dayOfWeek)
    val monthShortName = date.month.getDisplayName(TextStyle.SHORT, java.util.Locale.ENGLISH)
    return stringResource(R.string.selected_day_label, weekday, date.dayOfMonth, date.monthValue, monthShortName)
}

/** Mon..Sun label for [selectedDayLabel] — deliberately separate string resources from
 *  `week_ring_mon`..`week_ring_sun` (the mini-ring strip's own, ultra-abbreviated "T2".."CN"/"Mon"
 *  .."Sun"): this label has room for "Thứ 3" (VI) rather than "T3", a different wording, not just a
 *  narrower one, so sharing the same resource would force one of the two call sites to compromise. */
@Composable
private fun selectedDayWeekdayLabel(dayOfWeek: DayOfWeek): String = when (dayOfWeek) {
    DayOfWeek.MONDAY -> stringResource(R.string.selected_day_mon)
    DayOfWeek.TUESDAY -> stringResource(R.string.selected_day_tue)
    DayOfWeek.WEDNESDAY -> stringResource(R.string.selected_day_wed)
    DayOfWeek.THURSDAY -> stringResource(R.string.selected_day_thu)
    DayOfWeek.FRIDAY -> stringResource(R.string.selected_day_fri)
    DayOfWeek.SATURDAY -> stringResource(R.string.selected_day_sat)
    DayOfWeek.SUNDAY -> stringResource(R.string.selected_day_sun)
}

/** Mini ring size (D-1205 doubled it to 76dp/6dp stroke; D-1215 shrinks both back down by about a
 *  third per follow-up review — 50dp/4dp — now that the strip also carries a selection outline, so
 *  the previous size read as oversized next to the rest of Home). Still small enough that 4 fit
 *  evenly in one row of equal-width columns across the card width at a 360dp-wide screen, next to a
 *  weekday label below each one). */
private val WEEK_RING_SIZE = 50.dp
private val WEEK_RING_STROKE = 4.dp
private val WEEK_RING_GAP = 1.dp

/** D-1205: every day's ring box — today included — is this exact fixed size, so today's "spotlight"
 *  backdrop (drawn only for [WeekActivityDay.isToday]) never changes the *box's* size and therefore
 *  never shifts the weekday label/dot below it out of alignment with the other six days. Sized a
 *  bit larger than [WEEK_RING_SIZE] so the backdrop still reads as a halo around the ring, while
 *  staying inside one quarter of a 360dp-wide row (minus screen padding). D-1215: shrunk from 80dp to
 *  54dp in proportion with [WEEK_RING_SIZE]'s own shrink; also doubles as the selected-day outline's
 *  own size (see [DayRing]) so the outline hugs this same backdrop boundary. */
private val WEEK_RING_BOX_SIZE = 54.dp

/** D-1215: the 2dp primary outline a *non-today* selected day gets around its ring (distinct from
 *  the "today" backdrop+bold-label+dot marker above, which never moves off today — see
 *  [HomeDaySelection]'s "selection never equals today" invariant). Drawn at [WEEK_RING_BOX_SIZE] so
 *  it sits right at the fixed box's own edge, inside the box — selecting a day never changes the
 *  box/column's own size, only what's painted inside it. */
private val WEEK_RING_SELECTION_OUTLINE_WIDTH = 2.dp

/** Columns per week-ring row (D-1205: split 7 days into two rows of up to 4 equal-width columns —
 *  Mon–Thu, then Fri–Sun left-aligned under the same 4 columns — instead of 7 columns that no
 *  longer fit the doubled ring size on one row). */
private const val WEEK_RING_COLUMNS = 4

/**
 * D-1196: "7 mini rings" week strip, always visible directly under [RingsCard] — one mini version
 * of the same 3 concentric rings (Move/Exercise/Steps, same colors/goals) per day of the *current*
 * calendar week, Monday→Sunday, fixed positions (not a rolling 7-day window — see
 * `ObserveWeekActivitySummaryUseCase`/`WeekRange`, `:core:domain`).
 *
 * D-1215: each non-future day is now tappable — [onSelectDay] previews that day on the big ring
 * above (see [RingsCard]/[HomeViewModel.selectDay]); [selectedDate] (`null` = today) drives the
 * selection outline on exactly one day at a time. Future days stay non-tappable, same as the
 * D-1189 "not clickable at all" baseline this strip started from.
 *
 * D-1205: laid out as two rows of [WEEK_RING_COLUMNS] equal-width columns (Mon–Thu / Fri–Sun) so the
 * doubled ring size still fits a 360dp-wide screen; row 2's 3 days fill the first 3 columns and the
 * 4th is a blank spacer of the same weight, so Fri/Sat/Sun line up directly under Mon/Tue/Wed.
 */
@Composable
private fun WeekRingsStrip(
    week: List<WeekActivityDay>,
    selectedDate: LocalDate?,
    onSelectDay: (LocalDate) -> Unit,
    modifier: Modifier = Modifier,
) {
    if (week.isEmpty()) return
    Column(modifier = modifier.fillMaxWidth().testTag("week_rings_strip"), verticalArrangement = Arrangement.spacedBy(Spacing.sm)) {
        WeekRingsRow(week.take(WEEK_RING_COLUMNS), selectedDate, onSelectDay)
        WeekRingsRow(week.drop(WEEK_RING_COLUMNS), selectedDate, onSelectDay)
    }
}

/** One row of [WeekRingsStrip]: up to [WEEK_RING_COLUMNS] days, each an equal-weight column; any
 *  missing columns (row 2, which only has 3 days) are filled with same-weight blank spacers so the
 *  real items stay aligned under row 1's columns instead of stretching wider or centering. */
@Composable
private fun WeekRingsRow(days: List<WeekActivityDay>, selectedDate: LocalDate?, onSelectDay: (LocalDate) -> Unit) {
    Row(modifier = Modifier.fillMaxWidth()) {
        days.forEach { day ->
            DayRing(
                day = day,
                isSelected = selectedDate == day.summary.date,
                onSelect = onSelectDay,
                modifier = Modifier.weight(1f).testTag("week_ring_day_${day.summary.date}"),
            )
        }
        repeat(WEEK_RING_COLUMNS - days.size) {
            Spacer(modifier = Modifier.weight(1f))
        }
    }
}

/**
 * One day of [WeekRingsStrip]: the mini rings themselves, a weekday label below, and for *today*
 * only — a subtle filled `primaryContainer` backdrop behind the ring plus a bold `primary` label
 * and a small dot underneath, the UX cue that distinguishes "today" from the other 6 (D-1196).
 * Future days render their rings as empty tracks (progress forced to 0) at reduced alpha; past days
 * with no data are already empty tracks at normal alpha as a natural consequence of 0 progress, no
 * special-casing needed.
 *
 * D-1205: the ring `Box` is [WEEK_RING_BOX_SIZE] for every day (today included) and the "today dot"
 * below the label is always laid out, just invisible (`Color.Transparent`) on the other 6 days — on
 * device, today's bigger backdrop circle and the conditionally-present dot were pushing today's
 * label/dot down relative to the rest of the row, since the Box/Column auto-sized to today's larger
 * content. Reserving the same fixed size/space for every day keeps all 4 (or 3) labels in a row on
 * one baseline.
 *
 * D-1215: [isSelected] (always `false` for [WeekActivityDay.isToday] by construction, see
 * [HomeDaySelection]) draws a [WEEK_RING_SELECTION_OUTLINE_WIDTH] primary outline at
 * [WEEK_RING_BOX_SIZE] — inside the same fixed box, so it never changes the column's own
 * size/baseline, same rationale as the today backdrop above. The column is a
 * [androidx.compose.foundation.selection.selectable] ([Role.Tab], disabled — no ripple, no click —
 * for [WeekActivityDay.isFuture]) wrapping the existing `clearAndSetSemantics` block: `selectable`'s
 * own node (role/selected/click action, `mergeDescendants = true`) sits as the *ancestor* of this
 * block in the modifier chain, so accessibility services still get one single merged node — role,
 * selected state, the click action, *and* this block's [stateDescription]/[contentDescription] — the
 * Canvas's own per-ring semantics stay cleared/replaced exactly as before (D-1196).
 */
@Composable
private fun DayRing(day: WeekActivityDay, isSelected: Boolean, onSelect: (LocalDate) -> Unit, modifier: Modifier = Modifier) {
    val colors = UnifiedHealthTheme.metricColors
    val summary = day.summary
    val exerciseProgress = if (summary.activeMinutesGoal > 0) {
        (summary.activeMinutes.toFloat() / summary.activeMinutesGoal).coerceIn(0f, 1f)
    } else {
        0f
    }
    // D-1196: future days show empty tracks only — progress forced to 0 regardless of whatever the
    // repository happens to return for a date that hasn't happened yet.
    val rings = listOf(
        RingSpec("", if (day.isFuture) 0f else summary.calories.progress, colors.calories),
        RingSpec("", if (day.isFuture) 0f else exerciseProgress, colors.exercise),
        RingSpec("", if (day.isFuture) 0f else summary.steps.progress, colors.steps),
    )
    val weekdayLabel = weekdayShortLabel(summary.date.dayOfWeek)
    // Unchanged (D-1215 brief: contentDescription stays as-is) — only the new stateDescription below
    // is additive.
    val description = stringResource(
        R.string.week_ring_description,
        weekdayLabel,
        summary.calories.activeKcal,
        summary.calories.goalKcal,
        summary.activeMinutes,
        summary.activeMinutesGoal,
        summary.steps.count,
        summary.steps.goal,
    ) + if (day.isToday) stringResource(R.string.week_ring_today_suffix) else ""
    // D-1215: "Today"/"Hôm nay" for today, "Selected"/"Đã chọn" for a selected non-today day, absent
    // otherwise — the two states this requirement asks for, read out via `stateDescription` rather
    // than folded into [description] so TalkBack announces them as the item's *state*, not its name.
    val todayStateLabel = stringResource(R.string.selected_day_today_action)
    val selectedStateLabel = stringResource(R.string.week_ring_state_selected)
    val stateDescriptionText = when {
        day.isToday -> todayStateLabel
        isSelected -> selectedStateLabel
        else -> null
    }

    Column(
        modifier = modifier
            .sizeIn(minWidth = Spacing.minTouchTarget, minHeight = Spacing.minTouchTarget)
            .selectable(selected = isSelected, enabled = !day.isFuture, role = Role.Tab, onClick = { onSelect(day.summary.date) })
            // D-1196: the whole day (ring + label) is one merged accessibility node with the full
            // description — the Canvas's own per-ring semantics (ActivityRings) are cleared/replaced here.
            .clearAndSetSemantics {
                contentDescription = description
                stateDescriptionText?.let { stateDescription = it }
            }
            .alpha(if (day.isFuture) WEEK_RING_FUTURE_ALPHA else 1f),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Box(modifier = Modifier.size(WEEK_RING_BOX_SIZE), contentAlignment = Alignment.Center) {
            if (day.isToday) {
                Box(
                    modifier = Modifier
                        .size(WEEK_RING_BOX_SIZE)
                        .clip(CircleShape)
                        .background(MaterialTheme.colorScheme.primaryContainer),
                )
            }
            if (isSelected) {
                Box(
                    modifier = Modifier
                        .size(WEEK_RING_BOX_SIZE)
                        .border(WEEK_RING_SELECTION_OUTLINE_WIDTH, MaterialTheme.colorScheme.primary, CircleShape),
                )
            }
            ActivityRings(rings = rings, size = WEEK_RING_SIZE, strokeWidth = WEEK_RING_STROKE, gap = WEEK_RING_GAP)
        }
        Spacer(Modifier.height(Spacing.xs))
        Text(
            weekdayLabel,
            style = MaterialTheme.typography.labelSmall,
            color = if (day.isToday) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurfaceVariant,
            fontWeight = if (day.isToday) FontWeight.Bold else FontWeight.Normal,
        )
        Spacer(Modifier.height(Spacing.xs))
        Box(
            modifier = Modifier
                .size(4.dp)
                .clip(CircleShape)
                .background(if (day.isToday) MaterialTheme.colorScheme.primary else Color.Transparent),
        )
    }
}

private const val WEEK_RING_FUTURE_ALPHA = 0.4f

/** Mon..Sun short weekday label, localized EN/VI via string resources (D-1192). */
@Composable
private fun weekdayShortLabel(dayOfWeek: DayOfWeek): String = when (dayOfWeek) {
    DayOfWeek.MONDAY -> stringResource(R.string.week_ring_mon)
    DayOfWeek.TUESDAY -> stringResource(R.string.week_ring_tue)
    DayOfWeek.WEDNESDAY -> stringResource(R.string.week_ring_wed)
    DayOfWeek.THURSDAY -> stringResource(R.string.week_ring_thu)
    DayOfWeek.FRIDAY -> stringResource(R.string.week_ring_fri)
    DayOfWeek.SATURDAY -> stringResource(R.string.week_ring_sat)
    DayOfWeek.SUNDAY -> stringResource(R.string.week_ring_sun)
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
    Column(verticalArrangement = Arrangement.spacedBy(Gaps.itemGap)) {
        Row(modifier = Modifier.padding(horizontal = Gaps.screenHorizontal), verticalAlignment = Alignment.CenterVertically) {
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
            horizontalArrangement = Arrangement.spacedBy(Gaps.itemGap),
            // Same Gaps.screenHorizontal as every other item's own inset (above, and in feedCardItems/
            // DeviceBanner/RingsCard/etc.) — the first/last card lines up with them at rest, while the
            // row itself spans the full screen width so scrolling reaches the true edge on either side.
            contentPadding = PaddingValues(horizontal = Gaps.screenHorizontal),
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
        Row(Modifier.padding(Gaps.cardPadding).fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
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
        Row(Modifier.padding(Gaps.cardPadding).fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
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
        Row(Modifier.padding(Gaps.cardPadding).fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
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
        Column(Modifier.padding(Gaps.cardPadding), verticalArrangement = Arrangement.spacedBy(Gaps.cardContentGap)) {
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
        Column(Modifier.padding(Gaps.cardPadding), verticalArrangement = Arrangement.spacedBy(Gaps.cardContentGap)) {
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
