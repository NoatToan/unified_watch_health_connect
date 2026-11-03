package com.unified.health.core.data.repository

import com.unified.health.core.data.database.HealthSampleEntity
import com.unified.health.core.data.database.SampleType
import com.unified.health.core.model.SleepSession
import com.unified.health.core.model.SleepStage
import com.unified.health.core.model.SleepStageSegment
import java.time.Instant
import java.time.ZoneId
import kotlin.math.roundToInt

/**
 * Pure aggregation rules over stored samples, shared by the dashboard and the charts.
 * Several devices may report the same day, so daily totals take the maximum, never the sum.
 */
internal object HealthAggregation {

    /** Device daily total when present, otherwise the sum of step intervals. */
    fun steps(samples: List<HealthSampleEntity>): Int {
        val daily = samples.filter { it.type == SampleType.DAILY_STEPS }.maxOfOrNull { it.value }
        return daily?.roundToInt() ?: samples.filter { it.type == SampleType.STEPS }.sumOf { it.value }.roundToInt()
    }

    fun stepsByHour(samples: List<HealthSampleEntity>, zone: ZoneId): List<Int> {
        val buckets = IntArray(24)
        samples.filter { it.type == SampleType.STEPS }.forEach {
            buckets[Instant.ofEpochMilli(it.startEpochMs).atZone(zone).hour] += it.value.roundToInt()
        }
        return buckets.toList()
    }

    fun dailyMax(samples: List<HealthSampleEntity>, type: String): Double? =
        samples.filter { it.type == type }.maxOfOrNull { it.value }

    fun average(samples: List<HealthSampleEntity>, type: String): Double? =
        samples.filter { it.type == type }.map { it.value }.takeIf { it.isNotEmpty() }?.average()

    fun latest(samples: List<HealthSampleEntity>, type: String): HealthSampleEntity? =
        samples.filter { it.type == type }.maxByOrNull { it.startEpochMs }

    /** Builds one session from stage intervals; null when none were recorded. */
    fun sleepSession(samples: List<HealthSampleEntity>): SleepSession? {
        val segments = samples
            .filter { it.type == SampleType.SLEEP_STAGE && it.endEpochMs > it.startEpochMs }
            .sortedBy { it.startEpochMs }
            .mapNotNull { s ->
                val stage = SleepStage.entries.getOrNull(s.value.toInt()) ?: return@mapNotNull null
                SleepStageSegment(stage, Instant.ofEpochMilli(s.startEpochMs), Instant.ofEpochMilli(s.endEpochMs))
            }
        if (segments.isEmpty()) return null
        return SleepSession(start = segments.first().start, end = segments.maxOf { it.end }, segments = segments)
    }

    /** Minutes asleep (every stage except AWAKE). */
    fun sleepMinutes(samples: List<HealthSampleEntity>): Int =
        sleepSession(samples)?.segments?.filter { it.stage != SleepStage.AWAKE }?.sumOf { it.duration.toMinutes() }?.toInt() ?: 0
}
