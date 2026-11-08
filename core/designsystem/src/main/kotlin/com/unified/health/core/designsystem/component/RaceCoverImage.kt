package com.unified.health.core.designsystem.component

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.layout.ContentScale
import coil.compose.AsyncImage

/**
 * `RaceDetailScreen`'s cover image (D-1150), sized to the real intrinsic aspect ratio of
 * [imageUrl] once Coil decodes it, instead of a fixed-height band that crops/distorts the crawled
 * race photos — the same problem [RaceCardWithPhoto]/[RaceImageBackdrop] already solved for the
 * list view (D-1131/1136/1142). Lives here (not in `feature/races`) so Coil stays confined to
 * `core/designsystem` (D-1109), and reuses [RaceImageBackdrop] rather than a second blur
 * implementation.
 *
 * Three states:
 * 1. **Loading** (ratio unknown yet): the container defaults to a 16:9 band so the layout doesn't
 *    collapse to zero height, then [animateFloatAsState] smooths the switch to whichever ratio
 *    below is reached once the image resolves (avoids a jarring layout jump).
 * 2. **Normal ratio** (outside [SquareishAspectRatioRange]): the container's own aspect ratio is
 *    set to the image's true `width / height`, and the image is drawn [ContentScale.Fit] inside it
 *    — since the container already matches the image's ratio exactly, this shows the photo in full,
 *    uncropped and unstretched.
 * 3. **Near-square** ([SquareishAspectRatioRange]): a literal 1:1 container reads like a mistake on
 *    a detail-screen hero, not a deliberate square photo, so this keeps the 16:9 container instead,
 *    centers the image inside it at its own ratio ([ContentScale.Fit], never cropped/stretched), and
 *    fills the leftover space with [RaceImageBackdrop] — the exact blurred-backdrop treatment
 *    [RaceCardWithPhoto] already uses — instead of empty bars either side of the photo.
 */
@Composable
fun RaceCoverImage(imageUrl: String, modifier: Modifier = Modifier) {
    // Keyed on imageUrl: a different race's cover (same composable instance reused by recomposition)
    // must forget the previous image's ratio rather than briefly showing it at the wrong size.
    var intrinsicRatio by remember(imageUrl) { mutableStateOf<Float?>(null) }
    val isSquareish = intrinsicRatio?.let { it in SquareishAspectRatioRange } ?: false
    val targetRatio = if (intrinsicRatio == null || isSquareish) FallbackAspectRatio else intrinsicRatio!!
    val animatedRatio by animateFloatAsState(targetValue = targetRatio, label = "RaceCoverImageAspectRatio")

    Box(
        modifier
            .fillMaxWidth()
            .aspectRatio(animatedRatio)
            // Visible for the brief window before the image decodes, and behind a near-square photo's
            // own backdrop while that backdrop's blur is still loading in — never a flash of nothing.
            .background(MaterialTheme.colorScheme.surfaceVariant),
    ) {
        if (isSquareish) {
            RaceImageBackdrop(imageUrl, Modifier.fillMaxSize())
        }
        AsyncImage(
            model = imageUrl,
            contentDescription = null,
            // Fit, not Crop, in both branches: once `intrinsicRatio` is known the container already
            // matches the image's own ratio exactly (so Fit vs Crop is moot there), and Fit is exactly
            // what the near-square case needs — centered, uncropped — inside the wider 16:9 band.
            contentScale = ContentScale.Fit,
            modifier = Modifier.fillMaxSize(),
            onSuccess = { state ->
                val size = state.painter.intrinsicSize
                if (size != Size.Unspecified && size.width > 0f && size.height > 0f) {
                    intrinsicRatio = size.width / size.height
                }
            },
        )
    }
}

/**
 * D-1150: how close to 1:1 counts as "square enough" to trigger the 16:9-plus-backdrop treatment
 * instead of a literal square container. Deliberately wider than an exact 1:1 check so photos a
 * crawler cropped only slightly off-square (e.g. a 4:5 or 5:4 social-media crop) still get treated
 * as square-ish rather than rendered as a visibly-but-not-quite-square hero.
 */
private val SquareishAspectRatioRange = 0.85f..1.15f

private const val FallbackAspectRatio = 16f / 9f
