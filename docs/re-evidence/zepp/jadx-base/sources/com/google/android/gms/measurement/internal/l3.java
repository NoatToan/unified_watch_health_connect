package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;

/* JADX INFO: loaded from: classes3.dex */
final class l3 {
    private k3 a;
    public final /* synthetic */ zzkd b;

    public l3(zzkd zzkdVar) {
        this.b = zzkdVar;
    }

    @WorkerThread
    public final void a(long j) {
        this.a = new k3(this, this.b.zzs.zzav().currentTimeMillis(), j);
        this.b.b.postDelayed(this.a, 2000L);
    }

    @WorkerThread
    public final void b() {
        this.b.zzg();
        if (this.a != null) {
            this.b.b.removeCallbacks(this.a);
        }
        this.b.zzs.zzm().p.zza(false);
    }
}
