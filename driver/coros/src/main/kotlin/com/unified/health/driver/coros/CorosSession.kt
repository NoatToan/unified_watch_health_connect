package com.unified.health.driver.coros

import android.util.Log
import com.unified.health.core.ble.HealthRecordSink
import com.unified.health.core.ble.driver.SyncProgress
import com.unified.health.core.ble.driver.SyncRequest
import com.unified.health.core.ble.driver.WearableProtocolException
import com.unified.health.core.ble.driver.WearableSession
import com.unified.health.core.ble.gatt.GattCharacteristic
import com.unified.health.core.ble.gatt.GattClient
import com.unified.health.core.ble.gatt.GattDisconnectedException
import com.unified.health.core.ble.gatt.StandardGattReader
import com.unified.health.core.ble.gatt.StandardUuids
import com.unified.health.core.model.DeviceCapability
import com.unified.health.core.model.DeviceInfo
import com.unified.health.core.model.HealthRecord
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.NonCancellable
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.emptyFlow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.withContext
import kotlinx.coroutines.withTimeoutOrNull
import java.time.Clock
import java.time.Instant
import java.util.concurrent.atomic.AtomicBoolean

/**
 * Connectivity-only COROS session: no vendor handshake is run (the proprietary `com.yf.coros.blecmd`
 * Protobuf command channel is not reverse-engineered, see `COROS_DEVICE_PROTOCOL.md` §0/§6/§9), so
 * this only reads what the standard Bluetooth SIG GATT services expose.
 *
 * Setup still follows the vendor's verified state names through [CorosConnectionStateMachine]
 * (`OpenFreshGatt → Connecting → DiscoverServices → InitializeProtocol → Ready`) and records a
 * [CorosCaptureSnapshot] before `InitializeProtocol`. If the device exposes a vendor transport but
 * no usable SIG service, or when `sync()` would need vendor history data, the session fails with
 * [CorosCaptureNeededException] rather than guessing command bytes.
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
    private val seen: SeenAdvertisement? = null,
    private val stateMachine: CorosConnectionStateMachine = CorosConnectionStateMachine(),
) : WearableSession {

    private val scope = CoroutineScope(SupervisorJob() + dispatcher)
    private val bufferLock = Mutex()
    private val buffer = ArrayDeque<HealthRecord.HeartRate>()

    private val started = AtomicBoolean(false)
    private val closed = AtomicBoolean(false)

    private var subscribedCharacteristic: GattCharacteristic? = null
    private var heartRateJob: Job? = null

    /** Vendor connection state, for logging and tests; the session interface does not expose it. */
    val connectionState: StateFlow<CorosConnectionState> get() = stateMachine.state

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

    /**
     * Snapshot of everything a real-watch capture should be compared against. Re-probed on demand
     * because [GattClient] has no enumeration API; see [CorosCaptureProbe] for the limitation.
     */
    fun captureDiagnostics(): CorosCaptureSnapshot = CorosCaptureProbe.snapshot(gatt, seen)

    /**
     * Runs the verified connection lifecycle. Exactly one protocol attempt is retried when it fails
     * for a transient GATT reason while the link is still up (the vendor's recovery layer has
     * `AttemptProtocol(token=…)`/`reconnectAttempts=` names [V], but no retry count is recoverable,
     * so this driver fixes the bound at one retry per the task contract). A capture-needed failure
     * is deterministic and is never retried.
     */
    suspend fun start() {
        check(started.compareAndSet(false, true)) { "COROS session start() called twice" }
        val gattRef = stateMachine.openFreshGatt()
        try {
            stateMachine.connecting(gattRef)
            if (!gatt.connected.value) {
                throw GattDisconnectedException("COROS link dropped before the protocol attempt")
            }
            stateMachine.discoverServices(gattRef)
            val diagnostics = discoverWithDeadline()
            logCaptureDiagnostics(diagnostics)
            initializeProtocolWithRetry(gattRef, diagnostics)
            watchLink()
        } catch (e: CancellationException) {
            teardown("start cancelled")
            throw e
        } catch (e: Exception) {
            Log.w(TAG, "COROS session initialization failed: ${e.message}")
            teardown("initialization failed: ${e.message}")
            throw e
        }
    }

    private suspend fun discoverWithDeadline(): CorosCaptureSnapshot {
        val timeoutMs = stateMachine.currentTimeoutMs() ?: return captureDiagnostics()
        // The only per-state deadline the recoverable strings support is a discovery deadline
        // (`device discovery timeout: targetType=` [V]); the probe itself is synchronous today, but
        // keeping the bound here makes the state-machine contract explicit and future-proof.
        return withTimeoutOrNull(timeoutMs) { captureDiagnostics() }
            ?: throw WearableProtocolException(
                "COROS service discovery probe did not complete within ${timeoutMs}ms. The exact " +
                    "vendor deadline is not recoverable; see docs/analysis/COROS_CONNECTION_ANALYSIS.md §1.1",
            )
    }

    private suspend fun initializeProtocolWithRetry(gattRef: GattRef, diagnostics: CorosCaptureSnapshot) {
        repeat(MAX_PROTOCOL_ATTEMPTS) { index ->
            val token = stateMachine.beginAttempt()
            try {
                initializeProtocol(token, diagnostics)
                stateMachine.ready(token)
                return
            } catch (e: CorosCaptureNeededException) {
                // Deterministic: the missing protocol bytes will not appear on a retry.
                throw e
            } catch (e: CancellationException) {
                throw e
            } catch (e: Exception) {
                val hasRetryLeft = index < MAX_PROTOCOL_ATTEMPTS - 1
                if (!hasRetryLeft || !gatt.connected.value) throw e
                Log.w(TAG, "AttemptProtocol(token=$token) failed: ${e.message}; retrying once")
                // TODO(coros-protocol): which GATT/protocol statuses the vendor treats as retryable
                // is unknown (only `reconnectAttempts=` and `AttemptProtocol(token=…)` survive;
                // COROS_CONNECTION_ANALYSIS.md §2). We retry any non-cancellation failure while the
                // link is still up, then give up.
                cleanupHeartRateSubscription()
            }
        }
        throw WearableProtocolException("COROS protocol initialization failed without a reported error")
    }

    private suspend fun initializeProtocol(token: ProtocolAttemptToken, diagnostics: CorosCaptureSnapshot) {
        if (diagnostics.vendorProtocolPresent && !diagnostics.sigBaselinePresent) {
            throw CorosCaptureNeededException(
                diagnostics,
                "connecting to a device that exposes only the COROS vendor transport",
            )
        }
        if (!stateMachine.isCurrent(token)) return
        val measurement = heartRateMeasurement ?: run {
            if (diagnostics.vendorProtocolPresent) {
                Log.i(
                    TAG,
                    "COROS vendor transport is present but the BleCmdPb protocol is unimplemented; " +
                        "no SIG 0x2A37, so live/history data is unavailable until an HCI snoop log is captured",
                )
            }
            return
        }
        val channel = gatt.subscribe(measurement)
        subscribedCharacteristic = measurement
        heartRateJob = scope.launch { collectHeartRate(channel, token.gattRef) }
    }

    private suspend fun collectHeartRate(values: ReceiveChannel<ByteArray>, gattRef: GattRef) {
        for (value in values) {
            // A notification from a closed GATT generation must never reach the new session.
            if (!stateMachine.isCurrent(gattRef)) return
            val bpm = StandardGattReader.parseHeartRateMeasurement(value) ?: continue
            val sample = HealthRecord.HeartRate(Instant.now(clock), bpm)
            bufferLock.withLock {
                if (buffer.size == MAX_BUFFERED) buffer.removeFirst()
                buffer.addLast(sample)
            }
            _liveHeartRate.tryEmit(sample)
        }
    }

    private fun watchLink() {
        scope.launch {
            gatt.connected.first { !it }
            Log.i(TAG, "COROS link lost; tearing down the session")
            teardown("link lost")
        }
    }

    override suspend fun readDeviceInfo(): DeviceInfo = StandardGattReader.readDeviceInfo(gatt)

    /**
     * Only hands over heart-rate samples buffered since the previous call (when the SIG Heart Rate
     * service is present). On a watch that exposes a COROS vendor transport, history sync needs the
     * proprietary channel this driver does not implement yet: fail with the capture request instead
     * of silently returning zero records. See the class doc.
     */
    override suspend fun sync(request: SyncRequest, sink: HealthRecordSink, progress: SyncProgress): Int {
        progress.report(0f, "Đang kiểm tra giao thức đồng hồ...")
        val diagnostics = captureDiagnostics()
        if (diagnostics.vendorProtocolPresent) {
            throw CorosCaptureNeededException(diagnostics, "history sync")
        }
        progress.report(0.5f, "Đang lấy dữ liệu nhịp tim đã ghi...")
        val batch = bufferLock.withLock { buffer.toList().also { buffer.clear() } }
        if (batch.isNotEmpty()) sink.onRecords(batch)
        progress.report(1f, "Hoàn tất")
        return batch.size
    }

    override suspend fun close() = teardown("session closed")

    /**
     * Idempotent teardown for both link loss and normal close: invalidates the GATT generation
     * (so late notifications are rejected), disables the CCCD, cancels the collection scope.
     */
    private suspend fun teardown(reason: String) {
        if (!closed.compareAndSet(false, true)) return
        stateMachine.prepareServiceRediscovery(reason)
        withContext(NonCancellable) {
            heartRateJob?.cancel()
            heartRateJob = null
            cleanupHeartRateSubscription()
            scope.cancel()
        }
    }

    private suspend fun cleanupHeartRateSubscription() {
        subscribedCharacteristic?.let { characteristic ->
            subscribedCharacteristic = null
            runCatching { gatt.unsubscribe(characteristic) }
                .onFailure { Log.d(TAG, "Unsubscribe during teardown/retry failed: ${it.message}") }
        }
    }

    private companion object {
        const val TAG = "CorosSession"

        /** ~2.5 hours at one sample per second, matching `StandardProfileSession`. */
        const val MAX_BUFFERED = 10_000

        /** Initial attempt plus one bounded retry; no vendor retry count is recoverable. */
        const val MAX_PROTOCOL_ATTEMPTS = 2
    }
}
