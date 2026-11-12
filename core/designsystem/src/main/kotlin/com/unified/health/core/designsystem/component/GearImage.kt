package com.unified.health.core.designsystem.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Checkroom
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp

/**
 * A reference-gear product photo (feature/gear's catalog browse/detail screens), or a plain
 * placeholder icon when [imageUrl] is null/not yet selected — e.g. a Salomon item whose crawl never
 * captured an image. Lives here, not a direct Coil call in `feature/gear`, so `core/designsystem`
 * stays the only module depending on Coil (D-1109, the same rationale as [RaceHeroImage]).
 *
 * D-1207: a real photo renders via [BlurFillAsyncImage] rather than a plain `AsyncImage`, so a product
 * photo whose own aspect ratio doesn't match this card's (e.g. a square gray-background shot inside a
 * taller card) gets a blurred-same-image backdrop filling the gap instead of visible background-color
 * bars either side. [contentScale] is passed straight through — a caller that explicitly asks for
 * [ContentScale.Crop] (the small 56dp variant-color thumbnails on `GearDetailScreen`) still gets plain
 * crop-and-fill with no backdrop, since there's no empty area to fill in the first place.
 */
@Composable
fun GearImage(imageUrl: String?, modifier: Modifier = Modifier, contentScale: ContentScale = ContentScale.Fit) {
    if (imageUrl != null) {
        BlurFillAsyncImage(model = imageUrl, modifier = modifier, contentScale = contentScale)
    } else {
        Box(modifier.background(MaterialTheme.colorScheme.surfaceVariant), contentAlignment = Alignment.Center) {
            Icon(
                Icons.Outlined.Checkroom,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onSurfaceVariant,
                modifier = Modifier.size(PlaceholderIconSize),
            )
        }
    }
}

/** Fixed icon size for the no-image placeholder, independent of the container's own (variable) size. */
private val PlaceholderIconSize = 40.dp
