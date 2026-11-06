package com.unified.health.core.domain

import com.unified.health.core.domain.usecase.WatchAlertRules
import com.unified.health.core.model.WearableDevice
import com.unified.health.core.model.WearableVendor
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test
import java.time.LocalDate

class WatchAlertRulesTest {

    private fun watch(id: String, battery: Int?) = WearableDevice(id, "Watch $id", id, WearableVendor.GARMIN, batteryPercent = battery)

    @Test
    fun `low battery alerts once until the device recovers`() {
        val first = WatchAlertRules.lowBattery(listOf(watch("a", 15)), emptySet())
        assertEquals(listOf("a"), first.notify.map { it.id })
        assertEquals(setOf("a"), first.alerted)

        val again = WatchAlertRules.lowBattery(listOf(watch("a", 12)), first.alerted)
        assertTrue(again.notify.isEmpty())

        val hysteresis = WatchAlertRules.lowBattery(listOf(watch("a", 25)), again.alerted)
        assertEquals(setOf("a"), hysteresis.alerted) // 25% is not "recovered" yet

        val recovered = WatchAlertRules.lowBattery(listOf(watch("a", 80)), hysteresis.alerted)
        assertTrue(recovered.alerted.isEmpty())
        assertEquals(1, WatchAlertRules.lowBattery(listOf(watch("a", 20)), recovered.alerted).notify.size)
    }

    @Test
    fun `unknown battery keeps state, unpaired devices are forgotten`() {
        val decision = WatchAlertRules.lowBattery(listOf(watch("a", null)), setOf("a", "gone"))
        assertTrue(decision.notify.isEmpty())
        assertEquals(setOf("a"), decision.alerted)
    }

    @Test
    fun `goal fires once per day`() {
        val today = LocalDate.of(2026, 11, 6)
        assertTrue(WatchAlertRules.goalReached(8_000, 8_000, today, null))
        assertTrue(WatchAlertRules.goalReached(9_000, 8_000, today, today.minusDays(1)))
        assertFalse(WatchAlertRules.goalReached(9_000, 8_000, today, today))
        assertFalse(WatchAlertRules.goalReached(7_999, 8_000, today, null))
        assertFalse(WatchAlertRules.goalReached(100, 0, today, null))
    }
}
