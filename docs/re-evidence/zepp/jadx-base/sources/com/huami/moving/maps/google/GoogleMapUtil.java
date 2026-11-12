package com.huami.moving.maps.google;

import com.google.android.gms.maps.model.LatLng;
import com.huami.mifit.sportlib.model.GPSPoint;
import com.huami.mifit.sportlib.utils.MapUtil;
import com.huami.moving.maps.gaode.GaodeMapUtil;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class GoogleMapUtil {
    private static final int a = 0;
    private static final int b = 1;
    private static final int c = 2;
    private static int d;

    private GoogleMapUtil() {
    }

    private static LatLng a(GPSPoint gPSPoint) {
        if (gPSPoint == null || gPSPoint.isMaskPoint()) {
            return null;
        }
        if (gPSPoint.getVersion() < 11) {
            return new LatLng(gPSPoint.mLatitude, gPSPoint.mLongitude);
        }
        if (gPSPoint.getProviderType() == 2) {
            if (!MapUtil.isPointInHongkong(gPSPoint) && !MapUtil.isPointInMacao(gPSPoint)) {
                return new LatLng(gPSPoint.mLatitude, gPSPoint.mLongitude);
            }
            double[] dArrB = b(gPSPoint.mLatitude, gPSPoint.mLongitude);
            return new LatLng(gPSPoint.mLatitude - dArrB[0], gPSPoint.mLongitude - dArrB[1]);
        }
        if (d == 0) {
            d = GaodeMapUtil.isLocForAmapAvailable(gPSPoint.mLatitude, gPSPoint.mLongitude) && !MapUtil.isPointInHongkong(gPSPoint) && !MapUtil.isPointInMacao(gPSPoint) ? 1 : 2;
        }
        if (d != 1) {
            return new LatLng(gPSPoint.mLatitude, gPSPoint.mLongitude);
        }
        double[] dArrB2 = b(gPSPoint.mLatitude, gPSPoint.mLongitude);
        return new LatLng(gPSPoint.mLatitude + dArrB2[0], gPSPoint.mLongitude + dArrB2[1]);
    }

    private static double[] b(double d2, double d3) {
        double d4 = d3 - 105.0d;
        double d5 = d2 - 35.0d;
        double dC = c(d4, d5);
        double d6 = d(d4, d5);
        double d7 = (d2 / 180.0d) * 3.141592653589793d;
        double dSin = Math.sin(d7);
        double d8 = 1.0d - ((0.006693421622965943d * dSin) * dSin);
        double dSqrt = Math.sqrt(d8);
        return new double[]{(dC * 180.0d) / ((6335552.717000426d / (d8 * dSqrt)) * 3.141592653589793d), (d6 * 180.0d) / (((6378245.0d / dSqrt) * Math.cos(d7)) * 3.141592653589793d)};
    }

    private static double c(double d2, double d3) {
        double d4 = d2 * 2.0d;
        double dSqrt = (-100.0d) + d4 + (d3 * 3.0d) + (d3 * 0.2d * d3) + (0.1d * d2 * d3) + (Math.sqrt(Math.abs(d2)) * 0.2d) + ((((Math.sin((6.0d * d2) * 3.141592653589793d) * 20.0d) + (Math.sin(d4 * 3.141592653589793d) * 20.0d)) * 2.0d) / 3.0d);
        double d5 = d3 * 3.141592653589793d;
        return dSqrt + ((((Math.sin(d5) * 20.0d) + (Math.sin((d3 / 3.0d) * 3.141592653589793d) * 40.0d)) * 2.0d) / 3.0d) + ((((Math.sin((d3 / 12.0d) * 3.141592653589793d) * 160.0d) + (Math.sin(d5 / 30.0d) * 320.0d)) * 2.0d) / 3.0d);
    }

    public static LatLng convertToLatLng(GPSPoint gPSPoint) {
        if (gPSPoint != null) {
            return a(gPSPoint);
        }
        HMLog.i("IllegalArgumentException", "GoogleMapUtil convertToLatLng", new Object[0]);
        throw new IllegalArgumentException();
    }

    public static List<LatLng> convertToLatLngFromGPSPoint(List<GPSPoint> list) {
        int i = 0;
        if (list == null) {
            HMLog.i("IllegalArgumentException", "GoogleMapUtil convertToLatLngFromGPSPoint", new Object[0]);
            throw new IllegalArgumentException();
        }
        int size = list.size();
        if (size == 0) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(size);
        for (GPSPoint gPSPoint : list) {
            if (gPSPoint != null) {
                arrayList.add(i, a(gPSPoint));
                i++;
            }
        }
        return arrayList;
    }

    private static double d(double d2, double d3) {
        double d4 = d2 * 0.1d;
        return d2 + 300.0d + (d3 * 2.0d) + (d4 * d2) + (d4 * d3) + (Math.sqrt(Math.abs(d2)) * 0.1d) + ((((Math.sin((6.0d * d2) * 3.141592653589793d) * 20.0d) + (Math.sin((d2 * 2.0d) * 3.141592653589793d) * 20.0d)) * 2.0d) / 3.0d) + ((((Math.sin(d2 * 3.141592653589793d) * 20.0d) + (Math.sin((d2 / 3.0d) * 3.141592653589793d) * 40.0d)) * 2.0d) / 3.0d) + ((((Math.sin((d2 / 12.0d) * 3.141592653589793d) * 150.0d) + (Math.sin((d2 / 30.0d) * 3.141592653589793d) * 300.0d)) * 2.0d) / 3.0d);
    }

    public static void resetStatus() {
        d = 0;
    }
}
