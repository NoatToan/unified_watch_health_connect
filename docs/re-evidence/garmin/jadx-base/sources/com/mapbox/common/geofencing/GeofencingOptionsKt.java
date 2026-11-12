package com.mapbox.common.geofencing;

import e23.l;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/Function1;", "Lcom/mapbox/common/geofencing/GeofencingOptions$Builder;", "", "initializer", "Lcom/mapbox/common/geofencing/GeofencingOptions;", "geofencingOptions", "(Le23/l;)Lcom/mapbox/common/geofencing/GeofencingOptions;", "common_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class GeofencingOptionsKt {
    public static final /* synthetic */ GeofencingOptions geofencingOptions(l lVar) {
        lVar.getClass();
        GeofencingOptions.Builder builder = new GeofencingOptions.Builder();
        lVar.invoke(builder);
        return builder.build();
    }
}
