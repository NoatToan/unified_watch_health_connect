package com.unified.health.driver.huawei.codec

import com.unified.health.core.ble.protocol.hexToBytes
import com.unified.health.core.ble.protocol.toHex
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test
import java.time.Instant

class LiveHeartRateTest {

    private val fallback = Instant.ofEpochSecond(1_700_000_000)

    private fun String.clean() = replace(" ", "").hexToBytes()

    @Test
    fun `report request is service 23 command 18 with the operator tlv`() {
        val open = LiveHeartRateCommands.report(open = true)
        assertEquals(23, open.serviceId)
        assertEquals(18, open.commandId)
        assertEquals("1712010101", open.encode().toHex())
        assertEquals("1712010100", LiveHeartRateCommands.report(open = false).encode().toHex())
    }

    @Test
    fun `cmd 3 nested notification maps tlv 3 to bpm and tlv 4 to epoch seconds`() {
        // 81 0e | 82 0c | 03 01 48 (72) | 04 04 65000000 | 05 01 64 (credibility)
        val command = HuaweiCommand.decode("1703 810e 820c 030148 040465000000 050164".clean())
        val sample = LiveHeartRateParser.parse(command, fallback)!!
        assertEquals(72, sample.bpm)
        assertEquals(Instant.ofEpochSecond(0x65000000), sample.time)
    }

    @Test
    fun `cmd 3 flat notification and the brief's one-byte tlv 4 layout are accepted`() {
        assertEquals(72, LiveHeartRateParser.parse(HuaweiCommand.decode("1703 030148".clean()), fallback)!!.bpm)
        // HUAWEI_CONNECTION_ANALYSIS.md §3 words cmd 3 as "TLV 4 = HR"; a one-byte TLV 4 is unambiguous.
        val brief = LiveHeartRateParser.parse(HuaweiCommand.decode("1703 040148".clean()), fallback)!!
        assertEquals(72, brief.bpm)
        assertEquals(fallback, brief.time)
    }

    @Test
    fun `a four-byte tlv 4 is a timestamp, not a heart rate`() {
        assertNull(LiveHeartRateParser.parse(HuaweiCommand.decode("1703 040465000000".clean()), fallback))
    }

    @Test
    fun `missing, zero or rejected heart rate yields no record`() {
        assertNull(LiveHeartRateParser.parse(HuaweiCommand.decode("1703 050164".clean()), fallback))
        assertNull(LiveHeartRateParser.parse(HuaweiCommand.decode("1703 030100".clean()), fallback))
        assertNull(LiveHeartRateParser.parse(HuaweiCommand.decode("1703 7f04 0001a9ca 030148".clean()), fallback))
        assertNull(LiveHeartRateParser.parse(HuaweiCommand.decode("0703 030148".clean()), fallback))
    }
}
