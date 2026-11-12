package com.xiaomi.wearable.gpsalgorithm;

import com.xiaomi.fit.data.common.constant.FitnessTestPref;
import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fit.data.common.data.sport.SportRecordItem;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.wearable.gpsalgorithm.api.IFitnessSportAlgo;
import com.xiaomi.wearable.gpsalgorithm.data.GpsTrackData;
import com.xiaomi.wearable.gpsalgorithm.data.MapRotationData;
import com.xiaomi.wearable.gpsalgorithm.impl.FitnessSportExternalAlgo;
import com.xiaomi.wearable.gpsalgorithm.impl.FitnessSportNativeAlgo;
import com.xiaomi.wearable.gpsalgorithm.impl.FitnessSportTgcAlgo;
import com.xiaomi.wearable.gpsalgorithm.inner.PathConfigParams;
import com.xiaomi.wearable.gpsalgorithm.inner.PathSmoothTool2;
import com.xiaomi.wearable.gpsalgorithm.listener.AutoPauseCallback;
import com.xiaomi.wearable.gpsalgorithm.utils.FitnessAlgoCsvUtils;
import defpackage.s2b;
import defpackage.t4i;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class FitnessSportAlgo implements IFitnessSportAlgo {
    public static final int IS_PAUSE = 0;
    public static final int IS_SPORTING = 1;
    private static final String TAG = "FitnessSportAlgo";
    public static volatile FitnessSportAlgo sInstance;
    private static Object sLock = new Object();
    private final IFitnessSportAlgo mExternalInstance;
    private final IFitnessSportAlgo mNativeInstance;
    private int mSportType;

    private FitnessSportAlgo(UserProfile userProfile) {
        this.mExternalInstance = new FitnessSportExternalAlgo(userProfile);
        this.mNativeInstance = new FitnessSportNativeAlgo(userProfile);
    }

    public static void computePauseFlag(List<SportRecordItem> list, List<Location> list2) {
        int i = 0;
        Integer numValueOf = 0;
        Boolean bool = Boolean.FALSE;
        if (list == null || list.size() <= 1) {
            return;
        }
        Location location = null;
        Location location2 = null;
        Location location3 = null;
        while (i < list2.size()) {
            Location location4 = list2.get(i);
            if (gpsIsInSport(Long.valueOf(location4.timeStamp), list, numValueOf).booleanValue()) {
                if (bool.booleanValue()) {
                    int i2 = i + 1;
                    if (i2 < list2.size()) {
                        list2.get(i2).isSaveFlag = true;
                    }
                    location4.isSaveFlag = true;
                    bool = Boolean.FALSE;
                }
            } else if (numValueOf.intValue() < list.size()) {
                if (location4.timeStamp > list.get(numValueOf.intValue()).getEndTime()) {
                    if (location != null && !bool.booleanValue()) {
                        if (location2 != null) {
                            location2.isSaveFlag = true;
                        }
                        if (location3 != null) {
                            location3.isSaveFlag = true;
                        }
                        location.isSaveFlag = true;
                        location4.isSaveFlag = true;
                        bool = Boolean.TRUE;
                    }
                    numValueOf = Integer.valueOf(numValueOf.intValue() + 1);
                }
            }
            i++;
            location3 = location2;
            location2 = location;
            location = location4;
        }
    }

    public static FitnessSportAlgo getInstance(UserProfile userProfile) {
        if (sInstance == null) {
            synchronized (sLock) {
                try {
                    if (sInstance == null) {
                        sInstance = new FitnessSportAlgo(userProfile);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    public static Boolean gpsIsInSport(Long l, List<SportRecordItem> list, Integer num) {
        if (list.isEmpty()) {
            return Boolean.FALSE;
        }
        int size = list.size();
        if (size != 1 && num.intValue() < size) {
            SportRecordItem sportRecordItem = list.get(num.intValue());
            if (l.longValue() < sportRecordItem.getStartTime() || l.longValue() > sportRecordItem.getEndTime()) {
                return (num.intValue() != size - 1 || l.longValue() < Math.max(0L, sportRecordItem.getEndTime())) ? Boolean.FALSE : Boolean.TRUE;
            }
            return Boolean.TRUE;
        }
        return Boolean.TRUE;
    }

    public static List<Location> smoothGpsTrack(GpsTrackData gpsTrackData, List<SportRecordItem> list) {
        System.currentTimeMillis();
        if (gpsTrackData.tgcBytes == null) {
            return smoothMiGpsTrack(gpsTrackData, list);
        }
        List<Location> listSmoothGpsTrack = FitnessSportTgcAlgo.smoothGpsTrack(gpsTrackData, list);
        PathSmoothTool2 pathSmoothTool2 = new PathSmoothTool2(PathConfigParams.createPathConfigParams(gpsTrackData.sportType, listSmoothGpsTrack.size()));
        computePauseFlag(list, listSmoothGpsTrack);
        List<Location> listReducerVerticalThreshold = pathSmoothTool2.reducerVerticalThreshold(listSmoothGpsTrack, Boolean.TRUE);
        if (!FitnessTestPref.INSTANCE.getENABLE_PRINT_SPORT_GPS_ALGO()) {
            return listReducerVerticalThreshold;
        }
        File file = new File(AppUtil.getApp().getExternalFilesDir(null), "/fitness/csv/sport/gpsAlgo");
        String dateStr = FitnessDateUtils.getDateStr(gpsTrackData.startTime);
        FitnessAlgoCsvUtils.writeTgcOriginData(new File(file, dateStr + "tgc_origin_data"), gpsTrackData.tgcBytes);
        smoothMiGpsTrack(gpsTrackData, list);
        FitnessAlgoCsvUtils.writeLocationListCSV(listSmoothGpsTrack, dateStr + "_library_gps_tgc_algo_origin.csv");
        FitnessAlgoCsvUtils.writeLocationListCSV(listReducerVerticalThreshold, dateStr + "_library_gps_tgc_algo_final.csv");
        return listReducerVerticalThreshold;
    }

    private static List<Location> smoothMiGpsTrack(GpsTrackData gpsTrackData, List<SportRecordItem> list) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        List<Location> listSmoothGpsTrack = FitnessSportExternalAlgo.smoothGpsTrack(gpsTrackData);
        if (listSmoothGpsTrack == null || listSmoothGpsTrack.size() == 0) {
            FitnessLogUtils.w(TAG, "smooth list is empty!!!");
            return listSmoothGpsTrack;
        }
        PathSmoothTool2 pathSmoothTool2 = new PathSmoothTool2(PathConfigParams.createPathConfigParams(gpsTrackData.sportType, listSmoothGpsTrack.size()));
        computePauseFlag(list, listSmoothGpsTrack);
        List<Location> listReducerVerticalThreshold = pathSmoothTool2.reducerVerticalThreshold(listSmoothGpsTrack, Boolean.FALSE);
        FitnessLogUtils.i(TAG, "smoothGpsTrack time= " + (System.currentTimeMillis() - jCurrentTimeMillis));
        ArrayList arrayList = new ArrayList();
        if (FitnessTestPref.INSTANCE.getENABLE_PRINT_SPORT_GPS_ALGO()) {
            String dateStr = FitnessDateUtils.getDateStr(gpsTrackData.startTime);
            FitnessAlgoCsvUtils.writeLocationListCSV(gpsTrackData.locationList, dateStr + "_library_gps_algo_before.csv");
            FitnessAlgoCsvUtils.writeLocationListCSV(listSmoothGpsTrack, dateStr + "_library_gps_algo_after.csv");
            FitnessAlgoCsvUtils.writeLocationListCSV(listReducerVerticalThreshold, dateStr + "_library_gps_reducer_final.csv");
            for (int i = 0; i < listReducerVerticalThreshold.size(); i++) {
                Location location = listReducerVerticalThreshold.get(i);
                Location location2 = new Location();
                s2b s2bVarB = t4i.b(location.latitude, location.longitude);
                location2.latitude = s2bVarB.f33203a;
                location2.longitude = s2bVarB.f33204b;
                arrayList.add(location2);
            }
            FitnessAlgoCsvUtils.writeLocationListCSV(arrayList, dateStr + "_library_gps_reducer_final_Gcj02.csv");
        }
        return listReducerVerticalThreshold;
    }

    @Override // com.xiaomi.wearable.gpsalgorithm.api.IFitnessSportAlgo
    public int autoPauseGetState() {
        return this.mExternalInstance.autoPauseGetState();
    }

    @Override // com.xiaomi.wearable.gpsalgorithm.api.IFitnessSportAlgo
    public void autoPauseHandle(float f, float f2, float f3) {
        this.mExternalInstance.autoPauseHandle(f, f2, f3);
    }

    @Override // com.xiaomi.wearable.gpsalgorithm.api.IFitnessSportAlgo
    public Location computeSportInfoByGps(Location location) {
        return this.mExternalInstance.computeSportInfoByGps(location);
    }

    @Override // com.xiaomi.wearable.gpsalgorithm.api.IFitnessSportAlgo
    public Location computeSportInfoBySteps(long j, long j2) {
        if (this.mSportType == 6) {
            return null;
        }
        return this.mExternalInstance.computeSportInfoBySteps(j, j2);
    }

    @Override // com.xiaomi.wearable.gpsalgorithm.api.IFitnessSportAlgo
    public int dynamicFeedLocation(double d, double d2) {
        return this.mExternalInstance.dynamicFeedLocation(d, d2);
    }

    @Override // com.xiaomi.wearable.gpsalgorithm.api.IFitnessSportAlgo
    public void dynamicFree() {
        this.mExternalInstance.dynamicFree();
    }

    @Override // com.xiaomi.wearable.gpsalgorithm.api.IFitnessSportAlgo
    public void dynamicInit(double d, double d2, int i) {
        this.mExternalInstance.dynamicInit(d, d2, i);
    }

    @Override // com.xiaomi.wearable.gpsalgorithm.api.IFitnessSportAlgo
    public void finishAutoPause() {
        this.mExternalInstance.finishAutoPause();
    }

    @Override // com.xiaomi.wearable.gpsalgorithm.api.IFitnessSportAlgo
    public ArrayList<MapRotationData> getDynamicRotationList() {
        return this.mExternalInstance.getDynamicRotationList();
    }

    @Override // com.xiaomi.wearable.gpsalgorithm.api.IFitnessSportAlgo
    public int getRouteMatchResult() {
        return this.mExternalInstance.getRouteMatchResult();
    }

    @Override // com.xiaomi.wearable.gpsalgorithm.api.IFitnessSportAlgo
    public void notifySportStateChanged(int i, int i2) {
        this.mSportType = i;
        this.mExternalInstance.notifySportStateChanged(i, i2);
    }

    @Override // com.xiaomi.wearable.gpsalgorithm.api.IFitnessSportAlgo
    public void progressRouteMatch(Location location) {
        this.mExternalInstance.progressRouteMatch(location);
    }

    @Override // com.xiaomi.wearable.gpsalgorithm.api.IFitnessSportAlgo
    public void setStandardRoute(List<Location> list) {
        this.mExternalInstance.setStandardRoute(list);
    }

    @Override // com.xiaomi.wearable.gpsalgorithm.api.IFitnessSportAlgo
    public void startAutoPause(AutoPauseCallback autoPauseCallback) {
        this.mExternalInstance.startAutoPause(autoPauseCallback);
    }

    @Override // com.xiaomi.wearable.gpsalgorithm.api.IFitnessSportAlgo
    public void startRouteMatch() {
        this.mExternalInstance.startRouteMatch();
    }
}
