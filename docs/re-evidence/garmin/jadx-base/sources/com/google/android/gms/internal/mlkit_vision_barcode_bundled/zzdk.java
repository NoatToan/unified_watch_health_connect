package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import org.apache.commons.lang3.e;

/* JADX INFO: loaded from: classes14.dex */
final class zzdk extends zzdn {
    private final byte[] zzb;
    private final int zzc;
    private int zzd;

    public zzdk(byte[] bArr, int i14, int i15) {
        super(null);
        int length = bArr.length;
        if (((length - i15) | i15) < 0) {
            e.s("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i15)});
            throw null;
        }
        this.zzb = bArr;
        this.zzd = 0;
        this.zzc = i15;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final int zza() {
        return this.zzc - this.zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzb(byte b14) throws zzdl {
        try {
            byte[] bArr = this.zzb;
            int i14 = this.zzd;
            this.zzd = i14 + 1;
            bArr[i14] = b14;
        } catch (IndexOutOfBoundsException e4) {
            throw new zzdl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e4);
        }
    }

    public final void zzc(byte[] bArr, int i14, int i15) {
        try {
            System.arraycopy(bArr, i14, this.zzb, this.zzd, i15);
            this.zzd += i15;
        } catch (IndexOutOfBoundsException e4) {
            throw new zzdl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(i15)), e4);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzd(int i14, boolean z14) throws zzdl {
        zzt(i14 << 3);
        zzb(z14 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zze(int i14, zzdf zzdfVar) throws zzdl {
        zzt((i14 << 3) | 2);
        zzt(zzdfVar.zzd());
        zzdfVar.zzm(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzf(int i14, int i15) throws zzdl {
        zzt((i14 << 3) | 5);
        zzg(i15);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzg(int i14) throws zzdl {
        try {
            byte[] bArr = this.zzb;
            int i15 = this.zzd;
            int i16 = i15 + 1;
            this.zzd = i16;
            bArr[i15] = (byte) (i14 & 255);
            int i17 = i15 + 2;
            this.zzd = i17;
            bArr[i16] = (byte) ((i14 >> 8) & 255);
            int i18 = i15 + 3;
            this.zzd = i18;
            bArr[i17] = (byte) ((i14 >> 16) & 255);
            this.zzd = i15 + 4;
            bArr[i18] = (byte) ((i14 >> 24) & 255);
        } catch (IndexOutOfBoundsException e4) {
            throw new zzdl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e4);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzh(int i14, long j8) throws zzdl {
        zzt((i14 << 3) | 1);
        zzi(j8);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzi(long j8) throws zzdl {
        try {
            byte[] bArr = this.zzb;
            int i14 = this.zzd;
            int i15 = i14 + 1;
            this.zzd = i15;
            bArr[i14] = (byte) (((int) j8) & 255);
            int i16 = i14 + 2;
            this.zzd = i16;
            bArr[i15] = (byte) (((int) (j8 >> 8)) & 255);
            int i17 = i14 + 3;
            this.zzd = i17;
            bArr[i16] = (byte) (((int) (j8 >> 16)) & 255);
            int i18 = i14 + 4;
            this.zzd = i18;
            bArr[i17] = (byte) (((int) (j8 >> 24)) & 255);
            int i19 = i14 + 5;
            this.zzd = i19;
            bArr[i18] = (byte) (((int) (j8 >> 32)) & 255);
            int i24 = i14 + 6;
            this.zzd = i24;
            bArr[i19] = (byte) (((int) (j8 >> 40)) & 255);
            int i25 = i14 + 7;
            this.zzd = i25;
            bArr[i24] = (byte) (((int) (j8 >> 48)) & 255);
            this.zzd = i14 + 8;
            bArr[i25] = (byte) (((int) (j8 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e4) {
            throw new zzdl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e4);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzj(int i14, int i15) throws zzdl {
        zzt(i14 << 3);
        zzk(i15);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzk(int i14) throws zzdl {
        if (i14 >= 0) {
            zzt(i14);
        } else {
            zzv(i14);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzl(byte[] bArr, int i14, int i15) {
        zzc(bArr, 0, i15);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzm(int i14, zzfm zzfmVar, zzge zzgeVar) throws zzdl {
        zzt((i14 << 3) | 2);
        zzt(((zzcq) zzfmVar).zzB(zzgeVar));
        zzgeVar.zzi(zzfmVar, this.zza);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzn(int i14, zzfm zzfmVar) throws zzdl {
        zzt(11);
        zzs(2, i14);
        zzt(26);
        zzt(zzfmVar.zzF());
        zzfmVar.zzab(this);
        zzt(12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzo(int i14, zzdf zzdfVar) throws zzdl {
        zzt(11);
        zzs(2, i14);
        zze(3, zzdfVar);
        zzt(12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzp(int i14, String str) throws zzdl {
        zzt((i14 << 3) | 2);
        zzq(str);
    }

    public final void zzq(String str) throws zzdl {
        int i14 = this.zzd;
        try {
            int iZzA = zzdn.zzA(str.length() * 3);
            int iZzA2 = zzdn.zzA(str.length());
            if (iZzA2 != iZzA) {
                zzt(zzhe.zze(str));
                byte[] bArr = this.zzb;
                int i15 = this.zzd;
                this.zzd = zzhe.zzd(str, bArr, i15, this.zzc - i15);
                return;
            }
            int i16 = i14 + iZzA2;
            this.zzd = i16;
            int iZzd = zzhe.zzd(str, this.zzb, i16, this.zzc - i16);
            this.zzd = i14;
            zzt((iZzd - i14) - iZzA2);
            this.zzd = iZzd;
        } catch (zzhd e4) {
            this.zzd = i14;
            zzD(str, e4);
        } catch (IndexOutOfBoundsException e14) {
            throw new zzdl(e14);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzr(int i14, int i15) throws zzdl {
        zzt((i14 << 3) | i15);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzs(int i14, int i15) throws zzdl {
        zzt(i14 << 3);
        zzt(i15);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzt(int i14) throws zzdl {
        while (true) {
            int i15 = i14 & (-128);
            byte[] bArr = this.zzb;
            if (i15 == 0) {
                int i16 = this.zzd;
                this.zzd = i16 + 1;
                bArr[i16] = (byte) i14;
                return;
            } else {
                try {
                    int i17 = this.zzd;
                    this.zzd = i17 + 1;
                    bArr[i17] = (byte) ((i14 | 128) & 255);
                    i14 >>>= 7;
                } catch (IndexOutOfBoundsException e4) {
                    throw new zzdl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e4);
                }
            }
            throw new zzdl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e4);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzu(int i14, long j8) throws zzdl {
        zzt(i14 << 3);
        zzv(j8);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn
    public final void zzv(long j8) throws zzdl {
        if (!zzdn.zzc || this.zzc - this.zzd < 10) {
            while (true) {
                long j14 = j8 & (-128);
                byte[] bArr = this.zzb;
                if (j14 == 0) {
                    int i14 = this.zzd;
                    this.zzd = i14 + 1;
                    bArr[i14] = (byte) j8;
                    return;
                } else {
                    try {
                        int i15 = this.zzd;
                        this.zzd = i15 + 1;
                        bArr[i15] = (byte) ((((int) j8) | 128) & 255);
                        j8 >>>= 7;
                    } catch (IndexOutOfBoundsException e4) {
                        throw new zzdl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e4);
                    }
                }
                throw new zzdl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e4);
            }
        }
        while (true) {
            long j15 = j8 & (-128);
            int i16 = (int) j8;
            byte[] bArr2 = this.zzb;
            if (j15 == 0) {
                int i17 = this.zzd;
                this.zzd = i17 + 1;
                zzgz.zzn(bArr2, i17, (byte) i16);
                return;
            } else {
                int i18 = this.zzd;
                this.zzd = i18 + 1;
                zzgz.zzn(bArr2, i18, (byte) ((i16 | 128) & 255));
                j8 >>>= 7;
            }
        }
    }
}
