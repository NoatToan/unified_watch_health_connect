package com.unified.health.feature.races.detail

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.outlined.KeyboardArrowRight
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.unified.health.core.designsystem.component.AppScreen
import com.unified.health.core.designsystem.component.DistancePills
import com.unified.health.core.designsystem.component.EmptyState
import com.unified.health.core.designsystem.component.LoadingState
import com.unified.health.core.designsystem.component.RaceCoverImage
import com.unified.health.core.designsystem.component.RaceGradientBackground
import com.unified.health.core.designsystem.component.RaceNameText
import com.unified.health.core.designsystem.component.TerrainBadge
import com.unified.health.core.designsystem.component.ctaLabel
import com.unified.health.core.designsystem.component.formatVnd
import com.unified.health.core.designsystem.theme.ChromeRipple
import com.unified.health.core.designsystem.theme.Gaps
import com.unified.health.core.designsystem.theme.Spacing
import com.unified.health.core.designsystem.util.launchInCustomTab
import com.unified.health.core.model.Race
import com.unified.health.core.model.RaceRegistrationStatus
import java.time.format.DateTimeFormatter

@Composable
internal fun RaceDetailRoute(onBack: () -> Unit, viewModel: RaceDetailViewModel = hiltViewModel()) {
    val state by viewModel.uiState.collectAsStateWithLifecycle()
    RaceDetailScreen(state = state, onBack = onBack)
}

/**
 * The in-app stop between a race card and the registration webview (D-1114): large header image
 * (or the same terrain-gradient fallback as [com.unified.health.core.designsystem.component.RaceCard]
 * when there's none), name, date, location, distances, price and `description` — then one prominent
 * CTA that is now the *only* place opening Chrome Custom Tabs for this race.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun RaceDetailScreen(state: RaceDetailUiState, onBack: () -> Unit) {
    AppScreen(
        title = "",
        topBar = {
            TopAppBar(
                title = {},
                // D-1189: app chrome, not this screen's own content — restores the normal ripple.
                navigationIcon = { ChromeRipple { IconButton(onClick = onBack) { Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back") } } },
                // Transparent so the back button floats over the header image/gradient (D-1114), not
                // a solid app-bar strip above it.
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.Transparent),
            )
        },
    ) { contentPadding ->
        when (state) {
            RaceDetailUiState.Loading -> LoadingState(Modifier.padding(contentPadding))
            RaceDetailUiState.NotFound -> EmptyState(
                title = "Không tìm thấy giải chạy",
                message = "Giải chạy này có thể đã bị gỡ khỏi danh sách.",
                modifier = Modifier.padding(contentPadding),
            )
            // D-1151/D-1194: contentPadding (top-bar height + nav-bar inset) now chained AFTER
            // verticalScroll inside RaceDetailContent (never as an outer Modifier.padding before it)
            // — the CTA at the end of the scrollable content scrolls fully behind the gesture bar
            // instead of a fixed gap that's never reachable, and the hero image can scroll up behind
            // the transparent app bar above as intended. Horizontal is still intentionally left out so
            // the header image stays edge-to-edge side to side.
            is RaceDetailUiState.Success -> RaceDetailContent(state.race, contentPadding)
        }
    }
}

private val RaceDateFormat: DateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")
private val HeaderHeight = 280.dp
private val CtaHeight = 56.dp

/**
 * D-1136: unlike [com.unified.health.core.designsystem.component.RaceCard]'s photo layout, this
 * screen's hero doesn't need the blurred-backdrop trick — there's already a whole plain-background
 * content column below for text, so the hero is simply the clean, uncropped-by-overlay photo (or the
 * terrain gradient when there's no real image yet) with nothing drawn over it; the terrain badge and
 * race name move down into that content column instead of sitting on top of the hero.
 *
 * D-1150: a real photo now sizes itself to its own true aspect ratio via [RaceCoverImage] instead of
 * the fixed [HeaderHeight] band (still used only by the no-image gradient fallback below, which has
 * no intrinsic ratio of its own to read).
 */
@Composable
private fun RaceDetailContent(race: Race, contentPadding: PaddingValues) {
    val context = LocalContext.current
    val imageUrl = race.imageUrl
    Column(Modifier.fillMaxSize().verticalScroll(rememberScrollState()).padding(contentPadding)) {
        if (imageUrl != null) {
            RaceCoverImage(imageUrl, Modifier.fillMaxWidth())
        } else {
            RaceGradientBackground(race.terrain, Modifier.fillMaxWidth().height(HeaderHeight), terrainIconSize = 220.dp)
        }
        Column(Modifier.fillMaxWidth().padding(Gaps.cardPadding), verticalArrangement = Arrangement.spacedBy(Gaps.sectionGap)) {
            Column(verticalArrangement = Arrangement.spacedBy(Gaps.cardContentGap)) {
                TerrainBadge(race.terrain)
                RaceNameText(
                    race.name,
                    style = MaterialTheme.typography.headlineMedium,
                    color = MaterialTheme.colorScheme.onBackground,
                    maxLines = 3,
                )
            }
            Text(RaceDateFormat.format(race.startDate), style = MaterialTheme.typography.titleMedium)

            val place = race.location ?: race.province
            if (place != null) {
                Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(Spacing.xs)) {
                    Icon(Icons.Outlined.LocationOn, contentDescription = null, tint = MaterialTheme.colorScheme.onSurfaceVariant)
                    Text(place, style = MaterialTheme.typography.bodyLarge, color = MaterialTheme.colorScheme.onSurfaceVariant)
                }
            }

            // D-1125: [DistancePills] is styled for white text over the card's own gradient/photo,
            // but its labels read fine on a plain surface background too — reused unmodified rather
            // than forking a second "light" variant just for this screen.
            if (race.distances.isNotEmpty()) DistancePills(race.distances)

            race.priceFromVnd?.let {
                Text("Từ ${formatVnd(it)}", style = MaterialTheme.typography.titleMedium, color = MaterialTheme.colorScheme.primary)
            }

            // D-1114: a null description (crawler hasn't extracted one yet) simply omits this
            // section — never an empty box or placeholder text.
            race.description?.let { description ->
                Text(description, style = MaterialTheme.typography.bodyMedium)
            }

            RaceDetailCta(race.registrationStatus) { launchInCustomTab(context, race.registrationUrl) }
        }
    }
}

/**
 * Full-width CTA button (D-1114) — the only place in the app that still opens Chrome Custom Tabs for
 * a race. Reuses [RaceRegistrationStatus.ctaLabel] for the exact same 4 Vietnamese labels
 * [com.unified.health.core.designsystem.component.RaceCard] shows, rather than the card's own
 * white-on-gradient pill styling (not a fit for a plain-surface screen section) — see D-1125.
 */
@Composable
private fun RaceDetailCta(status: RaceRegistrationStatus, onClick: () -> Unit) {
    val content: @Composable RowScope.() -> Unit = {
        Text(status.ctaLabel(), style = MaterialTheme.typography.titleMedium)
        if (status == RaceRegistrationStatus.OPEN) {
            Spacer(Modifier.width(Spacing.xxs))
            Icon(Icons.AutoMirrored.Outlined.KeyboardArrowRight, contentDescription = null)
        }
    }
    val ctaModifier = Modifier.fillMaxWidth().height(CtaHeight)
    if (status == RaceRegistrationStatus.OPEN) {
        Button(onClick = onClick, modifier = ctaModifier, content = content)
    } else {
        FilledTonalButton(onClick = onClick, modifier = ctaModifier, content = content)
    }
}
