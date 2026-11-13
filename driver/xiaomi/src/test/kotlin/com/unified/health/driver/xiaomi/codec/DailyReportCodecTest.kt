package com.unified.health.driver.xiaomi.codec

import com.unified.health.core.model.HealthRecord
import com.unified.health.driver.xiaomi.proto.FitnessDataId
import java.time.Instant
import java.time.LocalDate
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class DailyReportCodecTest {

    private fun id(version: Int) = FitnessDataId(
        timestampSeconds = Instant.parse("2024-01-15T10:00:00Z").epochSecond,
        timezone15min = 0,
        version = version,
        dataType = FitnessDataId.DATA_TYPE_DAILY,
        subType = 0,
        fileType = 1,
    )

    private fun u16le(value: Int) = byteArrayOf((value and 0xFF).toByte(), ((value ushr 8) and 0xFF).toByte())
    private fun u32le(value: Int) = byteArrayOf(
        (value and 0xFF).toByte(), ((value ushr 8) and 0xFF).toByte(), ((value ushr 16) and 0xFF).toByte(), ((value ushr 24) and 0xFF).toByte(),
    )

    /** `reportDataTypeArray[0..3]`: steps(bit7), calories(bit6), curHr(bit5, unused), restHr(bit4). */
    private fun dataValid(steps: Boolean, calories: Boolean, restHr: Boolean): ByteArray {
        var byte0 = 0
        if (steps) byte0 = byte0 or 0x80
        if (calories) byte0 = byte0 or 0x40
        if (restHr) byte0 = byte0 or 0x10
        return byteArrayOf(byte0.toByte(), 0x00)
    }

    private fun body(steps: Int, calories: Int, curHr: Int, restHr: Int) =
        u32le(steps) + u16le(calories) + byteArrayOf(curHr.toByte()) + byteArrayOf(restHr.toByte())

    @Test
    fun `decodes steps, calories and resting heart rate when all three are valid`() {
        val payload = byteArrayOf(0) + dataValid(steps = true, calories = true, restHr = true) + body(8000, 450, 65, 55)

        val records = DailyReportCodec.decode(id(version = 2), payload)

        val activity = records.filterIsInstance<HealthRecord.DailyActivity>().single()
        val restingHr = records.filterIsInstance<HealthRecord.RestingHeartRate>().single()
        assertEquals(LocalDate.of(2024, 1, 15), activity.date)
        assertEquals(8000, activity.steps)
        assertEquals(450, activity.activeKcal)
        assertEquals(LocalDate.of(2024, 1, 15), restingHr.date)
        assertEquals(55, restingHr.bpm)
    }

    @Test
    fun `an invalid steps bit means no DailyActivity, even though the bytes are still present`() {
        val payload = byteArrayOf(0) + dataValid(steps = false, calories = true, restHr = true) + body(8000, 450, 65, 55)

        val records = DailyReportCodec.decode(id(version = 2), payload)

        assertTrue(records.filterIsInstance<HealthRecord.DailyActivity>().isEmpty())
        assertEquals(55, records.filterIsInstance<HealthRecord.RestingHeartRate>().single().bpm)
    }

    @Test
    fun `an invalid restHr bit means no RestingHeartRate`() {
        val payload = byteArrayOf(0) + dataValid(steps = true, calories = true, restHr = false) + body(8000, 450, 65, 55)

        val records = DailyReportCodec.decode(id(version = 2), payload)

        assertTrue(records.filterIsInstance<HealthRecord.RestingHeartRate>().isEmpty())
        assertEquals(8000, records.filterIsInstance<HealthRecord.DailyActivity>().single().steps)
    }

    @Test
    fun `an unknown version decodes nothing instead of throwing`() {
        assertTrue(DailyReportCodec.decode(id(version = 99), byteArrayOf(1, 2, 3)).isEmpty())
    }

    @Test
    fun `a payload too short for its own header decodes nothing instead of throwing`() {
        assertTrue(DailyReportCodec.decode(id(version = 2), byteArrayOf(0, 1)).isEmpty())
    }
}
