package com.unified.health.ui

import androidx.activity.compose.BackHandler
import androidx.activity.compose.LocalActivity
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.LocalRippleConfiguration
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection
import androidx.compose.ui.input.nestedscroll.NestedScrollSource
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.geometry.Offset
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.navigation.NavDestination.Companion.hasRoute
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.unified.health.core.designsystem.theme.NoRippleConfiguration
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
    // Bug fix (D-1216, on-device review 2026-11-12): `currentBackStackEntryAsState()` reports `null`
    // for the first frame(s) after this composable enters composition — `NavHost`'s own back stack
    // entry only becomes "current" once it reaches the RESUMED lifecycle state, which lands a frame or
    // two *after* `UnifiedHealthApp`'s own first composition, not within it. Falling through to `false`
    // during that gap (the old `== true` below) made `onMainPager` wrongly report "not on the main
    // pager" for a brief but real window right as the app launches straight to the main pager
    // (`startWithOnboarding == false`, the common case) — which fed into `pillNavVisible` (below) and
    // hid/disabled the whole pill bottom nav for that same window. A tap landing in it (a user tapping
    // a tab right as Home first appears, exactly the repro in the bug report) silently did nothing:
    // `PillBottomNavigation`'s `visible = false` either skips composing the tappable `Surface` entirely
    // (D-1195's `if (!visible && alpha <= 0f) return`) or disables every item's `selectable` — either
    // way `onSelect` never fires, with no visual sign anything was wrong (by the time anyone inspects
    // the tree, e.g. via `uiautomator`, the gap has long since closed and everything reports normally
    // tappable). Same root cause also meant `BackHandler`/`EdgeGestureExclusion` below briefly had the
    // wrong `enabled` value on a cold launch, just less observable than a dead tap. Fix: resolve the
    // *known* destination (`startWithOnboarding`, already captured above) while the real one is still
    // resolving, instead of defaulting to "not on the main pager" — `currentDestination` is only ever
    // null during this startup gap (never again once `NavHost` has a running graph), so this default is
    // exact, not a guess.
    val onMainPager = currentDestination?.hasRoute(MainPagerDestination::class) ?: !startWithOnboarding

    // D-1179: at the root of the back stack (one of the 4 top-level tabs, nothing left to pop) the
    // system back press must minimize the app rather than fall through to Android's default of
    // finishing the Activity — the app keeps a BLE connection + a foreground sync service running,
    // and killing the process is more disruptive than necessary. Only enabled on the main pager;
    // detail screens pushed on top (MetricDetailScreen, DeviceDetailScreen, ...) have onMainPager ==
    // false here, so this handler is disabled there and back falls through to NavHost's own pop, same
    // as before this change.
    val activity = LocalActivity.current
    BackHandler(enabled = onMainPager) {
        activity?.moveTaskToBack(true)
    }

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

    // D-1190: `pillVisible` already defaults to true, but it must also come back to true every time
    // the main pager is (re)reached, not just on the very first composition — e.g. right after
    // onboarding finishes (NavHost's transition can carry over a stray scroll-driven hide from the
    // screen that just left composition), or returning from a detail screen pushed on top (Metric
    // detail, Device detail, ...), which may have left `pillVisible` false if the user had scrolled
    // down on the main pager before navigating away from it.
    LaunchedEffect(onMainPager) {
        if (onMainPager) pillVisible = true
    }

    // D-1190: also reset to visible when the app returns to the foreground (Home/recents, then back)
    // — otherwise a pill hidden by scrolling down before backgrounding would stay hidden on resume,
    // with no scroll-up gesture having happened for `scrollFadeConnection` below to react to.
    val lifecycleOwner = LocalLifecycleOwner.current
    DisposableEffect(lifecycleOwner) {
        val observer = LifecycleEventObserver { _, event ->
            if (event == Lifecycle.Event.ON_RESUME) pillVisible = true
        }
        lifecycleOwner.lifecycle.addObserver(observer)
        onDispose { lifecycleOwner.lifecycle.removeObserver(observer) }
    }

    // Bug fix (on-device review, 2026-11-12, D-1205): `onMainPager` is a plain `val`, recomputed on
    // every recomposition of this function — reading it directly from inside `remember`'s lambda
    // below (captured once, since that `remember` has no keys) would freeze it at whatever it was on
    // the very first composition. `rememberUpdatedState` keeps `onPreScroll` seeing the *current*
    // value every time it runs, however old the enclosing `NestedScrollConnection` object is.
    val latestOnMainPager by rememberUpdatedState(onMainPager)
    val scrollFadeConnection = remember {
        object : NestedScrollConnection {
            override fun onPreScroll(available: Offset, source: NestedScrollSource): Offset {
                // Bug fix (on-device review, 2026-11-12, D-1205): this connection sits on the whole
                // `NavHost` (below), so it used to keep reacting to scrolls even while a detail screen
                // (metric/device/workout detail, ...) was on top and the pill wasn't shown at all —
                // scrolling there could leave `pillVisible = false` as a stale leftover. Returning from
                // such a screen flips `onMainPager` back to true in the same recomposition that
                // `pillVisible` is still `false` from (the `LaunchedEffect` below that resets it only
                // runs in the *next* effect phase), so the pill would come back disabled
                // (`enabled = visible` in `PillBottomNavigation`/D-1195) for at least one frame right
                // when the user's tap was most likely to land. Gating this on `onMainPager` means a
                // detail screen's own scrolling never touches `pillVisible` in the first place, so
                // there is nothing stale left for the reset below to race against.
                pillVisible = pillVisibilityForScroll(
                    onMainPager = latestOnMainPager,
                    availableX = available.x,
                    availableY = available.y,
                    current = pillVisible,
                )
                return Offset.Zero
            }
        }
    }

    Box(modifier = Modifier.fillMaxSize()) {
        // D-1189: no ripple by default for a screen's own content (cards, list rows, buttons) —
        // `PillBottomNavigation` below sits outside this provider entirely and keeps normal ripple
        // (it already overrides `indication = null` on its own tabs regardless, D-1091, so this
        // provider would have been a no-op there either way). See `ChromeRipple` (core:designsystem)
        // for restoring it around a `TopAppBar`'s own navigationIcon/actions, since each screen's
        // TopAppBar is defined inside that screen's own composable (there is no separate shared
        // chrome layer to exempt it at this boundary).
        CompositionLocalProvider(LocalRippleConfiguration provides NoRippleConfiguration) {
            UnifiedHealthNavHost(
                navController = navController,
                startWithOnboarding = startWithOnboarding,
                pagerState = pagerState,
                onSwitchTab = switchTab,
                modifier = Modifier.fillMaxSize().nestedScroll(scrollFadeConnection),
            )
        }
        // Bug fix (on-device review, 2026-11-12, D-1205): used to be `if (onMainPager) { ... }`,
        // conditionally composing/disposing `PillBottomNavigation` itself on every trip into/out of a
        // detail screen. That threw away its own `animateFloatAsState` `Animatable` (line-for-line the
        // one backing D-1195's fade) each time, so coming straight back from a detail screen always
        // remounted the pill *from scratch* at whatever `visible` happened to be that first frame
        // (see the connection's own comment above for why that could still be `false` momentarily) —
        // a freshly (re)created `Animatable` has no previous value to animate from, so it *snapped* to
        // alpha 0 immediately rather than animating, which is exactly the condition D-1195's own
        // `if (!visible && alpha <= 0f) return` treats as "fully hidden, don't even compose the
        // tappable Surface or its items' `MutableInteractionSource`s". `PillBottomNavigation` now stays
        // composed for the lifetime of the app; `visible` folds in `onMainPager` directly, and D-1195's
        // existing early-return is the only mechanism that ever hides it, with its `Animatable`'s state
        // continuous across every detail-screen round trip instead of being reset by one.
        PillBottomNavigation(
            pagerState = pagerState,
            onSelect = switchTab,
            visible = pillNavVisible(onMainPager = onMainPager, pillVisible = pillVisible),
            modifier = Modifier.align(Alignment.BottomCenter),
        )
    }
}

/**
 * Pure decision behind [UnifiedHealthApp]'s scroll-driven pill fade (D-1134/D-1149): the new
 * `pillVisible` value for one [NestedScrollConnection.onPreScroll] dispatch, or [current] unchanged
 * when the dispatch should not affect it at all — not on the main pager ([onMainPager] false, bug fix
 * D-1205, see call site), or not a vertical-dominant delta (the pager's own horizontal drag, D-1149).
 * Negative [availableY] = content scrolling up (user scrolling down the list) = hide; positive = show
 * right away.
 */
internal fun pillVisibilityForScroll(
    onMainPager: Boolean,
    availableX: Float,
    availableY: Float,
    current: Boolean,
): Boolean {
    if (!onMainPager) return current
    if (abs(availableY) <= abs(availableX)) return current
    return when {
        availableY < 0f -> false
        availableY > 0f -> true
        else -> current
    }
}

/**
 * Pure decision behind whether [PillBottomNavigation] is shown/tappable at all (bug fix D-1205): it is
 * now always composed (see call site), so this is the only thing gating it on being on the main pager
 * in the first place, combined with the scroll-driven fade ([pillVisibilityForScroll]).
 */
internal fun pillNavVisible(onMainPager: Boolean, pillVisible: Boolean): Boolean = onMainPager && pillVisible
