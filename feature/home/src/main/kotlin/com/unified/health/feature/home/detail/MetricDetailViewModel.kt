package com.unified.health.feature.home.detail

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.toRoute
import com.unified.health.core.domain.usecase.ObserveMetricSeriesUseCase
import com.unified.health.core.model.ChartPoint
import com.unified.health.core.model.HealthMetricType
import com.unified.health.core.model.TimeRange
import com.unified.health.feature.home.navigation.MetricDetailDestination
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

data class MetricDetailUiState(
    val metric: HealthMetricType,
    val range: TimeRange = TimeRange.WEEK,
    val points: List<ChartPoint> = emptyList(),
    val isLoading: Boolean = true,
) {
    val average: Float get() = if (points.isEmpty()) 0f else points.map { it.value }.average().toFloat()
    val min: Float get() = points.minOfOrNull { it.value } ?: 0f
    val max: Float get() = points.maxOfOrNull { it.value } ?: 0f
}

@OptIn(ExperimentalCoroutinesApi::class)
@HiltViewModel
class MetricDetailViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    observeSeries: ObserveMetricSeriesUseCase,
) : ViewModel() {

    private val metric = savedStateHandle.toRoute<MetricDetailDestination>().metric
    private val range = MutableStateFlow(TimeRange.WEEK)

    val uiState: StateFlow<MetricDetailUiState> = range
        .flatMapLatest { r -> observeSeries(metric, r).map { MetricDetailUiState(metric, r, it, isLoading = false) } }
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), MetricDetailUiState(metric))

    fun selectRange(newRange: TimeRange) {
        range.value = newRange
    }
}
