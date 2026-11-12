package com.mapbox.maps.extension.compose.animation.viewport;

import com.mapbox.maps.CameraState;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/mapbox/maps/extension/compose/animation/viewport/MapViewportState;", "it", "Lcom/mapbox/maps/CameraState;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class MapViewportState$Companion$Saver$2 extends w implements l<CameraState, MapViewportState> {
    public static final MapViewportState$Companion$Saver$2 INSTANCE = new MapViewportState$Companion$Saver$2();

    public MapViewportState$Companion$Saver$2() {
        super(1);
    }

    @Override // e23.l
    public final MapViewportState invoke(CameraState cameraState) {
        cameraState.getClass();
        return new MapViewportState(cameraState);
    }
}
