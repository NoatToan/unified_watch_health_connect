package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import defpackage.b4j;
import defpackage.b57;
import defpackage.c9p;
import defpackage.cb1;
import defpackage.fa2;
import defpackage.g06;
import defpackage.i8f;
import defpackage.k3j;
import defpackage.n8f;
import defpackage.o7d;
import defpackage.pii;
import defpackage.q57;
import defpackage.yc1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BaseProgressIndicator<S extends fa2> extends ProgressBar {
    public static final int o = k3j.H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public S f8776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8777b;
    public boolean c;
    public boolean d;
    public final int e;
    public final int f;
    public long g;
    public yc1 h;
    public boolean i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Runnable f8778k;
    public final Runnable l;
    public final cb1 m;
    public final cb1 n;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseProgressIndicator.this.k();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseProgressIndicator.this.j();
            BaseProgressIndicator.this.g = -1L;
        }
    }

    public class c extends cb1 {
        public c() {
        }

        @Override // defpackage.cb1
        public void onAnimationEnd(Drawable drawable) {
            BaseProgressIndicator.this.setIndeterminate(false);
            BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
            baseProgressIndicator.o(baseProgressIndicator.f8777b, BaseProgressIndicator.this.c);
        }
    }

    public class d extends cb1 {
        public d() {
        }

        @Override // defpackage.cb1
        public void onAnimationEnd(Drawable drawable) {
            super.onAnimationEnd(drawable);
            if (BaseProgressIndicator.this.i) {
                return;
            }
            BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
            baseProgressIndicator.setVisibility(baseProgressIndicator.j);
        }
    }

    public BaseProgressIndicator(Context context, AttributeSet attributeSet, int i, int i2) {
        super(n8f.c(context, attributeSet, i, o), attributeSet, i);
        this.g = -1L;
        this.i = false;
        this.j = 4;
        this.f8778k = new a();
        this.l = new b();
        this.m = new c();
        this.n = new d();
        Context context2 = getContext();
        this.f8776a = (S) i(context2, attributeSet);
        TypedArray typedArrayH = c9p.h(context2, attributeSet, b4j.Q, i, i2, new int[0]);
        this.e = typedArrayH.getInt(b4j.V, -1);
        this.f = Math.min(typedArrayH.getInt(b4j.T, -1), 1000);
        typedArrayH.recycle();
        this.h = new yc1();
        this.d = true;
    }

    private q57<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().v();
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().w();
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f8776a.f;
    }

    public int[] getIndicatorColor() {
        return this.f8776a.c;
    }

    public int getShowAnimationBehavior() {
        return this.f8776a.e;
    }

    public int getTrackColor() {
        return this.f8776a.d;
    }

    public int getTrackCornerRadius() {
        return this.f8776a.f17586b;
    }

    public int getTrackThickness() {
        return this.f8776a.f17585a;
    }

    public void h(boolean z) {
        if (this.d) {
            ((b57) getCurrentDrawable()).p(q(), false, z);
        }
    }

    public abstract S i(Context context, AttributeSet attributeSet);

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    public final void j() {
        ((b57) getCurrentDrawable()).p(false, false, true);
        if (m()) {
            setVisibility(4);
        }
    }

    public final void k() {
        if (this.f > 0) {
            this.g = SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    public boolean l() {
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    public final boolean m() {
        return (getProgressDrawable() == null || !getProgressDrawable().isVisible()) && (getIndeterminateDrawable() == null || !getIndeterminateDrawable().isVisible());
    }

    public final void n() {
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().u().d(this.m);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().l(this.n);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().l(this.n);
        }
    }

    public void o(int i, boolean z) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() == null || z) {
                return;
            }
            getProgressDrawable().jumpToCurrentState();
            return;
        }
        if (getProgressDrawable() != null) {
            this.f8777b = i;
            this.c = z;
            this.i = true;
            if (!getIndeterminateDrawable().isVisible() || this.h.a(getContext().getContentResolver()) == 0.0f) {
                this.m.onAnimationEnd(getIndeterminateDrawable());
            } else {
                getIndeterminateDrawable().u().f();
            }
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        n();
        if (q()) {
            k();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.l);
        removeCallbacks(this.f8778k);
        ((b57) getCurrentDrawable()).h();
        p();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        try {
            int iSave = canvas.save();
            if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
                canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            }
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i, int i2) {
        try {
            super.onMeasure(i, i2);
            q57<S> currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            int iE = currentDrawingDelegate.e();
            int iD = currentDrawingDelegate.d();
            setMeasuredDimension(iE < 0 ? getMeasuredWidth() : iE + getPaddingLeft() + getPaddingRight(), iD < 0 ? getMeasuredHeight() : iD + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        h(i == 0);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        h(false);
    }

    public final void p() {
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().r(this.n);
            getIndeterminateDrawable().u().h();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().r(this.n);
        }
    }

    public boolean q() {
        return androidx.core.view.c.T(this) && getWindowVisibility() == 0 && l();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void setAnimatorDurationScaleProvider(yc1 yc1Var) {
        this.h = yc1Var;
        if (getProgressDrawable() != null) {
            getProgressDrawable().c = yc1Var;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().c = yc1Var;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.f8776a.f = i;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z) {
        try {
            if (z == isIndeterminate()) {
                return;
            }
            b57 b57Var = (b57) getCurrentDrawable();
            if (b57Var != null) {
                b57Var.h();
            }
            super.setIndeterminate(z);
            b57 b57Var2 = (b57) getCurrentDrawable();
            if (b57Var2 != null) {
                b57Var2.p(q(), false, false);
            }
            if ((b57Var2 instanceof o7d) && q()) {
                ((o7d) b57Var2).u().g();
            }
            this.i = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (!(drawable instanceof o7d)) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            ((b57) drawable).h();
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{i8f.b(getContext(), pii.q, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.f8776a.c = iArr;
        getIndeterminateDrawable().u().c();
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        o(i, false);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (!(drawable instanceof g06)) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            g06 g06Var = (g06) drawable;
            g06Var.h();
            super.setProgressDrawable(g06Var);
            g06Var.A(getProgress() / getMax());
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.f8776a.e = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        S s = this.f8776a;
        if (s.d != i) {
            s.d = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        S s = this.f8776a;
        if (s.f17586b != i) {
            s.f17586b = Math.min(i, s.f17585a / 2);
        }
    }

    public void setTrackThickness(int i) {
        S s = this.f8776a;
        if (s.f17585a != i) {
            s.f17585a = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i != 0 && i != 4 && i != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.j = i;
    }

    @Override // android.widget.ProgressBar
    public o7d<S> getIndeterminateDrawable() {
        return (o7d) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    public g06<S> getProgressDrawable() {
        return (g06) super.getProgressDrawable();
    }
}
