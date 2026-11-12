package com.unified.health.core.demo.detail

import com.unified.health.core.demo.DemoDeviceIds
import com.unified.health.core.domain.repository.SyntheticWorkoutDetailSource
import com.unified.health.core.domain.repository.WorkoutDetailSupplement
import com.unified.health.core.model.Workout
import javax.inject.Inject

/**
 * The only real implementation of [SyntheticWorkoutDetailSource] (docs/DECISIONS.md D-1195), bound
 * in [com.unified.health.core.demo.di.DemoDataModule] — present only in debug/androidTest builds, same
 * as every other demo-only binding in this module. Gates by device id: a demo workout (recorded by
 * one of [DemoDeviceIds.ALL]) gets synthesized laps/samples; a real device's workout always gets null,
 * so [SyntheticWorkoutDetailGenerator] is never consulted for anything but demo data.
 */
class DemoSyntheticWorkoutDetailSource @Inject constructor() : SyntheticWorkoutDetailSource {
    override fun supplement(workout: Workout): WorkoutDetailSupplement? {
        if (workout.sourceDeviceId !in DemoDeviceIds.ALL) return null
        return SyntheticWorkoutDetailGenerator.generate(workout)
    }

    override fun isDemoDevice(deviceId: String): Boolean = deviceId in DemoDeviceIds.ALL
}
