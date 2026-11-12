package com.amap.api.maps;

import android.graphics.Point;
import android.util.Log;
import com.amap.api.mapcore.util.ab;
import com.amap.api.mapcore.util.ac;
import com.amap.api.mapcore.util.ad;
import com.amap.api.mapcore.util.af;
import com.amap.api.maps.model.CameraPosition;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.LatLngBounds;
import com.autonavi.amap.mapcore.AbstractCameraUpdateMessage;
import com.autonavi.amap.mapcore.DPoint;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.VirtualEarthProjection;

/* JADX INFO: loaded from: classes2.dex */
public final class CameraUpdateFactory {
    private static final String CLASSNAME = "CameraUpdateFactory";

    public static CameraUpdate changeBearing(float f) {
        return new CameraUpdate(af.c(f % 360.0f));
    }

    public static CameraUpdate changeBearingGeoCenter(float f, IPoint iPoint) {
        if (iPoint == null) {
            Log.w(CLASSNAME, "geoPoint is null");
            return new CameraUpdate(new ac());
        }
        Point point = new Point(((Point) iPoint).x, ((Point) iPoint).y);
        ac acVar = new ac();
        acVar.nowType = AbstractCameraUpdateMessage.Type.newCameraPosition;
        acVar.geoPoint = new DPoint(point.x, point.y);
        acVar.bearing = f % 360.0f;
        return new CameraUpdate(acVar);
    }

    public static CameraUpdate changeLatLng(LatLng latLng) {
        if (latLng != null) {
            return new CameraUpdate(af.a(VirtualEarthProjection.latLongToPixels(latLng.latitude, latLng.longitude, 20)));
        }
        Log.w(CLASSNAME, "target is null");
        return new CameraUpdate(new ac());
    }

    public static CameraUpdate changeTilt(float f) {
        return new CameraUpdate(af.b(f));
    }

    public static CameraUpdate newCameraPosition(CameraPosition cameraPosition) {
        if (cameraPosition != null) {
            return new CameraUpdate(af.a(cameraPosition));
        }
        Log.w(CLASSNAME, "cameraPosition is null");
        return new CameraUpdate(new ac());
    }

    public static CameraUpdate newLatLng(LatLng latLng) {
        if (latLng != null) {
            return new CameraUpdate(af.a(CameraPosition.builder().target(latLng).zoom(Float.NaN).bearing(Float.NaN).tilt(Float.NaN).build()));
        }
        Log.w(CLASSNAME, "latLng is null");
        return new CameraUpdate(new ac());
    }

    public static CameraUpdate newLatLngBounds(LatLngBounds latLngBounds, int i) {
        if (latLngBounds != null) {
            return new CameraUpdate(af.a(latLngBounds, i));
        }
        Log.w(CLASSNAME, "bounds is null");
        return new CameraUpdate(new ac());
    }

    public static CameraUpdate newLatLngBoundsRect(LatLngBounds latLngBounds, int i, int i2, int i3, int i4) {
        if (latLngBounds == null) {
            Log.w(CLASSNAME, "bounds is null");
            return new CameraUpdate(new ac());
        }
        ab abVar = new ab();
        abVar.nowType = AbstractCameraUpdateMessage.Type.newLatLngBounds;
        abVar.bounds = latLngBounds;
        abVar.paddingLeft = i;
        abVar.paddingRight = i2;
        abVar.paddingTop = i3;
        abVar.paddingBottom = i4;
        return new CameraUpdate(abVar);
    }

    public static CameraUpdate newLatLngZoom(LatLng latLng, float f) {
        if (latLng != null) {
            return new CameraUpdate(af.a(latLng, f));
        }
        Log.w(CLASSNAME, "target is null");
        return new CameraUpdate(new ac());
    }

    public static CameraUpdate scrollBy(float f, float f2) {
        ad adVar = new ad();
        adVar.nowType = AbstractCameraUpdateMessage.Type.scrollBy;
        adVar.xPixel = f;
        adVar.yPixel = f2;
        return new CameraUpdate(adVar);
    }

    public static CameraUpdate zoomBy(float f) {
        return new CameraUpdate(af.a(f, (Point) null));
    }

    public static CameraUpdate zoomIn() {
        return new CameraUpdate(af.a());
    }

    public static CameraUpdate zoomOut() {
        return new CameraUpdate(af.b());
    }

    public static CameraUpdate zoomTo(float f) {
        return new CameraUpdate(af.a(f));
    }

    public static CameraUpdate zoomBy(float f, Point point) {
        return new CameraUpdate(af.a(f, point));
    }

    public static CameraUpdate newLatLngBounds(LatLngBounds latLngBounds, int i, int i2, int i3) {
        if (latLngBounds == null) {
            Log.w(CLASSNAME, "bounds is null");
            return new CameraUpdate(new ac());
        }
        ab abVar = new ab();
        abVar.nowType = AbstractCameraUpdateMessage.Type.newLatLngBoundsWithSize;
        abVar.bounds = latLngBounds;
        abVar.paddingLeft = i3;
        abVar.paddingRight = i3;
        abVar.paddingTop = i3;
        abVar.paddingBottom = i3;
        abVar.width = i;
        abVar.height = i2;
        return new CameraUpdate(abVar);
    }
}
