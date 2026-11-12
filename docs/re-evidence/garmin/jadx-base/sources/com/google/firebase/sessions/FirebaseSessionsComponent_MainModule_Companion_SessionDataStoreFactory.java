package com.google.firebase.sessions;

import android.content.Context;
import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.Preconditions;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;
import t13.g;
import u7.k;

/* JADX INFO: loaded from: classes2.dex */
@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata({"com.google.firebase.annotations.concurrent.Blocking"})
@DaggerGenerated
public final class FirebaseSessionsComponent_MainModule_Companion_SessionDataStoreFactory implements Factory<k<SessionData>> {
    private final n13.a<Context> appContextProvider;
    private final n13.a<g> blockingDispatcherProvider;
    private final n13.a<SessionDataSerializer> sessionDataSerializerProvider;

    public FirebaseSessionsComponent_MainModule_Companion_SessionDataStoreFactory(n13.a<Context> aVar, n13.a<g> aVar2, n13.a<SessionDataSerializer> aVar3) {
        this.appContextProvider = aVar;
        this.blockingDispatcherProvider = aVar2;
        this.sessionDataSerializerProvider = aVar3;
    }

    public static FirebaseSessionsComponent_MainModule_Companion_SessionDataStoreFactory create(n13.a<Context> aVar, n13.a<g> aVar2, n13.a<SessionDataSerializer> aVar3) {
        return new FirebaseSessionsComponent_MainModule_Companion_SessionDataStoreFactory(aVar, aVar2, aVar3);
    }

    public static k<SessionData> sessionDataStore(Context context, g gVar, SessionDataSerializer sessionDataSerializer) {
        return (k) Preconditions.checkNotNullFromProvides(FirebaseSessionsComponent.MainModule.INSTANCE.sessionDataStore(context, gVar, sessionDataSerializer));
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, n13.a
    public k<SessionData> get() {
        return sessionDataStore(this.appContextProvider.get(), this.blockingDispatcherProvider.get(), this.sessionDataSerializerProvider.get());
    }
}
