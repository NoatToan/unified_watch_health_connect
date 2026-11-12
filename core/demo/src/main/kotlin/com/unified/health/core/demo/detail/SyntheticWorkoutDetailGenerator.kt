package com.unified.health.core.demo.detail

import com.unified.health.core.domain.repository.WorkoutDetailSupplement
import com.unified.health.core.model.Workout
import com.unified.health.core.model.WorkoutLap
import com.unified.health.core.model.WorkoutSample
import com.unified.health.core.model.WorkoutType
import java.time.Duration
import kotlin.math.ceil
import kotlin.math.roundToInt
import kotlin.math.roundToLong
import kotlin.math.sin
import kotlin.math.PI
import kotlin.random.Random

/**
 * Deterministic laps + per-second-ish samples for a demo workout that has neither stored
 * (docs/DECISIONS.md D-1195): `DemoHealthDataGenerator.workoutFor()` only emits a summary
 * `HealthRecord.Workout`, so the detail screen would otherwise show empty splits/pace chart/
 * elevation/HR zones/cadence for every demo running/cycling session. Called lazily when a workout's
 * detail is opened (never persisted) — same (workout id, start) always yields the same laps/samples.
 *
 * Hard constraints (checked by [SyntheticWorkoutDetailGeneratorTest]), so the synthesized detail never
 * contradicts the summary the user already sees on the card: lap distances sum to
 * [Workout.distanceMeters] (±1 m), lap durations sum exactly to [Workout.duration], and the sample
 * heart-rate average/max land within ~2 bpm of [Workout.avgHeartRate]/[Workout.maxHeartRate].
 */
object SyntheticWorkoutDetailGenerator {

    /** Samples roughly every 5–10 s; fixed at the low end keeps the per-lap slicing math simple. */
    private const val SAMPLE_INTERVAL_SEC = 5L
    private const val RUNNING_WALKING_LAP_METERS = 1_000.0
    private const val CYCLING_LAP_METERS = 5_000.0
    private const val TIME_LAP_SECONDS = 600L // 10 min, for sports/workouts with no distance-based split

    fun generate(workout: Workout): WorkoutDetailSupplement {
        val totalSeconds = workout.duration.seconds
        if (totalSeconds <= 0) return WorkoutDetailSupplement(emptyList(), emptyList())
        val rnd = Random(seed(workout))

        val distance = workout.distanceMeters?.takeIf { it > 0 }
        val samples = generateSamples(workout, totalSeconds, distance, rnd)
        val laps = generateLaps(workout, totalSeconds, distance, samples, rnd)
        return WorkoutDetailSupplement(laps, samples)
    }

    /** Same workout (id carries deviceId+start, docs/DECISIONS.md D-1195) always maps to the same seed. */
    private fun seed(workout: Workout): Long = workout.id.hashCode().toLong() * 31L + workout.start.toEpochMilli()

    // ---------------------------------------------------------------- samples

    private fun generateSamples(workout: Workout, totalSeconds: Long, distance: Double?, rnd: Random): List<WorkoutSample> {
        val count = (totalSeconds / SAMPLE_INTERVAL_SEC).toInt().coerceAtLeast(1) + 1
        val times = (0 until count).map { i -> (i * SAMPLE_INTERVAL_SEC).coerceAtMost(totalSeconds) }.distinct()

        val targetAvgHr = workout.avgHeartRate ?: DEFAULT_AVG_HR
        val targetMaxHr = (workout.maxHeartRate ?: (targetAvgHr + 20)).coerceAtLeast(targetAvgHr + 1)
        val heartRates = heartRateCurve(times.size, targetAvgHr, targetMaxHr, rnd)

        val baseSpeed = distance?.let { it / totalSeconds }
        // A workout either negative-splits (faster back half) or positive-splits; picked once per workout.
        val splitSign = if (rnd.nextBoolean()) -1.0 else 1.0
        val cadenceRange = cadenceRangeFor(workout.type)
        val hasAltitude = workout.type != WorkoutType.STRENGTH && workout.type != WorkoutType.YOGA

        return times.mapIndexed { i, t ->
            val fraction = t.toDouble() / totalSeconds
            val speed = baseSpeed?.let { base ->
                val splitFactor = 1.0 + splitSign * 0.08 * (fraction - 0.5)
                (base * splitFactor * (1.0 + rnd.nextDouble(-0.05, 0.05))).coerceAtLeast(0.1)
            }
            val cadence = cadenceRange?.let { (low, high) -> (low + rnd.nextDouble() * (high - low)).roundToInt() }
            val altitude = if (hasAltitude) altitudeAt(fraction, rnd, seedOffset = i) else null
            WorkoutSample(
                time = workout.start.plusSeconds(t),
                altitudeMeters = altitude,
                heartRate = heartRates[i],
                cadence = cadence,
                speedMps = speed,
            )
        }
    }

    /**
     * Ramp up over the first part of the workout, then a slow drift + noise around [targetAvg]/
     * [targetMax] — biased and clipped so the realized average/max land within ~2 bpm of the targets
     * (the hard reconciliation constraint, D-1195).
     */
    private fun heartRateCurve(n: Int, targetAvg: Int, targetMax: Int, rnd: Random): IntArray {
        if (n <= 0) return IntArray(0)
        val floor = (targetAvg - 10).coerceAtLeast(60).toDouble()
        val shape = DoubleArray(n) { i ->
            val t = i.toDouble() / (n - 1).coerceAtLeast(1)
            val ramp = (t / 0.12).coerceIn(0.0, 1.0)
            val drift = 0.08 * sin(t * PI * 1.5)
            val noise = rnd.nextDouble(-0.06, 0.06)
            (ramp * 0.75 + 0.25 + drift + noise).coerceIn(0.0, 1.0)
        }
        var values = shape.map { floor + it * (targetMax - floor) }
        // A couple of bias passes: shifting the whole curve to hit the average can push samples past
        // the ceiling, which needs re-clipping, which shifts the average again — converges fast.
        repeat(3) {
            val bias = targetAvg - values.average()
            values = values.map { (it + bias).coerceIn(floor, targetMax.toDouble()) }
        }
        val result = values.map { it.roundToInt().coerceIn(40, targetMax) }.toIntArray()
        // The workout's own reported peak should actually appear once, at the curve's highest point.
        val peakIndex = result.indices.maxByOrNull { result[it] } ?: return result
        result[peakIndex] = targetMax
        return result
    }

    private fun altitudeAt(fraction: Double, rnd: Random, seedOffset: Int): Double {
        val rolling = ROLLING_HILLS_AMPLITUDE_M * sin(fraction * PI * ROLLING_HILLS_CYCLES)
        val noise = rnd.nextDouble(-1.5, 1.5)
        return (BASE_ALTITUDE_M + rolling + noise).let { if (seedOffset == 0) BASE_ALTITUDE_M else it }
    }

    private fun cadenceRangeFor(type: WorkoutType): Pair<Int, Int>? = when (type) {
        WorkoutType.RUNNING -> 160 to 180
        WorkoutType.WALKING -> 100 to 120
        WorkoutType.CYCLING -> 80 to 95
        else -> null
    }

    // ---------------------------------------------------------------- laps

    private fun generateLaps(
        workout: Workout,
        totalSeconds: Long,
        distance: Double?,
        samples: List<WorkoutSample>,
        rnd: Random,
    ): List<WorkoutLap> {
        val lapMeters = when (workout.type) {
            WorkoutType.RUNNING, WorkoutType.WALKING -> RUNNING_WALKING_LAP_METERS
            WorkoutType.CYCLING -> CYCLING_LAP_METERS
            else -> null
        }
        val boundaries: List<LongRange> = if (lapMeters != null && distance != null) {
            // D-1197 round 2: each lap boundary sits wherever the samples' own (already-varying) pace
            // actually crosses that multiple of lapMeters — not a flat share of the workout's average
            // pace (the old behaviour, which made every full lap land on the exact same duration
            // because it never looked at the samples at all).
            val lapCount = ceil(distance / lapMeters).toInt().coerceIn(1, totalSeconds.toInt().coerceAtLeast(1))
            secondBoundariesFromSampleDistance(workout, lapCount, distance, lapMeters, totalSeconds, samples)
        } else {
            val lapCount = ceil(totalSeconds / TIME_LAP_SECONDS.toDouble()).toInt().coerceAtLeast(1)
            secondBoundariesEven(lapCount, totalSeconds)
        }

        // D-1197 round 2: when the boundaries above came from a known per-lap target distance
        // (lapMeters per full lap, the remainder on the last), that target distance is each lap's
        // *distanceMeters* too — independent of how long the lap actually took. [distanceShares]'s
        // proportional-to-duration split is only for the time-based-lap branch, where no such fixed
        // target exists; using it here as well (the old code did) would desync "distance" from
        // "duration" the moment lap durations started actually varying with pace.
        val lapDistances: List<Double?> = when {
            lapMeters != null && distance != null -> fixedLapDistanceShares(boundaries.size, distance, lapMeters)
            distance != null -> distanceShares(boundaries, totalSeconds, distance)
            else -> boundaries.map { null }
        }
        val activeKcal = workout.activeKcal
        val lapCalories = if (activeKcal != null) caloriesShares(boundaries, totalSeconds, activeKcal) else boundaries.map { null }

        return boundaries.mapIndexed { index, range ->
            val lapSamples = samples.filter { s ->
                val offset = Duration.between(workout.start, s.time).seconds
                offset in range
            }
            val speeds = lapSamples.mapNotNull { it.speedMps }
            val heartRates = lapSamples.mapNotNull { it.heartRate }
            val cadences = lapSamples.mapNotNull { it.cadence }
            val altitudes = lapSamples.mapNotNull { it.altitudeMeters }
            val (ascent, descent) = altitudes.zipWithNext().fold(0.0 to 0.0) { (up, down), (a, b) ->
                if (b > a) (up + (b - a)) to down else up to (down + (a - b))
            }
            // Laps are contiguous: this lap's end is exactly the next lap's start (or the workout's
            // own end for the last lap), so the per-lap durations sum exactly to the workout's.
            val endOffset = if (index == boundaries.lastIndex) totalSeconds else boundaries[index + 1].first
            WorkoutLap(
                index = index,
                start = workout.start.plusSeconds(range.first),
                end = workout.start.plusSeconds(endOffset),
                distanceMeters = lapDistances[index],
                calories = lapCalories[index],
                avgSpeedMps = speeds.takeIf { it.isNotEmpty() }?.average(),
                maxSpeedMps = speeds.maxOrNull(),
                avgHeartRate = heartRates.takeIf { it.isNotEmpty() }?.average()?.roundToInt(),
                maxHeartRate = heartRates.maxOrNull(),
                avgCadence = cadences.takeIf { it.isNotEmpty() }?.average()?.roundToInt(),
                maxCadence = cadences.maxOrNull(),
                ascentMeters = altitudes.takeIf { it.size > 1 }?.let { ascent },
                descentMeters = altitudes.takeIf { it.size > 1 }?.let { descent },
            )
        }
    }

    /** [lapCount] contiguous ranges of whole seconds covering `0 until totalSeconds` exactly. */
    private fun secondBoundariesEven(lapCount: Int, totalSeconds: Long): List<LongRange> {
        val base = totalSeconds / lapCount
        val extra = totalSeconds % lapCount
        var cursor = 0L
        return (0 until lapCount).map { i ->
            val length = base + if (i < extra) 1 else 0
            val range = cursor until (cursor + length)
            cursor += length
            range
        }
    }

    /** Each full lap's known target distance ([lapMeters]), the remainder on the last — the same
     * shares [secondBoundariesFromSampleDistance] used to place the lap boundaries in time, kept
     * separate from [distanceShares]'s proportional-to-duration split (D-1197 round 2). */
    private fun fixedLapDistanceShares(lapCount: Int, distance: Double, lapMeters: Double): List<Double> =
        (0 until lapCount).map { i -> if (i < lapCount - 1) lapMeters else distance - lapMeters * (lapCount - 1) }

    /**
     * Same contract as [secondBoundariesEven] — [lapCount] contiguous whole-second ranges covering
     * `0 until totalSeconds` exactly — but each internal cut sits wherever [samples]' own cumulative
     * distance (trapezoidal integration of [WorkoutSample.speedMps], the exact same per-sample pace
     * variation the pace chart already draws) crosses a multiple of [lapMeters], instead of a flat
     * share of the workout's *average* pace (D-1197 round 1's bug: every full lap landed on the same
     * duration because it never consulted the samples at all).
     */
    private fun secondBoundariesFromSampleDistance(
        workout: Workout,
        lapCount: Int,
        distance: Double,
        lapMeters: Double,
        totalSeconds: Long,
        samples: List<WorkoutSample>,
    ): List<LongRange> {
        if (lapCount <= 1 || samples.size < 2) return secondBoundariesEven(lapCount, totalSeconds)

        data class Point(val second: Long, val meters: Double)

        val sorted = samples.sortedBy { it.time }
        val points = mutableListOf(Point(Duration.between(workout.start, sorted.first().time).seconds.coerceIn(0, totalSeconds), 0.0))
        for (i in 1 until sorted.size) {
            val prev = sorted[i - 1]
            val cur = sorted[i]
            val curSecond = Duration.between(workout.start, cur.time).seconds.coerceIn(0, totalSeconds)
            val dtSeconds = (curSecond - points.last().second).toDouble().coerceAtLeast(0.0)
            val speeds = listOfNotNull(prev.speedMps, cur.speedMps)
            val avgSpeed = if (speeds.isNotEmpty()) speeds.average() else 0.0
            points += Point(curSecond, points.last().meters + avgSpeed * dtSeconds)
        }
        val rawTotal = points.last().meters
        if (rawTotal <= 1e-6) return secondBoundariesEven(lapCount, totalSeconds)

        fun secondAtMeters(targetRaw: Double): Long {
            for (i in 1 until points.size) {
                if (points[i].meters >= targetRaw - 1e-9) {
                    val segMeters = points[i].meters - points[i - 1].meters
                    val fraction = if (segMeters > 1e-9) ((targetRaw - points[i - 1].meters) / segMeters).coerceIn(0.0, 1.0) else 0.0
                    val segSeconds = points[i].second - points[i - 1].second
                    return (points[i - 1].second + (segSeconds * fraction).roundToLong()).coerceIn(0L, totalSeconds)
                }
            }
            return totalSeconds
        }

        // k*lapMeters of the *real* distance maps to k*lapMeters/distance of the samples' own raw
        // (unscaled) cumulative curve — the curve's end-to-end average speed already tracks the
        // workout's real pace almost exactly (noise aside), so this only needs to find *where in
        // time* that same fraction of it falls, not rescale the curve itself.
        val rawCuts = (1 until lapCount).map { k -> secondAtMeters((k * lapMeters) / distance * rawTotal) }

        // The curve is monotonically increasing by construction (speed is always > 0), so these cuts
        // are already strictly increasing in practice; enforce it defensively against rounding so no
        // lap ever ends up with a zero/negative length, leaving room for every boundary still to come.
        val forward = rawCuts.toMutableList()
        for (i in 1 until forward.size) if (forward[i] <= forward[i - 1]) forward[i] = forward[i - 1] + 1
        for (i in forward.indices.reversed()) {
            val maxAllowed = totalSeconds - (forward.size - i)
            if (forward[i] > maxAllowed) forward[i] = maxAllowed
        }
        for (i in 1 until forward.size) if (forward[i] <= forward[i - 1]) forward[i] = forward[i - 1] + 1

        var cursor = 0L
        return (forward + totalSeconds).map { end ->
            val range = cursor until end
            cursor = end
            range
        }
    }

    private fun distanceShares(boundaries: List<LongRange>, totalSeconds: Long, distance: Double): List<Double> {
        val shares = boundaries.map { (it.last - it.first + 1).toDouble() / totalSeconds * distance }
        // Force the exact total onto the last lap so rounding error never drifts the sum past ±1 m.
        val adjusted = shares.toMutableList()
        adjusted[adjusted.lastIndex] = distance - shares.dropLast(1).sum()
        return adjusted
    }

    private fun caloriesShares(boundaries: List<LongRange>, totalSeconds: Long, totalKcal: Int): List<Int> {
        val raw = boundaries.map { (it.last - it.first + 1).toDouble() / totalSeconds * totalKcal }
        val whole = raw.map { it.toInt() }
        var remainder = totalKcal - whole.sum()
        val result = whole.toMutableList()
        raw.indices.sortedByDescending { raw[it] - whole[it] }.forEach { i ->
            if (remainder <= 0) return@forEach
            result[i] = result[i] + 1
            remainder--
        }
        return result
    }

    private const val DEFAULT_AVG_HR = 130
    private const val BASE_ALTITUDE_M = 40.0
    private const val ROLLING_HILLS_AMPLITUDE_M = 12.0
    private const val ROLLING_HILLS_CYCLES = 2.5
}
