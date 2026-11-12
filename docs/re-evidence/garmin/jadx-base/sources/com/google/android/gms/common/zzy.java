package com.google.android.gms.common;

import android.util.Log;
import com.google.android.gms.common.internal.ShowFirstParty;

/* JADX INFO: loaded from: classes14.dex */
@ShowFirstParty
public class zzy {
    private static final zzy zze = new zzy(true, 3, 1, null, null, -1);
    final boolean zza;
    final String zzb;
    final Throwable zzc;
    final int zzd;

    private zzy(boolean z14, int i14, int i15, String str, Throwable th3, long j8) {
        this.zza = z14;
        this.zzd = i14;
        this.zzb = str;
        this.zzc = th3;
    }

    @Deprecated
    public static zzy zzb() {
        return zze;
    }

    public static zzy zzc(String str) {
        return new zzy(false, 1, 5, str, null, -1L);
    }

    public static zzy zzd(String str, Throwable th3) {
        return new zzy(false, 1, 5, str, th3, -1L);
    }

    public static zzy zzf(int i14, long j8) {
        return new zzy(true, i14, 1, null, null, j8);
    }

    public static zzy zzg(int i14, int i15, String str, Throwable th3) {
        return new zzy(false, i14, i15, str, th3, -1L);
    }

    public String zza() {
        return this.zzb;
    }

    public final void zze() {
        if (this.zza || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.zzc != null) {
            zza();
        } else {
            zza();
        }
    }

    public /* synthetic */ zzy(boolean z14, int i14, int i15, String str, Throwable th3, long j8, byte[] bArr) {
        this(false, 1, 5, null, null, -1L);
    }
}
