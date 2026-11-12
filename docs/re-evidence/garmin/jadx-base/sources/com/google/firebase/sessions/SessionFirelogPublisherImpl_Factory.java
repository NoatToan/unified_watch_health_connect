package com.google.firebase.sessions;

import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
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
public final class SessionFirelogPublisherImpl_Factory implements Factory<SessionFirelogPublisherImpl> {
    private final n13.a<g> backgroundDispatcherProvider;
    private final n13.a<EventGDTLoggerInterface> eventGDTLoggerProvider;
    private final n13.a<FirebaseApp> firebaseAppProvider;
    private final n13.a<FirebaseInstallationsApi> firebaseInstallationsProvider;
    private final n13.a<SessionsSettings> sessionSettingsProvider;

    public SessionFirelogPublisherImpl_Factory(n13.a<FirebaseApp> aVar, n13.a<FirebaseInstallationsApi> aVar2, n13.a<SessionsSettings> aVar3, n13.a<EventGDTLoggerInterface> aVar4, n13.a<g> aVar5) {
        this.firebaseAppProvider = aVar;
        this.firebaseInstallationsProvider = aVar2;
        this.sessionSettingsProvider = aVar3;
        this.eventGDTLoggerProvider = aVar4;
        this.backgroundDispatcherProvider = aVar5;
    }

    public static SessionFirelogPublisherImpl_Factory create(n13.a<FirebaseApp> aVar, n13.a<FirebaseInstallationsApi> aVar2, n13.a<SessionsSettings> aVar3, n13.a<EventGDTLoggerInterface> aVar4, n13.a<g> aVar5) {
        return new SessionFirelogPublisherImpl_Factory(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static SessionFirelogPublisherImpl newInstance(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, SessionsSettings sessionsSettings, EventGDTLoggerInterface eventGDTLoggerInterface, g gVar) {
        return new SessionFirelogPublisherImpl(firebaseApp, firebaseInstallationsApi, sessionsSettings, eventGDTLoggerInterface, gVar);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, n13.a
    public SessionFirelogPublisherImpl get() {
        return newInstance(this.firebaseAppProvider.get(), this.firebaseInstallationsProvider.get(), this.sessionSettingsProvider.get(), this.eventGDTLoggerProvider.get(), this.backgroundDispatcherProvider.get());
    }
}
