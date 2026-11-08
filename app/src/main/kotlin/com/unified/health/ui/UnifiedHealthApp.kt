package com.unified.health.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
import kotlin.math.abs
import kotlinx.coroutines.launch

/**
 * Root layout: the pill bottom nav (D-1051) for the 4 top-level tabs, hidden on onboarding and on
 * any detail screen pushed on top of them. The 4 tabs themselves live inside one [HorizontalPager]
 * (D-1052, built in [com.unified.health.navigation.MainPagerDestination]); [pagerState] is hoisted
 * here, above the NavHost, so it survives pushing/popping detail screens on top — swiping back from
 * `MetricDetailScreen` to Home always lands back on whichever tab was active before, with no extra
 * bookkeeping needed. Each screen owns its own TopAppBar.
 *
 * D-1144: this used to be a `Scaffold(bottomBar = { PillBottomNavigation(...) })`, which gave the
 * `NavHost` content `Modifier.padding(padding)` sized to the bottom bar's own measured height — i.e.
 * content stopped *before* the pill's area entirely, it never actually drew underneath it. That made
 * the pill's own transparency (D-1120) and translucent fill (D-1134/1141) show nothing but plain app
 * background behind it instead of scrolled content, so it never looked like a pill "floating over
 * content" — it just looked like a bar with no visible backdrop. Fixed by dropping `Scaffold` for a
 * plain `Box`: the `NavHost` now fills the whole screen genuinely behind the pill's area, and
 * `PillBottomNavigation` is placed on top via `Modifier.align(Alignment.BottomCenter)` in the same
 * `Box` — a true overlay, in the same draw stack as the content for the first time. Each top-level
 * tab's own scrollable content adds its own fixed bottom clearance (`Spacing.bottomNavClearance`,
 * `core/designsystem`) so its last item doesn't permanently sit behind the pill — see each screen.
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

    // D-1134/D-1160: the pill fades out/in with a typical collapsing-header pattern, driven by the
    // *direction* of vertical scroll inside a tab's own content — scrolling down (content moving up)
    // hides it, scrolling up (content moving down) shows it again immediately, no need to wait for
    // scrolling to stop. This connection sits above the whole NavHost rather than inside any one
    // screen's own list (the same NestedScrollConnection-based approach TopAppBarDefaults' own
    // enterAlways scroll behavior uses — same sign convention for [available].y below — and the same
    // idea D-1083 applied locally to Home's DeviceBanner — since removed, D-1147).
    //
    // D-1149: that same ancestor connection also receives the HorizontalPager's own horizontal drag
    // (D-1052, swiping Home/Activity/Devices/Profile) — nested scroll bubbles up regardless of axis,
    // so without filtering, swiping tabs toggled the pill exactly while the user was actively using it
    // to navigate, which is the opposite of D-1134/1141's intent (reclaim space while *reading*, not
    // while navigating). Every scrollable here is axis-locked (the pager is horizontal-only; every
    // tab's own list/column is vertical-only), so each dispatch's [available] offset is effectively
    // single-axis — a vertical-dominant delta reliably means "tab content scrolled", a
    // horizontal-dominant one means "pager dragged" (or a tab's own horizontal carousel, e.g. Home's
    // RacesCarousel — also left alone here, since it isn't "reading a list" either); only the former
    // is allowed to touch pillVisible at all.
    var pillVisible by remember { mutableStateOf(true) }
    val scrollFadeConnection = remember {
        object : NestedScrollConnection {
            override fun onPreScroll(available: Offset, source: NestedScrollSource): Offset {
                if (abs(available.y) <= abs(available.x)) return Offset.Zero
                // Negative y = content scrolling up (user scrolling down the list) = hide; positive y
                // = content scrolling down (user scrolling back up) = show right away. A ~0 delta
                // (shouldn't really happen once the axis check above passes) is simply ignored.
                when {
                    available.y < 0f -> pillVisible = false
                    available.y > 0f -> pillVisible = true
                }
                return Offset.Zero
            }
        }
    }

    Box(modifier = Modifier.fillMaxSize()) {
        UnifiedHealthNavHost(
            navController = navController,
            startWithOnboarding = startWithOnboarding,
            pagerState = pagerState,
            onSwitchTab = switchTab,
            modifier = Modifier.fillMaxSize().nestedScroll(scrollFadeConnection),
        )
        if (onMainPager) {
            PillBottomNavigation(
                pagerState = pagerState,
                onSelect = switchTab,
                visible = pillVisible,
                modifier = Modifier.align(Alignment.BottomCenter),
            )
        }
    }
}
