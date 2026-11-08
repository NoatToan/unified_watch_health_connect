package com.unified.health.ui

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.navigation.NavDestination.Companion.hasRoute
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.unified.health.navigation.MainPagerDestination
import com.unified.health.navigation.TopLevelDestination
import com.unified.health.navigation.UnifiedHealthNavHost
import kotlinx.coroutines.launch

/**
 * Root scaffold: the pill bottom nav (D-1051) for the 4 top-level tabs, hidden on onboarding and on
 * any detail screen pushed on top of them. The 4 tabs themselves live inside one [HorizontalPager]
 * (D-1052, built in [com.unified.health.navigation.MainPagerDestination]); [pagerState] is hoisted
 * here, above the NavHost, so it survives pushing/popping detail screens on top — swiping back from
 * `MetricDetailScreen` to Home always lands back on whichever tab was active before, with no extra
 * bookkeeping needed. Each screen owns its own TopAppBar.
 */
@Composable
fun UnifiedHealthApp(
    onboardingCompleted: Boolean,
    navController: NavHostController = rememberNavController(),
) {
    // Captured once: the start destination must not change when the preference flips.
    val startWithOnboarding = rememberSaveable { !onboardingCompleted }
    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = backStackEntry?.destination
    val onMainPager = currentDestination?.hasRoute(MainPagerDestination::class) == true

    val pagerState = rememberPagerState { TopLevelDestination.entries.size }
    val coroutineScope = rememberCoroutineScope()
    val switchTab: (TopLevelDestination) -> Unit = remember(pagerState, coroutineScope) {
        { destination -> coroutineScope.launch { pagerState.animateScrollToPage(destination.ordinal) } }
    }

    // D-1053: the pager's own horizontal drag must win over the system's edge-swipe-back gesture on
    // the 4 top-level tabs, but a detail screen pushed on top (MetricDetailScreen, DeviceDetailScreen,
    // WorkoutDetailDestination...) keeps normal edge-swipe-back — see EdgeGestureExclusion's doc.
    EdgeGestureExclusion(enabled = onMainPager)

    Scaffold(
        contentWindowInsets = WindowInsets(0),
        bottomBar = {
            if (onMainPager) {
                PillBottomNavigation(pagerState = pagerState, onSelect = switchTab)
            }
        },
    ) { padding ->
        UnifiedHealthNavHost(
            navController = navController,
            startWithOnboarding = startWithOnboarding,
            pagerState = pagerState,
            onSwitchTab = switchTab,
            modifier = Modifier.padding(padding).consumeWindowInsets(padding),
        )
    }
}
