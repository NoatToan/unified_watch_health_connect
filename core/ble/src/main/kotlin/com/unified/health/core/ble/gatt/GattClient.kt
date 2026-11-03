package com.unified.health.core.ble.gatt

import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.flow.StateFlow
import java.util.UUID

/**
 * Coroutine view of one connected GATT link. Operations are serialized internally (Android allows
 * a single outstanding GATT operation), so callers may invoke them from any coroutine.
 *
 * Drivers depend only on this interface, which keeps protocol code testable on the JVM with a
 * scripted fake (see `:core:testing`).
 */
interface GattClient {
    val address: String

    /** False once the link dropped or [close] was called; never becomes true again. */
    val connected: StateFlow<Boolean>

    /** Current ATT MTU (23 until [requestMtu] succeeds). */
    val mtu: Int

    /** Largest value accepted by one characteristic write: ATT MTU − 3. */
    val maxWriteLength: Int get() = mtu - ATT_HEADER_SIZE

    fun hasService(service: UUID): Boolean

    /**
     * Finds a characteristic by UUID, restricted to [service] when given. Returns null when the
     * device does not expose it.
     */
    fun findCharacteristic(characteristic: UUID, service: UUID? = null): GattCharacteristic?

    /**
     * Hints the connection interval to the peripheral. Non-blocking; returns false when unsupported
     * or the link is gone. [ConnectionPriority.LOW_POWER] lets the radio sleep between events.
     */
    fun requestConnectionPriority(priority: ConnectionPriority): Boolean = false

    /** @return the negotiated MTU (may be lower than requested). */
    suspend fun requestMtu(mtu: Int): Int

    suspend fun read(characteristic: GattCharacteristic): ByteArray

    /** Writes one value; it must fit in [maxWriteLength]. Chunking is the protocol's job. */
    suspend fun write(characteristic: GattCharacteristic, value: ByteArray, type: WriteType = WriteType.DEFAULT)

    /**
     * Enables notifications (or indications) and returns an unbounded channel receiving every
     * value in arrival order. Values are buffered from the moment this call starts, so nothing is
     * lost between enabling and the first `receive()`. The channel closes when the link drops.
     */
    suspend fun subscribe(characteristic: GattCharacteristic): ReceiveChannel<ByteArray>

    /**
     * Disables notifications for [characteristic] (CCCD off, so the watch stops transmitting) and
     * closes the channel returned by [subscribe]. No-op when not subscribed; never throws, also
     * when the link is already gone. A later [subscribe] starts a fresh channel.
     */
    suspend fun unsubscribe(characteristic: GattCharacteristic)

    /** Disconnects and releases the link. Idempotent, never throws. */
    suspend fun close()

    companion object {
        const val DEFAULT_MTU = 23
        const val ATT_HEADER_SIZE = 3
    }
}

data class GattCharacteristic(
    val service: UUID,
    val uuid: UUID,
    /** `BluetoothGattCharacteristic.PROPERTY_*` bit mask. */
    val properties: Int,
) {
    val canWriteWithResponse: Boolean get() = properties and PROPERTY_WRITE != 0
    val canWriteWithoutResponse: Boolean get() = properties and PROPERTY_WRITE_NO_RESPONSE != 0
    val canNotify: Boolean get() = properties and PROPERTY_NOTIFY != 0
    val canIndicate: Boolean get() = properties and PROPERTY_INDICATE != 0

    companion object {
        // Mirrors android.bluetooth.BluetoothGattCharacteristic so this type stays JVM-testable.
        const val PROPERTY_READ = 0x02
        const val PROPERTY_WRITE_NO_RESPONSE = 0x04
        const val PROPERTY_WRITE = 0x08
        const val PROPERTY_NOTIFY = 0x10
        const val PROPERTY_INDICATE = 0x20
    }
}

enum class ConnectionPriority {
    /** Short interval for bulk transfers (history sync). */
    HIGH,
    BALANCED,

    /** Long interval; enough for 1 Hz notifications and the cheapest on both batteries. */
    LOW_POWER,
}

enum class WriteType {
    WITH_RESPONSE,
    WITHOUT_RESPONSE,

    /** With response when the characteristic supports it, otherwise without. */
    DEFAULT,
}

open class GattException(message: String, cause: Throwable? = null) : Exception(message, cause)

class GattDisconnectedException(message: String = "GATT link disconnected") : GattException(message)

/** Bluetooth is off, missing, or a runtime permission was revoked. */
class BluetoothUnavailableException(message: String, cause: Throwable? = null) : GattException(message, cause)
