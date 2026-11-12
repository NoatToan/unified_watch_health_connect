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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.outlined.Watch
import androidx.compose.material3.Card
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.heading
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.unified.health.core.designsystem.component.EmptyState
import com.unified.health.core.designsystem.component.HealthRangeChart
import com.unified.health.core.designsystem.component.LoadingState
import com.unified.health.core.designsystem.component.StatTile
import com.unified.health.core.designsystem.theme.ChromeRipple
import com.unified.health.core.designsystem.theme.Spacing
import com.unified.health.core.designsystem.theme.UnifiedHealthTheme
import com.unified.health.core.domain.usecase.HeartRateZoneShare
import com.unified.health.core.model.ChartPoint
import com.unified.health.core.model.UnitSystem
import com.unified.health.core.model.WorkoutLap
import com.unified.health.core.model.WorkoutType
import com.unified.health.core.model.distanceUnitLabel
import com.unified.health.feature.activity.R
import com.unified.health.core.designsystem.R as DesignSystemR
import com.unified.health.feature.activity.icon
import com.unified.health.feature.activity.kilometers
import com.unified.health.feature.activity.label
import com.unified.health.feature.activity.paceOrSpeed
import com.unified.health.feature.activity.paceOrSpeedLabel
import com.unified.health.feature.activity.stopwatch
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle
import kotlin.math.roundToInt

@Composable
internal fun WorkoutDetailRoute(onBack: () -> Unit, viewModel: WorkoutDetailViewModel = hiltViewModel()) {
    val state by viewModel.uiState.collectAsStateWithLifecycle()
    WorkoutDetailScreen(state, onBack)
}

/** One workout: summary tiles, heart rate over the session, and which watch recorded it. */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun WorkoutDetailScreen(state: WorkoutDetailUiState, onBack: () -> Unit) {
    val title = (state as? WorkoutDetailUiState.Success)?.workout?.type?.label() ?: stringResource(R.string.workout_type_other)
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(title) },
                // D-1189: app chrome, not this screen's own content — restores the normal ripple.
                navigationIcon = {
                    ChromeRipple {
                        IconButton(onClick = onBack) {
                            Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = stringResource(DesignSystemR.string.nav_back))
                        }
                    }
                },
            )
        },
    ) { padding ->
        when (state) {
            WorkoutDetailUiState.Loading -> LoadingState(Modifier.padding(padding))
            WorkoutDetailUiState.NotFound -> EmptyState(
                title = stringResource(R.string.workout_not_found_title),
                message = stringResource(R.string.workout_not_found_message),
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

        val pace = workout.paceOrSpeed(unitSystem = state.unitSystem)
        val paceLabel = stringResource(if (workout.type == WorkoutType.CYCLING) R.string.avg_speed else R.string.avg_pace)
        val tiles = listOf(
            Triple(stringResource(R.string.stat_workout_time), workout.duration.stopwatch(), ""),
            Triple(stringResource(R.string.stat_distance), workout.distanceMeters?.takeIf { it > 0 }?.let { kilometers(it, unitSystem = state.unitSystem) }, state.unitSystem.distanceUnitLabel()),
            Triple(stringResource(R.string.stat_active_energy), workout.activeKcal?.toString(), "kcal"),
            Triple(paceLabel, pace?.value, pace?.unit ?: ""),
            Triple(stringResource(R.string.stat_avg_heart_rate), state.avgHeartRate?.toString(), "bpm"),
            Triple(stringResource(R.string.stat_max_heart_rate), state.maxHeartRate?.toString(), "bpm"),
        )
        Column(Modifier.testTag("workout_stats"), verticalArrangement = Arrangement.spacedBy(Spacing.sm)) {
            tiles.chunked(2).forEach { row ->
                Row(horizontalArrangement = Arrangement.spacedBy(Spacing.sm)) {
                    row.forEach { (label, value, unit) -> StatTile(label, value, Modifier.weight(1f), unit = unit) }
                }
            }
        }

        // Cadence + elevation summary (D-1093), from lap(19)/record(20) data; omitted entirely when
        // the device reported none of it (e.g. an older file with session(18) only).
        val cadenceTiles = listOf(
            Triple(stringResource(R.string.stat_avg_cadence), state.avgCadence?.toString(), "spm"),
            Triple(stringResource(R.string.stat_max_cadence), state.maxCadence?.toString(), "spm"),
            Triple(stringResource(R.string.stat_elevation_gain), state.totalAscentMeters?.roundToInt()?.toString(), "m"),
            Triple(stringResource(R.string.stat_elevation_loss), state.totalDescentMeters?.roundToInt()?.toString(), "m"),
        )
        if (cadenceTiles.any { it.second != null }) {
            Column(Modifier.testTag("workout_cadence_elevation"), verticalArrangement = Arrangement.spacedBy(Spacing.sm)) {
                cadenceTiles.chunked(2).forEach { row ->
                    Row(horizontalArrangement = Arrangement.spacedBy(Spacing.sm)) {
                        row.forEach { (label, value, unit) -> StatTile(label, value, Modifier.weight(1f), unit = unit) }
                    }
                }
            }
        }

        Card(Modifier.fillMaxWidth()) {
            Column(Modifier.padding(Spacing.lg), verticalArrangement = Arrangement.spacedBy(Spacing.sm)) {
                Text(stringResource(R.string.heart_rate_title), style = MaterialTheme.typography.titleMedium, color = heartColor)
                if (state.hasHeartRateChart) {
                    HealthRangeChart(state.heartRate, heartColor, Modifier.testTag("workout_hr_chart"))
                    state.sampleStats?.let { s ->
                        Text(
                            stringResource(R.string.heart_rate_summary, s.average, s.min, s.max),
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                        )
                    }
                } else {
                    Text(
                        stringResource(R.string.heart_rate_empty),
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        modifier = Modifier.testTag("workout_hr_empty"),
                    )
                }
            }
        }

        if (state.hasSampleTrend) {
            TrendCard(state, accent, heartColor)
        }

        if (state.hasSplits) {
            SplitsCard(state.laps, workout.type, accent, state.unitSystem)
        }

        if (state.hasHrZones) {
            HrZonesCard(state.hrZones, heartColor)
        }

        ElevatedCard(Modifier.fillMaxWidth()) {
            ListItem(
                modifier = Modifier.testTag("workout_source"),
                colors = ListItemDefaults.colors(containerColor = Color.Transparent),
                leadingContent = { Icon(Icons.Outlined.Watch, contentDescription = null) },
                overlineContent = { Text(stringResource(R.string.source_label)) },
                headlineContent = { Text(state.source ?: stringResource(R.string.source_unknown)) },
            )
        }
        Spacer(Modifier.height(Spacing.xl))
    }
}

/**
 * Pace/elevation/heart-rate over the course of the workout (D-1093), built from FIT `record`
 * samples via [com.unified.health.core.domain.usecase.WorkoutSampleSeries]. Reuses [HealthRangeChart]
 * (no dedicated line-chart component exists yet) — each series is its own mini chart since they use
 * unrelated units (sec/km, meters, bpm) that don't share one y-axis.
 */
@Composable
private fun TrendCard(state: WorkoutDetailUiState.Success, accent: Color, heartColor: Color) {
    Card(Modifier.fillMaxWidth().testTag("workout_trend")) {
        Column(Modifier.padding(Spacing.lg), verticalArrangement = Arrangement.spacedBy(Spacing.md)) {
            Text(stringResource(R.string.trends_title), style = MaterialTheme.typography.titleMedium, color = accent)
            if (state.paceSeries.any { it.hasData }) {
                TrendSeries(stringResource(R.string.trend_pace_title), state.paceSeries, accent, "workout_trend_pace") { paceLabel(it) }
            }
            if (state.elevationSeries.any { it.hasData }) {
                TrendSeries(stringResource(R.string.trend_elevation_title), state.elevationSeries, accent, "workout_trend_elevation") { "${it.roundToInt()} m" }
            }
            if (state.sampleHeartRateSeries.any { it.hasData }) {
                TrendSeries(stringResource(R.string.heart_rate_title), state.sampleHeartRateSeries, heartColor, "workout_trend_hr") { "${it.roundToInt()} bpm" }
            }
        }
    }
}

@Composable
private fun TrendSeries(title: String, points: List<ChartPoint>, color: Color, testTag: String, axisLabel: (Float) -> String) {
    Column {
        Text(title, style = MaterialTheme.typography.labelLarge, color = MaterialTheme.colorScheme.onSurfaceVariant)
        HealthRangeChart(points, color, Modifier.testTag(testTag), height = 120.dp, axisLabel = axisLabel)
    }
}

/** "5'30\"" from a seconds/km value, "--" when not finite (e.g. a bucket with no moving sample). */
private fun paceLabel(secondsPerKm: Float): String {
    if (secondsPerKm <= 0f || secondsPerKm.isNaN() || secondsPerKm.isInfinite()) return "--"
    val total = secondsPerKm.roundToInt()
    return "%d'%02d\"".format(total / 60, total % 60)
}

/** One row per lap (D-1093): duration, distance, pace/speed, avg HR/cadence, elevation gain/loss. */
@Composable
private fun SplitsCard(laps: List<WorkoutLap>, type: WorkoutType, accent: Color, unitSystem: UnitSystem) {
    Card(Modifier.fillMaxWidth().testTag("workout_splits")) {
        Column(Modifier.padding(vertical = Spacing.sm)) {
            Text(
                stringResource(R.string.splits_title),
                style = MaterialTheme.typography.titleMedium,
                color = accent,
                modifier = Modifier.padding(horizontal = Spacing.lg, vertical = Spacing.sm),
            )
            laps.forEach { lap ->
                ListItem(
                    modifier = Modifier.testTag("workout_lap_${lap.index}"),
                    colors = ListItemDefaults.colors(containerColor = Color.Transparent),
                    headlineContent = { Text(stringResource(R.string.lap_title, lap.index + 1, lap.duration.stopwatch())) },
                    supportingContent = { Text(lapSummary(lap, type, unitSystem), maxLines = 2, overflow = TextOverflow.Ellipsis) },
                )
            }
        }
    }
}

@Composable
private fun lapSummary(lap: WorkoutLap, type: WorkoutType, unitSystem: UnitSystem): String {
    val parts = mutableListOf<String>()
    lap.distanceMeters?.takeIf { it > 0 }?.let { parts += "${kilometers(it, unitSystem = unitSystem)} ${unitSystem.distanceUnitLabel()}" }
    lap.paceOrSpeedLabel(type, unitSystem = unitSystem)?.let { parts += it }
    lap.avgHeartRate?.let { parts += "$it bpm" }
    lap.avgCadence?.let { parts += "$it spm" }
    if (lap.ascentMeters != null || lap.descentMeters != null) {
        parts += "↑${(lap.ascentMeters ?: 0.0).roundToInt()}m ↓${(lap.descentMeters ?: 0.0).roundToInt()}m"
    }
    return parts.joinToString(" · ").ifEmpty { stringResource(R.string.lap_no_details) }
}

/** % of the workout's time in each HR zone (D-1030 thresholds), from the FIT `record` HR series. */
@Composable
private fun HrZonesCard(zones: List<HeartRateZoneShare>, heartColor: Color) {
    Card(Modifier.fillMaxWidth().testTag("workout_hr_zones")) {
        Column(Modifier.padding(Spacing.lg), verticalArrangement = Arrangement.spacedBy(Spacing.sm)) {
            Text(stringResource(R.string.hr_zones_title), style = MaterialTheme.typography.titleMedium, color = heartColor)
            zones.forEach { share -> HrZoneRow(share) }
        }
    }
}

@Composable
private fun HrZoneRow(share: HeartRateZoneShare) {
    val zone = share.zone
    val percent = share.percentOfTime.roundToInt()
    val description = stringResource(R.string.hr_zone_description, zone.zone, zone.label, percent)
    Column(
        Modifier
            .fillMaxWidth()
            .semantics(mergeDescendants = true) { contentDescription = description },
    ) {
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Text("Z${zone.zone} · ${zone.label}", style = MaterialTheme.typography.bodyMedium)
            Text("$percent%", style = MaterialTheme.typography.bodyMedium, color = MaterialTheme.colorScheme.onSurfaceVariant)
        }
        Spacer(Modifier.height(Spacing.xs))
        LinearProgressIndicator(
            progress = { (share.percentOfTime / 100.0).toFloat().coerceIn(0f, 1f) },
            modifier = Modifier.fillMaxWidth().height(6.dp).clip(RoundedCornerShape(3.dp)),
            color = ZONE_COLORS.getOrElse(zone.zone - 1) { MaterialTheme.colorScheme.primary },
            trackColor = MaterialTheme.colorScheme.surfaceVariant,
        )
    }
}

/** Z1 (warm up) → Z5 (max), cool to hot — a generic effort gradient, not a vendor palette. */
private val ZONE_COLORS = listOf(Color(0xFF42A5F5), Color(0xFF66BB6A), Color(0xFFFFCA28), Color(0xFFFF7043), Color(0xFFE53935))

private val DATE: DateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)
private val TIME: DateTimeFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)
