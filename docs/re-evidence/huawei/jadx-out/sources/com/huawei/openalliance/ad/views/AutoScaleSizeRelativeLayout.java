package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.hw;

/* JADX INFO: loaded from: classes12.dex */
public class AutoScaleSizeRelativeLayout extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Float f20745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RectF f20746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f20747c;
    private Path d;
    private boolean e;

    protected boolean p() {
        return false;
    }

    public void setUseRatioInMatchParentMode(boolean z) {
        this.e = z;
    }

    public void setRectCornerRadius(float f) {
        this.f20747c = f;
        a();
        postInvalidate();
    }

    public void setRatio(Float f) {
        this.f20745a = f;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        Float f;
        float fFloatValue;
        try {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if ((this.e || layoutParams == null || layoutParams.width != -1 || layoutParams.height != -1) && (f = this.f20745a) != null && f.floatValue() > 0.01f) {
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                if (View.MeasureSpec.getMode(i2) == 1073741824 || (size > 0 && size2 > 0)) {
                    if ((size * 1.0f) / size2 > this.f20745a.floatValue()) {
                        size = b(size2, this.f20745a.floatValue());
                    } else {
                        fFloatValue = this.f20745a.floatValue();
                    }
                    i = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                    i2 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
                } else {
                    fFloatValue = this.f20745a.floatValue();
                }
                size2 = a(size, fFloatValue);
                i = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                i2 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
            }
            super.onMeasure(i, i2);
        } catch (Throwable th) {
            hw.c("AutoScaleSizeRl", "onMeasure err: %s", th.getClass().getSimpleName());
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        try {
            super.onLayout(z, i, i2, i3, i4);
            this.f20746b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            a();
        } catch (Throwable th) {
            hw.c("AutoScaleSizeRl", "onLayout err: %s", th.getClass().getSimpleName());
        }
    }

    public float getRatio() {
        Float f = this.f20745a;
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        try {
            if (canvas == null) {
                hw.c("AutoScaleSizeRl", "canvas null");
                return;
            }
            if (this.f20747c > 0.01f) {
                canvas.clipPath(this.d);
            }
            super.draw(canvas);
        } catch (Throwable th) {
            hw.c("AutoScaleSizeRl", "draw err: %s", th.getClass().getSimpleName());
        }
    }

    private int b(int i, float f) {
        float f2 = f * i;
        return p() ? (int) Math.ceil(f2) : (int) f2;
    }

    private void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes;
        if (attributeSet != null && (typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PPSRoundCornerLayout)) != null) {
            try {
                this.f20747c = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.PPSRoundCornerLayout_hiad_roundCorner, 0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        setWillNotDraw(false);
        this.d = new Path();
    }

    private void a() {
        this.d.reset();
        Path path = this.d;
        RectF rectF = this.f20746b;
        float f = this.f20747c;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
    }

    private int a(int i, float f) {
        if (f <= 0.0f) {
            return 0;
        }
        float f2 = (i * 1.0f) / f;
        return p() ? (int) Math.ceil(f2) : (int) f2;
    }

    public AutoScaleSizeRelativeLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f20746b = new RectF();
        this.f20747c = 0.0f;
        this.e = true;
        a(context, attributeSet);
    }

    public AutoScaleSizeRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20746b = new RectF();
        this.f20747c = 0.0f;
        this.e = true;
        a(context, attributeSet);
    }

    public AutoScaleSizeRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20746b = new RectF();
        this.f20747c = 0.0f;
        this.e = true;
        a(context, attributeSet);
    }

    public AutoScaleSizeRelativeLayout(Context context) {
        super(context);
        this.f20746b = new RectF();
        this.f20747c = 0.0f;
        this.e = true;
        a(context, (AttributeSet) null);
    }
}
