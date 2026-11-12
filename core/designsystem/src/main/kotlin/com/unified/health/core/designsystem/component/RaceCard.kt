package com.unified.health.core.designsystem.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.unified.health.core.designsystem.theme.Gaps
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
 * D-1136/D-1142/D-1146/D-1161/D-1197: a real photo now gets its own layout ([RaceCardWithPhoto]) - a
 * full-card blurred "ambient backdrop" of the photo behind the text, plus a small sharp thumbnail of
 * the same photo at its native aspect ratio as a compact accent chip next to the title (D-1142 moved
 * the thumbnail off a fixed-ratio full-width hero band, which cropped/distorted the feed's very
 * inconsistent real image ratios; D-1146 then moved it to a large bottom-right corner slab, which a
 * real-device screenshot showed crowding the card's own content; D-1161 moved it to a small top-row
 * chip; D-1197 folded that top row into the header itself, a 70/30 split beside the title) - instead
 * of D-1129's full-bleed overlay+scrim. A race still on the terrain-gradient fallback keeps the
 * original single-layer look ([RaceCardWithGradient]), unchanged by any of D-1136/D-1142/D-1146/D-1161
 * (D-1197 only changed layout/maxLines there, not the gradient/single-layer look itself).
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
 * D-1142/D-1146/D-1161/D-1197: layout for a race with a real photo. The feed's real crawled images
 * (D-1111) come in very inconsistent aspect ratios (tall posters, wide banners, squares); forcing them
 * into a fixed-ratio full-width hero band (D-1136's original approach) cropped/distorted many of them
 * badly. Instead: a blurred, scaled-to-fill copy of the photo covers the *entire* card as an ambient
 * backdrop ([RaceImageBackdrop]) - this handles any ratio gracefully, since it's blurred and scaled
 * rather than shown as-is - and a small sharp thumbnail of the same photo ([RaceThumbnailBadge]), sized
 * to its own native aspect ratio (never forced square or full-width), sits as a compact accent chip.
 *
 * D-1142 put this top-right at 64dp (user: too small). D-1146 doubled it to 128dp and moved it
 * bottom-right, spanning most of the card's height so both the name/date block and the bottom
 * price/CTA row had to reserve end-padding to avoid it. A real-device screenshot taken for D-1161
 * showed that version overwhelming the card: the slab visually crowded the price/CTA row sitting right
 * beside it, and the thumbnail's own busy poster content (logos, banner text) competed with the card's
 * own typography. D-1161 moved it back to a much smaller, independently-width/height capped size
 * ([RaceThumbnailMaxWidth]/[RaceThumbnailMaxHeight]) so it never stretches into a slab regardless of
 * the source photo's aspect ratio. D-1197 then folded it into the header row alongside
 * [TerrainBadge]+title ([RaceCardFlexibleContent]'s 70/30 split) instead of a separate row above them,
 * to give the title more vertical room; see [RaceCardFlexibleContent] for the current layout and the
 * clipping-bug rationale.
 */
@Composable
private fun RaceCardWithPhoto(race: Race, imageUrl: String, today: LocalDate) {
    Box(Modifier.fillMaxSize()) {
        RaceImageBackdrop(imageUrl, Modifier.fillMaxSize())
        Column(modifier = Modifier.fillMaxSize().padding(Gaps.cardPadding)) {
            RaceCardFlexibleContent(race, today, imageUrl, modifier = Modifier.weight(1f))
            RaceCardBottomInfo(race)
        }
    }
}

/**
 * D-1161: the sharp-photo accent, a small chip next to [TerrainBadge]/the title instead of the large
 * bottom-right slab D-1146 left it as. A thin translucent-white border and background keep it reading
 * as a deliberate little "badge" (same visual language as TerrainBadge/DistancePills' pills) rather
 * than a raw cropped rectangle of someone else's poster pasted on top of the card.
 */
@Composable
private fun RaceThumbnailBadge(imageUrl: String) {
    Box(
        modifier = Modifier
            .sizeIn(maxWidth = RaceThumbnailMaxWidth, maxHeight = RaceThumbnailMaxHeight)
            .clip(RoundedCornerShape(Spacing.xs))
            .background(Color.White.copy(alpha = 0.12f))
            .border(1.dp, Color.White.copy(alpha = 0.4f), RoundedCornerShape(Spacing.xs)),
    ) {
        // Fit (not Crop/fillMaxSize) so this block's own measured size follows the image's native
        // aspect ratio within the sizeIn cap above, instead of a fixed square/full-size footprint.
        RaceHeroImage(imageUrl, contentScale = ContentScale.Fit)
    }
}

/** D-1161: capped on both axes independently (unlike D-1142/D-1146's single square cap) so even a wide
 *  landscape source photo stays a compact top-row chip instead of stretching wide across the card. */
private val RaceThumbnailMaxWidth = 72.dp
private val RaceThumbnailMaxHeight = 56.dp

/** D-1106: unchanged by D-1136 — a race with no real image yet keeps the original full-bleed
 *  gradient-background-with-overlaid-text look. D-1197: now shares [RaceCardFlexibleContent] with
 *  [RaceCardWithPhoto] (passing a null `imageUrl`, so the header has no logo column and the title
 *  gets the full card width + an extra max line). */
@Composable
private fun RaceCardWithGradient(race: Race, today: LocalDate) {
    Box(Modifier.fillMaxSize()) {
        RaceGradientBackground(race.terrain, Modifier.fillMaxSize())
        Column(modifier = Modifier.fillMaxSize().padding(Gaps.cardPadding)) {
            RaceCardFlexibleContent(race, today, imageUrl = null, modifier = Modifier.weight(1f))
            RaceCardBottomInfo(race)
        }
    }
}

/**
 * D-1197: the card's flexible middle - header (terrain badge + title + date, plus the photo logo when
 * there is one) and [DistancePills] - between the card's two *fixed*-height pieces: nothing above it
 * (just the card's own top padding) and [RaceCardBottomInfo] below it. Given `Modifier.weight(1f)` by
 * both callers ([RaceCardWithPhoto]/[RaceCardWithGradient]) inside their outer `Column`, so it always
 * gets exactly "whatever's left" of the card's fixed [RaceCardHeight] after [RaceCardBottomInfo] takes
 * its own full intrinsic height - [RaceCardBottomInfo] (and its CTA pill) can therefore never be pushed
 * below the card's visible bounds by this content growing, which is the actual bug this fixes: before
 * D-1197, a long 2-line race name plus a long/wrapping [DistancePills] chip could grow this section
 * taller than the leftover space, and since a plain `Column` doesn't shrink earlier children to make
 * room for later ones, the price/CTA row - the last child - got pushed off and clipped by the card's
 * own rounded-corner clip. The things that actually bound this section's *own* height so it mostly
 * doesn't need to encroach on that leftover space in the first place: [RaceNameText]'s `maxLines`
 * (2 with a logo competing for width, 3 without one) and [Pill]'s now-added `maxLines = 1` +
 * `TextOverflow.Ellipsis` (a single very long distance label, e.g. "90km đạp + 21.1km chạy (70.3)",
 * used to wrap to 2 lines inside its pill with no cap, inflating [DistancePills]'s height).
 *
 * D-1197 also reworked the header itself (user: "optimize the card's space" - the previous separate
 * top row for [TerrainBadge]+[RaceThumbnailBadge] above the title ate a full row's height on every
 * card, logo or not): now a single `Row` with a left column (70% width, terrain badge + title + date,
 * left-aligned) and - only when [imageUrl] is non-null - a right column (30% width, the logo,
 * top-aligned, flush to the end). With no logo the left column takes the Row's full width instead of
 * leaving the other 30% an empty gap, and the title gets a 3rd `maxLines` instead of 2 since it no
 * longer shares width with anything.
 */
@Composable
private fun RaceCardFlexibleContent(race: Race, today: LocalDate, imageUrl: String?, modifier: Modifier = Modifier) {
    Column(modifier = modifier, verticalArrangement = Arrangement.spacedBy(Gaps.cardContentGap)) {
        if (imageUrl != null) {
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(Spacing.sm)) {
                RaceCardHeaderText(race, today, maxLines = 2, modifier = Modifier.weight(0.7f))
                Column(modifier = Modifier.weight(0.3f), horizontalAlignment = Alignment.End) {
                    RaceThumbnailBadge(imageUrl)
                }
            }
        } else {
            RaceCardHeaderText(race, today, maxLines = 3, modifier = Modifier.fillMaxWidth())
        }
        if (race.distances.isNotEmpty()) DistancePills(race.distances)
    }
}

/** D-1197: the terrain badge + title + date stack, shared by both branches of
 *  [RaceCardFlexibleContent] so the only difference between them is [maxLines] and whether this sits
 *  alone or beside [RaceThumbnailBadge] in a Row. */
@Composable
private fun RaceCardHeaderText(race: Race, today: LocalDate, maxLines: Int, modifier: Modifier = Modifier) {
    Column(modifier = modifier, verticalArrangement = Arrangement.spacedBy(Gaps.cardContentGap)) {
        TerrainBadge(race.terrain)
        RaceNameText(race.name, style = MaterialTheme.typography.titleLarge, maxLines = maxLines)
        Text(raceDateLine(race, today), style = MaterialTheme.typography.bodyMedium, color = Color.White.copy(alpha = 0.92f))
    }
}

/**
 * Price/CTA block, identical in both [RaceCardWithPhoto] and [RaceCardWithGradient]. Always measured
 * at its own full intrinsic height (unweighted, the last child of the outer `Column`) - see
 * [RaceCardFlexibleContent]'s doc for why that's what actually keeps the CTA pill on-screen.
 *
 * D-1170: price and the CTA pill used to be two separate stacked rows (price alone on its own
 * `fillMaxWidth()` row - its `Modifier.weight(1f)` was a no-op with no sibling to share the row with
 * - then [RaceCallToAction] on its own full line below). Merging them onto one row removes a whole
 * row's worth of height. The CTA is given no weight at all ([RaceCallToAction] sizes to its own
 * content/`wrapContentWidth` by construction) so its label - even "Đã đóng đăng ký", the longest of
 * the 4 - is never shrunk or clipped; price instead yields space via `Modifier.weight(1f, fill = false)`
 * plus `maxLines = 1` + `TextOverflow.Ellipsis`, so *it* truncates first if the row is ever too narrow
 * for both. D-1197 moved [DistancePills] out of this block into [RaceCardFlexibleContent] (it's part
 * of the flexible section now, not the fixed bottom one) - this is price+CTA only.
 */
@Composable
private fun RaceCardBottomInfo(race: Race) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        // SpaceBetween (not a fixed spacedBy gap) is what pins the CTA to the row's right edge at
        // its own full natural width regardless of how wide the price text actually renders -
        // price only ever gets the *leftover* width after the (unweighted, measured-first) CTA.
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxWidth(),
    ) {
        race.priceFromVnd?.let {
            Text(
                "Từ ${formatVnd(it)}",
                style = MaterialTheme.typography.labelLarge,
                color = Color.White,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.weight(1f, fill = false).padding(end = Spacing.sm),
            )
        } ?: Spacer(Modifier.weight(1f, fill = false))
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

/**
 * D-1197: the distances-to-show/"+N" math, pulled out of [DistancePills] as a plain function so it has
 * a focused JVM unit test ([RaceCardTest]) independent of Compose - sorting longest-first and capping
 * at [MAX_DISTANCE_PILLS] is ordinary logic, not a rendering concern.
 */
internal fun visibleDistancePills(distances: List<RaceDistance>): Pair<List<RaceDistance>, Int> {
    val shown = distances.sortedByDescending { it.km }.take(MAX_DISTANCE_PILLS)
    val extra = distances.size - shown.size
    return shown to extra
}

/**
 * Reused by `RaceDetailScreen` (D-1114), same as on [RaceCard]. D-1197: this `Row` never wraps to a
 * second line by construction (a plain `Row`, not a flow layout) - what *did* grow its height before
 * D-1197 was a single [Pill]'s own [Text] wrapping internally when its label was unusually long (e.g.
 * a combined-distance label like "90km đạp + 21.1km chạy (70.3)"), since the `Row` is width-constrained
 * to the card. [Pill] now caps that at one line + ellipsis instead.
 */
@Composable
fun DistancePills(distances: List<RaceDistance>) {
    val (shown, extra) = visibleDistancePills(distances)
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
        maxLines = 1,
        overflow = TextOverflow.Ellipsis,
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
