package com.unified.health.core.ble

import com.unified.health.core.model.ConnectionState
import com.unified.health.core.model.DeviceCapability
import com.unified.health.core.model.DeviceInfo
import com.unified.health.core.model.HealthRecord
import com.unified.health.core.model.WearableVendor
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.emptyFlow

/**
 * A link to the single active wearable: GATT connect → (bond) → vendor handshake/auth
 * ([ConnectionState.Authenticating]) → [ConnectionState.Connected].
 *
 * The vendor decides which `WearableDriver` runs the handshake. BLE only: no vendor app or
 * cloud is involved, so the app owns the link and receives the watch's raw data. Long-lived connections should be
 * owned by the `connectedDevice` foreground service.
 */
interface DeviceConnection {
    val state: StateFlow<ConnectionState>

    /** MAC address of the device currently connected / connecting, if any. */
    val activeAddress: StateFlow<String?>

    /** Capabilities of the current session; empty while not connected. */
    val capabilities: StateFlow<Set<DeviceCapability>>

    /** Live heart rate of the connected device, when [DeviceCapability.LIVE_HEART_RATE] is present. */
    val liveHeartRate: Flow<HealthRecord.HeartRate>

    /** Battery percent of the connected device every time its session gets a fresh reading, independent
     *  of [readDeviceInfo] (D-1001). Default: no such telemetry. */
    val batteryUpdates: Flow<Int> get() = emptyFlow()

    suspend fun connect(macAddress: String, vendor: WearableVendor): Result<Unit>
    suspend fun disconnect()

    /** Reads model / firmware / battery from the connected device. */
    suspend fun readDeviceInfo(): Result<DeviceInfo>
}
