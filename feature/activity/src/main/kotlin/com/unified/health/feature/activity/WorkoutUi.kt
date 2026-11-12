package com.unified.health.feature.activity

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.DirectionsBike
import androidx.compose.material.icons.automirrored.outlined.DirectionsRun
import androidx.compose.material.icons.automirrored.outlined.DirectionsWalk
import androidx.compose.material.icons.outlined.FitnessCenter
import androidx.compose.material.icons.outlined.Pool
import androidx.compose.material.icons.outlined.SelfImprovement
import androidx.compose.material.icons.outlined.SportsScore
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import com.unified.health.core.model.UnitSystem
import com.unified.health.core.model.Workout
import com.unified.health.core.model.WorkoutLap
import com.unified.health.core.model.WorkoutType
import com.unified.health.core.model.distanceUnitLabel
import com.unified.health.core.model.metersPerDistanceUnit
import com.unified.health.core.model.metersToDisplayDistance
import java.time.Duration
import java.util.Locale

@Composable
internal fun WorkoutType.label(): String = when (this) {
    WorkoutType.WALKING -> stringResource(R.string.workout_type_walking)
    WorkoutType.RUNNING -> stringResource(R.string.workout_type_running)
    WorkoutType.CYCLING -> stringResource(R.string.workout_type_cycling)
    WorkoutType.SWIMMING -> stringResource(R.string.workout_type_swimming)
    WorkoutType.STRENGTH -> stringResource(R.string.workout_type_strength)
    WorkoutType.YOGA -> stringResource(R.string.workout_type_yoga)
    WorkoutType.OTHER -> stringResource(R.string.workout_type_other)
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

/** Distance to 2 decimals, in km (Metric) or mi (Imperial per D-1183/docs/DECISIONS.md); storage stays meters. */
internal fun kilometers(meters: Double, locale: Locale = Locale.getDefault(), unitSystem: UnitSystem = UnitSystem.METRIC): String =
    String.format(locale, "%.2f", meters.metersToDisplayDistance(unitSystem))

/**
 * Pace for on-foot workouts ("5'42\"" per km/mi), speed for cycling ("24.3" km/h / mph); null
 * without a distance or for workouts where neither is meaningful. Swimming's pool length ("/100 m")
 * is unaffected by [unitSystem] — pools are measured in meters worldwide, not miles.
 */
internal data class PaceOrSpeed(val label: String, val value: String, val unit: String)

internal fun Workout.paceOrSpeed(locale: Locale = Locale.getDefault(), unitSystem: UnitSystem = UnitSystem.METRIC): PaceOrSpeed? {
    val meters = distanceMeters?.takeIf { it > 0 } ?: return null
    val seconds = duration.seconds.takeIf { it > 0 } ?: return null
    return when (type) {
        WorkoutType.CYCLING -> {
            val speedUnit = if (unitSystem == UnitSystem.IMPERIAL) "mph" else "km/h"
            val speed = (meters * 3600.0 / seconds).metersToDisplayDistance(unitSystem)
            PaceOrSpeed("Avg. speed", String.format(locale, "%.1f", speed), speedUnit)
        }
        WorkoutType.RUNNING, WorkoutType.WALKING -> {
            val secPerUnit = (seconds / meters.metersToDisplayDistance(unitSystem)).toLong()
            PaceOrSpeed("Avg. pace", "%d'%02d\"".format(Locale.ROOT, secPerUnit / 60, secPerUnit % 60), "/${unitSystem.distanceUnitLabel()}")
        }
        WorkoutType.SWIMMING -> {
            val secPer100 = (seconds / (meters / 100.0)).toLong()
            PaceOrSpeed("Avg. pace", "%d'%02d\"".format(Locale.ROOT, secPer100 / 60, secPer100 % 60), "/100 m")
        }
        else -> null
    }
}

/** Same idea as [Workout.paceOrSpeed] but for a split's own average speed (D-1093), with the unit baked in. */
internal fun WorkoutLap.paceOrSpeedLabel(type: WorkoutType, locale: Locale = Locale.getDefault(), unitSystem: UnitSystem = UnitSystem.METRIC): String? {
    val speed = avgSpeedMps?.takeIf { it > 0 } ?: return null
    return when (type) {
        WorkoutType.CYCLING -> {
            val speedUnit = if (unitSystem == UnitSystem.IMPERIAL) "mph" else "km/h"
            String.format(locale, "%.1f $speedUnit", (speed * 3_600.0).metersToDisplayDistance(unitSystem))
        }
        WorkoutType.RUNNING, WorkoutType.WALKING -> {
            val secPerUnit = (unitSystem.metersPerDistanceUnit() / speed).toLong()
            "%d'%02d\"/${unitSystem.distanceUnitLabel()}".format(Locale.ROOT, secPerUnit / 60, secPerUnit % 60)
        }
        WorkoutType.SWIMMING -> {
            val secPer100 = (100.0 / speed).toLong()
            "%d'%02d\"/100m".format(Locale.ROOT, secPer100 / 60, secPer100 % 60)
        }
        else -> null
    }
}
