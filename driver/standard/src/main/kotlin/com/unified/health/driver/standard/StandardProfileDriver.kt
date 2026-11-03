package com.unified.health.driver.standard

import com.unified.health.core.ble.driver.RecognitionScore
import com.unified.health.core.ble.driver.SessionContext
import com.unified.health.core.ble.driver.UnsupportedDeviceException
import com.unified.health.core.ble.driver.WearableDriver
import com.unified.health.core.ble.driver.WearableSession
import com.unified.health.core.ble.gatt.GattClient
import com.unified.health.core.ble.gatt.StandardUuids
import com.unified.health.core.ble.scan.Advertisement
import com.unified.health.core.model.WearableVendor
import javax.inject.Inject

/**
 * Talks to any watch that broadcasts the Bluetooth SIG Heart Rate service (Garmin "Broadcast
 * Heart Rate", Amazfit "HR sharing", Polar, Coros…). No history: samples are buffered while
 * connected and handed over on sync. Scores lowest so a vendor driver always wins when present.
 *
 * Reference implementation of the driver contract; vendor drivers follow the same shape.
 */
class StandardProfileDriver @Inject constructor() : WearableDriver {

    override val vendor = WearableVendor.STANDARD

    override fun recognize(advertisement: Advertisement): Int =
        if (advertisement.hasService(StandardUuids.HEART_RATE_SERVICE)) RecognitionScore.STANDARD_SERVICE else RecognitionScore.NONE

    override suspend fun openSession(gatt: GattClient, context: SessionContext): WearableSession {
        val measurement = gatt.findCharacteristic(StandardUuids.HEART_RATE_MEASUREMENT, StandardUuids.HEART_RATE_SERVICE)
            ?: throw UnsupportedDeviceException("Device does not expose the Heart Rate service")
        return StandardProfileSession(gatt, measurement).also { it.start() }
    }
}
