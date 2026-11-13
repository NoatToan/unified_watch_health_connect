package com.unified.health.driver.xiaomi

import com.unified.health.core.ble.HealthRecordSink
import com.unified.health.core.ble.driver.AuthenticationException
import com.unified.health.core.ble.driver.CredentialReader
import com.unified.health.core.ble.driver.CredentialWriter
import com.unified.health.core.ble.driver.MissingCredentialException
import com.unified.health.core.ble.driver.RecognitionScore
import com.unified.health.core.ble.driver.SessionContext
import com.unified.health.core.ble.driver.SyncProgress
import com.unified.health.core.ble.driver.SyncRequest
import com.unified.health.core.ble.driver.UnsupportedDeviceException
import com.unified.health.core.ble.driver.WearableProtocolException
import com.unified.health.core.ble.gatt.GattCharacteristic
import com.unified.health.core.ble.gatt.GattClient
import com.unified.health.core.ble.gatt.StandardUuids
import com.unified.health.core.ble.scan.Advertisement
import com.unified.health.core.model.CredentialFormat
import com.unified.health.core.model.DeviceCapability
import com.unified.health.core.model.HealthRecord
import com.unified.health.core.model.WearableVendor
import com.unified.health.driver.xiaomi.auth.XiaomiAuthResult
import com.unified.health.driver.xiaomi.auth.XiaomiAuthenticator
import com.unified.health.driver.xiaomi.auth.XiaomiBindProbe
import com.unified.health.driver.xiaomi.proto.FitnessDataId
import com.unified.health.driver.xiaomi.proto.Ha0
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

    /** Stands in for the real authenticator: returns canned results/probes without touching GATT. */
    private class FakeAuthenticator(
        private val result: XiaomiAuthResult = XiaomiAuthResult(),
        private val probe: XiaomiBindProbe = XiaomiBindProbe(Ha0.VERIFY_MODE_LOCAL_ECDH, null, null, null, null, null),
    ) : XiaomiAuthenticator {
        var authenticateV2Calls = 0
        var probeBindModeCalls = 0
        var localBindCalls = 0
        var authenticateV1Calls = 0
        var lastUserId: String? = null
        var lastAppDeviceId: String? = null

        /** Thrown by [authenticateV1] instead of returning [result], when set. */
        var authenticateV1Error: Throwable? = null

        override suspend fun probeBindMode(link: XiaomiLink, userId: String): XiaomiBindProbe {
            probeBindModeCalls++
            lastUserId = userId
            return probe
        }

        override suspend fun authenticateV2(link: XiaomiLink, credentials: CredentialReader): XiaomiAuthResult {
            authenticateV2Calls++
            return result
        }

        override suspend fun localBind(
            link: XiaomiLink,
            userId: String,
            appDeviceId: String,
            credentialWriter: CredentialWriter,
        ): XiaomiAuthResult {
            localBindCalls++
            lastUserId = userId
            lastAppDeviceId = appDeviceId
            return result
        }

        override suspend fun authenticateV1(link: XiaomiLink, credentials: CredentialReader): XiaomiAuthResult {
            authenticateV1Calls++
            lastUserId = credentials.get(XiaomiDriver.USER_ID.key)?.toString(Charsets.UTF_8)
            authenticateV1Error?.let { throw it }
            return result
        }
    }

    /** Records every credential write, like the real repository-backed [CredentialWriter] would. */
    private class RecordingCredentialWriter : CredentialWriter {
        val removed = mutableListOf<String>()
        val written = mutableMapOf<String, ByteArray>()

        override suspend fun put(key: String, value: ByteArray) {
            written[key] = value
        }

        override suspend fun remove(key: String) {
            removed += key
        }
    }

    private class FakeFitnessSync : XiaomiFitnessSync {
        override suspend fun sync(link: XiaomiLink, sink: HealthRecordSink, progress: SyncProgress, request: SyncRequest): Int = 0
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

    /** A V1 device only ever needs `xiaomi.user_id` (protocol §6.2 [V]); no token, no bind marker. */
    private fun v1SessionContext(userId: String = "mi-fitness-user-1") = SessionContext(
        "AA:BB:CC:DD:EE:FF",
        CredentialReader { key -> if (key == XiaomiDriver.USER_ID.key) userId.toByteArray(Charsets.UTF_8) else null },
    )

    /** A credential store carrying the "generated but not yet bound" marker, as `generateCredential` would leave it. */
    private fun unboundSessionContext(
        userId: String = "user-1",
        appDeviceId: String = "device-1",
        credentialWriter: CredentialWriter = CredentialWriter.None,
    ) = SessionContext(
        "AA:BB:CC:DD:EE:FF",
        CredentialReader { key ->
            when (key) {
                XiaomiDriver.AUTH_TOKEN.unboundMarkerKey -> byteArrayOf(1)
                XiaomiDriver.USER_ID.key -> userId.toByteArray(Charsets.UTF_8)
                XiaomiDriver.APP_DEVICE_ID.key -> appDeviceId.toByteArray(Charsets.UTF_8)
                else -> null
            }
        },
        credentialWriter,
    )

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
    fun `openSession refuses a V1-reporting device missing the legacy write-notify characteristics`() = runTest {
        // Default FakeMiWearWatch only registers the V2 (0x5F/0x5E) characteristics; a device that
        // reports version 0.x.y but doesn't expose 0x52/0x51 is a malformed/unexpected signature,
        // not a normal V1 watch, and should fail clearly rather than silently use the V2 chars.
        val watch = FakeMiWearWatch(versionBytes = byteArrayOf(0, 3, 1))
        try {
            driver().openSession(watch.gatt, sessionContext())
            fail("expected UnsupportedDeviceException")
        } catch (e: UnsupportedDeviceException) {
            assertTrue(e.message!!.contains("0xFE95"))
        }
    }

    @Test
    fun `openSession runs the V1 handshake -- mid-session bond, then CMD_SEND_USERID, no V2 bind machinery`() = runTest {
        val watch = FakeMiWearWatch(versionBytes = byteArrayOf(0, 3, 1), generation = XiaomiGeneration.V1)
        val authenticator = FakeAuthenticator()

        val session = driver(authenticator).openSession(watch.gatt, v1SessionContext("mi-fitness-user-1"))

        assertEquals(1, watch.gatt.ensureBondedCalls)
        assertEquals(1, authenticator.authenticateV1Calls)
        assertEquals("mi-fitness-user-1", authenticator.lastUserId)
        assertEquals(0, authenticator.authenticateV2Calls)
        assertEquals(0, authenticator.probeBindModeCalls)
        assertEquals(0, authenticator.localBindCalls)
        assertTrue(watch.received.any { it.e == 2 && it.f == 3 }) // best-effort time sync still runs for V1
        session.close()
    }

    @Test
    fun `openSession surfaces a mid-session bond failure as an actionable AuthenticationException`() = runTest {
        val watch = FakeMiWearWatch(versionBytes = byteArrayOf(0, 3, 1), generation = XiaomiGeneration.V1)
        watch.gatt.bondResult = false // simulates the user rejecting/cancelling the OS pairing prompt
        val authenticator = FakeAuthenticator()
        try {
            driver(authenticator).openSession(watch.gatt, v1SessionContext())
            fail("expected AuthenticationException")
        } catch (e: AuthenticationException) {
            assertTrue(e.message!!.contains("pairing"))
        }
        assertEquals(0, authenticator.authenticateV1Calls) // never got past the bond
    }

    @Test
    fun `openSession surfaces CMD_SEND_USERID's not-bound error for a V1 device`() = runTest {
        val watch = FakeMiWearWatch(versionBytes = byteArrayOf(0, 3, 1), generation = XiaomiGeneration.V1)
        val authenticator = FakeAuthenticator().apply {
            authenticateV1Error = AuthenticationException("Xiaomi watch reports this identity is not bound (error code 4)")
        }
        try {
            driver(authenticator).openSession(watch.gatt, v1SessionContext())
            fail("expected AuthenticationException")
        } catch (e: AuthenticationException) {
            assertTrue(e.message!!.contains("not bound"))
        }
    }

    @Test
    fun `openSession never requests a bond for a V2 device (V1 support must not regress V2)`() = runTest {
        val watch = FakeMiWearWatch() // default: V2 characteristics, version 1.0.0
        watch.gatt.bondResult = false // if the driver ever called ensureBonded for V2, this would break it
        val session = driver().openSession(watch.gatt, sessionContext())
        assertEquals(0, watch.gatt.ensureBondedCalls)
        session.close()
    }

    @Test
    fun `openSession completes the handshake, time-syncs and builds a working session`() = runTest {
        val watch = FakeMiWearWatch()
        val authResult = XiaomiAuthResult(capabilities = setOf(DeviceCapability.HISTORY_SYNC, DeviceCapability.BATTERY_LEVEL))
        val authenticator = FakeAuthenticator(authResult)

        val session = driver(authenticator).openSession(watch.gatt, sessionContext())

        assertEquals(setOf(DeviceCapability.HISTORY_SYNC, DeviceCapability.BATTERY_LEVEL), session.capabilities)
        assertEquals(1, authenticator.authenticateV2Calls)
        assertTrue(watch.received.any { it.e == 2 && it.f == 3 }) // best-effort time sync (e=2 f=3)
        session.close()
    }

    @Test
    fun `openSession runs authenticateV2 (reauth) when no unbound marker is stored`() = runTest {
        val watch = FakeMiWearWatch()
        val authenticator = FakeAuthenticator()
        val session = driver(authenticator).openSession(watch.gatt, sessionContext())
        assertEquals(1, authenticator.authenticateV2Calls)
        assertEquals(0, authenticator.probeBindModeCalls)
        assertEquals(0, authenticator.localBindCalls)
        session.close()
    }

    @Test
    fun `openSession runs the local-bind flow when the unbound marker is stored`() = runTest {
        val watch = FakeMiWearWatch()
        val authenticator = FakeAuthenticator(probe = XiaomiBindProbe(Ha0.VERIFY_MODE_LOCAL_ECDH, null, null, null, null, null))
        val writer = RecordingCredentialWriter()

        val session = driver(authenticator).openSession(watch.gatt, unboundSessionContext(credentialWriter = writer))

        assertEquals(1, authenticator.probeBindModeCalls)
        assertEquals(1, authenticator.localBindCalls)
        assertEquals(0, authenticator.authenticateV2Calls)
        assertEquals("user-1", authenticator.lastUserId)
        assertEquals("device-1", authenticator.lastAppDeviceId)
        assertTrue(writer.removed.contains(XiaomiDriver.AUTH_TOKEN.unboundMarkerKey))
        session.close()
    }

    @Test
    fun `openSession refuses a watch that only offers cloud PSK bind`() = runTest {
        val watch = FakeMiWearWatch()
        val authenticator = FakeAuthenticator(probe = XiaomiBindProbe(Ha0.VERIFY_MODE_PSK_CLOUD, null, null, null, null, null))
        try {
            driver(authenticator).openSession(watch.gatt, unboundSessionContext())
            fail("expected UnsupportedDeviceException")
        } catch (e: UnsupportedDeviceException) {
            assertTrue(e.message!!.contains("Mi Fitness"))
        }
        assertEquals(0, authenticator.localBindCalls)
    }

    @Test
    fun `openSession requires the local user id credential before binding`() = runTest {
        val watch = FakeMiWearWatch()
        val context = SessionContext(
            "AA:BB:CC:DD:EE:FF",
            CredentialReader { key -> if (key == XiaomiDriver.AUTH_TOKEN.unboundMarkerKey) byteArrayOf(1) else null },
        )
        try {
            driver().openSession(watch.gatt, context)
            fail("expected MissingCredentialException")
        } catch (e: MissingCredentialException) {
            assertEquals(XiaomiDriver.USER_ID, e.requirement)
        }
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

    @Test
    fun `reprocess recovers a daily report from a stored fitness RawPayload`() = runTest {
        val id = FitnessDataId(
            timestampSeconds = 1_700_000_040L,
            timezone15min = 0,
            version = 2,
            dataType = FitnessDataId.DATA_TYPE_DAILY,
            subType = 0,
            fileType = 1,
        )
        val dataValid = byteArrayOf(0x80.toByte(), 0x00) // steps valid only
        val body = byteArrayOf(0x40, 0x1F, 0x00, 0x00, 0, 0, 0, 0) // steps=8000, calories/curHr/restHr unused
        val payload = byteArrayOf(0) + dataValid + body
        val stored = HealthRecord.RawPayload(WearableVendor.XIAOMI, "daily_report", null, id.encode() + payload)

        val records = plainDriver().reprocess(stored)

        assertEquals(8_000, records.filterIsInstance<HealthRecord.DailyActivity>().single().steps)
    }

    @Test
    fun `reprocess ignores other vendors`() = runTest {
        assertTrue(plainDriver().reprocess(HealthRecord.RawPayload(WearableVendor.GARMIN, "daily_report", null, ByteArray(0))).isEmpty())
    }

    @Test
    fun `reprocess has nothing to recover for a kind this driver does not parse`() = runTest {
        // dataType=1 (sport), sportType=6 -> FitnessKind.of falls back to "fitness_1_6_0", which
        // FitnessPayloadDecoder.decode has no parser for (protocol brief's scoped M4).
        val sportId = FitnessDataId(
            timestampSeconds = 1_700_000_040L,
            timezone15min = 0,
            version = 1,
            dataType = FitnessDataId.DATA_TYPE_SPORT,
            subType = 6,
            fileType = 0,
        )
        val stored = HealthRecord.RawPayload(WearableVendor.XIAOMI, "fitness_1_6_0", null, sportId.encode() + byteArrayOf(1, 2, 3))
        assertTrue(plainDriver().reprocess(stored).isEmpty())
    }

    @Test
    fun `reprocess on bytes too short for a FitnessDataId decodes nothing`() = runTest {
        assertTrue(plainDriver().reprocess(HealthRecord.RawPayload(WearableVendor.XIAOMI, "daily_report", null, ByteArray(3))).isEmpty())
    }
}
