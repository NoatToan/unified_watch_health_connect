package com.google.android.gms.internal.measurement;

import i3.e5;
import java.util.Arrays;
import o2.c;
import yc.l2;

/* JADX INFO: loaded from: classes14.dex */
public final class zzoj {
    private static final zzoj zza = new zzoj(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzoj(int i14, int[] iArr, Object[] objArr, boolean z14) {
        this.zze = -1;
        this.zzb = i14;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z14;
    }

    public static zzoj zza() {
        return zza;
    }

    public static zzoj zzb() {
        return new zzoj(0, new int[8], new Object[8], true);
    }

    public static zzoj zzc(zzoj zzojVar, zzoj zzojVar2) {
        int i14 = zzojVar.zzb + zzojVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzojVar.zzc, i14);
        System.arraycopy(zzojVar2.zzc, 0, iArrCopyOf, zzojVar.zzb, zzojVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzojVar.zzd, i14);
        System.arraycopy(zzojVar2.zzd, 0, objArrCopyOf, zzojVar.zzb, zzojVar2.zzb);
        return new zzoj(i14, iArrCopyOf, objArrCopyOf, true);
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
        if (obj == null || !(obj instanceof zzoj)) {
            return false;
        }
        zzoj zzojVar = (zzoj) obj;
        int i14 = this.zzb;
        if (i14 == zzojVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzojVar.zzc;
            for (int i15 = 0; i15 < i14; i15++) {
                if (iArr[i15] == iArr2[i15]) {
                }
            }
            Object[] objArr = this.zzd;
            Object[] objArr2 = zzojVar.zzd;
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

    public final void zzd() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zze() {
        if (this.zzf) {
            return;
        }
        com.google.protobuf.a.m();
    }

    public final void zzf(zzov zzovVar) {
        for (int i14 = 0; i14 < this.zzb; i14++) {
            zzovVar.zzv(this.zzc[i14] >>> 3, this.zzd[i14]);
        }
    }

    public final void zzg(zzov zzovVar) {
        if (this.zzb != 0) {
            for (int i14 = 0; i14 < this.zzb; i14++) {
                int i15 = this.zzc[i14];
                Object obj = this.zzd[i14];
                int i16 = i15 & 7;
                int i17 = i15 >>> 3;
                if (i16 == 0) {
                    zzovVar.zzc(i17, ((Long) obj).longValue());
                } else if (i16 == 1) {
                    zzovVar.zzj(i17, ((Long) obj).longValue());
                } else if (i16 == 2) {
                    zzovVar.zzn(i17, (zzlh) obj);
                } else if (i16 == 3) {
                    zzovVar.zzt(i17);
                    ((zzoj) obj).zzg(zzovVar);
                    zzovVar.zzu(i17);
                } else {
                    if (i16 != 5) {
                        c.p(new zzmq("Protocol message tag had invalid wire type."));
                        return;
                    }
                    zzovVar.zzk(i17, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int zzh() {
        int i14 = this.zze;
        if (i14 != -1) {
            return i14;
        }
        int iA = 0;
        for (int i15 = 0; i15 < this.zzb; i15++) {
            int i16 = this.zzc[i15] >>> 3;
            zzlh zzlhVar = (zzlh) this.zzd[i15];
            int iZzz = zzlm.zzz(8);
            int iZzz2 = zzlm.zzz(i16) + zzlm.zzz(16);
            int iZzz3 = zzlm.zzz(24);
            int iZzc = zzlhVar.zzc();
            iA += iZzz + iZzz + iZzz2 + a.a(iZzc, iZzc, iZzz3);
        }
        this.zze = iA;
        return iA;
    }

    public final int zzi() {
        int iZzz;
        int iZzA;
        int iZzz2;
        int i14 = this.zze;
        if (i14 != -1) {
            return i14;
        }
        int iZzz3 = 0;
        for (int i15 = 0; i15 < this.zzb; i15++) {
            int i16 = this.zzc[i15];
            int i17 = i16 >>> 3;
            int i18 = i16 & 7;
            if (i18 != 0) {
                if (i18 != 1) {
                    if (i18 == 2) {
                        int i19 = i17 << 3;
                        zzlh zzlhVar = (zzlh) this.zzd[i15];
                        int iZzz4 = zzlm.zzz(i19);
                        int iZzc = zzlhVar.zzc();
                        iZzz3 = zzlm.zzz(iZzc) + iZzc + iZzz4 + iZzz3;
                    } else if (i18 == 3) {
                        int iZzz5 = zzlm.zzz(i17 << 3);
                        iZzz = iZzz5 + iZzz5;
                        iZzA = ((zzoj) this.zzd[i15]).zzi();
                    } else {
                        if (i18 != 5) {
                            l2.p(new zzmq("Protocol message tag had invalid wire type."));
                            return 0;
                        }
                        ((Integer) this.zzd[i15]).getClass();
                        iZzz2 = zzlm.zzz(i17 << 3) + 4;
                    }
                } else {
                    ((Long) this.zzd[i15]).getClass();
                    iZzz2 = zzlm.zzz(i17 << 3) + 8;
                }
                iZzz3 = iZzz2 + iZzz3;
            } else {
                int i24 = i17 << 3;
                long jLongValue = ((Long) this.zzd[i15]).longValue();
                iZzz = zzlm.zzz(i24);
                iZzA = zzlm.zzA(jLongValue);
            }
            iZzz3 = iZzA + iZzz + iZzz3;
        }
        this.zze = iZzz3;
        return iZzz3;
    }

    public final void zzj(StringBuilder sb3, int i14) {
        for (int i15 = 0; i15 < this.zzb; i15++) {
            zzno.zzb(sb3, i14, String.valueOf(this.zzc[i15] >>> 3), this.zzd[i15]);
        }
    }

    public final void zzk(int i14, Object obj) {
        zze();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i15 = this.zzb;
        iArr[i15] = i14;
        this.zzd[i15] = obj;
        this.zzb = i15 + 1;
    }

    public final zzoj zzl(zzoj zzojVar) {
        if (zzojVar.equals(zza)) {
            return this;
        }
        zze();
        int i14 = this.zzb + zzojVar.zzb;
        zzm(i14);
        System.arraycopy(zzojVar.zzc, 0, this.zzc, this.zzb, zzojVar.zzb);
        System.arraycopy(zzojVar.zzd, 0, this.zzd, this.zzb, zzojVar.zzb);
        this.zzb = i14;
        return this;
    }

    private zzoj() {
        this(0, new int[8], new Object[8], true);
    }
}
