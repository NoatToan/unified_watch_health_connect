package com.unified.health.core.data

import androidx.datastore.preferences.core.PreferenceDataStoreFactory
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.longPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import com.unified.health.core.data.gear.RemoteGearRepository
import com.unified.health.core.domain.repository.GearState
import com.unified.health.core.model.GearCategory
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
 * [RemoteGearRepository] against a real [OkHttpClient] whose only interceptor short-circuits the
 * chain with a canned response — mirrors
 * `com.unified.health.core.data.RemoteRacesRepositoryTest`'s own fake-interceptor technique exactly.
 */
@OptIn(ExperimentalCoroutinesApi::class)
class RemoteGearRepositoryTest {

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
        RemoteGearRepository(store, httpClient, backgroundScope, Dispatchers.Unconfined)

    @Test
    fun `a malformed entry missing productUrl is dropped, the rest of the feed still parses`() = runTest {
        val store = newStore("gear-prefs1.preferences_pb")
        val json = """
            {
              "items": [
                { "id": "ok-1", "name": "Cap", "brand": "Puma", "category": "accessories", "productUrl": "https://example.com/ok-1" },
                { "id": "malformed", "name": "No product URL" },
                { "name": "No id", "productUrl": "https://example.com/no-id" }
              ]
            }
        """.trimIndent()
        val repository = repository(store, client { request -> jsonResponse(request, json) })

        runCurrent()
        val state = repository.items.first() as GearState.Success
        assertEquals(listOf("ok-1"), state.items.map { it.id })
    }

    @Test
    fun `variants parse with their own color-image-url, and an empty variants array stays empty`() = runTest {
        val store = newStore("gear-prefs2.preferences_pb")
        val json = """
            {
              "items": [
                {
                  "id": "with-variants",
                  "name": "Cap",
                  "brand": "Puma",
                  "category": "accessories",
                  "productUrl": "https://example.com/with-variants",
                  "variants": [
                    { "color": "Speed Blue", "imageUrl": "https://example.com/blue.png", "productUrl": "https://example.com/blue" },
                    { "color": "Missing product url" },
                    { "imageUrl": "https://example.com/no-color.png", "productUrl": "https://example.com/no-color" }
                  ]
                },
                {
                  "id": "no-variants",
                  "name": "Backpack",
                  "brand": "Salomon",
                  "category": "accessories",
                  "productUrl": "https://example.com/no-variants",
                  "variants": []
                }
              ]
            }
        """.trimIndent()
        val repository = repository(store, client { request -> jsonResponse(request, json) })

        runCurrent()
        val state = repository.items.first() as GearState.Success
        val withVariants = state.items.single { it.id == "with-variants" }
        assertEquals(1, withVariants.variants.size)
        assertEquals("Speed Blue", withVariants.variants.single().color)
        assertEquals("https://example.com/blue.png", withVariants.variants.single().imageUrl)

        val noVariants = state.items.single { it.id == "no-variants" }
        assertTrue(noVariants.variants.isEmpty())
    }

    @Test
    fun `category parses case-insensitively and an unrecognized value defaults to ACCESSORIES`() = runTest {
        val store = newStore("gear-prefs3.preferences_pb")
        val json = """
            {
              "items": [
                { "id": "shoes-1", "name": "Shoe", "productUrl": "https://example.com/a", "category": "SHOES" },
                { "id": "apparel-1", "name": "Shirt", "productUrl": "https://example.com/b", "category": "apparel" },
                { "id": "no-category", "name": "Mystery item", "productUrl": "https://example.com/c" },
                { "id": "bad-category", "name": "Garbled", "productUrl": "https://example.com/d", "category": "not-a-real-category" }
              ]
            }
        """.trimIndent()
        val repository = repository(store, client { request -> jsonResponse(request, json) })

        runCurrent()
        val state = repository.items.first() as GearState.Success
        val categoryById = state.items.associate { it.id to it.category }
        assertEquals(GearCategory.SHOES, categoryById["shoes-1"])
        assertEquals(GearCategory.APPAREL, categoryById["apparel-1"])
        assertEquals(GearCategory.ACCESSORIES, categoryById["no-category"])
        assertEquals(GearCategory.ACCESSORIES, categoryById["bad-category"])
    }

    @Test
    fun `priceVnd and description are nullable and optional`() = runTest {
        val store = newStore("gear-prefs4.preferences_pb")
        val json = """
            {
              "items": [
                { "id": "with-price", "name": "Item", "productUrl": "https://example.com/a", "priceVnd": 550000, "description": "Nice item" },
                { "id": "no-price", "name": "Item 2", "productUrl": "https://example.com/b" }
              ]
            }
        """.trimIndent()
        val repository = repository(store, client { request -> jsonResponse(request, json) })

        runCurrent()
        val state = repository.items.first() as GearState.Success
        val withPrice = state.items.single { it.id == "with-price" }
        assertEquals(550000L, withPrice.priceVnd)
        assertEquals("Nice item", withPrice.description)

        val noPrice = state.items.single { it.id == "no-price" }
        assertNull(noPrice.priceVnd)
        assertNull(noPrice.description)
    }

    @Test
    fun `empty items array is Empty, not Error`() = runTest {
        val store = newStore("gear-prefs5.preferences_pb")
        val repository = repository(store, client { request -> jsonResponse(request, """{"items": []}""") })

        runCurrent()
        assertEquals(GearState.Empty, repository.items.first())
    }

    @Test
    fun `a 404 with no cache surfaces Error, never crashes`() = runTest {
        val store = newStore("gear-prefs6.preferences_pb")
        val repository = repository(store, client { request -> jsonResponse(request, "", code = 404) })

        runCurrent()
        assertTrue(repository.items.first() is GearState.Error)
    }

    @Test
    fun `a fresh cache is served without any network call`() = runTest {
        val store = newStore("gear-prefs7.preferences_pb")
        store.edit {
            it[stringPreferencesKey("gear_cache_json")] =
                """{"items": [{"id": "cached", "name": "Cached item", "productUrl": "https://example.com/cached"}]}"""
            it[longPreferencesKey("gear_cache_fetched_at_epoch_ms")] = Instant.now().toEpochMilli()
        }
        var networkCalls = 0
        val repository = repository(store, client { request -> networkCalls++; jsonResponse(request, """{"items": []}""") })

        runCurrent()
        val state = repository.items.first() as GearState.Success
        assertEquals("cached", state.items.single().id)
        assertEquals(0, networkCalls)
    }

    @Test
    fun `a background refresh failure keeps the last known-good data instead of surfacing Error`() = runTest {
        val store = newStore("gear-prefs8.preferences_pb")
        val json = """{"items": [{"id": "good", "name": "Good item", "productUrl": "https://example.com/good"}]}"""
        var fail = false
        val repository = repository(store, client { request -> if (fail) throw IOException("boom") else jsonResponse(request, json) })

        runCurrent()
        assertTrue(repository.items.first() is GearState.Success)

        fail = true
        repository.refresh()
        runCurrent()

        val state = repository.items.first()
        assertTrue(state is GearState.Success)
        assertEquals("good", (state as GearState.Success).items.single().id)
    }
}
