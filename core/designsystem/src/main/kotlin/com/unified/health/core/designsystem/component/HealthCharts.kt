package com.unified.health.core.designsystem.component

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.TextMeasurer
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.drawText
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.unified.health.core.designsystem.R
import com.unified.health.core.designsystem.theme.Spacing
import com.unified.health.core.designsystem.theme.UnifiedHealthTheme
import com.unified.health.core.model.ChartPoint
import com.unified.health.core.model.SleepSession
import com.unified.health.core.model.SleepStage
import java.time.Duration
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle
import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.log10
import kotlin.math.max
import kotlin.math.min
import kotlin.math.pow

/**
 * Bar chart for cumulative metrics (steps, energy, sleep minutes…), Apple-Health style: right-hand
 * gridline values, sparse x labels that never overlap, optional dashed average line.
 */
@Composable
fun HealthBarChart(
    points: List<ChartPoint>,
    color: Color,
    modifier: Modifier = Modifier,
    height: Dp = 200.dp,
    average: Float? = null,
    axisLabel: (Float) -> String = ::compactNumber,
    /** D-1094: overlays a moving-average trend line, lighter/solid so it reads as distinct from the
     * flat dashed [average] line and the bars themselves. Off by default — callers turn it on for
     * longer ranges (Week/Month/6-Month/Year), where a trend is meaningful; a single Day of bars is
     * too short a series to trend. */
    showTrend: Boolean = false,
    /** D-1132: off for Home's small embedded mini-charts (too small to scrub, and the drag would
     *  conflict with the card's own tap-to-open-detail) — only [MetricDetailScreen] (the default)
     *  lets you drag to see a specific day's value. */
    scrubEnabled: Boolean = true,
) {
    val frame = rememberChartFrame()
    val maxValue = niceCeil(points.maxOfOrNull { it.value } ?: 0f)
    var scrubX by remember(points) { mutableStateOf<Float?>(null) }
    Canvas(
        modifier
            .fillMaxWidth()
            .height(height)
            .semantics { contentDescription = describe(points) }
            .chartScrubGestures(scrubEnabled && points.isNotEmpty()) { scrubX = it },
    ) {
        val plot = frame.drawAxes(this, 0f, maxValue, points.map { it.label }, axisLabel)
        val slot = plot.width / points.size.coerceAtLeast(1)
        val barWidth = (slot * 0.62f).coerceAtMost(28.dp.toPx())
        points.forEachIndexed { i, p ->
            if (p.value <= 0f) return@forEachIndexed
            val h = plot.height * (p.value / maxValue)
            drawRoundRect(
                color = color,
                topLeft = Offset(plot.left + i * slot + (slot - barWidth) / 2, plot.bottom - h),
                size = Size(barWidth, h),
                cornerRadius = CornerRadius(barWidth / 4),
            )
        }
        average?.takeIf { it > 0f }?.let { avg ->
            val y = plot.bottom - plot.height * (avg / maxValue)
            drawLine(color.copy(alpha = 0.8f), Offset(plot.left, y), Offset(plot.right, y), 1.5.dp.toPx(), pathEffect = PathEffect.dashPathEffect(floatArrayOf(8f, 8f)))
        }
        if (showTrend) {
            TrendLine.movingAverage(points, window = trendWindow(points.size))?.let { trend ->
                drawTrendLine(plot, trend, 0f, maxValue, color)
            }
        }
        frame.drawScrub(this, plot, points, scrubX, color) { p ->
            if (p.value <= 0f) "${p.label}: no data" else "${p.label}: ${axisLabel(p.value)}"
        }
    }
}

/** Min–max capsules per bucket (heart rate, SpO2, HRV…); a dot where min equals max. */
@Composable
fun HealthRangeChart(
    points: List<ChartPoint>,
    color: Color,
    modifier: Modifier = Modifier,
    height: Dp = 200.dp,
    axisLabel: (Float) -> String = ::compactNumber,
    /** D-1094: overlays a linear-regression trend line (see [HealthBarChart]'s [showTrend] for why
     * it defaults off). A straight best-fit line reads better here than a moving average, since
     * capsule charts (heart rate, SpO2…) are naturally noisier point-to-point. */
    showTrend: Boolean = false,
    /** D-1132: see [HealthBarChart]'s [scrubEnabled] — same rationale, off for Home's mini-charts. */
    scrubEnabled: Boolean = true,
) {
    val frame = rememberChartFrame()
    val withData = points.filter { it.hasData }
    val low = withData.minOfOrNull { it.min ?: it.value } ?: 0f
    val high = withData.maxOfOrNull { it.max ?: it.value } ?: 1f
    val pad = ((high - low) * 0.15f).coerceAtLeast(2f)
    val yMin = niceFloor(max(0f, low - pad))
    val yMax = niceCeil(high + pad)
    var scrubX by remember(points) { mutableStateOf<Float?>(null) }
    Canvas(
        modifier
            .fillMaxWidth()
            .height(height)
            .semantics { contentDescription = describe(points) }
            .chartScrubGestures(scrubEnabled && points.isNotEmpty()) { scrubX = it },
    ) {
        val plot = frame.drawAxes(this, yMin, yMax, points.map { it.label }, axisLabel)
        val slot = plot.width / points.size.coerceAtLeast(1)
        val w = (slot * 0.5f).coerceIn(3.dp.toPx(), 10.dp.toPx())
        fun y(v: Float) = plot.bottom - plot.height * ((v - yMin) / (yMax - yMin))
        points.forEachIndexed { i, p ->
            if (!p.hasData) return@forEachIndexed
            val cx = plot.left + i * slot + slot / 2
            val top = y(p.max ?: p.value)
            val bottom = y(p.min ?: p.value)
            if (bottom - top < w) {
                drawCircle(color, radius = w / 2 + 1.dp.toPx(), center = Offset(cx, (top + bottom) / 2))
            } else {
                drawRoundRect(color, Offset(cx - w / 2, top), Size(w, bottom - top), CornerRadius(w / 2))
            }
        }
        if (showTrend) {
            TrendLine.linearRegression(points)?.let { trend -> drawTrendLine(plot, trend, yMin, yMax, color) }
        }
        frame.drawScrub(this, plot, points, scrubX, color) { p ->
            val min = p.min
            val max = p.max
            when {
                !p.hasData -> "${p.label}: no data"
                min != null && max != null && max != min -> "${p.label}: ${axisLabel(min)}–${axisLabel(max)}"
                else -> "${p.label}: ${axisLabel(p.value)}"
            }
        }
    }
}

/** Hypnogram of one night: one lane per stage (Awake on top, Deep at the bottom). */
@Composable
fun SleepStageChart(
    session: SleepSession,
    modifier: Modifier = Modifier,
    height: Dp = 180.dp,
    zone: ZoneId = ZoneId.systemDefault(),
) {
    val colors = UnifiedHealthTheme.metricColors
    val measurer = rememberTextMeasurer()
    val labelStyle = MaterialTheme.typography.labelSmall.copy(color = MaterialTheme.colorScheme.onSurfaceVariant)
    val grid = MaterialTheme.colorScheme.outlineVariant
    val lanes = listOf(SleepStage.AWAKE, SleepStage.REM, SleepStage.LIGHT, SleepStage.DEEP)
    // Resolved once here (Composable scope) rather than inside the Canvas draw lambda below, which
    // is plain DrawScope — not Composable, so it cannot call stringResource() itself.
    val laneLabels = sleepStageLabels()
    val total = Duration.between(session.start, session.end).toMillis().coerceAtLeast(1)
    val time = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)
    val description = stringResource(
        R.string.chart_sleep_stages_description,
        time.format(session.start.atZone(zone)),
        time.format(session.end.atZone(zone)),
    )
    Canvas(modifier.fillMaxWidth().height(height).semantics { contentDescription = description }) {
        val gutter = 44.dp.toPx()
        val bottomGutter = 18.dp.toPx()
        val laneHeight = (size.height - bottomGutter) / lanes.size
        lanes.forEachIndexed { i, stage ->
            val y = i * laneHeight
            drawLine(grid, Offset(gutter, y + laneHeight), Offset(size.width, y + laneHeight), 1f)
            val text = measurer.measure(laneLabels[stage].orEmpty(), labelStyle)
            drawText(text, topLeft = Offset(0f, y + (laneHeight - text.size.height) / 2))
        }
        val width = size.width - gutter
        session.segments.forEach { seg ->
            val lane = lanes.indexOf(seg.stage)
            val x0 = gutter + width * Duration.between(session.start, seg.start).toMillis() / total
            val x1 = gutter + width * Duration.between(session.start, seg.end).toMillis() / total
            drawRoundRect(
                colors.sleepStage(seg.stage),
                Offset(x0, lane * laneHeight + laneHeight * 0.2f),
                Size((x1 - x0).coerceAtLeast(2f), laneHeight * 0.6f),
                CornerRadius(3.dp.toPx()),
            )
        }
        val start = measurer.measure(time.format(session.start.atZone(zone)), labelStyle)
        val end = measurer.measure(time.format(session.end.atZone(zone)), labelStyle)
        drawText(start, topLeft = Offset(gutter, size.height - start.size.height))
        drawText(end, topLeft = Offset(size.width - end.size.width, size.height - end.size.height))
    }
}

/** Colour key with the time spent in each stage. */
@Composable
fun SleepStageLegend(session: SleepSession, modifier: Modifier = Modifier) {
    val colors = UnifiedHealthTheme.metricColors
    val labels = sleepStageLabels()
    val hourUnit = stringResource(R.string.duration_hour_unit)
    val minuteUnit = stringResource(R.string.duration_minute_unit)
    Column(modifier, verticalArrangement = Arrangement.spacedBy(Spacing.xs)) {
        listOf(SleepStage.AWAKE, SleepStage.REM, SleepStage.LIGHT, SleepStage.DEEP).forEach { stage ->
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(Modifier.size(10.dp).background(colors.sleepStage(stage), RoundedCornerShape(2.dp)))
                Spacer(Modifier.width(Spacing.sm))
                Text(labels[stage].orEmpty(), style = MaterialTheme.typography.bodyMedium, modifier = Modifier.weight(1f))
                Text(
                    formatMinutes(session.durationOf(stage).toMinutes().toInt(), hourUnit, minuteUnit),
                    style = MaterialTheme.typography.bodyMedium,
                )
            }
        }
    }
}

/** [SleepStage] lane/legend names, resolved once per composition so non-Composable draw scopes
 *  (e.g. [SleepStageChart]'s `Canvas` lambda) can look them up by key instead of calling
 *  `stringResource` themselves. */
@Composable
private fun sleepStageLabels(): Map<SleepStage, String> = mapOf(
    SleepStage.AWAKE to stringResource(R.string.sleep_stage_awake),
    SleepStage.REM to stringResource(R.string.sleep_stage_rem),
    SleepStage.LIGHT to stringResource(R.string.sleep_stage_light),
    SleepStage.DEEP to stringResource(R.string.sleep_stage_deep),
)

// ---------------------------------------------------------------- shared frame

private class PlotArea(val left: Float, val top: Float, val right: Float, val bottom: Float) {
    val width get() = right - left
    val height get() = bottom - top

    /** Index of the bucket nearest [x] (canvas-space pixels), using the same slot width [ChartFrame.drawAxes] laid out. */
    fun nearestIndex(x: Float, count: Int): Int {
        val slot = width / count.coerceAtLeast(1)
        return (((x - left) / slot).toInt()).coerceIn(0, count - 1)
    }
}

private class ChartFrame(
    val measurer: TextMeasurer,
    val labelStyle: TextStyle,
    val gridColor: Color,
    val scrubBubbleColor: Color,
    val onScrubBubbleColor: Color,
) {

    /** Draws 3 gridlines with values on the right and non-overlapping x labels; returns the plot area. */
    fun drawAxes(scope: DrawScope, yMin: Float, yMax: Float, xLabels: List<String>, axisLabel: (Float) -> String): PlotArea = with(scope) {
        val gutter = 40.dp.toPx()
        val bottomGutter = 20.dp.toPx()
        val plot = PlotArea(0f, 8.dp.toPx(), size.width - gutter, size.height - bottomGutter)
        for (i in 0..2) {
            val v = yMin + (yMax - yMin) * i / 2
            val y = plot.bottom - plot.height * i / 2
            drawLine(gridColor, Offset(plot.left, y), Offset(plot.right, y), 1f, pathEffect = if (i == 0) null else PathEffect.dashPathEffect(floatArrayOf(4f, 6f)))
            val text = measurer.measure(axisLabel(v), labelStyle)
            drawText(text, topLeft = Offset(plot.right + 6.dp.toPx(), y - text.size.height / 2))
        }
        val slot = plot.width / xLabels.size.coerceAtLeast(1)
        var lastEnd = Float.NEGATIVE_INFINITY
        xLabels.forEachIndexed { i, label ->
            if (label.isEmpty()) return@forEachIndexed
            val text = measurer.measure(label, labelStyle)
            val x = (plot.left + i * slot + slot / 2 - text.size.width / 2).coerceIn(0f, size.width - text.size.width)
            if (x < lastEnd + 6.dp.toPx()) return@forEachIndexed
            drawText(text, topLeft = Offset(x, plot.bottom + 4.dp.toPx()))
            lastEnd = x + text.size.width
        }
        plot
    }

    /**
     * D-1020: vertical indicator line + a value bubble at the bucket nearest [scrubX] (canvas-space
     * pixels, from [chartScrubGestures], or null while not scrubbing). Uses the exact [PlotArea]
     * [drawAxes] just laid out, so the indicator always lines up with the bars/capsules it covers.
     */
    fun <T> drawScrub(scope: DrawScope, plot: PlotArea, points: List<T>, scrubX: Float?, accent: Color, valueText: (T) -> String) {
        if (scrubX == null || points.isEmpty()) return
        val index = plot.nearestIndex(scrubX, points.size)
        val slot = plot.width / points.size.coerceAtLeast(1)
        val cx = plot.left + index * slot + slot / 2
        with(scope) {
            drawLine(accent, Offset(cx, plot.top), Offset(cx, plot.bottom), 1.5.dp.toPx(), pathEffect = PathEffect.dashPathEffect(floatArrayOf(6f, 4f)))
            val text = measurer.measure(valueText(points[index]), labelStyle.copy(color = onScrubBubbleColor))
            val padding = 4.dp.toPx()
            val bubbleWidth = text.size.width + 2 * padding
            val left = (cx - bubbleWidth / 2).coerceIn(0f, (size.width - bubbleWidth).coerceAtLeast(0f))
            drawRoundRect(
                color = scrubBubbleColor,
                topLeft = Offset(left, plot.top),
                size = Size(bubbleWidth, text.size.height + 2 * padding),
                cornerRadius = CornerRadius(4.dp.toPx()),
            )
            drawText(text, topLeft = Offset(left + padding, plot.top + padding))
        }
    }
}

@Composable
private fun rememberChartFrame(): ChartFrame = ChartFrame(
    measurer = rememberTextMeasurer(),
    labelStyle = MaterialTheme.typography.labelSmall.copy(color = MaterialTheme.colorScheme.onSurfaceVariant),
    gridColor = MaterialTheme.colorScheme.outlineVariant,
    scrubBubbleColor = MaterialTheme.colorScheme.inverseSurface,
    onScrubBubbleColor = MaterialTheme.colorScheme.inverseOnSurface,
)

/**
 * D-1020: drag (or tap-and-hold) to scrub a chart. Reports the pointer's x in the same canvas-space
 * pixels [ChartFrame.drawAxes]/[ChartFrame.drawScrub] use, or null once released so the indicator
 * disappears. Only [HealthBarChart]/[HealthRangeChart] (the full-size charts on `MetricDetailScreen`)
 * use this — the feed's mini-chart cards are too small to be worth scrubbing.
 */
private fun Modifier.chartScrubGestures(enabled: Boolean, onScrub: (Float?) -> Unit): Modifier {
    if (!enabled) return this
    return this
        .pointerInput(Unit) {
            detectDragGestures(
                onDragEnd = { onScrub(null) },
                onDragCancel = { onScrub(null) },
            ) { change, _ ->
                change.consume()
                onScrub(change.position.x)
            }
        }
        .pointerInput(Unit) {
            detectTapGestures(
                onPress = { offset ->
                    onScrub(offset.x)
                    tryAwaitRelease()
                    onScrub(null)
                },
            )
        }
}

/** A trend line's window for [TrendLine.movingAverage]: roughly a sixth of the series, 2..9 points. */
private fun trendWindow(pointCount: Int): Int = (pointCount / 6).coerceIn(2, 9)

/**
 * Draws [values] (one per x-slot, same layout [ChartFrame.drawAxes] used) as a light, solid polyline
 * — deliberately different from [drawAxes]'s dashed gridlines and [HealthBarChart]'s dashed average
 * line, so the trend reads as its own, lower-emphasis series (D-1094).
 */
private fun DrawScope.drawTrendLine(plot: PlotArea, values: List<Float>, yMin: Float, yMax: Float, color: Color) {
    if (values.size < 2 || yMax <= yMin) return
    val slot = plot.width / values.size.coerceAtLeast(1)
    fun y(v: Float) = plot.bottom - plot.height * ((v - yMin) / (yMax - yMin)).coerceIn(0f, 1f)
    val path = Path()
    values.forEachIndexed { i, v ->
        val x = plot.left + i * slot + slot / 2
        val py = y(v)
        if (i == 0) path.moveTo(x, py) else path.lineTo(x, py)
    }
    drawPath(path, color.copy(alpha = 0.45f), style = Stroke(width = 2.dp.toPx()))
}

/** Pure trend-line math (D-1094), split out so it is unit-testable without a Compose [DrawScope]. */
internal object TrendLine {

    /**
     * Least-squares line through the points of [points] that [ChartPoint.hasData], evaluated at
     * every index (including the gaps) — null when fewer than 2 data points exist to fit a line.
     */
    fun linearRegression(points: List<ChartPoint>): List<Float>? {
        val xs = points.indices.filter { points[it].hasData }
        if (xs.size < 2) return null
        val n = xs.size.toDouble()
        val sumX = xs.sumOf { it.toDouble() }
        val sumY = xs.sumOf { points[it].value.toDouble() }
        val sumXY = xs.sumOf { it.toDouble() * points[it].value }
        val sumXX = xs.sumOf { it.toDouble() * it }
        val denominator = n * sumXX - sumX * sumX
        if (denominator == 0.0) return null
        val slope = (n * sumXY - sumX * sumY) / denominator
        val intercept = (sumY - slope * sumX) / n
        return points.indices.map { (slope * it + intercept).toFloat() }
    }

    /**
     * Centered simple moving average of [points] over [window] data points (edges shrink the window
     * rather than padding with zeros); null when fewer than 2 points of [points] [ChartPoint.hasData].
     */
    fun movingAverage(points: List<ChartPoint>, window: Int): List<Float>? {
        val values = points.map { if (it.hasData) it.value else null }
        if (values.count { it != null } < 2) return null
        val half = (window / 2).coerceAtLeast(1)
        return points.indices.map { i ->
            val lo = (i - half).coerceAtLeast(0)
            val hi = (i + half).coerceAtMost(points.lastIndex)
            val windowValues = (lo..hi).mapNotNull { values[it] }
            if (windowValues.isEmpty()) values[i] ?: 0f else windowValues.average().toFloat()
        }
    }
}

private fun describe(points: List<ChartPoint>): String =
    points.filter { it.hasData }.joinToString(limit = 31) { "${it.label}: ${it.value.toInt()}" }.ifEmpty { "No data" }

/** 1, 2, 2.5, 5 × 10ⁿ just above [v]. */
internal fun niceCeil(v: Float): Float {
    if (v <= 0f) return 1f
    val magnitude = 10.0.pow(floor(log10(v.toDouble()))).toFloat()
    val n = v / magnitude
    val nice = listOf(1f, 2f, 2.5f, 5f, 10f).first { it >= n - 1e-4f }
    return nice * magnitude
}

internal fun niceFloor(v: Float): Float {
    if (v <= 0f) return 0f
    val step = 10.0.pow(floor(log10(v.toDouble()))).toFloat()
    return (floor(v / step) * step).let { min(it, v) }
}

fun compactNumber(v: Float): String = when {
    v >= 10_000f -> "${(v / 1000).toInt()}k"
    v >= 1_000f -> String.format(java.util.Locale.getDefault(), "%.1fk", v / 1000).replace(".0k", "k")
    v == ceil(v) -> v.toInt().toString()
    else -> String.format(java.util.Locale.getDefault(), "%.1f", v)
}
