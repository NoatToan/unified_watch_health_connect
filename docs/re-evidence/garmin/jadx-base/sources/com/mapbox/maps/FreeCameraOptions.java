package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class FreeCameraOptions {
    protected long peer;

    public static class FreeCameraOptionsPeerCleaner implements Runnable {
        private long peer;

        public FreeCameraOptionsPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            FreeCameraOptions.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public FreeCameraOptions(long j8) {
        setPeer(j8);
    }

    public static native void cleanNativePeer(long j8);

    private void setPeer(long j8) {
        this.peer = j8;
        if (j8 == 0) {
            return;
        }
        CleanerService.register(this, new FreeCameraOptionsPeerCleaner(j8));
    }

    public native Double getAltitude();

    public native Point getLocation();

    public long getNativePtr() {
        return this.peer;
    }

    public native Vec4 getOrientation();

    public native Vec3 getPosition();

    public native void lookAtPoint(Point point);

    public native void lookAtPoint(Point point, double d14);

    public native void lookAtPoint(Point point, double d14, Vec3 vec3);

    public native void setAltitude(double d14);

    public native void setLocation(Point point);

    public native void setLocation(Point point, double d14);

    public native void setOrientation(Vec4 vec4);

    public native void setPitchBearing(double d14, double d15);

    public native void setPosition(Vec3 vec3);
}
