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
import com.unified.health.driver.huawei.codec.DeviceConfigCommands
import com.unified.health.driver.huawei.codec.FrameCodec
import com.unified.health.driver.huawei.codec.FrameReassembler
import com.unified.health.driver.huawei.codec.HuaweiCommand
import com.unified.health.driver.huawei.codec.IvGenerator
import com.unified.health.driver.huawei.codec.LinkParameters
import com.unified.health.driver.huawei.codec.LiveHeartRateCommands
import com.unified.health.driver.huawei.codec.PayloadCipher
import com.unified.health.driver.huawei.codec.Tlv
import com.unified.health.driver.huawei.transport.HuaweiCommandChannel
import com.unified.health.driver.huawei.transport.TransportTimeouts
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.TestScope
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.withTimeout
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
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

    /** Post-authentication handshake order (HUAWEI_CONNECTION_ANALYSIS.md §1.5); BLE never sends 0x0116. */
    private val HANDSHAKE = listOf("0101", "0107", "0105", "0102", "0103", "0132")

    /** Same, with the two optional steps the fake watch can announce (0x0137 → 0x013C, then 0x0112). */
    private val HANDSHAKE_OPTIONAL = listOf("0101", "0107", "0105", "0102", "0103", "0137", "013C", "0132", "0112")

    /** 0x0107 reply: firmware "11.0.1.8", model (type 20) "GT 4", device name type 12, BT mode type 22. */
    private val VERSION_REPLY = "0107 0108 31312e302e312e38 1404 47542034 0c06 576174636834 1603 424c45"

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
        // §1.2: TLV 9 of the 0x0101 response decides bonding (0 = none, 1/2 = bond when BOND_NONE),
        // so the link requirement must not bond before the handshake. There is no GattClient bond
        // operation to run the TLV 9 branch afterwards; see TODO(huawei-bond) in HuaweiDriver.
        assertFalse(driver.linkRequirements.bond)
        assertEquals(null, driver.linkRequirements.mtu)
    }

    // --- auth branch selection ---------------------------------------------------------------

    @Test
    fun `authVersion 0 skips app auth and runs the clear-text handshake`() = runTest {
        val battery = characteristic(StandardUuids.BATTERY_SERVICE, StandardUuids.BATTERY_LEVEL, PROPERTY_READ)
        val serial = characteristic(StandardUuids.DEVICE_INFORMATION_SERVICE, StandardUuids.SERIAL_NUMBER, PROPERTY_READ)
        val watch = FakeWatch(authVersion = 0, extra = listOf(battery, serial))
        watch.gatt.readValues[StandardUuids.BATTERY_LEVEL] = byteArrayOf(10)
        watch.gatt.readValues[StandardUuids.SERIAL_NUMBER] = "UATTSN".toByteArray()
        // No authenticator bound at all: the no-auth branch must not look for one.
        val session = driver(emptySet()).openSession(watch.gatt, context) as HuaweiSession

        assertEquals(HANDSHAKE, watch.received.map { it.tag })
        assertTrue("no handshake command may be encrypted without a work key", watch.encryptedTags.isEmpty())
        assertEquals(0, session.configuration.linkParameters.authVersion)

        val info = session.readDeviceInfo()
        assertEquals(DeviceInfo(model = "GT 4", firmwareVersion = "11.0.1.8", serialNumber = "UATTSN", batteryPercent = 68), info)
        assertTrue(session.capabilities.contains(DeviceCapability.BATTERY_LEVEL))
        session.close()
    }

    @Test
    fun `non-zero auth version without an authenticator stops with a precise app-auth error`() = runTest {
        val watch = FakeWatch(authVersion = 3, authType = 2)
        try {
            driver(emptySet()).openSession(watch.gatt, context)
            throw AssertionError("Expected UnsupportedDeviceException")
        } catch (e: UnsupportedDeviceException) {
            val message = e.message!!
            assertTrue(message, message.startsWith("Direct BLE is not available for this watch because it requires Huawei's app-level authentication"))
            assertTrue(message, message.contains("HiChainLite (PIN)"))
            assertTrue(message, message.contains("auth version 0x0003"))
            assertTrue(message, message.contains("Health Connect"))
        }
        // Fails fast: only 0x0101 was attempted; no auth command and no CAK/HiChain traffic.
        assertEquals(listOf("0101"), watch.received.map { it.tag })
        assertEquals("5a000d00010101000200030004001000afdc", watch.gatt.writes.first().value.toHex())
    }

    @Test
    fun `authVersion 0 target selection is decided by the link parameters, not the authenticator set`() {
        assertEquals(0, LinkParameters.parse(HuaweiCommand.decode("0101 0512 0000$randA".replace(" ", "").hexToBytes())).authVersion)
    }

    @Test
    fun `plugged authenticator unlocks encrypted time sync and a full raw sweep`() = runTest {
        val watch = FakeWatch()
        val authenticator = FakeAuthenticator()
        val session = driver(setOf(authenticator)).openSession(watch.gatt, context)

        assertEquals(randA, authenticator.seenRandA)
        assertEquals(HANDSHAKE, watch.received.map { it.tag })
        // An authenticator ran, so the handshake commands use the encrypted envelope.
        assertTrue(watch.encryptedTags.containsAll(HANDSHAKE.drop(1)))
        assertEquals("0105 0104 65000000 02020000".replace(" ", ""), watch.received[2].encode().toHex())

        val sink = RecordingSink()
        var progress = 0f
        val count = session.sync(SyncRequest(since = null, now = clock.instant()), sink) { fraction, _ -> progress = fraction }
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
        val count = session.sync(SyncRequest(since = null, now = clock.instant()), sink) { _, _ -> }
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
        assertEquals("Watch4", version.deviceName)
        assertEquals("BLE", version.deviceBtMode)
        assertEquals(listOf(1, 7), session.configuration.supportedServices)
        assertTrue(session.configuration.commandSupport != null)
        // 0x0101 auth diagnostic is exposed on the session path.
        assertEquals(3, session.configuration.linkParameters.authVersion)
        assertEquals(2, session.configuration.linkParameters.authType)
        // Battery is announced by 0x0103 (service 1 cmd 8); this fake exposes no GATT Battery service.
        assertEquals(setOf(DeviceCapability.BATTERY_LEVEL), session.capabilities)
        // 0x0132 after 0x0103: epoch, offset and the IANA name.
        val tz = watch.received.single { it.tag == "0132" }
        assertEquals(listOf(1, 2, 3), tz.tlvs.map { it.tag })
        assertEquals("Etc/UTC", tz.tlvs.find { it.tag == 3 }!!.value.toString(Charsets.UTF_8))
        assertEquals(0x65000000L, tz.tlvs.find { it.tag == 1 }!!.uint())
        // 0x0103 announces commands only for services 0x0102 reported.
        val consult = watch.received.single { it.tag == "0103" }.tlvs.single().children()
        assertEquals(listOf(1, 7), consult.filter { it.tag == 2 }.map { it.int() })
        session.close()
    }

    @Test
    fun `optional handshake steps run in the vendor order and carry the verified payloads`() = runTest {
        val watch = FakeWatch(supportOptionalCommands = true)
        val session = driver(setOf(FakeAuthenticator())).openSession(watch.gatt, context)

        assertEquals(HANDSHAKE_OPTIONAL, watch.received.map { it.tag })
        // 0x0137: one empty TLV 1, then 0x013C with TLVs 1/2 because the reply reports dual socket
        // bit 56 and not extend socket bit 142.
        assertEquals("01370100", watch.received.single { it.tag == "0137" }.encode().toHex())
        assertEquals(listOf(1, 2), watch.received.single { it.tag == "013C" }.tlvs.map { it.tag })
        // 0x0112: empty nested TLV 0x81.
        assertEquals("01128100", watch.received.single { it.tag == "0112" }.encode().toHex())
        session.close()
    }

    @Test
    fun `time zone request uses the clock's region id`() = runTest {
        val watch = FakeWatch()
        val zoned = Clock.fixed(clock.instant(), ZoneId.of("Asia/Ho_Chi_Minh"))
        HuaweiDriver(setOf(FakeAuthenticator()), StandardTestDispatcher(testScheduler), zoned, TransportTimeouts())
            .openSession(watch.gatt, context).close()
        val tz = watch.received.single { it.tag == "0132" }
        assertEquals(listOf(1, 2, 3), tz.tlvs.map { it.tag })
        assertEquals("Asia/Ho_Chi_Minh", tz.tlvs.find { it.tag == 3 }!!.value.toString(Charsets.UTF_8))
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
        // Battery comes from the service 1 cmd 8 query (68 %), not the GATT fallback (10 %).
        assertEquals(DeviceInfo(model = "GT 4", firmwareVersion = "11.0.1.8", serialNumber = "GATTSN", batteryPercent = 68), info)
        session.close()
    }

    @Test
    fun `rejected optional steps do not fail the connection`() = runTest {
        val watch = FakeWatch(rejectOptional = true)
        val session = driver(setOf(FakeAuthenticator())).openSession(watch.gatt, context) as HuaweiSession
        assertEquals(null, session.configuration.version)
        assertEquals(null, session.configuration.supportedServices)
        assertEquals(null, session.configuration.commandSupport)
        // 0x0102 failed, so 0x0103 and the capability-gated 0x0132 are not sent.
        assertEquals(listOf("0101", "0107", "0105", "0102"), watch.received.map { it.tag })
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
        session.sync(SyncRequest(since = null, now = clock.instant()), sink) { _, _ -> }
        val kinds = sink.ofType<HealthRecord.RawPayload>().map { it.kind }
        assertTrue(kinds.toString(), kinds.containsAll(listOf("huawei_watch_fitness_0708", "huawei_watch_device_status_0108")))
        assertEquals("0708010148", sink.ofType<HealthRecord.RawPayload>().single { it.kind == "huawei_watch_fitness_0708" }.bytes.toHex())
        // Drained: a second sync does not repeat them.
        val again = RecordingSink()
        session.sync(SyncRequest(since = null, now = clock.instant()), again) { _, _ -> }
        assertTrue(again.ofType<HealthRecord.RawPayload>().none { it.kind.startsWith("huawei_watch_") })
        session.close()
    }

    // --- live heart rate ---------------------------------------------------------------------

    @Test
    fun `live heart rate opens service 23 cmd 18 and emits typed cmd 3 samples`() = runTest {
        val watch = FakeWatch(supportLiveHeartRate = true)
        val session = driver(setOf(FakeAuthenticator())).openSession(watch.gatt, context) as HuaweiSession
        assertTrue(session.capabilities.contains(DeviceCapability.LIVE_HEART_RATE))

        val sample = withTimeout(5_000) { session.liveHeartRate.first() }
        assertEquals(72, sample.bpm)
        assertEquals(Instant.ofEpochSecond(0x65000000), sample.time)

        // Cancelling the collection closes the report (operator 1 = open, 0 = close).
        val reports = watch.received.filter { it.tag == LiveHeartRateCommands.report(open = true).tag }
        assertEquals(listOf(1, 0), reports.map { it.tlvs.single { tlv -> tlv.tag == 1 }.int() })
        session.close()
    }

    // --- failures ----------------------------------------------------------------------------

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
        authVersion: Int = 3,
        authType: Int = 2,
        supportOptionalCommands: Boolean = false,
        supportLiveHeartRate: Boolean = false,
        extra: List<GattCharacteristic> = emptyList(),
    ) {
        private val answer = answer
        private val timeSyncError = timeSyncError
        private val rejectHealthFrameCount = rejectHealthFrameCount
        private val rejectOptional = rejectOptional
        private val supportOptionalCommands = supportOptionalCommands
        private val supportLiveHeartRate = supportLiveHeartRate

        /** The authVersion 0 branch has no work key, so the fake watch answers in clear text too. */
        private val encryptReplies = authVersion != 0

        val gatt = FakeGattClient(listOf(write, notify) + extra)
        val received = mutableListOf<HuaweiCommand>()
        val encryptedTags = mutableListOf<String>()
        private val reassembler = FrameReassembler()
        private val cipher = PayloadCipher(workKey, CipherMode.AES_CBC_PKCS5, IvGenerator(null))

        /** Link parameters: maxFrame 64, singleFrame 244, interval 10, the configured auth fields, CBC. */
        private val linkResponse =
            "0101 02020040 030200f4 04010a 0512 %04x%s 0701%02x".format(authVersion, randA, authType)
                .replace(" ", "").hexToBytes()

        init {
            gatt.onWrite = { _, value ->
                for (event in reassembler.feed(value)) {
                    val payload = (event as FrameReassembler.Event.Payload).bytes
                    val encrypted = PayloadCipher.isEncrypted(payload)
                    val command = HuaweiCommand.decode(cipher.decrypt(payload))
                    received += command
                    if (encrypted) encryptedTags += command.tag
                    if (!answer) continue
                    when (command.tag) {
                        // 0x0101 is the pre-auth link negotiation: its reply is always clear text.
                        "0101" -> sendPayload(linkResponse, encrypt = false)
                        "0107" -> sendClear(if (rejectOptional) NACK_0107 else VERSION_REPLY)
                        "0102" -> if (rejectOptional) {
                            sendClear("0102 7f04 0001a9ca")
                        } else {
                            sendCommand(HuaweiCommand(1, 2, listOf(Tlv(1, serviceBitmap()))))
                        }
                        "0103" -> sendCommand(HuaweiCommand(1, 3, commandSupportFathers(command)))
                        "0137" -> sendCommand(HuaweiCommand(1, 0x37, listOf(expandCapabilityFather())))
                        "013C", "0112" -> sendCommand(HuaweiCommand(DeviceConfigCommands.SERVICE_ID, command.commandId, listOf(successTlv())))
                        "0105" -> sendClear(if (timeSyncError) "0105 7f040001a9ca" else "0105 7f04000186a0")
                        "0132" -> sendClear("0132 0104 65000000")
                        "0108" -> sendClear("0108 0101 44") // 68 %
                        "1712" -> {
                            sendCommand(HuaweiCommand(23, 18, listOf(successTlv())))
                            if (openReportRequested(command)) {
                                LIVE_SAMPLES.forEach(::pushLiveHeartRate)
                            }
                        }
                        "0703" -> sendClear("0703 01020fa0")
                        "0704" -> sendClear(if (rejectHealthFrameCount) "0704 7f0400012ccc" else "0704 0104 0000000a")
                        "070A" -> sendClear("070a 0104 0000001e")
                        "070C" -> sendClear("070c 0104 00000003")
                    }
                }
            }
        }

        /** Sends a watch-initiated (unsolicited) message. */
        fun push(clearHex: String) = sendPayload(clearHex.clean())

        private fun sendClear(hex: String) = sendPayload(hex.clean())

        private fun sendCommand(command: HuaweiCommand) = sendPayload(command.encode())

        private fun sendPayload(clear: ByteArray, encrypt: Boolean = encryptReplies) {
            val payload = if (encrypt) cipher.encrypt(clear) else clear
            for (frame in FrameCodec.encode(payload, maxFrame = 64)) {
                frame.toList().chunked(20).forEach { gatt.notify(notify, it.toByteArray()) }
            }
        }

        private fun serviceBitmap(): ByteArray {
            val services = buildList {
                add(DeviceConfigCommands.SERVICE_ID)
                add(7)
                if (supportLiveHeartRate) add(LiveHeartRateCommands.SERVICE_ID)
            }
            return ByteArray(services.size) { 1 }
        }

        private fun commandSupportFathers(command: HuaweiCommand): List<Tlv> {
            val groups = mutableListOf<Pair<Int, List<Int>>>()
            var service = 0
            for (child in command.tlvs.single().children()) {
                when (child.tag) {
                    2 -> service = child.int()
                    3 -> groups += service to child.value.drop(1).map { it.toInt() and 0xFF }
                }
            }
            return groups.map { (serviceId, commands) ->
                val vector = ByteArray(commands.size) { index ->
                    val supported = when {
                        serviceId == DeviceConfigCommands.SERVICE_ID &&
                            commands[index] in setOf(DeviceConfigCommands.EXPAND_CAPABILITY, DeviceConfigCommands.DEVICE_SUPPORT_ACTIVITY_TYPE) ->
                            supportOptionalCommands
                        serviceId == LiveHeartRateCommands.SERVICE_ID -> supportLiveHeartRate
                        else -> true
                    }
                    if (supported) 1 else 0
                }
                Tlv.nested(0x81, listOf(Tlv.u8(2, serviceId), Tlv(4, vector)))
            }
        }

        /** 0x0137 reply: only bit 56 (dual socket) set, so 0x013C carries TLVs 1/2. */
        private fun expandCapabilityFather(): Tlv {
            val bitmap = ByteArray(8).also { it[7] = 1 }
            return Tlv.nested(0x81, listOf(Tlv(1, bitmap.joinToString("") { b -> "%02x".format(b) }.toByteArray(Charsets.US_ASCII))))
        }

        private fun successTlv() = Tlv(HuaweiCommand.ERROR_TAG, byteArrayOf(0x00, 0x01, 0x86.toByte(), 0xA0.toByte()))

        private fun openReportRequested(command: HuaweiCommand): Boolean =
            command.tlvs.singleOrNull()?.let { it.tag == 1 && it.int() == LiveHeartRateCommands.OPERATOR_OPEN } == true

        private fun pushLiveHeartRate(bpm: Int) {
            val time = clock.instant().epochSecond
            val inner = Tlv.nested(0x82, listOf(Tlv.u8(3, bpm), Tlv.u32(4, time), Tlv.u8(5, 100)))
            val outer = Tlv.nested(0x81, listOf(inner))
            sendCommand(HuaweiCommand(LiveHeartRateCommands.SERVICE_ID, LiveHeartRateCommands.NOTICE_ID, listOf(outer)))
        }

        private fun String.clean() = replace(" ", "").hexToBytes()
    }

    private companion object {
        const val NACK_0107 = "0107 7f04 0001a9ca"
        val LIVE_SAMPLES = listOf(72, 74)
    }
}
