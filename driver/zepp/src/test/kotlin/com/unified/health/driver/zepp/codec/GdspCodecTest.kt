package com.unified.health.driver.zepp.codec

import com.unified.health.core.ble.protocol.MalformedPayloadException
import com.unified.health.core.ble.protocol.bytesOf
import com.unified.health.core.model.HealthRecord
import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test
import java.time.Instant
import java.time.ZoneId
import java.time.ZoneOffset

class GdspCodecTest {

    @Test
    fun `timezone key counts quarter hours`() {
        assertEquals(0, GdspCodec.timezoneKey(0))
        assertEquals(28, GdspCodec.timezoneKey(7 * 3600))
        assertEquals(23, GdspCodec.timezoneKey(5 * 3600 + 45 * 60))
        assertEquals(-14, GdspCodec.timezoneKey(-(3 * 3600 + 30 * 60)))
    }

    @Test
    fun `header request uses local wall clock and tz key`() {
        val since = Instant.parse("2026-10-31T17:30:15Z")
        val request = GdspCodec.requestHeader(GdspDataType.ACTIVITY, since, ZoneId.of("Asia/Ho_Chi_Minh"), gdspVersion = 1)
        // 2026-11-01 00:30:15 at UTC+7 (key 28)
        assertArrayEquals(bytesOf(0x01, 0x01, 0xEA, 0x07, 11, 1, 0, 30, 15, 28), request)

        val v2 = GdspCodec.requestHeader(GdspDataType.SPO2_POINT, since, ZoneOffset.UTC, gdspVersion = 2)
        assertArrayEquals(bytesOf(0x01, 0x25, 0xEA, 0x07, 10, 31, 17, 30, 15, 0, 0), v2)
    }

    @Test
    fun `parses a header with a negative tz key`() {
        // count 1440, 2026-10-31 08:00:00 local at tz key -20 (UTC-5)
        val header = GdspCodec.parseHeader(bytesOf(0xA0, 0x05, 0x00, 0x00, 0xEA, 0x07, 10, 31, 8, 0, 0, 0xEC, 0x99))
        assertEquals(1440L, header.count)
        assertEquals(Instant.parse("2026-10-31T13:00:00Z"), header.start)
    }

    @Test(expected = MalformedPayloadException::class)
    fun `short header is malformed`() {
        GdspCodec.parseHeader(ByteArray(11))
    }

    @Test(expected = MalformedPayloadException::class)
    fun `invalid header date is malformed`() {
        GdspCodec.parseHeader(bytesOf(1, 0, 0, 0, 0xEA, 0x07, 13, 31, 8, 0, 0, 0))
    }

    @Test
    fun `empty header may carry a zeroed time`() {
        assertEquals(0L, GdspCodec.parseHeader(ByteArray(12)).count)
    }

    @Test
    fun `stop and transfer helpers`() {
        assertArrayEquals(bytesOf(0x03, 0x01), GdspCodec.stopTransfer(GdspCodec.STOP_CODE_CONFIRM_DELIVERED))
        assertEquals(0x04030201L, GdspCodec.parseTransferCrc(bytesOf(1, 2, 3, 4)))
        assertEquals(null, GdspCodec.parseTransferCrc(bytesOf(1, 2, 3)))
    }

    private val t0 = Instant.parse("2026-10-31T00:00:00Z")

    @Test
    fun `activity 4-byte records produce steps and heart rate`() {
        val payload = bytesOf(0x09, 1, 50, 12, 65, 1, 0, 0, 0, 1, 0, 3, 0xFE, 1, 0, 0, 0xFF)
        val records = GdspRecordParsers.parseActivity(payload, t0, minuteCount = 4)
        assertEquals(
            listOf(
                HealthRecord.Steps(t0, t0.plusSeconds(60), 12),
                HealthRecord.HeartRate(t0, 65),
                HealthRecord.Steps(t0.plusSeconds(120), t0.plusSeconds(180), 3),
            ),
            records,
        )
    }

    @Test
    fun `activity 8-byte records are detected from the minute count`() {
        val payload = bytesOf(0x00, 1, 2, 200, 90, 0, 0, 0, 0, 1, 2, 0, 0, 0, 0, 0, 0)
        val records = GdspRecordParsers.parseActivity(payload, t0, minuteCount = 2)
        assertEquals(listOf(HealthRecord.Steps(t0, t0.plusSeconds(60), 200), HealthRecord.HeartRate(t0, 90)), records)
    }

    @Test(expected = MalformedPayloadException::class)
    fun `activity with a partial record is malformed`() {
        GdspRecordParsers.parseActivity(bytesOf(0, 1, 2, 3), t0, minuteCount = 1)
    }

    @Test
    fun `spo2 points with and without a version byte`() {
        val record = bytesOf(0x00, 0x10, 0x5E, 0x6A, 96)
        val expected = listOf(HealthRecord.SpO2(Instant.ofEpochSecond(0x6A5E1000), 96))
        assertEquals(expected, GdspRecordParsers.parseSpo2(record).records)
        assertEquals(expected, GdspRecordParsers.parseSpo2(bytesOf(0x01) + record + bytesOf(0, 0, 0, 0, 0)).records)
        val v2 = GdspRecordParsers.parseSpo2(bytesOf(0x02) + record)
        assertTrue(v2.records.isEmpty())
        assertEquals(2, v2.unsupportedVersion)
    }

    @Test(expected = MalformedPayloadException::class)
    fun `spo2 with a bad length is malformed`() {
        GdspRecordParsers.parseSpo2(ByteArray(7))
    }

    @Test
    fun `stress skips invalid minutes`() {
        val records = GdspRecordParsers.parseStressAllDay(bytesOf(20, 0, 0xFF, 101, 100), t0)
        assertEquals(listOf(HealthRecord.Stress(t0, 20), HealthRecord.Stress(t0.plusSeconds(240), 100)), records)
    }
}
