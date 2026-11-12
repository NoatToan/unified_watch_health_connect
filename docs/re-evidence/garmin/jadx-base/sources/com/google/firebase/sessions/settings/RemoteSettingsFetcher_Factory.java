package com.google.firebase.sessions.settings;

import com.google.firebase.sessions.ApplicationInfo;
import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;
import n13.a;
import t13.g;

/* JADX INFO: loaded from: classes2.dex */
@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata({"com.google.firebase.annotations.concurrent.Blocking"})
@DaggerGenerated
public final class RemoteSettingsFetcher_Factory implements Factory<RemoteSettingsFetcher> {
    private final a<ApplicationInfo> appInfoProvider;
    private final a<g> blockingDispatcherProvider;

    public RemoteSettingsFetcher_Factory(a<ApplicationInfo> aVar, a<g> aVar2) {
        this.appInfoProvider = aVar;
        this.blockingDispatcherProvider = aVar2;
    }

    public static RemoteSettingsFetcher_Factory create(a<ApplicationInfo> aVar, a<g> aVar2) {
        return new RemoteSettingsFetcher_Factory(aVar, aVar2);
    }

    public static RemoteSettingsFetcher newInstance(ApplicationInfo applicationInfo, g gVar) {
        return new RemoteSettingsFetcher(applicationInfo, gVar);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, n13.a
    public RemoteSettingsFetcher get() {
        return newInstance(this.appInfoProvider.get(), this.blockingDispatcherProvider.get());
    }
}
