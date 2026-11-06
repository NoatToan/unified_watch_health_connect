package com.unified.health.core.demo.virtual

import com.unified.health.core.ble.driver.RecognitionScore
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout
import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test
import java.time.Instant
import java.time.LocalDateTime

class StandardVirtualWatchTest {

    private val now = Instant.parse("2026-11-06T10:00:00Z")

    @Test
    fun `advertises only public SIG services, no vendor data`() {
        val ad = StandardVirtualWatch.advertisement()
        assertTrue(ad.hasService(StandardVirtualWatch.HEART_RATE_SERVICE))
        assertTrue(ad.manufacturerData.isEmpty())
        assertTrue(RecognitionScore.STANDARD_SERVICE > RecognitionScore.NONE)
    }

    @Test
    fun `racp before the clock is set reports clock-not-set records`() = runBlocking {
        val gatt = StandardVirtualWatchGatt(now = { now })
        val spot = gatt.subscribe(StandardVirtualWatch.PLX_SPOT_CHECK)
        val racp = gatt.subscribe(StandardVirtualWatch.RACP)
        gatt.write(StandardVirtualWatch.RACP, byteArrayOf(0x01, 0x01))
        assertArrayEquals(byteArrayOf(0x06, 0x00, 0x01, 0x01), racp.receive())
        val first = spot.receive()
        assertEquals(0x13, first[0].toInt())
        gatt.close()
    }

    @Test
    fun `racp after a cts write reports a week of timestamped spot checks`() = runBlocking {
        val gatt = StandardVirtualWatchGatt(now = { now })
        gatt.write(StandardVirtualWatch.CURRENT_TIME, SigBytes.currentTime(LocalDateTime.of(2026, 11, 6, 17, 0)))
        val spot = gatt.subscribe(StandardVirtualWatch.PLX_SPOT_CHECK)
        val racp = gatt.subscribe(StandardVirtualWatch.RACP)
        gatt.write(StandardVirtualWatch.RACP, byteArrayOf(0x01, 0x01))
        racp.receive()
        val records = List(StandardVirtualWatch.STORED_DAYS * StandardVirtualWatch.STORED_READING_TIMES.size) { spot.receive() }
        assertTrue(spot.tryReceive().isFailure)
        assertEquals(0x03, records.first()[0].toInt())
        assertEquals(LocalDateTime.of(2026, 10, 30, 7, 30), SigBytes.parseDateTime(records.first().copyOfRange(5, 12)))
        assertEquals(LocalDateTime.of(2026, 11, 5, 21, 15), SigBytes.parseDateTime(records.last().copyOfRange(5, 12)))
        gatt.close()
    }

    @Test
    fun `heart rate streams while subscribed and stops on close`() = runBlocking {
        val gatt = StandardVirtualWatchGatt(tickMs = 5, now = { now })
        val hr = gatt.subscribe(StandardVirtualWatch.HR_MEASUREMENT)
        val frames = withTimeout(2_000) { List(3) { hr.receive() } }
        frames.forEach {
            assertEquals(0x16, it[0].toInt())
            assertTrue((it[1].toInt() and 0xFF) in 60..90)
        }
        gatt.close()
        assertTrue(!gatt.connected.value)
    }
}
