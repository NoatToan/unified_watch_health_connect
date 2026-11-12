package com.xiaomi.wearable.gpsalgorithm.utils;

import android.text.TextUtils;
import com.xiaomi.fit.data.common.data.sport.Location;

/* JADX INFO: loaded from: classes2.dex */
public class FitnessSportDistanceUtil {
    private static final double K = 0.017453292519444445d;

    public static float computeDistance(Location location, Location location2) {
        if (location == null || location2 == null) {
            return 0.0f;
        }
        return computeDistance(location.latitude, location.longitude, location2.latitude, location2.longitude);
    }

    public static double computeDistance2(double d, double d2, double d3, double d4) {
        return Math.asin(Math.sqrt(Math.pow(Math.sin(((d - d3) * K) / 2.0d), 2.0d) + (Math.cos(d * K) * Math.cos(d3 * K) * Math.pow(Math.sin(((d2 - d4) * K) / 2.0d), 2.0d)))) * 2.0d * 6378137.0d;
    }

    private static double getMaxDistancePerSec(int i) {
        int i2 = 6;
        if (i == 6) {
            i2 = 13;
        } else if (i == 10) {
            i2 = 4;
        }
        return i2;
    }

    public static double getMaxSportDistance(int i, long j) {
        return j * getMaxDistancePerSec(i);
    }

    public static double getMinSportDistance(int i, long j) {
        return 1.0d;
    }

    private float getStepLengthIndex(int i, float f) {
        if (f < 100.0f) {
            if (i <= 3 || i == 4) {
                return 0.8f;
            }
            if (i == 5) {
                return 0.85f;
            }
        }
        if (f >= 100.0f && f <= 109.0f && (i <= 3 || i == 4 || i == 5)) {
            return 0.9f;
        }
        if (f >= 110.0f && f <= 119.0f) {
            if (i <= 3 || i == 4) {
                return 0.95f;
            }
            if (i == 5) {
                return 0.98f;
            }
        }
        if (f >= 120.0f && f <= 129.0f) {
            if (i <= 3) {
                return 0.95f;
            }
            if (i == 4 || i == 5) {
                return 1.0f;
            }
        }
        if (f >= 130.0f && f <= 139.0f) {
            if (i <= 3) {
                return 0.95f;
            }
            if (i == 4) {
                return 1.03f;
            }
            if (i == 5) {
                return 1.1f;
            }
        }
        if (f >= 140.0f && f <= 149.0f) {
            if (i <= 3) {
                return 0.95f;
            }
            if (i == 4) {
                return 1.08f;
            }
            if (i == 5) {
                return 1.2f;
            }
        }
        if (f >= 150.0f && f <= 159.0f) {
            if (i <= 3) {
                return 0.98f;
            }
            if (i == 4) {
                return 1.2f;
            }
            if (i == 5) {
                return 1.3f;
            }
        }
        if (f >= 160.0f && f <= 169.0f) {
            if (i <= 3) {
                return 0.95f;
            }
            if (i == 4) {
                return 1.22f;
            }
            if (i == 5) {
                return 1.31f;
            }
        }
        if (f >= 170.0f && f <= 179.0f) {
            if (i <= 3) {
                return 0.95f;
            }
            if (i == 4) {
                return 1.24f;
            }
            if (i == 5) {
                return 1.31f;
            }
        }
        if (f >= 180.0f && f <= 189.0f) {
            if (i <= 3) {
                return 0.9f;
            }
            if (i == 4) {
                return 1.24f;
            }
            if (i == 5) {
                return 1.31f;
            }
        }
        if (f >= 190.0f && f <= 200.0f) {
            if (i <= 3) {
                return 0.9f;
            }
            if (i == 4) {
                return 1.24f;
            }
            if (i == 5) {
                return 1.3f;
            }
        }
        if (f <= 200.0f) {
            return 0.0f;
        }
        if (i <= 3) {
            return 0.9f;
        }
        if (i == 4) {
            return 1.24f;
        }
        return i == 5 ? 1.3f : 0.0f;
    }

    public double calDistanceWithStep(int i, String str, float f, int i2, float f2) {
        float f3;
        float f4;
        float f5;
        if (i == 0) {
            return 0.0d;
        }
        float stepLengthIndex = getStepLengthIndex(i2, f2);
        if (f != 0.0f) {
            if ("male".equals(str)) {
                f4 = f / 100.0f;
                f5 = 0.45f;
            } else {
                f4 = f / 100.0f;
                f5 = 0.41f;
            }
            f3 = f4 * f5 * stepLengthIndex;
            if (TextUtils.isEmpty(str)) {
                f3 = (f / 100.0f) * 0.43f * stepLengthIndex;
            }
        } else {
            f3 = TextUtils.isEmpty(str) ? 0.7f * stepLengthIndex : "male".equals(str) ? stepLengthIndex * 0.7f : 0.65f * stepLengthIndex;
        }
        return f3 * i;
    }

    public static float computeDistance(double d, double d2, double d3, double d4) {
        float[] fArr = new float[1];
        android.location.Location.distanceBetween(d, d2, d3, d4, fArr);
        return Math.abs(fArr[0]);
    }
}
