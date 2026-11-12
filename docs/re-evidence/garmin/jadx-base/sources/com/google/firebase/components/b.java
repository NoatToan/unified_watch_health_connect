package com.google.firebase.components;

import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallations;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Provider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53646b;

    public /* synthetic */ b(Object obj, int i14) {
        this.f53645a = i14;
        this.f53646b = obj;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        switch (this.f53645a) {
            case 0:
                return ComponentDiscovery.instantiate((String) this.f53646b);
            default:
                return FirebaseInstallations.lambda$new$0((FirebaseApp) this.f53646b);
        }
    }
}
