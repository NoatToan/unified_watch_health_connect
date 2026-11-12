package com.unified.health.feature.gear.detail

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.OpenInNew
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.unified.health.core.designsystem.component.AppScreen
import com.unified.health.core.designsystem.component.EmptyState
import com.unified.health.core.designsystem.component.GearImage
import com.unified.health.core.designsystem.component.LoadingState
import com.unified.health.core.designsystem.component.formatVnd
import com.unified.health.core.designsystem.theme.Gaps
import com.unified.health.core.designsystem.theme.Spacing
import com.unified.health.core.model.GearItem
import com.unified.health.core.model.GearVariant

@Composable
internal fun GearDetailRoute(onBack: () -> Unit, viewModel: GearDetailViewModel = hiltViewModel()) {
    val state by viewModel.uiState.collectAsStateWithLifecycle()
    GearDetailScreen(state = state, onBack = onBack, onSelectVariant = viewModel::selectVariant)
}

/**
 * One gear item's in-app detail: full image (swapped by the selected color variant, if any), name,
 * brand, price, and the link-out CTA — the only place in `feature/gear` that opens the brand's own
 * product page. [onSelectVariant] is the first-class color-picker interaction this task's brief
 * calls out, since the (separate, later) "add to my wardrobe" task builds directly on it.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun GearDetailScreen(state: GearDetailUiState, onBack: () -> Unit, onSelectVariant: (String?) -> Unit) {
    AppScreen(title = "", onBack = onBack) { contentPadding ->
        when (state) {
            GearDetailUiState.Loading -> LoadingState(Modifier.padding(contentPadding))
            GearDetailUiState.NotFound -> EmptyState(
                title = "Không tìm thấy trang bị",
                message = "Sản phẩm này có thể đã bị gỡ khỏi danh mục.",
                modifier = Modifier.padding(contentPadding),
            )
            is GearDetailUiState.Success -> GearDetailContent(state, onSelectVariant, contentPadding)
        }
    }
}

@Composable
private fun GearDetailContent(state: GearDetailUiState.Success, onSelectVariant: (String?) -> Unit, contentPadding: PaddingValues) {
    val context = LocalContext.current
    val item = state.item
    // D-1194: contentPadding chained AFTER verticalScroll (not as an outer Modifier.padding before
    // it) — the CTA at the bottom scrolls fully behind the gesture bar instead of stopping above it.
    Column(Modifier.fillMaxSize().verticalScroll(rememberScrollState()).padding(contentPadding)) {
        GearImage(state.displayImageUrl, Modifier.fillMaxWidth().aspectRatio(1f).testTag("gear_detail_image"))
        Column(Modifier.fillMaxWidth().padding(Gaps.cardPadding), verticalArrangement = Arrangement.spacedBy(Gaps.sectionGap)) {
            Column(verticalArrangement = Arrangement.spacedBy(Gaps.cardContentGap)) {
                Text(item.brand, style = MaterialTheme.typography.labelLarge, color = MaterialTheme.colorScheme.primary)
                Text(item.name, style = MaterialTheme.typography.headlineSmall)
            }

            item.priceVnd?.let {
                Text(formatVnd(it), style = MaterialTheme.typography.titleLarge, color = MaterialTheme.colorScheme.primary)
            }

            if (item.variants.isNotEmpty()) {
                ColorVariantPicker(variants = item.variants, selected = state.selectedVariant, onSelect = onSelectVariant)
            }

            item.description?.let { description ->
                Text(description, style = MaterialTheme.typography.bodyMedium)
            }

            GearDetailCta(brand = item.brand, productUrl = state.productUrl, context = context)
        }
    }
}

/**
 * Color swatches (D-1184/D-1185's closing note: the deliberate first-class interaction the "add to
 * my wardrobe" follow-up will build on). Tapping the already-selected color deselects it back to the
 * item's own default photo/link, rather than requiring a separate "clear" affordance. Each variant
 * shows its own thumbnail, not just its name as text — most variants in the live feed (Puma,
 * Coolmate) do carry a per-color [GearVariant.imageUrl], and a photo tells colors apart far better
 * than a label alone.
 */
@Composable
private fun ColorVariantPicker(variants: List<GearVariant>, selected: GearVariant?, onSelect: (String?) -> Unit) {
    Column(verticalArrangement = Arrangement.spacedBy(Gaps.itemGap)) {
        Text("Màu sắc", style = MaterialTheme.typography.titleSmall)
        LazyRow(horizontalArrangement = Arrangement.spacedBy(Gaps.itemGap)) {
            items(variants, key = { it.color }) { variant ->
                VariantTile(
                    variant = variant,
                    isSelected = selected?.color == variant.color,
                    onSelect = { onSelect(if (selected?.color == variant.color) null else variant.color) },
                )
            }
        }
    }
}

/**
 * One compact variant tile — a small square thumbnail (via `core/designsystem`'s [GearImage], so
 * Coil stays only there per D-1109) plus the color label underneath; roughly half the footprint of a
 * normal card, since this is a secondary picker, not the item's own hero content. No `ChromeRipple`
 * here — this is screen content, not app chrome, so it inherits the app-wide no-ripple default
 * (D-1189/Ripple.kt) like everything else in `GearDetailContent`.
 */
@Composable
private fun VariantTile(variant: GearVariant, isSelected: Boolean, onSelect: () -> Unit) {
    val borderColor = if (isSelected) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.outlineVariant
    val borderWidth = if (isSelected) SelectedBorderWidth else UnselectedBorderWidth
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(Gaps.cardContentGap),
        modifier = Modifier
            .width(VariantTileWidth)
            .selectable(selected = isSelected, onClick = onSelect, role = Role.RadioButton)
            .testTag("gear_variant_${variant.color}"),
    ) {
        GearImage(
            imageUrl = variant.imageUrl,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(VariantThumbnailSize)
                .clip(RoundedCornerShape(Spacing.sm))
                .border(borderWidth, borderColor, RoundedCornerShape(Spacing.sm)),
        )
        Text(
            variant.color,
            style = MaterialTheme.typography.labelSmall,
            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal,
            color = if (isSelected) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurface,
            textAlign = TextAlign.Center,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis,
        )
    }
}

private val VariantTileWidth = 68.dp
private val VariantThumbnailSize = 56.dp
private val SelectedBorderWidth = 2.dp
private val UnselectedBorderWidth = 1.dp

/**
 * Full-width CTA button — always a link-out to the brand's own product page (there is no in-app
 * purchase flow); opens via a plain `Intent.ACTION_VIEW` into whatever browser the device has, not
 * `core/designsystem`'s Chrome Custom Tabs helper used by `RaceDetailScreen` — a one-off external
 * link to a vendor storefront doesn't need the "stay inside the app" framing a race registration
 * page does.
 */
@Composable
private fun GearDetailCta(brand: String, productUrl: String, context: Context) {
    val label = if (brand.isNotBlank()) "Mua tại $brand" else "Xem sản phẩm"
    Button(
        onClick = { openProductUrl(context, productUrl) },
        modifier = Modifier.fillMaxWidth().height(CtaHeight).testTag("gear_buy_cta"),
    ) {
        Text(label, style = MaterialTheme.typography.titleMedium)
        Icon(Icons.AutoMirrored.Outlined.OpenInNew, contentDescription = null, modifier = Modifier.padding(start = Spacing.xs).size(18.dp))
    }
}

private val CtaHeight = 56.dp

/** Swallows failures (no browser installed, malformed URL, …) — a tap on the CTA must never crash the app. */
private fun openProductUrl(context: Context, url: String) {
    runCatching { context.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url))) }
}
