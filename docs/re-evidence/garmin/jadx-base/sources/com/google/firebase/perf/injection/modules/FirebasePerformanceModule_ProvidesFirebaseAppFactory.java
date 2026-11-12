package com.google.firebase.perf.injection.modules;

import com.google.firebase.FirebaseApp;
import g03.b;
import g03.c;

/* JADX INFO: loaded from: classes2.dex */
public final class FirebasePerformanceModule_ProvidesFirebaseAppFactory implements c {
    private final FirebasePerformanceModule module;

    public FirebasePerformanceModule_ProvidesFirebaseAppFactory(FirebasePerformanceModule firebasePerformanceModule) {
        this.module = firebasePerformanceModule;
    }

    public static FirebasePerformanceModule_ProvidesFirebaseAppFactory create(FirebasePerformanceModule firebasePerformanceModule) {
        return new FirebasePerformanceModule_ProvidesFirebaseAppFactory(firebasePerformanceModule);
    }

    public static FirebaseApp providesFirebaseApp(FirebasePerformanceModule firebasePerformanceModule) {
        FirebaseApp firebaseAppProvidesFirebaseApp = firebasePerformanceModule.providesFirebaseApp();
        b.a(firebaseAppProvidesFirebaseApp);
        return firebaseAppProvidesFirebaseApp;
    }

    @Override // n13.a
    public FirebaseApp get() {
        return providesFirebaseApp(this.module);
    }
}
