package com.unified.health.core.data.gear

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.longPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import com.unified.health.core.domain.repository.GearRepository
import com.unified.health.core.domain.repository.GearState
import com.unified.health.core.model.GearItem
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
import javax.inject.Inject
import javax.inject.Singleton

private object GearCacheKeys {
    /** Lives in the same `user_preferences` DataStore file as the races cache (its own, differently
     *  prefixed keys) and [com.unified.health.core.model.UserPreferences]. */
    val cachedJson = stringPreferencesKey("gear_cache_json")
    val cachedAtEpochMs = longPreferencesKey("gear_cache_fetched_at_epoch_ms")
}

/**
 * Fetches the reference-gear feed published by the sibling `unified_health_service` project, parses
 * it and caches the raw JSON + fetch timestamp in DataStore — exact same fetch/cache/fallback shape
 * as [com.unified.health.core.data.races.RemoteRacesRepository] (24h TTL, last-known-good on a
 * failed refresh, never blocks the UI on a slow/offline/404 network call).
 */
@Singleton
class RemoteGearRepository(
    private val dataStore: DataStore<Preferences>,
    private val httpClient: OkHttpClient,
    private val scope: CoroutineScope,
    private val ioDispatcher: CoroutineDispatcher,
) : GearRepository {

    /**
     * Production entry point: its own real-dispatcher scope, like
     * [com.unified.health.core.data.races.RemoteRacesRepository]'s `@Inject` constructor. The 4-arg
     * constructor instead takes an explicit [scope]/[ioDispatcher] so tests can pass `backgroundScope`
     * and a dispatcher sharing the same (virtual-time) scheduler [dataStore] runs on.
     */
    @Inject
    constructor(dataStore: DataStore<Preferences>, httpClient: OkHttpClient) :
        this(dataStore, httpClient, CoroutineScope(SupervisorJob() + Dispatchers.IO), Dispatchers.IO)

    private val _state = MutableStateFlow<GearState>(GearState.Loading)
    override val items: Flow<GearState> = _state.asStateFlow()

    init {
        scope.launch { loadFromCacheThenMaybeRefresh() }
    }

    override suspend fun refresh() = fetchAndStore()

    private suspend fun loadFromCacheThenMaybeRefresh() {
        val prefs = dataStore.data.first()
        val cachedJson = prefs[GearCacheKeys.cachedJson]
        val cachedAt = prefs[GearCacheKeys.cachedAtEpochMs]?.let(Instant::ofEpochMilli)
        val cachedItems = cachedJson?.let(::parseOrNull)
        if (cachedItems != null) _state.value = toState(cachedItems)

        // A corrupted/unparsable cache forces an immediate refetch regardless of age.
        val isStale = cachedAt == null || cachedItems == null || Duration.between(cachedAt, Instant.now()) > CACHE_TTL
        if (isStale) fetchAndStore()
    }

    private suspend fun fetchAndStore() {
        try {
            val json = fetchJson()
            val parsed = parseOrNull(json) ?: throw IllegalStateException("Malformed gear feed")
            dataStore.edit {
                it[GearCacheKeys.cachedJson] = json
                it[GearCacheKeys.cachedAtEpochMs] = Instant.now().toEpochMilli()
            }
            _state.value = toState(parsed)
        } catch (e: CancellationException) {
            throw e
        } catch (e: Exception) {
            onFetchFailed(e)
        }
    }

    /**
     * Never overwrites data already on screen — only surfaces [GearState.Error] when there is
     * nothing cached to fall back to yet (same rationale as `RemoteRacesRepository`).
     */
    private fun onFetchFailed(e: Exception) {
        if (_state.value !is GearState.Success) {
            _state.value = GearState.Error(e.message ?: "Unable to load gear")
        }
    }

    private suspend fun fetchJson(): String = withContext(ioDispatcher) {
        val request = Request.Builder().url(GEAR_URL).get().build()
        httpClient.newCall(request).execute().use { response ->
            if (!response.isSuccessful) throw IOException("HTTP ${response.code}")
            response.body?.string()?.takeIf { it.isNotBlank() } ?: throw IOException("Empty response body")
        }
    }

    private fun parseOrNull(json: String): List<GearItem>? =
        runCatching { JSON.decodeFromString(GearFeedDto.serializer(), json).items.mapNotNull { it.toDomainOrNull() } }.getOrNull()

    private fun toState(items: List<GearItem>): GearState =
        if (items.isEmpty()) GearState.Empty else GearState.Success(items)

    private companion object {
        const val GEAR_URL = "https://noattoan.github.io/unified_health_service/gear/latest.json"
        val CACHE_TTL: Duration = Duration.ofHours(24)
        val JSON = Json { ignoreUnknownKeys = true }
    }
}
