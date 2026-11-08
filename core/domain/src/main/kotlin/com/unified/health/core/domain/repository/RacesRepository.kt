package com.unified.health.core.domain.repository

import com.unified.health.core.model.Race
import kotlinx.coroutines.flow.Flow

/**
 * Loading/Success/Empty/Error for the races feed (D-1107), shared by the Home carousel (D-1105,
 * hides its section on anything but a non-empty [Success]) and the full [Race] list screen (which
 * also renders [Empty]/[Error] itself, since the user navigated there on purpose).
 */
sealed interface RacesState {
    data object Loading : RacesState
    data class Success(val races: List<Race>) : RacesState
    data object Empty : RacesState
    data class Error(val message: String) : RacesState
}

/**
 * Vietnam running races, fetched from the sibling `unified_health_service` project's published
 * JSON and cached locally (D-1107) so a slow/offline/404 fetch never blocks the UI. [races] always
 * has at least Loading; a background refresh failure after a successful load keeps showing the last
 * good data rather than flipping to [RacesState.Error].
 */
interface RacesRepository {
    val races: Flow<RacesState>

    /** Pull-to-refresh / explicit retry: always hits the network regardless of cache age. */
    suspend fun refresh()
}
