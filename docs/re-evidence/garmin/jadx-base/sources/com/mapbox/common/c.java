package com.mapbox.common;

import e23.l;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f54352b;

    public /* synthetic */ c(l lVar, int i14) {
        this.f54351a = i14;
        this.f54352b = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f54351a) {
            case 0:
                LifecycleService.getLifecycleState$lambda$6$lambda$5(this.f54352b);
                break;
            case 1:
                LifecycleService.getLifecycleState$lambda$10$lambda$9$lambda$8(this.f54352b);
                break;
            case 2:
                LifecycleUtils.getLifecycleState$lambda$24$lambda$20$lambda$17$lambda$16(this.f54352b);
                break;
            default:
                LifecycleUtils.getLifecycleState$lambda$24$lambda$23$lambda$22$lambda$21(this.f54352b);
                break;
        }
    }
}
