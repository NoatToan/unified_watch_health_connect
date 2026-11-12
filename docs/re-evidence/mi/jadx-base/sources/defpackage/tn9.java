package defpackage;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class tn9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cp2 f34868a;
    public boolean c;
    public final btk e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<rn9> f34869b = new ArrayList();
    public final int[] d = new int[5];

    public static final class b implements Serializable, Comparator<rn9> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f34870a;

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(rn9 rn9Var, rn9 rn9Var2) {
            int iCompare = Integer.compare(rn9Var2.h(), rn9Var.h());
            return iCompare == 0 ? Float.compare(Math.abs(rn9Var.i() - this.f34870a), Math.abs(rn9Var2.i() - this.f34870a)) : iCompare;
        }

        public b(float f) {
            this.f34870a = f;
        }
    }

    public static final class c implements Serializable, Comparator<rn9> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f34871a;

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(rn9 rn9Var, rn9 rn9Var2) {
            return Float.compare(Math.abs(rn9Var2.i() - this.f34871a), Math.abs(rn9Var.i() - this.f34871a));
        }

        public c(float f) {
            this.f34871a = f;
        }
    }

    public tn9(cp2 cp2Var, btk btkVar) {
        this.f34868a = cp2Var;
        this.e = btkVar;
    }

    public static float a(int[] iArr, int i) {
        return ((i - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    public static boolean h(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f = i / 7.0f;
        float f2 = f / 2.0f;
        return Math.abs(f - ((float) iArr[0])) < f2 && Math.abs(f - ((float) iArr[1])) < f2 && Math.abs((f * 3.0f) - ((float) iArr[2])) < 3.0f * f2 && Math.abs(f - ((float) iArr[3])) < f2 && Math.abs(f - ((float) iArr[4])) < f2;
    }

    public static boolean i(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f = i / 7.0f;
        float f2 = f / 1.333f;
        return Math.abs(f - ((float) iArr[0])) < f2 && Math.abs(f - ((float) iArr[1])) < f2 && Math.abs((f * 3.0f) - ((float) iArr[2])) < 3.0f * f2 && Math.abs(f - ((float) iArr[3])) < f2 && Math.abs(f - ((float) iArr[4])) < f2;
    }

    public final void b(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = 0;
        }
    }

    public final boolean c(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int[] iArrJ = j();
        int i6 = 0;
        while (i >= i6 && i2 >= i6 && this.f34868a.e(i2 - i6, i - i6)) {
            iArrJ[2] = iArrJ[2] + 1;
            i6++;
        }
        if (iArrJ[2] == 0) {
            return false;
        }
        while (i >= i6 && i2 >= i6 && !this.f34868a.e(i2 - i6, i - i6)) {
            iArrJ[1] = iArrJ[1] + 1;
            i6++;
        }
        if (iArrJ[1] == 0) {
            return false;
        }
        while (i >= i6 && i2 >= i6 && this.f34868a.e(i2 - i6, i - i6)) {
            iArrJ[0] = iArrJ[0] + 1;
            i6++;
        }
        if (iArrJ[0] == 0) {
            return false;
        }
        int iH = this.f34868a.h();
        int iK = this.f34868a.k();
        int i7 = 1;
        while (true) {
            int i8 = i + i7;
            if (i8 >= iH || (i5 = i2 + i7) >= iK || !this.f34868a.e(i5, i8)) {
                break;
            }
            iArrJ[2] = iArrJ[2] + 1;
            i7++;
        }
        while (true) {
            int i9 = i + i7;
            if (i9 >= iH || (i4 = i2 + i7) >= iK || this.f34868a.e(i4, i9)) {
                break;
            }
            iArrJ[3] = iArrJ[3] + 1;
            i7++;
        }
        if (iArrJ[3] == 0) {
            return false;
        }
        while (true) {
            int i10 = i + i7;
            if (i10 >= iH || (i3 = i2 + i7) >= iK || !this.f34868a.e(i3, i10)) {
                break;
            }
            iArrJ[4] = iArrJ[4] + 1;
            i7++;
        }
        if (iArrJ[4] == 0) {
            return false;
        }
        return i(iArrJ);
    }

    public final float d(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        cp2 cp2Var = this.f34868a;
        int iK = cp2Var.k();
        int[] iArrJ = j();
        int i8 = i;
        while (i8 >= 0 && cp2Var.e(i8, i2)) {
            iArrJ[2] = iArrJ[2] + 1;
            i8--;
        }
        if (i8 < 0) {
            return Float.NaN;
        }
        while (i8 >= 0 && !cp2Var.e(i8, i2)) {
            int i9 = iArrJ[1];
            if (i9 > i3) {
                break;
            }
            iArrJ[1] = i9 + 1;
            i8--;
        }
        if (i8 >= 0 && iArrJ[1] <= i3) {
            while (i8 >= 0 && cp2Var.e(i8, i2) && (i7 = iArrJ[0]) <= i3) {
                iArrJ[0] = i7 + 1;
                i8--;
            }
            if (iArrJ[0] > i3) {
                return Float.NaN;
            }
            int i10 = i + 1;
            while (i10 < iK && cp2Var.e(i10, i2)) {
                iArrJ[2] = iArrJ[2] + 1;
                i10++;
            }
            if (i10 == iK) {
                return Float.NaN;
            }
            while (i10 < iK && !cp2Var.e(i10, i2) && (i6 = iArrJ[3]) < i3) {
                iArrJ[3] = i6 + 1;
                i10++;
            }
            if (i10 != iK && iArrJ[3] < i3) {
                while (i10 < iK && cp2Var.e(i10, i2) && (i5 = iArrJ[4]) < i3) {
                    iArrJ[4] = i5 + 1;
                    i10++;
                }
                int i11 = iArrJ[4];
                if (i11 < i3 && Math.abs(((((iArrJ[0] + iArrJ[1]) + iArrJ[2]) + iArrJ[3]) + i11) - i4) * 5 < i4 && h(iArrJ)) {
                    return a(iArrJ, i10);
                }
            }
        }
        return Float.NaN;
    }

    public final float e(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        cp2 cp2Var = this.f34868a;
        int iH = cp2Var.h();
        int[] iArrJ = j();
        int i8 = i;
        while (i8 >= 0 && cp2Var.e(i2, i8)) {
            iArrJ[2] = iArrJ[2] + 1;
            i8--;
        }
        if (i8 < 0) {
            return Float.NaN;
        }
        while (i8 >= 0 && !cp2Var.e(i2, i8)) {
            int i9 = iArrJ[1];
            if (i9 > i3) {
                break;
            }
            iArrJ[1] = i9 + 1;
            i8--;
        }
        if (i8 >= 0 && iArrJ[1] <= i3) {
            while (i8 >= 0 && cp2Var.e(i2, i8) && (i7 = iArrJ[0]) <= i3) {
                iArrJ[0] = i7 + 1;
                i8--;
            }
            if (iArrJ[0] > i3) {
                return Float.NaN;
            }
            int i10 = i + 1;
            while (i10 < iH && cp2Var.e(i2, i10)) {
                iArrJ[2] = iArrJ[2] + 1;
                i10++;
            }
            if (i10 == iH) {
                return Float.NaN;
            }
            while (i10 < iH && !cp2Var.e(i2, i10) && (i6 = iArrJ[3]) < i3) {
                iArrJ[3] = i6 + 1;
                i10++;
            }
            if (i10 != iH && iArrJ[3] < i3) {
                while (i10 < iH && cp2Var.e(i2, i10) && (i5 = iArrJ[4]) < i3) {
                    iArrJ[4] = i5 + 1;
                    i10++;
                }
                int i11 = iArrJ[4];
                if (i11 < i3 && Math.abs(((((iArrJ[0] + iArrJ[1]) + iArrJ[2]) + iArrJ[3]) + i11) - i4) * 5 < i4 * 2 && h(iArrJ)) {
                    return a(iArrJ, i10);
                }
            }
        }
        return Float.NaN;
    }

    public final un9 f(Map<DecodeHintType, ?> map) throws NotFoundException {
        boolean z = map != null && map.containsKey(DecodeHintType.TRY_HARDER);
        int iH = this.f34868a.h();
        int iK = this.f34868a.k();
        int i = (iH * 3) / 388;
        if (i < 3 || z) {
            i = 3;
        }
        int[] iArr = new int[5];
        int i2 = i - 1;
        boolean zL = false;
        while (i2 < iH && !zL) {
            b(iArr);
            int i3 = 0;
            int i4 = 0;
            while (i3 < iK) {
                if (this.f34868a.e(i3, i2)) {
                    if ((i4 & 1) == 1) {
                        i4++;
                    }
                    iArr[i4] = iArr[i4] + 1;
                } else if ((i4 & 1) != 0) {
                    iArr[i4] = iArr[i4] + 1;
                } else if (i4 != 4) {
                    i4++;
                    iArr[i4] = iArr[i4] + 1;
                } else if (h(iArr) && k(iArr, i2, i3)) {
                    if (this.c) {
                        zL = l();
                    } else {
                        int iG = g();
                        int i5 = iArr[2];
                        if (iG > i5) {
                            i2 += (iG - i5) - 2;
                            i3 = iK - 1;
                        }
                    }
                    b(iArr);
                    i = 2;
                    i4 = 0;
                } else {
                    n(iArr);
                    i4 = 3;
                }
                i3++;
            }
            if (h(iArr) && k(iArr, i2, iK)) {
                i = iArr[0];
                if (this.c) {
                    zL = l();
                }
            }
            i2 += i;
        }
        rn9[] rn9VarArrM = m();
        atk.e(rn9VarArrM);
        return new un9(rn9VarArrM);
    }

    public final int g() {
        if (this.f34869b.size() <= 1) {
            return 0;
        }
        rn9 rn9Var = null;
        for (rn9 rn9Var2 : this.f34869b) {
            if (rn9Var2.h() >= 2) {
                if (rn9Var != null) {
                    this.c = true;
                    return ((int) (Math.abs(rn9Var.c() - rn9Var2.c()) - Math.abs(rn9Var.d() - rn9Var2.d()))) / 2;
                }
                rn9Var = rn9Var2;
            }
        }
        return 0;
    }

    public final int[] j() {
        b(this.d);
        return this.d;
    }

    public final boolean k(int[] iArr, int i, int i2) {
        int i3 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int iA = (int) a(iArr, i2);
        float fE = e(i, iA, iArr[2], i3);
        if (!Float.isNaN(fE)) {
            int i4 = (int) fE;
            float fD = d(iA, i4, iArr[2], i3);
            if (!Float.isNaN(fD) && c(i4, (int) fD)) {
                float f = i3 / 7.0f;
                for (int i5 = 0; i5 < this.f34869b.size(); i5++) {
                    rn9 rn9Var = this.f34869b.get(i5);
                    if (rn9Var.f(f, fE, fD)) {
                        this.f34869b.set(i5, rn9Var.g(fE, fD, f));
                        return true;
                    }
                }
                rn9 rn9Var2 = new rn9(fD, fE, f);
                this.f34869b.add(rn9Var2);
                btk btkVar = this.e;
                if (btkVar != null) {
                    btkVar.a(rn9Var2);
                }
                return true;
            }
        }
        return false;
    }

    public final boolean l() {
        int size = this.f34869b.size();
        float fAbs = 0.0f;
        int i = 0;
        float fI = 0.0f;
        for (rn9 rn9Var : this.f34869b) {
            if (rn9Var.h() >= 2) {
                i++;
                fI += rn9Var.i();
            }
        }
        if (i < 3) {
            return false;
        }
        float f = fI / size;
        Iterator<rn9> it = this.f34869b.iterator();
        while (it.hasNext()) {
            fAbs += Math.abs(it.next().i() - f);
        }
        return fAbs <= fI * 0.05f;
    }

    public final rn9[] m() throws NotFoundException {
        int size = this.f34869b.size();
        if (size < 3) {
            throw NotFoundException.getNotFoundInstance();
        }
        float fI = 0.0f;
        if (size > 3) {
            Iterator<rn9> it = this.f34869b.iterator();
            float f = 0.0f;
            float f2 = 0.0f;
            while (it.hasNext()) {
                float fI2 = it.next().i();
                f += fI2;
                f2 += fI2 * fI2;
            }
            float f3 = size;
            float f4 = f / f3;
            float fSqrt = (float) Math.sqrt((f2 / f3) - (f4 * f4));
            Collections.sort(this.f34869b, new c(f4));
            float fMax = Math.max(0.2f * f4, fSqrt);
            int i = 0;
            while (i < this.f34869b.size() && this.f34869b.size() > 3) {
                if (Math.abs(this.f34869b.get(i).i() - f4) > fMax) {
                    this.f34869b.remove(i);
                    i--;
                }
                i++;
            }
        }
        if (this.f34869b.size() > 3) {
            Iterator<rn9> it2 = this.f34869b.iterator();
            while (it2.hasNext()) {
                fI += it2.next().i();
            }
            Collections.sort(this.f34869b, new b(fI / this.f34869b.size()));
            List<rn9> list = this.f34869b;
            list.subList(3, list.size()).clear();
        }
        return new rn9[]{this.f34869b.get(0), this.f34869b.get(1), this.f34869b.get(2)};
    }

    public final void n(int[] iArr) {
        iArr[0] = iArr[2];
        iArr[1] = iArr[3];
        iArr[2] = iArr[4];
        iArr[3] = 1;
        iArr[4] = 0;
    }
}
