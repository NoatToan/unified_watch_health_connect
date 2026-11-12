package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.c;
import defpackage.jf1;
import defpackage.vfp;
import defpackage.x47;
import defpackage.xfp;
import defpackage.z5j;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatBackgroundHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f1564a;
    public vfp d;
    public vfp e;
    public vfp f;
    public int c = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jf1 f1565b = jf1.b();

    public AppCompatBackgroundHelper(View view) {
        this.f1564a = view;
    }

    public final boolean a(Drawable drawable) {
        if (this.f == null) {
            this.f = new vfp();
        }
        vfp vfpVar = this.f;
        vfpVar.a();
        ColorStateList colorStateListR = c.r(this.f1564a);
        if (colorStateListR != null) {
            vfpVar.d = true;
            vfpVar.f36854a = colorStateListR;
        }
        PorterDuff.Mode modeS = c.s(this.f1564a);
        if (modeS != null) {
            vfpVar.c = true;
            vfpVar.f36855b = modeS;
        }
        if (!vfpVar.d && !vfpVar.c) {
            return false;
        }
        jf1.i(drawable, vfpVar, this.f1564a.getDrawableState());
        return true;
    }

    public void b() {
        Drawable background = this.f1564a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            vfp vfpVar = this.e;
            if (vfpVar != null) {
                jf1.i(background, vfpVar, this.f1564a.getDrawableState());
                return;
            }
            vfp vfpVar2 = this.d;
            if (vfpVar2 != null) {
                jf1.i(background, vfpVar2, this.f1564a.getDrawableState());
            }
        }
    }

    public ColorStateList c() {
        vfp vfpVar = this.e;
        if (vfpVar != null) {
            return vfpVar.f36854a;
        }
        return null;
    }

    public PorterDuff.Mode d() {
        vfp vfpVar = this.e;
        if (vfpVar != null) {
            return vfpVar.f36855b;
        }
        return null;
    }

    public void e(AttributeSet attributeSet, int i) {
        xfp xfpVarV = xfp.v(this.f1564a.getContext(), attributeSet, z5j.U3, i, 0);
        View view = this.f1564a;
        c.p0(view, view.getContext(), z5j.U3, attributeSet, xfpVarV.r(), i, 0);
        try {
            if (xfpVarV.s(z5j.V3)) {
                this.c = xfpVarV.n(z5j.V3, -1);
                ColorStateList colorStateListF = this.f1565b.f(this.f1564a.getContext(), this.c);
                if (colorStateListF != null) {
                    h(colorStateListF);
                }
            }
            if (xfpVarV.s(z5j.W3)) {
                c.w0(this.f1564a, xfpVarV.c(z5j.W3));
            }
            if (xfpVarV.s(z5j.X3)) {
                c.x0(this.f1564a, x47.e(xfpVarV.k(z5j.X3, -1), null));
            }
        } finally {
            xfpVarV.w();
        }
    }

    public void f(Drawable drawable) {
        this.c = -1;
        h(null);
        b();
    }

    public void g(int i) {
        this.c = i;
        jf1 jf1Var = this.f1565b;
        h(jf1Var != null ? jf1Var.f(this.f1564a.getContext(), i) : null);
        b();
    }

    public void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new vfp();
            }
            vfp vfpVar = this.d;
            vfpVar.f36854a = colorStateList;
            vfpVar.d = true;
        } else {
            this.d = null;
        }
        b();
    }

    public void i(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new vfp();
        }
        vfp vfpVar = this.e;
        vfpVar.f36854a = colorStateList;
        vfpVar.d = true;
        b();
    }

    public void j(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new vfp();
        }
        vfp vfpVar = this.e;
        vfpVar.f36855b = mode;
        vfpVar.c = true;
        b();
    }

    public final boolean k() {
        return this.d != null;
    }
}
