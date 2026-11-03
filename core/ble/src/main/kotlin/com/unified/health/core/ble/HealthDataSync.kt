package com.unified.health.core.ble

import com.unified.health.core.model.HealthRecord
import com.unified.health.core.model.SyncResult
import com.unified.health.core.model.SyncState
import kotlinx.coroutines.flow.StateFlow
import java.time.Instant

/**
 * Pulls stored health records from the connected wearable. Decoded records are handed to
 * [HealthRecordSink] in batches as they arrive so a long sync never holds everything in memory.
 */
interface HealthDataSync {
    val state: StateFlow<SyncState>

    suspend fun sync(macAddress: String, since: Instant?, sink: HealthRecordSink): Result<SyncResult>
}

/** Receives decoded records from a sync. Implemented by `:core:data`; must be idempotent. */
fun interface HealthRecordSink {
    suspend fun onRecords(batch: List<HealthRecord>)
}
