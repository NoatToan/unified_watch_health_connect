package com.google.firebase.sessions;

import android.content.Context;
import androidx.datastore.core.CorruptionException;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.datatransport.TransportFactory;
import com.google.firebase.FirebaseApp;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.dagger.Binds;
import com.google.firebase.sessions.dagger.BindsInstance;
import com.google.firebase.sessions.dagger.Component;
import com.google.firebase.sessions.dagger.Module;
import com.google.firebase.sessions.dagger.Provides;
import com.google.firebase.sessions.settings.CrashlyticsSettingsFetcher;
import com.google.firebase.sessions.settings.LocalOverrideSettings;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.google.firebase.sessions.settings.RemoteSettingsFetcher;
import com.google.firebase.sessions.settings.SessionConfigs;
import com.google.firebase.sessions.settings.SessionConfigsSerializer;
import com.google.firebase.sessions.settings.SessionsSettings;
import com.google.firebase.sessions.settings.SettingsCache;
import com.google.firebase.sessions.settings.SettingsCacheImpl;
import com.google.firebase.sessions.settings.SettingsProvider;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;
import java.util.List;
import o53.b0;
import o53.c0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p13.w;
import t13.g;
import u7.c1;
import u7.d1;
import u7.f;
import u7.j;
import u7.k;
import u7.k0;
import u7.k1;
import u7.l;
import u7.m;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Component(modules = {MainModule.class})
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\ba\u0018\u00002\u00020\u0001:\u0002\u0016\u0017R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsComponent;", "", "firebaseSessions", "Lcom/google/firebase/sessions/FirebaseSessions;", "getFirebaseSessions", "()Lcom/google/firebase/sessions/FirebaseSessions;", "sessionFirelogPublisher", "Lcom/google/firebase/sessions/SessionFirelogPublisher;", "getSessionFirelogPublisher", "()Lcom/google/firebase/sessions/SessionFirelogPublisher;", "sessionGenerator", "Lcom/google/firebase/sessions/SessionGenerator;", "getSessionGenerator", "()Lcom/google/firebase/sessions/SessionGenerator;", "sessionsSettings", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "getSessionsSettings", "()Lcom/google/firebase/sessions/settings/SessionsSettings;", "sharedSessionRepository", "Lcom/google/firebase/sessions/SharedSessionRepository;", "getSharedSessionRepository", "()Lcom/google/firebase/sessions/SharedSessionRepository;", "Builder", "MainModule", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface FirebaseSessionsComponent {

    @Component.Builder
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0006\u001a\u00020\u00002\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\b\u001a\u00020\u00002\b\b\u0001\u0010\b\u001a\u00020\u0005H'¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsComponent$Builder;", "", "Landroid/content/Context;", "appContext", "(Landroid/content/Context;)Lcom/google/firebase/sessions/FirebaseSessionsComponent$Builder;", "Lt13/g;", "backgroundDispatcher", "(Lt13/g;)Lcom/google/firebase/sessions/FirebaseSessionsComponent$Builder;", "blockingDispatcher", "Lcom/google/firebase/FirebaseApp;", "firebaseApp", "(Lcom/google/firebase/FirebaseApp;)Lcom/google/firebase/sessions/FirebaseSessionsComponent$Builder;", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "firebaseInstallationsApi", "(Lcom/google/firebase/installations/FirebaseInstallationsApi;)Lcom/google/firebase/sessions/FirebaseSessionsComponent$Builder;", "Lcom/google/firebase/inject/Provider;", "Lcom/google/android/datatransport/TransportFactory;", "transportFactoryProvider", "(Lcom/google/firebase/inject/Provider;)Lcom/google/firebase/sessions/FirebaseSessionsComponent$Builder;", "Lcom/google/firebase/sessions/FirebaseSessionsComponent;", "build", "()Lcom/google/firebase/sessions/FirebaseSessionsComponent;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Builder {
        @BindsInstance
        Builder appContext(Context appContext);

        @BindsInstance
        Builder backgroundDispatcher(@Background g backgroundDispatcher);

        @BindsInstance
        Builder blockingDispatcher(@Blocking g blockingDispatcher);

        FirebaseSessionsComponent build();

        @BindsInstance
        Builder firebaseApp(FirebaseApp firebaseApp);

        @BindsInstance
        Builder firebaseInstallationsApi(FirebaseInstallationsApi firebaseInstallationsApi);

        @BindsInstance
        Builder transportFactoryProvider(Provider<TransportFactory> transportFactoryProvider);
    }

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000bH'J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u000eH'J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0010H'J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0013H'J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0016H'J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u0019H'¨\u0006\u001b"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsComponent$MainModule;", "", "eventGDTLoggerInterface", "Lcom/google/firebase/sessions/EventGDTLoggerInterface;", "impl", "Lcom/google/firebase/sessions/EventGDTLogger;", "sessionFirelogPublisher", "Lcom/google/firebase/sessions/SessionFirelogPublisher;", "Lcom/google/firebase/sessions/SessionFirelogPublisherImpl;", "crashlyticsSettingsFetcher", "Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;", "Lcom/google/firebase/sessions/settings/RemoteSettingsFetcher;", "localOverrideSettings", "Lcom/google/firebase/sessions/settings/SettingsProvider;", "Lcom/google/firebase/sessions/settings/LocalOverrideSettings;", "remoteSettings", "Lcom/google/firebase/sessions/settings/RemoteSettings;", "settingsCache", "Lcom/google/firebase/sessions/settings/SettingsCache;", "Lcom/google/firebase/sessions/settings/SettingsCacheImpl;", "sharedSessionRepository", "Lcom/google/firebase/sessions/SharedSessionRepository;", "Lcom/google/firebase/sessions/SharedSessionRepositoryImpl;", "processDataManager", "Lcom/google/firebase/sessions/ProcessDataManager;", "Lcom/google/firebase/sessions/ProcessDataManagerImpl;", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Module
    public interface MainModule {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.$$INSTANCE;

        @Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jc\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\t2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b$\u0010%J'\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u00112\u0006\u0010'\u001a\u00020&2\b\b\u0001\u0010)\u001a\u00020(H\u0007¢\u0006\u0004\b+\u0010,J/\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00112\u0006\u0010'\u001a\u00020&2\b\b\u0001\u0010)\u001a\u00020(2\u0006\u0010.\u001a\u00020-H\u0007¢\u0006\u0004\b0\u00101¨\u00062"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsComponent$MainModule$Companion;", "", "<init>", "()V", "T", "Lu7/k1;", "serializer", "Lv7/b;", "corruptionHandler", "", "Lu7/f;", "migrations", "Lo53/b0;", Action.SCOPE_ATTRIBUTE, "Lkotlin/Function0;", "Ljava/io/File;", "produceFile", "Lu7/k;", "createDataStore", "(Lu7/k1;Lv7/b;Ljava/util/List;Lo53/b0;Le23/a;)Lu7/k;", "", "loadDataStoreSharedCounter", "()Z", "dataStoreFile", "", "prepDataStoreFile", "(Ljava/io/File;)V", "Lcom/google/firebase/sessions/TimeProvider;", "timeProvider", "()Lcom/google/firebase/sessions/TimeProvider;", "Lcom/google/firebase/sessions/UuidGenerator;", "uuidGenerator", "()Lcom/google/firebase/sessions/UuidGenerator;", "Lcom/google/firebase/FirebaseApp;", "firebaseApp", "Lcom/google/firebase/sessions/ApplicationInfo;", "applicationInfo", "(Lcom/google/firebase/FirebaseApp;)Lcom/google/firebase/sessions/ApplicationInfo;", "Landroid/content/Context;", "appContext", "Lt13/g;", "blockingDispatcher", "Lcom/google/firebase/sessions/settings/SessionConfigs;", "sessionConfigsDataStore", "(Landroid/content/Context;Lt13/g;)Lu7/k;", "Lcom/google/firebase/sessions/SessionDataSerializer;", "sessionDataSerializer", "Lcom/google/firebase/sessions/SessionData;", "sessionDataStore", "(Landroid/content/Context;Lt13/g;Lcom/google/firebase/sessions/SessionDataSerializer;)Lu7/k;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            private final <T> k<T> createDataStore(k1<T> serializer, v7.b<T> corruptionHandler, List<? extends f<T>> migrations, b0 scope, e23.a<? extends File> produceFile) {
                if (!loadDataStoreSharedCounter()) {
                    l.f169182a.getClass();
                    serializer.getClass();
                    migrations.getClass();
                    scope.getClass();
                    produceFile.getClass();
                    return l.a(new k0(serializer, null, produceFile, 2, null), corruptionHandler, migrations, scope);
                }
                d1.f169111a.getClass();
                serializer.getClass();
                migrations.getClass();
                scope.getClass();
                produceFile.getClass();
                k0 k0Var = new k0(serializer, new c1(scope), produceFile);
                j.f169169a.getClass();
                List listC = w.c(new u7.g(migrations, null));
                if (corruptionHandler == null) {
                    corruptionHandler = (v7.b<T>) new v7.a();
                }
                return new m(k0Var, listC, corruptionHandler, scope);
            }

            public static k createDataStore$default(Companion companion, k1 k1Var, v7.b bVar, List list, b0 b0Var, e23.a aVar, int i14, Object obj) {
                if ((i14 & 4) != 0) {
                    list = j0.f134944a;
                }
                return companion.createDataStore(k1Var, bVar, list, b0Var, aVar);
            }

            private final boolean loadDataStoreSharedCounter() {
                try {
                    System.loadLibrary("datastore_shared_counter");
                    return true;
                } catch (SecurityException | UnsatisfiedLinkError unused) {
                    return false;
                }
            }

            private final void prepDataStoreFile(File dataStoreFile) throws IOException {
                File parentFile = dataStoreFile.getParentFile();
                if (parentFile == null) {
                    return;
                }
                if (parentFile.exists() && !parentFile.isDirectory() && s.g(parentFile.getName(), "firebaseSessions") && !parentFile.delete()) {
                    h.C(v.h.v(parentFile, "Failed to delete conflicting file: "));
                } else {
                    if (parentFile.isDirectory()) {
                        return;
                    }
                    try {
                        Files.createDirectories(parentFile.toPath(), new FileAttribute[0]);
                    } catch (Exception e4) {
                        h.u(v.h.v(parentFile, "Failed to create directory: "), e4);
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final SessionConfigs sessionConfigsDataStore$lambda$0(CorruptionException corruptionException) {
                corruptionException.getClass();
                return SessionConfigsSerializer.INSTANCE.getDefaultValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final File sessionConfigsDataStore$lambda$2(Context context) throws IOException {
                File fileL = oe2.f.l(context, "firebaseSessions/sessionConfigsDataStore.data");
                $$INSTANCE.prepDataStoreFile(fileL);
                return fileL;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final SessionData sessionDataStore$lambda$3(SessionDataSerializer sessionDataSerializer, CorruptionException corruptionException) {
                corruptionException.getClass();
                return sessionDataSerializer.getDefaultValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final File sessionDataStore$lambda$5(Context context) throws IOException {
                File fileL = oe2.f.l(context, "firebaseSessions/sessionDataStore.data");
                $$INSTANCE.prepDataStoreFile(fileL);
                return fileL;
            }

            @Provides
            public final ApplicationInfo applicationInfo(FirebaseApp firebaseApp) {
                firebaseApp.getClass();
                return SessionEvents.INSTANCE.getApplicationInfo(firebaseApp);
            }

            @Provides
            public final k<SessionConfigs> sessionConfigsDataStore(Context appContext, @Blocking g blockingDispatcher) {
                appContext.getClass();
                blockingDispatcher.getClass();
                return createDataStore$default(this, SessionConfigsSerializer.INSTANCE, new v7.b(new ch1.f(18)), null, c0.a(blockingDispatcher), new c(appContext, 0), 4, null);
            }

            @Provides
            public final k<SessionData> sessionDataStore(Context appContext, @Blocking g blockingDispatcher, final SessionDataSerializer sessionDataSerializer) {
                appContext.getClass();
                blockingDispatcher.getClass();
                sessionDataSerializer.getClass();
                return createDataStore$default(this, sessionDataSerializer, new v7.b(new e23.l() { // from class: com.google.firebase.sessions.d
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        return FirebaseSessionsComponent.MainModule.Companion.sessionDataStore$lambda$3(sessionDataSerializer, (CorruptionException) obj);
                    }
                }), null, c0.a(blockingDispatcher), new c(appContext, 1), 4, null);
            }

            @Provides
            public final TimeProvider timeProvider() {
                return TimeProviderImpl.INSTANCE;
            }

            @Provides
            public final UuidGenerator uuidGenerator() {
                return UuidGeneratorImpl.INSTANCE;
            }
        }

        @Binds
        CrashlyticsSettingsFetcher crashlyticsSettingsFetcher(RemoteSettingsFetcher impl);

        @Binds
        EventGDTLoggerInterface eventGDTLoggerInterface(EventGDTLogger impl);

        @Binds
        @LocalOverrideSettingsProvider
        SettingsProvider localOverrideSettings(LocalOverrideSettings impl);

        @Binds
        ProcessDataManager processDataManager(ProcessDataManagerImpl impl);

        @RemoteSettingsProvider
        @Binds
        SettingsProvider remoteSettings(RemoteSettings impl);

        @Binds
        SessionFirelogPublisher sessionFirelogPublisher(SessionFirelogPublisherImpl impl);

        @Binds
        SettingsCache settingsCache(SettingsCacheImpl impl);

        @Binds
        SharedSessionRepository sharedSessionRepository(SharedSessionRepositoryImpl impl);
    }

    FirebaseSessions getFirebaseSessions();

    SessionFirelogPublisher getSessionFirelogPublisher();

    SessionGenerator getSessionGenerator();

    SessionsSettings getSessionsSettings();

    SharedSessionRepository getSharedSessionRepository();
}
