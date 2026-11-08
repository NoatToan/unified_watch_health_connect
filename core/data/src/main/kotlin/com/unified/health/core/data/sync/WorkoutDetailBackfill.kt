package com.unified.health.core.data.sync

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringSetPreferencesKey
import com.unified.health.core.data.database.HealthRecordDao
import com.unified.health.core.model.HealthRecord
import kotlinx.coroutines.flow.first
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Whether a workout already has lap/sample rows in Room, for [WorkoutDetailBackfillFilter] (D-1176).
 * A single-method SAM so tests can fake it with a lambda instead of a full [HealthRecordDao].
 */
fun interface WorkoutDetailRowCounter {
    suspend fun hasLapOrSampleRows(deviceId: String, workoutStartEpochMs: Long): Boolean
}

class RoomWorkoutDetailRowCounter @Inject constructor(
    private val dao: HealthRecordDao,
) : WorkoutDetailRowCounter {
    override suspend fun hasLapOrSampleRows(deviceId: String, workoutStartEpochMs: Long): Boolean =
        dao.workoutLapCount(deviceId, workoutStartEpochMs) > 0 || dao.workoutSampleCount(deviceId, workoutStartEpochMs) > 0
}

/**
 * Drops [HealthRecord.WorkoutLap]/[HealthRecord.WorkoutSample] records for a workout that already
 * has lap/sample rows (D-1176): Room's `@Upsert` already makes re-delivering the *same* rows
 * harmless, but re-decoding a FIT file and rewriting rows that never changed is still wasted work
 * every time [com.unified.health.core.domain.repository.WearableDeviceRepository.reprocessRawPayloads]
 * runs — once from the automatic one-time backfill, and again every time the user taps "Reprocess
 * downloaded files" in Devices. Other record kinds (e.g. [HealthRecord.Workout]) pass through
 * unchanged; upserting those again is cheap and keeps the summary row in sync.
 */
class WorkoutDetailBackfillFilter @Inject constructor(
    private val rowCounter: WorkoutDetailRowCounter,
) {
    suspend fun dropAlreadyBackfilled(deviceId: String, records: List<HealthRecord>): List<HealthRecord> {
        val workoutStartsMs = records.mapNotNull {
            when (it) {
                is HealthRecord.WorkoutLap -> it.workoutStart.toEpochMilli()
                is HealthRecord.WorkoutSample -> it.workoutStart.toEpochMilli()
                else -> null
            }
        }.distinct()
        if (workoutStartsMs.isEmpty()) return records
        val alreadyPresent = workoutStartsMs.filter { rowCounter.hasLapOrSampleRows(deviceId, it) }.toSet()
        if (alreadyPresent.isEmpty()) return records
        return records.filterNot {
            (it is HealthRecord.WorkoutLap && it.workoutStart.toEpochMilli() in alreadyPresent) ||
                (it is HealthRecord.WorkoutSample && it.workoutStart.toEpochMilli() in alreadyPresent)
        }
    }
}

/**
 * Tracks which paired devices already went through the one-time D-1176 workout-detail backfill, so
 * [com.unified.health.core.data.repository.DefaultWearableDeviceRepository] runs it automatically
 * exactly once per device (on the next successful connection) instead of on every app launch/connect.
 */
interface WorkoutDetailBackfillState {
    suspend fun isDone(deviceId: String): Boolean
    suspend fun markDone(deviceId: String)
}

@Singleton
class DataStoreWorkoutDetailBackfillState @Inject constructor(
    private val dataStore: DataStore<Preferences>,
) : WorkoutDetailBackfillState {

    private object Keys {
        /** Device ids that already ran the D-1176 one-time workout-detail backfill. */
        val backfilledDeviceIds = stringSetPreferencesKey("workout_detail_backfill_v1_device_ids")
    }

    override suspend fun isDone(deviceId: String): Boolean =
        dataStore.data.first()[Keys.backfilledDeviceIds]?.contains(deviceId) == true

    override suspend fun markDone(deviceId: String) {
        dataStore.edit { prefs ->
            val current = prefs[Keys.backfilledDeviceIds].orEmpty()
            prefs[Keys.backfilledDeviceIds] = current + deviceId
        }
    }
}
