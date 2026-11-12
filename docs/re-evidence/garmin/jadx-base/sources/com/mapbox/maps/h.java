package com.mapbox.maps;

import com.mapbox.bindgen.Expected;
import com.mapbox.maps.interactions.QueryRenderedFeaturesetFeaturesCallback;
import com.mapbox.maps.interactions.TypedFeaturesetDescriptor;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements QueryRenderedFeaturesCallback, Expected.Action {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ QueryRenderedFeaturesetFeaturesCallback f54503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TypedFeaturesetDescriptor f54504b;

    public /* synthetic */ h(TypedFeaturesetDescriptor typedFeaturesetDescriptor, QueryRenderedFeaturesetFeaturesCallback queryRenderedFeaturesetFeaturesCallback) {
        this.f54503a = queryRenderedFeaturesetFeaturesCallback;
        this.f54504b = typedFeaturesetDescriptor;
    }

    @Override // com.mapbox.bindgen.Expected.Action
    public void run(Object obj) {
        MapboxMap.queryRenderedFeatures$lambda$44$lambda$43(this.f54503a, this.f54504b, (List) obj);
    }

    @Override // com.mapbox.maps.QueryRenderedFeaturesCallback
    public void run(Expected expected) {
        MapboxMap.queryRenderedFeatures$lambda$44(this.f54503a, this.f54504b, expected);
    }
}
