package com.mapbox.maps.plugin.locationcomponent.model;

import com.mapbox.bindgen.Value;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public /* synthetic */ class AnimatableModel$bindTo$1$1 extends q implements l<Value, Boolean> {
    public AnimatableModel$bindTo$1$1(Object obj) {
        super(1, obj, AnimatableModel.class, "updateFeatureState", "updateFeatureState(Lcom/mapbox/bindgen/Value;)Z", 0);
    }

    @Override // e23.l
    public final Boolean invoke(Value value) {
        value.getClass();
        return Boolean.valueOf(((AnimatableModel) this.receiver).updateFeatureState(value));
    }
}
