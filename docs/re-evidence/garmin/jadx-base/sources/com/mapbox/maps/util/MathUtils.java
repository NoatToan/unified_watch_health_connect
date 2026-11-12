package com.mapbox.maps.util;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u001d\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/mapbox/maps/util/MathUtils;", "", "()V", "normalize", "", "angle", "prepareOptimalBearingPath", "", "targets", "shortestRotation", "targetHeading", "currentHeading", "shortestRotation$sdk_base_release", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MathUtils {
    public static final MathUtils INSTANCE = new MathUtils();

    private MathUtils() {
    }

    private final double normalize(double angle) {
        return ((angle % 360.0d) + 360.0d) % 360.0d;
    }

    public final double[] prepareOptimalBearingPath(double[] targets) {
        double dShortestRotation$sdk_base_release;
        targets.getClass();
        double[] dArr = new double[targets.length];
        int length = targets.length;
        for (int i14 = 0; i14 < length; i14++) {
            if (i14 == 0) {
                dShortestRotation$sdk_base_release = INSTANCE.normalize(targets[i14]);
            } else {
                MathUtils mathUtils = INSTANCE;
                dShortestRotation$sdk_base_release = mathUtils.shortestRotation$sdk_base_release(mathUtils.normalize(targets[i14]), dArr[i14 - 1]);
            }
            dArr[i14] = dShortestRotation$sdk_base_release;
        }
        return dArr;
    }

    public final double shortestRotation$sdk_base_release(double targetHeading, double currentHeading) {
        double d14 = currentHeading - targetHeading;
        if (d14 > 180.0d) {
            return targetHeading + ((double) 360.0f);
        }
        return d14 < -180.0d ? targetHeading - ((double) 360.0f) : targetHeading;
    }
}
