package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* JADX INFO: loaded from: classes.dex */
public class u extends q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SeekBar f5242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f5243e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ColorStateList f5244f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f5245g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f5246h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f5247i;

    public u(SeekBar seekBar) {
        super(seekBar);
        this.f5244f = null;
        this.f5245g = null;
        this.f5246h = false;
        this.f5247i = false;
        this.f5242d = seekBar;
    }

    @Override // androidx.appcompat.widget.q
    public final void a(AttributeSet attributeSet, int i14) {
        super.a(attributeSet, i14);
        SeekBar seekBar = this.f5242d;
        Context context = seekBar.getContext();
        int[] iArr = h.a.f80427g;
        w0 w0VarG = w0.g(context, attributeSet, iArr, i14, 0);
        TypedArray typedArray = w0VarG.f5271b;
        SeekBar seekBar2 = this.f5242d;
        androidx.core.view.s0.q(seekBar2, seekBar2.getContext(), iArr, attributeSet, w0VarG.f5271b, i14, 0);
        Drawable drawableC = w0VarG.c(0);
        if (drawableC != null) {
            seekBar.setThumb(drawableC);
        }
        Drawable drawableB = w0VarG.b(1);
        Drawable drawable = this.f5243e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f5243e = drawableB;
        if (drawableB != null) {
            drawableB.setCallback(seekBar);
            drawableB.setLayoutDirection(seekBar.getLayoutDirection());
            if (drawableB.isStateful()) {
                drawableB.setState(seekBar.getDrawableState());
            }
            c();
        }
        seekBar.invalidate();
        if (typedArray.hasValue(3)) {
            this.f5245g = c0.c(typedArray.getInt(3, -1), this.f5245g);
            this.f5247i = true;
        }
        if (typedArray.hasValue(2)) {
            this.f5244f = w0VarG.a(2);
            this.f5246h = true;
        }
        w0VarG.h();
        c();
    }

    public final void c() {
        Drawable drawable = this.f5243e;
        if (drawable != null) {
            if (this.f5246h || this.f5247i) {
                Drawable drawableMutate = drawable.mutate();
                this.f5243e = drawableMutate;
                if (this.f5246h) {
                    drawableMutate.setTintList(this.f5244f);
                }
                if (this.f5247i) {
                    this.f5243e.setTintMode(this.f5245g);
                }
                if (this.f5243e.isStateful()) {
                    this.f5243e.setState(this.f5242d.getDrawableState());
                }
            }
        }
    }

    public final void d(Canvas canvas) {
        if (this.f5243e != null) {
            SeekBar seekBar = this.f5242d;
            int max = seekBar.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f5243e.getIntrinsicWidth();
                int intrinsicHeight = this.f5243e.getIntrinsicHeight();
                int i14 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i15 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f5243e.setBounds(-i14, -i15, i14, i15);
                float width = ((seekBar.getWidth() - seekBar.getPaddingLeft()) - seekBar.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(seekBar.getPaddingLeft(), seekBar.getHeight() / 2);
                for (int i16 = 0; i16 <= max; i16++) {
                    this.f5243e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
