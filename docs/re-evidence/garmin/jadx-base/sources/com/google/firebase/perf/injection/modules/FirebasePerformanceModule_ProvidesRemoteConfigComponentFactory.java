package com.google.firebase.perf.injection.modules;

import com.google.firebase.inject.Provider;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import g03.b;
import g03.c;

/* JADX INFO: loaded from: classes2.dex */
public final class FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory implements c {
    private final FirebasePerformanceModule module;

    public FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory(FirebasePerformanceModule firebasePerformanceModule) {
        this.module = firebasePerformanceModule;
    }

    public static FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory create(FirebasePerformanceModule firebasePerformanceModule) {
        return new FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory(firebasePerformanceModule);
    }

    public static Provider<RemoteConfigComponent> providesRemoteConfigComponent(FirebasePerformanceModule firebasePerformanceModule) {
        Provider<RemoteConfigComponent> providerProvidesRemoteConfigComponent = firebasePerformanceModule.providesRemoteConfigComponent();
        b.a(providerProvidesRemoteConfigComponent);
        return providerProvidesRemoteConfigComponent;
    }

    @Override // n13.a
    public Provider<RemoteConfigComponent> get() {
        return providesRemoteConfigComponent(this.module);
    }
}
