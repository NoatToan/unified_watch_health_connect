package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.WorkerThread;

/* JADX INFO: loaded from: classes3.dex */
public final class zzkd extends v {
    private Handler b;
    public final p3 zza;
    public final o3 zzb;
    public final l3 zzc;

    public zzkd(zzfv zzfvVar) {
        super(zzfvVar);
        this.zza = new p3(this);
        this.zzb = new o3(this);
        this.zzc = new l3(this);
    }

    public static /* bridge */ /* synthetic */ void d(zzkd zzkdVar, long j) {
        zzkdVar.zzg();
        zzkdVar.f();
        zzkdVar.zzs.zzay().zzj().zzb("Activity paused, time", Long.valueOf(j));
        zzkdVar.zzc.a(j);
        if (zzkdVar.zzs.zzf().zzu()) {
            zzkdVar.zzb.b(j);
        }
    }

    public static /* bridge */ /* synthetic */ void e(zzkd zzkdVar, long j) {
        zzkdVar.zzg();
        zzkdVar.f();
        zzkdVar.zzs.zzay().zzj().zzb("Activity resumed, time", Long.valueOf(j));
        if (zzkdVar.zzs.zzf().zzu() || zzkdVar.zzs.zzm().p.zzb()) {
            zzkdVar.zzb.c(j);
        }
        zzkdVar.zzc.b();
        p3 p3Var = zzkdVar.zza;
        p3Var.a.zzg();
        if (p3Var.a.zzs.zzJ()) {
            p3Var.b(p3Var.a.zzs.zzav().currentTimeMillis(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public final void f() {
        zzg();
        if (this.b == null) {
            this.b = new com.google.android.gms.internal.measurement.zzby(Looper.getMainLooper());
        }
    }

    @Override // com.google.android.gms.measurement.internal.v
    public final boolean zzf() {
        return false;
    }
}
