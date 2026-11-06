package com.unified.health.driver.coros

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
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.emptyFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import java.time.Clock
import java.time.Instant

/**
 * Connectivity-only COROS session: no vendor handshake is run (the proprietary `com.yf.coros.blecmd`
 * Protobuf command channel is not reverse-engineered, see `COROS_DEVICE_PROTOCOL.md` §0/§6/§9), so
 * this only reads what the standard Bluetooth SIG GATT services expose.
 *
 * TODO(coros-protocol): replace with a real transport once the custom "UART-over-BLE" service
 * (`CorosUuids.WELOOP_UART_*`/`ADF7_*`) and the `BleCmdPb` Master/Slave framing are confirmed against
 * a real watch or an HCI snoop log. At that point this class should gain: history sync (steps, HR,
 * sleep, SpO2, HRV, workouts/FIT — architecture evidence in protocol doc §6), live heart rate over the
 * vendor channel, and time sync.
 */
internal class CorosSession(
    private val gatt: GattClient,
    private val clock: Clock = Clock.systemUTC(),
    dispatcher: CoroutineDispatcher = Dispatchers.Default,
) : WearableSession {

    private val scope = CoroutineScope(SupervisorJob() + dispatcher)
    private val bufferLock = Mutex()
    private val buffer = ArrayDeque<HealthRecord.HeartRate>()

    /**
     * Some COROS accessories (the HR01/HR31 chest straps, "COROS Heart Rate") are plausibly plain
     * Bluetooth SIG Heart Rate Service devices (protocol doc §3.1 [I]); the main GPS watches most
     * likely are not (realtime HR would go through the proprietary channel instead, like Garmin and
     * Zepp). Either way, reading `0x2A37` generically when present is safe — it is the standard
     * characteristic parser already used by `StandardGattReader`/`StandardProfileSession`, not a
     * guess at COROS-specific framing.
     */
    private val heartRateMeasurement: GattCharacteristic? =
        gatt.findCharacteristic(StandardUuids.HEART_RATE_MEASUREMENT, StandardUuids.HEART_RATE_SERVICE)

    private val _liveHeartRate = MutableSharedFlow<HealthRecord.HeartRate>(extraBufferCapacity = 16)

    override val liveHeartRate: Flow<HealthRecord.HeartRate> =
        if (heartRateMeasurement != null) _liveHeartRate.asSharedFlow() else emptyFlow()

    override val capabilities: Set<DeviceCapability> = buildSet {
        if (gatt.findCharacteristic(StandardUuids.BATTERY_LEVEL, StandardUuids.BATTERY_SERVICE) != null) {
            add(DeviceCapability.BATTERY_LEVEL)
        }
        if (heartRateMeasurement != null) {
            add(DeviceCapability.LIVE_HEART_RATE)
            add(DeviceCapability.HISTORY_SYNC)
        }
    }

    suspend fun start() {
        val measurement = heartRateMeasurement ?: return
        val values = gatt.subscribe(measurement)
        scope.launch {
            for (value in values) {
                val bpm = StandardGattReader.parseHeartRateMeasurement(value) ?: continue
                val sample = HealthRecord.HeartRate(Instant.now(clock), bpm)
                bufferLock.withLock {
                    if (buffer.size == MAX_BUFFERED) buffer.removeFirst()
                    buffer.addLast(sample)
                }
                _liveHeartRate.tryEmit(sample)
            }
        }
    }

    override suspend fun readDeviceInfo(): DeviceInfo = StandardGattReader.readDeviceInfo(gatt)

    /**
     * Only hands over heart-rate samples buffered since the previous call (when the SIG Heart Rate
     * service is present). Everything else COROS watches track — steps, sleep, SpO2, HRV, workouts —
     * requires the proprietary channel this driver does not implement yet; see the class doc.
     */
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
        /** ~2.5 hours at one sample per second, matching `StandardProfileSession`. */
        const val MAX_BUFFERED = 10_000
    }
}
