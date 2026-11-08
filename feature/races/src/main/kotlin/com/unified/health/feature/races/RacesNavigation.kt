package com.unified.health.feature.races

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable

/** Full races list, pushed from Home's "Xem tất cả" (D-1105) — not one of the 4 pager tabs. */
@Serializable
data object RacesDestination

fun NavController.navigateToRaces() = navigate(RacesDestination)

fun NavGraphBuilder.racesScreen(onBack: () -> Unit) {
    composable<RacesDestination> { RacesRoute(onBack = onBack) }
}
