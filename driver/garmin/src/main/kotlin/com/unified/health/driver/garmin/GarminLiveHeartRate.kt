package com.unified.health.driver.garmin

import android.util.Log
import com.unified.health.core.ble.driver.WearableProtocolException
import com.unified.health.core.ble.gatt.GattCharacteristic
import com.unified.health.core.ble.gatt.GattClient
import com.unified.health.core.ble.gatt.GattException
import com.unified.health.core.ble.gatt.StandardGattReader
import com.unified.health.core.ble.gatt.StandardUuids
import com.unified.health.core.model.HealthRecord
import com.unified.health.driver.garmin.codec.MultiLinkCodec
import com.unified.health.driver.garmin.codec.RealtimeHeartRate
import com.unified.health.driver.garmin.codec.RegisterStatus
import com.unified.health.driver.garmin.transport.MultiLinkLink
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.NonCancellable
import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.emitAll
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.onSubscription
import kotlinx.coroutines.launch
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.withContext
import java.time.Clock

/** One way of getting live heart rate from the watch. */
internal interface LiveHeartRateSource {
    val name: String

    /** Starts the stream, or returns null when the watch refuses this source. */
    suspend fun open(): ReceiveChannel<ByteArray>?

    /** Stops the stream so the watch stops transmitting. Never throws. */
    suspend fun close()

    fun bpm(value: ByteArray): Int?
}

/** A notifying characteristic: enabling its CCCD starts the stream, disabling stops it. */
internal class CharacteristicHeartRateSource(
    override val name: String,
    private val gatt: GattClient,
    private val characteristic: GattCharacteristic,
    private val parse: (ByteArray) -> Int?,
) : LiveHeartRateSource {
    override suspend fun open(): ReceiveChannel<ByteArray> = gatt.subscribe(characteristic)
    override suspend fun close() = gatt.unsubscribe(characteristic)
    override fun bpm(value: ByteArray): Int? = parse(value)
}

/**
 * Multi-Link service 6 (REAL_TIME_HR). The official app starts it by REGISTERing the service with
 * plain flags and stops it with CLOSE_HANDLE (`eh2/d.java:312-344`, `ml2/l.java:297-312`); no
 * configuration bytes are written (`xm2/g.java:38, 77`: never populated). Each data packet on the
 * handle is one [RealtimeHeartRate] payload (`ml2/g.java:45`, `ml2/l.java:230-258`, `fh2/d.java:113-116`).
 */
internal class MultiLinkHeartRateSource(private val link: MultiLinkLink) : LiveHeartRateSource {
    override val name = "Multi-Link REAL_TIME_HR"
    private var handle: Int? = null

    override suspend fun open(): ReceiveChannel<ByteArray>? {
        val response = link.register(MultiLinkCodec.SERVICE_REAL_TIME_HR, REGISTER_TIMEOUT_MS)
        if (response == null) {
            Log.w(TAG, "No answer to REAL_TIME_HR registration within ${REGISTER_TIMEOUT_MS}ms")
            return null
        }
        if (response.status != RegisterStatus.SUCCESS) {
            Log.i(TAG, "Watch refused REAL_TIME_HR (status ${response.status})")
            return null
        }
        if (response.reliableFlags and MultiLinkCodec.RELIABLE_FLAG != 0) {
            Log.w(TAG, "REAL_TIME_HR asks for Multi-Link Reliable, which is not implemented")
            link.closeHandle(MultiLinkCodec.SERVICE_REAL_TIME_HR, response.handle)
            return null
        }
        handle = response.handle
        return link.channelFor(response.handle)
    }

    override suspend fun close() {
        val open = handle ?: return
        handle = null
        link.closeHandle(MultiLinkCodec.SERVICE_REAL_TIME_HR, open)
    }

    override fun bpm(value: ByteArray): Int? = RealtimeHeartRate.decode(value)?.heartRate

    private companion object {
        const val TAG = "GarminLiveHr"

        /** Our choice, not from the APK: long enough for a slow watch, short enough to fall back quickly. */
        const val REGISTER_TIMEOUT_MS = 10_000L
    }
}

/**
 * Live heart rate from the first [sources] entry the watch accepts. Cold and reference-counted:
 * the first collector starts the stream, the last one to leave stops it (even when cancelled),
 * so the watch only transmits while somebody watches. A source the watch refused is skipped on
 * later collections of this session.
 */
internal class GarminLiveHeartRate(
    private val sources: List<LiveHeartRateSource>,
    private val scope: CoroutineScope,
    private val clock: Clock,
) {
    private val live = MutableSharedFlow<HealthRecord.HeartRate>(extraBufferCapacity = BUFFER, onBufferOverflow = BufferOverflow.DROP_OLDEST)
    private val lock = Mutex()
    private val refused = mutableSetOf<LiveHeartRateSource>()
    private var collectors = 0
    private var active: LiveHeartRateSource? = null
    private var pump: Job? = null

    val flow: Flow<HealthRecord.HeartRate> = flow {
        var acquired = false
        try {
            emitAll(live.onSubscription { acquire(); acquired = true })
        } finally {
            if (acquired) withContext(NonCancellable) { release() }
        }
    }

    private suspend fun acquire() = lock.withLock {
        if (collectors == 0) start()
        collectors++
    }

    private suspend fun start() {
        for (source in sources) {
            if (source in refused) continue
            val values = try {
                source.open()
            } catch (e: GattException) {
                Log.w(TAG, "${source.name} failed to start: ${e.message}")
                null
            } catch (e: WearableProtocolException) {
                Log.w(TAG, "${source.name} failed to start: ${e.message}")
                null
            }
            if (values == null) {
                refused += source
                continue
            }
            active = source
            pump = scope.launch {
                for (value in values) {
                    val bpm = source.bpm(value) ?: continue
                    if (bpm !in MIN_BPM..MAX_BPM) continue
                    live.tryEmit(HealthRecord.HeartRate(clock.instant(), bpm))
                }
            }
            return
        }
        Log.w(TAG, "No live heart-rate source accepted by the watch")
    }

    private suspend fun release() = lock.withLock {
        if (--collectors > 0) return@withLock
        pump?.cancel()
        pump = null
        active?.close()
        active = null
    }

    companion object {
        private const val TAG = "GarminLiveHr"
        const val MIN_BPM = 1
        const val MAX_BPM = 250
        private const val BUFFER = 16

        /**
         * Sources in order of preference (§6.2):
         * 1. the dedicated realtime characteristic `6A4E2501`; a watch exposing service `6A4E2500`
         *    gets realtime there and never over Multi-Link (`eh2/f.java:183-184`);
         * 2. otherwise Multi-Link service 6 when GFDI runs over Multi-Link;
         * 3. the standard Heart Rate Profile, present only while "Broadcast Heart Rate" is on.
         */
        fun sources(gatt: GattClient, multiLink: MultiLinkLink?): List<LiveHeartRateSource> = buildList {
            val dedicated = gatt.findCharacteristic(GarminUuids.REALTIME_HEART_RATE, GarminUuids.REALTIME_SERVICE)
            if (dedicated != null && (dedicated.canNotify || dedicated.canIndicate)) {
                add(CharacteristicHeartRateSource("Realtime 6A4E2501", gatt, dedicated) { RealtimeHeartRate.decode(it)?.heartRate })
            } else if (multiLink != null && !gatt.hasService(GarminUuids.REALTIME_SERVICE)) {
                add(MultiLinkHeartRateSource(multiLink))
            }
            findMeasurement(gatt)?.let { measurement ->
                add(CharacteristicHeartRateSource("Heart Rate Profile", gatt, measurement, StandardGattReader::parseHeartRateMeasurement))
            }
        }

        /** The Heart Rate Measurement characteristic if the watch exposes it for notifications. */
        fun findMeasurement(gatt: GattClient): GattCharacteristic? =
            gatt.findCharacteristic(StandardUuids.HEART_RATE_MEASUREMENT, StandardUuids.HEART_RATE_SERVICE)
                ?.takeIf { it.canNotify || it.canIndicate }
    }
}
