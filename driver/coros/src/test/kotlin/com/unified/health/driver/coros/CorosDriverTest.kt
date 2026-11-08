package com.unified.health.driver.coros

import com.unified.health.core.ble.driver.RecognitionScore
import com.unified.health.core.ble.driver.SessionContext
import com.unified.health.core.ble.driver.SyncRequest
import com.unified.health.core.ble.gatt.GattCharacteristic.Companion.PROPERTY_NOTIFY
import com.unified.health.core.ble.gatt.GattCharacteristic.Companion.PROPERTY_READ
import com.unified.health.core.ble.gatt.StandardUuids
import com.unified.health.core.ble.scan.Advertisement
import com.unified.health.core.model.DeviceCapability
import com.unified.health.core.model.HealthRecord
import com.unified.health.core.testing.FakeGattClient
import com.unified.health.core.testing.RecordingSink
import com.unified.health.core.testing.characteristic
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class CorosDriverTest {

    private val noCredentials = SessionContext("AA:BB:CC:DD:EE:FF", credentials = { null })

    @Test
    fun `recognises a COROS name prefix`() {
        val driver = CorosDriver()
        assertEquals(RecognitionScore.NAME, driver.recognize(Advertisement("A", "COROS PACE 2", -50)))
        assertEquals(RecognitionScore.NAME, driver.recognize(Advertisement("A", "COROS VERTIX 2", -60)))
        assertEquals(RecognitionScore.NONE, driver.recognize(Advertisement("A", "VERTIX 2", -60)))
        assertEquals(RecognitionScore.NONE, driver.recognize(Advertisement("B", "Some Other Watch", -50)))
        assertEquals(RecognitionScore.NONE, driver.recognize(Advertisement("C", null, -50)))
    }

    @Test
    fun `recognises the custom weloop uart service over a bare name match`() {
        val driver = CorosDriver()
        val withService = Advertisement(
            "A",
            "unnamed",
            -50,
            serviceUuids = setOf(CorosUuids.WELOOP_UART_SERVICE),
        )
        assertEquals(RecognitionScore.VENDOR_SERVICE, driver.recognize(withService))
        assertTrue(RecognitionScore.VENDOR_SERVICE > RecognitionScore.NAME)
    }

    @Test
    fun `bonds and requests an mtu before the handshake`() {
        val driver = CorosDriver()
        assertTrue(driver.linkRequirements.bond)
        assertEquals(CorosDriver.REQUESTED_MTU, driver.linkRequirements.mtu)
    }

    @Test
    fun `session only exposes standard capabilities it can actually back`() = runTest {
        val battery = characteristic(StandardUuids.BATTERY_SERVICE, StandardUuids.BATTERY_LEVEL, PROPERTY_READ)
        val gatt = FakeGattClient(listOf(battery))
        val session = CorosDriver().openSession(gatt, noCredentials)

        assertEquals(setOf(DeviceCapability.BATTERY_LEVEL), session.capabilities)
        assertEquals(0, session.sync(SyncRequest(since = null), RecordingSink()) { _, _ -> })
        session.close()
    }

    @Test
    fun `session opportunistically forwards standard heart rate notifications`() = runTest {
        val hrMeasurement = characteristic(StandardUuids.HEART_RATE_SERVICE, StandardUuids.HEART_RATE_MEASUREMENT, PROPERTY_NOTIFY)
        val gatt = FakeGattClient(listOf(hrMeasurement))
        val session = CorosSession(gatt, dispatcher = StandardTestDispatcher(testScheduler))
        session.start()

        assertEquals(setOf(DeviceCapability.LIVE_HEART_RATE, DeviceCapability.HISTORY_SYNC), session.capabilities)
        gatt.notify(hrMeasurement, byteArrayOf(0x00, 64))
        testScheduler.advanceUntilIdle()

        val sink = RecordingSink()
        val count = session.sync(SyncRequest(since = null), sink) { _, _ -> }
        assertEquals(1, count)
        assertEquals(listOf(64), sink.ofType<HealthRecord.HeartRate>().map { it.bpm })
        session.close()
    }
}
