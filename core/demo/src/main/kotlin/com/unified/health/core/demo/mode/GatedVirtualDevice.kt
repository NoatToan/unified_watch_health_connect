package com.unified.health.core.demo.mode

import com.unified.health.core.ble.gatt.GattClient
import com.unified.health.core.ble.scan.Advertisement
import com.unified.health.core.ble.virtual.VirtualDevice
import com.unified.health.core.domain.repository.DemoModeController

/**
 * Wraps a simulated watch so it only counts as present while [DemoModeController.enabled] is true.
 * `:core:ble`'s scanner/connector call [isActive] fresh on every scan/connect, so flipping the
 * Settings switch takes effect immediately, without a restart (D-71x). `:core:ble` and the wrapped
 * [delegate] stay unaware this gate exists.
 */
internal class GatedVirtualDevice(
    private val delegate: VirtualDevice,
    private val demoMode: DemoModeController,
) : VirtualDevice {
    override val isActive: Boolean get() = demoMode.enabled.value
    override val advertisement: Advertisement get() = delegate.advertisement
    override suspend fun connect(): GattClient = delegate.connect()
}

/** Gates every device in [this] the same way; convenience for `@Provides` functions in this module. */
internal fun Collection<VirtualDevice>.gatedBy(demoMode: DemoModeController): Set<VirtualDevice> =
    map { GatedVirtualDevice(it, demoMode) }.toSet()
