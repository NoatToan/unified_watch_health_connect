package com.amap.api.col.p0003sl;

import android.graphics.Point;
import com.amap.api.maps.model.CameraPosition;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.LatLngBounds;
import com.autonavi.amap.mapcore.AbstractCameraUpdateMessage;
import com.autonavi.amap.mapcore.DPoint;
import com.autonavi.amap.mapcore.VirtualEarthProjection;

/* JADX INFO: loaded from: classes4.dex */
public final class ap {
    public static AbstractCameraUpdateMessage a() {
        ao aoVar = new ao();
        aoVar.nowType = AbstractCameraUpdateMessage.Type.zoomBy;
        aoVar.amount = 1.0f;
        return aoVar;
    }

    public static AbstractCameraUpdateMessage b() {
        ao aoVar = new ao();
        aoVar.nowType = AbstractCameraUpdateMessage.Type.zoomBy;
        aoVar.amount = -1.0f;
        return aoVar;
    }

    public static AbstractCameraUpdateMessage a(float f, float f2) {
        an anVar = new an();
        anVar.nowType = AbstractCameraUpdateMessage.Type.scrollBy;
        anVar.xPixel = f;
        anVar.yPixel = f2;
        return anVar;
    }

    public static AbstractCameraUpdateMessage a(float f) {
        am amVar = new am();
        amVar.nowType = AbstractCameraUpdateMessage.Type.newCameraPosition;
        amVar.zoom = f;
        return amVar;
    }

    public static AbstractCameraUpdateMessage b(float f) {
        return a(f, (Point) null);
    }

    public static AbstractCameraUpdateMessage a(float f, Point point) {
        ao aoVar = new ao();
        aoVar.nowType = AbstractCameraUpdateMessage.Type.zoomBy;
        aoVar.amount = f;
        aoVar.focus = point;
        return aoVar;
    }

    public static AbstractCameraUpdateMessage a(CameraPosition cameraPosition) {
        am amVar = new am();
        amVar.nowType = AbstractCameraUpdateMessage.Type.newCameraPosition;
        if (cameraPosition != null && cameraPosition.target != null) {
            DPoint dPointLatLongToPixelsDouble = VirtualEarthProjection.latLongToPixelsDouble(cameraPosition.target.latitude, cameraPosition.target.longitude, 20);
            amVar.geoPoint = new DPoint(dPointLatLongToPixelsDouble.x, dPointLatLongToPixelsDouble.y);
            amVar.zoom = cameraPosition.zoom;
            amVar.bearing = cameraPosition.bearing;
            amVar.tilt = cameraPosition.tilt;
            amVar.cameraPosition = cameraPosition;
        }
        return amVar;
    }

    public static AbstractCameraUpdateMessage a(Point point) {
        am amVar = new am();
        amVar.nowType = AbstractCameraUpdateMessage.Type.newCameraPosition;
        amVar.geoPoint = new DPoint(point.x, point.y);
        return amVar;
    }

    public static AbstractCameraUpdateMessage c(float f) {
        am amVar = new am();
        amVar.nowType = AbstractCameraUpdateMessage.Type.newCameraPosition;
        amVar.tilt = f;
        return amVar;
    }

    public static AbstractCameraUpdateMessage d(float f) {
        am amVar = new am();
        amVar.nowType = AbstractCameraUpdateMessage.Type.newCameraPosition;
        amVar.bearing = f;
        return amVar;
    }

    public static AbstractCameraUpdateMessage b(float f, Point point) {
        am amVar = new am();
        amVar.nowType = AbstractCameraUpdateMessage.Type.newCameraPosition;
        amVar.geoPoint = new DPoint(point.x, point.y);
        amVar.bearing = f;
        return amVar;
    }

    public static AbstractCameraUpdateMessage a(LatLng latLng) {
        return a(CameraPosition.builder().target(latLng).zoom(Float.NaN).bearing(Float.NaN).tilt(Float.NaN).build());
    }

    public static AbstractCameraUpdateMessage a(LatLng latLng, float f) {
        return a(CameraPosition.builder().target(latLng).zoom(f).bearing(Float.NaN).tilt(Float.NaN).build());
    }

    public static AbstractCameraUpdateMessage a(LatLngBounds latLngBounds, int i) {
        al alVar = new al();
        alVar.nowType = AbstractCameraUpdateMessage.Type.newLatLngBounds;
        alVar.bounds = latLngBounds;
        alVar.paddingLeft = i;
        alVar.paddingRight = i;
        alVar.paddingTop = i;
        alVar.paddingBottom = i;
        return alVar;
    }

    public static AbstractCameraUpdateMessage a(LatLngBounds latLngBounds, int i, int i2, int i3) {
        al alVar = new al();
        alVar.nowType = AbstractCameraUpdateMessage.Type.newLatLngBoundsWithSize;
        alVar.bounds = latLngBounds;
        alVar.paddingLeft = i3;
        alVar.paddingRight = i3;
        alVar.paddingTop = i3;
        alVar.paddingBottom = i3;
        alVar.width = i;
        alVar.height = i2;
        return alVar;
    }

    public static AbstractCameraUpdateMessage a(LatLngBounds latLngBounds, int i, int i2, int i3, int i4) {
        al alVar = new al();
        alVar.nowType = AbstractCameraUpdateMessage.Type.newLatLngBounds;
        alVar.bounds = latLngBounds;
        alVar.paddingLeft = i;
        alVar.paddingRight = i2;
        alVar.paddingTop = i3;
        alVar.paddingBottom = i4;
        return alVar;
    }

    public static AbstractCameraUpdateMessage c() {
        return new am();
    }
}
