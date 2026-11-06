package com.unified.health.driver.standard.codec

import com.unified.health.core.ble.protocol.ByteReader
import com.unified.health.core.ble.protocol.MalformedPayloadException
import com.unified.health.core.ble.protocol.bytesOf
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Test
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.ZonedDateTime

class SigCodecTest {

    /** 2026-11-05 08:30:00 as a SIG Date Time. */
    private val dateTime = intArrayOf(0xEA, 0x07, 0x0B, 0x05, 0x08, 0x1E, 0x00)

    @Test
    fun `sfloat decodes mantissa and exponent and rejects specials`() {
        assertEquals(98.0, SigTypes.sfloat(0x0062)!!, 1e-9)
        assertEquals(97.5, SigTypes.sfloat(0xF3CF)!!, 1e-9) // 975 x 10^-1
        assertEquals(-1.0, SigTypes.sfloat(0x0FFF)!!, 1e-9)
        assertEquals(1200.0, SigTypes.sfloat(0x200C)!!, 1e-9) // 12 x 10^2
        listOf(0x07FF, 0x0800, 0x07FE, 0x0802, 0x0801).forEach { assertNull(SigTypes.sfloat(it)) }
    }

    @Test
    fun `float32 decodes body temperature`() {
        assertEquals(36.6, SigTypes.float32(0xFF00016EL)!!, 1e-9)
        assertEquals(-5.0, SigTypes.float32(0x00FFFFFBL)!!, 1e-9)
        assertNull(SigTypes.float32(0x007FFFFFL))
    }

    @Test
    fun `date time parses and treats zero fields as unknown`() {
        assertEquals(LocalDateTime.of(2026, 11, 5, 8, 30, 0), SigTypes.dateTime(ByteReader(bytesOf(*dateTime))))
        val unknown = ByteReader(bytesOf(0, 0, 0, 0, 0, 0, 0, 0x42))
        assertNull(SigTypes.dateTime(unknown))
        assertEquals("all 7 bytes consumed", 0x42, unknown.u8())
    }

    @Test
    fun `current time encodes exact time 256 with manual adjust reason`() {
        val time = ZonedDateTime.of(2026, 11, 6, 10, 15, 30, 500_000_000, ZoneId.of("UTC"))
        // 2026-11-06 is a Friday (5).
        assertArrayEquals(bytesOf(0xEA, 0x07, 0x0B, 0x06, 0x0A, 0x0F, 0x1E, 0x05, 0x80, 0x01), SigTypes.currentTime(time))
    }

    @Test
    fun `local time information is quarter hours of the standard offset plus dst`() {
        val brisbane = ZonedDateTime.of(2026, 1, 1, 0, 0, 0, 0, ZoneId.of("Australia/Brisbane"))
        assertArrayEquals(bytesOf(40, 0), SigTypes.localTimeInformation(brisbane))
        val sydneySummer = ZonedDateTime.of(2026, 1, 1, 0, 0, 0, 0, ZoneId.of("Australia/Sydney"))
        assertArrayEquals(bytesOf(40, 4), SigTypes.localTimeInformation(sydneySummer))
        val india = ZonedDateTime.of(2026, 1, 1, 0, 0, 0, 0, ZoneId.of("Asia/Kolkata"))
        assertArrayEquals(bytesOf(22, 0), SigTypes.localTimeInformation(india))
    }

    @Test
    fun `heart rate measurement formats, contact and rr intervals`() {
        assertEquals(72, HeartRateMeasurement.parse(bytesOf(0x00, 72)).bpm)
        assertEquals(300, HeartRateMeasurement.parse(bytesOf(0x01, 0x2C, 0x01)).bpm)

        val full = HeartRateMeasurement.parse(bytesOf(0x1E, 60, 0x10, 0x00, 0x00, 0x04, 0x00, 0x02))
        assertEquals(60, full.bpm)
        assertEquals(true, full.contactDetected)
        assertEquals(16, full.energyExpendedKj)
        assertEquals(listOf(1000, 500), full.rrIntervalsMs)
        assertTrue(full.isUsable)

        val noContact = HeartRateMeasurement.parse(bytesOf(0x04, 70))
        assertEquals(false, noContact.contactDetected)
        assertFalse(noContact.isUsable)
        assertNull(HeartRateMeasurement.parse(bytesOf(0x00, 70)).contactDetected)
        assertFalse(HeartRateMeasurement.parse(bytesOf(0x00, 0)).isUsable)
    }

    @Test(expected = MalformedPayloadException::class)
    fun `heart rate measurement rejects a truncated uint16 value`() {
        HeartRateMeasurement.parse(bytesOf(0x01, 0x2C))
    }

    @Test
    fun `plx spot check with timestamp and storage status`() {
        val m = PulseOximeterMeasurement.parseSpotCheck(bytesOf(0x03, 0x62, 0x00, 0x48, 0x00, *dateTime, 0x00, 0x02))
        assertEquals(98.0, m.spo2Percent!!, 1e-9)
        assertEquals(72.0, m.pulseRateBpm!!, 1e-9)
        assertEquals(LocalDateTime.of(2026, 11, 5, 8, 30), m.timestamp)
        assertTrue(m.fromStorage)
        assertTrue(m.isTrustworthy)
    }

    @Test
    fun `plx spot check ignores the timestamp when the device clock is not set`() {
        val m = PulseOximeterMeasurement.parseSpotCheck(bytesOf(0x11, 0x62, 0x00, 0x48, 0x00, *dateTime))
        assertNull(m.timestamp)
    }

    @Test
    fun `plx continuous skips optional blocks and flags invalid data`() {
        val m = PulseOximeterMeasurement.parseContinuous(
            bytesOf(0x1F, 0x61, 0x00, 0x46, 0x00, 1, 0, 2, 0, 3, 0, 4, 0, 0x00, 0x80, 0, 0, 0, 0x10, 0x00),
        )
        assertEquals(97.0, m.spo2Percent!!, 1e-9)
        assertEquals(70.0, m.pulseRateBpm!!, 1e-9)
        assertFalse(m.isTrustworthy)
    }

    @Test
    fun `rsc measurement with stride and distance`() {
        val m = RscMeasurement.parse(bytesOf(0x07, 0x00, 0x03, 170, 0x78, 0x00, 0x10, 0x27, 0x00, 0x00))
        assertEquals(3.0, m.speedMetersPerSecond, 1e-9)
        assertEquals(170, m.cadencePerMinute)
        assertEquals(1.2, m.strideLengthMeters!!, 1e-9)
        assertEquals(1000.0, m.totalDistanceMeters!!, 1e-9)
        assertTrue(m.running)
        assertNull(RscMeasurement.parse(bytesOf(0x00, 0x80, 0x01, 100)).strideLengthMeters)
    }

    @Test
    fun `racp requests and responses`() {
        assertArrayEquals(bytesOf(0x01, 0x01), RecordAccessControlPoint.reportAllStoredRecords())
        assertArrayEquals(bytesOf(0x03, 0x00), RecordAccessControlPoint.abort())
        val ok = RecordAccessControlPoint.parseResponse(bytesOf(0x06, 0x00, 0x01, 0x01)) as RecordAccessControlPoint.Response.Code
        assertTrue(ok.isSuccess)
        val none = RecordAccessControlPoint.parseResponse(bytesOf(0x06, 0x00, 0x01, 0x06)) as RecordAccessControlPoint.Response.Code
        assertTrue(none.isNoRecords)
        assertEquals(RecordAccessControlPoint.Response.NumberOfRecords(3), RecordAccessControlPoint.parseResponse(bytesOf(0x05, 0x00, 0x03, 0x00)))
        assertEquals("operator not supported", RecordAccessControlPoint.describe(0x04))
    }

    @Test(expected = MalformedPayloadException::class)
    fun `racp rejects unknown op codes`() {
        RecordAccessControlPoint.parseResponse(bytesOf(0x09, 0x00))
    }

    @Test
    fun `clinical measurements decode values and timestamps`() {
        val bp = ClinicalMeasurement.parseBloodPressure(bytesOf(0x06, 0x78, 0x00, 0x50, 0x00, 0x5D, 0x00, *dateTime, 0x40, 0x00))
        assertEquals(120.0, bp.systolic!!, 1e-9)
        assertEquals(80.0, bp.diastolic!!, 1e-9)
        assertEquals(64.0, bp.pulseRate!!, 1e-9)
        assertEquals(LocalDateTime.of(2026, 11, 5, 8, 30), bp.timestamp)
        assertEquals("sig_blood_pressure", bp.kind)

        assertEquals(36.6, ClinicalMeasurement.parseTemperature(bytesOf(0x00, 0x6E, 0x01, 0x00, 0xFF)).value!!, 1e-9)
        assertEquals(70.0, ClinicalMeasurement.parseWeight(bytesOf(0x00, 0xB0, 0x36)).kilograms!!, 1e-9)
        assertEquals(68.0388555, ClinicalMeasurement.parseWeight(bytesOf(0x01, 0x98, 0x3A)).kilograms!!, 1e-6) // 150.00 lb
        assertNull(ClinicalMeasurement.parseWeight(bytesOf(0x00, 0xFF, 0xFF)).kilograms)
        assertEquals(21.5, ClinicalMeasurement.parseBodyComposition(bytesOf(0x00, 0x00, 0xD7, 0x00)).bodyFatPercent!!, 1e-9)
    }

    private fun assertArrayEquals(expected: ByteArray, actual: ByteArray) =
        org.junit.Assert.assertArrayEquals(expected, actual)
}
