package com.unified.health.feature.home

import androidx.compose.foundation.background
import androidx.compose.foundation.selection.toggleable
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
import androidx.compose.material.icons.automirrored.outlined.TrendingDown
import androidx.compose.material.icons.automirrored.outlined.TrendingFlat
import androidx.compose.material.icons.automirrored.outlined.TrendingUp
import androidx.compose.material.icons.outlined.BatteryStd
import androidx.compose.material.icons.outlined.Watch
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.unified.health.core.designsystem.component.ActivityRings
import com.unified.health.core.designsystem.component.ConnectionStatusChip
import com.unified.health.core.designsystem.component.ErrorState
import com.unified.health.core.designsystem.component.LoadingState
import com.unified.health.core.designsystem.component.RingSpec
import com.unified.health.core.designsystem.component.SectionHeader
import com.unified.health.core.designsystem.component.SummaryMetricCard
import com.unified.health.core.designsystem.component.formatValue
import com.unified.health.core.designsystem.component.label
import com.unified.health.core.designsystem.component.unit
import com.unified.health.core.designsystem.theme.Spacing
import com.unified.health.core.designsystem.theme.UnifiedHealthTheme
import com.unified.health.core.domain.usecase.Highlight
import com.unified.health.core.domain.usecase.Trend
import com.unified.health.core.model.CaloriesSummary
import com.unified.health.core.model.ConnectionState
import com.unified.health.core.model.DailyHealthSummary
import com.unified.health.core.model.HealthMetricType
import com.unified.health.core.model.HeartRateSummary
import com.unified.health.core.model.LiveHeartRate
import com.unified.health.core.model.MetricAggregation
import com.unified.health.core.model.MetricReading
import com.unified.health.core.model.StepsSummary
import com.unified.health.core.model.WearableDevice
import com.unified.health.core.model.WearableVendor
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
    onBrowseAll: () -> Unit,
    viewModel: HomeViewModel = hiltViewModel(),
) {
    val state by viewModel.uiState.collectAsStateWithLifecycle()
    val refreshing by viewModel.isRefreshing.collectAsStateWithLifecycle()
    val live by viewModel.liveHeartRate.collectAsStateWithLifecycle()
    HomeScreen(
        state = state,
        liveHeartRate = live,
        isRefreshing = refreshing,
        onRefresh = viewModel::refresh,
        onMetricClick = onMetricClick,
        onOpenDevices = onOpenDevices,
        onBrowseAll = onBrowseAll,
        onPinnedChange = viewModel::setPinned,
    )
}

/** Apple Health's Summary: pinned metrics, activity rings, highlights. */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun HomeScreen(
    state: HomeUiState,
    liveHeartRate: LiveHeartRate? = null,
    isRefreshing: Boolean,
    onRefresh: () -> Unit,
    onMetricClick: (HealthMetricType) -> Unit,
    onOpenDevices: () -> Unit,
    onBrowseAll: () -> Unit = {},
    onPinnedChange: (List<HealthMetricType>) -> Unit = {},
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
                Summary(state, liveHeartRate, onMetricClick, onOpenDevices, onBrowseAll, onPinnedChange)
            }
        }
    }
}

@Composable
private fun Summary(
    state: HomeUiState.Success,
    liveHeartRate: LiveHeartRate?,
    onMetricClick: (HealthMetricType) -> Unit,
    onOpenDevices: () -> Unit,
    onBrowseAll: () -> Unit,
    onPinnedChange: (List<HealthMetricType>) -> Unit,
) {
    var editing by rememberSaveable { mutableStateOf(false) }
    val liveBpm = freshBpm(liveHeartRate)
    LazyColumn(
        modifier = Modifier.fillMaxSize().testTag("summary_list"),
        contentPadding = PaddingValues(start = Spacing.lg, end = Spacing.lg, top = Spacing.sm, bottom = Spacing.xxl),
        verticalArrangement = Arrangement.spacedBy(Spacing.md),
    ) {
        item { DeviceBanner(state.device, state.deviceCount, onOpenDevices) }
        item {
            Row(verticalAlignment = Alignment.CenterVertically) {
                SectionHeader("Pinned", Modifier.weight(1f))
                TextButton(onClick = { editing = true }, modifier = Modifier.testTag("edit_pinned")) { Text("Edit") }
            }
        }
        if (state.pinned.isEmpty()) {
            item { Text("Pin the metrics you care about most.", color = MaterialTheme.colorScheme.onSurfaceVariant) }
        }
        items(state.pinned, key = { it.metric.name }) { pinned ->
            val reading = pinned.reading
            val live = pinned.metric == HealthMetricType.HEART_RATE && liveBpm != null
            SummaryMetricCard(
                metric = pinned.metric,
                value = if (live) liveBpm.toString() else reading?.let { pinned.metric.formatValue(it.value) },
                unit = pinned.metric.unit(),
                timeLabel = if (live) "Live" else reading?.let { timeLabel(pinned.metric, it) },
                onClick = { onMetricClick(pinned.metric) },
                modifier = Modifier.testTag("summary_card_${pinned.metric.name}"),
            )
        }
        item { SectionHeader("Activity") }
        item { RingsCard(state.summary, onClick = { onMetricClick(HealthMetricType.CALORIES) }) }
        if (state.highlights.isNotEmpty()) {
            item { SectionHeader("Highlights") }
            items(state.highlights, key = { "highlight_${it.metric.name}" }) { highlight ->
                HighlightCard(highlight, onClick = { onMetricClick(highlight.metric) })
            }
        }
        item {
            OutlinedButton(onClick = onBrowseAll, modifier = Modifier.fillMaxWidth().testTag("show_all_health_data")) {
                Text("Show all health data")
            }
        }
    }
    if (editing) {
        EditPinnedDialog(
            pinned = state.pinned.map { it.metric },
            onDone = { onPinnedChange(it); editing = false },
            onDismiss = { editing = false },
        )
    }
}

@Composable
private fun EditPinnedDialog(pinned: List<HealthMetricType>, onDone: (List<HealthMetricType>) -> Unit, onDismiss: () -> Unit) {
    val selected = remember { mutableStateListOf<HealthMetricType>().apply { addAll(pinned) } }
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text("Pinned metrics") },
        text = {
            Column(Modifier.verticalScroll(rememberScrollState())) {
                HealthMetricType.entries.filter { it != HealthMetricType.WEIGHT }.forEach { metric ->
                    val checked = metric in selected
                    ListItem(
                        headlineContent = { Text(metric.label()) },
                        // The whole row toggles; the checkbox only mirrors the state.
                        leadingContent = { Checkbox(checked = checked, onCheckedChange = null) },
                        modifier = Modifier
                            .toggleable(value = checked, role = Role.Checkbox) { if (it) selected += metric else selected -= metric }
                            .testTag("pin_${metric.name}"),
                    )
                }
            }
        },
        confirmButton = { TextButton(onClick = { onDone(selected.toList()) }) { Text("Done") } },
        dismissButton = { TextButton(onClick = onDismiss) { Text("Cancel") } },
    )
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

/** "Today 10:42", "Yesterday", "Last night", "Nov 2". */
private fun timeLabel(metric: HealthMetricType, reading: MetricReading): String {
    val zone = ZoneId.systemDefault()
    val time = (reading.endTime ?: reading.time).atZone(zone)
    val today = LocalDate.now(zone)
    val date = time.toLocalDate()
    return when (metric.aggregation) {
        MetricAggregation.CUMULATIVE -> when (reading.time.atZone(zone).toLocalDate()) {
            today -> "Today"
            today.minusDays(1) -> "Yesterday"
            else -> DATE.format(reading.time.atZone(zone))
        }
        MetricAggregation.SLEEP -> if (date == today) "Last night" else DATE.format(time)
        // Resting heart rate is one value per day, stored at midnight: show the day, not "12:00 AM".
        MetricAggregation.DISCRETE -> when {
            metric == HealthMetricType.RESTING_HEART_RATE -> if (date == today) "Today" else DATE.format(time)
            date == today -> TIME.format(time)
            else -> DATE.format(time)
        }
    }
}

private val DATE: DateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)
private val TIME: DateTimeFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)

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
            Icon(Icons.Outlined.Watch, contentDescription = null)
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
                pinned = listOf(PinnedReading(HealthMetricType.STEPS, MetricReading(HealthMetricType.STEPS, 6240.0, Instant.now()))),
            ),
            isRefreshing = false,
            onRefresh = {},
            onMetricClick = {},
            onOpenDevices = {},
        )
    }
}
