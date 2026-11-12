package com.unified.health.feature.training

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kotlinx.serialization.Serializable

/**
 * Static reference guide ("Chế độ luyện tập") for the 4 milestone running distances — 5K, 10K, Half
 * Marathon and Marathon — plus a second "Dáng chạy đúng" (proper running form) reference screen
 * reached from it. Purely informational, read-only content: neither screen reads the user's own
 * `HealthMetrics`/workout data or any domain/repository state (that adaptive/personalized
 * integration is a deliberate later task) — so, unlike every other feature module, this one has no
 * `@HiltViewModel` at all. Opened from Home's "Chế độ luyện tập" row, mirroring
 * [com.unified.health.feature.races]'s own `navigateToX(NavController)` + `xScreen(NavGraphBuilder)`
 * pattern — but [TrainingDestination] is the *only* destination this module exposes to the app's own
 * `NavHost`: [RunningFormDestination] is deliberately private and lives on a second, nested
 * `NavHost` scoped to [trainingScreen]'s own composable instead of a sibling top-level entry (the
 * pattern `feature/gear`'s catalog+detail pair uses) — adding a second top-level destination would
 * mean a second registration line in `app`'s `UnifiedHealthNavHost.kt`, which this task is
 * deliberately scoped to avoid touching (a parallel task is editing `app`/`feature/home` the same
 * day). The nested `NavHost` still gets a real back stack/predictive-back animation between the two
 * training screens, just without `app` ever knowing a second screen exists.
 */
@Serializable
data object TrainingDestination

/** Private: only reachable from inside [trainingScreen]'s own nested `NavHost`, see class doc above. */
@Serializable
private data object TrainingHomeDestination

/** Private: only reachable from inside [trainingScreen]'s own nested `NavHost`, see class doc above. */
@Serializable
private data object RunningFormDestination

/** Private, same rationale as [RunningFormDestination] above — D-1190's full week-by-week schedule
 *  + check-in screen for whichever plan is active, reached from [TrainingScreen]'s own banner. */
@Serializable
private data object TrainingCalendarDestination

fun NavController.navigateToTraining() = navigate(TrainingDestination)

fun NavGraphBuilder.trainingScreen(onBack: () -> Unit) {
    composable<TrainingDestination> {
        val innerNavController = rememberNavController()
        NavHost(navController = innerNavController, startDestination = TrainingHomeDestination) {
            composable<TrainingHomeDestination> {
                TrainingRoute(
                    onBack = onBack,
                    onOpenRunningForm = { innerNavController.navigate(RunningFormDestination) },
                    onOpenCalendar = { innerNavController.navigate(TrainingCalendarDestination) },
                )
            }
            composable<RunningFormDestination> {
                RunningFormScreen(onBack = innerNavController::popBackStack)
            }
            composable<TrainingCalendarDestination> {
                TrainingCalendarRoute(onBack = innerNavController::popBackStack)
            }
        }
    }
}
