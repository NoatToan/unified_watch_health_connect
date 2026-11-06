package com.unified.health.core.demo

import com.unified.health.core.ble.driver.AuthenticationException
import com.unified.health.core.ble.driver.RecognitionScore
import com.unified.health.core.ble.driver.SessionContext
import com.unified.health.core.ble.driver.SyncRequest
import com.unified.health.core.ble.scan.Advertisement
import com.unified.health.core.demo.mock.MockWatchDriver
import com.unified.health.core.demo.mock.MockWatchProtocol
import com.unified.health.core.demo.mock.MockWatchVirtualDevice
import com.unified.health.core.model.DeviceCapability
import com.unified.health.core.model.HealthRecord
import com.unified.health.core.testing.FakeGattClient
import com.unified.health.core.testing.RecordingSink
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test
import java.time.LocalDate
import java.time.ZoneId

class MockWatchDriverTest {

    private val zone = ZoneId.of("Europe/Berlin")
    private val now = LocalDate.of(2026, 11, 6).atTime(15, 30).atZone(zone).toInstant()
    private val driver = MockWatchDriver(DemoHealthDataGenerator(zone = zone), syncDelayPerDayMs = 0, now = { now }, zone = zone)
    private val context = SessionContext(DemoDevice.ADDRESS, credentials = { null })

    private fun scriptedGatt(reply: ByteArray = MockWatchProtocol.ACK) =
        FakeGattClient(listOf(MockWatchProtocol.CONTROL_CHAR, MockWatchProtocol.EVENTS_CHAR), address = DemoDevice.ADDRESS).also { gatt ->
            gatt.onWrite = { char, value ->
                if (char == MockWatchProtocol.CONTROL_CHAR && value.contentEquals(MockWatchProtocol.HELLO)) gatt.notify(MockWatchProtocol.EVENTS_CHAR, reply)
            }
        }

    @Test
    fun `recognises only its own advertisement`() {
        assertEquals(RecognitionScore.VENDOR_MANUFACTURER_DATA, driver.recognize(MockWatchProtocol.advertisement()))
        assertEquals(RecognitionScore.NONE, driver.recognize(Advertisement("AA:BB:CC:DD:EE:FF", "Forerunner 265", rssi = -60)))
    }

    @Test
    fun `handshake over GATT opens a session`() = runTest {
        val gatt = scriptedGatt()
        val session = driver.openSession(gatt, context)
        assertTrue(DeviceCapability.HISTORY_SYNC in session.capabilities)
        assertEquals(MockWatchProtocol.HELLO.toList(), gatt.writes.single().value.toList())
        assertEquals(DemoDevice.MODEL, session.readDeviceInfo().model)
    }

    @Test(expected = AuthenticationException::class)
    fun `a wrong handshake reply is rejected`() = runTest {
        driver.openSession(scriptedGatt(reply = byteArrayOf(0)), context)
    }

    @Test
    fun `the in-memory link answers the handshake too`() = runTest {
        val gatt = MockWatchVirtualDevice().connect()
        driver.openSession(gatt, context)
        gatt.close()
        assertTrue(!gatt.connected.value)
    }

    @Test
    fun `first sync delivers 90 days with progress, incremental sync only the gap`() = runTest {
        val session = driver.openSession(scriptedGatt(), context)
        val sink = RecordingSink()
        val progress = mutableListOf<Float>()
        val count = session.sync(SyncRequest(since = null, now = now), sink) { progress += it }
        assertEquals(sink.records.size, count)
        assertEquals(90, sink.ofType<HealthRecord.DailyActivity>().size)
        assertEquals(1f, progress.last())
        assertTrue(sink.records.none { it is HealthRecord.HeartRate && it.time.isAfter(now) })

        val incremental = RecordingSink()
        session.sync(SyncRequest(since = now.minusSeconds(86_400), now = now), incremental) { }
        assertEquals(2, incremental.ofType<HealthRecord.DailyActivity>().size)
    }
}
