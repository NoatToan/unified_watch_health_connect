package com.xiaomi.hm.health.locweather;

import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.locweather.location.MyLocation;

/* JADX INFO: loaded from: classes21.dex */
public class DistanceUtil {
    private static final String a = "DistanceUtil";
    private static final int b = 10000;
    private static final double c = 6378137.0d;

    public static boolean a(MyLocation myLocation, MyLocation myLocation2) {
        double distance = getDistance(myLocation.getLatitude(), myLocation.getLongitude(), myLocation2.getLatitude(), myLocation2.getLongitude());
        HMLog.i(a, "distance: " + distance, new Object[0]);
        return distance > 10000.0d;
    }

    private static double b(double d) {
        return (d * 3.141592653589793d) / 180.0d;
    }

    public static double getDistance(double d, double d2, double d3, double d4) {
        double dB = b(d);
        double dB2 = b(d3);
        return Math.asin(Math.sqrt(Math.pow(Math.sin((dB - dB2) / 2.0d), 2.0d) + (Math.cos(dB) * Math.cos(dB2) * Math.pow(Math.sin((b(d2) - b(d4)) / 2.0d), 2.0d)))) * 2.0d * c;
    }
}
