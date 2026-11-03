package com.unified.health.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bedtime
import androidx.compose.material.icons.automirrored.filled.DirectionsRun
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Watch
import androidx.compose.material.icons.outlined.Bedtime
import androidx.compose.material.icons.automirrored.outlined.DirectionsRun
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Watch
import androidx.compose.ui.graphics.vector.ImageVector
import com.unified.health.feature.activity.ActivityDestination
import com.unified.health.feature.devices.navigation.DevicesDestination
import com.unified.health.feature.home.navigation.HomeDestination
import com.unified.health.feature.profile.ProfileDestination
import com.unified.health.feature.sleep.SleepDestination
import kotlin.reflect.KClass

/** Destinations shown in the bottom NavigationBar. */
enum class TopLevelDestination(
    val label: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val route: Any,
    val routeClass: KClass<*>,
) {
    HOME("Home", Icons.Filled.Home, Icons.Outlined.Home, HomeDestination, HomeDestination::class),
    ACTIVITY("Activity", Icons.AutoMirrored.Filled.DirectionsRun, Icons.AutoMirrored.Outlined.DirectionsRun, ActivityDestination, ActivityDestination::class),
    SLEEP("Sleep", Icons.Filled.Bedtime, Icons.Outlined.Bedtime, SleepDestination, SleepDestination::class),
    DEVICES("Devices", Icons.Filled.Watch, Icons.Outlined.Watch, DevicesDestination, DevicesDestination::class),
    PROFILE("Profile", Icons.Filled.Person, Icons.Outlined.Person, ProfileDestination, ProfileDestination::class),
}
