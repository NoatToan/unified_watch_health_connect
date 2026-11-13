package com.unified.health.driver.xiaomi.codec

import com.unified.health.core.model.HealthRecord
import com.unified.health.driver.xiaomi.proto.FitnessDataId
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class FitnessPayloadDecoderTest {

    private fun u16le(value: Int) = byteArrayOf((value and 0xFF).toByte(), ((value ushr 8) and 0xFF).toByte())
    private fun u32le(value: Int) = byteArrayOf(
        (value and 0xFF).toByte(), ((value ushr 8) and 0xFF).toByte(), ((value ushr 16) and 0xFF).toByte(), ((value ushr 24) and 0xFF).toByte(),
    )

    @Test
    fun `decodeStored recovers the id and dispatches by kind, same as the live sync path`() {
        val id = FitnessDataId(
            timestampSeconds = 1_700_000_040L,
            timezone15min = 0,
            version = 2,
            dataType = FitnessDataId.DATA_TYPE_DAILY,
            subType = 0,
            fileType = 1, // daily_report
        )
        val dataValid = byteArrayOf(0x80.toByte(), 0x00) // steps bit only
        val body = u32le(1234) + u16le(0) + byteArrayOf(0) + byteArrayOf(0) // steps, calories, curHr, restHr
        val payload = byteArrayOf(0) + dataValid + body
        val stored = id.encode() + payload

        val records = FitnessPayloadDecoder.decodeStored(stored)

        assertEquals(1234, records.filterIsInstance<HealthRecord.DailyActivity>().single().steps)
    }

    @Test
    fun `an unparsed kind decodes to nothing`() {
        val id = FitnessDataId(
            timestampSeconds = 1_700_000_040L,
            timezone15min = 0,
            version = 2,
            dataType = FitnessDataId.DATA_TYPE_SPORT,
            subType = 6,
            fileType = 0,
        )
        assertTrue(FitnessPayloadDecoder.decode(id, byteArrayOf(1, 2, 3)).isEmpty())
    }

    @Test
    fun `decodeStored on bytes shorter than a FitnessDataId decodes to nothing`() {
        assertTrue(FitnessPayloadDecoder.decodeStored(byteArrayOf(1, 2, 3)).isEmpty())
    }
}
