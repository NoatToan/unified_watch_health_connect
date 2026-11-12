package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzod;

/* JADX INFO: loaded from: classes3.dex */
final class o3 {

    @VisibleForTesting
    public long a;

    @VisibleForTesting
    public long b;
    private final f c;
    public final /* synthetic */ zzkd d;

    public o3(zzkd zzkdVar) {
        this.d = zzkdVar;
        this.c = new n3(this, zzkdVar.zzs);
        long jElapsedRealtime = zzkdVar.zzs.zzav().elapsedRealtime();
        this.a = jElapsedRealtime;
        this.b = jElapsedRealtime;
    }

    public final void a() {
        this.c.b();
        this.a = 0L;
        this.b = 0L;
    }

    @WorkerThread
    public final void b(long j) {
        this.c.b();
    }

    @WorkerThread
    public final void c(long j) {
        this.d.zzg();
        this.c.b();
        this.a = j;
        this.b = j;
    }

    @WorkerThread
    public final boolean d(boolean z, boolean z2, long j) {
        this.d.zzg();
        this.d.zza();
        zzod.zzc();
        if (!this.d.zzs.zzf().zzs(null, zzdy.zzai) || this.d.zzs.zzJ()) {
            this.d.zzs.zzm().n.zzb(this.d.zzs.zzav().currentTimeMillis());
        }
        long j2 = j - this.a;
        if (!z && j2 < 1000) {
            this.d.zzs.zzay().zzj().zzb("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
            return false;
        }
        if (!z2) {
            j2 = j - this.b;
            this.b = j;
        }
        this.d.zzs.zzay().zzj().zzb("Recording user engagement, ms", Long.valueOf(j2));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        zzkz.zzJ(this.d.zzs.zzs().zzj(!this.d.zzs.zzf().zzu()), bundle, true);
        zzaf zzafVarZzf = this.d.zzs.zzf();
        zzdx<Boolean> zzdxVar = zzdy.zzT;
        if (!zzafVarZzf.zzs(null, zzdxVar) && z2) {
            bundle.putLong("_fr", 1L);
        }
        if (!this.d.zzs.zzf().zzs(null, zzdxVar) || !z2) {
            this.d.zzs.zzq().d("auto", "_e", bundle);
        }
        this.a = j;
        this.c.b();
        this.c.d(3600000L);
        return true;
    }
}
