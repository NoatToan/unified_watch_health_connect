package com.google.firebase.perf.injection.modules;

import com.google.firebase.perf.session.SessionManager;
import g03.b;
import g03.c;

/* JADX INFO: loaded from: classes2.dex */
public final class FirebasePerformanceModule_ProvidesSessionManagerFactory implements c {
    private final FirebasePerformanceModule module;

    public FirebasePerformanceModule_ProvidesSessionManagerFactory(FirebasePerformanceModule firebasePerformanceModule) {
        this.module = firebasePerformanceModule;
    }

    public static FirebasePerformanceModule_ProvidesSessionManagerFactory create(FirebasePerformanceModule firebasePerformanceModule) {
        return new FirebasePerformanceModule_ProvidesSessionManagerFactory(firebasePerformanceModule);
    }

    public static SessionManager providesSessionManager(FirebasePerformanceModule firebasePerformanceModule) {
        SessionManager sessionManagerProvidesSessionManager = firebasePerformanceModule.providesSessionManager();
        b.a(sessionManagerProvidesSessionManager);
        return sessionManagerProvidesSessionManager;
    }

    @Override // n13.a
    public SessionManager get() {
        return providesSessionManager(this.module);
    }
}
