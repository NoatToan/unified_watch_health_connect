package com.unified.health.core.model

/**
 * One piece of running gear (shoes/apparel/accessories) from a real brand, crawled daily by the
 * sibling `unified_health_service` project and published as static JSON — mirrors [Race]'s own
 * shape/rationale: marketing/catalog content meant to drive a link-out click to the brand's own
 * product page, not personal health data, so it's kept out of `HealthDataRepository`.
 *
 * Read-only browsing only (docs/DECISIONS.md, this task's brief): no "add to my wardrobe"/ownership
 * tracking here — that's a deliberate, separate follow-up built on top of [variants]' color picker.
 */
data class GearItem(
    val id: String,
    val name: String,
    val brand: String,
    val category: GearCategory,
    val priceVnd: Long?,
    val description: String?,
    val imageUrl: String?,
    /** The item's own listing page — the "else" link-out target when no [GearVariant] is selected. */
    val productUrl: String,
    /** Color variants, e.g. one Puma item can have several colorways; empty when the source (e.g.
     *  Salomon) instead publishes each color as its own separate [GearItem]. */
    val variants: List<GearVariant>,
    /**
     * Gender filter (gender-filter task, 2026-11-12): the feed's own explicit value when present,
     * else `core/domain`'s name-based fallback classifier's best guess, else null when neither finds
     * a signal — see `com.unified.health.core.data.gear.GearItemDto.toDomainOrNull` (where both are
     * applied) and `com.unified.health.core.domain.usecase.classifyGearGender` (the fallback itself).
     */
    val gender: GearGender? = null,
)

/** Gender filter (gender-filter task, 2026-11-12): the feed's four possible values, mirrored 1:1 from
 *  the service's own `"men"` / `"women"` / `"unisex"` / `"kids"` strings (case-insensitive, see
 *  `com.unified.health.core.data.gear.GearItemDto`'s mapping) — never guessed when the feed itself
 *  gives one; see [GearItem.gender]. */
enum class GearGender {
    MEN, WOMEN, UNISEX, KIDS
}

/** One color option of a [GearItem], each with its own image and link-out URL. */
data class GearVariant(
    val color: String,
    val imageUrl: String?,
    val productUrl: String,
)

enum class GearCategory {
    SHOES,
    APPAREL,
    ACCESSORIES,
}
