package defpackage;

import android.graphics.Point;
import com.amap.api.maps.model.CameraPosition;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.LatLngBounds;
import com.autonavi.amap.mapcore.AbstractCameraUpdateMessage;
import com.autonavi.amap.mapcore.DPoint;
import com.autonavi.amap.mapcore.VirtualEarthProjection;

/* JADX INFO: loaded from: classes4.dex */
public final class a7s {
    public static AbstractCameraUpdateMessage a() {
        u6s u6sVar = new u6s();
        u6sVar.nowType = AbstractCameraUpdateMessage.Type.zoomBy;
        u6sVar.amount = 1.0f;
        return u6sVar;
    }

    public static AbstractCameraUpdateMessage b(float f) {
        k6s k6sVar = new k6s();
        k6sVar.nowType = AbstractCameraUpdateMessage.Type.newCameraPosition;
        k6sVar.zoom = f;
        return k6sVar;
    }

    public static AbstractCameraUpdateMessage c(float f, float f2) {
        p6s p6sVar = new p6s();
        p6sVar.nowType = AbstractCameraUpdateMessage.Type.scrollBy;
        p6sVar.xPixel = f;
        p6sVar.yPixel = f2;
        return p6sVar;
    }

    public static AbstractCameraUpdateMessage d(float f, Point point) {
        u6s u6sVar = new u6s();
        u6sVar.nowType = AbstractCameraUpdateMessage.Type.zoomBy;
        u6sVar.amount = f;
        u6sVar.focus = point;
        return u6sVar;
    }

    public static AbstractCameraUpdateMessage e(Point point) {
        k6s k6sVar = new k6s();
        k6sVar.nowType = AbstractCameraUpdateMessage.Type.newCameraPosition;
        k6sVar.geoPoint = new DPoint(point.x, point.y);
        return k6sVar;
    }

    public static AbstractCameraUpdateMessage f(CameraPosition cameraPosition) {
        LatLng latLng;
        k6s k6sVar = new k6s();
        k6sVar.nowType = AbstractCameraUpdateMessage.Type.newCameraPosition;
        if (cameraPosition != null && (latLng = cameraPosition.target) != null) {
            DPoint dPointLatLongToPixelsDouble = VirtualEarthProjection.latLongToPixelsDouble(latLng.latitude, latLng.longitude, 20);
            k6sVar.geoPoint = new DPoint(dPointLatLongToPixelsDouble.x, dPointLatLongToPixelsDouble.y);
            k6sVar.zoom = cameraPosition.zoom;
            k6sVar.bearing = cameraPosition.bearing;
            k6sVar.tilt = cameraPosition.tilt;
            k6sVar.cameraPosition = cameraPosition;
        }
        return k6sVar;
    }

    public static AbstractCameraUpdateMessage g(LatLng latLng) {
        return f(CameraPosition.builder().target(latLng).zoom(Float.NaN).bearing(Float.NaN).tilt(Float.NaN).build());
    }

    public static AbstractCameraUpdateMessage h(LatLng latLng, float f) {
        return f(CameraPosition.builder().target(latLng).zoom(f).bearing(Float.NaN).tilt(Float.NaN).build());
    }

    public static AbstractCameraUpdateMessage i(LatLngBounds latLngBounds, int i) {
        f6s f6sVar = new f6s();
        f6sVar.nowType = AbstractCameraUpdateMessage.Type.newLatLngBounds;
        f6sVar.bounds = latLngBounds;
        f6sVar.paddingLeft = i;
        f6sVar.paddingRight = i;
        f6sVar.paddingTop = i;
        f6sVar.paddingBottom = i;
        return f6sVar;
    }

    public static AbstractCameraUpdateMessage j(LatLngBounds latLngBounds, int i, int i2, int i3) {
        f6s f6sVar = new f6s();
        f6sVar.nowType = AbstractCameraUpdateMessage.Type.newLatLngBoundsWithSize;
        f6sVar.bounds = latLngBounds;
        f6sVar.paddingLeft = i3;
        f6sVar.paddingRight = i3;
        f6sVar.paddingTop = i3;
        f6sVar.paddingBottom = i3;
        f6sVar.width = i;
        f6sVar.height = i2;
        return f6sVar;
    }

    public static AbstractCameraUpdateMessage k(LatLngBounds latLngBounds, int i, int i2, int i3, int i4) {
        f6s f6sVar = new f6s();
        f6sVar.nowType = AbstractCameraUpdateMessage.Type.newLatLngBounds;
        f6sVar.bounds = latLngBounds;
        f6sVar.paddingLeft = i;
        f6sVar.paddingRight = i2;
        f6sVar.paddingTop = i3;
        f6sVar.paddingBottom = i4;
        return f6sVar;
    }

    public static AbstractCameraUpdateMessage l() {
        u6s u6sVar = new u6s();
        u6sVar.nowType = AbstractCameraUpdateMessage.Type.zoomBy;
        u6sVar.amount = -1.0f;
        return u6sVar;
    }

    public static AbstractCameraUpdateMessage m(float f) {
        return d(f, null);
    }

    public static AbstractCameraUpdateMessage n(float f, Point point) {
        k6s k6sVar = new k6s();
        k6sVar.nowType = AbstractCameraUpdateMessage.Type.newCameraPosition;
        k6sVar.geoPoint = new DPoint(point.x, point.y);
        k6sVar.bearing = f;
        return k6sVar;
    }

    public static AbstractCameraUpdateMessage o() {
        return new k6s();
    }

    public static AbstractCameraUpdateMessage p(float f) {
        k6s k6sVar = new k6s();
        k6sVar.nowType = AbstractCameraUpdateMessage.Type.newCameraPosition;
        k6sVar.tilt = f;
        return k6sVar;
    }

    public static AbstractCameraUpdateMessage q(float f) {
        k6s k6sVar = new k6s();
        k6sVar.nowType = AbstractCameraUpdateMessage.Type.newCameraPosition;
        k6sVar.bearing = f;
        return k6sVar;
    }
}
