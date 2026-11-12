package com.google.firebase.perf.injection.modules;

import com.google.android.datatransport.TransportFactory;
import com.google.firebase.inject.Provider;
import g03.b;
import g03.c;

/* JADX INFO: loaded from: classes2.dex */
public final class FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory implements c {
    private final FirebasePerformanceModule module;

    public FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory(FirebasePerformanceModule firebasePerformanceModule) {
        this.module = firebasePerformanceModule;
    }

    public static FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory create(FirebasePerformanceModule firebasePerformanceModule) {
        return new FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory(firebasePerformanceModule);
    }

    public static Provider<TransportFactory> providesTransportFactoryProvider(FirebasePerformanceModule firebasePerformanceModule) {
        Provider<TransportFactory> providerProvidesTransportFactoryProvider = firebasePerformanceModule.providesTransportFactoryProvider();
        b.a(providerProvidesTransportFactoryProvider);
        return providerProvidesTransportFactoryProvider;
    }

    @Override // n13.a
    public Provider<TransportFactory> get() {
        return providesTransportFactoryProvider(this.module);
    }
}
