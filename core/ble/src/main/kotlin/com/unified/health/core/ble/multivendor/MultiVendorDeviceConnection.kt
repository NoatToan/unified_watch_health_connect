package com.unified.health.core.ble.multivendor

import android.util.Log
import com.unified.health.core.ble.DeviceConnection
import com.unified.health.core.ble.credentials.DeviceCredentialStore
import com.unified.health.core.ble.credentials.readerFor
import com.unified.health.core.ble.credentials.writerFor
import com.unified.health.core.ble.driver.DriverRegistry
import com.unified.health.core.ble.driver.SessionContext
import com.unified.health.core.ble.driver.WearableSession
import com.unified.health.core.ble.gatt.ConnectionPriority
import com.unified.health.core.ble.gatt.GattClient
import com.unified.health.core.ble.gatt.GattConnector
import com.unified.health.core.model.ConnectionState
import com.unified.health.core.model.DeviceCapability
import com.unified.health.core.model.DeviceInfo
import com.unified.health.core.model.HealthRecord
import com.unified.health.core.model.WearableVendor
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.Job
import kotlinx.coroutines.NonCancellable
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.emptyFlow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.launch
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Owns the single active link: picks the vendor driver, opens GATT with the driver's link
 * requirements, runs its handshake, and tears everything down on disconnect or link loss.
 * Reconnection policy belongs to the foreground service, not here.
 */
@Singleton
class MultiVendorDeviceConnection @Inject internal constructor(
    private val connector: GattConnector,
    private val registry: DriverRegistry,
    private val credentials: DeviceCredentialStore,
) : DeviceConnection {

    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.Default)
    private val lock = Mutex()

    private class ActiveLink(val address: String, val gatt: GattClient, val session: WearableSession, val watcher: Job)

    private val active = MutableStateFlow<ActiveLink?>(null)

    private val _state = MutableStateFlow<ConnectionState>(ConnectionState.Disconnected)
    override val state: StateFlow<ConnectionState> = _state.asStateFlow()

    private val _activeAddress = MutableStateFlow<String?>(null)
    override val activeAddress: StateFlow<String?> = _activeAddress.asStateFlow()

    private val _capabilities = MutableStateFlow<Set<DeviceCapability>>(emptySet())
    override val capabilities: StateFlow<Set<DeviceCapability>> = _capabilities.asStateFlow()

    @OptIn(ExperimentalCoroutinesApi::class)
    override val liveHeartRate: Flow<HealthRecord.HeartRate> =
        active.flatMapLatest { it?.session?.liveHeartRate ?: emptyFlow() }

    @OptIn(ExperimentalCoroutinesApi::class)
    override val batteryUpdates: Flow<Int> =
        active.flatMapLatest { it?.session?.batteryUpdates ?: emptyFlow() }

    override suspend fun connect(macAddress: String, vendor: WearableVendor): Result<Unit> = lock.withLock {
        teardown()
        _activeAddress.value = macAddress
        _state.value = ConnectionState.Connecting
        val driver = registry[vendor]
            ?: return@withLock fail(IllegalStateException("No driver installed for ${vendor.displayName}"))
        var gatt: GattClient? = null
        try {
            val requirements = driver.linkRequirements
            gatt = connector.connect(
                macAddress,
                bond = requirements.bond,
                mtu = requirements.mtu,
                options = requirements.toGattOptions(),
                bondOptional = requirements.bondOptional,
            )
            _state.value = ConnectionState.Authenticating
            val session = driver.openSession(gatt, SessionContext(macAddress, credentials.readerFor(macAddress), credentials.writerFor(macAddress)))
            activate(macAddress, session, gatt)
        } catch (e: CancellationException) {
            withContext(NonCancellable) { gatt?.close() }
            _state.value = ConnectionState.Disconnected
            _activeAddress.value = null
            throw e
        } catch (e: Exception) {
            Log.w(TAG, "Connecting to $macAddress (${vendor.name}) failed", e)
            gatt?.close()
            fail(e)
        }
    }

    private fun activate(address: String, session: WearableSession, gatt: GattClient): Result<Unit> {
        val watcher = scope.launch {
            gatt.connected.first { !it }
            onLinkLost(address)
        }
        active.value = ActiveLink(address, gatt, session, watcher)
        // Idle/streaming links need no short interval; sync raises it temporarily.
        gatt.requestConnectionPriority(ConnectionPriority.LOW_POWER)
        _capabilities.value = session.capabilities
        _state.value = ConnectionState.Connected
        return Result.success(Unit)
    }

    override suspend fun disconnect() = lock.withLock {
        teardown()
        _state.value = ConnectionState.Disconnected
        _activeAddress.value = null
    }

    override suspend fun readDeviceInfo(): Result<DeviceInfo> {
        val session = active.value?.session ?: return Result.failure(IllegalStateException("Not connected"))
        return runCatchingNonCancellation { session.readDeviceInfo() }
    }

    /** Session for [address] when it is the connected device; used by [MultiVendorHealthDataSync]. */
    internal fun sessionFor(address: String): WearableSession? =
        active.value?.takeIf { it.address.equals(address, ignoreCase = true) }?.session

    /** Runs [block] with a short connection interval for [address] (bulk transfer), then relaxes the link again. */
    internal suspend fun <T> withHighThroughput(address: String, block: suspend () -> T): T {
        val gatt = active.value?.takeIf { it.address.equals(address, ignoreCase = true) }?.gatt
        gatt?.requestConnectionPriority(ConnectionPriority.HIGH)
        try {
            return block()
        } finally {
            withContext(NonCancellable) { gatt?.requestConnectionPriority(ConnectionPriority.LOW_POWER) }
        }
    }

    private suspend fun onLinkLost(address: String) = lock.withLock {
        val link = active.value ?: return@withLock
        if (link.address != address) return@withLock
        Log.i(TAG, "Link to $address lost")
        active.value = null
        _capabilities.value = emptySet()
        runCatching { link.session.close() }
        link.gatt.close()
        _state.value = ConnectionState.Error("Connection lost")
    }

    /** Must be called with [lock] held. */
    private suspend fun teardown() {
        val link = active.value ?: return
        active.value = null
        _capabilities.value = emptySet()
        link.watcher.cancel()
        withContext(NonCancellable) {
            runCatching { link.session.close() }.onFailure { Log.w(TAG, "Session close failed", it) }
            link.gatt.close()
        }
    }

    private fun fail(error: Throwable): Result<Unit> {
        _capabilities.value = emptySet()
        _state.value = ConnectionState.Error(error.message ?: error::class.java.simpleName)
        return Result.failure(error)
    }

    private companion object {
        const val TAG = "MultiVendorConnection"
    }
}

internal suspend fun <T> runCatchingNonCancellation(block: suspend () -> T): Result<T> = try {
    Result.success(block())
} catch (e: CancellationException) {
    throw e
} catch (e: Exception) {
    Result.failure(e)
}
