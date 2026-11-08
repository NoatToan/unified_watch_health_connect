package com.unified.health.feature.devices

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.FastOutLinearInEasing
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.keyframes
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.unified.health.core.designsystem.component.WatchImage
import com.unified.health.core.designsystem.theme.Spacing
import com.unified.health.core.model.WatchModel
import kotlin.math.cos
import kotlin.math.sin
import kotlin.random.Random
import kotlinx.coroutines.launch

private const val PULSE_PERIOD_MS = 2600
private const val PULSE_MAX_SCALE = 1.03f
private const val SCRIM_FADE_DURATION_MS = 280
private const val EXIT_DURATION_MS = 200
// D-1163: near-opaque rather than a true 1f — at 1f the scrim read fine, but on a real device a
// mid-value (e.g. 0.92) let enough of the still-bright underlying thumbnail bleed through to look
// like a rendering glitch (faint doubled watch face) rather than an intentional soft dim.
private const val SCRIM_MAX_ALPHA = 0.97f
private const val HERO_ENTER_SCALE_FROM = 0.7f
private val HERO_MAX_SIZE = 420.dp
private val HERO_MARGIN = Spacing.xxl * 2 // clearance on every side of the enlarged image

// D-1167: opens small, grows while held, bursts + auto-dismisses at the threshold.
private const val HOLD_THRESHOLD_MS = 1800
private const val SMALL_REST_SCALE = 0.42f
private const val RELEASE_SHRINK_DURATION_MS = 220
private const val JITTER_PERIOD_MS = 90
private const val JITTER_MAX_AMPLITUDE = 0.035f
private const val CONFETTI_DURATION_MS = 700
private const val CONFETTI_PARTICLE_COUNT = 28

/**
 * [WatchImage] that doubles as the trigger for [FullscreenWatchImageViewer] (D-1148): a slow, subtle
 * breathing pulse hints that the (otherwise static-looking) image is now tappable. Tapping it opens
 * the same image full-screen over a dark scrim; the close button or system back gesture dismisses it
 * (see [FullscreenWatchImageViewer] for the D-1167 hold-to-grow interaction once it's open).
 */
@Composable
internal fun TappableWatchImage(
    model: WatchModel?,
    size: Dp,
    revealKey: Any?,
    modifier: Modifier = Modifier,
) {
    var viewerOpen by remember { mutableStateOf(false) }
    val pulse = rememberInfiniteTransition(label = "watch_image_pulse")
    val pulseScale by pulse.animateFloat(
        initialValue = 1f,
        targetValue = PULSE_MAX_SCALE,
        animationSpec = infiniteRepeatable(
            animation = tween(PULSE_PERIOD_MS, easing = FastOutSlowInEasing),
            repeatMode = RepeatMode.Reverse,
        ),
        label = "watch_image_pulse_scale",
    )

    WatchImage(
        model = model,
        size = size,
        interactive = true,
        revealKey = revealKey,
        modifier = modifier
            .graphicsLayer {
                scaleX = pulseScale
                scaleY = pulseScale
            }
            .clickable(onClickLabel = "View full screen", role = Role.Button) { viewerOpen = true }
            .testTag("watch_image_fullscreen_trigger"),
    )

    if (viewerOpen) {
        FullscreenWatchImageViewer(model = model, onDismissed = { viewerOpen = false })
    }
}

/**
 * Full-screen, dark-scrim viewer for a device's product image (D-1148). Not a true shared-element
 * transition from the trigger's on-screen position — a `Dialog` opens its own Android window, and
 * matching window coordinates reliably (status bar/IME insets, etc.) across that boundary was judged
 * more fragile than it's worth here — instead the scrim fades in while the image pops up from the
 * dialog's own center with a bouncy spring (same `Spring.DampingRatioMediumBouncy` /
 * `Spring.StiffnessLow` personality [WatchImage]'s own connect-reveal flip already uses, so it reads
 * as "this app's" motion rather than a generic fade), which a plain short fade read as an abrupt,
 * instant toggle rather than a deliberate "expand to view" gesture (D-1163).
 *
 * D-1167: it opens showing the image *small*, hinting to press-and-hold it to grow it. While held,
 * it grows with a gamified (slow-start, then accelerating, with a late jitter) curve; reaching
 * [HOLD_THRESHOLD_MS] snaps it to full size, bursts a confetti sparkle, then auto-dismisses — no tap
 * needed. Releasing early shrinks it back to the small resting state instead. The scrim tap, the
 * close button and system back remain as the plain "I don't want to bother with this" escape hatch.
 */
@Composable
private fun FullscreenWatchImageViewer(model: WatchModel?, onDismissed: () -> Unit) {
    var closing by remember { mutableStateOf(false) }
    var celebrating by remember { mutableStateOf(false) }
    val scrimAlpha = remember { Animatable(0f) }
    val heroScale = remember { Animatable(HERO_ENTER_SCALE_FROM) }
    val heroAlpha = remember { Animatable(0f) }
    val growProgress = remember { Animatable(0f) } // D-1167: 0 = small resting state, 1 = full size
    val scope = rememberCoroutineScope()

    LaunchedEffect(Unit) {
        launch { scrimAlpha.animateTo(1f, tween(SCRIM_FADE_DURATION_MS, easing = FastOutSlowInEasing)) }
        launch { heroAlpha.animateTo(1f, tween(SCRIM_FADE_DURATION_MS, easing = FastOutSlowInEasing)) }
        launch { heroScale.animateTo(1f, spring(dampingRatio = Spring.DampingRatioMediumBouncy, stiffness = Spring.StiffnessLow)) }
    }
    LaunchedEffect(closing) {
        if (closing) {
            launch { heroScale.animateTo(HERO_ENTER_SCALE_FROM, tween(EXIT_DURATION_MS, easing = FastOutSlowInEasing)) }
            launch { heroAlpha.animateTo(0f, tween(EXIT_DURATION_MS, easing = FastOutSlowInEasing)) }
            scrimAlpha.animateTo(0f, tween(EXIT_DURATION_MS, easing = FastOutSlowInEasing))
            onDismissed()
        }
    }
    // The hold-to-grow success path bypasses this — the confetti burst is its own exit, not a
    // shrink+fade, so it must not also run this.
    val dismiss: () -> Unit = { if (!celebrating) closing = true }

    Dialog(onDismissRequest = dismiss, properties = DialogProperties(usePlatformDefaultWidth = false)) {
        BoxWithConstraints(
            modifier = Modifier
                .fillMaxSize()
                .testTag("watch_image_fullscreen_viewer")
                .background(Color.Black.copy(alpha = SCRIM_MAX_ALPHA * scrimAlpha.value))
                .clickable(onClickLabel = "Close full screen image", role = Role.Button, onClick = dismiss),
            contentAlignment = Alignment.Center,
        ) {
            val heroSize = (minOf(maxWidth, maxHeight) - HERO_MARGIN).coerceAtMost(HERO_MAX_SIZE)

            // Fast "about to pop" jitter, only audible-as-motion once the hold is nearly complete.
            val jitterTransition = rememberInfiniteTransition(label = "grow_jitter")
            val jitter by jitterTransition.animateFloat(
                initialValue = -1f,
                targetValue = 1f,
                animationSpec = infiniteRepeatable(tween(JITTER_PERIOD_MS, easing = LinearEasing), RepeatMode.Reverse),
                label = "grow_jitter_value",
            )
            val jitterAmplitude = ((growProgress.value - 0.7f) / 0.3f).coerceIn(0f, 1f) * JITTER_MAX_AMPLITUDE
            val displayScale = heroScale.value *
                (SMALL_REST_SCALE + (1f - SMALL_REST_SCALE) * growProgress.value) *
                (1f + jitterAmplitude * jitter)

            WatchImage(
                model = model,
                size = heroSize,
                modifier = Modifier
                    .testTag("watch_image_fullscreen_hero")
                    .graphicsLayer {
                        scaleX = displayScale
                        scaleY = displayScale
                        alpha = heroAlpha.value
                    }
                    .then(
                        if (celebrating) {
                            Modifier
                        } else {
                            Modifier.pointerInput(Unit) {
                                detectTapGestures(
                                    onPress = {
                                        val growJob = scope.launch {
                                            growProgress.animateTo(
                                                targetValue = 1f,
                                                animationSpec = keyframes {
                                                    durationMillis = HOLD_THRESHOLD_MS
                                                    0f at 0
                                                    0.1f at (HOLD_THRESHOLD_MS * 0.4f).toInt() using FastOutSlowInEasing
                                                    0.45f at (HOLD_THRESHOLD_MS * 0.7f).toInt() using LinearEasing
                                                    1f at HOLD_THRESHOLD_MS using FastOutLinearInEasing
                                                },
                                            )
                                            // Reached naturally (not cancelled by an early release) — success.
                                            celebrating = true
                                        }
                                        tryAwaitRelease()
                                        if (growJob.isActive) {
                                            growJob.cancel()
                                            scope.launch {
                                                growProgress.animateTo(0f, tween(RELEASE_SHRINK_DURATION_MS, easing = FastOutSlowInEasing))
                                            }
                                        }
                                    },
                                )
                            }
                        },
                    ),
            )

            // D-1167: fades out as soon as the user starts holding (and for good once they succeed),
            // so it never competes with the growth/celebration itself.
            Text(
                "Press & hold to view full size",
                color = Color.White.copy(alpha = 0.75f * (1f - growProgress.value) * heroAlpha.value),
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.align(Alignment.BottomCenter).navigationBarsPadding().padding(bottom = Spacing.xxl),
            )

            if (celebrating) {
                ConfettiBurst(modifier = Modifier.fillMaxSize().testTag("watch_image_confetti"), onFinished = onDismissed)
            }

            IconButton(
                onClick = dismiss,
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .statusBarsPadding()
                    .padding(Spacing.md)
                    .testTag("watch_image_fullscreen_close"),
            ) {
                Icon(Icons.Outlined.Close, contentDescription = "Close", tint = Color.White)
            }
        }
    }
}

private data class ConfettiParticle(val angleRad: Double, val speedFraction: Float, val color: Color, val radiusDp: Float)

private val CONFETTI_COLORS = listOf(
    Color(0xFFFFC107),
    Color(0xFF26C6DA),
    Color(0xFFEC407A),
    Color(0xFF7E57C2),
    Color(0xFF66BB6A),
    Color(0xFFFF7043),
)

/** Short, colorful particle burst for the D-1167 hold-to-grow success moment — simple `Canvas` dots
 * radiating out from the center and fading, not meant to be an elaborate particle system. */
@Composable
private fun ConfettiBurst(modifier: Modifier = Modifier, onFinished: () -> Unit) {
    val progress = remember { Animatable(0f) }
    val particles = remember {
        List(CONFETTI_PARTICLE_COUNT) {
            ConfettiParticle(
                angleRad = Random.nextDouble(0.0, Math.PI * 2),
                speedFraction = Random.nextFloat() * 0.6f + 0.4f,
                color = CONFETTI_COLORS.random(),
                radiusDp = Random.nextFloat() * 4f + 3f,
            )
        }
    }
    LaunchedEffect(Unit) {
        progress.animateTo(1f, tween(CONFETTI_DURATION_MS, easing = FastOutSlowInEasing))
        onFinished()
    }
    Canvas(modifier) {
        val center = Offset(size.width / 2f, size.height / 2f)
        val maxDistance = size.minDimension * 0.5f
        val eased = progress.value
        particles.forEach { particle ->
            val distance = maxDistance * particle.speedFraction * eased
            val x = center.x + cos(particle.angleRad).toFloat() * distance
            val y = center.y + sin(particle.angleRad).toFloat() * distance
            drawCircle(
                color = particle.color.copy(alpha = (1f - eased).coerceIn(0f, 1f)),
                radius = particle.radiusDp.dp.toPx(),
                center = Offset(x, y),
            )
        }
    }
}
