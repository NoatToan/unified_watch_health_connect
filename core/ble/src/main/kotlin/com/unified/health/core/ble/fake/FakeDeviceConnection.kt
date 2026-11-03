package com.unified.health.core.ble.fake

import com.unified.health.core.ble.DeviceConnection
import com.unified.health.core.model.ConnectionState
import com.unified.health.core.model.DeviceCapability
import com.unified.health.core.model.DeviceInfo
import com.unified.health.core.model.HealthRecord
import com.unified.health.core.model.WearableVendor
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.flow
import java.time.Instant
import javax.inject.Inject
import javax.inject.Singleton

/** Simulates the connection lifecycle (Connecting → Authenticating → Connected) with delays. */
@Singleton
class FakeDeviceConnection @Inject constructor() : DeviceConnection {

    private val _state = MutableStateFlow<ConnectionState>(ConnectionState.Disconnected)
    override val state: StateFlow<ConnectionState> = _state.asStateFlow()

    private val _activeAddress = MutableStateFlow<String?>(null)
    override val activeAddress: StateFlow<String?> = _activeAddress.asStateFlow()

    private val _capabilities = MutableStateFlow<Set<DeviceCapability>>(emptySet())
    override val capabilities: StateFlow<Set<DeviceCapability>> = _capabilities.asStateFlow()

    override val liveHeartRate: Flow<HealthRecord.HeartRate> = flow {
        while (true) {
            if (_state.value == ConnectionState.Connected) emit(HealthRecord.HeartRate(Instant.now(), 64 + (System.nanoTime() % 12).toInt()))
            delay(1_000)
        }
    }

    override suspend fun connect(macAddress: String, vendor: WearableVendor): Result<Unit> {
        _activeAddress.value = macAddress
        _state.value = ConnectionState.Connecting
        delay(800)
        _state.value = ConnectionState.Authenticating
        delay(700)
        _state.value = ConnectionState.Connected
        _capabilities.value = setOf(DeviceCapability.HISTORY_SYNC, DeviceCapability.LIVE_HEART_RATE, DeviceCapability.BATTERY_LEVEL)
        return Result.success(Unit)
    }

    override suspend fun disconnect() {
        _capabilities.value = emptySet()
        _state.value = ConnectionState.Disconnected
        _activeAddress.value = null
    }

    override suspend fun readDeviceInfo(): Result<DeviceInfo> =
        if (_state.value == ConnectionState.Connected) {
            Result.success(
                DeviceInfo(model = "Demo Watch", firmwareVersion = "1.0.0.42", serialNumber = "DEMO0001", batteryPercent = 76),
            )
        } else {
            Result.failure(IllegalStateException("Not connected"))
        }
}
