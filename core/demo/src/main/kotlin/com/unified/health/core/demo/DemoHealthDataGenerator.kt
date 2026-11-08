package com.unified.health.core.demo

import com.unified.health.core.model.HealthRecord
import com.unified.health.core.model.SleepStage
import java.time.DayOfWeek
import java.time.Duration
import java.time.Instant
import java.time.LocalDate
import java.time.LocalTime
import java.time.ZoneId
import kotlin.math.PI
import kotlin.math.roundToInt
import kotlin.math.sin
import kotlin.random.Random

/** Identity of the simulated watch. Seeded rows use the same id, so a later mock sync overwrites them. */
object DemoDevice {
    const val ADDRESS = "02:DE:30:00:00:01"
    const val NAME = "UH Demo Watch"
    const val MODEL = "Demo Watch S1"
    const val FIRMWARE = "1.4.2"
    const val BATTERY_PERCENT = 82
}

/**
 * Deterministic, realistic-looking health data: the same (seed, zone, date, until) always yields the
 * same records. Feeds both the debug seeder and the mock watch's sync, so charts look identical
 * whichever path wrote them.
 *
 * Per day: hourly steps, daily totals (steps, active energy, distance, exercise minutes), heart rate
 * every 10 min, resting HR, HRV and SpO2 during the night, stress every 30 min while awake, the
 * night's sleep stages (the night that ends on that morning) and ~4 workouts a week.
 */
class DemoHealthDataGenerator(
    private val seed: Long = DEFAULT_SEED,
    private val zone: ZoneId = ZoneId.systemDefault(),
) {

    /** Records for [date]; with [until], only what had happened by then (a partial "today"). */
    fun day(date: LocalDate, until: Instant? = null): List<HealthRecord> {
        val plan = plan(date)
        val cutoff = until ?: Instant.MAX
        val records = mutableListOf<HealthRecord>()

        sleepSegments(date).filter { !it.end.isAfter(cutoff) }.forEach(records::add)

        var steps = 0
        plan.hourlySteps.forEachIndexed { hour, count ->
            val start = at(date, hour, 0)
            val end = start.plus(Duration.ofHours(1))
            if (count > 0 && !end.isAfter(cutoff)) {
                records += HealthRecord.Steps(start, end, count)
                steps += count
            }
        }

        heartRates(date, plan).filter { !it.time.isAfter(cutoff) }.forEach(records::add)
        nightSamples(date, plan).filter { recordTime(it)?.isAfter(cutoff) != true }.forEach(records::add)
        stress(date, plan).filter { !it.time.isAfter(cutoff) }.forEach(records::add)

        var workoutKcal = 0
        var workoutMinutes = 0
        plan.workout?.let { w ->
            if (!w.end.isAfter(cutoff)) {
                records += w.record
                workoutKcal = w.record.activeKcal ?: 0
                workoutMinutes = Duration.between(w.start, w.end).toMinutes().toInt()
            }
        }

        val dayStarted = !at(date, 0, 0).isAfter(cutoff)
        if (dayStarted) {
            if (!at(date, RESTING_HR_READY_HOUR, 0).isAfter(cutoff)) {
                records += HealthRecord.RestingHeartRate(date, plan.restingHr)
            }
            if (!at(date, VO2MAX_READY_HOUR, 0).isAfter(cutoff)) {
                records += HealthRecord.Vo2Max(at(date, VO2MAX_READY_HOUR, 0), plan.vo2Max)
            }
            val fraction = if (steps == 0) 0.0 else steps.toDouble() / plan.hourlySteps.sum().coerceAtLeast(1)
            records += HealthRecord.DailyActivity(
                date = date,
                steps = steps,
                activeKcal = (steps * KCAL_PER_STEP).roundToInt() + workoutKcal,
                distanceMeters = (steps * STRIDE_METERS).roundToInt().toDouble(),
                exerciseMinutes = workoutMinutes + (plan.briskMinutes * fraction).roundToInt(),
            )
        }
        return records
    }

    /** Every record of [days] days ending at [now] (today partial), oldest day first. */
    fun lastDays(days: Int, now: Instant): List<List<HealthRecord>> {
        val today = now.atZone(zone).toLocalDate()
        return (days - 1 downTo 0).map { back ->
            val date = today.minusDays(back.toLong())
            day(date, until = if (date == today) now else null)
        }
    }

    // ---------------------------------------------------------------- daily plan

    private class WorkoutPlan(val start: Instant, val end: Instant, val record: HealthRecord.Workout)

    private class DayPlan(
        val activity: Double,
        val restingHr: Int,
        val vo2Max: Int,
        val hourlySteps: List<Int>,
        val briskMinutes: Int,
        val workout: WorkoutPlan?,
        val wakeMinuteOfDay: Int,
    )

    private fun plan(date: LocalDate): DayPlan {
        val rnd = random(date, SALT_PLAN)
        val weekend = date.dayOfWeek == DayOfWeek.SATURDAY || date.dayOfWeek == DayOfWeek.SUNDAY
        val trend = sin(date.toEpochDay() * 2 * PI / 28) * 0.12
        val activity = (rnd.nextDouble(0.65, 1.35) + trend + if (weekend) 0.15 else 0.0).coerceAtLeast(0.3)
        val workout = workoutFor(date, rnd, weekend)
        val restingHr = (58 + 2 * sin(date.toEpochDay() * 2 * PI / 45) + rnd.nextInt(-2, 3) - if (workout != null) 1 else 0)
            .roundToInt()
        val hourly = HOURLY_PROFILE.mapIndexed { hour, weight ->
            var count = weight * BASE_STEPS_PER_HOUR * activity * rnd.nextDouble(0.7, 1.3)
            if (workout != null && hour == workout.start.atZone(zone).hour) {
                val minutes = Duration.between(workout.start, workout.end).toMinutes()
                count += minutes * when (workout.record.sport) {
                    "running" -> 160
                    "walking" -> 115
                    else -> 0
                }
            }
            count.roundToInt()
        }
        val wake = sleepPlan(date).let { (_, wakeAt) -> wakeAt.atZone(zone).toLocalTime().toSecondOfDay() / 60 }
        // Slow-moving fitness trend (VO2max barely changes day to day), loosely tracking the activity trend.
        val vo2Max = (42 + 10 * trend + rnd.nextInt(-1, 2)).roundToInt().coerceIn(VO2MAX_MIN, VO2MAX_MAX)
        return DayPlan(activity, restingHr, vo2Max, hourly, (activity * rnd.nextInt(8, 22)).roundToInt(), workout, wake)
    }

    private fun workoutFor(date: LocalDate, rnd: Random, weekend: Boolean): WorkoutPlan? {
        if (rnd.nextDouble() > WORKOUT_PROBABILITY) return null
        val sport = SPORTS[(date.toEpochDay() % SPORTS.size).toInt().let { if (it < 0) it + SPORTS.size else it }]
        val hour = if (weekend) 9 else if (rnd.nextBoolean()) 7 else 18
        val minutes = rnd.nextInt(25, 61)
        val start = at(date, hour, rnd.nextInt(0, 20))
        val end = start.plus(Duration.ofMinutes(minutes.toLong()))
        val (kcalPerMin, metersPerMin, avgHr) = when (sport) {
            "running" -> Triple(11, 170, 152)
            "cycling" -> Triple(9, 400, 138)
            "walking" -> Triple(5, 95, 112)
            else -> Triple(6, 0, 124)
        }
        val avg = avgHr + rnd.nextInt(-5, 6)
        return WorkoutPlan(
            start,
            end,
            HealthRecord.Workout(
                start = start,
                end = end,
                sport = sport,
                distanceMeters = (metersPerMin * minutes).takeIf { it > 0 }?.toDouble(),
                activeKcal = kcalPerMin * minutes,
                avgHeartRate = avg,
                maxHeartRate = avg + rnd.nextInt(12, 25),
            ),
        )
    }

    // ---------------------------------------------------------------- sleep

    /** Bedtime (evening before [date]) and wake time ([date] morning). */
    private fun sleepPlan(date: LocalDate): Pair<Instant, Instant> {
        val rnd = random(date, SALT_SLEEP_PLAN)
        val weekendMorning = date.dayOfWeek == DayOfWeek.SATURDAY || date.dayOfWeek == DayOfWeek.SUNDAY
        val bed = date.minusDays(1).atTime(LocalTime.of(22, 30)).plusMinutes(rnd.nextLong(0, 80)).atZone(zone).toInstant()
        val inBedMinutes = rnd.nextLong(375, 495) + if (weekendMorning) 40 else 0
        return bed to bed.plus(Duration.ofMinutes(inBedMinutes))
    }

    /** Stage intervals of the night that ends on [date]'s morning, in ~90 min cycles. */
    private fun sleepSegments(date: LocalDate): List<HealthRecord.Sleep> {
        val rnd = random(date, SALT_SLEEP)
        val (bed, wake) = sleepPlan(date)
        val segments = mutableListOf<HealthRecord.Sleep>()
        var cursor = bed
        var cycle = 0
        fun add(stage: SleepStage, minutes: Int) {
            if (!cursor.isBefore(wake)) return
            val end = minOf(cursor.plus(Duration.ofMinutes(minutes.toLong())), wake)
            segments += HealthRecord.Sleep(cursor, end, stage)
            cursor = end
        }
        add(SleepStage.AWAKE, rnd.nextInt(4, 15)) // falling asleep
        while (cursor.isBefore(wake)) {
            add(SleepStage.LIGHT, rnd.nextInt(18, 36))
            add(SleepStage.DEEP, (rnd.nextInt(25, 45) - cycle * 8).coerceAtLeast(5))
            add(SleepStage.LIGHT, rnd.nextInt(8, 20))
            add(SleepStage.REM, rnd.nextInt(10, 20) + cycle * 6)
            if (rnd.nextDouble() < 0.35) add(SleepStage.AWAKE, rnd.nextInt(2, 9))
            cycle++
        }
        return segments
    }

    // ---------------------------------------------------------------- samples

    private fun heartRates(date: LocalDate, plan: DayPlan): List<HealthRecord.HeartRate> {
        val rnd = random(date, SALT_HR)
        val (nextBed, _) = sleepPlan(date.plusDays(1))
        val bedMinute = nextBed.atZone(zone).let { if (it.toLocalDate() == date) it.toLocalTime().toSecondOfDay() / 60 else MINUTES_PER_DAY }
        return (0 until MINUTES_PER_DAY step HR_INTERVAL_MIN).map { minute ->
            val time = at(date, minute / 60, minute % 60)
            val asleep = minute < plan.wakeMinuteOfDay || minute >= bedMinute
            val workout = plan.workout?.takeIf { !time.isBefore(it.start) && time.isBefore(it.end) }
            val bpm = when {
                workout != null -> (workout.record.avgHeartRate ?: 140) + rnd.nextInt(-10, 12)
                asleep -> plan.restingHr - 3 + rnd.nextInt(-3, 4)
                else -> plan.restingHr + 10 + (HOURLY_PROFILE[minute / 60] * 16 * plan.activity).roundToInt() + rnd.nextInt(-4, 9)
            }
            HealthRecord.HeartRate(time, bpm)
        }
    }

    private fun nightSamples(date: LocalDate, plan: DayPlan): List<HealthRecord> {
        val rnd = random(date, SALT_NIGHT)
        val out = mutableListOf<HealthRecord>()
        for (hour in 1..6) {
            val time = at(date, hour, rnd.nextInt(0, 50))
            out += HealthRecord.SpO2(time, rnd.nextInt(94, 100))
            out += HealthRecord.HeartRateVariability(time.plusSeconds(120), (42 + (60 - plan.restingHr) * 1.5 + rnd.nextInt(-10, 16)).roundToInt().coerceAtLeast(15))
        }
        out += HealthRecord.SpO2(at(date, 13, rnd.nextInt(0, 59)), rnd.nextInt(95, 100))
        return out
    }

    private fun stress(date: LocalDate, plan: DayPlan): List<HealthRecord.Stress> {
        val rnd = random(date, SALT_STRESS)
        val weekend = date.dayOfWeek == DayOfWeek.SATURDAY || date.dayOfWeek == DayOfWeek.SUNDAY
        return (STRESS_FIRST_HOUR * 2 until STRESS_LAST_HOUR * 2).mapNotNull { half ->
            val hour = half / 2
            val time = at(date, hour, (half % 2) * 30)
            if (plan.workout?.let { !time.isBefore(it.start) && time.isBefore(it.end) } == true) return@mapNotNull null
            val work = if (!weekend && hour in 9..17) 14 else 0
            HealthRecord.Stress(time, (28 + work + rnd.nextInt(-14, 22)).coerceIn(3, 96))
        }
    }

    // ---------------------------------------------------------------- helpers

    private fun random(date: LocalDate, salt: Int) = Random(seed * 1_000_003L + date.toEpochDay() * 31L + salt)

    private fun at(date: LocalDate, hour: Int, minute: Int): Instant = date.atTime(hour, minute).atZone(zone).toInstant()

    private fun recordTime(record: HealthRecord): Instant? = when (record) {
        is HealthRecord.SpO2 -> record.time
        is HealthRecord.HeartRateVariability -> record.time
        else -> null
    }

    companion object {
        const val DEFAULT_SEED = 42L

        private const val MINUTES_PER_DAY = 24 * 60
        private const val HR_INTERVAL_MIN = 10
        private const val STRESS_FIRST_HOUR = 8
        private const val STRESS_LAST_HOUR = 22
        private const val RESTING_HR_READY_HOUR = 8
        private const val VO2MAX_READY_HOUR = 7
        private const val VO2MAX_MIN = 25
        private const val VO2MAX_MAX = 60
        private const val BASE_STEPS_PER_HOUR = 620.0
        private const val KCAL_PER_STEP = 0.042
        private const val STRIDE_METERS = 0.76
        private const val WORKOUT_PROBABILITY = 0.55

        private const val SALT_PLAN = 1
        private const val SALT_SLEEP_PLAN = 2
        private const val SALT_SLEEP = 3
        private const val SALT_HR = 4
        private const val SALT_NIGHT = 5
        private const val SALT_STRESS = 6

        private val SPORTS = listOf("running", "walking", "cycling", "strength_training", "running", "walking", "yoga")

        /** Relative walking intensity per hour of day. */
        private val HOURLY_PROFILE = listOf(
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.15, 0.8, 1.0, 0.55, 0.45, 0.7,
            1.0, 0.65, 0.45, 0.55, 0.7, 1.0, 1.1, 0.8, 0.5, 0.3, 0.1, 0.02,
        )
    }
}
