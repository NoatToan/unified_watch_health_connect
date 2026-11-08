package com.unified.health.driver.standard

import android.util.Log
import com.unified.health.core.ble.HealthRecordSink
import com.unified.health.core.ble.driver.SyncProgress
import com.unified.health.core.ble.driver.SyncRequest
import com.unified.health.core.ble.driver.WearableProtocolException
import com.unified.health.core.ble.driver.WearableSession
import com.unified.health.core.ble.gatt.GattCharacteristic
import com.unified.health.core.ble.gatt.GattClient
import com.unified.health.core.ble.gatt.GattException
import com.unified.health.core.ble.gatt.StandardGattReader
import com.unified.health.core.model.DeviceCapability
import com.unified.health.core.model.DeviceInfo
import com.unified.health.core.model.HealthRecord
import com.unified.health.driver.standard.codec.ClinicalMeasurement
import com.unified.health.driver.standard.codec.SigTypes
import com.unified.health.driver.standard.transport.NotificationPump
import com.unified.health.driver.standard.transport.PlxStoredRecordReader
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.withTimeoutOrNull
import java.time.Clock
import java.time.ZoneId
import java.time.ZonedDateTime
import java.util.UUID

/**
 * Session with any device exposing Bluetooth SIG health services. There is no vendor handshake:
 * [start] writes the phone's time (CTS), enables notifications/indications of every supported
 * measurement and buffers what arrives in the device's [SampleBuffer]. [sync] reads the records a
 * pulse oximeter stored offline (RACP) and hands everything buffered to the sink.
 */
internal class StandardProfileSession(
    private val gatt: GattClient,
    private val buffer: SampleBuffer,
    private val clock: Clock,
    private val zone: () -> ZoneId,
    dispatcher: CoroutineDispatcher,
    private val gattTimeoutMs: Long = GATT_TIMEOUT_MS,
) : WearableSession {

    private val scope = CoroutineScope(SupervisorJob() + dispatcher)
    private val pumps = mutableListOf<NotificationPump>()
    private var storedRecords: PlxStoredRecordReader? = null

    private val hasHeartRateService = gatt.findCharacteristic(SigUuids.HEART_RATE_MEASUREMENT, SigUuids.HEART_RATE_SERVICE) != null
    private val recorder = MeasurementRecorder(buffer, clock, zone, pulseRateAsHeartRate = !hasHeartRateService) { _live.tryEmit(it) }

    private val _live = MutableSharedFlow<HealthRecord.HeartRate>(extraBufferCapacity = LIVE_BUFFER)
    override val liveHeartRate: SharedFlow<HealthRecord.HeartRate> = _live.asSharedFlow()

    override var capabilities: Set<DeviceCapability> = emptySet()
        private set

    /** Names of the measurements whose notifications are enabled (diagnostics and tests). */
    val activeMeasurements: List<String> get() = pumps.map { it.toString() }

    /** @throws WearableProtocolException when no measurement could be enabled. */
    suspend fun start() {
        syncTime()
        var heartRate = false
        pump("heart rate", SigUuids.HEART_RATE_SERVICE, SigUuids.HEART_RATE_MEASUREMENT, recorder::onHeartRate)?.let { heartRate = true }
        pump("PLX continuous", SigUuids.PULSE_OXIMETER_SERVICE, SigUuids.PLX_CONTINUOUS, recorder::onPlxContinuous)
        pump("PLX spot-check", SigUuids.PULSE_OXIMETER_SERVICE, SigUuids.PLX_SPOT_CHECK) { recorder.onPlxSpotCheck(it) }
            ?.let { spotCheck -> storedRecords = storedRecordReader(spotCheck) }
        pump("RSC", SigUuids.RSC_SERVICE, SigUuids.RSC_MEASUREMENT, recorder::onRsc)
        clinical("blood pressure", SigUuids.BLOOD_PRESSURE_SERVICE, SigUuids.BLOOD_PRESSURE_MEASUREMENT, ClinicalMeasurement::parseBloodPressure)
        clinical("temperature", SigUuids.HEALTH_THERMOMETER_SERVICE, SigUuids.TEMPERATURE_MEASUREMENT, ClinicalMeasurement::parseTemperature)
        clinical("weight", SigUuids.WEIGHT_SCALE_SERVICE, SigUuids.WEIGHT_MEASUREMENT, ClinicalMeasurement::parseWeight)
        clinical("body composition", SigUuids.BODY_COMPOSITION_SERVICE, SigUuids.BODY_COMPOSITION_MEASUREMENT, ClinicalMeasurement::parseBodyComposition)
        if (pumps.isEmpty()) {
            throw WearableProtocolException("${gatt.address}: could not enable notifications for any health measurement")
        }
        capabilities = buildSet {
            add(DeviceCapability.HISTORY_SYNC)
            if (heartRate) add(DeviceCapability.LIVE_HEART_RATE)
            if (gatt.findCharacteristic(SigUuids.BATTERY_LEVEL, SigUuids.BATTERY_SERVICE) != null) add(DeviceCapability.BATTERY_LEVEL)
        }
        Log.i(TAG, "${gatt.address}: streaming ${activeMeasurements.joinToString()}; ${buffer.size} records pending from earlier links")
    }

    override suspend fun readDeviceInfo(): DeviceInfo = StandardGattReader.readDeviceInfo(gatt)

    /**
     * Downloads stored PLX records (when supported), then delivers every buffered record. A failed
     * stored-record transfer does not hold back the live data: it is delivered first and the error
     * is rethrown afterwards so the UI reports it.
     */
    override suspend fun sync(request: SyncRequest, sink: HealthRecordSink, progress: SyncProgress): Int {
        progress.report(0f, "Đang tải dữ liệu đã lưu trên thiết bị...")
        val storedError = storedRecords?.let { reader ->
            try {
                if (!reader.reportAll()) Log.d(TAG, "Pulse oximeter has no stored records")
                null
            } catch (e: WearableProtocolException) {
                Log.w(TAG, "Stored PLX records failed: ${e.message}")
                e
            }
        }
        progress.report(STORED_RECORDS_PROGRESS, "Đang xử lý dữ liệu...")
        pumps.forEach { it.flush() }
        recorder.flushDerived()
        val snapshot = buffer.snapshot()
        val batches = snapshot.records.chunked(BATCH_SIZE)
        batches.forEachIndexed { i, batch ->
            sink.onRecords(batch)
            progress.report(
                STORED_RECORDS_PROGRESS + (1 - STORED_RECORDS_PROGRESS) * (i + 1) / batches.size,
                "Đang lưu dữ liệu (${i + 1}/${batches.size})...",
            )
        }
        buffer.commit(snapshot)
        if (buffer.dropped > 0) Log.w(TAG, "${buffer.dropped} buffered records were dropped (buffer full)")
        progress.report(1f, "Hoàn tất")
        storedError?.let { throw it }
        return snapshot.records.count { it !is HealthRecord.RawPayload }
    }

    override suspend fun close() {
        // Keep the open step bucket / HRV window so a reconnect resumes without losing them.
        runCatching { recorder.flushDerived() }
        scope.cancel()
    }

    /** Writes the phone's time to a writable CTS Current Time (+ Local Time Information) [Ext: CTS 1.1]. */
    private suspend fun syncTime() {
        val now = ZonedDateTime.now(clock.withZone(zone()))
        writeIfWritable(SigUuids.CURRENT_TIME, "current time") { SigTypes.currentTime(now) }
        writeIfWritable(SigUuids.LOCAL_TIME_INFORMATION, "local time information") { SigTypes.localTimeInformation(now) }
    }

    private suspend fun writeIfWritable(uuid: UUID, what: String, value: () -> ByteArray) {
        val c = gatt.findCharacteristic(uuid, SigUuids.CURRENT_TIME_SERVICE) ?: return
        if (!c.canWriteWithResponse && !c.canWriteWithoutResponse) return // Read-only clock: nothing to set.
        try {
            if (withTimeoutOrNull(gattTimeoutMs) { gatt.write(c, value()) } == null) Log.w(TAG, "Writing $what timed out")
        } catch (e: GattException) {
            Log.w(TAG, "Writing $what failed: ${e.message}") // Not fatal: measurements still work.
        }
    }

    private suspend fun clinical(name: String, service: UUID, uuid: UUID, parse: (ByteArray) -> ClinicalMeasurement) =
        pump(name, service, uuid) { recorder.onClinical(parse(it), it) }

    private suspend fun pump(name: String, service: UUID, uuid: UUID, handler: (ByteArray) -> Unit): NotificationPump? {
        val c = gatt.findCharacteristic(uuid, service) ?: return null
        val values = subscribe(name, c) ?: return null
        return NotificationPump(name, values, handler).also {
            pumps += it
            it.launchIn(scope)
        }
    }

    private suspend fun storedRecordReader(spotCheck: NotificationPump): PlxStoredRecordReader? {
        val racp = gatt.findCharacteristic(SigUuids.RECORD_ACCESS_CONTROL_POINT, SigUuids.PULSE_OXIMETER_SERVICE) ?: return null
        val responses = subscribe("PLX RACP", racp) ?: return null
        return PlxStoredRecordReader(gatt, racp, responses, spotCheck)
    }

    /** A characteristic that cannot be enabled is skipped (logged), the others still work. */
    private suspend fun subscribe(name: String, c: GattCharacteristic): ReceiveChannel<ByteArray>? = try {
        withTimeoutOrNull(gattTimeoutMs) { gatt.subscribe(c) }.also { if (it == null) Log.w(TAG, "Enabling $name timed out") }
    } catch (e: GattException) {
        Log.w(TAG, "Enabling $name failed: ${e.message}")
        null
    }

    private companion object {
        const val TAG = "StandardSession"
        const val GATT_TIMEOUT_MS = 10_000L
        const val BATCH_SIZE = 500
        const val LIVE_BUFFER = 16
        const val STORED_RECORDS_PROGRESS = 0.5f
    }
}
