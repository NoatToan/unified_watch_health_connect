package com.unified.health.core.model

import org.junit.Assert.assertEquals
import org.junit.Test

/** D-1183: display-only meter/kilogram conversions — storage never changes, see docs/DECISIONS.md. */
class UnitConversionTest {

    @Test
    fun `meters to display distance is a no-op in km for Metric, divides by 1609_344 for Imperial`() {
        assertEquals(5.0, 5_000.0.metersToDisplayDistance(UnitSystem.METRIC), 1e-9)
        assertEquals(3.106855, 5_000.0.metersToDisplayDistance(UnitSystem.IMPERIAL), 1e-5)
    }

    @Test
    fun `kg to display weight is a no-op for Metric, multiplies by 2_20462 for Imperial`() {
        assertEquals(70.0, 70.0.kgToDisplayWeight(UnitSystem.METRIC), 1e-9)
        assertEquals(154.3234, 70.0.kgToDisplayWeight(UnitSystem.IMPERIAL), 1e-4)
    }

    @Test
    fun `unit labels follow the unit system`() {
        assertEquals("km", UnitSystem.METRIC.distanceUnitLabel())
        assertEquals("mi", UnitSystem.IMPERIAL.distanceUnitLabel())
        assertEquals("kg", UnitSystem.METRIC.weightUnitLabel())
        assertEquals("lb", UnitSystem.IMPERIAL.weightUnitLabel())
    }
}
