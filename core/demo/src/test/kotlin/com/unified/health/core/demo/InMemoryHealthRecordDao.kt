package com.unified.health.core.demo

import com.unified.health.core.data.database.HealthRecordDao
import com.unified.health.core.data.database.HealthSampleEntity
import com.unified.health.core.data.database.WorkoutEntity
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.map

/** Room-free [HealthRecordDao] with the same primary keys, so upserts overwrite like the real table. */
class InMemoryHealthRecordDao : HealthRecordDao {
    private val samples = MutableStateFlow<Map<Triple<String, String, Long>, HealthSampleEntity>>(emptyMap())
    private val workouts = MutableStateFlow<Map<Pair<String, Long>, WorkoutEntity>>(emptyMap())

    val allSamples: Collection<HealthSampleEntity> get() = samples.value.values
    val allWorkouts: Collection<WorkoutEntity> get() = workouts.value.values

    override suspend fun upsertSamples(samples: List<HealthSampleEntity>) {
        this.samples.value = this.samples.value + samples.associateBy { Triple(it.deviceId, it.type, it.startEpochMs) }
    }

    override suspend fun upsertWorkouts(workouts: List<WorkoutEntity>) {
        this.workouts.value = this.workouts.value + workouts.associateBy { it.deviceId to it.startEpochMs }
    }

    override suspend fun samples(type: String, fromEpochMs: Long, toEpochMs: Long): List<HealthSampleEntity> =
        samples.value.values.filter { it.type == type && it.startEpochMs in fromEpochMs until toEpochMs }.sortedBy { it.startEpochMs }

    override fun observeSamples(types: List<String>, fromEpochMs: Long, toEpochMs: Long): Flow<List<HealthSampleEntity>> =
        samples.map { all -> all.values.filter { it.type in types && it.startEpochMs in fromEpochMs until toEpochMs }.sortedBy { it.startEpochMs } }

    override fun observeWorkouts(limit: Int): Flow<List<WorkoutEntity>> =
        workouts.map { all -> all.values.sortedByDescending { it.startEpochMs }.take(limit) }

    override fun observeLatestSamples(types: List<String>, limit: Int): Flow<List<HealthSampleEntity>> =
        samples.map { all -> all.values.filter { it.type in types }.sortedByDescending { it.startEpochMs }.take(limit) }

    override suspend fun sampleCount(): Int = samples.value.size

    override suspend fun deleteAllSamples() {
        samples.value = emptyMap()
    }

    override suspend fun deleteAllWorkouts() {
        workouts.value = emptyMap()
    }
}
