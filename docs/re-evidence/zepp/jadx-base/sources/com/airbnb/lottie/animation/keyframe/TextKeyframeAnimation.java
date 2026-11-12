package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.value.Keyframe;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class TextKeyframeAnimation extends a<DocumentData> {
    public TextKeyframeAnimation(List<Keyframe<DocumentData>> list) {
        super(list);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public DocumentData getValue(Keyframe<DocumentData> keyframe, float f) {
        DocumentData documentData;
        return (f != 1.0f || (documentData = keyframe.endValue) == null) ? keyframe.startValue : documentData;
    }
}
