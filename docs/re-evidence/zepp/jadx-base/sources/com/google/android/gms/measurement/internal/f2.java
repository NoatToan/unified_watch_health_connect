package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class f2 implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ zzio b;

    public f2(zzio zzioVar, long j) {
        this.b = zzioVar;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.zzs.zzd().zzf(this.a);
        this.b.zza = null;
    }
}
