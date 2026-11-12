package com.unified.health.core.domain.usecase

import com.unified.health.core.model.GearGender
import com.unified.health.core.model.GearItem
import com.unified.health.core.model.GearVariant

/**
 * D-1203: price + color filtering for "Trang bị tham khảo" (`feature/gear`) — pure functions on top
 * of [classifyGearColor], kept separate from [GearViewModel][com.unified.health.feature.gear.GearViewModel]
 * so they're unit-testable without Android/Compose/Hilt.
 */

/**
 * Every [ColorFamily] an item is browsable under: the dominant family of each variant's own color
 * (brief's rule — a filter matches an item if *any* variant's dominant family is selected), or, for
 * an item with no [GearItem.variants] at all, the dominant family found in [GearItem.name] itself
 * (brief: "try mapping from a color word in the product name; else no color"). Empty when nothing
 * is recognized either way.
 */
fun GearItem.gearColorFamilies(): Set<ColorFamily> = if (variants.isNotEmpty()) {
    variants.mapNotNull { classifyGearColor(it.color).dominant }.toSet()
} else {
    setOfNotNull(classifyGearColor(name).dominant)
}

/** True when no color filter is active ([selected] empty), or this item has at least one color
 *  family in [selected] (via [gearColorFamilies]). */
fun GearItem.matchesColorFamilies(selected: Set<ColorFamily>): Boolean =
    selected.isEmpty() || gearColorFamilies().any { it in selected }

/**
 * D-1203 decision 4: the first variant whose own dominant color family is in [selected], used to
 * swap a card's/detail's displayed photo to match an active color filter. Null when [selected] is
 * empty (no filter active — show the item's own default photo) or no variant matches.
 */
fun GearItem.firstVariantMatchingColorFamilies(selected: Set<ColorFamily>): GearVariant? =
    if (selected.isEmpty()) null else variants.firstOrNull { classifyGearColor(it.color).dominant in selected }

/** [ColorFamily] → how many distinct items ([GearItem.id]) are browsable under it, for every family
 *  present in [items] — the bottom sheet's color section only ever shows a family with ≥1 item. */
fun List<GearItem>.gearColorFamilyCounts(): List<GearColorFamilyCount> {
    val counts = linkedMapOf<ColorFamily, Int>()
    for (item in this) {
        for (family in item.gearColorFamilies()) {
            counts[family] = (counts[family] ?: 0) + 1
        }
    }
    return counts.entries
        .sortedWith(compareByDescending<Map.Entry<ColorFamily, Int>> { it.value }.thenBy { it.key.ordinal })
        .map { GearColorFamilyCount(it.key, it.value) }
}

data class GearColorFamilyCount(val family: ColorFamily, val itemCount: Int)

/** Min..max of [GearItem.priceVnd] among items that have a price at all; null when none do —
 *  the RangeSlider's own bounds (brief: "actual min..max of the current category's items"). */
fun List<GearItem>.gearPriceBoundsVnd(): LongRange? {
    val prices = mapNotNull { it.priceVnd }
    return if (prices.isEmpty()) null else prices.min()..prices.max()
}

/** True when no price filter is active ([range] null), or this item has a price inside [range] —
 *  brief's rule: a null-price item is excluded only once a price filter is active. */
fun GearItem.matchesPriceRange(range: LongRange?): Boolean =
    range == null || (priceVnd != null && priceVnd in range)

/** Quick preset chips (brief) on top of the free-form RangeSlider — both resolve to the same
 *  [LongRange] filter value, there is no separate "preset mode" in the ViewModel's state. */
enum class GearPricePreset {
    UNDER_500K, FROM_500K_TO_1M, FROM_1M_TO_2M, FROM_2M_TO_3M, OVER_3M
}

private const val PRICE_500K = 500_000L
private const val PRICE_1M = 1_000_000L
private const val PRICE_2M = 2_000_000L
private const val PRICE_3M = 3_000_000L

/**
 * [GearPricePreset] → its concrete [LongRange], in whole VND. Buckets are non-overlapping (500k
 * lands in [FROM_500K_TO_1M], not [UNDER_500K]); [OVER_3M]'s upper bound is whichever of
 * [categoryMaxVnd] or 3,000,000 is larger, so it still matches every above-3tr item in the current
 * category instead of an arbitrary hardcoded ceiling.
 */
fun GearPricePreset.toRangeVnd(categoryMaxVnd: Long): LongRange = when (this) {
    GearPricePreset.UNDER_500K -> 0L until PRICE_500K
    GearPricePreset.FROM_500K_TO_1M -> PRICE_500K until PRICE_1M
    GearPricePreset.FROM_1M_TO_2M -> PRICE_1M until PRICE_2M
    GearPricePreset.FROM_2M_TO_3M -> PRICE_2M until PRICE_3M
    GearPricePreset.OVER_3M -> PRICE_3M..maxOf(categoryMaxVnd, PRICE_3M)
}

/**
 * Gender filter (gender-filter task, 2026-11-12), single-select — "Tất cả" (= null) matches
 * everything, same convention as the category chip row. [GearGender.UNISEX] matches both
 * [GearGender.MEN] and [GearGender.WOMEN] (brief's explicit rule); it is not itself a selectable chip
 * (the sheet only offers Nam/Nữ/Trẻ em, see [hasKidsItems]), but the `when` below stays exhaustive —
 * a hypothetical direct "Unisex" selection would only match an item already tagged unisex, which is
 * at least as correct as leaving it unreachable.
 *
 * A null [GearItem.gender] (no feed value *and* [classifyGearGender] found no signal) matches only
 * when no gender filter is active at all — brief's rule, same shape as [matchesPriceRange]'s own
 * null-price handling.
 */
fun GearItem.matchesGenderFilter(selected: GearGender?): Boolean = when (selected) {
    null -> true
    GearGender.MEN -> gender == GearGender.MEN || gender == GearGender.UNISEX
    GearGender.WOMEN -> gender == GearGender.WOMEN || gender == GearGender.UNISEX
    GearGender.KIDS -> gender == GearGender.KIDS
    GearGender.UNISEX -> gender == GearGender.UNISEX
}

/** True when [items] has at least one [GearGender.KIDS] item — the "Trẻ em" chip (brief) only ever
 *  shows up in the sheet's gender section when this is true, same "only show a chip that actually
 *  matches something" rule [gearColorFamilyCounts] already applies to color. */
fun List<GearItem>.hasKidsItems(): Boolean = any { it.gender == GearGender.KIDS }
