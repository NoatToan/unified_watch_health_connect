package com.unified.health.core.designsystem.component

import com.unified.health.core.model.RaceTerrain
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Test

class RaceCardTest {

    @Test
    fun `formatVnd groups thousands with dots, Vietnamese-style`() {
        assertEquals("790.000đ", formatVnd(790_000))
        assertEquals("1.500.000đ", formatVnd(1_500_000))
        assertEquals("500đ", formatVnd(500))
        assertEquals("0đ", formatVnd(0))
    }

    @Test
    fun `every terrain has its own gradient colors and icon`() {
        val gradients = RaceTerrain.entries.map { it.gradientColors() }
        val icons = RaceTerrain.entries.map { it.icon() }
        // D-1106: 6 *distinct* gradient pairs — no two terrains should silently share one.
        assertEquals(RaceTerrain.entries.size, gradients.distinct().size)
        assertEquals(RaceTerrain.entries.size, icons.distinct().size)
    }

    @Test
    fun `terrain label is never blank`() {
        RaceTerrain.entries.forEach { terrain -> assertNotEquals("", terrain.label().trim()) }
    }
}
