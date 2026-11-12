package com.mapbox.maps;

import android.graphics.Bitmap;
import com.mapbox.bindgen.DataRef;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"toCameraOptions", "Lcom/mapbox/maps/CameraOptions;", "Lcom/mapbox/maps/CameraState;", "anchor", "Lcom/mapbox/maps/ScreenCoordinate;", "toMapboxImage", "Lcom/mapbox/maps/Image;", "Landroid/graphics/Bitmap;", "sdk-base_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class ExtensionUtils {
    public static final CameraOptions toCameraOptions(CameraState cameraState, ScreenCoordinate screenCoordinate) {
        cameraState.getClass();
        if (screenCoordinate != null) {
            CameraOptions cameraOptionsBuild = new CameraOptions.Builder().anchor(screenCoordinate).padding(cameraState.getPadding()).zoom(Double.valueOf(cameraState.getZoom())).pitch(Double.valueOf(cameraState.getPitch())).bearing(Double.valueOf(cameraState.getBearing())).build();
            cameraOptionsBuild.getClass();
            return cameraOptionsBuild;
        }
        CameraOptions cameraOptionsBuild2 = new CameraOptions.Builder().center(cameraState.getCenter()).padding(cameraState.getPadding()).zoom(Double.valueOf(cameraState.getZoom())).pitch(Double.valueOf(cameraState.getPitch())).bearing(Double.valueOf(cameraState.getBearing())).build();
        cameraOptionsBuild2.getClass();
        return cameraOptionsBuild2;
    }

    public static /* synthetic */ CameraOptions toCameraOptions$default(CameraState cameraState, ScreenCoordinate screenCoordinate, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            screenCoordinate = null;
        }
        return toCameraOptions(cameraState, screenCoordinate);
    }

    @MapboxDelicateApi
    public static final Image toMapboxImage(Bitmap bitmap) {
        bitmap.getClass();
        if (bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
            vb.h.s("Only ARGB_8888 bitmap config is supported!");
            return null;
        }
        DataRef dataRefAllocateNative = DataRef.allocateNative(bitmap.getByteCount());
        bitmap.copyPixelsToBuffer(dataRefAllocateNative.getBuffer());
        return new Image(bitmap.getWidth(), bitmap.getHeight(), dataRefAllocateNative);
    }

    public static final CameraOptions toCameraOptions(CameraState cameraState) {
        cameraState.getClass();
        return toCameraOptions$default(cameraState, null, 1, null);
    }
}
