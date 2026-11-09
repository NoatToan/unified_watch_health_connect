package com.unified.health.core.data.races

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

/**
 * Reads the races feed snapshot bundled inside the APK (`assets/races/latest.json`, D-1184) so a
 * fresh install — no DataStore cache yet — with no network at first launch still shows races right
 * away instead of sitting on [com.unified.health.core.domain.repository.RacesState.Loading]/
 * [com.unified.health.core.domain.repository.RacesState.Error] until the user retries manually.
 *
 * A plain functional interface (rather than wiring [Context] straight into
 * [RemoteRacesRepository]) keeps that class's existing 4-arg test constructor compiling unchanged.
 */
fun interface BundledRacesSource {
    /** Raw JSON, same schema as the network feed, or null if the asset is missing/unreadable. */
    fun read(): String?
}

internal class AssetBundledRacesSource @Inject constructor(
    @ApplicationContext private val context: Context,
) : BundledRacesSource {

    override fun read(): String? = runCatching {
        context.assets.open(ASSET_PATH).bufferedReader().use { it.readText() }
    }.getOrNull()

    private companion object {
        const val ASSET_PATH = "races/latest.json"
    }
}
