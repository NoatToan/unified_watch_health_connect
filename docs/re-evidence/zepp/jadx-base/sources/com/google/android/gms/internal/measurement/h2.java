package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class h2 {
    public static int a(byte[] bArr, int i, g2 g2Var) throws zzkh {
        int iJ = j(bArr, i, g2Var);
        int i2 = g2Var.a;
        if (i2 < 0) {
            throw zzkh.e();
        }
        if (i2 > bArr.length - iJ) {
            throw zzkh.g();
        }
        if (i2 == 0) {
            g2Var.c = zzix.zzb;
            return iJ;
        }
        g2Var.c = zzix.zzl(bArr, iJ, i2);
        return iJ + i2;
    }

    public static int b(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int c(a4 a4Var, byte[] bArr, int i, int i2, int i3, g2 g2Var) throws IOException {
        s3 s3Var = (s3) a4Var;
        Object objZze = s3Var.zze();
        int iC = s3Var.C(objZze, bArr, i, i2, i3, g2Var);
        s3Var.b(objZze);
        g2Var.c = objZze;
        return iC;
    }

    public static int d(a4 a4Var, byte[] bArr, int i, int i2, g2 g2Var) throws IOException {
        int iK = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iK = k(i3, bArr, iK, g2Var);
            i3 = g2Var.a;
        }
        int i4 = iK;
        if (i3 < 0 || i3 > i2 - i4) {
            throw zzkh.g();
        }
        Object objZze = a4Var.zze();
        int i5 = i3 + i4;
        a4Var.e(objZze, bArr, i4, i5, g2Var);
        a4Var.b(objZze);
        g2Var.c = objZze;
        return i5;
    }

    public static int e(a4<?> a4Var, int i, byte[] bArr, int i2, int i3, zzke<?> zzkeVar, g2 g2Var) throws IOException {
        int iD = d(a4Var, bArr, i2, i3, g2Var);
        zzkeVar.add(g2Var.c);
        while (iD < i3) {
            int iJ = j(bArr, iD, g2Var);
            if (i != g2Var.a) {
                break;
            }
            iD = d(a4Var, bArr, iJ, i3, g2Var);
            zzkeVar.add(g2Var.c);
        }
        return iD;
    }

    public static int f(byte[] bArr, int i, zzke<?> zzkeVar, g2 g2Var) throws IOException {
        e3 e3Var = (e3) zzkeVar;
        int iJ = j(bArr, i, g2Var);
        int i2 = g2Var.a + iJ;
        while (iJ < i2) {
            iJ = j(bArr, iJ, g2Var);
            e3Var.c(g2Var.a);
        }
        if (iJ == i2) {
            return iJ;
        }
        throw zzkh.g();
    }

    public static int g(byte[] bArr, int i, g2 g2Var) throws zzkh {
        int iJ = j(bArr, i, g2Var);
        int i2 = g2Var.a;
        if (i2 < 0) {
            throw zzkh.e();
        }
        if (i2 == 0) {
            g2Var.c = "";
            return iJ;
        }
        g2Var.c = new String(bArr, iJ, i2, zzkf.b);
        return iJ + i2;
    }

    public static int h(byte[] bArr, int i, g2 g2Var) throws zzkh {
        int iJ = j(bArr, i, g2Var);
        int i2 = g2Var.a;
        if (i2 < 0) {
            throw zzkh.e();
        }
        if (i2 == 0) {
            g2Var.c = "";
            return iJ;
        }
        g2Var.c = b5.d(bArr, iJ, i2);
        return iJ + i2;
    }

    public static int i(int i, byte[] bArr, int i2, int i3, zzmc zzmcVar, g2 g2Var) throws zzkh {
        if ((i >>> 3) == 0) {
            throw zzkh.b();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iM = m(bArr, i2, g2Var);
            zzmcVar.d(i, Long.valueOf(g2Var.b));
            return iM;
        }
        if (i4 == 1) {
            zzmcVar.d(i, Long.valueOf(n(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iJ = j(bArr, i2, g2Var);
            int i5 = g2Var.a;
            if (i5 < 0) {
                throw zzkh.e();
            }
            if (i5 > bArr.length - iJ) {
                throw zzkh.g();
            }
            if (i5 == 0) {
                zzmcVar.d(i, zzix.zzb);
            } else {
                zzmcVar.d(i, zzix.zzl(bArr, iJ, i5));
            }
            return iJ + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw zzkh.b();
            }
            zzmcVar.d(i, Integer.valueOf(b(bArr, i2)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        zzmc zzmcVarB = zzmc.b();
        int i7 = 0;
        while (i2 < i3) {
            int iJ2 = j(bArr, i2, g2Var);
            int i8 = g2Var.a;
            if (i8 == i6) {
                i7 = i8;
                i2 = iJ2;
                break;
            }
            i7 = i8;
            i2 = i(i8, bArr, iJ2, i3, zzmcVarB, g2Var);
        }
        if (i2 > i3 || i7 != i6) {
            throw zzkh.f();
        }
        zzmcVar.d(i, zzmcVarB);
        return i2;
    }

    public static int j(byte[] bArr, int i, g2 g2Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return k(b, bArr, i2, g2Var);
        }
        g2Var.a = b;
        return i2;
    }

    public static int k(int i, byte[] bArr, int i2, g2 g2Var) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            g2Var.a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & 127) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            g2Var.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            g2Var.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            g2Var.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                g2Var.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int l(int i, byte[] bArr, int i2, int i3, zzke<?> zzkeVar, g2 g2Var) {
        e3 e3Var = (e3) zzkeVar;
        int iJ = j(bArr, i2, g2Var);
        e3Var.c(g2Var.a);
        while (iJ < i3) {
            int iJ2 = j(bArr, iJ, g2Var);
            if (i != g2Var.a) {
                break;
            }
            iJ = j(bArr, iJ2, g2Var);
            e3Var.c(g2Var.a);
        }
        return iJ;
    }

    public static int m(byte[] bArr, int i, g2 g2Var) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            g2Var.b = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & 127)) << i4;
            b = b2;
            i3 = i5;
        }
        g2Var.b = j2;
        return i3;
    }

    public static long n(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }
}
