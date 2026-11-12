package com.xiaomi.wearable.play;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.c5j;

/* JADX INFO: loaded from: classes2.dex */
public final class PlayerAspectRatioFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f14423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14424b;

    public PlayerAspectRatioFrameLayout(Context context) {
        this(context, null);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        double d;
        super.onMeasure(i, i2);
        if (this.f14424b == 3 || this.f14423a <= 0.0d) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        double d2 = measuredWidth;
        double d3 = measuredHeight;
        double d4 = (this.f14423a / (d2 / d3)) - 1.0d;
        if (Math.abs(d4) <= 0.009999999776482582d) {
            return;
        }
        int i3 = this.f14424b;
        if (i3 == 1) {
            d = this.f14423a;
        } else {
            if (i3 == 2 || d4 <= 0.0d) {
                double d5 = this.f14423a;
                measuredWidth = (int) (d3 * d5);
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            }
            d = this.f14423a;
        }
        measuredHeight = (int) (d2 / d);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(double d) {
        if (this.f14423a != d) {
            this.f14423a = d;
            requestLayout();
        }
    }

    public void setResizeMode(int i) {
        if (this.f14424b != i) {
            this.f14424b = i;
            requestLayout();
        }
    }

    public PlayerAspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14424b = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, c5j.L1, 0, 0);
            try {
                this.f14424b = typedArrayObtainStyledAttributes.getInt(c5j.M1, 0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
    }
}
