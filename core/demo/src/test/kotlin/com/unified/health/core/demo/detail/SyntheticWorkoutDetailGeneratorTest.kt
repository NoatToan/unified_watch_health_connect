package com.unified.health.core.demo.detail

import com.unified.health.core.model.Workout
import com.unified.health.core.model.WorkoutType
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test
import java.time.Duration
import java.time.Instant
import kotlin.math.abs

class SyntheticWorkoutDetailGeneratorTest {

    private val start = Instant.parse("2026-11-06T07:03:00Z")

    private fun workout(
        type: WorkoutType,
        minutes: Long,
        distanceMeters: Double? = null,
        activeKcal: Int? = null,
        avgHeartRate: Int? = null,
        maxHeartRate: Int? = null,
        id: String = "AA:BB@${start.toEpochMilli()}",
    ) = Workout(
        id = id,
        type = type,
        start = start,
        end = start.plus(Duration.ofMinutes(minutes)),
        distanceMeters = distanceMeters,
        activeKcal = activeKcal,
        avgHeartRate = avgHeartRate,
        maxHeartRate = maxHeartRate,
        sourceDeviceId = "AA:BB",
    )

    @Test
    fun `same workout always yields the same laps and samples`() {
        val w = workout(WorkoutType.RUNNING, minutes = 32, distanceMeters = 5_300.0, avgHeartRate = 152, maxHeartRate = 171)
        val first = SyntheticWorkoutDetailGenerator.generate(w)
        val second = SyntheticWorkoutDetailGenerator.generate(w)
        assertEquals(first, second)
    }

    @Test
    fun `a different workout yields different samples`() {
        val a = SyntheticWorkoutDetailGenerator.generate(workout(WorkoutType.RUNNING, minutes = 32, distanceMeters = 5_300.0))
        val b = SyntheticWorkoutDetailGenerator.generate(workout(WorkoutType.RUNNING, minutes = 32, distanceMeters = 5_300.0, id = "CC:DD@999"))
        assertTrue(a != b)
    }

    @Test
    fun `running laps split by 1km and reconcile with the stored distance and duration`() {
        val w = workout(WorkoutType.RUNNING, minutes = 41, distanceMeters = 6_350.0, avgHeartRate = 150, maxHeartRate = 172)
        val supplement = SyntheticWorkoutDetailGenerator.generate(w)

        assertTrue(supplement.laps.size >= 6)
        assertEquals(6_350.0, supplement.laps.sumOf { it.distanceMeters ?: 0.0 }, 1.0)
        assertEquals(w.duration, supplement.laps.sumOf { it.duration.seconds }.let { Duration.ofSeconds(it) })
        // Laps are contiguous and cover the whole workout.
        assertEquals(w.start, supplement.laps.first().start)
        assertEquals(w.end, supplement.laps.last().end)
        supplement.laps.zipWithNext().forEach { (a, b) -> assertEquals(a.end, b.start) }
    }

    @Test
    fun `cycling laps split by 5km`() {
        val w = workout(WorkoutType.CYCLING, minutes = 50, distanceMeters = 22_000.0)
        val supplement = SyntheticWorkoutDetailGenerator.generate(w)
        assertEquals(5, supplement.laps.size) // 5+5+5+5+2 km -> ceil(22/5) = 5 laps
        assertEquals(22_000.0, supplement.laps.sumOf { it.distanceMeters ?: 0.0 }, 1.0)
    }

    @Test
    fun `non-distance sports get time-based laps and no speed`() {
        val w = workout(WorkoutType.STRENGTH, minutes = 45, activeKcal = 300)
        val supplement = SyntheticWorkoutDetailGenerator.generate(w)

        assertTrue(supplement.laps.isNotEmpty())
        assertTrue(supplement.laps.all { it.distanceMeters == null })
        assertTrue(supplement.samples.all { it.speedMps == null })
        assertTrue(supplement.samples.all { it.cadence == null })
        assertTrue(supplement.samples.all { it.altitudeMeters == null }) // indoor sport
        assertEquals(300, supplement.laps.sumOf { it.calories ?: 0 })
        assertEquals(w.duration.seconds, supplement.laps.sumOf { it.duration.seconds })
    }

    @Test
    fun `a workout shorter than one lap unit still gets a single lap`() {
        val w = workout(WorkoutType.RUNNING, minutes = 4, distanceMeters = 500.0)
        val supplement = SyntheticWorkoutDetailGenerator.generate(w)
        assertEquals(1, supplement.laps.size)
        assertEquals(500.0, supplement.laps.single().distanceMeters!!, 1.0)
        assertEquals(w.duration, supplement.laps.single().duration)
    }

    @Test
    fun `cadence stays within the realistic range for the sport`() {
        val running = SyntheticWorkoutDetailGenerator.generate(workout(WorkoutType.RUNNING, minutes = 30, distanceMeters = 5_000.0))
        assertTrue(running.samples.mapNotNull { it.cadence }.all { it in 160..180 })

        val walking = SyntheticWorkoutDetailGenerator.generate(workout(WorkoutType.WALKING, minutes = 30, distanceMeters = 2_500.0))
        assertTrue(walking.samples.mapNotNull { it.cadence }.all { it in 100..120 })

        val cycling = SyntheticWorkoutDetailGenerator.generate(workout(WorkoutType.CYCLING, minutes = 30, distanceMeters = 12_000.0))
        assertTrue(cycling.samples.mapNotNull { it.cadence }.all { it in 80..95 })
    }

    @Test
    fun `sample heart rate average and max land within 2 bpm of the stored summary`() {
        val cases = listOf(
            workout(WorkoutType.RUNNING, minutes = 28, distanceMeters = 5_000.0, avgHeartRate = 148, maxHeartRate = 169),
            workout(WorkoutType.CYCLING, minutes = 55, distanceMeters = 20_000.0, avgHeartRate = 134, maxHeartRate = 158),
            workout(WorkoutType.WALKING, minutes = 35, distanceMeters = 2_800.0, avgHeartRate = 108, maxHeartRate = 124),
            workout(WorkoutType.STRENGTH, minutes = 40, avgHeartRate = 121, maxHeartRate = 150),
            workout(WorkoutType.RUNNING, minutes = 60, distanceMeters = 10_000.0), // no reported HR at all
        )
        cases.forEach { w ->
            val samples = SyntheticWorkoutDetailGenerator.generate(w).samples
            val heartRates = samples.mapNotNull { it.heartRate }
            assertTrue("no HR samples for $w", heartRates.isNotEmpty())
            w.avgHeartRate?.let { target -> assertTrue("avg HR off for $w", abs(heartRates.average() - target) <= 2.0) }
            w.maxHeartRate?.let { target -> assertTrue("max HR off for $w", abs(heartRates.max() - target) <= 2) }
        }
    }

    @Test
    fun `calories and heart rate per lap stay inside the workout's own summary`() {
        val w = workout(WorkoutType.RUNNING, minutes = 30, distanceMeters = 5_000.0, activeKcal = 350, avgHeartRate = 150, maxHeartRate = 172)
        val supplement = SyntheticWorkoutDetailGenerator.generate(w)
        assertEquals(350, supplement.laps.sumOf { it.calories ?: 0 })
        assertTrue(supplement.laps.mapNotNull { it.maxHeartRate }.max() <= 172)
    }

    @Test
    fun `a zero-duration workout yields no laps or samples`() {
        val w = workout(WorkoutType.RUNNING, minutes = 0, distanceMeters = 0.0)
        val supplement = SyntheticWorkoutDetailGenerator.generate(w)
        assertTrue(supplement.laps.isEmpty())
        assertTrue(supplement.samples.isEmpty())
    }

    // ---------------------------------------------------------------- D-1197 round 2

    @Test
    fun `full lap durations vary with the samples' own pace, not just distance`() {
        // Exactly the on-device bug report: 5.10 km / 30 min, every full split reading identically.
        val w = workout(WorkoutType.RUNNING, minutes = 30, distanceMeters = 5_100.0, avgHeartRate = 154, maxHeartRate = 167)
        val supplement = SyntheticWorkoutDetailGenerator.generate(w)
        val fullLapDurations = supplement.laps.dropLast(1).map { it.duration.seconds } // drop the short "< 1 km" remainder
        assertTrue("expected at least 2 full laps to compare, got ${fullLapDurations.size}", fullLapDurations.size >= 2)
        assertTrue(
            "full laps should not all take the exact same time (the old bug): $fullLapDurations",
            fullLapDurations.toSet().size > 1,
        )
    }

    @Test
    fun `lap distance stays the fixed per-lap target even though duration now varies`() {
        val w = workout(WorkoutType.RUNNING, minutes = 30, distanceMeters = 5_100.0)
        val supplement = SyntheticWorkoutDetailGenerator.generate(w)
        // Every full lap is still exactly 1 km (the per-lap *target*), independent of how long it took.
        supplement.laps.dropLast(1).forEach { lap -> assertEquals(1_000.0, lap.distanceMeters!!, 1e-6) }
        assertEquals(100.0, supplement.laps.last().distanceMeters!!, 1e-6) // the 5.10 km remainder
    }

    @Test
    fun `5_10 km in 30 minutes keeps every invariant while laps vary (the exact reported bug)`() {
        val w = workout(WorkoutType.RUNNING, minutes = 30, distanceMeters = 5_100.0, activeKcal = 330, avgHeartRate = 154, maxHeartRate = 167)
        val supplement = SyntheticWorkoutDetailGenerator.generate(w)

        assertEquals(5_100.0, supplement.laps.sumOf { it.distanceMeters ?: 0.0 }, 1.0)
        assertEquals(w.duration.seconds, supplement.laps.sumOf { it.duration.seconds })
        assertEquals(330, supplement.laps.sumOf { it.calories ?: 0 })
        // Contiguous, covering the whole workout, same as every other lap-generation path.
        assertEquals(w.start, supplement.laps.first().start)
        assertEquals(w.end, supplement.laps.last().end)
        supplement.laps.zipWithNext().forEach { (a, b) -> assertEquals(a.end, b.start) }
        // Determinism still holds once the boundaries depend on the samples too.
        assertEquals(supplement, SyntheticWorkoutDetailGenerator.generate(w))
    }

    @Test
    fun `a negative-split workout's later laps read faster than its earlier ones, at least once`() {
        // splitSign is random per-workout seed; try several seeds and require the effect to show up in
        // at least one of them rather than asserting a direction that depends on a coin flip.
        val sawVariation = (0 until 20).any { i ->
            val w = workout(WorkoutType.RUNNING, minutes = 40, distanceMeters = 8_000.0, id = "AA:BB@$i")
            val laps = SyntheticWorkoutDetailGenerator.generate(w).laps.dropLast(1)
            laps.size >= 3 && laps.map { it.duration.seconds }.toSet().size > 1
        }
        assertTrue("expected at least one seed out of 20 to show lap-to-lap pace variation", sawVariation)
    }
}
