package com.unified.health.driver.xiaomi.device

import com.unified.health.driver.xiaomi.FakeMiWearWatch
import com.unified.health.driver.xiaomi.proto.ProtoWriter
import com.unified.health.driver.xiaomi.proto.S7r
import com.unified.health.driver.xiaomi.proto.Txo
import com.unified.health.driver.xiaomi.proto.Wxo
import com.unified.health.driver.xiaomi.transport.XiaomiLink
import kotlinx.coroutines.test.TestScope
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Test
import java.time.Instant
import java.time.ZoneOffset

/** Exercises `XiaomiDeviceCommands` against a real [XiaomiLink] driven by a scripted [FakeMiWearWatch]. */
class XiaomiDeviceCommandsTest {

    /**
     * Starts a [XiaomiLink] whose reader/background-pump coroutines run in [TestScope.backgroundScope]
     * instead of an independent [kotlinx.coroutines.SupervisorJob]: `runTest` cancels background-scope
     * work once the test body completes, so `XiaomiLink`'s `while (true) { delay(...) }` pump can never
     * keep `advanceUntilIdle` spinning forever (it has nothing else to do, see `XiaomiLinkTest` for the
     * same fix).
     */
    private suspend fun TestScope.startedLink(watch: FakeMiWearWatch): XiaomiLink {
        val link = XiaomiLink(watch.gatt, watch.write, watch.notify, backgroundScope)
        link.start()
        return link
    }

    @Test
    fun `readBattery decodes percent, charge status and charge info`() = runTest {
        val watch = FakeMiWearWatch()
        watch.onRequest(S7r.CLASS_SYSTEM, 1) {
            val chargeInfo = ProtoWriter().int32Field(1, 1).int32Field(2, 1_700_000_000).toByteArray()
            val a = ProtoWriter().int32Field(1, 72).int32Field(2, 1).messageField(3, chargeInfo).toByteArray()
            val vwo = ProtoWriter().messageField(1, a).toByteArray()
            S7r(e = S7r.CLASS_SYSTEM, f = 1, txo = Txo(vwo = vwo).encode()).encode()
        }
        val link = startedLink(watch)

        val battery = XiaomiDeviceCommands.readBattery(link)

        assertEquals(72, battery.percent)
        assertEquals(1, battery.chargeStatus)
        assertEquals(1, battery.chargeState)
        assertEquals(Instant.ofEpochSecond(1_700_000_000), battery.chargeTimestamp)
    }

    @Test
    fun `readBattery tolerates an empty response`() = runTest {
        val watch = FakeMiWearWatch()
        watch.onRequest(S7r.CLASS_SYSTEM, 1) { S7r(e = S7r.CLASS_SYSTEM, f = 1).encode() }
        val link = startedLink(watch)

        val battery = XiaomiDeviceCommands.readBattery(link)

        assertNull(battery.percent)
        assertNull(battery.chargeTimestamp)
    }

    @Test
    fun `readWatchInfo decodes serial, firmware and model`() = runTest {
        val watch = FakeMiWearWatch()
        watch.onRequest(S7r.CLASS_SYSTEM, 2) {
            val swo = ProtoWriter()
                .stringField(1, "SN777")
                .stringField(2, "2.0.1")
                .stringField(4, "Smart Band 10")
                .toByteArray()
            S7r(e = S7r.CLASS_SYSTEM, f = 2, txo = Txo(swo = swo).encode()).encode()
        }
        val link = startedLink(watch)

        val info = XiaomiDeviceCommands.readWatchInfo(link)

        assertEquals("SN777", info.serialNumber)
        assertEquals("2.0.1", info.firmwareVersion)
        assertEquals("Smart Band 10", info.model)
    }

    @Test
    fun `setTime sends the encoded wxo without waiting for a response`() = runTest {
        val watch = FakeMiWearWatch()
        val link = startedLink(watch)
        // 12:30:00.250 UTC == 19:30:00.250 at UTC+7 (the doc's time-sync example).
        val instant = Instant.parse("2026-11-12T12:30:00.250Z")

        XiaomiDeviceCommands.setTime(link, instant, ZoneOffset.ofHours(7))

        val sent = watch.received.single { it.e == S7r.CLASS_SYSTEM && it.f == 3 }
        val wxo = Wxo.decode(checkNotNull(Txo.decode(checkNotNull(sent.txo)).wxo))
        assertEquals(2026, wxo.year)
        assertEquals(11, wxo.month)
        assertEquals(12, wxo.day)
        assertEquals(19, wxo.hour)
        assertEquals(30, wxo.minute)
        assertEquals(0, wxo.second)
        assertEquals(250, wxo.millis)
        assertEquals(28, wxo.utcOffset15min)
        assertEquals(0, wxo.dstOffset15min)
        assertTrue(wxo.is24HourFormat)
    }
}
