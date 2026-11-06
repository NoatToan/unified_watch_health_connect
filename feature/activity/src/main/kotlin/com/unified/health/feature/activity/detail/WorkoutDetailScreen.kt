package com.unified.health.feature.activity.detail

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.outlined.Watch
import androidx.compose.material3.Card
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
import androidx.compose.ui.semantics.heading
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.unified.health.core.designsystem.component.EmptyState
import com.unified.health.core.designsystem.component.HealthRangeChart
import com.unified.health.core.designsystem.component.LoadingState
import com.unified.health.core.designsystem.component.StatTile
import com.unified.health.core.designsystem.theme.Spacing
import com.unified.health.core.designsystem.theme.UnifiedHealthTheme
import com.unified.health.feature.activity.icon
import com.unified.health.feature.activity.kilometers
import com.unified.health.feature.activity.label
import com.unified.health.feature.activity.paceOrSpeed
import com.unified.health.feature.activity.stopwatch
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle

@Composable
internal fun WorkoutDetailRoute(onBack: () -> Unit, viewModel: WorkoutDetailViewModel = hiltViewModel()) {
    val state by viewModel.uiState.collectAsStateWithLifecycle()
    WorkoutDetailScreen(state, onBack)
}

/** One workout: summary tiles, heart rate over the session, and which watch recorded it. */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun WorkoutDetailScreen(state: WorkoutDetailUiState, onBack: () -> Unit) {
    val title = (state as? WorkoutDetailUiState.Success)?.workout?.type?.label() ?: "Workout"
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(title) },
                navigationIcon = { IconButton(onClick = onBack) { Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back") } },
            )
        },
    ) { padding ->
        when (state) {
            WorkoutDetailUiState.Loading -> LoadingState(Modifier.padding(padding))
            WorkoutDetailUiState.NotFound -> EmptyState(
                title = "Workout not found",
                message = "This workout is no longer stored on this phone.",
                modifier = Modifier.padding(padding).testTag("workout_not_found"),
            )
            is WorkoutDetailUiState.Success -> WorkoutDetailContent(state, Modifier.padding(padding))
        }
    }
}

@Composable
private fun WorkoutDetailContent(state: WorkoutDetailUiState.Success, modifier: Modifier) {
    val workout = state.workout
    val zone = ZoneId.systemDefault()
    val accent = UnifiedHealthTheme.metricColors.exercise
    val heartColor = UnifiedHealthTheme.metricColors.heartRate
    Column(
        modifier = modifier.fillMaxSize().verticalScroll(rememberScrollState()).padding(horizontal = Spacing.lg).testTag("workout_detail"),
        verticalArrangement = Arrangement.spacedBy(Spacing.lg),
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Box(Modifier.size(48.dp).background(accent.copy(alpha = 0.15f), CircleShape), contentAlignment = Alignment.Center) {
                Icon(workout.type.icon(), contentDescription = null, tint = accent)
            }
            Spacer(Modifier.width(Spacing.md))
            Column {
                Text(workout.type.label(), style = MaterialTheme.typography.titleLarge, modifier = Modifier.semantics { heading() })
                Text(
                    "${DATE.format(workout.start.atZone(zone))} · ${TIME.format(workout.start.atZone(zone))} – ${TIME.format(workout.end.atZone(zone))}",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    modifier = Modifier.testTag("workout_time_range"),
                )
            }
        }

        val pace = workout.paceOrSpeed()
        val tiles = listOf(
            Triple("Workout time", workout.duration.stopwatch(), ""),
            Triple("Distance", workout.distanceMeters?.takeIf { it > 0 }?.let { kilometers(it) }, "km"),
            Triple("Active energy", workout.activeKcal?.toString(), "kcal"),
            Triple(pace?.label ?: "Avg. pace", pace?.value, pace?.unit ?: ""),
            Triple("Avg. heart rate", state.avgHeartRate?.toString(), "bpm"),
            Triple("Max heart rate", state.maxHeartRate?.toString(), "bpm"),
        )
        Column(Modifier.testTag("workout_stats"), verticalArrangement = Arrangement.spacedBy(Spacing.sm)) {
            tiles.chunked(2).forEach { row ->
                Row(horizontalArrangement = Arrangement.spacedBy(Spacing.sm)) {
                    row.forEach { (label, value, unit) -> StatTile(label, value, Modifier.weight(1f), unit = unit) }
                }
            }
        }

        Card(Modifier.fillMaxWidth()) {
            Column(Modifier.padding(Spacing.lg), verticalArrangement = Arrangement.spacedBy(Spacing.sm)) {
                Text("Heart rate", style = MaterialTheme.typography.titleMedium, color = heartColor)
                if (state.hasHeartRateChart) {
                    HealthRangeChart(state.heartRate, heartColor, Modifier.testTag("workout_hr_chart"))
                    state.sampleStats?.let { s ->
                        Text(
                            "Average ${s.average} · lowest ${s.min} · highest ${s.max} bpm",
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                        )
                    }
                } else {
                    Text(
                        "No heart-rate samples were recorded during this workout.",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        modifier = Modifier.testTag("workout_hr_empty"),
                    )
                }
            }
        }

        ElevatedCard(Modifier.fillMaxWidth()) {
            ListItem(
                modifier = Modifier.testTag("workout_source"),
                colors = ListItemDefaults.colors(containerColor = Color.Transparent),
                leadingContent = { Icon(Icons.Outlined.Watch, contentDescription = null) },
                overlineContent = { Text("Source") },
                headlineContent = { Text(state.source ?: "Unknown device") },
            )
        }
        Spacer(Modifier.height(Spacing.xl))
    }
}

private val DATE: DateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)
private val TIME: DateTimeFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)
