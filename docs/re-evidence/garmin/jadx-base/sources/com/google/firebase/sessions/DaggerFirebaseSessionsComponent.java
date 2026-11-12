package com.google.firebase.sessions;

import android.content.Context;
import com.google.android.datatransport.TransportFactory;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.DoubleCheck;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.InstanceFactory;
import com.google.firebase.sessions.dagger.internal.Preconditions;
import com.google.firebase.sessions.dagger.internal.Provider;
import com.google.firebase.sessions.settings.LocalOverrideSettings;
import com.google.firebase.sessions.settings.LocalOverrideSettings_Factory;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.google.firebase.sessions.settings.RemoteSettingsFetcher;
import com.google.firebase.sessions.settings.RemoteSettingsFetcher_Factory;
import com.google.firebase.sessions.settings.RemoteSettings_Factory;
import com.google.firebase.sessions.settings.SessionConfigs;
import com.google.firebase.sessions.settings.SessionsSettings;
import com.google.firebase.sessions.settings.SessionsSettings_Factory;
import com.google.firebase.sessions.settings.SettingsCacheImpl;
import com.google.firebase.sessions.settings.SettingsCacheImpl_Factory;
import t13.g;
import u7.k;

/* JADX INFO: loaded from: classes2.dex */
@DaggerGenerated
public final class DaggerFirebaseSessionsComponent {

    public static final class FirebaseSessionsComponentImpl implements FirebaseSessionsComponent {
        private Provider<Context> appContextProvider;
        private Provider<ApplicationInfo> applicationInfoProvider;
        private Provider<g> backgroundDispatcherProvider;
        private Provider<g> blockingDispatcherProvider;
        private Provider<EventGDTLogger> eventGDTLoggerProvider;
        private Provider<FirebaseApp> firebaseAppProvider;
        private Provider<FirebaseInstallationsApi> firebaseInstallationsApiProvider;
        private final FirebaseSessionsComponentImpl firebaseSessionsComponentImpl;
        private Provider<FirebaseSessions> firebaseSessionsProvider;
        private Provider<LocalOverrideSettings> localOverrideSettingsProvider;
        private Provider<ProcessDataManagerImpl> processDataManagerImplProvider;
        private Provider<RemoteSettingsFetcher> remoteSettingsFetcherProvider;
        private Provider<RemoteSettings> remoteSettingsProvider;
        private Provider<k<SessionConfigs>> sessionConfigsDataStoreProvider;
        private Provider<SessionDataSerializer> sessionDataSerializerProvider;
        private Provider<k<SessionData>> sessionDataStoreProvider;
        private Provider<SessionFirelogPublisherImpl> sessionFirelogPublisherImplProvider;
        private Provider<SessionGenerator> sessionGeneratorProvider;
        private Provider<SessionsActivityLifecycleCallbacks> sessionsActivityLifecycleCallbacksProvider;
        private Provider<SessionsSettings> sessionsSettingsProvider;
        private Provider<SettingsCacheImpl> settingsCacheImplProvider;
        private Provider<SharedSessionRepositoryImpl> sharedSessionRepositoryImplProvider;
        private Provider<TimeProvider> timeProvider;
        private Provider<com.google.firebase.inject.Provider<TransportFactory>> transportFactoryProvider;
        private Provider<UuidGenerator> uuidGeneratorProvider;

        private FirebaseSessionsComponentImpl(Context context, g gVar, g gVar2, FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, com.google.firebase.inject.Provider<TransportFactory> provider) {
            this.firebaseSessionsComponentImpl = this;
            initialize(context, gVar, gVar2, firebaseApp, firebaseInstallationsApi, provider);
        }

        private void initialize(Context context, g gVar, g gVar2, FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, com.google.firebase.inject.Provider<TransportFactory> provider) {
            this.firebaseAppProvider = InstanceFactory.create(firebaseApp);
            Factory factoryCreate = InstanceFactory.create(context);
            this.appContextProvider = factoryCreate;
            this.localOverrideSettingsProvider = DoubleCheck.provider(LocalOverrideSettings_Factory.create(factoryCreate));
            this.timeProvider = DoubleCheck.provider(FirebaseSessionsComponent_MainModule_Companion_TimeProviderFactory.create());
            this.firebaseInstallationsApiProvider = InstanceFactory.create(firebaseInstallationsApi);
            this.applicationInfoProvider = DoubleCheck.provider(FirebaseSessionsComponent_MainModule_Companion_ApplicationInfoFactory.create(this.firebaseAppProvider));
            Factory factoryCreate2 = InstanceFactory.create(gVar2);
            this.blockingDispatcherProvider = factoryCreate2;
            this.remoteSettingsFetcherProvider = DoubleCheck.provider(RemoteSettingsFetcher_Factory.create(this.applicationInfoProvider, factoryCreate2));
            this.backgroundDispatcherProvider = InstanceFactory.create(gVar);
            Provider<k<SessionConfigs>> provider2 = DoubleCheck.provider(FirebaseSessionsComponent_MainModule_Companion_SessionConfigsDataStoreFactory.create(this.appContextProvider, this.blockingDispatcherProvider));
            this.sessionConfigsDataStoreProvider = provider2;
            Provider<SettingsCacheImpl> provider3 = DoubleCheck.provider(SettingsCacheImpl_Factory.create(this.backgroundDispatcherProvider, this.timeProvider, provider2));
            this.settingsCacheImplProvider = provider3;
            Provider<RemoteSettings> provider4 = DoubleCheck.provider(RemoteSettings_Factory.create(this.timeProvider, this.firebaseInstallationsApiProvider, this.applicationInfoProvider, this.remoteSettingsFetcherProvider, provider3));
            this.remoteSettingsProvider = provider4;
            this.sessionsSettingsProvider = DoubleCheck.provider(SessionsSettings_Factory.create(this.localOverrideSettingsProvider, provider4));
            Provider<UuidGenerator> provider5 = DoubleCheck.provider(FirebaseSessionsComponent_MainModule_Companion_UuidGeneratorFactory.create());
            this.uuidGeneratorProvider = provider5;
            this.sessionGeneratorProvider = DoubleCheck.provider(SessionGenerator_Factory.create(this.timeProvider, provider5));
            Factory factoryCreate3 = InstanceFactory.create(provider);
            this.transportFactoryProvider = factoryCreate3;
            Provider<EventGDTLogger> provider6 = DoubleCheck.provider(EventGDTLogger_Factory.create(factoryCreate3));
            this.eventGDTLoggerProvider = provider6;
            this.sessionFirelogPublisherImplProvider = DoubleCheck.provider(SessionFirelogPublisherImpl_Factory.create(this.firebaseAppProvider, this.firebaseInstallationsApiProvider, this.sessionsSettingsProvider, provider6, this.backgroundDispatcherProvider));
            Provider<SessionDataSerializer> provider7 = DoubleCheck.provider(SessionDataSerializer_Factory.create(this.sessionGeneratorProvider));
            this.sessionDataSerializerProvider = provider7;
            this.sessionDataStoreProvider = DoubleCheck.provider(FirebaseSessionsComponent_MainModule_Companion_SessionDataStoreFactory.create(this.appContextProvider, this.blockingDispatcherProvider, provider7));
            Provider<ProcessDataManagerImpl> provider8 = DoubleCheck.provider(ProcessDataManagerImpl_Factory.create(this.appContextProvider, this.uuidGeneratorProvider));
            this.processDataManagerImplProvider = provider8;
            Provider<SharedSessionRepositoryImpl> provider9 = DoubleCheck.provider(SharedSessionRepositoryImpl_Factory.create(this.sessionsSettingsProvider, this.sessionGeneratorProvider, this.sessionFirelogPublisherImplProvider, this.timeProvider, this.sessionDataStoreProvider, provider8, this.backgroundDispatcherProvider));
            this.sharedSessionRepositoryImplProvider = provider9;
            Provider<SessionsActivityLifecycleCallbacks> provider10 = DoubleCheck.provider(SessionsActivityLifecycleCallbacks_Factory.create(provider9));
            this.sessionsActivityLifecycleCallbacksProvider = provider10;
            this.firebaseSessionsProvider = DoubleCheck.provider(FirebaseSessions_Factory.create(this.firebaseAppProvider, this.sessionsSettingsProvider, this.backgroundDispatcherProvider, provider10));
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent
        public FirebaseSessions getFirebaseSessions() {
            return (FirebaseSessions) this.firebaseSessionsProvider.get();
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent
        public SessionFirelogPublisher getSessionFirelogPublisher() {
            return (SessionFirelogPublisher) this.sessionFirelogPublisherImplProvider.get();
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent
        public SessionGenerator getSessionGenerator() {
            return (SessionGenerator) this.sessionGeneratorProvider.get();
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent
        public SessionsSettings getSessionsSettings() {
            return (SessionsSettings) this.sessionsSettingsProvider.get();
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent
        public SharedSessionRepository getSharedSessionRepository() {
            return (SharedSessionRepository) this.sharedSessionRepositoryImplProvider.get();
        }
    }

    private DaggerFirebaseSessionsComponent() {
    }

    public static FirebaseSessionsComponent.Builder builder() {
        return new Builder();
    }

    public static final class Builder implements FirebaseSessionsComponent.Builder {
        private Context appContext;
        private g backgroundDispatcher;
        private g blockingDispatcher;
        private FirebaseApp firebaseApp;
        private FirebaseInstallationsApi firebaseInstallationsApi;
        private com.google.firebase.inject.Provider<TransportFactory> transportFactoryProvider;

        private Builder() {
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent.Builder
        public Builder appContext(Context context) {
            this.appContext = (Context) Preconditions.checkNotNull(context);
            return this;
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent.Builder
        public Builder backgroundDispatcher(g gVar) {
            this.backgroundDispatcher = (g) Preconditions.checkNotNull(gVar);
            return this;
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent.Builder
        public Builder blockingDispatcher(g gVar) {
            this.blockingDispatcher = (g) Preconditions.checkNotNull(gVar);
            return this;
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent.Builder
        public FirebaseSessionsComponent build() {
            Preconditions.checkBuilderRequirement(this.appContext, Context.class);
            Preconditions.checkBuilderRequirement(this.backgroundDispatcher, g.class);
            Preconditions.checkBuilderRequirement(this.blockingDispatcher, g.class);
            Preconditions.checkBuilderRequirement(this.firebaseApp, FirebaseApp.class);
            Preconditions.checkBuilderRequirement(this.firebaseInstallationsApi, FirebaseInstallationsApi.class);
            Preconditions.checkBuilderRequirement(this.transportFactoryProvider, com.google.firebase.inject.Provider.class);
            return new FirebaseSessionsComponentImpl(this.appContext, this.backgroundDispatcher, this.blockingDispatcher, this.firebaseApp, this.firebaseInstallationsApi, this.transportFactoryProvider);
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent.Builder
        public Builder firebaseApp(FirebaseApp firebaseApp) {
            this.firebaseApp = (FirebaseApp) Preconditions.checkNotNull(firebaseApp);
            return this;
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent.Builder
        public Builder firebaseInstallationsApi(FirebaseInstallationsApi firebaseInstallationsApi) {
            this.firebaseInstallationsApi = (FirebaseInstallationsApi) Preconditions.checkNotNull(firebaseInstallationsApi);
            return this;
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent.Builder
        public Builder transportFactoryProvider(com.google.firebase.inject.Provider<TransportFactory> provider) {
            this.transportFactoryProvider = (com.google.firebase.inject.Provider) Preconditions.checkNotNull(provider);
            return this;
        }

        @Override // com.google.firebase.sessions.FirebaseSessionsComponent.Builder
        public /* bridge */ /* synthetic */ FirebaseSessionsComponent.Builder transportFactoryProvider(com.google.firebase.inject.Provider provider) {
            return transportFactoryProvider((com.google.firebase.inject.Provider<TransportFactory>) provider);
        }
    }
}
