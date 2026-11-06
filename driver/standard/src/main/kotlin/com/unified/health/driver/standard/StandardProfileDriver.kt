package com.unified.health.driver.standard

import com.unified.health.core.ble.driver.RecognitionScore
import com.unified.health.core.ble.driver.SessionContext
import com.unified.health.core.ble.driver.UnsupportedDeviceException
import com.unified.health.core.ble.driver.WearableDriver
import com.unified.health.core.ble.driver.WearableSession
import com.unified.health.core.ble.gatt.GattClient
import com.unified.health.core.ble.scan.Advertisement
import com.unified.health.core.model.WearableVendor
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import java.time.Clock
import java.time.ZoneId
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Fallback driver for any watch, band or strap that exposes Bluetooth SIG health services
 * (Polar, Wahoo, Suunto straps, generic bands, a Garmin/Amazfit in "broadcast heart rate" mode,
 * pulse oximeters, foot pods, BP monitors, thermometers, scales) [Ext: Bluetooth SIG service specs].
 *
 * It scores [RecognitionScore.STANDARD_SERVICE], below every vendor-service/manufacturer-data
 * match, so a brand driver wins whenever it recognises the device (D-602). There is no handshake;
 * history is limited to what SIG services define (see [StandardProfileSession]).
 */
@Singleton
class StandardProfileDriver internal constructor(
    private val clock: Clock,
    private val zone: () -> ZoneId,
    private val dispatcher: CoroutineDispatcher,
) : WearableDriver {

    @Inject
    constructor() : this(Clock.systemUTC(), ZoneId::systemDefault, Dispatchers.Default)

    /** Survives sessions: samples streamed before a link loss are delivered by the next sync (D-603). */
    private val store = StandardSampleStore()

    override val vendor = WearableVendor.STANDARD

    override fun recognize(advertisement: Advertisement): Int =
        if (SigUuids.HEALTH_SERVICES.any(advertisement::hasService)) RecognitionScore.STANDARD_SERVICE else RecognitionScore.NONE

    override suspend fun openSession(gatt: GattClient, context: SessionContext): WearableSession {
        if (SigUuids.HEALTH_SERVICES.none(gatt::hasService)) {
            throw UnsupportedDeviceException(
                "${gatt.address} exposes none of the supported Bluetooth health services " +
                    "(Heart Rate, Pulse Oximeter, Running Speed and Cadence, Blood Pressure, Health Thermometer, Weight Scale, Body Composition)",
            )
        }
        val session = StandardProfileSession(gatt, store.bufferFor(context.address), clock, zone, dispatcher)
        try {
            session.start()
        } catch (e: Throwable) {
            session.close()
            throw e
        }
        return session
    }
}
