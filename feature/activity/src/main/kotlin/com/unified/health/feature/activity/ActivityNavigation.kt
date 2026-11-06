package com.unified.health.feature.activity

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.unified.health.feature.activity.detail.WorkoutDetailRoute
import kotlinx.serialization.Serializable

@Serializable
data object ActivityDestination

/** [workoutId] is `Workout.id`; read back by name in [com.unified.health.feature.activity.detail.WorkoutDetailViewModel]. */
@Serializable
data class WorkoutDetailDestination(val workoutId: String)

fun NavController.navigateToActivity(navOptions: NavOptions? = null) = navigate(ActivityDestination, navOptions)

fun NavController.navigateToWorkoutDetail(workoutId: String) = navigate(WorkoutDetailDestination(workoutId))

fun NavGraphBuilder.activityScreen(onWorkoutClick: (String) -> Unit) {
    composable<ActivityDestination> { ActivityRoute(onWorkoutClick = onWorkoutClick) }
}

fun NavGraphBuilder.workoutDetailScreen(onBack: () -> Unit) {
    composable<WorkoutDetailDestination> { WorkoutDetailRoute(onBack = onBack) }
}
