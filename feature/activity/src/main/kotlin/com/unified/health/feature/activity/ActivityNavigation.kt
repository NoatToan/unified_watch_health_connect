package com.unified.health.feature.activity

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.unified.health.feature.activity.detail.WorkoutDetailRoute
import kotlinx.serialization.Serializable

/** [workoutId] is `Workout.id`; read back by name in [com.unified.health.feature.activity.detail.WorkoutDetailViewModel]. */
@Serializable
data class WorkoutDetailDestination(val workoutId: String)

fun NavController.navigateToWorkoutDetail(workoutId: String) = navigate(WorkoutDetailDestination(workoutId))

/**
 * Public entry point for [com.unified.health.navigation.MainPagerDestination]'s `HorizontalPager`
 * (D-1052) — see [com.unified.health.feature.home.navigation.HomeTabContent] for why this wrapper
 * exists (`ActivityRoute` itself stays internal).
 */
@Composable
fun ActivityTabContent(onWorkoutClick: (String) -> Unit) {
    ActivityRoute(onWorkoutClick = onWorkoutClick)
}

fun NavGraphBuilder.workoutDetailScreen(onBack: () -> Unit) {
    composable<WorkoutDetailDestination> { WorkoutDetailRoute(onBack = onBack) }
}
