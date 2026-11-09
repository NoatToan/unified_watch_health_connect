package com.unified.health.core.data.races

import android.net.ConnectivityManager
import android.net.Network
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.longPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import com.unified.health.core.domain.repository.RacesRepository
import com.unified.health.core.domain.repository.RacesState
import com.unified.health.core.model.Race
import com.unified.health.core.model.RaceRegistrationStatus
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
 * Every parseable race (past or upcoming) is kept, sorted two-tier (D-1177): races whose
 * [Race.registrationStatus] is [RaceRegistrationStatus.OPEN] ("registerable now") come first, then
 * everything else (`CLOSED`/`SOLD_OUT`/`UNKNOWN`); within each tier, soonest [Race.startDate] first.
 * This is the single sort applied before either consumer sees the list, so Home's carousel
 * (`HomeViewModel`) and the full "Tất cả giải" list (`RacesViewModel`/`RacesScreen`) never disagree
 * on order (D-1125 — superseding the D-1109 date-based drop, now that D-1113 lets `RacesScreen` show
 * past races on request); the "upcoming by default" filter still lives in the UI layer, on
 * [Race.raceStatus].
 *
 * D-1184: a fresh install has no DataStore cache yet, and a first launch with no network would
 * otherwise leave the user on [RacesState.Loading]/[RacesState.Error] with nothing to look at even
 * though the feed "always has data". [bundledRacesSource] supplies a snapshot of the feed bundled
 * inside the APK as a stand-in until the first network fetch succeeds; [connectivityManager], when
 * supplied, also retries that fetch the moment connectivity comes back instead of waiting for the
 * user to pull-to-refresh.
 */
@Singleton
class RemoteRacesRepository(
    private val dataStore: DataStore<Preferences>,
    private val httpClient: OkHttpClient,
    private val scope: CoroutineScope,
    private val ioDispatcher: CoroutineDispatcher,
    private val bundledRacesSource: BundledRacesSource = BundledRacesSource { null },
    private val connectivityManager: ConnectivityManager? = null,
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
    constructor(
        dataStore: DataStore<Preferences>,
        httpClient: OkHttpClient,
        bundledRacesSource: BundledRacesSource,
        connectivityManager: ConnectivityManager,
    ) : this(
        dataStore,
        httpClient,
        CoroutineScope(SupervisorJob() + Dispatchers.IO),
        Dispatchers.IO,
        bundledRacesSource,
        connectivityManager,
    )

    private val _state = MutableStateFlow<RacesState>(RacesState.Loading)
    override val races: Flow<RacesState> = _state.asStateFlow()

    init {
        scope.launch { loadFromCacheThenMaybeRefresh() }
        connectivityManager?.let(::registerNetworkRetry)
    }

    override suspend fun refresh() = fetchAndStore()

    private suspend fun loadFromCacheThenMaybeRefresh() {
        val prefs = dataStore.data.first()
        val cachedJson = prefs[RacesCacheKeys.cachedJson]
        val cachedAt = prefs[RacesCacheKeys.cachedAtEpochMs]?.let(Instant::ofEpochMilli)
        val cachedRaces = cachedJson?.let(::parseOrNull)
        if (cachedRaces != null) {
            _state.value = toState(cachedRaces)
        } else {
            // No usable cache (fresh install, or a corrupted entry) — show the bundled snapshot
            // immediately rather than leave the carousel empty while the fetch below is in flight.
            bundledRacesSource.read()?.let(::parseOrNull)?.let { _state.value = toState(it) }
        }

        // A corrupted/unparsable cache (or no cache at all) forces an immediate refetch regardless
        // of age — the bundled snapshot above is only ever a stand-in, never written back to it.
        val isStale = cachedAt == null || cachedRaces == null || Duration.between(cachedAt, Instant.now()) > CACHE_TTL
        if (isStale) fetchAndStore()
    }

    /**
     * Connectivity came back after an earlier fetch failure (or none has ever succeeded) — retry
     * right away instead of waiting for the next app start or a manual pull-to-refresh. Mirrors the
     * same cache-staleness check [loadFromCacheThenMaybeRefresh] uses, so this never re-fetches a
     * cache that is still within the 24h TTL just because Wi-Fi flapped.
     */
    private fun registerNetworkRetry(connectivityManager: ConnectivityManager) {
        connectivityManager.registerDefaultNetworkCallback(object : ConnectivityManager.NetworkCallback() {
            override fun onAvailable(network: Network) {
                scope.launch { if (isCacheStale()) fetchAndStore() }
            }
        })
    }

    private suspend fun isCacheStale(): Boolean {
        val prefs = dataStore.data.first()
        val cachedAt = prefs[RacesCacheKeys.cachedAtEpochMs]?.let(Instant::ofEpochMilli)
        val cachedRaces = prefs[RacesCacheKeys.cachedJson]?.let(::parseOrNull)
        return cachedAt == null || cachedRaces == null || Duration.between(cachedAt, Instant.now()) > CACHE_TTL
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

    /**
     * Keeps every parseable race, past or upcoming (D-1125: the date-based drop here was removed
     * since D-1113 lets the user opt into seeing past races on `RacesScreen`) — "upcoming by default"
     * is now a UI-layer filter on [Race.raceStatus], not something the repository hides from callers.
     * [RacesState.Empty] means the feed had no valid race at all, not "no upcoming race".
     *
     * Sort (D-1177): [RaceRegistrationStatus.OPEN] races first, then the rest, each tier by soonest
     * [Race.startDate] — the single shared ordering both Home's carousel and `RacesScreen` render.
     */
    private fun toState(races: List<Race>): RacesState {
        val sorted = races.sortedWith(
            compareBy({ it.registrationStatus != RaceRegistrationStatus.OPEN }, { it.startDate }),
        )
        return if (sorted.isEmpty()) RacesState.Empty else RacesState.Success(sorted)
    }

    private companion object {
        const val RACES_URL = "https://noattoan.github.io/unified_health_service/races/latest.json"
        val CACHE_TTL: Duration = Duration.ofHours(24)
        val JSON = Json { ignoreUnknownKeys = true }
    }
}
