package com.unified.health.core.designsystem.component

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import kotlin.math.roundToInt

@Immutable
data class RingSpec(val label: String, val progress: Float, val color: Color)

/** Concentric progress rings (outer → inner), e.g. steps / active minutes / calories. */
@Composable
fun ActivityRings(
    rings: List<RingSpec>,
    modifier: Modifier = Modifier,
    size: Dp = 140.dp,
    strokeWidth: Dp = 14.dp,
    gap: Dp = 4.dp,
) {
    val description = rings.joinToString { "${it.label} ${(it.progress * 100).roundToInt()}%" }
    Canvas(modifier = modifier.size(size).semantics { contentDescription = description }) {
        val stroke = strokeWidth.toPx()
        val step = stroke + gap.toPx()
        rings.forEachIndexed { index, ring ->
            val inset = stroke / 2 + index * step
            val arcSize = Size(this.size.width - inset * 2, this.size.height - inset * 2)
            if (arcSize.width <= 0f) return@forEachIndexed
            val topLeft = Offset(inset, inset)
            drawArc(
                color = ring.color.copy(alpha = 0.2f),
                startAngle = 0f,
                sweepAngle = 360f,
                useCenter = false,
                topLeft = topLeft,
                size = arcSize,
                style = Stroke(width = stroke),
            )
            drawArc(
                color = ring.color,
                startAngle = -90f,
                sweepAngle = 360f * ring.progress.coerceIn(0f, 1f),
                useCenter = false,
                topLeft = topLeft,
                size = arcSize,
                style = Stroke(width = stroke, cap = StrokeCap.Round),
            )
        }
    }
}
