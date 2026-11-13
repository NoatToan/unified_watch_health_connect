package com.unified.health.driver.xiaomi.codec

import com.unified.health.core.model.HealthRecord
import com.unified.health.core.model.SleepStage
import com.unified.health.driver.xiaomi.proto.FitnessDataId
import java.time.Instant
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class NightSleepCodecTest {

    private fun id(version: Int) = FitnessDataId(
        timestampSeconds = 1_700_000_000L,
        timezone15min = 0,
        version = version,
        dataType = FitnessDataId.DATA_TYPE_DAILY,
        subType = 3,
        fileType = 0,
    )

    private fun u32le(value: Long) = byteArrayOf(
        (value and 0xFF).toByte(), ((value ushr 8) and 0xFF).toByte(), ((value ushr 16) and 0xFF).toByte(), ((value ushr 24) and 0xFF).toByte(),
    )

    private fun marker(time: Long, state: Int) = u32le(time) + byteArrayOf(state.toByte())

    /** `reportLen(version=2)` = 27 bytes (see `NightSleepCodec.REPORT_FIELD_BYTE_COUNTS`); contents irrelevant, only skipped. */
    private val reportFiller = ByteArray(27)

    @Test
    fun `turns consecutive transition markers into contiguous sleep segments, dropping NOT_SLEEP and the dangling last marker`() {
        val t0 = 1_700_000_000L
        val t1 = t0 + 1_800
        val t2 = t1 + 1_800
        val t3 = t2 + 1_800
        val records = marker(t0, state = 0) + marker(t1, state = 3) + marker(t2, state = 2) + marker(t3, state = 5) // NOT_SLEEP, LIGHT, DEEP, AWAKE
        val payload = byteArrayOf(0) + ByteArray(2) /* dataValid, unread */ + reportFiller + records

        val sleep = NightSleepCodec.decode(id(version = 2), payload).filterIsInstance<HealthRecord.Sleep>()

        assertEquals(2, sleep.size)
        assertEquals(Instant.ofEpochSecond(t1), sleep[0].start)
        assertEquals(Instant.ofEpochSecond(t2), sleep[0].end)
        assertEquals(SleepStage.LIGHT, sleep[0].stage)
        assertEquals(Instant.ofEpochSecond(t2), sleep[1].start)
        assertEquals(Instant.ofEpochSecond(t3), sleep[1].end)
        assertEquals(SleepStage.DEEP, sleep[1].stage)
    }

    @Test
    fun `a single marker with nothing to close it produces no segment`() {
        val payload = byteArrayOf(0) + ByteArray(2) + reportFiller + marker(1_700_000_000L, state = 4)
        assertTrue(NightSleepCodec.decode(id(version = 2), payload).isEmpty())
    }

    @Test
    fun `an unknown version decodes nothing instead of throwing`() {
        assertTrue(NightSleepCodec.decode(id(version = 99), byteArrayOf(1, 2, 3)).isEmpty())
    }

    @Test
    fun `a payload too short for its header decodes nothing instead of throwing`() {
        assertTrue(NightSleepCodec.decode(id(version = 2), byteArrayOf(0, 1)).isEmpty())
    }
}
