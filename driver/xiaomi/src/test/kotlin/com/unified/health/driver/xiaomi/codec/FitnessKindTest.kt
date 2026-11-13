package com.unified.health.driver.xiaomi.codec

import com.unified.health.driver.xiaomi.proto.FitnessDataId
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class FitnessKindTest {

    private fun id(dataType: Int, subType: Int, fileType: Int) = FitnessDataId(
        timestampSeconds = 1_700_000_000L,
        timezone15min = 0,
        version = 2,
        dataType = dataType,
        subType = subType,
        fileType = fileType,
    )

    @Test
    fun `maps the three M4-parsed kinds to their short names`() {
        assertEquals(FitnessKind.DAILY_RECORD, FitnessKind.of(id(FitnessDataId.DATA_TYPE_DAILY, 0, 0)))
        assertEquals(FitnessKind.DAILY_REPORT, FitnessKind.of(id(FitnessDataId.DATA_TYPE_DAILY, 0, 1)))
        assertEquals(FitnessKind.NIGHT_SLEEP, FitnessKind.of(id(FitnessDataId.DATA_TYPE_DAILY, 3, 0)))
        assertEquals(FitnessKind.NIGHT_SLEEP, FitnessKind.of(id(FitnessDataId.DATA_TYPE_DAILY, 3, 2)))
    }

    @Test
    fun `every other combination gets a unique filename-safe fallback`() {
        val kind = FitnessKind.of(id(FitnessDataId.DATA_TYPE_SPORT, 6, 0))
        assertEquals("fitness_1_6_0", kind)
        assertTrue(kind.matches(Regex("[a-z0-9_]+")))
    }
}
