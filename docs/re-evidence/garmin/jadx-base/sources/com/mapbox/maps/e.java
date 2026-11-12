package com.mapbox.maps;

import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.interactions.FeatureStateCallback;
import com.mapbox.maps.interactions.TypedFeaturesetDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Expected.Action, QueryFeatureStateCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FeatureStateCallback f54417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TypedFeaturesetDescriptor f54418b;

    public /* synthetic */ e(FeatureStateCallback featureStateCallback, TypedFeaturesetDescriptor typedFeaturesetDescriptor) {
        this.f54417a = featureStateCallback;
        this.f54418b = typedFeaturesetDescriptor;
    }

    @Override // com.mapbox.bindgen.Expected.Action
    public void run(Object obj) {
        MapboxMap.getFeatureState$lambda$34$lambda$33(this.f54417a, this.f54418b, (Value) obj);
    }

    @Override // com.mapbox.maps.QueryFeatureStateCallback
    public void run(Expected expected) {
        MapboxMap.getFeatureState$lambda$34(this.f54417a, this.f54418b, expected);
    }
}
