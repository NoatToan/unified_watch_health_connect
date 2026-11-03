package com.unified.health.driver.standard

import com.unified.health.core.ble.HealthRecordSink
import com.unified.health.core.ble.driver.SyncProgress
import com.unified.health.core.ble.driver.SyncRequest
import com.unified.health.core.ble.driver.WearableSession
import com.unified.health.core.ble.gatt.GattCharacteristic
import com.unified.health.core.ble.gatt.GattClient
import com.unified.health.core.ble.gatt.StandardGattReader
import com.unified.health.core.ble.gatt.StandardUuids
import com.unified.health.core.model.DeviceCapability
import com.unified.health.core.model.DeviceInfo
import com.unified.health.core.model.HealthRecord
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import java.time.Clock
import java.time.Instant

internal class StandardProfileSession(
    private val gatt: GattClient,
    private val measurement: GattCharacteristic,
    private val clock: Clock = Clock.systemUTC(),
    dispatcher: CoroutineDispatcher = Dispatchers.Default,
) : WearableSession {

    private val scope = CoroutineScope(SupervisorJob() + dispatcher)
    private val bufferLock = Mutex()
    private val buffer = ArrayDeque<HealthRecord.HeartRate>()

    private val _live = MutableSharedFlow<HealthRecord.HeartRate>(extraBufferCapacity = 16)
    override val liveHeartRate: SharedFlow<HealthRecord.HeartRate> = _live.asSharedFlow()

    override val capabilities: Set<DeviceCapability> = buildSet {
        add(DeviceCapability.LIVE_HEART_RATE)
        add(DeviceCapability.HISTORY_SYNC)
        if (gatt.findCharacteristic(StandardUuids.BATTERY_LEVEL) != null) add(DeviceCapability.BATTERY_LEVEL)
    }

    suspend fun start() {
        val values = gatt.subscribe(measurement)
        scope.launch {
            for (value in values) {
                val bpm = StandardGattReader.parseHeartRateMeasurement(value) ?: continue
                val sample = HealthRecord.HeartRate(Instant.now(clock), bpm)
                bufferLock.withLock {
                    if (buffer.size == MAX_BUFFERED) buffer.removeFirst()
                    buffer.addLast(sample)
                }
                _live.tryEmit(sample)
            }
        }
    }

    override suspend fun readDeviceInfo(): DeviceInfo = StandardGattReader.readDeviceInfo(gatt)

    /** Hands over the samples buffered since the previous sync. */
    override suspend fun sync(request: SyncRequest, sink: HealthRecordSink, progress: SyncProgress): Int {
        val batch = bufferLock.withLock { buffer.toList().also { buffer.clear() } }
        if (batch.isNotEmpty()) sink.onRecords(batch)
        progress.report(1f)
        return batch.size
    }

    override suspend fun close() {
        scope.cancel()
    }

    private companion object {
        /** ~2.5 hours at one sample per second. */
        const val MAX_BUFFERED = 10_000
    }
}
