package com.airbnb.lottie.value;

import android.view.animation.Interpolator;
import com.airbnb.lottie.utils.MiscUtils;

/* JADX INFO: loaded from: classes7.dex */
public class LottieInterpolatedFloatValue extends LottieInterpolatedValue<Float> {
    public LottieInterpolatedFloatValue(Float f14, Float f15) {
        super(f14, f15);
    }

    @Override // com.airbnb.lottie.value.LottieInterpolatedValue, com.airbnb.lottie.value.LottieValueCallback
    public /* bridge */ /* synthetic */ Object getValue(LottieFrameInfo lottieFrameInfo) {
        return super.getValue(lottieFrameInfo);
    }

    @Override // com.airbnb.lottie.value.LottieInterpolatedValue
    public Float interpolateValue(Float f14, Float f15, float f16) {
        return Float.valueOf(MiscUtils.lerp(f14.floatValue(), f15.floatValue(), f16));
    }

    public LottieInterpolatedFloatValue(Float f14, Float f15, Interpolator interpolator) {
        super(f14, f15, interpolator);
    }
}
