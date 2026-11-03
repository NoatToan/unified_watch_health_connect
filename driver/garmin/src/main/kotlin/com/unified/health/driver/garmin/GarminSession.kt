package com.unified.health.driver.garmin

import android.util.Log
import com.unified.health.core.ble.HealthRecordSink
import com.unified.health.core.ble.driver.AuthenticationException
import com.unified.health.core.ble.driver.SyncProgress
import com.unified.health.core.ble.driver.SyncRequest
import com.unified.health.core.ble.driver.WearableProtocolException
import com.unified.health.core.ble.driver.WearableSession
import com.unified.health.core.ble.gatt.GattClient
import com.unified.health.core.ble.gatt.StandardGattReader
import com.unified.health.core.ble.gatt.StandardUuids
import com.unified.health.core.model.DeviceCapability
import com.unified.health.core.model.DeviceInfo
import com.unified.health.core.model.HealthRecord
import com.unified.health.driver.garmin.codec.GarminDeviceInformation
import com.unified.health.driver.garmin.codec.GarminSystemEvent
import com.unified.health.driver.garmin.codec.GfdiMessage
import com.unified.health.driver.garmin.codec.GfdiMessageId
import com.unified.health.driver.garmin.codec.GfdiPayloads
import com.unified.health.driver.garmin.codec.GfdiStatus
import com.unified.health.driver.garmin.codec.HostIdentity
import com.unified.health.driver.garmin.transport.GfdiDispatcher
import com.unified.health.driver.garmin.transport.GfdiInboundHandler
import com.unified.health.driver.garmin.transport.GfdiStream
import com.unified.health.driver.garmin.transport.GfdiTransportSelector
import com.unified.health.driver.garmin.transport.InboundReply
import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow
import kotlinx.coroutines.withTimeoutOrNull
import java.time.Clock

/** Per-session dependencies; tests inject a test dispatcher and a fixed clock. */
internal data class GarminSessionConfig(
    val host: HostIdentity,
    val multiLinkClientId: Long,
    val dispatcher: CoroutineDispatcher = Dispatchers.Default,
    val clock: Clock = Clock.systemDefaultZone(),
)

/**
 * GFDI session with a bonded Garmin watch (§4.C [V]). No application-level auth: once the phone
 * is bonded, GFDI runs unencrypted over the encrypted BLE link (§5.1 [V]).
 *
 * Handshake: watch sends 5024 → we ACK with host info; watch sends 5050 → we ACK and send our own
 * 5050; we send 5030 HANDSHAKE_COMPLETE. Everything else unsolicited is ACKed (or answered with
 * UNKNOWN_OR_NOT_SUPPORTED) so the watch never retries into a disconnect.
 */
internal class GarminSession private constructor(
    private val gatt: GattClient,
    private val stream: GfdiStream,
    private val scope: CoroutineScope,
    private val config: GarminSessionConfig,
) : WearableSession, GfdiInboundHandler {

    private val dispatcher = GfdiDispatcher(stream, scope, this)
    private val fileSync = GarminFileSync(dispatcher) { config.clock.zone }
    private val deviceInformation = CompletableDeferred<GarminDeviceInformation>()

    /** Completed once our own 5050 went out, so HANDSHAKE_COMPLETE follows it as in the official flow. */
    private val configurationExchanged = CompletableDeferred<Unit>()

    private val liveHr = GarminLiveHeartRate.sources(gatt, stream.multiLink).takeIf { it.isNotEmpty() }
        ?.let { GarminLiveHeartRate(it, scope, config.clock) }

    override val liveHeartRate: Flow<HealthRecord.HeartRate> = liveHr?.flow ?: emptyFlow()

    override val capabilities: Set<DeviceCapability> = buildSet {
        add(DeviceCapability.HISTORY_SYNC)
        if (liveHr != null) add(DeviceCapability.LIVE_HEART_RATE)
        if (gatt.findCharacteristic(StandardUuids.BATTERY_LEVEL, StandardUuids.BATTERY_SERVICE) != null) add(DeviceCapability.BATTERY_LEVEL)
    }

    private suspend fun handshake() {
        dispatcher.start()
        val info = withTimeoutOrNull(DEVICE_INFO_TIMEOUT_MS) { deviceInformation.await() }
            ?: throw WearableProtocolException(
                "The watch did not send Device Information (5024) within ${DEVICE_INFO_TIMEOUT_MS / 1000}s. " +
                    "Make sure Garmin Connect is not connected to it.",
            )
        if (info.maxPacketSize > 0) dispatcher.maxPacketSize = info.maxPacketSize
        if (withTimeoutOrNull(CONFIGURATION_TIMEOUT_MS) { configurationExchanged.await() } == null) {
            Log.i(TAG, "No Configuration (5050) from the watch; continuing")
        }
        sendSystemEvent(GarminSystemEvent.HANDSHAKE_COMPLETE)
        Log.i(TAG, "Handshake complete: product ${info.productNumber}, protocol ${info.protocolVersion}, fw ${info.firmwareVersionText}")
    }

    override suspend fun onMessage(message: GfdiMessage): InboundReply = when (message.id) {
        GfdiMessageId.DEVICE_INFORMATION -> {
            deviceInformation.complete(GarminDeviceInformation.decode(message.payload))
            InboundReply(data = GfdiPayloads.hostInformation(config.host))
        }
        GfdiMessageId.CONFIGURATION -> {
            val capabilities = GfdiPayloads.decodeConfiguration(message.payload)
            InboundReply(
                afterAck = {
                    try {
                        sendConfiguration(capabilities)
                    } finally {
                        configurationExchanged.complete(Unit)
                    }
                },
            )
        }
        GfdiMessageId.CURRENT_TIME_REQUEST ->
            InboundReply(data = GfdiPayloads.currentTimeReply(message.payload, config.clock.instant(), config.clock.zone))
        GfdiMessageId.FILE_DATA -> fileSync.onFileData(message.payload)
        GfdiMessageId.FIT_DEFINITION,
        GfdiMessageId.FIT_DATA,
        GfdiMessageId.BATTERY_STATUS,
        GfdiMessageId.SYSTEM_EVENT,
        GfdiMessageId.SYNC_REQUEST,
        -> InboundReply()
        in GfdiMessageId.GARMIN_AUTH -> {
            deviceInformation.completeExceptionally(
                AuthenticationException(
                    "The watch asked for Garmin application-level pairing, which is only used when the phone is " +
                        "not bonded. Remove the watch from Bluetooth settings and pair it again with this app.",
                ),
            )
            InboundReply(GfdiStatus.UNKNOWN_OR_NOT_SUPPORTED)
        }
        else -> {
            Log.d(TAG, "Unsupported message ${message.id}")
            InboundReply(GfdiStatus.UNKNOWN_OR_NOT_SUPPORTED)
        }
    }

    override fun onLinkClosed() {
        deviceInformation.completeExceptionally(WearableProtocolException("The Garmin link closed during the handshake"))
        fileSync.onLinkClosed()
    }

    /**
     * Sends the host's 5050 capability bitmask. We mirror the watch's own bitmask.
     * TODO(garmin-protocol): the official app sends the set *it* supports (`at2/a.java:429-458`);
     * mirroring may advertise features (weather, notifications…) that we then answer with
     * UNKNOWN_OR_NOT_SUPPORTED. Verify on a real watch and narrow the set if it causes retries.
     */
    private suspend fun sendConfiguration(capabilities: ByteArray) {
        val ack = dispatcher.request(GfdiMessageId.CONFIGURATION, GfdiPayloads.encodeConfiguration(capabilities), REQUEST_TIMEOUT_MS)
        if (!ack.isAck) Log.w(TAG, "Watch answered our Configuration with ${GfdiStatus.name(ack.status)}")
    }

    private suspend fun sendSystemEvent(event: Int) {
        val ack = dispatcher.request(GfdiMessageId.SYSTEM_EVENT, GfdiPayloads.systemEvent(event), REQUEST_TIMEOUT_MS)
        if (!ack.isAck) throw WearableProtocolException("Watch rejected system event $event with ${GfdiStatus.name(ack.status)}")
    }

    override suspend fun readDeviceInfo(): DeviceInfo {
        val info = deviceInformation.await()
        return DeviceInfo(
            model = info.deviceModel.ifBlank { info.deviceName }.ifBlank { null },
            firmwareVersion = info.firmwareVersionText,
            serialNumber = info.unitId.toString(),
            // TODO(garmin-protocol): 5023 Battery Status layout is not documented; using the SIG service.
            batteryPercent = StandardGattReader.readBatteryPercent(gatt),
        )
    }

    override suspend fun sync(request: SyncRequest, sink: HealthRecordSink, progress: SyncProgress): Int {
        val delivered = fileSync.sync(request, sink, progress)
        try {
            sendSystemEvent(GarminSystemEvent.SYNC_COMPLETE)
        } catch (e: WearableProtocolException) {
            Log.w(TAG, "SYNC_COMPLETE not acknowledged: ${e.message}")
        }
        return delivered
    }

    override suspend fun close() {
        stream.close()
        scope.cancel()
    }

    companion object {
        private const val TAG = "GarminSession"

        /** 5024 normally follows within a second of GFDI opening. */
        const val DEVICE_INFO_TIMEOUT_MS = 20_000L

        /** 5050 follows 5024 on every watch seen in the APK flow, but is not required to proceed. */
        const val CONFIGURATION_TIMEOUT_MS = 5_000L
        const val REQUEST_TIMEOUT_MS = 10_000L

        suspend fun open(gatt: GattClient, config: GarminSessionConfig): GarminSession {
            val scope = CoroutineScope(SupervisorJob() + config.dispatcher)
            try {
                val stream = GfdiTransportSelector.open(gatt, scope, config.multiLinkClientId)
                return GarminSession(gatt, stream, scope, config).also { it.handshake() }
            } catch (t: Throwable) {
                scope.cancel()
                throw t
            }
        }
    }
}
