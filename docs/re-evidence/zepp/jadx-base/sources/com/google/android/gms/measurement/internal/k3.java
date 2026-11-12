package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
final class k3 implements Runnable {
    public final long a;
    public final long b;
    public final /* synthetic */ l3 c;

    public k3(l3 l3Var, long j, long j2) {
        this.c = l3Var;
        this.a = j;
        this.b = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.b.zzs.zzaz().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjx
            @Override // java.lang.Runnable
            public final void run() {
                k3 k3Var = this.zza;
                l3 l3Var = k3Var.c;
                long j = k3Var.a;
                long j2 = k3Var.b;
                l3Var.b.zzg();
                l3Var.b.zzs.zzay().zzc().zza("Application going to the background");
                boolean z = true;
                l3Var.b.zzs.zzm().p.zza(true);
                Bundle bundle = new Bundle();
                if (!l3Var.b.zzs.zzf().zzu()) {
                    l3Var.b.zzb.b(j2);
                    if (l3Var.b.zzs.zzf().zzs(null, zzdy.zzaf)) {
                        o3 o3Var = l3Var.b.zzb;
                        long j3 = o3Var.b;
                        o3Var.b = j2;
                        bundle.putLong("_et", j2 - j3);
                        zzkz.zzJ(l3Var.b.zzs.zzs().zzj(true), bundle, true);
                    } else {
                        z = false;
                    }
                    l3Var.b.zzb.d(false, z, j2);
                }
                l3Var.b.zzs.zzq().e("auto", "_ab", j, bundle);
            }
        });
    }
}
