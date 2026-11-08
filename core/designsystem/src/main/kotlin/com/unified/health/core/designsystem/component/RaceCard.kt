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
import androidx.compose.foundation.layout.sizeIn
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
import androidx.compose.ui.draw.blur
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
 * icon behind the text — never a blank/placeholder-gray card, since some races in the feed still
 * have no image. Shared as-is by the Home carousel and the full `RacesScreen` list
 * (docs/DECISIONS.md D-1105) so both render identically; the caller only controls width via
 * [modifier] (a fixed width for the carousel, `fillMaxWidth()` for the list).
 *
 * D-1136/D-1142/D-1146: a real photo now gets its own layout ([RaceCardWithPhoto]) — a full-card
 * blurred "ambient backdrop" of the photo behind the text, plus a sharp corner thumbnail of the same
 * photo at its native aspect ratio (D-1142 moved the thumbnail off a fixed-ratio full-width hero band,
 * which cropped/distorted the feed's very inconsistent real image ratios; D-1146 then moved it to the
 * bottom-right corner and doubled its size after user feedback that D-1142's version read too small)
 * — instead of D-1129's full-bleed overlay+scrim. A race still on the terrain-gradient fallback keeps
 * the original single-layer look ([RaceCardWithGradient]), unchanged by any of D-1136/D-1142/D-1146.
 */
@Composable
fun RaceCard(race: Race, onClick: () -> Unit, modifier: Modifier = Modifier) {
    val today = rememberToday()
    val imageUrl = race.imageUrl
    Card(onClick = onClick, modifier = modifier.height(RaceCardHeight)) {
        if (imageUrl != null) {
            RaceCardWithPhoto(race, imageUrl, today)
        } else {
            RaceCardWithGradient(race, today)
        }
    }
}

/**
 * D-1142/D-1146: layout for a race with a real photo. The feed's real crawled images (D-1111) come in
 * very inconsistent aspect ratios (tall posters, wide banners, squares); forcing them into a
 * fixed-ratio full-width hero band (D-1136's original approach) cropped/distorted many of them badly.
 * Instead: a blurred, scaled-to-fill copy of the photo covers the *entire* card as an ambient backdrop
 * ([RaceImageBackdrop]) — this handles any ratio gracefully, since it's blurred and scaled rather than
 * shown as-is — and a sharp thumbnail of the same photo, sized to its own native aspect ratio (never
 * forced square or full-width), sits in the **bottom-right** corner as a badge-like accent (D-1146;
 * D-1142 originally put it top-right at half this size, but that read too small). All of the card's
 * text stays on the blurred backdrop; the whole text column's width is capped short of the thumbnail
 * (not just the bottom info row) because the doubled thumbnail is tall enough on a portrait-oriented
 * photo to reach up alongside the name/date block too, not just the distances/price/CTA row below it.
 */
@Composable
private fun RaceCardWithPhoto(race: Race, imageUrl: String, today: LocalDate) {
    Box(Modifier.fillMaxSize()) {
        RaceImageBackdrop(imageUrl, Modifier.fillMaxSize())
        Box(
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(Spacing.sm)
                .sizeIn(maxWidth = RaceThumbnailMaxSize, maxHeight = RaceThumbnailMaxSize)
                .clip(RoundedCornerShape(Spacing.xs)),
        ) {
            // Fit (not Crop/fillMaxSize) so this block's own measured size follows the image's native
            // aspect ratio within the sizeIn cap above, instead of a fixed square/full-size footprint.
            RaceHeroImage(imageUrl, contentScale = ContentScale.Fit)
        }
        Column(
            // D-1146: reserves space along the *whole* right edge of the text column (not only next to
            // the bottom info row) — the thumbnail is bottom-right now and twice as large, so a tall
            // portrait-oriented photo can reach up far enough to sit behind the name/date block too.
            modifier = Modifier.fillMaxSize().padding(Spacing.lg).padding(end = RaceThumbnailReservedWidth),
            verticalArrangement = Arrangement.SpaceBetween,
        ) {
            Column(verticalArrangement = Arrangement.spacedBy(Spacing.xs)) {
                TerrainBadge(race.terrain)
                RaceNameText(race.name, style = MaterialTheme.typography.titleLarge, maxLines = 2)
                Text(raceDateLine(race, today), style = MaterialTheme.typography.bodyMedium, color = Color.White.copy(alpha = 0.92f))
            }
            RaceCardBottomInfo(race)
        }
    }
}

/** D-1146: doubled from D-1142's original 64dp — the small thumbnail read too small at that size. */
private val RaceThumbnailMaxSize = 128.dp

/** Thumbnail's own [RaceThumbnailMaxSize] plus its outer padding and a little breathing room. */
private val RaceThumbnailReservedWidth = 152.dp

/** D-1106: unchanged by D-1136 — a race with no real image yet keeps the original full-bleed
 *  gradient-background-with-overlaid-text look. */
@Composable
private fun RaceCardWithGradient(race: Race, today: LocalDate) {
    Box(Modifier.fillMaxSize()) {
        RaceGradientBackground(race.terrain, Modifier.fillMaxSize())
        Column(modifier = Modifier.fillMaxSize().padding(Spacing.lg), verticalArrangement = Arrangement.SpaceBetween) {
            Column(verticalArrangement = Arrangement.spacedBy(Spacing.xs)) {
                TerrainBadge(race.terrain)
                RaceNameText(race.name, style = MaterialTheme.typography.titleLarge, maxLines = 2)
                Text(raceDateLine(race, today), style = MaterialTheme.typography.bodyMedium, color = Color.White.copy(alpha = 0.92f))
            }
            RaceCardBottomInfo(race)
        }
    }
}

/** Distances/price/CTA block, identical in both [RaceCardWithPhoto] and [RaceCardWithGradient]. */
@Composable
private fun RaceCardBottomInfo(race: Race) {
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

/**
 * D-1106/D-1136: terrain-keyed gradient + a large faint terrain icon — the background for a race
 * with no real [Race.imageUrl] yet. Used both for [RaceCardWithGradient] and `RaceDetailScreen`'s
 * hero when a race has no image (D-1114). Before D-1136 this composable (then named
 * `RaceVisualBackground`) also handled the real-image case as a full-bleed background; D-1136 moved
 * that case onto [RaceCardWithPhoto]/[RaceImageBackdrop] instead, since a real photo no longer sits
 * *behind* overlaid text the same way, so this is gradient-only now.
 */
@Composable
fun RaceGradientBackground(terrain: RaceTerrain, modifier: Modifier = Modifier, terrainIconSize: Dp = 140.dp) {
    Box(modifier) {
        Box(Modifier.fillMaxSize().background(terrain.gradient()))
        Icon(
            terrain.icon(),
            contentDescription = null,
            tint = Color.White.copy(alpha = 0.18f),
            modifier = Modifier.align(Alignment.BottomEnd).padding(Spacing.xs).size(terrainIconSize),
        )
    }
}

/**
 * A race's own promotional photo, shown plain with no scrim/overlay — [RaceCardWithPhoto]'s corner
 * thumbnail (D-1142) and `RaceDetailScreen`'s header (D-1114) both use this. Kept here, not a direct
 * Coil call in feature modules, so `core/designsystem` stays the only module depending on Coil
 * (D-1109).
 */
@Composable
fun RaceHeroImage(imageUrl: String, modifier: Modifier = Modifier, contentScale: ContentScale = ContentScale.Crop) {
    AsyncImage(model = imageUrl, contentDescription = null, modifier = modifier, contentScale = contentScale)
}

/**
 * D-1136/D-1142: a blurred copy of the race's own photo plus a light scrim — the "ambient backdrop"
 * behind [RaceCardWithPhoto]. D-1142 widened this from just the text section to the *entire* card, so
 * it also sits behind the small corner thumbnail there, handling any of the feed's wildly inconsistent
 * real image ratios gracefully (it's blurred/scaled-to-fill, not shown as-is). Much less contrast to
 * guarantee than D-1129's heavier scrim, since this sits over a deliberately softened version of the
 * image rather than the sharp original.
 *
 * `Modifier.blur()` only performs a real blur from API 31 onward; below that (down to this app's
 * minSdk 26) Compose silently skips it rather than crashing — a documented, acceptable platform
 * degradation (no manual fallback needed), leaving just the scrim over the unblurred photo there.
 */
@Composable
fun RaceImageBackdrop(imageUrl: String, modifier: Modifier = Modifier) {
    Box(modifier) {
        AsyncImage(
            model = imageUrl,
            contentDescription = null,
            modifier = Modifier.fillMaxSize().blur(RaceBackdropBlurRadius),
            contentScale = ContentScale.Crop,
        )
        Box(Modifier.fillMaxSize().background(Color.Black.copy(alpha = RaceBackdropScrimAlpha)))
    }
}

private val RaceBackdropBlurRadius = 24.dp
private const val RaceBackdropScrimAlpha = 0.35f

/**
 * The race-name [Text], auto-sized instead of ellipsized (D-1112/D-1125): shrinks down to
 * [RaceNameMinFontSize] to fit [maxLines] before ever truncating, and never grows past [style]'s own
 * font size. Shared by [RaceCard] and `RaceDetailScreen` so both use the exact same technique.
 * [color] defaults to white (both of [RaceCard]'s layouts put this over a dark image/gradient/backdrop)
 * but `RaceDetailScreen` (D-1136) overrides it when the name sits on the plain page background instead.
 */
@Composable
fun RaceNameText(name: String, modifier: Modifier = Modifier, style: TextStyle = MaterialTheme.typography.titleLarge, color: Color = Color.White, maxLines: Int = 2) {
    Text(
        name,
        style = style,
        fontWeight = FontWeight.Bold,
        color = color,
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
