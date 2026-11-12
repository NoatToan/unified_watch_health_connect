package com.google.firebase.crashlytics;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Qualified;
import com.google.firebase.perf.FirebasePerfRegistrar;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements ComponentFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53690b;

    public /* synthetic */ b(Object obj, int i14) {
        this.f53689a = i14;
        this.f53690b = obj;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        switch (this.f53689a) {
            case 0:
                return ((CrashlyticsRegistrar) this.f53690b).buildCrashlytics(componentContainer);
            default:
                return FirebasePerfRegistrar.lambda$getComponents$0((Qualified) this.f53690b, componentContainer);
        }
    }
}
