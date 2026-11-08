package com.unified.health.core.demo.virtual

import android.util.Log
import com.unified.health.core.ble.gatt.ConnectionPriority
import com.unified.health.core.ble.gatt.GattCharacteristic
import com.unified.health.core.ble.gatt.GattCharacteristic.Companion.PROPERTY_NOTIFY
import com.unified.health.core.ble.gatt.GattCharacteristic.Companion.PROPERTY_READ
import com.unified.health.core.ble.gatt.GattCharacteristic.Companion.PROPERTY_WRITE
import com.unified.health.core.ble.gatt.GattClient
import com.unified.health.core.ble.gatt.GattDisconnectedException
import com.unified.health.core.ble.gatt.GattException
import com.unified.health.core.ble.gatt.StandardUuids
import com.unified.health.core.ble.gatt.WriteType
import com.unified.health.core.ble.protocol.buildBytes
import com.unified.health.core.ble.scan.Advertisement
import com.unified.health.core.ble.virtual.VirtualDevice
import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withTimeoutOrNull
import java.time.Instant
import java.util.UUID
import java.util.concurrent.ConcurrentHashMap

/**
 * Public identity of the simulated watch: the handful of facts `GarminWatchE2ETest` (in `:app`'s
 * androidTest, a different Gradle module) asserts against. Everything protocol-shaped stays in the
 * `internal` [GarminWatchProtocol] below.
 */
object GarminVirtualWatchIdentity {
    const val ADDRESS = "02:DE:30:00:00:02"
    const val NAME = "Forerunner 965"
    const val FIRMWARE = "15.20"
    const val BATTERY_PERCENT = 76
}

/**
 * Wire identifiers the simulated watch advertises/exposes, taken from
 * `docs/protocols/GARMIN_DEVICE_PROTOCOL.md` §2.4/§3.1 — the same values as `driver/garmin`'s
 * `GarminUuids`, restated here because that object is `internal` to a different Gradle module.
 */
internal object GarminWatchProtocol {
    private const val GARMIN_BASE_SUFFIX = "-667b-11e3-949a-0800200c9a66"
    private fun garminUuid(shortId: Int): UUID = UUID.fromString("6a4e%04x%s".format(shortId, GARMIN_BASE_SUFFIX))

    /** Dedicated GFDI service (not Multi-Link): simpler to simulate and already the branch the real
     * driver prefers when both are offered (§2.4). Multi-Link is covered by `driver/garmin`'s own
     * JVM tests (`GarminSessionTest` + `FakeGarminWatch`), see D-401. */
    val GFDI_SERVICE: UUID = garminUuid(0x2401)
    val GFDI_READ: UUID = garminUuid(0xCD28)
    val GFDI_WRITE: UUID = garminUuid(0x4C80)

    val REALTIME_SERVICE: UUID = garminUuid(0x2500)
    val REALTIME_HEART_RATE: UUID = garminUuid(0x2501)

    const val GARMIN_COMPANY_ID = 0x0087

    /** `Forerunner 965` product number, per Garmin's public device file list (not protocol-sensitive). */
    const val PRODUCT_NUMBER = 4216

    const val ADDRESS = GarminVirtualWatchIdentity.ADDRESS
    const val NAME = GarminVirtualWatchIdentity.NAME
    const val UNIT_ID = 1_234_567_890L
    const val BATTERY_PERCENT = GarminVirtualWatchIdentity.BATTERY_PERCENT

    fun advertisement() = Advertisement(
        address = ADDRESS,
        name = NAME,
        rssi = -52,
        serviceUuids = setOf(GFDI_SERVICE),
        manufacturerData = mapOf(GARMIN_COMPANY_ID to byteArrayOf((PRODUCT_NUMBER ushr 8).toByte(), PRODUCT_NUMBER.toByte())),
    )

    val GFDI_READ_CHAR = GattCharacteristic(GFDI_SERVICE, GFDI_READ, PROPERTY_NOTIFY)
    val GFDI_WRITE_CHAR = GattCharacteristic(GFDI_SERVICE, GFDI_WRITE, PROPERTY_WRITE)
    val REALTIME_HR_CHAR = GattCharacteristic(REALTIME_SERVICE, REALTIME_HEART_RATE, PROPERTY_NOTIFY)
    val BATTERY_CHAR = GattCharacteristic(StandardUuids.BATTERY_SERVICE, StandardUuids.BATTERY_LEVEL, PROPERTY_READ)
}

/**
 * The simulated Garmin watch as seen by `:core:ble`'s virtual-device scanner/connector: advertises
 * like a real Garmin (manufacturer id 0x0087 + product number, §2.1) and hands out an in-memory
 * [GattClient] that speaks real GFDI, so pairing it exercises `GarminDriver`/`GarminSession`
 * unmodified — the same scan → recognize → session → sync → Room pipeline a physical watch would.
 */
class GarminVirtualDevice : VirtualDevice {
    override val advertisement: Advertisement = GarminWatchProtocol.advertisement()
    override suspend fun connect(): GattClient = GarminVirtualGattClient(GarminWatchProtocol.ADDRESS)
}

/** In-memory GATT link of the simulated watch. */
internal class GarminVirtualGattClient(override val address: String) : GattClient {

    private val _connected = MutableStateFlow(true)
    override val connected: StateFlow<Boolean> = _connected.asStateFlow()

    override var mtu: Int = GattClient.DEFAULT_MTU
        private set

    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.Default)
    private val gfdiNotify = Channel<ByteArray>(Channel.UNLIMITED)
    private val heartRateNotify = Channel<ByteArray>(Channel.UNLIMITED)
    private var link: GarminWatchLink? = null
    private var heartRateJob: Job? = null

    private val characteristics = listOf(
        GarminWatchProtocol.GFDI_READ_CHAR,
        GarminWatchProtocol.GFDI_WRITE_CHAR,
        GarminWatchProtocol.REALTIME_HR_CHAR,
        GarminWatchProtocol.BATTERY_CHAR,
    )

    override fun hasService(service: UUID): Boolean =
        service == GarminWatchProtocol.GFDI_SERVICE || service == GarminWatchProtocol.REALTIME_SERVICE || service == StandardUuids.BATTERY_SERVICE

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
        if (characteristic.uuid == StandardUuids.BATTERY_LEVEL) return byteArrayOf(GarminWatchProtocol.BATTERY_PERCENT.toByte())
        throw GattException("Characteristic ${characteristic.uuid} is not readable")
    }

    override suspend fun write(characteristic: GattCharacteristic, value: ByteArray, type: WriteType) {
        ensureConnected()
        if (characteristic.uuid == GarminWatchProtocol.GFDI_WRITE) link?.onHostWrite(value)
    }

    override suspend fun subscribe(characteristic: GattCharacteristic): ReceiveChannel<ByteArray> {
        ensureConnected()
        return when (characteristic.uuid) {
            GarminWatchProtocol.GFDI_READ -> {
                if (link == null) {
                    val newLink = GarminWatchLink(scope, gfdiNotify)
                    link = newLink
                    scope.launch { newLink.run() }
                }
                gfdiNotify
            }
            GarminWatchProtocol.REALTIME_HEART_RATE -> {
                heartRateJob?.cancel()
                heartRateJob = scope.launch { streamHeartRate() }
                heartRateNotify
            }
            else -> throw GattException("Characteristic ${characteristic.uuid} does not notify")
        }
    }

    override suspend fun unsubscribe(characteristic: GattCharacteristic) {
        if (characteristic.uuid == GarminWatchProtocol.REALTIME_HEART_RATE) {
            heartRateJob?.cancel()
            heartRateJob = null
        }
    }

    override suspend fun close() {
        _connected.value = false
        scope.cancel()
        gfdiNotify.close()
        heartRateNotify.close()
    }

    private fun ensureConnected() {
        if (!_connected.value) throw GattDisconnectedException()
    }

    /** Realtime HEART_RATE payload (§6.2.1): `source | bpm | resting | low | high`, `0xFF` = unknown. */
    private suspend fun streamHeartRate() {
        var bpm = 118
        while (true) {
            bpm = (bpm + HR_STEP.random()).coerceIn(HR_MIN, HR_MAX)
            heartRateNotify.trySend(byteArrayOf(OHR_LOCKED, bpm.toByte(), RESTING_HR.toByte(), HR_MIN.toByte(), HR_MAX.toByte()))
            delay(HR_INTERVAL_MS)
        }
    }

    private companion object {
        const val MAX_MTU = 517
        const val HR_INTERVAL_MS = 1_000L
        const val HR_MIN = 95
        const val HR_MAX = 150
        const val RESTING_HR = 52
        const val OHR_LOCKED: Byte = 3
        val HR_STEP = listOf(-3, -2, -1, 0, 1, 2, 3)
    }
}

/**
 * Plays the watch side of the GFDI handshake and history sync (§3.4, §4.C, §6.1) against the real
 * `GarminDriver`/`GarminSession`, so pairing this simulated device exercises production protocol
 * code end to end: handshake (5024/5050/5052/5030), one directory + two FIT file downloads
 * (5002/5004), answering every other inbound message with an ACK so the real session never retries
 * into a disconnect (§8.B.5).
 */
internal class GarminWatchLink(
    private val scope: CoroutineScope,
    private val toHost: Channel<ByteArray>,
) {
    private val inbox = Channel<ByteArray>(Channel.UNLIMITED)
    private val accumulator = GarminWire.FrameAccumulator()
    private val pendingAcks = ConcurrentHashMap<Int, CompletableDeferred<GarminWire.Ack>>()
    private val files = GarminSimulatedFiles.build(Instant.now())

    fun onHostWrite(chunk: ByteArray) {
        for (frame in accumulator.feed(chunk)) inbox.trySend(frame)
    }

    suspend fun run() {
        scope.launch { handshake() }
        for (frame in inbox) {
            val decoded = runCatching { GarminWire.cobsDecode(frame) }.getOrNull() ?: continue
            val message = GarminWire.decodeMessage(decoded) ?: continue
            if (message.id == GarminWire.ACK_ID) {
                val ack = GarminWire.decodeAck(message.payload) ?: continue
                pendingAcks.remove(ack.originalId)?.complete(ack)
            } else {
                answer(message)
            }
        }
    }

    /** Watch-initiated steps (§4.C): device info, our capability bitmask, then a time request. */
    private suspend fun handshake() {
        delay(SETTLE_MS)
        request(MSG_DEVICE_INFORMATION, encodeDeviceInformation())
        request(MSG_CONFIGURATION, byteArrayOf(1, 0)) // len=1, bitmask=0x00: advertise nothing we cannot serve
        request(MSG_CURRENT_TIME_REQUEST, byteArrayOf(1, 2, 3, 4))
    }

    /** Answers one host-initiated message the way a real watch would (§8.B.5: never leave one un-ACKed). */
    private suspend fun answer(message: GarminWire.Message) {
        when (message.id) {
            MSG_CONFIGURATION, MSG_SYSTEM_EVENT, MSG_SET_DEVICE_SETTINGS -> ack(message.id, GarminWire.STATUS_OK)
            MSG_DOWNLOAD_REQUEST -> answerDownloadRequest(message.payload)
            else -> {
                Log.d(TAG, "Unsupported inbound message ${message.id}")
                ack(message.id, GarminWire.STATUS_UNSUPPORTED)
            }
        }
    }

    /**
     * 5002 (§6.1): `u16 fileIndex | ...`; ACK with `status | fileSize`, then push 5004 chunks.
     *
     * [streamFile] is launched on [scope] rather than awaited here: it sends 5004 chunks and waits
     * for the host's ACK of each one via [request], which resolves only when [run]'s loop reads that
     * ACK frame from [inbox]. Awaiting it inline would block that very loop on itself (the only
     * consumer of [inbox]) — a self-deadlock, exactly what `afterAck` in `GfdiDispatcher.answer()`
     * (`driver/garmin`) avoids by also running follow-ups via `scope.launch`.
     */
    private suspend fun answerDownloadRequest(payload: ByteArray) {
        val fileIndex = (payload[0].toInt() and 0xFF) or ((payload[1].toInt() and 0xFF) shl 8)
        val file = files[fileIndex]
        if (file == null) {
            ack(MSG_DOWNLOAD_REQUEST, GarminWire.STATUS_NOT_FOUND)
            return
        }
        ack(MSG_DOWNLOAD_REQUEST, GarminWire.STATUS_OK, buildBytes(5) { u8(0); u32le(file.size.toLong()) })
        scope.launch { streamFile(file) }
    }

    /** 5004 (§6.1): `flags u8 | crc u16 (running) | offset u32 | data`, one chunk per ACK received. */
    private suspend fun streamFile(bytes: ByteArray) {
        var offset = 0
        var crc = 0
        while (offset < bytes.size) {
            val end = minOf(offset + FILE_CHUNK_SIZE, bytes.size)
            val chunk = bytes.copyOfRange(offset, end)
            crc = GarminWire.crc16(chunk, seed = crc)
            val payload = buildBytes(7 + chunk.size) {
                u8(0)
                u16le(crc)
                u32le(offset.toLong())
                bytes(chunk)
            }
            val result = request(MSG_FILE_DATA, payload)
            if (result == null || result.status != GarminWire.STATUS_OK) {
                Log.w(TAG, "File data chunk at offset $offset not accepted; aborting this file")
                return
            }
            offset = end
        }
    }

    private suspend fun ack(originalId: Int, status: Int, data: ByteArray = ByteArray(0)) {
        send(GarminWire.encodeMessage(GarminWire.ACK_ID, GarminWire.encodeAck(originalId, status, data)))
    }

    /** Sends [id]/[payload] as our own request and waits for the host's ACK (or times out). */
    private suspend fun request(id: Int, payload: ByteArray): GarminWire.Ack? {
        val waiter = CompletableDeferred<GarminWire.Ack>()
        pendingAcks[id] = waiter
        send(GarminWire.encodeMessage(id, payload))
        val ack = withTimeoutOrNull(REQUEST_TIMEOUT_MS) { waiter.await() }
        pendingAcks.remove(id, waiter)
        return ack
    }

    private suspend fun send(message: ByteArray) {
        toHost.trySend(GarminWire.cobsFrame(message))
    }

    /** 5024 Device Information (§4.10). Optional dual-BT trailer omitted; the driver does not need it. */
    private fun encodeDeviceInformation(): ByteArray = buildBytes(64) {
        u16le(113) // protocol version; the host always answers 113 or 150, irrelevant to us
        u16le(GarminWatchProtocol.PRODUCT_NUMBER)
        u32le(GarminWatchProtocol.UNIT_ID)
        u16le(1520) // software version x100 -> "15.20"
        u16le(FILE_CHUNK_SIZE * 4) // maxPacketSize the host may use for its own messages
        string8(GarminWatchProtocol.NAME)
        string8(GarminWatchProtocol.NAME)
        string8(GarminWatchProtocol.NAME)
    }

    private companion object {
        const val TAG = "GarminVirtualWatch"

        const val MSG_DOWNLOAD_REQUEST = 5002
        const val MSG_FILE_DATA = 5004
        const val MSG_SYSTEM_EVENT = 5030
        const val MSG_DEVICE_INFORMATION = 5024
        const val MSG_CONFIGURATION = 5050
        const val MSG_CURRENT_TIME_REQUEST = 5052

        /** 5026 Set Device Settings: the driver's time-sync path when capability bit 71 is clear (our 5050 is empty). */
        const val MSG_SET_DEVICE_SETTINGS = 5026

        const val SETTLE_MS = 200L
        const val REQUEST_TIMEOUT_MS = 10_000L
        const val FILE_CHUNK_SIZE = 180
    }
}
