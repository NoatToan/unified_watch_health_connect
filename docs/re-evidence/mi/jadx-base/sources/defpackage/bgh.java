package defpackage;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class bgh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ed8 f4183a = new ed8();

    public static i53 a(a06 a06Var) throws NotFoundException {
        int[] iArrJ;
        if (a06Var == null || (iArrJ = a06Var.j()) == null) {
            return null;
        }
        int iP = p(iArrJ);
        int i = 0;
        int i2 = 0;
        for (int i3 : iArrJ) {
            i2 += iP - i3;
            if (i3 > 0) {
                break;
            }
        }
        r34[] r34VarArrD = a06Var.d();
        for (int i4 = 0; i2 > 0 && r34VarArrD[i4] == null; i4++) {
            i2--;
        }
        for (int length = iArrJ.length - 1; length >= 0; length--) {
            int i5 = iArrJ[length];
            i += iP - i5;
            if (i5 > 0) {
                break;
            }
        }
        for (int length2 = r34VarArrD.length - 1; i > 0 && r34VarArrD[length2] == null; length2--) {
            i--;
        }
        return a06Var.a().a(i2, i, a06Var.k());
    }

    public static void b(yz5 yz5Var, h12[][] h12VarArr) throws NotFoundException {
        h12 h12Var = h12VarArr[0][1];
        int[] iArrA = h12Var.a();
        int iJ = (yz5Var.j() * yz5Var.l()) - r(yz5Var.k());
        if (iArrA.length != 0) {
            if (iArrA[0] != iJ) {
                h12Var.b(iJ);
            }
        } else {
            if (iJ <= 0 || iJ > 928) {
                throw NotFoundException.getNotFoundInstance();
            }
            h12Var.b(iJ);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0011  */
    /* JADX WARN: Code duplicated, block: B:14:0x0017  */
    /* JADX WARN: Code duplicated, block: B:17:0x0020 A[LOOP:1: B:8:0x000a->B:17:0x0020, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x001f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0022 A[EDGE_INSN: B:24:0x0022->B:18:0x0022 BREAK  A[LOOP:1: B:8:0x000a->B:17:0x0020], SYNTHETIC] */
    public static int c(cp2 cp2Var, int i, int i2, boolean z, int i3, int i4) {
        int i5 = z ? -1 : 1;
        int i6 = i3;
        for (int i7 = 0; i7 < 2; i7++) {
            while (true) {
                if (!z) {
                    if (i6 >= i2) {
                        break;
                    }
                    if (z == cp2Var.e(i6, i4)) {
                        break;
                        break;
                    }
                    if (Math.abs(i3 - i6) > 2) {
                        return i3;
                    }
                    i6 += i5;
                } else {
                    if (i6 < i) {
                        break;
                    }
                    if (z == cp2Var.e(i6, i4)) {
                        break;
                    }
                    if (Math.abs(i3 - i6) > 2) {
                        return i3;
                    }
                    i6 += i5;
                }
            }
            i5 = -i5;
            z = !z;
        }
        return i6;
    }

    public static boolean d(int i, int i2, int i3) {
        return i2 + (-2) <= i && i <= i3 + 2;
    }

    public static int e(int[] iArr, int[] iArr2, int i) throws ChecksumException {
        if ((iArr2 == null || iArr2.length <= (i / 2) + 3) && i >= 0 && i <= 512) {
            return f4183a.a(iArr, i, iArr2);
        }
        throw ChecksumException.getChecksumInstance();
    }

    public static h12[][] f(yz5 yz5Var) {
        int iC;
        h12[][] h12VarArr = (h12[][]) Array.newInstance((Class<?>) h12.class, yz5Var.l(), yz5Var.j() + 2);
        for (h12[] h12VarArr2 : h12VarArr) {
            int i = 0;
            while (true) {
                if (i < h12VarArr2.length) {
                    h12VarArr2[i] = new h12();
                    i++;
                }
            }
        }
        int i2 = 0;
        for (zz5 zz5Var : yz5Var.o()) {
            if (zz5Var != null) {
                for (r34 r34Var : zz5Var.d()) {
                    if (r34Var != null && (iC = r34Var.c()) >= 0 && iC < h12VarArr.length) {
                        h12VarArr[iC][i2].b(r34Var.e());
                    }
                }
            }
            i2++;
        }
        return h12VarArr;
    }

    public static ts5 g(yz5 yz5Var) throws NotFoundException, ChecksumException, FormatException {
        h12[][] h12VarArrF = f(yz5Var);
        b(yz5Var, h12VarArrF);
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[yz5Var.l() * yz5Var.j()];
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < yz5Var.l(); i++) {
            int i2 = 0;
            while (i2 < yz5Var.j()) {
                int i3 = i2 + 1;
                int[] iArrA = h12VarArrF[i][i3].a();
                int iJ = (yz5Var.j() * i) + i2;
                if (iArrA.length == 0) {
                    arrayList.add(Integer.valueOf(iJ));
                } else if (iArrA.length == 1) {
                    iArr[iJ] = iArrA[0];
                } else {
                    arrayList3.add(Integer.valueOf(iJ));
                    arrayList2.add(iArrA);
                }
                i2 = i3;
            }
        }
        int size = arrayList2.size();
        int[][] iArr2 = new int[size][];
        for (int i4 = 0; i4 < size; i4++) {
            iArr2[i4] = (int[]) arrayList2.get(i4);
        }
        return h(yz5Var.k(), iArr, vfh.b(arrayList), vfh.b(arrayList3), iArr2);
    }

    public static ts5 h(int i, int[] iArr, int[] iArr2, int[] iArr3, int[][] iArr4) throws ChecksumException, FormatException {
        int length = iArr3.length;
        int[] iArr5 = new int[length];
        int i2 = 100;
        while (true) {
            int i3 = i2 - 1;
            if (i2 <= 0) {
                throw ChecksumException.getChecksumInstance();
            }
            for (int i4 = 0; i4 < length; i4++) {
                iArr[iArr3[i4]] = iArr4[i4][iArr5[i4]];
            }
            try {
                return j(iArr, i, iArr2);
            } catch (ChecksumException unused) {
                if (length == 0) {
                    throw ChecksumException.getChecksumInstance();
                }
                for (int i5 = 0; i5 < length; i5++) {
                    int i6 = iArr5[i5];
                    if (i6 < iArr4[i5].length - 1) {
                        iArr5[i5] = i6 + 1;
                        break;
                    }
                    iArr5[i5] = 0;
                    if (i5 == length - 1) {
                        throw ChecksumException.getChecksumInstance();
                    }
                }
                i2 = i3;
            }
        }
    }

    public static ts5 i(cp2 cp2Var, atk atkVar, atk atkVar2, atk atkVar3, atk atkVar4, int i, int i2) throws NotFoundException, ChecksumException, FormatException {
        int i3;
        int i4;
        int i5;
        a06 a06VarS = null;
        a06 a06VarS2 = null;
        yz5 yz5VarV = null;
        i53 i53Var = new i53(cp2Var, atkVar, atkVar2, atkVar3, atkVar4);
        for (int i6 = 0; i6 < 2; i6++) {
            if (atkVar != null) {
                a06VarS = s(cp2Var, i53Var, atkVar, true, i, i2);
            }
            if (atkVar3 != null) {
                a06VarS2 = s(cp2Var, i53Var, atkVar3, false, i, i2);
            }
            yz5VarV = v(a06VarS, a06VarS2);
            if (yz5VarV == null) {
                throw NotFoundException.getNotFoundInstance();
            }
            if (i6 != 0 || yz5VarV.m() == null || (yz5VarV.m().g() >= i53Var.g() && yz5VarV.m().e() <= i53Var.e())) {
                yz5VarV.p(i53Var);
                break;
            }
            i53Var = yz5VarV.m();
        }
        int iJ = yz5VarV.j() + 1;
        yz5VarV.q(0, a06VarS);
        yz5VarV.q(iJ, a06VarS2);
        boolean z = a06VarS != null;
        int iMin = i;
        int iMax = i2;
        for (int i7 = 1; i7 <= iJ; i7++) {
            int i8 = z ? i7 : iJ - i7;
            if (yz5VarV.n(i8) == null) {
                zz5 a06Var = (i8 == 0 || i8 == iJ) ? new a06(i53Var, i8 == 0) : new zz5(i53Var);
                yz5VarV.q(i8, a06Var);
                int i9 = -1;
                int iG = i53Var.g();
                int i10 = -1;
                while (iG <= i53Var.e()) {
                    int iT = t(yz5VarV, i8, iG, z);
                    if (iT < 0 || iT > i53Var.d()) {
                        if (i10 != i9) {
                            i5 = i10;
                        } else {
                            i3 = iG;
                            i4 = i9;
                        }
                        i10 = i10;
                        iG = i3 + 1;
                        i9 = i4;
                    } else {
                        i5 = iT;
                    }
                    int i11 = iG;
                    i4 = i9;
                    r34 r34VarK = k(cp2Var, i53Var.f(), i53Var.d(), z, i5, i11, iMin, iMax);
                    i3 = i11;
                    if (r34VarK != null) {
                        a06Var.f(i3, r34VarK);
                        iMin = Math.min(iMin, r34VarK.f());
                        iMax = Math.max(iMax, r34VarK.f());
                        i10 = i5;
                    } else {
                        i10 = i10;
                    }
                    iG = i3 + 1;
                    i9 = i4;
                }
            }
        }
        return g(yz5VarV);
    }

    public static ts5 j(int[] iArr, int i, int[] iArr2) throws ChecksumException, FormatException {
        if (iArr.length == 0) {
            throw FormatException.getFormatInstance();
        }
        int i2 = 1 << (i + 1);
        int iE = e(iArr, iArr2, i2);
        w(iArr, i2);
        ts5 ts5VarB = hs5.b(iArr, String.valueOf(i));
        ts5VarB.k(Integer.valueOf(iE));
        ts5VarB.j(Integer.valueOf(iArr2.length));
        return ts5VarB;
    }

    public static r34 k(cp2 cp2Var, int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        int i7;
        int iD;
        int iA;
        int iC = c(cp2Var, i, i2, z, i3, i4);
        int[] iArrQ = q(cp2Var, i, i2, z, iC, i4);
        if (iArrQ == null) {
            return null;
        }
        int iD2 = q8f.d(iArrQ);
        if (z) {
            i7 = iC + iD2;
        } else {
            for (int i8 = 0; i8 < iArrQ.length / 2; i8++) {
                int i9 = iArrQ[i8];
                iArrQ[i8] = iArrQ[(iArrQ.length - 1) - i8];
                iArrQ[(iArrQ.length - 1) - i8] = i9;
            }
            iC -= iD2;
            i7 = iC;
        }
        if (d(iD2, i5, i6) && (iA = vfh.a((iD = ufh.d(iArrQ)))) != -1) {
            return new r34(iC, i7, n(iD), iA);
        }
        return null;
    }

    public static f12 l(a06 a06Var, a06 a06Var2) {
        f12 f12VarI;
        f12 f12VarI2;
        if (a06Var == null || (f12VarI = a06Var.i()) == null) {
            if (a06Var2 == null) {
                return null;
            }
            return a06Var2.i();
        }
        if (a06Var2 == null || (f12VarI2 = a06Var2.i()) == null || f12VarI.a() == f12VarI2.a() || f12VarI.b() == f12VarI2.b() || f12VarI.c() == f12VarI2.c()) {
            return f12VarI;
        }
        return null;
    }

    public static int[] m(int i) {
        int[] iArr = new int[8];
        int i2 = 0;
        int i3 = 7;
        while (true) {
            int i4 = i & 1;
            if (i4 != i2) {
                i3--;
                if (i3 < 0) {
                    return iArr;
                }
                i2 = i4;
            }
            iArr[i3] = iArr[i3] + 1;
            i >>= 1;
        }
    }

    public static int n(int i) {
        return o(m(i));
    }

    public static int o(int[] iArr) {
        return ((((iArr[0] - iArr[2]) + iArr[4]) - iArr[6]) + 9) % 9;
    }

    public static int p(int[] iArr) {
        int iMax = -1;
        for (int i : iArr) {
            iMax = Math.max(iMax, i);
        }
        return iMax;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0013 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:12:0x0015  */
    /* JADX WARN: Code duplicated, block: B:28:0x0027 A[EDGE_INSN: B:28:0x0027->B:16:0x0027 BREAK  A[LOOP:0: B:7:0x000c->B:31:0x000c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0022 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x001b A[SYNTHETIC] */
    public static int[] q(cp2 cp2Var, int i, int i2, boolean z, int i3, int i4) {
        int[] iArr = new int[8];
        int i5 = z ? 1 : -1;
        int i6 = 0;
        boolean z2 = z;
        while (true) {
            if (!z) {
                if (i3 < i) {
                    break;
                }
                if (i6 < 8) {
                    break;
                    break;
                }
                if (cp2Var.e(i3, i4) == z2) {
                    iArr[i6] = iArr[i6] + 1;
                    i3 += i5;
                } else {
                    i6++;
                    z2 = !z2;
                }
            } else {
                if (i3 >= i2) {
                    break;
                }
                if (i6 < 8) {
                    break;
                }
                if (cp2Var.e(i3, i4) == z2) {
                    iArr[i6] = iArr[i6] + 1;
                    i3 += i5;
                } else {
                    i6++;
                    z2 = !z2;
                }
            }
        }
        if (i6 != 8) {
            if (z) {
                i = i2;
            }
            if (i3 != i || i6 != 7) {
                return null;
            }
        }
        return iArr;
    }

    public static int r(int i) {
        return 2 << i;
    }

    public static a06 s(cp2 cp2Var, i53 i53Var, atk atkVar, boolean z, int i, int i2) {
        a06 a06Var = new a06(i53Var, z);
        int i3 = 0;
        while (i3 < 2) {
            int i4 = i3 == 0 ? 1 : -1;
            int iC = (int) atkVar.c();
            for (int iD = (int) atkVar.d(); iD <= i53Var.e() && iD >= i53Var.g(); iD += i4) {
                r34 r34VarK = k(cp2Var, 0, cp2Var.k(), z, iC, iD, i, i2);
                if (r34VarK != null) {
                    a06Var.f(iD, r34VarK);
                    iC = z ? r34VarK.d() : r34VarK.b();
                }
            }
            i3++;
        }
        return a06Var;
    }

    public static int t(yz5 yz5Var, int i, int i2, boolean z) {
        int i3 = z ? 1 : -1;
        int i4 = i - i3;
        r34 r34VarB = u(yz5Var, i4) ? yz5Var.n(i4).b(i2) : null;
        if (r34VarB != null) {
            return z ? r34VarB.b() : r34VarB.d();
        }
        r34 r34VarC = yz5Var.n(i).c(i2);
        if (r34VarC != null) {
            return z ? r34VarC.d() : r34VarC.b();
        }
        if (u(yz5Var, i4)) {
            r34VarC = yz5Var.n(i4).c(i2);
        }
        if (r34VarC != null) {
            return z ? r34VarC.b() : r34VarC.d();
        }
        int i5 = 0;
        while (true) {
            i -= i3;
            if (!u(yz5Var, i)) {
                i53 i53VarM = yz5Var.m();
                return z ? i53VarM.f() : i53VarM.d();
            }
            for (r34 r34Var : yz5Var.n(i).d()) {
                if (r34Var != null) {
                    return (z ? r34Var.b() : r34Var.d()) + (i3 * i5 * (r34Var.b() - r34Var.d()));
                }
            }
            i5++;
        }
    }

    public static boolean u(yz5 yz5Var, int i) {
        return i >= 0 && i <= yz5Var.j() + 1;
    }

    public static yz5 v(a06 a06Var, a06 a06Var2) throws NotFoundException {
        f12 f12VarL;
        if ((a06Var == null && a06Var2 == null) || (f12VarL = l(a06Var, a06Var2)) == null) {
            return null;
        }
        return new yz5(f12VarL, i53.j(a(a06Var), a(a06Var2)));
    }

    public static void w(int[] iArr, int i) throws FormatException {
        if (iArr.length < 4) {
            throw FormatException.getFormatInstance();
        }
        int i2 = iArr[0];
        if (i2 > iArr.length) {
            throw FormatException.getFormatInstance();
        }
        if (i2 == 0) {
            if (i >= iArr.length) {
                throw FormatException.getFormatInstance();
            }
            iArr[0] = iArr.length - i;
        }
    }
}
