package com.unified.health.driver.garmin

import com.unified.health.core.ble.driver.AuthenticationException
import com.unified.health.core.ble.driver.SyncRequest
import com.unified.health.core.ble.driver.UnsupportedDeviceException
import com.unified.health.core.ble.driver.WearableProtocolException
import com.unified.health.core.ble.protocol.ByteReader
import com.unified.health.core.ble.protocol.buildBytes
import com.unified.health.core.ble.protocol.hexToBytes
import com.unified.health.core.ble.protocol.toHex
import com.unified.health.core.model.DeviceCapability
import com.unified.health.core.model.HealthRecord
import com.unified.health.core.testing.FakeGattClient
import com.unified.health.core.testing.RecordingSink
import com.unified.health.driver.garmin.codec.FitTime
import com.unified.health.driver.garmin.codec.GfdiMessageId
import com.unified.health.driver.garmin.codec.GfdiPayloads
import com.unified.health.driver.garmin.codec.GfdiStatus
import com.unified.health.driver.garmin.codec.HostIdentity
import com.unified.health.driver.garmin.codec.MultiLinkCodec
import com.unified.health.driver.garmin.codec.RegisterStatus
import com.unified.health.driver.garmin.codec.fit.FitHealthMapper
import com.unified.health.driver.garmin.testing.FakeGarminWatch
import com.unified.health.driver.garmin.testing.FitFileBuilder
import com.unified.health.driver.garmin.testing.FitFileBuilder.Companion.enum
import com.unified.health.driver.garmin.testing.FitFileBuilder.Companion.u16
import com.unified.health.driver.garmin.testing.FitFileBuilder.Companion.u32
import com.unified.health.driver.garmin.testing.FitFileBuilder.Companion.u8
import com.unified.health.driver.garmin.transport.MultiLinkRegistrationException
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.launch
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.TestScope
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test
import java.time.Clock
import java.time.Instant
import java.time.LocalDate
import java.time.ZoneOffset

@OptIn(ExperimentalCoroutinesApi::class)
class GarminSessionTest {

    private val now = Instant.parse("2026-03-02T12:00:00Z")
    private val host = HostIdentity(appVersion = 1, friendlyName = "UH", manufacturer = "Google", model = "Pixel")

    private fun TestScope.config() = GarminSessionConfig(
        host = host,
        multiLinkClientId = CLIENT_ID,
        dispatcher = StandardTestDispatcher(testScheduler),
        clock = Clock.fixed(now, ZoneOffset.UTC),
    )

    private fun directory(vararg entries: Triple<Int, Int, Instant>) = buildBytes {
        bytes(ByteArray(16))
        for ((index, subType, time) in entries) {
            u16le(index); u8(if (subType < 0) 8 else 128); u8(maxOf(subType, 0)); u16le(index); u8(0); u8(0)
            u32le(1000); u32le(FitTime.fromInstant(time))
        }
    }

    private val monitoringFile = FitFileBuilder()
        .define(0, FitHealthMapper.MESG_MONITORING, u32(253), enum(5), u32(3), u8(27))
        .apply { (0 until 12).forEach { record(0, FitTime.fromInstant(now) - 3600 + it * 60L, 6, 100L * (it + 1), 60L + it) } }
        .build()

    @Test
    fun `multi-link handshake then sync delivers raw files and records`() = runTest {
        val watch = FakeGarminWatch(multiLink = true)
        watch.registerStatuses = listOf(RegisterStatus.PENDING_AUTH, RegisterStatus.SUCCESS)
        val since = now.minusSeconds(86_400)
        watch.files[0] = directory(
            Triple(3, 32, now.minusSeconds(600)), // new monitoring file
            Triple(4, 32, since.minusSeconds(60)), // older than `since`: skipped
            Triple(5, -1, now), // not a FIT file: skipped
            Triple(6, 4, now.minusSeconds(300)), // listed but missing on the watch: skipped
        )
        watch.files[3] = monitoringFile

        val session = GarminSession.open(watch.gatt, config())

        // Multi-Link setup: CLOSE_ALL, REGISTRATION (service 4) and its info pages, then REGISTER(GFDI).
        assertEquals(
            listOf(
                MultiLinkCodec.closeAll(CLIENT_ID).toHex(),
                MultiLinkCodec.register(CLIENT_ID, MultiLinkCodec.SERVICE_REGISTRATION).toHex(),
                MultiLinkCodec.register(CLIENT_ID, 1).toHex(),
            ),
            watch.controlWrites.map { it.toHex() },
        )
        assertEquals(MultiLinkCodec.INFO_PAGE_ORDER, watch.infoPageRequests)
        // Handshake replies.
        val deviceInfoAck = watch.ackOf(GfdiMessageId.DEVICE_INFORMATION)!!
        assertEquals(113, ByteReader(deviceInfoAck.data).u16le())
        // Our own fixed capability set (bits 0,3,4,5,29,71), never the watch's bitmask mirrored back.
        assertEquals("09390000200000000080", watch.sent(GfdiMessageId.CONFIGURATION).single().payload.toHex())
        val timeReply = watch.ackOf(GfdiMessageId.CURRENT_TIME_REQUEST)!!
        assertEquals("01020304", timeReply.data.copyOf(4).toHex())
        assertEquals(FitTime.fromInstant(now), ByteReader(timeReply.data, 4).u32le())
        assertEquals(GfdiStatus.UNKNOWN_OR_NOT_SUPPORTED, watch.ackOf(9999)!!.status)
        assertEquals("0800", watch.sent(GfdiMessageId.SYSTEM_EVENT).single().payload.toHex())

        val info = session.readDeviceInfo()
        assertEquals("Forerunner 265S", info.model)
        assertEquals("15.20", info.firmwareVersion)
        assertEquals("3456789012", info.serialNumber)
        assertEquals(81, info.batteryPercent)
        // Multi-Link always offers REAL_TIME_HR as a candidate; the watch may still refuse it on first use.
        assertEquals(setOf(DeviceCapability.HISTORY_SYNC, DeviceCapability.BATTERY_LEVEL, DeviceCapability.LIVE_HEART_RATE), session.capabilities)

        val sink = RecordingSink()
        val reported = mutableListOf<Float>()
        val delivered = session.sync(SyncRequest(since = since, now = now), sink) { reported += it }

        val raw = sink.ofType<HealthRecord.RawPayload>().single()
        assertEquals("fit_monitoring", raw.kind)
        assertArrayEquals(monitoringFile, raw.bytes)
        assertEquals(12, sink.ofType<HealthRecord.HeartRate>().size)
        assertEquals(listOf(HealthRecord.DailyActivity(LocalDate.of(2026, 3, 2), steps = 1200)), sink.ofType<HealthRecord.DailyActivity>())
        assertEquals(13, delivered)
        assertEquals(1f, reported.last())
        // Downloads: directory, file 3, file 6 (refused). Then SYNC_COMPLETE; never archive/delete.
        assertEquals(listOf(0, 3, 6), watch.sent(GfdiMessageId.DOWNLOAD_REQUEST).map { ByteReader(it.payload).u16le() })
        assertEquals("0000", watch.sent(GfdiMessageId.SYSTEM_EVENT).last().payload.toHex())
        assertTrue(watch.received.none { it.id == 5006 || it.id == 5008 })
        session.close()
    }

    @Test
    fun `activity files far outside the wellness window are still synced, unlike monitoring`() = runTest {
        val watch = FakeGarminWatch(multiLink = true)
        watch.registerStatuses = listOf(RegisterStatus.SUCCESS)
        val since = now.minusSeconds(86_400) // 1-day wellness window
        val activityFile = FitFileBuilder()
            .define(0, FitHealthMapper.MESG_SESSION, u32(253), u32(2), enum(5), u32(7), u32(9), u16(11), u8(16), u8(17))
            .record(0, FitTime.fromInstant(now) - 40 * 86_400 + 1800, FitTime.fromInstant(now) - 40 * 86_400, 1, 1_800_000, 5_000_00, 300, 140, 170)
            .build()
        watch.files[0] = directory(
            Triple(3, 4, now.minusSeconds(40 * 86_400L)), // ACTIVITY 40 days old: outside wellness window, inside the activity one
            Triple(4, 32, now.minusSeconds(40 * 86_400L)), // MONITORING 40 days old: outside both -> skipped
            Triple(5, 4, now.minusSeconds(400 * 86_400L)), // ACTIVITY 400 days old: outside even the activity window -> skipped
        )
        watch.files[3] = activityFile

        val session = GarminSession.open(watch.gatt, config())
        val sink = RecordingSink()
        session.sync(SyncRequest(since = since, now = now), sink) {}

        assertEquals(listOf(0, 3), watch.sent(GfdiMessageId.DOWNLOAD_REQUEST).map { ByteReader(it.payload).u16le() })
        val workout = sink.ofType<HealthRecord.Workout>().single()
        assertEquals("running", workout.sport)
        assertEquals(300, workout.activeKcal)
        session.close()
    }

    @Test
    fun `dedicated GFDI service is preferred and needs no Multi-Link`() = runTest {
        val watch = FakeGarminWatch(multiLink = false)
        launch { watch.announceWhenSubscribed() }
        val session = GarminSession.open(watch.gatt, config())
        assertEquals("Forerunner 265S", session.readDeviceInfo().model)
        assertEquals(1, watch.sent(GfdiMessageId.SYSTEM_EVENT).size)
        session.close()
    }

    @Test
    fun `rejected Multi-Link client id fails with a clear error`() = runTest {
        val watch = FakeGarminWatch().apply { registerStatuses = listOf(RegisterStatus.REJECTED) }
        val error = runCatching { GarminSession.open(watch.gatt, config()) }.exceptionOrNull()
        assertTrue(error is MultiLinkRegistrationException)
        assertTrue(error!!.message!!.contains("client id"))
    }

    @Test
    fun `REGISTRATION info pages are queried before GFDI on every connect`() = runTest {
        val watch = FakeGarminWatch().apply {
            requireRegistrationService = true
            silentInfoPageRequests = 1 // first page needs one retry
        }
        val session = GarminSession.open(watch.gatt, config())

        assertEquals(
            listOf(
                MultiLinkCodec.closeAll(CLIENT_ID),
                MultiLinkCodec.register(CLIENT_ID, MultiLinkCodec.SERVICE_REGISTRATION),
                MultiLinkCodec.register(CLIENT_ID, MultiLinkCodec.SERVICE_GFDI),
            ).map { it.toHex() },
            watch.controlWrites.map { it.toHex() },
        )
        assertEquals(listOf(0, 0, 1, 3, 4, 2, 5), watch.infoPageRequests)
        assertEquals("Forerunner 265S", session.readDeviceInfo().model)
        session.close()
    }

    @Test
    fun `unanswered REGISTRATION service is bounded and GFDI still opens`() = runTest {
        val watch = FakeGarminWatch().apply { answerRegistrationService = false }
        val session = GarminSession.open(watch.gatt, config())
        assertEquals(1, watch.registrations[MultiLinkCodec.SERVICE_GFDI])
        assertEquals("Forerunner 265S", session.readDeviceInfo().model)
        session.close()
    }

    @Test
    fun `refused REGISTRATION service keeps the original rejection`() = runTest {
        val watch = FakeGarminWatch().apply {
            requireRegistrationService = true
            registrationStatus = RegisterStatus.REJECTED
        }
        val error = runCatching { GarminSession.open(watch.gatt, config()) }.exceptionOrNull()
        assertTrue(error is MultiLinkRegistrationException)
        assertEquals(1, watch.registrations[MultiLinkCodec.SERVICE_GFDI])
        assertTrue(watch.infoPageRequests.isEmpty())
    }

    @Test
    fun `SIG battery stays primary over a 5023 fallback`() = runTest {
        val watch = FakeGarminWatch()
        val session = GarminSession.open(watch.gatt, config())
        watch.send(GfdiMessageId.BATTERY_STATUS, "20ff4a000000".hexToBytes())
        testScheduler.runCurrent()
        assertEquals(81, session.readDeviceInfo().batteryPercent)
        assertEquals(GfdiStatus.ACK, watch.ackOf(GfdiMessageId.BATTERY_STATUS)!!.status)
        session.close()
    }

    @Test
    fun `5023 fills in when the watch has no SIG battery, malformed ones are ignored`() = runTest {
        val watch = FakeGarminWatch(sigBattery = false)
        val session = GarminSession.open(watch.gatt, config())
        assertEquals(null, session.readDeviceInfo().batteryPercent)
        assertTrue(DeviceCapability.BATTERY_LEVEL !in session.capabilities)

        watch.send(GfdiMessageId.BATTERY_STATUS, "10aa4a000000".hexToBytes()) // status NEW, 74 %
        testScheduler.runCurrent()
        assertEquals(74, session.readDeviceInfo().batteryPercent)

        watch.send(GfdiMessageId.BATTERY_STATUS, "ff02".hexToBytes()) // too short: previous value kept
        testScheduler.runCurrent()
        assertEquals(74, session.readDeviceInfo().batteryPercent)

        watch.send(GfdiMessageId.BATTERY_STATUS, "70004a000000".hexToBytes()) // invalid status: ignored
        testScheduler.runCurrent()
        assertEquals(74, session.readDeviceInfo().batteryPercent)
        session.close()
    }

    @Test
    fun `5023 battery is polled every ten minutes`() = runTest {
        val watch = FakeGarminWatch()
        val session = GarminSession.open(watch.gatt, config())
        assertEquals(0, watch.sent(GfdiMessageId.BATTERY_STATUS).size)

        testScheduler.advanceTimeBy(GarminSession.BATTERY_POLL_INTERVAL_MS + 1)
        testScheduler.runCurrent()
        assertEquals("ff00ffffffff", watch.sent(GfdiMessageId.BATTERY_STATUS).single().payload.toHex())
        session.close()
    }

    @Test
    fun `time sync pushes the 5026 TLV when capability bit 71 is clear`() = runTest {
        val watch = FakeGarminWatch()
        val session = GarminSession.open(watch.gatt, config())

        val push = watch.sent(GfdiMessageId.SET_DEVICE_SETTINGS).single()
        assertEquals(GfdiPayloads.setDeviceSettings(now, ZoneOffset.UTC).toHex(), push.payload.toHex())
        assertEquals(listOf("0800"), watch.sent(GfdiMessageId.SYSTEM_EVENT).map { it.payload.toHex() })
        session.close()
    }

    @Test
    fun `time sync sends TIME_UPDATED and stops waiting when the watch asks for time`() = runTest {
        val watch = FakeGarminWatch().apply {
            configuration = GfdiPayloads.capabilityBitmask(setOf(71))
        }
        val session = GarminSession.open(watch.gatt, config())

        assertEquals(
            listOf("0800", "1000"),
            watch.sent(GfdiMessageId.SYSTEM_EVENT).map { it.payload.toHex() },
        )
        assertTrue(watch.sent(GfdiMessageId.SET_DEVICE_SETTINGS).isEmpty())
        assertTrue(testScheduler.currentTime < GarminSession.TIME_SYNC_WAIT_MS)
        session.close()
    }

    @Test
    fun `time sync gives up waiting for 5052 after five seconds`() = runTest {
        val watch = FakeGarminWatch().apply {
            configuration = GfdiPayloads.capabilityBitmask(setOf(71))
            sendTimeRequestOnTimeUpdated = false
        }
        val session = GarminSession.open(watch.gatt, config())

        assertEquals("1000", watch.sent(GfdiMessageId.SYSTEM_EVENT).last().payload.toHex())
        assertTrue(testScheduler.currentTime >= GarminSession.TIME_SYNC_WAIT_MS)
        session.close()
    }

    @Test
    fun `GFDI already in use points at Garmin Connect`() = runTest {
        val watch = FakeGarminWatch().apply { registerStatuses = listOf(RegisterStatus.ALREADY_IN_USE) }
        val error = runCatching { GarminSession.open(watch.gatt, config()) }.exceptionOrNull()
        assertTrue(error!!.message!!.contains("Garmin Connect"))
    }

    @Test
    fun `missing device information times out`() = runTest {
        val watch = FakeGarminWatch().apply { sendDeviceInformation = false }
        val error = runCatching { GarminSession.open(watch.gatt, config()) }.exceptionOrNull()
        assertTrue(error is WearableProtocolException)
        assertTrue(error!!.message!!.contains("5024"))
    }

    @Test
    fun `NAK of handshake complete fails the session`() = runTest {
        val watch = FakeGarminWatch().apply { systemEventStatus = GfdiStatus.NAK }
        val error = runCatching { GarminSession.open(watch.gatt, config()) }.exceptionOrNull()
        assertTrue(error is WearableProtocolException)
        assertTrue(error!!.message!!.contains("NAK"))
    }

    @Test
    fun `watch requesting Garmin Auth is an authentication error`() = runTest {
        val watch = FakeGarminWatch().apply { sendDeviceInformation = false }
        watch.gatt.onWrite.let { original ->
            watch.gatt.onWrite = { c, v ->
                original(c, v)
                if (v[0].toInt() == 0 && v[1].toInt() == MultiLinkCodec.CMD_REGISTER) watch.send(5101, byteArrayOf(1))
            }
        }
        val error = runCatching { GarminSession.open(watch.gatt, config()) }.exceptionOrNull()
        assertTrue(error is AuthenticationException)
    }

    @Test(expected = UnsupportedDeviceException::class)
    fun `watch without GFDI is unsupported`() = runTest {
        GarminSession.open(FakeGattClient(emptyList()), config())
    }

    private companion object {
        const val CLIENT_ID = 0x1122334455667788L
    }
}
