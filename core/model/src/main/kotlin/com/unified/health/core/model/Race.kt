package com.unified.health.core.model

import java.time.LocalDate

/**
 * A Vietnam running race, crawled daily by the sibling `unified_health_service` project and
 * published as static JSON (docs/DECISIONS.md D-1105/D-1107). Marketing content meant to drive
 * registration clicks, not personal health data — kept out of [com.unified.health.core.model]'s
 * health-tracking types on purpose, and out of `HealthDataRepository`.
 *
 * Only the fields the UI actually renders are kept here; the source feed also carries per-source
 * provenance (`sources`, `firstSeenAt`, `lastUpdatedAt`) that nothing in the app needs yet.
 */
data class Race(
    val id: String,
    val name: String,
    val startDate: LocalDate,
    val endDate: LocalDate?,
    val province: String?,
    val location: String?,
    val terrain: RaceTerrain,
    val distances: List<RaceDistance>,
    val priceFromVnd: Long?,
    val registrationStatus: RaceRegistrationStatus,
    val organizer: String?,
    val registrationUrl: String,
    val imageUrl: String?,
)

data class RaceDistance(
    val label: String,
    val km: Double,
    val priceVnd: Long?,
    val status: RaceRegistrationStatus,
)

enum class RaceTerrain {
    ROAD,
    TRAIL,
    CITY_TRAIL,
    ULTRA,
    TRIATHLON,
    VIRTUAL,
}

enum class RaceRegistrationStatus {
    OPEN,
    CLOSED,
    SOLD_OUT,
    UNKNOWN,
}
