package com.unified.health.feature.home.browse

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.DirectionsRun
import androidx.compose.material.icons.automirrored.outlined.KeyboardArrowRight
import androidx.compose.material.icons.outlined.Air
import androidx.compose.material.icons.outlined.Bedtime
import androidx.compose.material.icons.outlined.ExpandLess
import androidx.compose.material.icons.outlined.ExpandMore
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.FitnessCenter
import androidx.compose.material.icons.outlined.MonitorWeight
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.SelfImprovement
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.ListItemDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.testTag
import com.unified.health.core.designsystem.component.icon
import com.unified.health.core.designsystem.component.label
import com.unified.health.core.designsystem.theme.Spacing
import com.unified.health.core.designsystem.theme.UnifiedHealthTheme
import com.unified.health.core.model.HealthMetricType

/** A Browse category (Apple Health: Activity, Heart, Respiratory, Sleep…). */
internal data class HealthCategory(
    val title: String,
    val icon: ImageVector,
    val metrics: List<HealthMetricType>,
    /** Shows a "Workouts" entry that opens the Activity tab. */
    val hasWorkouts: Boolean = false,
)

internal val HEALTH_CATEGORIES = listOf(
    HealthCategory(
        "Activity",
        Icons.AutoMirrored.Outlined.DirectionsRun,
        listOf(HealthMetricType.STEPS, HealthMetricType.DISTANCE, HealthMetricType.CALORIES, HealthMetricType.EXERCISE_MINUTES),
        hasWorkouts = true,
    ),
    HealthCategory("Heart", Icons.Outlined.FavoriteBorder, listOf(HealthMetricType.HEART_RATE, HealthMetricType.RESTING_HEART_RATE, HealthMetricType.HRV)),
    HealthCategory("Respiratory", Icons.Outlined.Air, listOf(HealthMetricType.SPO2)),
    HealthCategory("Sleep", Icons.Outlined.Bedtime, listOf(HealthMetricType.SLEEP)),
    HealthCategory("Mental wellbeing", Icons.Outlined.SelfImprovement, listOf(HealthMetricType.STRESS)),
    HealthCategory("Body measurements", Icons.Outlined.MonitorWeight, listOf(HealthMetricType.WEIGHT)),
)

@Composable
internal fun BrowseRoute(onMetricClick: (HealthMetricType) -> Unit, onOpenWorkouts: () -> Unit) {
    BrowseScreen(onMetricClick, onOpenWorkouts)
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun BrowseScreen(onMetricClick: (HealthMetricType) -> Unit, onOpenWorkouts: () -> Unit) {
    var query by rememberSaveable { mutableStateOf("") }
    var expanded by rememberSaveable { mutableStateOf(setOf<String>()) }
    Scaffold(topBar = { TopAppBar(title = { Text("Browse") }) }) { padding ->
        LazyColumn(
            modifier = Modifier.fillMaxSize().padding(padding).testTag("browse_list"),
            contentPadding = PaddingValues(start = Spacing.lg, end = Spacing.lg, bottom = Spacing.xxl),
            verticalArrangement = Arrangement.spacedBy(Spacing.md),
        ) {
            item {
                OutlinedTextField(
                    value = query,
                    onValueChange = { query = it },
                    leadingIcon = { Icon(Icons.Outlined.Search, contentDescription = null) },
                    placeholder = { Text("Search") },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth().testTag("browse_search"),
                )
            }
            if (query.isNotBlank()) {
                val matches = HealthMetricType.entries.filter { it.label().contains(query.trim(), ignoreCase = true) }
                if (matches.isEmpty()) {
                    item { Text("No results for \"$query\"", color = MaterialTheme.colorScheme.onSurfaceVariant) }
                }
                items(matches, key = { "search_${it.name}" }) { metric ->
                    ElevatedCard(Modifier.fillMaxWidth()) { MetricRow(metric, onClick = { onMetricClick(metric) }) }
                }
            } else {
                items(HEALTH_CATEGORIES, key = { it.title }) { category ->
                    val open = category.title in expanded
                    CategoryCard(
                        category = category,
                        expanded = open,
                        onToggle = { expanded = if (open) expanded - category.title else expanded + category.title },
                        onMetricClick = onMetricClick,
                        onOpenWorkouts = onOpenWorkouts,
                    )
                }
            }
        }
    }
}

@Composable
private fun CategoryCard(
    category: HealthCategory,
    expanded: Boolean,
    onToggle: () -> Unit,
    onMetricClick: (HealthMetricType) -> Unit,
    onOpenWorkouts: () -> Unit,
) {
    val accent = UnifiedHealthTheme.metricColors.forMetric(category.metrics.first())
    ElevatedCard(Modifier.fillMaxWidth().testTag("category_${category.title}")) {
        Column {
            ListItem(
                modifier = Modifier.clickableRow(onToggle),
                colors = ListItemDefaults.colors(containerColor = Color.Transparent),
                leadingContent = { Icon(category.icon, contentDescription = null, tint = accent) },
                headlineContent = { Text(category.title, style = MaterialTheme.typography.titleMedium, color = accent) },
                trailingContent = {
                    Icon(if (expanded) Icons.Outlined.ExpandLess else Icons.Outlined.ExpandMore, contentDescription = if (expanded) "Collapse" else "Expand")
                },
            )
            AnimatedVisibility(expanded) {
                Column {
                    category.metrics.forEach { metric ->
                        HorizontalDivider()
                        MetricRow(metric, onClick = { onMetricClick(metric) })
                    }
                    if (category.hasWorkouts) {
                        HorizontalDivider()
                        ListItem(
                            modifier = Modifier.clickableRow(onOpenWorkouts).testTag("browse_workouts"),
                            colors = ListItemDefaults.colors(containerColor = Color.Transparent),
                            leadingContent = { Icon(Icons.Outlined.FitnessCenter, contentDescription = null) },
                            headlineContent = { Text("Workouts") },
                            trailingContent = { Icon(Icons.AutoMirrored.Outlined.KeyboardArrowRight, contentDescription = null) },
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun MetricRow(metric: HealthMetricType, onClick: () -> Unit) {
    ListItem(
        modifier = Modifier.clickableRow(onClick).testTag("browse_metric_${metric.name}"),
        colors = ListItemDefaults.colors(containerColor = Color.Transparent),
        leadingContent = { Icon(metric.icon(), contentDescription = null, tint = UnifiedHealthTheme.metricColors.forMetric(metric)) },
        headlineContent = { Text(metric.label()) },
        trailingContent = { Icon(Icons.AutoMirrored.Outlined.KeyboardArrowRight, contentDescription = null) },
    )
}

private fun Modifier.clickableRow(onClick: () -> Unit): Modifier = clickable(onClick = onClick)
