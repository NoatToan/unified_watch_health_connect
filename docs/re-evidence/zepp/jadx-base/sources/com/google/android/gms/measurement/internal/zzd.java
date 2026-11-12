package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzd extends m {
    private final Map<String, Long> a;
    private final Map<String, Integer> b;
    private long c;

    public zzd(zzfv zzfvVar) {
        super(zzfvVar);
        this.b = new ArrayMap();
        this.a = new ArrayMap();
    }

    public static /* synthetic */ void a(zzd zzdVar, String str, long j) {
        zzdVar.zzg();
        Preconditions.checkNotEmpty(str);
        if (zzdVar.b.isEmpty()) {
            zzdVar.c = j;
        }
        Integer num = zzdVar.b.get(str);
        if (num != null) {
            zzdVar.b.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (zzdVar.b.size() >= 100) {
            zzdVar.zzs.zzay().zzk().zza("Too many ads visible");
        } else {
            zzdVar.b.put(str, 1);
            zzdVar.a.put(str, Long.valueOf(j));
        }
    }

    public static /* synthetic */ void b(zzd zzdVar, String str, long j) {
        zzdVar.zzg();
        Preconditions.checkNotEmpty(str);
        Integer num = zzdVar.b.get(str);
        if (num == null) {
            zzdVar.zzs.zzay().zzd().zzb("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        zzih zzihVarZzj = zzdVar.zzs.zzs().zzj(false);
        int iIntValue = num.intValue() - 1;
        if (iIntValue != 0) {
            zzdVar.b.put(str, Integer.valueOf(iIntValue));
            return;
        }
        zzdVar.b.remove(str);
        Long l = zzdVar.a.get(str);
        if (l == null) {
            zzdVar.zzs.zzay().zzd().zza("First ad unit exposure time was never set");
        } else {
            long jLongValue = l.longValue();
            zzdVar.a.remove(str);
            zzdVar.e(str, j - jLongValue, zzihVarZzj);
        }
        if (zzdVar.b.isEmpty()) {
            long j2 = zzdVar.c;
            if (j2 == 0) {
                zzdVar.zzs.zzay().zzd().zza("First ad exposure time was never set");
            } else {
                zzdVar.d(j - j2, zzihVarZzj);
                zzdVar.c = 0L;
            }
        }
    }

    @WorkerThread
    private final void d(long j, zzih zzihVar) {
        if (zzihVar == null) {
            this.zzs.zzay().zzj().zza("Not logging ad exposure. No active activity");
            return;
        }
        if (j < 1000) {
            this.zzs.zzay().zzj().zzb("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j);
        zzkz.zzJ(zzihVar, bundle, true);
        this.zzs.zzq().d("am", "_xa", bundle);
    }

    @WorkerThread
    private final void e(String str, long j, zzih zzihVar) {
        if (zzihVar == null) {
            this.zzs.zzay().zzj().zza("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j < 1000) {
            this.zzs.zzay().zzj().zzb("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j);
        zzkz.zzJ(zzihVar, bundle, true);
        this.zzs.zzq().d("am", "_xu", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public final void f(long j) {
        Iterator<String> it2 = this.a.keySet().iterator();
        while (it2.hasNext()) {
            this.a.put(it2.next(), Long.valueOf(j));
        }
        if (this.a.isEmpty()) {
            return;
        }
        this.c = j;
    }

    public final void zzd(String str, long j) {
        if (str == null || str.length() == 0) {
            this.zzs.zzay().zzd().zza("Ad unit id must be a non-empty string");
        } else {
            this.zzs.zzaz().zzp(new a(this, str, j));
        }
    }

    public final void zze(String str, long j) {
        if (str == null || str.length() == 0) {
            this.zzs.zzay().zzd().zza("Ad unit id must be a non-empty string");
        } else {
            this.zzs.zzaz().zzp(new i(this, str, j));
        }
    }

    @WorkerThread
    public final void zzf(long j) {
        zzih zzihVarZzj = this.zzs.zzs().zzj(false);
        for (String str : this.a.keySet()) {
            e(str, j - this.a.get(str).longValue(), zzihVarZzj);
        }
        if (!this.a.isEmpty()) {
            d(j - this.c, zzihVarZzj);
        }
        f(j);
    }
}
