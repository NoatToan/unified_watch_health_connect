package com.google.maps.android.geometry;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes2.dex */
public class Point {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final double f54320x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final double f54321y;

    public Point(double d14, double d15) {
        this.f54320x = d14;
        this.f54321y = d15;
    }

    public String toString() {
        return "Point{x=" + this.f54320x + ", y=" + this.f54321y + CoreConstants.CURLY_RIGHT;
    }
}
