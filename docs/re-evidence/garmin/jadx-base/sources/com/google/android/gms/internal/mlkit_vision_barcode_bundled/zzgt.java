package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.android.gms.internal.measurement.a;
import i3.e5;
import java.util.Arrays;
import o2.c;
import yc.l2;

/* JADX INFO: loaded from: classes14.dex */
public final class zzgt {
    private static final zzgt zza = new zzgt(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzgt(int i14, int[] iArr, Object[] objArr, boolean z14) {
        this.zze = -1;
        this.zzb = i14;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z14;
    }

    public static zzgt zzc() {
        return zza;
    }

    public static zzgt zze(zzgt zzgtVar, zzgt zzgtVar2) {
        int i14 = zzgtVar.zzb + zzgtVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzgtVar.zzc, i14);
        System.arraycopy(zzgtVar2.zzc, 0, iArrCopyOf, zzgtVar.zzb, zzgtVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzgtVar.zzd, i14);
        System.arraycopy(zzgtVar2.zzd, 0, objArrCopyOf, zzgtVar.zzb, zzgtVar2.zzb);
        return new zzgt(i14, iArrCopyOf, objArrCopyOf, true);
    }

    public static zzgt zzf() {
        return new zzgt(0, new int[8], new Object[8], true);
    }

    private final void zzm(int i14) {
        int[] iArr = this.zzc;
        if (i14 > iArr.length) {
            int i15 = this.zzb;
            int i16 = (i15 / 2) + i15;
            if (i16 >= i14) {
                i14 = i16;
            }
            if (i14 < 8) {
                i14 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i14);
            this.zzd = Arrays.copyOf(this.zzd, i14);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzgt)) {
            return false;
        }
        zzgt zzgtVar = (zzgt) obj;
        int i14 = this.zzb;
        if (i14 == zzgtVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzgtVar.zzc;
            for (int i15 = 0; i15 < i14; i15++) {
                if (iArr[i15] == iArr2[i15]) {
                }
            }
            Object[] objArr = this.zzd;
            Object[] objArr2 = zzgtVar.zzd;
            int i16 = this.zzb;
            for (int i17 = 0; i17 < i16; i17++) {
                if (objArr[i17].equals(objArr2[i17])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i14 = this.zzb;
        int i15 = i14 + 527;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i16 = 17;
        for (int i17 = 0; i17 < i14; i17++) {
            i16 = (i16 * 31) + iArr[i17];
        }
        int iC = e5.c(i15, 31, i16, 31);
        Object[] objArr = this.zzd;
        int i18 = this.zzb;
        for (int i19 = 0; i19 < i18; i19++) {
            iHashCode = (iHashCode * 31) + objArr[i19].hashCode();
        }
        return iC + iHashCode;
    }

    public final int zza() {
        int iZzA;
        int iZzB;
        int iZzA2;
        int i14 = this.zze;
        if (i14 != -1) {
            return i14;
        }
        int iZzA3 = 0;
        for (int i15 = 0; i15 < this.zzb; i15++) {
            int i16 = this.zzc[i15];
            int i17 = i16 >>> 3;
            int i18 = i16 & 7;
            if (i18 != 0) {
                if (i18 != 1) {
                    if (i18 == 2) {
                        int i19 = i17 << 3;
                        zzdf zzdfVar = (zzdf) this.zzd[i15];
                        int iZzA4 = zzdn.zzA(i19);
                        int iZzd = zzdfVar.zzd();
                        iZzA3 = zzdn.zzA(iZzd) + iZzd + iZzA4 + iZzA3;
                    } else if (i18 == 3) {
                        int iZzA5 = zzdn.zzA(i17 << 3);
                        iZzA = iZzA5 + iZzA5;
                        iZzB = ((zzgt) this.zzd[i15]).zza();
                    } else {
                        if (i18 != 5) {
                            l2.p(new zzeq("Protocol message tag had invalid wire type."));
                            return 0;
                        }
                        ((Integer) this.zzd[i15]).getClass();
                        iZzA2 = zzdn.zzA(i17 << 3) + 4;
                    }
                } else {
                    ((Long) this.zzd[i15]).getClass();
                    iZzA2 = zzdn.zzA(i17 << 3) + 8;
                }
                iZzA3 = iZzA2 + iZzA3;
            } else {
                int i24 = i17 << 3;
                long jLongValue = ((Long) this.zzd[i15]).longValue();
                iZzA = zzdn.zzA(i24);
                iZzB = zzdn.zzB(jLongValue);
            }
            iZzA3 = iZzB + iZzA + iZzA3;
        }
        this.zze = iZzA3;
        return iZzA3;
    }

    public final int zzb() {
        int i14 = this.zze;
        if (i14 != -1) {
            return i14;
        }
        int iM = 0;
        for (int i15 = 0; i15 < this.zzb; i15++) {
            int i16 = this.zzc[i15] >>> 3;
            zzdf zzdfVar = (zzdf) this.zzd[i15];
            int iZzA = zzdn.zzA(8);
            int iZzA2 = zzdn.zzA(i16) + zzdn.zzA(16);
            int iZzA3 = zzdn.zzA(24);
            int iZzd = zzdfVar.zzd();
            iM += iZzA + iZzA + iZzA2 + a.m(iZzd, iZzd, iZzA3);
        }
        this.zze = iM;
        return iM;
    }

    public final zzgt zzd(zzgt zzgtVar) {
        if (zzgtVar.equals(zza)) {
            return this;
        }
        zzg();
        int i14 = this.zzb + zzgtVar.zzb;
        zzm(i14);
        System.arraycopy(zzgtVar.zzc, 0, this.zzc, this.zzb, zzgtVar.zzb);
        System.arraycopy(zzgtVar.zzd, 0, this.zzd, this.zzb, zzgtVar.zzb);
        this.zzb = i14;
        return this;
    }

    public final void zzg() {
        if (this.zzf) {
            return;
        }
        com.google.protobuf.a.m();
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zzi(StringBuilder sb3, int i14) {
        for (int i15 = 0; i15 < this.zzb; i15++) {
            zzfo.zzb(sb3, i14, String.valueOf(this.zzc[i15] >>> 3), this.zzd[i15]);
        }
    }

    public final void zzj(int i14, Object obj) {
        zzg();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i15 = this.zzb;
        iArr[i15] = i14;
        this.zzd[i15] = obj;
        this.zzb = i15 + 1;
    }

    public final void zzk(zzhh zzhhVar) {
        for (int i14 = 0; i14 < this.zzb; i14++) {
            zzhhVar.zzw(this.zzc[i14] >>> 3, this.zzd[i14]);
        }
    }

    public final void zzl(zzhh zzhhVar) {
        if (this.zzb != 0) {
            for (int i14 = 0; i14 < this.zzb; i14++) {
                int i15 = this.zzc[i14];
                Object obj = this.zzd[i14];
                int i16 = i15 & 7;
                int i17 = i15 >>> 3;
                if (i16 == 0) {
                    zzhhVar.zzt(i17, ((Long) obj).longValue());
                } else if (i16 == 1) {
                    zzhhVar.zzm(i17, ((Long) obj).longValue());
                } else if (i16 == 2) {
                    zzhhVar.zzd(i17, (zzdf) obj);
                } else if (i16 == 3) {
                    zzhhVar.zzF(i17);
                    ((zzgt) obj).zzl(zzhhVar);
                    zzhhVar.zzh(i17);
                } else {
                    if (i16 != 5) {
                        c.p(new zzeq("Protocol message tag had invalid wire type."));
                        return;
                    }
                    zzhhVar.zzk(i17, ((Integer) obj).intValue());
                }
            }
        }
    }

    private zzgt() {
        this(0, new int[8], new Object[8], true);
    }
}
