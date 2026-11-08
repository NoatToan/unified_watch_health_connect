package com.unified.health.driver.garmin

import android.util.Log
import com.unified.health.core.ble.HealthRecordSink
import com.unified.health.core.ble.driver.CredentialReader
import com.unified.health.core.ble.driver.CredentialWriter
import com.unified.health.core.ble.driver.SyncProgress
import com.unified.health.core.ble.driver.SyncRequest
import com.unified.health.core.ble.driver.WearableProtocolException
import com.unified.health.core.ble.driver.WearableSession
import com.unified.health.core.ble.gatt.GattClient
import com.unified.health.core.ble.gatt.GattException
import com.unified.health.core.ble.gatt.StandardGattReader
import com.unified.health.core.ble.gatt.StandardUuids
import com.unified.health.core.ble.pairing.PairingCodeRequester
import com.unified.health.core.model.DeviceCapability
import com.unified.health.core.model.DeviceInfo
import com.unified.health.core.model.HealthRecord
import com.unified.health.driver.garmin.auth.GarminAuthSession
import com.unified.health.driver.garmin.codec.BatteryStatus
import com.unified.health.driver.garmin.codec.GarminDeviceInformation
import com.unified.health.driver.garmin.codec.GarminSystemEvent
import com.unified.health.driver.garmin.codec.GfdiMessage
import com.unified.health.driver.garmin.codec.GfdiMessageId
import com.unified.health.driver.garmin.codec.GfdiPayloads
import com.unified.health.driver.garmin.codec.GfdiStatus
import com.unified.health.driver.garmin.codec.HostIdentity
import com.unified.health.driver.garmin.codec.TimeSyncMode
import com.unified.health.driver.garmin.codec.batteryStatusPoll
import com.unified.health.driver.garmin.transport.GfdiDispatcher
import com.unified.health.driver.garmin.transport.GfdiInboundHandler
import com.unified.health.driver.garmin.transport.GfdiStream
import com.unified.health.driver.garmin.transport.GfdiTransportSelector
import com.unified.health.driver.garmin.transport.InboundReply
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.withTimeoutOrNull
import java.time.Clock

/** Per-session dependencies; tests inject a test dispatcher and a fixed clock. */
internal data class GarminSessionConfig(
    val host: HostIdentity,
    val multiLinkClientId: Long,
    val dispatcher: CoroutineDispatcher = Dispatchers.Default,
    val clock: Clock = Clock.systemDefaultZone(),
    val address: String = "",
    val credentials: CredentialReader = CredentialReader { null },
    val credentialWriter: CredentialWriter = CredentialWriter.None,
    val pairingCodes: PairingCodeRequester? = null,
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

    /** Last 5023 that passed [BatteryStatus.decode]'s checks; only a fallback (§10.3 [V]). */
    @Volatile
    private var provisionalBattery: BatteryStatus? = null

    /** The watch's own 5050 capability bitmask, kept to select the vendor time-sync command. */
    @Volatile
    private var deviceCapabilities: ByteArray? = null

    /** Signalled by every inbound 5052, so TIME_UPDATED can wait for the watch's request. */
    private val timeRequests = Channel<Unit>(Channel.CONFLATED)

    /** Set when the watch asked for app-level auth, so the handshake can wait for the passkey. */
    @Volatile
    private var appAuthStarted = false

    /** Lazily created only when the watch actually sends a 5101 (unbonded fallback). */
    private val auth: GarminAuthSession by lazy {
        GarminAuthSession(
            address = config.address,
            deviceName = config.address,
            request = { id, payload -> dispatcher.request(id, payload, AUTH_REQUEST_TIMEOUT_MS) },
            credentials = config.credentials,
            credentialWriter = config.credentialWriter,
            pairingCodes = config.pairingCodes,
            onFailure = { deviceInformation.completeExceptionally(it) },
            onSecureSession = { dispatcher.frameCipher = it },
        )
    }

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
            ?: (if (appAuthStarted) withTimeoutOrNull(APP_AUTH_DEVICE_INFO_TIMEOUT_MS) { deviceInformation.await() } else null)
            ?: throw WearableProtocolException(
                "The watch did not send Device Information (5024) within ${DEVICE_INFO_TIMEOUT_MS / 1000}s. " +
                    "Make sure Garmin Connect is not connected to it.",
            )
        if (info.maxPacketSize > 0) dispatcher.maxPacketSize = info.maxPacketSize
        if (withTimeoutOrNull(CONFIGURATION_TIMEOUT_MS) { configurationExchanged.await() } == null) {
            Log.i(TAG, "No Configuration (5050) from the watch; continuing")
        }
        sendSystemEvent(GarminSystemEvent.HANDSHAKE_COMPLETE)
        synchronizeTime()
        startBatteryPolling()
        Log.i(TAG, "Handshake complete: product ${info.productNumber}, protocol ${info.protocolVersion}, fw ${info.firmwareVersionText}")
    }

    /**
     * Starts the vendor's active time sync after the handshake (§4.3 [V], `vs2/a.java:206-302`):
     * with device 5050 bit 71 the host sends 5030 TIME_UPDATED and waits up to [TIME_SYNC_WAIT_MS]
     * for the watch's 5052 (answered by the normal inbound path); without the bit the host pushes
     * the 5026 TLV. Both paths are bounded and never fail the session.
     */
    private suspend fun synchronizeTime() {
        val capabilities = deviceCapabilities
        if (capabilities == null) {
            Log.i(TAG, "No 5050 from the watch; skipping time sync")
            return
        }
        when (GfdiPayloads.timeSyncMode(capabilities)) {
            TimeSyncMode.TIME_UPDATED -> {
                while (timeRequests.tryReceive().isSuccess) {
                    // Discard 5052s the watch sent during the handshake; they got their reply already.
                }
                try {
                    val ack = dispatcher.request(
                        GfdiMessageId.SYSTEM_EVENT,
                        GfdiPayloads.systemEvent(GarminSystemEvent.TIME_UPDATED),
                        REQUEST_TIMEOUT_MS,
                    )
                    if (!ack.isAck) {
                        Log.i(TAG, "Watch answered TIME_UPDATED with ${GfdiStatus.name(ack.status)}; not waiting for a time request")
                        return
                    }
                    if (withTimeoutOrNull(TIME_SYNC_WAIT_MS) { timeRequests.receive() } == null) {
                        Log.i(TAG, "Watch did not request time within ${TIME_SYNC_WAIT_MS}ms; continuing")
                    }
                } catch (e: WearableProtocolException) {
                    Log.w(TAG, "TIME_UPDATED time sync failed: ${e.message}")
                } catch (e: GattException) {
                    Log.w(TAG, "TIME_UPDATED time sync failed: ${e.message}")
                }
            }
            TimeSyncMode.SET_DEVICE_SETTINGS -> {
                try {
                    val ack = dispatcher.request(
                        GfdiMessageId.SET_DEVICE_SETTINGS,
                        GfdiPayloads.setDeviceSettings(config.clock.instant(), config.clock.zone),
                        REQUEST_TIMEOUT_MS,
                    )
                    if (!ack.isAck) Log.i(TAG, "Watch does not support 5026 time settings (${GfdiStatus.name(ack.status)})")
                } catch (e: WearableProtocolException) {
                    Log.w(TAG, "5026 time settings failed: ${e.message}")
                } catch (e: GattException) {
                    Log.w(TAG, "5026 time settings failed: ${e.message}")
                }
            }
        }
    }

    /** 5023 fallback polling every 10 minutes, like the vendor's battery timer (§4.3 [V], `ha2/a.java:201-215`). */
    private fun startBatteryPolling() {
        scope.launch {
            while (isActive) {
                delay(BATTERY_POLL_INTERVAL_MS)
                try {
                    val ack = dispatcher.request(GfdiMessageId.BATTERY_STATUS, batteryStatusPoll(), REQUEST_TIMEOUT_MS)
                    if (!ack.isAck) Log.d(TAG, "Battery status poll answered with ${GfdiStatus.name(ack.status)}")
                } catch (e: CancellationException) {
                    throw e
                } catch (e: WearableProtocolException) {
                    Log.d(TAG, "Battery status poll failed: ${e.message}")
                } catch (e: GattException) {
                    Log.d(TAG, "Battery status poll failed: ${e.message}")
                }
            }
        }
    }

    override suspend fun onMessage(message: GfdiMessage): InboundReply = when (message.id) {
        GfdiMessageId.DEVICE_INFORMATION -> {
            deviceInformation.complete(GarminDeviceInformation.decode(message.payload))
            InboundReply(data = GfdiPayloads.hostInformation(config.host))
        }
        GfdiMessageId.CONFIGURATION -> {
            val deviceCapabilities = GfdiPayloads.decodeConfiguration(message.payload)
            this.deviceCapabilities = deviceCapabilities
            Log.d(TAG, "Watch capabilities: ${deviceCapabilities.size} bytes")
            InboundReply(
                afterAck = {
                    try {
                        sendConfiguration()
                    } finally {
                        configurationExchanged.complete(Unit)
                    }
                },
            )
        }
        GfdiMessageId.CURRENT_TIME_REQUEST -> {
            timeRequests.trySend(Unit)
            InboundReply(data = GfdiPayloads.currentTimeReply(message.payload, config.clock.instant(), config.clock.zone))
        }
        GfdiMessageId.FILE_DATA -> fileSync.onFileData(message.payload)
        GfdiMessageId.BATTERY_STATUS -> {
            val battery = BatteryStatus.decode(message.payload)
            if (battery == null) {
                Log.d(TAG, "5023 (${message.payload.size} bytes) does not match the provisional layout; ignored")
            } else {
                provisionalBattery = battery
            }
            InboundReply()
        }
        GfdiMessageId.FIT_DEFINITION,
        GfdiMessageId.FIT_DATA,
        GfdiMessageId.SYSTEM_EVENT,
        GfdiMessageId.SYNC_REQUEST,
        -> InboundReply()
        in GfdiMessageId.GARMIN_AUTH -> {
            appAuthStarted = true
            auth.onMessage(message)
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
     * Sends the host's own 5050: the fixed [GfdiPayloads.HOST_CAPABILITIES] set, like the official
     * app sends the set *it* supports (§4.12, `at2/a.java:429-458`; bit table §10.1 [V]), never the
     * watch's set mirrored back.
     */
    private suspend fun sendConfiguration() {
        val ack = dispatcher.request(GfdiMessageId.CONFIGURATION, GfdiPayloads.hostConfiguration(), REQUEST_TIMEOUT_MS)
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
            // SIG Battery is primary; the provisional 5023 parse only fills in when it is absent (§10.3).
            batteryPercent = StandardGattReader.readBatteryPercent(gatt) ?: provisionalBattery?.percent,
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

        /** Vendor waits 5 s for the watch's 5052 after 5030 TIME_UPDATED (`vs2/a.java:206-302`). */
        const val TIME_SYNC_WAIT_MS = 5_000L

        /** App-level auth adds up to a 30 s passkey window before 5024 arrives. */
        const val APP_AUTH_DEVICE_INFO_TIMEOUT_MS = 60_000L

        /** One Garmin Auth request round-trip (`ss2/c` uses the default 30 s auth timer). */
        const val AUTH_REQUEST_TIMEOUT_MS = 10_000L

        /** Vendor battery timer period (`ha2/a.java:201-215`, `scheduleAtFixedRate(..., 600000)`). */
        const val BATTERY_POLL_INTERVAL_MS = 600_000L

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
