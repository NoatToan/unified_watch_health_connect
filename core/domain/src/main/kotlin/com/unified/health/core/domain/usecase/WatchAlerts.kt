package com.unified.health.core.domain.usecase

import com.unified.health.core.model.WearableDevice
import java.time.LocalDate

/**
 * When the phone should post a local alert. Pure rules; the app's alert monitor feeds them the
 * repository flows and persists the returned state so each alert fires once.
 */
object WatchAlertRules {
    /** At or below this the watch is "low". */
    const val LOW_BATTERY_PERCENT = 20

    /** A device is re-armed only once it reports at least this (hysteresis: no flapping around 20%). */
    const val RECOVERED_BATTERY_PERCENT = 30

    data class BatteryDecision(
        /** Devices that just crossed into "low" and were not alerted yet. */
        val notify: List<WearableDevice>,
        /** New alerted set to persist. */
        val alerted: Set<String>,
    )

    fun lowBattery(devices: List<WearableDevice>, alerted: Set<String>): BatteryDecision {
        val ids = devices.map { it.id }.toSet()
        val next = alerted.filter { it in ids }.toMutableSet() // forget unpaired devices
        val notify = mutableListOf<WearableDevice>()
        devices.forEach { device ->
            val battery = device.batteryPercent ?: return@forEach
            when {
                battery <= LOW_BATTERY_PERCENT && next.add(device.id) -> notify += device
                battery >= RECOVERED_BATTERY_PERCENT -> next.remove(device.id)
            }
        }
        return BatteryDecision(notify, next)
    }

    /** True once per day, the first time [steps] reaches a positive [goal]. */
    fun goalReached(steps: Int, goal: Int, today: LocalDate, lastNotified: LocalDate?): Boolean =
        goal > 0 && steps >= goal && lastNotified != today
}
