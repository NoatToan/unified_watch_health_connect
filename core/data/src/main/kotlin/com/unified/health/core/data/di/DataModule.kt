package com.unified.health.core.data.di

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.PreferenceDataStoreFactory
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStoreFile
import androidx.room.Room
import com.unified.health.core.data.database.HealthRecordDao
import com.unified.health.core.data.database.PairedDeviceDao
import com.unified.health.core.data.database.UnifiedHealthDatabase
import com.unified.health.core.data.datastore.DataStoreUserPreferencesRepository
import com.unified.health.core.data.healthconnect.HealthConnectManager
import com.unified.health.core.data.link.DefaultDeviceLinkKeeper
import com.unified.health.core.data.live.DefaultLiveHealthRepository
import com.unified.health.core.data.pairing.DefaultPairingCodeBroker
import com.unified.health.core.domain.repository.DeviceLinkKeeper
import com.unified.health.core.domain.repository.LiveHealthRepository
import com.unified.health.core.data.repository.DefaultWearableDeviceRepository
import com.unified.health.core.ble.pairing.PairingCodeRequester
import com.unified.health.core.domain.repository.PairingCodeBroker
import com.unified.health.core.ble.di.UseFakeBle
import com.unified.health.core.data.repository.FakeHealthDataRepository
import com.unified.health.core.data.repository.LocalHealthDataRepository
import com.unified.health.core.domain.repository.HealthConnectRepository
import com.unified.health.core.domain.repository.HealthDataRepository
import com.unified.health.core.domain.repository.UserPreferencesRepository
import com.unified.health.core.domain.repository.WearableDeviceRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Provider
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal abstract class DataBindingsModule {

    @Binds
    @Singleton
    abstract fun bindWearableDeviceRepository(impl: DefaultWearableDeviceRepository): WearableDeviceRepository

    @Binds
    abstract fun bindLiveHealthRepository(impl: DefaultLiveHealthRepository): LiveHealthRepository

    @Binds
    abstract fun bindDeviceLinkKeeper(impl: DefaultDeviceLinkKeeper): DeviceLinkKeeper

    @Binds
    abstract fun bindPairingCodeBroker(impl: DefaultPairingCodeBroker): PairingCodeBroker

    @Binds
    abstract fun bindPairingCodeRequester(impl: DefaultPairingCodeBroker): PairingCodeRequester

    @Binds
    @Singleton
    abstract fun bindUserPreferencesRepository(impl: DataStoreUserPreferencesRepository): UserPreferencesRepository

    @Binds
    @Singleton
    abstract fun bindHealthConnectRepository(impl: HealthConnectManager): HealthConnectRepository
}

@Module
@InstallIn(SingletonComponent::class)
internal object DataProvidersModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): UnifiedHealthDatabase =
        Room.databaseBuilder(context, UnifiedHealthDatabase::class.java, "unified-health.db").build()

    @Provides
    fun providePairedDeviceDao(db: UnifiedHealthDatabase): PairedDeviceDao = db.pairedDeviceDao()

    @Provides
    fun provideHealthRecordDao(db: UnifiedHealthDatabase): HealthRecordDao = db.healthRecordDao()

    /** Local-first: real data comes from Room; demo data only alongside demo devices. */
    @Provides
    @Singleton
    fun provideHealthDataRepository(
        @UseFakeBle demo: Boolean,
        local: Provider<LocalHealthDataRepository>,
        fake: Provider<FakeHealthDataRepository>,
    ): HealthDataRepository = if (demo) fake.get() else local.get()

    @Provides
    @Singleton
    fun providePreferencesDataStore(@ApplicationContext context: Context): DataStore<Preferences> =
        PreferenceDataStoreFactory.create { context.preferencesDataStoreFile("user_preferences") }
}
