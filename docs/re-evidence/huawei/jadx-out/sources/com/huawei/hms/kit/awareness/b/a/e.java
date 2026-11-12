package com.huawei.hms.kit.awareness.b.a;

import android.location.Location;

/* JADX INFO: loaded from: classes34.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final double f13888a = 6378.137d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f13889b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final double f13890c = 50.0d;

    public static boolean a(Location location, Location location2) {
        return (location == null || location2 == null || a(location.getLongitude(), location.getLatitude(), location2.getLongitude(), location2.getLatitude()) > f13890c) ? false : true;
    }

    public static double a(double d, double d2, double d3, double d4) {
        double radians = Math.toRadians(d2);
        double radians2 = Math.toRadians(d4);
        return Math.asin(Math.sqrt(Math.pow(Math.sin((radians - radians2) / 2.0d), 2.0d) + (Math.cos(radians) * Math.cos(radians2) * Math.pow(Math.sin((Math.toRadians(d) - Math.toRadians(d3)) / 2.0d), 2.0d)))) * 2.0d * f13888a;
    }

    private e() {
    }
}
