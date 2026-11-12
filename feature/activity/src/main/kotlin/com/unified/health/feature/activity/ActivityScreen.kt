package com.unified.health.feature.activity

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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.KeyboardArrowRight
import androidx.compose.material.icons.outlined.SportsScore
import androidx.compose.material.icons.automirrored.outlined.TrendingDown
import androidx.compose.material.icons.automirrored.outlined.TrendingFlat
import androidx.compose.material.icons.automirrored.outlined.TrendingUp
import androidx.compose.material.icons.outlined.Insights
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.ListItemDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
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
import com.unified.health.core.designsystem.component.EmptyState
import com.unified.health.core.designsystem.component.ErrorState
import com.unified.health.core.designsystem.component.HealthBarChart
import com.unified.health.core.designsystem.component.LoadingState
import com.unified.health.core.designsystem.component.SectionHeader
import com.unified.health.core.designsystem.component.StatTile
import com.unified.health.core.designsystem.component.formatMinutes
import com.unified.health.core.designsystem.theme.MetricValueTextStyle
import com.unified.health.core.designsystem.theme.Spacing
import com.unified.health.core.designsystem.theme.UnifiedHealthTheme
import com.unified.health.core.domain.usecase.ActivityLoadCalculator
import com.unified.health.core.domain.usecase.ActivityLoadSummary
import com.unified.health.core.domain.usecase.LoadTrend
import com.unified.health.core.model.ChartPoint
import com.unified.health.core.model.UnitSystem
import com.unified.health.core.model.Workout
import com.unified.health.core.model.distanceUnitLabel
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle
import kotlin.math.roundToInt

@Composable
internal fun ActivityRoute(onWorkoutClick: (String) -> Unit, viewModel: ActivityViewModel = hiltViewModel()) {
    val state by viewModel.uiState.collectAsStateWithLifecycle()
    ActivityScreen(state, onWorkoutClick)
}

/** Activity tab: weekly activity load (generic, D-805) on top, then every workout grouped by month. */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun ActivityScreen(state: ActivityUiState, onWorkoutClick: (String) -> Unit) {
    Scaffold(topBar = { TopAppBar(title = { Text(stringResource(R.string.activity_title)) }) }) { padding ->
        when (state) {
            ActivityUiState.Loading -> LoadingState(Modifier.padding(padding))
            is ActivityUiState.Error -> ErrorState(state.message, Modifier.padding(padding))
            ActivityUiState.Empty -> EmptyState(
                title = stringResource(R.string.workouts_empty_title),
                message = stringResource(R.string.workouts_empty_message),
                icon = Icons.Outlined.SportsScore,
                modifier = Modifier.padding(padding).testTag("workouts_empty"),
            )
            // D-1144: bottom clearance is Spacing.bottomNavClearance (was Spacing.xxl) — the pill nav
            // now floats as a Box overlay over this tab's content instead of reserving Scaffold space.
            is ActivityUiState.Success -> LazyColumn(
                modifier = Modifier.fillMaxSize().padding(padding).testTag("activity_list"),
                contentPadding = PaddingValues(start = Spacing.lg, end = Spacing.lg, top = Spacing.sm, bottom = Spacing.bottomNavClearance),
                verticalArrangement = Arrangement.spacedBy(Spacing.sm),
            ) {
                item(key = "load") { ActivityLoadCard(state.load, state.unitSystem) }
                // Stable, list-wide positions for test tags (newest workout = 0).
                val positions = state.months.flatMap { it.workouts }.withIndex().associate { it.value.id to it.index }
                state.months.forEach { month ->
                    item(key = "month_${month.month}") {
                        SectionHeader(MONTH.format(month.month), Modifier.padding(top = Spacing.md, bottom = Spacing.xs))
                    }
                    items(month.workouts, key = { it.id }) { workout ->
                        WorkoutItem(workout, state.unitSystem, onClick = { onWorkoutClick(workout.id) }, modifier = Modifier.testTag("workout_item_${positions[workout.id]}"))
                    }
                }
            }
        }
    }
}

@Composable
private fun ActivityLoadCard(load: ActivityLoadSummary, unitSystem: UnitSystem) {
    val accent = UnifiedHealthTheme.metricColors.exercise
    val current = load.current
    val headline = "${current.load.roundToInt()}"
    val (trendIcon, trendText) = trendCopy(load)
    ElevatedCard(Modifier.fillMaxWidth().testTag("activity_load_card")) {
        Column(Modifier.padding(Spacing.lg), verticalArrangement = Arrangement.spacedBy(Spacing.sm)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(Icons.Outlined.Insights, contentDescription = null, tint = accent, modifier = Modifier.size(18.dp))
                Spacer(Modifier.width(Spacing.sm))
                Text(stringResource(R.string.activity_load_title), style = MaterialTheme.typography.titleSmall, color = accent, modifier = Modifier.weight(1f))
                Text(stringResource(R.string.activity_load_period), style = MaterialTheme.typography.labelMedium, color = MaterialTheme.colorScheme.onSurfaceVariant)
            }
            val description = stringResource(R.string.activity_load_value_description, headline, trendText)
            Column(Modifier.semantics(mergeDescendants = true) { contentDescription = description }.testTag("activity_load_value")) {
                Text(headline, style = MetricValueTextStyle)
                Row(verticalAlignment = Alignment.CenterVertically) {
                    trendIcon?.let { Icon(it, contentDescription = null, modifier = Modifier.size(18.dp), tint = MaterialTheme.colorScheme.onSurfaceVariant) }
                    if (trendIcon != null) Spacer(Modifier.width(Spacing.xs))
                    Text(trendText, style = MaterialTheme.typography.bodyMedium, color = MaterialTheme.colorScheme.onSurfaceVariant)
                }
            }
            HealthBarChart(
                points = load.weeks.map { ChartPoint(WEEK_LABEL.format(it.end), it.load.toFloat()) },
                color = accent,
                height = 140.dp,
                average = load.baseline?.toFloat(),
                modifier = Modifier.testTag("activity_load_chart"),
            )
            Row(horizontalArrangement = Arrangement.spacedBy(Spacing.sm)) {
                StatTile(stringResource(R.string.stat_workouts), current.workouts.toString(), Modifier.weight(1f))
                StatTile(stringResource(R.string.stat_time), current.duration.compact(), Modifier.weight(1f))
                StatTile(
                    stringResource(R.string.stat_distance),
                    current.distanceMeters.takeIf { it > 0 }?.let { kilometers(it, unitSystem = unitSystem) },
                    Modifier.weight(1f),
                    unit = unitSystem.distanceUnitLabel(),
                )
            }
            Text(
                stringResource(R.string.activity_load_caption, ActivityLoadCalculator.BASELINE_WEEKS),
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
            )
        }
    }
}

@Composable
private fun trendCopy(load: ActivityLoadSummary) = when (load.trend) {
    LoadTrend.NO_BASELINE -> null to stringResource(R.string.trend_no_baseline)
    LoadTrend.BELOW -> Icons.AutoMirrored.Outlined.TrendingDown to stringResource(R.string.trend_below, load.baseline!!.roundToInt())
    LoadTrend.STEADY -> Icons.AutoMirrored.Outlined.TrendingFlat to stringResource(R.string.trend_steady, load.baseline!!.roundToInt())
    LoadTrend.ABOVE -> Icons.AutoMirrored.Outlined.TrendingUp to stringResource(R.string.trend_above, load.baseline!!.roundToInt())
}

@Composable
private fun WorkoutItem(workout: Workout, unitSystem: UnitSystem, onClick: () -> Unit, modifier: Modifier = Modifier) {
    val zone = ZoneId.systemDefault()
    val accent = UnifiedHealthTheme.metricColors.exercise
    val details = listOfNotNull(
        formatMinutes(workout.duration.toMinutes().toInt()),
        workout.distanceMeters?.takeIf { it > 0 }?.let { "${kilometers(it, unitSystem = unitSystem)} ${unitSystem.distanceUnitLabel()}" },
        workout.activeKcal?.let { "$it kcal" },
    ).joinToString(" · ")
    ElevatedCard(onClick = onClick, modifier = modifier.fillMaxWidth()) {
        ListItem(
            colors = ListItemDefaults.colors(containerColor = Color.Transparent),
            leadingContent = { Icon(workout.type.icon(), contentDescription = null, tint = accent) },
            headlineContent = { Text(workout.type.label()) },
            supportingContent = { Text(details) },
            overlineContent = { Text(DATE_TIME.format(workout.start.atZone(zone))) },
            trailingContent = {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    workout.avgHeartRate?.let { Text("$it bpm", style = MaterialTheme.typography.bodyMedium) }
                    Icon(Icons.AutoMirrored.Outlined.KeyboardArrowRight, contentDescription = null, tint = MaterialTheme.colorScheme.onSurfaceVariant)
                }
            },
        )
    }
}

/** "2h 11m" / "45m": fits a third-width tile without wrapping. */
private fun java.time.Duration.compact(): String {
    val h = toHours()
    val m = (toMinutes() % 60).toInt()
    return if (h > 0) "${h}h ${m}m" else "${m}m"
}

private val MONTH: DateTimeFormatter = DateTimeFormatter.ofPattern("MMMM yyyy")
private val WEEK_LABEL: DateTimeFormatter = DateTimeFormatter.ofPattern("MMM d")
private val DATE_TIME: DateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.SHORT)
