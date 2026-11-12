package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.core.view.c;

/* JADX INFO: loaded from: classes.dex */
public class gf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CompoundButton f18910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorStateList f18911b = null;
    public PorterDuff.Mode c = null;
    public boolean d = false;
    public boolean e = false;
    public boolean f;

    public gf1(CompoundButton compoundButton) {
        this.f18910a = compoundButton;
    }

    public void a() {
        Drawable drawableA = ua4.a(this.f18910a);
        if (drawableA != null) {
            if (this.d || this.e) {
                Drawable drawableMutate = k47.r(drawableA).mutate();
                if (this.d) {
                    k47.o(drawableMutate, this.f18911b);
                }
                if (this.e) {
                    k47.p(drawableMutate, this.c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f18910a.getDrawableState());
                }
                this.f18910a.setButtonDrawable(drawableMutate);
            }
        }
    }

    public int b(int i) {
        return i;
    }

    public ColorStateList c() {
        return this.f18911b;
    }

    public PorterDuff.Mode d() {
        return this.c;
    }

    public void e(AttributeSet attributeSet, int i) {
        int iN;
        int iN2;
        xfp xfpVarV = xfp.v(this.f18910a.getContext(), attributeSet, z5j.W0, i, 0);
        CompoundButton compoundButton = this.f18910a;
        c.p0(compoundButton, compoundButton.getContext(), z5j.W0, attributeSet, xfpVarV.r(), i, 0);
        try {
            if (xfpVarV.s(z5j.Y0) && (iN2 = xfpVarV.n(z5j.Y0, 0)) != 0) {
                try {
                    CompoundButton compoundButton2 = this.f18910a;
                    compoundButton2.setButtonDrawable(of1.b(compoundButton2.getContext(), iN2));
                } catch (Resources.NotFoundException unused) {
                    if (xfpVarV.s(z5j.X0)) {
                        CompoundButton compoundButton3 = this.f18910a;
                        compoundButton3.setButtonDrawable(of1.b(compoundButton3.getContext(), iN));
                    }
                }
            } else if (xfpVarV.s(z5j.X0) && (iN = xfpVarV.n(z5j.X0, 0)) != 0) {
                CompoundButton compoundButton4 = this.f18910a;
                compoundButton4.setButtonDrawable(of1.b(compoundButton4.getContext(), iN));
            }
            if (xfpVarV.s(z5j.Z0)) {
                ua4.c(this.f18910a, xfpVarV.c(z5j.Z0));
            }
            if (xfpVarV.s(z5j.a1)) {
                ua4.d(this.f18910a, x47.e(xfpVarV.k(z5j.a1, -1), null));
            }
        } finally {
            xfpVarV.w();
        }
    }

    public void f() {
        if (this.f) {
            this.f = false;
        } else {
            this.f = true;
            a();
        }
    }

    public void g(ColorStateList colorStateList) {
        this.f18911b = colorStateList;
        this.d = true;
        a();
    }

    public void h(PorterDuff.Mode mode) {
        this.c = mode;
        this.e = true;
        a();
    }
}
