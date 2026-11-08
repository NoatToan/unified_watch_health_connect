package com.unified.health.core.designsystem.component

import com.unified.health.core.model.HealthMetricType
import com.unified.health.core.model.MetricAggregation
import com.unified.health.core.model.MetricReading
import java.text.NumberFormat
import java.time.LocalDate
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle
import java.util.Locale
import kotlin.math.roundToInt

/**
 * Formats a stored value for display: distance is stored in meters and shown in km, sleep is stored
 * in minutes and shown as "7 hr 12 min", counts are grouped ("8,412").
 */
fun HealthMetricType.formatValue(value: Double, locale: Locale = Locale.getDefault()): String = when (this) {
    HealthMetricType.DISTANCE -> String.format(locale, "%.1f", value / 1000.0)
    HealthMetricType.SLEEP -> formatMinutes(value.roundToInt())
    HealthMetricType.WEIGHT -> String.format(locale, "%.1f", value)
    else -> NumberFormat.getIntegerInstance(locale).format(value.roundToInt())
}

fun formatMinutes(minutes: Int): String {
    val h = minutes / 60
    val m = minutes % 60
    return when {
        h == 0 -> "$m min"
        m == 0 -> "$h hr"
        else -> "$h hr $m min"
    }
}

private val DATE_LABEL: DateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)
private val TIME_LABEL: DateTimeFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)

/**
 * Short "when" caption for a reading on a card: "Today", "Today 10:42", "Yesterday", "Last night",
 * or a date further back. Shared by Summary's pinned cards and the Health feed.
 */
fun timeLabel(metric: HealthMetricType, reading: MetricReading, zone: ZoneId = ZoneId.systemDefault()): String {
    val time = (reading.endTime ?: reading.time).atZone(zone)
    val today = LocalDate.now(zone)
    val date = time.toLocalDate()
    return when (metric.aggregation) {
        MetricAggregation.CUMULATIVE -> when (reading.time.atZone(zone).toLocalDate()) {
            today -> "Today"
            today.minusDays(1) -> "Yesterday"
            else -> DATE_LABEL.format(reading.time.atZone(zone))
        }
        MetricAggregation.SLEEP -> if (date == today) "Last night" else DATE_LABEL.format(time)
        // Resting heart rate is one value per day, stored at midnight: show the day, not "12:00 AM".
        MetricAggregation.DISCRETE -> when {
            metric == HealthMetricType.RESTING_HEART_RATE -> if (date == today) "Today" else DATE_LABEL.format(time)
            date == today -> TIME_LABEL.format(time)
            else -> DATE_LABEL.format(time)
        }
    }
}
