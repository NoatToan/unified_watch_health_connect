package com.unified.health.feature.home.detail

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewModelScope
import androidx.navigation.toRoute
import com.unified.health.core.designsystem.component.EmptyState
import com.unified.health.core.designsystem.component.LoadingState
import com.unified.health.core.designsystem.component.formatValue
import com.unified.health.core.designsystem.component.label
import com.unified.health.core.designsystem.component.unit
import com.unified.health.core.designsystem.theme.Spacing
import com.unified.health.core.domain.repository.HealthDataRepository
import com.unified.health.core.domain.repository.UserPreferencesRepository
import com.unified.health.core.domain.repository.WearableDeviceRepository
import com.unified.health.core.model.HealthMetricType
import com.unified.health.core.model.MetricAggregation
import com.unified.health.core.model.MetricReading
import com.unified.health.core.model.UnitSystem
import com.unified.health.feature.home.navigation.MetricDataDestination
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle
import javax.inject.Inject

/** One row of "Show All Data", with the source device resolved to a name (multi-brand attribution). */
data class ReadingRow(val reading: MetricReading, val source: String?)

data class MetricDataUiState(
    val metric: HealthMetricType,
    val rows: List<ReadingRow>? = null,
    /** D-1183: Metric (km/kg) vs Imperial (mi/lb) distance/weight display, from Profile's toggle. */
    val unitSystem: UnitSystem = UnitSystem.METRIC,
)

@HiltViewModel
class MetricDataViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    healthData: HealthDataRepository,
    devices: WearableDeviceRepository,
    preferences: UserPreferencesRepository,
) : ViewModel() {
    private val metric = savedStateHandle.toRoute<MetricDataDestination>().metric

    val uiState: StateFlow<MetricDataUiState> =
        combine(healthData.observeMetricReadings(metric), devices.pairedDevices, preferences.userPreferences) { readings, paired, prefs ->
            val names = paired.associate { it.id to "${it.name} · ${it.vendor.displayName}" }
            MetricDataUiState(metric, readings.map { ReadingRow(it, it.sourceId?.let { id -> names[id] ?: id }) }, prefs.unitSystem)
        }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), MetricDataUiState(metric))
}

@Composable
internal fun MetricDataRoute(onBack: () -> Unit, viewModel: MetricDataViewModel = hiltViewModel()) {
    val state by viewModel.uiState.collectAsStateWithLifecycle()
    MetricDataScreen(state, onBack)
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun MetricDataScreen(state: MetricDataUiState, onBack: () -> Unit) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("All recorded data") },
                navigationIcon = { IconButton(onClick = onBack) { Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back") } },
            )
        },
    ) { padding ->
        val rows = state.rows
        when {
            rows == null -> LoadingState(Modifier.padding(padding))
            rows.isEmpty() -> EmptyState("No data", "Nothing recorded for ${state.metric.label()} yet.", Modifier.padding(padding))
            else -> LazyColumn(
                modifier = Modifier.fillMaxSize().padding(padding).testTag("all_data_list"),
                contentPadding = PaddingValues(bottom = Spacing.xxl),
            ) {
                item {
                    Text(
                        state.metric.label(),
                        style = MaterialTheme.typography.titleMedium,
                        modifier = Modifier.padding(horizontal = Spacing.lg, vertical = Spacing.sm),
                    )
                }
                itemsIndexed(rows) { index, row ->
                    val metric = state.metric
                    ListItem(
                        headlineContent = { Text("${metric.formatValue(row.reading.value, unitSystem = state.unitSystem)} ${metric.unit(state.unitSystem)}".trim()) },
                        supportingContent = row.source?.let { { Text(it) } },
                        trailingContent = { Text(whenLabel(metric, row.reading), style = MaterialTheme.typography.bodySmall) },
                        modifier = Modifier.testTag("data_row_$index"),
                    )
                    HorizontalDivider()
                }
            }
        }
    }
}

private fun whenLabel(metric: HealthMetricType, reading: MetricReading): String {
    val zone = ZoneId.systemDefault()
    return when (metric.aggregation) {
        MetricAggregation.CUMULATIVE -> DATE.format(reading.time.atZone(zone))
        MetricAggregation.SLEEP -> "${DATE_TIME.format(reading.time.atZone(zone))} – ${TIME.format((reading.endTime ?: reading.time).atZone(zone))}"
        MetricAggregation.DISCRETE -> DATE_TIME.format(reading.time.atZone(zone))
    }
}

private val DATE: DateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)
private val TIME: DateTimeFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)
private val DATE_TIME: DateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.SHORT)
