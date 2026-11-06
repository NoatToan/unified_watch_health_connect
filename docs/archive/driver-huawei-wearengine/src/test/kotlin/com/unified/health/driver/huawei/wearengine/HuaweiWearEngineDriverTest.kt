package com.unified.health.driver.huawei.wearengine

import com.unified.health.core.ble.driver.AuthenticationException
import com.unified.health.core.ble.driver.CompanionAvailability
import com.unified.health.core.ble.driver.SyncRequest
import com.unified.health.core.ble.driver.WearableProtocolException
import com.unified.health.core.model.HealthRecord
import com.unified.health.core.testing.RecordingSink
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.take
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.launch
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.advanceUntilIdle
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test
import java.time.Instant

class HuaweiWearEngineDriverTest {

    private class FakeGateway : WearEngineGateway {
        var installed = true
        var granted = mutableSetOf<WearPermission>()
        var grantOnRequest = true
        var devices = listOf(WearDevice("dev-1", "HUAWEI WATCH GT 4", "GT4", "4.0.0.120", isConnected = true))
        val hr = MutableSharedFlow<HeartRateReading>()
        var requests = 0

        override fun isHealthAppInstalled() = installed
        override suspend fun hasPermissions(permissions: Set<WearPermission>) = granted.containsAll(permissions)
        override suspend fun requestPermissions(permissions: Set<WearPermission>): Set<WearPermission> {
            requests++
            if (grantOnRequest) granted += permissions
            return granted.intersect(permissions)
        }
        override suspend fun bondedDevices() = devices
        override suspend fun batteryPercent(deviceId: String) = 81
        override fun heartRate(deviceId: String): Flow<HeartRateReading> = hr
    }

    @Test
    fun `reports missing Huawei Health`() = runTest {
        val gateway = FakeGateway().apply { installed = false }
        assertEquals(CompanionAvailability.AppMissing("com.huawei.health"), HuaweiWearEngineDriver(gateway).availability())
    }

    @Test
    fun `lists devices after requesting permission once`() = runTest {
        val gateway = FakeGateway()
        val driver = HuaweiWearEngineDriver(gateway)
        assertEquals(listOf("dev-1"), driver.bondedDevices().map { it.id })
        driver.bondedDevices()
        assertEquals(1, gateway.requests)
    }

    @Test(expected = AuthenticationException::class)
    fun `denied permission fails the session`() = runTest {
        HuaweiWearEngineDriver(FakeGateway().apply { grantOnRequest = false }).openSession("dev-1")
    }

    @Test(expected = WearableProtocolException::class)
    fun `offline watch fails the session`() = runTest {
        val gateway = FakeGateway().apply { devices = devices.map { it.copy(isConnected = false) } }
        HuaweiWearEngineDriver(gateway).openSession("dev-1")
    }

    @Test
    fun `live heart rate is buffered and handed over on sync`() = runTest {
        val gateway = FakeGateway()
        val session = HuaweiWearEngineSession(gateway, gateway.devices.single(), StandardTestDispatcher(testScheduler))
        val collected = mutableListOf<HealthRecord.HeartRate>()
        val job = launch { session.liveHeartRate.take(2).toList(collected) }
        advanceUntilIdle()
        gateway.hr.emit(HeartRateReading(Instant.ofEpochSecond(100), 70))
        gateway.hr.emit(HeartRateReading(Instant.ofEpochSecond(101), 72))
        advanceUntilIdle()
        job.join()

        val sink = RecordingSink()
        assertEquals(2, session.sync(SyncRequest(since = null), sink) {})
        assertEquals(listOf(70, 72), sink.ofType<HealthRecord.HeartRate>().map { it.bpm })
        assertEquals(81, session.readDeviceInfo().batteryPercent)
        session.close()
    }

    @Test
    fun `link loss is reported when Huawei Health loses the watch`() = runTest {
        val gateway = FakeGateway()
        val session = HuaweiWearEngineSession(gateway, gateway.devices.single(), StandardTestDispatcher(testScheduler), pollIntervalMs = 1_000)
        var lost = false
        val job = launch { session.linkLost.first(); lost = true }
        testScheduler.advanceTimeBy(1_500)
        assertTrue(!lost)
        gateway.devices = gateway.devices.map { it.copy(isConnected = false) }
        advanceUntilIdle()
        job.join()
        assertTrue(lost)
        session.close()
    }
}
