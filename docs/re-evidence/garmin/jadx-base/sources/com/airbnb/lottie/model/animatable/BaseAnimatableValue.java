package com.airbnb.lottie.model.animatable;

import com.airbnb.lottie.value.Keyframe;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
abstract class BaseAnimatableValue<V, O> implements AnimatableValue<V, O> {
    final List<Keyframe<V>> keyframes;

    public BaseAnimatableValue(V v14) {
        this(Collections.singletonList(new Keyframe(v14)));
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public List<Keyframe<V>> getKeyframes() {
        return this.keyframes;
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public boolean isStatic() {
        return this.keyframes.isEmpty() || (this.keyframes.size() == 1 && this.keyframes.get(0).isStatic());
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        if (!this.keyframes.isEmpty()) {
            sb3.append("values=");
            sb3.append(Arrays.toString(this.keyframes.toArray()));
        }
        return sb3.toString();
    }

    public BaseAnimatableValue(List<Keyframe<V>> list) {
        this.keyframes = list;
    }
}
