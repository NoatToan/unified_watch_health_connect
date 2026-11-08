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
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.TextMeasurer
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.drawText
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
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
) {
    val frame = rememberChartFrame()
    val maxValue = niceCeil(points.maxOfOrNull { it.value } ?: 0f)
    var scrubX by remember(points) { mutableStateOf<Float?>(null) }
    Canvas(
        modifier
            .fillMaxWidth()
            .height(height)
            .semantics { contentDescription = describe(points) }
            .chartScrubGestures(points.isNotEmpty()) { scrubX = it },
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
            .chartScrubGestures(points.isNotEmpty()) { scrubX = it },
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
    val total = Duration.between(session.start, session.end).toMillis().coerceAtLeast(1)
    val time = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)
    val description = "Sleep stages from ${time.format(session.start.atZone(zone))} to ${time.format(session.end.atZone(zone))}"
    Canvas(modifier.fillMaxWidth().height(height).semantics { contentDescription = description }) {
        val gutter = 44.dp.toPx()
        val bottomGutter = 18.dp.toPx()
        val laneHeight = (size.height - bottomGutter) / lanes.size
        lanes.forEachIndexed { i, stage ->
            val y = i * laneHeight
            drawLine(grid, Offset(gutter, y + laneHeight), Offset(size.width, y + laneHeight), 1f)
            val text = measurer.measure(stage.displayName(), labelStyle)
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
    Column(modifier, verticalArrangement = Arrangement.spacedBy(Spacing.xs)) {
        listOf(SleepStage.AWAKE, SleepStage.REM, SleepStage.LIGHT, SleepStage.DEEP).forEach { stage ->
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(Modifier.size(10.dp).background(colors.sleepStage(stage), RoundedCornerShape(2.dp)))
                Spacer(Modifier.width(Spacing.sm))
                Text(stage.displayName(), style = MaterialTheme.typography.bodyMedium, modifier = Modifier.weight(1f))
                Text(formatMinutes(session.durationOf(stage).toMinutes().toInt()), style = MaterialTheme.typography.bodyMedium)
            }
        }
    }
}

fun SleepStage.displayName(): String = when (this) {
    SleepStage.AWAKE -> "Awake"
    SleepStage.REM -> "REM"
    SleepStage.LIGHT -> "Core"
    SleepStage.DEEP -> "Deep"
}

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
