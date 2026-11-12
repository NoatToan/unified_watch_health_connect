package com.google.zxing.pdf417.decoder;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.pdf417.PDF417Common;
import com.google.zxing.pdf417.decoder.ec.ErrorCorrection;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Formatter;

/* JADX INFO: loaded from: classes4.dex */
public final class PDF417ScanningDecoder {
    private static final int a = 2;
    private static final int b = 3;
    private static final int c = 512;
    private static final ErrorCorrection d = new ErrorCorrection();

    private PDF417ScanningDecoder() {
    }

    private static c a(h hVar) throws NotFoundException {
        int[] iArrJ;
        if (hVar == null || (iArrJ = hVar.j()) == null) {
            return null;
        }
        int iO = o(iArrJ);
        int i = 0;
        int i2 = 0;
        for (int i3 : iArrJ) {
            i2 += iO - i3;
            if (i3 > 0) {
                break;
            }
        }
        d[] dVarArrD = hVar.d();
        for (int i4 = 0; i2 > 0 && dVarArrD[i4] == null; i4++) {
            i2--;
        }
        for (int length = iArrJ.length - 1; length >= 0; length--) {
            i += iO - iArrJ[length];
            if (iArrJ[length] > 0) {
                break;
            }
        }
        for (int length2 = dVarArrD.length - 1; i > 0 && dVarArrD[length2] == null; length2--) {
            i--;
        }
        return hVar.a().a(i2, i, hVar.k());
    }

    private static void b(f fVar, b[][] bVarArr) throws NotFoundException {
        b bVar = bVarArr[0][1];
        int[] iArrB = bVar.b();
        int iJ = (fVar.j() * fVar.l()) - q(fVar.k());
        if (iArrB.length != 0) {
            if (iArrB[0] != iJ) {
                bVar.c(iJ);
            }
        } else {
            if (iJ <= 0 || iJ > 928) {
                throw NotFoundException.getNotFoundInstance();
            }
            bVar.c(iJ);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0011  */
    /* JADX WARN: Code duplicated, block: B:14:0x0017  */
    /* JADX WARN: Code duplicated, block: B:17:0x0020 A[LOOP:1: B:8:0x000a->B:17:0x0020, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x001f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0022 A[EDGE_INSN: B:24:0x0022->B:18:0x0022 BREAK  A[LOOP:1: B:8:0x000a->B:17:0x0020], SYNTHETIC] */
    private static int c(BitMatrix bitMatrix, int i, int i2, boolean z, int i3, int i4) {
        int i5 = z ? -1 : 1;
        int i6 = i3;
        for (int i7 = 0; i7 < 2; i7++) {
            while (true) {
                if (!z) {
                    if (i6 >= i2) {
                        break;
                    }
                    if (z == bitMatrix.get(i6, i4)) {
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
                    if (z == bitMatrix.get(i6, i4)) {
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

    private static boolean d(int i, int i2, int i3) {
        return i2 + (-2) <= i && i <= i3 + 2;
    }

    public static DecoderResult decode(BitMatrix bitMatrix, ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4, int i, int i2) throws NotFoundException, ChecksumException, FormatException {
        int i3;
        int i4;
        h hVarR = null;
        h hVarR2 = null;
        f fVarU = null;
        c cVar = new c(bitMatrix, resultPoint, resultPoint2, resultPoint3, resultPoint4);
        for (int i5 = 0; i5 < 2; i5++) {
            if (resultPoint != null) {
                hVarR = r(bitMatrix, cVar, resultPoint, true, i, i2);
            }
            if (resultPoint3 != null) {
                hVarR2 = r(bitMatrix, cVar, resultPoint3, false, i, i2);
            }
            fVarU = u(hVarR, hVarR2);
            if (fVarU == null) {
                throw NotFoundException.getNotFoundInstance();
            }
            if (i5 != 0 || fVarU.m() == null || (fVarU.m().g() >= cVar.g() && fVarU.m().e() <= cVar.e())) {
                fVarU.p(cVar);
                break;
            }
            cVar = fVarU.m();
        }
        int iJ = fVarU.j() + 1;
        fVarU.q(0, hVarR);
        fVarU.q(iJ, hVarR2);
        boolean z = hVarR != null;
        int iMin = i;
        int iMax = i2;
        for (int i6 = 1; i6 <= iJ; i6++) {
            int i7 = z ? i6 : iJ - i6;
            if (fVarU.n(i7) == null) {
                g hVar = (i7 == 0 || i7 == iJ) ? new h(cVar, i7 == 0) : new g(cVar);
                fVarU.q(i7, hVar);
                int i8 = -1;
                int iG = cVar.g();
                int i9 = -1;
                while (iG <= cVar.e()) {
                    int iS = s(fVarU, i7, iG, z);
                    if (iS < 0 || iS > cVar.d()) {
                        if (i9 != i8) {
                            i4 = i9;
                        } else {
                            i3 = iG;
                        }
                        i9 = i9;
                        iG = i3 + 1;
                        i8 = -1;
                    } else {
                        i4 = iS;
                    }
                    int i10 = iG;
                    d dVarJ = j(bitMatrix, cVar.f(), cVar.d(), z, i4, i10, iMin, iMax);
                    i3 = i10;
                    if (dVarJ != null) {
                        hVar.f(i3, dVarJ);
                        iMin = Math.min(iMin, dVarJ.f());
                        iMax = Math.max(iMax, dVarJ.f());
                        i9 = i4;
                    } else {
                        i9 = i9;
                    }
                    iG = i3 + 1;
                    i8 = -1;
                }
            }
        }
        return g(fVarU);
    }

    private static int e(int[] iArr, int[] iArr2, int i) throws ChecksumException {
        if ((iArr2 == null || iArr2.length <= (i / 2) + 3) && i >= 0 && i <= 512) {
            return d.decode(iArr, i, iArr2);
        }
        throw ChecksumException.getChecksumInstance();
    }

    private static b[][] f(f fVar) {
        int iC;
        b[][] bVarArr = (b[][]) Array.newInstance((Class<?>) b.class, fVar.l(), fVar.j() + 2);
        for (int i = 0; i < bVarArr.length; i++) {
            for (int i2 = 0; i2 < bVarArr[i].length; i2++) {
                bVarArr[i][i2] = new b();
            }
        }
        int i3 = 0;
        for (g gVar : fVar.o()) {
            if (gVar != null) {
                for (d dVar : gVar.d()) {
                    if (dVar != null && (iC = dVar.c()) >= 0 && iC < bVarArr.length) {
                        bVarArr[iC][i3].c(dVar.e());
                    }
                }
            }
            i3++;
        }
        return bVarArr;
    }

    private static DecoderResult g(f fVar) throws NotFoundException, ChecksumException, FormatException {
        b[][] bVarArrF = f(fVar);
        b(fVar, bVarArrF);
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[fVar.l() * fVar.j()];
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < fVar.l(); i++) {
            int i2 = 0;
            while (i2 < fVar.j()) {
                int i3 = i2 + 1;
                int[] iArrB = bVarArrF[i][i3].b();
                int iJ = (fVar.j() * i) + i2;
                if (iArrB.length == 0) {
                    arrayList.add(Integer.valueOf(iJ));
                } else if (iArrB.length == 1) {
                    iArr[iJ] = iArrB[0];
                } else {
                    arrayList3.add(Integer.valueOf(iJ));
                    arrayList2.add(iArrB);
                }
                i2 = i3;
            }
        }
        int size = arrayList2.size();
        int[][] iArr2 = new int[size][];
        for (int i4 = 0; i4 < size; i4++) {
            iArr2[i4] = (int[]) arrayList2.get(i4);
        }
        return h(fVar.k(), iArr, PDF417Common.toIntArray(arrayList), PDF417Common.toIntArray(arrayList3), iArr2);
    }

    private static DecoderResult h(int i, int[] iArr, int[] iArr2, int[] iArr3, int[][] iArr4) throws ChecksumException, FormatException {
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
                return i(iArr, i, iArr2);
            } catch (ChecksumException unused) {
                if (length == 0) {
                    throw ChecksumException.getChecksumInstance();
                }
                for (int i5 = 0; i5 < length; i5++) {
                    if (iArr5[i5] < iArr4[i5].length - 1) {
                        iArr5[i5] = iArr5[i5] + 1;
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

    private static DecoderResult i(int[] iArr, int i, int[] iArr2) throws ChecksumException, FormatException {
        if (iArr.length == 0) {
            throw FormatException.getFormatInstance();
        }
        int i2 = 1 << (i + 1);
        int iE = e(iArr, iArr2, i2);
        v(iArr, i2);
        DecoderResult decoderResultB = e.b(iArr, String.valueOf(i));
        decoderResultB.setErrorsCorrected(Integer.valueOf(iE));
        decoderResultB.setErasures(Integer.valueOf(iArr2.length));
        return decoderResultB;
    }

    private static d j(BitMatrix bitMatrix, int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        int i7;
        int iD;
        int codeword;
        int iC = c(bitMatrix, i, i2, z, i3, i4);
        int[] iArrP = p(bitMatrix, i, i2, z, iC, i4);
        if (iArrP == null) {
            return null;
        }
        int iSum = MathUtils.sum(iArrP);
        if (z) {
            i7 = iC + iSum;
        } else {
            for (int i8 = 0; i8 < iArrP.length / 2; i8++) {
                int i9 = iArrP[i8];
                iArrP[i8] = iArrP[(iArrP.length - 1) - i8];
                iArrP[(iArrP.length - 1) - i8] = i9;
            }
            iC -= iSum;
            i7 = iC;
        }
        if (d(iSum, i5, i6) && (codeword = PDF417Common.getCodeword((iD = i.d(iArrP)))) != -1) {
            return new d(iC, i7, m(iD), codeword);
        }
        return null;
    }

    private static a k(h hVar, h hVar2) {
        a aVarI;
        a aVarI2;
        if (hVar == null || (aVarI = hVar.i()) == null) {
            if (hVar2 == null) {
                return null;
            }
            return hVar2.i();
        }
        if (hVar2 == null || (aVarI2 = hVar2.i()) == null || aVarI.a() == aVarI2.a() || aVarI.b() == aVarI2.b() || aVarI.c() == aVarI2.c()) {
            return aVarI;
        }
        return null;
    }

    private static int[] l(int i) {
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

    private static int m(int i) {
        return n(l(i));
    }

    private static int n(int[] iArr) {
        return ((((iArr[0] - iArr[2]) + iArr[4]) - iArr[6]) + 9) % 9;
    }

    private static int o(int[] iArr) {
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
    private static int[] p(BitMatrix bitMatrix, int i, int i2, boolean z, int i3, int i4) {
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
                if (bitMatrix.get(i3, i4) == z2) {
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
                if (bitMatrix.get(i3, i4) == z2) {
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

    private static int q(int i) {
        return 2 << i;
    }

    private static h r(BitMatrix bitMatrix, c cVar, ResultPoint resultPoint, boolean z, int i, int i2) {
        h hVar = new h(cVar, z);
        int i3 = 0;
        while (i3 < 2) {
            int i4 = i3 == 0 ? 1 : -1;
            int x = (int) resultPoint.getX();
            for (int y = (int) resultPoint.getY(); y <= cVar.e() && y >= cVar.g(); y += i4) {
                d dVarJ = j(bitMatrix, 0, bitMatrix.getWidth(), z, x, y, i, i2);
                if (dVarJ != null) {
                    hVar.f(y, dVarJ);
                    x = z ? dVarJ.d() : dVarJ.b();
                }
            }
            i3++;
        }
        return hVar;
    }

    private static int s(f fVar, int i, int i2, boolean z) {
        int i3 = z ? 1 : -1;
        int i4 = i - i3;
        d dVarB = t(fVar, i4) ? fVar.n(i4).b(i2) : null;
        if (dVarB != null) {
            return z ? dVarB.b() : dVarB.d();
        }
        d dVarC = fVar.n(i).c(i2);
        if (dVarC != null) {
            return z ? dVarC.d() : dVarC.b();
        }
        if (t(fVar, i4)) {
            dVarC = fVar.n(i4).c(i2);
        }
        if (dVarC != null) {
            return z ? dVarC.b() : dVarC.d();
        }
        int i5 = 0;
        while (true) {
            i -= i3;
            if (!t(fVar, i)) {
                c cVarM = fVar.m();
                return z ? cVarM.f() : cVarM.d();
            }
            for (d dVar : fVar.n(i).d()) {
                if (dVar != null) {
                    return (z ? dVar.b() : dVar.d()) + (i3 * i5 * (dVar.b() - dVar.d()));
                }
            }
            i5++;
        }
    }

    private static boolean t(f fVar, int i) {
        return i >= 0 && i <= fVar.j() + 1;
    }

    public static String toString(b[][] bVarArr) {
        Formatter formatter = new Formatter();
        for (int i = 0; i < bVarArr.length; i++) {
            try {
                formatter.format("Row %2d: ", Integer.valueOf(i));
                for (int i2 = 0; i2 < bVarArr[i].length; i2++) {
                    b bVar = bVarArr[i][i2];
                    if (bVar.b().length == 0) {
                        formatter.format("        ", null);
                    } else {
                        formatter.format("%4d(%2d)", Integer.valueOf(bVar.b()[0]), bVar.a(bVar.b()[0]));
                    }
                }
                formatter.format("%n", new Object[0]);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        formatter.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
        String string = formatter.toString();
        formatter.close();
        return string;
    }

    private static f u(h hVar, h hVar2) throws NotFoundException {
        a aVarK;
        if ((hVar == null && hVar2 == null) || (aVarK = k(hVar, hVar2)) == null) {
            return null;
        }
        return new f(aVarK, c.j(a(hVar), a(hVar2)));
    }

    private static void v(int[] iArr, int i) throws FormatException {
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
