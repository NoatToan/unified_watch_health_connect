package com.unified.health.core.domain.repository

import com.unified.health.core.model.ChartPoint
import com.unified.health.core.model.DailyHealthSummary
import com.unified.health.core.model.HealthMetricType
import com.unified.health.core.model.SleepSession
import com.unified.health.core.model.TimeRange
import com.unified.health.core.model.Workout
import kotlinx.coroutines.flow.Flow
import java.time.LocalDate

/** Read access to health metrics, regardless of origin (wearable, Health Connect, manual). */
interface HealthDataRepository {
    fun observeDailySummary(date: LocalDate): Flow<DailyHealthSummary>
    fun observeMetricSeries(metric: HealthMetricType, range: TimeRange, endDate: LocalDate): Flow<List<ChartPoint>>
    fun observeWorkouts(): Flow<List<Workout>>
    fun observeSleep(date: LocalDate): Flow<SleepSession?>
}
