package com.unified.health.driver.xiaomi.codec

import com.unified.health.core.model.HealthRecord
import com.unified.health.driver.xiaomi.proto.FitnessDataId
import java.time.Instant
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Test

class SportGpsCodecTest {

    private fun id(version: Int, sportType: Int = XiaomiSportTypes.RUNNING_OUTDOOR) = FitnessDataId(
        timestampSeconds = 1_700_000_000L,
        timezone15min = 0,
        version = version,
        dataType = FitnessDataId.DATA_TYPE_SPORT,
        subType = sportType,
        fileType = 2,
    )

    private fun u16le(value: Int) = byteArrayOf((value and 0xFF).toByte(), ((value ushr 8) and 0xFF).toByte())
    private fun u32le(value: Long) = byteArrayOf(
        (value and 0xFF).toByte(), ((value ushr 8) and 0xFF).toByte(), ((value ushr 16) and 0xFF).toByte(), ((value ushr 24) and 0xFF).toByte(),
    )
    private fun f32le(value: Float) = u32le(java.lang.Float.floatToRawIntBits(value).toLong() and 0xFFFFFFFFL)

    /** `SportGpsParser.DataType` order: time, longitude, latitude, accuracy, speed, gpsSource, altitude, hdop. */
    private fun dataValid(vararg bits: Boolean): ByteArray {
        var byte0 = 0
        bits.forEachIndexed { i, v -> if (v) byte0 = byte0 or (1 shl (7 - i)) }
        return byteArrayOf(byte0.toByte())
    }

    private fun v1Point(time: Long, lon: Float, lat: Float) = u32le(time) + f32le(lon) + f32le(lat)

    private fun v3Point(time: Long, lon: Float, lat: Float, accuracy: Float, speedRaw: Int, altitude: Float, hdop: Float) =
        v1Point(time, lon, lat) + f32le(accuracy) + u16le(speedRaw) + f32le(altitude) + f32le(hdop)

    @Test
    fun `decodes v1 waypoints as WorkoutSamples with no speed or altitude`() {
        val records = v1Point(1_700_000_001L, 121.5f, 31.2f) + v1Point(1_700_000_002L, 121.51f, 31.21f)
        val payload = byteArrayOf(0) + dataValid(true, true, true, false, false, false, false, false) + records

        val samples = SportGpsCodec.decode(id(version = 1), payload).filterIsInstance<HealthRecord.WorkoutSample>()

        assertEquals(2, samples.size)
        assertEquals(Instant.ofEpochSecond(1_700_000_000L), samples[0].workoutStart)
        assertEquals(Instant.ofEpochSecond(1_700_000_001L), samples[0].time)
        assertEquals(121.5, samples[0].longitude!!, 1e-4)
        assertEquals(31.2, samples[0].latitude!!, 1e-4)
        assertNull(samples[0].altitudeMeters)
        assertNull(samples[0].speedMps)
    }

    @Test
    fun `decodes v3 waypoints including packed speed and altitude`() {
        // speedRaw packs speed*10 in the top 12 bits and gpsSource in the bottom 4: 3.2 m/s, source 1.
        val speedRaw = (32 shl 4) or 1
        val records = v3Point(1_700_000_001L, 121.5f, 31.2f, accuracy = 5f, speedRaw = speedRaw, altitude = 12.5f, hdop = 1.1f)
        val payload = byteArrayOf(0) + dataValid(true, true, true, true, true, true, true, true) + records

        val sample = SportGpsCodec.decode(id(version = 3), payload).filterIsInstance<HealthRecord.WorkoutSample>().single()

        assertEquals(12.5, sample.altitudeMeters!!, 1e-4)
        assertEquals(3.2, sample.speedMps!!, 1e-4)
    }

    @Test
    fun `missing latitude validity for the whole file means no samples at all`() {
        val records = v1Point(1_700_000_001L, 121.5f, 31.2f)
        val payload = byteArrayOf(0) + dataValid(true, true, false, false, false, false, false, false) + records
        assertTrue(SportGpsCodec.decode(id(version = 1), payload).isEmpty())
    }

    @Test
    fun `a version 4 and above TGC payload is out of scope and decodes nothing`() {
        val records = v1Point(1_700_000_001L, 121.5f, 31.2f)
        val payload = byteArrayOf(0) + dataValid(true, true, true, false, false, false, false, false) + records
        assertTrue(SportGpsCodec.decode(id(version = 4), payload).isEmpty())
    }

    @Test
    fun `triathlon and ski multi-segment GPS is out of scope and decodes nothing`() {
        val records = v1Point(1_700_000_001L, 121.5f, 31.2f)
        val payload = byteArrayOf(0) + dataValid(true, true, true, false, false, false, false, false) + records
        assertTrue(SportGpsCodec.decode(id(version = 1, sportType = XiaomiSportTypes.TRIATHLON), payload).isEmpty())
        assertTrue(SportGpsCodec.decode(id(version = 1, sportType = XiaomiSportTypes.SKI), payload).isEmpty())
    }

    @Test
    fun `an unknown version decodes nothing instead of throwing`() {
        assertTrue(SportGpsCodec.decode(id(version = 99), byteArrayOf(1, 2, 3)).isEmpty())
    }

    @Test
    fun `a payload too short for its own header decodes nothing instead of throwing`() {
        assertTrue(SportGpsCodec.decode(id(version = 1), byteArrayOf(0)).isEmpty())
    }
}
