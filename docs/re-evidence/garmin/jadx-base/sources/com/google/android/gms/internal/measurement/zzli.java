package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes14.dex */
final class zzli extends zzlj {
    private int zzb;
    private int zzc;
    private int zzd;

    public /* synthetic */ zzli(byte[] bArr, int i14, int i15, boolean z14, byte[] bArr2) {
        super(null);
        this.zzd = Integer.MAX_VALUE;
        this.zzb = 0;
    }

    public final int zza(int i14) {
        int i15 = this.zzd;
        this.zzd = 0;
        int i16 = this.zzb + this.zzc;
        this.zzb = i16;
        if (i16 <= 0) {
            this.zzc = 0;
            return i15;
        }
        this.zzc = i16;
        this.zzb = 0;
        return i15;
    }
}
