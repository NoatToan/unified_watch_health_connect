package com.xiaomi.wearable.gpsalgorithm.impl;

import androidx.annotation.RestrictTo;
import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fit.data.common.data.sport.SportRecordItem;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.wearable.gpsalgorithm.api.IFitnessSportAlgo;
import com.xiaomi.wearable.gpsalgorithm.data.GpsTrackData;
import com.xiaomi.wearable.gpsalgorithm.inner.PathConfigParams;
import com.xiaomi.wearable.gpsalgorithm.inner.PathSmoothTool2;
import com.xiaomi.wearable.gpsalgorithm.inner.TrackUtils;
import com.xiaomi.wearable.gpsalgorithm.utils.FitnessSportDistanceUtil;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class FitnessSportNativeAlgo implements IFitnessSportAlgo {
    private static final int CAL_DISTANCE_TIME_INTERVAL = 2;
    private static final int COMPUTE_DISTANCE_WINDOW_LENGTH = 5;
    private static final int COMPUTE_PACE_WINDOW_LENGTH = 10;
    private static final int SKIP_GPS_POSITION_COUNT = 2;
    private static final String TAG = "FitnessSportNativeAlgo";
    private double mDistance;
    private long mLastCalDistanceTime;
    private Location mLastLocation;
    private int mSkipPosCount;
    private int mSportType;
    private UserProfile mUserProfile;
    private List<Location> mCacheLocationList = new LinkedList();
    private List<SportRecordItem> mIncreasedDistList = new LinkedList();

    public FitnessSportNativeAlgo(UserProfile userProfile) {
        this.mUserProfile = userProfile;
        reset();
    }

    private Location computeDistanceAndPaceByGps(Location location) {
        if (location == null) {
            return null;
        }
        if (this.mSkipPosCount <= 0) {
            return computeSportInfoWithLocation(location, location.toString());
        }
        FitnessLogUtils.i(TAG, "skip gps " + this.mSkipPosCount);
        this.mSkipPosCount = this.mSkipPosCount + (-1);
        this.mCacheLocationList.clear();
        return null;
    }

    private int computePace(long j) {
        long j2 = j - 20;
        long duration = 0;
        float fFloatValue = 0.0f;
        for (SportRecordItem sportRecordItem : this.mIncreasedDistList) {
            if (sportRecordItem.getEndTime() >= j2) {
                duration += (long) sportRecordItem.getDuration();
                fFloatValue += sportRecordItem.getValue().floatValue();
            }
        }
        if (duration == 0 || fFloatValue <= 0.0f) {
            return 0;
        }
        return (int) ((duration * 1000) / fFloatValue);
    }

    private Location computeSlidingWindowAvgLocation(List<Location> list, Location location) {
        if (list != null && list.size() != 0) {
            long j = location.timeStamp;
            int size = list.size() + 1;
            double d = location.latitude;
            double d2 = location.longitude;
            for (Location location2 : list) {
                d += location2.latitude;
                d2 += location2.longitude;
            }
            if (d != 0.0d && d2 != 0.0d) {
                double d3 = size;
                double d4 = d / d3;
                double d5 = d2 / d3;
                Location location3 = new Location();
                location3.timeStamp = j;
                location3.latitude = d4;
                location3.longitude = d5;
                return location3;
            }
        }
        return location;
    }

    private Location computeSportInfoWithLocation(Location location, String str) {
        double d;
        if (this.mLastLocation == null) {
            FitnessLogUtils.i(TAG, "push in sliding window directly, " + str);
            pushLocationInfoToSlidingWindow(this.mCacheLocationList, location, 0.0d);
            this.mLastLocation = location;
            location.distance = 0.0d;
            return null;
        }
        Location locationComputeSlidingWindowAvgLocation = computeSlidingWindowAvgLocation(this.mCacheLocationList, location);
        long j = location.timeStamp;
        Location location2 = this.mLastLocation;
        long j2 = j - location2.timeStamp;
        if (j2 == 0) {
            FitnessLogUtils.i(TAG, "duration = 0, " + str);
            return null;
        }
        double dComputeDistance = FitnessSportDistanceUtil.computeDistance(locationComputeSlidingWindowAvgLocation.latitude, locationComputeSlidingWindowAvgLocation.longitude, location2.latitude, location2.longitude);
        if (dComputeDistance < 0.0d) {
            FitnessLogUtils.i(TAG, "distance(" + dComputeDistance + ") < 0, " + str);
            d = 0.0d;
        } else {
            d = dComputeDistance;
        }
        double minSportDistance = FitnessSportDistanceUtil.getMinSportDistance(this.mSportType, j2);
        double maxSportDistance = FitnessSportDistanceUtil.getMaxSportDistance(this.mSportType, j2);
        if (d <= minSportDistance) {
            FitnessLogUtils.i(TAG, "distance(" + d + ") <= minDis(" + minSportDistance + "), " + str);
            return null;
        }
        if (d <= maxSportDistance) {
            pushLocationInfoToSlidingWindow(this.mCacheLocationList, location, d);
            this.mLastLocation = locationComputeSlidingWindowAvgLocation;
            locationComputeSlidingWindowAvgLocation.distance = d;
            return locationComputeSlidingWindowAvgLocation;
        }
        FitnessLogUtils.i(TAG, "distance exceed maxDistance, and abort " + d + ", " + str);
        return null;
    }

    private void pushLocationInfoToSlidingWindow(List<Location> list, Location location, double d) {
        location.distance = d;
        list.add(location);
        if (list.size() >= 5) {
            list.remove(0);
        }
        if (this.mLastLocation != null) {
            this.mIncreasedDistList.add(new SportRecordItem(this.mLastLocation.timeStamp, location.timeStamp, Double.valueOf(d), 0, 0));
        }
        if (this.mIncreasedDistList.size() > 10) {
            this.mIncreasedDistList.remove(0);
        }
    }

    private void reset() {
        resetForPause();
        this.mDistance = 0.0d;
    }

    private void resetForPause() {
        this.mCacheLocationList.clear();
        this.mLastCalDistanceTime = 0L;
        this.mLastLocation = null;
        this.mSkipPosCount = 2;
    }

    public static List<Location> smoothGpsTrack(GpsTrackData gpsTrackData) {
        List<Location> list;
        if (gpsTrackData == null || (list = gpsTrackData.locationList) == null || list.size() == 0) {
            FitnessLogUtils.w(TAG, "smoothGpsTrack: no original location list");
            return null;
        }
        FitnessLogUtils.i(TAG, "smoothGpsTrack");
        try {
            TrackUtils.trackFilter(gpsTrackData.locationList);
        } catch (Exception e) {
            FitnessLogUtils.i(TAG, "Trajectory optimization algorithm catch e:" + e.toString());
        }
        return new PathSmoothTool2(PathConfigParams.createPathConfigParams(gpsTrackData.sportType, gpsTrackData.locationList.size())).pathOptimize(gpsTrackData.locationList);
    }

    @Override // com.xiaomi.wearable.gpsalgorithm.api.IFitnessSportAlgo
    public Location computeSportInfoByGps(Location location) {
        if (location == null) {
            return null;
        }
        long j = location.timeStamp;
        if (this.mLastCalDistanceTime == 0) {
            this.mLastCalDistanceTime = j - 1;
        }
        if (j - this.mLastCalDistanceTime >= 2) {
            Location locationComputeDistanceAndPaceByGps = computeDistanceAndPaceByGps(location);
            this.mLastCalDistanceTime = j;
            if (locationComputeDistanceAndPaceByGps != null) {
                double d = this.mDistance + locationComputeDistanceAndPaceByGps.distance;
                this.mDistance = d;
                locationComputeDistanceAndPaceByGps.total_distance = d;
                locationComputeDistanceAndPaceByGps.pace = computePace(j);
                return locationComputeDistanceAndPaceByGps;
            }
        }
        Location location2 = new Location();
        location2.timeStamp = j;
        location2.latitude = location.latitude;
        location2.longitude = location.longitude;
        location2.distance = 0.0d;
        location2.total_distance = this.mDistance;
        Location location3 = this.mLastLocation;
        location2.pace = location3 != null ? location3.pace : 0;
        return location2;
    }

    @Override // com.xiaomi.wearable.gpsalgorithm.api.IFitnessSportAlgo
    public Location computeSportInfoBySteps(long j, long j2) {
        return null;
    }

    @Override // com.xiaomi.wearable.gpsalgorithm.api.IFitnessSportAlgo
    public void notifySportStateChanged(int i, int i2) {
        if (i2 == 1) {
            this.mSportType = i;
        } else if (i2 == 2) {
            resetForPause();
            return;
        } else if (i2 != 4) {
            return;
        }
        reset();
    }
}
