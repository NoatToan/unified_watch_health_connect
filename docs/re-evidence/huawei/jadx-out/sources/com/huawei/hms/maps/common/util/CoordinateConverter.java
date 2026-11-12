package com.huawei.hms.maps.common.util;

import android.util.Log;
import com.huawei.hms.maps.model.CoordinateLatLng;
import com.huawei.hms.maps.model.LatLng;
import com.huawei.hms.maps.utils.MapClientUtil;

/* JADX INFO: loaded from: classes10.dex */
public class CoordinateConverter {
    public LatLng convert(LatLng latLng) {
        if (latLng != null) {
            return d(latLng.longitude, latLng.latitude);
        }
        Log.e("CoordinateConverter", "LatLng is null.");
        return null;
    }

    public LatLng[] convert(LatLng[] latLngArr) {
        String str;
        if (latLngArr == null) {
            str = "LatLng is null.";
        } else {
            if (latLngArr.length <= 512) {
                for (int i = 0; i < latLngArr.length; i++) {
                    LatLng latLng = latLngArr[i];
                    latLngArr[i] = d(latLng.longitude, latLng.latitude);
                }
                return latLngArr;
            }
            str = "The points of convert cannot exceed 512 points.";
        }
        Log.e("CoordinateConverter", str);
        return null;
    }

    public static CoordinateLatLng[] rectifyCoordinate(CoordinateLatLng[] coordinateLatLngArr) {
        return maa.a(coordinateLatLngArr);
    }

    private LatLng d(double d, double d2) {
        if (MapClientUtil.isOutOfChina(d, d2)) {
            return new LatLng(d2, d);
        }
        double[] dArrA = a(d, d2);
        return new LatLng(d2 + dArrA[1], d + dArrA[0]);
    }

    private double c(double d, double d2) {
        double d3 = d * 0.1d;
        return d + 300.0d + (d2 * 2.0d) + (d3 * d) + (d3 * d2) + (Math.sqrt(Math.abs(d)) * 0.1d) + ((((Math.sin((6.0d * d) * 3.141592653589793d) * 20.0d) + (Math.sin((d * 2.0d) * 3.141592653589793d) * 20.0d)) * 2.0d) / 3.0d) + ((((Math.sin(d * 3.141592653589793d) * 20.0d) + (Math.sin((d / 3.0d) * 3.141592653589793d) * 40.0d)) * 2.0d) / 3.0d) + ((((Math.sin((d / 12.0d) * 3.141592653589793d) * 150.0d) + (Math.sin((d / 30.0d) * 3.141592653589793d) * 300.0d)) * 2.0d) / 3.0d);
    }

    private double b(double d, double d2) {
        double d3 = d * 2.0d;
        double d4 = d2 * 3.141592653589793d;
        return (d3 - 100.0d) + (d2 * 3.0d) + (d2 * 0.2d * d2) + (0.1d * d * d2) + (Math.sqrt(Math.abs(d)) * 0.2d) + ((((Math.sin((6.0d * d) * 3.141592653589793d) * 20.0d) + (Math.sin(d3 * 3.141592653589793d) * 20.0d)) * 2.0d) / 3.0d) + ((((Math.sin(d4) * 20.0d) + (Math.sin((d2 / 3.0d) * 3.141592653589793d) * 40.0d)) * 2.0d) / 3.0d) + ((((Math.sin((d2 / 12.0d) * 3.141592653589793d) * 160.0d) + (Math.sin(d4 / 30.0d) * 320.0d)) * 2.0d) / 3.0d);
    }

    private double[] a(double d, double d2) {
        double d3 = d - 105.0d;
        double d4 = d2 - 35.0d;
        double dC = c(d3, d4);
        double dB = b(d3, d4);
        double d5 = (d2 / 180.0d) * 3.141592653589793d;
        double dSin = Math.sin(d5);
        double d6 = 1.0d - ((0.006693421622965943d * dSin) * dSin);
        double dSqrt = Math.sqrt(d6);
        return new double[]{(dC * 180.0d) / (((6378245.0d / dSqrt) * Math.cos(d5)) * 3.141592653589793d), (dB * 180.0d) / ((6335552.717000426d / (d6 * dSqrt)) * 3.141592653589793d)};
    }
}
