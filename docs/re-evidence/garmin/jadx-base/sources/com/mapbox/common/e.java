package com.mapbox.common;

import e23.l;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f54358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f54359c;

    public /* synthetic */ e(Object obj, boolean z14, int i14) {
        this.f54357a = i14;
        this.f54359c = obj;
        this.f54358b = z14;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f54357a) {
            case 0:
                ((Reachability.ReachabilityOfflineSwitchObserver) this.f54359c).lambda$statusChanged$0(this.f54358b);
                break;
            default:
                LifecycleUtils.hasServiceRunningInForeground$lambda$15$lambda$14$lambda$13((l) this.f54359c, this.f54358b);
                break;
        }
    }
}
