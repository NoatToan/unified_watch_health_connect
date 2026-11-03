package com.unified.health.driver.garmin

import com.unified.health.core.ble.driver.AuthenticationException
import com.unified.health.core.ble.driver.SyncRequest
import com.unified.health.core.ble.driver.UnsupportedDeviceException
import com.unified.health.core.ble.driver.WearableProtocolException
import com.unified.health.core.ble.protocol.ByteReader
import com.unified.health.core.ble.protocol.buildBytes
import com.unified.health.core.ble.protocol.toHex
import com.unified.health.core.model.DeviceCapability
import com.unified.health.core.model.HealthRecord
import com.unified.health.core.testing.FakeGattClient
import com.unified.health.core.testing.RecordingSink
import com.unified.health.driver.garmin.codec.FitTime
import com.unified.health.driver.garmin.codec.GfdiMessageId
import com.unified.health.driver.garmin.codec.GfdiStatus
import com.unified.health.driver.garmin.codec.HostIdentity
import com.unified.health.driver.garmin.codec.MultiLinkCodec
import com.unified.health.driver.garmin.codec.RegisterStatus
import com.unified.health.driver.garmin.codec.fit.FitHealthMapper
import com.unified.health.driver.garmin.testing.FakeGarminWatch
import com.unified.health.driver.garmin.testing.FitFileBuilder
import com.unified.health.driver.garmin.testing.FitFileBuilder.Companion.enum
import com.unified.health.driver.garmin.testing.FitFileBuilder.Companion.u32
import com.unified.health.driver.garmin.testing.FitFileBuilder.Companion.u8
import com.unified.health.driver.garmin.transport.MultiLinkRegistrationException
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

        // Multi-Link setup: CLOSE_ALL then REGISTER(GFDI, flags 0) with our client id.
        assertEquals(
            listOf(MultiLinkCodec.closeAll(CLIENT_ID).toHex(), MultiLinkCodec.register(CLIENT_ID, 1).toHex()),
            watch.controlWrites.map { it.toHex() },
        )
        // Handshake replies.
        val deviceInfoAck = watch.ackOf(GfdiMessageId.DEVICE_INFORMATION)!!
        assertEquals(113, ByteReader(deviceInfoAck.data).u16le())
        assertArrayEquals(byteArrayOf(3) + watch.configuration, watch.sent(GfdiMessageId.CONFIGURATION).single().payload)
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
