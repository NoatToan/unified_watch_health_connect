package com.huawei.hms.scankit.p;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public class h3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f16110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f16111b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f16112c = new int[5];
    private final v6 d;

    public h3(s sVar, v6 v6Var) {
        this.f16110a = sVar;
        this.d = v6Var;
    }

    private static float a(int[] iArr, int i) {
        return ((i - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    protected static boolean c(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 6) {
            return false;
        }
        float f = i / 6.0f;
        float f2 = f / 1.0f;
        if (Math.abs(f - iArr[0]) < f2 && Math.abs(f - iArr[1]) < f2) {
            if (Math.abs((f * 2.0f) - iArr[2]) < 2.0f * f2 && Math.abs(f - iArr[3]) < f2 && Math.abs(f - iArr[4]) < f2) {
                return true;
            }
        }
        return false;
    }

    private void d(int[] iArr) {
        iArr[0] = iArr[2];
        iArr[1] = iArr[3];
        iArr[2] = iArr[4];
        iArr[3] = 1;
        iArr[4] = 0;
    }

    private float b(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        s sVar = this.f16110a;
        int iB = sVar.b();
        int[] iArrA = a();
        int i8 = i;
        while (i8 >= 0 && sVar.b(i2, i8)) {
            iArrA[2] = iArrA[2] + 1;
            i8--;
        }
        if (i8 < 0) {
            return Float.NaN;
        }
        while (i8 >= 0 && !sVar.b(i2, i8)) {
            int i9 = iArrA[1];
            if (i9 > i3) {
                break;
            }
            iArrA[1] = i9 + 1;
            i8--;
        }
        if (i8 >= 0 && iArrA[1] <= i3) {
            while (i8 >= 0 && sVar.b(i2, i8) && (i7 = iArrA[0]) <= i3) {
                iArrA[0] = i7 + 1;
                i8--;
            }
            if (iArrA[0] > i3) {
                return Float.NaN;
            }
            int i10 = i + 1;
            while (i10 < iB && sVar.b(i2, i10)) {
                iArrA[2] = iArrA[2] + 1;
                i10++;
            }
            if (i10 == iB) {
                return Float.NaN;
            }
            while (i10 < iB && !sVar.b(i2, i10) && (i6 = iArrA[3]) < i3) {
                iArrA[3] = i6 + 1;
                i10++;
            }
            if (i10 != iB && iArrA[3] < i3) {
                while (i10 < iB && sVar.b(i2, i10) && (i5 = iArrA[4]) < i3) {
                    iArrA[4] = i5 + 1;
                    i10++;
                }
                int i11 = iArrA[4];
                if (i11 >= i3) {
                    return Float.NaN;
                }
                if (Math.abs(((((iArrA[0] + iArrA[1]) + iArrA[2]) + iArrA[3]) + i11) - i4) * 5 < i4 * 2 && b(iArrA)) {
                    return a(iArrA, i10);
                }
            }
        }
        return Float.NaN;
    }

    private void a(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = 0;
        }
    }

    protected static boolean b(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 6) {
            return false;
        }
        float f = i / 6.0f;
        float f2 = f / 1.5f;
        if (Math.abs(f - iArr[0]) < f2 && Math.abs(f - iArr[1]) < f2) {
            if (Math.abs((f * 2.0f) - iArr[2]) < 2.0f * f2 && Math.abs(f - iArr[3]) < f2 && Math.abs(f - iArr[4]) < f2) {
                return true;
            }
        }
        return false;
    }

    private boolean a(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int[] iArrA = a();
        int i6 = 0;
        while (i >= i6 && i2 >= i6 && this.f16110a.b(i2 - i6, i - i6)) {
            iArrA[2] = iArrA[2] + 1;
            i6++;
        }
        if (iArrA[2] == 0) {
            return false;
        }
        while (i >= i6 && i2 >= i6 && !this.f16110a.b(i2 - i6, i - i6)) {
            iArrA[1] = iArrA[1] + 1;
            i6++;
        }
        if (iArrA[1] == 0) {
            return false;
        }
        while (i >= i6 && i2 >= i6 && this.f16110a.b(i2 - i6, i - i6)) {
            iArrA[0] = iArrA[0] + 1;
            i6++;
        }
        if (iArrA[0] == 0) {
            return false;
        }
        int iB = this.f16110a.b();
        int iD = this.f16110a.d();
        int i7 = 1;
        while (true) {
            int i8 = i + i7;
            if (i8 >= iB || (i5 = i2 + i7) >= iD || !this.f16110a.b(i5, i8)) {
                break;
            }
            iArrA[2] = iArrA[2] + 1;
            i7++;
        }
        while (true) {
            int i9 = i + i7;
            if (i9 >= iB || (i4 = i2 + i7) >= iD || this.f16110a.b(i4, i9)) {
                break;
            }
            iArrA[3] = iArrA[3] + 1;
            i7++;
        }
        if (iArrA[3] == 0) {
            return false;
        }
        while (true) {
            int i10 = i + i7;
            if (i10 >= iB || (i3 = i2 + i7) >= iD || !this.f16110a.b(i3, i10)) {
                break;
            }
            iArrA[4] = iArrA[4] + 1;
            i7++;
        }
        if (iArrA[4] == 0) {
            return false;
        }
        return c(iArrA);
    }

    static final class d implements Comparator, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f16113a;

        private d(float f) {
            this.f16113a = f;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(g3 g3Var, g3 g3Var2) {
            return Float.compare(Math.abs(g3Var.e() - this.f16113a), Math.abs(g3Var2.e() - this.f16113a));
        }
    }

    static final class b implements Comparator, Serializable {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(g3 g3Var, g3 g3Var2) {
            return Float.compare(g3Var2.e(), g3Var.e());
        }

        private b() {
        }
    }

    static final class c implements Comparator, Serializable {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(g3 g3Var, g3 g3Var2) {
            return Integer.compare(g3Var2.a(), g3Var.a());
        }

        private c() {
        }
    }

    private float a(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        s sVar = this.f16110a;
        int iD = sVar.d();
        int[] iArrA = a();
        int i8 = i;
        while (i8 >= 0 && sVar.b(i8, i2)) {
            iArrA[2] = iArrA[2] + 1;
            i8--;
        }
        if (i8 < 0) {
            return Float.NaN;
        }
        while (i8 >= 0 && !sVar.b(i8, i2)) {
            int i9 = iArrA[1];
            if (i9 > i3) {
                break;
            }
            iArrA[1] = i9 + 1;
            i8--;
        }
        if (i8 >= 0 && iArrA[1] <= i3) {
            while (i8 >= 0 && sVar.b(i8, i2) && (i7 = iArrA[0]) <= i3) {
                iArrA[0] = i7 + 1;
                i8--;
            }
            if (iArrA[0] > i3) {
                return Float.NaN;
            }
            int i10 = i + 1;
            while (i10 < iD && sVar.b(i10, i2)) {
                iArrA[2] = iArrA[2] + 1;
                i10++;
            }
            if (i10 == iD) {
                return Float.NaN;
            }
            while (i10 < iD && !sVar.b(i10, i2) && (i6 = iArrA[3]) < i3) {
                iArrA[3] = i6 + 1;
                i10++;
            }
            if (i10 != iD && iArrA[3] < i3) {
                while (i10 < iD && sVar.b(i10, i2) && (i5 = iArrA[4]) < i3) {
                    iArrA[4] = i5 + 1;
                    i10++;
                }
                int i11 = iArrA[4];
                if (i11 >= i3) {
                    return Float.NaN;
                }
                if (Math.abs(((((iArrA[0] + iArrA[1]) + iArrA[2]) + iArrA[3]) + i11) - i4) * 5 < i4 && b(iArrA)) {
                    return a(iArrA, i10);
                }
            }
        }
        return Float.NaN;
    }

    private g3[] b() throws com.huawei.hms.scankit.p.a {
        int i = 0;
        while (i < this.f16111b.size()) {
            g3 g3Var = (g3) this.f16111b.get(i);
            if (g3Var.e() <= 5.0f && g3Var.a() <= 2) {
                this.f16111b.remove(i);
                i--;
            }
            i++;
        }
        int size = this.f16111b.size();
        int i2 = 3;
        if (size >= 3) {
            if (size >= 4) {
                Iterator it = this.f16111b.iterator();
                float f = 0.0f;
                float fA = 0.0f;
                while (it.hasNext()) {
                    fA += ((g3) it.next()).a();
                }
                float f2 = fA / size;
                int i3 = 0;
                while (i3 < this.f16111b.size() && this.f16111b.size() > 4) {
                    if (((g3) this.f16111b.get(i3)).a() <= 0.5f * f2) {
                        this.f16111b.remove(i3);
                        i3--;
                    }
                    i3++;
                }
                int size2 = this.f16111b.size();
                Iterator it2 = this.f16111b.iterator();
                float f3 = 0.0f;
                while (it2.hasNext()) {
                    float fE = ((g3) it2.next()).e();
                    f += fE;
                    f3 += fE * fE;
                }
                float f4 = size2;
                float f5 = f / f4;
                float fSqrt = (float) Math.sqrt((f3 / f4) - (f5 * f5));
                Collections.sort(this.f16111b, new d(f5));
                float fMax = Math.max(0.36f * f5, fSqrt);
                int i4 = 0;
                while (i4 < this.f16111b.size() && this.f16111b.size() > 4) {
                    if (Math.abs(((g3) this.f16111b.get(i4)).e() - f5) > fMax) {
                        this.f16111b.remove(i4);
                        i4--;
                    }
                    i4++;
                }
                int size3 = this.f16111b.size();
                if (size3 >= 4) {
                    Collections.sort(this.f16111b, new c());
                    if (size3 > 4 && ((g3) this.f16111b.get(3)).a() - ((g3) this.f16111b.get(4)).a() > 2) {
                        while (4 < this.f16111b.size()) {
                            this.f16111b.remove(4);
                        }
                    }
                    double[] dArr = new double[3];
                    while (i2 < this.f16111b.size()) {
                        dArr[0] = a((g3) this.f16111b.get(0), (g3) this.f16111b.get(1));
                        dArr[1] = a((g3) this.f16111b.get(1), (g3) this.f16111b.get(i2));
                        dArr[2] = a((g3) this.f16111b.get(0), (g3) this.f16111b.get(i2));
                        Arrays.sort(dArr);
                        double d2 = dArr[1];
                        double d3 = dArr[0];
                        double dSqrt = ((d2 + d3) - dArr[2]) / ((Math.sqrt(d3) * 2.0d) * Math.sqrt(dArr[1]));
                        dArr[0] = a((g3) this.f16111b.get(0), (g3) this.f16111b.get(2));
                        dArr[1] = a((g3) this.f16111b.get(2), (g3) this.f16111b.get(i2));
                        dArr[2] = a((g3) this.f16111b.get(0), (g3) this.f16111b.get(i2));
                        Arrays.sort(dArr);
                        double d4 = dArr[1];
                        double d5 = dArr[0];
                        double dSqrt2 = ((d4 + d5) - dArr[2]) / ((Math.sqrt(d5) * 2.0d) * Math.sqrt(dArr[1]));
                        if (Math.abs(dSqrt) > 0.25d || Math.abs(dSqrt2) > 0.25d) {
                            this.f16111b.remove(i2);
                            i2--;
                        }
                        i2++;
                    }
                }
            }
            Collections.sort(this.f16111b, new b());
            List list = this.f16111b;
            return (g3[]) list.toArray(new g3[list.size()]);
        }
        throw com.huawei.hms.scankit.p.a.a();
    }

    final g3[] a(Map map) {
        int iB = this.f16110a.b();
        int iD = this.f16110a.d();
        int[] iArr = new int[5];
        for (int i = 0; i < iB; i++) {
            a(iArr);
            int i2 = 0;
            for (int i3 = 0; i3 < iD; i3++) {
                if (this.f16110a.b(i3, i)) {
                    if ((i2 & 1) == 1) {
                        i2++;
                    }
                    iArr[i2] = iArr[i2] + 1;
                } else if ((i2 & 1) != 0) {
                    iArr[i2] = iArr[i2] + 1;
                } else if (i2 == 4) {
                    if (!b(iArr) || !a(iArr, i, i3)) {
                        d(iArr);
                        i2 = 3;
                    } else {
                        a(iArr);
                        i2 = 0;
                    }
                } else {
                    i2++;
                    iArr[i2] = iArr[i2] + 1;
                }
            }
            if (b(iArr)) {
                a(iArr, i, iD);
            }
        }
        return b();
    }

    private int[] a() {
        a(this.f16112c);
        return this.f16112c;
    }

    protected final boolean a(int[] iArr, int i, int i2) {
        int i3 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int iA = (int) a(iArr, i2);
        float fB = b(i, iA, iArr[2], i3);
        if (!Float.isNaN(fB)) {
            int i4 = (int) fB;
            float fA = a(iA, i4, iArr[2], i3);
            if (!Float.isNaN(fA) && a(i4, (int) fA)) {
                float f = i3 / 6.0f;
                for (int i5 = 0; i5 < this.f16111b.size(); i5++) {
                    g3 g3Var = (g3) this.f16111b.get(i5);
                    if (g3Var.b(f, fB, fA)) {
                        this.f16111b.set(i5, g3Var.c(fB, fA, f));
                        return true;
                    }
                }
                g3 g3Var2 = new g3(fA, fB, f);
                this.f16111b.add(g3Var2);
                v6 v6Var = this.d;
                if (v6Var != null) {
                    v6Var.a(g3Var2);
                }
                return true;
            }
        }
        return false;
    }

    private static double a(g3 g3Var, g3 g3Var2) {
        double dB = g3Var.b() - g3Var2.b();
        double dC = g3Var.c() - g3Var2.c();
        return (dB * dB) + (dC * dC);
    }
}
