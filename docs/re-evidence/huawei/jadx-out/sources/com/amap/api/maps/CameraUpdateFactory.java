package com.amap.api.maps;

import android.graphics.Point;
import android.util.Log;
import com.amap.api.col.p0003sl.ap;
import com.amap.api.maps.model.CameraPosition;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.LatLngBounds;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.VirtualEarthProjection;

/* JADX INFO: loaded from: classes4.dex */
public final class CameraUpdateFactory {
    private static final String CLASSNAME = "CameraUpdateFactory";

    public static CameraUpdate zoomIn() {
        return new CameraUpdate(ap.a());
    }

    public static CameraUpdate zoomOut() {
        return new CameraUpdate(ap.b());
    }

    public static CameraUpdate scrollBy(float f, float f2) {
        return new CameraUpdate(ap.a(f, f2));
    }

    public static CameraUpdate zoomTo(float f) {
        return new CameraUpdate(ap.a(f));
    }

    public static CameraUpdate zoomBy(float f) {
        return new CameraUpdate(ap.b(f));
    }

    public static CameraUpdate zoomBy(float f, Point point) {
        return new CameraUpdate(ap.a(f, point));
    }

    public static CameraUpdate newCameraPosition(CameraPosition cameraPosition) {
        if (cameraPosition == null) {
            Log.w(CLASSNAME, "cameraPosition is null");
            return new CameraUpdate(ap.c());
        }
        return new CameraUpdate(ap.a(cameraPosition));
    }

    public static CameraUpdate newLatLng(LatLng latLng) {
        if (latLng == null) {
            Log.w(CLASSNAME, "latLng is null");
            return new CameraUpdate(ap.c());
        }
        return new CameraUpdate(ap.a(latLng));
    }

    public static CameraUpdate newLatLngZoom(LatLng latLng, float f) {
        if (latLng == null) {
            Log.w(CLASSNAME, "target is null");
            return new CameraUpdate(ap.c());
        }
        return new CameraUpdate(ap.a(latLng, f));
    }

    public static CameraUpdate newLatLngBounds(LatLngBounds latLngBounds, int i) {
        if (latLngBounds == null) {
            Log.w(CLASSNAME, "bounds is null");
            return new CameraUpdate(ap.c());
        }
        return new CameraUpdate(ap.a(latLngBounds, i));
    }

    public static CameraUpdate changeLatLng(LatLng latLng) {
        if (latLng == null) {
            Log.w(CLASSNAME, "target is null");
            return new CameraUpdate(ap.c());
        }
        return new CameraUpdate(ap.a(VirtualEarthProjection.latLongToPixels(latLng.latitude, latLng.longitude, 20)));
    }

    public static CameraUpdate changeBearing(float f) {
        return new CameraUpdate(ap.d(f % 360.0f));
    }

    public static CameraUpdate changeBearingGeoCenter(float f, IPoint iPoint) {
        if (iPoint == null) {
            Log.w(CLASSNAME, "geoPoint is null");
            return new CameraUpdate(ap.c());
        }
        return new CameraUpdate(ap.b(f % 360.0f, new Point(iPoint.x, iPoint.y)));
    }

    public static CameraUpdate changeTilt(float f) {
        return new CameraUpdate(ap.c(f));
    }

    public static CameraUpdate newLatLngBounds(LatLngBounds latLngBounds, int i, int i2, int i3) {
        if (latLngBounds == null) {
            Log.w(CLASSNAME, "bounds is null");
            return new CameraUpdate(ap.c());
        }
        return new CameraUpdate(ap.a(latLngBounds, i, i2, i3));
    }

    public static CameraUpdate newLatLngBoundsRect(LatLngBounds latLngBounds, int i, int i2, int i3, int i4) {
        if (latLngBounds == null) {
            Log.w(CLASSNAME, "bounds is null");
            return new CameraUpdate(ap.c());
        }
        return new CameraUpdate(ap.a(latLngBounds, i, i2, i3, i4));
    }
}
