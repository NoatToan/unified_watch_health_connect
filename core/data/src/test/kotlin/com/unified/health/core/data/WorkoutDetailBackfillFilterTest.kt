package com.unified.health.core.data

import com.unified.health.core.data.sync.WorkoutDetailBackfillFilter
import com.unified.health.core.data.sync.WorkoutDetailRowCounter
import com.unified.health.core.model.HealthRecord
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Test
import java.time.Instant

/**
 * D-1176: the backfill reuses [com.unified.health.core.domain.repository.WearableDeviceRepository.reprocessRawPayloads],
 * which already runs once automatically per device and again on every manual "Reprocess downloaded
 * files" tap — [WorkoutDetailBackfillFilter] is what keeps either of those idempotent instead of
 * re-decoding/rewriting a workout's laps/samples that are already in Room.
 */
class WorkoutDetailBackfillFilterTest {

    private val workoutStart = Instant.parse("2026-03-01T06:00:00Z")
    private val otherWorkoutStart = Instant.parse("2026-03-02T06:00:00Z")

    private val lap = HealthRecord.WorkoutLap(
        workoutStart = workoutStart,
        index = 0,
        start = workoutStart,
        end = workoutStart.plusSeconds(600),
    )
    private val sample = HealthRecord.WorkoutSample(workoutStart = workoutStart, time = workoutStart.plusSeconds(10))
    private val workout = HealthRecord.Workout(start = workoutStart, end = workoutStart.plusSeconds(1800), sport = "running")

    @Test
    fun `passes everything through when nothing is backfilled yet`() = runTest {
        val filter = WorkoutDetailBackfillFilter(WorkoutDetailRowCounter { _, _ -> false })
        val records = listOf(workout, lap, sample)
        assertEquals(records, filter.dropAlreadyBackfilled("device-1", records))
    }

    @Test
    fun `drops laps and samples for a workout that already has rows, keeps the workout summary`() = runTest {
        val filter = WorkoutDetailBackfillFilter(
            WorkoutDetailRowCounter { _, workoutStartEpochMs -> workoutStartEpochMs == workoutStart.toEpochMilli() },
        )
        val result = filter.dropAlreadyBackfilled("device-1", listOf(workout, lap, sample))
        assertEquals(listOf(workout), result)
    }

    @Test
    fun `only drops the workout that already has rows, keeps another one in the same batch`() = runTest {
        val otherLap = lap.copy(workoutStart = otherWorkoutStart)
        val filter = WorkoutDetailBackfillFilter(
            WorkoutDetailRowCounter { _, workoutStartEpochMs -> workoutStartEpochMs == workoutStart.toEpochMilli() },
        )
        val result = filter.dropAlreadyBackfilled("device-1", listOf(lap, sample, otherLap))
        assertEquals(listOf(otherLap), result)
    }

    @Test
    fun `second pass over the same payload drops everything the first pass already wrote`() = runTest {
        val written = mutableSetOf<Long>()
        val filter = WorkoutDetailBackfillFilter(WorkoutDetailRowCounter { _, workoutStartEpochMs -> workoutStartEpochMs in written })
        val records = listOf(workout, lap, sample)

        val first = filter.dropAlreadyBackfilled("device-1", records)
        assertEquals(records, first)
        written += workoutStart.toEpochMilli() // simulates the sink persisting what `first` returned

        val second = filter.dropAlreadyBackfilled("device-1", records)
        assertEquals(listOf(workout), second) // laps/samples dropped; no duplicate rows would be written
    }
}
