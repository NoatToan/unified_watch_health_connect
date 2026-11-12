package com.unified.health.driver.xiaomi

import com.unified.health.core.ble.HealthRecordSink
import com.unified.health.core.ble.driver.CredentialReader
import com.unified.health.core.ble.driver.CredentialWriter
import com.unified.health.core.ble.driver.RecognitionScore
import com.unified.health.core.ble.driver.SessionContext
import com.unified.health.core.ble.driver.SyncProgress
import com.unified.health.core.ble.driver.UnsupportedDeviceException
import com.unified.health.core.ble.driver.WearableProtocolException
import com.unified.health.core.ble.gatt.GattCharacteristic
import com.unified.health.core.ble.gatt.GattClient
import com.unified.health.core.ble.gatt.StandardUuids
import com.unified.health.core.ble.scan.Advertisement
import com.unified.health.core.model.CredentialFormat
import com.unified.health.core.model.DeviceCapability
import com.unified.health.driver.xiaomi.auth.XiaomiAuthResult
import com.unified.health.driver.xiaomi.auth.XiaomiAuthenticator
import com.unified.health.driver.xiaomi.auth.XiaomiBindProbe
import com.unified.health.driver.xiaomi.sync.XiaomiFitnessSync
import com.unified.health.driver.xiaomi.transport.XiaomiLink
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.TestScope
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Assert.fail
import org.junit.Test
import java.time.Instant
import java.time.ZoneOffset
import java.util.UUID

class XiaomiDriverTest {

    /** Stands in for the real (TODO) authenticator: returns a canned result without touching GATT. */
    private class FakeAuthenticator(private val result: XiaomiAuthResult = XiaomiAuthResult()) : XiaomiAuthenticator {
        var calls = 0

        override suspend fun probeBindMode(link: XiaomiLink): XiaomiBindProbe = error("not used by this test")

        override suspend fun authenticateV2(link: XiaomiLink, credentials: CredentialReader): XiaomiAuthResult {
            calls++
            return result
        }

        override suspend fun localBind(link: XiaomiLink, credentialWriter: CredentialWriter): XiaomiAuthResult = error("not used by this test")

        override suspend fun authenticateV1(link: XiaomiLink, credentials: CredentialReader): XiaomiAuthResult = error("not used by this test")
    }

    private class FakeFitnessSync : XiaomiFitnessSync {
        override suspend fun sync(link: XiaomiLink, sink: HealthRecordSink, progress: SyncProgress, since: Instant?): Int = 0
    }

    /** A link whose notification setup never completes, to exercise the whole-handshake deadline. */
    private class HangingGattClient(delegate: GattClient) : GattClient by delegate {
        override suspend fun subscribe(characteristic: GattCharacteristic): ReceiveChannel<ByteArray> =
            suspendCancellableCoroutine { }
    }

    private fun TestScope.driver(authenticator: XiaomiAuthenticator = FakeAuthenticator(), fitnessSync: XiaomiFitnessSync = FakeFitnessSync()) =
        XiaomiDriver(authenticator, fitnessSync, StandardTestDispatcher(testScheduler), { ZoneOffset.UTC }, { Instant.EPOCH })

    private fun plainDriver() = XiaomiDriver(FakeAuthenticator(), FakeFitnessSync(), Dispatchers.Default, { ZoneOffset.UTC })

    private fun sessionContext() = SessionContext("AA:BB:CC:DD:EE:FF", CredentialReader { null })

    private fun ad(name: String?, serviceUuids: Set<UUID> = emptySet(), serviceData: Map<UUID, ByteArray> = emptyMap()) =
        Advertisement("AA:BB:CC:DD:EE:FF", name, rssi = -50, serviceUuids = serviceUuids, serviceData = serviceData)

    @Test
    fun `recognizes FE95 service data as the strongest signal`() {
        val score = plainDriver().recognize(ad(null, serviceData = mapOf(XiaomiUuids.SERVICE to byteArrayOf(1))))
        assertEquals(RecognitionScore.VENDOR_MANUFACTURER_DATA, score)
    }

    @Test
    fun `recognizes the FE95 GATT service`() {
        val score = plainDriver().recognize(ad("Watch", serviceUuids = setOf(XiaomiUuids.SERVICE)))
        assertEquals(RecognitionScore.VENDOR_SERVICE, score)
    }

    @Test
    fun `recognizes Xiaomi Redmi and Mi Band name prefixes`() {
        val driver = plainDriver()
        assertEquals(RecognitionScore.NAME, driver.recognize(ad("Xiaomi Smart Band 10")))
        assertEquals(RecognitionScore.NAME, driver.recognize(ad("Redmi Watch 4")))
        assertEquals(RecognitionScore.NAME, driver.recognize(ad("Mi Band 8")))
        assertEquals(RecognitionScore.NAME, driver.recognize(ad("Mi Smart Band 7")))
    }

    @Test
    fun `does not recognize an unrelated advertisement`() {
        val driver = plainDriver()
        assertEquals(RecognitionScore.NONE, driver.recognize(ad("Forerunner 255")))
        assertEquals(RecognitionScore.NONE, driver.recognize(ad(null, serviceUuids = setOf(StandardUuids.HEART_RATE_SERVICE))))
        assertEquals(RecognitionScore.NONE, driver.recognize(ad(null)))
    }

    @Test
    fun `declares link requirements matching the implementation brief`() {
        val requirements = plainDriver().linkRequirements
        assertFalse(requirements.bond)
        assertEquals(512, requirements.mtu)
        assertEquals(45_000L, requirements.connectTimeoutMs)
        assertEquals(30_000L, requirements.discoveryTimeoutMs)
        assertEquals(10_000L, requirements.operationTimeoutMs)
        assertTrue(requirements.refreshGattCacheBeforeDiscovery)
    }

    @Test
    fun `declares the three xiaomi credentials`() {
        val requirements = plainDriver().credentialRequirements
        assertEquals(listOf("xiaomi.auth_token", "xiaomi.user_id", "xiaomi.app_device_id"), requirements.map { it.key })
        val token = requirements.single { it.key == "xiaomi.auth_token" }
        assertEquals(CredentialFormat.HEX_16_BYTES, token.format)
        assertTrue(token.generatable)
    }

    @Test
    fun `openSession refuses a device exposing no MiWear service (Wear OS signature)`() = runTest {
        val watch = FakeMiWearWatch(hasVersion = false, hasWrite = false, hasNotify = false)
        try {
            driver().openSession(watch.gatt, sessionContext())
            fail("expected UnsupportedDeviceException")
        } catch (e: UnsupportedDeviceException) {
            assertTrue(e.message!!.contains("Wear OS"))
        }
    }

    @Test
    fun `openSession refuses a V1 (legacy) protocol version`() = runTest {
        val watch = FakeMiWearWatch(versionBytes = byteArrayOf(0, 3, 1))
        try {
            driver().openSession(watch.gatt, sessionContext())
            fail("expected UnsupportedDeviceException")
        } catch (e: UnsupportedDeviceException) {
            assertTrue(e.message!!.contains("V1"))
        }
    }

    @Test
    fun `openSession completes the handshake, time-syncs and builds a working session`() = runTest {
        val watch = FakeMiWearWatch()
        val authResult = XiaomiAuthResult(capabilities = setOf(DeviceCapability.HISTORY_SYNC, DeviceCapability.BATTERY_LEVEL))
        val authenticator = FakeAuthenticator(authResult)

        val session = driver(authenticator).openSession(watch.gatt, sessionContext())

        assertEquals(setOf(DeviceCapability.HISTORY_SYNC, DeviceCapability.BATTERY_LEVEL), session.capabilities)
        assertEquals(1, authenticator.calls)
        assertTrue(watch.received.any { it.e == 2 && it.f == 3 }) // best-effort time sync (e=2 f=3)
        session.close()
    }

    @Test
    fun `capabilities fall back to HISTORY_SYNC when the auth result has none`() = runTest {
        val watch = FakeMiWearWatch()
        val session = driver(FakeAuthenticator(XiaomiAuthResult(capabilities = emptySet()))).openSession(watch.gatt, sessionContext())
        assertEquals(setOf(DeviceCapability.HISTORY_SYNC), session.capabilities)
        session.close()
    }

    @Test
    fun `whole-handshake watchdog aborts a stalled handshake with a precise error`() = runTest {
        val watch = FakeMiWearWatch()
        try {
            driver().openSession(HangingGattClient(watch.gatt), sessionContext())
            fail("expected WearableProtocolException")
        } catch (e: WearableProtocolException) {
            assertTrue(e.message!!.contains("120 s"))
            assertTrue(e.message!!.contains("handshake"))
        }
    }
}
