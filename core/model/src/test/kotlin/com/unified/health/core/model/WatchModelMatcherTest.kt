package com.unified.health.core.model

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test

class WatchModelMatcherTest {

    @Test
    fun `advertised name picks the specific model`() {
        assertEquals("garmin_forerunner_965", WatchModelMatcher.match(WearableVendor.GARMIN, "Forerunner 965")?.id)
    }

    @Test
    fun `more specific pattern wins over a broader sibling`() {
        assertEquals("garmin_forerunner_265s", WatchModelMatcher.match(WearableVendor.GARMIN, "Forerunner 265S")?.id)
        assertEquals("garmin_forerunner_265", WatchModelMatcher.match(WearableVendor.GARMIN, "Forerunner 265")?.id)
    }

    @Test
    fun `size suffix does not stop the base model from matching`() {
        assertEquals("garmin_fenix_8", WatchModelMatcher.match(WearableVendor.GARMIN, "fēnix 8 - 47mm")?.id)
    }

    @Test
    fun `huawei simulator suffix still resolves to its model`() {
        assertEquals(
            "huawei_watch_gt_5",
            WatchModelMatcher.match(WearableVendor.HUAWEI, "HUAWEI WATCH GT 5 (Simulator)")?.id,
        )
    }

    @Test
    fun `huawei mac suffix still resolves to its model`() {
        assertEquals("huawei_watch_gt_4", WatchModelMatcher.match(WearableVendor.HUAWEI, "HUAWEI WATCH GT 4-A1B")?.id)
    }

    @Test
    fun `amazfit GTR 4 Mini is not mistaken for the GTR 4`() {
        assertEquals("amazfit_gtr_mini", WatchModelMatcher.match(WearableVendor.ZEPP, "Amazfit GTR 4 Mini")?.id)
    }

    @Test
    fun `coros mac suffix still resolves to its model`() {
        assertEquals("coros_pace_3", WatchModelMatcher.match(WearableVendor.COROS, "COROS PACE 3 7A8F48")?.id)
    }

    @Test
    fun `DIS model string wins over the advertised name`() {
        assertEquals(
            "garmin_forerunner_965",
            WatchModelMatcher.match(WearableVendor.GARMIN, "My watch", model = "Forerunner 965")?.id,
        )
    }

    @Test
    fun `unknown model of a known brand falls back to the brand generic`() {
        assertEquals("garmin_generic", WatchModelMatcher.match(WearableVendor.GARMIN, "Totally new model")?.id)
    }

    @Test
    fun `unknown HONOR model falls back to honor_generic, not huawei_generic`() {
        assertEquals("honor_generic", WatchModelMatcher.match(WearableVendor.HUAWEI, "HONOR Watch 6")?.id)
    }

    @Test
    fun `unknown HUAWEI model falls back to huawei_generic, not honor_generic`() {
        assertEquals("huawei_generic", WatchModelMatcher.match(WearableVendor.HUAWEI, "HUAWEI WATCH 7")?.id)
    }

    @Test
    fun `brand watch served by the standard driver still matches its model`() {
        assertEquals("garmin_forerunner_965", WatchModelMatcher.match(WearableVendor.STANDARD, "Forerunner 965")?.id)
    }

    @Test
    fun `a bluetooth-SIG-only device matches its own catalog entry`() {
        assertEquals("polar_h10", WatchModelMatcher.match(WearableVendor.STANDARD, "Polar H10 1234ABCD")?.id)
    }

    @Test
    fun `nothing matches for a vendor without catalog entries`() {
        assertNull(WatchModelMatcher.match(WearableVendor.DEMO, null))
    }

    @Test
    fun `diacritics are folded before matching`() {
        assertEquals("fenix 8", WatchModelMatcher.normalize("fēnix 8"))
        assertEquals("vivoactive 6", WatchModelMatcher.normalize("vívoactive 6"))
    }

    /**
     * Catalog self-check: every specific (non-generic) entry's own [WatchModel.displayName] must
     * resolve back to that same entry. A few displayNames are UI labels rather than literal
     * advertised names (grouped SKUs like "Instinct 2 / 2S / 2X", or a size/MAC suffix the watch
     * always advertises), so [sampleAdvertisedName] turns those into one real, matchable name.
     * A failure here means a regex is too broad/narrow or the catalog order lets a broader
     * sibling shadow a more specific one — fix docs/research/watch_catalog.json and regenerate.
     */
    @Test
    fun `every catalog entry resolves from its own display name`() {
        WatchCatalog.models.filterNot { it.isGeneric }.forEach { entry ->
            val name = sampleAdvertisedName(entry)
            assertEquals(
                "displayName '${entry.displayName}' (sample '$name') of ${entry.id} resolved to a different entry",
                entry.id,
                WatchModelMatcher.match(entry.vendor, name)?.id,
            )
        }
    }

    /** A handful of displayNames need a concrete size/suffix their regex requires but doesn't carry in the label. */
    private val sampleOverrides = mapOf(
        "garmin_epix_pro" to "epix Pro - 47mm",
        "garmin_epix_gen2" to "epix",
        "garmin_instinct_3" to "Instinct 3 - 45mm",
        "garmin_instinct_e" to "Instinct E - 40mm",
        "xiaomi_smart_band_10" to "Xiaomi Smart Band 10 ABCD",
        "xiaomi_smart_band_9" to "Xiaomi Smart Band 9 ABCD",
        "xiaomi_smart_band_8" to "Xiaomi Smart Band 8 ABCD",
    )

    private fun sampleAdvertisedName(entry: WatchModel): String =
        sampleOverrides[entry.id] ?: entry.displayName.substringBefore(" / ")
}
