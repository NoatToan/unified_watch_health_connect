package com.unified.health.core.designsystem.component

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.EaseOutCubic
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
import kotlinx.coroutines.delay
import kotlinx.coroutines.joinAll
import kotlinx.coroutines.launch

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
    // D-1157: animate each ring's sweep from 0 up to its real progress once, the first time this
    // composable enters composition (e.g. Home's RingsCard first appearing) — a slight stagger
    // between rings reads nicer than all 3 animating in lock-step. `LaunchedEffect(Unit)` runs exactly
    // once per composition lifetime (not re-keyed on `rings`), so a later recomposition with fresh
    // data (Home refresh/polling) does NOT replay the animation — `introDone` latches permanently true
    // once the one-shot finishes, and the canvas below switches to tracking `ring.progress` live
    // (instantly, no animation) from then on, rather than freezing at the first intro's end value.
    var introDone by remember { mutableStateOf(false) }
    val animatedProgress = List(rings.size) { remember { Animatable(0f) } }
    LaunchedEffect(Unit) {
        val jobs = rings.mapIndexed { index, ring ->
            launch {
                delay(index * RING_STAGGER_MS)
                animatedProgress[index].animateTo(
                    targetValue = ring.progress.coerceIn(0f, 1f),
                    animationSpec = tween(durationMillis = RING_ANIM_DURATION_MS, easing = EaseOutCubic),
                )
            }
        }
        jobs.joinAll()
        introDone = true
    }
    Canvas(modifier = modifier.size(size).semantics { contentDescription = description }) {
        val stroke = strokeWidth.toPx()
        val step = stroke + gap.toPx()
        rings.forEachIndexed { index, ring ->
            val inset = stroke / 2 + index * step
            val arcSize = Size(this.size.width - inset * 2, this.size.height - inset * 2)
            if (arcSize.width <= 0f) return@forEachIndexed
            val topLeft = Offset(inset, inset)
            val progress = if (introDone) ring.progress.coerceIn(0f, 1f) else animatedProgress[index].value
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
                sweepAngle = 360f * progress,
                useCenter = false,
                topLeft = topLeft,
                size = arcSize,
                style = Stroke(width = stroke, cap = StrokeCap.Round),
            )
        }
    }
}

private const val RING_STAGGER_MS = 120L
private const val RING_ANIM_DURATION_MS = 800
