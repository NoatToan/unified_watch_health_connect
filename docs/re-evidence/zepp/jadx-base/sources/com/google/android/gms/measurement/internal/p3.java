package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zznu;

/* JADX INFO: loaded from: classes3.dex */
final class p3 {
    public final /* synthetic */ zzkd a;

    public p3(zzkd zzkdVar) {
        this.a = zzkdVar;
    }

    @WorkerThread
    public final void a() {
        this.a.zzg();
        if (this.a.zzs.zzm().i(this.a.zzs.zzav().currentTimeMillis())) {
            this.a.zzs.zzm().k.zza(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.a.zzs.zzay().zzj().zza("Detected application was in foreground");
                c(this.a.zzs.zzav().currentTimeMillis(), false);
            }
        }
    }

    @WorkerThread
    public final void b(long j, boolean z) {
        this.a.zzg();
        this.a.f();
        if (this.a.zzs.zzm().i(j)) {
            this.a.zzs.zzm().k.zza(true);
        }
        this.a.zzs.zzm().n.zzb(j);
        if (this.a.zzs.zzm().k.zzb()) {
            c(j, z);
        }
    }

    @VisibleForTesting
    @WorkerThread
    public final void c(long j, boolean z) {
        this.a.zzg();
        if (this.a.zzs.zzJ()) {
            this.a.zzs.zzm().n.zzb(j);
            this.a.zzs.zzay().zzj().zzb("Session started, time", Long.valueOf(this.a.zzs.zzav().elapsedRealtime()));
            Long lValueOf = Long.valueOf(j / 1000);
            this.a.zzs.zzq().j("auto", "_sid", lValueOf, j);
            this.a.zzs.zzm().k.zza(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", lValueOf.longValue());
            if (this.a.zzs.zzf().zzs(null, zzdy.zzad) && z) {
                bundle.putLong("_aib", 1L);
            }
            this.a.zzs.zzq().e("auto", "_s", j, bundle);
            zznu.zzc();
            if (this.a.zzs.zzf().zzs(null, zzdy.zzah)) {
                String strZza = this.a.zzs.zzm().s.zza();
                if (TextUtils.isEmpty(strZza)) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", strZza);
                this.a.zzs.zzq().e("auto", "_ssr", j, bundle2);
            }
        }
    }
}
