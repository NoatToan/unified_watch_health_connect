package com.google.firebase.sessions;

import android.content.Context;
import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.Preconditions;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;
import com.google.firebase.sessions.settings.SessionConfigs;
import t13.g;
import u7.k;

/* JADX INFO: loaded from: classes2.dex */
@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata({"com.google.firebase.annotations.concurrent.Blocking"})
@DaggerGenerated
public final class FirebaseSessionsComponent_MainModule_Companion_SessionConfigsDataStoreFactory implements Factory<k<SessionConfigs>> {
    private final n13.a<Context> appContextProvider;
    private final n13.a<g> blockingDispatcherProvider;

    public FirebaseSessionsComponent_MainModule_Companion_SessionConfigsDataStoreFactory(n13.a<Context> aVar, n13.a<g> aVar2) {
        this.appContextProvider = aVar;
        this.blockingDispatcherProvider = aVar2;
    }

    public static FirebaseSessionsComponent_MainModule_Companion_SessionConfigsDataStoreFactory create(n13.a<Context> aVar, n13.a<g> aVar2) {
        return new FirebaseSessionsComponent_MainModule_Companion_SessionConfigsDataStoreFactory(aVar, aVar2);
    }

    public static k<SessionConfigs> sessionConfigsDataStore(Context context, g gVar) {
        return (k) Preconditions.checkNotNullFromProvides(FirebaseSessionsComponent.MainModule.INSTANCE.sessionConfigsDataStore(context, gVar));
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, n13.a
    public k<SessionConfigs> get() {
        return sessionConfigsDataStore(this.appContextProvider.get(), this.blockingDispatcherProvider.get());
    }
}
