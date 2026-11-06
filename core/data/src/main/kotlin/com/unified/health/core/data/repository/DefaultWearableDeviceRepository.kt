package com.unified.health.core.data.repository

import com.unified.health.core.ble.DeviceConnection
import com.unified.health.core.ble.DeviceScanner
import com.unified.health.core.ble.HealthDataSync
import com.unified.health.core.ble.credentials.DeviceCredentialStore
import com.unified.health.core.ble.driver.DriverRegistry
import com.unified.health.core.ble.protocol.hexToBytes
import com.unified.health.core.data.database.PairedDeviceDao
import com.unified.health.core.data.database.PairedDeviceEntity
import com.unified.health.core.data.database.toModel
import com.unified.health.core.data.sync.HealthRecordSinkFactory
import com.unified.health.core.domain.repository.WearableDeviceRepository
import com.unified.health.core.model.ConnectionState
import com.unified.health.core.model.CredentialFormat
import com.unified.health.core.model.CredentialRequirement
import com.unified.health.core.model.DiscoveredDevice
import com.unified.health.core.model.SyncState
import com.unified.health.core.model.WearableDevice
import com.unified.health.core.model.WearableVendor
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.combine
import java.security.SecureRandom
import java.time.Instant
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Orchestrates scan / pair / connect / sync on top of `:core:ble` and persists paired devices
 * in Room. Brand-agnostic: vendor specifics come from the driver registered for each device.
 */
@Singleton
class DefaultWearableDeviceRepository @Inject constructor(
    private val scanner: DeviceScanner,
    private val connection: DeviceConnection,
    private val healthDataSync: HealthDataSync,
    private val dao: PairedDeviceDao,
    private val registry: DriverRegistry,
    private val credentials: DeviceCredentialStore,
    private val sinkFactory: HealthRecordSinkFactory,
) : WearableDeviceRepository {

    /** Bumped on every credential change so [pairedDevices] re-reads stored keys. */
    private val credentialsVersion = MutableStateFlow(0)

    override val pairedDevices: Flow<List<WearableDevice>> =
        combine(dao.observeAll(), connection.state, connection.activeAddress, connection.capabilities, credentialsVersion) { entities, state, active, capabilities, _ ->
            entities.map { e ->
                val isActive = e.macAddress == active
                e.toModel(
                    connectionState = if (isActive) state else ConnectionState.Disconnected,
                    credentialRequirements = requirementsFor(e.wearableVendor),
                    storedCredentialKeys = credentials.keys(e.macAddress),
                    capabilities = if (isActive && state == ConnectionState.Connected) capabilities else emptySet(),
                )
            }
        }

    override val connectionState: Flow<ConnectionState> = connection.state

    override val syncState: Flow<SyncState> = healthDataSync.state

    override fun scan(): Flow<List<DiscoveredDevice>> = scanner.scan()

    override suspend fun pair(device: DiscoveredDevice): Result<WearableDevice> {
        val entity = PairedDeviceEntity(
            id = device.macAddress,
            name = device.name,
            macAddress = device.macAddress,
            model = null,
            firmwareVersion = null,
            batteryPercent = null,
            lastSyncedAtEpochMs = null,
            pairedAtEpochMs = System.currentTimeMillis(),
            vendor = device.vendor.name,
        )
        dao.upsert(entity)
        val model = entity.toModel(
            ConnectionState.Disconnected,
            requirementsFor(device.vendor),
            credentials.keys(entity.macAddress),
        )
        // A device that needs a user-supplied key is saved now and connected once the key is entered.
        if (model.missingCredentials.isNotEmpty()) return Result.success(model)
        return connect(entity.id).map { (dao.getById(entity.id) ?: entity).toModel(ConnectionState.Connected) }
    }

    override suspend fun connect(deviceId: String): Result<Unit> {
        val entity = dao.getById(deviceId) ?: return Result.failure(NoSuchElementException("Unknown device $deviceId"))
        val missing = requirementsFor(entity.wearableVendor).filterNot { it.key in credentials.keys(entity.macAddress) }
        if (missing.isNotEmpty()) {
            return Result.failure(IllegalStateException("Enter ${missing.joinToString { it.label }} before connecting"))
        }
        return connection.connect(entity.macAddress, entity.wearableVendor).onSuccess {
            connection.readDeviceInfo().onSuccess { info ->
                dao.updateInfo(deviceId, info.batteryPercent, info.firmwareVersion, info.model)
            }
        }
    }

    override suspend fun disconnect(deviceId: String) {
        val entity = dao.getById(deviceId) ?: return
        if (connection.activeAddress.value == entity.macAddress) connection.disconnect()
    }

    override suspend fun unpair(deviceId: String) {
        val entity = dao.getById(deviceId) ?: return
        disconnect(deviceId)
        credentials.clear(entity.macAddress)
        dao.delete(deviceId)
        credentialsVersion.value++
    }

    override suspend fun syncNow(deviceId: String): Result<Unit> {
        val entity = dao.getById(deviceId) ?: return Result.failure(NoSuchElementException("Unknown device $deviceId"))
        if (connection.state.value != ConnectionState.Connected || connection.activeAddress.value != entity.macAddress) {
            return Result.failure(IllegalStateException("Device is not connected"))
        }
        return healthDataSync
            .sync(entity.macAddress, entity.lastSyncedAtEpochMs?.let(Instant::ofEpochMilli), sinkFactory.create(entity.id))
            .map { result -> dao.updateLastSynced(deviceId, result.syncedAt.toEpochMilli()) }
    }

    override suspend fun setCredential(deviceId: String, key: String, value: String): Result<Unit> {
        val entity = dao.getById(deviceId) ?: return Result.failure(NoSuchElementException("Unknown device $deviceId"))
        val requirement = requirementsFor(entity.wearableVendor).firstOrNull { it.key == key }
            ?: return Result.failure(IllegalArgumentException("${entity.wearableVendor.displayName} does not use $key"))
        val bytes = parse(requirement, value).getOrElse { return Result.failure(it) }
        credentials.put(entity.macAddress, key, bytes)
        credentials.remove(entity.macAddress, requirement.unboundMarkerKey)
        credentialsVersion.value++
        return Result.success(Unit)
    }

    override suspend fun generateCredential(deviceId: String, key: String): Result<String> {
        val entity = dao.getById(deviceId) ?: return Result.failure(NoSuchElementException("Unknown device $deviceId"))
        val requirement = requirementsFor(entity.wearableVendor).firstOrNull { it.key == key && it.generatable }
            ?: return Result.failure(IllegalArgumentException("${entity.wearableVendor.displayName} cannot generate $key"))
        val size = requirement.format.byteLength
            ?: return Result.failure(IllegalArgumentException("${requirement.label} has no fixed size"))
        val bytes = ByteArray(size).also(SecureRandom()::nextBytes)
        credentials.put(entity.macAddress, key, bytes)
        credentials.put(entity.macAddress, requirement.unboundMarkerKey, byteArrayOf(1))
        credentialsVersion.value++
        return Result.success(bytes.joinToString("") { "%02x".format(it) })
    }

    private fun requirementsFor(vendor: WearableVendor): List<CredentialRequirement> =
        registry[vendor]?.credentialRequirements.orEmpty()

    private fun parse(requirement: CredentialRequirement, value: String): Result<ByteArray> = runCatching {
        when (requirement.format) {
            CredentialFormat.TEXT -> value.trim().toByteArray(Charsets.UTF_8).also { require(it.isNotEmpty()) { "Value is empty" } }
            CredentialFormat.HEX_16_BYTES -> value.hexToBytes().also {
                require(it.size == requirement.format.byteLength) { "${requirement.label} must be ${requirement.format.byteLength} bytes (32 hex digits)" }
            }
        }
    }
}
