package com.unified.health.core.demo.di

import com.unified.health.core.ble.driver.WearableDriver
import com.unified.health.core.ble.virtual.VirtualDevice
import com.unified.health.core.demo.detail.DemoSyntheticWorkoutDetailSource
import com.unified.health.core.demo.mock.MockWatchDriver
import com.unified.health.core.demo.mock.MockWatchVirtualDevice
import com.unified.health.core.demo.mode.DemoModeControllerImpl
import com.unified.health.core.demo.mode.gatedBy
import com.unified.health.core.demo.seed.DemoDataSeeder
import com.unified.health.core.demo.virtual.GarminVirtualDevice
import com.unified.health.core.demo.virtual.ZeppVirtualWatch
import com.unified.health.core.domain.repository.DemoDataController
import com.unified.health.core.domain.repository.DemoModeController
import com.unified.health.core.domain.repository.SyntheticWorkoutDetailSource
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.ElementsIntoSet

/**
 * Present only in debug/androidTest graphs (the app depends on `:core:demo` via `debugImplementation`).
 * Adds the simulated watches to scan results and the driver registry, and the seeding tool to
 * Profile. Every virtual device is gated by [DemoModeController] (see `GatedVirtualDevice`), so it
 * only shows up in scan once the user turns "Demo mode" on in Settings; `:core:ble` just sees an
 * empty/non-empty set, never the reason.
 */
@Module
@InstallIn(SingletonComponent::class)
internal object DemoDeviceModule {

    /**
     * Not gated here: its only virtual device ([mockDevice]) already stops advertising while demo
     * mode is off, so `recognize()` is simply never called with it — same effect, one less knob.
     */
    @Provides
    @ElementsIntoSet
    fun mockDriver(): Set<WearableDriver> = setOf(MockWatchDriver())

    @Provides
    @ElementsIntoSet
    fun mockDevice(demoMode: DemoModeController): Set<VirtualDevice> =
        setOf(MockWatchVirtualDevice(), GarminVirtualDevice()).gatedBy(demoMode)

    /**
     * No mock *driver* here: the real `ZeppDriver` (`:driver:zepp`, already on the app's Hilt graph)
     * recognises and authenticates this virtual device like any real Zepp/Amazfit watch (§7/E2E in
     * `docs/DECISIONS.md` D-5xx).
     */
    @Provides
    @ElementsIntoSet
    fun zeppVirtualWatch(demoMode: DemoModeController): Set<VirtualDevice> = setOf(ZeppVirtualWatch()).gatedBy(demoMode)
}

@Module
@InstallIn(SingletonComponent::class)
internal abstract class DemoDataModule {
    @Binds
    abstract fun bindDemoDataController(impl: DemoDataSeeder): DemoDataController

    @Binds
    abstract fun bindDemoModeController(impl: DemoModeControllerImpl): DemoModeController

    /** D-1195: synthesizes laps/samples for a demo workout that has none stored, computed on open. */
    @Binds
    abstract fun bindSyntheticWorkoutDetailSource(impl: DemoSyntheticWorkoutDetailSource): SyntheticWorkoutDetailSource
}
