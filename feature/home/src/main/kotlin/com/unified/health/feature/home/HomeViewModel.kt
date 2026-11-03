package com.unified.health.feature.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.unified.health.core.domain.repository.LiveHealthRepository
import com.unified.health.core.domain.repository.WearableDeviceRepository
import com.unified.health.core.domain.usecase.ObservePrimaryDeviceUseCase
import com.unified.health.core.domain.usecase.ObserveTodaySummaryUseCase
import com.unified.health.core.model.ConnectionState
import com.unified.health.core.model.DailyHealthSummary
import com.unified.health.core.model.LiveHeartRate
import com.unified.health.core.model.WearableDevice
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import javax.inject.Inject

sealed interface HomeUiState {
    data object Loading : HomeUiState
    data class Success(val summary: DailyHealthSummary, val device: WearableDevice?) : HomeUiState
    data class Error(val message: String) : HomeUiState
}

@HiltViewModel
class HomeViewModel @Inject constructor(
    observeTodaySummary: ObserveTodaySummaryUseCase,
    observePrimaryDevice: ObservePrimaryDeviceUseCase,
    private val deviceRepository: WearableDeviceRepository,
    liveHealth: LiveHealthRepository,
) : ViewModel() {

    /** Collected only while Home is visible, which is what turns the watch sensor on. */
    val liveHeartRate: StateFlow<LiveHeartRate?> = liveHealth.heartRate

    private val _isRefreshing = MutableStateFlow(false)
    val isRefreshing: StateFlow<Boolean> = _isRefreshing.asStateFlow()

    val uiState: StateFlow<HomeUiState> =
        combine(observeTodaySummary(), observePrimaryDevice()) { summary, device ->
            HomeUiState.Success(summary, device) as HomeUiState
        }
            .catch { emit(HomeUiState.Error(it.message ?: "Unable to load data")) }
            .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), HomeUiState.Loading)

    /** Pull-to-refresh: triggers a wearable sync when a connected device exists. */
    fun refresh() {
        viewModelScope.launch {
            _isRefreshing.value = true
            val device = (uiState.value as? HomeUiState.Success)?.device
            if (device != null && device.connectionState == ConnectionState.Connected) {
                deviceRepository.syncNow(device.id)
            } else {
                delay(600)
            }
            _isRefreshing.value = false
        }
    }
}

