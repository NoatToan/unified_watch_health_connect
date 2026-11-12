package com.mapbox.maps.extension.compose;

import android.content.Context;
import com.mapbox.maps.MapView;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class MapboxMapKt$MapboxMap$3$1 extends w implements l<Context, MapView> {
    final /* synthetic */ MapView $mapView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxMapKt$MapboxMap$3$1(MapView mapView) {
        super(1);
        this.$mapView = mapView;
    }

    @Override // e23.l
    public final MapView invoke(Context context) {
        context.getClass();
        return this.$mapView;
    }
}
