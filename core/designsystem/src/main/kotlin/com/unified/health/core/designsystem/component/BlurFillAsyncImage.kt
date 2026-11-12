package com.unified.health.core.designsystem.component

import android.graphics.drawable.BitmapDrawable
import android.os.Build
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.imageLoader
import coil.request.ImageRequest
import coil.request.SuccessResult
import kotlin.math.abs

/**
 * D-1207: a remote image whose intrinsic aspect ratio doesn't match its container's (a gray-background
 * product photo inside a square gear card, a tall poster inside a 16:9 band, …) used to be drawn with
 * [ContentScale.Fit] — correct (never cropped/stretched) but leaving visible background-color bars in
 * the empty space either side. This fills that empty space with a blurred, [ContentScale.Crop]'d copy
 * of the *same* photo instead — [GearImage]'s product cards are the case that prompted this, but the
 * fix is generic so [TrainingHeroImage] and [RaceCoverImage]'s near-square branch share it too, rather
 * than three separate ad-hoc blur implementations. Kept here (not a direct Coil call in any `feature`
 * module) so `core/designsystem` stays the only module depending on Coil (D-1109).
 *
 * This is the *auto-detecting* entry point: it measures its own container (via [BoxWithConstraints])
 * and the loaded image's intrinsic size, and only switches on the backdrop when they disagree by more
 * than [AspectRatioMismatchThreshold] — otherwise it draws exactly what a plain `AsyncImage(model,
 * contentScale)` would have (no backdrop, no behavior change). [contentScale] is the caller's intent,
 * not overridden: a caller that explicitly wants [ContentScale.Crop] (e.g. [GearImage]'s small variant
 * thumbnails, D-1109's sibling) is asking to fill-and-crop on purpose, so this never adds a backdrop
 * for it — the backdrop only ever applies behind a [ContentScale.Fit] foreground, since Crop by
 * definition never leaves an empty area to fill. [onIntrinsicRatioChanged] is an escape hatch for a
 * caller ([RaceCoverImage]) that also needs the measured ratio itself to resize *its own* container
 * (that container's resize is intentionally not wired back into this composable's own mismatch
 * detection — see [RaceCoverImage]'s doc for why: it would otherwise flash the backdrop on for the
 * brief window while that resize animation is still catching up).
 *
 * One [ImageRequest] instance, explicitly sized from the measured container ([BoxWithConstraints]'
 * constraints converted to px), is reused as the `model` for both the foreground and (when shown) the
 * backdrop's `AsyncImage` — Coil's `ImageLoader` dedupes/caches by request equality, so this guarantees
 * one fetch/decode serves both layers instead of two independent downloads of the same URL. (Coil's
 * default per-composable size resolution, left to resolve from each `AsyncImage`'s own `Modifier`
 * constraints, would *usually* land on the same size here too since both layers fill the same box —
 * but only "usually"; sharing one explicit request removes the guesswork.)
 */
@Composable
fun BlurFillAsyncImage(
    model: Any,
    modifier: Modifier = Modifier,
    contentScale: ContentScale = ContentScale.Fit,
    onIntrinsicRatioChanged: (Float) -> Unit = {},
) {
    BoxWithConstraints(modifier.background(MaterialTheme.colorScheme.surfaceVariant)) {
        val density = LocalDensity.current
        val context = LocalContext.current
        val widthPx = with(density) { if (maxWidth != Dp.Infinity) maxWidth.roundToPx() else 0 }
        val heightPx = with(density) { if (maxHeight != Dp.Infinity) maxHeight.roundToPx() else 0 }
        val containerRatio = if (widthPx > 0 && heightPx > 0) widthPx.toFloat() / heightPx.toFloat() else null

        val request = remember(model, widthPx, heightPx) {
            ImageRequest.Builder(context).data(model).apply {
                if (widthPx > 0 && heightPx > 0) size(widthPx, heightPx)
            }.build()
        }

        var imageRatio by remember(model) { mutableStateOf<Float?>(null) }
        val showBackdrop = contentScale == ContentScale.Fit &&
            containerRatio != null &&
            imageRatio?.let { aspectRatioMismatch(it, containerRatio) } == true

        if (showBackdrop) {
            ImageBackdropLayer(request, Modifier.fillMaxSize())
        }
        AsyncImage(
            model = request,
            contentDescription = null,
            contentScale = contentScale,
            modifier = Modifier.fillMaxSize(),
            onSuccess = { state ->
                val size = state.painter.intrinsicSize
                if (size != Size.Unspecified && size.width > 0f && size.height > 0f) {
                    val ratio = size.width / size.height
                    imageRatio = ratio
                    onIntrinsicRatioChanged(ratio)
                }
            },
        )
    }
}

/**
 * D-1207: the backdrop layer on its own, for a caller that has already decided (by its own means) that
 * it wants one — [BlurFillAsyncImage] uses this once its auto-detection fires, and [RaceCoverImage]'s
 * near-square branch calls it directly (it already knows the image is near-square without needing this
 * file's generic mismatch check). Does no measuring/deciding of its own.
 *
 * `Modifier.blur()` only performs a real blur from API 31 (`Build.VERSION_CODES.S`) onward; Compose
 * silently no-ops it below that rather than crashing, which would otherwise leave the backdrop as an
 * unblurred, unscrimmed duplicate of the sharp foreground image — a visibly broken "double image"
 * rather than a graceful degradation. [backdropRenderStyleFor] picks a solid *average*-color fill
 * instead on those older devices: cheap to compute (a 16×16 downsampled decode, not a real k-means/
 * palette extraction — `androidx.palette` isn't a dependency anywhere in this app, and one real
 * blur-adjacent dependency isn't worth adding just for this corner), close enough in hue/brightness to
 * the photo to read as "the same image's own background" rather than an arbitrary color, and avoids a
 * second full-resolution decode of the same image purely for the fallback.
 */
@Composable
internal fun ImageBackdropLayer(model: Any, modifier: Modifier = Modifier) {
    Box(modifier) {
        when (backdropRenderStyleFor(Build.VERSION.SDK_INT)) {
            BackdropRenderStyle.BLURRED_IMAGE -> {
                AsyncImage(
                    model = model,
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize().blur(BackdropBlurRadius),
                )
                Box(Modifier.fillMaxSize().background(Color.Black.copy(alpha = BackdropScrimAlpha)))
            }
            BackdropRenderStyle.SOLID_AVERAGE_COLOR -> {
                val context = LocalContext.current
                var averageColor by remember(model) { mutableStateOf<Color?>(null) }
                LaunchedEffect(model) {
                    val request = ImageRequest.Builder(context)
                        .data(model)
                        .size(AverageColorSampleSize, AverageColorSampleSize)
                        .allowHardware(false)
                        .build()
                    val result = context.imageLoader.execute(request)
                    if (result is SuccessResult) {
                        val bitmap = (result.drawable as? BitmapDrawable)?.bitmap
                        if (bitmap != null) {
                            val pixels = IntArray(bitmap.width * bitmap.height)
                            bitmap.getPixels(pixels, 0, bitmap.width, 0, 0, bitmap.width, bitmap.height)
                            averageColor = averageColor(pixels)
                        }
                    }
                }
                Box(Modifier.fillMaxSize().background(averageColor ?: MaterialTheme.colorScheme.surfaceVariant))
            }
        }
    }
}

/** D-1207: how far apart (as a fraction of the container's own ratio) [imageRatio] and [containerRatio]
 *  must be before the mismatch is worth filling with a backdrop rather than just leaving the (small,
 *  barely-noticeable) letterbox bars a near-exact match would otherwise leave. Pulled out as a pure
 *  function (no Compose/Android types) so [BlurFillAsyncImage] unit tests can cover the threshold
 *  behavior directly instead of only through a Compose UI test. */
internal fun aspectRatioMismatch(imageRatio: Float, containerRatio: Float, threshold: Float = AspectRatioMismatchThreshold): Boolean {
    if (imageRatio <= 0f || containerRatio <= 0f) return false
    return abs(imageRatio - containerRatio) / containerRatio > threshold
}

/** D-1207: ~5% — tight enough to catch the real-world cases this was written for (a square product
 *  photo in a 4:5 card, a 3:2 photo in a 16:9 band) without triggering on an image that's merely a
 *  pixel or two off its container due to rounding. */
internal const val AspectRatioMismatchThreshold = 0.05f

/** D-1207: which backdrop rendering path to use for a given `Build.VERSION.SDK_INT` — pulled out as a
 *  pure function of the SDK int (not a direct `Build.VERSION.SDK_INT` read) so it has a plain JVM unit
 *  test independent of Robolectric/instrumentation. [Build.VERSION_CODES.S] (31) is where
 *  `Modifier.blur()` starts doing a real blur (backed by `RenderEffect`) instead of silently no-op'ing. */
internal fun backdropRenderStyleFor(sdkInt: Int): BackdropRenderStyle =
    if (sdkInt >= Build.VERSION_CODES.S) BackdropRenderStyle.BLURRED_IMAGE else BackdropRenderStyle.SOLID_AVERAGE_COLOR

internal enum class BackdropRenderStyle { BLURRED_IMAGE, SOLID_AVERAGE_COLOR }

/** D-1207: the color whose each channel is the mean of [pixels]' same channel — deliberately not a
 *  real dominant-color/palette algorithm (no clustering, no quantization), since [pixels] is expected
 *  to already be a tiny downsampled bitmap ([AverageColorSampleSize]², not a full decode) where a plain
 *  mean reads as "roughly this photo's color" just as well for a blurred-backdrop stand-in. Pulled out
 *  as a pure function over a plain `IntArray` (not `android.graphics.Bitmap`) so it has a plain JVM
 *  unit test independent of Robolectric/instrumentation. */
internal fun averageColor(pixels: IntArray): Color {
    if (pixels.isEmpty()) return Color.Black
    var r = 0L
    var g = 0L
    var b = 0L
    for (pixel in pixels) {
        r += (pixel shr 16) and 0xFF
        g += (pixel shr 8) and 0xFF
        b += pixel and 0xFF
    }
    val n = pixels.size
    return Color(red = (r.toFloat() / n) / 255f, green = (g.toFloat() / n) / 255f, blue = (b.toFloat() / n) / 255f, alpha = 1f)
}

/** Matches [RaceCard]'s existing [RaceImageBackdrop] blur/scrim tuning so a backdrop reads the same
 *  whether it came from that decorative full-card use or this gap-filling one. */
private val BackdropBlurRadius = 24.dp
private const val BackdropScrimAlpha = 0.35f

/** 16×16: enough pixels to average into something resembling the photo's overall color, small enough
 *  that Coil's decode of it is effectively free next to the full-size foreground decode already
 *  happening in the same composable. */
private const val AverageColorSampleSize = 16
