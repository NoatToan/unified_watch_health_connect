package com.mapbox.maps;

import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.interactions.FeatureStateCallback;
import com.mapbox.maps.interactions.FeaturesetFeature;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements Expected.Action, QueryFeatureStateCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FeatureStateCallback f54500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FeaturesetFeature f54501b;

    public /* synthetic */ f(FeaturesetFeature featuresetFeature, FeatureStateCallback featureStateCallback) {
        this.f54500a = featureStateCallback;
        this.f54501b = featuresetFeature;
    }

    @Override // com.mapbox.bindgen.Expected.Action
    public void run(Object obj) {
        MapboxMap.getFeatureState$lambda$30$lambda$29$lambda$28(this.f54500a, this.f54501b, (Value) obj);
    }

    @Override // com.mapbox.maps.QueryFeatureStateCallback
    public void run(Expected expected) {
        MapboxMap.getFeatureState$lambda$30$lambda$29(this.f54500a, this.f54501b, expected);
    }
}
