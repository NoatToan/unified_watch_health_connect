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
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import com.unified.health.core.designsystem.R
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
@Composable
fun HealthMetricType.label(): String = when (this) {
    HealthMetricType.STEPS -> stringResource(R.string.metric_label_steps)
    HealthMetricType.HEART_RATE -> stringResource(R.string.metric_label_heart_rate)
    HealthMetricType.SLEEP -> stringResource(R.string.metric_label_sleep)
    HealthMetricType.SPO2 -> stringResource(R.string.metric_label_spo2)
    HealthMetricType.STRESS -> stringResource(R.string.metric_label_stress)
    HealthMetricType.CALORIES -> stringResource(R.string.metric_label_calories)
    HealthMetricType.WEIGHT -> stringResource(R.string.metric_label_weight)
    HealthMetricType.DISTANCE -> stringResource(R.string.metric_label_distance)
    HealthMetricType.EXERCISE_MINUTES -> stringResource(R.string.metric_label_exercise_minutes)
    HealthMetricType.RESTING_HEART_RATE -> stringResource(R.string.metric_label_resting_heart_rate)
    HealthMetricType.HRV -> stringResource(R.string.metric_label_hrv)
    HealthMetricType.VO2_MAX -> stringResource(R.string.metric_label_vo2_max)
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
@Composable
fun HealthMetricType.about(): String = when (this) {
    HealthMetricType.STEPS -> stringResource(R.string.metric_about_steps)
    HealthMetricType.HEART_RATE -> stringResource(R.string.metric_about_heart_rate)
    HealthMetricType.SLEEP -> stringResource(R.string.metric_about_sleep)
    HealthMetricType.SPO2 -> stringResource(R.string.metric_about_spo2)
    HealthMetricType.STRESS -> stringResource(R.string.metric_about_stress)
    HealthMetricType.CALORIES -> stringResource(R.string.metric_about_calories)
    HealthMetricType.WEIGHT -> stringResource(R.string.metric_about_weight)
    HealthMetricType.DISTANCE -> stringResource(R.string.metric_about_distance)
    HealthMetricType.EXERCISE_MINUTES -> stringResource(R.string.metric_about_exercise_minutes)
    HealthMetricType.RESTING_HEART_RATE -> stringResource(R.string.metric_about_resting_heart_rate)
    HealthMetricType.HRV -> stringResource(R.string.metric_about_hrv)
    HealthMetricType.VO2_MAX -> stringResource(R.string.metric_about_vo2_max)
}
