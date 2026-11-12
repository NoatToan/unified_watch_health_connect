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
import androidx.compose.material3.ListItem
import androidx.compose.material3.ListItemDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SegmentedButton
import androidx.compose.material3.SegmentedButtonDefaults
import androidx.compose.material3.SingleChoiceSegmentedButtonRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.unified.health.core.designsystem.component.AppScreen
import com.unified.health.core.designsystem.component.HealthBarChart
import com.unified.health.core.designsystem.component.HealthRangeChart
import com.unified.health.core.designsystem.component.LoadingState
import com.unified.health.core.designsystem.component.SleepStageChart
import com.unified.health.core.designsystem.component.SleepStageLegend
import com.unified.health.core.designsystem.component.about
import com.unified.health.core.designsystem.component.compactNumber
import com.unified.health.core.designsystem.component.formatValueLocalized
import com.unified.health.core.designsystem.component.label
import com.unified.health.core.designsystem.component.unit
import com.unified.health.core.designsystem.theme.Gaps
import com.unified.health.core.designsystem.theme.MetricValueTextStyle
import com.unified.health.core.designsystem.theme.Spacing
import com.unified.health.core.designsystem.theme.UnifiedHealthTheme
import com.unified.health.core.domain.usecase.StatKind
import com.unified.health.core.model.HealthMetricType
import com.unified.health.core.model.MetricAggregation
import com.unified.health.core.model.TimeRange
import com.unified.health.core.model.metersToDisplayDistance
import com.unified.health.feature.home.R
import com.unified.health.feature.home.insight.localizedInsightStrings
import com.unified.health.feature.home.insight.metricInsightLine
import com.unified.health.core.designsystem.R as DesignSystemR

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
    AppScreen(title = metric.label(), onBack = onBack) { contentPadding ->
        // D-1194: contentPadding chained AFTER verticalScroll — the "about" card at the end of the
        // scrollable content scrolls fully behind the gesture bar instead of a dead strip above it.
        Column(
            modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState()).padding(contentPadding).padding(horizontal = Gaps.screenHorizontal),
            verticalArrangement = Arrangement.spacedBy(Gaps.sectionGap),
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
                Column(Modifier.padding(Gaps.cardPadding)) { Chart(state, accent) }
            }
            // Hourly totals have no meaningful average/min/max; a single night neither.
            state.stats?.takeIf { state.range != TimeRange.DAY || metric.aggregation == MetricAggregation.DISCRETE }?.let { stats ->
                Row(horizontalArrangement = Arrangement.spacedBy(Gaps.gridGap)) {
                    StatCard(stringResource(R.string.metric_stat_average), metric.formatValueLocalized(stats.value, unitSystem = state.unitSystem), Modifier.weight(1f))
                    StatCard(stringResource(R.string.metric_stat_min), stats.min?.let { metric.formatValueLocalized(it, unitSystem = state.unitSystem) } ?: "--", Modifier.weight(1f))
                    StatCard(stringResource(R.string.metric_stat_max), stats.max?.let { metric.formatValueLocalized(it, unitSystem = state.unitSystem) } ?: "--", Modifier.weight(1f))
                }
            }
            // D-1040: composed here, not in the ViewModel, since localizing it needs stringResource.
            val insight = metricInsightLine(metric, state.insightHighlight, state.insightWeekStats, state.unitSystem, localizedInsightStrings())
            insight?.let { InsightCard(it, accent) }
            ElevatedCard(Modifier.fillMaxWidth()) {
                ListItem(
                    modifier = Modifier.clickable(onClick = onShowAllData).testTag("show_all_data"),
                    colors = ListItemDefaults.colors(containerColor = Color.Transparent),
                    leadingContent = { Icon(Icons.AutoMirrored.Outlined.List, contentDescription = null) },
                    headlineContent = { Text(stringResource(R.string.show_all_data)) },
                    trailingContent = { Icon(Icons.AutoMirrored.Outlined.KeyboardArrowRight, contentDescription = null) },
                )
            }
            Column(verticalArrangement = Arrangement.spacedBy(Gaps.cardContentGap)) {
                Text(stringResource(R.string.about_metric, metric.label()), style = MaterialTheme.typography.titleMedium)
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
        stats == null -> stringResource(R.string.metric_kind_no_data)
        metric.aggregation == MetricAggregation.SLEEP ->
            if (stats.kind == StatKind.TOTAL) stringResource(R.string.metric_kind_time_asleep) else stringResource(R.string.metric_kind_avg_time_asleep)
        stats.kind == StatKind.TOTAL -> stringResource(R.string.metric_kind_total)
        stats.kind == StatKind.AVERAGE ->
            if (metric.aggregation == MetricAggregation.CUMULATIVE) stringResource(R.string.metric_kind_daily_average) else stringResource(R.string.metric_kind_average)
        else -> stringResource(R.string.metric_kind_range)
    }
    val unitSystem = state.unitSystem
    val value = when {
        stats == null -> "--"
        stats.kind == StatKind.RANGE -> "${metric.formatValueLocalized(stats.min ?: stats.value, unitSystem = unitSystem)}–${metric.formatValueLocalized(stats.max ?: stats.value, unitSystem = unitSystem)}"
        else -> metric.formatValueLocalized(stats.value, unitSystem = unitSystem)
    }
    Column(Modifier.testTag("metric_header").semantics(mergeDescendants = true) { contentDescription = "$kind $value ${metric.unit(unitSystem)} ${state.periodLabel}" }) {
        Text(kind, style = MaterialTheme.typography.labelMedium, color = MaterialTheme.colorScheme.onSurfaceVariant)
        Row(verticalAlignment = Alignment.Bottom) {
            Text(value, style = MetricValueTextStyle)
            if (stats != null && metric.unit(unitSystem).isNotEmpty()) {
                Spacer(Modifier.width(Spacing.xs))
                Text(metric.unit(unitSystem), style = MaterialTheme.typography.bodyLarge, color = MaterialTheme.colorScheme.onSurfaceVariant, modifier = Modifier.padding(bottom = Spacing.xs))
            }
        }
        Text(state.periodLabel, style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant)
    }
}

@Composable
private fun Chart(state: MetricDetailUiState, accent: Color) {
    val metric = state.metric
    val axis: (Float) -> String = when (metric) {
        HealthMetricType.DISTANCE -> { v -> compactNumber(v.toDouble().metersToDisplayDistance(state.unitSystem).toFloat()) }
        HealthMetricType.SLEEP -> { v -> "${(v / 60).toInt()}h" }
        else -> ::compactNumber
    }
    when {
        metric.aggregation == MetricAggregation.SLEEP && state.range == TimeRange.DAY -> {
            val session = state.sleepSession
            if (session == null) {
                Text(stringResource(R.string.sleep_empty), color = MaterialTheme.colorScheme.onSurfaceVariant, modifier = Modifier.testTag("sleep_empty"))
            } else {
                SleepStageChart(session, Modifier.testTag("sleep_stage_chart"))
                Spacer(Modifier.height(Gaps.cardContentGap))
                SleepStageLegend(session)
            }
        }
        metric.aggregation == MetricAggregation.DISCRETE -> HealthRangeChart(
            state.points,
            accent,
            Modifier.testTag("range_chart"),
            axisLabel = axis,
            // D-1094: a trend is only meaningful over a longer window than a single Day of points.
            showTrend = state.range != TimeRange.DAY,
        )
        else -> HealthBarChart(
            state.points,
            accent,
            Modifier.testTag("bar_chart"),
            average = state.stats?.takeIf { it.kind == StatKind.AVERAGE }?.value?.toFloat(),
            axisLabel = axis,
            showTrend = state.range != TimeRange.DAY,
        )
    }
}

/** One-line analysis, Huawei Health style: week-over-week trend, or this week's own average/range. */
@Composable
private fun InsightCard(insight: String, accent: Color) {
    ElevatedCard(Modifier.fillMaxWidth().testTag("metric_insight")) {
        Row(Modifier.padding(Gaps.cardPadding), verticalAlignment = Alignment.CenterVertically) {
            Icon(Icons.Outlined.Insights, contentDescription = null, tint = accent, modifier = Modifier.size(20.dp))
            Spacer(Modifier.width(Spacing.md))
            Text(insight, style = MaterialTheme.typography.bodyMedium)
        }
    }
}

@Composable
private fun StatCard(label: String, value: String, modifier: Modifier = Modifier) {
    Card(modifier) {
        Column(Modifier.padding(Gaps.cardPadding)) {
            Text(label, style = MaterialTheme.typography.labelMedium, color = MaterialTheme.colorScheme.onSurfaceVariant)
            Text(value, style = MaterialTheme.typography.titleMedium)
        }
    }
}
