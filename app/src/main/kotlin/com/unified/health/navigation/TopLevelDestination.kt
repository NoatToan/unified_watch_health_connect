package com.unified.health.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.DirectionsRun
import androidx.compose.material.icons.automirrored.outlined.DirectionsRun
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Watch
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Watch
import androidx.compose.ui.graphics.vector.ImageVector

/**
 * The 4 pages of [MainPagerDestination] (D-1052), in swipe/pill-nav order: Apple Health's Summary
 * (now also carrying the old Huawei Health-style flat feed, merged in per D-1010), the app's own
 * Activity / Devices / Profile. [entries]' index is the pager page index (`ordinal`), so this order
 * is load-bearing — reordering it reorders the pages.
 */
enum class TopLevelDestination(
    val label: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
) {
    HOME("Summary", Icons.Filled.Favorite, Icons.Outlined.FavoriteBorder),
    ACTIVITY("Activity", Icons.AutoMirrored.Filled.DirectionsRun, Icons.AutoMirrored.Outlined.DirectionsRun),
    DEVICES("Devices", Icons.Filled.Watch, Icons.Outlined.Watch),
    PROFILE("Profile", Icons.Filled.Person, Icons.Outlined.Person),
}
