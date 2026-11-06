package com.unified.health.core.designsystem.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.KeyboardArrowRight
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import com.unified.health.core.designsystem.theme.MetricValueTextStyle
import com.unified.health.core.designsystem.theme.Spacing
import com.unified.health.core.designsystem.theme.UnifiedHealthTheme
import com.unified.health.core.model.HealthMetricType

/**
 * Full-width Summary row for a pinned metric (Apple Health "Pinned" card): coloured title with the
 * time of the reading, then the value. [value] null renders "No data".
 */
@Composable
fun SummaryMetricCard(
    metric: HealthMetricType,
    value: String?,
    unit: String,
    timeLabel: String?,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val accent = UnifiedHealthTheme.metricColors.forMetric(metric)
    val description = buildString {
        append(metric.label()).append(", ")
        append(if (value == null) "No data" else "$value $unit".trim())
        timeLabel?.let { append(", ").append(it) }
    }
    ElevatedCard(onClick = onClick, modifier = modifier.fillMaxWidth().semantics(mergeDescendants = true) { contentDescription = description }) {
        Column(Modifier.padding(Spacing.lg), verticalArrangement = Arrangement.spacedBy(Spacing.sm)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(metric.icon(), contentDescription = null, tint = accent, modifier = Modifier.size(18.dp))
                Spacer(Modifier.width(Spacing.sm))
                Text(metric.label(), style = MaterialTheme.typography.titleSmall, color = accent, modifier = Modifier.weight(1f))
                timeLabel?.let { Text(it, style = MaterialTheme.typography.labelMedium, color = MaterialTheme.colorScheme.onSurfaceVariant) }
                Icon(Icons.AutoMirrored.Outlined.KeyboardArrowRight, contentDescription = null, tint = MaterialTheme.colorScheme.onSurfaceVariant)
            }
            Row(verticalAlignment = Alignment.Bottom) {
                Text(value ?: "No data", style = if (value == null) MaterialTheme.typography.titleMedium else MetricValueTextStyle)
                if (value != null && unit.isNotEmpty()) {
                    Spacer(Modifier.width(Spacing.xs))
                    Text(unit, style = MaterialTheme.typography.bodyMedium, color = MaterialTheme.colorScheme.onSurfaceVariant, modifier = Modifier.padding(bottom = 4.dp))
                }
            }
        }
    }
}
