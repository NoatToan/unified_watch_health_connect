package com.unified.health.ui

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * On-device review bug (2026-11-12, D-1205): Activity tab -> open a workout detail -> scroll inside
 * the detail -> system BACK -> the pill bottom nav came back with its tabs un-tappable (swipe still
 * worked). Root cause: [pillVisibilityForScroll] (then inlined directly in the `NestedScrollConnection`
 * in [UnifiedHealthApp]) reacted to scrolling even while a detail screen was on top and the pill wasn't
 * shown at all, leaving `pillVisible = false` as a stale leftover; returning to the main pager raced
 * that leftover against the `LaunchedEffect` reset *and* against `PillBottomNavigation` being
 * conditionally composed/disposed via `if (onMainPager)`, which threw away its fade `Animatable` on
 * every round trip. These two pure functions are the extracted, directly testable decisions behind the
 * fix: scrolling only ever affects visibility while actually on the main pager, and
 * [PillBottomNavigation] (now always composed, never disposed by navigation) is tappable/shown exactly
 * when both the main pager is active and the scroll-driven fade says so.
 */
class UnifiedHealthAppLogicTest {

    // --- pillVisibilityForScroll ---

    @Test
    fun `scrolling down on the main pager hides the pill`() {
        val result = pillVisibilityForScroll(
            onMainPager = true,
            availableX = 0f,
            availableY = -10f,
            current = true,
        )
        assertFalse(result)
    }

    @Test
    fun `scrolling up on the main pager shows the pill`() {
        val result = pillVisibilityForScroll(
            onMainPager = true,
            availableX = 0f,
            availableY = 10f,
            current = false,
        )
        assertTrue(result)
    }

    @Test
    fun `scrolling on a detail screen never changes pill visibility`() {
        // The exact repro: a detail screen (onMainPager = false) is scrolled down, which used to leave
        // `pillVisible = false` as a stale leftover for when the user navigates back.
        val result = pillVisibilityForScroll(
            onMainPager = false,
            availableX = 0f,
            availableY = -10f,
            current = true,
        )
        assertTrue("scrolling off the main pager must not touch visibility", result)
    }

    @Test
    fun `a horizontal-dominant delta (the pager's own drag) is ignored`() {
        val result = pillVisibilityForScroll(
            onMainPager = true,
            availableX = 20f,
            availableY = 5f,
            current = true,
        )
        assertTrue(result)
    }

    @Test
    fun `a zero vertical delta leaves current visibility unchanged`() {
        val result = pillVisibilityForScroll(
            onMainPager = true,
            availableX = 0f,
            availableY = 0f,
            current = false,
        )
        assertFalse(result)
    }

    // --- pillNavVisible ---

    @Test
    fun `pill is visible only on the main pager with the fade showing`() {
        assertTrue(pillNavVisible(onMainPager = true, pillVisible = true))
        assertFalse(pillNavVisible(onMainPager = true, pillVisible = false))
        assertFalse(pillNavVisible(onMainPager = false, pillVisible = true))
        assertFalse(pillNavVisible(onMainPager = false, pillVisible = false))
    }

    @Test
    fun `returning from a detail screen is visible immediately, no stale leftover`() {
        // The exact repro end-to-end: a detail screen is scrolled down (onMainPager = false, so per
        // pillVisibilityForScroll pillVisible never changes and stays true), then the user returns
        // (onMainPager flips back to true) — the pill must already read as visible/tappable, with no
        // dependency on the LaunchedEffect reset running first.
        val pillVisibleAfterScrollingDetailScreen = pillVisibilityForScroll(
            onMainPager = false,
            availableX = 0f,
            availableY = -10f,
            current = true,
        )
        assertTrue(pillNavVisible(onMainPager = true, pillVisible = pillVisibleAfterScrollingDetailScreen))
    }
}
