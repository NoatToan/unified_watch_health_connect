package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.common.annotations.VisibleForTesting;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class zzhf {

    @VisibleForTesting
    final String zza;
    final /* synthetic */ zzhh zzb;
    private final String zzc;
    private final String zzd;
    private final long zze;

    public /* synthetic */ zzhf(zzhh zzhhVar, String str, long j8, byte[] bArr) {
        Objects.requireNonNull(zzhhVar);
        this.zzb = zzhhVar;
        Preconditions.checkNotEmpty("health_monitor");
        Preconditions.checkArgument(j8 > 0);
        this.zza = "health_monitor:start";
        this.zzc = "health_monitor:count";
        this.zzd = "health_monitor:value";
        this.zze = j8;
    }

    private final void zzc() {
        zzhh zzhhVar = this.zzb;
        zzhhVar.zzg();
        long jCurrentTimeMillis = zzhhVar.zzu.zzaZ().currentTimeMillis();
        SharedPreferences.Editor editorEdit = zzhhVar.zzd().edit();
        editorEdit.remove(this.zzc);
        editorEdit.remove(this.zzd);
        editorEdit.putLong(this.zza, jCurrentTimeMillis);
        editorEdit.apply();
    }

    private final long zzd() {
        return this.zzb.zzd().getLong(this.zza, 0L);
    }

    public final void zza(String str, long j8) {
        zzhh zzhhVar = this.zzb;
        zzhhVar.zzg();
        if (zzd() == 0) {
            zzc();
        }
        if (str == null) {
            str = "";
        }
        SharedPreferences sharedPreferencesZzd = zzhhVar.zzd();
        String str2 = this.zzc;
        long j14 = sharedPreferencesZzd.getLong(str2, 0L);
        if (j14 <= 0) {
            SharedPreferences.Editor editorEdit = zzhhVar.zzd().edit();
            editorEdit.putString(this.zzd, str);
            editorEdit.putLong(str2, 1L);
            editorEdit.apply();
            return;
        }
        long jNextLong = zzhhVar.zzu.zzk().zzf().nextLong() & Long.MAX_VALUE;
        long j15 = j14 + 1;
        long j16 = Long.MAX_VALUE / j15;
        SharedPreferences.Editor editorEdit2 = zzhhVar.zzd().edit();
        if (jNextLong < j16) {
            editorEdit2.putString(this.zzd, str);
        }
        editorEdit2.putLong(str2, j15);
        editorEdit2.apply();
    }

    public final Pair zzb() {
        long jAbs;
        zzhh zzhhVar = this.zzb;
        zzhhVar.zzg();
        zzhhVar.zzg();
        long jZzd = zzd();
        if (jZzd == 0) {
            zzc();
            jAbs = 0;
        } else {
            jAbs = Math.abs(jZzd - zzhhVar.zzu.zzaZ().currentTimeMillis());
        }
        long j8 = this.zze;
        if (jAbs < j8) {
            return null;
        }
        if (jAbs > j8 + j8) {
            zzc();
            return null;
        }
        String string = zzhhVar.zzd().getString(this.zzd, null);
        long j14 = zzhhVar.zzd().getLong(this.zzc, 0L);
        zzc();
        return (string == null || j14 <= 0) ? zzhh.zza : new Pair(string, Long.valueOf(j14));
    }
}
