package com.unified.health.core.data

import com.unified.health.core.data.database.HealthSampleEntity
import com.unified.health.core.data.database.SampleType
import com.unified.health.core.data.repository.MetricSeriesBuilder
import com.unified.health.core.model.HealthMetricType
import com.unified.health.core.model.SleepStage
import com.unified.health.core.model.TimeRange
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test
import java.time.LocalDate
import java.time.ZoneOffset
import java.util.Locale

class MetricSeriesBuilderTest {

    private val zone = ZoneOffset.UTC
    private val builder = MetricSeriesBuilder(zone, Locale.US)
    private val end = LocalDate.of(2026, 11, 6) // a Friday

    private fun ms(date: LocalDate, hour: Int = 0, minute: Int = 0) = date.atTime(hour, minute).toInstant(zone).toEpochMilli()
    private fun daily(type: String, date: LocalDate, value: Double, device: String = "w") =
        HealthSampleEntity(device, type, ms(date), ms(date.plusDays(1)), value)
    private fun point(type: String, date: LocalDate, hour: Int, value: Double) = HealthSampleEntity("w", type, ms(date, hour), ms(date, hour), value)

    @Test
    fun `bucket counts and labels per range`() {
        assertEquals(24, builder.buckets(HealthMetricType.STEPS, TimeRange.DAY, end).size)
        assertEquals(1, builder.buckets(HealthMetricType.SLEEP, TimeRange.DAY, end).size)
        assertEquals("Fri", builder.buckets(HealthMetricType.STEPS, TimeRange.WEEK, end).last().label)
        assertEquals(30, builder.buckets(HealthMetricType.STEPS, TimeRange.MONTH, end).size)
        val weeks = builder.buckets(HealthMetricType.STEPS, TimeRange.SIX_MONTHS, end)
        assertEquals(26, weeks.size)
        assertEquals(LocalDate.of(2026, 11, 2), weeks.last().from) // Monday of the current week
        val months = builder.buckets(HealthMetricType.STEPS, TimeRange.YEAR, end)
        assertEquals(listOf("D", "J", "F", "M", "A", "M", "J", "J", "A", "S", "O", "N"), months.map { it.label })
    }

    @Test
    fun `daily totals take the max across devices and longer buckets average days with data`() {
        val rows = listOf(
            daily(SampleType.DAILY_STEPS, end, 8_000.0, "watch"),
            daily(SampleType.DAILY_STEPS, end, 7_500.0, "band"),
            daily(SampleType.DAILY_STEPS, end.minusDays(1), 4_000.0),
        )
        val week = builder.build(HealthMetricType.STEPS, TimeRange.WEEK, end, rows)
        assertEquals(8_000f, week.last().value)
        assertEquals(4_000f, week[5].value)
        assertEquals(0f, week[0].value)
        val year = builder.build(HealthMetricType.STEPS, TimeRange.YEAR, end, rows)
        assertEquals(6_000f, year.last().value) // (8000 + 4000) / 2 days with data
    }

    @Test
    fun `daily-only metrics are spread over hours in proportion to steps`() {
        val rows = listOf(
            HealthSampleEntity("w", SampleType.STEPS, ms(end, 8), ms(end, 9), 300.0),
            HealthSampleEntity("w", SampleType.STEPS, ms(end, 18), ms(end, 19), 100.0),
            daily(SampleType.DAILY_DISTANCE, end, 400.0),
        )
        val hours = builder.build(HealthMetricType.DISTANCE, TimeRange.DAY, end, rows)
        assertEquals(300f, hours[8].value)
        assertEquals(100f, hours[18].value)
        assertEquals(400f, hours.sumOf { it.value.toDouble() }.toFloat())
    }

    @Test
    fun `discrete buckets carry average min and max`() {
        val rows = listOf(70.0, 90.0, 110.0).mapIndexed { i, v -> point(SampleType.HEART_RATE, end, 10, v).copy(startEpochMs = ms(end, 10, i * 10)) }
        val day = builder.build(HealthMetricType.HEART_RATE, TimeRange.DAY, end, rows)
        assertEquals(90f, day[10].value)
        assertEquals(70f, day[10].min)
        assertEquals(110f, day[10].max)
        assertTrue(day.filterIndexed { i, _ -> i != 10 }.none { it.hasData })
    }

    @Test
    fun `a night belongs to the morning it ends on`() {
        val rows = listOf(
            HealthSampleEntity("w", SampleType.SLEEP_STAGE, ms(end.minusDays(1), 23), ms(end, 1), SleepStage.DEEP.ordinal.toDouble()),
            HealthSampleEntity("w", SampleType.SLEEP_STAGE, ms(end, 1), ms(end, 1, 30), SleepStage.AWAKE.ordinal.toDouble()),
            HealthSampleEntity("w", SampleType.SLEEP_STAGE, ms(end, 1, 30), ms(end, 6, 30), SleepStage.LIGHT.ordinal.toDouble()),
        )
        assertEquals(mapOf(end to 420.0), builder.sleepMinutesByNight(rows))
        val week = builder.build(HealthMetricType.SLEEP, TimeRange.WEEK, end, rows)
        assertEquals(420f, week.last().value)
        val nights = builder.readings(HealthMetricType.SLEEP, rows, 10)
        assertEquals(1, nights.size)
        assertEquals(ms(end.minusDays(1), 23), nights.single().time.toEpochMilli())
    }

    @Test
    fun `steps readings fall back to summed interval steps on days without a daily total`() {
        val rows = listOf(
            // Zepp-style per-minute steps only (no daily total) today, from device "z".
            HealthSampleEntity("z", SampleType.STEPS, ms(end, 9, 0), ms(end, 9, 1), 12.0),
            HealthSampleEntity("z", SampleType.STEPS, ms(end, 9, 1), ms(end, 9, 2), 18.0),
            HealthSampleEntity("z", SampleType.STEPS, ms(end, 9, 3), ms(end, 9, 4), 0.0),
            // Yesterday has a device daily total: it wins over that day's intervals.
            daily(SampleType.DAILY_STEPS, end.minusDays(1), 5000.0),
            HealthSampleEntity("z", SampleType.STEPS, ms(end.minusDays(1), 8), ms(end.minusDays(1), 8, 1), 40.0),
            // A day whose intervals are all zero is not listed.
            HealthSampleEntity("z", SampleType.STEPS, ms(end.minusDays(2), 8), ms(end.minusDays(2), 8, 1), 0.0),
        )
        val readings = builder.readings(HealthMetricType.STEPS, rows, 10)
        assertEquals(listOf(30.0, 5000.0), readings.map { it.value })
        assertEquals("z", readings.first().sourceId)
        assertEquals(ms(end, 9), readings.first().time.toEpochMilli())
        assertEquals("w", readings.last().sourceId)
        assertEquals(1, builder.readings(HealthMetricType.STEPS, rows, 1).size)
    }
}
