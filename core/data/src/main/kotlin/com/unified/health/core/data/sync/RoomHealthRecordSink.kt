package com.unified.health.core.data.sync

import android.content.Context
import android.util.Log
import com.unified.health.core.ble.HealthRecordSink
import com.unified.health.core.data.database.HealthRecordDao
import com.unified.health.core.data.database.HealthSampleEntity
import com.unified.health.core.data.database.SampleType
import com.unified.health.core.data.database.WorkoutEntity
import com.unified.health.core.model.HealthRecord
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.File
import java.time.ZoneId
import javax.inject.Inject
import javax.inject.Singleton

/** Creates the sink a sync writes into; one per device. */
@Singleton
class HealthRecordSinkFactory @Inject constructor(
    private val dao: HealthRecordDao,
    private val rawStore: RawPayloadStore,
) {
    fun create(deviceId: String): HealthRecordSink = RoomHealthRecordSink(deviceId, dao, rawStore)
}

/** Maps vendor-neutral records onto Room rows; raw payloads go to app-private files. */
internal class RoomHealthRecordSink(
    private val deviceId: String,
    private val dao: HealthRecordDao,
    private val rawStore: RawPayloadStore,
    private val zone: ZoneId = ZoneId.systemDefault(),
) : HealthRecordSink {

    override suspend fun onRecords(batch: List<HealthRecord>) {
        val samples = mutableListOf<HealthSampleEntity>()
        val workouts = mutableListOf<WorkoutEntity>()
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
                }
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
                is HealthRecord.RawPayload -> rawStore.save(deviceId, record)
            }
        }
        if (samples.isNotEmpty()) dao.upsertSamples(samples)
        if (workouts.isNotEmpty()) dao.upsertWorkouts(workouts)
    }

    private fun point(type: String, epochMs: Long, value: Double) = HealthSampleEntity(deviceId, type, epochMs, epochMs, value)
}

/** Keeps original vendor files under `files/wearable_raw/<device>/` for later re-decoding. */
@Singleton
class RawPayloadStore @Inject constructor(@ApplicationContext private val context: Context) {

    suspend fun save(deviceId: String, payload: HealthRecord.RawPayload) = withContext(Dispatchers.IO) {
        val dir = File(context.filesDir, "wearable_raw/${safe(deviceId)}").apply { mkdirs() }
        val stamp = payload.createdAt?.toEpochMilli() ?: System.currentTimeMillis()
        val file = File(dir, "${payload.vendor.name.lowercase()}_${safe(payload.kind)}_$stamp.bin")
        runCatching { file.writeBytes(payload.bytes) }.onFailure { Log.w("RawPayloadStore", "Could not save $file", it) }
    }

    private fun safe(value: String) = value.replace(Regex("[^A-Za-z0-9_.-]"), "_")
}
