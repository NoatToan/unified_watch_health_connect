package com.unified.health.core.demo.virtual

import com.unified.health.core.ble.gatt.ConnectionPriority
import com.unified.health.core.ble.gatt.GattCharacteristic
import com.unified.health.core.ble.gatt.GattCharacteristic.Companion.PROPERTY_INDICATE
import com.unified.health.core.ble.gatt.GattCharacteristic.Companion.PROPERTY_NOTIFY
import com.unified.health.core.ble.gatt.GattCharacteristic.Companion.PROPERTY_READ
import com.unified.health.core.ble.gatt.GattCharacteristic.Companion.PROPERTY_WRITE
import com.unified.health.core.ble.gatt.GattClient
import com.unified.health.core.ble.gatt.GattDisconnectedException
import com.unified.health.core.ble.gatt.GattException
import com.unified.health.core.ble.gatt.WriteType
import com.unified.health.core.ble.gatt.sigUuid
import com.unified.health.core.ble.protocol.ByteWriter
import com.unified.health.core.ble.scan.Advertisement
import com.unified.health.core.ble.virtual.VirtualDevice
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import java.time.Duration
import java.time.Instant
import java.time.LocalDateTime
import java.time.LocalTime
import java.util.UUID
import kotlin.math.roundToInt
import kotlin.math.sin

/**
 * A simulated generic SIG band (Polar/Wahoo-style strap + pulse oximeter + foot pod) for E2E tests of
 * `:driver:standard`. It speaks only public Bluetooth SIG GATT services, byte for byte, so the app's
 * real scan → recognise → session → sync → Room pipeline runs exactly as with a real device (D-611).
 * Debug/test builds only (`:core:demo`).
 */
object StandardVirtualWatch {
    const val ADDRESS = "02:5D:00:00:18:0D"
    const val NAME = "SIG Pulse Band"
    const val MODEL = "PB-1 HR+SpO2"
    const val FIRMWARE = "3.0.1"
    const val SERIAL = "SIG0001"
    const val BATTERY_PERCENT = 64

    /** Stored spot-check readings per day the band "remembers" for the RACP transfer. */
    val STORED_READING_TIMES: List<LocalTime> = listOf(LocalTime.of(7, 30), LocalTime.of(13, 0), LocalTime.of(21, 15))
    const val STORED_DAYS = 7

    internal val HEART_RATE_SERVICE: UUID = sigUuid(0x180D)
    internal val PULSE_OXIMETER_SERVICE: UUID = sigUuid(0x1822)
    internal val RSC_SERVICE: UUID = sigUuid(0x1814)
    internal val BATTERY_SERVICE: UUID = sigUuid(0x180F)
    internal val DEVICE_INFORMATION_SERVICE: UUID = sigUuid(0x180A)
    internal val CURRENT_TIME_SERVICE: UUID = sigUuid(0x1805)

    internal val HR_MEASUREMENT = GattCharacteristic(HEART_RATE_SERVICE, sigUuid(0x2A37), PROPERTY_NOTIFY)
    internal val BATTERY_LEVEL = GattCharacteristic(BATTERY_SERVICE, sigUuid(0x2A19), PROPERTY_READ or PROPERTY_NOTIFY)
    internal val MANUFACTURER = GattCharacteristic(DEVICE_INFORMATION_SERVICE, sigUuid(0x2A29), PROPERTY_READ)
    internal val MODEL_NUMBER = GattCharacteristic(DEVICE_INFORMATION_SERVICE, sigUuid(0x2A24), PROPERTY_READ)
    internal val SERIAL_NUMBER = GattCharacteristic(DEVICE_INFORMATION_SERVICE, sigUuid(0x2A25), PROPERTY_READ)
    internal val FIRMWARE_REVISION = GattCharacteristic(DEVICE_INFORMATION_SERVICE, sigUuid(0x2A26), PROPERTY_READ)
    internal val CURRENT_TIME = GattCharacteristic(CURRENT_TIME_SERVICE, sigUuid(0x2A2B), PROPERTY_READ or PROPERTY_WRITE or PROPERTY_NOTIFY)
    internal val PLX_SPOT_CHECK = GattCharacteristic(PULSE_OXIMETER_SERVICE, sigUuid(0x2A5E), PROPERTY_INDICATE)
    internal val RACP = GattCharacteristic(PULSE_OXIMETER_SERVICE, sigUuid(0x2A52), PROPERTY_WRITE or PROPERTY_INDICATE)
    internal val RSC_MEASUREMENT = GattCharacteristic(RSC_SERVICE, sigUuid(0x2A53), PROPERTY_NOTIFY)

    internal val CHARACTERISTICS = listOf(
        HR_MEASUREMENT, BATTERY_LEVEL, MANUFACTURER, MODEL_NUMBER, SERIAL_NUMBER, FIRMWARE_REVISION,
        CURRENT_TIME, PLX_SPOT_CHECK, RACP, RSC_MEASUREMENT,
    )

    /** What a generic SIG band advertises: the Heart Rate service UUID and its name, no vendor data. */
    fun advertisement(): Advertisement = Advertisement(
        address = ADDRESS,
        name = NAME,
        rssi = -55,
        serviceUuids = setOf(HEART_RATE_SERVICE, PULSE_OXIMETER_SERVICE),
    )
}

/**
 * In-memory GATT server of [StandardVirtualWatch]. Streams 1 Hz heart rate (with RR intervals) and
 * walking cadence while subscribed, keeps the clock the app writes through CTS, and answers the PLX
 * Record Access Control Point with timestamped stored spot-checks — or, like a real oximeter whose
 * clock was never set, with "clock not set" records the app must discard.
 */
internal class StandardVirtualWatchGatt(
    override val address: String = StandardVirtualWatch.ADDRESS,
    private val tickMs: Long = TICK_MS,
    private val now: () -> Instant = Instant::now,
) : GattClient {

    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.Default)
    private val subscriptions = mutableMapOf<GattCharacteristic, Channel<ByteArray>>()
    private val _connected = MutableStateFlow(true)
    override val connected: StateFlow<Boolean> = _connected.asStateFlow()

    override var mtu: Int = GattClient.DEFAULT_MTU
        private set

    /** Device-local time set by the app (CTS write) and the moment it was set; null = clock not set. */
    @Volatile private var clockBase: Pair<LocalDateTime, Instant>? = null

    override fun hasService(service: UUID): Boolean = StandardVirtualWatch.CHARACTERISTICS.any { it.service == service }

    override fun findCharacteristic(characteristic: UUID, service: UUID?): GattCharacteristic? =
        StandardVirtualWatch.CHARACTERISTICS.firstOrNull { it.uuid == characteristic && (service == null || it.service == service) }

    override fun requestConnectionPriority(priority: ConnectionPriority): Boolean = _connected.value

    override suspend fun requestMtu(mtu: Int): Int {
        ensureConnected()
        this.mtu = mtu.coerceIn(GattClient.DEFAULT_MTU, MAX_MTU)
        return this.mtu
    }

    override suspend fun read(characteristic: GattCharacteristic): ByteArray {
        ensureConnected()
        return when (characteristic) {
            StandardVirtualWatch.BATTERY_LEVEL -> byteArrayOf(StandardVirtualWatch.BATTERY_PERCENT.toByte())
            StandardVirtualWatch.MANUFACTURER -> "Unified Health Lab".toByteArray()
            StandardVirtualWatch.MODEL_NUMBER -> StandardVirtualWatch.MODEL.toByteArray()
            StandardVirtualWatch.SERIAL_NUMBER -> StandardVirtualWatch.SERIAL.toByteArray()
            StandardVirtualWatch.FIRMWARE_REVISION -> StandardVirtualWatch.FIRMWARE.toByteArray()
            StandardVirtualWatch.CURRENT_TIME -> SigBytes.currentTime(deviceTime() ?: LocalDateTime.of(2000, 1, 1, 0, 0))
            else -> throw GattException("Characteristic ${characteristic.uuid} is not readable")
        }
    }

    override suspend fun write(characteristic: GattCharacteristic, value: ByteArray, type: WriteType) {
        ensureConnected()
        if (value.size > maxWriteLength) throw GattException("Write of ${value.size} bytes exceeds $maxWriteLength")
        when (characteristic) {
            StandardVirtualWatch.CURRENT_TIME -> SigBytes.parseDateTime(value)?.let { clockBase = it to now() }
            StandardVirtualWatch.RACP -> onRacp(value)
            else -> throw GattException("Characteristic ${characteristic.uuid} is not writable")
        }
    }

    override suspend fun subscribe(characteristic: GattCharacteristic): ReceiveChannel<ByteArray> {
        ensureConnected()
        if (characteristic !in StandardVirtualWatch.CHARACTERISTICS || characteristic.properties and (PROPERTY_NOTIFY or PROPERTY_INDICATE) == 0) {
            throw GattException("Characteristic ${characteristic.uuid} does not notify")
        }
        val (channel, fresh) = synchronized(subscriptions) {
            subscriptions[characteristic]?.let { it to false } ?: Channel<ByteArray>(Channel.UNLIMITED).also { subscriptions[characteristic] = it }.let { it to true }
        }
        if (fresh) when (characteristic) {
            StandardVirtualWatch.HR_MEASUREMENT -> stream(channel) { tick -> heartRate(tick) }
            StandardVirtualWatch.RSC_MEASUREMENT -> stream(channel) { tick -> walking(tick) }
        }
        return channel
    }

    override suspend fun unsubscribe(characteristic: GattCharacteristic) {
        synchronized(subscriptions) { subscriptions.remove(characteristic) }?.close()
    }

    override suspend fun close() {
        _connected.value = false
        scope.cancel()
        synchronized(subscriptions) {
            subscriptions.values.forEach { it.close() }
            subscriptions.clear()
        }
    }

    private fun stream(channel: Channel<ByteArray>, frame: (Int) -> ByteArray) {
        scope.launch {
            var tick = 0
            while (isActive && _connected.value) {
                if (channel.trySend(frame(tick++)).isClosed) break
                delay(tickMs)
            }
        }
    }

    /** RACP "Report stored records / All records" → spot-checks, then Response Code success. */
    private fun onRacp(value: ByteArray) {
        val racp = channelOf(StandardVirtualWatch.RACP) ?: return
        val opCode = value.firstOrNull()?.toInt() ?: return
        when {
            opCode == OP_REPORT_STORED && value.getOrNull(1)?.toInt() == OPERATOR_ALL -> {
                val spot = channelOf(StandardVirtualWatch.PLX_SPOT_CHECK)
                storedReadings().forEach { spot?.trySend(it) }
                racp.trySend(byteArrayOf(OP_RESPONSE, 0x00, OP_REPORT_STORED.toByte(), RESPONSE_SUCCESS))
            }
            opCode == OP_ABORT -> racp.trySend(byteArrayOf(OP_RESPONSE, 0x00, OP_ABORT.toByte(), RESPONSE_SUCCESS))
            else -> racp.trySend(byteArrayOf(OP_RESPONSE, 0x00, opCode.toByte(), RESPONSE_OP_NOT_SUPPORTED))
        }
    }

    private fun storedReadings(): List<ByteArray> {
        val deviceNow = deviceTime()
        if (deviceNow == null) {
            // Clock never set: flag "device clock not set" (bit 4), timestamp present but meaningless.
            return List(3) { spotCheck(96 + it, 64, LocalDateTime.of(2000, 1, 1, 0, it), clockNotSet = true) }
        }
        val today = deviceNow.toLocalDate()
        return (StandardVirtualWatch.STORED_DAYS downTo 1).flatMap { daysAgo ->
            StandardVirtualWatch.STORED_READING_TIMES.mapIndexed { i, time ->
                spotCheck(95 + (daysAgo + i) % 5, 58 + (daysAgo * 3 + i * 7) % 20, today.minusDays(daysAgo.toLong()).atTime(time), clockNotSet = false)
            }
        }
    }

    private fun spotCheck(spo2: Int, pulse: Int, time: LocalDateTime, clockNotSet: Boolean): ByteArray = ByteWriter(16).apply {
        // Flags: timestamp + measurement status present (+ clock not set).
        u8(0x03 or (if (clockNotSet) 0x10 else 0))
        u16le(spo2) // SFLOAT, exponent 0
        u16le(pulse)
        bytes(SigBytes.dateTime(time))
        u16le(STATUS_FROM_STORAGE or STATUS_VALIDATED)
    }.toByteArray()

    /** Heart Rate Measurement: uint8 bpm, contact detected + supported, one RR interval (1/1024 s). */
    private fun heartRate(tick: Int): ByteArray {
        val bpm = (72 + 5 * sin(tick / 7.0)).roundToInt()
        val rr = ((60_000.0 / bpm + 25 * sin(tick * 1.3)) * 1024 / 1000).roundToInt()
        return byteArrayOf(0x16, bpm.toByte(), (rr and 0xFF).toByte(), (rr shr 8).toByte())
    }

    /** RSC Measurement: walking, 1.4 m/s, ~110 steps/min. */
    private fun walking(tick: Int): ByteArray {
        val speed = (1.4 * 256).roundToInt()
        val cadence = 108 + tick % 5
        return byteArrayOf(0x00, (speed and 0xFF).toByte(), (speed shr 8).toByte(), cadence.toByte())
    }

    private fun deviceTime(): LocalDateTime? = clockBase?.let { (local, setAt) -> local.plus(Duration.between(setAt, now())) }

    private fun channelOf(c: GattCharacteristic): Channel<ByteArray>? = synchronized(subscriptions) { subscriptions[c] }

    private fun ensureConnected() {
        if (!_connected.value) throw GattDisconnectedException()
    }

    private companion object {
        const val TICK_MS = 1_000L
        const val MAX_MTU = 247
        const val OP_REPORT_STORED = 0x01
        const val OP_ABORT = 0x03
        const val OPERATOR_ALL = 0x01
        const val OP_RESPONSE: Byte = 0x06
        const val RESPONSE_SUCCESS: Byte = 0x01
        const val RESPONSE_OP_NOT_SUPPORTED: Byte = 0x02
        const val STATUS_FROM_STORAGE = 1 shl 9
        const val STATUS_VALIDATED = 1 shl 7
    }
}

/** SIG Date Time / Current Time byte layouts, written independently of the driver's codec on purpose. */
internal object SigBytes {
    fun dateTime(t: LocalDateTime): ByteArray =
        ByteWriter(7).u16le(t.year).u8(t.monthValue).u8(t.dayOfMonth).u8(t.hour).u8(t.minute).u8(t.second).toByteArray()

    fun currentTime(t: LocalDateTime): ByteArray =
        ByteWriter(10).bytes(dateTime(t)).u8(t.dayOfWeek.value).u8(0).u8(0).toByteArray()

    fun parseDateTime(value: ByteArray): LocalDateTime? {
        if (value.size < 7) return null
        val u = { i: Int -> value[i].toInt() and 0xFF }
        return runCatching { LocalDateTime.of(u(0) or (u(1) shl 8), u(2), u(3), u(4), u(5), u(6)) }.getOrNull()
    }
}

/** The simulated band as seen by the scanner and connector of `:core:ble`. */
internal class StandardVirtualWatchDevice : VirtualDevice {
    override val advertisement: Advertisement = StandardVirtualWatch.advertisement()
    override suspend fun connect(): GattClient = StandardVirtualWatchGatt()
}
