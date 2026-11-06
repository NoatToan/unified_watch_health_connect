package com.unified.health.driver.huawei.wearengine

import android.util.Log
import com.unified.health.core.ble.HealthRecordSink
import com.unified.health.core.ble.driver.SyncProgress
import com.unified.health.core.ble.driver.SyncRequest
import com.unified.health.core.ble.driver.WearableSession
import com.unified.health.core.model.DeviceCapability
import com.unified.health.core.model.DeviceInfo
import com.unified.health.core.model.HealthRecord
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.shareIn

/**
 * Live session over WearEngine. Heart rate is read only while someone collects [liveHeartRate]
 * (the sensor costs watch battery); readings are also buffered so the next [sync] stores them
 * locally. [linkLost] polls Huawei Health's view of the watch.
 */
internal class HuaweiWearEngineSession(
    private val gateway: WearEngineGateway,
    private val device: WearDevice,
    dispatcher: CoroutineDispatcher = Dispatchers.Default,
    private val pollIntervalMs: Long = LINK_POLL_INTERVAL_MS,
) : WearableSession {

    private val scope = CoroutineScope(SupervisorJob() + dispatcher)
    private val buffer = ArrayDeque<HealthRecord.HeartRate>()

    override val capabilities: Set<DeviceCapability> =
        setOf(DeviceCapability.LIVE_HEART_RATE, DeviceCapability.BATTERY_LEVEL, DeviceCapability.HISTORY_SYNC)

    override val liveHeartRate: Flow<HealthRecord.HeartRate> = gateway.heartRate(device.id)
        .map { HealthRecord.HeartRate(it.time, it.bpm) }
        .onEach { sample ->
            synchronized(buffer) {
                if (buffer.size == MAX_BUFFERED) buffer.removeFirst()
                buffer.addLast(sample)
            }
        }
        .catch { Log.w(TAG, "Heart rate stream stopped: ${it.message}") }
        .shareIn(scope, SharingStarted.WhileSubscribed(), replay = 0)

    override val linkLost: Flow<Unit> = flow {
        while (true) {
            delay(pollIntervalMs)
            val stillConnected = try {
                gateway.bondedDevices().any { it.id == device.id && it.isConnected }
            } catch (e: CancellationException) {
                throw e
            } catch (e: Exception) {
                Log.d(TAG, "Connection poll failed: ${e.message}")
                true // A transient SDK error is not proof the watch is gone.
            }
            if (!stillConnected) {
                emit(Unit)
                return@flow
            }
        }
    }

    override suspend fun readDeviceInfo(): DeviceInfo = DeviceInfo(
        model = device.model ?: device.name,
        firmwareVersion = device.softwareVersion,
        serialNumber = null, // Needs the extra DEVICE_SN permission; not requested.
        batteryPercent = runCatchingNonCancellation { call { gateway.batteryPercent(device.id) } }.getOrNull(),
    )

    /** WearEngine exposes no history; hands over heart rate buffered from live reads. */
    override suspend fun sync(request: SyncRequest, sink: HealthRecordSink, progress: SyncProgress): Int {
        val batch = synchronized(buffer) { buffer.toList().also { buffer.clear() } }
        if (batch.isNotEmpty()) sink.onRecords(batch)
        progress.report(1f)
        return batch.size
    }

    override suspend fun close() {
        scope.cancel()
    }

    private companion object {
        const val TAG = "WearEngineSession"
        const val LINK_POLL_INTERVAL_MS = 30_000L
        const val MAX_BUFFERED = 10_000
    }
}

private suspend fun <T> runCatchingNonCancellation(block: suspend () -> T): Result<T> = try {
    Result.success(block())
} catch (e: CancellationException) {
    throw e
} catch (e: Exception) {
    Result.failure(e)
}
