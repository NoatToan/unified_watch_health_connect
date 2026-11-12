package com.google.firebase.sessions;

import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;
import com.google.firebase.sessions.settings.SessionsSettings;
import t13.g;
import u7.k;

/* JADX INFO: loaded from: classes2.dex */
@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata({"com.google.firebase.annotations.concurrent.Background"})
@DaggerGenerated
public final class SharedSessionRepositoryImpl_Factory implements Factory<SharedSessionRepositoryImpl> {
    private final n13.a<g> backgroundDispatcherProvider;
    private final n13.a<ProcessDataManager> processDataManagerProvider;
    private final n13.a<k<SessionData>> sessionDataStoreProvider;
    private final n13.a<SessionFirelogPublisher> sessionFirelogPublisherProvider;
    private final n13.a<SessionGenerator> sessionGeneratorProvider;
    private final n13.a<SessionsSettings> sessionsSettingsProvider;
    private final n13.a<TimeProvider> timeProvider;

    public SharedSessionRepositoryImpl_Factory(n13.a<SessionsSettings> aVar, n13.a<SessionGenerator> aVar2, n13.a<SessionFirelogPublisher> aVar3, n13.a<TimeProvider> aVar4, n13.a<k<SessionData>> aVar5, n13.a<ProcessDataManager> aVar6, n13.a<g> aVar7) {
        this.sessionsSettingsProvider = aVar;
        this.sessionGeneratorProvider = aVar2;
        this.sessionFirelogPublisherProvider = aVar3;
        this.timeProvider = aVar4;
        this.sessionDataStoreProvider = aVar5;
        this.processDataManagerProvider = aVar6;
        this.backgroundDispatcherProvider = aVar7;
    }

    public static SharedSessionRepositoryImpl_Factory create(n13.a<SessionsSettings> aVar, n13.a<SessionGenerator> aVar2, n13.a<SessionFirelogPublisher> aVar3, n13.a<TimeProvider> aVar4, n13.a<k<SessionData>> aVar5, n13.a<ProcessDataManager> aVar6, n13.a<g> aVar7) {
        return new SharedSessionRepositoryImpl_Factory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static SharedSessionRepositoryImpl newInstance(SessionsSettings sessionsSettings, SessionGenerator sessionGenerator, SessionFirelogPublisher sessionFirelogPublisher, TimeProvider timeProvider, k<SessionData> kVar, ProcessDataManager processDataManager, g gVar) {
        return new SharedSessionRepositoryImpl(sessionsSettings, sessionGenerator, sessionFirelogPublisher, timeProvider, kVar, processDataManager, gVar);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, n13.a
    public SharedSessionRepositoryImpl get() {
        return newInstance(this.sessionsSettingsProvider.get(), this.sessionGeneratorProvider.get(), this.sessionFirelogPublisherProvider.get(), this.timeProvider.get(), this.sessionDataStoreProvider.get(), this.processDataManagerProvider.get(), this.backgroundDispatcherProvider.get());
    }
}
