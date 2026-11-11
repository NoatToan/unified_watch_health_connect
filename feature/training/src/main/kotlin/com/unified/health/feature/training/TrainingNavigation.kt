package com.unified.health.feature.training

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable

/**
 * Static reference guide ("Chế độ luyện tập") for the 4 milestone running distances — 5K, 10K, Half
 * Marathon and Marathon. Purely informational, read-only content: it does not read the user's own
 * `HealthMetrics`/workout data or any domain/repository state (that adaptive/personalized integration
 * is a deliberate later task) — so, unlike every other feature module, this one has no `@HiltViewModel`
 * at all. Opened from Home's "Chế độ luyện tập" row, mirroring [com.unified.health.feature.races]'s own
 * `navigateToX(NavController)` + `xScreen(NavGraphBuilder)` pattern.
 */
@Serializable
data object TrainingDestination

fun NavController.navigateToTraining() = navigate(TrainingDestination)

fun NavGraphBuilder.trainingScreen(onBack: () -> Unit) {
    composable<TrainingDestination> { TrainingScreen(onBack = onBack) }
}
