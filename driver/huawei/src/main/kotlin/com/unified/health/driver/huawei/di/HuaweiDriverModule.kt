package com.unified.health.driver.huawei.di

import com.unified.health.core.ble.driver.WearableDriver
import com.unified.health.driver.huawei.HuaweiDriver
import com.unified.health.driver.huawei.auth.HuaweiAuthenticator
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoSet
import dagger.multibindings.Multibinds

@Module
@InstallIn(SingletonComponent::class)
internal abstract class HuaweiDriverModule {
    @Binds
    @IntoSet
    abstract fun bindDriver(impl: HuaweiDriver): WearableDriver

    /**
     * Authentication strategies, empty on purpose: every known mechanism needs Huawei's embedded
     * CAK or native HiChain (see [HuaweiDriver]). Add one with
     * `@Binds @IntoSet abstract fun bindX(impl: XAuthenticator): HuaweiAuthenticator`.
     */
    @Multibinds
    abstract fun authenticators(): Set<HuaweiAuthenticator>
}
