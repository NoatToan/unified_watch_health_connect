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
    fun `maps the three M4-parsed daily kinds to their short names`() {
        assertEquals(FitnessKind.DAILY_RECORD, FitnessKind.of(id(FitnessDataId.DATA_TYPE_DAILY, 0, 0)))
        assertEquals(FitnessKind.DAILY_REPORT, FitnessKind.of(id(FitnessDataId.DATA_TYPE_DAILY, 0, 1)))
        assertEquals(FitnessKind.NIGHT_SLEEP, FitnessKind.of(id(FitnessDataId.DATA_TYPE_DAILY, 3, 0)))
        assertEquals(FitnessKind.NIGHT_SLEEP, FitnessKind.of(id(FitnessDataId.DATA_TYPE_DAILY, 3, 2)))
    }

    @Test
    fun `maps daytime sleep to its own kind, distinct from night sleep`() {
        assertEquals(FitnessKind.DAYTIME_SLEEP, FitnessKind.of(id(FitnessDataId.DATA_TYPE_DAILY, 2, 0)))
    }

    @Test
    fun `maps a decoded outdoor sportType's report to sport_report_outdoor`() {
        assertEquals(
            FitnessKind.SPORT_REPORT_OUTDOOR,
            FitnessKind.of(id(FitnessDataId.DATA_TYPE_SPORT, XiaomiSportTypes.RUNNING_OUTDOOR, 1)),
        )
        assertEquals(
            FitnessKind.SPORT_REPORT_OUTDOOR,
            FitnessKind.of(id(FitnessDataId.DATA_TYPE_SPORT, XiaomiSportTypes.HIKING_OUTDOOR, 1)),
        )
    }

    @Test
    fun `an undecoded sportType's report falls back, but its GPS file is still sport_gps`() {
        val undecodedReport = FitnessKind.of(id(FitnessDataId.DATA_TYPE_SPORT, XiaomiSportTypes.BIKING_OUTDOOR, 1))
        assertEquals("fitness_1_6_1", undecodedReport)
        assertEquals(FitnessKind.SPORT_GPS, FitnessKind.of(id(FitnessDataId.DATA_TYPE_SPORT, XiaomiSportTypes.BIKING_OUTDOOR, 2)))
        assertEquals(FitnessKind.SPORT_GPS, FitnessKind.of(id(FitnessDataId.DATA_TYPE_SPORT, XiaomiSportTypes.RUNNING_OUTDOOR, 2)))
    }

    @Test
    fun `every other combination gets a unique filename-safe fallback`() {
        val kind = FitnessKind.of(id(FitnessDataId.DATA_TYPE_SPORT, 6, 0))
        assertEquals("fitness_1_6_0", kind)
        assertTrue(kind.matches(Regex("[a-z0-9_]+")))
    }
}
