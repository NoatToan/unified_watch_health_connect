package com.google.firebase.sessions;

import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;

/* JADX INFO: loaded from: classes2.dex */
@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
public final class SessionDataSerializer_Factory implements Factory<SessionDataSerializer> {
    private final n13.a<SessionGenerator> sessionGeneratorProvider;

    public SessionDataSerializer_Factory(n13.a<SessionGenerator> aVar) {
        this.sessionGeneratorProvider = aVar;
    }

    public static SessionDataSerializer_Factory create(n13.a<SessionGenerator> aVar) {
        return new SessionDataSerializer_Factory(aVar);
    }

    public static SessionDataSerializer newInstance(SessionGenerator sessionGenerator) {
        return new SessionDataSerializer(sessionGenerator);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, n13.a
    public SessionDataSerializer get() {
        return newInstance(this.sessionGeneratorProvider.get());
    }
}
