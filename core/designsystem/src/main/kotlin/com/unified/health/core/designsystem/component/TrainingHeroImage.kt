package com.unified.health.core.designsystem.component

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale

/**
 * `feature/training`'s per-distance hero photo (one fixed Unsplash URL per 5K/10K/Half/Marathon
 * section, not a dynamic catalog field) — unlike [GearImage] there is no null/no-image case to
 * handle, so the only two states are "loading" ([BlurFillAsyncImage]'s own
 * [androidx.compose.material3.ColorScheme.surfaceVariant] box, so there's never a flash of nothing
 * while Coil fetches the photo) and "loaded" (the photo itself). Lives here, not a direct Coil call in
 * `feature/training`, so `core/designsystem` stays the only module depending on Coil (D-1109) — a
 * sibling to [GearImage]/[RaceHeroImage], not a change to either.
 *
 * D-1207: delegates to [BlurFillAsyncImage] like [GearImage] does, so the two share one Coil/blur
 * implementation — but [contentScale] still defaults to [ContentScale.Crop] here (this hero always
 * fills its fixed-ratio band, cropping overflow on purpose), so the backdrop this adds never actually
 * triggers for the default caller (`TrainingScreen`'s distance sections); it's wired through in case a
 * future caller here ever wants [ContentScale.Fit] instead.
 */
@Composable
fun TrainingHeroImage(imageUrl: String, modifier: Modifier = Modifier, contentScale: ContentScale = ContentScale.Crop) {
    BlurFillAsyncImage(model = imageUrl, modifier = modifier, contentScale = contentScale)
}
