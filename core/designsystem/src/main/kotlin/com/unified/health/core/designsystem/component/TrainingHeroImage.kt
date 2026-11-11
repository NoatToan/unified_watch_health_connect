package com.unified.health.core.designsystem.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import coil.compose.AsyncImage

/**
 * `feature/training`'s per-distance hero photo (one fixed Unsplash URL per 5K/10K/Half/Marathon
 * section, not a dynamic catalog field) — unlike [GearImage] there is no null/no-image case to
 * handle, so the only two states are "loading" ([MaterialTheme.colorScheme.surfaceVariant] box, so
 * there's never a flash of nothing while Coil fetches the photo) and "loaded" (the photo itself).
 * Lives here, not a direct Coil call in `feature/training`, so `core/designsystem` stays the only
 * module depending on Coil (D-1109) — a sibling to [GearImage]/[RaceHeroImage], not a change to
 * either.
 */
@Composable
fun TrainingHeroImage(imageUrl: String, modifier: Modifier = Modifier, contentScale: ContentScale = ContentScale.Crop) {
    Box(modifier.background(MaterialTheme.colorScheme.surfaceVariant)) {
        AsyncImage(model = imageUrl, contentDescription = null, contentScale = contentScale, modifier = Modifier.fillMaxSize())
    }
}
