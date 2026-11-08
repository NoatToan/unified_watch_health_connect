package com.unified.health.core.ble.multivendor

import com.unified.health.core.ble.HealthDataSync
import com.unified.health.core.ble.HealthRecordSink
import com.unified.health.core.ble.driver.SyncRequest
import com.unified.health.core.model.SyncResult
import com.unified.health.core.model.SyncState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import java.time.Instant
import javax.inject.Inject
import javax.inject.Singleton

/** Delegates the history download to the connected device's session. One sync at a time. */
@Singleton
class MultiVendorHealthDataSync @Inject internal constructor(
    private val connection: MultiVendorDeviceConnection,
) : HealthDataSync {

    private val lock = Mutex()
    private val _state = MutableStateFlow<SyncState>(SyncState.Idle)
    override val state: StateFlow<SyncState> = _state.asStateFlow()

    override suspend fun sync(
        macAddress: String,
        since: Instant?,
        sink: HealthRecordSink,
        knownRawPayloadTimestamps: Set<Instant>,
    ): Result<SyncResult> = lock.withLock {
        val session = connection.sessionFor(macAddress)
            ?: return@withLock Result.failure<SyncResult>(IllegalStateException("Device is not connected")).also {
                _state.value = SyncState.Failed("Device is not connected")
            }
        _state.value = SyncState.InProgress(0f)
        runCatchingNonCancellation {
            val count = connection.withHighThroughput(macAddress) {
                session.sync(SyncRequest(since, knownRawPayloadTimestamps = knownRawPayloadTimestamps), sink) { fraction, stage ->
                    _state.value = SyncState.InProgress(fraction.coerceIn(0f, 1f), stage)
                }
            }
            SyncResult(syncedAt = Instant.now(), recordsImported = count)
        }.onSuccess { _state.value = SyncState.Done(it) }
            .onFailure { _state.value = SyncState.Failed(it.message ?: it::class.java.simpleName) }
    }
}
