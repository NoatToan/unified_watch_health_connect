package com.airbnb.lottie.model.animatable;

import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import defpackage.jb;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public interface AnimatableValue<K, A> {
    BaseKeyframeAnimation<K, A> createAnimation();

    List<jb<K>> getKeyframes();

    boolean isStatic();
}
