package com.unified.health.core.designsystem.component

import com.unified.health.core.model.HealthMetricType
import java.text.NumberFormat
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
