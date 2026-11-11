package com.unified.health.core.data.gear

import com.unified.health.core.model.GearCategory
import com.unified.health.core.model.GearItem
import com.unified.health.core.model.GearVariant
import kotlinx.serialization.Serializable

/**
 * Mirrors the schema published by the sibling `unified_health_service` project's gear feed (the
 * live `gear/latest.json` fetched for this task's brief) — every field is optional/defaulted, same
 * as [com.unified.health.core.data.races.RacesFeedDto], so one unexpected/missing field from a given
 * crawl source (PUMA VN, Salomon VN, …) never fails parsing of the whole feed.
 */
@Serializable
internal data class GearFeedDto(
    val schemaVersion: Int = 1,
    val generatedAt: String? = null,
    val sources: List<GearSourceDto> = emptyList(),
    val items: List<GearItemDto> = emptyList(),
)

@Serializable
internal data class GearSourceDto(
    val name: String = "",
    val ok: Boolean = true,
    val count: Int = 0,
    val error: String? = null,
)

@Serializable
internal data class GearItemDto(
    val id: String? = null,
    val name: String? = null,
    val brand: String? = null,
    val category: String? = null,
    val sourceName: String? = null,
    val priceVnd: Long? = null,
    val description: String? = null,
    val imageUrl: String? = null,
    val productUrl: String? = null,
    val variants: List<GearVariantDto> = emptyList(),
    val crawledAt: String? = null,
)

@Serializable
internal data class GearVariantDto(
    val color: String? = null,
    val imageUrl: String? = null,
    val productUrl: String? = null,
)

/**
 * Maps one feed entry to the domain model, or null when a field the UI can't do without
 * (id/name/productUrl) is missing or blank — so one bad entry from the crawl drops only itself,
 * never the whole feed. Mirrors [com.unified.health.core.data.races.RaceDto.toDomainOrNull].
 */
internal fun GearItemDto.toDomainOrNull(): GearItem? {
    val safeId = id?.takeIf { it.isNotBlank() } ?: return null
    val safeName = name?.takeIf { it.isNotBlank() } ?: return null
    val safeProductUrl = productUrl?.takeIf { it.isNotBlank() } ?: return null
    return GearItem(
        id = safeId,
        name = safeName,
        brand = brand?.takeIf { it.isNotBlank() } ?: "",
        category = category.toGearCategory(),
        priceVnd = priceVnd,
        description = description?.takeIf { it.isNotBlank() },
        imageUrl = imageUrl?.takeIf { it.isNotBlank() },
        productUrl = safeProductUrl,
        variants = variants.mapNotNull { it.toDomainOrNull() },
    )
}

private fun GearVariantDto.toDomainOrNull(): GearVariant? {
    val safeColor = color?.takeIf { it.isNotBlank() } ?: return null
    val safeProductUrl = productUrl?.takeIf { it.isNotBlank() } ?: return null
    return GearVariant(color = safeColor, imageUrl = imageUrl?.takeIf { it.isNotBlank() }, productUrl = safeProductUrl)
}

/** Unknown/missing category defaults to [GearCategory.ACCESSORIES] — the feed's own largest bucket,
 *  and the safest default: an accessory with no size/fit concerns, unlike guessing SHOES/APPAREL. */
private fun String?.toGearCategory(): GearCategory =
    this?.let { raw -> GearCategory.entries.firstOrNull { it.name.equals(raw, ignoreCase = true) } } ?: GearCategory.ACCESSORIES
