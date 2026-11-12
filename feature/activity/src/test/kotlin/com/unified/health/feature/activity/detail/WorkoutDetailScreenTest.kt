package com.unified.health.feature.activity.detail

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * D-1197 round 2: [splitBarFraction] normalizes a splits-table row's pace-bar width. The on-device
 * bug it fixes was a demo workout whose full laps all read the same duration (a separate generator
 * bug, see `SyntheticWorkoutDetailGeneratorTest`) — the bar math collapsed to zero width for every
 * row but the fastest in that situation instead of drawing a full bar for all of them.
 */
class WorkoutDetailScreenTest {

    @Test
    fun `the fastest split gets the full-width bar`() {
        assertEquals(1f, splitBarFraction(durationSeconds = 300, minSeconds = 300, maxSeconds = 400), 0f)
    }

    @Test
    fun `the slowest split still gets a visible floor, never zero`() {
        val fraction = splitBarFraction(durationSeconds = 400, minSeconds = 300, maxSeconds = 400)
        assertTrue("expected a visible floor, got $fraction", fraction > 0f)
        assertEquals(0.12f, fraction, 0.001f)
    }

    @Test
    fun `a split strictly between the fastest and slowest scales linearly`() {
        assertEquals(0.5f, splitBarFraction(durationSeconds = 350, minSeconds = 300, maxSeconds = 400), 0.001f)
    }

    @Test
    fun `every row still shows a full bar when every split ties (the old demo-generator bug)`() {
        // Before the fix, an equal-pace table (e.g. every lap reading 5'53") made this formula
        // evaluate a 0/0-shaped division, which rendered a zero-width (invisible) bar for every row
        // but the one treated as "fastest" -- this must now always resolve to a full bar instead.
        assertEquals(1f, splitBarFraction(durationSeconds = 353, minSeconds = 353, maxSeconds = 353), 0f)
    }

    @Test
    fun `a degenerate zero-width window never divides by zero`() {
        // maxSeconds == minSeconds for every duration value, not just one that matches them.
        assertEquals(1f, splitBarFraction(durationSeconds = 999, minSeconds = 353, maxSeconds = 353), 0f)
    }
}
