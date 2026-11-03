package com.unified.health.core.ble

import com.unified.health.core.model.DiscoveredDevice
import kotlinx.coroutines.flow.Flow

/**
 * Discovers nearby wearables over BLE.
 *
 * Real implementation (TODO): wrap `BluetoothLeScanner` with a `ScanFilter` on the vendor
 * service UUID / manufacturer data, require BLUETOOTH_SCAN (API 31+) or ACCESS_FINE_LOCATION
 * (API ≤ 30), and stop scanning when the flow is cancelled.
 */
interface DeviceScanner {
    /** Cold flow emitting the accumulated, de-duplicated list of devices while collected. */
    fun scan(): Flow<List<DiscoveredDevice>>
}
