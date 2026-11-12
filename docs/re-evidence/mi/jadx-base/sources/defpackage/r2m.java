package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.annotation.Dimension;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes5.dex */
public class r2m {
    public static final sl4 m = new qgk(0.5f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public tl4 f32115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public tl4 f32116b;
    public tl4 c;
    public tl4 d;
    public sl4 e;
    public sl4 f;
    public sl4 g;
    public sl4 h;
    public s08 i;
    public s08 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public s08 f32117k;
    public s08 l;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface c {
        sl4 a(sl4 sl4Var);
    }

    public static b a() {
        return new b();
    }

    public static b b(Context context, int i, int i2) {
        return c(context, i, i2, 0);
    }

    public static b c(Context context, int i, int i2, int i3) {
        return d(context, i, i2, new a00(i3));
    }

    public static b d(Context context, int i, int i2, sl4 sl4Var) {
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, b4j.m7);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(b4j.n7, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(b4j.q7, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(b4j.r7, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(b4j.p7, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(b4j.o7, i3);
            sl4 sl4VarM = m(typedArrayObtainStyledAttributes, b4j.s7, sl4Var);
            sl4 sl4VarM2 = m(typedArrayObtainStyledAttributes, b4j.v7, sl4VarM);
            sl4 sl4VarM3 = m(typedArrayObtainStyledAttributes, b4j.w7, sl4VarM);
            sl4 sl4VarM4 = m(typedArrayObtainStyledAttributes, b4j.u7, sl4VarM);
            return new b().C(i4, sl4VarM2).G(i5, sl4VarM3).x(i6, sl4VarM4).t(i7, m(typedArrayObtainStyledAttributes, b4j.t7, sl4VarM));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static b e(Context context, AttributeSet attributeSet, int i, int i2) {
        return f(context, attributeSet, i, i2, 0);
    }

    public static b f(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        return g(context, attributeSet, i, i2, new a00(i3));
    }

    public static b g(Context context, AttributeSet attributeSet, int i, int i2, sl4 sl4Var) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b4j.j5, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(b4j.k5, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(b4j.l5, 0);
        typedArrayObtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, sl4Var);
    }

    public static sl4 m(TypedArray typedArray, int i, sl4 sl4Var) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue == null) {
            return sl4Var;
        }
        int i2 = typedValuePeekValue.type;
        if (i2 == 5) {
            return new a00(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return i2 == 6 ? new qgk(typedValuePeekValue.getFraction(1.0f, 1.0f)) : sl4Var;
    }

    public s08 h() {
        return this.f32117k;
    }

    public tl4 i() {
        return this.d;
    }

    public sl4 j() {
        return this.h;
    }

    public tl4 k() {
        return this.c;
    }

    public sl4 l() {
        return this.g;
    }

    public s08 n() {
        return this.l;
    }

    public s08 o() {
        return this.j;
    }

    public s08 p() {
        return this.i;
    }

    public tl4 q() {
        return this.f32115a;
    }

    public sl4 r() {
        return this.e;
    }

    public tl4 s() {
        return this.f32116b;
    }

    public sl4 t() {
        return this.f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean u(RectF rectF) {
        boolean z = this.l.getClass().equals(s08.class) && this.j.getClass().equals(s08.class) && this.i.getClass().equals(s08.class) && this.f32117k.getClass().equals(s08.class);
        float fA = this.e.a(rectF);
        return z && ((this.f.a(rectF) > fA ? 1 : (this.f.a(rectF) == fA ? 0 : -1)) == 0 && (this.h.a(rectF) > fA ? 1 : (this.h.a(rectF) == fA ? 0 : -1)) == 0 && (this.g.a(rectF) > fA ? 1 : (this.g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.f32116b instanceof txk) && (this.f32115a instanceof txk) && (this.c instanceof txk) && (this.d instanceof txk));
    }

    public b v() {
        return new b(this);
    }

    public r2m w(float f) {
        return v().o(f).m();
    }

    public r2m x(sl4 sl4Var) {
        return v().p(sl4Var).m();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public r2m y(c cVar) {
        return v().F(cVar.a(r())).J(cVar.a(t())).w(cVar.a(j())).A(cVar.a(l())).m();
    }

    public r2m(b bVar) {
        this.f32115a = bVar.f32118a;
        this.f32116b = bVar.f32119b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = bVar.f;
        this.g = bVar.g;
        this.h = bVar.h;
        this.i = bVar.i;
        this.j = bVar.j;
        this.f32117k = bVar.f32120k;
        this.l = bVar.l;
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public tl4 f32118a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public tl4 f32119b;
        public tl4 c;
        public tl4 d;
        public sl4 e;
        public sl4 f;
        public sl4 g;
        public sl4 h;
        public s08 i;
        public s08 j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public s08 f32120k;
        public s08 l;

        public b() {
            this.f32118a = m8f.b();
            this.f32119b = m8f.b();
            this.c = m8f.b();
            this.d = m8f.b();
            this.e = new a00(0.0f);
            this.f = new a00(0.0f);
            this.g = new a00(0.0f);
            this.h = new a00(0.0f);
            this.i = m8f.c();
            this.j = m8f.c();
            this.f32120k = m8f.c();
            this.l = m8f.c();
        }

        public static float n(tl4 tl4Var) {
            if (tl4Var instanceof txk) {
                return ((txk) tl4Var).f35163a;
            }
            if (tl4Var instanceof ef5) {
                return ((ef5) tl4Var).f16583a;
            }
            return -1.0f;
        }

        public b A(sl4 sl4Var) {
            this.g = sl4Var;
            return this;
        }

        public b B(s08 s08Var) {
            this.i = s08Var;
            return this;
        }

        public b C(int i, sl4 sl4Var) {
            return D(m8f.a(i)).F(sl4Var);
        }

        public b D(tl4 tl4Var) {
            this.f32118a = tl4Var;
            float fN = n(tl4Var);
            if (fN != -1.0f) {
                E(fN);
            }
            return this;
        }

        public b E(@Dimension float f) {
            this.e = new a00(f);
            return this;
        }

        public b F(sl4 sl4Var) {
            this.e = sl4Var;
            return this;
        }

        public b G(int i, sl4 sl4Var) {
            return H(m8f.a(i)).J(sl4Var);
        }

        public b H(tl4 tl4Var) {
            this.f32119b = tl4Var;
            float fN = n(tl4Var);
            if (fN != -1.0f) {
                I(fN);
            }
            return this;
        }

        public b I(@Dimension float f) {
            this.f = new a00(f);
            return this;
        }

        public b J(sl4 sl4Var) {
            this.f = sl4Var;
            return this;
        }

        public r2m m() {
            return new r2m(this);
        }

        public b o(@Dimension float f) {
            return E(f).I(f).z(f).v(f);
        }

        public b p(sl4 sl4Var) {
            return F(sl4Var).J(sl4Var).A(sl4Var).w(sl4Var);
        }

        public b q(int i, @Dimension float f) {
            return r(m8f.a(i)).o(f);
        }

        public b r(tl4 tl4Var) {
            return D(tl4Var).H(tl4Var).y(tl4Var).u(tl4Var);
        }

        public b s(s08 s08Var) {
            this.f32120k = s08Var;
            return this;
        }

        public b t(int i, sl4 sl4Var) {
            return u(m8f.a(i)).w(sl4Var);
        }

        public b u(tl4 tl4Var) {
            this.d = tl4Var;
            float fN = n(tl4Var);
            if (fN != -1.0f) {
                v(fN);
            }
            return this;
        }

        public b v(@Dimension float f) {
            this.h = new a00(f);
            return this;
        }

        public b w(sl4 sl4Var) {
            this.h = sl4Var;
            return this;
        }

        public b x(int i, sl4 sl4Var) {
            return y(m8f.a(i)).A(sl4Var);
        }

        public b y(tl4 tl4Var) {
            this.c = tl4Var;
            float fN = n(tl4Var);
            if (fN != -1.0f) {
                z(fN);
            }
            return this;
        }

        public b z(@Dimension float f) {
            this.g = new a00(f);
            return this;
        }

        public b(r2m r2mVar) {
            this.f32118a = m8f.b();
            this.f32119b = m8f.b();
            this.c = m8f.b();
            this.d = m8f.b();
            this.e = new a00(0.0f);
            this.f = new a00(0.0f);
            this.g = new a00(0.0f);
            this.h = new a00(0.0f);
            this.i = m8f.c();
            this.j = m8f.c();
            this.f32120k = m8f.c();
            this.l = m8f.c();
            this.f32118a = r2mVar.f32115a;
            this.f32119b = r2mVar.f32116b;
            this.c = r2mVar.c;
            this.d = r2mVar.d;
            this.e = r2mVar.e;
            this.f = r2mVar.f;
            this.g = r2mVar.g;
            this.h = r2mVar.h;
            this.i = r2mVar.i;
            this.j = r2mVar.j;
            this.f32120k = r2mVar.f32117k;
            this.l = r2mVar.l;
        }
    }

    public r2m() {
        this.f32115a = m8f.b();
        this.f32116b = m8f.b();
        this.c = m8f.b();
        this.d = m8f.b();
        this.e = new a00(0.0f);
        this.f = new a00(0.0f);
        this.g = new a00(0.0f);
        this.h = new a00(0.0f);
        this.i = m8f.c();
        this.j = m8f.c();
        this.f32117k = m8f.c();
        this.l = m8f.c();
    }
}
