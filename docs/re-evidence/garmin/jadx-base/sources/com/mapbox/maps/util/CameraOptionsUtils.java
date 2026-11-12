package com.mapbox.maps.util;

import com.mapbox.maps.CameraOptions;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003¨\u0006\u0004"}, d2 = {"isEmpty", "", "Lcom/mapbox/maps/CameraOptions;", "(Lcom/mapbox/maps/CameraOptions;)Z", "sdk-base_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class CameraOptionsUtils {
    public static final boolean isEmpty(CameraOptions cameraOptions) {
        cameraOptions.getClass();
        return cameraOptions.getCenter() == null && cameraOptions.getPadding() == null && cameraOptions.getAnchor() == null && cameraOptions.getZoom() == null && cameraOptions.getBearing() == null && cameraOptions.getPitch() == null;
    }
}
