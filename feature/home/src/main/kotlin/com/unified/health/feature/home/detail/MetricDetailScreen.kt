package com.unified.health.feature.home.detail

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SegmentedButton
import androidx.compose.material3.SegmentedButtonDefaults
import androidx.compose.material3.SingleChoiceSegmentedButtonRow
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.unified.health.core.designsystem.component.LoadingState
import com.unified.health.core.designsystem.component.SimpleBarChart
import com.unified.health.core.designsystem.component.label
import com.unified.health.core.designsystem.theme.Spacing
import com.unified.health.core.designsystem.theme.UnifiedHealthTheme
import com.unified.health.core.model.TimeRange
import kotlin.math.roundToInt

@Composable
internal fun MetricDetailRoute(onBack: () -> Unit, viewModel: MetricDetailViewModel = hiltViewModel()) {
    val state by viewModel.uiState.collectAsStateWithLifecycle()
    MetricDetailScreen(state, onBack, viewModel::selectRange)
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun MetricDetailScreen(
    state: MetricDetailUiState,
    onBack: () -> Unit,
    onRangeSelected: (TimeRange) -> Unit,
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(state.metric.label()) },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                    }
                },
            )
        },
    ) { padding ->
        Column(
            modifier = Modifier.fillMaxSize().padding(padding).verticalScroll(rememberScrollState()).padding(Spacing.lg),
            verticalArrangement = Arrangement.spacedBy(Spacing.lg),
        ) {
            val ranges = TimeRange.entries
            SingleChoiceSegmentedButtonRow(Modifier.fillMaxWidth()) {
                ranges.forEachIndexed { index, range ->
                    SegmentedButton(
                        selected = state.range == range,
                        onClick = { onRangeSelected(range) },
                        shape = SegmentedButtonDefaults.itemShape(index, ranges.size),
                    ) {
                        Text(range.name.lowercase().replaceFirstChar { it.uppercase() })
                    }
                }
            }
            if (state.isLoading) {
                LoadingState()
            } else {
                Card(Modifier.fillMaxWidth()) {
                    SimpleBarChart(
                        points = state.points,
                        barColor = UnifiedHealthTheme.metricColors.forMetric(state.metric),
                        modifier = Modifier.padding(Spacing.lg),
                    )
                }
                Row(horizontalArrangement = Arrangement.spacedBy(Spacing.md)) {
                    StatCard("Average", state.average.roundToInt().toString(), Modifier.weight(1f))
                    StatCard("Min", state.min.roundToInt().toString(), Modifier.weight(1f))
                    StatCard("Max", state.max.roundToInt().toString(), Modifier.weight(1f))
                }
                Text(
                    "Demo data. Real values will come from your wearable and Health Connect.",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                )
            }
        }
    }
}

@Composable
private fun StatCard(label: String, value: String, modifier: Modifier = Modifier) {
    Card(modifier) {
        Column(Modifier.padding(Spacing.md)) {
            Text(label, style = MaterialTheme.typography.labelMedium, color = MaterialTheme.colorScheme.onSurfaceVariant)
            Text(value, style = MaterialTheme.typography.titleLarge)
        }
    }
}
