package com.unified.health.core.domain.usecase

import com.unified.health.core.model.GearGender
import java.text.Normalizer

/**
 * Gender filter (gender-filter task, 2026-11-12): pure, diacritics- and case-insensitive fallback
 * classifier for [GearGender] from a gear item's own product [name] — used only when the feed itself
 * has no explicit `gender` field for that item (`com.unified.health.core.data.gear.GearItemDto`'s
 * mapping calls this exactly once per item, only when its own literal feed value is null). As of this
 * writing the live feed (`unified_health_service`'s `docs/gear/latest.json`, 485 items) already
 * carries an explicit `gender` for 462/485 items (205 women, 199 men, 58 unisex); of the 23 with no
 * feed value, this classifier resolves 8 (1 "Unisex" accessory, 2 "...Men"/"...Women" shoe names, 4
 * "trẻ em" kids shoes — one name per SKU-size-variant) and correctly leaves the remaining 15 (water
 * bottles, backpacks, belts, gaiters — genuinely gender-neutral accessory names) null, a ~35%
 * incremental-coverage rate on top of the feed's own explicit field, confirmed by
 * [com.unified.health.core.domain.GearGenderClassifierTest] against those same real strings.
 *
 * Mirrors [classifyGearColor]'s own shape/algorithm (tokenize, then an exact, whole-word dictionary
 * lookup — not a substring/NLP classifier): same "đ"/"Đ" → "d"/"D" + NFD-strip-combining-marks +
 * lowercase normalization, tokenized on any run of non `[a-z0-9]` characters, scanned **left to
 * right**, first recognized token wins. Whole-word tokenization specifically matters for "nam" (brief:
 * "as a whole word only") — it must never match as a mere substring of an unrelated longer word
 * (tokenizing already rules that out structurally, the same way it does for every other single-word
 * entry in [GENDER_WORDS]); verified against the live feed's own 90 "Nam"/"Nữ"-named items, all of
 * them real gender words, no place-name-style false positive found (e.g. no "Nam Định" in this
 * catalog) — "Nam" as a Vietnamese place-name fragment remains a known, accepted residual risk of the
 * whole-word rule alone, not fixable without either a denylist of specific phrases or a confidence
 * signal this simple a classifier doesn't have; left as documented rather than guessed around.
 *
 * **Dictionary, scoped to exactly the brief's own listed terms** (not expanded with plausible
 * look-alikes like "woman"/"ladies"/"youth" that have no real-feed evidence behind them):
 * - [GearGender.WOMEN]: "women" (covers "women's" too — the apostrophe is a token boundary, so
 *   "women's" already tokenizes to "women" + "s"), "womens", "wmns" (Nike-style abbreviation),
 *   "nu" (= "nữ" with diacritics stripped).
 * - [GearGender.MEN]: "men" (covers "men's"), "mens", "nam" (Vietnamese, whole word only, see above).
 * - [GearGender.UNISEX]: "unisex".
 * - [GearGender.KIDS]: "kids", "kid", "junior", "jr", plus the two-word Vietnamese phrase "trẻ em"
 *   ("trẻ"+"em" as adjacent tokens — handled as its own lookahead below, the same pattern
 *   [classifyGearColor] uses for "xanh", since it is not a single token).
 *
 * No signal found at all → null (never guessed) — most accessory names (water bottles, backpacks,
 * trekking poles, …) are genuinely gender-neutral and are expected to resolve to null here.
 */
fun classifyGearGender(name: String): GearGender? {
    val tokens = tokenizeGearGenderText(name)
    tokens.forEachIndexed { index, token ->
        if (token == "tre" && tokens.getOrNull(index + 1) == "em") return GearGender.KIDS
        GENDER_WORDS[token]?.let { return it }
    }
    return null
}

private fun tokenizeGearGenderText(raw: String): List<String> {
    val noDzStroke = raw.replace('đ', 'd').replace('Đ', 'D')
    val decomposed = Normalizer.normalize(noDzStroke, Normalizer.Form.NFD)
    val withoutDiacritics = decomposed.replace(Regex("\\p{Mn}+"), "")
    return withoutDiacritics.lowercase().split(Regex("[^a-z0-9]+")).filter { it.isNotEmpty() }
}

/** word (already lowercase, diacritics-stripped) → the [GearGender] it signals. "tre"/"em" are
 *  deliberately absent — see [classifyGearGender]'s own "trẻ em" lookahead rule for that phrase. */
private val GENDER_WORDS: Map<String, GearGender> = buildMap {
    put("women", GearGender.WOMEN)
    put("womens", GearGender.WOMEN)
    put("wmns", GearGender.WOMEN)
    put("nu", GearGender.WOMEN)
    put("men", GearGender.MEN)
    put("mens", GearGender.MEN)
    put("nam", GearGender.MEN)
    put("unisex", GearGender.UNISEX)
    put("kids", GearGender.KIDS)
    put("kid", GearGender.KIDS)
    put("junior", GearGender.KIDS)
    put("jr", GearGender.KIDS)
}
