package com.unified.health.driver.zepp.codec

import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Test
import java.time.Instant
import java.time.ZoneId
import java.time.ZoneOffset

class TimeSyncTest {

    @Test
    fun `encodes a UTC timestamp`() {
        // 2026-11-06T10:15:30Z is a Friday (Java dayOfWeek=5) -> Huami dayOfWeek = 5 % 7 = 5.
        val bytes = TimeSync.encode(Instant.parse("2026-11-06T10:15:30Z"), ZoneOffset.UTC)
        assertArrayEquals(
            byteArrayOf(0xEA.toByte(), 0x07, 11, 6, 10, 15, 30, 5, 0, 0, 0),
            bytes,
        )
    }

    @Test
    fun `encodes a positive offset with its quarter-hour timezone key`() {
        // Asia/Ho_Chi_Minh is UTC+07:00, no DST: tzKey = 7h * 4 = 28 (`GdspCodec.timezoneKey`).
        val zone = ZoneId.of("Asia/Ho_Chi_Minh")
        // 2026-11-06T17:00:00Z = 2026-11-07T00:00:00+07:00 (Saturday, Huami dayOfWeek = 6 % 7 = 6).
        val bytes = TimeSync.encode(Instant.parse("2026-11-06T17:00:00Z"), zone)
        assertArrayEquals(
            byteArrayOf(0xEA.toByte(), 0x07, 11, 7, 0, 0, 0, 6, 0, 0, 28),
            bytes,
        )
    }

    @Test
    fun `payload is always 11 bytes`() {
        assertEquals(TimeSync.PAYLOAD_SIZE, TimeSync.encode(Instant.EPOCH, ZoneOffset.UTC).size)
    }

    @Test
    fun `fraction is milliseconds divided by four`() {
        // Vendors write Calendar.MILLISECOND / 4 (`ProfileUtils.java:49`).
        val bytes = TimeSync.encode(Instant.parse("2026-11-06T10:15:30.800Z"), ZoneOffset.UTC)
        assertEquals(200, bytes[8].toInt() and 0xFF)
        assertEquals(0, bytes[9].toInt() and 0xFF)
    }

    @Test
    fun `marks the DST adjust reason while the zone is in daylight saving time`() {
        // 2026-07-01 in New York is EDT (UTC-4, DST) → adjustReason = 8, tzKey = -16.
        val bytes = TimeSync.encode(Instant.parse("2026-07-01T12:00:00Z"), ZoneId.of("America/New_York"))
        assertEquals(TimeSync.ADJUST_REASON_DST, bytes[9].toInt() and 0xFF)
    }

    @Test
    fun `does not mark DST outside daylight saving time`() {
        val bytes = TimeSync.encode(Instant.parse("2026-01-01T12:00:00Z"), ZoneId.of("America/New_York"))
        assertEquals(0, bytes[9].toInt() and 0xFF)
    }
}
