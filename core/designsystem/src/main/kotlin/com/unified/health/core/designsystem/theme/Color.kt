package com.unified.health.core.designsystem.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

// Brand palette generated from seed #00897B (teal) with the Material Theme Builder tonal approach.
internal val Teal10 = Color(0xFF00201C)
internal val Teal20 = Color(0xFF003731)
internal val Teal30 = Color(0xFF005048)
internal val Teal40 = Color(0xFF006A60)
internal val Teal80 = Color(0xFF53DBC9)
internal val Teal90 = Color(0xFF74F8E5)

internal val Blue10 = Color(0xFF001E2F)
internal val Blue20 = Color(0xFF09344C)
internal val Blue30 = Color(0xFF274B64)
internal val Blue40 = Color(0xFF40637D)
internal val Blue80 = Color(0xFFA8CBEA)
internal val Blue90 = Color(0xFFCCE5FF)

internal val Coral10 = Color(0xFF3B0907)
internal val Coral20 = Color(0xFF5C1A15)
internal val Coral30 = Color(0xFF7A2F28)
internal val Coral40 = Color(0xFF9A453D)
internal val Coral80 = Color(0xFFFFB4AA)
internal val Coral90 = Color(0xFFFFDAD5)

internal val Red10 = Color(0xFF410002)
internal val Red20 = Color(0xFF690005)
internal val Red30 = Color(0xFF93000A)
internal val Red40 = Color(0xFFBA1A1A)
internal val Red80 = Color(0xFFFFB4AB)
internal val Red90 = Color(0xFFFFDAD6)

internal val Neutral4 = Color(0xFF0B0F0E)
internal val Neutral6 = Color(0xFF0E1513)
internal val Neutral10 = Color(0xFF171D1B)
internal val Neutral12 = Color(0xFF1B2120)
internal val Neutral17 = Color(0xFF252B2A)
internal val Neutral20 = Color(0xFF2B3230)
internal val Neutral22 = Color(0xFF303635)
internal val Neutral24 = Color(0xFF343B39)
internal val Neutral87 = Color(0xFFD5DBD8)
internal val Neutral90 = Color(0xFFDDE4E1)
internal val Neutral92 = Color(0xFFE3EAE7)
internal val Neutral94 = Color(0xFFE9EFEC)
internal val Neutral95 = Color(0xFFECF2EF)
internal val Neutral96 = Color(0xFFEFF5F2)
internal val Neutral98 = Color(0xFFF4FBF8)
internal val Neutral100 = Color(0xFFFFFFFF)

internal val NeutralVariant30 = Color(0xFF3F4946)
internal val NeutralVariant50 = Color(0xFF6F7976)
internal val NeutralVariant60 = Color(0xFF899390)
internal val NeutralVariant80 = Color(0xFFBEC9C5)
internal val NeutralVariant90 = Color(0xFFDAE5E1)

internal val LightColorScheme = lightColorScheme(
    primary = Teal40,
    onPrimary = Neutral100,
    primaryContainer = Teal90,
    onPrimaryContainer = Teal10,
    secondary = Blue40,
    onSecondary = Neutral100,
    secondaryContainer = Blue90,
    onSecondaryContainer = Blue10,
    tertiary = Coral40,
    onTertiary = Neutral100,
    tertiaryContainer = Coral90,
    onTertiaryContainer = Coral10,
    error = Red40,
    onError = Neutral100,
    errorContainer = Red90,
    onErrorContainer = Red10,
    background = Neutral98,
    onBackground = Neutral10,
    surface = Neutral98,
    onSurface = Neutral10,
    surfaceVariant = NeutralVariant90,
    onSurfaceVariant = NeutralVariant30,
    outline = NeutralVariant50,
    outlineVariant = NeutralVariant80,
    inverseSurface = Neutral20,
    inverseOnSurface = Neutral95,
    inversePrimary = Teal80,
    surfaceDim = Neutral87,
    surfaceBright = Neutral98,
    surfaceContainerLowest = Neutral100,
    surfaceContainerLow = Neutral96,
    surfaceContainer = Neutral94,
    surfaceContainerHigh = Neutral92,
    surfaceContainerHighest = Neutral90,
)

internal val DarkColorScheme = darkColorScheme(
    primary = Teal80,
    onPrimary = Teal20,
    primaryContainer = Teal30,
    onPrimaryContainer = Teal90,
    secondary = Blue80,
    onSecondary = Blue20,
    secondaryContainer = Blue30,
    onSecondaryContainer = Blue90,
    tertiary = Coral80,
    onTertiary = Coral20,
    tertiaryContainer = Coral30,
    onTertiaryContainer = Coral90,
    error = Red80,
    onError = Red20,
    errorContainer = Red30,
    onErrorContainer = Red90,
    background = Neutral6,
    onBackground = Neutral90,
    surface = Neutral6,
    onSurface = Neutral90,
    surfaceVariant = NeutralVariant30,
    onSurfaceVariant = NeutralVariant80,
    outline = NeutralVariant60,
    outlineVariant = NeutralVariant30,
    inverseSurface = Neutral90,
    inverseOnSurface = Neutral20,
    inversePrimary = Teal40,
    surfaceDim = Neutral6,
    surfaceBright = Neutral24,
    surfaceContainerLowest = Neutral4,
    surfaceContainerLow = Neutral10,
    surfaceContainer = Neutral12,
    surfaceContainerHigh = Neutral17,
    surfaceContainerHighest = Neutral22,
)
