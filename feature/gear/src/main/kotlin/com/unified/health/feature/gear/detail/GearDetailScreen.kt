package com.unified.health.feature.gear.detail

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.outlined.OpenInNew
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.unified.health.core.designsystem.component.EmptyState
import com.unified.health.core.designsystem.component.GearImage
import com.unified.health.core.designsystem.component.LoadingState
import com.unified.health.core.designsystem.component.formatVnd
import com.unified.health.core.designsystem.theme.ChromeRipple
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
    Scaffold(
        topBar = {
            TopAppBar(
                title = {},
                // D-1189: app chrome, not this screen's own content — restores the normal ripple.
                navigationIcon = { ChromeRipple { IconButton(onClick = onBack) { Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back") } } },
            )
        },
    ) { padding ->
        when (state) {
            GearDetailUiState.Loading -> LoadingState(Modifier.padding(padding))
            GearDetailUiState.NotFound -> EmptyState(
                title = "Không tìm thấy trang bị",
                message = "Sản phẩm này có thể đã bị gỡ khỏi danh mục.",
                modifier = Modifier.padding(padding),
            )
            is GearDetailUiState.Success -> GearDetailContent(state, onSelectVariant, Modifier.padding(padding))
        }
    }
}

@Composable
private fun GearDetailContent(state: GearDetailUiState.Success, onSelectVariant: (String?) -> Unit, modifier: Modifier = Modifier) {
    val context = LocalContext.current
    val item = state.item
    Column(modifier.fillMaxSize().verticalScroll(rememberScrollState())) {
        GearImage(state.displayImageUrl, Modifier.fillMaxWidth().aspectRatio(1f).testTag("gear_detail_image"))
        Column(Modifier.fillMaxWidth().padding(Spacing.lg), verticalArrangement = Arrangement.spacedBy(Spacing.lg)) {
            Column(verticalArrangement = Arrangement.spacedBy(Spacing.xxs)) {
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
 * Color swatches/chips (D-1184/D-1185's closing note: the deliberate first-class interaction the
 * "add to my wardrobe" follow-up will build on). Tapping the already-selected color deselects it
 * back to the item's own default photo/link, rather than requiring a separate "clear" affordance.
 */
@Composable
private fun ColorVariantPicker(variants: List<GearVariant>, selected: GearVariant?, onSelect: (String?) -> Unit) {
    Column(verticalArrangement = Arrangement.spacedBy(Spacing.sm)) {
        Text("Màu sắc", style = MaterialTheme.typography.titleSmall)
        LazyRow(horizontalArrangement = Arrangement.spacedBy(Spacing.sm)) {
            items(variants, key = { it.color }) { variant ->
                FilterChip(
                    selected = selected?.color == variant.color,
                    onClick = { onSelect(if (selected?.color == variant.color) null else variant.color) },
                    label = { Text(variant.color) },
                    modifier = Modifier.testTag("gear_variant_${variant.color}"),
                )
            }
        }
    }
}

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
