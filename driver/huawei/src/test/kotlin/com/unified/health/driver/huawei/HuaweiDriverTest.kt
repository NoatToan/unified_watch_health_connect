package com.unified.health.driver.huawei

import com.unified.health.core.ble.driver.RecognitionScore
import com.unified.health.core.ble.driver.SessionContext
import com.unified.health.core.ble.driver.SyncRequest
import com.unified.health.core.ble.driver.UnsupportedDeviceException
import com.unified.health.core.ble.driver.WearableProtocolException
import com.unified.health.core.ble.gatt.GattCharacteristic
import com.unified.health.core.ble.gatt.GattCharacteristic.Companion.PROPERTY_NOTIFY
import com.unified.health.core.ble.gatt.GattCharacteristic.Companion.PROPERTY_READ
import com.unified.health.core.ble.gatt.GattCharacteristic.Companion.PROPERTY_WRITE
import com.unified.health.core.ble.gatt.StandardUuids
import com.unified.health.core.ble.protocol.hexToBytes
import com.unified.health.core.ble.protocol.toHex
import com.unified.health.core.ble.scan.Advertisement
import com.unified.health.core.model.DeviceCapability
import com.unified.health.core.model.DeviceInfo
import com.unified.health.core.model.HealthRecord
import com.unified.health.core.model.WearableVendor
import com.unified.health.core.testing.FakeGattClient
import com.unified.health.core.testing.RecordingSink
import com.unified.health.core.testing.characteristic
import com.unified.health.driver.huawei.auth.HuaweiAuthMode
import com.unified.health.driver.huawei.auth.HuaweiAuthenticator
import com.unified.health.driver.huawei.auth.HuaweiSessionKeys
import com.unified.health.driver.huawei.codec.CipherMode
import com.unified.health.driver.huawei.codec.FrameCodec
import com.unified.health.driver.huawei.codec.FrameReassembler
import com.unified.health.driver.huawei.codec.HuaweiCommand
import com.unified.health.driver.huawei.codec.IvGenerator
import com.unified.health.driver.huawei.codec.LinkParameters
import com.unified.health.driver.huawei.codec.PayloadCipher
import com.unified.health.driver.huawei.transport.HuaweiCommandChannel
import com.unified.health.driver.huawei.transport.TransportTimeouts
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.TestScope
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test
import java.time.Clock
import java.time.Instant
import java.time.ZoneId
import java.time.ZoneOffset

class HuaweiDriverTest {

    private val write = characteristic(HuaweiUuids.SERVICE, HuaweiUuids.WRITE, PROPERTY_WRITE)
    private val notify = characteristic(HuaweiUuids.SERVICE, HuaweiUuids.NOTIFY, PROPERTY_NOTIFY)
    private val context = SessionContext("AA:BB:CC:DD:EE:FF", credentials = { null })
    private val clock = Clock.fixed(Instant.ofEpochSecond(0x65000000), ZoneOffset.UTC)
    private val workKey = "00112233445566778899aabbccddeeff".hexToBytes()
    private val randA = "a0a1a2a3a4a5a6a7a8a9aaabacadaeaf"

    /** Post-authentication handshake order (§5.1 / §11). */
    private val HANDSHAKE = listOf("0101", "0107", "0105", "0132", "0102", "0103")

    /** 0x0107 reply: firmware "11.0.1.8", model (type 20) "GT 4", battery 75 %, capability bitmap 0f. */
    private val VERSION_REPLY = "0107 0108 31312e302e312e38 1404 47542034 0c01 4b 1601 0f"

    /** Link parameters: maxFrame 64, singleFrame 244, interval 10, auth version 3, auth type 2 (HiChainLite), CBC. */
    private val linkResponse = "0101 020200 40 030200f4 04010a 0512 0003$randA 070102".replace(" ", "").hexToBytes()

    // --- recognize -------------------------------------------------------------------------

    @Test
    fun `recognises Huawei and Honor names and the FE86 service`() {
        val driver = HuaweiDriver(emptySet())
        assertEquals(RecognitionScore.VENDOR_SERVICE, driver.recognize(Advertisement("A", null, -60, serviceUuids = setOf(HuaweiUuids.SERVICE))))
        for (name in listOf("HUAWEI WATCH GT 4-1A2", "HUAWEI WATCH FIT 3-B1", "HUAWEI Band 8-AB1", "honor band A2-123", "HONOR Band 6-9", "Honor Watch-1")) {
            assertEquals(name, RecognitionScore.NAME, driver.recognize(Advertisement("A", name, -60)))
        }
        for (name in listOf(null, "HUAWEI FreeBuds 5", "Mi Band 7", "Amazfit GTR", "Forerunner 265")) {
            assertEquals("$name", RecognitionScore.NONE, driver.recognize(Advertisement("A", name, -60)))
        }
        assertEquals(RecognitionScore.NONE, driver.recognize(Advertisement("A", "Polar", -60, serviceUuids = setOf(StandardUuids.HEART_RATE_SERVICE))))
        assertTrue(driver.linkRequirements.bond)
        assertEquals(null, driver.linkRequirements.mtu)
    }

    // --- handshake ---------------------------------------------------------------------------

    @Test
    fun `without an authenticator the handshake stops with a clear unsupported error`() = runTest {
        val watch = FakeWatch()
        try {
            driver(emptySet()).openSession(watch.gatt, context)
            throw AssertionError("Expected UnsupportedDeviceException")
        } catch (e: UnsupportedDeviceException) {
            assertTrue(e.message, e.message!!.startsWith("Huawei HiChainLite (PIN) authentication is not supported yet"))
        }
        assertEquals("5a000d00010101000200030004001000afdc", watch.gatt.writes.first().value.toHex())
        assertEquals(listOf("0101"), watch.received.map { it.tag })
    }

    @Test
    fun `plugged authenticator unlocks encrypted time sync and a full raw sweep`() = runTest {
        val watch = FakeWatch()
        val authenticator = FakeAuthenticator()
        val session = driver(setOf(authenticator)).openSession(watch.gatt, context)

        assertEquals(randA, authenticator.seenRandA)
        assertEquals(HANDSHAKE, watch.received.map { it.tag })
        assertEquals("0105 0104 65000000 02020000".replace(" ", ""), watch.received[2].encode().toHex())

        val sink = RecordingSink()
        var progress = 0f
        val count = session.sync(SyncRequest(since = null, now = clock.instant()), sink) { progress = it }
        assertEquals(0, count)
        assertEquals(1f, progress)
        // The sweep fires every documented service-7 request once, in order, after the handshake.
        assertEquals(HANDSHAKE + listOf("0703", "0704", "070A", "070C"), watch.received.map { it.tag })

        val raws = sink.ofType<HealthRecord.RawPayload>()
        assertEquals(4, raws.size)
        fun raw(kind: String) = raws.single { it.kind == kind }
        for (r in raws) assertEquals(WearableVendor.HUAWEI, r.vendor)
        assertEquals("0703 01020fa0".replace(" ", ""), raw(HuaweiSession.RAW_TODAY_TOTAL).bytes.toHex())
        assertEquals("0704 0104 0000000a".replace(" ", ""), raw(HuaweiSession.RAW_HEALTH_FRAME_COUNT).bytes.toHex())
        assertEquals("070a 0104 0000001e".replace(" ", ""), raw(HuaweiSession.RAW_SAMPLE_FRAME_COUNT).bytes.toHex())
        assertEquals("070c 0104 00000003".replace(" ", ""), raw(HuaweiSession.RAW_STATUS_FRAME_COUNT).bytes.toHex())
        assertTrue("every write fits the ATT payload", watch.gatt.writes.all { it.value.size <= watch.gatt.maxWriteLength })
        session.close()
    }

    @Test
    fun `a probe the watch rejects is skipped, the rest of the sweep still runs`() = runTest {
        val watch = FakeWatch(rejectHealthFrameCount = true)
        val session = driver(setOf(FakeAuthenticator())).openSession(watch.gatt, context)

        val sink = RecordingSink()
        val count = session.sync(SyncRequest(since = null, now = clock.instant()), sink) { }
        assertEquals(0, count)
        val raws = sink.ofType<HealthRecord.RawPayload>()
        assertEquals(setOf(HuaweiSession.RAW_TODAY_TOTAL, HuaweiSession.RAW_SAMPLE_FRAME_COUNT, HuaweiSession.RAW_STATUS_FRAME_COUNT), raws.map { it.kind }.toSet())
        session.close()
    }

    @Test
    fun `handshake learns version, time zone and capabilities`() = runTest {
        val watch = FakeWatch()
        val session = driver(setOf(FakeAuthenticator())).openSession(watch.gatt, context) as HuaweiSession

        val version = session.configuration.version!!
        assertEquals("11.0.1.8", version.firmwareVersion)
        assertEquals("GT 4", version.productModel)
        assertEquals(75, version.batteryPercent)
        assertEquals(listOf(1, 7), session.configuration.supportedServices)
        assertTrue(session.configuration.commandCapability != null)
        // Battery comes from 0x0107 even though this fake exposes no GATT Battery service.
        assertEquals(setOf(DeviceCapability.BATTERY_LEVEL), session.capabilities)
        // UTC clock: 0x0132 carries the IANA name, nothing else (TLV 0x01 layout is unknown).
        val tz = watch.received.single { it.tag == "0132" }
        assertEquals(listOf(3), tz.tlvs.map { it.tag })
        assertEquals("Etc/UTC", tz.tlvs.single().value.toString(Charsets.UTF_8))
        // 0x0103 announces commands only for services 0x0102 reported.
        val consult = watch.received.single { it.tag == "0103" }.tlvs.single().children()
        assertEquals(listOf(1, 7), consult.filter { it.tag == 2 }.map { it.int() })
        session.close()
    }

    @Test
    fun `time zone request uses the clock's region id`() = runTest {
        val watch = FakeWatch()
        val zoned = Clock.fixed(clock.instant(), ZoneId.of("Asia/Ho_Chi_Minh"))
        HuaweiDriver(setOf(FakeAuthenticator()), StandardTestDispatcher(testScheduler), zoned, TransportTimeouts())
            .openSession(watch.gatt, context).close()
        val tz = watch.received.single { it.tag == "0132" }.tlvs.single()
        assertEquals("Asia/Ho_Chi_Minh", tz.value.toString(Charsets.UTF_8))
    }

    @Test
    fun `device info prefers 0x0107 over standard gatt`() = runTest {
        val battery = characteristic(StandardUuids.BATTERY_SERVICE, StandardUuids.BATTERY_LEVEL, PROPERTY_READ)
        val firmware = characteristic(StandardUuids.DEVICE_INFORMATION_SERVICE, StandardUuids.FIRMWARE_REVISION, PROPERTY_READ)
        val serial = characteristic(StandardUuids.DEVICE_INFORMATION_SERVICE, StandardUuids.SERIAL_NUMBER, PROPERTY_READ)
        val watch = FakeWatch(extra = listOf(battery, firmware, serial))
        watch.gatt.readValues[StandardUuids.BATTERY_LEVEL] = byteArrayOf(10)
        watch.gatt.readValues[StandardUuids.FIRMWARE_REVISION] = "gatt-fw".toByteArray()
        watch.gatt.readValues[StandardUuids.SERIAL_NUMBER] = "GATTSN".toByteArray()
        val session = driver(setOf(FakeAuthenticator())).openSession(watch.gatt, context)

        val info = session.readDeviceInfo()
        assertEquals(DeviceInfo(model = "GT 4", firmwareVersion = "11.0.1.8", serialNumber = "GATTSN", batteryPercent = 75), info)
        session.close()
    }

    @Test
    fun `rejected optional steps do not fail the connection`() = runTest {
        val watch = FakeWatch(rejectOptional = true)
        val session = driver(setOf(FakeAuthenticator())).openSession(watch.gatt, context) as HuaweiSession
        assertEquals(null, session.configuration.version)
        assertEquals(null, session.configuration.supportedServices)
        assertEquals(null, session.configuration.commandCapability)
        // 0x0102 failed, so 0x0103 is not sent at all.
        assertEquals(listOf("0101", "0107", "0105", "0132", "0102"), watch.received.map { it.tag })
        assertEquals(emptySet<DeviceCapability>(), session.capabilities)
        session.close()
    }

    @Test
    fun `watch initiated messages are routed and handed over raw by the next sync`() = runTest {
        val watch = FakeWatch()
        val session = driver(setOf(FakeAuthenticator())).openSession(watch.gatt, context)
        watch.push("0708 0101 48") // unsolicited fitness message (layout unknown)
        watch.push("0108 0101 05") // unsolicited device-config message
        testScheduler.advanceUntilIdle()

        val sink = RecordingSink()
        session.sync(SyncRequest(since = null, now = clock.instant()), sink) { }
        val kinds = sink.ofType<HealthRecord.RawPayload>().map { it.kind }
        assertTrue(kinds.toString(), kinds.containsAll(listOf("huawei_watch_fitness_0708", "huawei_watch_device_status_0108")))
        assertEquals("0708010148", sink.ofType<HealthRecord.RawPayload>().single { it.kind == "huawei_watch_fitness_0708" }.bytes.toHex())
        // Drained: a second sync does not repeat them.
        val again = RecordingSink()
        session.sync(SyncRequest(since = null, now = clock.instant()), again) { }
        assertTrue(again.ofType<HealthRecord.RawPayload>().none { it.kind.startsWith("huawei_watch_") })
        session.close()
    }

    @Test
    fun `silent watch times out after three attempts`() = runTest {
        val watch = FakeWatch(answer = false)
        try {
            driver(emptySet()).openSession(watch.gatt, context)
            throw AssertionError("Expected timeout")
        } catch (e: WearableProtocolException) {
            assertTrue(e.message, e.message!!.contains("after 3 attempts"))
        }
        assertEquals(3, watch.gatt.writes.size)
    }

    @Test
    fun `watch error on time sync is reported`() = runTest {
        val watch = FakeWatch(timeSyncError = true)
        try {
            driver(setOf(FakeAuthenticator())).openSession(watch.gatt, context)
            throw AssertionError("Expected NAK")
        } catch (e: WearableProtocolException) {
            assertTrue(e.message, e.message!!.contains("rejected 0105 with error 109002"))
        }
    }

    @Test(expected = UnsupportedDeviceException::class)
    fun `fails without the FE86 service`() = runTest {
        driver(emptySet()).openSession(FakeGattClient(emptyList()), context)
    }

    // --- helpers -----------------------------------------------------------------------------

    private fun TestScope.driver(authenticators: Set<HuaweiAuthenticator>) =
        HuaweiDriver(authenticators, StandardTestDispatcher(testScheduler), clock, TransportTimeouts())

    private inner class FakeAuthenticator : HuaweiAuthenticator {
        override val mode = HuaweiAuthMode.HICHAIN_LITE
        var seenRandA: String? = null

        override suspend fun authenticate(channel: HuaweiCommandChannel, link: LinkParameters, context: SessionContext): HuaweiSessionKeys {
            seenRandA = link.randA?.toHex()
            return HuaweiSessionKeys(workKey, ivCounterSeed = 5)
        }
    }

    /** Scripted watch: reassembles what the driver writes and answers in 20-byte notifications. */
    private inner class FakeWatch(
        answer: Boolean = true,
        timeSyncError: Boolean = false,
        rejectHealthFrameCount: Boolean = false,
        rejectOptional: Boolean = false,
        extra: List<GattCharacteristic> = emptyList(),
    ) {
        val gatt = FakeGattClient(listOf(write, notify) + extra)
        val received = mutableListOf<HuaweiCommand>()
        private val reassembler = FrameReassembler()
        private val cipher = PayloadCipher(workKey, CipherMode.AES_CBC_PKCS5, IvGenerator(null))

        init {
            gatt.onWrite = { _, value ->
                for (event in reassembler.feed(value)) {
                    val payload = (event as FrameReassembler.Event.Payload).bytes
                    val command = HuaweiCommand.decode(cipher.decrypt(payload))
                    received += command
                    if (!answer) continue
                    when (command.tag) {
                        "0101" -> send(linkResponse)
                        "0107" -> send(cipher.encrypt((if (rejectOptional) "0107 7f04 0001a9ca" else VERSION_REPLY).clean()))
                        "0132" -> send(cipher.encrypt((if (rejectOptional) "0132 7f04 0001a9ca" else "0132 7f04 000186a0").clean()))
                        "0102" -> send(cipher.encrypt((if (rejectOptional) "0102 7f04 0001a9ca" else "0102 0102 0101").clean()))
                        "0103" -> send(cipher.encrypt("0103 7f04 000186a0".clean()))
                        "0105" -> send(cipher.encrypt((if (timeSyncError) "0105 7f040001a9ca" else "0105 7f04000186a0").clean()))
                        "0703" -> send(cipher.encrypt("0703 01020fa0".clean()))
                        "0704" -> if (rejectHealthFrameCount) {
                            send(cipher.encrypt("0704 7f0400012ccc".clean()))
                        } else {
                            send(cipher.encrypt("0704 0104 0000000a".clean()))
                        }
                        "070A" -> send(cipher.encrypt("070a 0104 0000001e".clean()))
                        "070C" -> send(cipher.encrypt("070c 0104 00000003".clean()))
                    }
                }
            }
        }

        /** Sends a watch-initiated (unsolicited) encrypted message. */
        fun push(clearHex: String) = send(cipher.encrypt(clearHex.clean()))

        private fun send(payload: ByteArray) {
            for (frame in FrameCodec.encode(payload, maxFrame = 64)) {
                frame.toList().chunked(20).forEach { gatt.notify(notify, it.toByteArray()) }
            }
        }

        private fun String.clean() = replace(" ", "").hexToBytes()
    }
}
