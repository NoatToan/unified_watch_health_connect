package com.google.maps.android.ui;

import android.os.Handler;
import android.os.SystemClock;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;

/* JADX INFO: loaded from: classes2.dex */
public class AnimationUtil {

    public interface LatLngInterpolator {

        public static class Linear implements LatLngInterpolator {
            @Override // com.google.maps.android.ui.AnimationUtil.LatLngInterpolator
            public LatLng interpolate(float f14, LatLng latLng, LatLng latLng2) {
                double d14 = latLng2.latitude;
                double d15 = latLng.latitude;
                double d16 = f14;
                double d17 = ((d14 - d15) * d16) + d15;
                double dSignum = latLng2.longitude - latLng.longitude;
                if (Math.abs(dSignum) > 180.0d) {
                    dSignum -= Math.signum(dSignum) * 360.0d;
                }
                return new LatLng(d17, (dSignum * d16) + latLng.longitude);
            }
        }

        LatLng interpolate(float f14, LatLng latLng, LatLng latLng2);
    }

    public static void animateMarkerTo(final Marker marker, final LatLng latLng, final long j8) {
        final LatLngInterpolator.Linear linear = new LatLngInterpolator.Linear();
        final LatLng position = marker.getPosition();
        final Handler handler = new Handler();
        final long jUptimeMillis = SystemClock.uptimeMillis();
        final AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        handler.post(new Runnable() { // from class: com.google.maps.android.ui.AnimationUtil.1
            long elapsed;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            float f54335t;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            float f54336v;

            @Override // java.lang.Runnable
            public void run() {
                long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
                this.elapsed = jUptimeMillis2;
                float f14 = jUptimeMillis2 / j8;
                this.f54335t = f14;
                float interpolation = accelerateDecelerateInterpolator.getInterpolation(f14);
                this.f54336v = interpolation;
                marker.setPosition(linear.interpolate(interpolation, position, latLng));
                if (this.f54335t < 1.0f) {
                    handler.postDelayed(this, 16L);
                }
            }
        });
    }

    public static void animateMarkerTo(Marker marker, LatLng latLng) {
        animateMarkerTo(marker, latLng, 2000L);
    }
}
