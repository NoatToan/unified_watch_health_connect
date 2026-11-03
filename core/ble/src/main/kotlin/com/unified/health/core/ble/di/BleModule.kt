package com.unified.health.core.ble.di

import android.bluetooth.BluetoothManager
import android.content.Context
import android.content.pm.PackageManager
import com.unified.health.core.ble.BuildConfig
import com.unified.health.core.ble.DeviceConnection
import com.unified.health.core.ble.DeviceScanner
import com.unified.health.core.ble.HealthDataSync
import com.unified.health.core.ble.credentials.DeviceCredentialStore
import com.unified.health.core.ble.credentials.KeystoreDeviceCredentialStore
import com.unified.health.core.ble.driver.WearableDriver
import com.unified.health.core.ble.fake.FakeDeviceConnection
import com.unified.health.core.ble.fake.FakeDeviceScanner
import com.unified.health.core.ble.fake.FakeHealthDataSync
import com.unified.health.core.ble.gatt.AndroidGattConnector
import com.unified.health.core.ble.gatt.GattConnector
import com.unified.health.core.ble.multivendor.MultiVendorDeviceConnection
import com.unified.health.core.ble.multivendor.MultiVendorDeviceScanner
import com.unified.health.core.ble.multivendor.MultiVendorHealthDataSync
import com.unified.health.core.ble.scan.AndroidBleScanner
import com.unified.health.core.ble.scan.BleScanner
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.Multibinds
import javax.inject.Provider
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal abstract class BleBindingsModule {
    @Binds
    abstract fun bindGattConnector(impl: AndroidGattConnector): GattConnector

    @Binds
    abstract fun bindBleScanner(impl: AndroidBleScanner): BleScanner

    @Binds
    abstract fun bindCredentialStore(impl: KeystoreDeviceCredentialStore): DeviceCredentialStore

    /** Drivers are contributed by `:driver:*` modules with `@Binds @IntoSet`; the set may be empty. */
    @Multibinds
    abstract fun drivers(): Set<WearableDriver>
}

/**
 * Chooses the real multi-vendor stack, or the fakes when the build asks for them
 * (`-PunifiedHealth.fakeBle=true`) or the device has no BLE (most emulators).
 */
@Module
@InstallIn(SingletonComponent::class)
internal object BleModule {

    @Provides
    @Singleton
    @UseFakeBle
    fun useFakeBle(@ApplicationContext context: Context): Boolean =
        BuildConfig.FAKE_BLE ||
            !context.packageManager.hasSystemFeature(PackageManager.FEATURE_BLUETOOTH_LE) ||
            context.getSystemService(BluetoothManager::class.java)?.adapter == null

    @Provides
    fun deviceScanner(@UseFakeBle fake: Boolean, real: Provider<MultiVendorDeviceScanner>, demo: Provider<FakeDeviceScanner>): DeviceScanner =
        if (fake) demo.get() else real.get()

    @Provides
    @Singleton
    fun deviceConnection(@UseFakeBle fake: Boolean, real: Provider<MultiVendorDeviceConnection>, demo: Provider<FakeDeviceConnection>): DeviceConnection =
        if (fake) demo.get() else real.get()

    @Provides
    @Singleton
    fun healthDataSync(@UseFakeBle fake: Boolean, real: Provider<MultiVendorHealthDataSync>, demo: Provider<FakeHealthDataSync>): HealthDataSync =
        if (fake) demo.get() else real.get()
}

/**
 * `true` when the app runs on demo devices/data (no BLE hardware or `-PunifiedHealth.fakeBle=true`).
 * Other layers use it to stay consistent, e.g. showing demo health data alongside demo devices.
 */
@javax.inject.Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class UseFakeBle
