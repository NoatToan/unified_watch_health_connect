package com.unified.health.driver.standard

import com.unified.health.core.ble.driver.RecognitionScore
import com.unified.health.core.ble.driver.SessionContext
import com.unified.health.core.ble.driver.SyncRequest
import com.unified.health.core.ble.driver.UnsupportedDeviceException
import com.unified.health.core.ble.gatt.GattCharacteristic.Companion.PROPERTY_NOTIFY
import com.unified.health.core.ble.gatt.GattCharacteristic.Companion.PROPERTY_READ
import com.unified.health.core.ble.gatt.StandardUuids
import com.unified.health.core.ble.scan.Advertisement
import com.unified.health.core.model.HealthRecord
import com.unified.health.core.testing.FakeGattClient
import com.unified.health.core.testing.RecordingSink
import com.unified.health.core.testing.characteristic
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Test

class StandardProfileDriverTest {

    private val hrMeasurement = characteristic(StandardUuids.HEART_RATE_SERVICE, StandardUuids.HEART_RATE_MEASUREMENT, PROPERTY_NOTIFY)
    private val battery = characteristic(StandardUuids.BATTERY_SERVICE, StandardUuids.BATTERY_LEVEL, PROPERTY_READ)
    private val noCredentials = SessionContext("AA:BB:CC:DD:EE:FF", credentials = { null })

    @Test
    fun `recognises the heart rate service only`() {
        val driver = StandardProfileDriver()
        val hr = Advertisement("A", "Polar", -50, serviceUuids = setOf(StandardUuids.HEART_RATE_SERVICE))
        assertEquals(RecognitionScore.STANDARD_SERVICE, driver.recognize(hr))
        assertEquals(RecognitionScore.NONE, driver.recognize(Advertisement("B", "Speaker", -50)))
    }

    @Test(expected = UnsupportedDeviceException::class)
    fun `fails without heart rate service`() = runTest {
        StandardProfileDriver().openSession(FakeGattClient(listOf(battery)), noCredentials)
    }

    @Test
    fun `buffers notifications and hands them over on sync`() = runTest {
        val gatt = FakeGattClient(listOf(hrMeasurement, battery))
        val session = StandardProfileSession(gatt, hrMeasurement, dispatcher = StandardTestDispatcher(testScheduler))
        session.start()
        gatt.notify(hrMeasurement, byteArrayOf(0x00, 72))
        gatt.notify(hrMeasurement, byteArrayOf(0x01, 0x2C, 0x01)) // uint16 = 300
        gatt.notify(hrMeasurement, byteArrayOf(0x00, 0)) // no skin contact: dropped
        testScheduler.advanceUntilIdle()

        val sink = RecordingSink()
        val count = session.sync(SyncRequest(since = null), sink) {}

        assertEquals(2, count)
        assertEquals(listOf(72, 300), sink.ofType<HealthRecord.HeartRate>().map { it.bpm })
        assertEquals(0, session.sync(SyncRequest(since = null), RecordingSink()) {})
        session.close()
    }
}
