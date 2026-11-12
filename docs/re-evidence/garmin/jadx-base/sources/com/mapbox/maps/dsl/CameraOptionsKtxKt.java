package com.mapbox.maps.dsl;

import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.CameraState;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"Lkotlin/Function1;", "Lcom/mapbox/maps/CameraOptions$Builder;", "", "block", "Lcom/mapbox/maps/CameraOptions;", "cameraOptions", "(Le23/l;)Lcom/mapbox/maps/CameraOptions;", "Lcom/mapbox/maps/CameraState;", "cameraState", "(Lcom/mapbox/maps/CameraState;Le23/l;)Lcom/mapbox/maps/CameraOptions;", "sdk-base_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class CameraOptionsKtxKt {
    public static final CameraOptions cameraOptions(CameraState cameraState, l<? super CameraOptions.Builder, Unit> lVar) {
        cameraState.getClass();
        lVar.getClass();
        CameraOptions.Builder builderPitch = new CameraOptions.Builder().padding(cameraState.getPadding()).center(cameraState.getCenter()).bearing(Double.valueOf(cameraState.getBearing())).zoom(Double.valueOf(cameraState.getZoom())).pitch(Double.valueOf(cameraState.getPitch()));
        lVar.invoke(builderPitch);
        CameraOptions cameraOptionsBuild = builderPitch.build();
        cameraOptionsBuild.getClass();
        return cameraOptionsBuild;
    }

    public static final CameraOptions cameraOptions(l<? super CameraOptions.Builder, Unit> lVar) {
        lVar.getClass();
        CameraOptions.Builder builder = new CameraOptions.Builder();
        lVar.invoke(builder);
        CameraOptions cameraOptionsBuild = builder.build();
        cameraOptionsBuild.getClass();
        return cameraOptionsBuild;
    }
}
