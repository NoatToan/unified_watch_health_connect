package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import ch.qos.logback.core.net.SyslogConstants;
import j20.x;
import java.nio.charset.Charset;
import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
final class zzgd extends zzdf {
    static final int[] zza = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, SyslogConstants.LOG_LOCAL2, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private final int zzc;
    private final zzdf zzd;
    private final zzdf zze;
    private final int zzf;
    private final int zzg;

    private zzgd(zzdf zzdfVar, zzdf zzdfVar2) {
        this.zzd = zzdfVar;
        this.zze = zzdfVar2;
        int iZzd = zzdfVar.zzd();
        this.zzf = iZzd;
        this.zzc = zzdfVar2.zzd() + iZzd;
        this.zzg = Math.max(zzdfVar.zzf(), zzdfVar2.zzf()) + 1;
    }

    public static int zzc(int i14) {
        int[] iArr = zza;
        int length = iArr.length;
        if (i14 >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i14];
    }

    public static zzdf zzy(zzdf zzdfVar, zzdf zzdfVar2) {
        if (zzdfVar2.zzd() == 0) {
            return zzdfVar;
        }
        if (zzdfVar.zzd() == 0) {
            return zzdfVar2;
        }
        int iZzd = zzdfVar2.zzd() + zzdfVar.zzd();
        if (iZzd < 128) {
            return zzz(zzdfVar, zzdfVar2);
        }
        if (zzdfVar instanceof zzgd) {
            zzgd zzgdVar = (zzgd) zzdfVar;
            if (zzdfVar2.zzd() + zzgdVar.zze.zzd() < 128) {
                return new zzgd(zzgdVar.zzd, zzz(zzgdVar.zze, zzdfVar2));
            }
            if (zzgdVar.zzd.zzf() > zzgdVar.zze.zzf() && zzgdVar.zzg > zzdfVar2.zzf()) {
                return new zzgd(zzgdVar.zzd, new zzgd(zzgdVar.zze, zzdfVar2));
            }
        }
        return iZzd >= zzc(Math.max(zzdfVar.zzf(), zzdfVar2.zzf()) + 1) ? new zzgd(zzdfVar, zzdfVar2) : zzfz.zza(new zzfz(null), zzdfVar, zzdfVar2);
    }

    private static zzdf zzz(zzdf zzdfVar, zzdf zzdfVar2) {
        int iZzd = zzdfVar.zzd();
        int iZzd2 = zzdfVar2.zzd();
        byte[] bArr = new byte[iZzd + iZzd2];
        zzdfVar.zzv(bArr, 0, 0, iZzd);
        zzdfVar2.zzv(bArr, 0, iZzd, iZzd2);
        return new zzde(bArr);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzdf)) {
            return false;
        }
        zzdf zzdfVar = (zzdf) obj;
        if (this.zzc != zzdfVar.zzd()) {
            return false;
        }
        if (this.zzc == 0) {
            return true;
        }
        int iZzp = zzp();
        int iZzp2 = zzdfVar.zzp();
        if (iZzp != 0 && iZzp2 != 0 && iZzp != iZzp2) {
            return false;
        }
        zzga zzgaVar = null;
        zzgb zzgbVar = new zzgb(this, zzgaVar);
        zzdd zzddVarZza = zzgbVar.next();
        zzgb zzgbVar2 = new zzgb(zzdfVar, zzgaVar);
        zzdd zzddVarZza2 = zzgbVar2.next();
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            int iZzd = zzddVarZza.zzd() - i14;
            int iZzd2 = zzddVarZza2.zzd() - i15;
            int iMin = Math.min(iZzd, iZzd2);
            if (!(i14 == 0 ? zzddVarZza.zzg(zzddVarZza2, i15, iMin) : zzddVarZza2.zzg(zzddVarZza, i14, iMin))) {
                return false;
            }
            i16 += iMin;
            int i17 = this.zzc;
            if (i16 >= i17) {
                if (i16 == i17) {
                    return true;
                }
                x.h();
                return false;
            }
            if (iMin == iZzd) {
                zzddVarZza = zzgbVar.next();
                i14 = 0;
            } else {
                i14 += iMin;
            }
            if (iMin == iZzd2) {
                zzddVarZza = zzddVarZza;
                zzddVarZza2 = zzgbVar2.next();
                i15 = 0;
            } else {
                zzddVarZza = zzddVarZza;
                i15 += iMin;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzfx(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final byte zza(int i14) {
        zzdf.zzu(i14, this.zzc);
        return zzb(i14);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final byte zzb(int i14) {
        int i15 = this.zzf;
        return i14 < i15 ? this.zzd.zzb(i14) : this.zze.zzb(i14 - i15);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final void zze(byte[] bArr, int i14, int i15, int i16) {
        int i17 = i14 + i16;
        int i18 = this.zzf;
        if (i17 <= i18) {
            this.zzd.zze(bArr, i14, i15, i16);
        } else {
            if (i14 >= i18) {
                this.zze.zze(bArr, i14 - i18, i15, i16);
                return;
            }
            int i19 = i18 - i14;
            this.zzd.zze(bArr, i14, i15, i19);
            this.zze.zze(bArr, 0, i15 + i19, i16 - i19);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final int zzf() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final boolean zzh() {
        return this.zzc >= zzc(this.zzg);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final int zzi(int i14, int i15, int i16) {
        int i17 = i15 + i16;
        int i18 = this.zzf;
        if (i17 <= i18) {
            return this.zzd.zzi(i14, i15, i16);
        }
        if (i15 >= i18) {
            return this.zze.zzi(i14, i15 - i18, i16);
        }
        int i19 = i18 - i15;
        return this.zze.zzi(this.zzd.zzi(i14, i15, i19), 0, i16 - i19);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final int zzj(int i14, int i15, int i16) {
        int i17 = i15 + i16;
        int i18 = this.zzf;
        if (i17 <= i18) {
            return this.zzd.zzj(i14, i15, i16);
        }
        if (i15 >= i18) {
            return this.zze.zzj(i14, i15 - i18, i16);
        }
        int i19 = i18 - i15;
        return this.zze.zzj(this.zzd.zzj(i14, i15, i19), 0, i16 - i19);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final zzdf zzk(int i14, int i15) {
        int iZzo = zzdf.zzo(i14, i15, this.zzc);
        if (iZzo == 0) {
            return zzdf.zzb;
        }
        if (iZzo == this.zzc) {
            return this;
        }
        int i16 = this.zzf;
        if (i15 <= i16) {
            return this.zzd.zzk(i14, i15);
        }
        if (i14 >= i16) {
            return this.zze.zzk(i14 - i16, i15 - i16);
        }
        zzdf zzdfVar = this.zzd;
        return new zzgd(zzdfVar.zzk(i14, zzdfVar.zzd()), this.zze.zzk(0, i15 - this.zzf));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final String zzl(Charset charset) {
        return new String(zzw(), charset);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final void zzm(zzcx zzcxVar) {
        this.zzd.zzm(zzcxVar);
        this.zze.zzm(zzcxVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    public final boolean zzn() {
        zzdf zzdfVar = this.zzd;
        zzdf zzdfVar2 = this.zze;
        return zzdfVar2.zzj(zzdfVar.zzj(0, 0, this.zzf), 0, zzdfVar2.zzd()) == 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf
    /* JADX INFO: renamed from: zzq */
    public final zzdb iterator() {
        return new zzfx(this);
    }
}
