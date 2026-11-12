package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes14.dex */
final class zzkw {
    public int zza;
    public long zzb;
    public Object zzc;
    public final zzlr zzd;
    public int zze;

    public zzkw() {
        int i14 = zzlr.zzb;
        int i15 = zznu.zza;
        this.zzd = zzlr.zza;
    }

    public static /* synthetic */ String zza(int i14, int i15, byte b14, String str, String str2) {
        StringBuilder sb3 = new StringBuilder(String.valueOf(i15).length() + b14 + String.valueOf(i14).length());
        sb3.append(str);
        sb3.append(i15);
        sb3.append(str2);
        sb3.append(i14);
        return sb3.toString();
    }

    public zzkw(zzlr zzlrVar) {
        zzlrVar.getClass();
        this.zzd = zzlrVar;
    }
}
