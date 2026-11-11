package com.unified.health.core.designsystem.component

import com.unified.health.core.model.HealthMetricType
import com.unified.health.core.model.UnitSystem
import org.junit.Assert.assertEquals
import org.junit.Test
import java.util.Locale

/** D-1183: Imperial switches DISTANCE/WEIGHT display to mi/lb; every other metric is unaffected. */
class MetricFormatTest {

    @Test
    fun `distance formats in km for Metric, mi for Imperial`() {
        assertEquals("5.0", HealthMetricType.DISTANCE.formatValue(5_000.0, Locale.US, UnitSystem.METRIC))
        assertEquals("3.1", HealthMetricType.DISTANCE.formatValue(5_000.0, Locale.US, UnitSystem.IMPERIAL))
    }

    @Test
    fun `distance defaults to Metric when unitSystem is not passed`() {
        assertEquals("5.0", HealthMetricType.DISTANCE.formatValue(5_000.0, Locale.US))
    }

    @Test
    fun `weight formats in kg for Metric, lb for Imperial`() {
        assertEquals("70.0", HealthMetricType.WEIGHT.formatValue(70.0, Locale.US, UnitSystem.METRIC))
        assertEquals("154.3", HealthMetricType.WEIGHT.formatValue(70.0, Locale.US, UnitSystem.IMPERIAL))
    }

    @Test
    fun `unit system does not affect metrics with a system-independent unit`() {
        assertEquals("8,412", HealthMetricType.STEPS.formatValue(8_412.0, Locale.US, UnitSystem.IMPERIAL))
    }

    @Test
    fun `unit suffix switches with unit system for distance and weight only`() {
        assertEquals("km", HealthMetricType.DISTANCE.unit(UnitSystem.METRIC))
        assertEquals("mi", HealthMetricType.DISTANCE.unit(UnitSystem.IMPERIAL))
        assertEquals("kg", HealthMetricType.WEIGHT.unit(UnitSystem.METRIC))
        assertEquals("lb", HealthMetricType.WEIGHT.unit(UnitSystem.IMPERIAL))
        assertEquals("bpm", HealthMetricType.HEART_RATE.unit(UnitSystem.IMPERIAL))
    }
}
