package com.google.firebase.sessions;

import com.google.firebase.FirebaseApp;
import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;
import com.google.firebase.sessions.settings.SessionsSettings;
import t13.g;

/* JADX INFO: loaded from: classes2.dex */
@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata({"com.google.firebase.annotations.concurrent.Background"})
@DaggerGenerated
public final class FirebaseSessions_Factory implements Factory<FirebaseSessions> {
    private final n13.a<g> backgroundDispatcherProvider;
    private final n13.a<FirebaseApp> firebaseAppProvider;
    private final n13.a<SessionsActivityLifecycleCallbacks> sessionsActivityLifecycleCallbacksProvider;
    private final n13.a<SessionsSettings> settingsProvider;

    public FirebaseSessions_Factory(n13.a<FirebaseApp> aVar, n13.a<SessionsSettings> aVar2, n13.a<g> aVar3, n13.a<SessionsActivityLifecycleCallbacks> aVar4) {
        this.firebaseAppProvider = aVar;
        this.settingsProvider = aVar2;
        this.backgroundDispatcherProvider = aVar3;
        this.sessionsActivityLifecycleCallbacksProvider = aVar4;
    }

    public static FirebaseSessions_Factory create(n13.a<FirebaseApp> aVar, n13.a<SessionsSettings> aVar2, n13.a<g> aVar3, n13.a<SessionsActivityLifecycleCallbacks> aVar4) {
        return new FirebaseSessions_Factory(aVar, aVar2, aVar3, aVar4);
    }

    public static FirebaseSessions newInstance(FirebaseApp firebaseApp, SessionsSettings sessionsSettings, g gVar, SessionsActivityLifecycleCallbacks sessionsActivityLifecycleCallbacks) {
        return new FirebaseSessions(firebaseApp, sessionsSettings, gVar, sessionsActivityLifecycleCallbacks);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, n13.a
    public FirebaseSessions get() {
        return newInstance(this.firebaseAppProvider.get(), this.settingsProvider.get(), this.backgroundDispatcherProvider.get(), this.sessionsActivityLifecycleCallbacksProvider.get());
    }
}
