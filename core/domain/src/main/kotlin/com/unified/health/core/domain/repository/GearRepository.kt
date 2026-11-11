package com.unified.health.core.domain.repository

import com.unified.health.core.model.GearItem
import kotlinx.coroutines.flow.Flow

/**
 * Loading/Success/Empty/Error for the gear feed — mirrors [RacesState]/[RacesRepository]'s own
 * shape exactly. [Success.items] holds every parseable [GearItem]; category filtering is a UI-layer
 * concern on [GearItem.category], not something this state distinguishes. [Empty] means the feed had
 * no valid item at all.
 */
sealed interface GearState {
    data object Loading : GearState
    data class Success(val items: List<GearItem>) : GearState
    data object Empty : GearState
    data class Error(val message: String) : GearState
}

/**
 * Reference running gear (shoes/apparel/accessories) from real brands, fetched from the sibling
 * `unified_health_service` project's published JSON and cached locally (same 24h-TTL pattern as
 * [RacesRepository]) so a slow/offline/404 fetch never blocks the UI — the last-known-good cache
 * stays on screen while a fetch is retried.
 */
interface GearRepository {
    val items: Flow<GearState>

    /** Pull-to-refresh / explicit retry: always hits the network regardless of cache age. */
    suspend fun refresh()
}
