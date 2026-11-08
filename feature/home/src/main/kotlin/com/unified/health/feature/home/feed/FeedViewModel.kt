package com.unified.health.feature.home.feed

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.unified.health.core.domain.repository.HealthDataRepository
import com.unified.health.core.domain.repository.UserPreferencesRepository
import com.unified.health.core.domain.usecase.HighlightCalculator
import com.unified.health.core.domain.usecase.MetricStatsCalculator
import com.unified.health.core.domain.usecase.ObserveTodaySummaryUseCase
import com.unified.health.core.model.FeedCardId
import com.unified.health.core.model.HealthMetricType
import com.unified.health.core.model.TimeRange
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import java.time.LocalDate
import javax.inject.Inject

internal sealed interface FeedUiState {
    data object Loading : FeedUiState
    data class Success(
        val cards: List<FeedCardData>,
        /** Every known card id, in the user's order (including hidden ones, for the Edit dialog). */
        val order: List<String>,
        val hidden: Set<String>,
    ) : FeedUiState
    data class Error(val message: String) : FeedUiState
}

/**
 * The Health feed (Huawei Health reference): every metric flattened onto one screen as an inline
 * card with a mini chart and a one-line analysis, in an order the user can edit. Replaces the old
 * Browse category list.
 */
@HiltViewModel
internal class FeedViewModel @Inject constructor(
    observeTodaySummary: ObserveTodaySummaryUseCase,
    private val healthData: HealthDataRepository,
    private val preferences: UserPreferencesRepository,
) : ViewModel() {

    private val today = LocalDate.now()

    private val metricCards = combine(ALL_METRICS.map(::metricCardFlow)) { it.toList() }

    val uiState: StateFlow<FeedUiState> =
        combine(
            metricCards,
            observeTodaySummary(),
            healthData.observeWorkouts(),
            preferences.userPreferences,
        ) { cards, summary, workouts, prefs ->
            val byId = buildMap<String, FeedCardData> {
                put(FeedCardId.ACTIVITY_RINGS, FeedCardData.Activity(summary))
                put(FeedCardId.WORKOUTS, FeedCardData.Workouts(workouts.sortedByDescending { it.start }.take(FeedCardData.Workouts.MAX_SHOWN)))
                cards.forEach { card ->
                    val enriched = when (card.metric) {
                        HealthMetricType.HEART_RATE -> card.copy(restingBpm = summary.heartRate.restingBpm)
                        HealthMetricType.SLEEP -> card.copy(sleepSession = summary.sleep)
                        else -> card
                    }
                    put(enriched.id, enriched)
                }
            }
            val visible = prefs.feedCardOrder.filterNot { it in prefs.hiddenFeedCards }.mapNotNull { byId[it] }
            FeedUiState.Success(visible, prefs.feedCardOrder, prefs.hiddenFeedCards) as FeedUiState
        }
            .catch { emit(FeedUiState.Error(it.message ?: "Unable to load data")) }
            .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), FeedUiState.Loading)

    private fun metricCardFlow(metric: HealthMetricType) = combine(
        healthData.observeLatestReading(metric, today),
        healthData.observeMetricSeries(metric, TimeRange.MONTH, today),
    ) { reading, monthPoints ->
        val weekPoints = monthPoints.takeLast(7)
        FeedCardData.Metric(
            metric = metric,
            reading = reading,
            weekPoints = weekPoints,
            weekStats = MetricStatsCalculator.of(metric, TimeRange.WEEK, weekPoints),
            highlight = HighlightCalculator.compute(metric, monthPoints),
        )
    }

    /** "Edit cards": persists the new order (every id) and the set hidden from the feed. */
    fun setFeedCards(order: List<String>, hidden: Set<String>) {
        viewModelScope.launch { preferences.setFeedCards(order, hidden) }
    }

    private companion object {
        val ALL_METRICS = HealthMetricType.entries
    }
}
