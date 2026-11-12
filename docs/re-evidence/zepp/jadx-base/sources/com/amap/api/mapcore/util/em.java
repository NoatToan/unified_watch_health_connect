package com.amap.api.mapcore.util;

import com.amap.api.maps.model.LatLng;

/* JADX INFO: loaded from: classes2.dex */
public final class em {
    private static double a(LatLng latLng, LatLng latLng2, LatLng latLng3) {
        double d = latLng.latitude;
        double d2 = d - latLng3.latitude;
        double d3 = latLng.longitude;
        double d4 = latLng2.longitude;
        return ((d3 - d4) * (d - latLng2.latitude)) - ((d3 - d4) * d2);
    }

    private static boolean b(LatLng latLng, LatLng latLng2, LatLng latLng3) {
        double d = latLng.longitude;
        double d2 = latLng2.longitude;
        double d3 = d - d2 > 0.0d ? d : d2;
        if (d - d2 >= 0.0d) {
            d = d2;
        }
        double d4 = latLng.latitude;
        double d5 = latLng2.latitude;
        double d6 = d4 - d5 > 0.0d ? d4 : d5;
        if (d4 - d5 >= 0.0d) {
            d4 = d5;
        }
        double d7 = latLng3.longitude;
        if (d > d7 || d7 > d3) {
            return false;
        }
        double d8 = latLng3.latitude;
        return d4 <= d8 && d8 <= d6;
    }

    public static boolean a(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4) {
        double dA = a(latLng3, latLng4, latLng);
        double dA2 = a(latLng3, latLng4, latLng2);
        double dA3 = a(latLng, latLng2, latLng3);
        double dA4 = a(latLng, latLng2, latLng4);
        if (((dA > 0.0d && dA2 < 0.0d) || (dA < 0.0d && dA2 > 0.0d)) && ((dA3 > 0.0d && dA4 < 0.0d) || (dA3 < 0.0d && dA4 > 0.0d))) {
            return true;
        }
        if (dA == 0.0d && b(latLng3, latLng4, latLng)) {
            return true;
        }
        if (dA2 == 0.0d && b(latLng3, latLng4, latLng2)) {
            return true;
        }
        if (dA3 == 0.0d && b(latLng, latLng2, latLng3)) {
            return true;
        }
        return dA4 == 0.0d && b(latLng, latLng2, latLng4);
    }
}
