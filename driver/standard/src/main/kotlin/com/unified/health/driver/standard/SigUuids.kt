package com.unified.health.driver.standard

import com.unified.health.core.ble.gatt.StandardUuids
import com.unified.health.core.ble.gatt.sigUuid
import java.util.UUID

/**
 * Bluetooth SIG Assigned Numbers used by this driver [Ext: Bluetooth SIG "Assigned Numbers",
 * §3.4 GATT Services / §3.8 Characteristics]. Services/characteristics already in
 * [StandardUuids] (Heart Rate, Battery, Device Information, Current Time) are re-exported here so
 * the driver reads from one place.
 */
internal object SigUuids {
    // Heart Rate Service 1.0 (HRS).
    val HEART_RATE_SERVICE: UUID = StandardUuids.HEART_RATE_SERVICE
    val HEART_RATE_MEASUREMENT: UUID = StandardUuids.HEART_RATE_MEASUREMENT

    // Battery Service 1.0 / Device Information Service 1.1.
    val BATTERY_SERVICE: UUID = StandardUuids.BATTERY_SERVICE
    val BATTERY_LEVEL: UUID = StandardUuids.BATTERY_LEVEL
    val DEVICE_INFORMATION_SERVICE: UUID = StandardUuids.DEVICE_INFORMATION_SERVICE

    // Current Time Service 1.1 (CTS).
    val CURRENT_TIME_SERVICE: UUID = StandardUuids.CURRENT_TIME_SERVICE
    val CURRENT_TIME: UUID = StandardUuids.CURRENT_TIME
    val LOCAL_TIME_INFORMATION: UUID = sigUuid(0x2A0F)

    // Pulse Oximeter Service 1.0 (PLXS).
    val PULSE_OXIMETER_SERVICE: UUID = sigUuid(0x1822)
    val PLX_SPOT_CHECK: UUID = sigUuid(0x2A5E)
    val PLX_CONTINUOUS: UUID = sigUuid(0x2A5F)
    val RECORD_ACCESS_CONTROL_POINT: UUID = sigUuid(0x2A52)

    // Running Speed and Cadence Service 1.0 (RSCS).
    val RSC_SERVICE: UUID = sigUuid(0x1814)
    val RSC_MEASUREMENT: UUID = sigUuid(0x2A53)

    // Cycling Speed and Cadence Service 1.0 (CSCS) — not decoded, see D-606.
    val CSC_SERVICE: UUID = sigUuid(0x1816)

    // User Data Service 1.0 (UDS) — not used, see D-606.
    val USER_DATA_SERVICE: UUID = sigUuid(0x181C)

    // Blood Pressure 1.1, Health Thermometer 1.0, Weight Scale 1.0, Body Composition 1.0.
    val BLOOD_PRESSURE_SERVICE: UUID = sigUuid(0x1810)
    val BLOOD_PRESSURE_MEASUREMENT: UUID = sigUuid(0x2A35)
    val HEALTH_THERMOMETER_SERVICE: UUID = sigUuid(0x1809)
    val TEMPERATURE_MEASUREMENT: UUID = sigUuid(0x2A1C)
    val WEIGHT_SCALE_SERVICE: UUID = sigUuid(0x181D)
    val WEIGHT_MEASUREMENT: UUID = sigUuid(0x2A9D)
    val BODY_COMPOSITION_SERVICE: UUID = sigUuid(0x181B)
    val BODY_COMPOSITION_MEASUREMENT: UUID = sigUuid(0x2A9C)

    /** Services whose presence in an advertisement makes a device "ours" (see [StandardProfileDriver.recognize]). */
    val HEALTH_SERVICES: Set<UUID> = setOf(
        HEART_RATE_SERVICE,
        PULSE_OXIMETER_SERVICE,
        RSC_SERVICE,
        BLOOD_PRESSURE_SERVICE,
        HEALTH_THERMOMETER_SERVICE,
        WEIGHT_SCALE_SERVICE,
        BODY_COMPOSITION_SERVICE,
    )
}
