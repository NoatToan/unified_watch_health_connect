package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
final class f3 implements Runnable {
    public final /* synthetic */ zzjn a;

    public f3(zzjn zzjnVar) {
        this.a = zzjnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjo zzjoVar = this.a.c;
        Context contextZzau = zzjoVar.zzs.zzau();
        this.a.c.zzs.zzaw();
        zzjo.o(zzjoVar, new ComponentName(contextZzau, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
