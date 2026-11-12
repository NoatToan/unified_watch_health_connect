package com.unified.health.core.designsystem.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.unified.health.core.designsystem.theme.Gaps
import com.unified.health.core.designsystem.theme.Spacing

/**
 * Small labelled value ("Avg. heart rate · 142 bpm") used in stat grids. One accessibility node;
 * [value] null renders "--" and reads as "no data".
 */
@Composable
fun StatTile(
    label: String,
    value: String?,
    modifier: Modifier = Modifier,
    unit: String = "",
    accent: Color = Color.Unspecified,
) {
    val description = "$label, " + (value?.let { "$it $unit".trim() } ?: "no data")
    Card(modifier.semantics(mergeDescendants = true) { contentDescription = description }) {
        Column(Modifier.fillMaxWidth().padding(Gaps.cardPadding)) {
            Text(
                label,
                style = MaterialTheme.typography.labelMedium,
                color = if (accent == Color.Unspecified) MaterialTheme.colorScheme.onSurfaceVariant else accent,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
            Row(verticalAlignment = Alignment.Bottom) {
                Text(value ?: "--", style = MaterialTheme.typography.titleLarge)
                if (value != null && unit.isNotEmpty()) {
                    Spacer(Modifier.width(Spacing.xs))
                    Text(
                        unit,
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        modifier = Modifier.padding(bottom = 3.dp),
                    )
                }
            }
        }
    }
}
