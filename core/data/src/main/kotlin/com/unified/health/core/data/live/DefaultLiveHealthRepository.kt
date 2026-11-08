package com.unified.health.core.data.live

import com.unified.health.core.ble.DeviceConnection
import com.unified.health.core.ble.HealthRecordSink
import com.unified.health.core.data.sync.HealthRecordSinkFactory
import com.unified.health.core.domain.repository.LiveHealthRepository
import com.unified.health.core.model.ConnectionState
import com.unified.health.core.model.HealthMetricType
import com.unified.health.core.model.HealthRecord
import com.unified.health.core.model.LiveHeartRate
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.NonCancellable
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.emptyFlow
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.withContext
import java.time.Duration
import java.time.Instant
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Streams from the connected session only while someone observes [heartRate] (plus [GRACE_MS]),
 * keeps the last value, and writes readings to Room in batches so the disk and CPU wake rarely.
 */
@Singleton
internal class DefaultLiveHealthRepository(
    private val connection: DeviceConnection,
    private val sinkFor: (deviceId: String) -> HealthRecordSink,
    scope: CoroutineScope,
    private val flushEveryMs: Long = FLUSH_INTERVAL_MS,
    private val flushAtSize: Int = FLUSH_BATCH_SIZE,
    private val nowMs: () -> Long = System::currentTimeMillis,
) : LiveHealthRepository {

    @Inject
    constructor(connection: DeviceConnection, sinkFactory: HealthRecordSinkFactory) :
        this(connection, sinkFactory::create, CoroutineScope(SupervisorJob() + Dispatchers.Default))

    @OptIn(ExperimentalCoroutinesApi::class)
    override val heartRate: StateFlow<LiveHeartRate?> = connection.state
        .flatMapLatest { state -> if (state == ConnectionState.Connected) streamAndStore() else emptyFlow() }
        .catch { /* a failed stream restarts with the next connection state change */ }
        .stateIn(scope, SharingStarted.WhileSubscribed(GRACE_MS), null)

    /**
     * D-1054: per-metric "live right now", derived from [heartRate]'s own freshness rather than from
     * [heartRate]'s cached value or the connection state — [heartRate] intentionally keeps its last
     * reading after the stream stops (see the class doc), so a non-null value alone cannot tell a UI
     * apart from "live" vs "stale, still showing the last sync". Only [HealthMetricType.HEART_RATE]
     * has a live mode today; a future per-metric stream follows the same [liveWhileFresh] pattern.
     */
    @OptIn(ExperimentalCoroutinesApi::class)
    override val liveMetrics: StateFlow<Set<HealthMetricType>> = heartRate
        .liveWhileFresh(LIVE_MAX_AGE)
        .map { fresh -> if (fresh) setOf(HealthMetricType.HEART_RATE) else emptySet() }
        .stateIn(scope, SharingStarted.WhileSubscribed(GRACE_MS), emptySet())

    private fun streamAndStore(): Flow<LiveHeartRate> = flow {
        val address = connection.activeAddress.value ?: return@flow
        val sink = sinkFor(address)
        val pending = ArrayList<HealthRecord.HeartRate>()
        var lastFlush = nowMs()

        suspend fun flush() {
            if (pending.isEmpty()) return
            val batch = pending.toList()
            pending.clear()
            runCatching { sink.onRecords(batch) }
        }

        try {
            connection.liveHeartRate.collect { sample ->
                emit(LiveHeartRate(sample.bpm, sample.time))
                pending += sample
                val now = nowMs()
                if (pending.size >= flushAtSize || now - lastFlush >= flushEveryMs) {
                    flush()
                    lastFlush = now
                }
            }
        } finally {
            withContext(NonCancellable) { flush() }
        }
    }

    companion object {
        const val GRACE_MS = 10_000L
        const val FLUSH_INTERVAL_MS = 30_000L
        const val FLUSH_BATCH_SIZE = 60

        /** How long a reading counts as "live" before the dot falls back to gray (D-1054), matching the
         *  UI's own `freshBpm` expiry window (`feature/home/HomeScreen.kt`). */
        val LIVE_MAX_AGE: Duration = Duration.ofSeconds(15)
    }
}

/**
 * True right after a non-null reading, false once [maxAge] has passed since its timestamp (re-armed by
 * every new reading via [kotlinx.coroutines.flow.flatMapLatest]); false for as long as the upstream is
 * null. One-shot "expiry" emission per reading, not a ticking clock, so it costs nothing while idle.
 */
@OptIn(ExperimentalCoroutinesApi::class)
private fun StateFlow<LiveHeartRate?>.liveWhileFresh(maxAge: Duration): Flow<Boolean> =
    flatMapLatest { reading ->
        if (reading == null) {
            flowOf(false)
        } else {
            flow {
                emit(true)
                val remaining = maxAge - Duration.between(reading.time, Instant.now())
                if (!remaining.isNegative) delay(remaining.toMillis())
                emit(false)
            }
        }
    }
