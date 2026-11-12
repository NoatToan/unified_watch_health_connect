package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class d2 implements Runnable {
    public final /* synthetic */ zzih a;
    public final /* synthetic */ zzih b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ zzio e;

    public d2(zzio zzioVar, zzih zzihVar, zzih zzihVar2, long j, boolean z) {
        this.e = zzioVar;
        this.a = zzihVar;
        this.b = zzihVar2;
        this.c = j;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.c(this.a, this.b, this.c, this.d, null);
    }
}
