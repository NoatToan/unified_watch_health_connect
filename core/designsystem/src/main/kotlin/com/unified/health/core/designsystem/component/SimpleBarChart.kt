package com.unified.health.core.designsystem.component

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.unified.health.core.model.ChartPoint

/**
 * Minimal dependency-free bar chart for the skeleton.
 * TODO: replace with a full charting library (e.g. Vico) for axes, tooltips and scrubbing.
 */
@Composable
fun SimpleBarChart(
    points: List<ChartPoint>,
    barColor: Color,
    modifier: Modifier = Modifier,
    height: Dp = 180.dp,
    maxLabels: Int = 7,
) {
    val max = (points.maxOfOrNull { it.value } ?: 0f).coerceAtLeast(1f)
    val summary = points.joinToString(limit = 31) { "${it.label}: ${it.value.toInt()}" }
    Column(modifier = modifier.semantics(mergeDescendants = true) { contentDescription = summary }) {
        Canvas(modifier = Modifier.fillMaxWidth().height(height)) {
            if (points.isEmpty()) return@Canvas
            val slot = size.width / points.size
            val barWidth = slot * 0.6f
            points.forEachIndexed { i, p ->
                val barHeight = size.height * (p.value / max)
                drawRoundRect(
                    color = barColor,
                    topLeft = Offset(i * slot + (slot - barWidth) / 2, size.height - barHeight),
                    size = Size(barWidth, barHeight),
                    cornerRadius = CornerRadius(barWidth / 3, barWidth / 3),
                )
            }
        }
        val every = ((points.size + maxLabels - 1) / maxLabels).coerceAtLeast(1)
        Row(modifier = Modifier.fillMaxWidth()) {
            points.forEachIndexed { i, p ->
                Text(
                    text = if (i % every == 0) p.label else "",
                    style = MaterialTheme.typography.labelSmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    textAlign = TextAlign.Center,
                    maxLines = 1,
                    modifier = Modifier.weight(1f),
                )
            }
        }
    }
}
