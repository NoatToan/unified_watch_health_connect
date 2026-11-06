package com.unified.health.driver.huawei.wearengine.di

import com.unified.health.core.ble.driver.CompanionAppDriver
import com.unified.health.driver.huawei.wearengine.HuaweiWearEngineDriver
import com.unified.health.driver.huawei.wearengine.WearEngineGateway
import com.unified.health.driver.huawei.wearengine.sdk.SdkWearEngineGateway
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoSet

@Module
@InstallIn(SingletonComponent::class)
internal abstract class HuaweiWearEngineModule {
    @Binds
    @IntoSet
    abstract fun bindDriver(impl: HuaweiWearEngineDriver): CompanionAppDriver

    @Binds
    abstract fun bindGateway(impl: SdkWearEngineGateway): WearEngineGateway
}
