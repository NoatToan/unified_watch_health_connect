package com.unified.health.core.designsystem.component

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.DirectionsRun
import androidx.compose.material.icons.automirrored.outlined.DirectionsWalk
import androidx.compose.material.icons.outlined.Air
import androidx.compose.material.icons.outlined.Bedtime
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.LocalFireDepartment
import androidx.compose.material.icons.outlined.MonitorHeart
import androidx.compose.material.icons.outlined.MonitorWeight
import androidx.compose.material.icons.outlined.SelfImprovement
import androidx.compose.material.icons.outlined.Straighten
import androidx.compose.material.icons.outlined.Timer
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.Speed
import androidx.compose.ui.graphics.vector.ImageVector
import com.unified.health.core.model.HealthMetricType
import com.unified.health.core.model.UnitSystem
import com.unified.health.core.model.distanceUnitLabel
import com.unified.health.core.model.weightUnitLabel

fun HealthMetricType.icon(): ImageVector = when (this) {
    HealthMetricType.STEPS -> Icons.AutoMirrored.Outlined.DirectionsWalk
    HealthMetricType.HEART_RATE -> Icons.Outlined.FavoriteBorder
    HealthMetricType.SLEEP -> Icons.Outlined.Bedtime
    HealthMetricType.SPO2 -> Icons.Outlined.Air
    HealthMetricType.STRESS -> Icons.Outlined.SelfImprovement
    HealthMetricType.CALORIES -> Icons.Outlined.LocalFireDepartment
    HealthMetricType.WEIGHT -> Icons.Outlined.MonitorWeight
    HealthMetricType.DISTANCE -> Icons.Outlined.Straighten
    HealthMetricType.EXERCISE_MINUTES -> Icons.AutoMirrored.Outlined.DirectionsRun
    HealthMetricType.RESTING_HEART_RATE -> Icons.Outlined.Favorite
    HealthMetricType.HRV -> Icons.Outlined.MonitorHeart
    HealthMetricType.VO2_MAX -> Icons.Outlined.Speed
}

/** Display name, following Apple Health's wording. */
fun HealthMetricType.label(): String = when (this) {
    HealthMetricType.STEPS -> "Steps"
    HealthMetricType.HEART_RATE -> "Heart rate"
    HealthMetricType.SLEEP -> "Sleep"
    HealthMetricType.SPO2 -> "Blood oxygen"
    HealthMetricType.STRESS -> "Stress"
    HealthMetricType.CALORIES -> "Active energy"
    HealthMetricType.WEIGHT -> "Weight"
    HealthMetricType.DISTANCE -> "Walking + running distance"
    HealthMetricType.EXERCISE_MINUTES -> "Exercise minutes"
    HealthMetricType.RESTING_HEART_RATE -> "Resting heart rate"
    HealthMetricType.HRV -> "Heart rate variability"
    HealthMetricType.VO2_MAX -> "VO2max"
}

/**
 * Unit shown next to a formatted value (see [formatValue]). [unitSystem] (D-1183) only changes
 * WEIGHT ("kg"/"lb") and DISTANCE ("km"/"mi") — every other metric's unit is system-independent.
 */
fun HealthMetricType.unit(unitSystem: UnitSystem = UnitSystem.METRIC): String = when (this) {
    HealthMetricType.STEPS -> "steps"
    HealthMetricType.HEART_RATE, HealthMetricType.RESTING_HEART_RATE -> "bpm"
    HealthMetricType.SLEEP -> ""
    HealthMetricType.SPO2 -> "%"
    HealthMetricType.STRESS -> ""
    HealthMetricType.CALORIES -> "kcal"
    HealthMetricType.WEIGHT -> unitSystem.weightUnitLabel()
    HealthMetricType.DISTANCE -> unitSystem.distanceUnitLabel()
    HealthMetricType.EXERCISE_MINUTES -> "min"
    HealthMetricType.HRV -> "ms"
    HealthMetricType.VO2_MAX -> "mL/kg/min"
}

/** Short explanation shown under a metric's chart. */
fun HealthMetricType.about(): String = when (this) {
    HealthMetricType.STEPS -> "Step count is the number of steps you take throughout the day, counted by your watch."
    HealthMetricType.HEART_RATE -> "Heart rate is the number of times your heart beats per minute. The bars show the lowest and highest reading in each period."
    HealthMetricType.SLEEP -> "Time asleep excludes time awake in bed. Stages are estimated by your watch from movement and heart rate."
    HealthMetricType.SPO2 -> "Blood oxygen is the percentage of oxygen your red blood cells carry, mostly measured while you sleep."
    HealthMetricType.STRESS -> "Stress is a 0–100 score derived from heart rate variability. Lower is more relaxed."
    HealthMetricType.CALORIES -> "Active energy is the energy you burn by moving, on top of your resting energy."
    HealthMetricType.WEIGHT -> "Weight comes from Health Connect or manual entries."
    HealthMetricType.DISTANCE -> "Distance you walked or ran, estimated from your steps and workouts."
    HealthMetricType.EXERCISE_MINUTES -> "Every full minute of movement at the intensity of a brisk walk or more counts towards Exercise."
    HealthMetricType.RESTING_HEART_RATE -> "Resting heart rate is your average heart rate while at rest, estimated once a day."
    HealthMetricType.HRV -> "Heart rate variability is the variation in time between heartbeats, measured overnight."
    HealthMetricType.VO2_MAX -> "VO2max estimates the maximum oxygen your body can use during exercise, a common marker of cardio fitness."
}
