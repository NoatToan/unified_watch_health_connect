package com.unified.health.feature.activity.detail

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
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
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Watch
import androidx.compose.material3.Card
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.ListItemDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
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
import androidx.compose.ui.unit.dp
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.unified.health.core.designsystem.component.AppScreen
import com.unified.health.core.designsystem.component.EmptyState
import com.unified.health.core.designsystem.component.HealthLineChart
import com.unified.health.core.designsystem.component.LoadingState
import com.unified.health.core.designsystem.component.StatTile
import com.unified.health.core.designsystem.theme.Gaps
import com.unified.health.core.designsystem.theme.Spacing
import com.unified.health.core.designsystem.theme.UnifiedHealthTheme
import com.unified.health.core.domain.model.DefaultMetricThresholds
import com.unified.health.core.domain.usecase.HeartRateZoneDuration
import com.unified.health.core.domain.usecase.WorkoutSplit
import com.unified.health.core.domain.usecase.WorkoutSplitsSummary
import com.unified.health.core.model.ChartPoint
import com.unified.health.core.model.UnitSystem
import com.unified.health.core.model.WorkoutType
import com.unified.health.core.model.distanceUnitLabel
import com.unified.health.feature.activity.R
import com.unified.health.feature.activity.icon
import com.unified.health.feature.activity.kilometers
import com.unified.health.feature.activity.label
import com.unified.health.feature.activity.stopwatch
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle
import java.util.Locale
import kotlin.math.roundToInt

@Composable
internal fun WorkoutDetailRoute(onBack: () -> Unit, viewModel: WorkoutDetailViewModel = hiltViewModel()) {
    val state by viewModel.uiState.collectAsStateWithLifecycle()
    WorkoutDetailScreen(state, onBack)
}

/** One workout, restructured to show the same set of details as Huawei Health's workout-detail
 * screens (docs/re-evidence/huawei/workout_detail_metrics.md, docs/DECISIONS.md D-1201), in our own
 * design system: header + chief number, a summary grid, per-km/mi splits, and a charts section. */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun WorkoutDetailScreen(state: WorkoutDetailUiState, onBack: () -> Unit) {
    val title = (state as? WorkoutDetailUiState.Success)?.workout?.type?.label() ?: stringResource(R.string.workout_type_other)
    AppScreen(title = title, onBack = onBack) { contentPadding ->
        when (state) {
            WorkoutDetailUiState.Loading -> LoadingState(Modifier.padding(contentPadding))
            WorkoutDetailUiState.NotFound -> EmptyState(
                title = stringResource(R.string.workout_not_found_title),
                message = stringResource(R.string.workout_not_found_message),
                modifier = Modifier.padding(contentPadding).testTag("workout_not_found"),
            )
            is WorkoutDetailUiState.Success -> WorkoutDetailContent(state, contentPadding)
        }
    }
}

@Composable
private fun WorkoutDetailContent(state: WorkoutDetailUiState.Success, contentPadding: PaddingValues) {
    val workout = state.workout
    val zone = ZoneId.systemDefault()
    val accent = UnifiedHealthTheme.metricColors.exercise
    val heartColor = UnifiedHealthTheme.metricColors.heartRate
    val unitSystem = state.unitSystem
    // D-1194: contentPadding chained AFTER verticalScroll — the last item (the source ListItem) scrolls
    // fully behind the gesture bar instead of stopping in a dead strip above it.
    Column(
        modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState()).padding(contentPadding).padding(horizontal = Gaps.screenHorizontal).testTag("workout_detail"),
        verticalArrangement = Arrangement.spacedBy(Gaps.sectionGap),
    ) {
        WorkoutHeader(state, zone, accent)
        SummaryGrid(state)

        Card(Modifier.fillMaxWidth()) {
            Column(Modifier.padding(Gaps.cardPadding), verticalArrangement = Arrangement.spacedBy(Gaps.cardContentGap)) {
                Text(stringResource(R.string.heart_rate_title), style = MaterialTheme.typography.titleMedium, color = heartColor)
                if (state.hasHeartRateChart) {
                    // D-1197 round 2: this is now the ONLY heart-rate chart on the screen — the old
                    // "Trends" copy was removed so the two never duplicate each other. Best available
                    // series: the dense per-sample series when there is one, else the sparser
                    // minute-level stream — same rule [WorkoutDetailUiState.Success.hasHeartRateChart]
                    // already gates on.
                    val series = state.sampleHeartRateSeries.takeIf { it.any { p -> p.hasData } } ?: state.heartRate
                    val maxHr = DefaultMetricThresholds.VALUES.estimatedMaxHeartRateBpm()
                    val zoneBands = DefaultMetricThresholds.VALUES.heartRateZones.mapIndexed { i, hrZone ->
                        Triple(hrZone.percentOfMaxHr.first / 100f * maxHr, hrZone.percentOfMaxHr.last / 100f * maxHr, ZONE_COLORS[i])
                    }
                    HealthLineChart(
                        series,
                        heartColor,
                        Modifier.testTag("workout_hr_chart"),
                        axisLabel = { "${it.roundToInt()} bpm" },
                        referenceValue = state.avgHeartRate?.toFloat(),
                        zoneBands = zoneBands,
                    )
                    // D-1197 round 2: same source-of-truth rule as the summary grid above (watch summary
                    // wins avg/max, sample-derived min) — these numbers must never disagree with the grid.
                    val avg = state.avgHeartRate
                    val min = state.minHeartRate
                    val max = state.maxHeartRate
                    if (avg != null && min != null && max != null) {
                        Text(
                            stringResource(R.string.heart_rate_summary, avg, min, max),
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

        if (state.hasSplits) {
            SplitsSection(state.derived.splits, unitSystem, accent)
        }

        if (state.hasSampleTrend) {
            ChartsCard(state, accent)
        }

        if (state.hasHrZones) {
            HrZonesCard(state.derived.hrZoneDurations, heartColor)
        }

        // D-1197 round 2: the one and only place the recording device shows (see [WorkoutHeader]) —
        // a friendly "Name · Brand"/"Demo watch" label, the raw MAC only as [WorkoutSourceDisplay.Unknown]'s
        // small secondary line, never as the primary label.
        ElevatedCard(Modifier.fillMaxWidth()) {
            ListItem(
                modifier = Modifier.testTag("workout_source"),
                colors = ListItemDefaults.colors(containerColor = Color.Transparent),
                leadingContent = { Icon(Icons.Outlined.Watch, contentDescription = null) },
                overlineContent = { Text(stringResource(R.string.source_label)) },
                headlineContent = { Text(sourceHeadline(state.source)) },
                supportingContent = ((state.source as? WorkoutSourceDisplay.Unknown)?.deviceId)?.let { deviceId ->
                    {
                        Text(
                            deviceId,
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                        )
                    }
                },
            )
        }
        Spacer(Modifier.height(Spacing.xl))
    }
}

/** D-1197 round 2: the headline shown in the Source card — a friendly name, never the raw MAC
 * (that only shows as [WorkoutSourceDisplay.Unknown]'s secondary line, see [WorkoutDetailContent]). */
@Composable
private fun sourceHeadline(source: WorkoutSourceDisplay): String = when (source) {
    is WorkoutSourceDisplay.Paired -> "${source.name} · ${source.brand}"
    WorkoutSourceDisplay.Demo -> stringResource(R.string.source_demo_watch)
    is WorkoutSourceDisplay.Unknown -> stringResource(R.string.source_unknown)
}

/** Icon + type + date/time, then the chief number (distance, or duration when there's no distance —
 * D-1201 §2.1's chief-type fallback), Huawei-Details-tab style. The recording device used to also show
 * here, duplicating the Source card below — D-1197 round 2 keeps it in that one place only. */
@Composable
private fun WorkoutHeader(state: WorkoutDetailUiState.Success, zone: ZoneId, accent: Color) {
    val workout = state.workout
    Column(verticalArrangement = Arrangement.spacedBy(Spacing.xs)) {
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
        val distance = workout.distanceMeters?.takeIf { it > 0 }
        Row(verticalAlignment = Alignment.Bottom, modifier = Modifier.testTag("workout_chief_number")) {
            if (distance != null) {
                Text(kilometers(distance, unitSystem = state.unitSystem), style = MaterialTheme.typography.displaySmall)
                Spacer(Modifier.width(Spacing.xs))
                Text(
                    state.unitSystem.distanceUnitLabel(),
                    style = MaterialTheme.typography.titleMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    modifier = Modifier.padding(bottom = Spacing.xs),
                )
            } else {
                Text(workout.duration.stopwatch(), style = MaterialTheme.typography.displaySmall)
            }
        }
        // D-1197 round 2: the source used to also print here AND in the "Source" card below — two
        // copies of the same thing, one of them (this one) the raw MAC when the device wasn't paired.
        // Kept in exactly one place now: the Source card.
    }
}

/**
 * Two-column grid in Huawei's own field order (§2.2, D-1201), skipping every absent value instead of
 * rendering a "--" placeholder tile for it: Duration, Calories, Avg pace, Avg speed, Avg cadence, Avg
 * stride, Steps, Avg/Max heart rate, Elevation gain, Descent, kcal/min. "Active calories" isn't a
 * separate grid row here — this app's [com.unified.health.core.model.Workout] only ever stores one
 * calorie figure ([com.unified.health.core.model.Workout.activeKcal]), so there is nothing to show as
 * distinct from "Calories".
 */
@Composable
private fun SummaryGrid(state: WorkoutDetailUiState.Success) {
    val workout = state.workout
    val unitSystem = state.unitSystem
    val derived = state.derived
    val showsPace = workout.type == WorkoutType.RUNNING || workout.type == WorkoutType.WALKING
    val showsSpeed = showsPace || workout.type == WorkoutType.CYCLING
    val speedUnit = if (unitSystem == UnitSystem.IMPERIAL) "mph" else "km/h"
    val strideIsImperial = unitSystem == UnitSystem.IMPERIAL

    val tiles = buildList {
        add(Triple(stringResource(R.string.stat_workout_time), workout.duration.stopwatch(), ""))
        workout.activeKcal?.takeIf { it > 0 }?.let { add(Triple(stringResource(R.string.stat_active_energy), it.toString(), "kcal")) }
        if (showsPace) {
            derived.avgPaceSecondsPerUnit?.let { add(Triple(stringResource(R.string.avg_pace), paceClock(it), "/${unitSystem.distanceUnitLabel()}")) }
        }
        if (showsSpeed) {
            derived.avgSpeedPerHour?.let { add(Triple(stringResource(R.string.avg_speed), "%.1f".format(Locale.getDefault(), it), speedUnit)) }
        }
        state.avgCadence?.let { add(Triple(stringResource(R.string.stat_avg_cadence), it.toString(), "spm")) }
        derived.avgStrideLengthCm?.let {
            val value = if (strideIsImperial) it / 2.54 else it
            add(Triple(stringResource(R.string.stat_avg_stride), "%.0f".format(Locale.getDefault(), value), if (strideIsImperial) "in" else "cm"))
        }
        derived.estimatedTotalSteps?.let { add(Triple(stringResource(R.string.stat_steps), it.toString(), "")) }
        state.avgHeartRate?.let { add(Triple(stringResource(R.string.stat_avg_heart_rate), it.toString(), "bpm")) }
        state.maxHeartRate?.let { add(Triple(stringResource(R.string.stat_max_heart_rate), it.toString(), "bpm")) }
        state.totalAscentMeters?.let { add(Triple(stringResource(R.string.stat_elevation_gain), it.roundToInt().toString(), "m")) }
        state.totalDescentMeters?.let { add(Triple(stringResource(R.string.stat_elevation_loss), it.roundToInt().toString(), "m")) }
        derived.kcalPerMinute?.let { add(Triple(stringResource(R.string.stat_kcal_per_minute), "%.1f".format(Locale.getDefault(), it), "kcal/min")) }
    }
    Column(Modifier.testTag("workout_stats"), verticalArrangement = Arrangement.spacedBy(Gaps.gridGap)) {
        tiles.chunked(2).forEach { row ->
            Row(horizontalArrangement = Arrangement.spacedBy(Gaps.gridGap)) {
                row.forEach { (label, value, unit) -> StatTile(label, value, Modifier.weight(1f), unit = unit) }
            }
        }
    }
}

/**
 * Splits table (Huawei's Pace tab, §4, D-1201): fastest/average header (+ half/full marathon when
 * reached), then one row per km/mi with a pace bar proportional to speed and the fastest row
 * highlighted, ending with the "< 1 km"/"< 1 mi" partial row when the workout didn't finish on an
 * exact unit boundary.
 */
@Composable
private fun SplitsSection(summary: WorkoutSplitsSummary, unitSystem: UnitSystem, accent: Color) {
    if (summary.splits.isEmpty()) return
    val unitLabel = unitSystem.distanceUnitLabel()
    Card(Modifier.fillMaxWidth().testTag("workout_splits")) {
        Column(Modifier.padding(Gaps.cardPadding), verticalArrangement = Arrangement.spacedBy(Gaps.cardContentGap)) {
            Text(stringResource(R.string.splits_title), style = MaterialTheme.typography.titleMedium, color = accent)
            Row(Modifier.fillMaxWidth().testTag("workout_splits_header"), horizontalArrangement = Arrangement.SpaceBetween) {
                val fastest = summary.fastestSplitIndex?.let { summary.splits[it] }
                SplitHeaderStat(stringResource(R.string.splits_fastest), fastest?.let { "${paceClock(it.duration.seconds.toDouble())}/$unitLabel" })
                SplitHeaderStat(stringResource(R.string.splits_average), summary.averagePaceSecondsPerUnit?.let { "${paceClock(it)}/$unitLabel" })
            }
            summary.halfMarathonDuration?.let {
                Text(stringResource(R.string.splits_half_marathon, it.stopwatch()), style = MaterialTheme.typography.bodyMedium)
            }
            summary.marathonDuration?.let {
                Text(stringResource(R.string.splits_marathon, it.stopwatch()), style = MaterialTheme.typography.bodyMedium)
            }
            val maxSeconds = summary.splits.maxOf { it.duration.seconds }
            val minSeconds = summary.splits.filterNot { it.isPartial }.minOfOrNull { it.duration.seconds } ?: maxSeconds
            summary.splits.forEachIndexed { i, split ->
                SplitRow(split, i == summary.fastestSplitIndex, minSeconds, maxSeconds, unitLabel)
            }
        }
    }
}

@Composable
private fun SplitHeaderStat(label: String, value: String?) {
    Column {
        Text(label, style = MaterialTheme.typography.labelMedium, color = MaterialTheme.colorScheme.onSurfaceVariant)
        Text(value ?: "--", style = MaterialTheme.typography.titleMedium)
    }
}

@Composable
private fun SplitRow(split: WorkoutSplit, isFastest: Boolean, minSeconds: Long, maxSeconds: Long, unitLabel: String) {
    val fraction = splitBarFraction(split.duration.seconds, minSeconds, maxSeconds)
    val barColor = if (isFastest) UnifiedHealthTheme.metricColors.exercise else MaterialTheme.colorScheme.surfaceVariant
    val label = if (split.isPartial) stringResource(R.string.split_partial_label, unitLabel) else "${split.index + 1}"
    Row(
        modifier = Modifier.fillMaxWidth().testTag("workout_split_${split.index}").padding(vertical = Gaps.cardContentGap),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(label, style = MaterialTheme.typography.bodyMedium, modifier = Modifier.width(48.dp))
        Box(Modifier.weight(1f).height(8.dp)) {
            Box(Modifier.fillMaxWidth(fraction).height(8.dp).background(barColor, RoundedCornerShape(4.dp)))
        }
        Spacer(Modifier.width(Spacing.sm))
        Text(split.duration.stopwatch(), style = MaterialTheme.typography.bodyMedium)
        split.avgHeartRate?.let {
            Spacer(Modifier.width(Spacing.sm))
            Text("$it bpm", style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant)
        }
    }
}

/** Minimum visible bar width for any split row — never fully collapses, even for the slowest one. */
private const val MIN_SPLIT_BAR_FRACTION = 0.12f

/**
 * Bar length for one splits row (D-1197 round 2): the fastest *complete* split (duration ==
 * [minSeconds]) always draws the full-width bar; everything else scales down toward
 * [MIN_SPLIT_BAR_FRACTION] as its own duration approaches [maxSeconds] — which is also the floor for
 * the degenerate case where every split ties ([maxSeconds] == [minSeconds]): that used to make the
 * division below evaluate 0/0 territory in a way that could draw a zero-width bar for every row but
 * the fastest; it now always returns 1f instead, so a table of identical-looking splits (e.g. the old
 * demo-generator bug where every lap had the same duration) still shows a bar on every row. Pure
 * function (no Compose) so it has its own JVM unit test.
 */
internal fun splitBarFraction(durationSeconds: Long, minSeconds: Long, maxSeconds: Long): Float {
    if (maxSeconds <= minSeconds) return 1f
    return (1f - (durationSeconds - minSeconds).toFloat() / (maxSeconds - minSeconds).toFloat()).coerceIn(MIN_SPLIT_BAR_FRACTION, 1f)
}

/**
 * Charts section (Huawei's Charts tab, D-1201/D-1202): pace (smoothed, y axis inverted so faster
 * reads as "up"), cadence and elevation (area fill) — all dense, per-second-ish series, so they use
 * [HealthLineChart] rather than `HealthRangeChart`'s dots. Heart rate used to have its own copy of
 * this chart here too, but D-1197 round 2 moved it into the dedicated "Heart rate" card above (it was
 * rendering alongside that card's own, now-removed scatter chart — the same series shown twice).
 */
@Composable
private fun ChartsCard(state: WorkoutDetailUiState.Success, accent: Color) {
    val workout = state.workout
    Card(Modifier.fillMaxWidth().testTag("workout_trend")) {
        Column(Modifier.padding(Gaps.cardPadding), verticalArrangement = Arrangement.spacedBy(Gaps.itemGap)) {
            Text(stringResource(R.string.trends_title), style = MaterialTheme.typography.titleMedium, color = accent)
            if (state.paceSeries.any { it.hasData }) {
                // Stays per-km regardless of UnitSystem (WorkoutSampleSeries.paceSecondsPerKm is fixed to
                // km, same as before D-1202) — the reference line below must match that same unit.
                val avgPaceSecondsPerKm = workout.distanceMeters?.takeIf { it > 0 }?.let { workout.duration.seconds / (it / 1_000.0) }
                val window = smoothingWindow(state.paceSeries.size, workout.duration.seconds)
                TrendTitle(stringResource(R.string.trend_pace_title))
                HealthLineChart(
                    state.paceSeries,
                    accent,
                    Modifier.testTag("workout_trend_pace"),
                    height = 120.dp,
                    axisLabel = { paceLabel(it) },
                    smoothingWindow = window,
                    invertY = true,
                    referenceValue = avgPaceSecondsPerKm?.toFloat(),
                )
            }
            if (state.cadenceSeries.any { it.hasData }) {
                TrendTitle(stringResource(R.string.trend_cadence_title))
                HealthLineChart(
                    state.cadenceSeries,
                    accent,
                    Modifier.testTag("workout_trend_cadence"),
                    height = 120.dp,
                    axisLabel = { "${it.roundToInt()} spm" },
                )
            }
            if (state.elevationSeries.any { it.hasData }) {
                TrendTitle(stringResource(R.string.trend_elevation_title))
                HealthLineChart(
                    state.elevationSeries,
                    accent,
                    Modifier.testTag("workout_trend_elevation"),
                    height = 120.dp,
                    axisLabel = { "${it.roundToInt()} m" },
                    areaFill = true,
                )
            }
        }
    }
}

@Composable
private fun TrendTitle(title: String) {
    Text(title, style = MaterialTheme.typography.labelLarge, color = MaterialTheme.colorScheme.onSurfaceVariant)
}

/** ~20 s worth of buckets (D-1202's "15-30 s" ask), clamped to a sane 1..9 bucket window. */
private fun smoothingWindow(bucketCount: Int, workoutDurationSeconds: Long): Int {
    if (bucketCount <= 0 || workoutDurationSeconds <= 0) return 1
    val bucketSeconds = workoutDurationSeconds.toDouble() / bucketCount
    return (20.0 / bucketSeconds).roundToInt().coerceIn(1, 9)
}

/** "5'30\"" from a seconds/unit value, "--" when not finite (e.g. a bucket with no moving sample). */
private fun paceLabel(secondsPerUnit: Float): String {
    if (secondsPerUnit <= 0f || secondsPerUnit.isNaN() || secondsPerUnit.isInfinite()) return "--"
    val total = secondsPerUnit.roundToInt()
    return "%d'%02d\"".format(total / 60, total % 60)
}

/** Same formatting as [paceLabel], for a [Double] seconds-per-unit value (splits/grid use Double). */
private fun paceClock(secondsPerUnit: Double): String = paceLabel(secondsPerUnit.toFloat())

/**
 * Time-in-zone bars (Huawei's zone ring, §3.2, D-1201): minutes per zone, "<1 min"/"<1 phút" for a
 * non-zero sub-minute duration, bar length proportional to the longest zone so the shape still reads
 * at a glance even though the numbers are minutes, not percentages.
 */
@Composable
private fun HrZonesCard(durations: List<HeartRateZoneDuration>, heartColor: Color) {
    val longestSeconds = durations.maxOfOrNull { it.seconds }?.takeIf { it > 0 } ?: 1L
    Card(Modifier.fillMaxWidth().testTag("workout_hr_zones")) {
        Column(Modifier.padding(Gaps.cardPadding), verticalArrangement = Arrangement.spacedBy(Gaps.itemGap)) {
            Text(stringResource(R.string.hr_zones_title), style = MaterialTheme.typography.titleMedium, color = heartColor)
            durations.forEach { duration -> HrZoneRow(duration, longestSeconds) }
        }
    }
}

@Composable
private fun HrZoneRow(duration: HeartRateZoneDuration, longestSeconds: Long) {
    val zone = duration.zone
    val minutesText = when {
        duration.seconds <= 0L -> stringResource(R.string.hr_zone_minutes, 0)
        duration.isUnderOneMinute -> stringResource(R.string.hr_zone_under_one_minute)
        else -> stringResource(R.string.hr_zone_minutes, duration.minutes)
    }
    val description = stringResource(R.string.hr_zone_description, zone.zone, zone.label, minutesText)
    Column(Modifier.fillMaxWidth().semantics(mergeDescendants = true) { contentDescription = description }) {
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Text("Z${zone.zone} · ${zone.label}", style = MaterialTheme.typography.bodyMedium)
            Text(minutesText, style = MaterialTheme.typography.bodyMedium, color = MaterialTheme.colorScheme.onSurfaceVariant)
        }
        Spacer(Modifier.height(Spacing.xs))
        // D-1197 round 2: a plain Box track + fill instead of Material3's LinearProgressIndicator —
        // that one drew only a small floating "stop indicator" dot (no visible track at all) for a
        // zone at 0 min, since Material3's own gap/stop-indicator rendering around progress == 0f
        // leaves nothing but that dot. A hand-drawn track always renders, 0 min included, and the fill
        // on top is simply absent rather than relying on the indicator's own edge-case behaviour.
        Box(
            Modifier.fillMaxWidth().height(6.dp).clip(RoundedCornerShape(3.dp)).background(MaterialTheme.colorScheme.surfaceVariant),
        ) {
            val fraction = (duration.seconds.toFloat() / longestSeconds).coerceIn(0f, 1f)
            if (fraction > 0f) {
                Box(
                    Modifier.fillMaxWidth(fraction).fillMaxHeight()
                        .background(ZONE_COLORS.getOrElse(zone.zone - 1) { MaterialTheme.colorScheme.primary }, RoundedCornerShape(3.dp)),
                )
            }
        }
    }
}

/** Z1 (warm up) → Z5 (max), cool to hot — a generic effort gradient, not a vendor palette. */
private val ZONE_COLORS = listOf(Color(0xFF42A5F5), Color(0xFF66BB6A), Color(0xFFFFCA28), Color(0xFFFF7043), Color(0xFFE53935))

private val DATE: DateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)
private val TIME: DateTimeFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)
