package com.unified.health.core.designsystem.component

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test

/** Pure math behind [HealthLineChart] (docs/DECISIONS.md D-1202). */
class LineChartMathTest {

    // ---------------------------------------------------------------- movingAverage

    @Test
    fun `window of 1 returns the values unchanged`() {
        val values = listOf(1f, 2f, null, 4f)
        assertEquals(values, LineChartMath.movingAverage(values, window = 1))
    }

    @Test
    fun `a flat series stays flat after smoothing`() {
        val values = List(6) { 10f }
        val smoothed = LineChartMath.movingAverage(values, window = 3)
        smoothed.forEach { assertEquals(10f, it!!, 0.001f) }
    }

    @Test
    fun `smoothing averages neighbours within the window`() {
        // Centered window=3 at index 2 (half=1): averages indices 1,2,3 = (2+4+6)/3 = 4.
        val values = listOf(0f, 2f, 4f, 6f, 8f)
        val smoothed = LineChartMath.movingAverage(values, window = 3)
        assertEquals(4f, smoothed[2]!!, 0.001f)
    }

    @Test
    fun `a gap stays a gap after smoothing, and does not bleed into neighbours`() {
        val values = listOf(10f, null, 30f)
        val smoothed = LineChartMath.movingAverage(values, window = 3)
        assertNull(smoothed[1])
        // Index 0's window would include the null at 1, which must be skipped, not treated as 0.
        assertEquals(10f, smoothed[0]!!, 0.001f)
    }

    // ---------------------------------------------------------------- segments

    @Test
    fun `one contiguous run of data is a single segment`() {
        assertEquals(listOf(0 until 4), LineChartMath.segments(listOf(true, true, true, true)))
    }

    @Test
    fun `a gap splits data into two segments, neither one bridging it`() {
        val hasData = listOf(true, true, false, false, true, true, true)
        assertEquals(listOf(0 until 2, 4 until 7), LineChartMath.segments(hasData))
    }

    @Test
    fun `all missing data has no segments`() {
        assertEquals(emptyList<IntRange>(), LineChartMath.segments(listOf(false, false, false)))
    }

    @Test
    fun `an isolated single point is its own one-element segment`() {
        assertEquals(listOf(2 until 3), LineChartMath.segments(listOf(false, false, true, false, false)))
    }

    // ---------------------------------------------------------------- axisRange

    @Test
    fun `a tight data range gets padding instead of being rounded away`() {
        // 145-155 padded 10% each side is 144-156 - the axis must stay close to that, not snap to 100-200.
        val (lo, hi) = LineChartMath.axisRange(145f, 155f)
        assertEquals(true, lo in 130f..146f)
        assertEquals(true, hi in 154f..170f)
    }

    @Test
    fun `min and max always land inside the returned range`() {
        val (lo, hi) = LineChartMath.axisRange(12.3f, 87.9f)
        assertEquals(true, lo <= 12.3f)
        assertEquals(true, hi >= 87.9f)
    }

    @Test
    fun `a single repeated value still produces a usable non-degenerate range`() {
        val (lo, hi) = LineChartMath.axisRange(100f, 100f)
        assertEquals(true, hi > lo)
    }
}
