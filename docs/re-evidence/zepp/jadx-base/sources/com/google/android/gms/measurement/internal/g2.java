package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class g2 implements Runnable {
    public final /* synthetic */ zzih a;
    public final /* synthetic */ long b;
    public final /* synthetic */ zzio c;

    public g2(zzio zzioVar, zzih zzihVar, long j) {
        this.c = zzioVar;
        this.a = zzihVar;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.d(this.a, false, this.b);
        zzio zzioVar = this.c;
        zzioVar.zza = null;
        zzioVar.zzs.zzt().zzG(null);
    }
}
