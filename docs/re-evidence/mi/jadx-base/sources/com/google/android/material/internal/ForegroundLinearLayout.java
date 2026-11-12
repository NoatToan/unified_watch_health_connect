package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.LinearLayoutCompat;
import defpackage.b4j;
import defpackage.c9p;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ForegroundLinearLayout extends LinearLayoutCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f8740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f8741b;
    public final Rect c;
    public int d;
    public boolean e;
    public boolean f;

    public ForegroundLinearLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f8740a;
        if (drawable != null) {
            if (this.f) {
                this.f = false;
                Rect rect = this.f8741b;
                Rect rect2 = this.c;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.e) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.d, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @RequiresApi(21)
    @TargetApi(21)
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f8740a;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f8740a;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f8740a.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f8740a;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    @RequiresApi(11)
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f8740a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f = z | this.f;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f8740a;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f8740a);
            }
            this.f8740a = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.d == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.d != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.d = i;
            if (i == 119 && this.f8740a != null) {
                this.f8740a.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f8740a;
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8741b = new Rect();
        this.c = new Rect();
        this.d = 119;
        this.e = true;
        this.f = false;
        TypedArray typedArrayH = c9p.h(context, attributeSet, b4j.o3, i, 0, new int[0]);
        this.d = typedArrayH.getInt(b4j.q3, this.d);
        Drawable drawable = typedArrayH.getDrawable(b4j.p3);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.e = typedArrayH.getBoolean(b4j.r3, true);
        typedArrayH.recycle();
    }
}
