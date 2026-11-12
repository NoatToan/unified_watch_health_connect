package com.google.firebase.perf.injection.modules;

import com.google.firebase.perf.config.ConfigResolver;
import g03.b;
import g03.c;

/* JADX INFO: loaded from: classes2.dex */
public final class FirebasePerformanceModule_ProvidesConfigResolverFactory implements c {
    private final FirebasePerformanceModule module;

    public FirebasePerformanceModule_ProvidesConfigResolverFactory(FirebasePerformanceModule firebasePerformanceModule) {
        this.module = firebasePerformanceModule;
    }

    public static FirebasePerformanceModule_ProvidesConfigResolverFactory create(FirebasePerformanceModule firebasePerformanceModule) {
        return new FirebasePerformanceModule_ProvidesConfigResolverFactory(firebasePerformanceModule);
    }

    public static ConfigResolver providesConfigResolver(FirebasePerformanceModule firebasePerformanceModule) {
        ConfigResolver configResolverProvidesConfigResolver = firebasePerformanceModule.providesConfigResolver();
        b.a(configResolverProvidesConfigResolver);
        return configResolverProvidesConfigResolver;
    }

    @Override // n13.a
    public ConfigResolver get() {
        return providesConfigResolver(this.module);
    }
}
