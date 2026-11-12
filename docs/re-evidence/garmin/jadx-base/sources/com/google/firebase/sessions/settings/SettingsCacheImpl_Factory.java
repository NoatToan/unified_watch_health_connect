package com.google.firebase.sessions.settings;

import com.google.firebase.sessions.TimeProvider;
import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;
import n13.a;
import t13.g;
import u7.k;

/* JADX INFO: loaded from: classes2.dex */
@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata({"com.google.firebase.annotations.concurrent.Background"})
@DaggerGenerated
public final class SettingsCacheImpl_Factory implements Factory<SettingsCacheImpl> {
    private final a<g> backgroundDispatcherProvider;
    private final a<k<SessionConfigs>> sessionConfigsDataStoreProvider;
    private final a<TimeProvider> timeProvider;

    public SettingsCacheImpl_Factory(a<g> aVar, a<TimeProvider> aVar2, a<k<SessionConfigs>> aVar3) {
        this.backgroundDispatcherProvider = aVar;
        this.timeProvider = aVar2;
        this.sessionConfigsDataStoreProvider = aVar3;
    }

    public static SettingsCacheImpl_Factory create(a<g> aVar, a<TimeProvider> aVar2, a<k<SessionConfigs>> aVar3) {
        return new SettingsCacheImpl_Factory(aVar, aVar2, aVar3);
    }

    public static SettingsCacheImpl newInstance(g gVar, TimeProvider timeProvider, k<SessionConfigs> kVar) {
        return new SettingsCacheImpl(gVar, timeProvider, kVar);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, n13.a
    public SettingsCacheImpl get() {
        return newInstance(this.backgroundDispatcherProvider.get(), this.timeProvider.get(), this.sessionConfigsDataStoreProvider.get());
    }
}
