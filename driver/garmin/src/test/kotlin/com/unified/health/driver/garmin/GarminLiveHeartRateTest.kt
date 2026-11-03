package com.unified.health.driver.garmin

import com.unified.health.core.ble.gatt.GattCharacteristic.Companion.PROPERTY_NOTIFY
import com.unified.health.core.ble.gatt.StandardGattReader
import com.unified.health.core.ble.gatt.StandardUuids
import com.unified.health.core.model.DeviceCapability
import com.unified.health.core.model.HealthRecord
import com.unified.health.core.testing.FakeGattClient
import com.unified.health.core.testing.characteristic
import com.unified.health.driver.garmin.codec.HostIdentity
import com.unified.health.driver.garmin.codec.MultiLinkCodec
import com.unified.health.driver.garmin.codec.RealtimeHeartRate
import com.unified.health.driver.garmin.codec.RegisterStatus
import com.unified.health.driver.garmin.testing.FakeGarminWatch
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.launch
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.TestScope
import kotlinx.coroutines.test.advanceTimeBy
import kotlinx.coroutines.test.runCurrent
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Test
import java.time.Clock
import java.time.Instant
import java.time.ZoneOffset

@OptIn(ExperimentalCoroutinesApi::class)
class GarminLiveHeartRateTest {

    private val now = Instant.parse("2026-03-02T12:00:00Z")
    private val clock = Clock.fixed(now, ZoneOffset.UTC)
    private val hr = characteristic(StandardUuids.HEART_RATE_SERVICE, StandardUuids.HEART_RATE_MEASUREMENT, PROPERTY_NOTIFY)

    private fun TestScope.standardOnly(gatt: FakeGattClient) = GarminLiveHeartRate(
        sources = listOf(CharacteristicHeartRateSource("HRP", gatt, hr, StandardGattReader::parseHeartRateMeasurement)),
        scope = backgroundScope,
        clock = clock,
    )

    private fun TestScope.config() = GarminSessionConfig(
        host = HostIdentity(appVersion = 1, friendlyName = "UH", manufacturer = "Google", model = "Pixel"),
        multiLinkClientId = 0x1122334455667788L,
        dispatcher = StandardTestDispatcher(testScheduler),
        clock = clock,
    )

    // --- Realtime payload (xm2/i.java) ---

    @Test
    fun `realtime payload decodes source and the four heart-rate fields`() {
        val sample = RealtimeHeartRate.decode(byteArrayOf(0x03, 0x48, 0x3A, 0x30, 0x9C.toByte()))
        assertEquals(RealtimeHeartRate(RealtimeHeartRate.Source.OHR_LOCKED, 72, 58, 48, 156), sample)
    }

    @Test
    fun `realtime 0xFF fields are unknown, short frames rejected, unknown source maps to NO_SOURCE`() {
        val unknown = RealtimeHeartRate.decode(byteArrayOf(0x00, -1, -1, -1, -1))
        assertEquals(RealtimeHeartRate(RealtimeHeartRate.Source.NO_SOURCE, null, null, null, null), unknown)
        assertNull(RealtimeHeartRate.decode(byteArrayOf(0x02, 70, 60, 50)))
        assertEquals(RealtimeHeartRate.Source.NO_SOURCE, RealtimeHeartRate.decode(byteArrayOf(9, 70, 60, 50, 90))?.source)
        assertEquals(70, RealtimeHeartRate.decode(byteArrayOf(1, 70, 60, 50, 90, 0x11))?.heartRate) // trailing bytes ignored
    }

    // --- Standard Heart Rate Profile source ---

    @Test
    fun `subscribes only when collected and emits parsed samples`() = runTest {
        val gatt = FakeGattClient(listOf(hr))
        val live = standardOnly(gatt)
        assertFalse(gatt.isSubscribed(hr))

        val received = mutableListOf<HealthRecord.HeartRate>()
        val job = backgroundScope.launch { live.flow.toList(received) }
        runCurrent()
        assertTrue(gatt.isSubscribed(hr))

        gatt.notify(hr, byteArrayOf(0x00, 72))
        gatt.notify(hr, byteArrayOf(0x01, 0x2C, 0x00)) // uint16 44 bpm
        runCurrent()

        assertEquals(listOf(HealthRecord.HeartRate(now, 72), HealthRecord.HeartRate(now, 44)), received)
        job.cancel()
    }

    @Test
    fun `zero, implausible and malformed values are dropped`() = runTest {
        val gatt = FakeGattClient(listOf(hr))
        val live = standardOnly(gatt)
        val received = mutableListOf<HealthRecord.HeartRate>()
        val job = backgroundScope.launch { live.flow.toList(received) }
        runCurrent()

        gatt.notify(hr, byteArrayOf(0x00, 0)) // sensor not in contact
        gatt.notify(hr, byteArrayOf(0x00, 251.toByte())) // above 250
        gatt.notify(hr, byteArrayOf(0x00)) // too short
        gatt.notify(hr, byteArrayOf(0x00, 250.toByte())) // boundary is kept
        runCurrent()

        assertEquals(listOf(HealthRecord.HeartRate(now, 250)), received)
        job.cancel()
    }

    @Test
    fun `last collector leaving unsubscribes and a later collector subscribes again`() = runTest {
        val gatt = FakeGattClient(listOf(hr))
        val live = standardOnly(gatt)

        val a = backgroundScope.launch { live.flow.collect { } }
        val b = backgroundScope.launch { live.flow.collect { } }
        runCurrent()
        assertTrue(gatt.isSubscribed(hr))

        a.cancel()
        runCurrent()
        assertTrue(gatt.isSubscribed(hr)) // b is still watching

        b.cancel()
        runCurrent()
        assertFalse(gatt.isSubscribed(hr))

        val received = mutableListOf<HealthRecord.HeartRate>()
        val c = backgroundScope.launch { live.flow.toList(received) }
        runCurrent()
        assertTrue(gatt.isSubscribed(hr))
        gatt.notify(hr, byteArrayOf(0x00, 62))
        runCurrent()
        assertEquals(listOf(62), received.map { it.bpm })
        c.cancel()
        runCurrent()
        assertFalse(gatt.isSubscribed(hr))
    }

    @Test
    fun `characteristic without notify or indicate is not usable`() {
        val readOnly = characteristic(StandardUuids.HEART_RATE_SERVICE, StandardUuids.HEART_RATE_MEASUREMENT, 0x02)
        assertNull(GarminLiveHeartRate.findMeasurement(FakeGattClient(listOf(readOnly))))
        assertNull(GarminLiveHeartRate.findMeasurement(FakeGattClient(emptyList())))
        assertNotNull(GarminLiveHeartRate.findMeasurement(FakeGattClient(listOf(hr))))
    }

    // --- Multi-Link service 6 inside a session ---

    @Test
    fun `multi-link watch streams REAL_TIME_HR, closes the handle on the last collector and reopens`() = runTest {
        val watch = FakeGarminWatch(multiLink = true).apply { realtimeRegisterStatus = RegisterStatus.SUCCESS }
        val session = GarminSession.open(watch.gatt, config())
        assertTrue(DeviceCapability.LIVE_HEART_RATE in session.capabilities)
        assertNull(watch.registrations[MultiLinkCodec.SERVICE_REAL_TIME_HR]) // nothing until somebody watches

        val received = mutableListOf<HealthRecord.HeartRate>()
        val job = backgroundScope.launch { session.liveHeartRate.toList(received) }
        runCurrent()
        assertEquals(1, watch.registrations[MultiLinkCodec.SERVICE_REAL_TIME_HR])

        watch.sendRealtime(byteArrayOf(0x03, 0x48, 0x3A, 0x30, 0x9C.toByte()))
        watch.sendRealtime(byteArrayOf(0x02, -1, 0x3A, 0x30, 0x9C.toByte())) // bpm unknown: dropped
        watch.sendRealtime(byteArrayOf(0x03, 0x4B)) // malformed: dropped
        runCurrent()
        assertEquals(listOf(HealthRecord.HeartRate(now, 72)), received)

        job.cancel()
        runCurrent()
        assertEquals(listOf(MultiLinkCodec.SERVICE_REAL_TIME_HR to FakeGarminWatch.REALTIME_HANDLE), watch.closedHandles)

        val again = mutableListOf<HealthRecord.HeartRate>()
        val second = backgroundScope.launch { session.liveHeartRate.toList(again) }
        runCurrent()
        assertEquals(2, watch.registrations[MultiLinkCodec.SERVICE_REAL_TIME_HR])
        watch.sendRealtime(byteArrayOf(0x03, 0x50, -1, -1, -1))
        runCurrent()
        assertEquals(listOf(80), again.map { it.bpm })
        second.cancel()
        session.close()
    }

    @Test
    fun `falls back to the Heart Rate Profile when the watch refuses REAL_TIME_HR, and does not retry it`() = runTest {
        val watch = FakeGarminWatch(multiLink = true, heartRateService = true)
            .apply { realtimeRegisterStatus = RegisterStatus.INVALID_SERVICE_ID }
        val session = GarminSession.open(watch.gatt, config())

        val received = mutableListOf<HealthRecord.HeartRate>()
        val job = backgroundScope.launch { session.liveHeartRate.toList(received) }
        runCurrent()
        assertEquals(1, watch.registrations[MultiLinkCodec.SERVICE_REAL_TIME_HR])
        assertTrue(watch.gatt.isSubscribed(watch.heartRate))
        watch.gatt.notify(watch.heartRate, byteArrayOf(0x00, 88))
        runCurrent()
        assertEquals(listOf(HealthRecord.HeartRate(now, 88)), received)
        job.cancel()
        runCurrent()
        assertFalse(watch.gatt.isSubscribed(watch.heartRate))
        assertTrue(watch.closedHandles.isEmpty())

        val second = backgroundScope.launch { session.liveHeartRate.collect { } }
        runCurrent()
        assertEquals(1, watch.registrations[MultiLinkCodec.SERVICE_REAL_TIME_HR])
        assertTrue(watch.gatt.isSubscribed(watch.heartRate))
        second.cancel()
        session.close()
    }

    @Test
    fun `an unanswered REAL_TIME_HR registration times out and falls back`() = runTest {
        val watch = FakeGarminWatch(multiLink = true, heartRateService = true).apply { realtimeRegisterStatus = null }
        val session = GarminSession.open(watch.gatt, config())

        val job = backgroundScope.launch { session.liveHeartRate.collect { } }
        runCurrent()
        assertEquals(1, watch.registrations[MultiLinkCodec.SERVICE_REAL_TIME_HR])
        assertFalse(watch.gatt.isSubscribed(watch.heartRate))
        advanceTimeBy(10_001)
        runCurrent()
        assertTrue(watch.gatt.isSubscribed(watch.heartRate))
        job.cancel()
        session.close()
    }

    @Test
    fun `a dedicated realtime service is used instead of Multi-Link`() = runTest {
        val watch = FakeGarminWatch(multiLink = true, realtimeService = true).apply { realtimeRegisterStatus = RegisterStatus.SUCCESS }
        val session = GarminSession.open(watch.gatt, config())

        val received = mutableListOf<HealthRecord.HeartRate>()
        val job = backgroundScope.launch { session.liveHeartRate.toList(received) }
        runCurrent()
        assertNull(watch.registrations[MultiLinkCodec.SERVICE_REAL_TIME_HR])
        assertTrue(watch.gatt.isSubscribed(watch.realtimeHeartRate))
        watch.gatt.notify(watch.realtimeHeartRate, byteArrayOf(0x03, 0x41, 0x3A, 0x30, 0x9C.toByte()))
        runCurrent()
        assertEquals(listOf(65), received.map { it.bpm })
        job.cancel()
        runCurrent()
        assertFalse(watch.gatt.isSubscribed(watch.realtimeHeartRate))
        session.close()
    }

    @Test
    fun `live heart rate is offered only when some source can exist`() = runTest {
        val dedicatedGfdiOnly = GarminSession.open(FakeGarminWatch(multiLink = false).also { w ->
            backgroundScope.launch { w.announceWhenSubscribed() }
        }.gatt, config())
        assertFalse(DeviceCapability.LIVE_HEART_RATE in dedicatedGfdiOnly.capabilities)
        assertEquals(emptyList<HealthRecord.HeartRate>(), dedicatedGfdiOnly.liveHeartRate.toList())
        dedicatedGfdiOnly.close()

        val multiLink = GarminSession.open(FakeGarminWatch(multiLink = true).gatt, config())
        assertTrue(DeviceCapability.LIVE_HEART_RATE in multiLink.capabilities)
        multiLink.close()
    }
}
