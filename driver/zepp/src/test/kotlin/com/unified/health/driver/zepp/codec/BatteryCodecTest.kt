package com.unified.health.driver.zepp.codec

import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test

class BatteryCodecTest {

    @Test
    fun `parses the level from the plain flags layout`() {
        assertEquals(55, LegacyBatteryCodec.parseLevel(byteArrayOf(0x00, 55)))
        assertEquals(100, LegacyBatteryCodec.parseLevel(byteArrayOf(0x00, 100)))
    }

    @Test
    fun `parses the level when flagged fields follow it`() {
        // bit0 DC status (+1) and bit3 last-charge level (+1): [flags, level, dc, lastLevel].
        assertEquals(42, LegacyBatteryCodec.parseLevel(byteArrayOf(0x09, 42, 1, 80)))
        // All flag bits: +1 dc, +8 last-charge-full, +8 last-charge, +1 last-charge-level after the level.
        val full = ByteArray(20).also {
            it[0] = 0x0F
            it[1] = 77
        }
        assertEquals(77, LegacyBatteryCodec.parseLevel(full))
    }

    @Test
    fun `rejects truncated or out-of-range payloads`() {
        assertNull(LegacyBatteryCodec.parseLevel(byteArrayOf(0x00)))
        assertNull(LegacyBatteryCodec.parseLevel(byteArrayOf(0x08, 55))) // bit3 byte missing
        assertNull(LegacyBatteryCodec.parseLevel(byteArrayOf(0x00, 101)))
    }

    @Test
    fun `module 0x29 commands match the vendor battery commands`() {
        assertEquals(0x29, ZeppOsBatteryCodec.MODULE)
        assertArrayEquals(byteArrayOf(0x01), ZeppOsBatteryCodec.queryVersion())
        assertArrayEquals(byteArrayOf(0x03), ZeppOsBatteryCodec.queryBattery())
    }
}
