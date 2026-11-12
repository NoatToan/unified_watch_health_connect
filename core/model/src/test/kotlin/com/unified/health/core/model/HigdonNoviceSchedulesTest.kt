package com.unified.health.core.model

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test
import java.time.LocalDate

class HigdonNoviceSchedulesTest {

    private val start = LocalDate.of(2026, 11, 16)

    @Test
    fun `5K has 56 days, one per day across 8 weeks`() {
        val days = HigdonNoviceSchedules.generate(TrainingPlanId.NOVICE_5K, start)
        assertEquals(56, days.size)
        assertEquals((0..55).toList(), days.map { it.dayOffset })
        assertEquals(start.plusDays(55), days.last().date)
    }

    @Test
    fun `5K week 1 Tuesday is a 2_4km run, Monday and Wednesday are Rest`() {
        val days = HigdonNoviceSchedules.generate(TrainingPlanId.NOVICE_5K, start)
        assertEquals(ScheduledDayKind.REST, days[0].kind) // Monday
        assertEquals(ScheduledDayKind.RUN, days[1].kind) // Tuesday
        assertEquals(2400.0, days[1].distanceMeters)
        assertEquals(ScheduledDayKind.REST, days[2].kind) // Wednesday
    }

    @Test
    fun `5K week 1 Sunday is a 30-minute walk, not a run`() {
        val days = HigdonNoviceSchedules.generate(TrainingPlanId.NOVICE_5K, start)
        val sunday = days[6]
        assertEquals(ScheduledDayKind.CROSS, sunday.kind)
        assertEquals(30, sunday.durationMinutes)
        assertNull(sunday.distanceMeters)
    }

    @Test
    fun `5K week 8 Saturday is Rest and Sunday is the 5K Race`() {
        val days = HigdonNoviceSchedules.generate(TrainingPlanId.NOVICE_5K, start)
        val week8 = days.drop(49)
        assertEquals(ScheduledDayKind.REST, week8[5].kind) // Saturday
        val raceDay = week8[6] // Sunday
        assertEquals(ScheduledDayKind.RACE, raceDay.kind)
        assertEquals("5K Race", raceDay.label)
        assertEquals(5000.0, raceDay.distanceMeters)
    }

    @Test
    fun `10K has 56 days and Wed-Sat are cross-training minutes, not runs`() {
        val days = HigdonNoviceSchedules.generate(TrainingPlanId.NOVICE_10K, start)
        assertEquals(56, days.size)
        val week1 = days.take(7)
        assertEquals(ScheduledDayKind.RUN, week1[1].kind) // Tue
        assertEquals(4000.0, week1[1].distanceMeters)
        assertEquals(ScheduledDayKind.CROSS, week1[2].kind) // Wed
        assertEquals(30, week1[2].durationMinutes)
        assertEquals(ScheduledDayKind.CROSS, week1[5].kind) // Sat
        assertEquals(40, week1[5].durationMinutes)
        assertEquals(ScheduledDayKind.RUN, week1[6].kind) // Sun
        assertEquals(4800.0, week1[6].distanceMeters)
    }

    @Test
    fun `10K week 8 Sunday is the 10K Run, Saturday is Rest`() {
        val days = HigdonNoviceSchedules.generate(TrainingPlanId.NOVICE_10K, start)
        val week8 = days.drop(49)
        assertEquals(ScheduledDayKind.REST, week8[5].kind)
        assertEquals(ScheduledDayKind.RACE, week8[6].kind)
        assertEquals("10K Run", week8[6].label)
        assertEquals(10000.0, week8[6].distanceMeters)
    }

    @Test
    fun `Half Marathon has 84 days across 12 weeks`() {
        val days = HigdonNoviceSchedules.generate(TrainingPlanId.NOVICE_HALF, start)
        assertEquals(84, days.size)
    }

    @Test
    fun `Half Marathon week 6 is the 5K tune-up race, with Saturday Rest`() {
        val days = HigdonNoviceSchedules.generate(TrainingPlanId.NOVICE_HALF, start)
        val week6 = days.drop(35).take(7)
        assertEquals(ScheduledDayKind.REST, week6[5].kind) // Sat
        assertEquals(ScheduledDayKind.RACE, week6[6].kind) // Sun
        assertEquals("5K Race", week6[6].label)
    }

    @Test
    fun `Half Marathon week 9 is the 10K tune-up race`() {
        val days = HigdonNoviceSchedules.generate(TrainingPlanId.NOVICE_HALF, start)
        val week9 = days.drop(56).take(7)
        assertEquals(ScheduledDayKind.RACE, week9[6].kind)
        assertEquals("10K Race", week9[6].label)
    }

    @Test
    fun `Half Marathon week 12 Sunday is race day itself`() {
        val days = HigdonNoviceSchedules.generate(TrainingPlanId.NOVICE_HALF, start)
        val week12 = days.drop(77)
        assertEquals(ScheduledDayKind.RACE, week12[6].kind)
        assertEquals("Half Marathon", week12[6].label)
        assertEquals(21097.5, week12[6].distanceMeters)
    }

    @Test
    fun `Marathon has 126 days across 18 weeks`() {
        val days = HigdonNoviceSchedules.generate(TrainingPlanId.NOVICE_MARATHON, start)
        assertEquals(126, days.size)
    }

    @Test
    fun `Marathon week 1 Sunday is cross-training with no stated duration`() {
        val days = HigdonNoviceSchedules.generate(TrainingPlanId.NOVICE_MARATHON, start)
        val sunday = days[6]
        assertEquals(ScheduledDayKind.CROSS, sunday.kind)
        assertNull(sunday.durationMinutes)
        assertNull(sunday.distanceMeters)
    }

    @Test
    fun `Marathon week 8 is the half marathon tune-up race, week 18 is the marathon itself`() {
        val days = HigdonNoviceSchedules.generate(TrainingPlanId.NOVICE_MARATHON, start)
        val week8 = days.drop(49).take(7)
        assertEquals(ScheduledDayKind.REST, week8[5].kind)
        assertEquals(ScheduledDayKind.RACE, week8[6].kind)
        assertEquals("Half Marathon", week8[6].label)

        val week18 = days.drop(119)
        assertEquals(ScheduledDayKind.REST, week18[5].kind)
        assertEquals(ScheduledDayKind.RACE, week18[6].kind)
        assertEquals("Marathon", week18[6].label)
        assertEquals(42195.0, week18[6].distanceMeters)
    }

    @Test
    fun `every day's date is startDate plus its dayOffset, no real-Monday snapping`() {
        val wednesdayStart = LocalDate.of(2026, 11, 18) // a Wednesday
        val days = HigdonNoviceSchedules.generate(TrainingPlanId.NOVICE_5K, wednesdayStart)
        days.forEach { assertEquals(wednesdayStart.plusDays(it.dayOffset.toLong()), it.date) }
    }
}
