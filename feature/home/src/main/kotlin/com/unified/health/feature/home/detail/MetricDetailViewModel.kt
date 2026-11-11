package com.unified.health.feature.home.detail

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.toRoute
import com.unified.health.core.domain.repository.HealthDataRepository
import com.unified.health.core.domain.repository.UserPreferencesRepository
import com.unified.health.core.domain.usecase.Highlight
import com.unified.health.core.domain.usecase.HighlightCalculator
import com.unified.health.core.domain.usecase.MetricStats
import com.unified.health.core.domain.usecase.MetricStatsCalculator
import com.unified.health.core.model.ChartPoint
import com.unified.health.core.model.HealthMetricType
import com.unified.health.core.model.MetricAggregation
import com.unified.health.core.model.SleepSession
import com.unified.health.core.model.TimeRange
import com.unified.health.core.model.UnitSystem
import com.unified.health.feature.home.navigation.MetricDetailDestination
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.stateIn
import java.time.DayOfWeek
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle
import java.time.temporal.TemporalAdjusters
import javax.inject.Inject

data class MetricDetailUiState(
    val metric: HealthMetricType,
    val range: TimeRange = TimeRange.WEEK,
    val points: List<ChartPoint> = emptyList(),
    val stats: MetricStats? = null,
    /** The night shown by the stage chart (sleep, D only). */
    val sleepSession: SleepSession? = null,
    val periodLabel: String = "",
    /**
     * Week-over-week highlight / this week's own stats, for the one-line analysis under the chart
     * (Huawei Health style). Kept as raw domain values here, not a pre-formatted String — composing
     * the final sentence needs `stringResource` to localize it (D-1040), which only the Composable
     * screen (not this ViewModel) can call; see `MetricDetailScreen`'s `InsightCard` call site.
     */
    val insightHighlight: Highlight? = null,
    val insightWeekStats: MetricStats? = null,
    val isLoading: Boolean = true,
    /** D-1183: Metric (km/kg) vs Imperial (mi/lb) distance/weight display, from Profile's toggle. */
    val unitSystem: UnitSystem = UnitSystem.METRIC,
)

@OptIn(ExperimentalCoroutinesApi::class)
@HiltViewModel
class MetricDetailViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    private val repository: HealthDataRepository,
    private val preferences: UserPreferencesRepository,
) : ViewModel() {

    private val metric = savedStateHandle.toRoute<MetricDetailDestination>().metric
    private val range = MutableStateFlow(TimeRange.WEEK)

    val uiState: StateFlow<MetricDetailUiState> = range
        .flatMapLatest { r ->
            val today = LocalDate.now()
            val night = if (metric.aggregation == MetricAggregation.SLEEP && r == TimeRange.DAY) repository.observeSleep(today) else flowOf(null)
            // Fixed MONTH window for the analysis line, independent of the selected D/W/M/6M/Y tab
            // (so switching ranges doesn't make the insight jump around).
            val monthly = repository.observeMetricSeries(metric, TimeRange.MONTH, today)
            combine(
                repository.observeMetricSeries(metric, r, today),
                night,
                monthly,
                preferences.userPreferences,
            ) { points, session, monthPoints, prefs ->
                val weekPoints = monthPoints.takeLast(7)
                MetricDetailUiState(
                    metric = metric,
                    range = r,
                    points = points,
                    stats = MetricStatsCalculator.of(metric, r, points),
                    sleepSession = session,
                    periodLabel = periodLabel(r, today),
                    insightHighlight = HighlightCalculator.compute(metric, monthPoints),
                    insightWeekStats = MetricStatsCalculator.of(metric, TimeRange.WEEK, weekPoints),
                    isLoading = false,
                    unitSystem = prefs.unitSystem,
                )
            }
        }
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), MetricDetailUiState(metric))

    fun selectRange(newRange: TimeRange) {
        range.value = newRange
    }

    companion object {
        private val DAY = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)
        private val MONTH_YEAR = DateTimeFormatter.ofPattern("MMM yyyy")

        /** The calendar span a range covers, e.g. "Oct 31, 2026 – Nov 6, 2026". */
        fun periodLabel(range: TimeRange, today: LocalDate): String = when (range) {
            TimeRange.DAY -> "Today, ${DAY.format(today)}"
            TimeRange.WEEK -> "${DAY.format(today.minusDays(6))} – ${DAY.format(today)}"
            TimeRange.MONTH -> "${DAY.format(today.minusDays(29))} – ${DAY.format(today)}"
            TimeRange.SIX_MONTHS -> {
                val start = today.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY)).minusWeeks(25)
                "${MONTH_YEAR.format(start)} – ${MONTH_YEAR.format(today)}"
            }
            TimeRange.YEAR -> "${MONTH_YEAR.format(today.withDayOfMonth(1).minusMonths(11))} – ${MONTH_YEAR.format(today)}"
        }
    }
}
