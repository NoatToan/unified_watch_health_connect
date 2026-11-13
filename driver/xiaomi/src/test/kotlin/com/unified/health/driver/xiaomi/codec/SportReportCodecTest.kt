package com.unified.health.driver.xiaomi.codec

import com.unified.health.core.model.HealthRecord
import com.unified.health.driver.xiaomi.proto.FitnessDataId
import java.time.Instant
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Test

class SportReportCodecTest {

    private fun id(version: Int, sportType: Int = XiaomiSportTypes.RUNNING_OUTDOOR) = FitnessDataId(
        timestampSeconds = 1_700_000_000L,
        timezone15min = 0,
        version = version,
        dataType = FitnessDataId.DATA_TYPE_SPORT,
        subType = sportType,
        fileType = 1,
    )

    private fun u16le(value: Int) = byteArrayOf((value and 0xFF).toByte(), ((value ushr 8) and 0xFF).toByte())
    private fun u32le(value: Long) = byteArrayOf(
        (value and 0xFF).toByte(), ((value ushr 8) and 0xFF).toByte(), ((value ushr 16) and 0xFF).toByte(), ((value ushr 24) and 0xFF).toByte(),
    )

    /**
     * One bit per [bits] entry, MSB-first, packed into [DATA_VALID_LEN] bytes -- the *fixed*
     * `getSportOutdoorReportValidityLen(version=2)` length (4 bytes [V]), not `ceil(bits.size/8)`:
     * the real wire buffer has slack beyond the 12 fields [FIELDS] decodes (same convention
     * `DailyReportCodecTest` already relies on for its own, shorter fixed `dataValid`).
     */
    private fun dataValid(vararg bits: Boolean): ByteArray {
        val out = ByteArray(DATA_VALID_LEN)
        bits.forEachIndexed { i, v -> if (v) out[i / 8] = (out[i / 8].toInt() or (1 shl (7 - i % 8))).toByte() }
        return out
    }

    private companion object {
        const val DATA_VALID_LEN = 4
    }

    /** `startTime,endTime,duration,distance,calories,maxPace,minPace,maxSpeed,steps,maxCadence,avgHr,maxHr`. */
    private fun body(
        startTime: Long,
        endTime: Long,
        duration: Long,
        distance: Long,
        calories: Int,
        avgHr: Int,
        maxHr: Int,
    ) = u32le(startTime) + u32le(endTime) + u32le(duration) + u32le(distance) + u16le(calories) +
        u32le(0) + u32le(0) + u32le(0) + u32le(0) + u16le(0) + // maxPace, minPace, maxSpeed, steps, maxCadence
        byteArrayOf(avgHr.toByte(), maxHr.toByte())

    private val allValid = dataValid(true, true, true, true, true, true, true, true, true, true, true, true)

    @Test
    fun `decodes a Workout from start, end, distance, calories and heart rate`() {
        val payload = byteArrayOf(0) + allValid +
            body(startTime = 1_700_000_000L, endTime = 1_700_003_600L, duration = 3_600, distance = 5_000, calories = 300, avgHr = 120, maxHr = 160)

        val workout = SportReportCodec.decode(id(version = 2), payload).filterIsInstance<HealthRecord.Workout>().single()

        assertEquals(Instant.ofEpochSecond(1_700_000_000L), workout.start)
        assertEquals(Instant.ofEpochSecond(1_700_003_600L), workout.end)
        assertEquals("running", workout.sport)
        assertEquals(5_000.0, workout.distanceMeters)
        assertEquals(300, workout.activeKcal)
        assertEquals(120, workout.avgHeartRate)
        assertEquals(160, workout.maxHeartRate)
    }

    @Test
    fun `maps every supported sportType to its lower_snake_case name`() {
        val payload = byteArrayOf(0) + allValid +
            body(startTime = 1_700_000_000L, endTime = 1_700_003_600L, duration = 3_600, distance = 0, calories = 0, avgHr = 0, maxHr = 0)

        assertEquals("walking", SportReportCodec.decode(id(version = 2, sportType = XiaomiSportTypes.WALKING_OUTDOOR), payload).filterIsInstance<HealthRecord.Workout>().single().sport)
        assertEquals("mountaineering", SportReportCodec.decode(id(version = 2, sportType = XiaomiSportTypes.MOUNTAINEERING), payload).filterIsInstance<HealthRecord.Workout>().single().sport)
        assertEquals("cross_country_running", SportReportCodec.decode(id(version = 2, sportType = XiaomiSportTypes.CROSS_COUNTRY), payload).filterIsInstance<HealthRecord.Workout>().single().sport)
        assertEquals("hiking", SportReportCodec.decode(id(version = 2, sportType = XiaomiSportTypes.HIKING_OUTDOOR), payload).filterIsInstance<HealthRecord.Workout>().single().sport)
    }

    @Test
    fun `an invalid end time falls back to start plus duration`() {
        val payload = byteArrayOf(0) + dataValid(true, false, true, false, false, false, false, false, false, false, false, false) +
            body(startTime = 1_700_000_000L, endTime = 999, duration = 1_800, distance = 0, calories = 0, avgHr = 0, maxHr = 0)

        val workout = SportReportCodec.decode(id(version = 2), payload).filterIsInstance<HealthRecord.Workout>().single()

        assertEquals(Instant.ofEpochSecond(1_700_000_000L), workout.start)
        assertEquals(Instant.ofEpochSecond(1_700_001_800L), workout.end)
        assertNull(workout.distanceMeters)
        assertNull(workout.activeKcal)
    }

    @Test
    fun `no start time and no way to derive an end means no Workout at all`() {
        val payload = byteArrayOf(0) + dataValid(false, false, false, true, false, false, false, false, false, false, false, false) +
            body(startTime = 1_700_000_000L, endTime = 0, duration = 0, distance = 5_000, calories = 0, avgHr = 0, maxHr = 0)

        assertTrue(SportReportCodec.decode(id(version = 2), payload).isEmpty())
    }

    @Test
    fun `a sportType outside the decoded outdoor family decodes nothing`() {
        val payload = byteArrayOf(0) + allValid +
            body(startTime = 1_700_000_000L, endTime = 1_700_003_600L, duration = 3_600, distance = 5_000, calories = 300, avgHr = 120, maxHr = 160)
        assertTrue(SportReportCodec.decode(id(version = 2, sportType = XiaomiSportTypes.BIKING_OUTDOOR), payload).isEmpty())
    }

    @Test
    fun `an unknown version decodes nothing instead of throwing`() {
        assertTrue(SportReportCodec.decode(id(version = 99), byteArrayOf(1, 2, 3)).isEmpty())
    }

    @Test
    fun `a payload too short for its own header decodes nothing instead of throwing`() {
        assertTrue(SportReportCodec.decode(id(version = 2), byteArrayOf(0, 1)).isEmpty())
    }
}
