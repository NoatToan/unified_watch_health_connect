package com.unified.health.core.demo.virtual.huawei.di

import com.unified.health.core.ble.virtual.VirtualDevice
import com.unified.health.core.demo.mode.gatedBy
import com.unified.health.core.demo.virtual.huawei.HuaweiAuthRequiredVirtualDevice
import com.unified.health.core.demo.virtual.huawei.HuaweiVirtualWatch
import com.unified.health.core.domain.repository.DemoModeController
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.ElementsIntoSet

/**
 * Contributes the simulated Huawei watches to `Set<VirtualDevice>` (declared by `:core:ble`'s
 * `BleBindingsModule`), present only in debug/androidTest graphs like the rest of `:core:demo`
 * (docs/DECISIONS.md D-201/D-203). Gated by [DemoModeController] like every other virtual watch in
 * this module, so turning "Demo mode" off in Settings hides them all at once, at runtime.
 */
@Module
@InstallIn(SingletonComponent::class)
internal object HuaweiVirtualModule {
    @Provides
    @ElementsIntoSet
    fun huaweiVirtualDevice(demoMode: DemoModeController): Set<VirtualDevice> = setOf(
        HuaweiVirtualWatch(),
        HuaweiVirtualWatch(
            address = HuaweiAuthRequiredVirtualDevice.ADDRESS,
            name = HuaweiAuthRequiredVirtualDevice.NAME,
            authVersion = HuaweiAuthRequiredVirtualDevice.AUTH_VERSION,
            authType = HuaweiAuthRequiredVirtualDevice.AUTH_TYPE,
        ),
    ).gatedBy(demoMode)
}
