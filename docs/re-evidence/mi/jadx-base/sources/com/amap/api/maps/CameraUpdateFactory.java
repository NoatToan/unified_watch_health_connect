package com.amap.api.maps;

import android.graphics.Point;
import com.amap.api.maps.model.CameraPosition;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.LatLngBounds;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.VirtualEarthProjection;
import defpackage.a7s;

/* JADX INFO: loaded from: classes4.dex */
public final class CameraUpdateFactory {
    private static final String CLASSNAME = "CameraUpdateFactory";

    public static CameraUpdate changeBearing(float f) {
        return new CameraUpdate(a7s.q(f % 360.0f));
    }

    public static CameraUpdate changeBearingGeoCenter(float f, IPoint iPoint) {
        return iPoint == null ? new CameraUpdate(a7s.o()) : new CameraUpdate(a7s.n(f % 360.0f, new Point(((Point) iPoint).x, ((Point) iPoint).y)));
    }

    public static CameraUpdate changeLatLng(LatLng latLng) {
        return latLng == null ? new CameraUpdate(a7s.o()) : new CameraUpdate(a7s.e(VirtualEarthProjection.latLongToPixels(latLng.latitude, latLng.longitude, 20)));
    }

    public static CameraUpdate changeTilt(float f) {
        return new CameraUpdate(a7s.p(f));
    }

    public static CameraUpdate newCameraPosition(CameraPosition cameraPosition) {
        return cameraPosition == null ? new CameraUpdate(a7s.o()) : new CameraUpdate(a7s.f(cameraPosition));
    }

    public static CameraUpdate newLatLng(LatLng latLng) {
        return latLng == null ? new CameraUpdate(a7s.o()) : new CameraUpdate(a7s.g(latLng));
    }

    public static CameraUpdate newLatLngBounds(LatLngBounds latLngBounds, int i) {
        return latLngBounds == null ? new CameraUpdate(a7s.o()) : new CameraUpdate(a7s.i(latLngBounds, i));
    }

    public static CameraUpdate newLatLngBoundsRect(LatLngBounds latLngBounds, int i, int i2, int i3, int i4) {
        return latLngBounds == null ? new CameraUpdate(a7s.o()) : new CameraUpdate(a7s.k(latLngBounds, i, i2, i3, i4));
    }

    public static CameraUpdate newLatLngZoom(LatLng latLng, float f) {
        return latLng == null ? new CameraUpdate(a7s.o()) : new CameraUpdate(a7s.h(latLng, f));
    }

    public static CameraUpdate scrollBy(float f, float f2) {
        return new CameraUpdate(a7s.c(f, f2));
    }

    public static CameraUpdate zoomBy(float f) {
        return new CameraUpdate(a7s.m(f));
    }

    public static CameraUpdate zoomIn() {
        return new CameraUpdate(a7s.a());
    }

    public static CameraUpdate zoomOut() {
        return new CameraUpdate(a7s.l());
    }

    public static CameraUpdate zoomTo(float f) {
        return new CameraUpdate(a7s.b(f));
    }

    public static CameraUpdate zoomBy(float f, Point point) {
        return new CameraUpdate(a7s.d(f, point));
    }

    public static CameraUpdate newLatLngBounds(LatLngBounds latLngBounds, int i, int i2, int i3) {
        if (latLngBounds == null) {
            return new CameraUpdate(a7s.o());
        }
        return new CameraUpdate(a7s.j(latLngBounds, i, i2, i3));
    }
}
