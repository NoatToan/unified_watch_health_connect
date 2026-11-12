package com.google.firebase.sessions;

import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;

/* JADX INFO: loaded from: classes2.dex */
@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
public final class SessionGenerator_Factory implements Factory<SessionGenerator> {
    private final n13.a<TimeProvider> timeProvider;
    private final n13.a<UuidGenerator> uuidGeneratorProvider;

    public SessionGenerator_Factory(n13.a<TimeProvider> aVar, n13.a<UuidGenerator> aVar2) {
        this.timeProvider = aVar;
        this.uuidGeneratorProvider = aVar2;
    }

    public static SessionGenerator_Factory create(n13.a<TimeProvider> aVar, n13.a<UuidGenerator> aVar2) {
        return new SessionGenerator_Factory(aVar, aVar2);
    }

    public static SessionGenerator newInstance(TimeProvider timeProvider, UuidGenerator uuidGenerator) {
        return new SessionGenerator(timeProvider, uuidGenerator);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, n13.a
    public SessionGenerator get() {
        return newInstance(this.timeProvider.get(), this.uuidGeneratorProvider.get());
    }
}
