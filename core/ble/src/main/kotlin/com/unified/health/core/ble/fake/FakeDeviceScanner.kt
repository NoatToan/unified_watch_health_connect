package com.unified.health.core.ble.fake

import com.unified.health.core.ble.DeviceScanner
import com.unified.health.core.model.DiscoveredDevice
import com.unified.health.core.model.WearableVendor
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import kotlin.random.Random

/** Emits a few made-up devices over ~3 seconds so the scan UI can be exercised without hardware. */
class FakeDeviceScanner @Inject constructor() : DeviceScanner {

    private val catalogue = listOf(
        DiscoveredDevice(name = "Demo Forerunner", macAddress = "00:11:22:33:44:01", rssi = -52, vendor = WearableVendor.GARMIN),
        DiscoveredDevice(name = "Demo Watch GT", macAddress = "00:11:22:33:44:02", rssi = -67, vendor = WearableVendor.HUAWEI),
        DiscoveredDevice(name = "Demo Amazfit", macAddress = "00:11:22:33:44:03", rssi = -79, vendor = WearableVendor.ZEPP),
    )

    override fun scan(): Flow<List<DiscoveredDevice>> = flow {
        val found = mutableListOf<DiscoveredDevice>()
        emit(emptyList())
        for (device in catalogue) {
            delay(900)
            found += device.copy(rssi = device.rssi?.plus(Random.nextInt(-4, 4)))
            emit(found.sortedByDescending { it.rssi ?: Int.MIN_VALUE })
        }
    }
}
