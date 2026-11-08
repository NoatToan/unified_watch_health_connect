package com.unified.health.core.data.races

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.longPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import com.unified.health.core.domain.repository.RacesRepository
import com.unified.health.core.domain.repository.RacesState
import com.unified.health.core.model.Race
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlinx.serialization.json.Json
import okhttp3.OkHttpClient
import okhttp3.Request
import java.io.IOException
import java.time.Duration
import java.time.Instant
import java.time.LocalDate
import javax.inject.Inject
import javax.inject.Singleton

private object RacesCacheKeys {
    /** Lives in the same `user_preferences` DataStore file as [com.unified.health.core.model.UserPreferences]. */
    val cachedJson = stringPreferencesKey("races_cache_json")
    val cachedAtEpochMs = longPreferencesKey("races_cache_fetched_at_epoch_ms")
}

/**
 * Fetches the races feed published by the sibling `unified_health_service` project
 * (docs/DECISIONS.md D-1105/D-1107), parses it and caches the raw JSON + fetch timestamp in
 * DataStore so the app never needs to re-fetch more than once a day, and a slow/offline/404 network
 * call never blocks the UI: the last-known-good cache stays on screen while a fetch is retried.
 *
 * Only races happening today or later are kept (D-1109): a crawled race whose date has passed is no
 * longer actionable for the "register now" purpose this feed exists for, so the one filtered/sorted
 * list here is shared as-is by both the Home carousel and the full `RacesScreen` list.
 */
@Singleton
class RemoteRacesRepository(
    private val dataStore: DataStore<Preferences>,
    private val httpClient: OkHttpClient,
    private val scope: CoroutineScope,
    private val ioDispatcher: CoroutineDispatcher,
) : RacesRepository {

    /**
     * Production entry point: its own real-dispatcher scope, like
     * [com.unified.health.core.data.live.DefaultLiveHealthRepository]. The 4-arg constructor
     * instead takes an explicit [scope]/[ioDispatcher] so tests can pass `backgroundScope` and a
     * dispatcher that shares the same (virtual-time) scheduler [dataStore] runs on — a real
     * [Dispatchers.IO] hop from inside a `runTest` otherwise "disappears" from the test scheduler's
     * view and races its own virtual clock.
     */
    @Inject
    constructor(dataStore: DataStore<Preferences>, httpClient: OkHttpClient) :
        this(dataStore, httpClient, CoroutineScope(SupervisorJob() + Dispatchers.IO), Dispatchers.IO)

    private val _state = MutableStateFlow<RacesState>(RacesState.Loading)
    override val races: Flow<RacesState> = _state.asStateFlow()

    init {
        scope.launch { loadFromCacheThenMaybeRefresh() }
    }

    override suspend fun refresh() = fetchAndStore()

    private suspend fun loadFromCacheThenMaybeRefresh() {
        val prefs = dataStore.data.first()
        val cachedJson = prefs[RacesCacheKeys.cachedJson]
        val cachedAt = prefs[RacesCacheKeys.cachedAtEpochMs]?.let(Instant::ofEpochMilli)
        val cachedRaces = cachedJson?.let(::parseOrNull)
        if (cachedRaces != null) _state.value = toState(cachedRaces)

        // A corrupted/unparsable cache forces an immediate refetch regardless of age.
        val isStale = cachedAt == null || cachedRaces == null || Duration.between(cachedAt, Instant.now()) > CACHE_TTL
        if (isStale) fetchAndStore()
    }

    private suspend fun fetchAndStore() {
        try {
            val json = fetchJson()
            val parsed = parseOrNull(json) ?: throw IllegalStateException("Malformed races feed")
            dataStore.edit {
                it[RacesCacheKeys.cachedJson] = json
                it[RacesCacheKeys.cachedAtEpochMs] = Instant.now().toEpochMilli()
            }
            _state.value = toState(parsed)
        } catch (e: CancellationException) {
            throw e
        } catch (e: Exception) {
            onFetchFailed(e)
        }
    }

    /**
     * Never overwrites data already on screen (D-1107: a background/explicit refresh failing must
     * not block or regress the UI) — only surfaces [RacesState.Error] when there is nothing cached
     * to fall back to yet.
     */
    private fun onFetchFailed(e: Exception) {
        if (_state.value !is RacesState.Success) {
            _state.value = RacesState.Error(e.message ?: "Unable to load races")
        }
    }

    private suspend fun fetchJson(): String = withContext(ioDispatcher) {
        val request = Request.Builder().url(RACES_URL).get().build()
        httpClient.newCall(request).execute().use { response ->
            if (!response.isSuccessful) throw IOException("HTTP ${response.code}")
            response.body?.string()?.takeIf { it.isNotBlank() } ?: throw IOException("Empty response body")
        }
    }

    private fun parseOrNull(json: String): List<Race>? =
        runCatching { JSON.decodeFromString(RacesFeedDto.serializer(), json).races.mapNotNull { it.toDomainOrNull() } }.getOrNull()

    private fun toState(races: List<Race>): RacesState {
        val today = LocalDate.now()
        val upcoming = races.filter { (it.endDate ?: it.startDate) >= today }.sortedBy { it.startDate }
        return if (upcoming.isEmpty()) RacesState.Empty else RacesState.Success(upcoming)
    }

    private companion object {
        const val RACES_URL = "https://noattoan.github.io/unified_health_service/races/latest.json"
        val CACHE_TTL: Duration = Duration.ofHours(24)
        val JSON = Json { ignoreUnknownKeys = true }
    }
}
