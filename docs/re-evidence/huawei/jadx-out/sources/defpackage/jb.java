package defpackage;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes21.dex */
public class jb<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Float f38327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T f38328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PointF f38329c;
    public final Interpolator d;
    public PointF e;
    public final Interpolator f;
    public final Interpolator g;
    public final float h;
    private final cx i;
    public final T j;
    private float k;
    private float l;
    private float m;
    private int n;
    private float o;
    private int q;

    public jb(cx cxVar, T t, T t2, Interpolator interpolator, float f, Float f2) {
        this.l = -3987645.8f;
        this.o = -3987645.8f;
        this.q = 784923401;
        this.n = 784923401;
        this.k = Float.MIN_VALUE;
        this.m = Float.MIN_VALUE;
        this.f38329c = null;
        this.e = null;
        this.i = cxVar;
        this.j = t;
        this.f38328b = t2;
        this.d = interpolator;
        this.g = null;
        this.f = null;
        this.h = f;
        this.f38327a = f2;
    }

    public jb(cx cxVar, T t, T t2, Interpolator interpolator, Interpolator interpolator2, float f, Float f2) {
        this.l = -3987645.8f;
        this.o = -3987645.8f;
        this.q = 784923401;
        this.n = 784923401;
        this.k = Float.MIN_VALUE;
        this.m = Float.MIN_VALUE;
        this.f38329c = null;
        this.e = null;
        this.i = cxVar;
        this.j = t;
        this.f38328b = t2;
        this.d = null;
        this.g = interpolator;
        this.f = interpolator2;
        this.h = f;
        this.f38327a = f2;
    }

    protected jb(cx cxVar, T t, T t2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f, Float f2) {
        this.l = -3987645.8f;
        this.o = -3987645.8f;
        this.q = 784923401;
        this.n = 784923401;
        this.k = Float.MIN_VALUE;
        this.m = Float.MIN_VALUE;
        this.f38329c = null;
        this.e = null;
        this.i = cxVar;
        this.j = t;
        this.f38328b = t2;
        this.d = interpolator;
        this.g = interpolator2;
        this.f = interpolator3;
        this.h = f;
        this.f38327a = f2;
    }

    public jb(T t) {
        this.l = -3987645.8f;
        this.o = -3987645.8f;
        this.q = 784923401;
        this.n = 784923401;
        this.k = Float.MIN_VALUE;
        this.m = Float.MIN_VALUE;
        this.f38329c = null;
        this.e = null;
        this.i = null;
        this.j = t;
        this.f38328b = t;
        this.d = null;
        this.g = null;
        this.f = null;
        this.h = Float.MIN_VALUE;
        this.f38327a = Float.valueOf(Float.MAX_VALUE);
    }

    private jb(T t, T t2) {
        this.l = -3987645.8f;
        this.o = -3987645.8f;
        this.q = 784923401;
        this.n = 784923401;
        this.k = Float.MIN_VALUE;
        this.m = Float.MIN_VALUE;
        this.f38329c = null;
        this.e = null;
        this.i = null;
        this.j = t;
        this.f38328b = t2;
        this.d = null;
        this.g = null;
        this.f = null;
        this.h = Float.MIN_VALUE;
        this.f38327a = Float.valueOf(Float.MAX_VALUE);
    }

    public jb<T> e(T t, T t2) {
        return new jb<>(t, t2);
    }

    public float g() {
        cx cxVar = this.i;
        if (cxVar == null) {
            return 0.0f;
        }
        if (this.k == Float.MIN_VALUE) {
            this.k = (this.h - cxVar.l()) / this.i.d();
        }
        return this.k;
    }

    public float c() {
        if (this.i == null) {
            return 1.0f;
        }
        if (this.m == Float.MIN_VALUE) {
            if (this.f38327a == null) {
                this.m = 1.0f;
            } else {
                this.m = g() + ((this.f38327a.floatValue() - this.h) / this.i.d());
            }
        }
        return this.m;
    }

    public boolean i() {
        return this.d == null && this.g == null && this.f == null;
    }

    public boolean c(float f) {
        return f >= g() && f < c();
    }

    public float j() {
        if (this.l == -3987645.8f) {
            this.l = ((Float) this.j).floatValue();
        }
        return this.l;
    }

    public float d() {
        if (this.o == -3987645.8f) {
            this.o = ((Float) this.f38328b).floatValue();
        }
        return this.o;
    }

    public int h() {
        if (this.q == 784923401) {
            this.q = ((Integer) this.j).intValue();
        }
        return this.q;
    }

    public int b() {
        if (this.n == 784923401) {
            this.n = ((Integer) this.f38328b).intValue();
        }
        return this.n;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.j + ", endValue=" + this.f38328b + ", startFrame=" + this.h + ", endFrame=" + this.f38327a + ", interpolator=" + this.d + '}';
    }
}
