package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import defpackage.d38;
import defpackage.jf1;
import defpackage.jrk;
import defpackage.qf1;
import defpackage.s8p;
import defpackage.vfp;
import defpackage.x47;
import defpackage.xfp;
import defpackage.yr1;
import defpackage.z5j;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatTextHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f1602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public vfp f1603b;
    public vfp c;
    public vfp d;
    public vfp e;
    public vfp f;
    public vfp g;
    public vfp h;
    public final qf1 i;
    public int j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1604k = -1;
    public Typeface l;
    public boolean m;

    public class a extends jrk.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f1605a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f1606b;
        public final /* synthetic */ WeakReference c;

        public a(int i, int i2, WeakReference weakReference) {
            this.f1605a = i;
            this.f1606b = i2;
            this.c = weakReference;
        }

        @Override // jrk.e
        /* JADX INFO: renamed from: h */
        public void f(int i) {
        }

        @Override // jrk.e
        /* JADX INFO: renamed from: i */
        public void g(Typeface typeface) {
            int i;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f1605a) != -1) {
                typeface = f.a(typeface, i, (this.f1606b & 2) != 0);
            }
            AppCompatTextHelper.this.n(this.c, typeface);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TextView f1607a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Typeface f1608b;
        public final /* synthetic */ int c;

        public b(TextView textView, Typeface typeface, int i) {
            this.f1607a = textView;
            this.f1608b = typeface;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1607a.setTypeface(this.f1608b, this.c);
        }
    }

    @RequiresApi(17)
    public static class c {
        public static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        public static void b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        public static void c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    @RequiresApi(24)
    public static class d {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        public static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    @RequiresApi(26)
    public static class e {
        public static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        public static void b(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        public static void c(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        public static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    @RequiresApi(28)
    public static class f {
        public static Typeface a(Typeface typeface, int i, boolean z) {
            return Typeface.create(typeface, i, z);
        }
    }

    public AppCompatTextHelper(TextView textView) {
        this.f1602a = textView;
        this.i = new qf1(textView);
    }

    public static vfp d(Context context, jf1 jf1Var, int i) {
        ColorStateList colorStateListF = jf1Var.f(context, i);
        if (colorStateListF == null) {
            return null;
        }
        vfp vfpVar = new vfp();
        vfpVar.d = true;
        vfpVar.f36854a = colorStateListF;
        return vfpVar;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void A(int i, float f2) {
        if (yr1.q3 || l()) {
            return;
        }
        B(i, f2);
    }

    public final void B(int i, float f2) {
        this.i.t(i, f2);
    }

    public final void C(Context context, xfp xfpVar) {
        String strO;
        this.j = xfpVar.k(z5j.f3, this.j);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            int iK = xfpVar.k(z5j.i3, -1);
            this.f1604k = iK;
            if (iK != -1) {
                this.j &= 2;
            }
        }
        if (!xfpVar.s(z5j.h3) && !xfpVar.s(z5j.j3)) {
            if (xfpVar.s(z5j.e3)) {
                this.m = false;
                int iK2 = xfpVar.k(z5j.e3, 1);
                if (iK2 == 1) {
                    this.l = Typeface.SANS_SERIF;
                    return;
                } else if (iK2 == 2) {
                    this.l = Typeface.SERIF;
                    return;
                } else {
                    if (iK2 != 3) {
                        return;
                    }
                    this.l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.l = null;
        int i2 = xfpVar.s(z5j.j3) ? z5j.j3 : z5j.h3;
        int i3 = this.f1604k;
        int i4 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceJ = xfpVar.j(i2, this.j, new a(i3, i4, new WeakReference(this.f1602a)));
                if (typefaceJ != null) {
                    if (i < 28 || this.f1604k == -1) {
                        this.l = typefaceJ;
                    } else {
                        this.l = f.a(Typeface.create(typefaceJ, 0), this.f1604k, (this.j & 2) != 0);
                    }
                }
                this.m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (strO = xfpVar.o(i2)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f1604k == -1) {
            this.l = Typeface.create(strO, this.j);
        } else {
            this.l = f.a(Typeface.create(strO, 0), this.f1604k, (this.j & 2) != 0);
        }
    }

    public final void a(Drawable drawable, vfp vfpVar) {
        if (drawable == null || vfpVar == null) {
            return;
        }
        jf1.i(drawable, vfpVar, this.f1602a.getDrawableState());
    }

    public void b() {
        if (this.f1603b != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = this.f1602a.getCompoundDrawables();
            a(compoundDrawables[0], this.f1603b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] drawableArrA = c.a(this.f1602a);
        a(drawableArrA[0], this.f);
        a(drawableArrA[2], this.g);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void c() {
        this.i.a();
    }

    public int e() {
        return this.i.f();
    }

    public int f() {
        return this.i.g();
    }

    public int g() {
        return this.i.h();
    }

    public int[] h() {
        return this.i.i();
    }

    public int i() {
        return this.i.j();
    }

    public ColorStateList j() {
        vfp vfpVar = this.h;
        if (vfpVar != null) {
            return vfpVar.f36854a;
        }
        return null;
    }

    public PorterDuff.Mode k() {
        vfp vfpVar = this.h;
        if (vfpVar != null) {
            return vfpVar.f36855b;
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean l() {
        return this.i.n();
    }

    @SuppressLint({"NewApi"})
    public void m(AttributeSet attributeSet, int i) {
        boolean zA;
        boolean z;
        String strO;
        String strO2;
        boolean z2;
        Context context = this.f1602a.getContext();
        jf1 jf1VarB = jf1.b();
        xfp xfpVarV = xfp.v(context, attributeSet, z5j.a0, i, 0);
        TextView textView = this.f1602a;
        androidx.core.view.c.p0(textView, textView.getContext(), z5j.a0, attributeSet, xfpVarV.r(), i, 0);
        int iN = xfpVarV.n(z5j.b0, -1);
        if (xfpVarV.s(z5j.e0)) {
            this.f1603b = d(context, jf1VarB, xfpVarV.n(z5j.e0, 0));
        }
        if (xfpVarV.s(z5j.c0)) {
            this.c = d(context, jf1VarB, xfpVarV.n(z5j.c0, 0));
        }
        if (xfpVarV.s(z5j.f0)) {
            this.d = d(context, jf1VarB, xfpVarV.n(z5j.f0, 0));
        }
        if (xfpVarV.s(z5j.d0)) {
            this.e = d(context, jf1VarB, xfpVarV.n(z5j.d0, 0));
        }
        int i2 = Build.VERSION.SDK_INT;
        if (xfpVarV.s(z5j.g0)) {
            this.f = d(context, jf1VarB, xfpVarV.n(z5j.g0, 0));
        }
        if (xfpVarV.s(z5j.h0)) {
            this.g = d(context, jf1VarB, xfpVarV.n(z5j.h0, 0));
        }
        xfpVarV.w();
        boolean z3 = this.f1602a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (iN != -1) {
            xfp xfpVarT = xfp.t(context, iN, z5j.c3);
            if (z3 || !xfpVarT.s(z5j.l3)) {
                zA = false;
                z = false;
            } else {
                zA = xfpVarT.a(z5j.l3, false);
                z = true;
            }
            C(context, xfpVarT);
            strO = xfpVarT.s(z5j.m3) ? xfpVarT.o(z5j.m3) : null;
            strO2 = xfpVarT.s(z5j.k3) ? xfpVarT.o(z5j.k3) : null;
            xfpVarT.w();
        } else {
            zA = false;
            z = false;
            strO = null;
            strO2 = null;
        }
        xfp xfpVarV2 = xfp.v(context, attributeSet, z5j.c3, i, 0);
        if (z3 || !xfpVarV2.s(z5j.l3)) {
            z2 = z;
        } else {
            zA = xfpVarV2.a(z5j.l3, false);
            z2 = true;
        }
        if (xfpVarV2.s(z5j.m3)) {
            strO = xfpVarV2.o(z5j.m3);
        }
        if (xfpVarV2.s(z5j.k3)) {
            strO2 = xfpVarV2.o(z5j.k3);
        }
        if (i2 >= 28 && xfpVarV2.s(z5j.d3) && xfpVarV2.f(z5j.d3, -1) == 0) {
            this.f1602a.setTextSize(0, 0.0f);
        }
        C(context, xfpVarV2);
        xfpVarV2.w();
        if (!z3 && z2) {
            s(zA);
        }
        Typeface typeface = this.l;
        if (typeface != null) {
            if (this.f1604k == -1) {
                this.f1602a.setTypeface(typeface, this.j);
            } else {
                this.f1602a.setTypeface(typeface);
            }
        }
        if (strO2 != null) {
            e.d(this.f1602a, strO2);
        }
        if (strO != null) {
            d.b(this.f1602a, d.a(strO));
        }
        this.i.o(attributeSet, i);
        if (yr1.q3 && this.i.j() != 0) {
            int[] iArrI = this.i.i();
            if (iArrI.length > 0) {
                if (e.a(this.f1602a) != -1.0f) {
                    e.b(this.f1602a, this.i.g(), this.i.f(), this.i.h(), 0);
                } else {
                    e.c(this.f1602a, iArrI, 0);
                }
            }
        }
        xfp xfpVarU = xfp.u(context, attributeSet, z5j.i0);
        int iN2 = xfpVarU.n(z5j.q0, -1);
        Drawable drawableC = iN2 != -1 ? jf1VarB.c(context, iN2) : null;
        int iN3 = xfpVarU.n(z5j.v0, -1);
        Drawable drawableC2 = iN3 != -1 ? jf1VarB.c(context, iN3) : null;
        int iN4 = xfpVarU.n(z5j.r0, -1);
        Drawable drawableC3 = iN4 != -1 ? jf1VarB.c(context, iN4) : null;
        int iN5 = xfpVarU.n(z5j.o0, -1);
        Drawable drawableC4 = iN5 != -1 ? jf1VarB.c(context, iN5) : null;
        int iN6 = xfpVarU.n(z5j.s0, -1);
        Drawable drawableC5 = iN6 != -1 ? jf1VarB.c(context, iN6) : null;
        int iN7 = xfpVarU.n(z5j.p0, -1);
        y(drawableC, drawableC2, drawableC3, drawableC4, drawableC5, iN7 != -1 ? jf1VarB.c(context, iN7) : null);
        if (xfpVarU.s(z5j.t0)) {
            s8p.h(this.f1602a, xfpVarU.c(z5j.t0));
        }
        if (xfpVarU.s(z5j.u0)) {
            s8p.i(this.f1602a, x47.e(xfpVarU.k(z5j.u0, -1), null));
        }
        int iF = xfpVarU.f(z5j.x0, -1);
        int iF2 = xfpVarU.f(z5j.y0, -1);
        int iF3 = xfpVarU.f(z5j.z0, -1);
        xfpVarU.w();
        if (iF != -1) {
            s8p.k(this.f1602a, iF);
        }
        if (iF2 != -1) {
            s8p.l(this.f1602a, iF2);
        }
        if (iF3 != -1) {
            s8p.m(this.f1602a, iF3);
        }
    }

    public void n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.m) {
            this.l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                if (androidx.core.view.c.T(textView)) {
                    textView.post(new b(textView, typeface, this.j));
                } else {
                    textView.setTypeface(typeface, this.j);
                }
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void o(boolean z, int i, int i2, int i3, int i4) {
        if (yr1.q3) {
            return;
        }
        c();
    }

    public void p() {
        b();
    }

    public void q(Context context, int i) {
        String strO;
        xfp xfpVarT = xfp.t(context, i, z5j.c3);
        if (xfpVarT.s(z5j.l3)) {
            s(xfpVarT.a(z5j.l3, false));
        }
        if (xfpVarT.s(z5j.d3) && xfpVarT.f(z5j.d3, -1) == 0) {
            this.f1602a.setTextSize(0, 0.0f);
        }
        C(context, xfpVarT);
        if (xfpVarT.s(z5j.k3) && (strO = xfpVarT.o(z5j.k3)) != null) {
            e.d(this.f1602a, strO);
        }
        xfpVarT.w();
        Typeface typeface = this.l;
        if (typeface != null) {
            this.f1602a.setTypeface(typeface, this.j);
        }
    }

    public void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        d38.e(editorInfo, textView.getText());
    }

    public void s(boolean z) {
        this.f1602a.setAllCaps(z);
    }

    public void t(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        this.i.p(i, i2, i3, i4);
    }

    public void u(int[] iArr, int i) throws IllegalArgumentException {
        this.i.q(iArr, i);
    }

    public void v(int i) {
        this.i.r(i);
    }

    public void w(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new vfp();
        }
        vfp vfpVar = this.h;
        vfpVar.f36854a = colorStateList;
        vfpVar.d = colorStateList != null;
        z();
    }

    public void x(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new vfp();
        }
        vfp vfpVar = this.h;
        vfpVar.f36855b = mode;
        vfpVar.c = mode != null;
        z();
    }

    public final void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] drawableArrA = c.a(this.f1602a);
            TextView textView = this.f1602a;
            if (drawable5 == null) {
                drawable5 = drawableArrA[0];
            }
            if (drawable2 == null) {
                drawable2 = drawableArrA[1];
            }
            if (drawable6 == null) {
                drawable6 = drawableArrA[2];
            }
            if (drawable4 == null) {
                drawable4 = drawableArrA[3];
            }
            c.b(textView, drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] drawableArrA2 = c.a(this.f1602a);
        Drawable drawable7 = drawableArrA2[0];
        if (drawable7 != null || drawableArrA2[2] != null) {
            TextView textView2 = this.f1602a;
            if (drawable2 == null) {
                drawable2 = drawableArrA2[1];
            }
            Drawable drawable8 = drawableArrA2[2];
            if (drawable4 == null) {
                drawable4 = drawableArrA2[3];
            }
            c.b(textView2, drawable7, drawable2, drawable8, drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f1602a.getCompoundDrawables();
        TextView textView3 = this.f1602a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    public final void z() {
        vfp vfpVar = this.h;
        this.f1603b = vfpVar;
        this.c = vfpVar;
        this.d = vfpVar;
        this.e = vfpVar;
        this.f = vfpVar;
        this.g = vfpVar;
    }
}
