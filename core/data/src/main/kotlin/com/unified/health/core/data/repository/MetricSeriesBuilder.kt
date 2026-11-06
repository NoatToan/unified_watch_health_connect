package com.unified.health.core.data.repository

import com.unified.health.core.data.database.HealthSampleEntity
import com.unified.health.core.data.database.SampleType
import com.unified.health.core.model.ChartPoint
import com.unified.health.core.model.HealthMetricType
import com.unified.health.core.model.MetricAggregation
import com.unified.health.core.model.MetricReading
import com.unified.health.core.model.TimeRange
import java.time.DayOfWeek
import java.time.Instant
import java.time.LocalDate
import java.time.ZoneId
import java.time.format.TextStyle
import java.time.temporal.TemporalAdjusters
import java.util.Locale

/**
 * Pure chart rules for every metric and range (Apple Health semantics):
 * - D: 24 hourly buckets (sleep: one bucket, the night ending that morning).
 * - W / M: 7 / 30 daily buckets.
 * - 6M: 26 weekly buckets (Monday-based); Y: 12 monthly buckets.
 * - Cumulative metrics: hourly or daily totals; weekly/monthly buckets hold the average daily total
 *   over days that have data. Discrete metrics: average with min/max per bucket.
 * - Sleep: minutes asleep per night; a night belongs to the morning it ends on (18:00 → 12:00).
 * - Several devices may report the same day: daily totals take the maximum, never the sum.
 */
internal class MetricSeriesBuilder(
    private val zone: ZoneId,
    private val locale: Locale = Locale.getDefault(),
) {

    /** A bucket covers local dates [from, toExclusive); for D, an hour of [from]. */
    data class Bucket(val label: String, val from: LocalDate, val toExclusive: LocalDate, val hour: Int? = null)

    fun buckets(metric: HealthMetricType, range: TimeRange, endDate: LocalDate): List<Bucket> = when (range) {
        TimeRange.DAY ->
            if (metric.aggregation == MetricAggregation.SLEEP) {
                listOf(Bucket(endDate.dayOfWeek.short(), endDate, endDate.plusDays(1)))
            } else {
                (0 until HOURS).map { h -> Bucket("${h}h", endDate, endDate.plusDays(1), hour = h) }
            }
        TimeRange.WEEK -> days(endDate, 7) { it.dayOfWeek.short() }
        TimeRange.MONTH -> days(endDate, 30) { it.dayOfMonth.toString() }
        TimeRange.SIX_MONTHS -> {
            val lastWeek = endDate.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY))
            (WEEKS_IN_SIX_MONTHS - 1 downTo 0).map { back ->
                val start = lastWeek.minusWeeks(back.toLong())
                val previousStart = start.minusWeeks(1)
                // Label the first week of each month, like Apple's month ticks.
                val label = if (start.month != previousStart.month || back == WEEKS_IN_SIX_MONTHS - 1) start.month.short() else ""
                Bucket(label, start, start.plusWeeks(1))
            }
        }
        TimeRange.YEAR -> {
            val lastMonth = endDate.withDayOfMonth(1)
            (MONTHS_IN_YEAR - 1 downTo 0).map { back ->
                val start = lastMonth.minusMonths(back.toLong())
                Bucket(start.month.getDisplayName(TextStyle.NARROW, locale), start, start.plusMonths(1))
            }
        }
    }

    /** [from, to) epoch millis that must be loaded to build [range]; sleep windows reach back to 18:00. */
    fun window(metric: HealthMetricType, range: TimeRange, endDate: LocalDate): LongRange {
        val buckets = buckets(metric, range, endDate)
        val first = buckets.first().from
        val last = buckets.last().toExclusive
        return if (metric.aggregation == MetricAggregation.SLEEP) {
            sleepWindowStart(first) until sleepWindowStart(last)
        } else {
            startMs(first) until startMs(last)
        }
    }

    fun build(metric: HealthMetricType, range: TimeRange, endDate: LocalDate, samples: List<HealthSampleEntity>): List<ChartPoint> {
        val buckets = buckets(metric, range, endDate)
        return when (metric.aggregation) {
            MetricAggregation.CUMULATIVE -> cumulative(metric, range, buckets, samples)
            MetricAggregation.SLEEP -> {
                val nights = sleepMinutesByNight(samples)
                buckets.map { b -> ChartPoint(b.label, averageOfDays(nights, b).toFloat()) }
            }
            MetricAggregation.DISCRETE -> {
                val rows = samples.filter { it.type in typesFor(metric) }
                buckets.map { b ->
                    val inBucket = rows.filter { inBucket(it.startEpochMs, b) }
                    if (inBucket.isEmpty()) {
                        ChartPoint(b.label, 0f)
                    } else {
                        ChartPoint(
                            label = b.label,
                            value = inBucket.map { it.value }.average().toFloat(),
                            min = inBucket.minOf { it.value }.toFloat(),
                            max = inBucket.maxOf { it.value }.toFloat(),
                        )
                    }
                }
            }
        }
    }

    // ---------------------------------------------------------------- cumulative

    private fun cumulative(metric: HealthMetricType, range: TimeRange, buckets: List<Bucket>, samples: List<HealthSampleEntity>): List<ChartPoint> {
        val daily = dailyTotals(metric, samples)
        if (range != TimeRange.DAY) return buckets.map { b -> ChartPoint(b.label, averageOfDays(daily, b).toFloat()) }

        // Hourly: steps come as intervals; daily-only metrics are spread over the day in proportion to steps.
        val date = buckets.first().from
        val hourlySteps = HealthAggregation.stepsByHour(samples.filter { startMs(date) <= it.startEpochMs && it.startEpochMs < startMs(date.plusDays(1)) }, zone)
        val stepTotal = hourlySteps.sum()
        val dayTotal = daily[date] ?: 0.0
        return buckets.map { b ->
            val hour = b.hour ?: 0
            val value = when {
                metric == HealthMetricType.STEPS -> hourlySteps[hour].toDouble()
                stepTotal > 0 -> dayTotal * hourlySteps[hour] / stepTotal
                else -> 0.0
            }
            ChartPoint(b.label, value.toFloat())
        }
    }

    /** Per local date; for steps the device total wins over the sum of intervals. */
    fun dailyTotals(metric: HealthMetricType, samples: List<HealthSampleEntity>): Map<LocalDate, Double> {
        val byDay = samples.groupBy { dateOf(it.startEpochMs) }
        return byDay.mapValues { (_, rows) ->
            when (metric) {
                HealthMetricType.STEPS -> HealthAggregation.steps(rows).toDouble()
                HealthMetricType.DISTANCE -> HealthAggregation.dailyMax(rows, SampleType.DAILY_DISTANCE) ?: 0.0
                HealthMetricType.CALORIES -> HealthAggregation.dailyMax(rows, SampleType.DAILY_ACTIVE_KCAL) ?: 0.0
                HealthMetricType.EXERCISE_MINUTES -> HealthAggregation.dailyMax(rows, SampleType.DAILY_EXERCISE_MINUTES) ?: 0.0
                else -> 0.0
            }
        }.filterValues { it > 0.0 }
    }

    // ---------------------------------------------------------------- sleep

    /** Minutes asleep per night, keyed by the date of the morning the night ends on. */
    fun sleepMinutesByNight(samples: List<HealthSampleEntity>): Map<LocalDate, Double> =
        samples.filter { it.type == SampleType.SLEEP_STAGE }
            .groupBy { nightOf(it.startEpochMs) }
            .mapValues { (_, rows) -> HealthAggregation.sleepMinutes(rows).toDouble() }
            .filterValues { it > 0.0 }

    /** The morning a sample taken at [epochMs] belongs to (18:00 the day before → 18:00). */
    fun nightOf(epochMs: Long): LocalDate =
        Instant.ofEpochMilli(epochMs).atZone(zone).plusHours(SLEEP_DAY_SHIFT_HOURS).toLocalDate()

    // ---------------------------------------------------------------- "Show All Data"

    fun readings(metric: HealthMetricType, rows: List<HealthSampleEntity>, limit: Int): List<MetricReading> = when (metric.aggregation) {
        MetricAggregation.DISCRETE -> rows.sortedByDescending { it.startEpochMs }.take(limit).map {
            MetricReading(metric, it.value, Instant.ofEpochMilli(it.startEpochMs), sourceId = it.deviceId)
        }
        MetricAggregation.CUMULATIVE -> {
            val type = dailyType(metric)
            val daily = rows.filter { it.type == type }
                .groupBy { dateOf(it.startEpochMs) }
                .mapValues { (_, sameDay) -> sameDay.maxBy { it.value } }
                .mapValues { (_, it) -> MetricReading(metric, it.value, Instant.ofEpochMilli(it.startEpochMs), Instant.ofEpochMilli(it.endEpochMs), it.deviceId) }
            // Days a watch reported only interval steps (e.g. Zepp GDSP per-minute activity, no daily
            // total): summed like the Summary card does (HealthAggregation.steps), so both screens agree.
            val fromIntervals = if (metric != HealthMetricType.STEPS) emptyMap() else rows.filter { it.type == SampleType.STEPS }
                .groupBy { dateOf(it.startEpochMs) }
                .filterKeys { it !in daily }
                .mapValues { (_, sameDay) ->
                    MetricReading(
                        metric = metric,
                        value = sameDay.sumOf { it.value },
                        time = Instant.ofEpochMilli(sameDay.minOf { it.startEpochMs }),
                        endTime = Instant.ofEpochMilli(sameDay.maxOf { it.endEpochMs }),
                        sourceId = sameDay.groupingBy { it.deviceId }.eachCount().maxByOrNull { it.value }?.key,
                    )
                }
                .filterValues { it.value > 0.0 }
            (daily + fromIntervals).values.sortedByDescending { it.time }.take(limit)
        }
        MetricAggregation.SLEEP -> rows.filter { it.type == SampleType.SLEEP_STAGE }
            .groupBy { nightOf(it.startEpochMs) }
            .mapNotNull { (_, night) ->
                val session = HealthAggregation.sleepSession(night) ?: return@mapNotNull null
                MetricReading(
                    metric = metric,
                    value = HealthAggregation.sleepMinutes(night).toDouble(),
                    time = session.start,
                    endTime = session.end,
                    sourceId = night.groupingBy { it.deviceId }.eachCount().maxByOrNull { it.value }?.key,
                )
            }
            .sortedByDescending { it.time }
            .take(limit)
    }

    // ---------------------------------------------------------------- helpers

    private fun averageOfDays(perDay: Map<LocalDate, Double>, bucket: Bucket): Double {
        val values = perDay.filterKeys { !it.isBefore(bucket.from) && it.isBefore(bucket.toExclusive) }.values
        return if (values.isEmpty()) 0.0 else values.average()
    }

    private fun inBucket(epochMs: Long, bucket: Bucket): Boolean {
        val time = Instant.ofEpochMilli(epochMs).atZone(zone)
        val date = time.toLocalDate()
        if (date.isBefore(bucket.from) || !date.isBefore(bucket.toExclusive)) return false
        return bucket.hour == null || time.hour == bucket.hour
    }

    private fun days(endDate: LocalDate, count: Int, label: (LocalDate) -> String): List<Bucket> =
        (count - 1 downTo 0).map { back ->
            val d = endDate.minusDays(back.toLong())
            Bucket(label(d), d, d.plusDays(1))
        }

    private fun dateOf(epochMs: Long): LocalDate = Instant.ofEpochMilli(epochMs).atZone(zone).toLocalDate()

    private fun startMs(date: LocalDate): Long = date.atStartOfDay(zone).toInstant().toEpochMilli()

    private fun sleepWindowStart(date: LocalDate): Long =
        date.minusDays(1).atTime(24 - SLEEP_DAY_SHIFT_HOURS.toInt(), 0).atZone(zone).toInstant().toEpochMilli()

    private fun DayOfWeek.short(): String = getDisplayName(TextStyle.SHORT, locale)

    private fun java.time.Month.short(): String = getDisplayName(TextStyle.SHORT, locale)

    companion object {
        private const val HOURS = 24
        private const val WEEKS_IN_SIX_MONTHS = 26
        private const val MONTHS_IN_YEAR = 12

        /** Samples from 18:00 onwards count towards the next morning's night. */
        private const val SLEEP_DAY_SHIFT_HOURS = 6L

        fun typesFor(metric: HealthMetricType): List<String> = when (metric) {
            HealthMetricType.STEPS -> listOf(SampleType.STEPS, SampleType.DAILY_STEPS)
            HealthMetricType.DISTANCE -> listOf(SampleType.DAILY_DISTANCE, SampleType.STEPS)
            HealthMetricType.CALORIES -> listOf(SampleType.DAILY_ACTIVE_KCAL, SampleType.STEPS)
            HealthMetricType.EXERCISE_MINUTES -> listOf(SampleType.DAILY_EXERCISE_MINUTES, SampleType.STEPS)
            HealthMetricType.HEART_RATE -> listOf(SampleType.HEART_RATE)
            HealthMetricType.RESTING_HEART_RATE -> listOf(SampleType.RESTING_HEART_RATE)
            HealthMetricType.HRV -> listOf(SampleType.HRV)
            HealthMetricType.SPO2 -> listOf(SampleType.SPO2)
            HealthMetricType.STRESS -> listOf(SampleType.STRESS)
            HealthMetricType.SLEEP -> listOf(SampleType.SLEEP_STAGE)
            HealthMetricType.WEIGHT -> emptyList() // No wearable source yet (Health Connect import is a later step).
        }

        /** The device daily-total type for cumulative metrics ("Show All Data" lists these). */
        fun dailyType(metric: HealthMetricType): String? = when (metric) {
            HealthMetricType.STEPS -> SampleType.DAILY_STEPS
            HealthMetricType.DISTANCE -> SampleType.DAILY_DISTANCE
            HealthMetricType.CALORIES -> SampleType.DAILY_ACTIVE_KCAL
            HealthMetricType.EXERCISE_MINUTES -> SampleType.DAILY_EXERCISE_MINUTES
            else -> null
        }
    }
}
