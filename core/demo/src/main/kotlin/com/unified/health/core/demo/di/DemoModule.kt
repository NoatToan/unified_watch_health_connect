package com.unified.health.core.demo.di

import com.unified.health.core.ble.driver.WearableDriver
import com.unified.health.core.ble.virtual.VirtualDevice
import com.unified.health.core.demo.BuildConfig
import com.unified.health.core.demo.mock.MockWatchDriver
import com.unified.health.core.demo.mock.MockWatchVirtualDevice
import com.unified.health.core.demo.seed.DemoDataSeeder
import com.unified.health.core.domain.repository.DemoDataController
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.ElementsIntoSet

/**
 * Present only in debug/androidTest graphs (the app depends on `:core:demo` via `debugImplementation`).
 * Adds the simulated watch to scan results and the driver registry, and the seeding tool to Profile.
 */
@Module
@InstallIn(SingletonComponent::class)
internal object DemoDeviceModule {

    @Provides
    @ElementsIntoSet
    fun mockDriver(): Set<WearableDriver> = if (BuildConfig.MOCK_DEVICE) setOf(MockWatchDriver()) else emptySet()

    @Provides
    @ElementsIntoSet
    fun mockDevice(): Set<VirtualDevice> = if (BuildConfig.MOCK_DEVICE) setOf(MockWatchVirtualDevice()) else emptySet()
}

@Module
@InstallIn(SingletonComponent::class)
internal abstract class DemoDataModule {
    @Binds
    abstract fun bindDemoDataController(impl: DemoDataSeeder): DemoDataController
}
