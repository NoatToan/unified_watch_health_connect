package com.mapbox.maps.extension.compose.ornaments.scalebar;

import e23.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;
import p3.h0;
import p3.i0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class MapScaleBarScope$ScaleBar$4$1 extends w implements l<i0, h0> {
    final /* synthetic */ String $pluginId;
    final /* synthetic */ MapScaleBarScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapScaleBarScope$ScaleBar$4$1(MapScaleBarScope mapScaleBarScope, String str) {
        super(1);
        this.this$0 = mapScaleBarScope;
        this.$pluginId = str;
    }

    @Override // e23.l
    public final h0 invoke(i0 i0Var) {
        i0Var.getClass();
        final MapScaleBarScope mapScaleBarScope = this.this$0;
        final String str = this.$pluginId;
        return new h0() { // from class: com.mapbox.maps.extension.compose.ornaments.scalebar.MapScaleBarScope$ScaleBar$4$1$invoke$$inlined$onDispose$1
            @Override // p3.h0
            public void dispose() {
                mapScaleBarScope.mapView.removePlugin(str);
            }
        };
    }
}
