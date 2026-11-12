package com.huawei.hms.scankit.p;

import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public class b6 {
    private static final Object r = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f16001c;
    private long d;
    private boolean e;
    private float f;
    private int[] g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private Path n;
    private PathMeasure o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f15999a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f16000b = new ArrayList();
    private boolean m = false;
    private x5 p = new x5();
    private z5 q = new z5();

    public b6(int i, long j) {
        a(i, j);
        a((Bitmap) null);
    }

    private void a(long j) {
        PathMeasure pathMeasure;
        w5 w5Var = (w5) this.f15999a.remove(0);
        this.q.a(w5Var);
        if (this.m && (pathMeasure = this.o) != null) {
            float[] fArrA = a(0.0f, pathMeasure.getLength());
            w5Var.a(this.d, (int) fArrA[0], (int) fArrA[1], j, this.p);
        } else {
            w5Var.a(this.d, a(this.j, this.i), a(this.l, this.k), j, this.p);
        }
        synchronized (r) {
            this.f16000b.add(w5Var);
            this.h++;
        }
    }

    public List c() {
        List listUnmodifiableList;
        synchronized (r) {
            listUnmodifiableList = Collections.unmodifiableList(this.f16000b);
        }
        return listUnmodifiableList;
    }

    private void b() {
        ArrayList arrayList;
        synchronized (r) {
            arrayList = new ArrayList(this.f16000b);
        }
        this.f15999a.addAll(arrayList);
    }

    private void a(f4 f4Var) {
        if (this.p == null) {
            this.p = new x5();
        }
        this.p.a(f4Var);
    }

    public void b(long j) {
        boolean z = this.e;
        float f = this.f;
        float f2 = j;
        ArrayList arrayList = new ArrayList();
        synchronized (r) {
            while (z) {
                if (this.f15999a.isEmpty() || this.h >= f * f2) {
                    break;
                } else {
                    a(j);
                }
            }
            Iterator it = this.f16000b.iterator();
            while (it.hasNext()) {
                w5 w5Var = (w5) it.next();
                if (!w5Var.a(j)) {
                    it.remove();
                    arrayList.add(w5Var);
                }
            }
        }
        this.f15999a.addAll(arrayList);
    }

    private void a(g4 g4Var) {
        if (this.q == null) {
            this.q = new z5();
        }
        this.q.a(g4Var);
    }

    public b6 b(float f, float f2) {
        a(new a6(f, f2));
        return this;
    }

    public void a() {
        b();
    }

    private void a(Rect rect) {
        int i = rect.left - this.g[0];
        this.j = i;
        this.i = i + rect.width();
        int i2 = rect.top - this.g[1];
        this.l = i2;
        this.k = i2 + rect.height();
    }

    public void a(Rect rect, int i) {
        a(rect);
        a(i);
    }

    private int a(int i, int i2) {
        if (i == i2) {
            return i;
        }
        if (i < i2) {
            return n6.a(i2 - i) + i;
        }
        return n6.a(i - i2) + i2;
    }

    private float[] a(float f, float f2) {
        if (Float.compare(f, f2) <= 0) {
            f2 = n6.a(f2 - f);
        } else {
            f = n6.a(f - f2);
        }
        float f3 = f2 + f;
        if (this.o == null) {
            this.o = new PathMeasure(this.n, true);
        }
        float[] fArr = new float[2];
        this.o.getPosTan(f3, fArr, null);
        float f4 = fArr[0];
        int[] iArr = this.g;
        fArr[0] = f4 - iArr[0];
        fArr[1] = fArr[1] - iArr[1];
        return fArr;
    }

    private void a(int i, long j) {
        this.g = new int[2];
        this.f16001c = i;
        this.d = j;
    }

    private void a(Bitmap bitmap) {
        for (int i = 0; i < this.f16001c; i++) {
            this.f15999a.add(new w5(bitmap));
        }
    }

    public b6 a(int i, int i2, long j, long j2, Interpolator interpolator) {
        a(new j5(i, i2, j, j2, interpolator));
        return this;
    }

    private void a(int i) {
        synchronized (r) {
            this.h = 0;
        }
        this.f = i / 1000.0f;
        this.e = true;
    }
}
