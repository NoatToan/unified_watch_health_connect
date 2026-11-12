package com.mapbox.maps;

import com.mapbox.maps.debugoptions.DebugOptionsController;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/mapbox/maps/debugoptions/DebugOptionsController;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class MapView$debugOptionsControllerDelegate$1 extends w implements e23.a<DebugOptionsController> {
    final /* synthetic */ MapView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapView$debugOptionsControllerDelegate$1(MapView mapView) {
        super(0);
        this.this$0 = mapView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // e23.a
    public final DebugOptionsController invoke() {
        MapView mapView = this.this$0;
        return new DebugOptionsController(mapView, mapView.getMapController$maps_sdk_release().getMapboxMapDeprecated());
    }
}
