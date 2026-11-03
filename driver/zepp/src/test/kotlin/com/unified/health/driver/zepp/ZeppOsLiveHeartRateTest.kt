package com.unified.health.driver.zepp

import com.unified.health.core.ble.driver.SessionContext
import com.unified.health.core.ble.driver.WearableProtocolException
import com.unified.health.core.ble.protocol.MalformedPayloadException
import com.unified.health.core.ble.protocol.bytesOf
import com.unified.health.core.model.DeviceCapability
import com.unified.health.driver.zepp.codec.BuiltInModuleCodec
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.TestScope
import kotlinx.coroutines.test.advanceTimeBy
import kotlinx.coroutines.test.runCurrent
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertThrows
import org.junit.Assert.assertTrue
import org.junit.Test
import java.time.ZoneOffset
import java.util.Random

@OptIn(ExperimentalCoroutinesApi::class)
class ZeppOsLiveHeartRateTest {

    private val authKey = ByteArray(16) { it.toByte() }
    private val withKey = SessionContext("AA:BB:CC:DD:EE:FF", credentials = { key -> if (key == "zepp.auth_key") authKey else null })
    private val withOpenApp = mapOf(0x82 to false, 0x1D to false)

    private suspend fun TestScope.session(watch: FakeZeppWatch) =
        ZeppDriver(StandardTestDispatcher(testScheduler), { ZoneOffset.UTC }, Random(1)).openSession(watch.gatt, withKey)

    private fun FakeZeppWatch.commands() = openAppCommands.map { it.toList() }

    private fun FakeZeppWatch.controlWrites() = gatt.writes.filter { it.characteristic == hrControl }

    @Test
    fun `module list with encryption flags`() {
        val reply = bytesOf(0x04, 0x02, 0x00, 0x82, 0x00, 0x00, 0x1D, 0x00, 0x01)
        assertEquals(mapOf(0x82 to false, 0x1D to true), BuiltInModuleCodec.parse(reply, withEncryption = true))
    }

    @Test
    fun `module list without encryption flags`() {
        assertEquals(mapOf(0x1D to false, 0x29 to false), BuiltInModuleCodec.parse(bytesOf(0x01, 0x02, 0x00, 0x1D, 0x29), withEncryption = false))
    }

    @Test
    fun `module list with trailing bytes is rejected`() {
        assertThrows(MalformedPayloadException::class.java) {
            BuiltInModuleCodec.parse(bytesOf(0x04, 0x01, 0x00, 0x1D, 0x00, 0x00, 0xFF), withEncryption = true)
        }
    }

    @Test
    fun `channel-only watch gets the capability, a watch without either path does not`() = runTest {
        val channelOnly = FakeZeppWatch(authKey, hasHeartRate = true, hasHrControl = false, modules = withOpenApp)
        assertTrue(DeviceCapability.LIVE_HEART_RATE in session(channelOnly).capabilities)
        val neither = FakeZeppWatch(authKey, hasHeartRate = true, hasHrControl = false)
        assertFalse(DeviceCapability.LIVE_HEART_RATE in session(neither).capabilities)
    }

    @Test
    fun `OpenAppModule is preferred over 2A39 like the vendor app`() = runTest {
        val watch = FakeZeppWatch(authKey, hasHeartRate = true, modules = withOpenApp)
        val session = session(watch)
        val job = backgroundScope.launch { session.liveHeartRate.collect { } }
        runCurrent()

        assertEquals(listOf(listOf<Byte>(0x04, 0x01)), watch.commands())
        assertTrue(watch.controlWrites().isEmpty())
        job.cancel()
    }

    @Test
    fun `nothing is sent until collected, then start, keep-alive every 10 s and stop`() = runTest {
        val watch = FakeZeppWatch(authKey, hasHeartRate = true, hasHrControl = false, modules = withOpenApp)
        val session = session(watch)
        runCurrent()
        assertTrue(watch.openAppCommands.isEmpty())
        assertFalse(watch.gatt.isSubscribed(watch.hrMeasurement))

        val samples = mutableListOf<Int>()
        val job = backgroundScope.launch { session.liveHeartRate.collect { samples += it.bpm } }
        runCurrent()
        assertTrue(watch.gatt.isSubscribed(watch.hrMeasurement))
        assertEquals(listOf(listOf<Byte>(0x04, 0x01)), watch.commands())

        watch.gatt.notify(watch.hrMeasurement, byteArrayOf(0x00, 72))
        watch.gatt.notify(watch.hrMeasurement, byteArrayOf(0x00, 0))
        runCurrent()
        assertEquals(listOf(72), samples)

        advanceTimeBy(ZeppLiveHeartRate.KEEP_ALIVE_MS - 1)
        runCurrent()
        assertEquals(1, watch.openAppCommands.size)
        advanceTimeBy(1)
        runCurrent()
        assertEquals(listOf<Byte>(0x04, 0x02), watch.commands().last())
        advanceTimeBy(ZeppLiveHeartRate.KEEP_ALIVE_MS)
        runCurrent()
        assertEquals(3, watch.openAppCommands.size)

        job.cancel()
        runCurrent()
        assertEquals(listOf<Byte>(0x04, 0x00), watch.commands().last())
        assertFalse(watch.gatt.isSubscribed(watch.hrMeasurement))
    }

    @Test
    fun `commands are encrypted when the module list requires it`() = runTest {
        val watch = FakeZeppWatch(authKey, hasHeartRate = true, hasHrControl = false, modules = mapOf(0x82 to false, 0x1D to true))
        val session = session(watch)
        val job = backgroundScope.launch { session.liveHeartRate.collect { } }
        runCurrent()

        assertEquals(listOf(true), watch.openAppEncrypted)
        assertEquals(listOf(listOf<Byte>(0x04, 0x01)), watch.commands())
        job.cancel()
    }

    @Test
    fun `a refused start fails the flow and releases the notification`() = runTest {
        val watch = FakeZeppWatch(authKey, hasHeartRate = true, hasHrControl = false, modules = withOpenApp)
        watch.realtimeHrStatus = 1
        val session = session(watch)

        val error = runCatching { session.liveHeartRate.first() }.exceptionOrNull()

        assertTrue(error is WearableProtocolException)
        assertEquals(listOf<Byte>(0x04, 0x00), watch.commands().last())
        assertFalse(watch.gatt.isSubscribed(watch.hrMeasurement))
    }
}
