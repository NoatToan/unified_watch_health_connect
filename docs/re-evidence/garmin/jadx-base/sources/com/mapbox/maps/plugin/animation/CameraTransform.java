package com.mapbox.maps.plugin.animation;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.MapOptions;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.MercatorCoordinate;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.Size;
import com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate;
import com.mapbox.maps.plugin.delegates.MapTransformDelegate;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ&\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007J\u0016\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u0016\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\rJ%\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0007H\u0001¢\u0006\u0002\b$J\n\u0010%\u001a\u00020\u0007*\u00020\u0007J\u0014\u0010&\u001a\u00020'*\u00020\u00072\u0006\u0010(\u001a\u00020\u0007H\u0002J\u0014\u0010)\u001a\u00020'*\u00020\u00072\u0006\u0010(\u001a\u00020\u0007H\u0002J\u0014\u0010*\u001a\u00020'*\u00020\u00072\u0006\u0010(\u001a\u00020\u0007H\u0002J\u0012\u0010\u000e\u001a\u00020\n*\u00020+2\u0006\u0010,\u001a\u00020+J\u0012\u0010\u000e\u001a\u00020\n*\u00020\n2\u0006\u0010,\u001a\u00020\nJ\n\u0010-\u001a\u00020\u0007*\u00020\u0007J\n\u0010.\u001a\u00020\u0007*\u00020\u0007J\n\u0010/\u001a\u00020\r*\u00020\rJ\n\u00100\u001a\u00020\u0007*\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/mapbox/maps/plugin/animation/CameraTransform;", "", "()V", "DEGREES_MAX", "", "LONGITUDE_MAX", "PRECISION", "", "angleBetween", "p1", "Lcom/mapbox/maps/ScreenCoordinate;", "p2", "calculateLatLngMoveBy", "Lcom/mapbox/geojson/Point;", MapboxMap.QFE_OFFSET, "cameraState", "Lcom/mapbox/maps/CameraState;", "mapTransformDelegate", "Lcom/mapbox/maps/plugin/delegates/MapTransformDelegate;", "mapCameraManagerDelegate", "Lcom/mapbox/maps/plugin/delegates/MapCameraManagerDelegate;", "calculateScaleBy", "amount", "currentZoom", "getMapCenter", "edgeInsets", "Lcom/mapbox/maps/EdgeInsets;", "mapSize", "Lcom/mapbox/maps/Size;", "unwrapForShortestPath", TtmlNode.START, TtmlNode.END, "wrap", "value", "min", "max", "wrap$plugin_animation_release", "deg2rad", "eq", "", "other", "ge", "less", "Lcom/mapbox/maps/MercatorCoordinate;", "arg", "rad2deg", "scaleZoom", "wrapCoordinate", "zoomScale", "plugin-animation_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CameraTransform {
    private static final int DEGREES_MAX = 360;
    public static final CameraTransform INSTANCE = new CameraTransform();
    private static final int LONGITUDE_MAX = 180;
    private static final double PRECISION = 1.0E-6d;

    private CameraTransform() {
    }

    private final boolean eq(double d14, double d15) {
        return Math.abs(d14 - d15) < PRECISION;
    }

    private final boolean ge(double d14, double d15) {
        return d14 - d15 > PRECISION || eq(d14, d15);
    }

    private final boolean less(double d14, double d15) {
        return d14 - d15 < -1.0E-6d;
    }

    public final double angleBetween(ScreenCoordinate p14, ScreenCoordinate p15) {
        p14.getClass();
        p15.getClass();
        return Math.atan2((p15.getY() * p14.getX()) - (p15.getX() * p14.getY()), (p15.getY() * p14.getY()) + (p15.getX() * p14.getX()));
    }

    public final Point calculateLatLngMoveBy(ScreenCoordinate offset, CameraState cameraState, MapTransformDelegate mapTransformDelegate, MapCameraManagerDelegate mapCameraManagerDelegate) {
        offset.getClass();
        cameraState.getClass();
        mapTransformDelegate.getClass();
        mapCameraManagerDelegate.getClass();
        MapOptions mapOptions = mapTransformDelegate.getMapOptions();
        EdgeInsets padding = cameraState.getPadding();
        padding.getClass();
        Size size = mapOptions.getSize();
        size.getClass();
        ScreenCoordinate mapCenter = getMapCenter(padding, size);
        return mapCameraManagerDelegate.coordinateForPixel(new ScreenCoordinate(mapCenter.getX() - offset.getX(), mapCenter.getY() - offset.getY()));
    }

    public final double calculateScaleBy(double amount, double currentZoom) {
        return MathKt.a(amount) + currentZoom;
    }

    public final double deg2rad(double d14) {
        return (d14 * 3.141592653589793d) / 180.0d;
    }

    public final ScreenCoordinate getMapCenter(EdgeInsets edgeInsets, Size mapSize) {
        edgeInsets.getClass();
        mapSize.getClass();
        return new ScreenCoordinate(edgeInsets.getLeft() + (((((double) mapSize.getWidth()) - edgeInsets.getLeft()) - edgeInsets.getRight()) / 2.0d), edgeInsets.getTop() + (((((double) mapSize.getHeight()) - edgeInsets.getTop()) - edgeInsets.getBottom()) / 2.0d));
    }

    public final ScreenCoordinate offset(MercatorCoordinate mercatorCoordinate, MercatorCoordinate mercatorCoordinate2) {
        mercatorCoordinate.getClass();
        mercatorCoordinate2.getClass();
        return new ScreenCoordinate(mercatorCoordinate.getX() - mercatorCoordinate2.getX(), mercatorCoordinate.getY() - mercatorCoordinate2.getY());
    }

    public final double rad2deg(double d14) {
        return (d14 * 180.0d) / 3.141592653589793d;
    }

    public final double scaleZoom(double d14) {
        return MathKt.a(d14);
    }

    public final Point unwrapForShortestPath(Point start, Point end) {
        start.getClass();
        end.getClass();
        double dAbs = Math.abs(end.longitude() - start.longitude());
        if (dAbs <= 180.0d || dAbs >= 360.0d) {
            return start;
        }
        double dLongitude = start.longitude();
        if (start.longitude() > 0.0d && end.longitude() < 0.0d) {
            dLongitude -= (double) DEGREES_MAX;
        } else if (start.longitude() < 0.0d && end.longitude() > 0.0d) {
            dLongitude += (double) DEGREES_MAX;
        }
        Point pointFromLngLat = Point.fromLngLat(dLongitude, start.latitude());
        pointFromLngLat.getClass();
        return pointFromLngLat;
    }

    public final double wrap$plugin_animation_release(double value, double min, double max) {
        if (eq(value, max)) {
            return min;
        }
        if (ge(value, min) && less(value, max)) {
            return value;
        }
        double d14 = max - min;
        double d15 = ((value - min) % d14) + min;
        return value < min ? d15 + d14 : d15;
    }

    public final Point wrapCoordinate(Point point) {
        point.getClass();
        double dWrap$plugin_animation_release = wrap$plugin_animation_release(point.longitude(), -180.0d, 180.0d);
        if (Double.isNaN(dWrap$plugin_animation_release)) {
            Point pointFromLngLat = Point.fromLngLat(point.longitude(), point.latitude());
            pointFromLngLat.getClass();
            return pointFromLngLat;
        }
        Point pointFromLngLat2 = Point.fromLngLat(dWrap$plugin_animation_release, point.latitude());
        pointFromLngLat2.getClass();
        return pointFromLngLat2;
    }

    public final double zoomScale(double d14) {
        return Math.pow(2.0d, d14);
    }

    public final ScreenCoordinate offset(ScreenCoordinate screenCoordinate, ScreenCoordinate screenCoordinate2) {
        screenCoordinate.getClass();
        screenCoordinate2.getClass();
        return new ScreenCoordinate(screenCoordinate.getX() - screenCoordinate2.getX(), screenCoordinate.getY() - screenCoordinate2.getY());
    }
}
