package com.google.android.gms.internal.fitness;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzjr {
    private static final zzjr f = new zzjr(0, new int[0], new Object[0], false);
    private int a;
    private int[] b;
    private Object[] c;
    private int d;
    private boolean e;

    private zzjr() {
        this(0, new int[8], new Object[8], true);
    }

    public static zzjr a(zzjr zzjrVar, zzjr zzjrVar2) {
        int i = zzjrVar.a + zzjrVar2.a;
        int[] iArrCopyOf = Arrays.copyOf(zzjrVar.b, i);
        System.arraycopy(zzjrVar2.b, 0, iArrCopyOf, zzjrVar.a, zzjrVar2.a);
        Object[] objArrCopyOf = Arrays.copyOf(zzjrVar.c, i);
        System.arraycopy(zzjrVar2.c, 0, objArrCopyOf, zzjrVar.a, zzjrVar2.a);
        return new zzjr(i, iArrCopyOf, objArrCopyOf, true);
    }

    private static void d(int i, Object obj, d5 d5Var) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            d5Var.s(i2, ((Long) obj).longValue());
            return;
        }
        if (i3 == 1) {
            d5Var.d(i2, ((Long) obj).longValue());
            return;
        }
        if (i3 == 2) {
            d5Var.K(i2, (zzfx) obj);
            return;
        }
        if (i3 != 3) {
            if (i3 != 5) {
                throw new RuntimeException(zzhk.a());
            }
            d5Var.q(i2, ((Integer) obj).intValue());
        } else if (d5Var.D() == zzkl.zzaea) {
            d5Var.z(i2);
            ((zzjr) obj).zzb(d5Var);
            d5Var.G(i2);
        } else {
            d5Var.G(i2);
            ((zzjr) obj).zzb(d5Var);
            d5Var.z(i2);
        }
    }

    public static zzjr zzdp() {
        return f;
    }

    public final void b(d5 d5Var) throws IOException {
        if (d5Var.D() == zzkl.zzaeb) {
            for (int i = this.a - 1; i >= 0; i--) {
                d5Var.e(this.b[i] >>> 3, this.c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.a; i2++) {
            d5Var.e(this.b[i2] >>> 3, this.c[i2]);
        }
    }

    public final void c(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.a; i2++) {
            m3.c(sb, i, String.valueOf(this.b[i2] >>> 3), this.c[i2]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0046 A[RETURN] */
    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzjr)) {
            return false;
        }
        zzjr zzjrVar = (zzjr) obj;
        int i = this.a;
        if (i == zzjrVar.a) {
            int[] iArr = this.b;
            int[] iArr2 = zzjrVar.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    z = true;
                    break;
                }
                if (iArr[i2] != iArr2[i2]) {
                    z = false;
                    break;
                }
                i2++;
            }
            if (z) {
                Object[] objArr = this.c;
                Object[] objArr2 = zzjrVar.c;
                int i3 = this.a;
                for (int i4 = 0; i4 < i3; i4++) {
                    if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        if (!z2) {
                            return true;
                        }
                    }
                }
                z2 = true;
                if (!z2) {
                    return true;
                }
            }
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

    public final void zzar() {
        this.e = false;
    }

    public final void zzb(d5 d5Var) throws IOException {
        if (this.a == 0) {
            return;
        }
        if (d5Var.D() == zzkl.zzaea) {
            for (int i = 0; i < this.a; i++) {
                d(this.b[i], this.c[i], d5Var);
            }
            return;
        }
        for (int i2 = this.a - 1; i2 >= 0; i2--) {
            d(this.b[i2], this.c[i2], d5Var);
        }
    }

    public final int zzbp() {
        int iZze;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 == 0) {
                iZze = zzgk.zze(i5, ((Long) this.c[i3]).longValue());
            } else if (i6 == 1) {
                iZze = zzgk.zzg(i5, ((Long) this.c[i3]).longValue());
            } else if (i6 == 2) {
                iZze = zzgk.zzc(i5, (zzfx) this.c[i3]);
            } else if (i6 == 3) {
                iZze = (zzgk.zzr(i5) << 1) + ((zzjr) this.c[i3]).zzbp();
            } else {
                if (i6 != 5) {
                    throw new IllegalStateException(zzhk.a());
                }
                iZze = zzgk.zzl(i5, ((Integer) this.c[i3]).intValue());
            }
            i2 += iZze;
        }
        this.d = i2;
        return i2;
    }

    public final int zzdq() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int iZzd = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            iZzd += zzgk.zzd(this.b[i2] >>> 3, (zzfx) this.c[i2]);
        }
        this.d = iZzd;
        return iZzd;
    }

    private zzjr(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }
}
