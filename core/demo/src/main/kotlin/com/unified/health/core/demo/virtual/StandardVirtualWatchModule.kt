package com.unified.health.core.demo.virtual

import com.unified.health.core.ble.virtual.VirtualDevice
import com.unified.health.core.demo.BuildConfig
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.ElementsIntoSet

/**
 * Adds the simulated SIG band to scan results in debug/androidTest builds. It is served by the real
 * `:driver:standard` (no mock driver), so E2E exercises the production driver end to end (D-611).
 */
@Module
@InstallIn(SingletonComponent::class)
internal object StandardVirtualWatchModule {
    @Provides
    @ElementsIntoSet
    fun standardVirtualWatch(): Set<VirtualDevice> =
        if (BuildConfig.MOCK_DEVICE) setOf(StandardVirtualWatchDevice()) else emptySet()
}
