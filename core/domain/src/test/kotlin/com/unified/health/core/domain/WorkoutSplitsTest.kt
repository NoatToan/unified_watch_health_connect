package com.unified.health.core.domain

import com.unified.health.core.domain.usecase.WorkoutSplits
import com.unified.health.core.model.UnitSystem
import com.unified.health.core.model.Workout
import com.unified.health.core.model.WorkoutLap
import com.unified.health.core.model.WorkoutSample
import com.unified.health.core.model.WorkoutType
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Test
import java.time.Duration
import java.time.Instant

class WorkoutSplitsTest {

    private val start = Instant.parse("2026-11-06T07:00:00Z")

    private fun workout(distanceMeters: Double?, duration: Duration) = Workout(
        id = "AA:BB@${start.toEpochMilli()}",
        type = WorkoutType.RUNNING,
        start = start,
        end = start.plus(duration),
        distanceMeters = distanceMeters,
    )

    // ---------------------------------------------------------------- laps

    @Test
    fun `laps become splits directly, last short lap is partial`() {
        val laps = listOf(
            WorkoutLap(index = 0, start = start, end = start.plusSeconds(300), distanceMeters = 1_000.0),
            WorkoutLap(index = 1, start = start.plusSeconds(300), end = start.plusSeconds(590), distanceMeters = 1_000.0),
            WorkoutLap(index = 2, start = start.plusSeconds(590), end = start.plusSeconds(750), distanceMeters = 500.0),
        )
        val w = workout(2_500.0, Duration.ofSeconds(750))
        val summary = WorkoutSplits.compute(w, laps, emptyList(), UnitSystem.METRIC)

        assertEquals(3, summary.splits.size)
        assertTrue(summary.splits[2].isPartial)
        assertTrue(!summary.splits[0].isPartial && !summary.splits[1].isPartial)
    }

    @Test
    fun `fastest split is the shortest-duration complete split, excluding the partial`() {
        val laps = listOf(
            WorkoutLap(index = 0, start = start, end = start.plusSeconds(300), distanceMeters = 1_000.0), // slowest complete
            WorkoutLap(index = 1, start = start.plusSeconds(300), end = start.plusSeconds(590), distanceMeters = 1_000.0), // fastest complete, 290s
            // Partial final split is deliberately the shortest of all (80s) but must not win "fastest".
            WorkoutLap(index = 2, start = start.plusSeconds(590), end = start.plusSeconds(670), distanceMeters = 200.0),
        )
        val w = workout(2_200.0, Duration.ofSeconds(670))
        val summary = WorkoutSplits.compute(w, laps, emptyList(), UnitSystem.METRIC)

        assertEquals(1, summary.fastestSplitIndex)
    }

    @Test
    fun `average pace comes from the workout's own total distance and time, not the splits`() {
        val laps = listOf(WorkoutLap(index = 0, start = start, end = start.plusSeconds(300), distanceMeters = 1_000.0))
        val w = workout(1_000.0, Duration.ofSeconds(300))
        val summary = WorkoutSplits.compute(w, laps, emptyList(), UnitSystem.METRIC)
        assertEquals(300.0, summary.averagePaceSecondsPerUnit!!, 0.001)
    }

    @Test
    fun `half marathon time is null below that distance`() {
        val laps = List(5) { i -> WorkoutLap(index = i, start = start.plusSeconds(i * 300L), end = start.plusSeconds((i + 1) * 300L), distanceMeters = 1_000.0) }
        val w = workout(5_000.0, Duration.ofSeconds(1_500))
        val summary = WorkoutSplits.compute(w, laps, emptyList(), UnitSystem.METRIC)
        assertNull(summary.halfMarathonDuration)
        assertNull(summary.marathonDuration)
    }

    @Test
    fun `half marathon time is interpolated once the distance is reached, marathon stays null`() {
        // 22 x 1km laps at an even 300s/km = 22,000m, just past the 21,097.5m half-marathon mark.
        val laps = List(22) { i -> WorkoutLap(index = i, start = start.plusSeconds(i * 300L), end = start.plusSeconds((i + 1) * 300L), distanceMeters = 1_000.0) }
        val w = workout(22_000.0, Duration.ofSeconds(22 * 300L))
        val summary = WorkoutSplits.compute(w, laps, emptyList(), UnitSystem.METRIC)

        // 21 full km = 6300s; the 97.5m remainder of lap 22 (1000m/300s) adds 29.25s -> 29s.
        assertEquals(6_329L, summary.halfMarathonDuration!!.seconds)
        assertNull(summary.marathonDuration)
    }

    @Test
    fun `marathon time is interpolated once the distance is reached`() {
        // 43 x 1km laps at an even 300s/km = 43,000m, just past the 42,195m marathon mark.
        val laps = List(43) { i -> WorkoutLap(index = i, start = start.plusSeconds(i * 300L), end = start.plusSeconds((i + 1) * 300L), distanceMeters = 1_000.0) }
        val w = workout(43_000.0, Duration.ofSeconds(43 * 300L))
        val summary = WorkoutSplits.compute(w, laps, emptyList(), UnitSystem.METRIC)

        // 42 full km = 12,600s; the 195m remainder of lap 43 (1000m/300s) adds 58.5s -> 59s (round half up).
        assertEquals(12_659L, summary.marathonDuration!!.seconds)
    }

    // ---------------------------------------------------------------- samples (no laps)

    @Test
    fun `splits are integrated from samples when there are no laps, with a partial final split`() {
        // Constant 10 m/s: 1000m split reached exactly at t=100s; 30s/300m partial tail to t=130s.
        val samples = listOf(
            WorkoutSample(time = start, speedMps = 10.0),
            WorkoutSample(time = start.plusSeconds(100), speedMps = 10.0),
            WorkoutSample(time = start.plusSeconds(130), speedMps = 10.0),
        )
        val w = workout(1_300.0, Duration.ofSeconds(130))
        val summary = WorkoutSplits.compute(w, emptyList(), samples, UnitSystem.METRIC)

        assertEquals(2, summary.splits.size)
        val full = summary.splits[0]
        assertEquals(1_000.0, full.distanceMeters, 0.01)
        assertEquals(100L, full.duration.seconds)
        assertTrue(!full.isPartial)
        val partial = summary.splits[1]
        assertEquals(300.0, partial.distanceMeters, 0.01)
        assertEquals(30L, partial.duration.seconds)
        assertTrue(partial.isPartial)
    }

    @Test
    fun `sample-based splits use the mile unit under imperial`() {
        // Constant speed so 1 mile (1609.344m) is reached exactly at t=50s; a 20s/643.7376m partial tail follows.
        val v = 1_609.344 / 50.0
        val samples = listOf(
            WorkoutSample(time = start, speedMps = v),
            WorkoutSample(time = start.plusSeconds(50), speedMps = v),
            WorkoutSample(time = start.plusSeconds(70), speedMps = v),
        )
        val w = workout(v * 70.0, Duration.ofSeconds(70))
        val summary = WorkoutSplits.compute(w, emptyList(), samples, UnitSystem.IMPERIAL)

        assertEquals(2, summary.splits.size)
        assertEquals(1_609.344, summary.splits[0].distanceMeters, 0.5)
        assertEquals(50L, summary.splits[0].duration.seconds)
        assertTrue(summary.splits[1].isPartial)
        assertEquals(643.74, summary.splits[1].distanceMeters, 0.5)
    }

    @Test
    fun `no splits without at least two samples or any laps`() {
        val w = workout(1_000.0, Duration.ofSeconds(100))
        val summary = WorkoutSplits.compute(w, emptyList(), listOf(WorkoutSample(time = start, speedMps = 5.0)), UnitSystem.METRIC)
        assertTrue(summary.splits.isEmpty())
        // Average pace is still reported from the workout's own summary even with no splits table.
        assertEquals(100.0, summary.averagePaceSecondsPerUnit!!, 0.001)
    }
}
