package com.unified.health.core.designsystem.component

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Air
import androidx.compose.material.icons.outlined.Bedtime
import androidx.compose.material.icons.automirrored.outlined.DirectionsWalk
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.LocalFireDepartment
import androidx.compose.material.icons.outlined.MonitorWeight
import androidx.compose.material.icons.outlined.SelfImprovement
import androidx.compose.ui.graphics.vector.ImageVector
import com.unified.health.core.model.HealthMetricType

fun HealthMetricType.icon(): ImageVector = when (this) {
    HealthMetricType.STEPS -> Icons.AutoMirrored.Outlined.DirectionsWalk
    HealthMetricType.HEART_RATE -> Icons.Outlined.FavoriteBorder
    HealthMetricType.SLEEP -> Icons.Outlined.Bedtime
    HealthMetricType.SPO2 -> Icons.Outlined.Air
    HealthMetricType.STRESS -> Icons.Outlined.SelfImprovement
    HealthMetricType.CALORIES -> Icons.Outlined.LocalFireDepartment
    HealthMetricType.WEIGHT -> Icons.Outlined.MonitorWeight
}

fun HealthMetricType.label(): String = when (this) {
    HealthMetricType.STEPS -> "Steps"
    HealthMetricType.HEART_RATE -> "Heart rate"
    HealthMetricType.SLEEP -> "Sleep"
    HealthMetricType.SPO2 -> "Blood oxygen"
    HealthMetricType.STRESS -> "Stress"
    HealthMetricType.CALORIES -> "Calories"
    HealthMetricType.WEIGHT -> "Weight"
}
