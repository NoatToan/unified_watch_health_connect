package com.mapbox.maps.extension.compose;

import com.mapbox.maps.MapboxMap;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;
import p3.h0;
import p3.i0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class MapState$BindToMap$1 extends w implements l<i0, h0> {
    final /* synthetic */ MapboxMap $mapboxMap;
    final /* synthetic */ MapState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapState$BindToMap$1(MapState mapState, MapboxMap mapboxMap) {
        super(1);
        this.this$0 = mapState;
        this.$mapboxMap = mapboxMap;
    }

    @Override // e23.l
    public final h0 invoke(i0 i0Var) {
        i0Var.getClass();
        this.this$0.mapboxMapFlow.setValue(this.$mapboxMap);
        final MapState mapState = this.this$0;
        return new h0() { // from class: com.mapbox.maps.extension.compose.MapState$BindToMap$1$invoke$$inlined$onDispose$1
            @Override // p3.h0
            public void dispose() {
                mapState.mapboxMapFlow.setValue(null);
            }
        };
    }
}
