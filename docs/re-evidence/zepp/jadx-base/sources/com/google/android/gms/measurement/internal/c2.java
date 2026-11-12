package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
final class c2 implements Runnable {
    public final /* synthetic */ Bundle a;
    public final /* synthetic */ zzih b;
    public final /* synthetic */ zzih c;
    public final /* synthetic */ long d;
    public final /* synthetic */ zzio e;

    public c2(zzio zzioVar, Bundle bundle, zzih zzihVar, zzih zzihVar2, long j) {
        this.e = zzioVar;
        this.a = bundle;
        this.b = zzihVar;
        this.c = zzihVar2;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzio.i(this.e, this.a, this.b, this.c, this.d);
    }
}
