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
 * `docs/protocols/HUAWEI_DEVICE_PROTOCOL.md` for the real `:driver:huawei` transport to complete the
 * `authenticVersion == 0` path end to end: 0x0101 link negotiation (authVersion 0, no app auth,
 * clear text), then 0x0107 version (§11.1 TLVs), 0x0105 time, 0x0102/0x0103 capability consult
 * (§11.3-11.4), 0x0137/0x013C/0x0132/0x0112 optional steps, the 0x0108 battery query, one
 * watch-initiated message (§11.5), the service 7 probes `HuaweiSession.sync()` fires (cmd 3/4/10/12)
 * and the service 23 cmd 18 live-HR report with cmd 3 notifications (§11.8).
 *
 * With [authVersion] != 0 this same link reports a modern watch's link parameters (authType 2,
 * HiChainLite) and stops after 0x0101, which is all the driver needs to fail fast with a clear
 * "app-level authentication required" error. No authentication or payload encryption is simulated:
 * the no-auth branch has no work key, and the auth-required branch never gets past negotiation.
 *
 * Service-7 reply bodies are arbitrary filler: their REAL layouts are undocumented (§11.6,
 * NEEDS-REAL-WATCH) and the driver does not decode them.
 *
 * Also exposes the standard Device Information (0x180A) and Battery (0x180F) services so
 * `StandardGattReader` (used by every driver, including Huawei's `readDeviceInfo`) returns real
 * values.
 */
internal class HuaweiVirtualGattClient(
    override val address: String,
    private val authVersion: Int = HuaweiVirtualDevice.AUTH_VERSION,
    private val authType: Int = HuaweiVirtualDevice.AUTH_TYPE,
) : GattClient {

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
            // Deliberately different from the 0x0107 values: the E2E then proves the driver prefers 0x0107.
            StandardUuids.MODEL_NUMBER -> GATT_FALLBACK_MODEL.toByteArray()
            StandardUuids.FIRMWARE_REVISION -> GATT_FALLBACK_FIRMWARE.toByteArray()
            StandardUuids.SERIAL_NUMBER -> HuaweiVirtualDevice.SERIAL.toByteArray()
            StandardUuids.BATTERY_LEVEL -> byteArrayOf(GATT_FALLBACK_BATTERY.toByte())
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
        val reply = try {
            when (tag) {
                LINK_NEGOTIATION_TAG -> linkNegotiationReply()
                DEVICE_VERSION_TAG -> reply(serviceId, commandId, deviceVersionTlvs())
                SERVICE_CAPABILITY_TAG -> reply(serviceId, commandId, listOf(HuaweiSimTlv(1, byteArrayOf(1, 1, 1)))) // services 1, 7 and 23
                TIME_SYNC_TAG, TIME_ZONE_TAG -> reply(serviceId, commandId, listOf(successTlv()))
                COMMAND_CAPABILITY_TAG -> reply(serviceId, commandId, commandSupportTlvs())
                EXPAND_CAPABILITY_TAG -> reply(serviceId, commandId, expandCapabilityTlvs())
                DUAL_CHANNEL_TAG, ACTIVITY_TYPE_TAG -> reply(serviceId, commandId, listOf(successTlv()))
                BATTERY_TAG -> reply(serviceId, commandId, listOf(HuaweiSimTlv(1, byteArrayOf(HuaweiVirtualDevice.BATTERY_PERCENT.toByte()))))
                LIVE_HR_REPORT_TAG -> reply(serviceId, commandId, listOf(successTlv()))
                TODAY_TOTAL_TAG, HEALTH_FRAME_COUNT_TAG, SAMPLE_FRAME_COUNT_TAG, STATUS_FRAME_COUNT_TAG ->
                    reply(serviceId, commandId, listOf(HuaweiSimTlv(1, byteArrayOf(1, 2, 3, 4))))
                else -> null
            }
        } catch (e: Exception) {
            Log.w(TAG, "Simulator failed to answer $tag", e)
            null
        }
        reply?.let(::sendFrame)
        if (tag == LIVE_HR_REPORT_TAG && reportOpened(payload)) {
            LIVE_HR_SAMPLES.forEach { bpm -> sendFrame(liveHeartRateNotice(bpm)) }
        }
        // After the last handshake step, push one watch-initiated message so the driver's
        // dispatcher path runs too (an arbitrary filler body: real unsolicited layouts are unknown).
        if (tag == ACTIVITY_TYPE_TAG) sendFrame(filler(SERVICE_DEVICE_CONFIG, UNSOLICITED_COMMAND))
    }

    /** 0x0107 reply TLVs (§11.1): firmware (1), hardware (2), serial (9), name (12), model (20), BT mode (22). */
    private fun deviceVersionTlvs(): List<HuaweiSimTlv> = listOf(
        HuaweiSimTlv(1, HuaweiVirtualDevice.FIRMWARE.toByteArray()),
        HuaweiSimTlv(2, "HW-UHSIM-1".toByteArray()),
        HuaweiSimTlv(9, HuaweiVirtualDevice.SERIAL.toByteArray()),
        HuaweiSimTlv(12, HuaweiVirtualDevice.NAME.toByteArray()),
        HuaweiSimTlv(20, HuaweiVirtualDevice.MODEL.toByteArray()),
        HuaweiSimTlv(22, "BLE".toByteArray()),
    )

    /**
     * 0x0103 reply: one nested father per service, child TLV 2 = serviceId, child TLV 4 = one
     * support byte per command the driver announced. The driver announces 9 commands for service 1
     * (link negotiation, capability consult ×2, time, version, time zone, battery, expand
     * capability, activity type), 4 for service 7 and 1 for service 23.
     */
    private fun commandSupportTlvs(): List<HuaweiSimTlv> {
        fun group(service: Int, commandCount: Int) = HuaweiSimTlv(
            0x81,
            HuaweiSimTlvCodec.encode(
                listOf(
                    HuaweiSimTlv(2, byteArrayOf(service.toByte())),
                    HuaweiSimTlv(4, ByteArray(commandCount) { 1 }),
                ),
            ),
        )
        return listOf(group(SERVICE_DEVICE_CONFIG, 9), group(SERVICE_FITNESS, 4), group(SERVICE_WORKOUT, 1))
    }

    /**
     * 0x0137 reply: child TLV 1 = ASCII hex expand-capability bitmap with only bit 56 set (dual
     * socket, no extend socket), so the driver follows with 0x013C TLVs 1/2 [V] `ckj`, `ckk`, `cqd`.
     */
    private fun expandCapabilityTlvs(): List<HuaweiSimTlv> {
        val bitmap = ByteArray(8).also { it[7] = 1 } // bit 56 = byte 7, bit 0
        val hex = bitmap.joinToString("") { "%02x".format(it) }.toByteArray(Charsets.US_ASCII)
        return listOf(HuaweiSimTlv(0x81, HuaweiSimTlvCodec.encode(listOf(HuaweiSimTlv(1, hex)))))
    }

    /** TLV 0x7F carrying the app's success status 100000 (`HuaweiCommand.SUCCESS_CODE`). */
    private fun successTlv() = HuaweiSimTlv(0x7F, byteArrayOf(0x00, 0x01, 0x86.toByte(), 0xA0.toByte()))

    /** Clear-text reply: the no-auth branch has no work key, so nothing is encrypted. */
    private fun reply(serviceId: Int, commandId: Int, tlvs: List<HuaweiSimTlv>): ByteArray =
        byteArrayOf(serviceId.toByte(), commandId.toByte()) + HuaweiSimTlvCodec.encode(tlvs)

    /** 0x0101: frame sizes generous enough that the driver never needs to slice, plus the auth fields. */
    private fun linkNegotiationReply(): ByteArray {
        val randA = ByteArray(16).also(random::nextBytes)
        val authField = byteArrayOf((authVersion ushr 8).toByte(), authVersion.toByte()) + randA
        val tlvs = listOf(
            HuaweiSimTlv(2, HuaweiWireCodec.u16(FRAME_SIZE)),
            HuaweiSimTlv(3, HuaweiWireCodec.u16(FRAME_SIZE)),
            HuaweiSimTlv(4, HuaweiWireCodec.u16(0)),
            HuaweiSimTlv(5, authField),
            HuaweiSimTlv(7, byteArrayOf(authType.toByte())),
            HuaweiSimTlv(12, byteArrayOf(0)), // AES-CBC, not GCM
        )
        return byteArrayOf(0x01, 0x01) + HuaweiSimTlvCodec.encode(tlvs)
    }

    /** True when service 23 cmd 18 requested operator 1 (open). */
    private fun reportOpened(payload: ByteArray): Boolean {
        val operator = runCatching { HuaweiSimTlvCodec.decode(payload, 2).findTag(1)?.value?.firstOrNull() }.getOrNull() ?: return false
        return (operator.toInt() and 0xFF) == 1
    }

    /**
     * Service 23 cmd 3 notification shaped as in the app's reader [V]
     * `HwHeartRateManager.configHeartRateNotice`: nested sections, leaf TLV 3 = bpm, TLV 4 = epoch
     * seconds, TLV 5 = credibility.
     */
    private fun liveHeartRateNotice(bpm: Int): ByteArray {
        val now = (System.currentTimeMillis() / 1000).toInt()
        val time = byteArrayOf((now ushr 24).toByte(), (now ushr 16).toByte(), (now ushr 8).toByte(), now.toByte())
        val section = HuaweiSimTlv(
            0x81,
            HuaweiSimTlvCodec.encode(
                listOf(
                    HuaweiSimTlv(
                        0x82,
                        HuaweiSimTlvCodec.encode(
                            listOf(
                                HuaweiSimTlv(3, byteArrayOf(bpm.toByte())),
                                HuaweiSimTlv(4, time),
                                HuaweiSimTlv(5, byteArrayOf(100.toByte())),
                            ),
                        ),
                    ),
                ),
            ),
        )
        return byteArrayOf(SERVICE_WORKOUT.toByte(), LIVE_HR_NOTICE.toByte()) + HuaweiSimTlvCodec.encode(listOf(section))
    }

    /** An unsolicited filler message (real unsolicited layouts are unknown). */
    private fun filler(serviceId: Int, commandId: Int): ByteArray =
        reply(serviceId, commandId, listOf(HuaweiSimTlv(1, byteArrayOf(1, 2, 3, 4))))

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

        const val LINK_NEGOTIATION_TAG = "0101"
        const val TIME_SYNC_TAG = "0105"
        const val DEVICE_VERSION_TAG = "0107"
        const val TIME_ZONE_TAG = "0132"
        const val SERVICE_CAPABILITY_TAG = "0102"
        const val COMMAND_CAPABILITY_TAG = "0103"
        const val BATTERY_TAG = "0108"
        const val ACTIVITY_TYPE_TAG = "0112"
        const val EXPAND_CAPABILITY_TAG = "0137"
        const val DUAL_CHANNEL_TAG = "013C"
        const val LIVE_HR_REPORT_TAG = "1712"

        const val SERVICE_DEVICE_CONFIG = 0x01
        const val SERVICE_FITNESS = 0x07
        const val SERVICE_WORKOUT = 23
        const val LIVE_HR_NOTICE = 3
        const val UNSOLICITED_COMMAND = 0x08

        /** Two samples emitted for each open report; enough to exercise the typed live-HR path. */
        val LIVE_HR_SAMPLES = listOf(72, 74)

        const val GATT_FALLBACK_MODEL = "gatt-fallback-model"
        const val GATT_FALLBACK_FIRMWARE = "gatt-fallback-fw"
        const val GATT_FALLBACK_BATTERY = 50
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
