package com.unified.health.core.data.sync

import android.content.Context
import android.util.Log
import com.unified.health.core.ble.HealthRecordSink
import com.unified.health.core.data.database.HealthRecordDao
import com.unified.health.core.data.database.HealthSampleEntity
import com.unified.health.core.data.database.SampleType
import com.unified.health.core.data.database.WorkoutEntity
import com.unified.health.core.data.database.WorkoutLapEntity
import com.unified.health.core.data.database.WorkoutSampleEntity
import com.unified.health.core.model.HealthRecord
import com.unified.health.core.model.WearableVendor
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.File
import java.time.Instant
import java.time.ZoneId
import javax.inject.Inject
import javax.inject.Singleton

/** Creates the sink a sync writes into; one per device. */
@Singleton
class HealthRecordSinkFactory @Inject constructor(
    private val dao: HealthRecordDao,
    private val rawStore: RawPayloadSaver,
) {
    fun create(deviceId: String): HealthRecordSink = RoomHealthRecordSink(deviceId, dao, rawStore)
}

/** Maps vendor-neutral records onto Room rows; raw payloads go to app-private files. */
internal class RoomHealthRecordSink(
    private val deviceId: String,
    private val dao: HealthRecordDao,
    private val rawStore: RawPayloadSaver,
    private val zone: ZoneId = ZoneId.systemDefault(),
) : HealthRecordSink {

    override suspend fun onRecords(batch: List<HealthRecord>) {
        val samples = mutableListOf<HealthSampleEntity>()
        val workouts = mutableListOf<WorkoutEntity>()
        val workoutLaps = mutableListOf<WorkoutLapEntity>()
        val workoutSamples = mutableListOf<WorkoutSampleEntity>()
        for (record in batch) {
            when (record) {
                is HealthRecord.HeartRate -> samples += point(SampleType.HEART_RATE, record.time.toEpochMilli(), record.bpm.toDouble())
                is HealthRecord.SpO2 -> samples += point(SampleType.SPO2, record.time.toEpochMilli(), record.percent.toDouble())
                is HealthRecord.Stress -> samples += point(SampleType.STRESS, record.time.toEpochMilli(), record.score.toDouble())
                is HealthRecord.Steps -> samples += HealthSampleEntity(
                    deviceId, SampleType.STEPS, record.start.toEpochMilli(), record.end.toEpochMilli(), record.count.toDouble(),
                )
                is HealthRecord.Sleep -> samples += HealthSampleEntity(
                    deviceId, SampleType.SLEEP_STAGE, record.start.toEpochMilli(), record.end.toEpochMilli(), record.stage.ordinal.toDouble(),
                )
                is HealthRecord.DailyActivity -> {
                    val start = record.date.atStartOfDay(zone).toInstant().toEpochMilli()
                    val end = record.date.plusDays(1).atStartOfDay(zone).toInstant().toEpochMilli()
                    samples += HealthSampleEntity(deviceId, SampleType.DAILY_STEPS, start, end, record.steps.toDouble())
                    record.activeKcal?.let { samples += HealthSampleEntity(deviceId, SampleType.DAILY_ACTIVE_KCAL, start, end, it.toDouble()) }
                    record.distanceMeters?.let { samples += HealthSampleEntity(deviceId, SampleType.DAILY_DISTANCE, start, end, it) }
                    record.exerciseMinutes?.let { samples += HealthSampleEntity(deviceId, SampleType.DAILY_EXERCISE_MINUTES, start, end, it.toDouble()) }
                }
                is HealthRecord.RestingHeartRate -> {
                    val start = record.date.atStartOfDay(zone).toInstant().toEpochMilli()
                    val end = record.date.plusDays(1).atStartOfDay(zone).toInstant().toEpochMilli()
                    samples += HealthSampleEntity(deviceId, SampleType.RESTING_HEART_RATE, start, end, record.bpm.toDouble())
                }
                is HealthRecord.HeartRateVariability ->
                    samples += point(SampleType.HRV, record.time.toEpochMilli(), record.milliseconds.toDouble())
                is HealthRecord.Vo2Max ->
                    samples += point(SampleType.VO2_MAX, record.time.toEpochMilli(), record.value.toDouble())
                is HealthRecord.Workout -> workouts += WorkoutEntity(
                    deviceId = deviceId,
                    startEpochMs = record.start.toEpochMilli(),
                    endEpochMs = record.end.toEpochMilli(),
                    sport = record.sport,
                    distanceMeters = record.distanceMeters,
                    activeKcal = record.activeKcal,
                    avgHeartRate = record.avgHeartRate,
                    maxHeartRate = record.maxHeartRate,
                )
                is HealthRecord.WorkoutLap -> workoutLaps += WorkoutLapEntity(
                    deviceId = deviceId,
                    workoutStartEpochMs = record.workoutStart.toEpochMilli(),
                    lapIndex = record.index,
                    startEpochMs = record.start.toEpochMilli(),
                    endEpochMs = record.end.toEpochMilli(),
                    distanceMeters = record.distanceMeters,
                    calories = record.calories,
                    avgSpeedMps = record.avgSpeedMps,
                    maxSpeedMps = record.maxSpeedMps,
                    avgHeartRate = record.avgHeartRate,
                    maxHeartRate = record.maxHeartRate,
                    avgCadence = record.avgCadence,
                    maxCadence = record.maxCadence,
                    ascentMeters = record.ascentMeters,
                    descentMeters = record.descentMeters,
                )
                is HealthRecord.WorkoutSample -> workoutSamples += WorkoutSampleEntity(
                    deviceId = deviceId,
                    workoutStartEpochMs = record.workoutStart.toEpochMilli(),
                    timeEpochMs = record.time.toEpochMilli(),
                    latitude = record.latitude,
                    longitude = record.longitude,
                    altitudeMeters = record.altitudeMeters,
                    heartRate = record.heartRate,
                    cadence = record.cadence,
                    speedMps = record.speedMps,
                )
                is HealthRecord.RawPayload -> rawStore.save(deviceId, record)
            }
        }
        if (samples.isNotEmpty()) dao.upsertSamples(samples)
        if (workouts.isNotEmpty()) dao.upsertWorkouts(workouts)
        if (workoutLaps.isNotEmpty()) dao.upsertWorkoutLaps(workoutLaps)
        if (workoutSamples.isNotEmpty()) dao.upsertWorkoutSamples(workoutSamples)
    }

    private fun point(type: String, epochMs: Long, value: Double) = HealthSampleEntity(deviceId, type, epochMs, epochMs, value)
}

/** Where [RoomHealthRecordSink] puts original vendor payloads; an interface so the sink runs in JVM tests. */
fun interface RawPayloadSaver {
    suspend fun save(deviceId: String, payload: HealthRecord.RawPayload)
}

/** One raw payload previously saved by [RawPayloadStore.save], read back for [RawPayloadStore.list]. */
data class StoredRawPayload(val vendor: WearableVendor, val kind: String, val createdAt: Instant?, val bytes: ByteArray)

/**
 * The file-name convention [RawPayloadStore] uses to recover [StoredRawPayload.vendor]/`kind`/
 * timestamp without a side database (D-421): `<vendor>_<kind>_<epochMs>.bin`. Pulled out of
 * [RawPayloadStore] so it is unit-testable without an Android [Context].
 */
internal object RawPayloadFileNaming {
    fun fileName(vendor: WearableVendor, kind: String, stamp: Long) = "${vendor.name.lowercase()}_${safe(kind)}_$stamp.bin"

    /** Null when [file]'s name does not follow [fileName] (e.g. a stray file dropped in the folder). */
    fun parse(file: File): StoredRawPayload? {
        val name = file.name.removeSuffix(".bin")
        val parts = name.split("_")
        if (parts.size < 3) return null
        val vendor = runCatching { WearableVendor.valueOf(parts.first().uppercase()) }.getOrNull() ?: return null
        val stamp = parts.last().toLongOrNull() ?: return null
        val kind = parts.subList(1, parts.size - 1).joinToString("_")
        return StoredRawPayload(vendor, kind, Instant.ofEpochMilli(stamp), file.readBytes())
    }

    fun safe(value: String) = value.replace(Regex("[^A-Za-z0-9_.-]"), "_")
}

/** Keeps original vendor files under `files/wearable_raw/<device>/` for later re-decoding. */
@Singleton
class RawPayloadStore @Inject constructor(@ApplicationContext private val context: Context) : RawPayloadSaver {

    override suspend fun save(deviceId: String, payload: HealthRecord.RawPayload): Unit = withContext(Dispatchers.IO) {
        val dir = deviceDir(deviceId).apply { mkdirs() }
        val stamp = payload.createdAt?.toEpochMilli() ?: System.currentTimeMillis()
        val file = File(dir, RawPayloadFileNaming.fileName(payload.vendor, payload.kind, stamp))
        runCatching { file.writeBytes(payload.bytes) }.onFailure { Log.w(TAG, "Could not save $file", it) }
    }

    /**
     * Every raw payload still on disk for [deviceId], for [com.unified.health.core.ble.driver.WearableDriver.reprocess]
     * (D-421). This store is the only writer of these file names, so parsing them back with
     * [RawPayloadFileNaming.parse] is safe.
     */
    suspend fun list(deviceId: String): List<StoredRawPayload> = withContext(Dispatchers.IO) {
        deviceDir(deviceId).listFiles()?.mapNotNull { file -> runCatching { RawPayloadFileNaming.parse(file) }.getOrNull() }.orEmpty()
    }

    private fun deviceDir(deviceId: String) = File(context.filesDir, "wearable_raw/${RawPayloadFileNaming.safe(deviceId)}")

    private companion object {
        const val TAG = "RawPayloadStore"
    }
}
