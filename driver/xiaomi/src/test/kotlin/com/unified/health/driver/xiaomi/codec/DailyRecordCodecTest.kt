package com.unified.health.driver.xiaomi.codec

import com.unified.health.core.model.HealthRecord
import com.unified.health.driver.xiaomi.proto.FitnessDataId
import java.time.Instant
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class DailyRecordCodecTest {

    private fun id(version: Int, timestampSeconds: Long = 1_700_000_040L) = FitnessDataId(
        timestampSeconds = timestampSeconds,
        timezone15min = 0,
        version = version,
        dataType = FitnessDataId.DATA_TYPE_DAILY,
        subType = 0,
        fileType = 0,
    )

    /**
     * `v2DataInfoArray` nibble layout, groups in wire order (`DailyRecordCodec.GROUPS`):
     * group0 (includeAbHr/steps, 2B) / group1 (activityType/calories, 1B) / group2
     * (activityHILevel/sportType, 1B) / group3 (distance, 2B) / group4 (hr, 1B) / group5
     * (energy, 1B) / group6 (totalCal family, 2B). `exist`=0x8, `high`=0x4, `middle`=0x2, `low`=0x1.
     */
    private fun dataValid(group0: Int, group4Exist: Boolean): ByteArray {
        val group4 = if (group4Exist) 0xC else 0x0 // exist(8) + high(4): hr is group4's "high" field.
        return byteArrayOf(
            ((group0 shl 4) or 0x0).toByte(), // group0 | group1 (not exist)
            ((0x0 shl 4) or 0x0).toByte(), // group2 | group3 (not exist)
            ((group4 shl 4) or 0x0).toByte(), // group4 | group5 (not exist)
            0x00.toByte(), // group6 (not exist) | unused nibble
        )
    }

    private fun u16le(value: Int) = byteArrayOf((value and 0xFF).toByte(), ((value ushr 8) and 0xFF).toByte())

    @Test
    fun `decodes steps and heart rate for two consecutive minutes`() {
        // group0 nibble = exist+low (0x9): steps readable, includeAbHr not (dynamic field untested here).
        val payload = byteArrayOf(0) + dataValid(group0 = 0x9, group4Exist = true) +
            // minute 0: steps=1234, hr=72
            (u16le(1234) + byteArrayOf(72)) +
            // minute 1: steps=1300, hr=75
            (u16le(1300) + byteArrayOf(75))

        val records = DailyRecordCodec.decode(id(version = 2), payload)

        val steps = records.filterIsInstance<HealthRecord.Steps>()
        val hr = records.filterIsInstance<HealthRecord.HeartRate>()
        assertEquals(2, steps.size)
        assertEquals(2, hr.size)
        assertEquals(1234, steps[0].count)
        assertEquals(Instant.ofEpochSecond(1_700_000_040L), steps[0].start)
        assertEquals(Instant.ofEpochSecond(1_700_000_100L), steps[0].end)
        assertEquals(1300, steps[1].count)
        assertEquals(Instant.ofEpochSecond(1_700_000_100L), steps[1].start)
        assertEquals(72, hr[0].bpm)
        assertEquals(Instant.ofEpochSecond(1_700_000_040L), hr[0].time)
        assertEquals(75, hr[1].bpm)
    }

    @Test
    fun `the dynamic hrPreAbnormal byte does not desynchronise the following minute`() {
        // group0 nibble = exist+middle+low (0xB): includeAbHr and steps both readable.
        val raw = dataValid(group0 = 0xB, group4Exist = true)
        val minute0WithAbHr = u16le(500 or (1 shl 14)) + byteArrayOf(72) + byteArrayOf(99) // +1 dynamic byte
        val minute1WithoutAbHr = u16le(600) + byteArrayOf(80)
        val payload = byteArrayOf(0) + raw + minute0WithAbHr + minute1WithoutAbHr

        val records = DailyRecordCodec.decode(id(version = 2), payload)

        val steps = records.filterIsInstance<HealthRecord.Steps>()
        val hr = records.filterIsInstance<HealthRecord.HeartRate>()
        assertEquals(listOf(500, 600), steps.map { it.count })
        assertEquals(listOf(72, 80), hr.map { it.bpm })
    }

    @Test
    fun `version 1 is a deliberate scope cut and decodes nothing`() {
        val payload = byteArrayOf(0) + dataValid(group0 = 0x9, group4Exist = true) + u16le(1) + byteArrayOf(1)
        assertTrue(DailyRecordCodec.decode(id(version = 1), payload).isEmpty())
    }

    @Test
    fun `an unknown version decodes nothing instead of throwing`() {
        assertTrue(DailyRecordCodec.decode(id(version = 99), byteArrayOf(1, 2, 3)).isEmpty())
    }

    @Test
    fun `a payload too short for its own header decodes nothing instead of throwing`() {
        assertTrue(DailyRecordCodec.decode(id(version = 2), byteArrayOf(0, 1)).isEmpty())
    }

    @Test
    fun `a dataValid with nothing marked exist decodes nothing (zero record length guard)`() {
        val payload = byteArrayOf(0) + byteArrayOf(0, 0, 0, 0) + u16le(1234) + byteArrayOf(72)
        assertTrue(DailyRecordCodec.decode(id(version = 2), payload).isEmpty())
    }
}
