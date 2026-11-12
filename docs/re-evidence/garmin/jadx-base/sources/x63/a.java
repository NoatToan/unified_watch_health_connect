package x63;

import com.google.common.primitives.UnsignedBytes;
import ds.e0;
import java.io.EOFException;
import w63.c0;
import w63.w;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f189308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f189309b;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(d53.c.f57666b);
        bytes.getClass();
        f189308a = bytes;
        f189309b = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};
    }

    public static final long a(w63.e eVar, w63.h hVar, long j8, long j14, int i14) {
        c0 c0Var;
        byte[] bArr;
        long j15 = j8;
        long j16 = j14;
        eVar.getClass();
        hVar.getClass();
        long j17 = i14;
        w63.b.b(hVar.d(), 0, j17);
        if (i14 <= 0) {
            vb.h.s("byteCount == 0");
            return 0L;
        }
        long j18 = 0;
        if (j15 < 0) {
            vb.h.x(org.apache.commons.lang3.e.e(j15, "fromIndex < 0: "));
            return 0L;
        }
        if (j15 > j16) {
            StringBuilder sbK = e0.k(j15, "fromIndex > toIndex: ", " > ");
            sbK.append(j16);
            throw new IllegalArgumentException(sbK.toString().toString());
        }
        long j19 = eVar.f183349b;
        if (j16 > j19) {
            j16 = j19;
        }
        if (j15 == j16 || (c0Var = eVar.f183348a) == null) {
            return -1L;
        }
        if (j19 - j15 >= j15) {
            while (true) {
                long j24 = ((long) (c0Var.f183338c - c0Var.f183337b)) + j18;
                if (j24 > j15) {
                    break;
                }
                c0Var = c0Var.f183341f;
                c0Var.getClass();
                j18 = j24;
            }
            byte[] f183363a = hVar.getF183363a();
            byte b14 = f183363a[0];
            long jMin = Math.min(j16, (eVar.f183349b - j17) + 1);
            long j25 = j18;
            while (j25 < jMin) {
                byte[] bArr2 = c0Var.f183336a;
                int iMin = (int) Math.min(c0Var.f183338c, (((long) c0Var.f183337b) + jMin) - j25);
                for (int i15 = (int) ((((long) c0Var.f183337b) + j15) - j25); i15 < iMin; i15++) {
                    if (bArr2[i15] == b14 && b(c0Var, i15 + 1, f183363a, 1, i14)) {
                        return ((long) (i15 - c0Var.f183337b)) + j25;
                    }
                }
                j25 += (long) (c0Var.f183338c - c0Var.f183337b);
                c0Var = c0Var.f183341f;
                c0Var.getClass();
                j15 = j25;
            }
            return -1L;
        }
        while (j19 > j15) {
            c0Var = c0Var.f183342g;
            c0Var.getClass();
            j19 -= (long) (c0Var.f183338c - c0Var.f183337b);
        }
        byte[] f183363a2 = hVar.getF183363a();
        byte b15 = f183363a2[0];
        byte[] bArr3 = f183363a2;
        long jMin2 = Math.min(j16, (eVar.f183349b - j17) + 1);
        while (j19 < jMin2) {
            byte[] bArr4 = c0Var.f183336a;
            int iMin2 = (int) Math.min(c0Var.f183338c, (((long) c0Var.f183337b) + jMin2) - j19);
            int i16 = (int) ((((long) c0Var.f183337b) + j15) - j19);
            while (i16 < iMin2) {
                if (bArr4[i16] == b15) {
                    bArr = bArr3;
                    if (b(c0Var, i16 + 1, bArr, 1, i14)) {
                        return ((long) (i16 - c0Var.f183337b)) + j19;
                    }
                } else {
                    bArr = bArr3;
                }
                i16++;
                bArr3 = bArr;
            }
            j19 += (long) (c0Var.f183338c - c0Var.f183337b);
            c0Var = c0Var.f183341f;
            c0Var.getClass();
            j15 = j19;
        }
        return -1L;
    }

    public static final boolean b(c0 c0Var, int i14, byte[] bArr, int i15, int i16) {
        int i17 = c0Var.f183338c;
        byte[] bArr2 = c0Var.f183336a;
        while (i15 < i16) {
            if (i14 == i17) {
                c0Var = c0Var.f183341f;
                c0Var.getClass();
                byte[] bArr3 = c0Var.f183336a;
                bArr2 = bArr3;
                i14 = c0Var.f183337b;
                i17 = c0Var.f183338c;
            }
            if (bArr2[i14] != bArr[i15]) {
                return false;
            }
            i14++;
            i15++;
        }
        return true;
    }

    public static final String c(w63.e eVar, long j8) throws EOFException {
        eVar.getClass();
        if (j8 > 0) {
            long j14 = j8 - 1;
            if (eVar.j(j14) == 13) {
                String strW = eVar.w(j14, d53.c.f57666b);
                eVar.skip(2L);
                return strW;
            }
        }
        String strW2 = eVar.w(j8, d53.c.f57666b);
        eVar.skip(1L);
        return strW2;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00a4 A[LOOP:0: B:8:0x001f->B:49:0x00a4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a3 A[SYNTHETIC] */
    public static final int d(w63.e eVar, w wVar, boolean z14) {
        int i14;
        int i15;
        int i16;
        c0 c0Var;
        int i17;
        eVar.getClass();
        wVar.getClass();
        c0 c0Var2 = eVar.f183348a;
        if (c0Var2 == null) {
            return z14 ? -2 : -1;
        }
        byte[] bArr = c0Var2.f183336a;
        int i18 = c0Var2.f183337b;
        int i19 = c0Var2.f183338c;
        int[] iArr = wVar.f183405c;
        c0 c0Var3 = c0Var2;
        int i24 = -1;
        int i25 = 0;
        loop0: while (true) {
            int i26 = i25 + 1;
            int i27 = iArr[i25];
            int i28 = i25 + 2;
            int i29 = iArr[i26];
            if (i29 != -1) {
                i24 = i29;
            }
            if (c0Var3 == null) {
                break;
            }
            if (i27 >= 0) {
                int i30 = i18 + 1;
                int i34 = bArr[i18] & UnsignedBytes.MAX_VALUE;
                int i35 = i28 + i27;
                while (i28 != i35) {
                    if (i34 == iArr[i28]) {
                        i14 = iArr[i28 + i27];
                        if (i30 == i19) {
                            c0Var3 = c0Var3.f183341f;
                            c0Var3.getClass();
                            int i36 = c0Var3.f183337b;
                            byte[] bArr2 = c0Var3.f183336a;
                            i15 = c0Var3.f183338c;
                            if (c0Var3 == c0Var2) {
                                i16 = i36;
                                bArr = bArr2;
                                c0Var3 = null;
                            } else {
                                i16 = i36;
                                bArr = bArr2;
                            }
                        } else {
                            i15 = i19;
                            i16 = i30;
                        }
                        if (i14 >= 0) {
                            return i14;
                        }
                        int i37 = i15;
                        i25 = -i14;
                        i18 = i16;
                        i19 = i37;
                    } else {
                        i28++;
                    }
                }
                return i24;
            }
            int i38 = (i27 * (-1)) + i28;
            while (true) {
                int i39 = i18 + 1;
                int i44 = i28 + 1;
                if ((bArr[i18] & UnsignedBytes.MAX_VALUE) == iArr[i28]) {
                    boolean z15 = i44 == i38;
                    if (i39 == i19) {
                        c0Var3.getClass();
                        c0 c0Var4 = c0Var3.f183341f;
                        c0Var4.getClass();
                        i16 = c0Var4.f183337b;
                        byte[] bArr3 = c0Var4.f183336a;
                        i17 = c0Var4.f183338c;
                        if (c0Var4 != c0Var2) {
                            c0Var = c0Var4;
                            bArr = bArr3;
                        } else {
                            if (!z15) {
                                break loop0;
                            }
                            bArr = bArr3;
                            c0Var = null;
                        }
                    } else {
                        c0Var = c0Var3;
                        i17 = i19;
                        i16 = i39;
                    }
                    if (z15) {
                        i14 = iArr[i44];
                        int i45 = i17;
                        c0Var3 = c0Var;
                        i15 = i45;
                        break;
                    }
                    i18 = i16;
                    i19 = i17;
                    c0Var3 = c0Var;
                    i28 = i44;
                }
                return i24;
            }
            if (i14 >= 0) {
                return i14;
            }
            int i310 = i15;
            i25 = -i14;
            i18 = i16;
            i19 = i310;
        }
        if (z14) {
            return -2;
        }
        return i24;
    }
}
