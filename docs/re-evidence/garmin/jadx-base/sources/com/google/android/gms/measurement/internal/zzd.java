package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.Map;
import p1.a;

/* JADX INFO: loaded from: classes14.dex */
public final class zzd extends zzf {
    private final Map zza;
    private final Map zzb;
    private long zzc;

    public zzd(zzic zzicVar) {
        super(zzicVar);
        this.zzb = new a();
        this.zza = new a();
    }

    private final void zzh(long j8, zzlu zzluVar) {
        if (zzluVar == null) {
            this.zzu.zzaV().zzk().zza("Not logging ad exposure. No active activity");
            return;
        }
        if (j8 < 1000) {
            this.zzu.zzaV().zzk().zzb("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j8));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j8);
        zzpp.zzav(zzluVar, bundle, true);
        this.zzu.zzj().zzF("am", "_xa", bundle);
    }

    private final void zzi(String str, long j8, zzlu zzluVar) {
        if (zzluVar == null) {
            this.zzu.zzaV().zzk().zza("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j8 < 1000) {
            this.zzu.zzaV().zzk().zzb("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j8));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j8);
        zzpp.zzav(zzluVar, bundle, true);
        this.zzu.zzj().zzF("am", "_xu", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public final void zzf(long j8) {
        Map map = this.zza;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            map.put((String) it.next(), Long.valueOf(j8));
        }
        if (map.isEmpty()) {
            return;
        }
        this.zzc = j8;
    }

    public final void zza(String str, long j8) {
        if (str == null || str.length() == 0) {
            com.google.android.gms.internal.measurement.a.j(this.zzu, "Ad unit id must be a non-empty string");
        } else {
            this.zzu.zzaW().zzj(new zza(this, str, j8));
        }
    }

    public final void zzb(String str, long j8) {
        if (str == null || str.length() == 0) {
            com.google.android.gms.internal.measurement.a.j(this.zzu, "Ad unit id must be a non-empty string");
        } else {
            this.zzu.zzaW().zzj(new zzb(this, str, j8));
        }
    }

    public final void zzc(long j8) {
        zzlu zzluVarZzh = this.zzu.zzs().zzh(false);
        Map map = this.zza;
        for (String str : map.keySet()) {
            zzi(str, j8 - ((Long) map.get(str)).longValue(), zzluVarZzh);
        }
        if (!map.isEmpty()) {
            zzh(j8 - this.zzc, zzluVarZzh);
        }
        zzf(j8);
    }

    public final /* synthetic */ void zzd(String str, long j8) {
        zzg();
        Preconditions.checkNotEmpty(str);
        Map map = this.zzb;
        if (map.isEmpty()) {
            this.zzc = j8;
        }
        Integer num = (Integer) map.get(str);
        if (num != null) {
            map.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (map.size() >= 100) {
            com.google.android.gms.internal.measurement.a.q(this.zzu, "Too many ads visible");
        } else {
            map.put(str, 1);
            this.zza.put(str, Long.valueOf(j8));
        }
    }

    public final /* synthetic */ void zze(String str, long j8) {
        zzg();
        Preconditions.checkNotEmpty(str);
        Map map = this.zzb;
        Integer num = (Integer) map.get(str);
        zzic zzicVar = this.zzu;
        if (num == null) {
            zzicVar.zzaV().zzb().zzb("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        zzlu zzluVarZzh = zzicVar.zzs().zzh(false);
        int iIntValue = num.intValue() - 1;
        if (iIntValue != 0) {
            map.put(str, Integer.valueOf(iIntValue));
            return;
        }
        map.remove(str);
        Map map2 = this.zza;
        Long l14 = (Long) map2.get(str);
        if (l14 == null) {
            com.google.android.gms.internal.measurement.a.j(this.zzu, "First ad unit exposure time was never set");
        } else {
            long jLongValue = j8 - l14.longValue();
            map2.remove(str);
            zzi(str, jLongValue, zzluVarZzh);
        }
        if (map.isEmpty()) {
            long j14 = this.zzc;
            if (j14 == 0) {
                com.google.android.gms.internal.measurement.a.j(this.zzu, "First ad exposure time was never set");
            } else {
                zzh(j8 - j14, zzluVarZzh);
                this.zzc = 0L;
            }
        }
    }
}
