package com.unified.health.core.designsystem.theme

import androidx.compose.ui.unit.dp

/** 4dp-based spacing tokens. */
object Spacing {
    val xxs = 2.dp
    val xs = 4.dp
    val sm = 8.dp
    val md = 12.dp
    val lg = 16.dp
    val xl = 24.dp
    val xxl = 32.dp

    /** Minimum touch target recommended by Material / WCAG. */
    val minTouchTarget = 48.dp

    /**
     * D-1144: clearance to reserve at the bottom of each top-level tab's own scrollable content, now
     * that `PillBottomNavigation` (`app` module) floats as a `Box` overlay instead of reserving
     * `Scaffold` bottom-bar space — without this, a screen's last card/item would sit permanently
     * behind the pill instead of merely scrolling behind it like everything else. Matches the pill's
     * own total footprint (its fixed height + top/bottom margins, see `PillBottomNavigation.kt`'s
     * `NAV_HEIGHT`) as a fixed dp value rather than a real `WindowInsets` reading — feature modules
     * cannot see `app`'s private layout constants (architecture: feature depends on
     * domain/designsystem only), so this is kept in sync by hand instead of computed from one source.
     * D-1204: left untouched by the app-wide spacing pass below — it clears a fixed pill footprint,
     * not a "gap" that reads as airy/cramped, so it isn't a candidate for tightening.
     */
    val bottomNavClearance = 96.dp
}

/**
 * D-1204: semantic spacing tokens — *what a gap is for*, not just *how many dp it is*. Before this,
 * every screen reached for [Spacing.lg]/[Spacing.md]/etc. directly, picking whichever primitive
 * happened to produce a gap that looked right for that one spot; the same role (e.g. "space below the
 * top app bar") ended up at 8dp on some screens and 16dp on others, and "card inner padding" drifted
 * between 16dp and 12dp with no pattern. That made the whole app read as inconsistently "airy" and
 * made a global retune (this decision) impossible to do by eye, screen by screen.
 *
 * Each token here is a *role*, resolved to one of [Spacing]'s primitives — never a bare `.dp` literal.
 * Changing the look of e.g. every grid in the app is now one line here instead of a grep-and-replace
 * across every `feature` module. KDoc on each token says where it's meant to be used; don't introduce
 * a new bare `Spacing.xx` or `NN.dp` for a padding/gap/arrangement call site in a `feature` or `app`
 * module — add or reuse a [Gaps] token instead so the role stays named. Non-spacing dims (icon/image
 * size, stroke width, corner radius, chart height) are untouched by this object — they were never
 * part of the "too airy" complaint and don't share a visual role with any gap here.
 */
object Gaps {
    /** Horizontal edge padding for a screen's scrollable content — kept at the pre-existing
     *  [Spacing.lg] (16dp): the user's feedback was about vertical airiness and grid density, not
     *  horizontal margins, and 16dp is the minimum that keeps text comfortably off the screen edge. */
    val screenHorizontal = Spacing.lg

    /** Gap from the bottom edge of the top app bar to a screen's first content element (the first
     *  list item, the category-chip row, …). D-1204: was split between [Spacing.sm] (8dp, Home/
     *  Activity/Devices) and [Spacing.lg] (16dp, Training/TrainingCalendar/Races) depending on the
     *  screen — unified and halved to [Spacing.xs] (4dp) everywhere. */
    val screenTop = Spacing.xs

    /** Gap between top-level sections or stacked cards in a screen that reads as a sequence of
     *  distinct blocks (a detail screen's info card → stats card → map card; a settings screen's
     *  option groups). D-1204: halved from [Spacing.lg]/[Spacing.xl] (16–24dp) to [Spacing.md]
     *  (12dp). */
    val sectionGap = Spacing.md

    /** Gap between same-shape items repeated down a list — feed cards, device rows, race cards,
     *  workout split rows. D-1204: unified the previously-mixed [Spacing.sm]/[Spacing.md] (8/12dp)
     *  down to [Spacing.sm] (8dp); this is also what separates a screen's "Metrics"-style section
     *  header from the first row under it, since both live in the same list arrangement. */
    val itemGap = Spacing.sm

    /** Gap between cells in a grid ([androidx.compose.foundation.lazy.grid.LazyVerticalGrid], or a
     *  manually chunked 2-column `Row`), on both axes. D-1204: halved from [Spacing.md] (12dp) to
     *  [Spacing.sm] (8dp) — this is the "2-column cards too wide apart" fix on Home's Metrics grid
     *  and Gear's grid. */
    val gridGap = Spacing.sm

    /** Inner padding of a card/tile's content (the `Modifier.padding(...)` immediately inside a
     *  `Card`/`ElevatedCard`/`OutlinedCard`). D-1204: reduced from [Spacing.lg] (16dp) to [Spacing.md]
     *  (12dp). */
    val cardPadding = Spacing.md

    /** Gap between stacked lines/rows of content inside a card (e.g. a metric card's header → value
     *  → chart → insight). D-1204: reduced from [Spacing.sm] (8dp) to [Spacing.xs] (4dp). */
    val cardContentGap = Spacing.xs

    /** Gap between individual chip pills in a chip row (`FilterChip`/`InputChip` `Arrangement.spacedBy`
     *  on a `LazyRow`/`FlowRow`). D-1204: canonical value kept at [Spacing.sm] (8dp) — unlike the
     *  other tokens here, this one was *not* part of the "too airy" feedback (which was about the
     *  vertical gaps around a chip row, not the horizontal gaps between chips), so it stays put as the
     *  single source other screens' previously-inconsistent 4dp/8dp chip gaps now unify to. */
    val chipGap = Spacing.sm

    /** Vertical inset around a chip row (above the first chip, below the last) — the gap from the
     *  app bar down to a category-chip row, and from that row down to whatever follows it (another
     *  chip row, a grid, a list). D-1204: halved from [Spacing.sm] (8dp) to [Spacing.xs] (4dp); this
     *  is the direct fix for Gear's "gap above and below the category chips is too large" feedback —
     *  Gear's chip row previously used its own [Spacing.sm] vertical inset *and* the grid below it
     *  added another [Spacing.sm] on top of that, stacking to 16dp between the chips and the grid. */
    val chipRowVertical = Spacing.xs

    /** Inner padding of a bottom sheet's content column. D-1204: reduced from [Spacing.lg] (16dp) to
     *  [Spacing.md] (12dp), matching [cardPadding] — a sheet is a full-width "card". */
    val sheetPadding = Spacing.md
}
