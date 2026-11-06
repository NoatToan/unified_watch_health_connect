package com.unified.health.driver.zepp.codec

import com.unified.health.core.ble.protocol.MalformedPayloadException
import com.unified.health.core.model.HealthRecord
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Assert.assertThrows
import org.junit.Test
import java.time.Instant
import java.time.LocalDate
import java.time.ZoneOffset

class GdspRecordParsersTest {

    private val t0: Long = 1_700_000_000L // 2023-11-14T22:13:20Z; an arbitrary fixed epoch for hand-computed vectors.

    // --- SpO2 ---

    @Test
    fun `parses v1 SpO2 points without a version prefix`() {
        val payload = byteArrayOf(0, 0, 0, 0, 96) // n*5 bytes: timestamp=0 is filtered, exercising the guard
        val result = GdspRecordParsers.parseSpo2(payload)
        assertEquals(emptyList<HealthRecord.SpO2>(), result.records)
        assertNull(result.unsupportedVersion)
    }

    @Test
    fun `parses v1 SpO2 points with an explicit version-1 prefix`() {
        val le = t0.toLe32()
        val payload = byteArrayOf(0x01) + le + byteArrayOf(97)
        val result = GdspRecordParsers.parseSpo2(payload)
        assertEquals(listOf(HealthRecord.SpO2(Instant.ofEpochSecond(t0), 97)), result.records)
    }

    @Test
    fun `parses a v2 SpO2 record into 60 history points`() {
        val le = t0.toLe32()
        val history = ByteArray(60) { 90 }
        history[59] = 96 // newest history byte: must land exactly on t0.
        val payload = byteArrayOf(0x02) + le + byteArrayOf(99 /* current, superseded */) + history
        val result = GdspRecordParsers.parseSpo2(payload)
        assertEquals(60, result.records.size)
        assertEquals(HealthRecord.SpO2(Instant.ofEpochSecond(t0 - 59 * 60), 90), result.records.first())
        assertEquals(HealthRecord.SpO2(Instant.ofEpochSecond(t0), 96), result.records.last())
    }

    @Test
    fun `an unknown SpO2 version is reported, not decoded, when the body still fits a known record size`() {
        val payload = byteArrayOf(0x09, 0, 0, 0, 0, 50) // body is one 5-byte record, but version 9 is unknown.
        val result = GdspRecordParsers.parseSpo2(payload)
        assertEquals(emptyList<HealthRecord.SpO2>(), result.records)
        assertEquals(9, result.unsupportedVersion)
    }

    @Test
    fun `a length that fits no known SpO2 record size is malformed`() {
        assertThrows(MalformedPayloadException::class.java) { GdspRecordParsers.parseSpo2(ByteArray(7)) }
    }

    // --- Stress ---

    @Test
    fun `stress all-day skips the leading byte and maps one value per minute`() {
        val payload = byteArrayOf(0x00, 30, 0xFF.toByte(), 0x00, 45)
        val start = Instant.ofEpochSecond(t0)
        val records = GdspRecordParsers.parseStressAllDay(payload, start)
        assertEquals(
            listOf(HealthRecord.Stress(start, 30), HealthRecord.Stress(start.plusSeconds(180), 45)),
            records,
        )
    }

    @Test
    fun `stress single parses timestamped records after the leading byte`() {
        val le = t0.toLe32()
        val payload = byteArrayOf(0x00) + le + byteArrayOf(55)
        assertEquals(listOf(HealthRecord.Stress(Instant.ofEpochSecond(t0), 55)), GdspRecordParsers.parseStressSingle(payload))
    }

    @Test
    fun `stress single rejects a payload that is not 1 + n times 5 bytes`() {
        assertThrows(MalformedPayloadException::class.java) { GdspRecordParsers.parseStressSingle(byteArrayOf(0x00, 1, 2, 3)) }
    }

    // --- Resting heart rate (inferred, NEEDS-REAL-WATCH) ---

    @Test
    fun `resting heart rate converts the timestamp to a local date`() {
        val le = t0.toLe32()
        val payload = byteArrayOf(0x00) + le + byteArrayOf(58)
        val records = GdspRecordParsers.parseRestingHeartRate(payload, ZoneOffset.UTC)
        assertEquals(listOf(HealthRecord.RestingHeartRate(LocalDate.ofInstant(Instant.ofEpochSecond(t0), ZoneOffset.UTC), 58)), records)
    }

    @Test
    fun `resting heart rate rejects a malformed payload instead of guessing`() {
        assertThrows(MalformedPayloadException::class.java) { GdspRecordParsers.parseRestingHeartRate(byteArrayOf(0x00, 1, 2), ZoneOffset.UTC) }
    }

    private fun Long.toLe32(): ByteArray = byteArrayOf(
        (this and 0xFF).toByte(),
        ((this ushr 8) and 0xFF).toByte(),
        ((this ushr 16) and 0xFF).toByte(),
        ((this ushr 24) and 0xFF).toByte(),
    )
}
