package com.unified.health.feature.home

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
import com.unified.health.core.model.WorkoutType

/**
 * Home-local copy of `feature.activity`'s workout icon/label (that module's are `internal`, and
 * features never depend on one another — see `AndroidFeatureConventionPlugin`).
 */
@Composable
internal fun WorkoutType.feedLabel(): String = when (this) {
    WorkoutType.WALKING -> stringResource(R.string.workout_type_walking)
    WorkoutType.RUNNING -> stringResource(R.string.workout_type_running)
    WorkoutType.CYCLING -> stringResource(R.string.workout_type_cycling)
    WorkoutType.SWIMMING -> stringResource(R.string.workout_type_swimming)
    WorkoutType.STRENGTH -> stringResource(R.string.workout_type_strength)
    WorkoutType.YOGA -> stringResource(R.string.workout_type_yoga)
    WorkoutType.OTHER -> stringResource(R.string.workout_type_other)
}

internal fun WorkoutType.feedIcon(): ImageVector = when (this) {
    WorkoutType.WALKING -> Icons.AutoMirrored.Outlined.DirectionsWalk
    WorkoutType.RUNNING -> Icons.AutoMirrored.Outlined.DirectionsRun
    WorkoutType.CYCLING -> Icons.AutoMirrored.Outlined.DirectionsBike
    WorkoutType.SWIMMING -> Icons.Outlined.Pool
    WorkoutType.STRENGTH -> Icons.Outlined.FitnessCenter
    WorkoutType.YOGA -> Icons.Outlined.SelfImprovement
    WorkoutType.OTHER -> Icons.Outlined.SportsScore
}
