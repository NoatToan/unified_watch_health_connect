package com.unified.health.core.model

/**
 * Display-only unit conversions for [UnitSystem] (docs/DECISIONS.md D-1183). Storage (Room, Health
 * Connect, the domain layer) always keeps meters/kilograms — Health Connect's own canonical units —
 * so these only ever run right before a value is rendered as text, never before it is persisted.
 */
private const val METERS_PER_MILE = 1609.344
private const val LB_PER_KG = 2.20462

/** How many meters make up one displayed distance unit for [UnitSystem] — 1000 for km, 1609.344 for mi. */
fun UnitSystem.metersPerDistanceUnit(): Double = if (this == UnitSystem.IMPERIAL) METERS_PER_MILE else 1000.0

/** A stored distance in meters, converted to what [unitSystem] should display: km (Metric) or mi (Imperial). */
fun Double.metersToDisplayDistance(unitSystem: UnitSystem): Double = this / unitSystem.metersPerDistanceUnit()

/** A stored weight in kilograms, converted to what [unitSystem] should display: kg (Metric) or lb (Imperial). */
fun Double.kgToDisplayWeight(unitSystem: UnitSystem): Double =
    if (unitSystem == UnitSystem.IMPERIAL) this * LB_PER_KG else this

/** The unit suffix for a distance already converted via [metersToDisplayDistance]. */
fun UnitSystem.distanceUnitLabel(): String = if (this == UnitSystem.IMPERIAL) "mi" else "km"

/** The unit suffix for a weight already converted via [kgToDisplayWeight]. */
fun UnitSystem.weightUnitLabel(): String = if (this == UnitSystem.IMPERIAL) "lb" else "kg"
