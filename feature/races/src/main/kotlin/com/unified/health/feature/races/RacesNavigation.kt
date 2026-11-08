package com.unified.health.feature.races

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.unified.health.feature.races.detail.RaceDetailRoute
import kotlinx.serialization.Serializable

/** Full races list, pushed from Home's "Xem tất cả" (D-1105) — not one of the 4 pager tabs. */
@Serializable
data object RacesDestination

/** One race's in-app detail screen (D-1114), pushed from a card tap on either the Home carousel or
 *  [RacesDestination]'s list — [raceId] is `Race.id`, read back by [com.unified.health.feature.races.detail.RaceDetailViewModel]. */
@Serializable
data class RaceDetailDestination(val raceId: String)

fun NavController.navigateToRaces() = navigate(RacesDestination)

fun NavController.navigateToRaceDetail(raceId: String) = navigate(RaceDetailDestination(raceId))

fun NavGraphBuilder.racesScreen(onBack: () -> Unit, onOpenRaceDetail: (String) -> Unit) {
    composable<RacesDestination> { RacesRoute(onBack = onBack, onOpenRaceDetail = onOpenRaceDetail) }
}

fun NavGraphBuilder.raceDetailScreen(onBack: () -> Unit) {
    composable<RaceDetailDestination> { RaceDetailRoute(onBack = onBack) }
}
