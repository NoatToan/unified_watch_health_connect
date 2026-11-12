package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class c3 implements Runnable {
    public final /* synthetic */ zzeb a;
    public final /* synthetic */ zzjn b;

    public c3(zzjn zzjnVar, zzeb zzebVar) {
        this.b = zzjnVar;
        this.a = zzebVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b) {
            this.b.a = false;
            if (!this.b.c.zzL()) {
                this.b.c.zzs.zzay().zzj().zza("Connected to service");
                this.b.c.zzJ(this.a);
            }
        }
    }
}
