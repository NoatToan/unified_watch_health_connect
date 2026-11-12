package miuix.appcompat.app.floatingactivity;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import defpackage.g5j;
import defpackage.gbk;
import defpackage.hm1;
import defpackage.s72;
import defpackage.zhi;
import defpackage.zlr;

/* JADX INFO: loaded from: classes3.dex */
public class FloatingABOLayoutSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f26331a;
    public boolean d;
    public TypedValue e;
    public TypedValue f;
    public TypedValue g;
    public TypedValue h;
    public TypedValue i;
    public TypedValue j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TypedValue f26333k;
    public TypedValue l;
    public DisplayMetrics m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f26332b = false;
    public boolean c = false;
    public Point n = new Point();

    public FloatingABOLayoutSpec(Context context, AttributeSet attributeSet) {
        this.f26331a = context;
        u(context);
        r(context, attributeSet);
    }

    public final TypedValue a() {
        if (this.f26332b && this.c) {
            return this.f;
        }
        return null;
    }

    public final TypedValue b() {
        if (this.f26332b && this.c) {
            return this.h;
        }
        return null;
    }

    public final TypedValue c() {
        if (this.f26332b && this.c) {
            return this.g;
        }
        return null;
    }

    public final TypedValue d() {
        if (this.f26332b && this.c) {
            return this.e;
        }
        return null;
    }

    public int e(int i) {
        return k(i, false, b(), a(), h(), g());
    }

    public int f(int i) {
        return k(i, false, this.h, this.f, this.f26333k, this.l);
    }

    public final TypedValue g() {
        if (this.f26332b && this.c) {
            return this.l;
        }
        return null;
    }

    public final TypedValue h() {
        if (this.f26332b && this.c) {
            return this.f26333k;
        }
        return null;
    }

    public final TypedValue i() {
        if (this.f26332b && this.c) {
            return this.j;
        }
        return null;
    }

    public final TypedValue j() {
        if (this.f26332b && this.c) {
            return this.i;
        }
        return null;
    }

    public final int k(int i, boolean z, TypedValue typedValue, TypedValue typedValue2, TypedValue typedValue3, TypedValue typedValue4) {
        if (View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return i;
        }
        boolean zO = o();
        if (!zO) {
            typedValue = typedValue2;
        }
        int iS = s(typedValue, z);
        if (iS > 0) {
            return View.MeasureSpec.makeMeasureSpec(iS, 1073741824);
        }
        if (!zO) {
            typedValue3 = typedValue4;
        }
        int iS2 = s(typedValue3, z);
        return iS2 > 0 ? View.MeasureSpec.makeMeasureSpec(Math.min(iS2, View.MeasureSpec.getSize(i)), Integer.MIN_VALUE) : i;
    }

    public final int l(ContextThemeWrapper contextThemeWrapper) {
        try {
            return ((Integer) gbk.g(contextThemeWrapper, gbk.f(contextThemeWrapper.getClass(), "getThemeResId", null), null)).intValue();
        } catch (RuntimeException unused) {
            return 0;
        }
    }

    public int m(int i) {
        return k(i, true, d(), c(), j(), i());
    }

    public int n(int i) {
        return k(i, true, this.e, this.g, this.i, this.j);
    }

    public final boolean o() {
        return zlr.n(this.f26331a);
    }

    public void p() {
        int iL;
        Context contextThemeWrapper = this.f26331a;
        if (this.d && (contextThemeWrapper instanceof ContextThemeWrapper) && (iL = l((ContextThemeWrapper) contextThemeWrapper)) > 0) {
            contextThemeWrapper = new ContextThemeWrapper(this.f26331a.getApplicationContext(), iL);
        }
        this.e = hm1.k(contextThemeWrapper, zhi.k0);
        this.f = hm1.k(contextThemeWrapper, zhi.h0);
        this.g = hm1.k(contextThemeWrapper, zhi.j0);
        this.h = hm1.k(contextThemeWrapper, zhi.i0);
        this.i = hm1.k(contextThemeWrapper, zhi.p0);
        this.j = hm1.k(contextThemeWrapper, zhi.o0);
        this.f26333k = hm1.k(contextThemeWrapper, zhi.n0);
        this.l = hm1.k(contextThemeWrapper, zhi.m0);
        u(contextThemeWrapper);
    }

    public void q(boolean z) {
        if (this.f26332b) {
            this.c = z;
        }
    }

    public final void r(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g5j.m3);
        if (typedArrayObtainStyledAttributes.hasValue(g5j.B3)) {
            TypedValue typedValue = new TypedValue();
            this.e = typedValue;
            typedArrayObtainStyledAttributes.getValue(g5j.B3, typedValue);
        }
        if (typedArrayObtainStyledAttributes.hasValue(g5j.y3)) {
            TypedValue typedValue2 = new TypedValue();
            this.f = typedValue2;
            typedArrayObtainStyledAttributes.getValue(g5j.y3, typedValue2);
        }
        if (typedArrayObtainStyledAttributes.hasValue(g5j.A3)) {
            TypedValue typedValue3 = new TypedValue();
            this.g = typedValue3;
            typedArrayObtainStyledAttributes.getValue(g5j.A3, typedValue3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(g5j.z3)) {
            TypedValue typedValue4 = new TypedValue();
            this.h = typedValue4;
            typedArrayObtainStyledAttributes.getValue(g5j.z3, typedValue4);
        }
        if (typedArrayObtainStyledAttributes.hasValue(g5j.I3)) {
            TypedValue typedValue5 = new TypedValue();
            this.i = typedValue5;
            typedArrayObtainStyledAttributes.getValue(g5j.I3, typedValue5);
        }
        if (typedArrayObtainStyledAttributes.hasValue(g5j.H3)) {
            TypedValue typedValue6 = new TypedValue();
            this.j = typedValue6;
            typedArrayObtainStyledAttributes.getValue(g5j.H3, typedValue6);
        }
        if (typedArrayObtainStyledAttributes.hasValue(g5j.F3)) {
            TypedValue typedValue7 = new TypedValue();
            this.l = typedValue7;
            typedArrayObtainStyledAttributes.getValue(g5j.F3, typedValue7);
        }
        if (typedArrayObtainStyledAttributes.hasValue(g5j.G3)) {
            TypedValue typedValue8 = new TypedValue();
            this.f26333k = typedValue8;
            typedArrayObtainStyledAttributes.getValue(g5j.G3, typedValue8);
        }
        this.f26332b = typedArrayObtainStyledAttributes.getBoolean(g5j.r3, false);
        this.c = s72.i(context);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final int s(TypedValue typedValue, boolean z) {
        int i;
        float fraction;
        if (typedValue != null && (i = typedValue.type) != 0) {
            if (i == 5) {
                fraction = typedValue.getDimension(this.m);
            } else if (i == 6) {
                float f = z ? this.n.x : this.n.y;
                fraction = typedValue.getFraction(f, f);
            }
            return (int) fraction;
        }
        return 0;
    }

    public void t(boolean z) {
        this.d = z;
    }

    public void u(Context context) {
        this.m = context.getResources().getDisplayMetrics();
        this.n = zlr.i(context);
    }
}
