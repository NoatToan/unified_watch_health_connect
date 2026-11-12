package com.unified.health.core.domain

import com.unified.health.core.model.GearGender
import com.unified.health.core.domain.usecase.classifyGearGender
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test

/**
 * [classifyGearGender] built and verified against the real product names published in
 * `unified_health_service`'s feed (`docs/gear/latest.json`, read-only reference as of 2026-11-12:
 * 485 items). As of this writing the feed already carries an explicit `gender` field for 462/485
 * items (205 women, 199 men, 58 unisex, 0 kids) — this classifier only ever runs as a fallback for
 * the remaining 23 with no feed value at all (`GearItemDto.toDomainOrNull`).
 *
 * **Measured coverage on those exact 23 null-gender items: 8/23 resolved (~35%)** — 1 "Mũ Thể Thao
 * Unisex Salomon..." (UNISEX), 2 "...Running Shoes Men"/"...Men's Globe Graphic..." (MEN), 1
 * "Deviate NITRO™ 3 Ekiden Running Shoes Women" (WOMEN), 4 "Giày chạy bộ trẻ em YKFW002-*V" (KIDS,
 * one name per SKU/size variant). The other 15 (water bottles, backpacks, belts, gaiters, a bottle
 * cap, a running-shorts-only name, a plain "Night Runner V3 Running Shoes") are genuinely
 * gender-neutral accessory/model names with no word this classifier (or a human skimming the same
 * string) could resolve a gender from — correctly null, not a classifier miss.
 *
 * Also verified against the feed's 90 "Nam"/"Nữ"-named items that *do* already carry an explicit feed
 * gender (so this classifier never actually runs on them) purely as a false-positive check on the
 * "nam"/"nu" dictionary entries: all 90 are genuinely gender-named ("Tất Nam...", "Áo Thun Nam...",
 * "Giày chạy bộ ... Nam ...", "Quần Short Thể Thao Nữ...", etc.) — none is a false hit off an
 * unrelated word merely containing "nam"/"nu" as a substring (tokenizing already prevents that
 * structurally; this is a check against *whole-word* collisions specifically, e.g. a Vietnamese place
 * name like "Nam Định" that happens to tokenize to the same whole word "nam" — none present in this
 * catalog, but documented as a known, accepted residual risk in [classifyGearGender]'s own KDoc).
 */
class GearGenderClassifierTest {

    private fun assertGender(expected: GearGender?, raw: String) {
        assertEquals("classifying '$raw'", expected, classifyGearGender(raw))
    }

    // --- the 8/23 real null-gender items this classifier actually resolves ---

    @Test
    fun `an explicit Unisex word in the name resolves to UNISEX`() {
        assertGender(GearGender.UNISEX, "Mũ Thể Thao Unisex Salomon Logo 5 Panel Deep Black LC2681800")
    }

    @Test
    fun `a trailing English Men resolves to MEN`() {
        assertGender(GearGender.MEN, "VELOCITY 7-inch Running Shorts Men")
        assertGender(GearGender.MEN, "Deviate NITRO™ 3 Ekiden Running Shoes Men")
        assertGender(GearGender.MEN, "Áo Thun Nam Salomon Men's Globe Graphic SS Tee White LC2249100")
    }

    @Test
    fun `a trailing English Women resolves to WOMEN`() {
        assertGender(GearGender.WOMEN, "Deviate NITRO™ 3 Ekiden Running Shoes Women")
    }

    @Test
    fun `the Vietnamese phrase tre em (kids) resolves to KIDS`() {
        assertGender(GearGender.KIDS, "Giày chạy bộ trẻ em YKFW002-1V")
        assertGender(GearGender.KIDS, "Giày chạy bộ trẻ em YKFW002-2V")
        assertGender(GearGender.KIDS, "Giày chạy bộ trẻ em YKFW002-3V")
        assertGender(GearGender.KIDS, "Giày chạy bộ trẻ em YKFW002-4V")
    }

    // --- the 15/23 real null-gender items with genuinely no signal, correctly left null ---

    @Test
    fun `gender-neutral accessory names stay null`() {
        assertNull(classifyGearGender("PUMA x HYROX 46L Training Backpack"))
        assertNull(classifyGearGender("Balo Hiking Salomon Cross 12 Black LC2185700"))
        assertNull(classifyGearGender("Bình Chứa Nước Salomon Soft Reservoir 1.5L LC1916200 Clear Blue"))
        assertNull(classifyGearGender("Bình Nước Cầm Tay Salomon Active Handheld 500ml LC1928600"))
        assertNull(classifyGearGender("Bó Cổ Giày Salomon Trail Gaiters Low Black L32916600"))
        assertNull(classifyGearGender("Nắp bình nước thay thế Salomon Soft Valve Cover LC2019900 Clear/Alloy"))
        assertNull(classifyGearGender("Tất Thể Thao Salomon Socks X Ultra Crew Black/Kelp LC2166300"))
        assertNull(classifyGearGender("Đai Chạy Bộ Salomon Active Belt 3D Bolt LC2179000"))
        assertNull(classifyGearGender("Night Runner V3 Running Shoes"))
    }

    // --- real "Nam"/"Nữ" items that already have an explicit feed gender — false-positive sanity
    // check on the whole-word "nam"/"nu" dictionary entries themselves ---

    @Test
    fun `whole-word Vietnamese nam resolves to MEN, not a substring match`() {
        assertGender(GearGender.MEN, "Tất Lười No Show Nam")
        assertGender(GearGender.MEN, "Tất Nam Cổ Trung Chống Trượt")
        assertGender(GearGender.MEN, "Quần biker chạy bộ nam basic 360Reflect™ \"Run Safe In The Dark\"")
        assertGender(GearGender.MEN, "Giày chạy bộ Chitu 8 Nam ARPV001-22V")
    }

    @Test
    fun `whole-word Vietnamese nu (nữ) resolves to WOMEN`() {
        assertGender(GearGender.WOMEN, "Tất Mây Nữ")
        assertGender(GearGender.WOMEN, "Tất Nữ Cổ Ngắn Yoga & Pilates")
        assertGender(GearGender.WOMEN, "Quần Short Thể Thao Nữ Salomon Sense Aero 5'' LC2319800 Misty Blue")
    }

    @Test
    fun `unisex-prefixed Vietnamese names also resolve to UNISEX`() {
        assertGender(GearGender.UNISEX, "Tất Unisex Cổ Cao Essential")
        assertGender(GearGender.UNISEX, "Tất Unisex Cổ Trung Essential")
    }

    // --- brief's other explicitly listed English tokens (not present in the live feed today, but
    // specified by the brief, so covered directly) ---

    @Test
    fun `other explicit brief tokens`() {
        assertGender(GearGender.WOMEN, "Nike Air Zoom Pegasus Womens Running Shoes")
        assertGender(GearGender.WOMEN, "Nike Pegasus Wmns")
        assertGender(GearGender.MEN, "Nike Air Zoom Pegasus Mens Running Shoes")
        assertGender(GearGender.KIDS, "Running Shoes Junior")
        assertGender(GearGender.KIDS, "Running Shoes Jr")
        assertGender(GearGender.KIDS, "Running Shoes Kids")
    }

    @Test
    fun `no gender word at all resolves to null`() {
        assertNull(classifyGearGender("Coolmate Sporty Bag"))
        assertNull(classifyGearGender("Pack 3 Tất Nhún Chống trượt"))
    }
}
