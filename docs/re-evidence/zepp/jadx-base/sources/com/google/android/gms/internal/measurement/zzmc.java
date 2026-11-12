package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzmc {
    private static final zzmc f = new zzmc(0, new int[0], new Object[0], false);
    private int a;
    private int[] b;
    private Object[] c;
    private int d;
    private boolean e;

    private zzmc() {
        this(0, new int[8], new Object[8], true);
    }

    private zzmc(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static zzmc a(zzmc zzmcVar, zzmc zzmcVar2) {
        int i = zzmcVar.a + zzmcVar2.a;
        int[] iArrCopyOf = Arrays.copyOf(zzmcVar.b, i);
        System.arraycopy(zzmcVar2.b, 0, iArrCopyOf, zzmcVar.a, zzmcVar2.a);
        Object[] objArrCopyOf = Arrays.copyOf(zzmcVar.c, i);
        System.arraycopy(zzmcVar2.c, 0, objArrCopyOf, zzmcVar.a, zzmcVar2.a);
        return new zzmc(i, iArrCopyOf, objArrCopyOf, true);
    }

    public static zzmc b() {
        return new zzmc(0, new int[8], new Object[8], true);
    }

    public static zzmc zzc() {
        return f;
    }

    public final void c(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.a; i2++) {
            r3.b(sb, i, String.valueOf(this.b[i2] >>> 3), this.c[i2]);
        }
    }

    public final void d(int i, Object obj) {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
        int i2 = this.a;
        int[] iArr = this.b;
        if (i2 == iArr.length) {
            int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
            this.b = Arrays.copyOf(iArr, i3);
            this.c = Arrays.copyOf(this.c, i3);
        }
        int[] iArr2 = this.b;
        int i4 = this.a;
        iArr2[i4] = i;
        this.c[i4] = obj;
        this.a = i4 + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzmc)) {
            return false;
        }
        zzmc zzmcVar = (zzmc) obj;
        int i = this.a;
        if (i == zzmcVar.a) {
            int[] iArr = this.b;
            int[] iArr2 = zzmcVar.b;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.c;
            Object[] objArr2 = zzmcVar.c;
            int i3 = this.a;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.c;
        int i6 = this.a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    public final int zza() {
        int iZzA;
        int iZzB;
        int iZzA2;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int iZzA3 = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            int i3 = this.b[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        zzix zzixVar = (zzix) this.c[i2];
                        int iZzA4 = zzje.zzA(i4 << 3);
                        int iZzd = zzixVar.zzd();
                        iZzA3 += iZzA4 + zzje.zzA(iZzd) + iZzd;
                    } else if (i5 == 3) {
                        int iZzz = zzje.zzz(i4);
                        iZzA = iZzz + iZzz;
                        iZzB = ((zzmc) this.c[i2]).zza();
                    } else {
                        if (i5 != 5) {
                            throw new IllegalStateException(zzkh.a());
                        }
                        ((Integer) this.c[i2]).intValue();
                        iZzA2 = zzje.zzA(i4 << 3) + 4;
                    }
                } else {
                    ((Long) this.c[i2]).longValue();
                    iZzA2 = zzje.zzA(i4 << 3) + 8;
                }
                iZzA3 += iZzA2;
            } else {
                long jLongValue = ((Long) this.c[i2]).longValue();
                iZzA = zzje.zzA(i4 << 3);
                iZzB = zzje.zzB(jLongValue);
            }
            iZzA2 = iZzA + iZzB;
            iZzA3 += iZzA2;
        }
        this.d = iZzA3;
        return iZzA3;
    }

    public final int zzb() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int iZzA = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            int i3 = this.b[i2];
            zzix zzixVar = (zzix) this.c[i2];
            int iZzA2 = zzje.zzA(8);
            int iZzd = zzixVar.zzd();
            iZzA += iZzA2 + iZzA2 + zzje.zzA(16) + zzje.zzA(i3 >>> 3) + zzje.zzA(24) + zzje.zzA(iZzd) + iZzd;
        }
        this.d = iZzA;
        return iZzA;
    }

    public final void zzf() {
        this.e = false;
    }

    public final void zzi(u2 u2Var) throws IOException {
        if (this.a != 0) {
            for (int i = 0; i < this.a; i++) {
                int i2 = this.b[i];
                Object obj = this.c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    u2Var.E(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    u2Var.x(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    u2Var.o(i3, (zzix) obj);
                } else if (i4 == 3) {
                    u2Var.e(i3);
                    ((zzmc) obj).zzi(u2Var);
                    u2Var.s(i3);
                } else {
                    if (i4 != 5) {
                        throw new RuntimeException(zzkh.a());
                    }
                    u2Var.v(i3, ((Integer) obj).intValue());
                }
            }
        }
    }
}
