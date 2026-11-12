package com.unified.health.driver.xiaomi.transport

import com.unified.health.core.ble.driver.WearableProtocolException
import com.unified.health.driver.xiaomi.FakeMiWearWatch
import com.unified.health.driver.xiaomi.proto.ProtoWriter
import com.unified.health.driver.xiaomi.proto.S7r
import com.unified.health.driver.xiaomi.proto.Txo
import com.unified.health.driver.xiaomi.proto.Vwo
import kotlinx.coroutines.test.TestScope
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Assert.fail
import org.junit.Test

class XiaomiLinkTest {

    /**
     * Builds a [XiaomiLink] whose reader/background-pump coroutines run in [TestScope.backgroundScope]
     * instead of an independent [kotlinx.coroutines.SupervisorJob]: `runTest` cancels background-scope
     * work once the test body completes, so `XiaomiLink`'s `while (true) { delay(...) }` pump can never
     * keep `advanceUntilIdle` spinning forever on the shared test scheduler.
     */
    private fun TestScope.buildLink(watch: FakeMiWearWatch): XiaomiLink =
        XiaomiLink(watch.gatt, watch.write, watch.notify, backgroundScope, clock = { 0L })

    /** `vwo { 1: a { 1: batteryPercent } }` (protocol §9.2 [V]); [Vwo] only needs to decode this. */
    private fun vwoBytes(batteryPercent: Int): ByteArray {
        val a = ProtoWriter().int32Field(1, batteryPercent).toByteArray()
        return ProtoWriter().messageField(1, a).toByteArray()
    }

    @Test
    fun `start completes the L1 session-start exchange`() = runTest {
        val watch = FakeMiWearWatch()
        buildLink(watch).start()
        // No exception: the CMD_L1START_RSP was received, parsed and applied.
    }

    @Test
    fun `start times out when the watch never answers the CMD exchange`() = runTest {
        val watch = FakeMiWearWatch(answersL1Start = false)
        try {
            buildLink(watch).start(timeoutMs = 1_000)
            fail("expected WearableProtocolException")
        } catch (e: WearableProtocolException) {
            assertTrue(e.message!!.contains("session-start"))
        }
    }

    @Test
    fun `request round-trips a battery response`() = runTest {
        val watch = FakeMiWearWatch()
        watch.onRequest(S7r.CLASS_SYSTEM, 1) {
            S7r(e = S7r.CLASS_SYSTEM, f = 1, txo = Txo(vwo = vwoBytes(87)).encode()).encode()
        }
        val link = buildLink(watch)
        link.start()

        val response = link.request(S7r.CLASS_SYSTEM, 1, payload = null, timeoutMs = 5_000)

        val vwo = Vwo.decode(checkNotNull(Txo.decode(checkNotNull(response.txo)).vwo))
        assertEquals(87, vwo.batteryPercent)
        assertEquals(1, watch.received.count { it.e == S7r.CLASS_SYSTEM && it.f == 1 })
    }

    @Test
    fun `request throws a typed exception when the watch answers field 100 with an error`() = runTest {
        val watch = FakeMiWearWatch()
        watch.onRequest(S7r.CLASS_SYSTEM, 1) { S7r(e = S7r.CLASS_SYSTEM, f = 1, errorCode = 4).encode() }
        val link = buildLink(watch)
        link.start()

        val exception = try {
            link.request(S7r.CLASS_SYSTEM, 1, payload = null, timeoutMs = 5_000)
            fail("expected XiaomiDeviceErrorException")
            return@runTest
        } catch (e: com.unified.health.driver.xiaomi.proto.XiaomiDeviceErrorException) {
            e
        }
        assertEquals(4, exception.errorCode)
    }

    @Test
    fun `request times out when the watch never answers`() = runTest {
        val watch = FakeMiWearWatch()
        watch.onRequest(S7r.CLASS_SYSTEM, 1) { null }
        val link = buildLink(watch)
        link.start()

        try {
            link.request(S7r.CLASS_SYSTEM, 1, payload = null, timeoutMs = 1_000)
            fail("expected WearableProtocolException")
        } catch (e: WearableProtocolException) {
            assertTrue(e.message!!.contains("did not answer"))
        }
    }

    @Test
    fun `a NAK causes a retransmit and the request still succeeds`() = runTest {
        val watch = FakeMiWearWatch()
        watch.failFirstDataWithNak = true
        watch.onRequest(S7r.CLASS_SYSTEM, 1) {
            S7r(e = S7r.CLASS_SYSTEM, f = 1, txo = Txo(vwo = vwoBytes(55)).encode()).encode()
        }
        val link = buildLink(watch)
        link.start()

        val response = link.request(S7r.CLASS_SYSTEM, 1, payload = null, timeoutMs = 5_000)

        val vwo = Vwo.decode(checkNotNull(Txo.decode(checkNotNull(response.txo)).vwo))
        assertEquals(55, vwo.batteryPercent)
    }

    @Test
    fun `send does not wait for an answer`() = runTest {
        val watch = FakeMiWearWatch()
        val link = buildLink(watch)
        link.start()

        link.send(S7r.CLASS_SYSTEM, 3, byteArrayOf(1, 2, 3))

        assertEquals(1, watch.received.count { it.e == S7r.CLASS_SYSTEM && it.f == 3 })
    }

    @Test
    fun `close is idempotent and safe to call without start`() = runTest {
        val watch = FakeMiWearWatch()
        val link = buildLink(watch)
        link.close()
        link.close()

        val started = buildLink(watch)
        started.start()
        started.close()
        started.close()
    }
}
