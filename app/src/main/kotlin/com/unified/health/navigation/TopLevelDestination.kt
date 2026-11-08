package com.unified.health.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.DirectionsRun
import androidx.compose.material.icons.automirrored.outlined.DirectionsRun
import androidx.compose.material.icons.filled.Dashboard
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Watch
import androidx.compose.material.icons.outlined.Dashboard
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Watch
import androidx.compose.ui.graphics.vector.ImageVector
import com.unified.health.feature.activity.ActivityDestination
import com.unified.health.feature.devices.navigation.DevicesDestination
import com.unified.health.feature.home.navigation.FeedDestination
import com.unified.health.feature.home.navigation.HomeDestination
import com.unified.health.feature.profile.ProfileDestination
import kotlin.reflect.KClass

/**
 * Destinations shown in the bottom NavigationBar. Mirrors Apple Health's Summary plus a Huawei
 * Health-style flat "Health" feed (every metric on one screen, no category menu), the app's own
 * Activity / Devices / Profile.
 */
enum class TopLevelDestination(
    val label: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val route: Any,
    val routeClass: KClass<*>,
) {
    HOME("Summary", Icons.Filled.Favorite, Icons.Outlined.FavoriteBorder, HomeDestination, HomeDestination::class),
    HEALTH("Health", Icons.Filled.Dashboard, Icons.Outlined.Dashboard, FeedDestination, FeedDestination::class),
    ACTIVITY("Activity", Icons.AutoMirrored.Filled.DirectionsRun, Icons.AutoMirrored.Outlined.DirectionsRun, ActivityDestination, ActivityDestination::class),
    DEVICES("Devices", Icons.Filled.Watch, Icons.Outlined.Watch, DevicesDestination, DevicesDestination::class),
    PROFILE("Profile", Icons.Filled.Person, Icons.Outlined.Person, ProfileDestination, ProfileDestination::class),
}
