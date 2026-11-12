package com.unified.health.feature.activity

import com.unified.health.core.domain.repository.HealthDataRepository
import com.unified.health.core.domain.repository.SyntheticWorkoutDetailSource
import com.unified.health.core.domain.repository.UserPreferencesRepository
import com.unified.health.core.domain.repository.WearableDeviceRepository
import com.unified.health.core.domain.repository.WorkoutDetailSupplement
import com.unified.health.core.model.ChartPoint
import com.unified.health.core.model.ConnectionState
import com.unified.health.core.model.DailyHealthSummary
import com.unified.health.core.model.DiscoveredDevice
import com.unified.health.core.model.HealthMetricType
import com.unified.health.core.model.HeartRateSample
import com.unified.health.core.model.HomeMetricsViewMode
import com.unified.health.core.model.MetricReading
import com.unified.health.core.model.SleepSession
import com.unified.health.core.model.SyncState
import com.unified.health.core.model.ThemeMode
import com.unified.health.core.model.TimeRange
import com.unified.health.core.model.UnitSystem
import com.unified.health.core.model.UserPreferences
import com.unified.health.core.model.WearableDevice
import com.unified.health.core.model.Workout
import com.unified.health.core.model.WorkoutLap
import com.unified.health.core.model.WorkoutSample
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.emptyFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.update
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

/** D-1195: controllable per-test stand-in for `:core:demo`'s real implementation, which the test
 *  module cannot depend on (`core:domain` only, D-1195 keeps feature code demo-unaware). */
class FakeSyntheticWorkoutDetailSource : SyntheticWorkoutDetailSource {
    var supplements: Map<String, WorkoutDetailSupplement> = emptyMap()
    var callCount: Int = 0
    /** D-1197 round 2: controllable stand-in for `DemoDeviceIds.ALL`. */
    var demoDeviceIds: Set<String> = emptySet()
    override fun supplement(workout: Workout): WorkoutDetailSupplement? {
        callCount++
        return supplements[workout.id]
    }
    override fun isDemoDevice(deviceId: String): Boolean = deviceId in demoDeviceIds
}

/** D-1183: only [UserPreferences.unitSystem] matters to Activity/WorkoutDetail; every other setter is a no-op. */
class FakeUserPreferencesRepository : UserPreferencesRepository {
    override val userPreferences = MutableStateFlow(UserPreferences())
    override suspend fun setOnboardingCompleted(completed: Boolean) = Unit
    override suspend fun setUnitSystem(unitSystem: UnitSystem) {
        userPreferences.update { it.copy(unitSystem = unitSystem) }
    }
    override suspend fun setThemeMode(themeMode: ThemeMode) = Unit
    override suspend fun setUseDynamicColor(enabled: Boolean) = Unit
    override suspend fun setDailyStepGoal(steps: Int) = Unit
    override suspend fun setActiveCalorieGoalOverride(kcal: Int?) = Unit
    override suspend fun setSleepGoalHoursOverride(hours: Int?) = Unit
    override suspend fun setPinnedMetrics(metrics: List<HealthMetricType>) = Unit
    override suspend fun setFeedCards(order: List<String>, hidden: Set<String>) = Unit
    override suspend fun setHomeMetricsViewMode(mode: HomeMetricsViewMode) = Unit
    override suspend fun setShowEmptyMetricCards(enabled: Boolean) = Unit
}
