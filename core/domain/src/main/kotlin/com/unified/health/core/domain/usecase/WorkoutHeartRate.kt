package com.unified.health.core.domain.usecase

import com.unified.health.core.model.ChartPoint
import com.unified.health.core.model.HeartRateSample
import java.time.Duration
import java.time.Instant
import kotlin.math.roundToInt

data class HeartRateStats(val average: Int, val min: Int, val max: Int)

/** Turns the heart-rate samples recorded during a workout into chart buckets and stats. */
object WorkoutHeartRateSeries {
    const val MAX_BUCKETS = 30

    /**
     * Splits [start]..[end] into at most [MAX_BUCKETS] equal buckets (at least one minute each);
     * each bucket carries the average and min–max of its samples, empty buckets are 0. Labels are
     * the elapsed minutes at the start of the bucket ("0m", "10m"…).
     */
    fun buckets(samples: List<HeartRateSample>, start: Instant, end: Instant, maxBuckets: Int = MAX_BUCKETS): List<ChartPoint> {
        val totalMs = Duration.between(start, end).toMillis()
        if (totalMs <= 0) return emptyList()
        val minutes = (totalMs / 60_000).coerceAtLeast(1)
        val count = minOf(maxBuckets.toLong(), minutes).toInt().coerceAtLeast(1)
        val bucketMs = totalMs.toDouble() / count
        val grouped = samples
            .filter { !it.time.isBefore(start) && it.time.isBefore(end) && it.bpm > 0 }
            .groupBy { ((Duration.between(start, it.time).toMillis()) / bucketMs).toInt().coerceIn(0, count - 1) }
        return (0 until count).map { i ->
            val label = "${((i * bucketMs) / 60_000).roundToInt()}m"
            val bucket = grouped[i]
            if (bucket.isNullOrEmpty()) {
                ChartPoint(label, 0f)
            } else {
                ChartPoint(label, bucket.map { it.bpm }.average().toFloat(), bucket.minOf { it.bpm }.toFloat(), bucket.maxOf { it.bpm }.toFloat())
            }
        }
    }

    fun stats(samples: List<HeartRateSample>): HeartRateStats? {
        val bpm = samples.map { it.bpm }.filter { it > 0 }
        if (bpm.isEmpty()) return null
        return HeartRateStats(bpm.average().roundToInt(), bpm.min(), bpm.max())
    }
}
