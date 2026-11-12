package com.mapbox.maps.plugin.locationcomponent;

import com.mapbox.bindgen.Expected;
import com.mapbox.common.location.GetLocationCallback;
import com.mapbox.common.location.Location;
import com.mapbox.maps.QueryRenderedFeaturesCallback;
import q53.t;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements GetLocationCallback, QueryRenderedFeaturesCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f54565a;

    public /* synthetic */ a(Object obj) {
        this.f54565a = obj;
    }

    @Override // com.mapbox.maps.QueryRenderedFeaturesCallback
    public void run(Expected expected) {
        LocationComponentPluginImpl.isLocatedAt$lambda$6((PuckLocatedAtPointListener) this.f54565a, expected);
    }

    @Override // com.mapbox.common.location.GetLocationCallback
    public void run(Location location) {
        DefaultLocationProvider.AnonymousClass1.invokeSuspend$lambda$1((t) this.f54565a, location);
    }
}
