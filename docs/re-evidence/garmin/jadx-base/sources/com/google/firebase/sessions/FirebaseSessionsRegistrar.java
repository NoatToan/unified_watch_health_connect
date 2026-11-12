package com.google.firebase.sessions;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.datatransport.TransportFactory;
import com.google.firebase.FirebaseApp;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.concurrent.h;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.List;
import o53.z;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.x;
import t13.g;
import u7.d1;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u0004\u001a0\u0012,\u0012*\u0012\u000e\b\u0001\u0012\n \b*\u0004\u0018\u00010\u00070\u0007 \b*\u0014\u0012\u000e\b\u0001\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u00060\u0005H\u0016¨\u0006\n"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "getComponents", "", "Lcom/google/firebase/components/Component;", "", "kotlin.jvm.PlatformType", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String LIBRARY_NAME = "fire-sessions";
    private static final Qualified<Context> appContext;
    private static final Qualified<z> backgroundDispatcher;
    private static final Qualified<z> blockingDispatcher;
    private static final Qualified<FirebaseApp> firebaseApp;
    private static final Qualified<FirebaseInstallationsApi> firebaseInstallationsApi;
    private static final Qualified<FirebaseSessionsComponent> firebaseSessionsComponent;
    private static final Qualified<TransportFactory> transportFactory;

    static {
        Qualified<Context> qualifiedUnqualified = Qualified.unqualified(Context.class);
        qualifiedUnqualified.getClass();
        appContext = qualifiedUnqualified;
        Qualified<FirebaseApp> qualifiedUnqualified2 = Qualified.unqualified(FirebaseApp.class);
        qualifiedUnqualified2.getClass();
        firebaseApp = qualifiedUnqualified2;
        Qualified<FirebaseInstallationsApi> qualifiedUnqualified3 = Qualified.unqualified(FirebaseInstallationsApi.class);
        qualifiedUnqualified3.getClass();
        firebaseInstallationsApi = qualifiedUnqualified3;
        Qualified<z> qualified = Qualified.qualified(Background.class, z.class);
        qualified.getClass();
        backgroundDispatcher = qualified;
        Qualified<z> qualified2 = Qualified.qualified(Blocking.class, z.class);
        qualified2.getClass();
        blockingDispatcher = qualified2;
        Qualified<TransportFactory> qualifiedUnqualified4 = Qualified.unqualified(TransportFactory.class);
        qualifiedUnqualified4.getClass();
        transportFactory = qualifiedUnqualified4;
        Qualified<FirebaseSessionsComponent> qualifiedUnqualified5 = Qualified.unqualified(FirebaseSessionsComponent.class);
        qualifiedUnqualified5.getClass();
        firebaseSessionsComponent = qualifiedUnqualified5;
        try {
            d1.f169111a.getClass();
        } catch (NoClassDefFoundError unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FirebaseSessions getComponents$lambda$0(ComponentContainer componentContainer) {
        return ((FirebaseSessionsComponent) componentContainer.get(firebaseSessionsComponent)).getFirebaseSessions();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FirebaseSessionsComponent getComponents$lambda$1(ComponentContainer componentContainer) {
        FirebaseSessionsComponent.Builder builder = DaggerFirebaseSessionsComponent.builder();
        Object obj = componentContainer.get(appContext);
        obj.getClass();
        FirebaseSessionsComponent.Builder builderAppContext = builder.appContext((Context) obj);
        Object obj2 = componentContainer.get(backgroundDispatcher);
        obj2.getClass();
        FirebaseSessionsComponent.Builder builderBackgroundDispatcher = builderAppContext.backgroundDispatcher((g) obj2);
        Object obj3 = componentContainer.get(blockingDispatcher);
        obj3.getClass();
        FirebaseSessionsComponent.Builder builderBlockingDispatcher = builderBackgroundDispatcher.blockingDispatcher((g) obj3);
        Object obj4 = componentContainer.get(firebaseApp);
        obj4.getClass();
        FirebaseSessionsComponent.Builder builderFirebaseApp = builderBlockingDispatcher.firebaseApp((FirebaseApp) obj4);
        Object obj5 = componentContainer.get(firebaseInstallationsApi);
        obj5.getClass();
        FirebaseSessionsComponent.Builder builderFirebaseInstallationsApi = builderFirebaseApp.firebaseInstallationsApi((FirebaseInstallationsApi) obj5);
        Provider<TransportFactory> provider = componentContainer.getProvider(transportFactory);
        provider.getClass();
        return builderFirebaseInstallationsApi.transportFactoryProvider(provider).build();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<? extends Object>> getComponents() {
        return x.k(Component.builder(FirebaseSessions.class).name(LIBRARY_NAME).add(Dependency.required(firebaseSessionsComponent)).factory(new h(6)).eagerInDefaultApp().build(), Component.builder(FirebaseSessionsComponent.class).name("fire-sessions-component").add(Dependency.required(appContext)).add(Dependency.required(backgroundDispatcher)).add(Dependency.required(blockingDispatcher)).add(Dependency.required(firebaseApp)).add(Dependency.required(firebaseInstallationsApi)).add(Dependency.requiredProvider(transportFactory)).factory(new h(7)).build(), LibraryVersionComponent.create(LIBRARY_NAME, BuildConfig.VERSION_NAME));
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R%\u0010\u0007\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR%\u0010\f\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u000b0\u000b0\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR%\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u000e0\u000e0\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\b\u001a\u0004\b\u0010\u0010\nR%\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00110\u00110\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0013\u0010\nR%\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00110\u00110\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\b\u001a\u0004\b\u0015\u0010\nR%\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00160\u00160\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\b\u001a\u0004\b\u0018\u0010\nR%\u0010\u001a\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00190\u00190\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\b\u001a\u0004\b\u001b\u0010\nR\u0014\u0010\u001d\u001a\u00020\u001c8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar$Companion;", "", "<init>", "()V", "Lcom/google/firebase/components/Qualified;", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "appContext", "Lcom/google/firebase/components/Qualified;", "getAppContext", "()Lcom/google/firebase/components/Qualified;", "Lcom/google/firebase/FirebaseApp;", "firebaseApp", "getFirebaseApp", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "firebaseInstallationsApi", "getFirebaseInstallationsApi", "Lo53/z;", "backgroundDispatcher", "getBackgroundDispatcher", "blockingDispatcher", "getBlockingDispatcher", "Lcom/google/android/datatransport/TransportFactory;", "transportFactory", "getTransportFactory", "Lcom/google/firebase/sessions/FirebaseSessionsComponent;", "firebaseSessionsComponent", "getFirebaseSessionsComponent", "", "LIBRARY_NAME", "Ljava/lang/String;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final Qualified<Context> getAppContext() {
            return FirebaseSessionsRegistrar.appContext;
        }

        public final Qualified<z> getBackgroundDispatcher() {
            return FirebaseSessionsRegistrar.backgroundDispatcher;
        }

        public final Qualified<z> getBlockingDispatcher() {
            return FirebaseSessionsRegistrar.blockingDispatcher;
        }

        public final Qualified<FirebaseApp> getFirebaseApp() {
            return FirebaseSessionsRegistrar.firebaseApp;
        }

        public final Qualified<FirebaseInstallationsApi> getFirebaseInstallationsApi() {
            return FirebaseSessionsRegistrar.firebaseInstallationsApi;
        }

        public final Qualified<FirebaseSessionsComponent> getFirebaseSessionsComponent() {
            return FirebaseSessionsRegistrar.firebaseSessionsComponent;
        }

        public final Qualified<TransportFactory> getTransportFactory() {
            return FirebaseSessionsRegistrar.transportFactory;
        }

        private Companion() {
        }
    }
}
