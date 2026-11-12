package com.github.mikephil.charting.components;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import defpackage.fm8;
import defpackage.fmq;
import defpackage.hwq;
import defpackage.ka4;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class Legend extends ka4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.github.mikephil.charting.components.a[] f7784b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.github.mikephil.charting.components.a[] f7783a = new com.github.mikephil.charting.components.a[0];
    public boolean c = false;
    public LegendHorizontalAlignment d = LegendHorizontalAlignment.LEFT;
    public LegendVerticalAlignment e = LegendVerticalAlignment.BOTTOM;
    public LegendOrientation f = LegendOrientation.HORIZONTAL;
    public boolean g = false;
    public LegendDirection h = LegendDirection.LEFT_TO_RIGHT;
    public LegendForm i = LegendForm.SQUARE;
    public float j = 8.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f7785k = 3.0f;
    public DashPathEffect l = null;
    public float m = 6.0f;
    public float n = 0.0f;
    public float o = 5.0f;
    public float p = 3.0f;
    public float q = 0.95f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f7786r = 0.0f;
    public float s = 0.0f;
    public float t = 0.0f;
    public float u = 0.0f;
    public boolean v = false;
    public List<fm8> w = new ArrayList(16);
    public List<Boolean> x = new ArrayList(16);
    public List<fm8> y = new ArrayList(16);

    public enum LegendDirection {
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT
    }

    public enum LegendForm {
        NONE,
        EMPTY,
        DEFAULT,
        SQUARE,
        CIRCLE,
        LINE
    }

    public enum LegendHorizontalAlignment {
        LEFT,
        CENTER,
        RIGHT
    }

    public enum LegendOrientation {
        HORIZONTAL,
        VERTICAL
    }

    public enum LegendVerticalAlignment {
        TOP,
        CENTER,
        BOTTOM
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7787a;

        static {
            int[] iArr = new int[LegendOrientation.values().length];
            f7787a = iArr;
            try {
                iArr[LegendOrientation.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7787a[LegendOrientation.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public Legend() {
        this.mTextSize = fmq.e(10.0f);
        this.mXOffset = fmq.e(5.0f);
        this.mYOffset = fmq.e(3.0f);
    }

    public void A(float f) {
        this.n = f;
    }

    public void a(Paint paint, hwq hwqVar) {
        float f;
        float f2;
        float f3;
        float fE = fmq.e(this.j);
        float fE2 = fmq.e(this.p);
        float fE3 = fmq.e(this.o);
        float fE4 = fmq.e(this.m);
        float fE5 = fmq.e(this.n);
        boolean z = this.v;
        com.github.mikephil.charting.components.a[] aVarArr = this.f7783a;
        int length = aVarArr.length;
        this.u = p(paint);
        this.t = o(paint);
        int i = a.f7787a[this.f.ordinal()];
        if (i == 1) {
            float fK = fmq.k(paint);
            float fMax = 0.0f;
            float f4 = 0.0f;
            float fD = 0.0f;
            boolean z2 = false;
            for (int i2 = 0; i2 < length; i2++) {
                com.github.mikephil.charting.components.a aVar = aVarArr[i2];
                boolean z3 = aVar.f7796b != LegendForm.NONE;
                float fE6 = Float.isNaN(aVar.c) ? fE : fmq.e(aVar.c);
                String str = aVar.f7795a;
                if (!z2) {
                    fD = 0.0f;
                }
                if (z3) {
                    if (z2) {
                        fD += fE2;
                    }
                    fD += fE6;
                }
                if (str != null) {
                    if (z3 && !z2) {
                        fD += fE3;
                    } else if (z2) {
                        fMax = Math.max(fMax, fD);
                        f4 += fK + fE5;
                        fD = 0.0f;
                        z2 = false;
                    }
                    fD += fmq.d(paint, str);
                    f4 += fK + fE5;
                } else {
                    fD += fE6;
                    if (i2 < length - 1) {
                        fD += fE2;
                    }
                    z2 = true;
                }
                fMax = Math.max(fMax, fD);
            }
            this.f7786r = fMax;
            this.s = f4;
        } else if (i == 2) {
            float fK2 = fmq.k(paint);
            float fM = fmq.m(paint) + fE5;
            float fK3 = hwqVar.k() * this.q;
            this.x.clear();
            this.w.clear();
            this.y.clear();
            int i3 = 0;
            float fMax2 = 0.0f;
            int i4 = -1;
            float f5 = 0.0f;
            float f6 = 0.0f;
            while (i3 < length) {
                com.github.mikephil.charting.components.a aVar2 = aVarArr[i3];
                float f7 = fE;
                float f8 = fE4;
                boolean z4 = aVar2.f7796b != LegendForm.NONE;
                float fE7 = Float.isNaN(aVar2.c) ? f7 : fmq.e(aVar2.c);
                String str2 = aVar2.f7795a;
                com.github.mikephil.charting.components.a[] aVarArr2 = aVarArr;
                float f9 = fM;
                this.x.add(Boolean.FALSE);
                float f10 = i4 == -1 ? 0.0f : f5 + fE2;
                if (str2 != null) {
                    f = fE2;
                    this.w.add(fmq.b(paint, str2));
                    f2 = f10 + (z4 ? fE3 + fE7 : 0.0f) + this.w.get(i3).c;
                } else {
                    f = fE2;
                    float f11 = fE7;
                    this.w.add(fm8.b(0.0f, 0.0f));
                    f2 = f10 + (z4 ? f11 : 0.0f);
                    if (i4 == -1) {
                        i4 = i3;
                    }
                }
                if (str2 != null || i3 == length - 1) {
                    float f12 = f6;
                    float f13 = f12 == 0.0f ? 0.0f : f8;
                    if (!z || f12 == 0.0f || fK3 - f12 >= f13 + f2) {
                        f3 = f12 + f13 + f2;
                    } else {
                        this.y.add(fm8.b(f12, fK2));
                        fMax2 = Math.max(fMax2, f12);
                        this.x.set(i4 > -1 ? i4 : i3, Boolean.TRUE);
                        f3 = f2;
                    }
                    if (i3 == length - 1) {
                        this.y.add(fm8.b(f3, fK2));
                        fMax2 = Math.max(fMax2, f3);
                    }
                    f6 = f3;
                }
                if (str2 != null) {
                    i4 = -1;
                }
                i3++;
                fE2 = f;
                fE = f7;
                fE4 = f8;
                fM = f9;
                f5 = f2;
                aVarArr = aVarArr2;
            }
            float f14 = fM;
            this.f7786r = fMax2;
            this.s = (fK2 * this.y.size()) + (f14 * (this.y.size() == 0 ? 0 : this.y.size() - 1));
        }
        this.s += this.mYOffset;
        this.f7786r += this.mXOffset;
    }

    public List<Boolean> b() {
        return this.x;
    }

    public List<fm8> c() {
        return this.w;
    }

    public List<fm8> d() {
        return this.y;
    }

    public LegendDirection e() {
        return this.h;
    }

    public com.github.mikephil.charting.components.a[] f() {
        return this.f7783a;
    }

    public com.github.mikephil.charting.components.a[] g() {
        return this.f7784b;
    }

    public LegendForm h() {
        return this.i;
    }

    public DashPathEffect i() {
        return this.l;
    }

    public float j() {
        return this.f7785k;
    }

    public float k() {
        return this.j;
    }

    public float l() {
        return this.o;
    }

    public LegendHorizontalAlignment m() {
        return this.d;
    }

    public float n() {
        return this.q;
    }

    public float o(Paint paint) {
        float f = 0.0f;
        for (com.github.mikephil.charting.components.a aVar : this.f7783a) {
            String str = aVar.f7795a;
            if (str != null) {
                float fA = fmq.a(paint, str);
                if (fA > f) {
                    f = fA;
                }
            }
        }
        return f;
    }

    public float p(Paint paint) {
        float fE = fmq.e(this.o);
        float f = 0.0f;
        float f2 = 0.0f;
        for (com.github.mikephil.charting.components.a aVar : this.f7783a) {
            float fE2 = fmq.e(Float.isNaN(aVar.c) ? this.j : aVar.c);
            if (fE2 > f2) {
                f2 = fE2;
            }
            String str = aVar.f7795a;
            if (str != null) {
                float fD = fmq.d(paint, str);
                if (fD > f) {
                    f = fD;
                }
            }
        }
        return f + f2 + fE;
    }

    public LegendOrientation q() {
        return this.f;
    }

    public float r() {
        return this.p;
    }

    public LegendVerticalAlignment s() {
        return this.e;
    }

    public float t() {
        return this.m;
    }

    public float u() {
        return this.n;
    }

    public boolean v() {
        return this.g;
    }

    public boolean w() {
        return this.c;
    }

    public void x(List<com.github.mikephil.charting.components.a> list) {
        this.f7783a = (com.github.mikephil.charting.components.a[]) list.toArray(new com.github.mikephil.charting.components.a[list.size()]);
    }

    public void y(LegendForm legendForm) {
        this.i = legendForm;
    }

    public void z(float f) {
        this.j = f;
    }
}
