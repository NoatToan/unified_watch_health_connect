package com.amap.api.location;

/* JADX INFO: loaded from: classes21.dex */
public class CoordUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f3355a = false;

    public static native int convertToGcj(double[] dArr, double[] dArr2);

    public static boolean isLoadedSo() {
        return f3355a;
    }

    public static void setLoadedSo(boolean z) {
        f3355a = z;
    }
}
