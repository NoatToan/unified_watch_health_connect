package com.unified.health.core.designsystem.component

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.unified.health.core.designsystem.R
import com.unified.health.core.designsystem.theme.ChromeRipple

/**
 * D-1194: one shared screen chrome — every `feature` module screen used to hand-roll its own
 * `Scaffold(topBar = { TopAppBar(...) }) { padding -> LazyColumn(Modifier.padding(padding)) }`. That
 * pattern is where the edge-to-edge bug the user found on "Chế độ luyện tập"
 * (`feature/training/TrainingScreen.kt`) came from: with no `bottomBar`, Scaffold's default
 * `contentWindowInsets` folds the bottom navigation-bar inset straight into the `padding` it hands the
 * content lambda, and `Modifier.padding(padding)` applied to the *outer* scrollable container clips
 * the viewport itself to stop above the gesture bar — not just "the last item stops a bit short", the
 * box that owns the scroll gesture is physically the wrong size, so no amount of scrolling ever reaches
 * that strip. Whatever is behind it (Scaffold's own `containerColor`) just sits there, static,
 * regardless of scroll position — the "plain-background strip" the user saw.
 *
 * [AppScreen] fixes this by handing [content] a merged `contentPadding` — `padding`'s own top
 * (topBar height) + horizontal safe-drawing insets + bottom (navigation-bar inset) + [bottomClearance]
 * — instead of letting each screen apply (a subset of) `padding` as an outer `Modifier.padding` before
 * its own scrollable.
 *
 * **Contract for [content]:** pass the given `contentPadding` to the scrollable's own padding —
 * `LazyColumn(contentPadding = ...)` / `LazyVerticalGrid(contentPadding = ...)`, or for a plain
 * `Column` + `Modifier.verticalScroll`, chain it *after* `.verticalScroll(state)`:
 * `Modifier.fillMaxSize().verticalScroll(state).padding(contentPadding)` — padding applied after
 * `verticalScroll` becomes extra scrollable space at the start/end of the content (the scroll range
 * extends into it), not a clip of the viewport. **Never**
 * `Modifier.fillMaxSize().padding(contentPadding).verticalScroll(state)` (padding *before*
 * `verticalScroll`, on the element that sizes the viewport) — that reproduces exactly this bug. A
 * screen with no scrollable at all (a static `Column`, a `Box`, a centered message) may apply
 * `Modifier.padding(contentPadding)` directly either way, since there is no scroll viewport to clip.
 *
 * [bottomClearance] is extra space reserved *on top of* the real navigation-bar inset — the 4 top-level
 * tabs (Home/Activity/Devices/Profile, inside the `HorizontalPager` `app/.../ui/UnifiedHealthApp.kt`
 * hosts) pass `Spacing.bottomNavClearance` here so their last item clears `PillBottomNavigation`'s
 * floating pill (which already pads itself for the navigation-bar inset separately, D-1084); every
 * other, pushed screen leaves it at the default `0.dp` since there is no pill to clear.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppScreen(
    title: String,
    modifier: Modifier = Modifier,
    onBack: (() -> Unit)? = null,
    actions: @Composable RowScope.() -> Unit = {},
    floatingActionButton: @Composable () -> Unit = {},
    snackbarHost: @Composable () -> Unit = {},
    topBarScrollBehavior: TopAppBarScrollBehavior? = null,
    bottomClearance: Dp = 0.dp,
    /**
     * Overrides the default `TopAppBar(title = { Text(title) }, navigationIcon = ..., actions = ...)`
     * entirely, for a screen that needs a non-standard top bar (e.g. `RaceDetailScreen`'s transparent
     * one floating over a hero image). When set, [title]/[onBack]/[actions]/[topBarScrollBehavior] are
     * unused — the override is responsible for its own back button/ripple/scroll behavior.
     */
    topBar: (@Composable () -> Unit)? = null,
    content: @Composable (contentPadding: PaddingValues) -> Unit,
) {
    Scaffold(
        modifier = modifier,
        topBar = topBar ?: {
            TopAppBar(
                title = { Text(title) },
                navigationIcon = {
                    if (onBack != null) {
                        // D-1189/D-1190: this TopAppBar's own back icon is app chrome, not this
                        // screen's own content — restores the normal ripple `UnifiedHealthApp`
                        // otherwise zeroes out by default for every screen's content.
                        ChromeRipple {
                            IconButton(onClick = onBack) {
                                Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = stringResource(R.string.nav_back))
                            }
                        }
                    }
                },
                actions = actions,
                scrollBehavior = topBarScrollBehavior,
            )
        },
        floatingActionButton = floatingActionButton,
        snackbarHost = snackbarHost,
    ) { scaffoldPadding ->
        val direction = LocalLayoutDirection.current
        content(
            PaddingValues(
                start = scaffoldPadding.calculateStartPadding(direction),
                top = scaffoldPadding.calculateTopPadding(),
                end = scaffoldPadding.calculateEndPadding(direction),
                bottom = scaffoldPadding.calculateBottomPadding() + bottomClearance,
            ),
        )
    }
}
