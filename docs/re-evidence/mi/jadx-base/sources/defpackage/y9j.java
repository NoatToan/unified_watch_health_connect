package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class y9j extends n10 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f39962k = {7, 5, 4, 3, 1};
    public static final int[] l = {4, 20, 52, 104, 204};
    public static final int[] m = {0, 348, 1388, 2948, 3988};
    public static final int[][] n = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};
    public static final int[][] o = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, 143, 7, 21, 63}, new int[]{SportReportBaseParser.ReportType.descentCount, 145, 13, 39, 117, 140, 209, 205}, new int[]{SportReportBaseParser.ReportType.divingOTU, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, SportReportBaseParser.ReportType.avgDivingDepth, 136, SportReportBaseParser.ReportType.noFlyDuration, 169, 85, 44, 132}, new int[]{185, 133, SportReportBaseParser.ReportType.avgDescentRate, 142, 4, 12, 36, 108}, new int[]{113, 128, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, 138, 203, SportReportBaseParser.ReportType.avgAscentRate, 139, 206, SportReportBaseParser.ReportType.oxygenConcentration, 166}, new int[]{76, 17, 51, 153, 37, 111, 122, 155}, new int[]{43, 129, 176, 106, 107, 110, 119, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, 177}, new int[]{109, 116, 137, 200, 178, 112, 125, 164}, new int[]{70, 210, 208, 202, SportReportBaseParser.ReportType.exitTime, 130, 179, 115}, new int[]{134, SportReportBaseParser.ReportType.minWaterTemperature, 151, 31, 93, 68, 204, SportReportBaseParser.ReportType.maxWaterTemperature}, new int[]{148, 22, 66, SportReportBaseParser.ReportType.algorithmDataSource, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, 207, 199, 175}, new int[]{103, 98, 83, 38, 114, 131, 182, 124}, new int[]{161, 61, SportReportBaseParser.ReportType.entryTime, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, SportReportBaseParser.ReportType.divingCNS, 160, 58, 174, 100, 89}};
    public static final int[][] p = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};
    public final List<aj8> g = new ArrayList(11);
    public final List<bj8> h = new ArrayList();
    public final int[] i = new int[2];
    public boolean j;

    public static boolean A(Iterable<aj8> iterable, Iterable<bj8> iterable2) {
        for (bj8 bj8Var : iterable2) {
            for (aj8 aj8Var : iterable) {
                Iterator<aj8> it = bj8Var.a().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (aj8Var.equals(it.next())) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean B(List<aj8> list) {
        for (int[] iArr : p) {
            if (list.size() <= iArr.length) {
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).b().c() == iArr[i]) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static void D(List<aj8> list, List<bj8> list2) {
        Iterator<bj8> it = list2.iterator();
        while (it.hasNext()) {
            bj8 next = it.next();
            if (next.a().size() != list.size()) {
                Iterator<aj8> it2 = next.a().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        it.remove();
                        break;
                    }
                    aj8 next2 = it2.next();
                    Iterator<aj8> it3 = list.iterator();
                    do {
                        if (!it3.hasNext()) {
                            break;
                        }
                    } while (!next2.equals(it3.next()));
                }
            }
        }
    }

    public static void F(int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length / 2; i++) {
            int i2 = iArr[i];
            int i3 = (length - i) - 1;
            iArr[i] = iArr[i3];
            iArr[i3] = i2;
        }
    }

    public static wsk u(List<aj8> list) throws NotFoundException, FormatException {
        String strD = p00.a(ap2.a(list)).d();
        atk[] atkVarArrA = list.get(0).b().a();
        atk[] atkVarArrA2 = list.get(list.size() - 1).b().a();
        return new wsk(strD, null, new atk[]{atkVarArrA[0], atkVarArrA[1], atkVarArrA2[0], atkVarArrA2[1]}, BarcodeFormat.RSS_EXPANDED);
    }

    public static int y(zo2 zo2Var, int i) {
        return zo2Var.g(i) ? zo2Var.i(zo2Var.j(i)) : zo2Var.j(zo2Var.i(i));
    }

    public static boolean z(sn9 sn9Var, boolean z, boolean z2) {
        return (sn9Var.c() == 0 && z && z2) ? false : true;
    }

    public final sn9 C(zo2 zo2Var, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        if (z) {
            int i5 = this.i[0] - 1;
            while (i5 >= 0 && !zo2Var.g(i5)) {
                i5--;
            }
            int i6 = i5 + 1;
            int[] iArr = this.i;
            i4 = iArr[0] - i6;
            i2 = iArr[1];
            i3 = i6;
        } else {
            int[] iArr2 = this.i;
            int i7 = iArr2[0];
            int iJ = zo2Var.j(iArr2[1] + 1);
            i2 = iJ;
            i3 = i7;
            i4 = iJ - this.i[1];
        }
        int[] iArrI = i();
        System.arraycopy(iArrI, 0, iArrI, 1, iArrI.length - 1);
        iArrI[0] = i4;
        try {
            return new sn9(n10.p(iArrI, n), new int[]{i3, i2}, i3, i2, i);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    public aj8 E(zo2 zo2Var, List<aj8> list, int i) throws NotFoundException {
        sn9 sn9VarC;
        yk5 yk5VarV;
        boolean z = list.size() % 2 == 0;
        if (this.j) {
            z = !z;
        }
        int iY = -1;
        boolean z2 = true;
        do {
            x(zo2Var, list, iY);
            sn9VarC = C(zo2Var, i, z);
            if (sn9VarC == null) {
                iY = y(zo2Var, this.i[0]);
            } else {
                z2 = false;
            }
        } while (z2);
        yk5 yk5VarV2 = v(zo2Var, sn9VarC, z, true);
        if (!list.isEmpty() && list.get(list.size() - 1).f()) {
            throw NotFoundException.getNotFoundInstance();
        }
        try {
            yk5VarV = v(zo2Var, sn9VarC, z, false);
        } catch (NotFoundException unused) {
            yk5VarV = null;
        }
        return new aj8(yk5VarV2, yk5VarV, sn9VarC, true);
    }

    public final void G(int i, boolean z) {
        int i2 = 0;
        boolean zC = false;
        while (i2 < this.h.size()) {
            bj8 bj8Var = this.h.get(i2);
            if (bj8Var.b() > i) {
                if (!bj8Var.c(this.g)) {
                    break;
                } else {
                    return;
                }
            } else {
                zC = bj8Var.c(this.g);
                i2++;
            }
        }
        if (zC || A(this.g, this.h)) {
            return;
        }
        this.h.add(i2, new bj8(this.g, i, z));
        D(this.g, this.h);
    }

    @Override // defpackage.mah
    public wsk b(int i, zo2 zo2Var, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        this.g.clear();
        this.j = false;
        try {
            return u(w(i, zo2Var));
        } catch (NotFoundException unused) {
            this.g.clear();
            this.j = true;
            return u(w(i, zo2Var));
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0080 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0082  */
    /* JADX WARN: Code duplicated, block: B:55:0x008e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0095  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    public final void q(int i) throws NotFoundException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int iD = q8f.d(l());
        int iD2 = q8f.d(j());
        boolean z5 = true;
        if (iD > 13) {
            z2 = true;
            z = false;
        } else if (iD < 4) {
            z = true;
            z2 = false;
        } else {
            z = false;
            z2 = false;
        }
        if (iD2 > 13) {
            z4 = true;
            z3 = false;
        } else if (iD2 < 4) {
            z3 = true;
            z4 = false;
        } else {
            z3 = false;
            z4 = false;
        }
        int i2 = (iD + iD2) - i;
        boolean z6 = (iD & 1) == 1;
        boolean z7 = (iD2 & 1) == 0;
        if (i2 != 1) {
            if (i2 == -1) {
                if (z6) {
                    if (z7) {
                        throw NotFoundException.getNotFoundInstance();
                    }
                } else {
                    if (!z7) {
                        throw NotFoundException.getNotFoundInstance();
                    }
                    z3 = true;
                }
            } else {
                if (i2 != 0) {
                    throw NotFoundException.getNotFoundInstance();
                }
                if (z6) {
                    if (!z7) {
                        throw NotFoundException.getNotFoundInstance();
                    }
                    if (iD < iD2) {
                        z4 = true;
                    } else {
                        z3 = true;
                        z2 = true;
                    }
                } else if (z7) {
                    throw NotFoundException.getNotFoundInstance();
                }
            }
            if (z5) {
                if (!z2) {
                    throw NotFoundException.getNotFoundInstance();
                }
                n10.n(l(), m());
            }
            if (z2) {
                n10.g(l(), m());
            }
            if (z3) {
                if (!z4) {
                    throw NotFoundException.getNotFoundInstance();
                }
                n10.n(j(), m());
            }
            if (z4) {
                n10.g(j(), k());
            }
        }
        if (z6) {
            if (z7) {
                throw NotFoundException.getNotFoundInstance();
            }
            z2 = true;
        } else {
            if (!z7) {
                throw NotFoundException.getNotFoundInstance();
            }
            z4 = true;
        }
        z5 = z;
        if (z5) {
            if (!z2) {
                throw NotFoundException.getNotFoundInstance();
            }
            n10.n(l(), m());
        }
        if (z2) {
            n10.g(l(), m());
        }
        if (z3) {
            if (!z4) {
                throw NotFoundException.getNotFoundInstance();
            }
            n10.n(j(), m());
        }
        if (z4) {
            n10.g(j(), k());
        }
    }

    public final boolean r() {
        aj8 aj8Var = this.g.get(0);
        yk5 yk5VarC = aj8Var.c();
        yk5 yk5VarD = aj8Var.d();
        if (yk5VarD == null) {
            return false;
        }
        int iA = yk5VarD.a();
        int i = 2;
        for (int i2 = 1; i2 < this.g.size(); i2++) {
            aj8 aj8Var2 = this.g.get(i2);
            iA += aj8Var2.c().a();
            int i3 = i + 1;
            yk5 yk5VarD2 = aj8Var2.d();
            if (yk5VarD2 != null) {
                iA += yk5VarD2.a();
                i += 2;
            } else {
                i = i3;
            }
        }
        return ((i + (-4)) * 211) + (iA % 211) == yk5VarC.b();
    }

    @Override // defpackage.mah, defpackage.sgj
    public void reset() {
        this.g.clear();
        this.h.clear();
    }

    public final List<aj8> s(List<bj8> list, int i) throws NotFoundException {
        while (i < this.h.size()) {
            bj8 bj8Var = this.h.get(i);
            this.g.clear();
            Iterator<bj8> it = list.iterator();
            while (it.hasNext()) {
                this.g.addAll(it.next().a());
            }
            this.g.addAll(bj8Var.a());
            if (B(this.g)) {
                if (r()) {
                    return this.g;
                }
                ArrayList arrayList = new ArrayList(list);
                arrayList.add(bj8Var);
                try {
                    return s(arrayList, i + 1);
                } catch (NotFoundException unused) {
                    continue;
                }
            }
            i++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public final List<aj8> t(boolean z) {
        List<aj8> listS = null;
        if (this.h.size() > 25) {
            this.h.clear();
            return null;
        }
        this.g.clear();
        if (z) {
            Collections.reverse(this.h);
        }
        try {
            listS = s(new ArrayList(), 0);
        } catch (NotFoundException unused) {
        }
        if (z) {
            Collections.reverse(this.h);
        }
        return listS;
    }

    public yk5 v(zo2 zo2Var, sn9 sn9Var, boolean z, boolean z2) throws NotFoundException {
        int[] iArrH = h();
        for (int i = 0; i < iArrH.length; i++) {
            iArrH[i] = 0;
        }
        if (z2) {
            mah.f(zo2Var, sn9Var.b()[0], iArrH);
        } else {
            mah.e(zo2Var, sn9Var.b()[1], iArrH);
            int i2 = 0;
            for (int length = iArrH.length - 1; i2 < length; length--) {
                int i3 = iArrH[i2];
                iArrH[i2] = iArrH[length];
                iArrH[length] = i3;
                i2++;
            }
        }
        float fD = q8f.d(iArrH) / 17.0f;
        float f = (sn9Var.b()[1] - sn9Var.b()[0]) / 15.0f;
        if (Math.abs(fD - f) / f > 0.3f) {
            throw NotFoundException.getNotFoundInstance();
        }
        int[] iArrL = l();
        int[] iArrJ = j();
        float[] fArrM = m();
        float[] fArrK = k();
        for (int i4 = 0; i4 < iArrH.length; i4++) {
            float f2 = (iArrH[i4] * 1.0f) / fD;
            int i5 = (int) (0.5f + f2);
            if (i5 <= 0) {
                if (f2 < 0.3f) {
                    throw NotFoundException.getNotFoundInstance();
                }
                i5 = 1;
            } else if (i5 > 8) {
                if (f2 > 8.7f) {
                    throw NotFoundException.getNotFoundInstance();
                }
                i5 = 8;
            }
            int i6 = i4 / 2;
            if ((i4 & 1) == 0) {
                iArrL[i6] = i5;
                fArrM[i6] = f2 - i5;
            } else {
                iArrJ[i6] = i5;
                fArrK[i6] = f2 - i5;
            }
        }
        q(17);
        int iC = (((sn9Var.c() * 4) + (z ? 0 : 2)) + (!z2 ? 1 : 0)) - 1;
        int i7 = 0;
        int i8 = 0;
        for (int length2 = iArrL.length - 1; length2 >= 0; length2--) {
            if (z(sn9Var, z, z2)) {
                i7 += iArrL[length2] * o[iC][length2 * 2];
            }
            i8 += iArrL[length2];
        }
        int i9 = 0;
        for (int length3 = iArrJ.length - 1; length3 >= 0; length3--) {
            if (z(sn9Var, z, z2)) {
                i9 += iArrJ[length3] * o[iC][(length3 * 2) + 1];
            }
        }
        int i10 = i7 + i9;
        if ((i8 & 1) != 0 || i8 > 13 || i8 < 4) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i11 = (13 - i8) / 2;
        int i12 = f39962k[i11];
        return new yk5((z9j.b(iArrL, i12, true) * l[i11]) + z9j.b(iArrJ, 9 - i12, false) + m[i11], i10);
    }

    public List<aj8> w(int i, zo2 zo2Var) throws NotFoundException {
        boolean z = false;
        while (!z) {
            try {
                List<aj8> list = this.g;
                list.add(E(zo2Var, list, i));
            } catch (NotFoundException e) {
                if (this.g.isEmpty()) {
                    throw e;
                }
                z = true;
            }
        }
        if (r()) {
            return this.g;
        }
        boolean z2 = !this.h.isEmpty();
        G(i, false);
        if (z2) {
            List<aj8> listT = t(false);
            if (listT != null) {
                return listT;
            }
            List<aj8> listT2 = t(true);
            if (listT2 != null) {
                return listT2;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public final void x(zo2 zo2Var, List<aj8> list, int i) throws NotFoundException {
        int[] iArrI = i();
        iArrI[0] = 0;
        iArrI[1] = 0;
        iArrI[2] = 0;
        iArrI[3] = 0;
        int iK = zo2Var.k();
        if (i < 0) {
            i = list.isEmpty() ? 0 : list.get(list.size() - 1).b().b()[1];
        }
        boolean z = list.size() % 2 != 0;
        if (this.j) {
            z = !z;
        }
        boolean z2 = false;
        while (i < iK) {
            z2 = !zo2Var.g(i);
            if (!z2) {
                break;
            } else {
                i++;
            }
        }
        int i2 = 0;
        boolean z3 = z2;
        int i3 = i;
        while (i < iK) {
            if (zo2Var.g(i) != z3) {
                iArrI[i2] = iArrI[i2] + 1;
            } else {
                if (i2 == 3) {
                    if (z) {
                        F(iArrI);
                    }
                    if (n10.o(iArrI)) {
                        int[] iArr = this.i;
                        iArr[0] = i3;
                        iArr[1] = i;
                        return;
                    }
                    if (z) {
                        F(iArrI);
                    }
                    i3 += iArrI[0] + iArrI[1];
                    iArrI[0] = iArrI[2];
                    iArrI[1] = iArrI[3];
                    iArrI[2] = 0;
                    iArrI[3] = 0;
                    i2--;
                } else {
                    i2++;
                }
                iArrI[i2] = 1;
                z3 = !z3;
            }
            i++;
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
