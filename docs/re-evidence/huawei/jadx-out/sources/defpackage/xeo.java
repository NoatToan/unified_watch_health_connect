package defpackage;

import android.graphics.RectF;
import java.lang.reflect.Array;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes20.dex */
public class xeo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f52786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f52787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f52788c;
    private int d;
    private int e;
    private int f;
    private float g;
    private float h;
    private float[] i;
    private float j;
    private float k;
    private int l;
    private float m;
    private int n;
    private float o;
    private float[][] p;
    private boolean t;
    private float[][] u;
    private float[][] v;
    private float[][] x;
    private ConcurrentHashMap<Integer, Float> y;
    private int r = -1;
    private RectF s = new RectF();
    private RectF q = new RectF();

    public boolean a() {
        return this.f52788c;
    }

    public float aa() {
        return this.m;
    }

    public int ab() {
        return this.f52787b;
    }

    public int ad() {
        return this.f52786a;
    }

    public ConcurrentHashMap<Integer, Float> b() {
        return this.y;
    }

    public void b(RectF rectF) {
        if (rectF == null) {
            return;
        }
        if (this.s == null) {
            this.s = new RectF();
        }
        RectF rectF2 = this.s;
        rectF2.left = rectF.left;
        rectF2.top = rectF.top;
        rectF2.right = rectF.right;
        rectF2.bottom = rectF.bottom;
    }

    public int c() {
        return this.r;
    }

    public void c(float[] fArr) {
        this.i = fArr;
    }

    public int d() {
        return this.n;
    }

    public boolean e() {
        return this.t;
    }

    public float f() {
        return this.g;
    }

    public void g(float f) {
        this.k = f;
    }

    public boolean h() {
        ConcurrentHashMap<Integer, Float> concurrentHashMap = this.y;
        return concurrentHashMap == null || concurrentHashMap.size() == 0;
    }

    public xeo i() {
        xeo xeoVar = new xeo();
        xeoVar.r(ab());
        xeoVar.t(ad());
        xeoVar.c(j());
        xeoVar.c(f());
        xeoVar.a(m());
        xeoVar.m(aa());
        xeoVar.q(c());
        xeoVar.c(a());
        xeoVar.s(z());
        xeoVar.i(v());
        xeoVar.d(k());
        xeoVar.p(d());
        xeoVar.n(y());
        xeoVar.e(l());
        xeoVar.d(o());
        xeoVar.b(u());
        xeoVar.c(n());
        xeoVar.g(x());
        if (w() != null && xeoVar.w() != null) {
            RectF rectFW = xeoVar.w();
            RectF rectFW2 = w();
            rectFW.left = rectFW2.left;
            rectFW.top = rectFW2.top;
            rectFW.right = rectFW2.right;
            rectFW.bottom = rectFW2.bottom;
        }
        if (r() != null && xeoVar.r() != null) {
            RectF rectFR = xeoVar.r();
            RectF rectFR2 = r();
            rectFR.left = rectFR2.left;
            rectFR.top = rectFR2.top;
            rectFR.right = rectFR2.right;
            rectFR.bottom = rectFR2.bottom;
        }
        return xeoVar;
    }

    public void i(float f) {
        this.o = f;
    }

    public void j(float f) {
        ac();
        if (this.f52788c) {
            this.q.left = f;
        } else {
            this.q.right = f;
        }
    }

    public float[] j() {
        return this.i;
    }

    public float k() {
        return this.h;
    }

    public void k(int i) {
        this.f = i;
    }

    public void l(int i) {
        this.e = i;
    }

    public float m() {
        return this.j;
    }

    public void m(float f) {
        this.m = f;
    }

    public void n(int i) {
        this.l = i;
    }

    public void o(float f) {
        ac();
        this.q.bottom = f;
    }

    public RectF r() {
        return this.q;
    }

    public void r(int i) {
        this.f52787b = i;
    }

    public void s(int i) {
        if (i > 0) {
            this.d = i;
        }
    }

    public void t(int i) {
        this.f52786a = i;
    }

    public RectF w() {
        return this.s;
    }

    public int z() {
        return this.d;
    }

    public void a(float f) {
        this.j = f;
    }

    public void a(RectF rectF) {
        this.q = rectF;
    }

    public void d(float f) {
        this.h = f;
    }

    public void f(float f) {
        ac();
        if (this.f52788c) {
            this.q.right = f;
        } else {
            this.q.left = f;
        }
    }

    public void h(float f) {
        ac();
        this.q.top = f;
    }

    public void m(int i) {
        ConcurrentHashMap<Integer, Float> concurrentHashMap = this.y;
        if (concurrentHashMap != null) {
            concurrentHashMap.remove(Integer.valueOf(i));
        }
    }

    public float[][] n() {
        return this.v;
    }

    public float[][] o() {
        return this.u;
    }

    public float p() {
        RectF rectF = this.q;
        if (rectF != null) {
            return this.f52788c ? rectF.left : rectF.right;
        }
        return 0.0f;
    }

    public void p(int i) {
        this.n = i;
    }

    public void q(int i) {
        this.r = i;
    }

    public float s() {
        RectF rectF = this.q;
        if (rectF != null) {
            return this.f52788c ? rectF.right : rectF.left;
        }
        return 0.0f;
    }

    public float t() {
        RectF rectF = this.q;
        if (rectF != null) {
            return rectF.top;
        }
        return 0.0f;
    }

    public float[][] u() {
        return this.x;
    }

    public float v() {
        return this.o;
    }

    public float x() {
        return this.k;
    }

    public int y() {
        return this.l;
    }

    public void b(float[][] fArr) {
        this.x = fArr;
    }

    public float[] c(boolean z, int i) {
        float fE;
        float[] fArr = new float[this.d];
        for (int i2 = 0; i2 < this.d; i2++) {
            if (z) {
                fE = d(i2, i);
            } else {
                fE = e(i2, i);
            }
            fArr[i2] = fE;
        }
        return fArr;
    }

    public void e(float f, float f2, float f3, float f4) {
        f(f);
        h(f2);
        j(f3);
        o(f4);
    }

    public float g(int i) {
        int iY = y(i);
        if (b(this.v, iY)) {
            return 0.0f;
        }
        return this.v[iY][this.f52788c ? 1 : 0];
    }

    public float[] i(int i) {
        float[] fArr = new float[this.d];
        for (int i2 = 0; i2 < this.d; i2++) {
            fArr[i2] = d(i2, i);
        }
        return fArr;
    }

    public float q() {
        RectF rectF = this.q;
        if (rectF != null) {
            return rectF.bottom;
        }
        return 0.0f;
    }

    public float d(int i) {
        int iY = y(i);
        if (b(this.x, iY)) {
            return 0.0f;
        }
        return this.x[iY][2];
    }

    public float f(int i) {
        int iY = y(i);
        if (b(this.v, iY)) {
            return 0.0f;
        }
        return this.v[iY][!this.f52788c ? 1 : 0];
    }

    public float[] o(int i) {
        float[] fArr = new float[this.d];
        for (int i2 = 0; i2 < this.d; i2++) {
            fArr[i2] = e(i2, i);
        }
        return fArr;
    }

    private int y(int i) {
        return this.f52788c ? (this.d - 1) - i : i;
    }

    public float[][] l() {
        return this.p;
    }

    public float c(int i) {
        int iY = y(i);
        if (b(this.x, iY)) {
            return 0.0f;
        }
        return this.x[iY][!this.f52788c ? 1 : 0];
    }

    public void e(float[][] fArr) {
        this.p = fArr;
    }

    public float h(int i) {
        int iY = y(i);
        if (b(this.v, iY)) {
            return 0.0f;
        }
        return this.v[iY][2];
    }

    public float j(int i) {
        int iY = y(i);
        if (b(this.x, iY)) {
            return 0.0f;
        }
        return this.x[iY][this.f52788c ? 1 : 0];
    }

    public boolean e(boolean z, int i, float[] fArr) {
        if (this.p == null || this.u == null || fArr == null || fArr.length != this.d) {
            return true;
        }
        for (int i2 = 0; i2 < this.d; i2++) {
            if (i != i2) {
                if (Math.abs((z ? d(i2, i) : e(i2, i)) - fArr[i2]) > 1.0f) {
                    return false;
                }
            }
        }
        return true;
    }

    public void d(float f, float f2, float f3, float f4) {
        if (this.s == null) {
            this.s = new RectF();
        }
        RectF rectF = this.s;
        rectF.left = f;
        rectF.top = f2;
        rectF.right = f3;
        rectF.bottom = f4;
    }

    public float e(boolean z, int i) {
        return z ? j(i) : g(i);
    }

    public void a(int i, float f) {
        float[] fArr = this.i;
        if (fArr == null || i < 0 || i >= fArr.length) {
            return;
        }
        fArr[i] = f;
    }

    public void b(boolean z) {
        this.t = z;
    }

    public void d(float[][] fArr) {
        this.u = fArr;
    }

    public boolean b(boolean z, int i, float f, float f2) {
        float fE = e(z, i);
        float fD = d(z, i);
        float fAbs = Math.abs(fE - f);
        float fAbs2 = Math.abs(fD - f2);
        float fAbs3 = Math.abs(fD - fE) / 8.0f;
        return (Float.compare(fAbs, fAbs3) < 0) && (Float.compare(fAbs2, fAbs3) < 0);
    }

    public void g() {
        ConcurrentHashMap<Integer, Float> concurrentHashMap = this.y;
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
        }
    }

    public void e(float f) {
        int i = this.d;
        float[][] fArr = (float[][]) Array.newInstance((Class<?>) Float.TYPE, i, 3);
        this.u = fArr;
        float[][] fArr2 = (float[][]) Array.newInstance((Class<?>) Float.TYPE, i, 3);
        this.v = fArr2;
        float[] fArr3 = fArr2[0];
        fArr3[0] = f;
        float f2 = this.k;
        fArr3[1] = f + f2;
        float f3 = (f2 / 2.0f) + f;
        fArr3[2] = f3;
        float[] fArr4 = fArr[0];
        fArr4[1] = (this.h / 2.0f) + f;
        fArr4[0] = f3;
        fArr4[2] = f3;
        int i2 = 1;
        while (true) {
            int i3 = this.d;
            if (i2 >= i3) {
                return;
            }
            float[][] fArr5 = this.v;
            float[] fArr6 = fArr5[i2];
            int i4 = i2 - 1;
            float[] fArr7 = fArr5[i4];
            float f4 = fArr7[0];
            int i5 = this.n;
            float f5 = i5;
            float f6 = this.h;
            fArr6[0] = f4 + f5 + f6;
            fArr6[1] = fArr7[1] + f5 + f6;
            fArr6[2] = fArr7[2] + f5 + f6;
            float[][] fArr8 = this.u;
            float[] fArr9 = fArr8[i2];
            fArr9[1] = fArr8[i4][1] + f5 + f6;
            float f7 = (i5 * i2) + f;
            float f8 = this.k;
            float f9 = (i2 * f6) + f7 + (f8 / 2.0f);
            fArr9[0] = f9;
            fArr9[2] = f7 + f8 + (f6 / 2.0f) + (i4 * f6);
            if (i2 == i3 - 1) {
                fArr9[1] = f9;
            }
            i2++;
        }
    }

    public void b(int i, float f) {
        if (this.y == null) {
            this.y = new ConcurrentHashMap<>();
        }
        this.y.put(Integer.valueOf(i), Float.valueOf(f));
    }

    public void b(float f) {
        int i = this.d;
        float[][] fArr = (float[][]) Array.newInstance((Class<?>) Float.TYPE, i, 3);
        this.p = fArr;
        float[][] fArr2 = (float[][]) Array.newInstance((Class<?>) Float.TYPE, i, 3);
        this.x = fArr2;
        float[] fArr3 = fArr2[0];
        fArr3[0] = f;
        float f2 = this.o;
        float f3 = f + f2;
        fArr3[1] = f3;
        fArr3[2] = (f3 + f) / 2.0f;
        float[] fArr4 = fArr[0];
        float f4 = this.j;
        fArr4[1] = f + f4;
        float f5 = (f2 / 2.0f) + f;
        fArr4[0] = f5;
        fArr4[2] = f5;
        float f6 = f4 * 2.0f;
        int i2 = 1;
        while (true) {
            int i3 = this.d;
            if (i2 >= i3) {
                return;
            }
            float[][] fArr5 = this.x;
            float[] fArr6 = fArr5[i2];
            int i4 = i2 - 1;
            float[] fArr7 = fArr5[i4];
            float f7 = fArr7[0];
            int i5 = this.l;
            float f8 = i5;
            fArr6[0] = f7 + f8 + f6;
            fArr6[1] = fArr7[1] + f8 + f6;
            fArr6[2] = fArr7[2] + f8 + f6;
            float[][] fArr8 = this.p;
            float[] fArr9 = fArr8[i2];
            fArr9[1] = fArr8[i4][1] + f8 + f6;
            float f9 = (i5 * i2) + f;
            float f10 = this.o;
            float f11 = (i2 * f6) + f9 + (f10 / 2.0f);
            fArr9[0] = f11;
            fArr9[2] = f9 + f10 + this.j + (i4 * f6);
            if (i2 == i3 - 1) {
                fArr9[1] = f11;
            }
            i2++;
        }
    }

    public void c(boolean z) {
        this.f52788c = z;
    }

    public void c(float f) {
        this.g = f;
    }

    public void c(float[][] fArr) {
        this.v = fArr;
    }

    public float a(int i) {
        int iY = y(i);
        if (b(this.u, iY)) {
            return 0.0f;
        }
        return this.u[iY][this.f52788c ? (char) 2 : (char) 1];
    }

    public float d(boolean z, int i) {
        return z ? c(i) : f(i);
    }

    public float e(int i, int i2) {
        int iY = y(i);
        if (b(this.u, iY)) {
            return 0.0f;
        }
        if (i > i2) {
            return this.u[iY][this.f52788c ? (char) 1 : (char) 2];
        }
        if (i < i2) {
            return this.u[iY][this.f52788c ? (char) 2 : (char) 1];
        }
        return this.u[iY][0];
    }

    public float[] b(boolean z, int i) {
        return z ? i(i) : o(i);
    }

    public float b(int i) {
        int iY = y(i);
        if (b(this.u, iY)) {
            return 0.0f;
        }
        return this.u[iY][this.f52788c ? (char) 1 : (char) 2];
    }

    public float d(int i, int i2) {
        int iY = y(i);
        if (b(this.p, iY)) {
            return 0.0f;
        }
        if (i > i2) {
            return this.p[iY][this.f52788c ? (char) 1 : (char) 2];
        }
        if (i < i2) {
            return this.p[iY][this.f52788c ? (char) 2 : (char) 1];
        }
        return this.p[iY][0];
    }

    public float a(boolean z, int i) {
        return z ? d(i) : h(i);
    }

    public float e(int i) {
        int iY = y(i);
        if (b(this.u, iY)) {
            return 0.0f;
        }
        return this.u[iY][0];
    }

    public float d(boolean z) {
        if (z) {
            return (this.o / 2.0f) - this.j;
        }
        return (this.k - this.h) / 2.0f;
    }

    private boolean b(float[][] fArr, int i) {
        return fArr == null || i < 0 || i >= fArr.length;
    }

    private void ac() {
        if (this.q == null) {
            this.q = new RectF();
        }
    }
}
