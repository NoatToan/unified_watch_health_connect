package com.unified.health.core.designsystem.util

import android.content.Context
import android.net.Uri
import androidx.browser.customtabs.CustomTabsIntent

/**
 * Opens [url] in a Chrome Custom Tab (docs/DECISIONS.md D-1105): a race's `registrationUrl` opens
 * without the user ever fully leaving the app, no in-app `WebView` to build/maintain ourselves.
 * Swallows failures (no browser installed, malformed URL, …) — a tap on a race card must never
 * crash the app.
 */
fun launchInCustomTab(context: Context, url: String) {
    runCatching { CustomTabsIntent.Builder().build().launchUrl(context, Uri.parse(url)) }
}
