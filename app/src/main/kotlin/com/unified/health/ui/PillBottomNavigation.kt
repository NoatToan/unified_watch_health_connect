package com.unified.health.ui

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.unified.health.core.designsystem.theme.Spacing
import com.unified.health.navigation.TopLevelDestination
import kotlin.math.roundToInt

/**
 * Floating pill-shaped bottom nav (D-1051), reference-screenshot style. The selected tab used to be
 * marked by a smaller pill sliding behind it (driven directly by [pagerState]'s own continuous
 * `currentPage + currentPageOffsetFraction`, see D-1077 in docs/DECISIONS.md) — **D-1159 removed that
 * sliding container entirely**; selection is shown purely via [PillNavItem]'s own icon/text color
 * (`primary` when selected) plus a bold label, no background needed. [pagerState] is still read
 * directly (not mirrored into a second `animateDpAsState`/similar) purely to compute which tab counts
 * as selected while a swipe is mid-drag, for the same reason D-1077 gave for the old indicator: it
 * already animates smoothly on a tap and updates 1:1 with a drag, so duplicating it would only add lag.
 *
 * D-1084: unlike Material3's own `NavigationBar` (which pads itself against the system navigation
 * bar automatically), this hand-rolled `Surface` needs that inset applied explicitly, or the pill
 * sits under/behind the system nav bar in both gesture-nav and 3-button modes.
 *
 * D-1134: [visible] fades the whole pill out/in (e.g. while the content behind it is scrolling,
 * driven from [com.unified.health.ui.UnifiedHealthApp]) and the surface uses a translucent
 * "liquid glass"-style color + a light edge border instead of the old opaque
 * `surfaceContainerHigh`. **No real backdrop blur of the scrolling content is applied here** — D-1144
 * moved this `Surface` out of `Scaffold.bottomBar` into a `Box` overlay sitting on top of the
 * `NavHost` (the prerequisite D-1141 flagged as missing), so a real blur-behind-content effect is now
 * architecturally possible, but implementing it (an explicit shared `GraphicsLayer` the content draws
 * into and this pill blur-samples from, via `androidx.compose.ui.graphics.layer.GraphicsLayer`) is
 * still its own chunk of plumbing/testing — deferred again rather than rushed in the same pass as the
 * `Box` restructure; see [GLASS_ALPHA] for the previous attempt's full reasoning (still accurate
 * about the *mechanism* needed — only the "sibling, not overlay" part of it is now out of date).
 */
@Composable
fun PillBottomNavigation(
    pagerState: PagerState,
    onSelect: (TopLevelDestination) -> Unit,
    modifier: Modifier = Modifier,
    visible: Boolean = true,
) {
    val destinations = TopLevelDestination.entries
    val alpha by animateFloatAsState(if (visible) 1f else 0f, animationSpec = tween(220), label = "pillVisibility")
    Surface(
        // A fixed height (rather than wrap-content) is required: the nav item Row below uses
        // fillMaxHeight(), which needs a bounded constraint to resolve against.
        modifier = modifier
            .windowInsetsPadding(WindowInsets.navigationBars.only(WindowInsetsSides.Horizontal + WindowInsetsSides.Bottom))
            // D-1154: vertical margin trimmed from Spacing.md (12dp) to Spacing.xs (4dp) — reclaims
            // 16dp of screen height overall (8dp off each side) without touching NAV_HEIGHT/any
            // internal spacing, so the icon+label content inside each PillNavItem keeps exactly the
            // same room it had before (no new clipping risk to verify without a device on hand). The
            // system nav bar clearance itself is unaffected — windowInsetsPadding above already
            // guarantees that regardless of this margin (D-1084).
            .padding(horizontal = Spacing.lg, vertical = Spacing.xs)
            .height(NAV_HEIGHT)
            .graphicsLayer { this.alpha = alpha },
        shape = RoundedCornerShape(50),
        // D-1134: translucent instead of the previous opaque surfaceContainerHigh — the "glass"
        // material's defining trait. A light, mostly-theme-independent edge highlight (rather than
        // the old outlineVariant-based border) stands in for the "reflects light at its edges" part
        // of the Liquid Glass look.
        color = MaterialTheme.colorScheme.surfaceContainerHigh.copy(alpha = GLASS_ALPHA),
        tonalElevation = 3.dp,
        // D-1158: dropped — user confirmed on a real device that animating this Surface's alpha
        // (D-1134's show/hide fade) together with a shadow was causing frame drops. tonalElevation and
        // the border below are untouched.
        shadowElevation = 0.dp,
        border = BorderStroke(1.dp, Color.White.copy(alpha = 0.28f)),
    ) {
        // D-1159: no longer needs BoxWithConstraints — that was only ever used to measure `maxWidth`
        // for the sliding selected-tab indicator removed below, nothing else here depends on it.
        Box(Modifier.padding(Spacing.xs)) {
            // D-1159: the sliding `primaryContainer` Surface that used to mark the selected tab is
            // gone — selection is now shown purely via PillNavItem's own icon/text color + bold label,
            // no container needed. rawPosition/position/selectedIndex survive unchanged: selectedIndex
            // still decides which PillNavItem renders as selected below.
            val rawPosition = pagerState.currentPage + pagerState.currentPageOffsetFraction
            val position = rawPosition.coerceIn(0f, (destinations.size - 1).toFloat())
            val selectedIndex = position.roundToInt().coerceIn(0, destinations.lastIndex)

            Row(
                Modifier.fillMaxWidth().fillMaxHeight().selectableGroup(),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                destinations.forEachIndexed { index, destination ->
                    PillNavItem(
                        destination = destination,
                        selected = index == selectedIndex,
                        onClick = { onSelect(destination) },
                        modifier = Modifier.weight(1f).testTag("nav_${destination.name}"),
                    )
                }
            }
        }
    }
}

@Composable
private fun PillNavItem(
    destination: TopLevelDestination,
    selected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    // D-1159: selection used to be shown by a sliding primaryContainer Surface behind the tab (now
    // removed) plus onPrimaryContainer tint; with no container to sit on, selected now reads as a
    // solid accent color (primary) + a bold label instead.
    val color = if (selected) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurfaceVariant
    Column(
        modifier = modifier
            .selectable(
                selected = selected,
                interactionSource = remember { MutableInteractionSource() },
                indication = null, // D-1091: no ripple on the pill tabs — the color/weight change is the feedback
                onClick = onClick,
                role = Role.Tab,
            )
            .semantics(mergeDescendants = true) {}
            .padding(vertical = Spacing.sm),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(Spacing.xxs),
    ) {
        Icon(if (selected) destination.selectedIcon else destination.unselectedIcon, contentDescription = null, tint = color)
        Text(
            destination.label,
            style = MaterialTheme.typography.labelSmall,
            color = color,
            fontWeight = if (selected) FontWeight.Bold else null,
        )
    }
}

private val NAV_HEIGHT = 72.dp

/**
 * D-1134: how translucent the pill's "liquid glass" background is. **Deliberately not paired with a
 * `RenderEffect.createBlurEffect` backdrop blur** of the scrolling content behind it, even though the
 * decision asked for one, because — given how this pill is positioned today — a blur here would be a
 * no-op at best and misleading at worst:
 * - `Modifier.graphicsLayer { renderEffect = ... }` blurs *that graphics layer's own rendered
 *   content* (this `Surface`'s fill + the nav items drawn inside it), not whatever is visually
 *   *behind* it in the window. Blurring a flat color fill looks identical to not blurring it; the
 *   only thing it could visibly blur here is the icons/labels themselves, which is the opposite of
 *   what "glass" should do to its own contents.
 * - **Update, D-1144**: this pill now *does* live in a `Box` overlay alongside the `NavHost`
 *   (`UnifiedHealthApp.kt`), with content genuinely drawn underneath its bounds — the bullet above is
 *   no longer true. That removes the structural blocker, but a real blur-behind-content effect still
 *   needs the explicit shared `GraphicsLayer` described below; that plumbing (capture the content's
 *   layer, blur-sample the region under the pill, crop to its shape) was deferred again rather than
 *   added in the same pass as the `Box` restructure — see the updated class doc above.
 * - A *real* frosted-glass effect needs an explicit shared `GraphicsLayer` (Compose UI's
 *   `androidx.compose.ui.graphics.layer.GraphicsLayer` snapshot API) that the pill's own draw phase
 *   blurs and crops to its shape — a layering/compositing change beyond "purely a background material
 *   change", flagged back rather than guessed at silently, per the original decision's own request.
 * Translucency + the light edge border below still read as "glass-like" without it.
 */
private const val GLASS_ALPHA = 0.62f
