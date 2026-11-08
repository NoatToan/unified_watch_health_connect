package com.unified.health.core.designsystem.theme

import androidx.compose.ui.unit.dp

/** 4dp-based spacing tokens. */
object Spacing {
    val xxs = 2.dp
    val xs = 4.dp
    val sm = 8.dp
    val md = 12.dp
    val lg = 16.dp
    val xl = 24.dp
    val xxl = 32.dp

    /** Minimum touch target recommended by Material / WCAG. */
    val minTouchTarget = 48.dp

    /**
     * D-1144: clearance to reserve at the bottom of each top-level tab's own scrollable content, now
     * that `PillBottomNavigation` (`app` module) floats as a `Box` overlay instead of reserving
     * `Scaffold` bottom-bar space — without this, a screen's last card/item would sit permanently
     * behind the pill instead of merely scrolling behind it like everything else. Matches the pill's
     * own total footprint (its fixed height + top/bottom margins, see `PillBottomNavigation.kt`'s
     * `NAV_HEIGHT`) as a fixed dp value rather than a real `WindowInsets` reading — feature modules
     * cannot see `app`'s private layout constants (architecture: feature depends on
     * domain/designsystem only), so this is kept in sync by hand instead of computed from one source.
     */
    val bottomNavClearance = 96.dp
}
