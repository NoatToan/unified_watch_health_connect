package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class zzhe {
    final /* synthetic */ zzhh zza;
    private final String zzb;
    private final long zzc;
    private boolean zzd;
    private long zze;

    public zzhe(zzhh zzhhVar, String str, long j8) {
        Objects.requireNonNull(zzhhVar);
        this.zza = zzhhVar;
        Preconditions.checkNotEmpty(str);
        this.zzb = str;
        this.zzc = j8;
    }

    public final long zza() {
        if (!this.zzd) {
            this.zzd = true;
            zzhh zzhhVar = this.zza;
            this.zze = zzhhVar.zzd().getLong(this.zzb, this.zzc);
        }
        return this.zze;
    }

    public final void zzb(long j8) {
        SharedPreferences.Editor editorEdit = this.zza.zzd().edit();
        editorEdit.putLong(this.zzb, j8);
        editorEdit.apply();
        this.zze = j8;
    }
}
