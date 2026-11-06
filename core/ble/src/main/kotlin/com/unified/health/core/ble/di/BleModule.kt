package com.unified.health.core.ble.di

import com.unified.health.core.ble.DeviceConnection
import com.unified.health.core.ble.DeviceScanner
import com.unified.health.core.ble.HealthDataSync
import com.unified.health.core.ble.credentials.DeviceCredentialStore
import com.unified.health.core.ble.credentials.KeystoreDeviceCredentialStore
import com.unified.health.core.ble.driver.WearableDriver
import com.unified.health.core.ble.gatt.GattConnector
import com.unified.health.core.ble.multivendor.MultiVendorDeviceConnection
import com.unified.health.core.ble.multivendor.MultiVendorDeviceScanner
import com.unified.health.core.ble.multivendor.MultiVendorHealthDataSync
import com.unified.health.core.ble.scan.BleScanner
import com.unified.health.core.ble.virtual.VirtualAwareBleScanner
import com.unified.health.core.ble.virtual.VirtualAwareGattConnector
import com.unified.health.core.ble.virtual.VirtualDevice
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.Multibinds

/**
 * Always the real multi-vendor stack. Debug builds may add [VirtualDevice]s (the simulated watch in
 * `:core:demo`); they travel the same scan → driver → session → sync path as real watches.
 */
@Module
@InstallIn(SingletonComponent::class)
internal abstract class BleBindingsModule {
    @Binds
    abstract fun bindGattConnector(impl: VirtualAwareGattConnector): GattConnector

    @Binds
    abstract fun bindBleScanner(impl: VirtualAwareBleScanner): BleScanner

    @Binds
    abstract fun bindCredentialStore(impl: KeystoreDeviceCredentialStore): DeviceCredentialStore

    /** Drivers are contributed by `:driver:*` modules with `@Binds @IntoSet`; the set may be empty. */
    @Multibinds
    abstract fun drivers(): Set<WearableDriver>

    /** Software-only devices; empty in release. */
    @Multibinds
    abstract fun virtualDevices(): Set<VirtualDevice>

    @Binds
    abstract fun bindDeviceScanner(impl: MultiVendorDeviceScanner): DeviceScanner

    @Binds
    abstract fun bindDeviceConnection(impl: MultiVendorDeviceConnection): DeviceConnection

    @Binds
    abstract fun bindHealthDataSync(impl: MultiVendorHealthDataSync): HealthDataSync
}
