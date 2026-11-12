package com.unified.health.feature.home.detail

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.stringResource
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewModelScope
import androidx.navigation.toRoute
import com.unified.health.core.designsystem.component.AppScreen
import com.unified.health.core.designsystem.component.EmptyState
import com.unified.health.core.designsystem.component.LoadingState
import com.unified.health.core.designsystem.component.formatValueLocalized
import com.unified.health.core.designsystem.component.label
import com.unified.health.core.designsystem.component.unit
import com.unified.health.core.designsystem.theme.Gaps
import com.unified.health.core.designsystem.theme.Spacing
import com.unified.health.core.domain.repository.HealthDataRepository
import com.unified.health.core.domain.repository.UserPreferencesRepository
import com.unified.health.core.domain.repository.WearableDeviceRepository
import com.unified.health.core.model.HealthMetricType
import com.unified.health.core.model.MetricAggregation
import com.unified.health.core.model.MetricReading
import com.unified.health.core.model.UnitSystem
import com.unified.health.feature.home.R
import com.unified.health.feature.home.navigation.MetricDataDestination
import com.unified.health.core.designsystem.R as DesignSystemR
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
    AppScreen(title = stringResource(R.string.all_recorded_data_title), onBack = onBack) { contentPadding ->
        val rows = state.rows
        when {
            rows == null -> LoadingState(Modifier.padding(contentPadding))
            rows.isEmpty() -> EmptyState(stringResource(R.string.no_data), stringResource(R.string.no_data_for_metric, state.metric.label()), Modifier.padding(contentPadding))
            // D-1194: contentPadding merged into this LazyColumn's own contentPadding (never as an
            // outer Modifier.padding) — the list scrolls fully behind the gesture bar instead of
            // stopping in a dead strip above it.
            else -> LazyColumn(
                modifier = Modifier.fillMaxSize().testTag("all_data_list"),
                contentPadding = PaddingValues(
                    top = contentPadding.calculateTopPadding(),
                    bottom = contentPadding.calculateBottomPadding() + Spacing.xxl,
                ),
            ) {
                item {
                    Text(
                        state.metric.label(),
                        style = MaterialTheme.typography.titleMedium,
                        modifier = Modifier.padding(horizontal = Gaps.screenHorizontal, vertical = Gaps.screenTop),
                    )
                }
                // D-1207: a stable key (reading time + source, not just the default index-derived one)
                // so a list that can run into the thousands (raw per-sample data) doesn't lose its
                // per-row state/identity across recompositions purely because of its position.
                itemsIndexed(rows, key = { index, row -> "${row.reading.time}_${row.reading.sourceId}_$index" }) { index, row ->
                    val metric = state.metric
                    ListItem(
                        headlineContent = { Text("${metric.formatValueLocalized(row.reading.value, unitSystem = state.unitSystem)} ${metric.unit(state.unitSystem)}".trim()) },
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
