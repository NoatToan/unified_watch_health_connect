package com.google.firebase.perf.injection.modules;

import com.google.firebase.perf.config.RemoteConfigManager;
import g03.b;
import g03.c;

/* JADX INFO: loaded from: classes2.dex */
public final class FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory implements c {
    private final FirebasePerformanceModule module;

    public FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory(FirebasePerformanceModule firebasePerformanceModule) {
        this.module = firebasePerformanceModule;
    }

    public static FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory create(FirebasePerformanceModule firebasePerformanceModule) {
        return new FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory(firebasePerformanceModule);
    }

    public static RemoteConfigManager providesRemoteConfigManager(FirebasePerformanceModule firebasePerformanceModule) {
        RemoteConfigManager remoteConfigManagerProvidesRemoteConfigManager = firebasePerformanceModule.providesRemoteConfigManager();
        b.a(remoteConfigManagerProvidesRemoteConfigManager);
        return remoteConfigManagerProvidesRemoteConfigManager;
    }

    @Override // n13.a
    public RemoteConfigManager get() {
        return providesRemoteConfigManager(this.module);
    }
}
