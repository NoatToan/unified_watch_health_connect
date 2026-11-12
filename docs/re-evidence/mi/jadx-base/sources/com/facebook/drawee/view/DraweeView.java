package com.facebook.drawee.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import defpackage.epa;
import defpackage.g57;
import defpackage.h57;
import defpackage.i4h;
import defpackage.i57;

/* JADX INFO: loaded from: classes4.dex */
public class DraweeView<DH extends h57> extends ImageView {
    public static boolean f = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.C0150a f7108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f7109b;
    public i57<DH> c;
    public boolean d;
    public boolean e;

    public DraweeView(Context context) {
        super(context);
        this.f7108a = new a.C0150a();
        this.f7109b = 0.0f;
        this.d = false;
        this.e = false;
        c(context);
    }

    public static void setGlobalLegacyVisibilityHandlingEnabled(boolean z) {
        f = z;
    }

    public void a() {
        this.c.j();
    }

    public void b() {
        this.c.k();
    }

    public final void c(Context context) {
        boolean zD;
        try {
            if (epa.d()) {
                epa.a("DraweeView#init");
            }
            if (this.d) {
                if (zD) {
                    return;
                } else {
                    return;
                }
            }
            boolean z = true;
            this.d = true;
            this.c = i57.d(null, context);
            ColorStateList imageTintList = getImageTintList();
            if (imageTintList == null) {
                if (zD) {
                    return;
                } else {
                    return;
                }
            }
            setColorFilter(imageTintList.getDefaultColor());
            if (!f || context.getApplicationInfo().targetSdkVersion < 24) {
                z = false;
            }
            this.e = z;
        } finally {
            if (epa.d()) {
                epa.b();
            }
        }
    }

    public final void d() {
        Drawable drawable;
        if (!this.e || (drawable = getDrawable()) == null) {
            return;
        }
        drawable.setVisible(getVisibility() == 0, false);
    }

    public void e() {
        a();
    }

    public void f() {
        b();
    }

    public float getAspectRatio() {
        return this.f7109b;
    }

    public g57 getController() {
        return this.c.f();
    }

    public DH getHierarchy() {
        return (DH) this.c.g();
    }

    public Drawable getTopLevelDrawable() {
        return this.c.h();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
        e();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
        f();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        d();
        e();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        a.C0150a c0150a = this.f7108a;
        c0150a.f7110a = i;
        c0150a.f7111b = i2;
        a.b(c0150a, this.f7109b, getLayoutParams(), getPaddingLeft() + getPaddingRight(), getPaddingTop() + getPaddingBottom());
        a.C0150a c0150a2 = this.f7108a;
        super.onMeasure(c0150a2.f7110a, c0150a2.f7111b);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        d();
        f();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.c.l(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        d();
    }

    public void setAspectRatio(float f2) {
        if (f2 == this.f7109b) {
            return;
        }
        this.f7109b = f2;
        requestLayout();
    }

    public void setController(g57 g57Var) {
        this.c.n(g57Var);
        super.setImageDrawable(this.c.h());
    }

    public void setHierarchy(DH dh) {
        this.c.o(dh);
        super.setImageDrawable(this.c.h());
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageBitmap(Bitmap bitmap) {
        c(getContext());
        this.c.n(null);
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageDrawable(Drawable drawable) {
        c(getContext());
        this.c.n(null);
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageResource(int i) {
        c(getContext());
        this.c.n(null);
        super.setImageResource(i);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageURI(Uri uri) {
        c(getContext());
        this.c.n(null);
        super.setImageURI(uri);
    }

    public void setLegacyVisibilityHandlingEnabled(boolean z) {
        this.e = z;
    }

    @Override // android.view.View
    public String toString() {
        i4h.b bVarD = i4h.d(this);
        i57<DH> i57Var = this.c;
        return bVarD.b("holder", i57Var != null ? i57Var.toString() : "<no holder set>").toString();
    }

    public DraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7108a = new a.C0150a();
        this.f7109b = 0.0f;
        this.d = false;
        this.e = false;
        c(context);
    }

    public DraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7108a = new a.C0150a();
        this.f7109b = 0.0f;
        this.d = false;
        this.e = false;
        c(context);
    }
}
