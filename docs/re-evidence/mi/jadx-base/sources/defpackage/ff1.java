package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import androidx.annotation.RestrictTo;
import androidx.core.view.c;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class ff1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheckedTextView f17723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorStateList f17724b = null;
    public PorterDuff.Mode c = null;
    public boolean d = false;
    public boolean e = false;
    public boolean f;

    public ff1(CheckedTextView checkedTextView) {
        this.f17723a = checkedTextView;
    }

    public void a() {
        Drawable drawableA = av3.a(this.f17723a);
        if (drawableA != null) {
            if (this.d || this.e) {
                Drawable drawableMutate = k47.r(drawableA).mutate();
                if (this.d) {
                    k47.o(drawableMutate, this.f17724b);
                }
                if (this.e) {
                    k47.p(drawableMutate, this.c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f17723a.getDrawableState());
                }
                this.f17723a.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    public ColorStateList b() {
        return this.f17724b;
    }

    public PorterDuff.Mode c() {
        return this.c;
    }

    public void d(AttributeSet attributeSet, int i) {
        int iN;
        int iN2;
        xfp xfpVarV = xfp.v(this.f17723a.getContext(), attributeSet, z5j.R0, i, 0);
        CheckedTextView checkedTextView = this.f17723a;
        c.p0(checkedTextView, checkedTextView.getContext(), z5j.R0, attributeSet, xfpVarV.r(), i, 0);
        try {
            if (xfpVarV.s(z5j.T0) && (iN2 = xfpVarV.n(z5j.T0, 0)) != 0) {
                try {
                    CheckedTextView checkedTextView2 = this.f17723a;
                    checkedTextView2.setCheckMarkDrawable(of1.b(checkedTextView2.getContext(), iN2));
                } catch (Resources.NotFoundException unused) {
                    if (xfpVarV.s(z5j.S0)) {
                        CheckedTextView checkedTextView3 = this.f17723a;
                        checkedTextView3.setCheckMarkDrawable(of1.b(checkedTextView3.getContext(), iN));
                    }
                }
            } else if (xfpVarV.s(z5j.S0) && (iN = xfpVarV.n(z5j.S0, 0)) != 0) {
                CheckedTextView checkedTextView4 = this.f17723a;
                checkedTextView4.setCheckMarkDrawable(of1.b(checkedTextView4.getContext(), iN));
            }
            if (xfpVarV.s(z5j.U0)) {
                av3.b(this.f17723a, xfpVarV.c(z5j.U0));
            }
            if (xfpVarV.s(z5j.V0)) {
                av3.c(this.f17723a, x47.e(xfpVarV.k(z5j.V0, -1), null));
            }
        } finally {
            xfpVarV.w();
        }
    }

    public void e() {
        if (this.f) {
            this.f = false;
        } else {
            this.f = true;
            a();
        }
    }

    public void f(ColorStateList colorStateList) {
        this.f17724b = colorStateList;
        this.d = true;
        a();
    }

    public void g(PorterDuff.Mode mode) {
        this.c = mode;
        this.e = true;
        a();
    }
}
