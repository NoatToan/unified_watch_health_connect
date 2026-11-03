package com.unified.health.core.ble.driver

import com.unified.health.core.ble.HealthRecordSink
import com.unified.health.core.model.DeviceCapability
import com.unified.health.core.model.DeviceInfo
import com.unified.health.core.model.HealthRecord
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow
import java.time.Instant

/**
 * An authenticated conversation with one watch. Created by [WearableDriver.openSession] and
 * closed by the connection manager on disconnect. Calls are never concurrent except
 * [liveHeartRate] collection, which may overlap with [sync].
 */
interface WearableSession {
    val capabilities: Set<DeviceCapability>

    suspend fun readDeviceInfo(): DeviceInfo

    /**
     * Downloads records newer than [SyncRequest.since] and delivers them to [sink] in batches.
     * Should not delete data from the watch unless unavoidable (other apps may still need it).
     * @return number of non-raw records delivered.
     */
    suspend fun sync(request: SyncRequest, sink: HealthRecordSink, progress: SyncProgress): Int

    val liveHeartRate: Flow<HealthRecord.HeartRate> get() = emptyFlow()

    /** Releases protocol resources. Must not throw; the GATT link is closed by the caller. */
    suspend fun close()
}

/**
 * @property since last successful sync, or null for a first sync (drivers then fetch a bounded
 *  window, see [DEFAULT_FIRST_SYNC_WINDOW_DAYS]).
 */
data class SyncRequest(
    val since: Instant?,
    val now: Instant = Instant.now(),
) {
    fun effectiveSince(): Instant = since ?: now.minusSeconds(DEFAULT_FIRST_SYNC_WINDOW_DAYS * 86_400L)

    companion object {
        const val DEFAULT_FIRST_SYNC_WINDOW_DAYS = 7L
    }
}

fun interface SyncProgress {
    /** @param fraction 0..1 */
    fun report(fraction: Float)
}
