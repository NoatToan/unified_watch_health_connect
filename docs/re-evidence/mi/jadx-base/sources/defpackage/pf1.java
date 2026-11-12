package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.view.c;

/* JADX INFO: loaded from: classes.dex */
public class pf1 extends mf1 {
    public final SeekBar d;
    public Drawable e;
    public ColorStateList f;
    public PorterDuff.Mode g;
    public boolean h;
    public boolean i;

    public pf1(SeekBar seekBar) {
        super(seekBar);
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = false;
        this.d = seekBar;
    }

    @Override // defpackage.mf1
    public void c(AttributeSet attributeSet, int i) {
        super.c(attributeSet, i);
        xfp xfpVarV = xfp.v(this.d.getContext(), attributeSet, z5j.V, i, 0);
        SeekBar seekBar = this.d;
        c.p0(seekBar, seekBar.getContext(), z5j.V, attributeSet, xfpVarV.r(), i, 0);
        Drawable drawableH = xfpVarV.h(z5j.W);
        if (drawableH != null) {
            this.d.setThumb(drawableH);
        }
        j(xfpVarV.g(z5j.X));
        if (xfpVarV.s(z5j.Z)) {
            this.g = x47.e(xfpVarV.k(z5j.Z, -1), this.g);
            this.i = true;
        }
        if (xfpVarV.s(z5j.Y)) {
            this.f = xfpVarV.c(z5j.Y);
            this.h = true;
        }
        xfpVarV.w();
        f();
    }

    public final void f() {
        Drawable drawable = this.e;
        if (drawable != null) {
            if (this.h || this.i) {
                Drawable drawableR = k47.r(drawable.mutate());
                this.e = drawableR;
                if (this.h) {
                    k47.o(drawableR, this.f);
                }
                if (this.i) {
                    k47.p(this.e, this.g);
                }
                if (this.e.isStateful()) {
                    this.e.setState(this.d.getDrawableState());
                }
            }
        }
    }

    public void g(Canvas canvas) {
        if (this.e != null) {
            int max = this.d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.e.getIntrinsicWidth();
                int intrinsicHeight = this.e.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.e.setBounds(-i, -i2, i, i2);
                float width = ((this.d.getWidth() - this.d.getPaddingLeft()) - this.d.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.d.getPaddingLeft(), this.d.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    public void h() {
        Drawable drawable = this.e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.d.getDrawableState())) {
            this.d.invalidateDrawable(drawable);
        }
    }

    public void i() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void j(Drawable drawable) {
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.d);
            k47.m(drawable, c.A(this.d));
            if (drawable.isStateful()) {
                drawable.setState(this.d.getDrawableState());
            }
            f();
        }
        this.d.invalidate();
    }
}
