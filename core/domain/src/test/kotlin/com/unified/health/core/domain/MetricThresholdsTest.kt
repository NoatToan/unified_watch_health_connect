package com.unified.health.core.domain

import com.unified.health.core.domain.model.ActivityLevel
import com.unified.health.core.domain.model.BiologicalSex
import com.unified.health.core.domain.model.BodyProfile
import com.unified.health.core.domain.model.DefaultMetricThresholds
import com.unified.health.core.domain.model.Vo2MaxCategory
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Test

class MetricThresholdsTest {

    private val thresholds = DefaultMetricThresholds.VALUES

    @Test
    fun `heart rate zones cover 50 to 100 percent of max in 5 ascending bands`() {
        assertEquals(5, thresholds.heartRateZones.size)
        assertEquals(1, thresholds.heartRateZoneFor(55)?.zone)
        assertEquals(5, thresholds.heartRateZoneFor(95)?.zone)
        assertNull(thresholds.heartRateZoneFor(10))
    }

    @Test
    fun `resting heart rate and sleep duration follow D-1030 defaults`() {
        assertEquals(60..100, thresholds.restingHeartRate)
        assertEquals(7..9, thresholds.sleepDurationHours)
    }

    @Test
    fun `spo2 is normal 95 to 100, alert below 90`() {
        assertEquals(95..100, thresholds.spo2.normal)
        assertEquals(90, thresholds.spo2.alertBelowPercent)
    }

    @Test
    fun `vo2max is categorized into a band, never scored`() {
        assertEquals(Vo2MaxCategory.SUPERIOR, thresholds.vo2MaxCategoryFor(70.0, age = 25, sex = BiologicalSex.MALE))
        assertEquals(Vo2MaxCategory.LOW, thresholds.vo2MaxCategoryFor(5.0, age = 25, sex = BiologicalSex.MALE))
        assertNull(thresholds.vo2MaxCategoryFor(40.0, age = 200, sex = BiologicalSex.MALE))
    }

    @Test
    fun `active calorie goal without a body profile falls back to the default`() {
        assertEquals(thresholds.defaultActiveCalorieGoal, thresholds.activeCalorieGoal(profile = null))
        assertTrue(thresholds.defaultActiveCalorieGoal > 0)
    }

    @Test
    fun `active calorie goal with a body profile is BMR times activity factor, not a fixed constant`() {
        val profile = BodyProfile(weightKg = 70.0, heightCm = 175.0, age = 30, sex = BiologicalSex.MALE)
        val sedentary = thresholds.activeCalorieGoal(profile, ActivityLevel.SEDENTARY)
        val veryActive = thresholds.activeCalorieGoal(profile, ActivityLevel.VERY_ACTIVE)
        assertTrue("more active should need more active calories", veryActive > sedentary)
    }

    @Test
    fun `watch battery thresholds have hysteresis`() {
        assertTrue(thresholds.lowBatteryPercent < thresholds.recoveredBatteryPercent)
    }
}
