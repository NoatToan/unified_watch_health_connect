package com.mapbox.geojson.utils;

/* JADX INFO: loaded from: classes2.dex */
public class GeoJsonUtils {
    private static long MAX_DOUBLE_TO_ROUND = (long) (9.223372036854776E18d / 1.0E7d);
    private static double ROUND_PRECISION = 1.0E7d;

    public static double trim(double d14) {
        long j8 = MAX_DOUBLE_TO_ROUND;
        return (d14 > ((double) j8) || d14 < ((double) (-j8))) ? d14 : Math.round(d14 * ROUND_PRECISION) / ROUND_PRECISION;
    }
}
