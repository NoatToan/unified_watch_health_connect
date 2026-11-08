package com.unified.health.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.width
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
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import com.unified.health.core.designsystem.theme.Spacing
import com.unified.health.navigation.TopLevelDestination
import kotlin.math.roundToInt

/**
 * Floating pill-shaped bottom nav (D-1051), reference-screenshot style: a rounded bar with a smaller
 * pill behind the selected tab that slides to follow it. The slide is driven directly by
 * [pagerState]'s own continuous `currentPage + currentPageOffsetFraction` rather than a second
 * `animateDpAsState` layered on top — [pagerState] already animates that value smoothly on a tap
 * (`animateScrollToPage`) and updates it 1:1 with a drag, so wrapping it in another animation would
 * only add lag while swiping (see D-1077 in docs/DECISIONS.md).
 *
 * D-1084: unlike Material3's own `NavigationBar` (which pads itself against the system navigation
 * bar automatically), this hand-rolled `Surface` needs that inset applied explicitly, or the pill
 * sits under/behind the system nav bar in both gesture-nav and 3-button modes.
 */
@Composable
fun PillBottomNavigation(
    pagerState: PagerState,
    onSelect: (TopLevelDestination) -> Unit,
    modifier: Modifier = Modifier,
) {
    val destinations = TopLevelDestination.entries
    Surface(
        // A fixed height (rather than wrap-content) is required: the sliding indicator below uses
        // fillMaxHeight(), which needs a bounded constraint to resolve against.
        modifier = modifier
            .windowInsetsPadding(WindowInsets.navigationBars.only(WindowInsetsSides.Horizontal + WindowInsetsSides.Bottom))
            .padding(horizontal = Spacing.lg, vertical = Spacing.md)
            .height(NAV_HEIGHT),
        shape = RoundedCornerShape(50),
        color = MaterialTheme.colorScheme.surfaceContainerHigh,
        tonalElevation = 3.dp,
        shadowElevation = 6.dp,
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.4f)),
    ) {
        BoxWithConstraints(Modifier.padding(Spacing.xs)) {
            val tabWidth = maxWidth / destinations.size
            val rawPosition = pagerState.currentPage + pagerState.currentPageOffsetFraction
            val position = rawPosition.coerceIn(0f, (destinations.size - 1).toFloat())
            val selectedIndex = position.roundToInt().coerceIn(0, destinations.lastIndex)

            Surface(
                modifier = Modifier
                    .offset(x = tabWidth * position)
                    .width(tabWidth)
                    .fillMaxHeight()
                    .padding(Spacing.xxs),
                shape = RoundedCornerShape(50),
                color = MaterialTheme.colorScheme.primaryContainer,
            ) {}

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
    val color = if (selected) MaterialTheme.colorScheme.onPrimaryContainer else MaterialTheme.colorScheme.onSurfaceVariant
    Column(
        modifier = modifier
            .selectable(
                selected = selected,
                interactionSource = remember { MutableInteractionSource() },
                indication = null, // D-1091: no ripple on the pill tabs — the sliding indicator is the feedback
                onClick = onClick,
                role = Role.Tab,
            )
            .semantics(mergeDescendants = true) {}
            .padding(vertical = Spacing.sm),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(Spacing.xxs),
    ) {
        Icon(if (selected) destination.selectedIcon else destination.unselectedIcon, contentDescription = null, tint = color)
        Text(destination.label, style = MaterialTheme.typography.labelSmall, color = color)
    }
}

private val NAV_HEIGHT = 72.dp
