package com.unified.health.driver.zepp

import com.unified.health.core.ble.driver.SessionContext
import com.unified.health.core.ble.gatt.GattDisconnectedException
import com.unified.health.core.ble.gatt.WriteType
import com.unified.health.core.model.DeviceCapability
import com.unified.health.core.model.HealthRecord
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.launch
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.TestScope
import kotlinx.coroutines.test.advanceTimeBy
import kotlinx.coroutines.test.advanceUntilIdle
import kotlinx.coroutines.test.runCurrent
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test
import java.time.ZoneOffset
import java.util.Random

@OptIn(ExperimentalCoroutinesApi::class)
class ZeppLiveHeartRateTest {

    private val authKey = ByteArray(16) { it.toByte() }
    private val withKey = SessionContext("AA:BB:CC:DD:EE:FF", credentials = { key -> if (key == "zepp.auth_key") authKey else null })

    private suspend fun TestScope.session(watch: FakeZeppWatch) =
        ZeppDriver(StandardTestDispatcher(testScheduler), { ZoneOffset.UTC }, Random(1)).openSession(watch.gatt, withKey)

    private fun FakeZeppWatch.controlWrites() = gatt.writes.filter { it.characteristic == hrControl }

    @Test
    fun `capability only when both heart-rate characteristics exist`() = runTest {
        assertFalse(DeviceCapability.LIVE_HEART_RATE in session(FakeZeppWatch(authKey)).capabilities)
        assertTrue(DeviceCapability.LIVE_HEART_RATE in session(FakeZeppWatch(authKey, hasHeartRate = true)).capabilities)
    }

    @Test
    fun `without the characteristics the flow is empty`() = runTest {
        assertEquals(emptyList<HealthRecord.HeartRate>(), session(FakeZeppWatch(authKey)).liveHeartRate.toList())
    }

    @Test
    fun `nothing is written until the flow is collected`() = runTest {
        val watch = FakeZeppWatch(authKey, hasHeartRate = true)
        session(watch)
        advanceUntilIdle()
        assertTrue(watch.controlWrites().isEmpty())
        assertFalse(watch.gatt.isSubscribed(watch.hrMeasurement))
    }

    @Test
    fun `collecting starts the sensor, filters readings and stopping collection stops it`() = runTest {
        val watch = FakeZeppWatch(authKey, hasHeartRate = true)
        val session = session(watch)
        val samples = mutableListOf<Int>()
        val job = backgroundScope.launch { session.liveHeartRate.collect { samples += it.bpm } }
        runCurrent()

        assertArrayEquals(byteArrayOf(0x15, 0x01, 0x01), watch.controlWrites().single().value)
        assertEquals(WriteType.WITHOUT_RESPONSE, watch.controlWrites().single().type)

        watch.gatt.notify(watch.hrMeasurement, byteArrayOf(0x00, 72))
        watch.gatt.notify(watch.hrMeasurement, byteArrayOf(0x00, 0)) // no skin contact
        watch.gatt.notify(watch.hrMeasurement, byteArrayOf(0x00, 0xFF.toByte())) // 255 is out of range
        watch.gatt.notify(watch.hrMeasurement, byteArrayOf(0x00)) // truncated
        watch.gatt.notify(watch.hrMeasurement, byteArrayOf(0x01, 0x2C, 0x00)) // 16-bit format, 44 bpm
        runCurrent()
        assertEquals(listOf(72, 44), samples)

        job.cancel()
        runCurrent()
        assertArrayEquals(byteArrayOf(0x15, 0x01, 0x00), watch.controlWrites().last().value)
    }

    @Test
    fun `keep-alive is sent every 10 seconds while collecting and not after`() = runTest {
        val watch = FakeZeppWatch(authKey, hasHeartRate = true)
        val session = session(watch)
        val job = backgroundScope.launch { session.liveHeartRate.collect { } }
        runCurrent()

        advanceTimeBy(9_999)
        assertEquals(1, watch.controlWrites().size)
        advanceTimeBy(1)
        runCurrent()
        assertArrayEquals(byteArrayOf(0x16), watch.controlWrites().last().value)
        advanceTimeBy(20_000)
        runCurrent()
        assertEquals(1 + 3, watch.controlWrites().size)

        job.cancel()
        runCurrent()
        val afterStop = watch.controlWrites().size
        advanceTimeBy(60_000)
        runCurrent()
        assertEquals(afterStop, watch.controlWrites().size)
        assertArrayEquals(byteArrayOf(0x15, 0x01, 0x00), watch.controlWrites().last().value)
    }

    @Test
    fun `cancelling turns the notification off and collecting again turns it back on`() = runTest {
        val watch = FakeZeppWatch(authKey, hasHeartRate = true)
        val session = session(watch)

        val first = backgroundScope.launch { session.liveHeartRate.collect { } }
        runCurrent()
        assertTrue(watch.gatt.isSubscribed(watch.hrMeasurement))
        first.cancel()
        runCurrent()
        assertFalse(watch.gatt.isSubscribed(watch.hrMeasurement))

        val second = backgroundScope.launch { session.liveHeartRate.collect { } }
        runCurrent()
        assertTrue(watch.gatt.isSubscribed(watch.hrMeasurement))
        second.cancel()
        runCurrent()
        assertFalse(watch.gatt.isSubscribed(watch.hrMeasurement))
    }

    @Test
    fun `taking one sample stops the sensor`() = runTest {
        val watch = FakeZeppWatch(authKey, hasHeartRate = true)
        val session = session(watch)
        val first = backgroundScope.launch { assertEquals(60, session.liveHeartRate.first().bpm) }
        runCurrent()
        watch.gatt.notify(watch.hrMeasurement, byteArrayOf(0x00, 60))
        runCurrent()
        assertTrue(first.isCompleted)
        assertArrayEquals(byteArrayOf(0x15, 0x01, 0x00), watch.controlWrites().last().value)
    }

    @Test
    fun `link loss ends the flow without throwing from the stop command`() = runTest {
        val watch = FakeZeppWatch(authKey, hasHeartRate = true)
        val session = session(watch)
        var completed = false
        var error: Throwable? = null
        backgroundScope.launch {
            try {
                session.liveHeartRate.collect { }
                completed = true
            } catch (e: GattDisconnectedException) {
                error = e
            }
        }
        runCurrent()
        watch.gatt.disconnect()
        runCurrent()
        assertTrue("flow should end or fail cleanly", completed || error != null)
    }
}
