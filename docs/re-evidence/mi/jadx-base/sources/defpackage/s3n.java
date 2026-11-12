package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class s3n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f33247a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean a(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z) {
            return true;
        }
        for (int i2 : f33247a) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(jl8 jl8Var) throws IOException {
        return c(jl8Var, true, false);
    }

    public static boolean c(jl8 jl8Var, boolean z, boolean z2) throws IOException {
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        boolean z6;
        boolean z7;
        long length = jl8Var.getLength();
        long j = -1;
        int i2 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j2 = 4096;
        if (i2 != 0 && length <= 4096) {
            j2 = length;
        }
        int i3 = (int) j2;
        okh okhVar = new okh(64);
        boolean z8 = false;
        int i4 = 0;
        boolean z9 = false;
        while (true) {
            if (i4 < i3) {
                okhVar.L(8);
                if (jl8Var.k(okhVar.d(), z8 ? 1 : 0, 8, true)) {
                    long jF = okhVar.F();
                    int iN = okhVar.n();
                    if (jF == 1) {
                        jl8Var.i(okhVar.d(), 8, 8);
                        okhVar.O(16);
                        i = 16;
                        jF = okhVar.w();
                    } else {
                        if (jF == 0) {
                            long length2 = jl8Var.getLength();
                            if (length2 != j) {
                                jF = (length2 - jl8Var.n()) + ((long) 8);
                            }
                        }
                        i = 8;
                    }
                    long j3 = i;
                    if (jF < j3) {
                        return z8;
                    }
                    i4 += i;
                    if (iN == 1836019574) {
                        i3 += (int) jF;
                        if (i2 != 0 && i3 > length) {
                            i3 = (int) length;
                        }
                    } else if (iN == 1836019558 || iN == 1836475768) {
                        z3 = z8 ? 1 : 0;
                        z4 = true;
                        z5 = true;
                    } else {
                        int i5 = i2;
                        if ((((long) i4) + jF) - j3 >= i3) {
                            z3 = false;
                            z4 = true;
                            z5 = z3 ? 1 : 0;
                        } else {
                            int i6 = (int) (jF - j3);
                            i4 += i6;
                            if (iN != 1718909296) {
                                z6 = false;
                                if (i6 != 0) {
                                    z9 = z9;
                                    jl8Var.o(i6);
                                    z9 = z9;
                                }
                            } else {
                                if (i6 < 8) {
                                    return false;
                                }
                                okhVar.L(i6);
                                jl8Var.i(okhVar.d(), 0, i6);
                                int i7 = i6 / 4;
                                int i8 = 0;
                                while (true) {
                                    if (i8 >= i7) {
                                        z7 = z9;
                                        break;
                                    }
                                    if (i8 == 1) {
                                        okhVar.Q(4);
                                    } else if (a(okhVar.n(), z2)) {
                                        z7 = true;
                                        break;
                                    }
                                    i8++;
                                }
                                if (!z7) {
                                    return false;
                                }
                                z6 = false;
                                z9 = z7;
                            }
                            z9 = z9;
                            z8 = z6;
                            i2 = i5;
                        }
                    }
                    j = -1;
                    z9 = z9;
                }
                return (z9 || z != z5) ? z3 : z4;
            }
            z3 = z8 ? 1 : 0;
            z4 = true;
            z5 = z3 ? 1 : 0;
            if (z9) {
            }
        }
    }

    public static boolean d(jl8 jl8Var, boolean z) throws IOException {
        return c(jl8Var, false, z);
    }
}
