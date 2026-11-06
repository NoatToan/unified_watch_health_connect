package com.unified.health.feature.activity

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.DirectionsBike
import androidx.compose.material.icons.automirrored.outlined.DirectionsRun
import androidx.compose.material.icons.automirrored.outlined.DirectionsWalk
import androidx.compose.material.icons.outlined.FitnessCenter
import androidx.compose.material.icons.outlined.Pool
import androidx.compose.material.icons.outlined.SelfImprovement
import androidx.compose.material.icons.outlined.SportsScore
import androidx.compose.ui.graphics.vector.ImageVector
import com.unified.health.core.model.Workout
import com.unified.health.core.model.WorkoutType
import java.time.Duration
import java.util.Locale

internal fun WorkoutType.label(): String = when (this) {
    WorkoutType.WALKING -> "Walking"
    WorkoutType.RUNNING -> "Running"
    WorkoutType.CYCLING -> "Cycling"
    WorkoutType.SWIMMING -> "Swimming"
    WorkoutType.STRENGTH -> "Strength training"
    WorkoutType.YOGA -> "Yoga"
    WorkoutType.OTHER -> "Workout"
}

internal fun WorkoutType.icon(): ImageVector = when (this) {
    WorkoutType.WALKING -> Icons.AutoMirrored.Outlined.DirectionsWalk
    WorkoutType.RUNNING -> Icons.AutoMirrored.Outlined.DirectionsRun
    WorkoutType.CYCLING -> Icons.AutoMirrored.Outlined.DirectionsBike
    WorkoutType.SWIMMING -> Icons.Outlined.Pool
    WorkoutType.STRENGTH -> Icons.Outlined.FitnessCenter
    WorkoutType.YOGA -> Icons.Outlined.SelfImprovement
    WorkoutType.OTHER -> Icons.Outlined.SportsScore
}

/** "1:05:12" or "45:12" (stopwatch style). */
internal fun Duration.stopwatch(): String {
    val s = seconds.coerceAtLeast(0)
    val h = s / 3600
    val m = (s % 3600) / 60
    val sec = s % 60
    return if (h > 0) "%d:%02d:%02d".format(Locale.ROOT, h, m, sec) else "%d:%02d".format(Locale.ROOT, m, sec)
}

internal fun kilometers(meters: Double, locale: Locale = Locale.getDefault()): String = String.format(locale, "%.2f", meters / 1000.0)

/**
 * Pace for on-foot workouts ("5'42\"" per km), speed for cycling ("24.3" km/h); null without a
 * distance or for workouts where neither is meaningful.
 */
internal data class PaceOrSpeed(val label: String, val value: String, val unit: String)

internal fun Workout.paceOrSpeed(locale: Locale = Locale.getDefault()): PaceOrSpeed? {
    val meters = distanceMeters?.takeIf { it > 0 } ?: return null
    val seconds = duration.seconds.takeIf { it > 0 } ?: return null
    return when (type) {
        WorkoutType.CYCLING -> PaceOrSpeed("Avg. speed", String.format(locale, "%.1f", meters / 1000.0 / (seconds / 3600.0)), "km/h")
        WorkoutType.RUNNING, WorkoutType.WALKING -> {
            val secPerKm = (seconds / (meters / 1000.0)).toLong()
            PaceOrSpeed("Avg. pace", "%d'%02d\"".format(Locale.ROOT, secPerKm / 60, secPerKm % 60), "/km")
        }
        WorkoutType.SWIMMING -> {
            val secPer100 = (seconds / (meters / 100.0)).toLong()
            PaceOrSpeed("Avg. pace", "%d'%02d\"".format(Locale.ROOT, secPer100 / 60, secPer100 % 60), "/100 m")
        }
        else -> null
    }
}
