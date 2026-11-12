package com.google.android.gms.internal.measurement;

import java.util.Locale;
import tn.k;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
final class zzlk extends zzlm {
    private final byte[] zzc;
    private final int zzd;
    private int zze;

    public zzlk(byte[] bArr, int i14, int i15) {
        super(null);
        int length = bArr.length;
        if (((length - i15) | i15) < 0) {
            Locale locale = Locale.US;
            h.s(k.e(length, i15, "Array range is invalid. Buffer.length=", ", offset=0, length="));
            throw null;
        }
        this.zzc = bArr;
        this.zze = 0;
        this.zzd = i15;
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zza(int i14, int i15) throws zzll {
        zzr((i14 << 3) | i15);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzb(int i14, int i15) throws zzll {
        zzr(i14 << 3);
        zzq(i15);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzc(int i14, int i15) throws zzll {
        zzr(i14 << 3);
        zzr(i15);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzd(int i14, int i15) throws zzll {
        zzr((i14 << 3) | 5);
        zzs(i15);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zze(int i14, long j8) throws zzll {
        zzr(i14 << 3);
        zzt(j8);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzf(int i14, long j8) throws zzll {
        zzr((i14 << 3) | 1);
        zzu(j8);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzg(int i14, boolean z14) throws zzll {
        zzr(i14 << 3);
        zzp(z14 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzh(int i14, String str) throws zzll {
        zzr((i14 << 3) | 2);
        zzx(str);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzi(int i14, zzlh zzlhVar) throws zzll {
        zzr((i14 << 3) | 2);
        zzj(zzlhVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzj(zzlh zzlhVar) throws zzll {
        zzr(zzlhVar.zzc());
        zzlhVar.zzf(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzk(byte[] bArr, int i14, int i15) throws zzll {
        zzr(i15);
        zzv(bArr, 0, i15);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzl(int i14, zznm zznmVar, zznx zznxVar) throws zzll {
        zzr((i14 << 3) | 2);
        zzr(((zzks) zznmVar).zzcd(zznxVar));
        zznxVar.zzf(zznmVar, this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzm(int i14, zznm zznmVar) throws zzll {
        zzr(11);
        zzc(2, i14);
        zzr(26);
        zzo(zznmVar);
        zzr(12);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzn(int i14, zzlh zzlhVar) throws zzll {
        zzr(11);
        zzc(2, i14);
        zzi(3, zzlhVar);
        zzr(12);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzo(zznm zznmVar) throws zzll {
        zzr(zznmVar.zzcn());
        zznmVar.zzcB(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzp(byte b14) throws zzll {
        int i14 = this.zze;
        try {
            int i15 = i14 + 1;
            try {
                this.zzc[i14] = b14;
                this.zze = i15;
            } catch (IndexOutOfBoundsException e4) {
                e = e4;
                i14 = i15;
                throw new zzll(i14, this.zzd, 1, e);
            }
        } catch (IndexOutOfBoundsException e14) {
            e = e14;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzq(int i14) throws zzll {
        if (i14 >= 0) {
            zzr(i14);
        } else {
            zzt(i14);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzr(int i14) throws zzll {
        int i15;
        int i16 = this.zze;
        while (true) {
            int i17 = i14 & (-128);
            byte[] bArr = this.zzc;
            if (i17 == 0) {
                i15 = i16 + 1;
                bArr[i16] = (byte) i14;
                this.zze = i15;
                return;
            } else {
                i15 = i16 + 1;
                try {
                    bArr[i16] = (byte) (i14 | 128);
                    i14 >>>= 7;
                    i16 = i15;
                } catch (IndexOutOfBoundsException e4) {
                    throw new zzll(i15, this.zzd, 1, e4);
                }
            }
            throw new zzll(i15, this.zzd, 1, e4);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzs(int i14) throws zzll {
        int i15 = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i15] = (byte) i14;
            bArr[i15 + 1] = (byte) (i14 >> 8);
            bArr[i15 + 2] = (byte) (i14 >> 16);
            bArr[i15 + 3] = (byte) (i14 >> 24);
            this.zze = i15 + 4;
        } catch (IndexOutOfBoundsException e4) {
            throw new zzll(i15, this.zzd, 4, e4);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzt(long j8) throws zzll {
        byte[] bArr;
        int i14;
        int i15;
        byte[] bArr2;
        boolean z14 = zzlm.zzd;
        int i16 = this.zze;
        if (!z14 || this.zzd - i16 < 10) {
            while (true) {
                long j14 = j8 & (-128);
                bArr = this.zzc;
                if (j14 == 0) {
                    break;
                }
                int i17 = i16 + 1;
                try {
                    bArr[i16] = (byte) (((int) j8) | 128);
                    j8 >>>= 7;
                    i16 = i17;
                } catch (IndexOutOfBoundsException e4) {
                    e = e4;
                    i14 = i17;
                }
                throw new zzll(i14, this.zzd, 1, e);
            }
            i14 = i16 + 1;
            try {
                bArr[i16] = (byte) j8;
                i15 = i14;
            } catch (IndexOutOfBoundsException e14) {
                e = e14;
            }
        } else {
            while (true) {
                long j15 = j8 & (-128);
                bArr2 = this.zzc;
                if (j15 == 0) {
                    break;
                }
                zzop.zzp(bArr2, i16, (byte) (((int) j8) | 128));
                j8 >>>= 7;
                i16++;
            }
            i15 = i16 + 1;
            zzop.zzp(bArr2, i16, (byte) j8);
        }
        this.zze = i15;
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzu(long j8) throws zzll {
        int i14 = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i14] = (byte) j8;
            bArr[i14 + 1] = (byte) (j8 >> 8);
            bArr[i14 + 2] = (byte) (j8 >> 16);
            bArr[i14 + 3] = (byte) (j8 >> 24);
            bArr[i14 + 4] = (byte) (j8 >> 32);
            bArr[i14 + 5] = (byte) (j8 >> 40);
            bArr[i14 + 6] = (byte) (j8 >> 48);
            bArr[i14 + 7] = (byte) (j8 >> 56);
            this.zze = i14 + 8;
        } catch (IndexOutOfBoundsException e4) {
            throw new zzll(i14, this.zzd, 8, e4);
        }
    }

    public final void zzv(byte[] bArr, int i14, int i15) {
        try {
            System.arraycopy(bArr, 0, this.zzc, this.zze, i15);
            this.zze += i15;
        } catch (IndexOutOfBoundsException e4) {
            throw new zzll(this.zze, this.zzd, i15, e4);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzw(byte[] bArr, int i14, int i15) {
        zzv(bArr, 0, i15);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzx(String str) throws zzll {
        int i14 = this.zze;
        try {
            int iZzz = zzlm.zzz(str.length() * 3);
            int iZzz2 = zzlm.zzz(str.length());
            if (iZzz2 != iZzz) {
                zzr(zzos.zzb(str));
                byte[] bArr = this.zzc;
                int i15 = this.zze;
                this.zze = zzos.zzc(str, bArr, i15, this.zzd - i15);
                return;
            }
            int i16 = i14 + iZzz2;
            this.zze = i16;
            int iZzc = zzos.zzc(str, this.zzc, i16, this.zzd - i16);
            this.zze = i14;
            zzr((iZzc - i14) - iZzz2);
            this.zze = iZzc;
        } catch (zzor e4) {
            this.zze = i14;
            zzF(str, e4);
        } catch (IndexOutOfBoundsException e14) {
            throw new zzll(e14);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final int zzy() {
        return this.zzd - this.zze;
    }
}
