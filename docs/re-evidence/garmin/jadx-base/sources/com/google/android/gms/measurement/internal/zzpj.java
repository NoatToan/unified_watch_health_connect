package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class zzpj {
    private final long zza;
    private final com.google.android.gms.internal.measurement.zzib zzb;
    private final String zzc;
    private final Map zzd;
    private final zzls zze;
    private final long zzf;
    private final long zzg;
    private final long zzh;
    private final int zzi;

    public /* synthetic */ zzpj(long j8, com.google.android.gms.internal.measurement.zzib zzibVar, String str, Map map, zzls zzlsVar, long j14, long j15, long j16, int i14, byte[] bArr) {
        this.zza = j8;
        this.zzb = zzibVar;
        this.zzc = str;
        this.zzd = map;
        this.zze = zzlsVar;
        this.zzf = j14;
        this.zzg = j15;
        this.zzh = j16;
        this.zzi = i14;
    }

    public final zzot zza() {
        return new zzot(this.zzc, this.zzd, this.zze, null);
    }

    public final zzom zzb() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.zzd.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        long j8 = this.zza;
        com.google.android.gms.internal.measurement.zzib zzibVar = this.zzb;
        String str = this.zzc;
        zzls zzlsVar = this.zze;
        return new zzom(j8, zzibVar.zzcc(), str, bundle, zzlsVar.zza(), this.zzg, "");
    }

    public final long zzc() {
        return this.zza;
    }

    public final com.google.android.gms.internal.measurement.zzib zzd() {
        return this.zzb;
    }

    public final String zze() {
        return this.zzc;
    }

    public final zzls zzf() {
        return this.zze;
    }

    public final long zzg() {
        return this.zzf;
    }

    public final long zzh() {
        return this.zzh;
    }

    public final int zzi() {
        return this.zzi;
    }
}
