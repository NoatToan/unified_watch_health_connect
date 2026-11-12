package com.airbnb.lottie.model.animatable;

import defpackage.jb;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public abstract class BaseAnimatableValue<V, O> implements AnimatableValue<V, O> {
    protected final List<jb<V>> keyframes;

    BaseAnimatableValue(V v) {
        this(Collections.singletonList(new jb(v)));
    }

    public BaseAnimatableValue(List<jb<V>> list) {
        this.keyframes = list;
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public List<jb<V>> getKeyframes() {
        return this.keyframes;
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public boolean isStatic() {
        return this.keyframes.isEmpty() || (this.keyframes.size() == 1 && this.keyframes.get(0).i());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.keyframes.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.keyframes.toArray()));
        }
        return sb.toString();
    }
}
