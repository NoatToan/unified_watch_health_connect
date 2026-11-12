package com.mapbox.maps.coroutine;

import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate;
import java.util.List;
import p005kotlin.Metadata;
import t13.d;
import t13.i;
import u13.f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aQ\u0010\f\u001a\u00020\u0004*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/mapbox/maps/plugin/delegates/MapCameraManagerDelegate;", "", "Lcom/mapbox/geojson/Point;", "coordinates", "Lcom/mapbox/maps/CameraOptions;", "camera", "Lcom/mapbox/maps/EdgeInsets;", "coordinatesPadding", "", "maxZoom", "Lcom/mapbox/maps/ScreenCoordinate;", MapboxMap.QFE_OFFSET, "awaitCameraForCoordinates", "(Lcom/mapbox/maps/plugin/delegates/MapCameraManagerDelegate;Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Lcom/mapbox/maps/ScreenCoordinate;Lt13/d;)Ljava/lang/Object;", "maps-sdk_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class MapCameraManagerDelegateExtKt {
    public static final Object awaitCameraForCoordinates(MapCameraManagerDelegate mapCameraManagerDelegate, List list, CameraOptions cameraOptions, EdgeInsets edgeInsets, Double d14, ScreenCoordinate screenCoordinate, d dVar) {
        i iVar = new i(f.b(dVar));
        mapCameraManagerDelegate.cameraForCoordinates(list, cameraOptions, edgeInsets, d14, screenCoordinate, new MapCameraManagerDelegateExtKt$awaitCameraForCoordinates$2$1(iVar));
        Object objA = iVar.a();
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        return objA;
    }

    public static /* synthetic */ Object awaitCameraForCoordinates$default(MapCameraManagerDelegate mapCameraManagerDelegate, List list, CameraOptions cameraOptions, EdgeInsets edgeInsets, Double d14, ScreenCoordinate screenCoordinate, d dVar, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            edgeInsets = null;
        }
        if ((i14 & 8) != 0) {
            d14 = null;
        }
        if ((i14 & 16) != 0) {
            screenCoordinate = null;
        }
        return awaitCameraForCoordinates(mapCameraManagerDelegate, list, cameraOptions, edgeInsets, d14, screenCoordinate, dVar);
    }
}
