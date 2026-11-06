package com.unified.health.core.demo.virtual.huawei.di

import com.unified.health.core.ble.virtual.VirtualDevice
import com.unified.health.core.demo.BuildConfig
import com.unified.health.core.demo.virtual.huawei.HuaweiVirtualWatch
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.ElementsIntoSet

/**
 * Contributes the simulated Huawei watch to `Set<VirtualDevice>` (declared by `:core:ble`'s
 * `BleBindingsModule`), present only in debug/androidTest graphs like the rest of `:core:demo`
 * (docs/DECISIONS.md D-201/D-203). Gated by the same `BuildConfig.MOCK_DEVICE` flag as the generic
 * demo watch so `-PunifiedHealth.mockDevice=false` hides every simulated device at once.
 */
@Module
@InstallIn(SingletonComponent::class)
internal object HuaweiVirtualModule {
    @Provides
    @ElementsIntoSet
    fun huaweiVirtualDevice(): Set<VirtualDevice> = if (BuildConfig.MOCK_DEVICE) setOf(HuaweiVirtualWatch()) else emptySet()
}
