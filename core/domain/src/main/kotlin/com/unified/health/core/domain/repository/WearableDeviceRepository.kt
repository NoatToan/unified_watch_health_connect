package com.unified.health.core.domain.repository

import com.unified.health.core.model.ConnectionState
import com.unified.health.core.model.DiscoveredDevice
import com.unified.health.core.model.SyncState
import com.unified.health.core.model.WearableDevice
import kotlinx.coroutines.flow.Flow

/**
 * Single entry point the UI uses to discover, pair, connect to and sync with the user's wearable.
 * Implementations sit on top of the transport abstractions in `:core:ble`.
 */
interface WearableDeviceRepository {
    /** Paired devices, with live connection state / battery merged in. */
    val pairedDevices: Flow<List<WearableDevice>>

    val connectionState: Flow<ConnectionState>

    val syncState: Flow<SyncState>

    /** Cold flow: scanning runs while collected and stops on cancellation. */
    fun scan(): Flow<List<DiscoveredDevice>>

    suspend fun pair(device: DiscoveredDevice): Result<WearableDevice>
    suspend fun connect(deviceId: String): Result<Unit>
    suspend fun disconnect(deviceId: String)
    suspend fun unpair(deviceId: String)
    suspend fun syncNow(deviceId: String): Result<Unit>

    /**
     * Stores a secret listed in [WearableDevice.credentialRequirements] (e.g. the Zepp auth key).
     * Validates [value] against the requirement's format.
     */
    suspend fun setCredential(deviceId: String, key: String, value: String): Result<Unit>

    /**
     * Creates a random secret for a [CredentialRequirement.generatable] requirement and stores it
     * flagged as "not yet bound", so the driver writes it to the watch on the next connection.
     * Replaces any stored value. Returns the key as hex so the UI can show it for backup.
     */
    suspend fun generateCredential(deviceId: String, key: String): Result<String>
}
