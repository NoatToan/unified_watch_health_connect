package com.unified.health.feature.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.unified.health.core.domain.repository.HealthDataRepository
import com.unified.health.core.domain.repository.LiveHealthRepository
import com.unified.health.core.domain.repository.UserPreferencesRepository
import com.unified.health.core.domain.repository.WearableDeviceRepository
import com.unified.health.core.domain.usecase.Highlight
import com.unified.health.core.domain.usecase.HighlightCalculator
import com.unified.health.core.domain.usecase.MetricStatsCalculator
import com.unified.health.core.domain.usecase.ObserveHighlightsUseCase
import com.unified.health.core.domain.usecase.ObservePrimaryDeviceUseCase
import com.unified.health.core.domain.usecase.ObserveTodaySummaryUseCase
import com.unified.health.core.model.ConnectionState
import com.unified.health.core.model.DailyHealthSummary
import com.unified.health.core.model.FeedCardId
import com.unified.health.core.model.HealthMetricType
import com.unified.health.core.model.LiveHeartRate
import com.unified.health.core.model.MetricReading
import com.unified.health.core.model.TimeRange
import com.unified.health.core.model.WearableDevice
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import java.time.LocalDate
import javax.inject.Inject

data class PinnedReading(val metric: HealthMetricType, val reading: MetricReading?)

sealed interface HomeUiState {
    data object Loading : HomeUiState
    data class Success(
        val summary: DailyHealthSummary,
        val device: WearableDevice?,
        val pinned: List<PinnedReading> = emptyList(),
        val highlights: List<Highlight> = emptyList(),
        val deviceCount: Int = if (device == null) 0 else 1,
        /** The full metric feed (D-1010: merged from the old Health tab), in the user's order. */
        val feedCards: List<FeedCardData> = emptyList(),
        /** Every known feed card id, in the user's order (including hidden ones, for the Edit dialog). */
        val feedOrder: List<String> = emptyList(),
        val hiddenFeedCards: Set<String> = emptySet(),
    ) : HomeUiState
    data class Error(val message: String) : HomeUiState
}

/** The full feed cards plus the order/hidden bookkeeping "Edit cards" needs. */
private data class FeedBundle(
    val cards: List<FeedCardData>,
    val order: List<String>,
    val hidden: Set<String>,
)

@OptIn(ExperimentalCoroutinesApi::class)
@HiltViewModel
class HomeViewModel @Inject constructor(
    observeTodaySummary: ObserveTodaySummaryUseCase,
    observePrimaryDevice: ObservePrimaryDeviceUseCase,
    observeHighlights: ObserveHighlightsUseCase,
    private val deviceRepository: WearableDeviceRepository,
    private val healthData: HealthDataRepository,
    private val preferences: UserPreferencesRepository,
    liveHealth: LiveHealthRepository,
) : ViewModel() {

    /** Collected only while Home is visible, which is what turns the watch sensor on. */
    val liveHeartRate: StateFlow<LiveHeartRate?> = liveHealth.heartRate

    private val _isRefreshing = MutableStateFlow(false)
    val isRefreshing: StateFlow<Boolean> = _isRefreshing.asStateFlow()

    private val pinnedMetrics: Flow<List<HealthMetricType>> =
        preferences.userPreferences.map { it.pinnedMetrics }.distinctUntilChanged()

    private val pinned: Flow<List<PinnedReading>> = pinnedMetrics.flatMapLatest { metrics ->
        if (metrics.isEmpty()) {
            flowOf(emptyList())
        } else {
            val today = LocalDate.now()
            combine(metrics.map { m -> healthData.observeLatestReading(m, today).map { PinnedReading(m, it) } }) { it.toList() }
        }
    }

    private val metricCards = combine(ALL_METRICS.map(::metricCardFlow)) { it.toList() }

    private val feedBundle: Flow<FeedBundle> = combine(
        metricCards,
        healthData.observeWorkouts(),
        preferences.userPreferences,
    ) { cards, workouts, prefs ->
        val byId = buildMap<String, FeedCardData> {
            put(FeedCardId.WORKOUTS, FeedCardData.Workouts(workouts.sortedByDescending { it.start }.take(FeedCardData.Workouts.MAX_SHOWN)))
            cards.forEach { put(it.id, it) }
        }
        // Activity rings used to be a feed card of their own (ActivityRingsFeedCard); D-1010 dropped the
        // duplicate in favour of the one RingsCard already at the top of Home, so a stray ACTIVITY_RINGS
        // id from an older install's saved order is simply filtered out here.
        val order = prefs.feedCardOrder.filterNot { it == FeedCardId.ACTIVITY_RINGS }
        val visible = order.filterNot { it in prefs.hiddenFeedCards }.mapNotNull { byId[it] }
        FeedBundle(visible, order, prefs.hiddenFeedCards)
    }

    private val header = combine(
        observeTodaySummary(),
        observePrimaryDevice(),
        deviceRepository.pairedDevices.map { it.size },
        pinned,
        observeHighlights(),
    ) { summary, device, count, pinnedReadings, highlights ->
        HomeUiState.Success(summary, device, pinnedReadings, highlights, count)
    }

    val uiState: StateFlow<HomeUiState> =
        combine(header, feedBundle) { state, feed ->
            val enriched = feed.cards.map { card ->
                when {
                    card !is FeedCardData.Metric -> card
                    card.metric == HealthMetricType.HEART_RATE -> card.copy(restingBpm = state.summary.heartRate.restingBpm)
                    card.metric == HealthMetricType.SLEEP -> card.copy(sleepSession = state.summary.sleep)
                    else -> card
                }
            }
            state.copy(feedCards = enriched, feedOrder = feed.order, hiddenFeedCards = feed.hidden) as HomeUiState
        }
            .catch { emit(HomeUiState.Error(it.message ?: "Unable to load data")) }
            .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), HomeUiState.Loading)

    private fun metricCardFlow(metric: HealthMetricType) = combine(
        healthData.observeLatestReading(metric, LocalDate.now()),
        healthData.observeMetricSeries(metric, TimeRange.MONTH, LocalDate.now()),
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

    fun setPinned(metrics: List<HealthMetricType>) {
        viewModelScope.launch { preferences.setPinnedMetrics(metrics) }
    }

    /** "Edit cards" on the full metric feed: persists the new order (every id) and the hidden set. */
    fun setFeedCards(order: List<String>, hidden: Set<String>) {
        viewModelScope.launch { preferences.setFeedCards(order, hidden) }
    }

    /** Pull-to-refresh: syncs every connected device. */
    fun refresh() {
        viewModelScope.launch {
            _isRefreshing.value = true
            val connected = deviceRepository.pairedDevices.first().filter { it.connectionState == ConnectionState.Connected }
            if (connected.isEmpty()) delay(600) else connected.forEach { deviceRepository.syncNow(it.id) }
            _isRefreshing.value = false
        }
    }

    private companion object {
        val ALL_METRICS = HealthMetricType.entries
    }
}
