package com.xiaomi.wearable.gpsalgorithm.impl;

import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.wearable.gpsalgorithm.api.IFitnessSportAlgo;
import com.xiaomi.wearable.gpsalgorithm.data.GpsAlgoVersion;
import com.xiaomi.wearable.gpsalgorithm.data.GpsTrackData;
import com.xiaomi.wearable.gpsalgorithm.data.MapRotationData;
import com.xiaomi.wearable.gpsalgorithm.listener.AutoPauseCallback;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class FitnessSportExternalAlgo implements IFitnessSportAlgo {
    private static final String TAG = "SportExternalAlgo";
    private static String mVersion;
    private boolean isAutoPause;
    private double mDistance;
    private double mPauseDistance;
    private long mPauseSteps;
    private long mTotalSteps;
    private final UserProfile mUserProfile;
    private int stepLength;

    static {
        System.loadLibrary("jni_gps_algo");
    }

    public FitnessSportExternalAlgo(UserProfile userProfile) {
        this.mUserProfile = userProfile;
    }

    private native void clear();

    private native void destroyAutoPause();

    public static native GpsAlgoVersion getAlgoVersion();

    public static String getGpsAlgoVersion() {
        if (!TextUtils.isEmpty(mVersion)) {
            return mVersion;
        }
        GpsAlgoVersion algoVersion = getAlgoVersion();
        if (algoVersion == null) {
            return null;
        }
        String str = String.format("%d.%d.%d", Integer.valueOf(algoVersion.major), Integer.valueOf(algoVersion.mid), Integer.valueOf(algoVersion.minor));
        mVersion = str;
        return str;
    }

    private native int getStepLength();

    private native void init(UserProfile userProfile);

    private native void initAutoPause();

    private native int nativeAutoPauseGetState();

    private native void nativeAutoPauseHandle(float f, float f2, float f3, long j);

    private native Location onLocationChanged(Location location);

    private native void onSportStateChanged(int i, int i2);

    private native Location onStepChanged(long j, long j2);

    private native void registerAutoPause(AutoPauseCallback autoPauseCallback);

    private void reset() {
        this.mDistance = 0.0d;
        this.mPauseDistance = 0.0d;
        this.mPauseSteps = 0L;
        this.mTotalSteps = 0L;
    }

    public static native List<Location> smoothGps(GpsTrackData gpsTrackData);

    public static List<Location> smoothGpsTrack(GpsTrackData gpsTrackData) {
        List<Location> list;
        if (gpsTrackData == null || (list = gpsTrackData.locationList) == null || list.size() == 0) {
            FitnessLogUtils.w(TAG, "smoothGpsTrack: no original location list, gpsVersion = " + getGpsAlgoVersion());
            return null;
        }
        FitnessLogUtils.i(TAG, "smoothGpsTrack origin size = " + gpsTrackData.locationList.size() + ", gpsVersion = " + getGpsAlgoVersion());
        long jCurrentTimeMillis = System.currentTimeMillis();
        List<Location> listSmoothGps = smoothGps(gpsTrackData);
        FitnessLogUtils.i(TAG, "smoothGpsTrack time = " + (System.currentTimeMillis() - jCurrentTimeMillis) + ", smooth size = " + (listSmoothGps == null ? 0 : listSmoothGps.size()));
        return listSmoothGps;
    }

    private native void unRegisterAutoPause();

    @Override // com.xiaomi.wearable.gpsalgorithm.api.IFitnessSportAlgo
    public int autoPauseGetState() {
        return nativeAutoPauseGetState();
    }

    @Override // com.xiaomi.wearable.gpsalgorithm.api.IFitnessSportAlgo
    public void autoPauseHandle(float f, float f2, float f3) {
        if (this.isAutoPause) {
            nativeAutoPauseHandle(f, f2, f3, System.currentTimeMillis());
        }
    }

    @Override // com.xiaomi.wearable.gpsalgorithm.api.IFitnessSportAlgo
    public Location computeSportInfoByGps(Location location) {
        if (location == null) {
            return null;
        }
        FitnessLogUtils.d(TAG, "computeSportInfoByGps before: " + location);
        Location locationOnLocationChanged = onLocationChanged(location);
        if (locationOnLocationChanged == null) {
            FitnessLogUtils.d(TAG, "computeSportInfoByGps after: return null");
            Location location2 = new Location();
            location2.total_distance = this.mDistance;
            return location2;
        }
        FitnessLogUtils.d(TAG, "computeSportInfoByGps after: " + locationOnLocationChanged);
        double d = locationOnLocationChanged.total_distance;
        double d2 = this.mDistance;
        double d3 = this.mPauseDistance;
        locationOnLocationChanged.distance = d - (d2 - d3);
        double d4 = d3 + d;
        this.mDistance = d4;
        locationOnLocationChanged.total_distance = d4;
        return locationOnLocationChanged;
    }

    @Override // com.xiaomi.wearable.gpsalgorithm.api.IFitnessSportAlgo
    public Location computeSportInfoBySteps(long j, long j2) {
        this.mTotalSteps = j2;
        long j3 = this.mPauseSteps;
        long j4 = j2 >= j3 ? j2 - j3 : j2;
        FitnessLogUtils.d(TAG, "computeSportInfoBySteps before: ts_milli = " + j + ", totalSteps = " + j2 + ", algoSteps = " + j4);
        Location locationOnStepChanged = onStepChanged(j, j4);
        if (locationOnStepChanged == null) {
            FitnessLogUtils.d(TAG, "computeSportInfoBySteps after: return null");
            Location location = new Location();
            location.total_distance = this.mDistance;
            return location;
        }
        double d = locationOnStepChanged.total_distance;
        double d2 = this.mDistance;
        double d3 = this.mPauseDistance;
        locationOnStepChanged.distance = d - (d2 - d3);
        this.mDistance = d3 + d;
        FitnessLogUtils.d(TAG, "computeSportInfoBySteps after: " + locationOnStepChanged + ", mDistance = " + this.mDistance);
        locationOnStepChanged.total_distance = this.mDistance;
        return locationOnStepChanged;
    }

    @Override // com.xiaomi.wearable.gpsalgorithm.api.IFitnessSportAlgo
    public int dynamicFeedLocation(double d, double d2) {
        return feedLocation(d, d2);
    }

    @Override // com.xiaomi.wearable.gpsalgorithm.api.IFitnessSportAlgo
    public void dynamicFree() {
        dynamicTraceFree();
    }

    @Override // com.xiaomi.wearable.gpsalgorithm.api.IFitnessSportAlgo
    public void dynamicInit(double d, double d2, int i) {
        dynamicTraceInit(d, d2, i);
    }

    public native void dynamicTraceFree();

    public native void dynamicTraceInit(double d, double d2, int i);

    public native int feedLocation(double d, double d2);

    @Override // com.xiaomi.wearable.gpsalgorithm.api.IFitnessSportAlgo
    public void finishAutoPause() {
        if (this.isAutoPause) {
            this.isAutoPause = false;
            FitnessLogUtils.i(TAG, "isAutoPause:" + this.isAutoPause);
            unRegisterAutoPause();
            destroyAutoPause();
        }
    }

    @Override // com.xiaomi.wearable.gpsalgorithm.api.IFitnessSportAlgo
    public ArrayList<MapRotationData> getDynamicRotationList() {
        return getRotationList();
    }

    public native ArrayList<MapRotationData> getRotationList();

    @Override // com.xiaomi.wearable.gpsalgorithm.api.IFitnessSportAlgo
    public int getRouteMatchResult() {
        int iRouteMatchCalcResult = routeMatchCalcResult();
        routeMatchDestroy();
        FitnessLogUtils.i(TAG, "getRouteMatchResult , result:" + iRouteMatchCalcResult);
        return iRouteMatchCalcResult;
    }

    public native void initRouteMatch();

    @Override // com.xiaomi.wearable.gpsalgorithm.api.IFitnessSportAlgo
    public void notifySportStateChanged(int i, int i2) {
        if (i2 == 1) {
            init(this.mUserProfile);
            reset();
            onSportStateChanged(i, i2);
            return;
        }
        if (i2 == 2) {
            this.mPauseDistance = this.mDistance;
            this.mPauseSteps = this.mTotalSteps;
            FitnessLogUtils.i(TAG, "pause mPauseDistance = " + this.mPauseDistance + ", mPauseSteps = " + this.mPauseSteps);
        } else if (i2 == 4) {
            int stepLength = getStepLength();
            if (stepLength != 0) {
                this.stepLength = stepLength;
            }
            onSportStateChanged(i, i2);
            reset();
            clear();
            return;
        }
        onSportStateChanged(i, i2);
    }

    @Override // com.xiaomi.wearable.gpsalgorithm.api.IFitnessSportAlgo
    public void progressRouteMatch(Location location) {
        FitnessLogUtils.d(TAG, "progressRouteMatch");
        routeMatchProcessOnline(location);
    }

    public native int routeMatchCalcResult();

    public native void routeMatchDestroy();

    public native void routeMatchLoadStandardRoute(List<Location> list);

    public native void routeMatchProcessOnline(Location location);

    @Override // com.xiaomi.wearable.gpsalgorithm.api.IFitnessSportAlgo
    public void setStandardRoute(List<Location> list) {
        FitnessLogUtils.i(TAG, "setStandardRoute , list size:" + list.size());
        routeMatchLoadStandardRoute(list);
    }

    @Override // com.xiaomi.wearable.gpsalgorithm.api.IFitnessSportAlgo
    public void startAutoPause(AutoPauseCallback autoPauseCallback) {
        this.isAutoPause = true;
        FitnessLogUtils.i(TAG, "isAutoPause:" + this.isAutoPause);
        initAutoPause();
        registerAutoPause(autoPauseCallback);
    }

    @Override // com.xiaomi.wearable.gpsalgorithm.api.IFitnessSportAlgo
    public void startRouteMatch() {
        FitnessLogUtils.i(TAG, "start Route Match");
        initRouteMatch();
    }
}
