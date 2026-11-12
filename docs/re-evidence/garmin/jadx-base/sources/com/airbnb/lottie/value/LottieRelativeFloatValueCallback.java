package com.airbnb.lottie.value;

import com.airbnb.lottie.utils.MiscUtils;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
public class LottieRelativeFloatValueCallback extends LottieValueCallback<Float> {
    public LottieRelativeFloatValueCallback() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Float getOffset(LottieFrameInfo<Float> lottieFrameInfo) {
        T t7 = this.value;
        if (t7 != 0) {
            return (Float) t7;
        }
        h.s("You must provide a static value in the constructor , call setValue, or override getValue.");
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.airbnb.lottie.value.LottieValueCallback
    public Float getValue(LottieFrameInfo<Float> lottieFrameInfo) {
        return Float.valueOf(getOffset(lottieFrameInfo).floatValue() + MiscUtils.lerp(lottieFrameInfo.getStartValue().floatValue(), lottieFrameInfo.getEndValue().floatValue(), lottieFrameInfo.getInterpolatedKeyframeProgress()));
    }

    public LottieRelativeFloatValueCallback(Float f14) {
        super(f14);
    }
}
