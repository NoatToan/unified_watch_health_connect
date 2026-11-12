package com.unified.health.core.designsystem.component

import android.os.Build
import androidx.compose.ui.graphics.Color
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

/** D-1207: pure decision-logic units behind [BlurFillAsyncImage] — the aspect-ratio-mismatch
 *  threshold, the API-level fallback choice, and the average-color math — independent of Compose/
 *  Coil so none of this needs a UI test to cover. */
class BlurFillAsyncImageTest {

    @Test
    fun `aspectRatioMismatch is false when image and container ratios match exactly`() {
        assertFalse(aspectRatioMismatch(imageRatio = 1.5f, containerRatio = 1.5f))
    }

    @Test
    fun `aspectRatioMismatch is false for a tiny rounding-level difference under the threshold`() {
        // 1% off — well inside the 5% default threshold.
        assertFalse(aspectRatioMismatch(imageRatio = 1.5f, containerRatio = 1.515f))
    }

    @Test
    fun `aspectRatioMismatch is true once the difference exceeds the default threshold`() {
        // A near-square 1:1 photo inside a 4:5 card — the exact real-world case this was written for.
        assertTrue(aspectRatioMismatch(imageRatio = 1f, containerRatio = 0.8f))
    }

    @Test
    fun `aspectRatioMismatch respects a custom threshold`() {
        assertFalse(aspectRatioMismatch(imageRatio = 1.2f, containerRatio = 1f, threshold = 0.5f))
        assertTrue(aspectRatioMismatch(imageRatio = 1.2f, containerRatio = 1f, threshold = 0.1f))
    }

    @Test
    fun `aspectRatioMismatch never trips on a non-positive ratio`() {
        assertFalse(aspectRatioMismatch(imageRatio = 0f, containerRatio = 1.5f))
        assertFalse(aspectRatioMismatch(imageRatio = 1.5f, containerRatio = 0f))
        assertFalse(aspectRatioMismatch(imageRatio = -1f, containerRatio = 1.5f))
    }

    @Test
    fun `backdropRenderStyleFor picks blur from API 31 (Build S) onward`() {
        assertEquals(BackdropRenderStyle.BLURRED_IMAGE, backdropRenderStyleFor(Build.VERSION_CODES.S))
        assertEquals(BackdropRenderStyle.BLURRED_IMAGE, backdropRenderStyleFor(Build.VERSION_CODES.S + 5))
    }

    @Test
    fun `backdropRenderStyleFor picks the average-color fallback below API 31`() {
        assertEquals(BackdropRenderStyle.SOLID_AVERAGE_COLOR, backdropRenderStyleFor(Build.VERSION_CODES.S - 1))
        // The app's own minSdk (26, per RaceCard's RaceImageBackdrop doc) — the floor this matters for.
        assertEquals(BackdropRenderStyle.SOLID_AVERAGE_COLOR, backdropRenderStyleFor(26))
    }

    @Test
    fun `averageColor of uniform pixels is exactly that color`() {
        val red = (0xFF shl 24) or (0xFF shl 16)
        val pixels = IntArray(9) { red }
        val result = averageColor(pixels)
        assertEquals(1f, result.red, 0.01f)
        assertEquals(0f, result.green, 0.01f)
        assertEquals(0f, result.blue, 0.01f)
    }

    @Test
    fun `averageColor of two evenly-split colors lands halfway between them`() {
        val black = 0xFF000000.toInt()
        val white = 0xFFFFFFFF.toInt()
        val pixels = intArrayOf(black, white, black, white)
        val result = averageColor(pixels)
        assertEquals(0.5f, result.red, 0.01f)
        assertEquals(0.5f, result.green, 0.01f)
        assertEquals(0.5f, result.blue, 0.01f)
    }

    @Test
    fun `averageColor of an empty pixel array is black, not a crash`() {
        val result = averageColor(IntArray(0))
        assertEquals(Color.Black, result)
    }
}
