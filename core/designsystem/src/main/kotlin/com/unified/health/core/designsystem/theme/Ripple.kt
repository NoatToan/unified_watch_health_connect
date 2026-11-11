package com.unified.health.core.designsystem.theme

import androidx.compose.material.ripple.RippleAlpha
import androidx.compose.material3.LocalRippleConfiguration
import androidx.compose.material3.RippleConfiguration
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider

/**
 * D-1189: new default — interactive elements *inside a screen's own content* (cards, list rows,
 * buttons in a screen body) get no ripple by default; app chrome (the pill bottom nav, a
 * `TopAppBar`'s own icons/actions) keeps the normal Material ripple. `UnifiedHealthApp` wraps its
 * whole `UnifiedHealthNavHost` call in `CompositionLocalProvider(LocalRippleConfiguration provides
 * NoRippleConfiguration)`, so every screen inherits this by default; a screen's own `TopAppBar`
 * restores the normal ripple around just its `navigationIcon`/`actions` slot with [ChromeRipple].
 *
 * All-zero [RippleAlpha] (rather than swapping `LocalIndication` for a no-op) keeps every element's
 * existing click/press handling, semantics and role exactly as before — only the ripple's visual
 * alpha is zeroed, nothing about what counts as "pressable" changes.
 */
val NoRippleConfiguration: RippleConfiguration = RippleConfiguration(
    rippleAlpha = RippleAlpha(draggedAlpha = 0f, focusedAlpha = 0f, hoveredAlpha = 0f, pressedAlpha = 0f),
)

/**
 * Opts back into the theme's normal ripple for a slot that inherits [NoRippleConfiguration] from an
 * ancestor (every `TopAppBar`'s own `navigationIcon`/`actions`, which are "app chrome" per D-1189,
 * not that screen's own content) — `null` means "use `MaterialTheme`'s default ripple config".
 */
@Composable
fun ChromeRipple(content: @Composable () -> Unit) {
    CompositionLocalProvider(LocalRippleConfiguration provides null, content = content)
}
