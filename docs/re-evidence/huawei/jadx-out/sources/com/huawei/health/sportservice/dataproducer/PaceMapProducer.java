package com.huawei.health.sportservice.dataproducer;

import android.text.TextUtils;
import com.huawei.health.sport.ITargetUpdateListener;
import com.huawei.health.sportservice.SportDataNotify;
import com.huawei.health.sportservice.SportLifecycle;
import com.huawei.health.sportservice.manager.BaseSportManager;
import com.huawei.health.sportservice.template.ComponentName;
import com.huawei.health.sportservice.template.SportComponentType;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.jsoperation.JsUtil;
import defpackage.gze;
import defpackage.hau;
import defpackage.lsy;
import defpackage.njj;
import defpackage.njv;
import defpackage.njy;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes31.dex */
@SportComponentType(classify = 2, name = ComponentName.PACE_MAP_PRODUCER)
public class PaceMapProducer extends BaseProducer implements SportLifecycle, ITargetUpdateListener {
    private static final int CARRY_THRESHOLD = 5;
    private static final int DEFAULT_DISTANCE_ACCURATE = 10;
    private static final int PACE_DISTANCE_INTERVAL = 1000;
    private static final int ROW_DISTANCE_INTERVAL = 500;
    private static final String R_TAG = "R_SportService_PaceMapProducer";
    private static final int START_DISTANCE = 20;
    private static final int START_RECORD_TOKEN = 1;
    private static final String TAG = "SportService_PaceMapProducer";
    private static final int TEN_MILLION_TIMES_GAIN_FOR_KEY = 10000000;
    private static final float YARD_TO_MILE = 5.68E-4f;
    private long mCurrentTime;
    private int mDistance;
    private String mPaceZoneConfig;
    private int mPaceMapInterval = 1000;
    private float mBritishPaceInterval = 1000.0f;
    private int mStartDistance = -1;
    private double mStartRecordDistance = 1.0d;
    private double mStartRecordMileDistance = 1.0d;
    private int mKiloMeterCount = 1;
    private int mMileCount = 1;
    private long mStartTimeWhenStartComputePace = -1;
    private long mStartTimeWhenStartComputePaceForMile = -1;
    private final ConcurrentHashMap<Integer, Float> mPaceMap = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<Integer, Float> mBritishPaceMap = new ConcurrentHashMap<>();
    private final List<njj> mPaceList = new ArrayList();
    private final List<njj> mBriPaceList = new ArrayList();
    private final ConcurrentHashMap<Double, Double> mPartTimeMap = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<Double, Double> mBritishPartTimeMap = new ConcurrentHashMap<>();
    private hau mSportCallbackOption = new hau();
    private boolean mIsHasDetectStart = false;

    private boolean isSupportPaceInterval(int i) {
        return i == 264 || i == 258 || i == 280;
    }

    @Override // com.huawei.health.sportservice.dataproducer.BaseProducer, com.huawei.health.sportservice.inter.SourceToProducer
    public void onSourceDataChanged(Object obj) {
    }

    @Override // com.huawei.health.sportservice.dataproducer.BaseProducer
    void onStagingAndNotification() {
    }

    @Override // com.huawei.health.sport.ITargetUpdateListener
    public void onTargetDataUpdate(gze gzeVar) {
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPreSport() {
        calculatePaceMapInterval();
        ArrayList arrayList = new ArrayList();
        arrayList.add("TIME_ONE_SECOND_DURATION");
        arrayList.add("DISTANCE_DATA");
        this.mSportCallbackOption.e(arrayList);
        this.mSportCallbackOption.d(TAG);
        BaseSportManager.getInstance().subscribeNotify(this.mSportCallbackOption, new SportDataNotify() { // from class: com.huawei.health.sportservice.dataproducer.PaceMapProducer$$ExternalSyntheticLambda0
            @Override // com.huawei.health.sportservice.SportDataNotify
            public final void onChange(List list, Map map) {
                this.f$0.m1156x187cfe34(list, map);
            }
        });
        BaseSportManager.getInstance().subscribeTargetStatus(TAG, this);
        getPaceZoneConfig();
    }

    /* JADX INFO: renamed from: lambda$onPreSport$0$com-huawei-health-sportservice-dataproducer-PaceMapProducer, reason: not valid java name */
    /* synthetic */ void m1156x187cfe34(List list, Map map) {
        if (map.containsKey("DISTANCE_DATA") && list.contains("TIME_ONE_SECOND_DURATION")) {
            this.mCurrentTime = ((Long) map.get("TIME_ONE_SECOND_DURATION")).longValue() / 1000;
            this.mDistance = ((Integer) map.get("DISTANCE_DATA")).intValue();
            if (this.mIsHasDetectStart) {
                handlePartTimeMap();
                handlePaceMap();
            }
        }
    }

    private void getPaceZoneConfig() {
        lsy.a(new Runnable() { // from class: com.huawei.health.sportservice.dataproducer.PaceMapProducer$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1155x6d432142();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$getPaceZoneConfig$1$com-huawei-health-sportservice-dataproducer-PaceMapProducer, reason: not valid java name */
    /* synthetic */ void m1155x6d432142() {
        HiUserPreference userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference("custom.UserPreference_RunningPaceZone_Config");
        if (userPreference != null) {
            String value = userPreference.getValue();
            this.mPaceZoneConfig = value;
            LogUtil.a(TAG, "mPaceZoneConfig:", value);
        }
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onStartSport() {
        this.mStartDistance = this.mDistance;
        detectStartDistance();
        this.mIsHasDetectStart = true;
        ReleaseLogUtil.d(R_TAG, "onStartSport, mIsHasDetectStart is true");
    }

    /* JADX WARN: Code duplicated, block: B:15:0x008b  */
    private void detectStartDistance() {
        if (!(BaseSportManager.getInstance().getData("DISTANCE_MILE_DATA") instanceof Float)) {
            ReleaseLogUtil.d(R_TAG, "object instanceof Float is false");
            return;
        }
        float fFloatValue = ((Float) BaseSportManager.getInstance().getData("DISTANCE_MILE_DATA")).floatValue();
        int i = this.mStartDistance;
        if (i < 1000) {
            this.mKiloMeterCount = 1;
            this.mMileCount = 1;
            this.mStartTimeWhenStartComputePace = 0L;
            this.mStartTimeWhenStartComputePaceForMile = 0L;
        } else {
            int i2 = (i / this.mPaceMapInterval) + 1;
            this.mKiloMeterCount = i2;
            float f = this.mBritishPaceInterval * 1000.0f;
            this.mMileCount = ((((int) (f * fFloatValue)) - 1) / ((int) f)) + 2;
            LogUtil.a(TAG, "mStartDistance", Integer.valueOf(i), "mKiloMeterCount", Integer.valueOf(i2));
        }
        int i3 = this.mStartDistance;
        if (i3 > 20) {
            int i4 = this.mPaceMapInterval;
            if (i3 % i4 < 20) {
                double dFloor = Math.floor((((double) i3) * 1.0d) / ((double) i4));
                this.mStartRecordDistance = dFloor;
                LogUtil.a(TAG, "mStartRecordDistance", Double.valueOf(dFloor));
            } else {
                this.mStartRecordDistance = Math.floor((((double) i3) * 1.0d) / ((double) this.mPaceMapInterval)) + 1.0d;
                LogUtil.a(TAG, "mStartRecordDistance e", Double.valueOf(this.mStartRecordMileDistance));
            }
        } else {
            this.mStartRecordDistance = Math.floor((((double) i3) * 1.0d) / ((double) this.mPaceMapInterval)) + 1.0d;
            LogUtil.a(TAG, "mStartRecordDistance e", Double.valueOf(this.mStartRecordMileDistance));
        }
        long j = (long) (this.mPaceMapInterval * fFloatValue);
        double dFloor2 = Math.floor(fFloatValue);
        if (j > 20 && j % ((long) this.mPaceMapInterval) < 20) {
            this.mStartRecordMileDistance = dFloor2;
            LogUtil.a(TAG, "mStartRecordMileDistance", Double.valueOf(dFloor2));
        } else {
            double d = dFloor2 + 1.0d;
            this.mStartRecordMileDistance = d;
            LogUtil.a(TAG, "mStartRecordMileDistance e", Double.valueOf(d));
        }
    }

    private void calculatePaceMapInterval() {
        if (BaseSportManager.getInstance().getSportType() == 274) {
            this.mPaceMapInterval = 500;
            this.mBritishPaceInterval = 56.8f;
        } else {
            this.mPaceMapInterval = 1000;
            this.mBritishPaceInterval = 1000.0f;
        }
    }

    private void updatePaceMapOfMile() {
        float fD = 0.0f;
        if (this.mBriPaceList.size() > 0) {
            Iterator<njj> it = this.mBriPaceList.iterator();
            while (it.hasNext()) {
                fD += it.next().d();
            }
        }
        int i = this.mMileCount * 10000000;
        float f = (this.mCurrentTime - this.mStartTimeWhenStartComputePaceForMile) - fD;
        this.mBritishPaceMap.put(Integer.valueOf(i), Float.valueOf(f));
        this.mBriPaceList.add(new njj(this.mMileCount * 1000, 0, f));
        ReleaseLogUtil.d(R_TAG, "british updatePaceMapOfMile mapKey", Integer.valueOf(i), "mapValue", Float.valueOf(f));
        this.mMileCount++;
    }

    private void recordPartTimeMapData(double d, double d2, Map<Double, Double> map) {
        if (map == null) {
            return;
        }
        double dFloor = Math.floor(d);
        if (dFloor < d2) {
            return;
        }
        LogUtil.d(TAG, "handlePartTimeMap,can record");
        Object data = BaseSportManager.getInstance().getData("TIME_ONE_SECOND_DURATION");
        double dLongValue = data instanceof Long ? (((Long) data).longValue() * 1.0d) / 1000.0d : 0.0d;
        if (map.get(Double.valueOf(dFloor)) == null) {
            map.put(Double.valueOf(dFloor), Double.valueOf(dLongValue));
            LogUtil.a(TAG, "update part result", Double.valueOf(dFloor), "durationTimeUsed", Double.valueOf(dLongValue));
        } else {
            LogUtil.d(TAG, "handlePartTimeMap,do not need record!");
        }
    }

    private void handlePartTimeMap() {
        double dIntValue = (((double) ((Integer) BaseSportManager.getInstance().getData("DISTANCE_DATA")).intValue()) * 1.0d) / ((double) this.mPaceMapInterval);
        LogUtil.a(TAG, "update part time map", Double.valueOf(dIntValue));
        recordPartTimeMapData(dIntValue, this.mStartRecordDistance, this.mPartTimeMap);
        Object data = BaseSportManager.getInstance().getData("DISTANCE_MILE_DATA");
        double dFloatValue = data instanceof Float ? ((Float) data).floatValue() : 0.0d;
        if (BaseSportManager.getInstance().getSportType() == 274) {
            dFloatValue = dIntValue / ((double) (this.mBritishPaceInterval * 1000.0f));
        }
        recordPartTimeMapData(dFloatValue, this.mStartRecordMileDistance, this.mBritishPartTimeMap);
    }

    private void handlePaceMap() {
        int i = this.mDistance / this.mPaceMapInterval;
        int i2 = this.mKiloMeterCount - 1;
        if (i == i2 && this.mStartTimeWhenStartComputePace == -1) {
            this.mStartTimeWhenStartComputePace = this.mCurrentTime;
            LogUtil.a(TAG, "mKiloMeterCount- 1 ", Integer.valueOf(i2));
            LogUtil.a(TAG, "mStartTimeWhenStartComputePace", Long.valueOf(this.mStartTimeWhenStartComputePace));
        }
        Object data = BaseSportManager.getInstance().getData("DISTANCE_MILE_DATA");
        if (data instanceof Float) {
            Float f = (Float) data;
            float fFloatValue = f.floatValue();
            int i3 = (int) fFloatValue;
            int i4 = this.mMileCount - 1;
            if (i3 == i4 && this.mStartTimeWhenStartComputePaceForMile == -1) {
                this.mStartTimeWhenStartComputePaceForMile = this.mCurrentTime;
                LogUtil.a(TAG, "mMileCount - IndoorEquipmentConstants.NUMBER_ONE_FOR_PUBLIC_USE", Integer.valueOf(i4));
                LogUtil.a(TAG, "mStartTimeWhenStartComputePaceForMile", Long.valueOf(this.mStartTimeWhenStartComputePaceForMile));
            }
            if (this.mDistance / this.mPaceMapInterval >= this.mKiloMeterCount) {
                float fD = 0.0f;
                if (this.mPaceList.size() > 0) {
                    Iterator<njj> it = this.mPaceList.iterator();
                    while (it.hasNext()) {
                        fD += it.next().d();
                    }
                }
                int i5 = this.mKiloMeterCount * 10000000;
                long j = this.mCurrentTime;
                float fD2 = (j - this.mStartTimeWhenStartComputePace) - fD;
                ReleaseLogUtil.d(R_TAG, "mapKey ", Integer.valueOf(i5), "mapValue", Float.valueOf(fD2), "durationTimeUsed", Long.valueOf(j), "secondOfLastKm", Float.valueOf(fD));
                this.mPaceMap.put(Integer.valueOf(i5), Float.valueOf(fD2));
                this.mPaceList.add(new njj(this.mKiloMeterCount * 1000, 0, fD2));
                this.mKiloMeterCount++;
                if (BaseSportManager.getInstance().getSportType() == 274) {
                    List<njj> list = this.mPaceList;
                    fD2 += list.get(list.size() - 1).d();
                }
                BaseSportManager.getInstance().stagingAndNotification("LAST_KILOMETER_PACE_DATA", Long.valueOf(Float.valueOf(fD2).longValue()));
            }
            if (BaseSportManager.getInstance().getSportType() == 274) {
                fFloatValue = (fFloatValue / this.mBritishPaceInterval) * 1000.0f;
                LogUtil.a(TAG, "paceInterval", Float.valueOf(fFloatValue), "mTotalDistanceMileValid", f);
            }
            if (fFloatValue >= this.mMileCount) {
                updatePaceMapOfMile();
                return;
            }
            return;
        }
        LogUtil.e(TAG, "return");
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    /* JADX INFO: renamed from: onStopSport */
    public void m825x32b3e3a1() {
        saveLastPaceMap();
        BaseSportManager.getInstance().cancelSubscribeNotify(this.mSportCallbackOption);
    }

    private void saveLastPaceMap() {
        Object data = BaseSportManager.getInstance().getData("TIME_ONE_SECOND_DURATION");
        if (data instanceof Long) {
            this.mCurrentTime = ((Long) data).longValue() / 1000;
        }
        Object data2 = BaseSportManager.getInstance().getData("DISTANCE_DATA");
        if (data2 instanceof Integer) {
            this.mDistance = ((Integer) data2).intValue();
        }
        LogUtil.j(TAG, "saveLastPaceMap mCurrentTime = ", Long.valueOf(this.mCurrentTime), " mDistance = ", Integer.valueOf(this.mDistance));
        handlePartTimeMap();
        int i = this.mDistance;
        int i2 = i % 10;
        if (i2 >= 5) {
            LogUtil.a(TAG, "handlePaceMap remainder >= CARRY_THRESHOLD mDistance = ", Integer.valueOf(i));
            this.mDistance = (this.mDistance + 10) - i2;
        }
        handlePaceMap();
        onSaveData();
    }

    private void calculatePace(MotionPathSimplify motionPathSimplify) {
        if (this.mDistance - this.mStartDistance == 0) {
            LogUtil.j(TAG, "avg pace is 0 (no distance)");
            motionPathSimplify.saveAvgPace(0.0f);
        } else {
            float f = (this.mCurrentTime * (BaseSportManager.getInstance().getSportType() == 274 ? 500.0f : 1000.0f)) / this.mDistance;
            LogUtil.a(TAG, "avg pace is ", Float.valueOf(f));
            motionPathSimplify.saveAvgPace(f);
        }
    }

    @Override // com.huawei.health.sportservice.dataproducer.BaseProducer
    void onSaveData() {
        if (BaseSportManager.getInstance().getSportMode().equals("291")) {
            return;
        }
        Object data = BaseSportManager.getInstance().getData(JsUtil.DataFunc.MOTION_PATH_DATA);
        Object data2 = BaseSportManager.getInstance().getData("MOTION_PATH_SIMPLIFY_DATA");
        int sportType = BaseSportManager.getInstance().getSportType();
        if (data instanceof MotionPath) {
            MotionPath motionPath = (MotionPath) data;
            motionPath.savePaceMap(this.mPaceMap);
            motionPath.saveBritishPaceMap(this.mBritishPaceMap);
            motionPath.savePaceV2(this.mPaceList);
            motionPath.saveBriPacesV2(this.mBriPaceList);
            BaseSportManager.getInstance().stagingData(JsUtil.DataFunc.MOTION_PATH_DATA, motionPath);
        }
        if (data2 instanceof MotionPathSimplify) {
            MotionPathSimplify motionPathSimplify = (MotionPathSimplify) data2;
            motionPathSimplify.savePaceMap(this.mPaceMap);
            motionPathSimplify.savePartTimeMap(this.mPartTimeMap);
            motionPathSimplify.saveBritishPartTimeMap(this.mBritishPartTimeMap);
            motionPathSimplify.saveBritishPaceMap(this.mBritishPaceMap);
            motionPathSimplify.savePaceV2(this.mPaceList);
            motionPathSimplify.saveBriPaceV2(this.mBriPaceList);
            if (isSupportPaceInterval(sportType) && !TextUtils.isEmpty(this.mPaceZoneConfig)) {
                HashMap map = new HashMap(1);
                map.put("runPaceZoneConfig", this.mPaceZoneConfig);
                motionPathSimplify.saveExtendDataMap(map);
            }
            calculatePace(motionPathSimplify);
            List<njj> listD = njv.d(this.mPaceList);
            if (njy.b(listD)) {
                motionPathSimplify.saveBestPace(njv.b(listD)[0].floatValue());
            }
            BaseSportManager.getInstance().stagingData("MOTION_PATH_SIMPLIFY_DATA", motionPathSimplify);
        }
    }

    @Override // com.huawei.health.sportservice.dataproducer.BaseProducer
    void recoveryData() {
        this.mIsHasDetectStart = true;
        Object data = BaseSportManager.getInstance().getData("MOTION_PATH_SIMPLIFY_DATA");
        if (!(data instanceof MotionPathSimplify)) {
            LogUtil.e(TAG, "recovery failed. data not simplify type");
            return;
        }
        MotionPathSimplify motionPathSimplify = (MotionPathSimplify) data;
        if (motionPathSimplify.requestPaceMap() != null) {
            this.mPaceMap.putAll(motionPathSimplify.requestPaceMap());
        }
        if (motionPathSimplify.requestPartTimeMap() != null) {
            this.mPartTimeMap.putAll(motionPathSimplify.requestPartTimeMap());
        }
        if (motionPathSimplify.requestBritishPaceMap() != null) {
            this.mBritishPaceMap.putAll(motionPathSimplify.requestBritishPaceMap());
        }
        if (motionPathSimplify.requestBritishPartTimeMap() != null) {
            this.mBritishPartTimeMap.putAll(motionPathSimplify.requestBritishPartTimeMap());
        }
        if (motionPathSimplify.requestPaceV2() != null) {
            this.mPaceList.addAll(motionPathSimplify.requestPaceV2());
        }
        if (motionPathSimplify.requestBriPaceV2() != null) {
            this.mBriPaceList.addAll(motionPathSimplify.requestBriPaceV2());
        }
        this.mKiloMeterCount = this.mPaceList.size() + 1;
        int size = this.mBriPaceList.size() + 1;
        this.mMileCount = size;
        this.mStartTimeWhenStartComputePace = 0L;
        this.mStartTimeWhenStartComputePaceForMile = 0L;
        ReleaseLogUtil.d(R_TAG, "recovery pace map. kilo count ", Integer.valueOf(this.mKiloMeterCount), ", mile count ", Integer.valueOf(size));
    }

    @Override // com.huawei.health.sport.ITargetUpdateListener
    public void onStateUpdate(int i, String str) {
        if (i == 200) {
            saveLastPaceMap();
            Object data = BaseSportManager.getInstance().getData("MOTION_PATH_SIMPLIFY_DATA");
            if (data instanceof MotionPathSimplify) {
                MotionPathSimplify motionPathSimplify = (MotionPathSimplify) data;
                motionPathSimplify.correctTotalTime(TAG);
                BaseSportManager.getInstance().stagingData("MOTION_PATH_SIMPLIFY_DATA", motionPathSimplify);
            }
        }
    }
}
