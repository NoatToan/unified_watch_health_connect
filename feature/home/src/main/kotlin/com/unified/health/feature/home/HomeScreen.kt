package com.unified.health.feature.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.BatteryStd
import androidx.compose.material.icons.outlined.Watch
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.pulltorefresh.PullToRefreshBox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.unified.health.core.designsystem.component.ActivityRings
import com.unified.health.core.designsystem.component.ConnectionStatusChip
import com.unified.health.core.designsystem.component.ErrorState
import com.unified.health.core.designsystem.component.LoadingState
import com.unified.health.core.designsystem.component.MetricCard
import com.unified.health.core.designsystem.component.RingSpec
import com.unified.health.core.designsystem.theme.Spacing
import com.unified.health.core.designsystem.theme.UnifiedHealthTheme
import com.unified.health.core.model.CaloriesSummary
import com.unified.health.core.model.ConnectionState
import com.unified.health.core.model.DailyHealthSummary
import com.unified.health.core.model.HealthMetricType
import com.unified.health.core.model.HeartRateSummary
import com.unified.health.core.model.SpO2Reading
import com.unified.health.core.model.StepsSummary
import com.unified.health.core.model.StressReading
import com.unified.health.core.model.WearableDevice
import com.unified.health.core.model.WearableVendor
import java.text.NumberFormat
import java.time.Duration
import java.time.Instant
import com.unified.health.core.model.LiveHeartRate
import kotlinx.coroutines.delay
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import java.time.LocalDate

@Composable
internal fun HomeRoute(
    onMetricClick: (HealthMetricType) -> Unit,
    onOpenDevices: () -> Unit,
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
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun HomeScreen(
    state: HomeUiState,
    liveHeartRate: LiveHeartRate? = null,
    isRefreshing: Boolean,
    onRefresh: () -> Unit,
    onMetricClick: (HealthMetricType) -> Unit,
    onOpenDevices: () -> Unit,
) {
    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()
    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = { TopAppBar(title = { Text("Today") }, scrollBehavior = scrollBehavior) },
    ) { padding ->
        when (state) {
            HomeUiState.Loading -> LoadingState(Modifier.padding(padding))
            is HomeUiState.Error -> ErrorState(state.message, Modifier.padding(padding), onRetry = onRefresh)
            is HomeUiState.Success -> PullToRefreshBox(
                isRefreshing = isRefreshing,
                onRefresh = onRefresh,
                modifier = Modifier.fillMaxSize().padding(padding),
            ) {
                Dashboard(state.summary, state.device, liveHeartRate, onMetricClick, onOpenDevices)
            }
        }
    }
}

@Composable
private fun Dashboard(
    summary: DailyHealthSummary,
    device: WearableDevice?,
    liveHeartRate: LiveHeartRate?,
    onMetricClick: (HealthMetricType) -> Unit,
    onOpenDevices: () -> Unit,
) {
    val liveBpm = freshBpm(liveHeartRate)
    val nf = NumberFormat.getIntegerInstance()
    LazyVerticalGrid(
        columns = GridCells.Adaptive(minSize = 160.dp),
        contentPadding = PaddingValues(Spacing.lg),
        horizontalArrangement = Arrangement.spacedBy(Spacing.md),
        verticalArrangement = Arrangement.spacedBy(Spacing.md),
        modifier = Modifier.fillMaxSize(),
    ) {
        item(span = { GridItemSpan(maxLineSpan) }) { DeviceBanner(device, onOpenDevices) }
        item(span = { GridItemSpan(maxLineSpan) }) { RingsCard(summary) }
        item {
            MetricCard(
                metric = HealthMetricType.STEPS,
                value = nf.format(summary.steps.count),
                unit = "steps",
                progress = summary.steps.progress,
                supportingText = "Goal ${nf.format(summary.steps.goal)}",
                onClick = { onMetricClick(HealthMetricType.STEPS) },
            )
        }
        item {
            MetricCard(
                metric = HealthMetricType.HEART_RATE,
                value = (liveBpm ?: summary.heartRate.latestBpm)?.toString() ?: "--",
                unit = "bpm",
                supportingText = if (liveBpm != null) "Live" else summary.heartRate.restingBpm?.let { "Resting $it bpm" },
                onClick = { onMetricClick(HealthMetricType.HEART_RATE) },
            )
        }
        item {
            val sleep = summary.sleep
            MetricCard(
                metric = HealthMetricType.SLEEP,
                value = sleep?.let { "${it.totalDuration.toHours()}h ${it.totalDuration.toMinutes() % 60}m" } ?: "--",
                unit = "",
                supportingText = sleep?.score?.let { "Score $it" },
                onClick = { onMetricClick(HealthMetricType.SLEEP) },
            )
        }
        item {
            MetricCard(
                metric = HealthMetricType.SPO2,
                value = summary.spO2?.percent?.toString() ?: "--",
                unit = "%",
                onClick = { onMetricClick(HealthMetricType.SPO2) },
            )
        }
        item {
            MetricCard(
                metric = HealthMetricType.STRESS,
                value = summary.stress?.score?.toString() ?: "--",
                unit = "",
                supportingText = summary.stress?.level?.name?.lowercase()?.replaceFirstChar { it.uppercase() },
                onClick = { onMetricClick(HealthMetricType.STRESS) },
            )
        }
        item {
            MetricCard(
                metric = HealthMetricType.CALORIES,
                value = nf.format(summary.calories.activeKcal),
                unit = "kcal",
                progress = summary.calories.progress,
                supportingText = "Goal ${summary.calories.goalKcal} kcal",
                onClick = { onMetricClick(HealthMetricType.CALORIES) },
            )
        }
    }
}

/** The live reading when it is recent; re-evaluated every few seconds so it expires without new data. */
@Composable
private fun freshBpm(live: LiveHeartRate?): Int? {
    var now by remember { mutableStateOf(Instant.now()) }
    LaunchedEffect(live) {
        while (live != null) {
            now = Instant.now()
            delay(LIVE_STALE_CHECK_MS)
        }
    }
    return live?.takeIf { Duration.between(it.time, now) <= LIVE_MAX_AGE }?.bpm
}

private val LIVE_MAX_AGE: Duration = Duration.ofSeconds(15)
private const val LIVE_STALE_CHECK_MS = 5_000L

@Composable
private fun DeviceBanner(device: WearableDevice?, onOpenDevices: () -> Unit) {
    Card(
        onClick = onOpenDevices,
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.secondaryContainer),
        modifier = Modifier.fillMaxWidth(),
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
                    Text("Showing demo data", style = MaterialTheme.typography.bodySmall)
                }
                FilledTonalButton(onClick = onOpenDevices) { Text("Pair") }
            } else {
                Column(Modifier.weight(1f)) {
                    Text(device.name, style = MaterialTheme.typography.titleSmall)
                    device.batteryPercent?.let {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(Icons.Outlined.BatteryStd, contentDescription = null, modifier = Modifier.size(16.dp))
                            Text("$it%", style = MaterialTheme.typography.bodySmall)
                        }
                    }
                }
                ConnectionStatusChip(device.connectionState, onClick = onOpenDevices)
            }
        }
    }
}

@Composable
private fun RingsCard(summary: DailyHealthSummary) {
    val colors = UnifiedHealthTheme.metricColors
    val activeProgress = (summary.activeMinutes.toFloat() / summary.activeMinutesGoal).coerceIn(0f, 1f)
    val rings = listOf(
        RingSpec("Steps", summary.steps.progress, colors.steps),
        RingSpec("Active minutes", activeProgress, colors.heartRate),
        RingSpec("Calories", summary.calories.progress, colors.calories),
    )
    Card(modifier = Modifier.fillMaxWidth()) {
        Row(modifier = Modifier.padding(Spacing.lg), verticalAlignment = Alignment.CenterVertically) {
            ActivityRings(rings = rings, size = 120.dp, strokeWidth = 12.dp)
            Spacer(Modifier.width(Spacing.xl))
            Column(verticalArrangement = Arrangement.spacedBy(Spacing.sm)) {
                Text("Daily goals", style = MaterialTheme.typography.titleMedium)
                RingLegend("Steps", "${summary.steps.count} / ${summary.steps.goal}", colors.steps)
                RingLegend("Active", "${summary.activeMinutes} / ${summary.activeMinutesGoal} min", colors.heartRate)
                RingLegend("Calories", "${summary.calories.activeKcal} / ${summary.calories.goalKcal} kcal", colors.calories)
            }
        }
    }
}

@Composable
private fun RingLegend(label: String, value: String, color: androidx.compose.ui.graphics.Color) {
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
        spO2 = SpO2Reading(Instant.EPOCH, 97),
        stress = StressReading(Instant.EPOCH, 35),
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
