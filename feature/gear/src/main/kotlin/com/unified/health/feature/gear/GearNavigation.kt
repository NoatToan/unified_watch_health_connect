package com.unified.health.feature.gear

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.unified.health.feature.gear.detail.GearDetailRoute
import kotlinx.serialization.Serializable

/** "Trang bị tham khảo" catalog, pushed from Profile — mirrors [com.unified.health.feature.races]'s
 *  own `navigateToX(NavController)` + `xScreen(NavGraphBuilder)` pattern. */
@Serializable
data object GearDestination

/**
 * One gear item's detail screen, pushed from a card tap on [GearDestination]'s grid/list — [itemId]
 * is `GearItem.id`, read back by [com.unified.health.feature.gear.detail.GearDetailViewModel].
 * [variantColor] (D-1203) preselects a [com.unified.health.core.model.GearVariant.color] when the
 * list's own color filter was active and the tapped card was already showing that variant's photo
 * (`GearCard`'s own color-filter-aware image swap) — null for a plain tap with no color filter.
 */
@Serializable
data class GearDetailDestination(val itemId: String, val variantColor: String? = null)

fun NavController.navigateToGear() = navigate(GearDestination)

fun NavController.navigateToGearDetail(itemId: String, variantColor: String? = null) =
    navigate(GearDetailDestination(itemId, variantColor))

fun NavGraphBuilder.gearScreen(onBack: () -> Unit, onOpenGearDetail: (String, String?) -> Unit) {
    composable<GearDestination> { GearRoute(onBack = onBack, onOpenGearDetail = onOpenGearDetail) }
}

fun NavGraphBuilder.gearDetailScreen(onBack: () -> Unit) {
    composable<GearDetailDestination> { GearDetailRoute(onBack = onBack) }
}
