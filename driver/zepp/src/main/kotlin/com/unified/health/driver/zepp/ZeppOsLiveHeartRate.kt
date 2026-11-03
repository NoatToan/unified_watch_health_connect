package com.unified.health.driver.zepp

import android.util.Log
import com.unified.health.core.ble.driver.WearableProtocolException
import com.unified.health.core.ble.gatt.GattCharacteristic
import com.unified.health.core.ble.gatt.GattClient
import com.unified.health.core.ble.gatt.StandardGattReader
import com.unified.health.core.model.HealthRecord
import com.unified.health.driver.zepp.codec.OpenAppCodec
import com.unified.health.driver.zepp.transport.ChannelTransport
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.NonCancellable
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.time.Clock
import java.time.Instant

/**
 * Realtime heart rate on Zepp OS watches that list OpenAppModule (29) (§6.4 [V]): readings arrive
 * on `2A37` as on older watches, but the sensor is switched through channel module 29 instead of
 * the `2A39` control point (`HMHeartRateController.java:142-201`, `HMHeartRateProfile.initZeppOs`).
 * Cold: the notification is enabled and the sensor runs only while the flow is collected.
 */
internal class ZeppOsLiveHeartRate(
    private val gatt: GattClient,
    private val measurement: GattCharacteristic,
    private val channel: ChannelTransport,
    private val clock: Clock = Clock.systemUTC(),
) {

    val flow: Flow<HealthRecord.HeartRate> = flow {
        val values = gatt.subscribe(measurement)
        try {
            if (!setState(OpenAppCodec.STATE_OPEN)) throw WearableProtocolException("Watch refused to start realtime heart rate")
            coroutineScope {
                val keepAlive = launch {
                    while (true) {
                        delay(ZeppLiveHeartRate.KEEP_ALIVE_MS)
                        // The vendor only logs a failed keep-alive and keeps going (`:195-201`).
                        val kept = try {
                            setState(OpenAppCodec.STATE_KEEP)
                        } catch (e: WearableProtocolException) {
                            false
                        }
                        if (!kept) Log.w(TAG, "Realtime heart-rate keep-alive was not acknowledged")
                    }
                }
                try {
                    for (value in values) {
                        val bpm = StandardGattReader.parseHeartRateMeasurement(value)?.takeIf { it in VALID_BPM } ?: continue
                        emit(HealthRecord.HeartRate(Instant.now(clock), bpm))
                    }
                } finally {
                    keepAlive.cancel()
                }
            }
        } finally {
            withContext(NonCancellable) {
                try {
                    setState(OpenAppCodec.STATE_STOP)
                } catch (e: CancellationException) {
                    throw e
                } catch (e: Exception) {
                    // The link may already be gone; the watch also stops measuring when it drops.
                }
                values.cancel()
                gatt.unsubscribe(measurement)
            }
        }
    }

    /** Sends `[0x04, state]` and waits for `[0x05, status]` (`OpenAppModule.java:489-500`). */
    private suspend fun setState(state: Int): Boolean {
        val result = channel.request(OpenAppCodec.MODULE, OpenAppCodec.realtimeHr(state), RESULT_TIMEOUT_MS, OpenAppCodec::isRealtimeHrResult)
        return OpenAppCodec.realtimeHrAccepted(result)
    }

    companion object {
        private const val TAG = "ZeppOsLiveHr"

        /** `OpenAppModule` waits 15 000 ms for the result (`:500`) [V]. */
        const val RESULT_TIMEOUT_MS = 15_000L

        private val VALID_BPM = 1..250
    }
}
