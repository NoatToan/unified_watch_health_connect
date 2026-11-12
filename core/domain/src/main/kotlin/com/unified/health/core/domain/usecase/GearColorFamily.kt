package com.unified.health.core.domain.usecase

import java.text.Normalizer

/**
 * D-1203: ~12 broad color families the gear catalog's free-text variant color strings are
 * normalized into, so "Trang bị tham khảo" can offer a color filter despite every source brand
 * (PUMA, Salomon, Li-Ning, Coolmate, …) naming its own colorways however it likes — Vietnamese
 * ("Be", "Xanh Navy", "Đen"), English compound marketing names ("PUMA Black-PUMA White", "Club
 * Navy-…"), or neither.
 *
 * [MULTI] is reserved for an explicit "this is a multi-color print" signal — a literal "mix màu"/
 * "nhiều màu" label, or PUMA's own "AOP" (All-Over-Print) suffix — not merely "this compound name
 * mentions ≥2 colors". A genuinely two-tone name like "PUMA Black-PUMA White" instead resolves to
 * [GearColorMatch.dominant] = BLACK with [GearColorMatch.secondary] = {WHITE}; see [classifyGearColor].
 */
enum class ColorFamily {
    BLACK, WHITE, GREY, BLUE, GREEN, RED, PINK, ORANGE, YELLOW, PURPLE, BROWN_BEIGE, MULTI
}

/**
 * [dominant] is the family a color filter matches against (brief's rule: "a variant matches a
 * filter if its dominant family matches"); [secondary] are the other distinct families also present
 * in a compound name (e.g. "PUMA Black-PUMA White" → dominant BLACK, secondary {WHITE}) — carried
 * for a future richer picker, not consumed by filtering itself today. Both are empty/null when
 * [classifyGearColor] recognizes no color word at all.
 */
data class GearColorMatch(val dominant: ColorFamily?, val secondary: Set<ColorFamily> = emptySet())

/**
 * Normalizes one free-text gear color/name string into a [GearColorMatch]. Pure, diacritics- and
 * case-insensitive, built from and verified against the real strings in `unified_health_service`'s
 * published feed (`docs/gear/latest.json`, 486 items/156 with variants/636 variants as of this
 * writing) — see [GearColorFamilyTest] for a sample of those exact strings and
 * [core/domain/src/test/.../GearColorFamilyTest.kt]'s KDoc for the measured coverage.
 *
 * **Algorithm** (deliberately simple — a dictionary of single-word color/marketing tokens, not an
 * NLP/ML classifier):
 * 1. Strip "đ"/"Đ" to "d"/"D" (not removed by Unicode NFD, unlike the other Vietnamese diacritics),
 *    then NFD-normalize and drop combining marks, then lowercase.
 * 2. Tokenize on any run of non `[a-z0-9]` characters (so "-", "/", " phối " / "PUMA Black-PUMA
 *    White", "Trắng phối đỏ", "purple / green" all split into plain word tokens the same way) and
 *    drop the brand-noise token "puma".
 * 3. Scan tokens **left to right**; each token present in [COLOR_WORDS] contributes its family (in
 *    first-seen order, duplicates collapsed) — except the Vietnamese word "xanh" ("xanh" alone is
 *    ambiguous between blue and green), which gets its own lookahead rule below instead of a plain
 *    dictionary entry.
 * 4. The first distinct family found is [GearColorMatch.dominant]; any further distinct families are
 *    [GearColorMatch.secondary]. No match at all → both null/empty (the brief's "Unknown → null, not
 *    filterable by color").
 *
 * **"xanh" rule** (brief's explicit call-out): "xanh" defaults to [ColorFamily.BLUE] *unless* the
 * token immediately after it is one of [GREEN_TRIGGERS_AFTER_XANH] ("lá", "rêu", "ô liu"/"olive",
 * "lục", "ngọc", "mint"), in which case it resolves to [ColorFamily.GREEN] — "xanh dương"/"xanh
 * navy"/"xanh biển"/"xanh nhạt"/"xanh đậm"/"xanh đen" (no green trigger follows) stay BLUE; "xanh
 * lá"/"xanh rêu"/"xanh ngọc"/"xanh mint" resolve GREEN. The lookahead only *decides* xanh's own
 * family — the following token is still scanned normally afterward (so "xanh đen" still records
 * BLACK as a secondary family from "đen").
 *
 * **Other documented assumptions/approximations** baked into [COLOR_WORDS] (kept deliberately small
 * and reviewable rather than growing without bound — see the real-feed coverage report in the task's
 * final writeup for what's intentionally left unmapped, e.g. "Cool Weather" or an embroidery motif
 * name with no color word at all):
 * - "kem" (cream) groups into [ColorFamily.WHITE], not [ColorFamily.BROWN_BEIGE] — the feed's own
 *   usage ("Kem viền tím" = "cream trimmed purple") describes a white-based item with a colored trim.
 * - Single ambiguous marketing words are resolved to one plausible family each, picking the
 *   earliest-good-enough interpretation rather than agonizing per word: "rose"/"magenta"/"fuchsia" →
 *   PINK, "indigo"/"mauve"/"lilac"/"orchid"/"plum" → PURPLE, "inky" (as in PUMA's "Inky Depths") →
 *   BLACK (ink), "lapis"/"sapphire"/"water"/"aqua"/"poseidon" → BLUE, "sage"/"moss"/"emerald"/
 *   "laurel"/"apple"/"lime" → GREEN, "ruby"/"berry"/"fire"/"bordeaux" → RED, "gold"/"sunny"/"sun"/
 *   "lemon" → YELLOW, "sunset"/"peach" → ORANGE, "umber"/"coffee"/"raisin"/"shitake"/"clay"/
 *   "sandstone"/"latte"/"oak"/"desert"/"rosewood" → BROWN_BEIGE, "iron"/"ash"/"slate" → GREY,
 *   "bleached" → WHITE. When a single word/segment could plausibly mean more than one family (e.g.
 *   "Rose Gold"), the leftmost matching token wins — a known, accepted approximation, not a bug.
 * - A compound color glued to a trailing product code with no separator (e.g.
 *   "BlackLC2180300" — a real string in the feed, one item) tokenizes as one unmatched token, not
 *   "black" + the code; left unmapped rather than attempting fragile substring matching that could
 *   misfire elsewhere (e.g. matching "black" inside an unrelated longer word).
 */
fun classifyGearColor(raw: String): GearColorMatch {
    val matched = mutableListOf<ColorFamily>()
    val tokens = tokenizeGearColorText(raw)
    tokens.forEachIndexed { index, token ->
        val family = if (token == "xanh") {
            val next = tokens.getOrNull(index + 1)
            if (next != null && next in GREEN_TRIGGERS_AFTER_XANH) ColorFamily.GREEN else ColorFamily.BLUE
        } else {
            COLOR_WORDS[token]
        }
        if (family != null) matched += family
    }
    val distinct = matched.distinct()
    return GearColorMatch(dominant = distinct.firstOrNull(), secondary = distinct.drop(1).toSet())
}

private fun tokenizeGearColorText(raw: String): List<String> {
    val noDzStroke = raw.replace('đ', 'd').replace('Đ', 'D')
    val decomposed = Normalizer.normalize(noDzStroke, Normalizer.Form.NFD)
    val withoutDiacritics = decomposed.replace(Regex("\\p{Mn}+"), "")
    return withoutDiacritics.lowercase()
        .split(Regex("[^a-z0-9]+"))
        .filter { it.isNotEmpty() && it != "puma" }
}

private val GREEN_TRIGGERS_AFTER_XANH = setOf("la", "reu", "oliu", "olive", "luc", "ngoc", "mint")

/** word (already lowercase, diacritics-stripped) → the [ColorFamily] it signals. "xanh" is
 *  deliberately absent — see [classifyGearColor]'s own lookahead rule for it. */
private val COLOR_WORDS: Map<String, ColorFamily> = buildMap {
    putFamily(ColorFamily.BLACK, "den", "black", "noir", "inky")
    putFamily(ColorFamily.WHITE, "trang", "white", "snow", "ivory", "kem", "cream", "creme", "bleached")
    putFamily(ColorFamily.GREY, "xam", "ghi", "bac", "gray", "grey", "silver", "slate", "ash", "steel", "iron")
    putFamily(ColorFamily.BLUE, "duong", "bien", "coban", "cobalt", "navy", "blue", "sapphire", "denim", "lapis", "water", "aqua", "poseidon")
    putFamily(ColorFamily.GREEN, "la", "reu", "oliu", "olive", "luc", "green", "lime", "sage", "emerald", "mint", "apple", "moss", "grass", "laurel")
    putFamily(ColorFamily.RED, "do", "burgundy", "maroon", "red", "ruby", "scarlet", "crimson", "cherry", "berry", "fire", "bordeaux")
    putFamily(ColorFamily.PINK, "hong", "pink", "magenta", "fuchsia", "rose", "salmon")
    putFamily(ColorFamily.ORANGE, "cam", "orange", "tangerine", "sunset", "peach")
    putFamily(ColorFamily.YELLOW, "vang", "yellow", "gold", "lemon", "mustard", "sunny", "sun")
    putFamily(ColorFamily.PURPLE, "tim", "purple", "violet", "lavender", "lilac", "plum", "mauve", "orchid", "indigo")
    putFamily(
        ColorFamily.BROWN_BEIGE,
        "nau", "be", "kaki", "khaki", "tan", "sand", "sandstone", "latte", "oak", "desert", "rosewood",
        "chocolate", "brown", "beige", "clay", "umber", "coffee", "raisin", "shitake",
    )
    putFamily(ColorFamily.MULTI, "mix", "aop")
}

private fun MutableMap<String, ColorFamily>.putFamily(family: ColorFamily, vararg words: String) {
    words.forEach { put(it, family) }
}
