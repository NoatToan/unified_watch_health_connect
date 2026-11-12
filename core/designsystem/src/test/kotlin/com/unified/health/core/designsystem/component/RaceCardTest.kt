package com.unified.health.core.designsystem.component

import com.unified.health.core.model.RaceDistance
import com.unified.health.core.model.RaceRegistrationStatus
import com.unified.health.core.model.RaceTerrain
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class RaceCardTest {

    @Test
    fun `formatVnd groups thousands with dots, Vietnamese-style`() {
        assertEquals("790.000đ", formatVnd(790_000))
        assertEquals("1.500.000đ", formatVnd(1_500_000))
        assertEquals("500đ", formatVnd(500))
        assertEquals("0đ", formatVnd(0))
    }

    // D-1197: visibleDistancePills was extracted out of DistancePills (the "+N" chip bug fix) so this
    // sort/cap math has its own focused JVM test independent of Compose.
    @Test
    fun `visibleDistancePills shows every distance with no extra when at or under the cap`() {
        val distances = listOf(
            distance("5km", 5.0),
            distance("10km", 10.0),
            distance("21km", 21.0),
            distance("42km", 42.0),
        )
        val (shown, extra) = visibleDistancePills(distances)
        assertEquals(4, shown.size)
        assertEquals(0, extra)
    }

    @Test
    fun `visibleDistancePills caps at 4, longest-distance-first, and counts the rest as extra`() {
        val distances = listOf(
            distance("1km", 1.0),
            distance("2km fun run", 2.0),
            distance("5km", 5.0),
            distance("10km", 10.0),
            distance("21km", 21.0),
            distance("42km", 42.0),
        )
        val (shown, extra) = visibleDistancePills(distances)
        assertEquals(listOf("42km", "21km", "10km", "5km"), shown.map { it.label })
        assertEquals(2, extra)
    }

    @Test
    fun `visibleDistancePills on an empty list shows nothing and no extra`() {
        val (shown, extra) = visibleDistancePills(emptyList())
        assertTrue(shown.isEmpty())
        assertEquals(0, extra)
    }

    private fun distance(label: String, km: Double) =
        RaceDistance(label = label, km = km, priceVnd = null, status = RaceRegistrationStatus.OPEN)

    @Test
    fun `every terrain has its own gradient colors and icon`() {
        val gradients = RaceTerrain.entries.map { it.gradientColors() }
        val icons = RaceTerrain.entries.map { it.icon() }
        // D-1106: 6 *distinct* gradient pairs — no two terrains should silently share one.
        assertEquals(RaceTerrain.entries.size, gradients.distinct().size)
        assertEquals(RaceTerrain.entries.size, icons.distinct().size)
    }

    @Test
    fun `terrain label is never blank`() {
        RaceTerrain.entries.forEach { terrain -> assertNotEquals("", terrain.label().trim()) }
    }

    @Test
    fun `ctaLabel covers every registration status with a non-blank Vietnamese label`() {
        assertEquals("Đăng ký ngay", RaceRegistrationStatus.OPEN.ctaLabel())
        assertEquals("Đã đóng đăng ký", RaceRegistrationStatus.CLOSED.ctaLabel())
        assertEquals("Hết vé", RaceRegistrationStatus.SOLD_OUT.ctaLabel())
        assertEquals("Xem chi tiết", RaceRegistrationStatus.UNKNOWN.ctaLabel())
        RaceRegistrationStatus.entries.forEach { status -> assertNotEquals("", status.ctaLabel().trim()) }
    }
}
