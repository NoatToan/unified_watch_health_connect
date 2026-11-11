package com.unified.health.core.designsystem.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
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
import coil.compose.AsyncImage

/**
 * A reference-gear product photo (feature/gear's catalog browse/detail screens), or a plain
 * placeholder icon when [imageUrl] is null/not yet selected — e.g. a Salomon item whose crawl never
 * captured an image. Lives here, not a direct Coil call in `feature/gear`, so `core/designsystem`
 * stays the only module depending on Coil (D-1109, the same rationale as [RaceHeroImage]).
 */
@Composable
fun GearImage(imageUrl: String?, modifier: Modifier = Modifier, contentScale: ContentScale = ContentScale.Fit) {
    Box(modifier.background(MaterialTheme.colorScheme.surfaceVariant), contentAlignment = Alignment.Center) {
        if (imageUrl != null) {
            AsyncImage(model = imageUrl, contentDescription = null, contentScale = contentScale, modifier = Modifier.fillMaxSize())
        } else {
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
