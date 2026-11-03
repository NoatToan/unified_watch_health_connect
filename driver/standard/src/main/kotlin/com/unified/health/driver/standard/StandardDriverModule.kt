package com.unified.health.driver.standard

import com.unified.health.core.ble.driver.WearableDriver
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoSet

@Module
@InstallIn(SingletonComponent::class)
internal abstract class StandardDriverModule {
    @Binds
    @IntoSet
    abstract fun bindDriver(impl: StandardProfileDriver): WearableDriver
}
