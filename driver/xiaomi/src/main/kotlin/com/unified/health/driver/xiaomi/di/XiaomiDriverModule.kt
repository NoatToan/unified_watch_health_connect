package com.unified.health.driver.xiaomi.di

import com.unified.health.core.ble.driver.WearableDriver
import com.unified.health.driver.xiaomi.XiaomiDriver
import com.unified.health.driver.xiaomi.auth.XiaomiAuthenticator
import com.unified.health.driver.xiaomi.auth.XiaomiAuthenticatorImpl
import com.unified.health.driver.xiaomi.sync.XiaomiFitnessSync
import com.unified.health.driver.xiaomi.sync.XiaomiFitnessSyncImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoSet

@Module
@InstallIn(SingletonComponent::class)
internal abstract class XiaomiDriverModule {
    @Binds
    @IntoSet
    abstract fun bindDriver(impl: XiaomiDriver): WearableDriver

    @Binds
    abstract fun bindAuthenticator(impl: XiaomiAuthenticatorImpl): XiaomiAuthenticator

    @Binds
    abstract fun bindFitnessSync(impl: XiaomiFitnessSyncImpl): XiaomiFitnessSync
}
