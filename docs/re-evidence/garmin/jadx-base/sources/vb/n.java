package vb;

import bb.k0;
import com.google.android.exoplayer2.extractor.mp4.Atom;
import com.google.android.exoplayer2.extractor.mp4.Sniffer;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f176790a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, Atom.TYPE_avc1, Atom.TYPE_hvc1, Atom.TYPE_hev1, Atom.TYPE_av01, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, Sniffer.BRAND_QUICKTIME, 1297305174, 1684175153, 1769172332, 1885955686};

    private n() {
    }

    public static boolean a(int i14, boolean z14) {
        if ((i14 >>> 8) == 3368816) {
            return true;
        }
        if (i14 == 1751476579 && z14) {
            return true;
        }
        for (int i15 = 0; i15 < 29; i15++) {
            if (f176790a[i15] == i14) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0077  */
    /* JADX WARN: Code duplicated, block: B:78:0x0129  */
    /* JADX WARN: Code duplicated, block: B:80:0x012c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0130 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x0132  */
    /* JADX WARN: Code duplicated, block: B:85:0x0135  */
    /* JADX WARN: Code duplicated, block: B:87:0x0138 A[RETURN] */
    public static k0 b(bb.o oVar, boolean z14, boolean z15) {
        k0 k0Var;
        int i14;
        int i15;
        int i16;
        int[] iArr;
        long length = oVar.getLength();
        long j8 = -1;
        long j14 = 4096;
        if (length != -1 && length <= 4096) {
            j14 = length;
        }
        int i17 = (int) j14;
        fa.r rVar = new fa.r(64);
        int i18 = 0;
        int i19 = 0;
        boolean z16 = false;
        while (true) {
            if (i19 < i17) {
                rVar.D(8);
                boolean z17 = true;
                if (oVar.peekFully(rVar.f70054a, i18, 8, true)) {
                    long jW = rVar.w();
                    int iG = rVar.g();
                    if (jW == 1) {
                        j8 = j8;
                        oVar.peekFully(rVar.f70054a, 8, 8);
                        i15 = 16;
                        rVar.F(16);
                        jW = rVar.o();
                        i19 = i19;
                    } else {
                        j8 = j8;
                        if (jW == 0) {
                            long length2 = oVar.getLength();
                            if (length2 != j8) {
                                jW = (length2 - oVar.getPeekPosition()) + ((long) 8);
                            }
                        }
                        i15 = 8;
                    }
                    long j15 = jW;
                    long j16 = i15;
                    if (j15 < j16) {
                        return new a(iG, j15, i15);
                    }
                    int i24 = i19 + i15;
                    k0Var = null;
                    if (iG == 1836019574) {
                        i17 += (int) j15;
                        if (length != -1 && i17 > length) {
                            i17 = (int) length;
                        }
                        i19 = i24;
                        i18 = 0;
                    } else if (iG == 1836019558 || iG == 1836475768) {
                        i14 = 1;
                    } else {
                        if (iG == 1835295092) {
                            z16 = true;
                        }
                        long j17 = length;
                        if ((((long) i24) + j15) - j16 >= i17) {
                            i14 = 0;
                        } else {
                            int i25 = (int) (j15 - j16);
                            i19 = i24 + i25;
                            if (iG != 1718909296) {
                                i16 = 0;
                                if (i25 != 0) {
                                    oVar.advancePeekPosition(i25);
                                }
                            } else {
                                if (i25 < 8) {
                                    return new a(iG, i25, 8);
                                }
                                rVar.D(i25);
                                i16 = 0;
                                oVar.peekFully(rVar.f70054a, 0, i25);
                                int iG2 = rVar.g();
                                if (a(iG2, z15)) {
                                    z16 = true;
                                }
                                rVar.H(4);
                                int iA = rVar.a() / 4;
                                if (!z16 && iA > 0) {
                                    iArr = new int[iA];
                                    int i26 = 0;
                                    while (true) {
                                        if (i26 >= iA) {
                                            z17 = z16;
                                            break;
                                        }
                                        int iG3 = rVar.g();
                                        iArr[i26] = iG3;
                                        if (a(iG3, z15)) {
                                            break;
                                        }
                                        i26++;
                                    }
                                } else {
                                    z17 = z16;
                                    iArr = null;
                                }
                                if (!z17) {
                                    return new s(iG2, iArr);
                                }
                                z16 = z17;
                            }
                            i18 = i16;
                            length = j17;
                        }
                    }
                }
                if (!z16) {
                    return k.f176779a;
                }
                if (z14 != i14) {
                    return i14 != 0 ? g.f176745a : g.f176746b;
                }
                return k0Var;
            }
            k0Var = null;
            i14 = i18;
            if (!z16) {
                return k.f176779a;
            }
            if (z14 != i14) {
                if (i14 != 0) {
                }
            }
            return k0Var;
        }
    }
}
