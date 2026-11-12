package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.model.content.GradientColor;
import com.airbnb.lottie.value.Keyframe;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class GradientColorKeyframeAnimation extends a<GradientColor> {
    private final GradientColor g;

    public GradientColorKeyframeAnimation(List<Keyframe<GradientColor>> list) {
        super(list);
        GradientColor gradientColor = list.get(0).startValue;
        int size = gradientColor != null ? gradientColor.getSize() : 0;
        this.g = new GradientColor(new float[size], new int[size]);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public GradientColor getValue(Keyframe<GradientColor> keyframe, float f) {
        this.g.lerp(keyframe.startValue, keyframe.endValue, f);
        return this.g;
    }
}
