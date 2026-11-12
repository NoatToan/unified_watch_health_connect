package com.google.firebase.sessions;

import com.google.firebase.FirebaseApp;
import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.Preconditions;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;

/* JADX INFO: loaded from: classes2.dex */
@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
public final class FirebaseSessionsComponent_MainModule_Companion_ApplicationInfoFactory implements Factory<ApplicationInfo> {
    private final n13.a<FirebaseApp> firebaseAppProvider;

    public FirebaseSessionsComponent_MainModule_Companion_ApplicationInfoFactory(n13.a<FirebaseApp> aVar) {
        this.firebaseAppProvider = aVar;
    }

    public static ApplicationInfo applicationInfo(FirebaseApp firebaseApp) {
        return (ApplicationInfo) Preconditions.checkNotNullFromProvides(FirebaseSessionsComponent.MainModule.INSTANCE.applicationInfo(firebaseApp));
    }

    public static FirebaseSessionsComponent_MainModule_Companion_ApplicationInfoFactory create(n13.a<FirebaseApp> aVar) {
        return new FirebaseSessionsComponent_MainModule_Companion_ApplicationInfoFactory(aVar);
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, n13.a
    public ApplicationInfo get() {
        return applicationInfo(this.firebaseAppProvider.get());
    }
}
