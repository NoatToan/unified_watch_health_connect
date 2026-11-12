package com.unified.health.driver.xiaomi.transport

import com.unified.health.core.ble.protocol.hexToBytes
import org.junit.Assert.assertEquals
import org.junit.Test

class Crc16ArcTest {

    @Test
    fun `empty payload has crc zero`() {
        assertEquals(0, Crc16Arc.compute(ByteArray(0)))
    }

    @Test
    fun `matches the getBindInfo l2 payload vector`() {
        // XIAOMI_TEST_VECTORS.json getBindInfo.l2_hex / l1_crc16 = 62814 (0xF55E).
        val l2 = "0101080110111a165a1408001210e807f1fcf82d132f9bb018ca6738a19f".hexToBytes()
        assertEquals(62814, Crc16Arc.compute(l2))
    }

    @Test
    fun `matches the L1 START request config payload`() {
        // XIAOMI_MIWEAR_DEVICE_PROTOCOL.md §3.2: full frame crc bytes are "1d 4d" (LE -> 0x4d1d).
        val payload = "0101030001000002020000fc03020020000402001027".hexToBytes()
        assertEquals(0x4d1d, Crc16Arc.compute(payload))
    }

    @Test
    fun `offset and length restrict the computed range`() {
        val whole = byteArrayOf(0xAA.toByte(), 0x01, 0x02, 0xBB.toByte())
        val inner = byteArrayOf(0x01, 0x02)
        assertEquals(Crc16Arc.compute(inner), Crc16Arc.compute(whole, offset = 1, length = 2))
    }
}
