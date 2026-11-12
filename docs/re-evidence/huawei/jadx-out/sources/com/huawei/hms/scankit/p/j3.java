package com.huawei.hms.scankit.p;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public class j3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f16154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f16155b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f16156c = new int[5];
    private final v6 d;

    public j3(s sVar, v6 v6Var) {
        this.f16154a = sVar;
        this.d = v6Var;
    }

    private static float a(int[] iArr, int i) {
        return ((i - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    private boolean b(int i, int i2, int i3) {
        int i4;
        int i5;
        int[] iArrA = a();
        int iB = this.f16154a.b();
        int iD = this.f16154a.d();
        int i6 = 0;
        while (true) {
            int i7 = i + i6;
            if (i7 >= iB || i2 < i6 || !this.f16154a.b(i2 - i6, i7)) {
                break;
            }
            iArrA[2] = iArrA[2] + 1;
            i6++;
        }
        if (iArrA[2] == 0) {
            return false;
        }
        while (true) {
            int i8 = i + i6;
            if (i8 >= iB || i2 < i6 || this.f16154a.b(i2 - i6, i8)) {
                break;
            }
            iArrA[1] = iArrA[1] + 1;
            i6++;
        }
        if (iArrA[1] == 0) {
            return false;
        }
        while (true) {
            int i9 = i + i6;
            if (i9 >= iB || i2 < i6 || !this.f16154a.b(i2 - i6, i9)) {
                break;
            }
            iArrA[0] = iArrA[0] + 1;
            i6++;
        }
        if (iArrA[0] == 0) {
            return false;
        }
        int i10 = 1;
        while (i >= i10) {
            int i11 = i2 + i10;
            if (i11 >= iD || !this.f16154a.b(i11, i - i10)) {
                break;
            }
            iArrA[2] = iArrA[2] + 1;
            i10++;
        }
        while (i >= i10 && (i5 = i2 + i10) < iD && !this.f16154a.b(i5, i - i10)) {
            iArrA[3] = iArrA[3] + 1;
            i10++;
        }
        if (iArrA[3] == 0) {
            return false;
        }
        while (i >= i10 && (i4 = i2 + i10) < iD && this.f16154a.b(i4, i - i10)) {
            iArrA[4] = iArrA[4] + 1;
            i10++;
        }
        int i12 = iArrA[4];
        if (i12 == 0) {
            return false;
        }
        if (Math.abs(((((iArrA[0] + iArrA[1]) + iArrA[2]) + iArrA[3]) + i12) - i3) >= i3 * 0.5f) {
            return false;
        }
        return c(iArrA);
    }

    private void a(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = 0;
        }
    }

    private float d(int i, int i2, int i3) {
        s sVar = this.f16154a;
        int iB = sVar.b();
        int[] iArrA = a();
        int i4 = i;
        while (i4 >= 0 && sVar.b(i2, i4)) {
            iArrA[2] = iArrA[2] + 1;
            i4--;
        }
        if (i4 < 0) {
            return Float.NaN;
        }
        while (i4 >= 0 && !sVar.b(i2, i4)) {
            iArrA[1] = iArrA[1] + 1;
            i4--;
        }
        if (i4 >= 0 && iArrA[1] != 0) {
            while (i4 >= 0 && sVar.b(i2, i4)) {
                iArrA[0] = iArrA[0] + 1;
                i4--;
            }
            if (iArrA[0] == 0) {
                return Float.NaN;
            }
            int i5 = i + 1;
            while (i5 < iB && sVar.b(i2, i5)) {
                iArrA[2] = iArrA[2] + 1;
                i5++;
            }
            if (i5 != iB && iArrA[2] != 0) {
                while (i5 < iB && !sVar.b(i2, i5)) {
                    iArrA[3] = iArrA[3] + 1;
                    i5++;
                }
                if (i5 != iB && iArrA[3] != 0) {
                    while (i5 < iB && sVar.b(i2, i5)) {
                        iArrA[4] = iArrA[4] + 1;
                        i5++;
                    }
                    int i6 = iArrA[4];
                    if (i6 == 0) {
                        return Float.NaN;
                    }
                    if (Math.abs(((((iArrA[0] + iArrA[1]) + iArrA[2]) + iArrA[3]) + i6) - i3) < i3 * 0.4f && b(iArrA)) {
                        return a(iArrA, i5);
                    }
                }
            }
        }
        return Float.NaN;
    }

    private float c(int i, int i2, int i3) {
        s sVar = this.f16154a;
        int iD = sVar.d();
        int[] iArrA = a();
        int i4 = i;
        while (i4 >= 0 && sVar.b(i4, i2)) {
            iArrA[2] = iArrA[2] + 1;
            i4--;
        }
        if (i4 < 0) {
            return Float.NaN;
        }
        while (i4 >= 0 && !sVar.b(i4, i2)) {
            iArrA[1] = iArrA[1] + 1;
            i4--;
        }
        if (i4 >= 0 && iArrA[1] != 0) {
            while (i4 >= 0 && sVar.b(i4, i2)) {
                iArrA[0] = iArrA[0] + 1;
                i4--;
            }
            if (iArrA[0] == 0) {
                return Float.NaN;
            }
            int i5 = i + 1;
            while (i5 < iD && sVar.b(i5, i2)) {
                iArrA[2] = iArrA[2] + 1;
                i5++;
            }
            if (i5 != iD && iArrA[2] != 0) {
                while (i5 < iD && !sVar.b(i5, i2)) {
                    iArrA[3] = iArrA[3] + 1;
                    i5++;
                }
                if (i5 != iD && iArrA[3] != 0) {
                    while (i5 < iD && sVar.b(i5, i2)) {
                        iArrA[4] = iArrA[4] + 1;
                        i5++;
                    }
                    int i6 = iArrA[4];
                    if (i6 == 0) {
                        return Float.NaN;
                    }
                    if (Math.abs(((((iArrA[0] + iArrA[1]) + iArrA[2]) + iArrA[3]) + i6) - i3) < i3 * 0.2f && b(iArrA)) {
                        return a(iArrA, i5);
                    }
                }
            }
        }
        return Float.NaN;
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
        if (i < 5) {
            return false;
        }
        float f = i / 5.0f;
        float f2 = f / 1.6f;
        float f3 = f * 0.8f;
        float f4 = 0.8f * f2;
        if (Math.abs(f3 - iArr[0]) < f4) {
            float f5 = f * 1.2f;
            float f6 = 1.2f * f2;
            if (Math.abs(f5 - iArr[1]) < f6 && Math.abs(f - iArr[2]) < f2 && Math.abs(f5 - iArr[3]) < f6 && Math.abs(f3 - iArr[4]) < f4) {
                return true;
            }
        }
        return false;
    }

    private boolean a(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int[] iArrA = a();
        int i7 = 0;
        while (i >= i7 && i2 >= i7 && this.f16154a.b(i2 - i7, i - i7)) {
            iArrA[2] = iArrA[2] + 1;
            i7++;
        }
        if (iArrA[2] == 0) {
            return false;
        }
        while (i >= i7 && i2 >= i7 && !this.f16154a.b(i2 - i7, i - i7)) {
            iArrA[1] = iArrA[1] + 1;
            i7++;
        }
        if (iArrA[1] == 0) {
            return false;
        }
        while (i >= i7 && i2 >= i7 && this.f16154a.b(i2 - i7, i - i7)) {
            iArrA[0] = iArrA[0] + 1;
            i7++;
        }
        if (iArrA[0] == 0) {
            return false;
        }
        int iB = this.f16154a.b();
        int iD = this.f16154a.d();
        int i8 = 1;
        while (true) {
            int i9 = i + i8;
            if (i9 >= iB || (i6 = i2 + i8) >= iD || !this.f16154a.b(i6, i9)) {
                break;
            }
            iArrA[2] = iArrA[2] + 1;
            i8++;
        }
        while (true) {
            int i10 = i + i8;
            if (i10 >= iB || (i5 = i2 + i8) >= iD || this.f16154a.b(i5, i10)) {
                break;
            }
            iArrA[3] = iArrA[3] + 1;
            i8++;
        }
        if (iArrA[3] == 0) {
            return false;
        }
        while (true) {
            int i11 = i + i8;
            if (i11 >= iB || (i4 = i2 + i8) >= iD || !this.f16154a.b(i4, i11)) {
                break;
            }
            iArrA[4] = iArrA[4] + 1;
            i8++;
        }
        int i12 = iArrA[4];
        if (i12 == 0) {
            return false;
        }
        if (Math.abs(((((iArrA[0] + iArrA[1]) + iArrA[2]) + iArrA[3]) + i12) - i3) >= i3 * 0.5f) {
            return false;
        }
        return c(iArrA);
    }

    static final class c implements Comparator, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f16157a;

        private c(float f) {
            this.f16157a = f;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(f3 f3Var, f3 f3Var2) {
            return Float.compare(Math.abs(f3Var2.e() - this.f16157a), Math.abs(f3Var.e() - this.f16157a));
        }
    }

    static final class b implements Comparator, Serializable {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(f3 f3Var, f3 f3Var2) {
            return Float.compare(f3Var2.e(), f3Var.e());
        }

        private b() {
        }
    }

    private void d(int[] iArr) {
        iArr[0] = iArr[2];
        iArr[1] = iArr[3];
        iArr[2] = iArr[4];
        iArr[3] = 1;
        iArr[4] = 0;
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
        if (i < 5) {
            return false;
        }
        float f = i / 5.0f;
        float f2 = f / 1.0f;
        float f3 = f * 0.8f;
        float f4 = 0.8f * f2;
        if (Math.abs(f3 - iArr[0]) < f4) {
            float f5 = f * 1.2f;
            float f6 = 1.2f * f2;
            if (Math.abs(f5 - iArr[1]) < f6 && Math.abs(f - iArr[2]) < f2 && Math.abs(f5 - iArr[3]) < f6 && Math.abs(f3 - iArr[4]) < f4) {
                return true;
            }
        }
        return false;
    }

    final f3[] a(Map map) {
        int iB = this.f16154a.b();
        int iD = this.f16154a.d();
        int[] iArr = new int[5];
        for (int i = 1; i < iB; i += 2) {
            a(iArr);
            int i2 = 0;
            for (int i3 = 0; i3 < iD; i3++) {
                if (this.f16154a.b(i3, i)) {
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
        a(this.f16156c);
        return this.f16156c;
    }

    private f3[] b() throws com.huawei.hms.scankit.p.a {
        int i = 0;
        int i2 = 0;
        while (i2 < this.f16155b.size()) {
            f3 f3Var = (f3) this.f16155b.get(i2);
            if (f3Var.e() <= 5.0f || f3Var.a() <= 2) {
                this.f16155b.remove(i2);
                i2--;
            }
            i2++;
        }
        int size = this.f16155b.size();
        if (size >= 3) {
            Iterator it = this.f16155b.iterator();
            float fA = 0.0f;
            float f = 0.0f;
            float f2 = 0.0f;
            while (it.hasNext()) {
                float fE = ((f3) it.next()).e();
                f += fE;
                f2 += fE * fE;
            }
            float f3 = size;
            float f4 = f / f3;
            float fSqrt = (float) Math.sqrt((f2 / f3) - (f4 * f4));
            Collections.sort(this.f16155b, new c(f4));
            float fMax = Math.max(0.36f * f4, fSqrt);
            int i3 = 0;
            while (i3 < this.f16155b.size() && this.f16155b.size() > 3) {
                if (Math.abs(((f3) this.f16155b.get(i3)).e() - f4) > fMax) {
                    this.f16155b.remove(i3);
                    i3--;
                }
                i3++;
            }
            int size2 = this.f16155b.size();
            Iterator it2 = this.f16155b.iterator();
            while (it2.hasNext()) {
                fA += ((f3) it2.next()).a();
            }
            float f5 = fA / size2;
            while (i < this.f16155b.size() && this.f16155b.size() > 3) {
                if (((f3) this.f16155b.get(i)).a() <= 0.5f * f5) {
                    this.f16155b.remove(i);
                    i--;
                }
                i++;
            }
            Collections.sort(this.f16155b, new b());
            List list = this.f16155b;
            return (f3[]) list.toArray(new f3[list.size()]);
        }
        throw com.huawei.hms.scankit.p.a.a();
    }

    protected final boolean a(int[] iArr, int i, int i2) {
        int i3 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int iA = (int) a(iArr, i2);
        float fD = d(i, iA, i3);
        if (!Float.isNaN(fD)) {
            int i4 = (int) fD;
            float fC = c(iA, i4, i3);
            if (!Float.isNaN(fC)) {
                int i5 = (int) fC;
                if (a(i4, i5, i3) && b(i4, i5, i3)) {
                    float f = i3 / 5.0f;
                    for (int i6 = 0; i6 < this.f16155b.size(); i6++) {
                        f3 f3Var = (f3) this.f16155b.get(i6);
                        if (f3Var.b(f, fD, fC)) {
                            this.f16155b.set(i6, f3Var.c(fD, fC, f));
                            return true;
                        }
                    }
                    f3 f3Var2 = new f3(fC, fD, f);
                    this.f16155b.add(f3Var2);
                    v6 v6Var = this.d;
                    if (v6Var != null) {
                        v6Var.a(f3Var2);
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
