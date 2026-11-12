package com.unified.health.core.designsystem.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.unified.health.core.designsystem.theme.Gaps
import com.unified.health.core.designsystem.theme.MetricValueTextStyle
import com.unified.health.core.designsystem.theme.Spacing
import com.unified.health.core.designsystem.theme.UnifiedHealthTheme
import com.unified.health.core.model.HealthMetricType

/**
 * Dashboard tile for a single metric. The whole card is one accessibility node with a
 * merged description such as "Steps, 6,240 steps, 78% of goal".
 */
@Composable
fun MetricCard(
    metric: HealthMetricType,
    value: String,
    unit: String,
    modifier: Modifier = Modifier,
    supportingText: String? = null,
    progress: Float? = null,
    onClick: () -> Unit = {},
) {
    val accent = UnifiedHealthTheme.metricColors.forMetric(metric)
    val description = buildString {
        append(metric.label()).append(", ").append(value).append(' ').append(unit)
        supportingText?.let { append(", ").append(it) }
    }
    ElevatedCard(
        onClick = onClick,
        modifier = modifier.semantics(mergeDescendants = true) { contentDescription = description },
        shape = MaterialTheme.shapes.large,
    ) {
        Column(
            modifier = Modifier.fillMaxWidth().padding(Gaps.cardPadding),
            verticalArrangement = Arrangement.spacedBy(Gaps.cardContentGap),
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(metric.icon(), contentDescription = null, tint = accent, modifier = Modifier.size(20.dp))
                Spacer(Modifier.width(Spacing.sm))
                Text(
                    text = metric.label(),
                    style = MaterialTheme.typography.titleSmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
            }
            Row(verticalAlignment = Alignment.Bottom) {
                Text(text = value, style = MetricValueTextStyle, color = MaterialTheme.colorScheme.onSurface)
                Spacer(Modifier.width(Spacing.xs))
                Text(
                    text = unit,
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    modifier = Modifier.padding(bottom = Spacing.xs),
                )
            }
            if (progress != null) {
                LinearProgressIndicator(
                    progress = { progress },
                    color = accent,
                    trackColor = accent.copy(alpha = 0.2f),
                    strokeCap = StrokeCap.Round,
                    modifier = Modifier.fillMaxWidth(),
                )
            }
            if (supportingText != null) {
                Text(
                    text = supportingText,
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                )
            }
        }
    }
}

@Preview
@Composable
private fun MetricCardPreview() {
    UnifiedHealthTheme(dynamicColor = false) {
        MetricCard(
            metric = HealthMetricType.STEPS,
            value = "6,240",
            unit = "steps",
            supportingText = "78% of 8,000",
            progress = 0.78f,
        )
    }
}
