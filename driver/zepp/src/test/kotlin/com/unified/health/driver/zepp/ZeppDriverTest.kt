package com.unified.health.driver.zepp

import com.unified.health.core.ble.driver.AuthenticationException
import com.unified.health.core.ble.driver.CredentialReader
import com.unified.health.core.ble.driver.MissingCredentialException
import com.unified.health.core.ble.driver.RecognitionScore
import com.unified.health.core.ble.driver.SessionContext
import com.unified.health.core.ble.driver.SyncRequest
import com.unified.health.core.ble.driver.UnsupportedDeviceException
import com.unified.health.core.ble.driver.WearableProtocolException
import com.unified.health.core.ble.gatt.GattCharacteristic
import com.unified.health.core.ble.gatt.GattClient
import com.unified.health.core.ble.gatt.StandardUuids
import com.unified.health.core.ble.protocol.hexToBytes
import com.unified.health.core.ble.scan.Advertisement
import com.unified.health.core.model.DeviceCapability
import com.unified.health.core.model.HealthRecord
import com.unified.health.core.testing.RecordingSink
import com.unified.health.driver.zepp.codec.GdspCodec
import com.unified.health.driver.zepp.codec.GdspDataType
import com.unified.health.driver.zepp.codec.TimeSync
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.TestScope
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Assert.fail
import org.junit.Test
import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneOffset
import java.util.Random

class ZeppDriverTest {

    private val authKey = "0x00112233445566778899aabbccddeeff".hexToBytes()
    private val withKey = SessionContext("AA:BB:CC:DD:EE:FF", CredentialReader { key -> if (key == "zepp.auth_key") authKey else null })

    private fun TestScope.driver() = ZeppDriver(StandardTestDispatcher(testScheduler), { ZoneOffset.UTC }, Random(1))

    /** A link whose notification setup never completes, to exercise the whole-handshake deadline. */
    private class HangingGattClient(delegate: GattClient) : GattClient by delegate {
        override suspend fun subscribe(characteristic: GattCharacteristic): ReceiveChannel<ByteArray> =
            suspendCancellableCoroutine { }
    }

    @Test
    fun `declares the auth key credential and link requirements`() {
        val driver = ZeppDriver()
        assertEquals(listOf("zepp.auth_key"), driver.credentialRequirements.map { it.key })
        assertTrue(driver.credentialRequirements.single().description.contains("Zepp app"))
        assertFalse(driver.linkRequirements.bond)
        assertEquals(247, driver.linkRequirements.mtu)
        // Vendor §4.2/§4.5: 45 s connect, 30 s discovery, 30 s per GATT operation, cache refresh.
        assertEquals(45_000L, driver.linkRequirements.connectTimeoutMs)
        assertEquals(30_000L, driver.linkRequirements.discoveryTimeoutMs)
        assertEquals(30_000L, driver.linkRequirements.operationTimeoutMs)
        assertTrue(driver.linkRequirements.refreshGattCacheBeforeDiscovery)
    }

    @Test
    fun `whole-handshake watchdog aborts a stalled handshake with a precise error`() = runTest {
        val watch = FakeZeppWatch(authKey)
        try {
            driver().openSession(HangingGattClient(watch.gatt), withKey)
            fail("expected WearableProtocolException")
        } catch (e: WearableProtocolException) {
            assertTrue(e.message!!.contains("120 s"))
            assertTrue(e.message!!.contains("handshake"))
        }
    }

    @Test
    fun `recognises Huami advertisements`() {
        val driver = ZeppDriver()
        fun ad(name: String?, services: Set<java.util.UUID> = emptySet(), manufacturer: Map<Int, ByteArray> = emptyMap()) =
            Advertisement("A", name, -50, serviceUuids = services, manufacturerData = manufacturer)

        assertEquals(RecognitionScore.VENDOR_MANUFACTURER_DATA, driver.recognize(ad(null, manufacturer = mapOf(0x0157 to byteArrayOf(1)))))
        assertEquals(RecognitionScore.VENDOR_SERVICE, driver.recognize(ad("Watch", setOf(ZeppUuids.SERVICE_MILI))))
        assertEquals(RecognitionScore.VENDOR_SERVICE, driver.recognize(ad(null, setOf(ZeppUuids.SERVICE_MILI_SECONDARY))))
        assertEquals(RecognitionScore.NAME, driver.recognize(ad("Amazfit GTR 4")))
        assertEquals(RecognitionScore.NAME, driver.recognize(ad("xiaomi smart band 7")))
        assertEquals(RecognitionScore.NAME, driver.recognize(ad("T-Rex 2")))
        assertEquals(RecognitionScore.NONE, driver.recognize(ad("Forerunner 255")))
        assertEquals(RecognitionScore.NONE, driver.recognize(ad(null, setOf(StandardUuids.HEART_RATE_SERVICE))))
        assertEquals(RecognitionScore.NONE, driver.recognize(ad(null, manufacturer = mapOf(0x0087 to byteArrayOf(1)))))
    }

    @Test(expected = MissingCredentialException::class)
    fun `fails without an auth key`() = runTest {
        driver().openSession(FakeZeppWatch(authKey).gatt, SessionContext("A", CredentialReader { null }))
    }

    @Test
    fun `authenticates a Zepp OS watch and syncs activity, SpO2 and stress`() = runTest {
        val watch = FakeZeppWatch(authKey)
        val start = LocalDateTime.of(2026, 10, 30, 8, 0)
        watch.gdspBlocks[GdspDataType.ACTIVITY.code] = ArrayDeque(
            listOf(
                FakeZeppWatch.GdspBlock(
                    count = 3,
                    start = start,
                    // leading byte, then [kind, intensity, steps, hr] per minute
                    payload = byteArrayOf(0x00, 1, 10, 25, 72, 1, 0, 0, 0xFF.toByte(), 1, 5, 5, 0xFE.toByte()),
                ),
            ),
        )
        watch.gdspBlocks[GdspDataType.SPO2_POINT.code] = ArrayDeque(
            listOf(FakeZeppWatch.GdspBlock(count = 1, start = start, payload = byteArrayOf(0x00, 0x10, 0x5E, 0x6A, 97))),
        )
        watch.gdspBlocks[GdspDataType.STRESS_ALL_DAY.code] = ArrayDeque(
            // leading skip byte, then one stress value per minute (brief TODO: HMProSyncDataProfile.M()).
            listOf(FakeZeppWatch.GdspBlock(count = 3, start = start, payload = byteArrayOf(0x00, 30, 0xFF.toByte(), 45))),
        )
        watch.gdspBlocks[GdspDataType.STRESS_SINGLE.code] = ArrayDeque(
            // leading skip byte, then [timestamp u32 LE, stress u8].
            listOf(FakeZeppWatch.GdspBlock(count = 1, start = start, payload = byteArrayOf(0x00, 0x00, 0x10, 0x5E, 0x6A, 55))),
        )
        watch.gdspBlocks[GdspDataType.RESTING_HEART_RATE.code] = ArrayDeque(
            // leading skip byte, then [timestamp u32 LE, bpm u8] (inferred layout, NEEDS-REAL-WATCH).
            listOf(FakeZeppWatch.GdspBlock(count = 1, start = start, payload = byteArrayOf(0x00, 0x00, 0x10, 0x5E, 0x6A, 58))),
        )

        val session = driver().openSession(watch.gatt, withKey)
        assertTrue(watch.authenticated)
        assertEquals(setOf(DeviceCapability.HISTORY_SYNC, DeviceCapability.BATTERY_LEVEL), session.capabilities)
        assertEquals(87, session.readDeviceInfo().batteryPercent)

        val sink = RecordingSink()
        val progress = mutableListOf<Float>()
        val since = Instant.parse("2026-10-30T00:00:00Z")
        val count = session.sync(SyncRequest(since = since, now = Instant.parse("2026-10-31T00:00:00Z")), sink) { progress += it }

        val t0 = start.toInstant(ZoneOffset.UTC)
        assertEquals(
            listOf(HealthRecord.Steps(t0, t0.plusSeconds(60), 25), HealthRecord.Steps(t0.plusSeconds(120), t0.plusSeconds(180), 5)),
            sink.ofType<HealthRecord.Steps>(),
        )
        assertEquals(listOf(HealthRecord.HeartRate(t0, 72)), sink.ofType<HealthRecord.HeartRate>())
        assertEquals(listOf(HealthRecord.SpO2(Instant.ofEpochSecond(0x6A5E1000), 97)), sink.ofType<HealthRecord.SpO2>())
        assertEquals(
            listOf(HealthRecord.Stress(t0, 30), HealthRecord.Stress(t0.plusSeconds(120), 45), HealthRecord.Stress(Instant.ofEpochSecond(0x6A5E1000), 55)),
            sink.ofType<HealthRecord.Stress>(),
        )
        assertEquals(listOf(HealthRecord.RestingHeartRate(java.time.LocalDate.of(2026, 7, 20), 58)), sink.ofType<HealthRecord.RestingHeartRate>())
        assertEquals(8, count)
        assertEquals(1f, progress.last())

        // Header request for activity starts at `since` (UTC, tz key 0); the activity follow-up starts after 3 minutes.
        assertArrayEquals(byteArrayOf(0x01, 0x01, 0xEA.toByte(), 0x07, 10, 30, 0, 0, 0, 0), watch.headerRequests.first())
        assertArrayEquals(byteArrayOf(0x01, 0x01, 0xEA.toByte(), 0x07, 10, 30, 8, 3, 0, 0), watch.headerRequests[1])
        assertEquals(List(5) { GdspCodec.STOP_CODE_CONFIRM_DELIVERED }, watch.stopCodes)
        session.close()
    }

    @Test
    fun `rejected auth proof raises AuthenticationException`() = runTest {
        val watch = FakeZeppWatch(authKey)
        val wrongKey = SessionContext("A", CredentialReader { ByteArray(16) { 0x42 } })
        try {
            driver().openSession(watch.gatt, wrongKey)
            fail("expected AuthenticationException")
        } catch (e: AuthenticationException) {
            assertFalse(watch.authenticated)
        }
    }

    @Test(expected = WearableProtocolException::class)
    fun `silent watch times out`() = runTest {
        val watch = FakeZeppWatch(authKey).apply { answersAuth = false }
        driver().openSession(watch.gatt, withKey)
    }

    @Test
    fun `channel v1 skips the module list and authenticates on legacy 0x0009`() = runTest {
        // Even with modules 0x80/0x82 advertised, the vendor only queries BuiltInModule and picks a
        // channel auth module on v2; v1 always takes TraditionalDeviceAuthorizationImpl (0x0009).
        val watch = FakeZeppWatch(
            authKey,
            channelVersion = 1,
            encryptByte = null,
            hasLegacyAuth = true,
            modules = mapOf(0x82 to false, 0x80 to false),
        )
        val session = driver().openSession(watch.gatt, withKey)
        assertTrue(watch.authenticated)
        assertEquals(0, watch.builtInRequests)
        assertEquals(0, watch.module1Requests)
        assertTrue(watch.legacyAuthRequests > 0)
        session.close()
    }

    @Test
    fun `v2 channel without encrypt byte authenticates via module 0x80 session auth`() = runTest {
        val watch = FakeZeppWatch(authKey, encryptByte = null)
        val session = driver().openSession(watch.gatt, withKey)
        assertTrue(watch.authenticated)
        session.close()
    }

    @Test(expected = AuthenticationException::class)
    fun `module 0x80 rejects a wrong auth key`() = runTest {
        val watch = FakeZeppWatch(authKey, encryptByte = null).apply { authorizeStatus = 2 }
        try {
            driver().openSession(watch.gatt, withKey)
        } finally {
            assertFalse(watch.authenticated)
        }
    }

    @Test
    fun `channel present but neither auth module listed falls back to legacy auth`() = runTest {
        val watch = FakeZeppWatch(authKey, hasLegacyAuth = true, modules = emptyMap())
        val session = driver().openSession(watch.gatt, withKey)
        assertTrue(watch.authenticated)
        session.close()
    }

    @Test
    fun `legacy watch authenticates on 0x0009`() = runTest {
        val watch = FakeZeppWatch(authKey, hasChannel = false, hasLegacyAuth = true)
        val session = driver().openSession(watch.gatt, withKey)
        assertTrue(watch.authenticated)
        session.close()
    }

    @Test
    fun `writes the current time after authenticating`() = runTest {
        val watch = FakeZeppWatch(authKey)
        val now = Instant.parse("2026-11-06T10:15:30Z")
        val driver = ZeppDriver(StandardTestDispatcher(testScheduler), { ZoneOffset.UTC }, Random(1)) { now }
        val session = driver.openSession(watch.gatt, withKey)
        val write = watch.gatt.writes.single { it.characteristic == watch.currentTime }
        assertArrayEquals(TimeSync.encode(now, ZoneOffset.UTC), write.value)
        session.close()
    }

    @Test
    fun `writes the current time to 2A2B under FEE0 when that is the only copy`() = runTest {
        val watch = FakeZeppWatch(authKey, currentTimeService = ZeppUuids.SERVICE_MILI)
        val now = Instant.parse("2026-11-06T10:15:30.800Z")
        val driver = ZeppDriver(StandardTestDispatcher(testScheduler), { ZoneOffset.UTC }, Random(1)) { now }
        val session = driver.openSession(watch.gatt, withKey)
        val write = watch.gatt.writes.single { it.characteristic == watch.currentTime }
        assertEquals(ZeppUuids.SERVICE_MILI, write.characteristic.service)
        assertArrayEquals(TimeSync.encode(now, ZoneOffset.UTC), write.value)
        session.close()
    }

    @Test
    fun `reads battery from Zepp OS module 0x29`() = runTest {
        val watch = FakeZeppWatch(authKey, modules = mapOf(0x82 to false, 0x29 to false)).apply {
            batteryFlags = 0x00
            batteryLevel = 64
        }
        val session = driver().openSession(watch.gatt, withKey)
        assertEquals(64, session.readDeviceInfo().batteryPercent)
        assertEquals(1, watch.batteryVersionQueries)
        assertEquals(1, watch.batteryQueries)
        session.close()
    }

    @Test
    fun `reads battery from the legacy FEE0 characteristic when 0x180F is absent`() = runTest {
        val watch = FakeZeppWatch(authKey, hasStandardBattery = false, hasLegacyBattery = true)
        // flags bit0 (DC status) and bit3 (last-charge level) add trailing bytes; the level stays byte 1.
        watch.gatt.readValues[ZeppUuids.BATTERY] = byteArrayOf(0x09, 55, 1, 42)
        val session = driver().openSession(watch.gatt, withKey)
        assertEquals(55, session.readDeviceInfo().batteryPercent)
        session.close()
    }

    @Test
    fun `falls back to a PnP-id label when the plain-text model number is absent`() = runTest {
        val watch = FakeZeppWatch(authKey, hasPnpId = true)
        val session = driver().openSession(watch.gatt, withKey)
        assertEquals("Zepp 1234.0102", session.readDeviceInfo().model)
        session.close()
    }

    @Test
    fun `no model and no PnP id leaves model null`() = runTest {
        val watch = FakeZeppWatch(authKey)
        val session = driver().openSession(watch.gatt, withKey)
        assertEquals(null, session.readDeviceInfo().model)
        session.close()
    }

    @Test
    fun `a watch without the Current Time characteristic still connects`() = runTest {
        val watch = FakeZeppWatch(authKey, hasCurrentTime = false)
        val session = driver().openSession(watch.gatt, withKey)
        assertTrue(watch.authenticated)
        assertTrue(watch.gatt.writes.none { it.characteristic == watch.currentTime })
        session.close()
    }

    @Test
    fun `handles a pushed module 0x29 battery notification`() = runTest {
        val watch = FakeZeppWatch(authKey, modules = mapOf(0x82 to false, 0x29 to false))
        val session = driver().openSession(watch.gatt, withKey)
        watch.pushBattery(level = 42)
        testScheduler.advanceUntilIdle()
        assertEquals(42, session.readDeviceInfo().batteryPercent)
        // The pushed level is used without spending the one-shot query round trips.
        assertEquals(0, watch.batteryVersionQueries)
        assertEquals(0, watch.batteryQueries)
        session.close()
    }

    @Test
    fun `retries transient GDSP failures and delivers the block afterwards`() = runTest {
        val watch = FakeZeppWatch(authKey)
        watch.gdspBlocks[GdspDataType.ACTIVITY.code] = ArrayDeque(
            listOf(FakeZeppWatch.GdspBlock(1, LocalDateTime.of(2026, 10, 30, 8, 0), byteArrayOf(0, 1, 1, 10, 70))),
        )
        watch.transientGdspFailures = 2
        val session = driver().openSession(watch.gatt, withKey)
        val sink = RecordingSink()
        val count = session.sync(SyncRequest(since = Instant.parse("2026-10-30T00:00:00Z")), sink) {}

        assertEquals(2, count) // one Steps and one HeartRate record
        assertEquals(listOf(10), sink.ofType<HealthRecord.Steps>().map { it.count })
        assertEquals(4, activityHeaderRequests(watch)) // three transfer attempts + the empty follow-up
        assertEquals(listOf<Int?>(null, null, 1, 1, 1, 1, 1), watch.stopCodes)
        session.close()
    }

    @Test
    fun `GDSP retry is bounded to three retries`() = runTest {
        val watch = FakeZeppWatch(authKey)
        watch.gdspBlocks[GdspDataType.ACTIVITY.code] = ArrayDeque(
            listOf(FakeZeppWatch.GdspBlock(1, LocalDateTime.of(2026, 10, 30, 8, 0), byteArrayOf(0, 1, 1, 10, 70))),
        )
        watch.transientGdspFailures = 10
        val session = driver().openSession(watch.gatt, withKey)
        try {
            session.sync(SyncRequest(since = Instant.parse("2026-10-30T00:00:00Z")), RecordingSink()) {}
            fail("expected WearableProtocolException")
        } catch (e: WearableProtocolException) {
            assertTrue(e.message!!.contains("code 4"))
        }
        assertEquals(4, activityHeaderRequests(watch)) // initial attempt + 3 retries
        assertEquals(List<Int?>(4) { null }, watch.stopCodes) // never confirmed as delivered
        session.close()
    }

    @Test
    fun `retries a one-off GDSP CRC mismatch and confirms delivery`() = runTest {
        val watch = FakeZeppWatch(authKey)
        watch.gdspBlocks[GdspDataType.ACTIVITY.code] = ArrayDeque(
            listOf(FakeZeppWatch.GdspBlock(1, LocalDateTime.of(2026, 10, 30, 8, 0), byteArrayOf(0, 1, 1, 10, 70))),
        )
        watch.corruptNextCrc = true
        val session = driver().openSession(watch.gatt, withKey)
        val count = session.sync(SyncRequest(since = Instant.parse("2026-10-30T00:00:00Z")), RecordingSink()) {}

        assertEquals(2, count) // one Steps and one HeartRate record
        assertEquals(listOf<Int?>(null, 1, 1, 1, 1, 1), watch.stopCodes)
        session.close()
    }

    @Test
    fun `persistent GDSP CRC mismatch fails after the retry budget without confirming delivery`() = runTest {
        val watch = FakeZeppWatch(authKey)
        watch.gdspBlocks[GdspDataType.ACTIVITY.code] = ArrayDeque(
            listOf(FakeZeppWatch.GdspBlock(1, LocalDateTime.of(2026, 10, 30, 8, 0), byteArrayOf(0, 1, 1, 10, 70))),
        )
        watch.corruptCrcAlways = true
        val session = driver().openSession(watch.gatt, withKey)
        try {
            session.sync(SyncRequest(since = Instant.parse("2026-10-30T00:00:00Z")), RecordingSink()) {}
            fail("expected WearableProtocolException")
        } catch (e: WearableProtocolException) {
            assertTrue(e.message!!.contains("CRC"))
        }
        assertEquals(4, activityHeaderRequests(watch))
        assertEquals(List<Int?>(4) { null }, watch.stopCodes)
        session.close()
    }

    @Test
    fun `does not retry a malformed GDSP header`() = runTest {
        val watch = FakeZeppWatch(authKey)
        watch.gdspBlocks[GdspDataType.ACTIVITY.code] = ArrayDeque(
            listOf(FakeZeppWatch.GdspBlock(1, LocalDateTime.of(2026, 10, 30, 8, 0), byteArrayOf(0, 1, 1, 10, 70))),
        )
        watch.malformedGdspHeader = true
        val session = driver().openSession(watch.gatt, withKey)
        try {
            session.sync(SyncRequest(since = Instant.parse("2026-10-30T00:00:00Z")), RecordingSink()) {}
            fail("expected WearableProtocolException")
        } catch (e: WearableProtocolException) {
            assertTrue(e.message!!.contains("Malformed GDSP header"))
        }
        assertEquals(1, activityHeaderRequests(watch))
        assertEquals(listOf<Int?>(null), watch.stopCodes)
        session.close()
    }

    private fun activityHeaderRequests(watch: FakeZeppWatch): Int =
        watch.headerRequests.count { it[1].toInt() and 0xFF == GdspDataType.ACTIVITY.code }
}
