package defpackage;

import androidx.annotation.FloatRange;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes5.dex */
public class w43 extends s08 implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f37597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f37598b;
    public float c;
    public float d;
    public float e;
    public float f = -1.0f;

    public w43(float f, float f2, float f3) {
        this.f37598b = f;
        this.f37597a = f2;
        i(f3);
        this.e = 0.0f;
    }

    @Override // defpackage.s08
    public void b(float f, float f2, float f3, d3m d3mVar) {
        float f4;
        float f5;
        float f6 = this.c;
        if (f6 == 0.0f) {
            d3mVar.m(f, 0.0f);
            return;
        }
        float f7 = ((this.f37598b * 2.0f) + f6) / 2.0f;
        float f8 = f3 * this.f37597a;
        float f9 = f2 + this.e;
        float f10 = (this.d * f3) + ((1.0f - f3) * f7);
        if (f10 / f7 >= 1.0f) {
            d3mVar.m(f, 0.0f);
            return;
        }
        float f11 = this.f;
        float f12 = f11 * f3;
        boolean z = f11 == -1.0f || Math.abs((f11 * 2.0f) - f6) < 0.1f;
        if (z) {
            f4 = f10;
            f5 = 0.0f;
        } else {
            f5 = 1.75f;
            f4 = 0.0f;
        }
        float f13 = f7 + f8;
        float f14 = f4 + f8;
        float fSqrt = (float) Math.sqrt((f13 * f13) - (f14 * f14));
        float f15 = f9 - fSqrt;
        float f16 = f9 + fSqrt;
        float degrees = (float) Math.toDegrees(Math.atan(fSqrt / f14));
        float f17 = (90.0f - degrees) + f5;
        d3mVar.m(f15, 0.0f);
        float f18 = f8 * 2.0f;
        d3mVar.a(f15 - f8, 0.0f, f15 + f8, f18, 270.0f, degrees);
        if (z) {
            d3mVar.a(f9 - f7, (-f7) - f4, f9 + f7, f7 - f4, 180.0f - f17, (f17 * 2.0f) - 180.0f);
        } else {
            float f19 = this.f37598b;
            float f20 = f12 * 2.0f;
            float f21 = f9 - f7;
            d3mVar.a(f21, -(f12 + f19), f21 + f19 + f20, f19 + f12, 180.0f - f17, ((f17 * 2.0f) - 180.0f) / 2.0f);
            float f22 = f9 + f7;
            float f23 = this.f37598b;
            d3mVar.m(f22 - ((f23 / 2.0f) + f12), f23 + f12);
            float f24 = this.f37598b;
            d3mVar.a(f22 - (f20 + f24), -(f12 + f24), f22, f24 + f12, 90.0f, f17 - 90.0f);
        }
        d3mVar.a(f16 - f8, 0.0f, f16 + f8, f18, 270.0f - degrees, degrees);
        d3mVar.m(f, 0.0f);
    }

    public float c() {
        return this.d;
    }

    public float d() {
        return this.f;
    }

    public float e() {
        return this.f37598b;
    }

    public float f() {
        return this.f37597a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float g() {
        return this.c;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float h() {
        return this.e;
    }

    public void i(@FloatRange(from = 0.0d) float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.d = f;
    }

    public void j(float f) {
        this.f = f;
    }

    public void k(float f) {
        this.f37598b = f;
    }

    public void l(float f) {
        this.f37597a = f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void n(float f) {
        this.c = f;
    }

    public void p(float f) {
        this.e = f;
    }
}
