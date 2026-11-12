package defpackage;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public abstract class uzd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public hd5 f36309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f36310b;
    public String c;
    public int d = 0;
    public String e = null;
    public int f = 0;
    public ArrayList<c> g = new ArrayList<>();

    public class a implements Comparator<c> {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            return Integer.compare(cVar.f36315a, cVar2.f36315a);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f36312a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public pch f36313b;
        public final int c;
        public final int d;
        public final int e;
        public float[] f;
        public double[] g;
        public float[] h;
        public float[] i;
        public float[] j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float[] f36314k;
        public int l;
        public hd5 m;
        public double[] n;
        public double[] o;
        public float p;

        public b(int i, String str, int i2, int i3) {
            pch pchVar = new pch();
            this.f36313b = pchVar;
            this.c = 0;
            this.d = 1;
            this.e = 2;
            this.l = i;
            this.f36312a = i2;
            pchVar.g(i, str);
            this.f = new float[i3];
            this.g = new double[i3];
            this.h = new float[i3];
            this.i = new float[i3];
            this.j = new float[i3];
            this.f36314k = new float[i3];
        }

        public double a(float f) {
            hd5 hd5Var = this.m;
            if (hd5Var != null) {
                double d = f;
                hd5Var.g(d, this.o);
                this.m.d(d, this.n);
            } else {
                double[] dArr = this.o;
                dArr[0] = 0.0d;
                dArr[1] = 0.0d;
                dArr[2] = 0.0d;
            }
            double d2 = f;
            double dE = this.f36313b.e(d2, this.n[1]);
            double d3 = this.f36313b.d(d2, this.n[1], this.o[1]);
            double[] dArr2 = this.o;
            return dArr2[0] + (dE * dArr2[2]) + (d3 * this.n[2]);
        }

        public double b(float f) {
            hd5 hd5Var = this.m;
            if (hd5Var != null) {
                hd5Var.d(f, this.n);
            } else {
                double[] dArr = this.n;
                dArr[0] = this.i[0];
                dArr[1] = this.j[0];
                dArr[2] = this.f[0];
            }
            double[] dArr2 = this.n;
            return dArr2[0] + (this.f36313b.e(f, dArr2[1]) * this.n[2]);
        }

        public void c(int i, int i2, float f, float f2, float f3, float f4) {
            this.g[i] = ((double) i2) / 100.0d;
            this.h[i] = f;
            this.i[i] = f2;
            this.j[i] = f3;
            this.f[i] = f4;
        }

        public void d(float f) {
            this.p = f;
            double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, this.g.length, 3);
            float[] fArr = this.f;
            this.n = new double[fArr.length + 2];
            this.o = new double[fArr.length + 2];
            if (this.g[0] > 0.0d) {
                this.f36313b.a(0.0d, this.h[0]);
            }
            double[] dArr2 = this.g;
            int length = dArr2.length - 1;
            if (dArr2[length] < 1.0d) {
                this.f36313b.a(1.0d, this.h[length]);
            }
            for (int i = 0; i < dArr.length; i++) {
                double[] dArr3 = dArr[i];
                dArr3[0] = this.i[i];
                dArr3[1] = this.j[i];
                dArr3[2] = this.f[i];
                this.f36313b.a(this.g[i], this.h[i]);
            }
            this.f36313b.f();
            double[] dArr4 = this.g;
            if (dArr4.length > 1) {
                this.m = hd5.a(0, dArr4, dArr);
            } else {
                this.m = null;
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f36315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f36316b;
        public float c;
        public float d;
        public float e;

        public c(int i, float f, float f2, float f3, float f4) {
            this.f36315a = i;
            this.f36316b = f4;
            this.c = f2;
            this.d = f;
            this.e = f3;
        }
    }

    public float a(float f) {
        return (float) this.f36310b.b(f);
    }

    public float b(float f) {
        return (float) this.f36310b.a(f);
    }

    public void c(Object obj) {
    }

    public void d(int i, int i2, String str, int i3, float f, float f2, float f3, float f4) {
        this.g.add(new c(i, f, f2, f3, f4));
        if (i3 != -1) {
            this.f = i3;
        }
        this.d = i2;
        this.e = str;
    }

    public void e(int i, int i2, String str, int i3, float f, float f2, float f3, float f4, Object obj) {
        this.g.add(new c(i, f, f2, f3, f4));
        if (i3 != -1) {
            this.f = i3;
        }
        this.d = i2;
        c(obj);
        this.e = str;
    }

    public void f(String str) {
        this.c = str;
    }

    public void g(float f) {
        int size = this.g.size();
        if (size == 0) {
            return;
        }
        Collections.sort(this.g, new a());
        double[] dArr = new double[size];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, 3);
        this.f36310b = new b(this.d, this.e, this.f, size);
        int i = 0;
        for (c cVar : this.g) {
            float f2 = cVar.d;
            dArr[i] = ((double) f2) * 0.01d;
            double[] dArr3 = dArr2[i];
            float f3 = cVar.f36316b;
            dArr3[0] = f3;
            float f4 = cVar.c;
            dArr3[1] = f4;
            float f5 = cVar.e;
            dArr3[2] = f5;
            this.f36310b.c(i, cVar.f36315a, f2, f4, f5, f3);
            i++;
        }
        this.f36310b.d(f);
        this.f36309a = hd5.a(0, dArr, dArr2);
    }

    public boolean h() {
        return this.f == 1;
    }

    public String toString() {
        String str = this.c;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (c cVar : this.g) {
            str = str + "[" + cVar.f36315a + " , " + decimalFormat.format(cVar.f36316b) + "] ";
        }
        return str;
    }
}
