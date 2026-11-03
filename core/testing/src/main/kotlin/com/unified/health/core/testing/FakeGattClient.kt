package com.unified.health.core.testing

import com.unified.health.core.ble.gatt.GattCharacteristic
import com.unified.health.core.ble.gatt.GattClient
import com.unified.health.core.ble.gatt.GattDisconnectedException
import com.unified.health.core.ble.gatt.GattException
import com.unified.health.core.ble.gatt.WriteType
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import java.util.UUID
import java.util.concurrent.CopyOnWriteArrayList

/**
 * In-memory [GattClient] for JVM tests. Declare the device's characteristics, then script the
 * watch in [onWrite]: inspect what the driver wrote and answer with [notify].
 *
 * ```
 * val gatt = FakeGattClient(listOf(writeChar, notifyChar), mtu = 247)
 * gatt.onWrite = { char, value -> if (value[0] == 0x01.toByte()) gatt.notify(notifyChar, reply) }
 * ```
 */
class FakeGattClient(
    characteristics: List<GattCharacteristic>,
    override val address: String = "AA:BB:CC:DD:EE:FF",
    mtu: Int = GattClient.DEFAULT_MTU,
    /** MTU granted by [requestMtu]; defaults to whatever is requested. */
    private val maxMtu: Int = 517,
) : GattClient {

    data class Write(val characteristic: GattCharacteristic, val value: ByteArray, val type: WriteType)

    private val characteristics = characteristics.toList()
    private val subscriptions = mutableMapOf<GattCharacteristic, Channel<ByteArray>>()
    private val _connected = MutableStateFlow(true)

    override val connected: StateFlow<Boolean> = _connected.asStateFlow()

    override var mtu: Int = mtu
        private set

    /** Every write, in order. */
    val writes: MutableList<Write> = CopyOnWriteArrayList()

    /** Values returned by [read], keyed by characteristic UUID. */
    val readValues: MutableMap<UUID, ByteArray> = mutableMapOf()

    /** Scripted watch behaviour, invoked synchronously for each write. */
    var onWrite: suspend (GattCharacteristic, ByteArray) -> Unit = { _, _ -> }

    override fun hasService(service: UUID): Boolean = characteristics.any { it.service == service }

    override fun findCharacteristic(characteristic: UUID, service: UUID?): GattCharacteristic? =
        characteristics.firstOrNull { it.uuid == characteristic && (service == null || it.service == service) }

    override suspend fun requestMtu(mtu: Int): Int {
        ensureConnected()
        this.mtu = minOf(mtu, maxMtu)
        return this.mtu
    }

    override suspend fun read(characteristic: GattCharacteristic): ByteArray {
        ensureConnected()
        return readValues[characteristic.uuid] ?: throw GattException("No scripted value for ${characteristic.uuid}")
    }

    override suspend fun write(characteristic: GattCharacteristic, value: ByteArray, type: WriteType) {
        ensureConnected()
        require(value.size <= maxWriteLength) { "Write of ${value.size} bytes exceeds $maxWriteLength" }
        writes += Write(characteristic, value.copyOf(), type)
        onWrite(characteristic, value)
    }

    override suspend fun subscribe(characteristic: GattCharacteristic): ReceiveChannel<ByteArray> {
        ensureConnected()
        return synchronized(subscriptions) { subscriptions.getOrPut(characteristic) { Channel(Channel.UNLIMITED) } }
    }

    override suspend fun unsubscribe(characteristic: GattCharacteristic) {
        synchronized(subscriptions) { subscriptions.remove(characteristic) }?.close()
    }

    /** Sends a notification from the "watch". Throws if the driver never subscribed. */
    fun notify(characteristic: GattCharacteristic, value: ByteArray) {
        val channel = synchronized(subscriptions) { subscriptions[characteristic] }
            ?: error("Driver is not subscribed to ${characteristic.uuid}")
        channel.trySend(value.copyOf())
    }

    fun isSubscribed(characteristic: GattCharacteristic): Boolean = synchronized(subscriptions) { characteristic in subscriptions }

    /** Simulates the watch dropping the link. */
    fun disconnect() {
        _connected.value = false
        synchronized(subscriptions) { subscriptions.values.forEach { it.close() } }
    }

    override suspend fun close() = disconnect()

    private fun ensureConnected() {
        if (!_connected.value) throw GattDisconnectedException()
    }
}

/** Shorthand to declare a characteristic with the given property bits. */
fun characteristic(service: UUID, uuid: UUID, vararg properties: Int): GattCharacteristic =
    GattCharacteristic(service, uuid, properties.fold(0) { acc, p -> acc or p })
