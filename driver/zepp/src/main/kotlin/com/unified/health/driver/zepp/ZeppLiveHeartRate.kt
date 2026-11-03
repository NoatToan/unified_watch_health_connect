package com.unified.health.driver.zepp

import com.unified.health.core.ble.gatt.GattCharacteristic
import com.unified.health.core.ble.gatt.GattClient
import com.unified.health.core.ble.gatt.StandardGattReader
import com.unified.health.core.ble.gatt.WriteType
import com.unified.health.core.model.HealthRecord
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
 * Realtime heart rate for legacy-profile Huami watches (§6.4): `2A37` notifications, started and
 * stopped through the `2A39` control point. Cold: the sensor runs and the notification is enabled only
 * while the flow is collected.
 */
internal class ZeppLiveHeartRate(
    private val gatt: GattClient,
    private val measurement: GattCharacteristic,
    private val control: GattCharacteristic,
    private val clock: Clock = Clock.systemUTC(),
) {

    val flow: Flow<HealthRecord.HeartRate> = flow {
        val values = gatt.subscribe(measurement)
        try {
            write(START)
            coroutineScope {
                val keepAlive = launch {
                    while (true) {
                        delay(KEEP_ALIVE_MS)
                        write(HEARTBEAT)
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
                    write(STOP)
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

    private suspend fun write(command: ByteArray) = gatt.write(control, command, WriteType.WITHOUT_RESPONSE)

    companion object {
        /** `[0x15, mode=Continuous(1), op=Open(1)]` (`HeartRateControl.java`, `HeartRateCommand.SetWorkMode`). */
        val START = byteArrayOf(0x15, 0x01, 0x01)

        /** `[0x15, mode=Continuous(1), op=Close(0)]`. */
        val STOP = byteArrayOf(0x15, 0x01, 0x00)

        /** `HeartRateCommand.Heartbeat` = 22. */
        val HEARTBEAT = byteArrayOf(0x16)

        /** `HMHeartRateController` re-arms its handler every 10 000 ms. */
        const val KEEP_ALIVE_MS = 10_000L

        private val VALID_BPM = 1..250
    }
}
