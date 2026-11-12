package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class Projection {
    protected long peer;

    public static class ProjectionPeerCleaner implements Runnable {
        private long peer;

        public ProjectionPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            Projection.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public Projection(long j8) {
        setPeer(j8);
    }

    public static native void cleanNativePeer(long j8);

    public static native Point coordinateForProjectedMeters(ProjectedMeters projectedMeters);

    public static native double getLatitudeScale(double d14);

    public static native double getMetersPerPixelAtLatitude(double d14, double d15);

    public static native Vec2 latLngToMercatorXY(Point point);

    public static native MercatorCoordinate project(Point point, double d14);

    public static native ProjectedMeters projectedMetersForCoordinate(Point point);

    private void setPeer(long j8) {
        this.peer = j8;
        if (j8 == 0) {
            return;
        }
        CleanerService.register(this, new ProjectionPeerCleaner(j8));
    }

    public static native Point unproject(MercatorCoordinate mercatorCoordinate, double d14);

    public static native double worldSize(double d14);
}
