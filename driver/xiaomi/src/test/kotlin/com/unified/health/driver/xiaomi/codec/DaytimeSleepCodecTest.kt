package com.unified.health.driver.xiaomi.codec

import com.unified.health.core.model.HealthRecord
import com.unified.health.core.model.SleepStage
import com.unified.health.driver.xiaomi.proto.FitnessDataId
import java.time.Instant
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class DaytimeSleepCodecTest {

    private fun id(version: Int) = FitnessDataId(
        timestampSeconds = 1_700_000_000L,
        timezone15min = 0,
        version = version,
        dataType = FitnessDataId.DATA_TYPE_DAILY,
        subType = 2,
        fileType = 0,
    )

    private fun u32le(value: Long) = byteArrayOf(
        (value and 0xFF).toByte(), ((value ushr 8) and 0xFF).toByte(), ((value ushr 16) and 0xFF).toByte(), ((value ushr 24) and 0xFF).toByte(),
    )
    private fun marker(time: Long, state: Int) = u32le(time) + byteArrayOf(state.toByte())

    /** `reportDataTypeArray` = just `sleepDuration` (u16, 2 bytes); contents irrelevant, only skipped. */
    private val reportFiller = ByteArray(2)

    @Test
    fun `reuses NightSleepCodec's transition-marker logic for a nap`() {
        val t0 = 1_700_000_000L
        val t1 = t0 + 900
        val t2 = t1 + 900
        val records = marker(t0, state = 5) + marker(t1, state = 3) + marker(t2, state = 2) // AWAKE, LIGHT, DEEP
        val payload = byteArrayOf(0) + ByteArray(1) /* dataValid, unread */ + reportFiller + records

        val sleep = DaytimeSleepCodec.decode(id(version = 2), payload).filterIsInstance<HealthRecord.Sleep>()

        assertEquals(2, sleep.size)
        assertEquals(Instant.ofEpochSecond(t0), sleep[0].start)
        assertEquals(Instant.ofEpochSecond(t1), sleep[0].end)
        assertEquals(SleepStage.AWAKE, sleep[0].stage)
        assertEquals(SleepStage.LIGHT, sleep[1].stage)
    }

    @Test
    fun `version 1 is rejected, matching the vendor parser's own refusal to parse it`() {
        val payload = byteArrayOf(0) + ByteArray(1) + reportFiller + marker(1_700_000_000L, state = 3) + marker(1_700_000_900L, state = 2)
        assertTrue(DaytimeSleepCodec.decode(id(version = 1), payload).isEmpty())
    }

    @Test
    fun `an unsupported higher version decodes nothing instead of throwing`() {
        assertTrue(DaytimeSleepCodec.decode(id(version = 3), byteArrayOf(1, 2, 3)).isEmpty())
    }

    @Test
    fun `a payload too short for its own header decodes nothing instead of throwing`() {
        assertTrue(DaytimeSleepCodec.decode(id(version = 2), byteArrayOf(0, 1)).isEmpty())
    }
}
