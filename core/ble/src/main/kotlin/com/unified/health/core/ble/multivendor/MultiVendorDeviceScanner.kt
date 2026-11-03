package com.unified.health.core.ble.multivendor

import com.unified.health.core.ble.DeviceScanner
import com.unified.health.core.ble.driver.DriverRegistry
import com.unified.health.core.ble.scan.Advertisement
import com.unified.health.core.ble.scan.BleScanner
import com.unified.health.core.model.DiscoveredDevice
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

/**
 * Lists watches recognised by a driver: the OS bond list first (bonded watches often stop
 * advertising while connected), then BLE advertisements as they arrive.
 */
class MultiVendorDeviceScanner @Inject internal constructor(
    private val scanner: BleScanner,
    private val registry: DriverRegistry,
) : DeviceScanner {

    override fun scan(): Flow<List<DiscoveredDevice>> = flow {
        val found = LinkedHashMap<String, DiscoveredDevice>()
        scanner.bondedDevices().forEach { found.offer(it) }
        emit(found.sorted())
        scanner.advertisements().collect { advertisement ->
            if (found.offer(advertisement)) emit(found.sorted())
        }
    }

    /** @return true when the list changed. */
    private fun MutableMap<String, DiscoveredDevice>.offer(advertisement: Advertisement): Boolean {
        val vendor = registry.identify(advertisement) ?: return false
        val previous = this[advertisement.address]
        val merged = DiscoveredDevice(
            name = advertisement.name ?: previous?.name ?: advertisement.address,
            macAddress = advertisement.address,
            rssi = advertisement.rssi ?: previous?.rssi,
            // A specific advertisement beats a name guess made from the bond list.
            vendor = if (advertisement.rssi != null || previous == null) vendor else previous.vendor,
            isBonded = advertisement.isBonded || previous?.isBonded == true,
        )
        if (merged == previous) return false
        this[advertisement.address] = merged
        return true
    }

    private fun Map<String, DiscoveredDevice>.sorted() = values.sortedByDescending { it.rssi ?: Int.MIN_VALUE }
}
