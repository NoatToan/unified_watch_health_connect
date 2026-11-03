package com.unified.health.driver.huawei

import com.unified.health.core.ble.driver.RecognitionScore
import com.unified.health.core.ble.driver.SessionContext
import com.unified.health.core.ble.driver.SyncRequest
import com.unified.health.core.ble.driver.UnsupportedDeviceException
import com.unified.health.core.ble.driver.WearableProtocolException
import com.unified.health.core.ble.gatt.GattCharacteristic.Companion.PROPERTY_NOTIFY
import com.unified.health.core.ble.gatt.GattCharacteristic.Companion.PROPERTY_WRITE
import com.unified.health.core.ble.gatt.StandardUuids
import com.unified.health.core.ble.protocol.hexToBytes
import com.unified.health.core.ble.protocol.toHex
import com.unified.health.core.ble.scan.Advertisement
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
import java.time.ZoneOffset

class HuaweiDriverTest {

    private val write = characteristic(HuaweiUuids.SERVICE, HuaweiUuids.WRITE, PROPERTY_WRITE)
    private val notify = characteristic(HuaweiUuids.SERVICE, HuaweiUuids.NOTIFY, PROPERTY_NOTIFY)
    private val context = SessionContext("AA:BB:CC:DD:EE:FF", credentials = { null })
    private val clock = Clock.fixed(Instant.ofEpochSecond(0x65000000), ZoneOffset.UTC)
    private val workKey = "00112233445566778899aabbccddeeff".hexToBytes()
    private val randA = "a0a1a2a3a4a5a6a7a8a9aaabacadaeaf"

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
    fun `plugged authenticator unlocks encrypted time sync and sync`() = runTest {
        val watch = FakeWatch()
        val authenticator = FakeAuthenticator()
        val session = driver(setOf(authenticator)).openSession(watch.gatt, context)

        assertEquals(randA, authenticator.seenRandA)
        assertEquals(listOf("0101", "0105"), watch.received.map { it.tag })
        assertEquals("0105 0104 65000000 02020000".replace(" ", ""), watch.received[1].encode().toHex())

        val sink = RecordingSink()
        var progress = 0f
        val count = session.sync(SyncRequest(since = null, now = clock.instant()), sink) { progress = it }
        assertEquals(0, count)
        assertEquals(1f, progress)
        val raw = sink.ofType<HealthRecord.RawPayload>().single()
        assertEquals(WearableVendor.HUAWEI, raw.vendor)
        assertEquals(HuaweiSession.RAW_TODAY_TOTAL, raw.kind)
        assertEquals("0703 01020fa0".replace(" ", ""), raw.bytes.toHex())
        assertTrue("every write fits the ATT payload", watch.gatt.writes.all { it.value.size <= watch.gatt.maxWriteLength })
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
    private inner class FakeWatch(answer: Boolean = true, timeSyncError: Boolean = false) {
        val gatt = FakeGattClient(listOf(write, notify))
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
                        "0105" -> send(cipher.encrypt((if (timeSyncError) "0105 7f040001a9ca" else "0105 7f04000186a0").clean()))
                        "0703" -> send(cipher.encrypt("0703 01020fa0".clean()))
                    }
                }
            }
        }

        private fun send(payload: ByteArray) {
            for (frame in FrameCodec.encode(payload, maxFrame = 64)) {
                frame.toList().chunked(20).forEach { gatt.notify(notify, it.toByteArray()) }
            }
        }

        private fun String.clean() = replace(" ", "").hexToBytes()
    }
}
