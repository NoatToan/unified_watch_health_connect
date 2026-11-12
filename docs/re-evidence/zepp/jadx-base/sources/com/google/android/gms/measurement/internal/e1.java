package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class e1 implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ zzia b;

    public e1(zzia zziaVar, long j) {
        this.b = zziaVar;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.zzs.zzm().j.zzb(this.a);
        this.b.zzs.zzay().zzc().zzb("Session timeout duration set", Long.valueOf(this.a));
    }
}
