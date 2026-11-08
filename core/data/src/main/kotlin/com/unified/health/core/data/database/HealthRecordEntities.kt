package com.unified.health.core.data.database

import androidx.room.Dao
import androidx.room.Entity
import androidx.room.Index
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

/**
 * One scalar health sample (HR, SpO2, stress, steps interval, sleep stage, daily totals).
 * The primary key makes re-delivered records overwrite instead of duplicating.
 */
@Entity(
    tableName = "health_samples",
    primaryKeys = ["deviceId", "type", "startEpochMs"],
    indices = [Index(value = ["type", "startEpochMs"])],
)
data class HealthSampleEntity(
    val deviceId: String,
    val type: String,
    val startEpochMs: Long,
    val endEpochMs: Long,
    val value: Double,
)

@Entity(tableName = "workouts", primaryKeys = ["deviceId", "startEpochMs"])
data class WorkoutEntity(
    val deviceId: String,
    val startEpochMs: Long,
    val endEpochMs: Long,
    val sport: String,
    val distanceMeters: Double?,
    val activeKcal: Int?,
    val avgHeartRate: Int?,
    val maxHeartRate: Int?,
)

/**
 * One split/lap of a workout (D-1093). Keyed to its parent [WorkoutEntity] by
 * (`deviceId`, `workoutStartEpochMs`) — the same pair that is [WorkoutEntity]'s own primary key.
 */
@Entity(
    tableName = "workout_laps",
    primaryKeys = ["deviceId", "workoutStartEpochMs", "lapIndex"],
    indices = [Index(value = ["deviceId", "workoutStartEpochMs"])],
)
data class WorkoutLapEntity(
    val deviceId: String,
    val workoutStartEpochMs: Long,
    val lapIndex: Int,
    val startEpochMs: Long,
    val endEpochMs: Long,
    val distanceMeters: Double?,
    val calories: Int?,
    val avgSpeedMps: Double?,
    val maxSpeedMps: Double?,
    val avgHeartRate: Int?,
    val maxHeartRate: Int?,
    val avgCadence: Int?,
    val maxCadence: Int?,
    val ascentMeters: Double?,
    val descentMeters: Double?,
)

/**
 * One instantaneous sample recorded during a workout (D-1093), keyed the same way as
 * [WorkoutLapEntity]. `timeEpochMs` is part of the key so re-delivered samples overwrite in place.
 */
@Entity(
    tableName = "workout_samples",
    primaryKeys = ["deviceId", "workoutStartEpochMs", "timeEpochMs"],
    indices = [Index(value = ["deviceId", "workoutStartEpochMs"])],
)
data class WorkoutSampleEntity(
    val deviceId: String,
    val workoutStartEpochMs: Long,
    val timeEpochMs: Long,
    val latitude: Double?,
    val longitude: Double?,
    val altitudeMeters: Double?,
    val heartRate: Int?,
    val cadence: Int?,
    val speedMps: Double?,
)

/** Values of [HealthSampleEntity.type]. Stored as text, so never rename an existing one. */
object SampleType {
    const val HEART_RATE = "heart_rate"
    const val SPO2 = "spo2"
    const val STRESS = "stress"
    const val STEPS = "steps"
    const val DAILY_STEPS = "daily_steps"
    const val DAILY_ACTIVE_KCAL = "daily_active_kcal"
    const val DAILY_DISTANCE = "daily_distance_m"
    const val DAILY_EXERCISE_MINUTES = "daily_exercise_min"

    /** One row per day, stored at local midnight. */
    const val RESTING_HEART_RATE = "resting_heart_rate"
    const val HRV = "hrv_ms"
    const val VO2_MAX = "vo2_max"

    /** Value is the [com.unified.health.core.model.SleepStage] ordinal. */
    const val SLEEP_STAGE = "sleep_stage"
}

@Dao
interface HealthRecordDao {
    @Upsert
    suspend fun upsertSamples(samples: List<HealthSampleEntity>)

    @Upsert
    suspend fun upsertWorkouts(workouts: List<WorkoutEntity>)

    @Upsert
    suspend fun upsertWorkoutLaps(laps: List<WorkoutLapEntity>)

    @Upsert
    suspend fun upsertWorkoutSamples(samples: List<WorkoutSampleEntity>)

    @Query("SELECT * FROM health_samples WHERE type = :type AND startEpochMs >= :fromEpochMs AND startEpochMs < :toEpochMs ORDER BY startEpochMs")
    suspend fun samples(type: String, fromEpochMs: Long, toEpochMs: Long): List<HealthSampleEntity>

    @Query("SELECT * FROM health_samples WHERE type IN (:types) AND startEpochMs >= :fromEpochMs AND startEpochMs < :toEpochMs ORDER BY startEpochMs")
    fun observeSamples(types: List<String>, fromEpochMs: Long, toEpochMs: Long): Flow<List<HealthSampleEntity>>

    @Query("SELECT * FROM workouts ORDER BY startEpochMs DESC LIMIT :limit")
    fun observeWorkouts(limit: Int): Flow<List<WorkoutEntity>>

    @Query("SELECT * FROM workouts WHERE deviceId = :deviceId AND startEpochMs = :startEpochMs")
    fun observeWorkout(deviceId: String, startEpochMs: Long): Flow<WorkoutEntity?>

    @Query("SELECT * FROM workout_laps WHERE deviceId = :deviceId AND workoutStartEpochMs = :workoutStartEpochMs ORDER BY lapIndex")
    fun observeWorkoutLaps(deviceId: String, workoutStartEpochMs: Long): Flow<List<WorkoutLapEntity>>

    @Query("SELECT * FROM workout_samples WHERE deviceId = :deviceId AND workoutStartEpochMs = :workoutStartEpochMs ORDER BY timeEpochMs")
    fun observeWorkoutSamples(deviceId: String, workoutStartEpochMs: Long): Flow<List<WorkoutSampleEntity>>

    @Query("SELECT * FROM health_samples WHERE type = :type AND deviceId = :deviceId AND startEpochMs >= :fromEpochMs AND startEpochMs < :toEpochMs ORDER BY startEpochMs")
    fun observeDeviceSamples(type: String, deviceId: String, fromEpochMs: Long, toEpochMs: Long): Flow<List<HealthSampleEntity>>

    /** Newest first. */
    @Query("SELECT * FROM health_samples WHERE type IN (:types) ORDER BY startEpochMs DESC LIMIT :limit")
    fun observeLatestSamples(types: List<String>, limit: Int): Flow<List<HealthSampleEntity>>

    @Query("SELECT COUNT(*) FROM health_samples")
    suspend fun sampleCount(): Int

    @Query("DELETE FROM health_samples")
    suspend fun deleteAllSamples()

    @Query("DELETE FROM workouts")
    suspend fun deleteAllWorkouts()

    @Query("DELETE FROM workout_laps")
    suspend fun deleteAllWorkoutLaps()

    @Query("DELETE FROM workout_samples")
    suspend fun deleteAllWorkoutSamples()

    /** Scoped delete used by the debug-only "Clear demo data" tool: only rows of [deviceIds] are removed. */
    @Query("DELETE FROM health_samples WHERE deviceId IN (:deviceIds)")
    suspend fun deleteSamplesForDevices(deviceIds: List<String>)

    @Query("DELETE FROM workouts WHERE deviceId IN (:deviceIds)")
    suspend fun deleteWorkoutsForDevices(deviceIds: List<String>)

    @Query("DELETE FROM workout_laps WHERE deviceId IN (:deviceIds)")
    suspend fun deleteWorkoutLapsForDevices(deviceIds: List<String>)

    @Query("DELETE FROM workout_samples WHERE deviceId IN (:deviceIds)")
    suspend fun deleteWorkoutSamplesForDevices(deviceIds: List<String>)
}
