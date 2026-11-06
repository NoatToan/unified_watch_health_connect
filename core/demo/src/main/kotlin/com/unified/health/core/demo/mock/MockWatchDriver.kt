package com.unified.health.core.demo.mock

import com.unified.health.core.ble.HealthRecordSink
import com.unified.health.core.ble.driver.AuthenticationException
import com.unified.health.core.ble.driver.RecognitionScore
import com.unified.health.core.ble.driver.SessionContext
import com.unified.health.core.ble.driver.SyncProgress
import com.unified.health.core.ble.driver.SyncRequest
import com.unified.health.core.ble.driver.UnsupportedDeviceException
import com.unified.health.core.ble.driver.WearableDriver
import com.unified.health.core.ble.driver.WearableSession
import com.unified.health.core.ble.gatt.GattClient
import com.unified.health.core.ble.gatt.GattCharacteristic
import com.unified.health.core.ble.gatt.GattCharacteristic.Companion.PROPERTY_NOTIFY
import com.unified.health.core.ble.gatt.GattCharacteristic.Companion.PROPERTY_WRITE
import com.unified.health.core.ble.scan.Advertisement
import com.unified.health.core.demo.DemoDevice
import com.unified.health.core.demo.DemoHealthDataGenerator
import com.unified.health.core.model.DeviceCapability
import com.unified.health.core.model.DeviceInfo
import com.unified.health.core.model.HealthRecord
import com.unified.health.core.model.WearableVendor
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.withTimeout
import java.time.Duration
import java.time.Instant
import java.time.ZoneId
import java.util.UUID
import kotlin.math.roundToInt
import kotlin.math.sin

/** Wire constants of the simulated watch: one write characteristic, one notify characteristic. */
object MockWatchProtocol {
    val SERVICE: UUID = UUID.fromString("0000d330-5548-4445-4d4f-000000000001")
    val CONTROL: UUID = UUID.fromString("0000d331-5548-4445-4d4f-000000000001")
    val EVENTS: UUID = UUID.fromString("0000d332-5548-4445-4d4f-000000000001")

    val CONTROL_CHAR = GattCharacteristic(SERVICE, CONTROL, PROPERTY_WRITE)
    val EVENTS_CHAR = GattCharacteristic(SERVICE, EVENTS, PROPERTY_NOTIFY)

    val HELLO: ByteArray = "UHDEMO-HELLO".toByteArray(Charsets.US_ASCII)
    val ACK: ByteArray = "UHDEMO-OK".toByteArray(Charsets.US_ASCII)

    /** Bluetooth SIG "reserved for testing" company id, used only in the virtual advertisement. */
    const val COMPANY_ID = 0xFFFF

    fun advertisement(address: String = DemoDevice.ADDRESS, name: String = DemoDevice.NAME) = Advertisement(
        address = address,
        name = name,
        rssi = -48,
        serviceUuids = setOf(SERVICE),
        manufacturerData = mapOf(COMPANY_ID to "UHDEMO".toByteArray(Charsets.US_ASCII)),
    )
}

/**
 * Driver for the simulated watch. Behaves like a real driver (recognises its advertisement, runs a
 * tiny handshake over GATT, returns a session) but its data comes from [DemoHealthDataGenerator], so
 * scan → pair → connect → sync always succeeds and is deterministic. Debug/test builds only.
 */
class MockWatchDriver(
    private val generator: DemoHealthDataGenerator = DemoHealthDataGenerator(),
    /** Pause per synced day so the progress bar is visible; 0 in unit tests. */
    private val syncDelayPerDayMs: Long = DEFAULT_SYNC_DELAY_PER_DAY_MS,
    private val now: () -> Instant = Instant::now,
    private val zone: ZoneId = ZoneId.systemDefault(),
) : WearableDriver {

    override val vendor: WearableVendor = WearableVendor.DEMO

    override fun recognize(advertisement: Advertisement): Int = when {
        MockWatchProtocol.COMPANY_ID in advertisement.manufacturerData && advertisement.hasService(MockWatchProtocol.SERVICE) ->
            RecognitionScore.VENDOR_MANUFACTURER_DATA
        else -> RecognitionScore.NONE
    }

    override suspend fun openSession(gatt: GattClient, context: SessionContext): WearableSession {
        if (!gatt.hasService(MockWatchProtocol.SERVICE)) throw UnsupportedDeviceException("Not a demo watch: ${gatt.address}")
        val control = gatt.findCharacteristic(MockWatchProtocol.CONTROL, MockWatchProtocol.SERVICE)
            ?: throw UnsupportedDeviceException("Demo watch without control characteristic")
        val events = gatt.findCharacteristic(MockWatchProtocol.EVENTS, MockWatchProtocol.SERVICE)
            ?: throw UnsupportedDeviceException("Demo watch without event characteristic")
        val replies = gatt.subscribe(events)
        gatt.write(control, MockWatchProtocol.HELLO)
        val reply = withTimeout(HANDSHAKE_TIMEOUT_MS) { replies.receive() }
        if (!reply.contentEquals(MockWatchProtocol.ACK)) throw AuthenticationException("Demo watch rejected the handshake")
        return MockWatchSession(generator, syncDelayPerDayMs, now, zone)
    }

    companion object {
        const val DEFAULT_SYNC_DELAY_PER_DAY_MS = 15L
        const val HANDSHAKE_TIMEOUT_MS = 2_000L

        /** A first sync pulls this much history, so pairing alone fills every chart. */
        const val FIRST_SYNC_DAYS = 90
    }
}

internal class MockWatchSession(
    private val generator: DemoHealthDataGenerator,
    private val syncDelayPerDayMs: Long,
    private val now: () -> Instant,
    private val zone: ZoneId,
) : WearableSession {

    override val capabilities: Set<DeviceCapability> =
        setOf(DeviceCapability.HISTORY_SYNC, DeviceCapability.LIVE_HEART_RATE, DeviceCapability.BATTERY_LEVEL)

    override suspend fun readDeviceInfo(): DeviceInfo =
        DeviceInfo(model = DemoDevice.MODEL, firmwareVersion = DemoDevice.FIRMWARE, serialNumber = "UHDEMO0001", batteryPercent = DemoDevice.BATTERY_PERCENT)

    override suspend fun sync(request: SyncRequest, sink: HealthRecordSink, progress: SyncProgress): Int {
        val end = now()
        val today = end.atZone(zone).toLocalDate()
        val firstDay = request.since?.atZone(zone)?.toLocalDate()
            ?: today.minusDays(MockWatchDriver.FIRST_SYNC_DAYS - 1L)
        val days = (Duration.between(firstDay.atStartOfDay(zone).toInstant(), end).toDays() + 1).toInt().coerceAtLeast(1)
        var delivered = 0
        progress.report(0f)
        for (i in 0 until days) {
            val date = firstDay.plusDays(i.toLong())
            val records = generator.day(date, until = if (date == today) end else null)
            sink.onRecords(records)
            delivered += records.count { it !is HealthRecord.RawPayload }
            progress.report((i + 1f) / days)
            if (syncDelayPerDayMs > 0) delay(syncDelayPerDayMs)
        }
        return delivered
    }

    override val liveHeartRate: Flow<HealthRecord.HeartRate> = flow {
        var tick = 0
        while (true) {
            emit(HealthRecord.HeartRate(now(), (68 + 6 * sin(tick / 9.0)).roundToInt()))
            tick++
            delay(LIVE_INTERVAL_MS)
        }
    }

    override suspend fun close() = Unit

    private companion object {
        const val LIVE_INTERVAL_MS = 1_000L
    }
}
