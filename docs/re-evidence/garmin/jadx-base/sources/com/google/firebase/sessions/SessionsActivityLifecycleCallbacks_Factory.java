package com.google.firebase.sessions;

import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;

/* JADX INFO: loaded from: classes2.dex */
@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
public final class SessionsActivityLifecycleCallbacks_Factory implements Factory<SessionsActivityLifecycleCallbacks> {
    private final n13.a<SharedSessionRepository> sharedSessionRepositoryProvider;

    public SessionsActivityLifecycleCallbacks_Factory(n13.a<SharedSessionRepository> aVar) {
        this.sharedSessionRepositoryProvider = aVar;
    }

    public static SessionsActivityLifecycleCallbacks_Factory create(n13.a<SharedSessionRepository> aVar) {
        return new SessionsActivityLifecycleCallbacks_Factory(aVar);
    }

    public static SessionsActivityLifecycleCallbacks newInstance(SharedSessionRepository sharedSessionRepository) {
        return new SessionsActivityLifecycleCallbacks(sharedSessionRepository);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, n13.a
    public SessionsActivityLifecycleCallbacks get() {
        return newInstance(this.sharedSessionRepositoryProvider.get());
    }
}
