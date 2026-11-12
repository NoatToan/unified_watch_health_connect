package com.unified.health.core.designsystem.component

import com.unified.health.core.model.ScheduledDay
import com.unified.health.core.model.ScheduledDayKind
import java.util.Locale

/**
 * One line describing a [ScheduledDay]'s activity, e.g. "Chạy 4.8 km" / "Cross-training 40 phút" /
 * "Nghỉ" / "5K Race" — shared by `feature/training`'s calendar screen and `feature/home`'s "today's
 * workout" card (docs/DECISIONS.md D-1190). Lives here, not in either feature module, since feature
 * modules may only depend on `core:domain`/`core:designsystem`/`core:model`, never on each other —
 * both already depend on this module.
 */
fun scheduledDayDescription(day: ScheduledDay): String = when (day.kind) {
    ScheduledDayKind.REST -> "Nghỉ"
    ScheduledDayKind.RUN -> "Chạy ${formatKm(day.distanceMeters)}"
    ScheduledDayKind.CROSS -> {
        val label = day.label
        val minutes = day.durationMinutes
        when {
            label != null && minutes != null -> "$label $minutes phút"
            label != null -> label
            minutes != null -> "Cross-training $minutes phút"
            else -> "Cross-training"
        }
    }
    ScheduledDayKind.RACE -> buildString {
        append(day.label ?: "Race")
        day.distanceMeters?.let { append(" (${formatKm(it)})") }
    }
}

private fun formatKm(distanceMeters: Double?): String {
    if (distanceMeters == null) return ""
    return String.format(Locale.getDefault(), "%.1f km", distanceMeters / 1000.0)
}
