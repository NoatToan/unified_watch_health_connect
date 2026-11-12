package com.xiaomi.wearable.gpsalgorithm.inner;

import com.amap.api.maps.AMapException;
import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.wearable.gpsalgorithm.utils.FitnessSportDistanceUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class PathSmoothTool2 {
    private double currentLocation_x;
    private double currentLocation_y;
    private double estimate_x;
    private double estimate_y;
    private double gauss_x;
    private double gauss_y;
    private double kalmanGain_x;
    private double kalmanGain_y;
    private double lastLocation_x;
    private double lastLocation_y;
    private int mIntensity;
    private float mNoiseThreshhold;
    private float mThreshhold;
    private double mdelt_x;
    private double mdelt_y;
    private double pdelt_x;
    private double pdelt_y;
    private double m_R = 0.0d;
    private double m_Q = 0.0d;

    public PathSmoothTool2(PathConfigParams pathConfigParams) {
        this.mIntensity = 1;
        this.mThreshhold = 0.3f;
        this.mNoiseThreshhold = 20.0f;
        this.mIntensity = pathConfigParams.mIntensity;
        this.mThreshhold = pathConfigParams.mThreshhold;
        this.mNoiseThreshhold = pathConfigParams.mNoiseThreshhold;
    }

    private static double calculateDistanceFromPoint(Location location, Location location2, Location location3) {
        double d = location.longitude;
        double d2 = location2.longitude;
        double d3 = location.latitude;
        double d4 = location2.latitude;
        double d5 = location3.longitude;
        double d6 = d5 - d2;
        double d7 = location3.latitude;
        double d8 = d7 - d4;
        double d9 = (((d - d2) * d6) + ((d3 - d4) * d8)) / ((d6 * d6) + (d8 * d8));
        if (d9 >= 0.0d && (d2 != d5 || d4 != d7)) {
            if (d9 > 1.0d) {
                d4 = d7;
                d2 = d5;
            } else {
                d2 += d6 * d9;
                d4 += d9 * d8;
            }
        }
        Location location4 = new Location();
        location4.latitude = d4;
        location4.longitude = d2;
        return calculateLineDistance(location, location4);
    }

    public static float calculateLineDistance(Location location, Location location2) {
        if (location == null || location2 == null) {
            try {
                throw new Exception(AMapException.ERROR_ILLEGAL_VALUE);
            } catch (Exception e) {
                e.printStackTrace();
                return 0.0f;
            }
        }
        try {
            double d = location.longitude;
            double d2 = d * 0.01745329251994329d;
            double d3 = location.latitude * 0.01745329251994329d;
            double d4 = location2.longitude * 0.01745329251994329d;
            double d5 = location2.latitude * 0.01745329251994329d;
            double dSin = Math.sin(d2);
            double dSin2 = Math.sin(d3);
            double dCos = Math.cos(d2);
            double dCos2 = Math.cos(d3);
            double dSin3 = Math.sin(d4);
            double dSin4 = Math.sin(d5);
            double dCos3 = Math.cos(d4);
            double dCos4 = Math.cos(d5);
            double[] dArr = {dCos * dCos2, dCos2 * dSin, dSin2};
            double d6 = dCos3 * dCos4;
            double d7 = dCos4 * dSin3;
            double d8 = dArr[0];
            double d9 = (d8 - d6) * (d8 - d6);
            double d10 = dArr[1];
            double d11 = d9 + ((d10 - d7) * (d10 - d7));
            double d12 = dArr[2];
            return (float) (Math.asin(Math.sqrt(d11 + ((d12 - dSin4) * (d12 - dSin4))) / 2.0d) * 1.27420015798544E7d);
        } catch (Throwable th) {
            th.printStackTrace();
            return 0.0f;
        }
    }

    private void computeGPSDistance(Location location, Location location2) {
        double dComputeDistance = FitnessSportDistanceUtil.computeDistance(location, location2);
        location2.distance = dComputeDistance;
        location2.total_distance = location.total_distance + dComputeDistance;
    }

    private static Location getLastLocation(List<Location> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    private void initial() {
        this.pdelt_x = 0.001d;
        this.pdelt_y = 0.001d;
        this.mdelt_x = 5.698402909980532E-4d;
        this.mdelt_y = 5.698402909980532E-4d;
    }

    private Location kalmanFilter(double d, double d2, double d3, double d4) {
        this.lastLocation_x = d;
        this.currentLocation_x = d2;
        double d5 = this.pdelt_x;
        double d6 = this.mdelt_x;
        double dSqrt = Math.sqrt((d5 * d5) + (d6 * d6)) + this.m_Q;
        this.gauss_x = dSqrt;
        double d7 = this.pdelt_x;
        double dSqrt2 = Math.sqrt((dSqrt * dSqrt) / ((dSqrt * dSqrt) + (d7 * d7))) + this.m_R;
        this.kalmanGain_x = dSqrt2;
        double d8 = this.currentLocation_x;
        double d9 = this.lastLocation_x;
        this.estimate_x = ((d8 - d9) * dSqrt2) + d9;
        double d10 = this.gauss_x;
        this.mdelt_x = Math.sqrt((1.0d - dSqrt2) * d10 * d10);
        this.lastLocation_y = d3;
        this.currentLocation_y = d4;
        double d11 = this.pdelt_y;
        double d12 = this.mdelt_y;
        double dSqrt3 = Math.sqrt((d11 * d11) + (d12 * d12)) + this.m_Q;
        this.gauss_y = dSqrt3;
        double d13 = this.pdelt_y;
        double dSqrt4 = Math.sqrt((dSqrt3 * dSqrt3) / ((dSqrt3 * dSqrt3) + (d13 * d13))) + this.m_R;
        this.kalmanGain_y = dSqrt4;
        double d14 = this.currentLocation_y;
        double d15 = this.lastLocation_y;
        this.estimate_y = ((d14 - d15) * dSqrt4) + d15;
        double d16 = 1.0d - dSqrt4;
        double d17 = this.gauss_y;
        this.mdelt_y = Math.sqrt(d16 * d17 * d17);
        Location location = new Location();
        location.latitude = this.estimate_y;
        location.longitude = this.estimate_x;
        return location;
    }

    private List<Location> reduceNoisePoint(List<Location> list, float f) {
        if (list == null) {
            return null;
        }
        if (list.size() <= 2) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Location lastLocation = getLastLocation(arrayList);
            Location location = list.get(i);
            if (lastLocation == null || i == list.size() - 1) {
                arrayList.add(location);
            } else if (location.flagSegment) {
                arrayList.add(location);
            } else if (location.kilometer >= 1) {
                arrayList.add(location);
            } else if (calculateDistanceFromPoint(location, lastLocation, list.get(i + 1)) < f) {
                arrayList.add(location);
            }
        }
        return arrayList;
    }

    public int getIntensity() {
        return this.mIntensity;
    }

    public float getThreshhold() {
        return this.mThreshhold;
    }

    public List<Location> kalmanFilterPath(List<Location> list) {
        return kalmanFilterPath(list, this.mIntensity);
    }

    public Location kalmanFilterPoint(Location location, Location location2) {
        return kalmanFilterPoint(location, location2, this.mIntensity);
    }

    public List<Location> pathOptimize(List<Location> list) {
        return kalmanFilterPath(removeNoisePoint(list), this.mIntensity);
    }

    public List<Location> reducerVerticalThreshold(List<Location> list, Boolean bool) {
        return reducerVerticalThreshold(list, this.mThreshhold, bool);
    }

    public List<Location> removeNoisePoint(List<Location> list) {
        return reduceNoisePoint(list, this.mNoiseThreshhold);
    }

    public void setIntensity(int i) {
        this.mIntensity = i;
    }

    public void setNoiseThreshhold(float f) {
        this.mNoiseThreshhold = f;
    }

    public void setThreshhold(float f) {
        this.mThreshhold = f;
    }

    private List<Location> kalmanFilterPath(List<Location> list, int i) {
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 2) {
            initial();
            Location location = list.get(0);
            arrayList.add(location);
            for (int i2 = 1; i2 < list.size(); i2++) {
                Location locationKalmanFilterPoint = kalmanFilterPoint(location, list.get(i2), i);
                if (locationKalmanFilterPoint != null) {
                    arrayList.add(locationKalmanFilterPoint);
                    location = locationKalmanFilterPoint;
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0019 A[PHI: r0
      0x0019: PHI (r0v7 int) = (r0v2 int), (r0v3 int) binds: [B:11:0x0017, B:14:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    private Location kalmanFilterPoint(Location location, Location location2, int i) {
        if (this.pdelt_x == 0.0d || this.pdelt_y == 0.0d) {
            initial();
        }
        if (location == null || location2 == null) {
            return null;
        }
        int i2 = 1;
        if (i < 1) {
            i = i2;
        } else {
            i2 = 10;
            if (i > 10) {
                i = i2;
            }
        }
        for (int i3 = 0; i3 < i; i3++) {
            location2 = kalmanFilter(location.longitude, location2.longitude, location.latitude, location2.latitude);
        }
        return location2;
    }

    private List<Location> reducerVerticalThreshold(List<Location> list, float f, Boolean bool) {
        if (list == null) {
            return null;
        }
        if (list.size() <= 2) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Location lastLocation = getLastLocation(arrayList);
            Location location = list.get(i);
            if (i > 0 && bool.booleanValue()) {
                computeGPSDistance(list.get(i - 1), location);
            }
            if (lastLocation == null || i == list.size() - 1) {
                arrayList.add(location);
            } else if (location.isSaveFlag) {
                arrayList.add(location);
            } else if (location.flagSegment) {
                arrayList.add(location);
            } else if (location.kilometer >= 1) {
                arrayList.add(location);
            } else if (calculateDistanceFromPoint(location, lastLocation, list.get(i + 1)) > f) {
                arrayList.add(location);
            }
        }
        return arrayList;
    }
}
