package com.brentvatne.exoplayer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f6925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6926b;

    public AspectRatioFrameLayout(Context context) {
        this(context, null);
    }

    public float getAspectRatio() {
        return this.f6925a;
    }

    public int getResizeMode() {
        return this.f6926b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        float f;
        float f2;
        super.onMeasure(i, i2);
        if (this.f6925a == 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f3 = measuredWidth;
        float f4 = measuredHeight;
        float f5 = (this.f6925a / (f3 / f4)) - 1.0f;
        if (Math.abs(f5) <= 0.01f) {
            return;
        }
        int i3 = this.f6926b;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 == 4) {
                        int i4 = (int) (this.f6925a * f4);
                        if (i4 < measuredWidth) {
                            float f6 = i4;
                            float f7 = f3 / f6;
                            measuredWidth = (int) (f6 * f7);
                            measuredHeight = (int) (f4 * f7);
                        } else {
                            measuredWidth = i4;
                        }
                    } else if (f5 > 0.0f) {
                        f = this.f6925a;
                    } else {
                        f2 = this.f6925a;
                    }
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            }
            f2 = this.f6925a;
            measuredWidth = (int) (f4 * f2);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
        f = this.f6925a;
        measuredHeight = (int) (f3 / f);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f) {
        if (this.f6925a != f) {
            this.f6925a = f;
            requestLayout();
        }
    }

    public void setResizeMode(int i) {
        if (this.f6926b != i) {
            this.f6926b = i;
            requestLayout();
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6926b = 0;
    }
}
