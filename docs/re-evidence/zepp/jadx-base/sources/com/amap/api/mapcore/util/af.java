package com.amap.api.mapcore.util;

import android.graphics.Point;
import com.amap.api.maps.model.CameraPosition;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.LatLngBounds;
import com.autonavi.amap.mapcore.AbstractCameraUpdateMessage;
import com.autonavi.amap.mapcore.DPoint;
import com.autonavi.amap.mapcore.VirtualEarthProjection;

/* JADX INFO: loaded from: classes2.dex */
public final class af {
    public static AbstractCameraUpdateMessage a() {
        ae aeVar = new ae();
        aeVar.nowType = AbstractCameraUpdateMessage.Type.zoomBy;
        aeVar.amount = 1.0f;
        return aeVar;
    }

    public static AbstractCameraUpdateMessage b() {
        ae aeVar = new ae();
        aeVar.nowType = AbstractCameraUpdateMessage.Type.zoomBy;
        aeVar.amount = -1.0f;
        return aeVar;
    }

    public static AbstractCameraUpdateMessage c(float f) {
        ac acVar = new ac();
        acVar.nowType = AbstractCameraUpdateMessage.Type.newCameraPosition;
        acVar.bearing = f;
        return acVar;
    }

    public static AbstractCameraUpdateMessage a(float f) {
        ac acVar = new ac();
        acVar.nowType = AbstractCameraUpdateMessage.Type.newCameraPosition;
        acVar.zoom = f;
        return acVar;
    }

    public static AbstractCameraUpdateMessage b(float f) {
        ac acVar = new ac();
        acVar.nowType = AbstractCameraUpdateMessage.Type.newCameraPosition;
        acVar.tilt = f;
        return acVar;
    }

    public static AbstractCameraUpdateMessage a(float f, Point point) {
        ae aeVar = new ae();
        aeVar.nowType = AbstractCameraUpdateMessage.Type.zoomBy;
        aeVar.amount = f;
        aeVar.focus = point;
        return aeVar;
    }

    public static AbstractCameraUpdateMessage a(CameraPosition cameraPosition) {
        LatLng latLng;
        ac acVar = new ac();
        acVar.nowType = AbstractCameraUpdateMessage.Type.newCameraPosition;
        if (cameraPosition != null && (latLng = cameraPosition.target) != null) {
            DPoint dPointLatLongToPixelsDouble = VirtualEarthProjection.latLongToPixelsDouble(latLng.latitude, latLng.longitude, 20);
            acVar.geoPoint = new DPoint(dPointLatLongToPixelsDouble.x, dPointLatLongToPixelsDouble.y);
            acVar.zoom = cameraPosition.zoom;
            acVar.bearing = cameraPosition.bearing;
            acVar.tilt = cameraPosition.tilt;
            acVar.cameraPosition = cameraPosition;
        }
        return acVar;
    }

    public static AbstractCameraUpdateMessage a(Point point) {
        ac acVar = new ac();
        acVar.nowType = AbstractCameraUpdateMessage.Type.newCameraPosition;
        acVar.geoPoint = new DPoint(point.x, point.y);
        return acVar;
    }

    public static AbstractCameraUpdateMessage a(LatLng latLng, float f) {
        return a(CameraPosition.builder().target(latLng).zoom(f).bearing(Float.NaN).tilt(Float.NaN).build());
    }

    public static AbstractCameraUpdateMessage a(LatLngBounds latLngBounds, int i) {
        ab abVar = new ab();
        abVar.nowType = AbstractCameraUpdateMessage.Type.newLatLngBounds;
        abVar.bounds = latLngBounds;
        abVar.paddingLeft = i;
        abVar.paddingRight = i;
        abVar.paddingTop = i;
        abVar.paddingBottom = i;
        return abVar;
    }
}
