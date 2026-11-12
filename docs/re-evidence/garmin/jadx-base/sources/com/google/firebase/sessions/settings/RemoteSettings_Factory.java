package com.google.firebase.sessions.settings;

import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.ApplicationInfo;
import com.google.firebase.sessions.TimeProvider;
import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;
import n13.a;

/* JADX INFO: loaded from: classes2.dex */
@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
public final class RemoteSettings_Factory implements Factory<RemoteSettings> {
    private final a<ApplicationInfo> appInfoProvider;
    private final a<CrashlyticsSettingsFetcher> configsFetcherProvider;
    private final a<FirebaseInstallationsApi> firebaseInstallationsApiProvider;
    private final a<SettingsCache> settingsCacheProvider;
    private final a<TimeProvider> timeProvider;

    public RemoteSettings_Factory(a<TimeProvider> aVar, a<FirebaseInstallationsApi> aVar2, a<ApplicationInfo> aVar3, a<CrashlyticsSettingsFetcher> aVar4, a<SettingsCache> aVar5) {
        this.timeProvider = aVar;
        this.firebaseInstallationsApiProvider = aVar2;
        this.appInfoProvider = aVar3;
        this.configsFetcherProvider = aVar4;
        this.settingsCacheProvider = aVar5;
    }

    public static RemoteSettings_Factory create(a<TimeProvider> aVar, a<FirebaseInstallationsApi> aVar2, a<ApplicationInfo> aVar3, a<CrashlyticsSettingsFetcher> aVar4, a<SettingsCache> aVar5) {
        return new RemoteSettings_Factory(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static RemoteSettings newInstance(TimeProvider timeProvider, FirebaseInstallationsApi firebaseInstallationsApi, ApplicationInfo applicationInfo, CrashlyticsSettingsFetcher crashlyticsSettingsFetcher, SettingsCache settingsCache) {
        return new RemoteSettings(timeProvider, firebaseInstallationsApi, applicationInfo, crashlyticsSettingsFetcher, settingsCache);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, n13.a
    public RemoteSettings get() {
        return newInstance(this.timeProvider.get(), this.firebaseInstallationsApiProvider.get(), this.appInfoProvider.get(), this.configsFetcherProvider.get(), this.settingsCacheProvider.get());
    }
}
