package com.unified.health.driver.garmin.di

import com.unified.health.core.ble.driver.WearableDriver
import com.unified.health.driver.garmin.GarminDriver
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoSet

@Module
@InstallIn(SingletonComponent::class)
internal abstract class GarminDriverModule {
    @Binds
    @IntoSet
    abstract fun bindDriver(impl: GarminDriver): WearableDriver
}
