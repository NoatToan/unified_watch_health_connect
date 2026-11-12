package com.google.maps.android;

import com.google.android.gms.maps.model.LatLng;
import java.util.List;
import o2.c;

/* JADX INFO: loaded from: classes2.dex */
public class SphericalUtil {
    private SphericalUtil() {
    }

    public static double computeAngleBetween(LatLng latLng, LatLng latLng2) {
        return distanceRadians(Math.toRadians(latLng.latitude), Math.toRadians(latLng.longitude), Math.toRadians(latLng2.latitude), Math.toRadians(latLng2.longitude));
    }

    public static double computeArea(List<LatLng> list) {
        return Math.abs(computeSignedArea(list));
    }

    public static double computeDistanceBetween(LatLng latLng, LatLng latLng2) {
        return computeAngleBetween(latLng, latLng2) * 6371009.0d;
    }

    public static double computeHeading(LatLng latLng, LatLng latLng2) {
        double radians = Math.toRadians(latLng.latitude);
        double radians2 = Math.toRadians(latLng.longitude);
        double radians3 = Math.toRadians(latLng2.latitude);
        double radians4 = Math.toRadians(latLng2.longitude) - radians2;
        return MathUtil.wrap(Math.toDegrees(Math.atan2(Math.cos(radians3) * Math.sin(radians4), (Math.sin(radians3) * Math.cos(radians)) - (Math.cos(radians4) * (Math.cos(radians3) * Math.sin(radians))))), -180.0d, 180.0d);
    }

    public static double computeLength(List<LatLng> list) {
        double dDistanceRadians = 0.0d;
        if (list.size() < 2) {
            return 0.0d;
        }
        LatLng latLng = null;
        for (LatLng latLng2 : list) {
            if (latLng != null) {
                dDistanceRadians += distanceRadians(Math.toRadians(latLng.latitude), Math.toRadians(latLng.longitude), Math.toRadians(latLng2.latitude), Math.toRadians(latLng2.longitude));
            }
            latLng = latLng2;
        }
        return dDistanceRadians * 6371009.0d;
    }

    public static LatLng computeOffset(LatLng latLng, double d14, double d15) {
        double d16 = d14 / 6371009.0d;
        double radians = Math.toRadians(d15);
        double radians2 = Math.toRadians(latLng.latitude);
        double radians3 = Math.toRadians(latLng.longitude);
        double dCos = Math.cos(d16);
        double dSin = Math.sin(d16);
        double dSin2 = Math.sin(radians2);
        double dCos2 = dSin * Math.cos(radians2);
        double dCos3 = (Math.cos(radians) * dCos2) + (dCos * dSin2);
        return new LatLng(Math.toDegrees(Math.asin(dCos3)), Math.toDegrees(radians3 + Math.atan2(Math.sin(radians) * dCos2, dCos - (dSin2 * dCos3))));
    }

    public static LatLng computeOffsetOrigin(LatLng latLng, double d14, double d15) {
        double radians = Math.toRadians(d15);
        double d16 = d14 / 6371009.0d;
        double dCos = Math.cos(d16);
        double dCos2 = Math.cos(radians) * Math.sin(d16);
        double dSin = Math.sin(radians) * Math.sin(d16);
        double dSin2 = Math.sin(Math.toRadians(latLng.latitude));
        double d17 = dCos * dCos;
        double d18 = dCos2 * dCos2;
        double d19 = ((d17 * d17) + (d18 * d17)) - ((d17 * dSin2) * dSin2);
        if (d19 < 0.0d) {
            return null;
        }
        double d24 = dCos2 * dSin2;
        double d25 = d17 + d18;
        double dSqrt = (Math.sqrt(d19) + d24) / d25;
        double d26 = (dSin2 - (dCos2 * dSqrt)) / dCos;
        double dAtan2 = Math.atan2(d26, dSqrt);
        if (dAtan2 < -1.5707963267948966d || dAtan2 > 1.5707963267948966d) {
            dAtan2 = Math.atan2(d26, (d24 - Math.sqrt(d19)) / d25);
        }
        if (dAtan2 < -1.5707963267948966d || dAtan2 > 1.5707963267948966d) {
            return null;
        }
        return new LatLng(Math.toDegrees(dAtan2), Math.toDegrees(Math.toRadians(latLng.longitude) - Math.atan2(dSin, (Math.cos(dAtan2) * dCos) - (Math.sin(dAtan2) * dCos2))));
    }

    public static double computeSignedArea(List<LatLng> list, double d14) {
        int size = list.size();
        double dPolarTriangleArea = 0.0d;
        if (size < 3) {
            return 0.0d;
        }
        LatLng latLng = list.get(size - 1);
        double dTan = Math.tan((1.5707963267948966d - Math.toRadians(latLng.latitude)) / 2.0d);
        double radians = Math.toRadians(latLng.longitude);
        double d15 = dTan;
        double d16 = radians;
        for (LatLng latLng2 : list) {
            double dTan2 = Math.tan((1.5707963267948966d - Math.toRadians(latLng2.latitude)) / 2.0d);
            double radians2 = Math.toRadians(latLng2.longitude);
            dPolarTriangleArea += polarTriangleArea(dTan2, radians2, d15, d16);
            d15 = dTan2;
            d16 = radians2;
        }
        return d14 * d14 * dPolarTriangleArea;
    }

    private static double distanceRadians(double d14, double d15, double d16, double d17) {
        return MathUtil.arcHav(MathUtil.havDistance(d14, d16, d15 - d17));
    }

    public static LatLng interpolate(LatLng latLng, LatLng latLng2, double d14) {
        double radians = Math.toRadians(latLng.latitude);
        double radians2 = Math.toRadians(latLng.longitude);
        double radians3 = Math.toRadians(latLng2.latitude);
        double radians4 = Math.toRadians(latLng2.longitude);
        double dCos = Math.cos(radians);
        double dCos2 = Math.cos(radians3);
        double dComputeAngleBetween = computeAngleBetween(latLng, latLng2);
        double dSin = Math.sin(dComputeAngleBetween);
        if (dSin < 1.0E-6d) {
            double d15 = latLng.latitude;
            double dB = c.b(latLng2.latitude, d15, d14, d15);
            double d16 = latLng.longitude;
            return new LatLng(dB, c.b(latLng2.longitude, d16, d14, d16));
        }
        double dSin2 = Math.sin((1.0d - d14) * dComputeAngleBetween) / dSin;
        double dSin3 = Math.sin(dComputeAngleBetween * d14) / dSin;
        double d17 = dCos * dSin2;
        double d18 = dCos2 * dSin3;
        double dCos3 = (Math.cos(radians4) * d18) + (Math.cos(radians2) * d17);
        double dSin4 = (Math.sin(radians4) * d18) + (Math.sin(radians2) * d17);
        return new LatLng(Math.toDegrees(Math.atan2((Math.sin(radians3) * dSin3) + (Math.sin(radians) * dSin2), Math.sqrt((dSin4 * dSin4) + (dCos3 * dCos3)))), Math.toDegrees(Math.atan2(dSin4, dCos3)));
    }

    private static double polarTriangleArea(double d14, double d15, double d16, double d17) {
        double d18 = d15 - d17;
        double d19 = d14 * d16;
        return Math.atan2(Math.sin(d18) * d19, (Math.cos(d18) * d19) + 1.0d) * 2.0d;
    }

    public static double computeSignedArea(List<LatLng> list) {
        return computeSignedArea(list, 6371009.0d);
    }
}
