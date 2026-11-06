package com.unified.health.driver.coros.di

import com.unified.health.core.ble.driver.WearableDriver
import com.unified.health.driver.coros.CorosDriver
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoSet

@Module
@InstallIn(SingletonComponent::class)
internal abstract class CorosDriverModule {
    @Binds
    @IntoSet
    abstract fun bindDriver(impl: CorosDriver): WearableDriver
}
