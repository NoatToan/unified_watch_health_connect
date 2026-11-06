package com.unified.health.driver.huawei.auth.debug.di

import com.unified.health.driver.huawei.auth.HuaweiAuthenticator
import com.unified.health.driver.huawei.auth.debug.HuaweiSimulatorAuthenticator
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoSet

/**
 * Debug-only contribution to the `Set<HuaweiAuthenticator>` declared (empty) by
 * `HuaweiDriverModule` in the main source set. Compiled only into debug builds, so release keeps
 * zero authenticators (see [HuaweiSimulatorAuthenticator]'s KDoc and docs/DECISIONS.md D-3xx).
 */
@Module
@InstallIn(SingletonComponent::class)
internal abstract class HuaweiSimulatorAuthModule {
    @Binds
    @IntoSet
    abstract fun bindSimulatorAuthenticator(impl: HuaweiSimulatorAuthenticator): HuaweiAuthenticator
}
