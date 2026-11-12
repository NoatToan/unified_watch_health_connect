package defpackage;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import androidx.annotation.FloatRange;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class e1e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lse f16152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f16153b;
    public T c;
    public final Interpolator d;
    public final Interpolator e;
    public final Interpolator f;
    public final float g;
    public Float h;
    public float i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f16154k;
    public int l;
    public float m;
    public float n;
    public PointF o;
    public PointF p;

    public e1e(lse lseVar, T t, T t2, Interpolator interpolator, float f, Float f2) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.f16154k = 784923401;
        this.l = 784923401;
        this.m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.o = null;
        this.p = null;
        this.f16152a = lseVar;
        this.f16153b = t;
        this.c = t2;
        this.d = interpolator;
        this.e = null;
        this.f = null;
        this.g = f;
        this.h = f2;
    }

    public boolean a(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        return f >= f() && f < c();
    }

    public e1e<T> b(T t, T t2) {
        return new e1e<>(t, t2);
    }

    public float c() {
        if (this.f16152a == null) {
            return 1.0f;
        }
        if (this.n == Float.MIN_VALUE) {
            if (this.h == null) {
                this.n = 1.0f;
            } else {
                this.n = f() + ((this.h.floatValue() - this.g) / this.f16152a.e());
            }
        }
        return this.n;
    }

    public float d() {
        if (this.j == -3987645.8f) {
            this.j = ((Float) this.c).floatValue();
        }
        return this.j;
    }

    public int e() {
        if (this.l == 784923401) {
            this.l = ((Integer) this.c).intValue();
        }
        return this.l;
    }

    public float f() {
        lse lseVar = this.f16152a;
        if (lseVar == null) {
            return 0.0f;
        }
        if (this.m == Float.MIN_VALUE) {
            this.m = (this.g - lseVar.p()) / this.f16152a.e();
        }
        return this.m;
    }

    public float g() {
        if (this.i == -3987645.8f) {
            this.i = ((Float) this.f16153b).floatValue();
        }
        return this.i;
    }

    public int h() {
        if (this.f16154k == 784923401) {
            this.f16154k = ((Integer) this.f16153b).intValue();
        }
        return this.f16154k;
    }

    public boolean i() {
        return this.d == null && this.e == null && this.f == null;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.f16153b + ", endValue=" + this.c + ", startFrame=" + this.g + ", endFrame=" + this.h + ", interpolator=" + this.d + AbstractJsonLexerKt.END_OBJ;
    }

    public e1e(lse lseVar, T t, T t2, Interpolator interpolator, Interpolator interpolator2, float f, Float f2) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.f16154k = 784923401;
        this.l = 784923401;
        this.m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.o = null;
        this.p = null;
        this.f16152a = lseVar;
        this.f16153b = t;
        this.c = t2;
        this.d = null;
        this.e = interpolator;
        this.f = interpolator2;
        this.g = f;
        this.h = f2;
    }

    public e1e(lse lseVar, T t, T t2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f, Float f2) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.f16154k = 784923401;
        this.l = 784923401;
        this.m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.o = null;
        this.p = null;
        this.f16152a = lseVar;
        this.f16153b = t;
        this.c = t2;
        this.d = interpolator;
        this.e = interpolator2;
        this.f = interpolator3;
        this.g = f;
        this.h = f2;
    }

    public e1e(T t) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.f16154k = 784923401;
        this.l = 784923401;
        this.m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.o = null;
        this.p = null;
        this.f16152a = null;
        this.f16153b = t;
        this.c = t;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = Float.MIN_VALUE;
        this.h = Float.valueOf(Float.MAX_VALUE);
    }

    public e1e(T t, T t2) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.f16154k = 784923401;
        this.l = 784923401;
        this.m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.o = null;
        this.p = null;
        this.f16152a = null;
        this.f16153b = t;
        this.c = t2;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = Float.MIN_VALUE;
        this.h = Float.valueOf(Float.MAX_VALUE);
    }
}
