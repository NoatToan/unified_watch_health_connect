package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.c;
import defpackage.b4j;
import defpackage.c9p;
import defpackage.k3j;
import defpackage.o7h;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ScrimInsetsFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f8744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Rect f8745b;
    public Rect c;
    public boolean d;
    public boolean e;

    public class a implements o7h {
        public a() {
        }

        @Override // defpackage.o7h
        public WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat) {
            ScrimInsetsFrameLayout scrimInsetsFrameLayout = ScrimInsetsFrameLayout.this;
            if (scrimInsetsFrameLayout.f8745b == null) {
                scrimInsetsFrameLayout.f8745b = new Rect();
            }
            ScrimInsetsFrameLayout.this.f8745b.set(windowInsetsCompat.k(), windowInsetsCompat.m(), windowInsetsCompat.l(), windowInsetsCompat.j());
            ScrimInsetsFrameLayout.this.a(windowInsetsCompat);
            ScrimInsetsFrameLayout.this.setWillNotDraw(!windowInsetsCompat.n() || ScrimInsetsFrameLayout.this.f8744a == null);
            c.h0(ScrimInsetsFrameLayout.this);
            return windowInsetsCompat.c();
        }
    }

    public ScrimInsetsFrameLayout(Context context) {
        this(context, null);
    }

    public void a(WindowInsetsCompat windowInsetsCompat) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f8745b == null || this.f8744a == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        if (this.d) {
            this.c.set(0, 0, width, this.f8745b.top);
            this.f8744a.setBounds(this.c);
            this.f8744a.draw(canvas);
        }
        if (this.e) {
            this.c.set(0, height - this.f8745b.bottom, width, height);
            this.f8744a.setBounds(this.c);
            this.f8744a.draw(canvas);
        }
        Rect rect = this.c;
        Rect rect2 = this.f8745b;
        rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
        this.f8744a.setBounds(this.c);
        this.f8744a.draw(canvas);
        Rect rect3 = this.c;
        Rect rect4 = this.f8745b;
        rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
        this.f8744a.setBounds(this.c);
        this.f8744a.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f8744a;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f8744a;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z) {
        this.e = z;
    }

    public void setDrawTopInsetForeground(boolean z) {
        this.d = z;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.f8744a = drawable;
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new Rect();
        this.d = true;
        this.e = true;
        TypedArray typedArrayH = c9p.h(context, attributeSet, b4j.h7, i, k3j.n, new int[0]);
        this.f8744a = typedArrayH.getDrawable(b4j.i7);
        typedArrayH.recycle();
        setWillNotDraw(true);
        c.H0(this, new a());
    }
}
