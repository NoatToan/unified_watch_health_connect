package com.unified.health.feature.home.feed

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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.KeyboardArrowRight
import androidx.compose.material.icons.outlined.Inbox
import androidx.compose.material.icons.outlined.KeyboardArrowDown
import androidx.compose.material.icons.outlined.KeyboardArrowUp
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItem
import androidx.compose.material3.ListItemDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
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
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.unified.health.core.designsystem.component.ActivityRings
import com.unified.health.core.designsystem.component.EmptyState
import com.unified.health.core.designsystem.component.ErrorState
import com.unified.health.core.designsystem.component.HealthBarChart
import com.unified.health.core.designsystem.component.HealthRangeChart
import com.unified.health.core.designsystem.component.LoadingState
import com.unified.health.core.designsystem.component.RingSpec
import com.unified.health.core.designsystem.component.SleepStageChart
import com.unified.health.core.designsystem.component.SleepStageLegend
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
import com.unified.health.core.model.ChartPoint
import com.unified.health.core.model.DailyHealthSummary
import com.unified.health.core.model.HealthMetricType
import com.unified.health.core.model.MetricAggregation
import com.unified.health.core.model.MetricReading
import com.unified.health.core.model.SleepSession
import com.unified.health.core.model.Workout
import com.unified.health.feature.home.insight.metricInsightLine
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle

@Composable
internal fun FeedRoute(
    onMetricClick: (HealthMetricType) -> Unit,
    onOpenWorkouts: () -> Unit,
    viewModel: FeedViewModel = hiltViewModel(),
) {
    val state by viewModel.uiState.collectAsStateWithLifecycle()
    FeedScreen(state, onMetricClick, onOpenWorkouts, onCardsChanged = viewModel::setFeedCards)
}

/**
 * Health feed (Huawei Health reference): every metric flattened onto one vertically scrolling
 * screen as an inline card — mini chart, one-line analysis — instead of a Browse category menu.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun FeedScreen(
    state: FeedUiState,
    onMetricClick: (HealthMetricType) -> Unit,
    onOpenWorkouts: () -> Unit,
    onCardsChanged: (List<String>, Set<String>) -> Unit = { _, _ -> },
) {
    var editing by rememberSaveable { mutableStateOf(false) }
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Health") },
                actions = {
                    if (state is FeedUiState.Success) {
                        TextButton(onClick = { editing = true }, modifier = Modifier.testTag("edit_feed_cards")) { Text("Edit") }
                    }
                },
            )
        },
    ) { padding ->
        when (state) {
            FeedUiState.Loading -> LoadingState(Modifier.padding(padding))
            is FeedUiState.Error -> ErrorState(state.message, Modifier.padding(padding))
            is FeedUiState.Success -> FeedList(state.cards, onMetricClick, onOpenWorkouts, Modifier.padding(padding))
        }
    }
    if (editing && state is FeedUiState.Success) {
        EditFeedCardsDialog(
            order = state.order,
            hidden = state.hidden,
            onDone = { newOrder, newHidden -> onCardsChanged(newOrder, newHidden); editing = false },
            onDismiss = { editing = false },
        )
    }
}

@Composable
private fun FeedList(
    cards: List<FeedCardData>,
    onMetricClick: (HealthMetricType) -> Unit,
    onOpenWorkouts: () -> Unit,
    modifier: Modifier = Modifier,
) {
    if (cards.isEmpty()) {
        EmptyState(
            title = "No cards to show",
            message = "Every card was hidden. Tap Edit to bring some back.",
            icon = Icons.Outlined.Inbox,
            modifier = modifier.fillMaxSize().testTag("feed_empty"),
        )
        return
    }
    LazyColumn(
        modifier = modifier.fillMaxSize().testTag("feed_list"),
        contentPadding = PaddingValues(start = Spacing.lg, end = Spacing.lg, top = Spacing.sm, bottom = Spacing.xxl),
        verticalArrangement = Arrangement.spacedBy(Spacing.md),
    ) {
        items(cards, key = { it.id }) { card ->
            when (card) {
                is FeedCardData.Activity -> ActivityRingsFeedCard(
                    summary = card.summary,
                    onClick = { onMetricClick(HealthMetricType.CALORIES) },
                    modifier = Modifier.testTag("card_${card.id}"),
                )
                is FeedCardData.Workouts -> WorkoutsFeedCard(
                    recent = card.recent,
                    onClick = onOpenWorkouts,
                    modifier = Modifier.testTag("card_${card.id}"),
                )
                is FeedCardData.Metric -> MetricFeedCard(
                    card = card,
                    onClick = { onMetricClick(card.metric) },
                    modifier = Modifier.testTag("card_${card.id}"),
                )
            }
        }
    }
}

// ---------------------------------------------------------------- cards

@Composable
private fun ActivityRingsFeedCard(summary: DailyHealthSummary, onClick: () -> Unit, modifier: Modifier = Modifier) {
    val colors = UnifiedHealthTheme.metricColors
    val exerciseProgress = (summary.activeMinutes.toFloat() / summary.activeMinutesGoal).coerceIn(0f, 1f)
    val rings = listOf(
        RingSpec("Move", summary.calories.progress, colors.calories),
        RingSpec("Exercise", exerciseProgress, colors.exercise),
        RingSpec("Steps", summary.steps.progress, colors.steps),
    )
    val description = "Activity, ${summary.steps.count} of ${summary.steps.goal} steps, " +
        "${summary.activeMinutes} of ${summary.activeMinutesGoal} exercise minutes, " +
        "${summary.calories.activeKcal} of ${summary.calories.goalKcal} active kilocalories"
    ElevatedCard(onClick = onClick, modifier = modifier.fillMaxWidth().semantics(mergeDescendants = true) { contentDescription = description }) {
        Column(Modifier.padding(Spacing.lg), verticalArrangement = Arrangement.spacedBy(Spacing.md)) {
            Text("Activity", style = MaterialTheme.typography.titleSmall, color = colors.exercise)
            Row(verticalAlignment = Alignment.CenterVertically) {
                ActivityRings(rings = rings, size = 96.dp, strokeWidth = 10.dp)
                Spacer(Modifier.width(Spacing.xl))
                Column(verticalArrangement = Arrangement.spacedBy(Spacing.sm)) {
                    RingLegendRow("Steps", "${summary.steps.count} / ${summary.steps.goal}", colors.steps)
                    RingLegendRow("Exercise", "${summary.activeMinutes} / ${summary.activeMinutesGoal} min", colors.exercise)
                    RingLegendRow("Move", "${summary.calories.activeKcal} / ${summary.calories.goalKcal} kcal", colors.calories)
                }
            }
        }
    }
}

@Composable
private fun RingLegendRow(label: String, value: String, color: Color) {
    Column {
        Text(label, style = MaterialTheme.typography.labelMedium, color = color)
        Text(value, style = MaterialTheme.typography.bodyMedium)
    }
}

@Composable
private fun WorkoutsFeedCard(recent: List<Workout>, onClick: () -> Unit, modifier: Modifier = Modifier) {
    ElevatedCard(onClick = onClick, modifier = modifier.fillMaxWidth()) {
        Column(Modifier.padding(Spacing.lg), verticalArrangement = Arrangement.spacedBy(Spacing.sm)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text("Workouts", style = MaterialTheme.typography.titleSmall, color = UnifiedHealthTheme.metricColors.exercise, modifier = Modifier.weight(1f))
                Icon(Icons.AutoMirrored.Outlined.KeyboardArrowRight, contentDescription = null, tint = MaterialTheme.colorScheme.onSurfaceVariant)
            }
            if (recent.isEmpty()) {
                Text("No workouts yet. They appear here after your watch syncs one.", style = MaterialTheme.typography.bodyMedium, color = MaterialTheme.colorScheme.onSurfaceVariant)
            } else {
                recent.forEach { workout -> WorkoutRow(workout) }
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
private fun MetricFeedCard(card: FeedCardData.Metric, onClick: () -> Unit, modifier: Modifier = Modifier) {
    val metric = card.metric
    val accent = UnifiedHealthTheme.metricColors.forMetric(metric)
    if (!card.hasData) {
        EmptyMetricCard(metric, accent, onClick, modifier)
        return
    }
    val insight = metricInsightLine(metric, card.highlight, card.weekStats)
    val sleepSession = card.sleepSession
    val description = buildString {
        append(metric.label()).append(", ")
        append(card.reading?.let { "${metric.formatValue(it.value)} ${metric.unit()}".trim() } ?: "no reading today")
        insight?.let { append(", ").append(it) }
    }
    ElevatedCard(onClick = onClick, modifier = modifier.fillMaxWidth().semantics(mergeDescendants = true) { contentDescription = description }) {
        Column(Modifier.padding(Spacing.lg), verticalArrangement = Arrangement.spacedBy(Spacing.sm)) {
            FeedCardHeader(metric, accent, card.reading)
            card.restingBpm?.let {
                Text("Resting $it bpm", style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant)
            }
            sleepSession?.score?.let {
                Text("Sleep score $it", style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant)
            }
            MiniChart(metric, card.weekPoints, sleepSession, accent)
            if (metric.aggregation == MetricAggregation.SLEEP && sleepSession != null) {
                SleepStageLegend(sleepSession, Modifier.testTag("feed_sleep_legend"))
            }
            if (insight != null) {
                Text(insight, style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant)
            }
        }
    }
}

@Composable
private fun FeedCardHeader(metric: HealthMetricType, accent: Color, reading: MetricReading?) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Icon(metric.icon(), contentDescription = null, tint = accent, modifier = Modifier.size(18.dp))
        Spacer(Modifier.width(Spacing.sm))
        Text(metric.label(), style = MaterialTheme.typography.titleSmall, color = accent, modifier = Modifier.weight(1f))
        reading?.let { Text(timeLabel(metric, it), style = MaterialTheme.typography.labelMedium, color = MaterialTheme.colorScheme.onSurfaceVariant) }
    }
    Row(verticalAlignment = Alignment.Bottom) {
        Text(reading?.let { metric.formatValue(it.value) } ?: "--", style = MetricValueTextStyle)
        if (reading != null && metric.unit().isNotEmpty()) {
            Spacer(Modifier.width(Spacing.xs))
            Text(
                metric.unit(),
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                modifier = Modifier.padding(bottom = 4.dp),
            )
        }
    }
}

/** Bars for cumulative metrics, min–max capsules for discrete ones, a compact stage bar for sleep. */
@Composable
private fun MiniChart(
    metric: HealthMetricType,
    weekPoints: List<ChartPoint>,
    sleepSession: SleepSession?,
    accent: Color,
) {
    val axis: (Float) -> String = when (metric) {
        HealthMetricType.DISTANCE -> { v -> compactNumber(v / 1000f) }
        else -> ::compactNumber
    }
    when {
        metric.aggregation == MetricAggregation.SLEEP && sleepSession != null ->
            SleepStageChart(sleepSession, Modifier.testTag("feed_sleep_chart"), height = 110.dp)
        metric.aggregation == MetricAggregation.DISCRETE ->
            HealthRangeChart(weekPoints, accent, Modifier.testTag("feed_mini_range"), height = 90.dp, axisLabel = axis)
        else ->
            HealthBarChart(weekPoints, accent, Modifier.testTag("feed_mini_bar"), height = 90.dp, axisLabel = axis)
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

// ---------------------------------------------------------------- edit cards

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
