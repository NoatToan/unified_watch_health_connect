package com.unified.health.driver.zepp

import com.unified.health.core.ble.driver.AuthenticationException
import com.unified.health.core.ble.driver.CredentialReader
import com.unified.health.core.ble.driver.MissingCredentialException
import com.unified.health.core.ble.driver.RecognitionScore
import com.unified.health.core.ble.driver.SessionContext
import com.unified.health.core.ble.driver.SyncRequest
import com.unified.health.core.ble.driver.UnsupportedDeviceException
import com.unified.health.core.ble.driver.WearableProtocolException
import com.unified.health.core.ble.gatt.StandardUuids
import com.unified.health.core.ble.protocol.hexToBytes
import com.unified.health.core.ble.scan.Advertisement
import com.unified.health.core.model.DeviceCapability
import com.unified.health.core.model.HealthRecord
import com.unified.health.core.testing.RecordingSink
import com.unified.health.driver.zepp.codec.GdspCodec
import com.unified.health.driver.zepp.codec.GdspDataType
import com.unified.health.driver.zepp.codec.TimeSync
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

    @Test
    fun `declares the auth key credential and link requirements`() {
        val driver = ZeppDriver()
        assertEquals(listOf("zepp.auth_key"), driver.credentialRequirements.map { it.key })
        assertTrue(driver.credentialRequirements.single().description.contains("Zepp app"))
        assertFalse(driver.linkRequirements.bond)
        assertEquals(247, driver.linkRequirements.mtu)
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
    fun `channel v1 without encrypt byte authenticates via module 0x80 session auth`() = runTest {
        val watch = FakeZeppWatch(authKey, channelVersion = 1, encryptByte = null)
        val session = driver().openSession(watch.gatt, withKey)
        assertTrue(watch.authenticated)
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
    fun `channel v1 with module 0x82 authenticates (version is framing only, not the auth choice)`() = runTest {
        val watch = FakeZeppWatch(authKey, channelVersion = 1)
        val session = driver().openSession(watch.gatt, withKey)
        assertTrue(watch.authenticated)
        session.close()
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
    fun `GDSP CRC mismatch fails the sync without confirming delivery`() = runTest {
        val watch = FakeZeppWatch(authKey)
        watch.gdspBlocks[GdspDataType.ACTIVITY.code] = ArrayDeque(
            listOf(FakeZeppWatch.GdspBlock(1, LocalDateTime.of(2026, 10, 30, 8, 0), byteArrayOf(0, 1, 1, 10, 70))),
        )
        watch.corruptNextCrc = true
        val session = driver().openSession(watch.gatt, withKey)
        try {
            session.sync(SyncRequest(since = Instant.parse("2026-10-30T00:00:00Z")), RecordingSink()) {}
            fail("expected WearableProtocolException")
        } catch (e: WearableProtocolException) {
            assertTrue(e.message!!.contains("CRC"))
        }
        assertEquals(listOf<Int?>(null), watch.stopCodes)
        session.close()
    }
}
