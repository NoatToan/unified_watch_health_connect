package com.mapbox.maps.extension.compose.animation.viewport;

import com.mapbox.maps.MapView;
import com.mapbox.maps.plugin.viewport.ViewportUtils;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;
import p3.h0;
import p3.i0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class MapViewportState$BindToMap$1 extends w implements l<i0, h0> {
    final /* synthetic */ MapView $mapView;
    final /* synthetic */ MapViewportState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapViewportState$BindToMap$1(MapViewportState mapViewportState, MapView mapView) {
        super(1);
        this.this$0 = mapViewportState;
        this.$mapView = mapView;
    }

    @Override // e23.l
    public final h0 invoke(i0 i0Var) {
        i0Var.getClass();
        this.this$0.mapView = this.$mapView;
        final MapView mapView = this.$mapView;
        final MapViewportState mapViewportState = this.this$0;
        return new h0() { // from class: com.mapbox.maps.extension.compose.animation.viewport.MapViewportState$BindToMap$1$invoke$$inlined$onDispose$1
            @Override // p3.h0
            public void dispose() {
                ViewportUtils.getViewport(mapView).idle();
                mapViewportState.mapView = null;
            }
        };
    }
}
