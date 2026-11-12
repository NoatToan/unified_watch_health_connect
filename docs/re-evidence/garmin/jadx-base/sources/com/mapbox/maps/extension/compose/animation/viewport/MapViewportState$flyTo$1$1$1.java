package com.mapbox.maps.extension.compose.animation.viewport;

import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.MapView;
import com.mapbox.maps.plugin.animation.CameraAnimationsUtils;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/mapbox/maps/CameraOptions;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class MapViewportState$flyTo$1$1$1 extends w implements l<CameraOptions, Unit> {
    final /* synthetic */ MapView $this_apply;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapViewportState$flyTo$1$1$1(MapView mapView) {
        super(1);
        this.$this_apply = mapView;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CameraOptions cameraOptions) {
        cameraOptions.getClass();
        MapViewportStateKt.easeToImmediately(CameraAnimationsUtils.getCamera(this.$this_apply), cameraOptions);
    }

    @Override // e23.l
    public /* bridge */ /* synthetic */ Unit invoke(CameraOptions cameraOptions) {
        invoke2(cameraOptions);
        return Unit.INSTANCE;
    }
}
