package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.RestrictTo;
import androidx.core.view.c;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class lf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f24995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public vfp f24996b;
    public vfp c;
    public vfp d;
    public int e = 0;

    public lf1(ImageView imageView) {
        this.f24995a = imageView;
    }

    public final boolean a(Drawable drawable) {
        if (this.d == null) {
            this.d = new vfp();
        }
        vfp vfpVar = this.d;
        vfpVar.a();
        ColorStateList colorStateListA = a6d.a(this.f24995a);
        if (colorStateListA != null) {
            vfpVar.d = true;
            vfpVar.f36854a = colorStateListA;
        }
        PorterDuff.Mode modeB = a6d.b(this.f24995a);
        if (modeB != null) {
            vfpVar.c = true;
            vfpVar.f36855b = modeB;
        }
        if (!vfpVar.d && !vfpVar.c) {
            return false;
        }
        jf1.i(drawable, vfpVar, this.f24995a.getDrawableState());
        return true;
    }

    public void b() {
        if (this.f24995a.getDrawable() != null) {
            this.f24995a.getDrawable().setLevel(this.e);
        }
    }

    public void c() {
        Drawable drawable = this.f24995a.getDrawable();
        if (drawable != null) {
            x47.b(drawable);
        }
        if (drawable != null) {
            if (l() && a(drawable)) {
                return;
            }
            vfp vfpVar = this.c;
            if (vfpVar != null) {
                jf1.i(drawable, vfpVar, this.f24995a.getDrawableState());
                return;
            }
            vfp vfpVar2 = this.f24996b;
            if (vfpVar2 != null) {
                jf1.i(drawable, vfpVar2, this.f24995a.getDrawableState());
            }
        }
    }

    public ColorStateList d() {
        vfp vfpVar = this.c;
        if (vfpVar != null) {
            return vfpVar.f36854a;
        }
        return null;
    }

    public PorterDuff.Mode e() {
        vfp vfpVar = this.c;
        if (vfpVar != null) {
            return vfpVar.f36855b;
        }
        return null;
    }

    public boolean f() {
        return !(this.f24995a.getBackground() instanceof RippleDrawable);
    }

    public void g(AttributeSet attributeSet, int i) {
        int iN;
        xfp xfpVarV = xfp.v(this.f24995a.getContext(), attributeSet, z5j.R, i, 0);
        ImageView imageView = this.f24995a;
        c.p0(imageView, imageView.getContext(), z5j.R, attributeSet, xfpVarV.r(), i, 0);
        try {
            Drawable drawable = this.f24995a.getDrawable();
            if (drawable == null && (iN = xfpVarV.n(z5j.S, -1)) != -1 && (drawable = of1.b(this.f24995a.getContext(), iN)) != null) {
                this.f24995a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                x47.b(drawable);
            }
            if (xfpVarV.s(z5j.T)) {
                a6d.c(this.f24995a, xfpVarV.c(z5j.T));
            }
            if (xfpVarV.s(z5j.U)) {
                a6d.d(this.f24995a, x47.e(xfpVarV.k(z5j.U, -1), null));
            }
        } finally {
            xfpVarV.w();
        }
    }

    public void h(Drawable drawable) {
        this.e = drawable.getLevel();
    }

    public void i(int i) {
        if (i != 0) {
            Drawable drawableB = of1.b(this.f24995a.getContext(), i);
            if (drawableB != null) {
                x47.b(drawableB);
            }
            this.f24995a.setImageDrawable(drawableB);
        } else {
            this.f24995a.setImageDrawable(null);
        }
        c();
    }

    public void j(ColorStateList colorStateList) {
        if (this.c == null) {
            this.c = new vfp();
        }
        vfp vfpVar = this.c;
        vfpVar.f36854a = colorStateList;
        vfpVar.d = true;
        c();
    }

    public void k(PorterDuff.Mode mode) {
        if (this.c == null) {
            this.c = new vfp();
        }
        vfp vfpVar = this.c;
        vfpVar.f36855b = mode;
        vfpVar.c = true;
        c();
    }

    public final boolean l() {
        return this.f24996b != null;
    }
}
