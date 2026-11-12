package com.unified.health.feature.home

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.unified.health.core.domain.repository.HealthDataRepository
import com.unified.health.core.domain.repository.LiveHealthRepository
import com.unified.health.core.domain.repository.RacesRepository
import com.unified.health.core.domain.repository.RacesState
import com.unified.health.core.domain.repository.TrainingPlanRepository
import com.unified.health.core.domain.repository.UserPreferencesRepository
import com.unified.health.core.domain.repository.WearableDeviceRepository
import com.unified.health.core.domain.usecase.Highlight
import com.unified.health.core.domain.usecase.HighlightCalculator
import com.unified.health.core.domain.usecase.MetricStatsCalculator
import com.unified.health.core.domain.usecase.ObserveHighlightsUseCase
import com.unified.health.core.domain.usecase.ObservePrimaryDeviceUseCase
import com.unified.health.core.domain.usecase.ObserveTodaySummaryUseCase
import com.unified.health.core.domain.usecase.ObserveWeekActivitySummaryUseCase
import com.unified.health.core.model.ConnectionState
import com.unified.health.core.model.DailyHealthSummary
import com.unified.health.core.model.FeedCardId
import com.unified.health.core.model.HealthMetricType
import com.unified.health.core.model.HomeMetricsViewMode
import com.unified.health.core.model.LiveHeartRate
import com.unified.health.core.model.ScheduledDay
import com.unified.health.core.model.SyncState
import com.unified.health.core.model.TimeRange
import com.unified.health.core.model.UnitSystem
import com.unified.health.core.model.WearableDevice
import com.unified.health.core.model.WeekActivityDay
import dagger.hilt.android.lifecycle.HiltViewModel
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
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import java.time.LocalDate
import javax.inject.Inject

sealed interface HomeUiState {
    data object Loading : HomeUiState
    data class Success(
        val summary: DailyHealthSummary,
        val device: WearableDevice?,
        val highlights: List<Highlight> = emptyList(),
        val deviceCount: Int = if (device == null) 0 else 1,
        /** The full metric feed (D-1010: merged from the old Health tab; D-1072 dropped the
         *  "Pinned" subset, since this feed already shows every metric), in the user's order. */
        val feedCards: List<FeedCardData> = emptyList(),
        /** Every known feed card id, in the user's order (including hidden ones, for the Edit dialog). */
        val feedOrder: List<String> = emptyList(),
        val hiddenFeedCards: Set<String> = emptySet(),
        /** D-1073/1074: List vs Grid layout for the "All metrics" section. */
        val metricsViewMode: HomeMetricsViewMode = HomeMetricsViewMode.GRID,
        /** D-1147: drives the header device chip's status dot (green = connected + actively syncing
         *  right now, gray otherwise) — same [WearableDeviceRepository.syncState] source Devices uses. */
        val syncState: SyncState = SyncState.Idle,
        /** D-1183: Metric (km/kg) vs Imperial (mi/lb) distance/weight display, from Profile's toggle. */
        val unitSystem: UnitSystem = UnitSystem.METRIC,
        /** D-1188: Profile's debug-only Developer section toggle — when true, skips the "hide cards
         *  with no data" filter below so every metric card renders, empty ones included. */
        val showEmptyMetricCards: Boolean = false,
        /** D-1190: today's entry from the user's active Hal Higdon Novice plan, when one is active
         *  *and* today hasn't been checked in yet — null otherwise (no plan, no entry for today, or
         *  already checked in), which is exactly when Home should show nothing extra. */
        val todayWorkout: ScheduledDay? = null,
        /** D-1196: the current calendar week (Monday→Sunday), one entry per day, for the "7 mini
         *  rings" strip under the big ring — see [ObserveWeekActivitySummaryUseCase]. */
        val week: List<WeekActivityDay> = emptyList(),
        /** D-1215: the day the big `RingsCard` currently previews — `null` means "today" (the big
         *  ring shows exactly [summary], unchanged from before this feature). Set by tapping a mini
         *  ring in the week strip or the "Today" action; see [HomeDaySelection] for the selection
         *  rules and [HomeViewModel.selectDay]/[HomeViewModel.jumpToToday] for how it's set. Only the
         *  big ring follows this — the metrics grid and highlights below it always stay on today. */
        val selectedDate: LocalDate? = null,
    ) : HomeUiState {
        /** The summary the big `RingsCard` displays: [selectedDate]'s own entry from [week] when a
         *  day other than today is selected, else exactly [summary] — so today's big ring is the
         *  same object, unchanged, from before this feature (D-1215 brief). */
        val selectedDaySummary: DailyHealthSummary
            get() = selectedDate?.let { date -> week.firstOrNull { it.summary.date == date }?.summary } ?: summary
    }
    data class Error(val message: String) : HomeUiState
}

/** The full feed cards plus the order/hidden bookkeeping "Edit cards" needs. */
private data class FeedBundle(
    val cards: List<FeedCardData>,
    val order: List<String>,
    val hidden: Set<String>,
)

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle,
    observeTodaySummary: ObserveTodaySummaryUseCase,
    observePrimaryDevice: ObservePrimaryDeviceUseCase,
    observeHighlights: ObserveHighlightsUseCase,
    observeWeekActivitySummary: ObserveWeekActivitySummaryUseCase,
    private val deviceRepository: WearableDeviceRepository,
    private val healthData: HealthDataRepository,
    private val preferences: UserPreferencesRepository,
    private val racesRepository: RacesRepository,
    private val trainingPlanRepository: TrainingPlanRepository,
    liveHealth: LiveHealthRepository,
) : ViewModel() {

    /** Collected only while Home is visible, which is what turns the watch sensor on. */
    val liveHeartRate: StateFlow<LiveHeartRate?> = liveHealth.heartRate

    /** D-1105: drives the "Giải chạy sắp tới" carousel — hidden entirely unless this is [RacesState.Success]. */
    val racesState: StateFlow<RacesState> =
        racesRepository.races.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), RacesState.Loading)

    /** D-1054: metrics actively streaming right now, for the green/gray dot on their cards. */
    val liveMetrics: StateFlow<Set<HealthMetricType>> = liveHealth.liveMetrics

    private val _isRefreshing = MutableStateFlow(false)
    val isRefreshing: StateFlow<Boolean> = _isRefreshing.asStateFlow()

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
        observeHighlights(),
        deviceRepository.syncState,
    ) { summary, device, count, highlights, syncState ->
        HomeUiState.Success(summary, device, highlights, count, syncState = syncState)
    }

    private val metricsViewMode: Flow<HomeMetricsViewMode> =
        preferences.userPreferences.map { it.homeMetricsViewMode }.distinctUntilChanged()

    /** D-1183: km/kg vs mi/lb, from Profile's toggle. */
    private val unitSystem: Flow<UnitSystem> =
        preferences.userPreferences.map { it.unitSystem }.distinctUntilChanged()

    /** D-1188: Profile's debug-only Developer section toggle. */
    private val showEmptyMetricCards: Flow<Boolean> =
        preferences.userPreferences.map { it.showEmptyMetricCards }.distinctUntilChanged()

    /** D-1190: null unless there's an active plan *and* it has an entry for today *and* that entry
     *  isn't already checked in — exactly the condition under which Home should show anything extra. */
    private val todayWorkout: Flow<ScheduledDay?> =
        trainingPlanRepository.activePlan.map { plan -> plan?.entryOn()?.takeUnless { it.completed } }

    /** D-1196: current calendar week (Mon→Sun), one entry per day, for the "7 mini rings" strip. */
    private val week: Flow<List<WeekActivityDay>> = observeWeekActivitySummary()

    /** D-1215: the raw, possibly-stale selection persisted across process death — resolved against
     *  the live week (dropped back to today per [HomeDaySelection.resolveRestoredSelection]) in
     *  [uiState] below, never read directly by the UI. */
    private val persistedSelectedDate: StateFlow<LocalDate?> = savedStateHandle.getStateFlow(KEY_SELECTED_DATE, null)

    /** D-1215: the date that *was* "today" the moment [persistedSelectedDate] was last written —
     *  lets [HomeDaySelection.resolveRestoredSelection] tell "still today" apart from "a new day
     *  started", which a plain membership-in-[week] check alone can't (a date can stay inside the
     *  same calendar week across a day rollover). */
    private val persistedSelectedAsOfToday: StateFlow<LocalDate?> = savedStateHandle.getStateFlow(KEY_SELECTED_AS_OF_TODAY, null)

    val uiState: StateFlow<HomeUiState> =
        combine(header, feedBundle, metricsViewMode, unitSystem, showEmptyMetricCards) { state, feed, viewMode, units, showEmpty ->
            val enriched = feed.cards.map { card ->
                when {
                    card !is FeedCardData.Metric -> card
                    card.metric == HealthMetricType.HEART_RATE -> card.copy(restingBpm = state.summary.heartRate.restingBpm)
                    card.metric == HealthMetricType.SLEEP -> card.copy(sleepSession = state.summary.sleep)
                    else -> card
                }
            }
            state.copy(
                feedCards = enriched,
                feedOrder = feed.order,
                hiddenFeedCards = feed.hidden,
                metricsViewMode = viewMode,
                unitSystem = units,
                showEmptyMetricCards = showEmpty,
            ) as HomeUiState
        }
            .combine(todayWorkout) { state, workout -> if (state is HomeUiState.Success) state.copy(todayWorkout = workout) else state }
            .combine(week) { state, week -> if (state is HomeUiState.Success) state.copy(week = week) else state }
            // D-1215: resolved last, from the just-attached `week`, so it always sees this exact
            // combine's own week list (not a second independent subscription to the `week` flow).
            .combine(combine(persistedSelectedDate, persistedSelectedAsOfToday, ::Pair)) { state, (persisted, persistedAsOf) ->
                if (state !is HomeUiState.Success) return@combine state
                val today = state.week.firstOrNull { it.isToday }?.summary?.date ?: return@combine state
                val resolved = HomeDaySelection.resolveRestoredSelection(persisted, persistedAsOf, today, state.week.map { it.summary.date })
                state.copy(selectedDate = resolved)
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

    /** "Edit cards" on the full metric feed: persists the new order (every id) and the hidden set. */
    fun setFeedCards(order: List<String>, hidden: Set<String>) {
        viewModelScope.launch { preferences.setFeedCards(order, hidden) }
    }

    /** D-1073/1074: List/Grid toggle on "All metrics". */
    fun setMetricsViewMode(mode: HomeMetricsViewMode) {
        viewModelScope.launch { preferences.setHomeMetricsViewMode(mode) }
    }

    /** D-1190: the one-tap check-in action on Home's "today's workout" card. */
    fun checkInToday(dayOffset: Int) {
        viewModelScope.launch { trainingPlanRepository.checkIn(dayOffset) }
    }

    /** D-1215: tapping a mini ring in the week strip — see [HomeDaySelection.onDayTapped] for the
     *  toggle-back-to-today/future-rejected rules. A no-op (defensively returns early rather than
     *  throwing) before the week has loaded at least once, since there's nothing to select against
     *  yet. */
    fun selectDay(date: LocalDate) {
        val state = uiState.value as? HomeUiState.Success ?: return
        val today = state.week.firstOrNull { it.isToday }?.summary?.date ?: return
        persistSelection(HomeDaySelection.onDayTapped(state.selectedDate, date, today), today)
    }

    /** D-1215: the "Today" chip/action next to the date label — always jumps back to today. */
    fun jumpToToday() {
        val state = uiState.value as? HomeUiState.Success ?: return
        val today = state.week.firstOrNull { it.isToday }?.summary?.date ?: return
        persistSelection(HomeDaySelection.onJumpToToday(), today)
    }

    /** Writes both halves of the persisted selection together so they're always consistent with
     *  each other on the next read (see [persistedSelectedAsOfToday]'s KDoc for why "as of today"
     *  has to travel alongside the selection itself, not be inferred separately). */
    private fun persistSelection(date: LocalDate?, asOfToday: LocalDate) {
        savedStateHandle[KEY_SELECTED_DATE] = date
        savedStateHandle[KEY_SELECTED_AS_OF_TODAY] = asOfToday
    }

    /** Pull-to-refresh: syncs every connected device and re-fetches the races feed (D-1107). */
    fun refresh() {
        viewModelScope.launch { racesRepository.refresh() }
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

/** D-1215: `SavedStateHandle` keys for the week-strip day selection (see [HomeViewModel]). */
private const val KEY_SELECTED_DATE = "home_selected_date"
private const val KEY_SELECTED_AS_OF_TODAY = "home_selected_as_of_today"
