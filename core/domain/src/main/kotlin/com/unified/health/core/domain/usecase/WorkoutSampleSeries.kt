package com.unified.health.core.domain.usecase

import com.unified.health.core.model.ChartPoint
import com.unified.health.core.model.WorkoutSample
import java.time.Duration
import java.time.Instant
import kotlin.math.roundToInt

/**
 * Turns the per-second [WorkoutSample]s recorded during a workout (FIT `record`, D-1093) into chart
 * buckets for the workout-detail trend chart: heart rate, elevation, and pace over elapsed time.
 * Bucketing follows the same scheme as [WorkoutHeartRateSeries] (equal time buckets, averaged).
 */
object WorkoutSampleSeries {
    const val MAX_BUCKETS = 60

    /** Minimum speed to treat as "moving" when converting to pace; slower/stopped samples are excluded
     * so brief pauses don't spike the pace chart to an enormous seconds/km value. */
    private const val MIN_MOVING_SPEED_MPS = 0.3

    fun heartRate(samples: List<WorkoutSample>, start: Instant, end: Instant, maxBuckets: Int = MAX_BUCKETS): List<ChartPoint> =
        buckets(samples, start, end, maxBuckets) { it.heartRate?.toFloat()?.takeIf { bpm -> bpm > 0f } }

    fun elevation(samples: List<WorkoutSample>, start: Instant, end: Instant, maxBuckets: Int = MAX_BUCKETS): List<ChartPoint> =
        buckets(samples, start, end, maxBuckets) { it.altitudeMeters?.toFloat() }

    /** Pace in seconds/km (lower is faster) derived from instantaneous speed. */
    fun paceSecondsPerKm(samples: List<WorkoutSample>, start: Instant, end: Instant, maxBuckets: Int = MAX_BUCKETS): List<ChartPoint> =
        buckets(samples, start, end, maxBuckets) { s -> s.speedMps?.takeIf { it >= MIN_MOVING_SPEED_MPS }?.let { (1000.0 / it).toFloat() } }

    private fun buckets(
        samples: List<WorkoutSample>,
        start: Instant,
        end: Instant,
        maxBuckets: Int,
        metric: (WorkoutSample) -> Float?,
    ): List<ChartPoint> {
        val totalMs = Duration.between(start, end).toMillis()
        if (totalMs <= 0) return emptyList()
        val seconds = (totalMs / 1000).coerceAtLeast(1)
        val count = minOf(maxBuckets.toLong(), seconds).toInt().coerceAtLeast(1)
        val bucketMs = totalMs.toDouble() / count
        val grouped = samples
            .filter { !it.time.isBefore(start) && it.time.isBefore(end) }
            .groupBy { (Duration.between(start, it.time).toMillis() / bucketMs).toInt().coerceIn(0, count - 1) }
        return (0 until count).map { i ->
            val label = "${((i * bucketMs) / 60_000).roundToInt()}m"
            val values = grouped[i]?.mapNotNull(metric).orEmpty()
            if (values.isEmpty()) ChartPoint(label, 0f) else ChartPoint(label, values.average().toFloat())
        }
    }
}
