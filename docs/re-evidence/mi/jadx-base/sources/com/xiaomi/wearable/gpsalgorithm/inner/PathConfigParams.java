package com.xiaomi.wearable.gpsalgorithm.inner;

import com.xiaomi.fit.data.common.data.sport.Location;

/* JADX INFO: loaded from: classes2.dex */
public class PathConfigParams {
    public int mIntensity = 1;
    public float mThreshhold = 0.3f;
    public float mNoiseThreshhold = 20.0f;

    public static boolean computeFlagSegment(Location location, int i) {
        long j = location.timeStamp - location.startTimeStamp;
        if (i == 1 || i == 2 || i == 4 || i == 5) {
            if (location.distance > 100.0d && j > 60) {
                return true;
            }
        } else if (i == 6 && location.distance > 250.0d && j > 90.0d) {
            return true;
        }
        return false;
    }

    public static PathConfigParams createPathConfigParams(int i, int i2) {
        PathConfigParams pathConfigParams = new PathConfigParams();
        float f = 0.5f;
        if (i == 1 || i == 2 || i == 4 || i == 5) {
            pathConfigParams.mIntensity = 2;
            pathConfigParams.mNoiseThreshhold = 15.0f;
        } else if (i == 6) {
            pathConfigParams.mIntensity = 3;
            pathConfigParams.mNoiseThreshhold = 10.0f;
            f = 0.7f;
        }
        if (i2 <= 300) {
            pathConfigParams.mThreshhold = f - 0.4f;
        } else if (i2 <= 600) {
            pathConfigParams.mThreshhold = f - 0.3f;
        } else if (i2 <= 1200) {
            pathConfigParams.mThreshhold = f - 0.2f;
        } else if (i2 <= 1800) {
            pathConfigParams.mThreshhold = f - 0.1f;
        } else {
            pathConfigParams.mThreshhold = f;
        }
        return pathConfigParams;
    }
}
