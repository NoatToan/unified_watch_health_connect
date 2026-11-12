package com.unified.health.core.domain.repository

import com.unified.health.core.model.Workout
import com.unified.health.core.model.WorkoutLap
import com.unified.health.core.model.WorkoutSample

/**
 * Laps + per-second-ish samples synthesized for a workout that has none stored (docs/DECISIONS.md
 * D-1195) — never persisted, computed fresh each time the detail screen is opened.
 */
data class WorkoutDetailSupplement(
    val laps: List<WorkoutLap>,
    val samples: List<WorkoutSample>,
)

/**
 * Fills in [WorkoutLap]/[WorkoutSample] detail for workouts whose device/sync never recorded any
 * (today, only demo watches — `:core:demo`'s `workoutFor()` only emits a summary `HealthRecord.Workout`,
 * D-1195). Bound only in debug/androidTest builds (absent from the release graph, same pattern as
 * [DemoModeController]/[DemoDataController]), so callers inject it as
 * `Optional<SyntheticWorkoutDetailSource>` and simply get nothing back when it is empty — real device
 * data is never synthesized.
 */
interface SyntheticWorkoutDetailSource {
    /**
     * @return laps/samples for [workout], or null when this workout is not eligible (not a demo
     * device) — callers only consult this after their own repository returned no laps/samples, and
     * must still prefer those real rows over this result whenever they exist.
     */
    fun supplement(workout: Workout): WorkoutDetailSupplement?

    /**
     * True when [deviceId] is one of this build's demo/virtual watches. Demo watches are never real
     * BLE peripherals, so they never show up in [com.unified.health.core.domain.repository.WearableDeviceRepository.pairedDevices]
     * either — a workout recorded by one would otherwise show its raw synthetic MAC as "source" with
     * no friendly name at all. Independent of [supplement]: a demo workout whose device/sync *did*
     * record real laps/samples should still resolve to a friendly "Demo watch" label.
     */
    fun isDemoDevice(deviceId: String): Boolean
}
