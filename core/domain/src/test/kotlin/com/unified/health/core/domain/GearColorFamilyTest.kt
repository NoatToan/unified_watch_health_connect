package com.unified.health.core.domain

import com.unified.health.core.domain.usecase.ColorFamily
import com.unified.health.core.domain.usecase.classifyGearColor
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test

/**
 * [classifyGearColor] built and verified against the real color strings published in
 * `unified_health_service`'s feed (`docs/gear/latest.json`, read-only reference as of 2026-11-12:
 * 486 items / 156 with variants / 636 total variants across PUMA, Salomon, Li-Ning, Coolmate).
 *
 * Measured coverage on that exact feed with this dictionary: **629/636 variants mapped (98.9%)**.
 * The 7 unmapped are intentional, not a gap to chase: 2× the literal string "Cool Weather" (no
 * color word at all, just a weather-themed marketing name) and 5× "Thêu <motif>" ("embroidered
 * <Butterfly/Penguin/Dragonfly/Elephant/Bee>" — an embroidery pattern name, genuinely no base color
 * given). Items with no [com.unified.health.core.model.GearItem.variants] at all, mapped instead
 * from a color word in the product name: 94/330 (28.5%) — expected to be much lower than the
 * variant figure, since most bare product-name strings are just a model name ("Deviate NITRO™ 3
 * Running Shoes Men") with no color mentioned anywhere.
 */
class GearColorFamilyTest {

    private fun assertDominant(expected: ColorFamily, raw: String) {
        assertEquals("classifying '$raw'", expected, classifyGearColor(raw).dominant)
    }

    // --- Vietnamese basic colors (highest-frequency real strings) ---

    @Test
    fun `plain Vietnamese color words map to their family`() {
        assertDominant(ColorFamily.BLACK, "Đen")
        assertDominant(ColorFamily.WHITE, "Trắng")
        assertDominant(ColorFamily.GREY, "Xám")
        assertDominant(ColorFamily.GREY, "Xám đậm")
        assertDominant(ColorFamily.GREY, "Xám nhạt")
        assertDominant(ColorFamily.PURPLE, "Tím")
        assertDominant(ColorFamily.RED, "Đỏ")
        assertDominant(ColorFamily.PINK, "Hồng")
        assertDominant(ColorFamily.YELLOW, "Vàng")
        assertDominant(ColorFamily.BROWN_BEIGE, "Be")
        assertDominant(ColorFamily.BROWN_BEIGE, "Nâu")
        assertDominant(ColorFamily.BROWN_BEIGE, "Nâu nhạt")
        assertDominant(ColorFamily.BROWN_BEIGE, "Nâu đậm")
        assertDominant(ColorFamily.ORANGE, "Cam")
    }

    @Test
    fun `xanh alone defaults to BLUE`() {
        assertDominant(ColorFamily.BLUE, "Xanh")
        assertDominant(ColorFamily.BLUE, "Xanh dương")
        assertDominant(ColorFamily.BLUE, "Xanh Navy")
        assertDominant(ColorFamily.BLUE, "Xanh nhạt")
        assertDominant(ColorFamily.BLUE, "Xanh đậm")
        assertDominant(ColorFamily.BLUE, "Xanh Mosaic")
        assertDominant(ColorFamily.BLUE, "Xanh neon")
        assertDominant(ColorFamily.BLUE, "Xanh Crystal")
        assertDominant(ColorFamily.BLUE, "Xanh Canton")
    }

    @Test
    fun `xanh followed by a green trigger word resolves to GREEN`() {
        assertDominant(ColorFamily.GREEN, "Xanh lá")
        assertDominant(ColorFamily.GREEN, "Xanh Ngọc")
    }

    @Test
    fun `xanh đen is BLUE dominant with BLACK as a secondary family`() {
        val match = classifyGearColor("Xanh đen")
        assertEquals(ColorFamily.BLUE, match.dominant)
        assertEquals(setOf(ColorFamily.BLACK), match.secondary)
    }

    // --- PUMA English compound colorway names (real feed strings) ---

    @Test
    fun `PUMA Black is BLACK`() = assertDominant(ColorFamily.BLACK, "PUMA Black")

    @Test
    fun `two-tone PUMA name is dominant-plus-secondary, not MULTI`() {
        val match = classifyGearColor("PUMA Black-PUMA White")
        assertEquals(ColorFamily.BLACK, match.dominant)
        assertEquals(setOf(ColorFamily.WHITE), match.secondary)
    }

    @Test
    fun `three-tone PUMA name keeps every distinct family as secondary`() {
        val match = classifyGearColor("PUMA Black-PUMA White-PUMA Silver")
        assertEquals(ColorFamily.BLACK, match.dominant)
        assertEquals(setOf(ColorFamily.WHITE, ColorFamily.GREY), match.secondary)
    }

    @Test
    fun `marketing colorway names with an embedded color word still classify`() {
        assertDominant(ColorFamily.BLACK, "Inky Depths")
        assertDominant(ColorFamily.BROWN_BEIGE, "Sandstone")
        assertDominant(ColorFamily.GREEN, "Apple Spritz")
        assertDominant(ColorFamily.GREEN, "Sage Frost")
        assertDominant(ColorFamily.RED, "Ruby Noir")
        assertDominant(ColorFamily.YELLOW, "Gold Moon")
        assertDominant(ColorFamily.BLUE, "Zen Blue")
        assertDominant(ColorFamily.RED, "Ultra Red")
        assertDominant(ColorFamily.PURPLE, "Light Lavender")
        assertDominant(ColorFamily.PURPLE, "Deep Plum")
        assertDominant(ColorFamily.BLUE, "Baltic Sea Blue")
        assertDominant(ColorFamily.ORANGE, "Sunset Glow")
        assertDominant(ColorFamily.GREY, "Galactic Gray")
        assertDominant(ColorFamily.BLUE, "Lapis Lazuli")
        assertDominant(ColorFamily.WHITE, "Alpine Snow")
    }

    @Test
    fun `french-accented marketing name still strips diacritics`() {
        // Real feed string: dominant is WHITE (the leftmost color word, "Créme"/"creme") — a
        // documented approximation, not a claim that cream is the item's "main" color over mint.
        assertDominant(ColorFamily.WHITE, "Créme De Mint")
    }

    // --- Vietnamese compound/mixed strings ---

    @Test
    fun `phối compound splits into dominant plus secondary`() {
        val match = classifyGearColor("Trắng phối đỏ")
        assertEquals(ColorFamily.WHITE, match.dominant)
        assertEquals(setOf(ColorFamily.RED), match.secondary)
    }

    @Test
    fun `kem groups into WHITE not BROWN_BEIGE`() {
        assertDominant(ColorFamily.WHITE, "Kem viền tím")
    }

    @Test
    fun `AOP all-over-print suffix maps to MULTI as a secondary family`() {
        val match = classifyGearColor("Silver Mist-AOP")
        assertEquals(ColorFamily.GREY, match.dominant)
        assertEquals(setOf(ColorFamily.MULTI), match.secondary)
    }

    @Test
    fun `literal mix label maps to MULTI`() = assertDominant(ColorFamily.MULTI, "Mix màu 2")

    // --- Unmapped: genuinely no color information ---

    @Test
    fun `strings with no recognizable color word are unmapped, not guessed`() {
        assertNull(classifyGearColor("Cool Weather").dominant)
        assertNull(classifyGearColor("Thêu Butterfly").dominant)
    }

    @Test
    fun `blank input is unmapped`() {
        assertNull(classifyGearColor("").dominant)
    }
}
