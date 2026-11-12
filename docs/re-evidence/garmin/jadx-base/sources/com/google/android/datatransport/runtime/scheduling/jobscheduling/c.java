package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class c implements SynchronizationGuard.CriticalSection, Deferred.DeferredHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f52847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f52848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f52849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f52850d;

    public /* synthetic */ c(Uploader uploader, Iterable iterable, TransportContext transportContext, long j8) {
        this.f52848b = uploader;
        this.f52849c = iterable;
        this.f52850d = transportContext;
        this.f52847a = j8;
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object execute() {
        return ((Uploader) this.f52848b).lambda$logAndUpdateState$4((Iterable) this.f52849c, (TransportContext) this.f52850d, this.f52847a);
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void handle(Provider provider) {
        CrashlyticsNativeComponentDeferredProxy.lambda$prepareNativeSession$1((String) this.f52848b, (String) this.f52849c, this.f52847a, (StaticSessionData) this.f52850d, provider);
    }

    public /* synthetic */ c(String str, String str2, long j8, StaticSessionData staticSessionData) {
        this.f52848b = str;
        this.f52849c = str2;
        this.f52847a = j8;
        this.f52850d = staticSessionData;
    }
}
