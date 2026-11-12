package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import androidx.core.view.c;
import defpackage.c9p;
import defpackage.h2j;
import defpackage.iqi;
import defpackage.j7p;
import defpackage.k3j;
import defpackage.l8f;
import defpackage.pii;
import defpackage.pmi;
import defpackage.u7p;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes5.dex */
public class a extends Drawable implements u7p.b {
    public static final int n = k3j.f23395r;
    public static final int o = pii.c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference<Context> f8537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l8f f8538b;
    public final u7p c;
    public final Rect d;
    public final BadgeState e;
    public float f;
    public float g;
    public int h;
    public float i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f8539k;
    public WeakReference<View> l;
    public WeakReference<FrameLayout> m;

    /* JADX INFO: renamed from: com.google.android.material.badge.a$a, reason: collision with other inner class name */
    public class RunnableC0211a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f8540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ FrameLayout f8541b;

        public RunnableC0211a(View view, FrameLayout frameLayout) {
            this.f8540a = view;
            this.f8541b = frameLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.B(this.f8540a, this.f8541b);
        }
    }

    public a(Context context, int i, int i2, int i3, BadgeState.State state) {
        this.f8537a = new WeakReference<>(context);
        c9p.c(context);
        this.d = new Rect();
        this.f8538b = new l8f();
        u7p u7pVar = new u7p(this);
        this.c = u7pVar;
        u7pVar.e().setTextAlign(Paint.Align.CENTER);
        y(k3j.e);
        this.e = new BadgeState(context, i, i2, i3, state);
        w();
    }

    public static void A(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    public static a c(Context context) {
        return new a(context, 0, o, n, null);
    }

    public static a d(Context context, BadgeState.State state) {
        return new a(context, 0, o, n, state);
    }

    private void e(Canvas canvas) {
        Rect rect = new Rect();
        String strF = f();
        this.c.e().getTextBounds(strF, 0, strF.length(), rect);
        canvas.drawText(strF, this.f, this.g + (rect.height() / 2), this.c.e());
    }

    private void x(j7p j7pVar) {
        Context context;
        if (this.c.d() == j7pVar || (context = this.f8537a.get()) == null) {
            return;
        }
        this.c.h(j7pVar, context);
        C();
    }

    private void y(int i) {
        Context context = this.f8537a.get();
        if (context == null) {
            return;
        }
        x(new j7p(context, i));
    }

    public void B(View view, FrameLayout frameLayout) {
        this.l = new WeakReference<>(view);
        boolean z = b.f8542a;
        if (z && frameLayout == null) {
            z(view);
        } else {
            this.m = new WeakReference<>(frameLayout);
        }
        if (!z) {
            A(view);
        }
        C();
        invalidateSelf();
    }

    public final void C() {
        Context context = this.f8537a.get();
        WeakReference<View> weakReference = this.l;
        View view = weakReference != null ? weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.d);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference<FrameLayout> weakReference2 = this.m;
        FrameLayout frameLayout = weakReference2 != null ? weakReference2.get() : null;
        if (frameLayout != null || b.f8542a) {
            if (frameLayout == null) {
                frameLayout = (ViewGroup) view.getParent();
            }
            frameLayout.offsetDescendantRectToMyCoords(view, rect2);
        }
        b(context, rect2, view);
        b.f(this.d, this.f, this.g, this.j, this.f8539k);
        this.f8538b.Y(this.i);
        if (rect.equals(this.d)) {
            return;
        }
        this.f8538b.setBounds(this.d);
    }

    public final void D() {
        this.h = ((int) Math.pow(10.0d, ((double) j()) - 1.0d)) - 1;
    }

    @Override // u7p.b
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void a() {
        invalidateSelf();
    }

    public final void b(Context context, Rect rect, View view) {
        int iN = n();
        int iF = this.e.f();
        if (iF == 8388691 || iF == 8388693) {
            this.g = rect.bottom - iN;
        } else {
            this.g = rect.top + iN;
        }
        if (k() <= 9) {
            float f = !o() ? this.e.c : this.e.d;
            this.i = f;
            this.f8539k = f;
            this.j = f;
        } else {
            float f2 = this.e.d;
            this.i = f2;
            this.f8539k = f2;
            this.j = (this.c.f(f()) / 2.0f) + this.e.e;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(o() ? pmi.R : pmi.O);
        int iM = m();
        int iF2 = this.e.f();
        if (iF2 == 8388659 || iF2 == 8388691) {
            this.f = c.A(view) == 0 ? (rect.left - this.j) + dimensionPixelSize + iM : ((rect.right + this.j) - dimensionPixelSize) - iM;
        } else {
            this.f = c.A(view) == 0 ? ((rect.right + this.j) - dimensionPixelSize) - iM : (rect.left - this.j) + dimensionPixelSize + iM;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f8538b.draw(canvas);
        if (o()) {
            e(canvas);
        }
    }

    public final String f() {
        if (k() <= this.h) {
            return NumberFormat.getInstance(this.e.o()).format(k());
        }
        Context context = this.f8537a.get();
        return context == null ? "" : String.format(this.e.o(), context.getString(h2j.v), Integer.valueOf(this.h), Marker.ANY_NON_NULL_MARKER);
    }

    public CharSequence g() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        if (!o()) {
            return this.e.i();
        }
        if (this.e.j() == 0 || (context = this.f8537a.get()) == null) {
            return null;
        }
        return k() <= this.h ? context.getResources().getQuantityString(this.e.j(), k(), Integer.valueOf(k())) : context.getString(this.e.h(), Integer.valueOf(this.h));
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.e.d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.d.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public FrameLayout h() {
        WeakReference<FrameLayout> weakReference = this.m;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int i() {
        return this.e.l();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    public int j() {
        return this.e.m();
    }

    public int k() {
        if (o()) {
            return this.e.n();
        }
        return 0;
    }

    public BadgeState.State l() {
        return this.e.p();
    }

    public final int m() {
        return (o() ? this.e.k() : this.e.l()) + this.e.b();
    }

    public final int n() {
        return (o() ? this.e.q() : this.e.r()) + this.e.c();
    }

    public boolean o() {
        return this.e.s();
    }

    @Override // android.graphics.drawable.Drawable, u7p.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public final void p() {
        this.c.e().setAlpha(getAlpha());
        invalidateSelf();
    }

    public final void q() {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(this.e.e());
        if (this.f8538b.x() != colorStateListValueOf) {
            this.f8538b.b0(colorStateListValueOf);
            invalidateSelf();
        }
    }

    public final void r() {
        WeakReference<View> weakReference = this.l;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = this.l.get();
        WeakReference<FrameLayout> weakReference2 = this.m;
        B(view, weakReference2 != null ? weakReference2.get() : null);
    }

    public final void s() {
        this.c.e().setColor(this.e.g());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.e.v(i);
        p();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public final void t() {
        D();
        this.c.i(true);
        C();
        invalidateSelf();
    }

    public final void u() {
        this.c.i(true);
        C();
        invalidateSelf();
    }

    public final void v() {
        boolean zT = this.e.t();
        setVisible(zT, false);
        if (!b.f8542a || h() == null || zT) {
            return;
        }
        ((ViewGroup) h().getParent()).invalidate();
    }

    public final void w() {
        t();
        u();
        p();
        q();
        s();
        r();
        C();
        v();
    }

    public final void z(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null || viewGroup.getId() != iqi.F) {
            WeakReference<FrameLayout> weakReference = this.m;
            if (weakReference == null || weakReference.get() != viewGroup) {
                A(view);
                FrameLayout frameLayout = new FrameLayout(view.getContext());
                frameLayout.setId(iqi.F);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.setLayoutParams(view.getLayoutParams());
                frameLayout.setMinimumWidth(view.getWidth());
                frameLayout.setMinimumHeight(view.getHeight());
                int iIndexOfChild = viewGroup.indexOfChild(view);
                viewGroup.removeViewAt(iIndexOfChild);
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.addView(view);
                viewGroup.addView(frameLayout, iIndexOfChild);
                this.m = new WeakReference<>(frameLayout);
                frameLayout.post(new RunnableC0211a(view, frameLayout));
            }
        }
    }
}
