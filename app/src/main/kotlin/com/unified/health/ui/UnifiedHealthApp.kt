package com.unified.health.ui

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection
import androidx.compose.ui.input.nestedscroll.NestedScrollSource
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.geometry.Offset
import androidx.navigation.NavDestination.Companion.hasRoute
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.unified.health.navigation.MainPagerDestination
import com.unified.health.navigation.TopLevelDestination
import com.unified.health.navigation.UnifiedHealthNavHost
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
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

    // D-1134: the pill fades out while ANY scrollable inside the NavHost content is actively
    // scrolling, and fades back in ~400ms after the last scroll event — regardless of which tab (or
    // even a detail screen) is showing, since this connection sits above the whole NavHost rather than
    // inside any one screen's own list (the same NestedScrollConnection-based approach
    // TopAppBarDefaults' own scroll behaviors use, and the same idea D-1083 applied locally to Home's
    // DeviceBanner). onPreScroll fires for every scroll delta a descendant dispatches — both during a
    // drag and during a fling's own per-frame scrolling — so returning Offset.Zero (take nothing,
    // just observe) and restarting the debounce each time correctly treats a fling as "still
    // scrolling" until it actually decelerates to a stop.
    var pillVisible by remember { mutableStateOf(true) }
    val fadeScope = rememberCoroutineScope()
    var pillFadeInJob by remember { mutableStateOf<Job?>(null) }
    val scrollFadeConnection = remember {
        object : NestedScrollConnection {
            override fun onPreScroll(available: Offset, source: NestedScrollSource): Offset {
                pillVisible = false
                pillFadeInJob?.cancel()
                pillFadeInJob = fadeScope.launch {
                    delay(400)
                    pillVisible = true
                }
                return Offset.Zero
            }
        }
    }

    Scaffold(
        contentWindowInsets = WindowInsets(0),
        // D-1120: Scaffold's own background (MaterialTheme.colorScheme.background by default) was
        // showing as a solid strip behind PillBottomNavigation's own transparent margins — the pill
        // never actually looked "floating". Transparent here means only the pill shape itself paints
        // anything in that area.
        containerColor = Color.Transparent,
        bottomBar = {
            if (onMainPager) {
                PillBottomNavigation(pagerState = pagerState, onSelect = switchTab, visible = pillVisible)
            }
        },
    ) { padding ->
        UnifiedHealthNavHost(
            navController = navController,
            startWithOnboarding = startWithOnboarding,
            pagerState = pagerState,
            onSwitchTab = switchTab,
            modifier = Modifier.padding(padding).consumeWindowInsets(padding).nestedScroll(scrollFadeConnection),
        )
    }
}
