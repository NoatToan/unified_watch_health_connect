package com.huawei.uikit.hwcommon.anim;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.animation.Interpolator;
import com.huawei.uikit.hwcommon.R;

/* JADX INFO: loaded from: classes20.dex */
public class HwCubicBezierInterpolator implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    float f29352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    float f29353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    float f29354c;
    float d;

    public HwCubicBezierInterpolator(float f, float f2, float f3, float f4) {
        this.f29352a = f;
        this.f29354c = f2;
        this.d = f3;
        this.f29353b = f4;
    }

    private float e(float f) {
        float f2 = 1.0f - f;
        float f3 = 3.0f * f2;
        return (f2 * f3 * f * this.f29352a) + (f3 * f * f * this.d) + (f * f * f);
    }

    private float e(TypedValue typedValue) {
        if (typedValue == null) {
            return 1.0f;
        }
        int i = typedValue.type;
        if (i == 6) {
            return TypedValue.complexToFloat(typedValue.data);
        }
        if (i == 4) {
            return typedValue.getFloat();
        }
        if (i < 16 || i > 31) {
            return 1.0f;
        }
        return typedValue.data;
    }

    protected float a(float f) {
        float f2 = 1.0f - f;
        float f3 = 3.0f * f2;
        return (f2 * f3 * f * this.f29354c) + (f3 * f * f * this.f29353b) + (f * f * f);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        return a(b(f) * 2.5E-4f);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("HwCubicBezierInterpolator  mControlPoint1x = ");
        stringBuffer.append(this.f29352a);
        stringBuffer.append(", mControlPoint1y = ").append(this.f29354c);
        stringBuffer.append(", mControlPoint2x = ").append(this.d);
        stringBuffer.append(", mControlPoint2y = ").append(this.f29353b);
        return stringBuffer.toString();
    }

    public HwCubicBezierInterpolator(Context context, AttributeSet attributeSet) {
        this(context.getResources(), context.getTheme(), attributeSet);
    }

    public HwCubicBezierInterpolator(Resources resources, Resources.Theme theme, AttributeSet attributeSet) {
        TypedArray typedArrayObtainAttributes;
        this.f29352a = 0.0f;
        this.f29354c = 0.0f;
        this.d = 0.0f;
        this.f29353b = 0.0f;
        if (theme != null) {
            typedArrayObtainAttributes = theme.obtainStyledAttributes(attributeSet, R.styleable.HwTranslateAnimation, 0, 0);
        } else {
            typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, R.styleable.HwTranslateAnimation);
        }
        this.f29352a = e(typedArrayObtainAttributes.peekValue(R.styleable.HwTranslateAnimation_hwFromXDelta));
        this.f29354c = e(typedArrayObtainAttributes.peekValue(R.styleable.HwTranslateAnimation_hwFromYDelta));
        this.d = e(typedArrayObtainAttributes.peekValue(R.styleable.HwTranslateAnimation_hwToXDelta));
        this.f29353b = e(typedArrayObtainAttributes.peekValue(R.styleable.HwTranslateAnimation_hwToYDelta));
        typedArrayObtainAttributes.recycle();
    }

    long b(float f) {
        long j = 0;
        long j2 = 4000;
        while (j <= j2) {
            long j3 = (j + j2) >>> 1;
            float fE = e(j3 * 2.5E-4f);
            if (fE < f) {
                j = j3 + 1;
            } else {
                if (fE <= f) {
                    return j3;
                }
                j2 = j3 - 1;
            }
        }
        return j;
    }
}
