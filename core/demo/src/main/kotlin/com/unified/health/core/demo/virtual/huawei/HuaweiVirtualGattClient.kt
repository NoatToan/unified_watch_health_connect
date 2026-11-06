package com.unified.health.core.demo.virtual.huawei

import android.util.Log
import com.unified.health.core.ble.gatt.ConnectionPriority
import com.unified.health.core.ble.gatt.GattCharacteristic
import com.unified.health.core.ble.gatt.GattClient
import com.unified.health.core.ble.gatt.GattDisconnectedException
import com.unified.health.core.ble.gatt.GattException
import com.unified.health.core.ble.gatt.StandardUuids
import com.unified.health.core.ble.gatt.WriteType
import com.unified.health.core.ble.gatt.sigUuid
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import java.security.SecureRandom
import java.util.UUID

/** Wire identifiers of the simulated watch: the same FE86/FE01/FE02 the real protocol uses (§0, §3.1). */
internal object HuaweiSimUuids {
    val SERVICE: UUID = sigUuid(0xFE86)
    val WRITE: UUID = sigUuid(0xFE01)
    val NOTIFY: UUID = sigUuid(0xFE02)

    val WRITE_CHAR = GattCharacteristic(SERVICE, WRITE, GattCharacteristic.PROPERTY_WRITE)
    val NOTIFY_CHAR = GattCharacteristic(SERVICE, NOTIFY, GattCharacteristic.PROPERTY_NOTIFY)
    val MODEL_CHAR = GattCharacteristic(StandardUuids.DEVICE_INFORMATION_SERVICE, StandardUuids.MODEL_NUMBER, GattCharacteristic.PROPERTY_READ)
    val FIRMWARE_CHAR = GattCharacteristic(StandardUuids.DEVICE_INFORMATION_SERVICE, StandardUuids.FIRMWARE_REVISION, GattCharacteristic.PROPERTY_READ)
    val SERIAL_CHAR = GattCharacteristic(StandardUuids.DEVICE_INFORMATION_SERVICE, StandardUuids.SERIAL_NUMBER, GattCharacteristic.PROPERTY_READ)
    val BATTERY_CHAR = GattCharacteristic(StandardUuids.BATTERY_SERVICE, StandardUuids.BATTERY_LEVEL, GattCharacteristic.PROPERTY_READ)
}

/**
 * In-memory GATT link of the simulated Huawei watch. Speaks just enough of
 * `docs/protocols/HUAWEI_DEVICE_PROTOCOL.md` for the real `:driver:huawei` transport to complete a
 * full handshake and sync sweep against it: 0x0101 link negotiation, the debug-only 0x0113
 * challenge/work-key exchange ([com.unified.health.driver.huawei.auth.debug.HuaweiSimulatorAuthenticator]),
 * 0x0105 time sync and the service-7 probes `HuaweiSession.sync()` fires (cmd 3/4/10/12). Every
 * reply body is an arbitrary filler TLV: the REAL response layouts are undocumented (protocol doc
 * §7.2/§10), so there is nothing authentic to simulate there, and the driver does not decode them
 * either (see `HuaweiSession.sync` KDoc) — only the transport-level conversation is real.
 *
 * Also exposes the standard Device Information (0x180A) and Battery (0x180F) services so
 * `StandardGattReader` (used by every driver, including Huawei's `readDeviceInfo`) returns real
 * values.
 */
internal class HuaweiVirtualGattClient(override val address: String) : GattClient {

    private val _connected = MutableStateFlow(true)
    override val connected: StateFlow<Boolean> = _connected.asStateFlow()

    override var mtu: Int = GattClient.DEFAULT_MTU
        private set

    private val subscriptions = mutableMapOf<GattCharacteristic, Channel<ByteArray>>()
    private val characteristics = listOf(
        HuaweiSimUuids.WRITE_CHAR, HuaweiSimUuids.NOTIFY_CHAR,
        HuaweiSimUuids.MODEL_CHAR, HuaweiSimUuids.FIRMWARE_CHAR, HuaweiSimUuids.SERIAL_CHAR, HuaweiSimUuids.BATTERY_CHAR,
    )
    private val reassembler = ByteStreamReassembler()
    private val random = SecureRandom()

    override fun hasService(service: UUID): Boolean = characteristics.any { it.service == service }

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
        return when (characteristic.uuid) {
            StandardUuids.MODEL_NUMBER -> HuaweiVirtualDevice.MODEL.toByteArray()
            StandardUuids.FIRMWARE_REVISION -> HuaweiVirtualDevice.FIRMWARE.toByteArray()
            StandardUuids.SERIAL_NUMBER -> HuaweiVirtualDevice.SERIAL.toByteArray()
            StandardUuids.BATTERY_LEVEL -> byteArrayOf(HuaweiVirtualDevice.BATTERY_PERCENT.toByte())
            else -> throw GattException("Characteristic ${characteristic.uuid} is not readable")
        }
    }

    override suspend fun write(characteristic: GattCharacteristic, value: ByteArray, type: WriteType) {
        ensureConnected()
        if (characteristic.uuid != HuaweiSimUuids.WRITE) return
        for (frame in reassembler.feed(value)) onFrame(frame)
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

    private fun onFrame(frame: ByteArray) {
        val payload = HuaweiWireCodec.unwrapSingleFrame(frame) ?: run {
            Log.w(TAG, "Dropped a frame the simulator cannot reassemble (sliced or corrupt)")
            return
        }
        if (payload.size < 2) return
        val serviceId = payload[0].toInt() and 0xFF
        val commandId = payload[1].toInt() and 0xFF
        val tag = "%02X%02X".format(serviceId, commandId)
        // Decrypting validates the envelope round-trips with the real PayloadCipher even though the
        // (undocumented, so arbitrary) TLV content below is never inspected.
        runCatching { HuaweiSimCipher.decryptIfNeeded(payload) }
            .onFailure { Log.w(TAG, "Could not decrypt $tag (key/IV mismatch?)", it) }
        val reply = try {
            when (tag) {
                LINK_NEGOTIATION_TAG -> linkNegotiationReply()
                SIMULATOR_AUTH_TAG -> authReply()
                TIME_SYNC_TAG, TODAY_TOTAL_TAG, HEALTH_FRAME_COUNT_TAG, SAMPLE_FRAME_COUNT_TAG, STATUS_FRAME_COUNT_TAG ->
                    encryptedFiller(serviceId, commandId)
                else -> null
            }
        } catch (e: Exception) {
            Log.w(TAG, "Simulator failed to answer $tag", e)
            null
        }
        reply?.let(::sendFrame)
    }

    /** 0x0101: frame sizes generous enough that the driver never needs to slice, legacy-HMAC bucket, the simulator marker. */
    private fun linkNegotiationReply(): ByteArray {
        val randA = ByteArray(16).also(random::nextBytes)
        val authField = byteArrayOf(0x00, 0x01) + randA // 2-byte authVersion + 16-byte randA = 18 bytes
        val tlvs = listOf(
            HuaweiSimTlv(2, HuaweiWireCodec.u16(FRAME_SIZE)),
            HuaweiSimTlv(3, HuaweiWireCodec.u16(FRAME_SIZE)),
            HuaweiSimTlv(4, HuaweiWireCodec.u16(0)),
            HuaweiSimTlv(5, authField),
            HuaweiSimTlv(7, byteArrayOf(SIMULATOR_AUTH_TYPE.toByte())),
            HuaweiSimTlv(12, byteArrayOf(0)), // AES-CBC, not GCM
            HuaweiSimTlv(SIMULATOR_MARKER_TAG, SIMULATOR_MARKER_VALUE),
        )
        return byteArrayOf(0x01, 0x01) + HuaweiSimTlvCodec.encode(tlvs)
    }

    /** 0x0113: clear reply handing back the fixed test work key, see [HuaweiSimCipher]/`HuaweiSimulatorAuthenticator`. */
    private fun authReply(): ByteArray =
        byteArrayOf(0x01, 0x13) + HuaweiSimTlvCodec.encode(listOf(HuaweiSimTlv(1, HuaweiWireCodec.TEST_WORK_KEY)))

    /** Encrypted ack with a small filler TLV: the real response body is undocumented, see class doc. */
    private fun encryptedFiller(serviceId: Int, commandId: Int): ByteArray {
        val clearTail = HuaweiSimTlvCodec.encode(listOf(HuaweiSimTlv(1, byteArrayOf(1, 2, 3, 4))))
        return HuaweiSimCipher.encrypt(byteArrayOf(serviceId.toByte(), commandId.toByte()), clearTail, random)
    }

    /** Wraps [payload] (service+command+TLVs) in a single 0x5A frame and chunks it onto the notify channel. */
    private fun sendFrame(payload: ByteArray) {
        val frame = HuaweiWireCodec.wrapFrame(payload)
        val channel = synchronized(subscriptions) { subscriptions[HuaweiSimUuids.NOTIFY_CHAR] } ?: return
        val unit = maxWriteLength.coerceAtLeast(1)
        var offset = 0
        while (offset < frame.size) {
            val end = minOf(offset + unit, frame.size)
            channel.trySend(frame.copyOfRange(offset, end))
            offset = end
        }
    }

    private companion object {
        const val TAG = "HuaweiVirtualGatt"
        const val MAX_MTU = 247
        const val FRAME_SIZE = 200

        /** Any value `HuaweiAuthMode.candidatesFor` does not special-case falls into the legacy-HMAC bucket. */
        const val SIMULATOR_AUTH_TYPE = 99
        const val SIMULATOR_MARKER_TAG = 0x11
        val SIMULATOR_MARKER_VALUE = "UHSIM".toByteArray(Charsets.US_ASCII)

        const val LINK_NEGOTIATION_TAG = "0101"
        const val SIMULATOR_AUTH_TAG = "0113"
        const val TIME_SYNC_TAG = "0105"
        const val TODAY_TOTAL_TAG = "0703"
        const val HEALTH_FRAME_COUNT_TAG = "0704"
        const val SAMPLE_FRAME_COUNT_TAG = "070A"
        const val STATUS_FRAME_COUNT_TAG = "070C"
    }
}

/**
 * Glues raw GATT write chunks back into complete 0x5A frames (the "one notification may carry part
 * of, or several, frames" layer of §4.2) — a byte stream, not the 0x5A slice-flag layer, which this
 * simulator does not need (see [HuaweiWireCodec] class doc). Not thread-safe; fed from one coroutine.
 */
private class ByteStreamReassembler {
    private var buffer = ByteArray(0)

    fun feed(chunk: ByteArray): List<ByteArray> {
        buffer += chunk
        val frames = mutableListOf<ByteArray>()
        while (buffer.size >= 3 && (buffer[0].toInt() and 0xFF) == HuaweiWireCodec.MAGIC) {
            val length = ((buffer[1].toInt() and 0xFF) shl 8) or (buffer[2].toInt() and 0xFF)
            val total = length + 5
            if (buffer.size < total) break
            frames += buffer.copyOf(total)
            buffer = buffer.copyOfRange(total, buffer.size)
        }
        return frames
    }
}
