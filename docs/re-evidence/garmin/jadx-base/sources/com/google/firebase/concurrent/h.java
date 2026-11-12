package com.google.firebase.concurrent;

import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.perf.FirebasePerfRegistrar;
import com.google.firebase.platforminfo.DefaultUserAgentPublisher;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements ComponentFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53682a;

    public /* synthetic */ h(int i14) {
        this.f53682a = i14;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        switch (this.f53682a) {
            case 0:
                return ExecutorsRegistrar.lambda$getComponents$4(componentContainer);
            case 1:
                return ExecutorsRegistrar.lambda$getComponents$5(componentContainer);
            case 2:
                return ExecutorsRegistrar.lambda$getComponents$6(componentContainer);
            case 3:
                return ExecutorsRegistrar.lambda$getComponents$7(componentContainer);
            case 4:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(componentContainer);
            case 5:
                return DefaultUserAgentPublisher.lambda$component$0(componentContainer);
            case 6:
                return FirebaseSessionsRegistrar.getComponents$lambda$0(componentContainer);
            case 7:
                return FirebaseSessionsRegistrar.getComponents$lambda$1(componentContainer);
            case 8:
                return AbtRegistrar.lambda$getComponents$0(componentContainer);
            case 9:
                return TransportRegistrar.lambda$getComponents$0(componentContainer);
            case 10:
                return TransportRegistrar.lambda$getComponents$1(componentContainer);
            case 11:
                return TransportRegistrar.lambda$getComponents$2(componentContainer);
            default:
                return FirebasePerfRegistrar.providesFirebasePerformance(componentContainer);
        }
    }
}
