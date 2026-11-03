package com.unified.health.core.data.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.unified.health.core.model.ConnectionState
import com.unified.health.core.model.CredentialRequirement
import com.unified.health.core.model.WearableDevice
import com.unified.health.core.model.WearableVendor
import java.time.Instant

@Entity(tableName = "paired_devices")
data class PairedDeviceEntity(
    @PrimaryKey val id: String,
    val name: String,
    val macAddress: String,
    val model: String?,
    val firmwareVersion: String?,
    val batteryPercent: Int?,
    val lastSyncedAtEpochMs: Long?,
    val pairedAtEpochMs: Long,
    /** [WearableVendor] name; rows from schema v1 predate multi-vendor support. */
    @ColumnInfo(defaultValue = "STANDARD") val vendor: String,
) {

    val wearableVendor: WearableVendor
        get() = WearableVendor.entries.firstOrNull { it.name == vendor } ?: WearableVendor.STANDARD
}

fun PairedDeviceEntity.toModel(
    connectionState: ConnectionState,
    credentialRequirements: List<CredentialRequirement> = emptyList(),
    storedCredentialKeys: Set<String> = emptySet(),
) = WearableDevice(
    id = id,
    name = name,
    macAddress = macAddress,
    vendor = wearableVendor,
    credentialRequirements = credentialRequirements,
    storedCredentialKeys = storedCredentialKeys,
    model = model,
    batteryPercent = batteryPercent,
    firmwareVersion = firmwareVersion,
    connectionState = connectionState,
    lastSyncedAt = lastSyncedAtEpochMs?.let(Instant::ofEpochMilli),
)
