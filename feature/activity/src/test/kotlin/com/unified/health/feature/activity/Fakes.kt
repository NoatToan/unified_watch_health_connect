package com.unified.health.feature.activity

import com.unified.health.core.domain.repository.HealthDataRepository
import com.unified.health.core.domain.repository.WearableDeviceRepository
import com.unified.health.core.model.ChartPoint
import com.unified.health.core.model.ConnectionState
import com.unified.health.core.model.DailyHealthSummary
import com.unified.health.core.model.DiscoveredDevice
import com.unified.health.core.model.HealthMetricType
import com.unified.health.core.model.HeartRateSample
import com.unified.health.core.model.MetricReading
import com.unified.health.core.model.SleepSession
import com.unified.health.core.model.SyncState
import com.unified.health.core.model.TimeRange
import com.unified.health.core.model.WearableDevice
import com.unified.health.core.model.Workout
import com.unified.health.core.model.WorkoutLap
import com.unified.health.core.model.WorkoutSample
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.emptyFlow
import kotlinx.coroutines.flow.map
import java.time.Instant
import java.time.LocalDate

class FakeHealthDataRepository : HealthDataRepository {
    val workouts = MutableStateFlow<List<Workout>>(emptyList())
    val heartRate = MutableStateFlow<List<Pair<String?, HeartRateSample>>>(emptyList())
    val laps = MutableStateFlow<Map<String, List<WorkoutLap>>>(emptyMap())
    val workoutSamples = MutableStateFlow<Map<String, List<WorkoutSample>>>(emptyMap())

    override fun observeWorkouts(): Flow<List<Workout>> = workouts
    override fun observeWorkout(id: String): Flow<Workout?> = workouts.map { list -> list.firstOrNull { it.id == id } }
    override fun observeWorkoutLaps(workoutId: String): Flow<List<WorkoutLap>> = laps.map { it[workoutId].orEmpty() }
    override fun observeWorkoutSamples(workoutId: String): Flow<List<WorkoutSample>> = workoutSamples.map { it[workoutId].orEmpty() }
    override fun observeHeartRateSamples(from: Instant, to: Instant, deviceId: String?): Flow<List<HeartRateSample>> =
        heartRate.map { all ->
            all.filter { (device, s) -> (deviceId == null || device == deviceId) && !s.time.isBefore(from) && s.time.isBefore(to) }.map { it.second }
        }

    override fun observeDailySummary(date: LocalDate): Flow<DailyHealthSummary> = emptyFlow()
    override fun observeMetricSeries(metric: HealthMetricType, range: TimeRange, endDate: LocalDate): Flow<List<ChartPoint>> = emptyFlow()
    override fun observeSleep(date: LocalDate): Flow<SleepSession?> = emptyFlow()
    override fun observeLatestReading(metric: HealthMetricType, today: LocalDate): Flow<MetricReading?> = emptyFlow()
    override fun observeMetricReadings(metric: HealthMetricType, limit: Int): Flow<List<MetricReading>> = emptyFlow()
}

class FakeWearableDeviceRepository : WearableDeviceRepository {
    val devices = MutableStateFlow<List<WearableDevice>>(emptyList())
    override val pairedDevices: Flow<List<WearableDevice>> = devices
    override val connectionState: Flow<ConnectionState> = MutableStateFlow(ConnectionState.Disconnected)
    override val syncState: Flow<SyncState> = MutableStateFlow(SyncState.Idle)
    override fun scan(): Flow<List<DiscoveredDevice>> = emptyFlow()
    override suspend fun pair(device: DiscoveredDevice): Result<WearableDevice> = Result.failure(UnsupportedOperationException())
    override suspend fun connect(deviceId: String): Result<Unit> = Result.success(Unit)
    override suspend fun disconnect(deviceId: String) = Unit
    override suspend fun unpair(deviceId: String) = Unit
    override suspend fun syncNow(deviceId: String): Result<Unit> = Result.success(Unit)
    override suspend fun reprocessRawPayloads(deviceId: String): Result<Int> = Result.success(0)
    override suspend fun setCredential(deviceId: String, key: String, value: String): Result<Unit> = Result.success(Unit)
    override suspend fun generateCredential(deviceId: String, key: String): Result<String> = Result.success("")
}
