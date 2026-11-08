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

    /**
     * Battery percent (0..100) every time the session gets a fresh on-device reading outside of
     * [readDeviceInfo] (e.g. periodic polling). Lets the caller keep stored battery info fresh
     * without re-running [readDeviceInfo] (D-1001). Default: no such telemetry.
     */
    val batteryUpdates: Flow<Int> get() = emptyFlow()

    /** Releases protocol resources. Must not throw; the GATT link is closed by the caller. */
    suspend fun close()
}

/**
 * @property since last successful sync, or null for a first sync (drivers then fetch a bounded
 *  window, see [DEFAULT_FIRST_SYNC_WINDOW_DAYS]).
 * @property knownRawPayloadTimestamps see [com.unified.health.core.ble.HealthDataSync.sync]; carried
 *  on the request so a driver can use it inside [WearableSession.sync].
 */
data class SyncRequest(
    val since: Instant?,
    val now: Instant = Instant.now(),
    val knownRawPayloadTimestamps: Set<Instant> = emptySet(),
) {
    fun effectiveSince(): Instant = since ?: now.minusSeconds(DEFAULT_FIRST_SYNC_WINDOW_DAYS * 86_400L)

    companion object {
        const val DEFAULT_FIRST_SYNC_WINDOW_DAYS = 7L
    }
}

fun interface SyncProgress {
    /**
     * @param fraction 0..1
     * @param stage short, human-readable description (Vietnamese) of what the sync is doing
     *  right now, e.g. "Đang tải dữ liệu từ đồng hồ (3/12 file)...", or null when the driver has
     *  nothing more specific to say than the fraction itself. No default value: Kotlin does not
     *  allow a default on a `fun interface`'s single abstract method (FUN_INTERFACE_ABSTRACT_
     *  METHOD_WITH_DEFAULT_VALUE), so every call site passes it explicitly (D-1122).
     */
    fun report(fraction: Float, stage: String?)
}
