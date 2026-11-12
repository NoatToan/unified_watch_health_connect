package com.mapbox.common;

import android.content.Context;
import android.os.Looper;
import e23.l;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f54354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Looper f54355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f54356d;

    public /* synthetic */ d(Context context, Looper looper, l lVar, int i14) {
        this.f54353a = i14;
        this.f54354b = context;
        this.f54355c = looper;
        this.f54356d = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f54353a) {
            case 0:
                LifecycleUtils.hasServiceRunningInForeground$lambda$15(this.f54354b, this.f54355c, this.f54356d);
                break;
            default:
                LifecycleUtils.getLifecycleState$lambda$24(this.f54354b, this.f54355c, this.f54356d);
                break;
        }
    }
}
