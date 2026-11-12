package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes14.dex */
final class zzfw implements zzfj {
    private final zzfm zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    public zzfw(zzfm zzfmVar, String str, Object[] objArr) {
        this.zza = zzfmVar;
        this.zzb = str;
        this.zzc = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.zzd = cCharAt;
            return;
        }
        int i14 = cCharAt & 8191;
        int i15 = 1;
        int i16 = 13;
        while (true) {
            int i17 = i15 + 1;
            char cCharAt2 = str.charAt(i15);
            if (cCharAt2 < 55296) {
                this.zzd = i14 | (cCharAt2 << i16);
                return;
            } else {
                i14 |= (cCharAt2 & 8191) << i16;
                i16 += 13;
                i15 = i17;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfj
    public final zzfm zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfj
    public final boolean zzb() {
        return (this.zzd & 2) == 2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfj
    public final int zzc() {
        int i14 = this.zzd;
        if ((i14 & 1) != 0) {
            return 1;
        }
        return (i14 & 4) == 4 ? 3 : 2;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Object[] zze() {
        return this.zzc;
    }
}
