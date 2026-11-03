package com.unified.health.core.domain.usecase

import com.unified.health.core.domain.repository.HealthDataRepository
import com.unified.health.core.domain.repository.WearableDeviceRepository
import com.unified.health.core.model.ChartPoint
import com.unified.health.core.model.DailyHealthSummary
import com.unified.health.core.model.HealthMetricType
import com.unified.health.core.model.TimeRange
import com.unified.health.core.model.WearableDevice
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import java.time.Clock
import java.time.LocalDate
import javax.inject.Inject

class ObserveTodaySummaryUseCase @Inject constructor(
    private val repository: HealthDataRepository,
) {
    operator fun invoke(clock: Clock = Clock.systemDefaultZone()): Flow<DailyHealthSummary> =
        repository.observeDailySummary(LocalDate.now(clock))
}

class ObserveMetricSeriesUseCase @Inject constructor(
    private val repository: HealthDataRepository,
) {
    operator fun invoke(
        metric: HealthMetricType,
        range: TimeRange,
        endDate: LocalDate = LocalDate.now(),
    ): Flow<List<ChartPoint>> = repository.observeMetricSeries(metric, range, endDate)
}

/** The "primary" wearable is the first paired one; the app targets a single watch/band for now. */
class ObservePrimaryDeviceUseCase @Inject constructor(
    private val repository: WearableDeviceRepository,
) {
    operator fun invoke(): Flow<WearableDevice?> = repository.pairedDevices.map { it.firstOrNull() }
}
