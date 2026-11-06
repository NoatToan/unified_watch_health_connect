package com.unified.health.driver.standard.codec

import java.time.Duration
import java.time.Instant
import kotlin.math.abs
import kotlin.math.roundToInt
import kotlin.math.sqrt

/**
 * RMSSD heart rate variability over RR intervals from the Heart Rate Measurement (D-604, [I]:
 * the SIG profile only transports RR intervals, the metric is computed here).
 *
 * RR values outside [MIN_RR_MS]..[MAX_RR_MS] are dropped; a successive difference is skipped when
 * the beat changed by more than [MAX_SUCCESSIVE_CHANGE] (ectopic/missed beat). A value is emitted
 * once a window covers [WINDOW] and holds at least [MIN_DIFFERENCES] differences; [flush] emits a
 * shorter window when it is already meaningful. Not thread-safe.
 */
internal class RmssdWindow {
    private var previousRr: Int? = null
    private var sumSquares = 0.0
    private var differences = 0
    private var windowStart: Instant? = null

    /** @return an RMSSD value in ms when the window completed with this sample. */
    fun add(time: Instant, rrIntervalsMs: List<Int>): Int? {
        if (windowStart == null) windowStart = time
        for (rr in rrIntervalsMs) {
            if (rr !in MIN_RR_MS..MAX_RR_MS) {
                previousRr = null
                continue
            }
            val previous = previousRr
            if (previous != null && abs(rr - previous) <= previous * MAX_SUCCESSIVE_CHANGE) {
                val d = (rr - previous).toDouble()
                sumSquares += d * d
                differences++
            }
            previousRr = rr
        }
        val start = windowStart ?: return null
        return if (Duration.between(start, time) >= WINDOW && differences >= MIN_DIFFERENCES) complete() else null
    }

    /** Emits the current window when it has enough data (then starts a new one), else null. */
    fun flush(): Int? = if (differences >= MIN_DIFFERENCES) complete() else null

    private fun complete(): Int {
        val value = sqrt(sumSquares / differences).roundToInt()
        sumSquares = 0.0
        differences = 0
        windowStart = null
        return value
    }

    companion object {
        val WINDOW: Duration = Duration.ofSeconds(60)
        const val MIN_DIFFERENCES = 20
        const val MIN_RR_MS = 300
        const val MAX_RR_MS = 2000
        const val MAX_SUCCESSIVE_CHANGE = 0.2
    }
}

/**
 * Integrates the RSC instantaneous cadence (steps per minute, D-605 [I]) into per-minute step
 * buckets. Gaps longer than [MAX_GAP] (link loss, sensor asleep) are not integrated. Not thread-safe.
 */
internal class CadenceStepCounter {

    data class Bucket(val start: Instant, val end: Instant, val steps: Int)

    private var lastSample: Instant? = null
    private var lastCadence = 0
    private var bucketStart: Instant? = null
    private var bucketSteps = 0.0

    /** @return the bucket that was closed by this sample, if any. */
    fun add(time: Instant, cadencePerMinute: Int): Bucket? {
        val minute = time.truncatedToMinute()
        val previous = lastSample
        // A gap of at most MAX_GAP (< 1 minute) crosses at most one minute boundary.
        val integrate = previous != null && time.isAfter(previous) && Duration.between(previous, time) <= MAX_GAP
        val crossesBoundary = previous != null && minute.isAfter(previous)
        if (previous != null && integrate) bucketSteps += steps(previous, if (crossesBoundary) minute else time, lastCadence)
        var closed: Bucket? = null
        if (bucketStart != minute) {
            closed = closeBucket()
            bucketStart = minute
            if (integrate && crossesBoundary) bucketSteps += steps(minute, time, lastCadence)
        }
        lastSample = time
        lastCadence = cadencePerMinute
        return closed
    }

    /** The current, still open bucket (ending at [now]); it is re-reported with the same start later. */
    fun partial(now: Instant): Bucket? {
        val start = bucketStart ?: return null
        val count = bucketSteps.roundToInt()
        if (count <= 0) return null
        val end = minOf(now, start.plus(MINUTE)).let { if (it.isAfter(start)) it else start.plusSeconds(1) }
        return Bucket(start, end, count)
    }

    private fun closeBucket(): Bucket? {
        val start = bucketStart ?: return null
        val count = bucketSteps.roundToInt()
        bucketSteps = 0.0
        bucketStart = null
        return if (count > 0) Bucket(start, start.plus(MINUTE), count) else null
    }

    private fun steps(from: Instant, to: Instant, cadence: Int): Double =
        cadence * Duration.between(from, to).toMillis() / MINUTE.toMillis().toDouble()

    private fun Instant.truncatedToMinute(): Instant = Instant.ofEpochSecond(epochSecond - Math.floorMod(epochSecond, 60L))

    companion object {
        val MINUTE: Duration = Duration.ofMinutes(1)
        val MAX_GAP: Duration = Duration.ofSeconds(5)
    }
}
