package com.unified.health.core.data.races

import com.unified.health.core.model.Race
import com.unified.health.core.model.RaceDistance
import com.unified.health.core.model.RaceRegistrationStatus
import com.unified.health.core.model.RaceStatus
import com.unified.health.core.model.RaceTerrain
import kotlinx.serialization.Serializable
import java.time.LocalDate

/**
 * Mirrors the schema published by the sibling `unified_health_service` project
 * (`docs/DECISIONS.md` D-1105, reproduced in the task brief) — every field is optional/defaulted so
 * one unexpected/missing field from the daily crawl never fails parsing of the whole feed.
 */
@Serializable
internal data class RacesFeedDto(
    val schemaVersion: Int = 1,
    val generatedAt: String? = null,
    val sources: List<RaceSourceDto> = emptyList(),
    val races: List<RaceDto> = emptyList(),
)

@Serializable
internal data class RaceSourceDto(
    val name: String = "",
    val ok: Boolean = true,
    val count: Int = 0,
    val error: String? = null,
)

@Serializable
internal data class RaceDto(
    val id: String? = null,
    val name: String? = null,
    val startDate: String? = null,
    val endDate: String? = null,
    val province: String? = null,
    val location: String? = null,
    val terrain: String? = null,
    val distances: List<RaceDistanceDto> = emptyList(),
    val priceFromVnd: Long? = null,
    val registrationStatus: String? = null,
    val organizer: String? = null,
    val registrationUrl: String? = null,
    val imageUrl: String? = null,
    val description: String? = null,
    val raceStatus: String? = null,
)

@Serializable
internal data class RaceDistanceDto(
    val label: String? = null,
    val km: Double? = null,
    val priceVnd: Long? = null,
    val status: String? = null,
)

/**
 * Maps one feed entry to the domain model, or null when a field the UI can't do without
 * (id/name/registrationUrl/a parseable startDate) is missing or malformed — so one bad entry from
 * the crawl drops only itself, never the whole feed.
 */
internal fun RaceDto.toDomainOrNull(): Race? {
    val safeId = id?.takeIf { it.isNotBlank() } ?: return null
    val safeName = name?.takeIf { it.isNotBlank() } ?: return null
    val safeRegistrationUrl = registrationUrl?.takeIf { it.isNotBlank() } ?: return null
    val safeStartDate = startDate?.let { runCatching { LocalDate.parse(it) }.getOrNull() } ?: return null
    val safeEndDate = endDate?.let { runCatching { LocalDate.parse(it) }.getOrNull() }
    return Race(
        id = safeId,
        name = safeName,
        startDate = safeStartDate,
        endDate = safeEndDate,
        province = province?.takeIf { it.isNotBlank() },
        location = location?.takeIf { it.isNotBlank() },
        terrain = terrain.toTerrain(),
        distances = distances.mapNotNull { it.toDomainOrNull() },
        priceFromVnd = priceFromVnd,
        registrationStatus = registrationStatus.toRegistrationStatus(),
        organizer = organizer?.takeIf { it.isNotBlank() },
        registrationUrl = safeRegistrationUrl,
        imageUrl = imageUrl?.takeIf { it.isNotBlank() },
        description = description?.takeIf { it.isNotBlank() },
        raceStatus = raceStatus.toRaceStatus(),
    )
}

private fun RaceDistanceDto.toDomainOrNull(): RaceDistance? {
    val safeLabel = label?.takeIf { it.isNotBlank() } ?: return null
    val safeKm = km ?: return null
    return RaceDistance(label = safeLabel, km = safeKm, priceVnd = priceVnd, status = status.toRegistrationStatus())
}

/** Unknown/missing terrain defaults to [RaceTerrain.ROAD], the most common race type in the feed. */
private fun String?.toTerrain(): RaceTerrain =
    this?.let { raw -> RaceTerrain.entries.firstOrNull { it.name.equals(raw, ignoreCase = true) } } ?: RaceTerrain.ROAD

private fun String?.toRegistrationStatus(): RaceRegistrationStatus =
    this?.let { raw -> RaceRegistrationStatus.entries.firstOrNull { it.name.equals(raw, ignoreCase = true) } }
        ?: RaceRegistrationStatus.UNKNOWN

/** Missing/unrecognized `raceStatus` defaults to [RaceStatus.UPCOMING] (D-1111/D-1125) — the crawler
 *  computes this from the crawl date, so a gap here (field not live yet, or a stray value) should
 *  never silently hide a race the user would otherwise expect to see by default. */
private fun String?.toRaceStatus(): RaceStatus =
    this?.let { raw -> RaceStatus.entries.firstOrNull { it.name.equals(raw, ignoreCase = true) } } ?: RaceStatus.UPCOMING
