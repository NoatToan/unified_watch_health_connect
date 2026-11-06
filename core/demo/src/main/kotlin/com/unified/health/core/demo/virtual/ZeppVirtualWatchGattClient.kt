package com.unified.health.core.demo.virtual

import com.unified.health.core.ble.gatt.ConnectionPriority
import com.unified.health.core.ble.gatt.GattCharacteristic
import com.unified.health.core.ble.gatt.GattClient
import com.unified.health.core.ble.gatt.GattDisconnectedException
import com.unified.health.core.ble.gatt.GattException
import com.unified.health.core.ble.gatt.WriteType
import com.unified.health.core.ble.protocol.buildBytes
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
import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneOffset
import java.util.UUID
import java.util.zip.CRC32
import javax.crypto.Cipher
import javax.crypto.spec.SecretKeySpec
import kotlin.random.Random

/** One GDSP history block pre-seeded for a type code (§6.1); consumed by the first header request for that type. */
internal class GdspBlock(val count: Long, val start: Instant, val payload: ByteArray)

/**
 * In-memory watch side of the legacy Huami auth (§5.5) + GDSP history (§6.1) + standard Heart Rate
 * (§3.1) protocols. Independent of `:driver:zepp`'s internal codec (different Gradle module, and
 * its codec classes are `internal`): this re-derives the small amount of wire format it needs
 * (AES-128/ECB, CRC32, the GDSP header/data layout) directly from the protocol document, the same
 * way the driver does, so this is a second, from-scratch implementation that exercises the real
 * driver code rather than a shared fixture.
 */
internal class ZeppVirtualWatchGattClient(
    override val address: String,
    /** Survives this link: the bound key lives on the watch, not on the connection (§5.5). */
    private val storage: ZeppVirtualWatchStorage = ZeppVirtualWatchStorage(),
    private val random: Random = Random(SEED),
) : GattClient {

    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.Default)
    private val _connected = MutableStateFlow(true)
    override val connected: StateFlow<Boolean> = _connected.asStateFlow()

    override var mtu: Int = GattClient.DEFAULT_MTU
        private set

    private val subscriptions = mutableMapOf<GattCharacteristic, Channel<ByteArray>>()
    private val readValues = mapOf(
        ZeppVirtualCharacteristics.modelNumber to ZeppVirtualWatchIdentity.MODEL.toByteArray(Charsets.UTF_8),
        ZeppVirtualCharacteristics.serialNumber to ZeppVirtualWatchIdentity.SERIAL.toByteArray(Charsets.UTF_8),
        ZeppVirtualCharacteristics.firmwareRevision to ZeppVirtualWatchIdentity.FIRMWARE.toByteArray(Charsets.UTF_8),
        ZeppVirtualCharacteristics.batteryLevel to byteArrayOf(ZeppVirtualWatchIdentity.BATTERY_PERCENT.toByte()),
    )

    private var challenge: ByteArray? = null
    private var hrJob: Job? = null

    /** One pre-seeded block per GDSP type code, consumed by the first header request for that type. */
    private val gdspBlocks = DemoGdspData.blocksByType().toMutableMap()
    private var pendingBlock: GdspBlock? = null

    override fun hasService(service: UUID): Boolean = ZeppVirtualCharacteristics.all.any { it.service == service }

    override fun findCharacteristic(characteristic: UUID, service: UUID?): GattCharacteristic? =
        ZeppVirtualCharacteristics.all.firstOrNull { it.uuid == characteristic && (service == null || it.service == service) }

    override fun requestConnectionPriority(priority: ConnectionPriority): Boolean = _connected.value

    override suspend fun requestMtu(mtu: Int): Int {
        ensureConnected()
        this.mtu = mtu.coerceIn(GattClient.DEFAULT_MTU, MAX_MTU)
        return this.mtu
    }

    override suspend fun read(characteristic: GattCharacteristic): ByteArray {
        ensureConnected()
        return readValues[characteristic] ?: throw GattException("Characteristic ${characteristic.uuid} is not readable")
    }

    override suspend fun write(characteristic: GattCharacteristic, value: ByteArray, type: WriteType) {
        ensureConnected()
        when (characteristic) {
            ZeppVirtualCharacteristics.legacyAuth -> onLegacyAuth(value)
            ZeppVirtualCharacteristics.gdspControl -> onGdspControl(value)
            ZeppVirtualCharacteristics.hrControl -> onHrControl(value)
            ZeppVirtualCharacteristics.currentTime -> Unit // accepted silently, like a real watch (§4 step 7)
            else -> Unit
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
        hrJob?.cancel()
        scope.cancel()
        synchronized(subscriptions) {
            subscriptions.values.forEach { it.close() }
            subscriptions.clear()
        }
    }

    private fun ensureConnected() {
        if (!_connected.value) throw GattDisconnectedException()
    }

    private fun notify(characteristic: GattCharacteristic, value: ByteArray) {
        synchronized(subscriptions) { subscriptions[characteristic] }?.trySend(value)
    }

    // --- Legacy auth (§5.5): [0x01 bind] | [0x02 request random] | [0x03 send AES(key, random)] ---

    private fun onLegacyAuth(value: ByteArray) {
        when (value[0].toInt() and 0xFF) {
            0x01 -> { // [0x01, appId, key(16)]: always accepted (no on-watch confirmation); replaces any earlier key.
                storage.boundKey = value.copyOfRange(2, 2 + KEY_SIZE)
                notify(ZeppVirtualCharacteristics.legacyAuth, byteArrayOf(0x10, 0x01, 0x01))
            }
            0x02 -> { // [0x02, appId, 0x02] or [0x02, appId]
                val fresh = ByteArray(KEY_SIZE).also(random::nextBytes)
                challenge = fresh
                notify(ZeppVirtualCharacteristics.legacyAuth, byteArrayOf(0x10, 0x02, 0x01) + fresh)
            }
            0x03 -> { // [0x03, appId, AES(key, random)]
                val key = storage.boundKey
                val sent = value.copyOfRange(2, 2 + KEY_SIZE)
                val ok = key != null && challenge != null && sent.contentEquals(aesEcb(Cipher.ENCRYPT_MODE, key, challenge!!))
                notify(ZeppVirtualCharacteristics.legacyAuth, byteArrayOf(0x10, 0x03, if (ok) 0x01 else 0x04))
            }
        }
    }

    // --- GDSP (§6.1): [0x00 version] | [0x01 header request] | [0x02 start transfer] | [0x03 stop] ---

    private fun onGdspControl(value: ByteArray) {
        when (value[0].toInt() and 0xFF) {
            0x00 -> notify(ZeppVirtualCharacteristics.gdspControl, byteArrayOf(0x10, 0x00, 0x01, 0x01))
            0x01 -> {
                val type = value[1].toInt() and 0xFF
                val block = gdspBlocks.remove(type)
                pendingBlock = block
                notify(ZeppVirtualCharacteristics.gdspControl, headerReply(block))
            }
            0x02 -> sendBlock(checkNotNull(pendingBlock) { "GDSP start without a header reply" })
            0x03 -> notify(ZeppVirtualCharacteristics.gdspControl, byteArrayOf(0x10, 0x03, 0x01))
        }
    }

    private fun headerReply(block: GdspBlock?): ByteArray {
        if (block == null) return buildBytes(15) { bytes(byteArrayOf(0x10, 0x01, 0x01)); u32le(0); bytes(ByteArray(8)) }
        val local = LocalDateTime.ofInstant(block.start, ZoneOffset.UTC)
        return buildBytes(15) {
            bytes(byteArrayOf(0x10, 0x01, 0x01))
            u32le(block.count)
            u16le(local.year)
            u8(local.monthValue)
            u8(local.dayOfMonth)
            u8(local.hour)
            u8(local.minute)
            u8(local.second)
            u8(0) // tzKey = 0: the embedded time is already UTC, matching GdspCodec.parseHeader's reconstruction.
        }
    }

    private fun sendBlock(block: GdspBlock) {
        val chunk = (mtu - GattClient.ATT_HEADER_SIZE - 1).coerceAtLeast(1)
        var seq = 0
        var offset = 0
        while (offset < block.payload.size) {
            val end = (offset + chunk).coerceAtMost(block.payload.size)
            notify(ZeppVirtualCharacteristics.gdspData, byteArrayOf(seq.toByte()) + block.payload.copyOfRange(offset, end))
            seq = (seq + 1) % 256
            offset = end
        }
        val crc = CRC32().apply { update(block.payload) }.value
        notify(ZeppVirtualCharacteristics.gdspControl, buildBytes(7) { bytes(byteArrayOf(0x10, 0x02, 0x01)); u32le(crc) })
    }

    // --- Heart Rate (§3.1): 2A39 `[0x15,1,1]` start / `[0x15,1,0]` stop / `[0x16]` heartbeat ---

    private fun onHrControl(value: ByteArray) {
        when {
            value.contentEquals(byteArrayOf(0x15, 0x01, 0x01)) -> startHr()
            value.contentEquals(byteArrayOf(0x15, 0x01, 0x00)) -> { hrJob?.cancel(); hrJob = null }
            else -> Unit // heartbeat [0x16]: nothing to re-arm in the simulator.
        }
    }

    private fun startHr() {
        hrJob?.cancel()
        hrJob = scope.launch {
            var tick = 0
            while (true) {
                val bpm = (68 + (tick % 10)).coerceIn(1, 250)
                notify(ZeppVirtualCharacteristics.hrMeasurement, byteArrayOf(0x00, bpm.toByte()))
                tick++
                delay(HR_INTERVAL_MS)
            }
        }
    }

    private fun aesEcb(mode: Int, key: ByteArray, data: ByteArray): ByteArray {
        val cipher = Cipher.getInstance("AES/ECB/NoPadding")
        cipher.init(mode, SecretKeySpec(key, "AES"))
        return cipher.doFinal(data)
    }

    private companion object {
        const val MAX_MTU = 247
        const val KEY_SIZE = 16
        const val HR_INTERVAL_MS = 1_000L
        const val SEED = 2026_11_06L
    }
}
