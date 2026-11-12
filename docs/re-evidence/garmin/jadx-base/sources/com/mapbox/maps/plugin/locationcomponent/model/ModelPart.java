package com.mapbox.maps.plugin.locationcomponent.model;

import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxExperimental;
import e23.l;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\r\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R.\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/mapbox/maps/plugin/locationcomponent/model/ModelPart;", "", "", "featureStateId", "<init>", "(Ljava/lang/String;)V", "Lkotlin/Function1;", "Lcom/mapbox/bindgen/Value;", "", "mapFeatureStateDelegate", "", "bindTo$plugin_locationcomponent_release", "(Le23/l;)V", "bindTo", "Ljava/lang/String;", "getFeatureStateId", "()Ljava/lang/String;", "updateFeatureState", "Le23/l;", "getUpdateFeatureState", "()Le23/l;", "setUpdateFeatureState", "plugin-locationcomponent_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@MapboxExperimental
public abstract class ModelPart {
    private final String featureStateId;
    private l<? super Value, Boolean> updateFeatureState;

    public ModelPart(String str) {
        str.getClass();
        this.featureStateId = str;
        this.updateFeatureState = ModelPart$updateFeatureState$1.INSTANCE;
    }

    public final void bindTo$plugin_locationcomponent_release(l<? super Value, Boolean> mapFeatureStateDelegate) {
        mapFeatureStateDelegate.getClass();
        this.updateFeatureState = mapFeatureStateDelegate;
    }

    public final String getFeatureStateId() {
        return this.featureStateId;
    }

    public final l<Value, Boolean> getUpdateFeatureState() {
        return this.updateFeatureState;
    }

    public final void setUpdateFeatureState(l<? super Value, Boolean> lVar) {
        lVar.getClass();
        this.updateFeatureState = lVar;
    }
}
