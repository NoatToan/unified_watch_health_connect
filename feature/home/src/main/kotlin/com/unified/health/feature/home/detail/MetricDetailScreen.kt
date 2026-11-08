package com.unified.health.feature.home.detail

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.outlined.KeyboardArrowRight
import androidx.compose.material.icons.automirrored.outlined.List
import androidx.compose.material.icons.outlined.Insights
import androidx.compose.material3.Card
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItem
import androidx.compose.material3.ListItemDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SegmentedButton
import androidx.compose.material3.SegmentedButtonDefaults
import androidx.compose.material3.SingleChoiceSegmentedButtonRow
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.unified.health.core.designsystem.component.HealthBarChart
import com.unified.health.core.designsystem.component.HealthRangeChart
import com.unified.health.core.designsystem.component.LoadingState
import com.unified.health.core.designsystem.component.SleepStageChart
import com.unified.health.core.designsystem.component.SleepStageLegend
import com.unified.health.core.designsystem.component.about
import com.unified.health.core.designsystem.component.compactNumber
import com.unified.health.core.designsystem.component.formatValue
import com.unified.health.core.designsystem.component.label
import com.unified.health.core.designsystem.component.unit
import com.unified.health.core.designsystem.theme.MetricValueTextStyle
import com.unified.health.core.designsystem.theme.Spacing
import com.unified.health.core.designsystem.theme.UnifiedHealthTheme
import com.unified.health.core.domain.usecase.StatKind
import com.unified.health.core.model.HealthMetricType
import com.unified.health.core.model.MetricAggregation
import com.unified.health.core.model.TimeRange

@Composable
internal fun MetricDetailRoute(
    onBack: () -> Unit,
    onShowAllData: (HealthMetricType) -> Unit,
    viewModel: MetricDetailViewModel = hiltViewModel(),
) {
    val state by viewModel.uiState.collectAsStateWithLifecycle()
    MetricDetailScreen(state, onBack, viewModel::selectRange, onShowAllData = { onShowAllData(state.metric) })
}

/** Apple Health metric page: D/W/M/6M/Y, header (total / average / range), chart, Show All Data, about. */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun MetricDetailScreen(
    state: MetricDetailUiState,
    onBack: () -> Unit,
    onRangeSelected: (TimeRange) -> Unit,
    onShowAllData: () -> Unit = {},
) {
    val metric = state.metric
    val accent = UnifiedHealthTheme.metricColors.forMetric(metric)
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(metric.label()) },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                    }
                },
            )
        },
    ) { padding ->
        Column(
            modifier = Modifier.fillMaxSize().padding(padding).verticalScroll(rememberScrollState()).padding(horizontal = Spacing.lg),
            verticalArrangement = Arrangement.spacedBy(Spacing.lg),
        ) {
            val ranges = TimeRange.entries
            SingleChoiceSegmentedButtonRow(Modifier.fillMaxWidth().testTag("range_selector")) {
                ranges.forEachIndexed { index, range ->
                    SegmentedButton(
                        selected = state.range == range,
                        onClick = { onRangeSelected(range) },
                        shape = SegmentedButtonDefaults.itemShape(index, ranges.size),
                        icon = {},
                        modifier = Modifier.testTag("range_${range.name}"),
                    ) {
                        Text(range.shortLabel)
                    }
                }
            }
            if (state.isLoading) {
                LoadingState(Modifier.height(240.dp))
                return@Column
            }
            Header(state)
            Card(Modifier.fillMaxWidth().testTag("metric_chart")) {
                Column(Modifier.padding(Spacing.lg)) { Chart(state, accent) }
            }
            // Hourly totals have no meaningful average/min/max; a single night neither.
            state.stats?.takeIf { state.range != TimeRange.DAY || metric.aggregation == MetricAggregation.DISCRETE }?.let { stats ->
                Row(horizontalArrangement = Arrangement.spacedBy(Spacing.md)) {
                    StatCard("Average", metric.formatValue(stats.value), Modifier.weight(1f))
                    StatCard("Min", stats.min?.let(metric::formatValue) ?: "--", Modifier.weight(1f))
                    StatCard("Max", stats.max?.let(metric::formatValue) ?: "--", Modifier.weight(1f))
                }
            }
            state.insight?.let { InsightCard(it, accent) }
            ElevatedCard(Modifier.fillMaxWidth()) {
                ListItem(
                    modifier = Modifier.clickable(onClick = onShowAllData).testTag("show_all_data"),
                    colors = ListItemDefaults.colors(containerColor = Color.Transparent),
                    leadingContent = { Icon(Icons.AutoMirrored.Outlined.List, contentDescription = null) },
                    headlineContent = { Text("Show all data") },
                    trailingContent = { Icon(Icons.AutoMirrored.Outlined.KeyboardArrowRight, contentDescription = null) },
                )
            }
            Column(verticalArrangement = Arrangement.spacedBy(Spacing.xs)) {
                Text("About ${metric.label()}", style = MaterialTheme.typography.titleMedium)
                Text(metric.about(), style = MaterialTheme.typography.bodyMedium, color = MaterialTheme.colorScheme.onSurfaceVariant)
            }
            Spacer(Modifier.height(Spacing.xl))
        }
    }
}

@Composable
private fun Header(state: MetricDetailUiState) {
    val metric = state.metric
    val stats = state.stats
    val kind = when {
        stats == null -> "NO DATA"
        metric.aggregation == MetricAggregation.SLEEP -> if (stats.kind == StatKind.TOTAL) "TIME ASLEEP" else "AVG. TIME ASLEEP"
        stats.kind == StatKind.TOTAL -> "TOTAL"
        stats.kind == StatKind.AVERAGE -> if (metric.aggregation == MetricAggregation.CUMULATIVE) "DAILY AVERAGE" else "AVERAGE"
        else -> "RANGE"
    }
    val value = when {
        stats == null -> "--"
        stats.kind == StatKind.RANGE -> "${metric.formatValue(stats.min ?: stats.value)}–${metric.formatValue(stats.max ?: stats.value)}"
        else -> metric.formatValue(stats.value)
    }
    Column(Modifier.testTag("metric_header").semantics(mergeDescendants = true) { contentDescription = "$kind $value ${metric.unit()} ${state.periodLabel}" }) {
        Text(kind, style = MaterialTheme.typography.labelMedium, color = MaterialTheme.colorScheme.onSurfaceVariant)
        Row(verticalAlignment = Alignment.Bottom) {
            Text(value, style = MetricValueTextStyle)
            if (stats != null && metric.unit().isNotEmpty()) {
                Spacer(Modifier.width(Spacing.xs))
                Text(metric.unit(), style = MaterialTheme.typography.bodyLarge, color = MaterialTheme.colorScheme.onSurfaceVariant, modifier = Modifier.padding(bottom = 4.dp))
            }
        }
        Text(state.periodLabel, style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant)
    }
}

@Composable
private fun Chart(state: MetricDetailUiState, accent: Color) {
    val metric = state.metric
    val axis: (Float) -> String = when (metric) {
        HealthMetricType.DISTANCE -> { v -> compactNumber(v / 1000f) }
        HealthMetricType.SLEEP -> { v -> "${(v / 60).toInt()}h" }
        else -> ::compactNumber
    }
    when {
        metric.aggregation == MetricAggregation.SLEEP && state.range == TimeRange.DAY -> {
            val session = state.sleepSession
            if (session == null) {
                Text("No sleep recorded last night.", color = MaterialTheme.colorScheme.onSurfaceVariant, modifier = Modifier.testTag("sleep_empty"))
            } else {
                SleepStageChart(session, Modifier.testTag("sleep_stage_chart"))
                Spacer(Modifier.height(Spacing.md))
                SleepStageLegend(session)
            }
        }
        metric.aggregation == MetricAggregation.DISCRETE -> HealthRangeChart(state.points, accent, Modifier.testTag("range_chart"), axisLabel = axis)
        else -> HealthBarChart(
            state.points,
            accent,
            Modifier.testTag("bar_chart"),
            average = state.stats?.takeIf { it.kind == StatKind.AVERAGE }?.value?.toFloat(),
            axisLabel = axis,
        )
    }
}

/** One-line analysis, Huawei Health style: week-over-week trend, or this week's own average/range. */
@Composable
private fun InsightCard(insight: String, accent: Color) {
    ElevatedCard(Modifier.fillMaxWidth().testTag("metric_insight")) {
        Row(Modifier.padding(Spacing.lg), verticalAlignment = Alignment.CenterVertically) {
            Icon(Icons.Outlined.Insights, contentDescription = null, tint = accent, modifier = Modifier.size(20.dp))
            Spacer(Modifier.width(Spacing.md))
            Text(insight, style = MaterialTheme.typography.bodyMedium)
        }
    }
}

@Composable
private fun StatCard(label: String, value: String, modifier: Modifier = Modifier) {
    Card(modifier) {
        Column(Modifier.padding(Spacing.md)) {
            Text(label, style = MaterialTheme.typography.labelMedium, color = MaterialTheme.colorScheme.onSurfaceVariant)
            Text(value, style = MaterialTheme.typography.titleMedium)
        }
    }
}
