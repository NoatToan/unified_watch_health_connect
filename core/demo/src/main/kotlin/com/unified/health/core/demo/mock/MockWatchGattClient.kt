package com.unified.health.core.demo.mock

import com.unified.health.core.ble.gatt.ConnectionPriority
import com.unified.health.core.ble.gatt.GattCharacteristic
import com.unified.health.core.ble.gatt.GattClient
import com.unified.health.core.ble.gatt.GattDisconnectedException
import com.unified.health.core.ble.gatt.GattException
import com.unified.health.core.ble.gatt.WriteType
import com.unified.health.core.ble.virtual.VirtualDevice
import com.unified.health.core.ble.scan.Advertisement
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import java.util.UUID

/** In-memory GATT link of the simulated watch: answers the handshake, nothing else goes over the "air". */
internal class MockWatchGattClient(override val address: String) : GattClient {

    private val _connected = MutableStateFlow(true)
    override val connected: StateFlow<Boolean> = _connected.asStateFlow()

    override var mtu: Int = GattClient.DEFAULT_MTU
        private set

    private val subscriptions = mutableMapOf<GattCharacteristic, Channel<ByteArray>>()
    private val characteristics = listOf(MockWatchProtocol.CONTROL_CHAR, MockWatchProtocol.EVENTS_CHAR)

    override fun hasService(service: UUID): Boolean = service == MockWatchProtocol.SERVICE

    override fun findCharacteristic(characteristic: UUID, service: UUID?): GattCharacteristic? =
        characteristics.firstOrNull { it.uuid == characteristic && (service == null || it.service == service) }

    override fun requestConnectionPriority(priority: ConnectionPriority): Boolean = _connected.value

    override suspend fun requestMtu(mtu: Int): Int {
        ensureConnected()
        this.mtu = mtu.coerceIn(GattClient.DEFAULT_MTU, MAX_MTU)
        return this.mtu
    }

    override suspend fun read(characteristic: GattCharacteristic): ByteArray {
        ensureConnected()
        throw GattException("Characteristic ${characteristic.uuid} is not readable")
    }

    override suspend fun write(characteristic: GattCharacteristic, value: ByteArray, type: WriteType) {
        ensureConnected()
        if (characteristic.uuid == MockWatchProtocol.CONTROL && value.contentEquals(MockWatchProtocol.HELLO)) {
            synchronized(subscriptions) { subscriptions[MockWatchProtocol.EVENTS_CHAR] }?.trySend(MockWatchProtocol.ACK)
        }
    }

    override suspend fun subscribe(characteristic: GattCharacteristic): ReceiveChannel<ByteArray> {
        ensureConnected()
        return synchronized(subscriptions) { subscriptions.getOrPut(characteristic) { Channel(Channel.UNLIMITED) } }
    }

    override suspend fun unsubscribe(characteristic: GattCharacteristic) {
        synchronized(subscriptions) { subscriptions.remove(characteristic) }?.close()
    }

    override suspend fun close() {
        _connected.value = false
        synchronized(subscriptions) {
            subscriptions.values.forEach { it.close() }
            subscriptions.clear()
        }
    }

    private fun ensureConnected() {
        if (!_connected.value) throw GattDisconnectedException()
    }

    private companion object {
        const val MAX_MTU = 247
    }
}

/** The simulated watch as seen by the scanner and connector of `:core:ble`. */
internal class MockWatchVirtualDevice(
    override val advertisement: Advertisement = MockWatchProtocol.advertisement(),
) : VirtualDevice {
    override suspend fun connect(): GattClient = MockWatchGattClient(advertisement.address)
}
