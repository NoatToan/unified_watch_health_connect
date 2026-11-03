package com.unified.health.core.ble.fake

import com.unified.health.core.ble.HealthDataSync
import com.unified.health.core.ble.HealthRecordSink
import com.unified.health.core.model.SyncResult
import com.unified.health.core.model.SyncState
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import java.time.Instant
import javax.inject.Inject
import javax.inject.Singleton

/** Pretends to download records with visible progress; no data is actually produced. */
@Singleton
class FakeHealthDataSync @Inject constructor() : HealthDataSync {

    private val _state = MutableStateFlow<SyncState>(SyncState.Idle)
    override val state: StateFlow<SyncState> = _state.asStateFlow()

    override suspend fun sync(macAddress: String, since: Instant?, sink: HealthRecordSink): Result<SyncResult> {
        for (step in 1..10) {
            _state.value = SyncState.InProgress(step / 10f)
            delay(150)
        }
        sink.onRecords(emptyList())
        val result = SyncResult(syncedAt = Instant.now(), recordsImported = 0)
        _state.value = SyncState.Done(result)
        return Result.success(result)
    }
}
