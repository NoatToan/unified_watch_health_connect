package com.unified.health.ui

import android.graphics.Rect
import android.os.Build
import android.view.View
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * D-1053: while [enabled], tells the system not to intercept the left/right screen edges for its own
 * back gesture (gesture-navigation mode), so a horizontal drag starting near an edge reaches our
 * [androidx.compose.foundation.pager.HorizontalPager] (D-1052) instead of triggering predictive
 * back. Disabled (rects cleared) on any child/detail screen pushed on top of the pager, so the
 * system's edge-swipe-back works normally there, as required.
 *
 * [View.setSystemGestureExclusionRects] is the mechanism the decision doc (docs/DECISIONS.md D-1053)
 * named as a starting point; this is that implementation, re-applied whenever the view's size
 * changes (rotation, insets) and cleared on dispose/disable. **Provisional**: the system may still
 * shrink or ignore rects it considers too large, and 3-button navigation has no edge gesture to
 * exclude in the first place (nothing to verify there) — needs a real device check in both
 * navigation modes, which this agent could not do in this environment.
 */
@Composable
fun EdgeGestureExclusion(enabled: Boolean) {
    val view = LocalView.current
    val edgeWidthPx = with(LocalDensity.current) { EDGE_WIDTH.roundToPx() }
    DisposableEffect(enabled, view, edgeWidthPx) {
        if (!enabled || Build.VERSION.SDK_INT < Build.VERSION_CODES.Q) {
            onDispose {}
        } else {
            fun applyRects() {
                val width = view.width
                val height = view.height
                if (width <= 0 || height <= 0) return
                view.systemGestureExclusionRects = listOf(
                    Rect(0, 0, edgeWidthPx, height),
                    Rect((width - edgeWidthPx).coerceAtLeast(0), 0, width, height),
                )
            }
            applyRects()
            val listener = View.OnLayoutChangeListener { _, _, _, _, _, _, _, _, _ -> applyRects() }
            view.addOnLayoutChangeListener(listener)
            onDispose {
                view.removeOnLayoutChangeListener(listener)
                view.systemGestureExclusionRects = emptyList()
            }
        }
    }
}

/** Wide enough to beat the system's own ~20-24dp edge-swipe hot zone on most devices. */
private val EDGE_WIDTH: Dp = 32.dp
