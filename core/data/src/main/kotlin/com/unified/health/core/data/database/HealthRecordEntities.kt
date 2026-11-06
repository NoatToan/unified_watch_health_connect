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

    /** Value is the [com.unified.health.core.model.SleepStage] ordinal. */
    const val SLEEP_STAGE = "sleep_stage"
}

@Dao
interface HealthRecordDao {
    @Upsert
    suspend fun upsertSamples(samples: List<HealthSampleEntity>)

    @Upsert
    suspend fun upsertWorkouts(workouts: List<WorkoutEntity>)

    @Query("SELECT * FROM health_samples WHERE type = :type AND startEpochMs >= :fromEpochMs AND startEpochMs < :toEpochMs ORDER BY startEpochMs")
    suspend fun samples(type: String, fromEpochMs: Long, toEpochMs: Long): List<HealthSampleEntity>

    @Query("SELECT * FROM health_samples WHERE type IN (:types) AND startEpochMs >= :fromEpochMs AND startEpochMs < :toEpochMs ORDER BY startEpochMs")
    fun observeSamples(types: List<String>, fromEpochMs: Long, toEpochMs: Long): Flow<List<HealthSampleEntity>>

    @Query("SELECT * FROM workouts ORDER BY startEpochMs DESC LIMIT :limit")
    fun observeWorkouts(limit: Int): Flow<List<WorkoutEntity>>

    /** Newest first. */
    @Query("SELECT * FROM health_samples WHERE type IN (:types) ORDER BY startEpochMs DESC LIMIT :limit")
    fun observeLatestSamples(types: List<String>, limit: Int): Flow<List<HealthSampleEntity>>

    @Query("SELECT COUNT(*) FROM health_samples")
    suspend fun sampleCount(): Int

    @Query("DELETE FROM health_samples")
    suspend fun deleteAllSamples()

    @Query("DELETE FROM workouts")
    suspend fun deleteAllWorkouts()
}
