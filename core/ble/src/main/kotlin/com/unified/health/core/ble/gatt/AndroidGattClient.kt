package com.unified.health.core.ble.gatt

import android.annotation.SuppressLint
import android.bluetooth.BluetoothDevice
import android.bluetooth.BluetoothGatt
import android.bluetooth.BluetoothGattCallback
import android.bluetooth.BluetoothGattCharacteristic
import android.bluetooth.BluetoothGattDescriptor
import android.bluetooth.BluetoothProfile
import android.bluetooth.BluetoothStatusCodes
import android.content.Context
import android.os.Build
import android.util.Log
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.withTimeout
import kotlinx.coroutines.withTimeoutOrNull
import java.util.UUID
import java.util.concurrent.ConcurrentHashMap

/**
 * [GattClient] over `BluetoothGatt`. Create with [AndroidGattClient.connect].
 *
 * Permissions: callers must hold BLUETOOTH_CONNECT (API 31+); [AndroidGattConnector] checks this
 * before connecting and converts `SecurityException` into [BluetoothUnavailableException].
 */
@SuppressLint("MissingPermission")
internal class AndroidGattClient private constructor(
    private val device: BluetoothDevice,
    private val options: GattOptions,
) : GattClient {

    override val address: String = device.address

    private val _connected = MutableStateFlow(false)
    override val connected: StateFlow<Boolean> = _connected.asStateFlow()

    @Volatile
    override var mtu: Int = GattClient.DEFAULT_MTU
        private set

    @Volatile
    private var gatt: BluetoothGatt? = null

    /** Serializes GATT operations; [pending] is the one in flight. */
    private val operationLock = Mutex()

    @Volatile
    private var pending: CompletableDeferred<GattEvent>? = null

    @Volatile
    private var connectWaiter: CompletableDeferred<Unit>? = null

    private val subscriptions = ConcurrentHashMap<Pair<UUID, UUID>, Channel<ByteArray>>()

    private class GattEvent(val status: Int, val value: ByteArray? = null, val mtu: Int = 0)

    private val callback = object : BluetoothGattCallback() {
        override fun onConnectionStateChange(gatt: BluetoothGatt, status: Int, newState: Int) {
            Log.d(TAG, "$address connection state=$newState status=$status")
            if (newState == BluetoothProfile.STATE_CONNECTED && status == BluetoothGatt.GATT_SUCCESS) {
                _connected.value = true
                connectWaiter?.complete(Unit)
            } else if (newState == BluetoothProfile.STATE_DISCONNECTED || status != BluetoothGatt.GATT_SUCCESS) {
                connectWaiter?.completeExceptionally(GattException("Connection failed (status $status)"))
                onLinkLost()
            }
        }

        override fun onServicesDiscovered(gatt: BluetoothGatt, status: Int) = complete(GattEvent(status))

        override fun onMtuChanged(gatt: BluetoothGatt, mtu: Int, status: Int) = complete(GattEvent(status, mtu = mtu))

        override fun onCharacteristicRead(gatt: BluetoothGatt, characteristic: BluetoothGattCharacteristic, value: ByteArray, status: Int) =
            complete(GattEvent(status, value))

        @Deprecated("Used below API 33 only")
        @Suppress("DEPRECATION")
        override fun onCharacteristicRead(gatt: BluetoothGatt, characteristic: BluetoothGattCharacteristic, status: Int) {
            if (Build.VERSION.SDK_INT < Build.VERSION_CODES.TIRAMISU) complete(GattEvent(status, characteristic.value?.copyOf()))
        }

        override fun onCharacteristicWrite(gatt: BluetoothGatt, characteristic: BluetoothGattCharacteristic, status: Int) =
            complete(GattEvent(status))

        override fun onDescriptorWrite(gatt: BluetoothGatt, descriptor: BluetoothGattDescriptor, status: Int) =
            complete(GattEvent(status))

        override fun onCharacteristicChanged(gatt: BluetoothGatt, characteristic: BluetoothGattCharacteristic, value: ByteArray) =
            deliver(characteristic, value)

        @Deprecated("Used below API 33 only")
        @Suppress("DEPRECATION")
        override fun onCharacteristicChanged(gatt: BluetoothGatt, characteristic: BluetoothGattCharacteristic) {
            if (Build.VERSION.SDK_INT < Build.VERSION_CODES.TIRAMISU) deliver(characteristic, characteristic.value?.copyOf() ?: return)
        }
    }

    private fun complete(event: GattEvent) {
        pending?.complete(event)
    }

    private fun deliver(characteristic: BluetoothGattCharacteristic, value: ByteArray) {
        val channel = subscriptions[characteristic.service.uuid to characteristic.uuid]
        if (channel == null) {
            Log.v(TAG, "Dropping notification from unsubscribed ${characteristic.uuid}")
            return
        }
        channel.trySend(value) // Unlimited channel: only fails once closed.
    }

    private fun onLinkLost() {
        if (!_connected.value && gatt == null) return
        _connected.value = false
        pending?.completeExceptionally(GattDisconnectedException())
        subscriptions.values.forEach { it.close() }
        subscriptions.clear()
        gatt?.close()
        gatt = null
    }

    private suspend fun open(context: Context, timeoutMs: Long) {
        val waiter = CompletableDeferred<Unit>()
        connectWaiter = waiter
        val link = device.connectGatt(context, false, callback, BluetoothDevice.TRANSPORT_LE)
            ?: throw GattException("connectGatt returned null")
        gatt = link
        try {
            withTimeout(timeoutMs) { waiter.await() }
            if (options.refreshCacheBeforeDiscovery) refreshGattCache(link)
            operation("discoverServices", options.discoveryTimeoutMs) { it.discoverServices() }
        } catch (t: Throwable) {
            close()
            throw if (t is GattException || t is CancellationException) t else GattException("Connecting to $address failed: ${t.message}", t)
        } finally {
            connectWaiter = null
        }
    }

    override fun hasService(service: UUID): Boolean = gatt?.getService(service) != null

    override fun findCharacteristic(characteristic: UUID, service: UUID?): GattCharacteristic? {
        val g = gatt ?: return null
        val services = if (service != null) listOfNotNull(g.getService(service)) else g.services
        for (s in services) {
            val c = s.getCharacteristic(characteristic) ?: continue
            return GattCharacteristic(s.uuid, c.uuid, c.properties)
        }
        return null
    }

    override fun requestConnectionPriority(priority: ConnectionPriority): Boolean {
        val g = gatt ?: return false
        val native = when (priority) {
            ConnectionPriority.HIGH -> BluetoothGatt.CONNECTION_PRIORITY_HIGH
            ConnectionPriority.BALANCED -> BluetoothGatt.CONNECTION_PRIORITY_BALANCED
            ConnectionPriority.LOW_POWER -> BluetoothGatt.CONNECTION_PRIORITY_LOW_POWER
        }
        return g.requestConnectionPriority(native)
    }

    override suspend fun requestMtu(mtu: Int): Int {
        val event = operation("requestMtu($mtu)") { it.requestMtu(mtu) }
        this.mtu = event.mtu
        return event.mtu
    }

    override suspend fun read(characteristic: GattCharacteristic): ByteArray =
        operation("read ${characteristic.uuid}") { it.readCharacteristic(native(it, characteristic)) }.value ?: ByteArray(0)

    override suspend fun write(characteristic: GattCharacteristic, value: ByteArray, type: WriteType) {
        require(value.size <= maxWriteLength) { "Write of ${value.size} bytes exceeds ${maxWriteLength} (MTU $mtu)" }
        val writeType = when (type) {
            WriteType.WITH_RESPONSE -> BluetoothGattCharacteristic.WRITE_TYPE_DEFAULT
            WriteType.WITHOUT_RESPONSE -> BluetoothGattCharacteristic.WRITE_TYPE_NO_RESPONSE
            WriteType.DEFAULT ->
                if (characteristic.canWriteWithResponse || !characteristic.canWriteWithoutResponse) {
                    BluetoothGattCharacteristic.WRITE_TYPE_DEFAULT
                } else {
                    BluetoothGattCharacteristic.WRITE_TYPE_NO_RESPONSE
                }
        }
        operation("write ${characteristic.uuid}") { g ->
            val c = native(g, characteristic)
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                g.writeCharacteristic(c, value, writeType) == BluetoothStatusCodes.SUCCESS
            } else {
                @Suppress("DEPRECATION")
                run {
                    c.writeType = writeType
                    c.value = value
                    g.writeCharacteristic(c)
                }
            }
        }
    }

    override suspend fun subscribe(characteristic: GattCharacteristic): ReceiveChannel<ByteArray> {
        val key = characteristic.service to characteristic.uuid
        subscriptions[key]?.let { return it }
        val channel = Channel<ByteArray>(Channel.UNLIMITED)
        subscriptions[key] = channel // Registered first so no early notification is lost.
        try {
            val g = gatt ?: throw GattDisconnectedException()
            val c = native(g, characteristic)
            if (!g.setCharacteristicNotification(c, true)) throw GattException("setCharacteristicNotification failed for ${c.uuid}")
            val cccd = c.getDescriptor(StandardUuids.CLIENT_CHARACTERISTIC_CONFIG)
            if (cccd != null) {
                val enable = if (characteristic.canNotify) {
                    BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE
                } else {
                    BluetoothGattDescriptor.ENABLE_INDICATION_VALUE
                }
                operation("enable notifications ${c.uuid}") { gatt ->
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                        gatt.writeDescriptor(cccd, enable) == BluetoothStatusCodes.SUCCESS
                    } else {
                        @Suppress("DEPRECATION")
                        run {
                            cccd.value = enable
                            gatt.writeDescriptor(cccd)
                        }
                    }
                }
            }
            return channel
        } catch (t: Throwable) {
            subscriptions.remove(key)
            channel.close()
            throw t
        }
    }

    override suspend fun unsubscribe(characteristic: GattCharacteristic) {
        val channel = subscriptions.remove(characteristic.service to characteristic.uuid) ?: return
        channel.close()
        val g = gatt ?: return
        runCatching {
            val c = native(g, characteristic)
            g.setCharacteristicNotification(c, false)
            val cccd = c.getDescriptor(StandardUuids.CLIENT_CHARACTERISTIC_CONFIG) ?: return@runCatching
            val disable = BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE
            operation("disable notifications ${c.uuid}") { gatt ->
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                    gatt.writeDescriptor(cccd, disable) == BluetoothStatusCodes.SUCCESS
                } else {
                    @Suppress("DEPRECATION")
                    run {
                        cccd.value = disable
                        gatt.writeDescriptor(cccd)
                    }
                }
            }
        }.onFailure { if (it is kotlinx.coroutines.CancellationException) throw it }
    }

    override suspend fun close() {
        val g = gatt ?: run { _connected.value = false; return }
        runCatching { g.disconnect() }
        onLinkLost()
    }

    private fun native(gatt: BluetoothGatt, characteristic: GattCharacteristic): BluetoothGattCharacteristic =
        gatt.getService(characteristic.service)?.getCharacteristic(characteristic.uuid)
            ?: throw GattException("Characteristic ${characteristic.uuid} not found in ${characteristic.service}")

    /**
     * Runs one GATT operation: [start] must return true when the stack accepted it; the matching
     * callback completes [pending]. Non-success statuses become [GattException].
     */
    private suspend fun operation(
        name: String,
        timeoutMs: Long? = null,
        start: (BluetoothGatt) -> Boolean,
    ): GattEvent = operationLock.withLock {
        val g = gatt ?: throw GattDisconnectedException()
        val deferred = CompletableDeferred<GattEvent>()
        pending = deferred
        try {
            if (!start(g)) throw GattException("$name was rejected by the Bluetooth stack")
            val timeout = timeoutMs ?: options.operationTimeoutMs
            val event = withTimeoutOrNull(timeout) { deferred.await() } ?: throw GattException("$name timed out")
            if (event.status != BluetoothGatt.GATT_SUCCESS) throw GattException("$name failed (status ${event.status})")
            event
        } finally {
            pending = null
        }
    }

    /**
     * Refreshes the hidden GATT service cache (`BluetoothGatt.refresh()`), the vendor app's
     * workaround for stale services / status 133 (`GattPeripheral.java:235-249`, `a0.java:994-1008`).
     * Guarded to API 28+ and best effort: hidden-API enforcement or a missing method must not fail
     * the connection.
     */
    private fun refreshGattCache(gatt: BluetoothGatt) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.P) return
        try {
            val method = BluetoothGatt::class.java.getDeclaredMethod("refresh")
            method.isAccessible = true
            method.invoke(gatt)
            Log.d(TAG, "Refreshed GATT cache for $address before service discovery")
        } catch (e: Exception) {
            Log.w(TAG, "GATT cache refresh unavailable: ${e.message}")
        }
    }

    companion object {
        private const val TAG = "AndroidGattClient"

        suspend fun connect(context: Context, device: BluetoothDevice, options: GattOptions): AndroidGattClient =
            AndroidGattClient(device, options).also { it.open(context, options.connectTimeoutMs) }
    }
}
