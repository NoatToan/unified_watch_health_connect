package com.unified.health.core.designsystem.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.LocalContext

/**
 * App theme. Uses Material You dynamic color on Android 12+ when [dynamicColor] is true,
 * otherwise falls back to the teal brand scheme. Metric accent colors are always brand colors.
 */
@Composable
fun UnifiedHealthTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit,
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }
    val metricColors = if (darkTheme) DarkMetricColors else LightMetricColors

    CompositionLocalProvider(LocalMetricColors provides metricColors) {
        MaterialTheme(
            colorScheme = colorScheme,
            typography = UnifiedHealthTypography,
            shapes = UnifiedHealthShapes,
            content = content,
        )
    }
}

/** Convenience accessor: `UnifiedHealthTheme.metricColors.steps`. */
object UnifiedHealthTheme {
    val metricColors: MetricColors
        @Composable get() = LocalMetricColors.current
}
