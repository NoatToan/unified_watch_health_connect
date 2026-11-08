package com.unified.health.driver.standard

import com.unified.health.core.ble.HealthRecordSink
import com.unified.health.core.ble.driver.RecognitionScore
import com.unified.health.core.ble.driver.SessionContext
import com.unified.health.core.ble.driver.SyncRequest
import com.unified.health.core.ble.driver.UnsupportedDeviceException
import com.unified.health.core.ble.driver.WearableProtocolException
import com.unified.health.core.ble.gatt.GattCharacteristic.Companion.PROPERTY_INDICATE
import com.unified.health.core.ble.gatt.GattCharacteristic.Companion.PROPERTY_NOTIFY
import com.unified.health.core.ble.gatt.GattCharacteristic.Companion.PROPERTY_READ
import com.unified.health.core.ble.gatt.GattCharacteristic.Companion.PROPERTY_WRITE
import com.unified.health.core.ble.gatt.StandardUuids
import com.unified.health.core.ble.gatt.sigUuid
import com.unified.health.core.ble.protocol.bytesOf
import com.unified.health.core.ble.scan.Advertisement
import com.unified.health.core.model.DeviceCapability
import com.unified.health.core.model.HealthRecord
import com.unified.health.core.testing.FakeGattClient
import com.unified.health.core.testing.RecordingSink
import com.unified.health.core.testing.characteristic
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.TestScope
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Assert.fail
import org.junit.Test
import java.time.Clock
import java.time.Instant
import java.time.ZoneId
import java.time.ZoneOffset

class StandardProfileDriverTest {

    private val hr = characteristic(SigUuids.HEART_RATE_SERVICE, SigUuids.HEART_RATE_MEASUREMENT, PROPERTY_NOTIFY)
    private val battery = characteristic(SigUuids.BATTERY_SERVICE, SigUuids.BATTERY_LEVEL, PROPERTY_READ)
    private val model = characteristic(SigUuids.DEVICE_INFORMATION_SERVICE, StandardUuids.MODEL_NUMBER, PROPERTY_READ)
    private val currentTime = characteristic(SigUuids.CURRENT_TIME_SERVICE, SigUuids.CURRENT_TIME, PROPERTY_READ, PROPERTY_WRITE, PROPERTY_NOTIFY)
    private val spotCheck = characteristic(SigUuids.PULSE_OXIMETER_SERVICE, SigUuids.PLX_SPOT_CHECK, PROPERTY_INDICATE)
    private val racp = characteristic(SigUuids.PULSE_OXIMETER_SERVICE, SigUuids.RECORD_ACCESS_CONTROL_POINT, PROPERTY_WRITE, PROPERTY_INDICATE)
    private val plxContinuous = characteristic(SigUuids.PULSE_OXIMETER_SERVICE, SigUuids.PLX_CONTINUOUS, PROPERTY_NOTIFY)
    private val rsc = characteristic(SigUuids.RSC_SERVICE, SigUuids.RSC_MEASUREMENT, PROPERTY_NOTIFY)
    private val bloodPressure = characteristic(SigUuids.BLOOD_PRESSURE_SERVICE, SigUuids.BLOOD_PRESSURE_MEASUREMENT, PROPERTY_INDICATE)

    private val zone: ZoneId = ZoneOffset.UTC
    private val t0: Instant = Instant.parse("2026-11-06T10:00:00Z")
    private val clock = MutableClock(t0)
    private val context = SessionContext("AA:BB:CC:DD:EE:FF", credentials = { null })

    /** 2026-11-05 08:30:00, stored spot-check: SpO2 97 %, PR 64, status "from storage". */
    private val storedSpotCheck = bytesOf(0x03, 0x61, 0x00, 0x40, 0x00, 0xEA, 0x07, 0x0B, 0x05, 0x08, 0x1E, 0x00, 0x00, 0x02)

    private fun TestScope.driver() = StandardProfileDriver(clock, { zone }, StandardTestDispatcher(testScheduler))

    private fun fullDevice() = FakeGattClient(listOf(hr, battery, model, currentTime, spotCheck, racp, rsc, bloodPressure)).apply {
        readValues[StandardUuids.MODEL_NUMBER] = "H10".toByteArray()
        readValues[SigUuids.BATTERY_LEVEL] = bytesOf(87)
    }

    /** Answers "report all stored records" with [records] then the given RACP response value. */
    private fun FakeGattClient.scriptRacp(records: List<ByteArray>, response: Int = 0x01) {
        onWrite = { c, value ->
            if (c == racp && value.contentEquals(bytesOf(0x01, 0x01))) {
                records.forEach { notify(spotCheck, it) }
                notify(racp, bytesOf(0x06, 0x00, 0x01, response))
            }
        }
    }

    @Test
    fun `recognises every supported SIG health service at the standard score`() {
        val driver = StandardProfileDriver()
        listOf(SigUuids.HEART_RATE_SERVICE, SigUuids.PULSE_OXIMETER_SERVICE, SigUuids.RSC_SERVICE, SigUuids.BLOOD_PRESSURE_SERVICE,
            SigUuids.HEALTH_THERMOMETER_SERVICE, SigUuids.WEIGHT_SCALE_SERVICE, SigUuids.BODY_COMPOSITION_SERVICE).forEach {
            assertEquals("$it", RecognitionScore.STANDARD_SERVICE, driver.recognize(Advertisement("A", "Polar H10", -50, serviceUuids = setOf(it))))
        }
        val hrServiceData = Advertisement("A", null, -50, serviceData = mapOf(SigUuids.HEART_RATE_SERVICE to byteArrayOf()))
        assertEquals(RecognitionScore.STANDARD_SERVICE, driver.recognize(hrServiceData))
    }

    @Test
    fun `ignores devices without a health service and yields to vendor drivers`() {
        val driver = StandardProfileDriver()
        assertEquals(RecognitionScore.NONE, driver.recognize(Advertisement("B", "Speaker", -50)))
        assertEquals(RecognitionScore.NONE, driver.recognize(Advertisement("B", "Pen", -50, serviceUuids = setOf(SigUuids.BATTERY_SERVICE))))
        assertEquals(RecognitionScore.NONE, driver.recognize(Advertisement("B", "Bike", -50, serviceUuids = setOf(SigUuids.CSC_SERVICE))))
        assertTrue(RecognitionScore.VENDOR_SERVICE > RecognitionScore.STANDARD_SERVICE)
        assertTrue(RecognitionScore.VENDOR_MANUFACTURER_DATA > RecognitionScore.STANDARD_SERVICE)
    }

    @Test(expected = UnsupportedDeviceException::class)
    fun `open fails without any health service`() = runTest {
        driver().openSession(FakeGattClient(listOf(battery, model)), context)
    }

    @Test
    fun `open writes the phone time and enables every measurement`() = runTest {
        val gatt = fullDevice()
        val session = driver().openSession(gatt, context) as StandardProfileSession

        val timeWrite = gatt.writes.single { it.characteristic == currentTime }
        assertArrayEquals(bytesOf(0xEA, 0x07, 0x0B, 0x06, 0x0A, 0x00, 0x00, 0x05, 0x00, 0x01), timeWrite.value)
        listOf(hr, spotCheck, racp, rsc, bloodPressure).forEach { assertTrue("${it.uuid}", gatt.isSubscribed(it)) }
        assertEquals(
            setOf(DeviceCapability.HISTORY_SYNC, DeviceCapability.LIVE_HEART_RATE, DeviceCapability.BATTERY_LEVEL),
            session.capabilities,
        )
        assertEquals("H10", session.readDeviceInfo().model)
        assertEquals(87, session.readDeviceInfo().batteryPercent)
        session.close()
    }

    @Test
    fun `read-only current time is left alone`() = runTest {
        val readOnly = characteristic(SigUuids.CURRENT_TIME_SERVICE, SigUuids.CURRENT_TIME, PROPERTY_READ, PROPERTY_NOTIFY)
        val gatt = FakeGattClient(listOf(hr, readOnly))
        driver().openSession(gatt, context).close()
        assertTrue(gatt.writes.isEmpty())
    }

    @Test
    fun `sync delivers live, derived, stored and raw records`() = runTest {
        val gatt = fullDevice()
        gatt.scriptRacp(listOf(storedSpotCheck))
        val session = driver().openSession(gatt, context)

        // 70 s of heart rate (1 Hz, RR alternating 800/820 ms) and running at 120 steps/min.
        for (s in 0 until 70) {
            clock.now = t0.plusSeconds(s.toLong())
            val rr = if (s % 2 == 0) 819 else 840 // 1/1024 s → 799 / 820 ms
            gatt.notify(hr, bytesOf(0x16, 72, rr and 0xFF, rr shr 8))
            gatt.notify(rsc, bytesOf(0x00, 0x00, 0x03, 120))
            testScheduler.advanceUntilIdle()
        }
        gatt.notify(hr, bytesOf(0x01, 0x2C)) // truncated: dropped, stream keeps going
        gatt.notify(bloodPressure, bytesOf(0x00, 0x78, 0x00, 0x50, 0x00, 0x5D, 0x00))

        val sink = RecordingSink()
        val progress = mutableListOf<Float>()
        val count = session.sync(SyncRequest(since = null, now = clock.now), sink) { fraction, _ -> progress += fraction }

        assertEquals(70, sink.ofType<HealthRecord.HeartRate>().size)
        assertTrue(sink.ofType<HealthRecord.HeartRate>().all { it.bpm == 72 })
        val hrv = sink.ofType<HealthRecord.HeartRateVariability>()
        assertEquals(1, hrv.size)
        assertEquals(21, hrv.single().milliseconds)
        assertEquals(listOf(HealthRecord.SpO2(Instant.parse("2026-11-05T08:30:00Z"), 97)), sink.ofType<HealthRecord.SpO2>())
        val steps = sink.ofType<HealthRecord.Steps>()
        assertEquals(listOf(t0, t0.plusSeconds(60)), steps.map { it.start })
        assertEquals(120, steps[0].count)
        assertEquals(18, steps[1].count) // 10:01:00 → 10:01:09
        val raw = sink.ofType<HealthRecord.RawPayload>().single()
        assertEquals("sig_blood_pressure", raw.kind)
        assertEquals(sink.records.size - 1, count)
        assertEquals(1f, progress.last())

        // Everything was handed over; a second sync only re-reads the (idempotent) stored record.
        val again = RecordingSink()
        session.sync(SyncRequest(since = clock.now), again) { _, _ -> }
        assertEquals(1, again.ofType<HealthRecord.SpO2>().size)
        assertTrue(again.ofType<HealthRecord.HeartRate>().isEmpty())
        session.close()
    }

    @Test
    fun `live heart rate is streamed as it arrives`() = runTest {
        val gatt = fullDevice()
        val session = driver().openSession(gatt, context)
        gatt.notify(hr, bytesOf(0x00, 65))
        assertEquals(65, session.liveHeartRate.first().bpm)
        session.close()
    }

    @Test
    fun `samples streamed before a link loss are delivered after reconnecting`() = runTest {
        val driver = driver()
        val first = fullDevice()
        val session = driver.openSession(first, context)
        first.notify(hr, bytesOf(0x00, 80))
        testScheduler.advanceUntilIdle()
        first.disconnect()
        session.close()

        val second = fullDevice()
        second.scriptRacp(emptyList(), response = 0x06)
        val resumed = driver.openSession(second, context)
        val sink = RecordingSink()
        resumed.sync(SyncRequest(since = null), sink) { _, _ -> }
        assertEquals(listOf(80), sink.ofType<HealthRecord.HeartRate>().map { it.bpm })
        resumed.close()
    }

    @Test
    fun `records stay buffered when the sink fails`() = runTest {
        val gatt = FakeGattClient(listOf(hr))
        val session = driver().openSession(gatt, context)
        gatt.notify(hr, bytesOf(0x00, 90))
        val failing = HealthRecordSink { throw IllegalStateException("disk full") }
        runCatching { session.sync(SyncRequest(since = null), failing) { _, _ -> } }.onSuccess { fail("sink error must propagate") }

        val sink = RecordingSink()
        assertEquals(1, session.sync(SyncRequest(since = null), sink) { _, _ -> })
        assertEquals(90, sink.ofType<HealthRecord.HeartRate>().single().bpm)
        session.close()
    }

    @Test
    fun `a refused stored-record transfer still delivers live data then reports the error`() = runTest {
        val gatt = fullDevice()
        gatt.scriptRacp(emptyList(), response = 0x04)
        val session = driver().openSession(gatt, context)
        gatt.notify(hr, bytesOf(0x00, 70))
        val sink = RecordingSink()
        val error = runCatching { session.sync(SyncRequest(since = null), sink) { _, _ -> } }.exceptionOrNull()
        assertTrue(error is WearableProtocolException)
        assertTrue(error!!.message!!.contains("operator not supported"))
        assertEquals(1, sink.ofType<HealthRecord.HeartRate>().size)
        session.close()
    }

    @Test
    fun `a silent oximeter times out the stored-record transfer and is aborted`() = runTest {
        val gatt = fullDevice() // no RACP script: the device never answers
        val session = driver().openSession(gatt, context)
        val error = runCatching { session.sync(SyncRequest(since = null), RecordingSink()) { _, _ -> } }.exceptionOrNull()
        assertTrue(error is WearableProtocolException)
        assertArrayEquals(bytesOf(0x03, 0x00), gatt.writes.last { it.characteristic == racp }.value)
        session.close()
    }

    @Test
    fun `pulse oximeter without heart rate service provides spo2 and pulse rate`() = runTest {
        val gatt = FakeGattClient(listOf(plxContinuous))
        val session = driver().openSession(gatt, context)
        assertFalse(DeviceCapability.LIVE_HEART_RATE in session.capabilities)
        fun notifyAt(second: Long, value: ByteArray) {
            clock.now = t0.plusSeconds(second)
            gatt.notify(plxContinuous, value)
            testScheduler.advanceUntilIdle()
        }
        notifyAt(0, bytesOf(0x00, 0x62, 0x00, 0x48, 0x00)) // 98 %, 72 bpm
        notifyAt(2, bytesOf(0x00, 0x61, 0x00, 0x48, 0x00)) // throttled (< 10 s)
        notifyAt(12, bytesOf(0x04, 0x60, 0x00, 0x48, 0x00, 0x00, 0x80)) // status "invalid": dropped
        notifyAt(12, bytesOf(0x00, 0x60, 0x00, 0x46, 0x00))

        val sink = RecordingSink()
        session.sync(SyncRequest(since = null), sink) { _, _ -> }
        assertEquals(listOf(98, 96), sink.ofType<HealthRecord.SpO2>().map { it.percent })
        assertEquals(listOf(72, 70), sink.ofType<HealthRecord.HeartRate>().map { it.bpm })
        session.close()
    }

    @Test
    fun `unsupported optional characteristics do not block the session`() = runTest {
        val cscOnlyExtra = characteristic(sigUuid(0x1816), sigUuid(0x2A5B), PROPERTY_NOTIFY)
        val gatt = FakeGattClient(listOf(hr, cscOnlyExtra))
        val session = driver().openSession(gatt, context) as StandardProfileSession
        assertEquals(listOf("heart rate"), session.activeMeasurements)
        assertFalse(gatt.isSubscribed(cscOnlyExtra))
        session.close()
    }

    @Test
    fun `fails clearly when the link drops during the handshake`() = runTest {
        val gatt = FakeGattClient(listOf(hr))
        gatt.disconnect()
        val error = runCatching { driver().openSession(gatt, context) }.exceptionOrNull()
        assertTrue("$error", error is WearableProtocolException)
    }
}

/** Test clock whose instant is set by hand. */
internal class MutableClock(var now: Instant, private val zone: ZoneId = ZoneOffset.UTC) : Clock() {
    override fun getZone(): ZoneId = zone
    override fun withZone(zone: ZoneId): Clock = MutableClockView(this, zone)
    override fun instant(): Instant = now
}

private class MutableClockView(private val source: MutableClock, private val zone: ZoneId) : Clock() {
    override fun getZone(): ZoneId = zone
    override fun withZone(zone: ZoneId): Clock = MutableClockView(source, zone)
    override fun instant(): Instant = source.instant()
}
