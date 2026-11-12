package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.model.content.GradientColor;
import com.airbnb.lottie.value.Keyframe;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class GradientColorKeyframeAnimation extends KeyframeAnimation<GradientColor> {
    private final GradientColor gradientColor;

    public GradientColorKeyframeAnimation(List<Keyframe<GradientColor>> list) {
        super(list);
        int iMax = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            GradientColor gradientColor = list.get(i14).startValue;
            if (gradientColor != null) {
                iMax = Math.max(iMax, gradientColor.getSize());
            }
        }
        this.gradientColor = new GradientColor(new float[iMax], new int[iMax]);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public GradientColor getValue(Keyframe<GradientColor> keyframe, float f14) {
        this.gradientColor.lerp(keyframe.startValue, keyframe.endValue, f14);
        return this.gradientColor;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public /* bridge */ /* synthetic */ Object getValue(Keyframe keyframe, float f14) {
        return getValue((Keyframe<GradientColor>) keyframe, f14);
    }
}
