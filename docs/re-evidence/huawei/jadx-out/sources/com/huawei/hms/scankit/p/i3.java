package com.huawei.hms.scankit.p;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public class i3 {
    private static final int[] f = {1, 3, 1, 1};
    private static final int[] g = {1, 1, 3, 1};
    private static boolean h = false;
    private static boolean i = false;
    private static final d j = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f16132a;
    private final v6 e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f16133b = new ArrayList();
    private final int[] d = new int[5];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f16134c = new ArrayList();

    public i3(s sVar, v6 v6Var) {
        this.f16132a = sVar;
        this.e = v6Var;
    }

    private static void e() {
        h = false;
        i = false;
    }

    private e3[] c() throws com.huawei.hms.scankit.p.a {
        if (this.f16133b.size() > 2) {
            try {
                return f();
            } catch (com.huawei.hms.scankit.p.a unused) {
                if (this.f16134c.size() > 0) {
                    Collections.sort(this.f16134c, new c());
                    int iMin = Math.min(3, this.f16134c.size());
                    for (int i2 = 0; i2 < iMin; i2++) {
                        e3 e3Var = (e3) this.f16134c.get(i2);
                        float fE = e3Var.e();
                        float fC = e3Var.c();
                        float fB = e3Var.b();
                        int i3 = 0;
                        while (true) {
                            if (i3 < this.f16133b.size()) {
                                e3 e3Var2 = (e3) this.f16133b.get(i3);
                                if (e3Var2.b(fE, fC, fB)) {
                                    this.f16133b.set(i3, e3Var2.a(fC, fB, fE, false));
                                    break;
                                }
                                i3++;
                            } else {
                                this.f16133b.add(e3Var);
                                break;
                            }
                        }
                    }
                    return f();
                }
                throw com.huawei.hms.scankit.p.a.a();
            }
        }
        if (this.f16133b.size() == 2) {
            int i4 = ((e3) this.f16133b.get(0)).e() > ((e3) this.f16133b.get(1)).e() ? 0 : 1;
            if (Math.max(((e3) this.f16133b.get(0)).e(), ((e3) this.f16133b.get(1)).e()) / Math.min(((e3) this.f16133b.get(0)).e(), ((e3) this.f16133b.get(1)).e()) > 1.5d) {
                e3 e3Var3 = (e3) this.f16133b.get(i4);
                this.f16133b.clear();
                this.f16133b.add(e3Var3);
            }
        }
        if (this.f16133b.size() <= 1 && this.f16134c.size() >= 1) {
            for (int i5 = 0; i5 < this.f16133b.size(); i5++) {
                e3 e3Var4 = (e3) this.f16133b.get(i5);
                float fE2 = e3Var4.e();
                float fC2 = e3Var4.c();
                float fB2 = e3Var4.b();
                int i6 = 0;
                while (true) {
                    if (i6 < this.f16134c.size()) {
                        e3 e3Var5 = (e3) this.f16134c.get(i6);
                        if (e3Var5.b(fE2, fC2, fB2)) {
                            this.f16134c.set(i6, e3Var4.a(e3Var5.c(), e3Var5.b(), e3Var5.e(), false));
                            break;
                        }
                        i6++;
                    } else {
                        this.f16134c.add(e3Var4);
                        break;
                    }
                }
            }
            this.f16133b.clear();
            this.f16133b.addAll(this.f16134c);
            this.f16134c.clear();
        }
        if (this.f16133b.size() == 2) {
            try {
                return g();
            } catch (com.huawei.hms.scankit.p.a unused2) {
                return a();
            }
        }
        if (this.f16133b.size() > 1) {
            return f();
        }
        throw com.huawei.hms.scankit.p.a.a();
    }

    private e3[] g() throws com.huawei.hms.scankit.p.a {
        e3 e3Var;
        e3 e3Var2;
        char c2 = 0;
        e3 e3Var3 = (e3) this.f16133b.get(0);
        char c3 = 1;
        e3 e3Var4 = (e3) this.f16133b.get(1);
        e3 e3Var5 = (e3) this.f16133b.get(1);
        double dA = a(e3Var3, e3Var4);
        float fMin = Math.min(e3Var3.e(), e3Var4.e());
        Collections.sort(this.f16133b, new e(fMin));
        int i2 = 0;
        double d2 = Double.MAX_VALUE;
        while (i2 < this.f16134c.size()) {
            e3 e3Var6 = (e3) this.f16134c.get(i2);
            float fE = e3Var6.e();
            if (fE > 1.25f * fMin || fE < 0.75f * fMin) {
                e3Var = e3Var3;
                e3Var2 = e3Var4;
            } else {
                double dA2 = a(e3Var4, e3Var6);
                double dA3 = a(e3Var3, e3Var6);
                double[] dArr = new double[3];
                dArr[c2] = dA;
                dArr[c3] = dA2;
                dArr[2] = dA3;
                Arrays.sort(dArr);
                double dAbs = Math.abs(dArr[2] - (dArr[c3] * 2.0d));
                double dAbs2 = Math.abs(dArr[2] - (dArr[c2] * 2.0d));
                double d3 = dArr[2];
                double d4 = (dAbs + dAbs2) / d3;
                double d5 = dArr[c3];
                double d6 = dArr[c2];
                double dSqrt = ((d5 + d6) - d3) / ((Math.sqrt(d6) * 2.0d) * Math.sqrt(dArr[c3]));
                if (!r3.h || Math.abs(dSqrt) >= 0.25d) {
                    e3Var = e3Var3;
                    e3Var2 = e3Var4;
                } else {
                    char c4 = (e3Var3.b() >= ((float) this.f16132a.d()) * 0.3f || e3Var4.b() <= ((float) this.f16132a.d()) * 0.7f) ? c2 : (char) 1;
                    boolean z = e3Var4.b() < ((float) this.f16132a.d()) * 0.3f && e3Var3.b() > ((float) this.f16132a.d()) * 0.7f;
                    boolean z2 = e3Var3.c() < ((float) this.f16132a.b()) * 0.3f && e3Var4.c() > ((float) this.f16132a.b()) * 0.7f;
                    boolean z3 = e3Var4.c() < ((float) this.f16132a.b()) * 0.3f && e3Var3.c() > ((float) this.f16132a.b()) * 0.7f;
                    e3Var = e3Var3;
                    boolean z4 = e3Var6.b() < ((float) this.f16132a.d()) * 0.3f || e3Var6.b() > ((float) this.f16132a.d()) * 0.7f;
                    e3Var2 = e3Var4;
                    boolean z5 = e3Var6.c() < ((float) this.f16132a.b()) * 0.3f || e3Var6.c() > ((float) this.f16132a.b()) * 0.7f;
                    if (((c4 != 0 || z) && !z4) || ((z2 || z3) && !z5)) {
                    }
                }
                if (d4 < d2 && Math.abs(dSqrt) < 0.25d) {
                    e3Var5 = e3Var6;
                    d2 = d4;
                }
            }
            i2++;
            e3Var3 = e3Var;
            e3Var4 = e3Var2;
            c2 = 0;
            c3 = 1;
        }
        if (d2 != Double.MAX_VALUE) {
            this.f16133b.add(e3Var5);
            return new e3[]{(e3) this.f16133b.get(0), (e3) this.f16133b.get(1), (e3) this.f16133b.get(2)};
        }
        throw com.huawei.hms.scankit.p.a.a();
    }

    private e3[] f() throws com.huawei.hms.scankit.p.a {
        int size = this.f16133b.size();
        if (size >= 3) {
            e3[] e3VarArr = new e3[3];
            if (size == 3) {
                e3VarArr[0] = (e3) this.f16133b.get(0);
                e3VarArr[1] = (e3) this.f16133b.get(1);
                e3 e3Var = (e3) this.f16133b.get(2);
                e3VarArr[2] = e3Var;
                if (!b(e3VarArr[0], e3VarArr[1], e3Var, new float[3])) {
                    throw com.huawei.hms.scankit.p.a.a();
                }
            } else {
                Collections.sort(this.f16133b, new c());
                if (((e3) this.f16133b.get(2)).a() - ((e3) this.f16133b.get(3)).a() > 1 && ((e3) this.f16133b.get(2)).a() > 1) {
                    e3VarArr[0] = (e3) this.f16133b.get(0);
                    e3VarArr[1] = (e3) this.f16133b.get(1);
                    e3VarArr[2] = (e3) this.f16133b.get(2);
                    return e3VarArr;
                }
                float fE = 0.0f;
                if (((e3) this.f16133b.get(3)).a() > 1) {
                    float fE2 = 0.0f;
                    for (int i2 = 0; i2 < 4; i2++) {
                        fE2 += ((e3) this.f16133b.get(i2)).e();
                    }
                    float f2 = fE2 / 4.0f;
                    int i3 = 0;
                    for (int i4 = 0; i4 < 4; i4++) {
                        float fAbs = Math.abs(((e3) this.f16133b.get(i4)).e() - f2);
                        if (fAbs > fE) {
                            i3 = i4;
                            fE = fAbs;
                        }
                    }
                    if (i3 == 0) {
                        e3VarArr[0] = (e3) this.f16133b.get(1);
                        e3VarArr[1] = (e3) this.f16133b.get(2);
                        e3VarArr[2] = (e3) this.f16133b.get(3);
                    } else if (i3 == 1) {
                        e3VarArr[0] = (e3) this.f16133b.get(0);
                        e3VarArr[1] = (e3) this.f16133b.get(2);
                        e3VarArr[2] = (e3) this.f16133b.get(3);
                    } else if (i3 != 2) {
                        e3VarArr[0] = (e3) this.f16133b.get(0);
                        e3VarArr[1] = (e3) this.f16133b.get(1);
                        e3VarArr[2] = (e3) this.f16133b.get(2);
                    } else {
                        e3VarArr[0] = (e3) this.f16133b.get(0);
                        e3VarArr[1] = (e3) this.f16133b.get(1);
                        e3VarArr[2] = (e3) this.f16133b.get(3);
                    }
                    if (!b(e3VarArr[0], e3VarArr[1], e3VarArr[2], new float[3])) {
                        throw com.huawei.hms.scankit.p.a.a();
                    }
                } else {
                    if (((e3) this.f16133b.get(1)).a() > 1 && ((e3) this.f16133b.get(2)).a() == 1) {
                        ArrayList arrayList = new ArrayList();
                        float fE3 = (((e3) this.f16133b.get(0)).e() + ((e3) this.f16133b.get(1)).e()) / 2.0f;
                        for (int i5 = 2; i5 < size; i5++) {
                            if (Math.abs(((e3) this.f16133b.get(i5)).e() - fE3) < ((double) fE3) * 0.5d) {
                                arrayList.add((e3) this.f16133b.get(i5));
                            }
                        }
                        int i6 = 0;
                        for (int i7 = 0; i7 < arrayList.size(); i7++) {
                            float[] fArr = new float[3];
                            if (b((e3) this.f16133b.get(0), (e3) this.f16133b.get(1), (e3) arrayList.get(i7), fArr)) {
                                float f3 = fArr[0];
                                if (f3 >= fE) {
                                    i6 = i7;
                                    fE = f3;
                                }
                            }
                        }
                        e3VarArr[0] = (e3) this.f16133b.get(0);
                        e3VarArr[1] = (e3) this.f16133b.get(1);
                        if (i6 < arrayList.size()) {
                            e3VarArr[2] = (e3) arrayList.get(i6);
                            return e3VarArr;
                        }
                        throw com.huawei.hms.scankit.p.a.a();
                    }
                    if (size > 3) {
                        float f4 = 0.0f;
                        float f5 = 0.0f;
                        for (int i8 = 0; i8 < size; i8++) {
                            float fE4 = ((e3) this.f16133b.get(i8)).e();
                            f4 += fE4;
                            f5 += fE4 * fE4;
                        }
                        float f6 = size;
                        float f7 = f4 / f6;
                        float fSqrt = (float) Math.sqrt((f5 / f6) - (f7 * f7));
                        Collections.sort(this.f16133b, new e(f7));
                        float fMax = Math.max(0.5f * f7, fSqrt);
                        int i9 = 0;
                        while (i9 < this.f16133b.size() && this.f16133b.size() > 3) {
                            if (Math.abs(((e3) this.f16133b.get(i9)).e() - f7) > fMax) {
                                this.f16133b.remove(i9);
                                i9--;
                            }
                            i9++;
                        }
                    }
                    if (this.f16133b.size() > 15) {
                        Collections.sort(this.f16133b, new c());
                        List list = this.f16133b;
                        list.subList(15, list.size()).clear();
                    } else if (this.f16133b.size() > 12) {
                        Collections.sort(this.f16133b, new c());
                        List list2 = this.f16133b;
                        list2.subList(12, list2.size()).clear();
                    }
                    if (this.f16133b.size() >= 6) {
                        Collections.sort(this.f16133b, new f());
                        List list3 = this.f16133b;
                        list3.subList(4, list3.size() - 2).clear();
                        Collections.sort(this.f16133b, new g());
                        this.f16133b.subList(1, 3).clear();
                        Collections.sort(this.f16133b, new g());
                        List list4 = this.f16133b;
                        list4.subList(list4.size() - 1, this.f16133b.size()).clear();
                    } else if (this.f16133b.size() > 3) {
                        for (int i10 = 0; i10 < this.f16133b.size(); i10++) {
                            fE += ((e3) this.f16133b.get(i10)).e();
                        }
                        Collections.sort(this.f16133b, new b(fE / this.f16133b.size()));
                        List list5 = this.f16133b;
                        list5.subList(3, list5.size()).clear();
                    }
                    e3VarArr[0] = (e3) this.f16133b.get(0);
                    e3VarArr[1] = (e3) this.f16133b.get(1);
                    e3 e3Var2 = (e3) this.f16133b.get(2);
                    e3VarArr[2] = e3Var2;
                    if (!b(e3VarArr[0], e3VarArr[1], e3Var2, new float[3])) {
                        throw com.huawei.hms.scankit.p.a.a();
                    }
                }
            }
            return e3VarArr;
        }
        throw com.huawei.hms.scankit.p.a.a();
    }

    private static void a(e3 e3Var, e3 e3Var2, e3 e3Var3, float[] fArr) {
        float fB = e3Var.b() - e3Var2.b();
        float fC = e3Var.c() - e3Var2.c();
        float f2 = (fB * fB) + (fC * fC);
        float fB2 = e3Var.b() - e3Var3.b();
        float fC2 = e3Var.c() - e3Var3.c();
        float f3 = (fB2 * fB2) + (fC2 * fC2);
        float fB3 = e3Var2.b() - e3Var3.b();
        float fC3 = e3Var2.c() - e3Var3.c();
        float f4 = (fB3 * fB3) + (fC3 * fC3);
        if (f2 > f4 && f2 > f3) {
            fArr[0] = f2;
            fArr[1] = f3;
            fArr[2] = f4;
        } else if (f4 > f2 && f4 > f3) {
            fArr[0] = f4;
            fArr[1] = f2;
            fArr[2] = f3;
        } else {
            fArr[0] = f3;
            fArr[1] = f2;
            fArr[2] = f4;
        }
    }

    private static boolean b(e3 e3Var, e3 e3Var2, e3 e3Var3, float[] fArr) {
        a(e3Var, e3Var2, e3Var3, fArr);
        float fSqrt = (float) Math.sqrt(fArr[1]);
        float fSqrt2 = (float) Math.sqrt(fArr[2]);
        float fSqrt3 = (float) Math.sqrt(fArr[0]);
        if (Math.min(Math.min(fSqrt, fSqrt2), fSqrt3) <= Math.max(Math.max(e3Var.e(), e3Var2.e()), e3Var3.e()) * 7.0f) {
            return false;
        }
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[0];
        float f5 = ((f2 + f3) - f4) / ((fSqrt * 2.0f) * fSqrt2);
        float f6 = fSqrt3 * 2.0f;
        float f7 = ((f4 + f2) - f3) / (fSqrt * f6);
        float f8 = ((f4 + f3) - f2) / (f6 * fSqrt2);
        return Math.abs(f5) <= 0.45f && f7 >= 0.2588f && f7 <= 0.94f && f8 >= 0.2588f && f8 <= 0.94f;
    }

    static final class e implements Comparator, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f16136a;

        private e(float f) {
            this.f16136a = f;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(e3 e3Var, e3 e3Var2) {
            return Float.compare(Math.abs(e3Var2.e() - this.f16136a), Math.abs(e3Var.e() - this.f16136a));
        }
    }

    static final class d implements Comparator, Serializable {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(e3 e3Var, e3 e3Var2) {
            return Float.compare(e3Var.e(), e3Var2.e());
        }

        private d() {
        }
    }

    static final class c implements Comparator, Serializable {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(e3 e3Var, e3 e3Var2) {
            return Integer.compare(e3Var2.a(), e3Var.a());
        }

        private c() {
        }
    }

    static final class f implements Comparator, Serializable {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(e3 e3Var, e3 e3Var2) {
            return Float.compare(e3Var.b(), e3Var2.b());
        }

        private f() {
        }
    }

    static final class g implements Comparator, Serializable {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(e3 e3Var, e3 e3Var2) {
            return Float.compare(e3Var.c(), e3Var2.c());
        }

        private g() {
        }
    }

    static final class b implements Comparator, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f16135a;

        private b(float f) {
            this.f16135a = f;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(e3 e3Var, e3 e3Var2) {
            int iCompare = Integer.compare(e3Var2.a(), e3Var.a());
            return iCompare == 0 ? Float.compare(Math.abs(e3Var.e() - this.f16135a), Math.abs(e3Var2.e() - this.f16135a)) : iCompare;
        }
    }

    private boolean d(int i2, int i3, int i4, int[] iArr) {
        int i5;
        int i6;
        int i7;
        s sVar = this.f16132a;
        while (i2 >= 0 && !sVar.b(i3, i2) && (i7 = iArr[3]) <= i4) {
            iArr[3] = i7 + 1;
            i2--;
        }
        if (i2 >= 0 && iArr[3] <= i4) {
            while (i2 >= 0 && sVar.b(i3, i2) && (i6 = iArr[2]) <= i4) {
                iArr[2] = i6 + 1;
                i2--;
            }
            if (i2 >= 0 && iArr[2] <= i4) {
                while (i2 >= 0 && !sVar.b(i3, i2)) {
                    int i8 = iArr[1];
                    if (i8 > i4) {
                        break;
                    }
                    iArr[1] = i8 + 1;
                    i2--;
                }
                if (i2 >= 0 && iArr[1] <= i4) {
                    while (i2 >= 0 && sVar.b(i3, i2) && (i5 = iArr[0]) <= i4) {
                        iArr[0] = i5 + 1;
                        i2--;
                    }
                    return iArr[0] > i4;
                }
            }
        }
        return true;
    }

    private static float a(int[] iArr, int i2) {
        return ((i2 - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    private boolean c(int i2, int i3, int i4, int[] iArr) {
        int i5;
        int i6;
        s sVar = this.f16132a;
        while (i2 >= 0 && !sVar.b(i3, i2) && (i6 = iArr[1]) <= i4) {
            iArr[1] = i6 + 1;
            i2--;
        }
        if (i2 < 0 || iArr[1] > i4) {
            return true;
        }
        while (i2 >= 0 && sVar.b(i3, i2) && (i5 = iArr[0]) <= i4) {
            iArr[0] = i5 + 1;
            i2--;
        }
        return iArr[0] > i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0088, code lost:
    
        if ((r11 * 3) > r13) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private float b(int i2, int i3, int i4, int i5, boolean z) {
        int i6;
        int i7;
        s sVar = this.f16132a;
        int iB = sVar.b();
        int[] iArrD = d();
        if (b(i2, i3, i4, iArrD)) {
            return Float.NaN;
        }
        int i8 = i2 + 1;
        while (i8 < iB && sVar.b(i3, i8)) {
            iArrD[2] = iArrD[2] + 1;
            i8++;
        }
        if (i8 == iB) {
            return Float.NaN;
        }
        while (i8 < iB && !sVar.b(i3, i8) && (i7 = iArrD[3]) < i4) {
            iArrD[3] = i7 + 1;
            i8++;
        }
        if (i8 != iB && iArrD[3] < i4) {
            while (i8 < iB && sVar.b(i3, i8) && (i6 = iArrD[4]) < i4) {
                iArrD[4] = i6 + 1;
                i8++;
            }
            if (!a(iArrD, z)) {
                return Float.NaN;
            }
            int i9 = iArrD[0] + iArrD[1] + iArrD[2] + iArrD[3] + iArrD[4];
            if (z) {
                if (Math.abs(i9 - i5) * 5 >= i5 * 3 && !i && !h) {
                    return Float.NaN;
                }
            } else if (i9 < i5 * 3) {
            }
            return a(iArrD, i8);
        }
        return Float.NaN;
    }

    private int[] d() {
        a(this.d);
        return this.d;
    }

    protected final void a(int[] iArr) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = 0;
        }
    }

    protected static boolean c(int[] iArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < 5; i3++) {
            int i4 = iArr[i3];
            if (i4 == 0) {
                return false;
            }
            i2 += i4;
        }
        if (i2 < 7) {
            return false;
        }
        float f2 = i2 / 7.0f;
        float f3 = 0.75f * f2;
        if (Math.abs(f2 - iArr[0]) < f3 && Math.abs(f2 - iArr[1]) < f3) {
            if (Math.abs((f2 * 3.0f) - iArr[2]) < 3.0f * f3 && Math.abs(f2 - iArr[3]) < f3 && Math.abs(f2 - iArr[4]) < f3) {
                return true;
            }
        }
        return false;
    }

    protected final void d(int[] iArr) {
        iArr[0] = iArr[2];
        iArr[1] = iArr[3];
        iArr[2] = iArr[4];
        iArr[3] = 1;
        iArr[4] = 0;
    }

    private boolean a(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int[] iArrD = d();
        int i7 = 0;
        while (i2 >= i7 && i3 >= i7 && this.f16132a.b(i3 - i7, i2 - i7)) {
            iArrD[2] = iArrD[2] + 1;
            i7++;
        }
        if (iArrD[2] == 0) {
            return false;
        }
        while (i2 >= i7 && i3 >= i7 && !this.f16132a.b(i3 - i7, i2 - i7)) {
            iArrD[1] = iArrD[1] + 1;
            i7++;
        }
        if (iArrD[1] == 0) {
            return false;
        }
        while (i2 >= i7 && i3 >= i7 && this.f16132a.b(i3 - i7, i2 - i7)) {
            iArrD[0] = iArrD[0] + 1;
            i7++;
        }
        if (iArrD[0] == 0) {
            return false;
        }
        int iB = this.f16132a.b();
        int iD = this.f16132a.d();
        int i8 = 1;
        while (true) {
            int i9 = i2 + i8;
            if (i9 >= iB || (i6 = i3 + i8) >= iD || !this.f16132a.b(i6, i9)) {
                break;
            }
            iArrD[2] = iArrD[2] + 1;
            i8++;
        }
        while (true) {
            int i10 = i2 + i8;
            if (i10 >= iB || (i5 = i3 + i8) >= iD || this.f16132a.b(i5, i10)) {
                break;
            }
            iArrD[3] = iArrD[3] + 1;
            i8++;
        }
        if (iArrD[3] == 0) {
            return false;
        }
        while (true) {
            int i11 = i2 + i8;
            if (i11 >= iB || (i4 = i3 + i8) >= iD || !this.f16132a.b(i4, i11)) {
                break;
            }
            iArrD[4] = iArrD[4] + 1;
            i8++;
        }
        if (iArrD[4] == 0) {
            return false;
        }
        return c(iArrD);
    }

    private float b(int i2, int i3, int i4, int i5) {
        int i6;
        s sVar = this.f16132a;
        int iB = sVar.b();
        int[] iArrD = d();
        if (d(i2, i3, i4, iArrD)) {
            return Float.NaN;
        }
        int i7 = i2 + 1;
        while (i7 < iB && !sVar.b(i3, i7) && (i6 = iArrD[3]) <= i4) {
            iArrD[3] = i6 + 1;
            i7++;
        }
        if (i7 >= 0 && iArrD[3] <= i4) {
            while (i7 < iB && sVar.b(i3, i7)) {
                iArrD[4] = iArrD[4] + 1;
                i7++;
            }
            int i8 = iArrD[4];
            if (i8 > i4) {
                return Float.NaN;
            }
            if (Math.abs(((((iArrD[0] + iArrD[1]) + iArrD[2]) + iArrD[3]) + i8) - i5) * 5 < i5 * 2 && a(iArrD, true)) {
                return a(iArrD, i7);
            }
        }
        return Float.NaN;
    }

    private float a(int i2, int i3, int i4, int i5, boolean z) {
        int i6;
        int i7;
        s sVar = this.f16132a;
        int iD = sVar.d();
        int[] iArrD = d();
        if (a(i2, i3, i4, iArrD)) {
            return Float.NaN;
        }
        int i8 = i2 + 1;
        while (i8 < iD && sVar.b(i8, i3)) {
            iArrD[2] = iArrD[2] + 1;
            i8++;
        }
        if (i8 == iD) {
            return Float.NaN;
        }
        while (i8 < iD && !sVar.b(i8, i3) && (i7 = iArrD[3]) < i4) {
            iArrD[3] = i7 + 1;
            i8++;
        }
        if (i8 == iD || iArrD[3] >= i4) {
            return Float.NaN;
        }
        while (i8 < iD && sVar.b(i8, i3) && (i6 = iArrD[4]) < i4) {
            iArrD[4] = i6 + 1;
            i8++;
        }
        if (!a(iArrD, z)) {
            return Float.NaN;
        }
        int i9 = iArrD[0];
        int i10 = iArrD[1];
        if (Math.abs(((((i9 + i10) + iArrD[2]) + iArrD[3]) + iArrD[4]) - i5) * 5 < i5 || i || h) {
            return a(iArrD, i8);
        }
        return Float.NaN;
    }

    final k3 b() throws com.huawei.hms.scankit.p.a {
        int iB = this.f16132a.b();
        int iD = this.f16132a.d();
        int i2 = (iB * 3) / 388;
        if (i2 < 3) {
            i2 = 3;
        }
        if (r3.n) {
            i2 = 2;
        }
        a(i2, iB, iD);
        e3[] e3VarArrC = c();
        if (e3VarArrC != null) {
            u6.a(e3VarArrC);
            if (((double) (this.f16132a.b() * this.f16132a.d())) / (Math.sqrt(a(e3VarArrC[0], e3VarArrC[1])) * Math.sqrt(a(e3VarArrC[1], e3VarArrC[2]))) <= 900.0d) {
                return new k3(e3VarArrC);
            }
            throw com.huawei.hms.scankit.p.a.a();
        }
        throw com.huawei.hms.scankit.p.a.a();
    }

    private boolean b(int i2, int i3, int i4, int[] iArr) {
        boolean z;
        int i5;
        s sVar = this.f16132a;
        while (true) {
            z = true;
            if (i2 < 0 || !sVar.b(i3, i2)) {
                break;
            }
            iArr[2] = iArr[2] + 1;
            i2--;
        }
        if (i2 < 0) {
            return true;
        }
        while (i2 >= 0 && !sVar.b(i3, i2)) {
            int i6 = iArr[1];
            if (i6 > i4) {
                break;
            }
            iArr[1] = i6 + 1;
            i2--;
        }
        if (i2 >= 0 && iArr[1] <= i4) {
            while (true) {
                z = false;
                if (i2 < 0 || !sVar.b(i3, i2) || (i5 = iArr[0]) > i4) {
                    break;
                }
                iArr[0] = i5 + 1;
                i2--;
            }
        }
        return z;
    }

    private float a(int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        s sVar = this.f16132a;
        int iB = sVar.b();
        int[] iArrD = d();
        if (c(i2, i3, i4, iArrD)) {
            return Float.NaN;
        }
        int i8 = i2 + 1;
        while (i8 < iB && !sVar.b(i3, i8)) {
            int i9 = iArrD[1];
            if (i9 > i4) {
                break;
            }
            iArrD[1] = i9 + 1;
            i8++;
        }
        if (i8 >= 0 && iArrD[1] <= i4) {
            while (i8 < iB && sVar.b(i3, i8)) {
                iArrD[2] = iArrD[2] + 1;
                i8++;
            }
            if (i8 == iB) {
                return Float.NaN;
            }
            while (i8 < iB && !sVar.b(i3, i8) && (i7 = iArrD[3]) < i4) {
                iArrD[3] = i7 + 1;
                i8++;
            }
            if (i8 != iB && iArrD[3] < i4) {
                while (i8 < iB && sVar.b(i3, i8) && (i6 = iArrD[4]) < i4) {
                    iArrD[4] = i6 + 1;
                    i8++;
                }
                int i10 = iArrD[4];
                if (i10 >= i4) {
                    return Float.NaN;
                }
                if (Math.abs(((((iArrD[0] + iArrD[1]) + iArrD[2]) + iArrD[3]) + i10) - i5) * 5 >= i5 * 2) {
                    return Float.NaN;
                }
                if (r3.h) {
                    if (a(iArrD, true)) {
                        return a(iArrD, i8);
                    }
                    return Float.NaN;
                }
                if (a(iArrD, false)) {
                    return a(iArrD, i8);
                }
            }
        }
        return Float.NaN;
    }

    protected static boolean b(int[] iArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr[i3];
            if (i4 == 0) {
                return false;
            }
            i2 += i4;
        }
        if (i2 < 7) {
            return false;
        }
        float f2 = i2 / 7.0f;
        float f3 = 0.5f * f2;
        if (Math.abs(f2 - iArr[0]) < f3) {
            if (Math.abs((5.0f * f2) - iArr[1]) < f3 && Math.abs(f2 - iArr[2]) < f3) {
                return true;
            }
        }
        return false;
    }

    private float a(int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        s sVar = this.f16132a;
        int iB = sVar.b();
        int i9 = i3;
        while (i9 <= i4) {
            int[] iArrD = d();
            int i10 = i2;
            while (i10 >= 0 && !sVar.b(i9, i10) && (i8 = iArrD[1]) <= i5) {
                iArrD[1] = i8 + 1;
                i10--;
            }
            if (i10 >= 0) {
                double d2 = ((double) i5) * 1.5d;
                if (iArrD[1] > d2) {
                    continue;
                } else {
                    while (i10 >= 0 && sVar.b(i9, i10) && (i7 = iArrD[0]) <= i5) {
                        iArrD[0] = i7 + 1;
                        i10--;
                    }
                    if (iArrD[0] > i5 / 2) {
                        continue;
                    } else {
                        int i11 = i2 + 1;
                        while (i11 < iB && !sVar.b(i9, i11)) {
                            int i12 = iArrD[1];
                            if (i12 > i5) {
                                break;
                            }
                            iArrD[1] = i12 + 1;
                            i11++;
                        }
                        if (i11 >= 0 && iArrD[1] <= d2) {
                            while (i11 < iB && sVar.b(i9, i11)) {
                                iArrD[2] = iArrD[2] + 1;
                                i11++;
                            }
                            if (Math.abs(((iArrD[0] + iArrD[1]) + iArrD[2]) - i6) * 5 < i6 * 2 && b(iArrD)) {
                                return (i11 - (iArrD[1] / 2)) - iArrD[2];
                            }
                        }
                    }
                }
            }
            i9 += i4 - i3;
        }
        return Float.NaN;
    }

    protected final boolean b(int[] iArr, int i2, int i3) {
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = i4 + i5 + iArr[2];
        float f2 = i3 - (i6 / 2);
        int i7 = (int) f2;
        float fA = a(i2, i7, i5, i6);
        if (Float.isNaN(fA)) {
            int i8 = iArr[1];
            float f3 = (i8 * 2) / 5;
            fA = a(i2, (int) (f2 - f3), (int) (f3 + f2), i8, i6);
            if (Float.isNaN(fA) && r3.h) {
                fA = b(i2, i7, iArr[1], i6);
            }
        }
        if (Float.isNaN(fA)) {
            return false;
        }
        return a(false, fA, f2, i6 / 7.0f);
    }

    private boolean b(int[] iArr, int[] iArr2) {
        int i2 = iArr2[0];
        if ((i2 & 1) != 0) {
            iArr[i2] = iArr[i2] + 1;
        } else if (i2 == 4) {
            if (a(iArr, false)) {
                boolean zA = a(iArr, iArr2[1], iArr2[2], false);
                if (zA) {
                    iArr2[4] = 2;
                }
                if (!zA) {
                    zA = a(iArr, iArr2[1], iArr2[2]);
                }
                if (zA) {
                    iArr2[0] = 0;
                    a(iArr);
                    return true;
                }
            }
            if (b(iArr)) {
                int i3 = iArr2[2];
                for (int i4 = iArr2[0]; i4 > 2; i4--) {
                    i3 -= iArr[i4];
                }
                if (b(iArr, iArr2[1], i3)) {
                    d(iArr);
                    iArr2[0] = 3;
                    return true;
                }
            }
            if (r3.h && a(iArr, true) && a(iArr, iArr2[1], iArr2[2], true)) {
                iArr2[0] = 0;
                a(iArr);
                return true;
            }
            d(iArr);
            iArr2[0] = 3;
        } else {
            int i5 = i2 + 1;
            iArr2[0] = i5;
            iArr[i5] = iArr[i5] + 1;
        }
        return false;
    }

    private e3[] a() throws com.huawei.hms.scankit.p.a {
        e3 e3Var = (e3) this.f16133b.get(0);
        e3 e3Var2 = (e3) this.f16133b.get(1);
        float[] fArr = e3Var.b() < e3Var2.b() ? new float[]{e3Var.b(), e3Var2.b()} : new float[]{e3Var2.b(), e3Var.b()};
        float[] fArr2 = e3Var.b() < e3Var2.b() ? new float[]{e3Var.c(), e3Var2.c()} : new float[]{e3Var2.c(), e3Var.c()};
        float fE = (e3Var.e() + e3Var2.e()) / 2.0f;
        float fE2 = ((e3Var.e() + e3Var2.e()) * 7.0f) / 1.5f;
        if (Math.abs(fArr[0] - fArr[1]) > fE2 && Math.abs(fArr2[0] - fArr2[1]) <= fE2) {
            float f2 = fArr[0];
            float f3 = fArr2[0];
            this.f16133b.add(new e3((f2 + f3) - fArr2[1], (f3 + fArr[1]) - f2, fE, false, 0));
        } else if (Math.abs(fArr[0] - fArr[1]) <= fE2 && Math.abs(fArr2[0] - fArr2[1]) > fE2) {
            float f4 = fArr[0];
            float f5 = fArr[1];
            if (f4 < f5) {
                float f6 = fArr2[0];
                float f7 = fArr2[1];
                this.f16133b.add(new e3((f6 + f5) - f7, (f7 + f5) - f4, fE, false, 0));
            } else {
                float f8 = fArr2[1];
                float f9 = fArr2[0];
                this.f16133b.add(new e3((f8 + f4) - f9, (f9 + f4) - f5, fE, false, 0));
            }
        } else if (Math.abs(fArr[0] - fArr[1]) > fE2 && Math.abs(fArr2[0] - fArr2[1]) > fE2) {
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr2[1];
            float f13 = fArr2[0];
            this.f16133b.add(new e3((((f10 + f11) + f12) - f13) / 2.0f, (((f13 + f12) + f10) - f11) / 2.0f, fE, false, 0));
        }
        if (this.f16133b.size() == 3) {
            return new e3[]{(e3) this.f16133b.get(0), (e3) this.f16133b.get(1), (e3) this.f16133b.get(2)};
        }
        throw com.huawei.hms.scankit.p.a.a();
    }

    private void a(int i2, int i3, int i4) {
        int i5;
        int[] iArr = new int[5];
        for (int i6 = i2 - 1; i6 < i3; i6 += i2) {
            a(iArr);
            int[] iArr2 = {0, i6, 0, i4, i2};
            int i7 = 0;
            while (i7 < i4) {
                iArr2[2] = i7;
                if (this.f16132a.b(i7, i6)) {
                    a(iArr, iArr2);
                } else {
                    if (b(iArr, iArr2)) {
                    }
                    i7++;
                }
                i7 = iArr2[2];
                i2 = iArr2[4];
                i7++;
            }
            if (b(iArr)) {
                i5 = i4;
                for (int i8 = iArr2[0]; i8 > 2; i8--) {
                    i5 -= iArr[i8];
                }
                b(iArr, i6, i5);
            } else {
                i5 = i4;
            }
            if (a(iArr, false) && a(iArr, i6, i5, false)) {
                i2 = 2;
            }
        }
    }

    private boolean a(int i2, int i3, int i4, int[] iArr) {
        boolean z;
        int i5;
        s sVar = this.f16132a;
        while (true) {
            z = true;
            if (i2 < 0 || !sVar.b(i2, i3)) {
                break;
            }
            iArr[2] = iArr[2] + 1;
            i2--;
        }
        if (i2 < 0) {
            return true;
        }
        while (i2 >= 0 && !sVar.b(i2, i3)) {
            int i6 = iArr[1];
            if (i6 > i4) {
                break;
            }
            iArr[1] = i6 + 1;
            i2--;
        }
        if (i2 >= 0 && iArr[1] <= i4) {
            while (true) {
                z = false;
                if (i2 < 0 || !sVar.b(i2, i3) || (i5 = iArr[0]) > i4) {
                    break;
                }
                iArr[0] = i5 + 1;
                i2--;
            }
        }
        return z;
    }

    protected final boolean a(int[] iArr, int i2, int i3, boolean z) {
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        int i8 = i4 + i5 + i6 + i7;
        int i9 = iArr[4];
        int i10 = i8 + i9;
        boolean z2 = h;
        boolean z3 = i;
        int i11 = z2 ? i5 + i5 + i6 + i7 + i9 : z3 ? i8 + i7 : i10;
        int iA = (int) a(iArr, i3);
        float fB = b(i2, iA, iArr[2], i11, z);
        boolean z4 = h;
        boolean z5 = i;
        if (!Float.isNaN(fB)) {
            float f2 = i11 / 7.0f;
            int i12 = (int) fB;
            float fA = a(iA, i12, iArr[2], i11, z);
            if (!Float.isNaN(fA) && (a(i12, (int) fA) || (z && (z2 || z3 || z4 || z5)))) {
                if (!z) {
                    for (int i13 = 0; i13 < this.f16133b.size(); i13++) {
                        e3 e3Var = (e3) this.f16133b.get(i13);
                        if (e3Var.b(f2, fB, fA)) {
                            this.f16133b.set(i13, e3Var.a(fB, fA, f2, true));
                            return true;
                        }
                    }
                    e3 e3Var2 = new e3(fA, fB, f2, true);
                    this.f16133b.add(e3Var2);
                    v6 v6Var = this.e;
                    if (v6Var != null) {
                        v6Var.a(e3Var2);
                    }
                    return true;
                }
                return a(false, fB, fA, f2);
            }
        }
        return false;
    }

    protected final boolean a(int[] iArr, int i2, int i3) {
        int i4 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        float fA = a(iArr, i3);
        float fB = b(i2, (int) fA, iArr[2], i4, false);
        if (Float.isNaN(fB)) {
            int i5 = iArr[2];
            float f2 = i5 / 2;
            int i6 = iArr[1];
            int i7 = iArr[3];
            fB = a(i2, (int) ((fA - f2) - (i6 / 2)), (int) (f2 + fA + (i7 / 2)), i6 + i5 + i7, i4);
        }
        if (Float.isNaN(fB)) {
            return false;
        }
        return a(false, fB, fA, i4 / 7.0f);
    }

    private void a(int[] iArr, int[] iArr2) {
        int i2 = iArr2[0];
        if ((i2 & 1) == 1) {
            iArr2[0] = i2 + 1;
        }
        int i3 = iArr2[0];
        if (i3 >= 0 && i3 < iArr.length) {
            iArr[i3] = iArr[i3] + 1;
        }
        if (iArr2[2] == iArr2[3] - 1 && iArr2[0] == 4) {
            if (a(iArr, false)) {
                boolean zA = a(iArr, iArr2[1], iArr2[2], false);
                if (zA) {
                    iArr2[4] = 2;
                }
                if (!zA) {
                    zA = a(iArr, iArr2[1], iArr2[2]);
                }
                if (zA) {
                    iArr2[0] = 0;
                    a(iArr);
                    while (iArr2[2] < this.f16132a.d() && !this.f16132a.b(iArr2[2], iArr2[1])) {
                        iArr2[2] = iArr2[2] + 1;
                    }
                }
            }
            if (r3.h && a(iArr, true) && a(iArr, iArr2[1], iArr2[2], true)) {
                iArr2[0] = 0;
                a(iArr);
            }
        }
    }

    protected static float a(int[] iArr, int[] iArr2, float f2) {
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            i2 += iArr[i4];
            i3 += iArr2[i4];
        }
        if (i2 < i3) {
            return Float.POSITIVE_INFINITY;
        }
        float f3 = i2;
        float f4 = f3 / i3;
        float f5 = 0.0f;
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = iArr[i5];
            float f6 = iArr2[i5] * f4;
            float f7 = i6;
            float f8 = f7 > f6 ? f7 - f6 : f6 - f7;
            if (f8 > f2 * f4) {
                return Float.POSITIVE_INFINITY;
            }
            f5 += f8;
        }
        return f5 / f3;
    }

    private boolean a(boolean z, float f2, float f3, float f4) {
        for (int i2 = 0; i2 < this.f16134c.size(); i2++) {
            e3 e3Var = (e3) this.f16134c.get(i2);
            if (e3Var.b(f4, f2, f3)) {
                this.f16134c.set(i2, e3Var.a(f2, f3, f4, false));
                return true;
            }
        }
        if (z) {
            return true;
        }
        e3 e3Var2 = new e3(f3, f2, f4, false);
        this.f16134c.add(e3Var2);
        v6 v6Var = this.e;
        if (v6Var == null) {
            return true;
        }
        v6Var.a(e3Var2);
        return true;
    }

    private static double a(e3 e3Var, e3 e3Var2) {
        double dB = e3Var.b() - e3Var2.b();
        double dC = e3Var.c() - e3Var2.c();
        return (dB * dB) + (dC * dC);
    }

    protected static boolean a(int[] iArr, boolean z) {
        float f2;
        float f3;
        e();
        int i2 = 0;
        for (int i3 = 0; i3 < 5; i3++) {
            int i4 = iArr[i3];
            if (i4 == 0) {
                return false;
            }
            i2 += i4;
        }
        if (i2 < 7) {
            return false;
        }
        if (z && r3.h) {
            f3 = 0.75f;
            f2 = 1.0f;
        } else {
            f2 = 3.0f;
            f3 = 0.5f;
        }
        float f4 = i2 / 7.0f;
        float f5 = f3 * f4;
        if (Math.abs(f4 - iArr[0]) < f5 && Math.abs(f4 - iArr[1]) < f5) {
            if (Math.abs((3.0f * f4) - iArr[2]) < f2 * f5 && Math.abs(f4 - iArr[3]) < f5 && Math.abs(f4 - iArr[4]) < f5) {
                return true;
            }
        }
        if (!z) {
            return false;
        }
        int[] iArr2 = new int[iArr.length - 1];
        int i5 = 0;
        while (i5 < iArr.length - 1) {
            int i6 = i5 + 1;
            iArr2[i5] = iArr[i6];
            i5 = i6;
        }
        int[] iArr3 = new int[iArr.length - 1];
        for (int i7 = 0; i7 < iArr.length - 1; i7++) {
            iArr3[i7] = iArr[i7];
        }
        float fA = a(iArr2, f, 0.5f);
        float fA2 = a(iArr3, g, 0.5f);
        boolean z2 = fA < 0.3f;
        h = z2;
        boolean z3 = fA2 < 0.3f;
        i = z3;
        return z2 || z3;
    }
}
