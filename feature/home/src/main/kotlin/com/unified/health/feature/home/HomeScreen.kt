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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.KeyboardArrowRight
import androidx.compose.material.icons.automirrored.outlined.TrendingDown
import androidx.compose.material.icons.automirrored.outlined.TrendingFlat
import androidx.compose.material.icons.automirrored.outlined.TrendingUp
import androidx.compose.material.icons.automirrored.outlined.ViewList
import androidx.compose.material.icons.outlined.BatteryStd
import androidx.compose.material.icons.outlined.GridView
import androidx.compose.material.icons.outlined.KeyboardArrowDown
import androidx.compose.material.icons.outlined.KeyboardArrowUp
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItem
import androidx.compose.material3.ListItemDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.pulltorefresh.PullToRefreshBox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.unified.health.core.designsystem.component.ActivityRings
import com.unified.health.core.designsystem.component.ConnectionStatusChip
import com.unified.health.core.designsystem.component.ErrorState
import com.unified.health.core.designsystem.component.HealthBarChart
import com.unified.health.core.designsystem.component.HealthRangeChart
import com.unified.health.core.designsystem.component.LiveDot
import com.unified.health.core.designsystem.component.LoadingState
import com.unified.health.core.designsystem.component.RingSpec
import com.unified.health.core.designsystem.component.SectionHeader
import com.unified.health.core.designsystem.component.SleepStageChart
import com.unified.health.core.designsystem.component.SleepStageLegend
import com.unified.health.core.designsystem.component.SummaryMetricCard
import com.unified.health.core.designsystem.component.WatchImage
import com.unified.health.core.designsystem.component.compactNumber
import com.unified.health.core.designsystem.component.formatMinutes
import com.unified.health.core.designsystem.component.formatValue
import com.unified.health.core.designsystem.component.icon
import com.unified.health.core.designsystem.component.label
import com.unified.health.core.designsystem.component.timeLabel
import com.unified.health.core.designsystem.component.unit
import com.unified.health.core.designsystem.theme.MetricValueTextStyle
import com.unified.health.core.designsystem.theme.Spacing
import com.unified.health.core.designsystem.theme.UnifiedHealthTheme
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
import com.unified.health.core.model.SleepSession
import com.unified.health.core.model.StepsSummary
import com.unified.health.core.model.WatchModelMatcher
import com.unified.health.core.model.WearableDevice
import com.unified.health.core.model.WearableVendor
import com.unified.health.core.model.Workout
import com.unified.health.feature.home.insight.metricInsightLine
import kotlinx.coroutines.delay
import java.time.Duration
import java.time.Instant
import java.time.LocalDate
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle

@Composable
internal fun HomeRoute(
    onMetricClick: (HealthMetricType) -> Unit,
    onOpenDevices: () -> Unit,
    onOpenWorkouts: () -> Unit,
    viewModel: HomeViewModel = hiltViewModel(),
) {
    val state by viewModel.uiState.collectAsStateWithLifecycle()
    val refreshing by viewModel.isRefreshing.collectAsStateWithLifecycle()
    val live by viewModel.liveHeartRate.collectAsStateWithLifecycle()
    val liveMetrics by viewModel.liveMetrics.collectAsStateWithLifecycle()
    HomeScreen(
        state = state,
        liveHeartRate = live,
        liveMetrics = liveMetrics,
        isRefreshing = refreshing,
        onRefresh = viewModel::refresh,
        onMetricClick = onMetricClick,
        onOpenDevices = onOpenDevices,
        onOpenWorkouts = onOpenWorkouts,
        onFeedCardsChanged = viewModel::setFeedCards,
        onMetricsViewModeChange = viewModel::setMetricsViewMode,
    )
}

/**
 * Apple Health's Summary merged with the Huawei Health-style flat feed (D-1010): device banner,
 * activity rings, every metric's own card, then highlights — one scrolling list, no separate
 * "Health" tab. The "Pinned" subset was dropped (D-1072): this feed already shows every metric.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun HomeScreen(
    state: HomeUiState,
    liveHeartRate: LiveHeartRate? = null,
    liveMetrics: Set<HealthMetricType> = emptySet(),
    isRefreshing: Boolean,
    onRefresh: () -> Unit,
    onMetricClick: (HealthMetricType) -> Unit,
    onOpenDevices: () -> Unit,
    onOpenWorkouts: () -> Unit = {},
    onFeedCardsChanged: (List<String>, Set<String>) -> Unit = { _, _ -> },
    onMetricsViewModeChange: (HomeMetricsViewMode) -> Unit = {},
) {
    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()
    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = { TopAppBar(title = { Text("Summary") }, scrollBehavior = scrollBehavior) },
    ) { padding ->
        when (state) {
            HomeUiState.Loading -> LoadingState(Modifier.padding(padding))
            is HomeUiState.Error -> ErrorState(state.message, Modifier.padding(padding), onRetry = onRefresh)
            is HomeUiState.Success -> PullToRefreshBox(
                isRefreshing = isRefreshing,
                onRefresh = onRefresh,
                modifier = Modifier.fillMaxSize().padding(padding),
            ) {
                Summary(state, liveHeartRate, liveMetrics, onMetricClick, onOpenDevices, onOpenWorkouts, onFeedCardsChanged, onMetricsViewModeChange)
            }
        }
    }
}

@Composable
private fun Summary(
    state: HomeUiState.Success,
    liveHeartRate: LiveHeartRate?,
    liveMetrics: Set<HealthMetricType>,
    onMetricClick: (HealthMetricType) -> Unit,
    onOpenDevices: () -> Unit,
    onOpenWorkouts: () -> Unit,
    onFeedCardsChanged: (List<String>, Set<String>) -> Unit,
    onMetricsViewModeChange: (HomeMetricsViewMode) -> Unit,
) {
    var editingFeed by rememberSaveable { mutableStateOf(false) }
    // The live bpm (while fresh) used to override the Pinned heart-rate card's value; now that Pinned
    // is gone (D-1072) it overrides the heart-rate feed card's value/timestamp instead, so the "Live"
    // reading is still visible somewhere on Home, next to the green dot (D-1054).
    val liveBpm = freshBpm(liveHeartRate)
    LazyColumn(
        modifier = Modifier.fillMaxSize().testTag("summary_list"),
        contentPadding = PaddingValues(start = Spacing.lg, end = Spacing.lg, top = Spacing.sm, bottom = Spacing.xxl),
        verticalArrangement = Arrangement.spacedBy(Spacing.md),
    ) {
        item { DeviceBanner(state.device, state.deviceCount, onOpenDevices) }
        item { RingsCard(state.summary, onClick = { onMetricClick(HealthMetricType.CALORIES) }) }
        item {
            Row(verticalAlignment = Alignment.CenterVertically) {
                SectionHeader("All metrics", Modifier.weight(1f))
                ViewModeToggle(
                    mode = state.metricsViewMode,
                    onChange = onMetricsViewModeChange,
                    modifier = Modifier.testTag("metrics_view_mode_toggle"),
                )
                TextButton(onClick = { editingFeed = true }, modifier = Modifier.testTag("edit_feed_cards")) { Text("Edit") }
            }
        }
        if (state.feedCards.isEmpty()) {
            item { Text("Every card was hidden. Tap Edit to bring some back.", color = MaterialTheme.colorScheme.onSurfaceVariant, modifier = Modifier.testTag("feed_empty")) }
        }
        when (state.metricsViewMode) {
            HomeMetricsViewMode.LIST -> items(state.feedCards, key = { "feed_${it.id}" }) { card ->
                FeedCard(card, onMetricClick, onOpenWorkouts, liveMetrics, liveBpm, compact = false, modifier = Modifier.testTag("card_${card.id}"))
            }
            // D-1050/1073: 2-column grid — a plain Row per pair (not a nested LazyVerticalGrid, which
            // cannot be sized inside this LazyColumn) keeps the existing per-card composables and
            // "Edit cards" ordering untouched; cards render in their compact (no/tiny chart) form.
            HomeMetricsViewMode.GRID -> items(state.feedCards.chunked(2), key = { pair -> pair.joinToString("_") { it.id } }) { pair ->
                Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(Spacing.md)) {
                    pair.forEach { card ->
                        Box(Modifier.weight(1f)) {
                            FeedCard(card, onMetricClick, onOpenWorkouts, liveMetrics, liveBpm, compact = true, modifier = Modifier.testTag("card_${card.id}"))
                        }
                    }
                    if (pair.size == 1) Spacer(Modifier.weight(1f))
                }
            }
        }
        if (state.highlights.isNotEmpty()) {
            item { SectionHeader("Highlights") }
            items(state.highlights, key = { "highlight_${it.metric.name}" }) { highlight ->
                HighlightCard(highlight, onClick = { onMetricClick(highlight.metric) })
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
            contentDescription = if (target == HomeMetricsViewMode.GRID) "Switch to grid view" else "Switch to list view",
        )
    }
}

/** Dispatches to the Workouts/Metric card, in its full ([compact] = false, List) or compact (Grid) form. */
@Composable
private fun FeedCard(
    card: FeedCardData,
    onMetricClick: (HealthMetricType) -> Unit,
    onOpenWorkouts: () -> Unit,
    liveMetrics: Set<HealthMetricType>,
    liveBpm: Int?,
    compact: Boolean,
    modifier: Modifier = Modifier,
) {
    when (card) {
        is FeedCardData.Workouts -> WorkoutsFeedCard(recent = card.recent, onClick = onOpenWorkouts, compact = compact, modifier = modifier)
        is FeedCardData.Metric -> MetricFeedCard(
            card = card,
            onClick = { onMetricClick(card.metric) },
            modifier = modifier,
            isLive = card.metric.liveDotOrNull(liveMetrics),
            liveBpm = liveBpm.takeIf { card.metric == HealthMetricType.HEART_RATE },
            compact = compact,
        )
    }
}

@Composable
private fun HighlightCard(highlight: Highlight, onClick: () -> Unit) {
    val metric = highlight.metric
    val accent = UnifiedHealthTheme.metricColors.forMetric(metric)
    val recent = metric.formatValue(highlight.recentAverage)
    val unit = metric.unit().let { if (it.isEmpty()) "" else " $it" }
    val verb = if (metric.aggregation == MetricAggregation.SLEEP) "slept" else "averaged"
    val change = when (highlight.trend) {
        Trend.UP -> "${highlight.changePercent}% more than"
        Trend.DOWN -> "${-highlight.changePercent}% less than"
        Trend.STEADY -> "about the same as"
    }
    val perDay = if (metric.aggregation == MetricAggregation.CUMULATIVE) " a day" else ""
    ElevatedCard(onClick = onClick, modifier = Modifier.fillMaxWidth().testTag("highlight_${metric.name}")) {
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
                "Over the last 7 days, you $verb $recent$unit$perDay. That's $change the 7 days before.",
                style = MaterialTheme.typography.bodyMedium,
            )
            ComparisonBar("Last 7 days", highlight.recentAverage, maxOf(highlight.recentAverage, highlight.previousAverage), metric, accent)
            ComparisonBar("Previous 7 days", highlight.previousAverage, maxOf(highlight.recentAverage, highlight.previousAverage), metric, MaterialTheme.colorScheme.outline)
        }
    }
}

@Composable
private fun ComparisonBar(label: String, value: Double, max: Double, metric: HealthMetricType, color: Color) {
    Column {
        Text("$label · ${metric.formatValue(value)} ${metric.unit()}".trim(), style = MaterialTheme.typography.labelMedium, color = MaterialTheme.colorScheme.onSurfaceVariant)
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

@Composable
private fun DeviceBanner(device: WearableDevice?, deviceCount: Int, onOpenDevices: () -> Unit) {
    Card(
        onClick = onOpenDevices,
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.secondaryContainer),
        modifier = Modifier.fillMaxWidth().testTag("device_banner"),
    ) {
        Row(
            modifier = Modifier.padding(Spacing.lg),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            WatchImage(model = remember(device?.vendor, device?.name, device?.model) { device?.let(WatchModelMatcher::match) }, size = 48.dp)
            Spacer(Modifier.width(Spacing.md))
            if (device == null) {
                Column(Modifier.weight(1f)) {
                    Text("No device paired", style = MaterialTheme.typography.titleSmall)
                    Text("Pair a watch of any supported brand to start syncing", style = MaterialTheme.typography.bodySmall)
                }
                FilledTonalButton(onClick = onOpenDevices) { Text("Pair") }
            } else {
                Column(Modifier.weight(1f)) {
                    Text(device.name, style = MaterialTheme.typography.titleSmall)
                    Text(
                        listOfNotNull(
                            device.vendor.displayName,
                            device.batteryPercent?.let { "$it%" },
                            (deviceCount - 1).takeIf { it > 0 }?.let { "+$it more" },
                        ).joinToString(" · "),
                        style = MaterialTheme.typography.bodySmall,
                    )
                }
                ConnectionStatusChip(device.connectionState, onClick = onOpenDevices)
            }
        }
    }
}

@Composable
private fun RingsCard(summary: DailyHealthSummary, onClick: () -> Unit) {
    val colors = UnifiedHealthTheme.metricColors
    val exerciseProgress = (summary.activeMinutes.toFloat() / summary.activeMinutesGoal).coerceIn(0f, 1f)
    val rings = listOf(
        RingSpec("Move", summary.calories.progress, colors.calories),
        RingSpec("Exercise", exerciseProgress, colors.exercise),
        RingSpec("Steps", summary.steps.progress, colors.steps),
    )
    Card(onClick = onClick, modifier = Modifier.fillMaxWidth().testTag("activity_rings")) {
        Row(modifier = Modifier.padding(Spacing.lg), verticalAlignment = Alignment.CenterVertically) {
            ActivityRings(rings = rings, size = 120.dp, strokeWidth = 12.dp)
            Spacer(Modifier.width(Spacing.xl))
            Column(verticalArrangement = Arrangement.spacedBy(Spacing.sm)) {
                RingLegend("Move", "${summary.calories.activeKcal} / ${summary.calories.goalKcal} kcal", colors.calories)
                RingLegend("Exercise", "${summary.activeMinutes} / ${summary.activeMinutesGoal} min", colors.exercise)
                RingLegend("Steps", "${summary.steps.count} / ${summary.steps.goal}", colors.steps)
            }
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
private fun WorkoutsFeedCard(recent: List<Workout>, onClick: () -> Unit, compact: Boolean = false, modifier: Modifier = Modifier) {
    ElevatedCard(onClick = onClick, modifier = modifier.fillMaxWidth()) {
        Column(Modifier.padding(Spacing.lg), verticalArrangement = Arrangement.spacedBy(Spacing.sm)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text("Workouts", style = MaterialTheme.typography.titleSmall, color = UnifiedHealthTheme.metricColors.exercise, modifier = Modifier.weight(1f))
                Icon(Icons.AutoMirrored.Outlined.KeyboardArrowRight, contentDescription = null, tint = MaterialTheme.colorScheme.onSurfaceVariant)
            }
            when {
                recent.isEmpty() -> Text(
                    "No workouts yet. They appear here after your watch syncs one.",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                )
                // Grid (D-1073): just name + value — the count of recent workouts, no per-workout rows.
                compact -> {
                    Text("${recent.size}", style = MetricValueTextStyle)
                    Text(
                        "Last ${recent.first().type.feedLabel().lowercase()}: ${WORKOUT_DATE.format(recent.first().start.atZone(ZoneId.systemDefault()))}",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
                else -> recent.forEach { workout -> WorkoutRow(workout) }
            }
        }
    }
}

@Composable
private fun WorkoutRow(workout: Workout) {
    val accent = UnifiedHealthTheme.metricColors.exercise
    val zone = ZoneId.systemDefault()
    val details = listOfNotNull(
        formatMinutes(workout.duration.toMinutes().toInt()),
        workout.distanceMeters?.takeIf { it > 0 }?.let { String.format(java.util.Locale.getDefault(), "%.2f km", it / 1000.0) },
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

@Composable
private fun MetricFeedCard(
    card: FeedCardData.Metric,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    isLive: Boolean? = null,
    /** Overrides [FeedCardData.Metric.reading] with the live bpm while fresh (D-1054); only ever
     *  non-null for [HealthMetricType.HEART_RATE] — see [FeedCard]. */
    liveBpm: Int? = null,
    /** D-1073: Grid — name + value and a tiny chart only, no resting-bpm/sleep-score/insight lines. */
    compact: Boolean = false,
) {
    val metric = card.metric
    val accent = UnifiedHealthTheme.metricColors.forMetric(metric)
    if (!card.hasData) {
        EmptyMetricCard(metric, accent, onClick, modifier)
        return
    }
    val insight = metricInsightLine(metric, card.highlight, card.weekStats)
    val sleepSession = card.sleepSession
    val value = if (liveBpm != null) liveBpm.toString() else card.reading?.let { metric.formatValue(it.value) }
    val cardTimeLabel = if (liveBpm != null) "Live" else card.reading?.let { timeLabel(metric, it) }
    val description = buildString {
        append(metric.label()).append(", ")
        append(value?.let { "$it ${metric.unit()}".trim() } ?: "no reading today")
        if (!compact) insight?.let { append(", ").append(it) }
        if (isLive != null) append(if (isLive) ", live" else ", not live")
    }
    ElevatedCard(onClick = onClick, modifier = modifier.fillMaxWidth().semantics(mergeDescendants = true) { contentDescription = description }) {
        Column(Modifier.padding(Spacing.lg), verticalArrangement = Arrangement.spacedBy(Spacing.sm)) {
            FeedCardHeader(metric, accent, value, metric.unit(), cardTimeLabel, isLive)
            if (!compact) {
                card.restingBpm?.let {
                    Text("Resting $it bpm", style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant)
                }
                sleepSession?.score?.let {
                    Text("Sleep score $it", style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant)
                }
            }
            MiniChart(metric, card.weekPoints, sleepSession, accent, tiny = compact)
            if (!compact) {
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
private fun FeedCardHeader(metric: HealthMetricType, accent: Color, value: String?, unit: String, timeLabel: String?, isLive: Boolean? = null) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Icon(metric.icon(), contentDescription = null, tint = accent, modifier = Modifier.size(18.dp))
        Spacer(Modifier.width(Spacing.sm))
        Text(metric.label(), style = MaterialTheme.typography.titleSmall, color = accent)
        if (isLive != null) {
            Spacer(Modifier.width(Spacing.xs))
            LiveDot(isLive)
        }
        Spacer(Modifier.weight(1f))
        timeLabel?.let { Text(it, style = MaterialTheme.typography.labelMedium, color = MaterialTheme.colorScheme.onSurfaceVariant) }
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
 *  [tiny] (D-1073 Grid) shrinks it to a small accent visual with no axis labels. */
@Composable
private fun MiniChart(
    metric: HealthMetricType,
    weekPoints: List<ChartPoint>,
    sleepSession: SleepSession?,
    accent: Color,
    tiny: Boolean = false,
) {
    val axis: (Float) -> String = when (metric) {
        HealthMetricType.DISTANCE -> { v -> compactNumber(v / 1000f) }
        else -> ::compactNumber
    }
    val height = if (tiny) 36.dp else 90.dp
    when {
        metric.aggregation == MetricAggregation.SLEEP && sleepSession != null ->
            SleepStageChart(sleepSession, Modifier.testTag("feed_sleep_chart"), height = if (tiny) 48.dp else 110.dp)
        metric.aggregation == MetricAggregation.DISCRETE ->
            HealthRangeChart(weekPoints, accent, Modifier.testTag("feed_mini_range"), height = height, axisLabel = axis)
        else ->
            HealthBarChart(weekPoints, accent, Modifier.testTag("feed_mini_bar"), height = height, axisLabel = axis)
    }
}

/** Compact hint instead of a big empty card, per metric without data. */
@Composable
private fun EmptyMetricCard(metric: HealthMetricType, accent: Color, onClick: () -> Unit, modifier: Modifier = Modifier) {
    ElevatedCard(onClick = onClick, modifier = modifier.fillMaxWidth()) {
        ListItem(
            modifier = Modifier.testTag("feed_empty_${metric.name}"),
            colors = ListItemDefaults.colors(containerColor = Color.Transparent),
            leadingContent = { Icon(metric.icon(), contentDescription = null, tint = accent) },
            headlineContent = { Text(metric.label(), color = accent) },
            supportingContent = { Text("No data yet") },
            trailingContent = { Icon(Icons.AutoMirrored.Outlined.KeyboardArrowRight, contentDescription = null, tint = MaterialTheme.colorScheme.onSurfaceVariant) },
        )
    }
}

// ---------------------------------------------------------------- edit feed cards

@Composable
private fun EditFeedCardsDialog(order: List<String>, hidden: Set<String>, onDone: (List<String>, Set<String>) -> Unit, onDismiss: () -> Unit) {
    val items = remember { mutableStateListOf<String>().apply { addAll(order) } }
    val hiddenIds = remember { mutableStateListOf<String>().apply { addAll(hidden) } }
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text("Edit cards") },
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
                                ) { Icon(Icons.Outlined.KeyboardArrowUp, contentDescription = "Move up") }
                                IconButton(
                                    onClick = { items.swap(index, index + 1) },
                                    enabled = index < items.lastIndex,
                                    modifier = Modifier.testTag("move_down_$id"),
                                ) { Icon(Icons.Outlined.KeyboardArrowDown, contentDescription = "Move down") }
                            }
                        },
                    )
                }
            }
        },
        confirmButton = {
            TextButton(onClick = { onDone(items.toList(), hiddenIds.toSet()) }, modifier = Modifier.testTag("edit_cards_done")) { Text("Done") }
        },
        dismissButton = { TextButton(onClick = onDismiss) { Text("Cancel") } },
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
