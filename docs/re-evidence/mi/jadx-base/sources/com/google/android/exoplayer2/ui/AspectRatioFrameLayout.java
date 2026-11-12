package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.z3j;

/* JADX INFO: loaded from: classes4.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f8329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f8330b;
    public int c;

    public interface b {
    }

    public final class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f8331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f8332b;
        public boolean c;
        public boolean d;

        public c() {
        }

        public void a(float f, float f2, boolean z) {
            this.f8331a = f;
            this.f8332b = f2;
            this.c = z;
            if (this.d) {
                return;
            }
            this.d = true;
            AspectRatioFrameLayout.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.d = false;
            AspectRatioFrameLayout.a(AspectRatioFrameLayout.this);
        }
    }

    public AspectRatioFrameLayout(Context context) {
        this(context, null);
    }

    public static /* synthetic */ b a(AspectRatioFrameLayout aspectRatioFrameLayout) {
        aspectRatioFrameLayout.getClass();
        return null;
    }

    public int getResizeMode() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        float f;
        float f2;
        super.onMeasure(i, i2);
        if (this.f8330b <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f3 = measuredWidth;
        float f4 = measuredHeight;
        float f5 = f3 / f4;
        float f6 = (this.f8330b / f5) - 1.0f;
        if (Math.abs(f6) <= 0.01f) {
            this.f8329a.a(this.f8330b, f5, false);
            return;
        }
        int i3 = this.c;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    f = this.f8330b;
                } else if (i3 == 4) {
                    if (f6 > 0.0f) {
                        f = this.f8330b;
                    } else {
                        f2 = this.f8330b;
                    }
                }
                measuredWidth = (int) (f4 * f);
            } else {
                f2 = this.f8330b;
            }
            measuredHeight = (int) (f3 / f2);
        } else if (f6 > 0.0f) {
            f2 = this.f8330b;
            measuredHeight = (int) (f3 / f2);
        } else {
            f = this.f8330b;
            measuredWidth = (int) (f4 * f);
        }
        this.f8329a.a(this.f8330b, f5, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f) {
        if (this.f8330b != f) {
            this.f8330b = f;
            requestLayout();
        }
    }

    public void setAspectRatioListener(b bVar) {
    }

    public void setResizeMode(int i) {
        if (this.c != i) {
            this.c = i;
            requestLayout();
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, z3j.f40839a, 0, 0);
            try {
                this.c = typedArrayObtainStyledAttributes.getInt(z3j.f40840b, 0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.f8329a = new c();
    }
}
