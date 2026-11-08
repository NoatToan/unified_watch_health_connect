package com.unified.health.core.data

import androidx.datastore.preferences.core.PreferenceDataStoreFactory
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.longPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import com.unified.health.core.data.races.RemoteRacesRepository
import com.unified.health.core.domain.repository.RacesState
import com.unified.health.core.model.RaceStatus
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.test.TestScope
import kotlinx.coroutines.test.runCurrent
import kotlinx.coroutines.test.runTest
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Protocol
import okhttp3.Request
import okhttp3.Response
import okhttp3.ResponseBody.Companion.toResponseBody
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder
import java.io.IOException
import java.time.Instant

/**
 * [RemoteRacesRepository] against a real [OkHttpClient] whose only interceptor short-circuits the
 * chain with a canned response — no mock-web-server dependency needed, no real network I/O, and the
 * actual OkHttp request/response plumbing is still exercised.
 *
 * Built with the 4-arg constructor (`backgroundScope` + `Dispatchers.Unconfined`) rather than the
 * `@Inject` one: the production constructor's real `Dispatchers.IO` hop would otherwise leave this
 * `runTest`'s virtual-time scheduler unable to see the pending work, racing it against its own
 * virtual clock (see the class doc on the 4-arg constructor).
 */
@OptIn(ExperimentalCoroutinesApi::class)
class RemoteRacesRepositoryTest {

    @get:Rule
    val folder = TemporaryFolder()

    private fun client(respond: (Request) -> Response): OkHttpClient =
        OkHttpClient.Builder().addInterceptor { chain -> respond(chain.request()) }.build()

    private fun jsonResponse(request: Request, json: String, code: Int = 200): Response = Response.Builder()
        .request(request)
        .protocol(Protocol.HTTP_1_1)
        .code(code)
        .message(if (code in 200..299) "OK" else "Error")
        .body(json.toResponseBody("application/json".toMediaType()))
        .build()

    private fun TestScope.newStore(filename: String) =
        PreferenceDataStoreFactory.create(scope = backgroundScope) { folder.newFile(filename) }

    private fun TestScope.repository(store: androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences>, httpClient: OkHttpClient) =
        RemoteRacesRepository(store, httpClient, backgroundScope, Dispatchers.Unconfined)

    @Test
    fun `fresh fetch keeps every valid race sorted by startDate, dropping malformed entries`() = runTest {
        // D-1125: past races are no longer dropped here (D-1113 needs them available for
        // RacesScreen's "show past races" toggle) — only malformed entries (no registrationUrl) are.
        val store = newStore("prefs1.preferences_pb")
        val json = """
            {
              "races": [
                { "id": "past", "name": "Past race", "startDate": "2020-01-01", "registrationUrl": "https://example.com/past", "raceStatus": "past" },
                { "id": "future-2", "name": "Later race", "startDate": "2026-12-25", "registrationUrl": "https://example.com/later", "terrain": "trail", "registrationStatus": "open" },
                { "id": "future-1", "name": "Sooner race", "startDate": "2026-11-20", "registrationUrl": "https://example.com/sooner" },
                { "id": "malformed", "name": "No registrationUrl", "startDate": "2026-12-01" }
              ]
            }
        """.trimIndent()
        val repository = repository(store, client { request -> jsonResponse(request, json) })

        runCurrent()
        val state = repository.races.first() as RacesState.Success
        assertEquals(listOf("past", "future-1", "future-2"), state.races.map { it.id })
    }

    @Test
    fun `a missing or unrecognized raceStatus defaults to upcoming, never silently hiding a race`() = runTest {
        val store = newStore("prefs7.preferences_pb")
        val json = """
            {
              "races": [
                { "id": "no-status", "name": "No status field", "startDate": "2026-12-01", "registrationUrl": "https://example.com/a" },
                { "id": "garbled-status", "name": "Garbled status", "startDate": "2026-12-02", "registrationUrl": "https://example.com/b", "raceStatus": "not-a-real-value" },
                { "id": "explicit-past", "name": "Explicit past", "startDate": "2026-12-03", "registrationUrl": "https://example.com/c", "raceStatus": "past" },
                { "id": "explicit-upcoming", "name": "Explicit upcoming", "startDate": "2026-12-04", "registrationUrl": "https://example.com/d", "raceStatus": "UPCOMING" }
              ]
            }
        """.trimIndent()
        val repository = repository(store, client { request -> jsonResponse(request, json) })

        runCurrent()
        val state = repository.races.first() as RacesState.Success
        val statusById = state.races.associate { it.id to it.raceStatus }
        assertEquals(RaceStatus.UPCOMING, statusById["no-status"])
        assertEquals(RaceStatus.UPCOMING, statusById["garbled-status"])
        assertEquals(RaceStatus.PAST, statusById["explicit-past"])
        assertEquals(RaceStatus.UPCOMING, statusById["explicit-upcoming"])
    }

    @Test
    fun `description is parsed when present and null when absent or blank`() = runTest {
        val store = newStore("prefs8.preferences_pb")
        val json = """
            {
              "races": [
                { "id": "with-desc", "name": "Has description", "startDate": "2026-12-01", "registrationUrl": "https://example.com/a", "description": "A scenic road race." },
                { "id": "no-desc", "name": "No description", "startDate": "2026-12-02", "registrationUrl": "https://example.com/b" },
                { "id": "blank-desc", "name": "Blank description", "startDate": "2026-12-03", "registrationUrl": "https://example.com/c", "description": "   " }
              ]
            }
        """.trimIndent()
        val repository = repository(store, client { request -> jsonResponse(request, json) })

        runCurrent()
        val state = repository.races.first() as RacesState.Success
        val descriptionById = state.races.associate { it.id to it.description }
        assertEquals("A scenic road race.", descriptionById["with-desc"])
        assertNull(descriptionById["no-desc"])
        assertNull(descriptionById["blank-desc"])
    }

    @Test
    fun `empty races array is Empty, not Error`() = runTest {
        val store = newStore("prefs2.preferences_pb")
        val repository = repository(store, client { request -> jsonResponse(request, """{"races": []}""") })

        runCurrent()
        assertEquals(RacesState.Empty, repository.races.first())
    }

    @Test
    fun `a 404 with no cache surfaces Error, never crashes`() = runTest {
        val store = newStore("prefs3.preferences_pb")
        val repository = repository(store, client { request -> jsonResponse(request, "", code = 404) })

        runCurrent()
        assertTrue(repository.races.first() is RacesState.Error)
    }

    @Test
    fun `a fresh cache is served without any network call`() = runTest {
        val store = newStore("prefs4.preferences_pb")
        store.edit {
            it[stringPreferencesKey("races_cache_json")] =
                """{"races": [{"id": "cached", "name": "Cached race", "startDate": "2026-12-01", "registrationUrl": "https://example.com/cached"}]}"""
            it[longPreferencesKey("races_cache_fetched_at_epoch_ms")] = Instant.now().toEpochMilli()
        }
        var networkCalls = 0
        val repository = repository(store, client { request -> networkCalls++; jsonResponse(request, """{"races": []}""") })

        runCurrent()
        val state = repository.races.first() as RacesState.Success
        assertEquals("cached", state.races.single().id)
        assertEquals(0, networkCalls)
    }

    @Test
    fun `a stale cache is replaced once the background refetch completes`() = runTest {
        val store = newStore("prefs5.preferences_pb")
        store.edit {
            it[stringPreferencesKey("races_cache_json")] =
                """{"races": [{"id": "stale", "name": "Stale race", "startDate": "2026-12-01", "registrationUrl": "https://example.com/stale"}]}"""
            // Older than the 24h cache TTL (D-1107).
            it[longPreferencesKey("races_cache_fetched_at_epoch_ms")] = Instant.now().minusSeconds(25 * 3_600).toEpochMilli()
        }
        val freshJson = """{"races": [{"id": "fresh", "name": "Fresh race", "startDate": "2026-12-01", "registrationUrl": "https://example.com/fresh"}]}"""
        val repository = repository(store, client { request -> jsonResponse(request, freshJson) })

        runCurrent()
        val state = repository.races.first() as RacesState.Success
        assertEquals("fresh", state.races.single().id)
    }

    @Test
    fun `a background refresh failure keeps the last known-good data instead of surfacing Error`() = runTest {
        val store = newStore("prefs6.preferences_pb")
        val json = """{"races": [{"id": "good", "name": "Good race", "startDate": "2026-12-01", "registrationUrl": "https://example.com/good"}]}"""
        var fail = false
        val repository = repository(store, client { request -> if (fail) throw IOException("boom") else jsonResponse(request, json) })

        runCurrent()
        assertTrue(repository.races.first() is RacesState.Success)

        fail = true
        repository.refresh()
        runCurrent()

        val state = repository.races.first()
        assertTrue(state is RacesState.Success)
        assertEquals("good", (state as RacesState.Success).races.single().id)
    }
}
