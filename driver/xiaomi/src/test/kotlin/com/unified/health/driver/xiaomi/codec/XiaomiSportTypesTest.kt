package com.unified.health.driver.xiaomi.codec

import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class XiaomiSportTypesTest {

    @Test
    fun `the decoded outdoor family is exactly running, walking, mountaineering, cross country and hiking`() {
        assertEquals(
            setOf(
                XiaomiSportTypes.RUNNING_OUTDOOR,
                XiaomiSportTypes.WALKING_OUTDOOR,
                XiaomiSportTypes.MOUNTAINEERING,
                XiaomiSportTypes.CROSS_COUNTRY,
                XiaomiSportTypes.HIKING_OUTDOOR,
            ),
            XiaomiSportTypes.OUTDOOR_REPORT_SPORT_TYPES,
        )
    }

    @Test
    fun `known sportTypes map to a stable lower_snake_case name`() {
        assertEquals("running", XiaomiSportTypes.lowerSnakeCaseName(XiaomiSportTypes.RUNNING_OUTDOOR))
        assertEquals("walking", XiaomiSportTypes.lowerSnakeCaseName(XiaomiSportTypes.WALKING_OUTDOOR))
        assertEquals("cycling", XiaomiSportTypes.lowerSnakeCaseName(XiaomiSportTypes.BIKING_OUTDOOR))
        assertEquals("indoor_cycling", XiaomiSportTypes.lowerSnakeCaseName(XiaomiSportTypes.BIKING_INDOOR))
        assertEquals("pool_swimming", XiaomiSportTypes.lowerSnakeCaseName(XiaomiSportTypes.SWIMMING_POOL))
        assertEquals("free_training", XiaomiSportTypes.lowerSnakeCaseName(XiaomiSportTypes.FREE_TRAINING))
        for (name in listOf("running", "walking", "cycling", "indoor_cycling", "pool_swimming", "free_training")) {
            assertTrue(name.matches(Regex("[a-z0-9_]+")))
        }
    }

    @Test
    fun `an unknown sportType falls back to a stable, still-unique name instead of guessing`() {
        val name = XiaomiSportTypes.lowerSnakeCaseName(9_999)
        assertEquals("sport_9999", name)
        assertFalse(name in setOf("running", "walking"))
    }
}
