package com.unified.health.core.designsystem.component

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Watch
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.CompositingStrategy
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.unified.health.core.model.WatchModel
import kotlinx.coroutines.launch

/**
 * Official product image of [model], or a watch glyph when the model is unknown / has no bundled image.
 *
 * With [interactive], the image behaves like a 3D object: it flips in when [revealKey] changes (e.g. on
 * connect), tilts in perspective while dragged and springs back with a moving highlight.
 */
@Composable
fun WatchImage(
    model: WatchModel?,
    modifier: Modifier = Modifier,
    size: Dp = 40.dp,
    interactive: Boolean = false,
    revealKey: Any? = null,
) {
    val image = model?.let { watchImageRes(it.id) }
    val description = model?.displayName
    Box(
        modifier = modifier
            .size(size)
            .then(if (interactive) Modifier.tilt3d(revealKey) else Modifier)
            .testTag("watch_image_${model?.id ?: "unknown"}"),
        contentAlignment = Alignment.Center,
    ) {
        if (image != null) {
            Image(
                painter = painterResource(image),
                contentDescription = description,
                contentScale = ContentScale.Fit,
                modifier = Modifier.fillMaxSize(),
            )
        } else {
            Box(
                Modifier.fillMaxSize().clip(CircleShape).background(MaterialTheme.colorScheme.secondaryContainer),
                contentAlignment = Alignment.Center,
            ) {
                Icon(
                    Icons.Outlined.Watch,
                    contentDescription = description,
                    tint = MaterialTheme.colorScheme.onSecondaryContainer,
                    modifier = Modifier.fillMaxSize().padding(size / 5),
                )
            }
        }
    }
}

private const val MAX_TILT_DEGREES = 28f

/** Perspective tilt that follows drags, a flip-in whenever [revealKey] changes, and a specular sheen. */
@Composable
private fun Modifier.tilt3d(revealKey: Any?): Modifier {
    val rotationX = remember { Animatable(0f) }
    val rotationY = remember { Animatable(0f) }
    val scope = rememberCoroutineScope()

    LaunchedEffect(revealKey) {
        rotationY.snapTo(-90f)
        rotationY.animateTo(0f, spring(dampingRatio = Spring.DampingRatioMediumBouncy, stiffness = Spring.StiffnessLow))
    }

    return this
        .pointerInput(Unit) {
            detectDragGestures(
                onDragEnd = {
                    scope.launch { rotationX.animateTo(0f, spring(dampingRatio = Spring.DampingRatioMediumBouncy)) }
                    scope.launch { rotationY.animateTo(0f, spring(dampingRatio = Spring.DampingRatioMediumBouncy)) }
                },
                onDragCancel = {
                    scope.launch { rotationX.animateTo(0f, tween(200)) }
                    scope.launch { rotationY.animateTo(0f, tween(200)) }
                },
            ) { change, drag ->
                change.consume()
                scope.launch { rotationY.snapTo((rotationY.value + drag.x / 4f).coerceIn(-MAX_TILT_DEGREES, MAX_TILT_DEGREES)) }
                scope.launch { rotationX.snapTo((rotationX.value - drag.y / 4f).coerceIn(-MAX_TILT_DEGREES, MAX_TILT_DEGREES)) }
            }
        }
        .graphicsLayer {
            this.rotationX = rotationX.value
            this.rotationY = rotationY.value
            cameraDistance = 12f * density
            compositingStrategy = CompositingStrategy.Offscreen
        }
        .drawWithContent {
            drawContent()
            // Highlight slides across the face opposite to the tilt, like light on a watch glass.
            val tiltX = rotationY.value / MAX_TILT_DEGREES
            val tiltY = -rotationX.value / MAX_TILT_DEGREES
            val center = Offset(size.width * (0.5f - tiltX * 0.5f), size.height * (0.5f - tiltY * 0.5f))
            drawRect(
                brush = Brush.radialGradient(
                    colors = listOf(Color.White.copy(alpha = 0.35f), Color.Transparent),
                    center = center,
                    radius = size.minDimension * 0.6f,
                ),
                blendMode = BlendMode.SrcAtop,
            )
        }
}
