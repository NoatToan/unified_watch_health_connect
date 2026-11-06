package com.unified.health.core.demo

import com.unified.health.core.model.HealthRecord
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Assert.assertTrue
import org.junit.Test
import java.time.Duration
import java.time.LocalDate
import java.time.ZoneId

class DemoHealthDataGeneratorTest {

    private val zone = ZoneId.of("Asia/Ho_Chi_Minh")
    private val generator = DemoHealthDataGenerator(zone = zone)
    private val date = LocalDate.of(2026, 11, 5)

    @Test
    fun `same seed and date give identical records`() {
        assertEquals(generator.day(date), DemoHealthDataGenerator(zone = zone).day(date))
        assertNotEquals(generator.day(date), DemoHealthDataGenerator(seed = 7, zone = zone).day(date))
    }

    @Test
    fun `a full day covers every metric with realistic values`() {
        val records = generator.day(date)
        val hr = records.filterIsInstance<HealthRecord.HeartRate>()
        assertEquals(144, hr.size)
        assertTrue(hr.all { it.bpm in 40..200 })
        val steps = records.filterIsInstance<HealthRecord.Steps>()
        val daily = records.filterIsInstance<HealthRecord.DailyActivity>().single()
        assertEquals(steps.sumOf { it.count }, daily.steps)
        assertTrue(daily.steps in 2_000..25_000)
        assertTrue((daily.activeKcal ?: 0) > 0 && (daily.distanceMeters ?: 0.0) > 0.0 && (daily.exerciseMinutes ?: 0) > 0)
        assertTrue(records.filterIsInstance<HealthRecord.RestingHeartRate>().single().bpm in 50..66)
        assertTrue(records.filterIsInstance<HealthRecord.HeartRateVariability>().all { it.milliseconds in 15..120 })
        assertTrue(records.filterIsInstance<HealthRecord.SpO2>().let { it.size == 7 && it.all { s -> s.percent in 94..99 } })
        assertTrue(records.filterIsInstance<HealthRecord.Stress>().all { it.score in 3..96 })
    }

    @Test
    fun `sleep stages are contiguous and add up to a plausible night`() {
        val sleep = generator.day(date).filterIsInstance<HealthRecord.Sleep>()
        sleep.zipWithNext().forEach { (a, b) -> assertEquals(a.end, b.start) }
        val total = Duration.between(sleep.first().start, sleep.last().end).toMinutes()
        assertTrue("night of $total min", total in 360..540)
        assertTrue(sleep.first().start.atZone(zone).toLocalDate() == date.minusDays(1))
        assertEquals(4, sleep.map { it.stage }.toSet().size)
    }

    @Test
    fun `a partial day stops at the cut-off`() {
        val until = date.atTime(10, 0).atZone(zone).toInstant()
        val records = generator.day(date, until)
        assertTrue(records.filterIsInstance<HealthRecord.HeartRate>().all { !it.time.isAfter(until) })
        assertTrue(records.filterIsInstance<HealthRecord.Steps>().all { !it.end.isAfter(until) })
        val daily = records.filterIsInstance<HealthRecord.DailyActivity>().single()
        assertEquals(records.filterIsInstance<HealthRecord.Steps>().sumOf { it.count }, daily.steps)
        assertTrue(daily.steps < generator.day(date).filterIsInstance<HealthRecord.DailyActivity>().single().steps)
    }

    @Test
    fun `ninety days hold about four workouts a week`() {
        val now = date.atTime(20, 0).atZone(zone).toInstant()
        val days = generator.lastDays(90, now)
        assertEquals(90, days.size)
        val workouts = days.flatten().filterIsInstance<HealthRecord.Workout>()
        assertTrue("${workouts.size} workouts", workouts.size in 35..70)
        assertTrue(days.flatten().none { it is HealthRecord.HeartRate && it.time.isAfter(now) })
    }
}
