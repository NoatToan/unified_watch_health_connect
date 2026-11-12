package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes14.dex */
abstract class zzv extends zzk {
    final CharSequence zzb;
    final zzp zzc;
    final boolean zzd;
    int zze = 0;
    int zzf = Integer.MAX_VALUE;

    public zzv(zzw zzwVar, CharSequence charSequence) {
        this.zzc = zzwVar.zzf();
        this.zzd = zzwVar.zzg();
        this.zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.common.zzk
    public final /* bridge */ /* synthetic */ Object zza() {
        int iZzd;
        int i14 = this.zze;
        while (true) {
            int i15 = this.zze;
            if (i15 == -1) {
                zzb();
                return null;
            }
            int iZzc = zzc(i15);
            if (iZzc == -1) {
                iZzc = this.zzb.length();
                this.zze = -1;
                iZzd = -1;
            } else {
                iZzd = zzd(iZzc);
                this.zze = iZzd;
            }
            if (iZzd == i14) {
                int i16 = iZzd + 1;
                this.zze = i16;
                if (i16 > this.zzb.length()) {
                    this.zze = -1;
                }
            } else {
                if (i14 < iZzc) {
                    this.zzb.charAt(i14);
                }
                if (i14 < iZzc) {
                    this.zzb.charAt(iZzc - 1);
                }
                if (!this.zzd || i14 != iZzc) {
                    int i17 = this.zzf;
                    if (i17 == 1) {
                        CharSequence charSequence = this.zzb;
                        int length = charSequence.length();
                        this.zze = -1;
                        if (length > i14) {
                            charSequence.charAt(length - 1);
                        }
                        iZzc = length;
                    } else {
                        this.zzf = i17 - 1;
                    }
                    return this.zzb.subSequence(i14, iZzc).toString();
                }
                i14 = this.zze;
            }
        }
    }

    public abstract int zzc(int i14);

    public abstract int zzd(int i14);
}
