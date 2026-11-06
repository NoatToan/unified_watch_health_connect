package com.unified.health.feature.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.unified.health.core.domain.repository.HealthDataRepository
import com.unified.health.core.domain.repository.LiveHealthRepository
import com.unified.health.core.domain.repository.UserPreferencesRepository
import com.unified.health.core.domain.repository.WearableDeviceRepository
import com.unified.health.core.domain.usecase.Highlight
import com.unified.health.core.domain.usecase.ObserveHighlightsUseCase
import com.unified.health.core.domain.usecase.ObservePrimaryDeviceUseCase
import com.unified.health.core.domain.usecase.ObserveTodaySummaryUseCase
import com.unified.health.core.model.ConnectionState
import com.unified.health.core.model.DailyHealthSummary
import com.unified.health.core.model.HealthMetricType
import com.unified.health.core.model.LiveHeartRate
import com.unified.health.core.model.MetricReading
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
    ) : HomeUiState
    data class Error(val message: String) : HomeUiState
}

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

    val uiState: StateFlow<HomeUiState> =
        combine(
            observeTodaySummary(),
            observePrimaryDevice(),
            deviceRepository.pairedDevices.map { it.size },
            pinned,
            observeHighlights(),
        ) { summary, device, count, pinnedReadings, highlights ->
            HomeUiState.Success(summary, device, pinnedReadings, highlights, count) as HomeUiState
        }
            .catch { emit(HomeUiState.Error(it.message ?: "Unable to load data")) }
            .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), HomeUiState.Loading)

    fun setPinned(metrics: List<HealthMetricType>) {
        viewModelScope.launch { preferences.setPinnedMetrics(metrics) }
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
}
