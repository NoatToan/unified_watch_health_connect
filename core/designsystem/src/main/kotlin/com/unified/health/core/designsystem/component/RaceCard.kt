package com.unified.health.core.designsystem.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.TextAutoSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.DirectionsRun
import androidx.compose.material.icons.automirrored.outlined.KeyboardArrowRight
import androidx.compose.material.icons.outlined.LocationCity
import androidx.compose.material.icons.outlined.Pool
import androidx.compose.material.icons.outlined.Terrain
import androidx.compose.material.icons.outlined.Videocam
import androidx.compose.material.icons.outlined.Whatshot
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.unified.health.core.designsystem.theme.Spacing
import com.unified.health.core.model.Race
import com.unified.health.core.model.RaceCountdown
import com.unified.health.core.model.RaceDistance
import com.unified.health.core.model.RaceRegistrationStatus
import com.unified.health.core.model.RaceTerrain
import kotlinx.coroutines.delay
import java.time.LocalDate
import java.time.format.DateTimeFormatter

/**
 * Catchy marketing card for one [Race] (docs/DECISIONS.md D-1106): a real [Race.imageUrl] via Coil
 * when present, otherwise a gradient background keyed by [RaceTerrain] with a large faint terrain
 * icon behind the text — never a blank/placeholder-gray card, since most races in the feed
 * currently have no image. Shared as-is by the Home carousel and the full `RacesScreen` list
 * (docs/DECISIONS.md D-1105) so both render identically; the caller only controls width via
 * [modifier] (a fixed width for the carousel, `fillMaxWidth()` for the list).
 */
@Composable
fun RaceCard(race: Race, onClick: () -> Unit, modifier: Modifier = Modifier) {
    val today = rememberToday()
    Card(onClick = onClick, modifier = modifier.height(RaceCardHeight)) {
        Box(Modifier.fillMaxSize()) {
            RaceVisualBackground(race, Modifier.fillMaxSize())
            Column(modifier = Modifier.fillMaxSize().padding(Spacing.lg), verticalArrangement = Arrangement.SpaceBetween) {
                Column(verticalArrangement = Arrangement.spacedBy(Spacing.xs)) {
                    TerrainBadge(race.terrain)
                    RaceNameText(race.name, style = MaterialTheme.typography.titleLarge, maxLines = 2)
                    Text(raceDateLine(race, today), style = MaterialTheme.typography.bodyMedium, color = Color.White.copy(alpha = 0.92f))
                }
                Column(verticalArrangement = Arrangement.spacedBy(Spacing.sm)) {
                    if (race.distances.isNotEmpty()) DistancePills(race.distances)
                    Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()) {
                        race.priceFromVnd?.let {
                            Text(
                                "Từ ${formatVnd(it)}",
                                style = MaterialTheme.typography.labelLarge,
                                color = Color.White,
                                modifier = Modifier.weight(1f),
                            )
                        } ?: Spacer(Modifier.weight(1f))
                    }
                    RaceCallToAction(race.registrationStatus)
                }
            }
        }
    }
}

/**
 * Shared full-bleed visual for a [Race] (D-1106/D-1125): a real [Race.imageUrl] via Coil with a
 * bottom scrim so overlaid white text stays legible, or — since most races in the feed have no
 * image — a gradient keyed by [RaceTerrain] with a large faint terrain icon. Reused as-is by
 * [RaceCard] and `RaceDetailScreen` (D-1114) so both render the exact same fallback, not two
 * hand-maintained copies of this rule. Fills whatever [modifier] gives it (typically `fillMaxSize()`
 * inside a `Box` of the caller's chosen height).
 */
@Composable
fun RaceVisualBackground(race: Race, modifier: Modifier = Modifier, terrainIconSize: Dp = 140.dp) {
    Box(modifier) {
        if (race.imageUrl != null) {
            AsyncImage(
                model = race.imageUrl,
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop,
            )
            Box(
                Modifier.fillMaxSize().background(
                    Brush.verticalGradient(listOf(Color.Transparent, Color.Black.copy(alpha = 0.72f))),
                ),
            )
        } else {
            Box(Modifier.fillMaxSize().background(race.terrain.gradient()))
            Icon(
                race.terrain.icon(),
                contentDescription = null,
                tint = Color.White.copy(alpha = 0.18f),
                modifier = Modifier.align(Alignment.BottomEnd).padding(Spacing.xs).size(terrainIconSize),
            )
        }
    }
}

/**
 * The race-name [Text], auto-sized instead of ellipsized (D-1112/D-1125): shrinks down to
 * [RaceNameMinFontSize] to fit [maxLines] before ever truncating, and never grows past [style]'s own
 * font size. Shared by [RaceCard] and `RaceDetailScreen` so both use the exact same technique.
 */
@Composable
fun RaceNameText(name: String, modifier: Modifier = Modifier, style: TextStyle = MaterialTheme.typography.titleLarge, maxLines: Int = 2) {
    Text(
        name,
        style = style,
        fontWeight = FontWeight.Bold,
        color = Color.White,
        maxLines = maxLines,
        autoSize = TextAutoSize.StepBased(minFontSize = RaceNameMinFontSize, maxFontSize = style.fontSize, stepSize = 1.sp),
        modifier = modifier,
    )
}

private val RaceNameMinFontSize = 13.sp

/** Recomputed hourly so a card left open across midnight keeps an accurate "Còn N ngày" (D-1106). */
@Composable
private fun rememberToday(): LocalDate {
    var today by remember { mutableStateOf(LocalDate.now()) }
    LaunchedEffect(Unit) {
        while (true) {
            delay(TODAY_REFRESH_INTERVAL_MS)
            today = LocalDate.now()
        }
    }
    return today
}

private const val TODAY_REFRESH_INTERVAL_MS = 60 * 60 * 1000L

private val RaceDateFormat: DateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")

private fun raceDateLine(race: Race, today: LocalDate): String {
    val countdownText = when (val countdown = RaceCountdown.of(race.startDate, race.endDate, today)) {
        is RaceCountdown.DaysUntilStart -> "Còn ${countdown.days} ngày"
        RaceCountdown.Ongoing -> "Đang diễn ra"
        RaceCountdown.Past -> "Đã kết thúc"
    }
    return "${RaceDateFormat.format(race.startDate)} · $countdownText"
}

/** Reused by `RaceDetailScreen` (D-1114) over the header image, same as on [RaceCard]. */
@Composable
fun TerrainBadge(terrain: RaceTerrain) {
    Row(
        modifier = Modifier
            .clip(RoundedCornerShape(50))
            .background(Color.Black.copy(alpha = 0.35f))
            .padding(horizontal = Spacing.sm, vertical = Spacing.xxs),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(Spacing.xxs),
    ) {
        Icon(terrain.icon(), contentDescription = null, tint = Color.White, modifier = Modifier.size(14.dp))
        Text(terrain.label(), style = MaterialTheme.typography.labelSmall, color = Color.White)
    }
}

private const val MAX_DISTANCE_PILLS = 4

/** Reused by `RaceDetailScreen` (D-1114), same as on [RaceCard]. */
@Composable
fun DistancePills(distances: List<RaceDistance>) {
    val shown = distances.sortedByDescending { it.km }.take(MAX_DISTANCE_PILLS)
    val extra = distances.size - shown.size
    Row(horizontalArrangement = Arrangement.spacedBy(Spacing.xs)) {
        shown.forEach { distance -> Pill(distance.label) }
        if (extra > 0) Pill("+$extra")
    }
}

@Composable
private fun Pill(text: String) {
    Text(
        text,
        style = MaterialTheme.typography.labelMedium,
        color = Color.White,
        modifier = Modifier
            .clip(RoundedCornerShape(50))
            .background(Color.White.copy(alpha = 0.22f))
            .padding(horizontal = Spacing.sm, vertical = Spacing.xxs),
    )
}

/**
 * Vietnamese label for a race's CTA, by [RaceRegistrationStatus] (D-1106/D-1125) — the single source
 * of these 4 strings, shared by [RaceCallToAction]'s in-card pill and `RaceDetailScreen`'s full-width
 * CTA button (D-1114), which has its own styling and so reuses the label logic, not the pill itself.
 */
fun RaceRegistrationStatus.ctaLabel(): String = when (this) {
    RaceRegistrationStatus.OPEN -> "Đăng ký ngay"
    RaceRegistrationStatus.CLOSED -> "Đã đóng đăng ký"
    RaceRegistrationStatus.SOLD_OUT -> "Hết vé"
    // Status wasn't reported by the crawl; don't claim it's open, but the card/button is still tappable.
    RaceRegistrationStatus.UNKNOWN -> "Xem chi tiết"
}

/** D-1106: closed/sold-out races show their state instead of a CTA — never invite a click that can't register. */
@Composable
private fun RaceCallToAction(status: RaceRegistrationStatus) {
    when (status) {
        RaceRegistrationStatus.OPEN -> Row(
            modifier = Modifier
                .clip(RoundedCornerShape(50))
                .background(MaterialTheme.colorScheme.primary)
                .padding(horizontal = Spacing.lg, vertical = Spacing.sm),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(Spacing.xxs),
        ) {
            Text(status.ctaLabel(), style = MaterialTheme.typography.labelLarge, color = MaterialTheme.colorScheme.onPrimary, fontWeight = FontWeight.Bold)
            Icon(Icons.AutoMirrored.Outlined.KeyboardArrowRight, contentDescription = null, tint = MaterialTheme.colorScheme.onPrimary, modifier = Modifier.size(18.dp))
        }
        RaceRegistrationStatus.CLOSED, RaceRegistrationStatus.SOLD_OUT, RaceRegistrationStatus.UNKNOWN -> ClosedBadge(status.ctaLabel())
    }
}

@Composable
private fun ClosedBadge(text: String) {
    Text(
        text,
        style = MaterialTheme.typography.labelLarge,
        color = Color.White,
        modifier = Modifier
            .clip(RoundedCornerShape(50))
            .background(Color.White.copy(alpha = 0.22f))
            .padding(horizontal = Spacing.lg, vertical = Spacing.sm),
    )
}

/** 6 distinct, vibrant-but-on-brand gradient color pairs, one per [RaceTerrain] (D-1106). Exposed
 *  separately from [gradient] so the actual colors (not just an opaque, reference-equality-only
 *  [Brush] instance) are what tests assert distinctness over. */
fun RaceTerrain.gradientColors(): List<Color> = when (this) {
    RaceTerrain.ROAD -> listOf(Color(0xFF1565C0), Color(0xFF42A5F5))
    RaceTerrain.TRAIL -> listOf(Color(0xFF2E7D32), Color(0xFF81C784))
    RaceTerrain.CITY_TRAIL -> listOf(Color(0xFF6A1B9A), Color(0xFFBA68C8))
    RaceTerrain.ULTRA -> listOf(Color(0xFFBF360C), Color(0xFFFF8A65))
    RaceTerrain.TRIATHLON -> listOf(Color(0xFF00695C), Color(0xFF4DB6AC))
    RaceTerrain.VIRTUAL -> listOf(Color(0xFF283593), Color(0xFF7986CB))
}

fun RaceTerrain.gradient(): Brush = Brush.linearGradient(gradientColors())

fun RaceTerrain.icon(): ImageVector = when (this) {
    RaceTerrain.ROAD -> Icons.AutoMirrored.Outlined.DirectionsRun
    RaceTerrain.TRAIL -> Icons.Outlined.Terrain
    RaceTerrain.CITY_TRAIL -> Icons.Outlined.LocationCity
    RaceTerrain.ULTRA -> Icons.Outlined.Whatshot
    RaceTerrain.TRIATHLON -> Icons.Outlined.Pool
    RaceTerrain.VIRTUAL -> Icons.Outlined.Videocam
}

fun RaceTerrain.label(): String = when (this) {
    RaceTerrain.ROAD -> "Đường nhựa"
    RaceTerrain.TRAIL -> "Đường mòn"
    RaceTerrain.CITY_TRAIL -> "Trail đô thị"
    RaceTerrain.ULTRA -> "Ultra"
    RaceTerrain.TRIATHLON -> "Ba môn phối hợp"
    RaceTerrain.VIRTUAL -> "Giải ảo"
}

/** "790.000đ" — Vietnamese thousands grouping, without relying on `vi-VN` locale data being present. */
fun formatVnd(amountVnd: Long): String {
    val grouped = amountVnd.toString().reversed().chunked(3).joinToString(".").reversed()
    return "${grouped}đ"
}

private val RaceCardHeight = 220.dp
