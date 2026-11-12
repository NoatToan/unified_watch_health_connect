package com.unified.health.core.domain

import com.unified.health.core.domain.usecase.ColorFamily
import com.unified.health.core.domain.usecase.GearPricePreset
import com.unified.health.core.domain.usecase.firstVariantMatchingColorFamilies
import com.unified.health.core.domain.usecase.gearColorFamilies
import com.unified.health.core.domain.usecase.gearColorFamilyCounts
import com.unified.health.core.domain.usecase.gearPriceBoundsVnd
import com.unified.health.core.domain.usecase.hasKidsItems
import com.unified.health.core.domain.usecase.matchesColorFamilies
import com.unified.health.core.domain.usecase.matchesGenderFilter
import com.unified.health.core.domain.usecase.matchesPriceRange
import com.unified.health.core.domain.usecase.toRangeVnd
import com.unified.health.core.model.GearCategory
import com.unified.health.core.model.GearGender
import com.unified.health.core.model.GearItem
import com.unified.health.core.model.GearVariant
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Test

class GearCatalogFiltersTest {

    private fun item(
        id: String = "id",
        name: String = "Item",
        priceVnd: Long? = null,
        variants: List<GearVariant> = emptyList(),
        gender: GearGender? = null,
    ) = GearItem(
        id = id,
        name = name,
        brand = "Brand",
        category = GearCategory.SHOES,
        priceVnd = priceVnd,
        description = null,
        imageUrl = null,
        productUrl = "https://example.com/$id",
        variants = variants,
        gender = gender,
    )

    private fun variant(color: String, imageUrl: String? = null) =
        GearVariant(color = color, imageUrl = imageUrl, productUrl = "https://example.com/v/$color")

    // --- gearColorFamilies / matchesColorFamilies ---

    @Test
    fun `color families come from every variant's dominant family when variants exist`() {
        val puma = item(variants = listOf(variant("PUMA Black"), variant("PUMA White")))
        assertEquals(setOf(ColorFamily.BLACK, ColorFamily.WHITE), puma.gearColorFamilies())
    }

    @Test
    fun `falls back to the product name when there are no variants`() {
        val salomon = item(name = "Áo Thể Thao Nam Salomon Trackline Tee Wrought Iron")
        assertEquals(setOf(ColorFamily.GREY), salomon.gearColorFamilies())
    }

    @Test
    fun `no variants and no color word in the name is unfilterable`() {
        val noColor = item(name = "Deviate NITRO 3 Running Shoes Men")
        assertTrue(noColor.gearColorFamilies().isEmpty())
    }

    @Test
    fun `empty filter set matches every item`() {
        assertTrue(item().matchesColorFamilies(emptySet()))
    }

    @Test
    fun `matches when any variant's dominant family is selected`() {
        val puma = item(variants = listOf(variant("PUMA Black"), variant("Ultra Red")))
        assertTrue(puma.matchesColorFamilies(setOf(ColorFamily.RED)))
        assertFalse(puma.matchesColorFamilies(setOf(ColorFamily.GREEN)))
    }

    @Test
    fun `firstVariantMatchingColorFamilies returns the first variant in that family, else null`() {
        val puma = item(variants = listOf(variant("PUMA White"), variant("Ultra Red"), variant("PUMA Black")))
        assertEquals("PUMA Black", puma.firstVariantMatchingColorFamilies(setOf(ColorFamily.BLACK))?.color)
        assertNull(puma.firstVariantMatchingColorFamilies(setOf(ColorFamily.GREEN)))
        assertNull(puma.firstVariantMatchingColorFamilies(emptySet()))
    }

    @Test
    fun `gearColorFamilyCounts only lists families present in the list, sorted by count desc`() {
        val items = listOf(
            item(id = "a", variants = listOf(variant("PUMA Black"))),
            item(id = "b", variants = listOf(variant("PUMA Black"), variant("PUMA White"))),
            item(id = "c", variants = listOf(variant("Ultra Red"))),
        )
        val counts = items.gearColorFamilyCounts()
        assertEquals(listOf(ColorFamily.BLACK, ColorFamily.WHITE, ColorFamily.RED), counts.map { it.family }.take(3))
        assertEquals(2, counts.first { it.family == ColorFamily.BLACK }.itemCount)
        assertEquals(1, counts.first { it.family == ColorFamily.WHITE }.itemCount)
        assertFalse(counts.any { it.family == ColorFamily.GREEN })
    }

    // --- price ---

    @Test
    fun `price bounds is min to max of priced items, null without any priced item`() {
        val items = listOf(item(priceVnd = 300_000), item(priceVnd = null), item(priceVnd = 1_500_000))
        assertEquals(300_000L..1_500_000L, items.gearPriceBoundsVnd())
        assertNull(listOf(item(priceVnd = null)).gearPriceBoundsVnd())
    }

    @Test
    fun `no price filter matches every item including null-priced ones`() {
        assertTrue(item(priceVnd = null).matchesPriceRange(null))
        assertTrue(item(priceVnd = 1_000_000).matchesPriceRange(null))
    }

    @Test
    fun `a null-priced item is excluded only once a price filter is active`() {
        val range = 0L..1_000_000L
        assertFalse(item(priceVnd = null).matchesPriceRange(range))
        assertTrue(item(priceVnd = 500_000).matchesPriceRange(range))
        assertFalse(item(priceVnd = 2_000_000).matchesPriceRange(range))
    }

    @Test
    fun `price presets are non-overlapping buckets`() {
        assertEquals(0L until 500_000L, GearPricePreset.UNDER_500K.toRangeVnd(5_000_000))
        assertEquals(500_000L until 1_000_000L, GearPricePreset.FROM_500K_TO_1M.toRangeVnd(5_000_000))
        assertEquals(1_000_000L until 2_000_000L, GearPricePreset.FROM_1M_TO_2M.toRangeVnd(5_000_000))
        assertEquals(2_000_000L until 3_000_000L, GearPricePreset.FROM_2M_TO_3M.toRangeVnd(5_000_000))
        assertEquals(3_000_000L..5_000_000L, GearPricePreset.OVER_3M.toRangeVnd(5_000_000))
    }

    @Test
    fun `OVER_3M never collapses below its own 3tr floor even with a lower category max`() {
        assertEquals(3_000_000L..3_000_000L, GearPricePreset.OVER_3M.toRangeVnd(categoryMaxVnd = 1_000_000))
    }

    // --- gender filter (gender-filter task, 2026-11-12) ---

    @Test
    fun `no gender filter matches every item including a null-gender one`() {
        assertTrue(item(gender = null).matchesGenderFilter(null))
        assertTrue(item(gender = GearGender.MEN).matchesGenderFilter(null))
        assertTrue(item(gender = GearGender.UNISEX).matchesGenderFilter(null))
    }

    @Test
    fun `MEN filter matches MEN and UNISEX, excludes WOMEN, KIDS and null`() {
        assertTrue(item(gender = GearGender.MEN).matchesGenderFilter(GearGender.MEN))
        assertTrue(item(gender = GearGender.UNISEX).matchesGenderFilter(GearGender.MEN))
        assertFalse(item(gender = GearGender.WOMEN).matchesGenderFilter(GearGender.MEN))
        assertFalse(item(gender = GearGender.KIDS).matchesGenderFilter(GearGender.MEN))
        assertFalse(item(gender = null).matchesGenderFilter(GearGender.MEN))
    }

    @Test
    fun `WOMEN filter matches WOMEN and UNISEX, excludes MEN, KIDS and null`() {
        assertTrue(item(gender = GearGender.WOMEN).matchesGenderFilter(GearGender.WOMEN))
        assertTrue(item(gender = GearGender.UNISEX).matchesGenderFilter(GearGender.WOMEN))
        assertFalse(item(gender = GearGender.MEN).matchesGenderFilter(GearGender.WOMEN))
        assertFalse(item(gender = GearGender.KIDS).matchesGenderFilter(GearGender.WOMEN))
        assertFalse(item(gender = null).matchesGenderFilter(GearGender.WOMEN))
    }

    @Test
    fun `KIDS filter matches only KIDS, UNISEX does not count as kids`() {
        assertTrue(item(gender = GearGender.KIDS).matchesGenderFilter(GearGender.KIDS))
        assertFalse(item(gender = GearGender.UNISEX).matchesGenderFilter(GearGender.KIDS))
        assertFalse(item(gender = GearGender.MEN).matchesGenderFilter(GearGender.KIDS))
        assertFalse(item(gender = null).matchesGenderFilter(GearGender.KIDS))
    }

    @Test
    fun `hasKidsItems is true only when at least one item is tagged KIDS`() {
        assertFalse(listOf(item(gender = GearGender.MEN), item(gender = null)).hasKidsItems())
        assertTrue(listOf(item(gender = GearGender.MEN), item(gender = GearGender.KIDS)).hasKidsItems())
    }
}
