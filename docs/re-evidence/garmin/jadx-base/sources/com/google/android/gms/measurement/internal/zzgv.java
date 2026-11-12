package com.google.android.gms.measurement.internal;

import am.j;
import android.os.Bundle;
import sn.a;

/* JADX INFO: loaded from: classes14.dex */
public final class zzgv {
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final Bundle zzd;

    public zzgv(String str, String str2, Bundle bundle, long j8) {
        this.zza = str;
        this.zzb = str2;
        this.zzd = bundle;
        this.zzc = j8;
    }

    public static zzgv zza(zzbg zzbgVar) {
        return new zzgv(zzbgVar.zza, zzbgVar.zzc, zzbgVar.zzb.zzf(), zzbgVar.zzd);
    }

    public final String toString() {
        String str = this.zzb;
        String string = this.zzd.toString();
        int length = String.valueOf(str).length();
        String str2 = this.zza;
        StringBuilder sb3 = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + string.length());
        a.t(sb3, "origin=", str, ",name=", str2);
        return j.o(",params=", string, sb3);
    }

    public final zzbg zzb() {
        return new zzbg(this.zza, new zzbe(new Bundle(this.zzd)), this.zzb, this.zzc);
    }
}
