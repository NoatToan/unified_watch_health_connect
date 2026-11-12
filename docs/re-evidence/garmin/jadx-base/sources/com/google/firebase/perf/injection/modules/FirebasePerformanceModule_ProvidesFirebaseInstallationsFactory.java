package com.google.firebase.perf.injection.modules;

import com.google.firebase.installations.FirebaseInstallationsApi;
import g03.b;
import g03.c;

/* JADX INFO: loaded from: classes2.dex */
public final class FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory implements c {
    private final FirebasePerformanceModule module;

    public FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory(FirebasePerformanceModule firebasePerformanceModule) {
        this.module = firebasePerformanceModule;
    }

    public static FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory create(FirebasePerformanceModule firebasePerformanceModule) {
        return new FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory(firebasePerformanceModule);
    }

    public static FirebaseInstallationsApi providesFirebaseInstallations(FirebasePerformanceModule firebasePerformanceModule) {
        FirebaseInstallationsApi firebaseInstallationsApiProvidesFirebaseInstallations = firebasePerformanceModule.providesFirebaseInstallations();
        b.a(firebaseInstallationsApiProvidesFirebaseInstallations);
        return firebaseInstallationsApiProvidesFirebaseInstallations;
    }

    @Override // n13.a
    public FirebaseInstallationsApi get() {
        return providesFirebaseInstallations(this.module);
    }
}
