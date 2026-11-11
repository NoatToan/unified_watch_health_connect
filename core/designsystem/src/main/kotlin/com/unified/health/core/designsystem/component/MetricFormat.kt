package com.unified.health.core.designsystem.component

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.unified.health.core.designsystem.R
import com.unified.health.core.model.HealthMetricType
import com.unified.health.core.model.MetricAggregation
import com.unified.health.core.model.MetricReading
import com.unified.health.core.model.UnitSystem
import com.unified.health.core.model.kgToDisplayWeight
import com.unified.health.core.model.metersToDisplayDistance
import java.text.NumberFormat
import java.time.LocalDate
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle
import java.util.Locale
import kotlin.math.roundToInt

/**
 * Formats a stored value for display: distance is stored in meters and shown in km/mi, weight is
 * stored in kg and shown in kg/lb (D-1183: [unitSystem] picks Metric vs Imperial; storage itself
 * never changes), sleep is stored in minutes and shown as "7 hr 12 min", counts are grouped ("8,412").
 *
 * [hourUnit]/[minuteUnit] default to English (so this stays a pure, JVM-testable function — see
 * `MetricInsightTextTest`); composable call sites should use [formatValueLocalized] instead, which
 * supplies the current locale's unit words via `stringResource`.
 */
fun HealthMetricType.formatValue(
    value: Double,
    locale: Locale = Locale.getDefault(),
    unitSystem: UnitSystem = UnitSystem.METRIC,
    hourUnit: String = "hr",
    minuteUnit: String = "min",
): String = when (this) {
    HealthMetricType.DISTANCE -> String.format(locale, "%.1f", value.metersToDisplayDistance(unitSystem))
    HealthMetricType.SLEEP -> formatMinutes(value.roundToInt(), hourUnit, minuteUnit)
    HealthMetricType.WEIGHT -> String.format(locale, "%.1f", value.kgToDisplayWeight(unitSystem))
    else -> NumberFormat.getIntegerInstance(locale).format(value.roundToInt())
}

/** Composable convenience over [formatValue] that localizes the sleep "hr"/"min" unit words. */
@Composable
fun HealthMetricType.formatValueLocalized(
    value: Double,
    locale: Locale = Locale.getDefault(),
    unitSystem: UnitSystem = UnitSystem.METRIC,
): String =
    formatValue(value, locale, unitSystem, stringResource(R.string.duration_hour_unit), stringResource(R.string.duration_minute_unit))

fun formatMinutes(minutes: Int, hourUnit: String = "hr", minuteUnit: String = "min"): String {
    val h = minutes / 60
    val m = minutes % 60
    return when {
        h == 0 -> "$m $minuteUnit"
        m == 0 -> "$h $hourUnit"
        else -> "$h $hourUnit $m $minuteUnit"
    }
}

private val DATE_LABEL: DateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)
private val TIME_LABEL: DateTimeFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)

/**
 * Short "when" caption for a reading on a card: "Today", "Today 10:42", "Yesterday", "Last night",
 * or a date further back. Shared by Summary's pinned cards and the Health feed. All callers are
 * Composable (no pure/non-UI caller needs the English-only behaviour `formatValue` preserves), so
 * this reads its "Today"/"Yesterday"/"Last night" words straight from resources.
 */
@Composable
fun timeLabel(metric: HealthMetricType, reading: MetricReading, zone: ZoneId = ZoneId.systemDefault()): String {
    val time = (reading.endTime ?: reading.time).atZone(zone)
    val today = LocalDate.now(zone)
    val date = time.toLocalDate()
    return when (metric.aggregation) {
        MetricAggregation.CUMULATIVE -> when (reading.time.atZone(zone).toLocalDate()) {
            today -> stringResource(R.string.time_label_today)
            today.minusDays(1) -> stringResource(R.string.time_label_yesterday)
            else -> DATE_LABEL.format(reading.time.atZone(zone))
        }
        MetricAggregation.SLEEP -> if (date == today) stringResource(R.string.time_label_last_night) else DATE_LABEL.format(time)
        // Resting heart rate is one value per day, stored at midnight: show the day, not "12:00 AM".
        MetricAggregation.DISCRETE -> when {
            metric == HealthMetricType.RESTING_HEART_RATE ->
                if (date == today) stringResource(R.string.time_label_today) else DATE_LABEL.format(time)
            date == today -> TIME_LABEL.format(time)
            else -> DATE_LABEL.format(time)
        }
    }
}
