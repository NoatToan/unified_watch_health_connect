package com.unified.health.core.model

import java.time.Instant

/** Link-level state of a wearable, as observed by the BLE layer. */
sealed interface ConnectionState {
    data object Disconnected : ConnectionState
    data object Connecting : ConnectionState

    /** GATT connected; vendor link-layer handshake / authentication in progress. */
    data object Authenticating : ConnectionState
    data object Connected : ConnectionState
    data class Error(val reason: String) : ConnectionState
}

/**
 * Watch brands the app can talk to. Each value is served by exactly one `WearableDriver`
 * (`:driver:*` modules). Adding a brand = add a value here + a new driver module.
 */
enum class WearableVendor(val displayName: String) {
    GARMIN("Garmin"),
    HUAWEI("Huawei"),
    ZEPP("Zepp / Amazfit"),
    COROS("Coros"),

    /** Any watch exposing the Bluetooth SIG Heart Rate / Battery / Device Information services. */
    STANDARD("Bluetooth standard"),

    /** Simulated watch served by the debug-only mock driver (E2E tests, demos). Never in release. */
    DEMO("Demo watch"),
}

/** What a connected session can do; the UI enables actions from this set. */
enum class DeviceCapability {
    HISTORY_SYNC,
    LIVE_HEART_RATE,
    BATTERY_LEVEL,
}

/**
 * A secret the user must supply before a driver can authenticate, e.g. the Zepp auth key that
 * is created by the vendor app during its first bind and cannot be derived by a third party.
 */
data class CredentialRequirement(
    /** Stable storage key, e.g. `zepp.auth_key`. */
    val key: String,
    val label: String,
    val description: String,
    val format: CredentialFormat,
    /**
     * True when the app may create this secret itself and write it to the watch (first bind),
     * instead of the user copying it from the vendor app.
     */
    val generatable: Boolean = false,
) {
    /**
     * Companion credential that exists while a generated [key] has not yet been accepted by the
     * watch. The driver removes it once the bind succeeded.
     */
    val unboundMarkerKey: String get() = "$key.unbound"
}

enum class CredentialFormat(val byteLength: Int?) {
    /** 16 bytes written as 32 hex characters (an optional `0x` prefix is accepted). */
    HEX_16_BYTES(16),
    TEXT(null),
}

/** A paired (known) wearable, reached over a direct BLE GATT link. */
data class WearableDevice(
    val id: String,
    val name: String,
    val macAddress: String,
    val vendor: WearableVendor,
    val model: String? = null,
    val batteryPercent: Int? = null,
    val firmwareVersion: String? = null,
    val connectionState: ConnectionState = ConnectionState.Disconnected,
    val lastSyncedAt: Instant? = null,
    /** Secrets this device's driver needs; empty for most brands. */
    val credentialRequirements: List<CredentialRequirement> = emptyList(),
    /** Keys from [credentialRequirements] that are already stored. */
    val storedCredentialKeys: Set<String> = emptySet(),
    /** What the live session supports; empty while the device is not connected. */
    val capabilities: Set<DeviceCapability> = emptySet(),
    /** When the device was added to the app. */
    val pairedAt: Instant? = null,
) {
    val missingCredentials: List<CredentialRequirement>
        get() = credentialRequirements.filterNot { it.key in storedCredentialKeys }
}

/** A device found during discovery (BLE scan or the system bond list), not paired yet. */
data class DiscoveredDevice(
    val name: String,
    val macAddress: String,
    /** dBm, or null when the device is only known from the system bond list and was not heard. */
    val rssi: Int?,
    val vendor: WearableVendor,
    val isBonded: Boolean = false,
)

/** Static information read from a connected device. */
data class DeviceInfo(
    val model: String?,
    val firmwareVersion: String?,
    val serialNumber: String?,
    val batteryPercent: Int?,
)

data class SyncResult(
    val syncedAt: Instant,
    val recordsImported: Int,
)

sealed interface SyncState {
    data object Idle : SyncState
    data class InProgress(val progress: Float) : SyncState
    data class Done(val result: SyncResult) : SyncState
    data class Failed(val reason: String) : SyncState
}
