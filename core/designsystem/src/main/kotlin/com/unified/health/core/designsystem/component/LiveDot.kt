package com.unified.health.core.designsystem.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import com.unified.health.core.designsystem.theme.UnifiedHealthTheme

/**
 * Small status dot next to a metric's label (D-1054): green while the metric is actively streaming
 * from the connected device right now, gray while showing a cached/last-synced value instead. Only
 * rendered by callers for metrics that have a live mode at all (e.g. heart rate) — a metric with no
 * live mode shows no dot, rather than a permanently gray one.
 */
@Composable
fun LiveDot(isLive: Boolean, modifier: Modifier = Modifier) {
    val color = if (isLive) UnifiedHealthTheme.metricColors.steps else MaterialTheme.colorScheme.outlineVariant
    val description = if (isLive) "Live" else "Not live, showing last synced value"
    Box(
        modifier
            .size(8.dp)
            .semantics { contentDescription = description }
            .background(color, CircleShape),
    )
}
