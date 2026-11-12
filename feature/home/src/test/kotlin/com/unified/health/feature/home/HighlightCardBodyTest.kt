package com.unified.health.feature.home

import java.io.File
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * On-device review bug: the Highlights cards rendered "...averaged 7,606 stepsa day", "...34 mina
 * day", "...473 kcala day" — missing the space between the unit and "a day"/"mỗi ngày". Two things
 * guard against this regressing:
 *  1. [highlightCardBody] (`HomeScreen.kt`) is the pure formatter behind the sentence — these tests
 *     exercise it directly with representative, already-spaced inputs (as `stringResource` would
 *     supply them) to pin the sentence's exact shape.
 *  2. The last test below reads the raw `strings.xml` files to make sure `highlight_per_day_suffix`
 *     keeps the ` ` escape — a bare leading space there is silently trimmed by the Android
 *     resource compiler, which is what caused the bug in the first place (the format call itself
 *     was never wrong).
 */
class HighlightCardBodyTest {

    private val template = "Over the last 7 days, you %1\$s %2\$s%3\$s%4\$s. That's %5\$s the 7 days before."

    @Test
    fun `cumulative metric body has a space between the unit and the per-day suffix`() {
        val body = highlightCardBody(
            template = template,
            verb = "averaged",
            value = "7,606",
            unitSuffix = " steps",
            perDaySuffix = " a day",
            change = "12% more than",
        )
        assertEquals(
            "Over the last 7 days, you averaged 7,606 steps a day. That's 12% more than the 7 days before.",
            body,
        )
        assertFalse("must not run the unit and suffix together", body.contains("stepsa day"))
    }

    @Test
    fun `minutes and kcal units keep the same spacing`() {
        val minutesBody = highlightCardBody(template, "averaged", "34", " min", " a day", "about the same as")
        assertTrue(minutesBody.contains("34 min a day"))
        assertFalse(minutesBody.contains("mina day"))

        val kcalBody = highlightCardBody(template, "averaged", "473", " kcal", " a day", "9% less than")
        assertTrue(kcalBody.contains("473 kcal a day"))
        assertFalse(kcalBody.contains("kcala day"))
    }

    @Test
    fun `discrete metric has no per-day suffix and no double space`() {
        val body = highlightCardBody(template, "averaged", "64", " bpm", "", "about the same as")
        assertEquals(
            "Over the last 7 days, you averaged 64 bpm. That's about the same as the 7 days before.",
            body,
        )
    }

    @Test
    fun `sleep has no unit suffix either`() {
        val body = highlightCardBody(template, "slept", "7 hr 12 min", "", "", "about the same as")
        assertEquals(
            "Over the last 7 days, you slept 7 hr 12 min. That's about the same as the 7 days before.",
            body,
        )
    }

    @Test
    fun `per-day suffix resource keeps its leading space escaped in both locales`() {
        for (resDir in listOf("values", "values-vi")) {
            val file = File("src/main/res/$resDir/strings.xml")
            assertTrue("${file.path} should exist", file.exists())
            val xml = file.readText()
            val match = Regex("""<string name="highlight_per_day_suffix">(.*?)</string>""").find(xml)
            assertTrue("highlight_per_day_suffix not found in ${file.path}", match != null)
            val rawValue = match!!.groupValues[1]
            assertTrue(
                "${file.path}: highlight_per_day_suffix must start with the \\u0020 escape, not a bare space " +
                    "(a bare leading space is silently trimmed by the Android resource compiler, producing " +
                    "\"...stepsa day\"), was: $rawValue",
                rawValue.startsWith("\\u0020"),
            )
        }
    }
}
