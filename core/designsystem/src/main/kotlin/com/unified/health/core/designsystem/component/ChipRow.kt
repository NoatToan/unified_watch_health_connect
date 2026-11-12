package com.unified.health.core.designsystem.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.LocalMinimumInteractiveComponentSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.unified.health.core.designsystem.theme.Gaps

/**
 * A horizontally scrolling row of chips (`FilterChip`/`InputChip`/…) — category filters, removable
 * active-filter chips, or both merged into one row (e.g. `feature/gear`'s `GearScreen`).
 *
 * On-device review (2026-11-12, chip-row-vertical-gap task): Material3's chip components
 * (`FilterChip`/`InputChip`/`AssistChip`/…) are visually only ~32dp tall, but each one wraps its own
 * content in `Modifier.minimumInteractiveComponentSize()`, which pads it up to
 * [LocalMinimumInteractiveComponentSize] (48dp by default) — centered, so ~8dp of *invisible* padding
 * is added above **and** below every chip, on top of whatever explicit vertical inset the row itself
 * asks for (e.g. `Gaps.chipRowVertical`). Two stacked chip rows compound this on *both* sides of the
 * gap between them: nothing in a layout inspector or in the explicit padding value explains a
 * visually ~24dp gap, because the other ~16dp is the two rows' invisible touch-target padding meeting
 * in the middle (the direct cause of Gear's "gap around the category/active-filter chip rows is still
 * too big even after halving `Gaps.chipRowVertical`" feedback).
 *
 * This provides [LocalMinimumInteractiveComponentSize] as `0.dp` for every chip composed inside it,
 * removing that invisible inflation — the *visible* gap around the row becomes exactly whatever
 * [contentPadding] (or the caller's own outer padding) actually asks for, nothing more.
 *
 * **Accessibility trade-off, deliberate and scoped.** Material's 48dp minimum touch target is about
 * the tappable region, not the drawn chip — zeroing [LocalMinimumInteractiveComponentSize] shrinks
 * each chip's *vertical* hit area down to its drawn ~32dp height. Acceptable specifically here
 * because:
 *  - chips in this row sit side by side, never stacked — there is no competing target directly
 *    above/below to mis-tap into, which is the usual reason the 48dp minimum exists in the first
 *    place;
 *  - the *horizontal* hit area is untouched (each chip's own width — generally well over 48dp once
 *    its label/padding/leading-icon are accounted for), separated from its neighbors by
 *    [horizontalArrangement] (`Gaps.chipGap` by default);
 *  - this mirrors Material3's own components that ship under 48dp tall by design inside a dense
 *    horizontal strip (e.g. a toolbar of small icon buttons).
 *
 * **Do not reuse this for a *vertically wrapping* chip row** (e.g. a `FlowRow` of chips that can wrap
 * onto a second line, like the price/color sections inside `feature/gear`'s own `GearFilterSheet`) —
 * there, two chips really can end up directly above one another, and the 48dp minimum should stay in
 * effect; those call sites are intentionally left alone.
 */
@Composable
fun ChipRow(
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(horizontal = Gaps.screenHorizontal),
    horizontalArrangement: Arrangement.Horizontal = Arrangement.spacedBy(Gaps.chipGap),
    // Centered rather than the LazyRow default (Top) — a shorter item mixed into the row (e.g. a
    // `VerticalDivider` separating category chips from removable active-filter chips) reads as
    // deliberately placed instead of merely flush with the chips' top edge.
    verticalAlignment: Alignment.Vertical = Alignment.CenterVertically,
    content: LazyListScope.() -> Unit,
) {
    CompositionLocalProvider(LocalMinimumInteractiveComponentSize provides 0.dp) {
        LazyRow(
            modifier = modifier.fillMaxWidth(),
            contentPadding = contentPadding,
            horizontalArrangement = horizontalArrangement,
            verticalAlignment = verticalAlignment,
            content = content,
        )
    }
}
