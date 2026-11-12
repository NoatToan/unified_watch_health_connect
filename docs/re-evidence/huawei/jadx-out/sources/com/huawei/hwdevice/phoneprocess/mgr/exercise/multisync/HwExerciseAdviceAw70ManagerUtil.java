package com.huawei.hwdevice.phoneprocess.mgr.exercise.multisync;

import android.content.Context;
import android.util.SparseArray;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hms.framework.common.ExceptionCode;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.MotionPath;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.MotionPathSimplify;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.RunPlanRecordInfo;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.StepRateData;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.TrackSpeedData;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.WorkoutDisplayInfo;
import com.huawei.hwfoundationmodel.trackmodel.HeartRateData;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.awr;
import defpackage.awy;
import defpackage.ecu;
import defpackage.eel;
import defpackage.eeq;
import defpackage.ees;
import defpackage.eew;
import defpackage.gzv;
import defpackage.lmb;
import defpackage.njj;
import defpackage.njv;
import health.compact.a.CommonUtil;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class HwExerciseAdviceAw70ManagerUtil {
    private static final String DATA_HEADER = "dataHeader";
    private static final float DEFAULT_AVG_PACE = 0.0f;
    private static final int DEFAULT_DATA_VALUE = 0;
    private static final int DEFAULT_FALLBACK = -1;
    private static final String DISTANCE = "distance";
    private static final int DISTANCE_PARAM = 100000;
    private static final int DISTANCE_RATIO = 100;
    private static final int HALF_LENGTH = 2;
    private static final String IS_LAST_LESS_DISTANCE = "isLastLessDistance";
    private static final long MILLI_SECOND_UNIT = 1000;
    private static final String PACE = "pace";
    private static final int RADIX_DEFAULT_16 = 16;
    private static final String RUN_PLAN_RECORD_INFO_DISTANCE = "run_plan_record_info_distance";
    private static final String RUN_PLAN_RECORD_INFO_EXERCISE_DURATION = "run_plan_record_info_exercise_duration";
    private static final String RUN_PLAN_RECORD_INFO_STEP = "run_plan_record_info_step";
    private static final int SUPPORT_EXTRA_DATA_BIT_MAP = 8;
    private static final String SWIM_AVG_SWOLF = "swim_avg_swolf";
    private static final int SWIM_AVG_SWOLF_DEFAULT = -1;
    private static final int SWIM_POOL_LENGTH_DEFAULT = -1;
    private static final String SWIM_PULL_LENGTH = "swim_pool_length";
    private static final String SWIM_PULL_RATE = "swim_pull_rate";
    private static final int SWIM_PULL_RATE_DEFAULT = -1;
    private static final String SWIM_PULL_TIMES = "swim_pull_times";
    private static final int SWIM_PULL_TIMES_DEFAULT = -1;
    private static final String SWIM_TRIP_TIMES = "swim_trip_times";
    private static final int SWIM_TRIP_TIMES_DEFAULT = -1;
    private static final String SWIM_TYPE = "swim_type";
    private static final int SWIM_TYPE_DEFAULT = -1;
    private static final String TAG = "HwExerciseAdviceAw70ManagerUtil";
    private static final String TAG_RELEASE = "R_HwExerciseAdviceAw70ManagerUtil";
    private static final int TEN_DEFAULT_10 = 10;
    private static final int THOUSAND = 1000;
    private static final float THOUSAND_FLOAT = 1000.0f;
    private static final int TIME_CONVERT = 60;
    private static final int TOTAL_DISTANCE_PARAM = 10000;
    private static final float TOTAL_DISTANCE_PARAM_FLOAT = 10000.0f;
    private static final String UNIT_TYPE = "unit_type";
    private static final String WORKOUT_DATA_INFO_LISTS = "workoutDataInfoLists";
    private static final String WORKOUT_EXERCISE_DURATION = "workout_exercise_duration";
    private static final String WORKOUT_RECORD_DISTANCE = "workout_record_distance";
    private static final String WORKOUT_RECORD_ID = "workout_record_id";
    private static final String WORKOUT_RECORD_SPEED = "workout_record_speed";
    private static final String WORKOUT_RECORD_STEP = "workout_record_step";
    private Context mContext;

    public static boolean isSupportCapability(int i, int i2) {
        return (i & i2) == i2;
    }

    public boolean checkSupportWorkoutType(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9 || i == 10 || i == 6 || i == 8 || i == 5 || i == 7 || i == 255 || i == 132;
    }

    public HwExerciseAdviceAw70ManagerUtil(Context context) {
        this.mContext = context;
    }

    public String getCurrentDeviceId() {
        DeviceInfo currentDeviceInfo = getCurrentDeviceInfo();
        if (currentDeviceInfo != null) {
            return currentDeviceInfo.getSecurityDeviceId();
        }
        return "";
    }

    private DeviceInfo getCurrentDeviceInfo() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ACTIVE_DEVICES, null, TAG);
        if (!deviceList.isEmpty()) {
            LogUtil.a(TAG, "getCurrentDeviceInfo() deviceInfoList.size() : ", Integer.valueOf(deviceList.size()));
            for (DeviceInfo deviceInfo : deviceList) {
                if (eel.d(deviceInfo.getProductType())) {
                    return deviceInfo;
                }
            }
            LogUtil.a(TAG, "getCurrentDeviceInfo() deviceInfo's ActiveState not DeviceActiveState.DEVICE_ACTIVE_ENABLE");
            return null;
        }
        LogUtil.j(TAG, "getCurrentDeviceInfo() deviceInfoList is null");
        return null;
    }

    public Map<Integer, Float> changePaceMapStruct(JSONArray jSONArray, int i) {
        if (jSONArray == null) {
            LogUtil.j(TAG, "changePaceMapStruct paceArray is null");
            return null;
        }
        TreeMap treeMap = new TreeMap();
        try {
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                if (jSONArray.get(i2) instanceof JSONObject) {
                    JSONArray jSONArray2 = ((JSONObject) jSONArray.get(i2)).getJSONArray(HwExerciseConstants.JSON_NAME_PACE_MAP_LIST);
                    if (i == 0) {
                        dealMetricPaceMap(jSONArray2, treeMap);
                    } else {
                        dealMetricPaceMapElse(jSONArray2, treeMap);
                    }
                }
            }
            LogUtil.a(TAG, "changePaceMapStruct paceMap size:", Integer.valueOf(treeMap.size()));
            return treeMap;
        } catch (JSONException unused) {
            LogUtil.e(TAG, "changePaceMapStruct error");
            return null;
        }
    }

    private void dealMetricPaceMap(JSONArray jSONArray, Map<Integer, Float> map) {
        try {
            if (jSONArray == null || map == null) {
                LogUtil.j(TAG, "dealMetricPaceMap param is null");
                return;
            }
            int length = jSONArray.length();
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                if (jSONObject.optInt("unit_type", -1) == 0) {
                    boolean z = jSONObject.getBoolean("isLastLessDistance");
                    int i3 = jSONObject.getInt("pace");
                    int i4 = jSONObject.getInt(HwExerciseConstants.JSON_NAME_POINT_INDEX);
                    if (!z) {
                        i = jSONObject.getInt("distance");
                        map.put(Integer.valueOf((ExceptionCode.CRASH_EXCEPTION * i) + i4), Float.valueOf(i3));
                    } else {
                        int iRound = (int) Math.round(((double) jSONObject.getInt(HwExerciseConstants.JSON_NAME_LAST_DISTANCE)) / 100.0d);
                        if (iRound != 0) {
                            map.put(Integer.valueOf((((i * 100) + iRound) * 100000) + i4), Float.valueOf(i3));
                        }
                    }
                }
            }
        } catch (JSONException unused) {
            LogUtil.e(TAG, "dealMetricPaceMap error");
        }
    }

    private void dealMetricPaceMapElse(JSONArray jSONArray, Map<Integer, Float> map) {
        try {
            int length = jSONArray.length();
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                if (jSONObject.optInt("unit_type", -1) == 1) {
                    boolean z = jSONObject.getBoolean("isLastLessDistance");
                    int i3 = jSONObject.getInt("pace");
                    int i4 = jSONObject.getInt(HwExerciseConstants.JSON_NAME_POINT_INDEX);
                    LogUtil.a(TAG, "pace = ", Integer.valueOf(i3), "index =", Integer.valueOf(i4));
                    if (!z) {
                        i = jSONObject.getInt("distance");
                        map.put(Integer.valueOf((ExceptionCode.CRASH_EXCEPTION * i) + i4), Float.valueOf(i3));
                    } else {
                        int iRound = (int) Math.round(UnitUtil.e(((double) jSONObject.getInt(HwExerciseConstants.JSON_NAME_LAST_DISTANCE)) / 100.0d, 3));
                        if (iRound != 0) {
                            map.put(Integer.valueOf((((i * 100) + iRound) * 100000) + i4), Float.valueOf(i3));
                        }
                    }
                }
            }
        } catch (JSONException unused) {
            LogUtil.e(TAG, "dealMetricPaceMapElse error");
        }
    }

    public void dealRunPostData(JSONObject jSONObject, ArrayList<gzv> arrayList, int i, int i2) {
        try {
            if (jSONObject == null || arrayList == null) {
                LogUtil.a(TAG, "dealRunPostData param is null");
                return;
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("mRunPostureDataInfo");
            int i3 = jSONObjectOptJSONObject.getInt("mGroundContactTime");
            int i4 = jSONObjectOptJSONObject.getInt("mGroundImpactAcceleration");
            int i5 = jSONObjectOptJSONObject.getInt("mSwingAngle");
            int i6 = jSONObjectOptJSONObject.getInt("mEversionExcursion");
            int i7 = jSONObjectOptJSONObject.getInt("mForeFootStrikePattern");
            int i8 = jSONObjectOptJSONObject.getInt("mWholeFootStrikePattern");
            int i9 = jSONObjectOptJSONObject.getInt("mHindPawStrikePattern");
            int i10 = jSONObjectOptJSONObject.getInt("mHangTime");
            int i11 = jSONObjectOptJSONObject.getInt("mImpactHangRate");
            gzv gzvVar = new gzv();
            gzvVar.a(((long) i) * ((long) i2));
            gzvVar.c(i6);
            gzvVar.d(i3);
            gzvVar.b(i4);
            gzvVar.g(i5);
            gzvVar.e(i7);
            gzvVar.j(i8);
            gzvVar.a(i9);
            gzvVar.i(i10);
            gzvVar.h(i11);
            arrayList.add(gzvVar);
        } catch (JSONException unused) {
            LogUtil.e(TAG, "dealRunPostData JSONException");
        }
    }

    public void parseSpeedData(int i, JSONArray jSONArray, ArrayList<TrackSpeedData> arrayList) {
        try {
            if (jSONArray == null || arrayList == null) {
                LogUtil.j(TAG, "parseSpeedData param is null");
                return;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i3);
                int i4 = jSONObject.getJSONObject("dataHeader").getInt(HwExerciseConstants.JSON_NAME_TIME_INTERVAL);
                int length = jSONObject.getJSONObject("dataHeader").getJSONArray("workoutDataInfoLists").length();
                for (int i5 = 0; i5 < length; i5++) {
                    long j = i2 * i4;
                    int i6 = jSONObject.getJSONObject("dataHeader").getJSONArray("workoutDataInfoLists").getJSONObject(i5).getInt("data2");
                    LogUtil.d(TAG, "packTrackData pace value :", Integer.valueOf(i6));
                    i2++;
                    arrayList.add(new TrackSpeedData(j, i6));
                }
            }
        } catch (JSONException unused) {
            LogUtil.e(TAG, "packTrackData speedData JSONException");
        }
    }

    public void parseJumpData(List<JSONArray> list, ArrayList<lmb> arrayList) {
        if (list != null) {
            try {
                int size = list.size();
                LogUtil.d(TAG, "jumpData size : ", Integer.valueOf(size));
                for (int i = 0; i < size; i++) {
                    int length = list.get(i).length();
                    LogUtil.a(TAG, "jumpData.get(i).length() : ", Integer.valueOf(length));
                    for (int i2 = 0; i2 < length; i2++) {
                        JSONObject jSONObject = list.get(i).getJSONObject(i2);
                        long j = jSONObject.getInt("mJumpTime");
                        int i3 = jSONObject.getInt("mJumpHeight");
                        int i4 = jSONObject.getInt("mJumpDuration");
                        LogUtil.d(TAG, "jumpTime:", Long.valueOf(j), ", jumpHeight:", Integer.valueOf(i3), ", jumpDuration:", Integer.valueOf(i4));
                        arrayList.add(new lmb(j, i3, i4));
                    }
                }
            } catch (JSONException unused) {
                LogUtil.e(TAG, "packTrackData jumpData JSONException");
            }
        }
    }

    public void setHeartRateList(long j, int i, ArrayList<HeartRateData> arrayList) {
        HeartRateData heartRateData = new HeartRateData();
        heartRateData.saveTime(j);
        heartRateData.saveHeartRate(i);
        arrayList.add(heartRateData);
    }

    public void setStepList(int i, long j, ArrayList<StepRateData> arrayList) {
        StepRateData stepRateData = new StepRateData();
        stepRateData.setTime(j);
        stepRateData.setStepRate(i);
        arrayList.add(stepRateData);
    }

    public void setMotionList(MotionPath motionPath, ArrayList<HeartRateData> arrayList, ArrayList<StepRateData> arrayList2, ArrayList<gzv> arrayList3, ArrayList<lmb> arrayList4) {
        if (motionPath == null) {
            LogUtil.j(TAG, "setMotionList param is null");
            return;
        }
        motionPath.setHeartRateList(arrayList);
        motionPath.setStepRateList(arrayList2);
        motionPath.saveRunningPostureList(arrayList3);
        motionPath.saveJumpDataList(arrayList4);
    }

    public void checkWorkoutDisplayInfo(int i, Map<Long, double[]> map, WorkoutDisplayInfo workoutDisplayInfo) {
        dealDisplayInfo(map, workoutDisplayInfo);
        if (i != 1) {
            if (i == 2) {
                workoutDisplayInfo.setWorkoutType(257);
                return;
            }
            if (i == 3) {
                workoutDisplayInfo.setWorkoutType(259);
                return;
            }
            if (i == 132) {
                workoutDisplayInfo.setWorkoutType(OldToNewMotionPath.SPORT_TYPE_BASKETBALL);
                workoutDisplayInfo.setChiefSportDataType(5);
                workoutDisplayInfo.setFreeMotion(true);
                return;
            }
            if (i != 255) {
                switch (i) {
                    case 5:
                        workoutDisplayInfo.setWorkoutType(264);
                        workoutDisplayInfo.setFreeMotion(true);
                        break;
                    case 6:
                        workoutDisplayInfo.setWorkoutType(262);
                        workoutDisplayInfo.setChiefSportDataType(0);
                        workoutDisplayInfo.setFreeMotion(true);
                        break;
                    case 7:
                        workoutDisplayInfo.setWorkoutType(OldToNewMotionPath.SPORT_TYPE_INDOOR_BIKE);
                        workoutDisplayInfo.setChiefSportDataType(1);
                        workoutDisplayInfo.setFreeMotion(true);
                        break;
                    case 8:
                        workoutDisplayInfo.setWorkoutType(OldToNewMotionPath.SPORT_TYPE_OPEN_AREA_SWIM);
                        workoutDisplayInfo.setChiefSportDataType(0);
                        workoutDisplayInfo.setFreeMotion(true);
                        break;
                    case 9:
                    case 10:
                        break;
                    default:
                        workoutDisplayInfo.setWorkoutType(258);
                        break;
                }
                return;
            }
            workoutDisplayInfo.setWorkoutType(OldToNewMotionPath.SPORT_TYPE_OTHER_SPORT);
            workoutDisplayInfo.setChiefSportDataType(1);
            workoutDisplayInfo.setFreeMotion(true);
            return;
        }
        workoutDisplayInfo.setWorkoutType(258);
    }

    private void dealDisplayInfo(Map<Long, double[]> map, WorkoutDisplayInfo workoutDisplayInfo) {
        if (map != null && map.size() > 2) {
            workoutDisplayInfo.setHasTrackPoint(true);
        } else {
            workoutDisplayInfo.setHasTrackPoint(false);
        }
    }

    public void convertHealthTrackDataToHiData(MotionPathSimplify motionPathSimplify, MotionPath motionPath, HiDataInsertOption hiDataInsertOption) {
        motionPathSimplify.setBestPace(calculateBestPace(motionPathSimplify.requestPaceList()));
        LogUtil.a(TAG, "convertHealthTrackDataToHiData, simplifyData ", motionPathSimplify.toString(), "convertHealthTrackDataToHiData, motionData ", motionPath.toString());
        HiTrackMetaData hiTrackMetaData = new HiTrackMetaData();
        String str = motionPathSimplify.getMapType() == 0 ? "AMAP" : null;
        if (motionPathSimplify.getMapType() == 1) {
            str = "GOOGLE";
        }
        if (str != null) {
            hiTrackMetaData.setVendor(str);
        }
        saveMetaData(hiTrackMetaData, motionPathSimplify);
        awr awrVar = new awr();
        awrVar.e(motionPathSimplify.getSportType());
        awrVar.d(motionPathSimplify.getPaceMap());
        awrVar.a(motionPathSimplify.requestPaceV2());
        awrVar.c(motionPathSimplify.getAvgPace());
        awrVar.c(motionPathSimplify.getTotalDistance());
        awrVar.b(motionPathSimplify.getTotalSteps());
        awrVar.a(true);
        awrVar.b(motionPathSimplify.getPartTimeMap());
        awrVar.a(motionPathSimplify.getTrackType());
        awrVar.b(TimeUnit.MILLISECONDS.toSeconds(motionPathSimplify.getTotalTime()));
        int iC = awy.c(awrVar);
        boolean zA = awy.a(awrVar);
        LogUtil.a(TAG, "mAbnormalTrack:", Integer.valueOf(iC), "mIsStepAbnormal", Boolean.valueOf(zA), ", abnormalData", awrVar.toString());
        motionPathSimplify.saveAbnormalTrack(iC);
        motionPathSimplify.addExtendDataMap("STEP_STATICS_EXCEPTION", zA ? "1" : "0");
        hiTrackMetaData.setAbnormalTrack(motionPathSimplify.requestAbnormalTrack());
        HiHealthData hiHealthData = new HiHealthData();
        hiHealthData.setStartTime(motionPathSimplify.getStartTime());
        hiHealthData.setEndTime(motionPathSimplify.getEndTime());
        hiHealthData.setType(30001);
        hiHealthData.setSequenceData(motionPath.toString());
        try {
            hiHealthData.setMetaData(new Gson().toJson(hiTrackMetaData, HiTrackMetaData.class));
        } catch (JsonIOException unused) {
            LogUtil.e(TAG, "convertHealthTrackDataToHiData JsonIOException");
        }
        DeviceInfo currentDeviceInfo = getCurrentDeviceInfo();
        if (currentDeviceInfo != null) {
            hiHealthData.setDeviceUuid(currentDeviceInfo.getSecurityUuid() + "#ANDROID21");
            LogUtil.j(TAG, "convertHealthTrackDataToHiData, deviceInfo is not null");
        }
        hiDataInsertOption.addData(hiHealthData);
    }

    private static void saveMetaData(HiTrackMetaData hiTrackMetaData, MotionPathSimplify motionPathSimplify) {
        hiTrackMetaData.setAvgStepRate(motionPathSimplify.getAvgStepRate());
        hiTrackMetaData.setAvgHeartRate(motionPathSimplify.getAvgHeartRate());
        hiTrackMetaData.setAvgPace(motionPathSimplify.getAvgPace());
        hiTrackMetaData.setBestPace(motionPathSimplify.getBestPace());
        hiTrackMetaData.setBestStepRate(motionPathSimplify.getBestStepRate());
        hiTrackMetaData.setMaxHeartRate(motionPathSimplify.getMaxHeartRate());
        hiTrackMetaData.setSportType(motionPathSimplify.getSportType());
        hiTrackMetaData.setTotalCalories(motionPathSimplify.getTotalCalories());
        hiTrackMetaData.setTotalDistance(motionPathSimplify.getTotalDistance());
        hiTrackMetaData.setTotalSteps(motionPathSimplify.getTotalSteps());
        hiTrackMetaData.setTotalTime(motionPathSimplify.getTotalTime());
        hiTrackMetaData.setWearSportData(motionPathSimplify.getSportData());
        hiTrackMetaData.setCreepingWave(motionPathSimplify.getCreepingWave());
        hiTrackMetaData.setMinHeartRate(motionPathSimplify.getMinHeartRate());
        hiTrackMetaData.setTrackType(motionPathSimplify.getTrackType());
        hiTrackMetaData.setWearSportData(motionPathSimplify.getSportData());
        hiTrackMetaData.setIsFreeMotion(motionPathSimplify.getIsFreeMotion());
        hiTrackMetaData.setSportDataSource(motionPathSimplify.getSportDataSource());
        hiTrackMetaData.setChiefSportDataType(motionPathSimplify.getChiefSportDataType());
        hiTrackMetaData.setHasTrackPoint(motionPathSimplify.getHasTrackPoint());
        hiTrackMetaData.setPaceMap(motionPathSimplify.getPaceMap());
        hiTrackMetaData.setPartTimeMap(motionPathSimplify.getPartTimeMap());
        hiTrackMetaData.setBritishPaceMap(motionPathSimplify.getBritishPaceMap());
        hiTrackMetaData.setBritishPartTimeMap(motionPathSimplify.getBritishPartTimeMap());
        hiTrackMetaData.setAvgGroundContactTime(motionPathSimplify.requestAvgGroundContactTime());
        hiTrackMetaData.setAvgGroundImpactAcceleration(motionPathSimplify.requestAvgGroundImpactAcceleration());
        hiTrackMetaData.setAvgEversionExcursion(motionPathSimplify.requestAvgEversionExcursion());
        hiTrackMetaData.setAvgSwingAngle(motionPathSimplify.requestAvgSwingAngle());
        hiTrackMetaData.setAvgForeFootStrikePattern(motionPathSimplify.requestAvgForeFootStrikePattern());
        hiTrackMetaData.setAvgWholeFootStrikePattern(motionPathSimplify.requestAvgWholeFootStrikePattern());
        hiTrackMetaData.setAvgHindFootStrikePattern(motionPathSimplify.requestAvgHindFootStrikePattern());
        hiTrackMetaData.saveAverageHangTime(motionPathSimplify.requestAverageHangTime());
        hiTrackMetaData.saveGroundHangTimeRate(motionPathSimplify.requestGroundHangTimeRate());
    }

    private static float calculateBestPace(List<njj> list) {
        if (list == null || list.isEmpty()) {
            ReleaseLogUtil.e(TAG_RELEASE, "calculateBestPace map is empty.");
            return 0.0f;
        }
        List<njj> listD = njv.d(list);
        if (listD == null || listD.isEmpty()) {
            LogUtil.j(TAG, "calculateBestPace,no valadePacelist ");
            return 0.0f;
        }
        LogUtil.a(TAG, "calculateBestPace valid:", listD.toString());
        float fD = Float.MAX_VALUE;
        for (njj njjVar : listD) {
            if (fD > njjVar.d()) {
                fD = njjVar.d();
            }
        }
        LogUtil.a(TAG, "calculateBestPace,setBestPace :", Float.valueOf(fD));
        return fD;
    }

    public Map<Double, Double> changePartTimePaceMapStruct(JSONArray jSONArray, int i) {
        if (jSONArray == null) {
            LogUtil.j(TAG, "changePartTimePaceMapStruct paceArray is null");
            return null;
        }
        TreeMap treeMap = new TreeMap();
        try {
            int length = jSONArray.length();
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    JSONArray paceJson = getPaceJson((JSONObject) jSONArray.get(i3), i);
                    int length2 = paceJson.length();
                    for (int i4 = 0; i4 < length2; i4++) {
                        JSONObject jSONObject = paceJson.getJSONObject(i4);
                        if (!jSONObject.getBoolean("isLastLessDistance")) {
                            int i5 = jSONObject.getInt("distance");
                            i2 += jSONObject.getInt("pace");
                            treeMap.put(Double.valueOf(((double) (i5 * 10000)) / 10000.0d), Double.valueOf(i2));
                        }
                    }
                } catch (JSONException unused) {
                    LogUtil.e(TAG, "changePartTimePaceMapStruct");
                    return null;
                }
            }
            LogUtil.d(TAG, "changePartTimePaceMapStruct paceMap size:", Integer.valueOf(treeMap.size()));
            return treeMap;
        } catch (JSONException unused2) {
        }
    }

    private JSONArray getPaceJson(JSONObject jSONObject, int i) {
        if (jSONObject == null || !jSONObject.has(HwExerciseConstants.JSON_NAME_PACE_MAP_LIST)) {
            return new JSONArray();
        }
        JSONArray jSONArray = new JSONArray();
        try {
            JSONArray jSONArray2 = jSONObject.getJSONArray(HwExerciseConstants.JSON_NAME_PACE_MAP_LIST);
            int length = jSONArray2.length();
            for (int i2 = 0; i2 < length; i2++) {
                if (jSONArray2.get(i2) instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) jSONArray2.get(i2);
                    if (i == jSONObject2.optInt("unit_type", -1)) {
                        jSONArray.put(jSONObject2);
                    } else {
                        continue;
                    }
                }
            }
            LogUtil.d(TAG, "leave getPaceJson method");
            return jSONArray;
        } catch (JSONException unused) {
            LogUtil.e(TAG, "changePartTimePaceMapStruct");
            return new JSONArray();
        }
    }

    public void saveSportData(Map<String, Integer> map, JSONObject jSONObject) {
        try {
            map.put("record_id", Integer.valueOf(jSONObject.getInt("workout_record_id")));
            map.put("status", Integer.valueOf(jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_RECORD_STATUS)));
            map.put("load_peak", Integer.valueOf(jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_LOAD_PEAK)));
            map.put("etraining_effect", Integer.valueOf(jSONObject.getInt(HwExerciseConstants.JSON_NAME_ETRAINING_EFFECT)));
            map.put("extra_poc", Integer.valueOf(jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_EPOC)));
            map.put("max_met", Integer.valueOf(jSONObject.getInt(HwExerciseConstants.JSON_NAME_MAX_MET)));
            map.put("recovery_time", Integer.valueOf(jSONObject.getInt(HwExerciseConstants.JSON_NAME_RECOVERY_TIME)));
            if (jSONObject.getInt("swim_type") != -1) {
                map.put("swim_stroke", Integer.valueOf(jSONObject.getInt("swim_type")));
            }
            if (jSONObject.getInt("swim_pull_times") != -1) {
                map.put("swim_pull_times", Integer.valueOf(jSONObject.getInt("swim_pull_times")));
            }
            if (jSONObject.getInt("swim_pull_rate") != -1) {
                map.put("swim_pull_freq", Integer.valueOf(jSONObject.getInt("swim_pull_rate")));
            }
            if (jSONObject.getInt("swim_pool_length") != -1) {
                map.put("swim_pool_length", Integer.valueOf(jSONObject.getInt("swim_pool_length")));
            }
            if (jSONObject.getInt("swim_trip_times") != -1) {
                map.put("swim_laps", Integer.valueOf(jSONObject.getInt("swim_trip_times")));
            }
            if (jSONObject.getInt("swim_avg_swolf") != -1) {
                map.put("swim_avg_swolf", Integer.valueOf(jSONObject.getInt("swim_avg_swolf")));
            }
            int iOptInt = jSONObject.optInt("mActiveDuration", -1);
            if (iOptInt != -1) {
                map.put("active_time", Integer.valueOf(iOptInt));
            }
            int iOptInt2 = jSONObject.optInt("mJumpTimes", -1);
            if (iOptInt2 != -1) {
                map.put("jump_times", Integer.valueOf(iOptInt2));
            }
            int iOptInt3 = jSONObject.optInt("mMaxJumpHeight", -1);
            if (iOptInt3 != -1) {
                map.put("max_jump_height", Integer.valueOf(iOptInt3));
            }
            int iOptInt4 = jSONObject.optInt("mMaxJumpDuration", -1);
            if (iOptInt4 != -1) {
                map.put("max_duration_of_passage", Integer.valueOf(iOptInt4));
            }
        } catch (JSONException unused) {
            LogUtil.e(TAG, "saveSportData JSONException");
        }
    }

    public void setWorkoutRecordSimplify(JSONObject jSONObject, WorkoutDisplayInfo workoutDisplayInfo, MotionPathSimplify motionPathSimplify) {
        try {
            setSportType(motionPathSimplify, workoutDisplayInfo);
            motionPathSimplify.setStartTime(jSONObject.getLong(HwExerciseConstants.JSON_NAME_START_TIME));
            motionPathSimplify.setEndTime(jSONObject.getLong(HwExerciseConstants.JSON_NAME_END_TIME));
            motionPathSimplify.setMaxHeartRate(jSONObject.getInt(HwExerciseConstants.JSON_NAME_PEAK_MAX));
            motionPathSimplify.setMinHeartRate(jSONObject.getInt(HwExerciseConstants.JSON_NAME_PEAK_MIN));
            motionPathSimplify.setTotalDistance(jSONObject.getInt("workout_record_distance"));
            motionPathSimplify.setTotalCalories(jSONObject.getInt(HwExerciseConstants.JSON_NAME_RECORD_CALORIE) * 1000);
            motionPathSimplify.setTotalTime(jSONObject.getLong("workout_exercise_duration"));
            motionPathSimplify.setCreepingWave((float) jSONObject.getDouble(HwExerciseConstants.JSON_NAME_WORKOUT_CLIMB));
            motionPathSimplify.setTotalSteps(((Integer) jSONObject.get("workout_record_step")).intValue());
            if (jSONObject.getInt("workout_record_distance") == 0 || jSONObject.getLong("workout_exercise_duration") == 0) {
                LogUtil.a(TAG, "record speed:", Integer.valueOf(jSONObject.getInt("workout_record_speed")));
                motionPathSimplify.setAvgPace(0.0f);
            } else {
                motionPathSimplify.setAvgPace(1000.0f / ((jSONObject.getInt("workout_record_distance") * 1000.0f) / jSONObject.getLong("workout_exercise_duration")));
            }
            if (jSONObject.getLong("workout_exercise_duration") != 0) {
                LogUtil.a(TAG, "record step:", Integer.valueOf(jSONObject.getInt("workout_record_step")));
                motionPathSimplify.setAvgStepRate((int) (((jSONObject.getInt("workout_record_step") * 1000) / jSONObject.getLong("workout_exercise_duration")) * 60.0f));
            }
            if (workoutDisplayInfo.getWorkoutType() == 262 || workoutDisplayInfo.getWorkoutType() == 266) {
                int i = jSONObject.getInt("workout_record_speed");
                LogUtil.a(TAG, "swim, speed:", Integer.valueOf(i));
                if (i != 0) {
                    motionPathSimplify.setAvgPace(10000.0f / i);
                } else {
                    motionPathSimplify.setAvgPace(0.0f);
                }
                int i2 = jSONObject.getInt("workout_record_distance");
                LogUtil.a(TAG, "swim, distanceSwim:", Integer.valueOf(i2));
                if (i2 == 0) {
                    motionPathSimplify.setChiefSportDataType(2);
                } else {
                    motionPathSimplify.setChiefSportDataType(0);
                }
            }
        } catch (JSONException unused) {
            LogUtil.e(TAG, "JSONException");
        }
    }

    private void setSportType(MotionPathSimplify motionPathSimplify, WorkoutDisplayInfo workoutDisplayInfo) {
        motionPathSimplify.setChiefSportDataType(workoutDisplayInfo.getChiefSportDataType());
        motionPathSimplify.setIsFreeMotion(workoutDisplayInfo.getFreeMotion());
        motionPathSimplify.setSportType(workoutDisplayInfo.getWorkoutType());
        motionPathSimplify.setHasTrackPoint(workoutDisplayInfo.isHasTrackPoint());
        motionPathSimplify.setSportDataSource(workoutDisplayInfo.getSportDataSource());
    }

    public void dealRunPlanRecordTlvList(List<ees> list, List<RunPlanRecordInfo> list2) {
        Iterator<ees> it = list.iterator();
        while (it.hasNext()) {
            List<eew> listE = it.next().e();
            RunPlanRecordInfo runPlanRecordInfo = new RunPlanRecordInfo();
            for (eew eewVar : listE) {
                switch (Integer.parseInt(eewVar.e(), 16)) {
                    case 2:
                        runPlanRecordInfo.setRunPlanRecordInfoId(Integer.parseInt(eewVar.b(), 16));
                        break;
                    case 3:
                        runPlanRecordInfo.setRunPlanRecordInfoStatus(Integer.parseInt(eewVar.b(), 16));
                        break;
                    case 4:
                        runPlanRecordInfo.setRunPlanRecordInfoStartTime(Long.parseLong(eewVar.b(), 16) * 1000);
                        break;
                    case 5:
                        runPlanRecordInfo.setRunPlanRecordInfoEndTime(Long.parseLong(eewVar.b(), 16) * 1000);
                        break;
                    case 6:
                        runPlanRecordInfo.setRunPlanRecordInfoCalorie(Integer.parseInt(eewVar.b(), 16));
                        break;
                    case 7:
                        runPlanRecordInfo.setRunPlanRecordInfoDistance(Integer.parseInt(eewVar.b(), 16));
                        break;
                    case 8:
                        runPlanRecordInfo.setRunPlanRecordInfoStep(Integer.parseInt(eewVar.b(), 16));
                        break;
                    default:
                        dealMoreRunPlanRecordTlvList(Integer.parseInt(eewVar.e(), 16), runPlanRecordInfo, eewVar);
                        break;
                }
            }
            list2.add(runPlanRecordInfo);
        }
    }

    private void dealMoreRunPlanRecordTlvList(int i, RunPlanRecordInfo runPlanRecordInfo, eew eewVar) {
        try {
            switch (i) {
                case 9:
                    runPlanRecordInfo.setRunPlanRecordInfoTotalTime(Integer.parseInt(eewVar.b(), 16));
                    break;
                case 10:
                    runPlanRecordInfo.setRunPlanRecordInfoSpeed(Integer.parseInt(eewVar.b(), 16) / 10.0f);
                    break;
                case 11:
                    runPlanRecordInfo.setRunPlanRecordInfoClimb(Integer.parseInt(eewVar.b(), 16));
                    break;
                case 12:
                    runPlanRecordInfo.setRunPlanRecordInfoHrabsMin(Integer.parseInt(eewVar.b().substring(0, 2), 16));
                    runPlanRecordInfo.setRunPlanRecordInfoHrabsMax(Integer.parseInt(eewVar.b().substring(2, 4), 16));
                    break;
                case 13:
                    runPlanRecordInfo.setRunPlanRecordInfoLoadPeak(Integer.parseInt(eewVar.b(), 16));
                    break;
                case 14:
                    runPlanRecordInfo.setRunPlanRecordEtrainingEffect(Integer.parseInt(eewVar.b(), 16));
                    break;
                case 15:
                    runPlanRecordInfo.setRunPlanRecordAchievePercent(Integer.parseInt(eewVar.b(), 16));
                    break;
                case 16:
                    runPlanRecordInfo.setRunPlanRecordInfoEpoc(Integer.parseInt(eewVar.b(), 16));
                    break;
                case 17:
                    runPlanRecordInfo.setRunPlanRecordInfoMaxMet(Integer.parseInt(eewVar.b(), 16));
                    break;
                default:
                    dealMuchMoreRunPlanRecordTlvList(Integer.parseInt(eewVar.e(), 16), runPlanRecordInfo, eewVar);
                    break;
            }
        } catch (NumberFormatException e) {
            ReleaseLogUtil.a(TAG_RELEASE, "dealMoreRunPlanRecordTlvList NumberFormatException : ", ExceptionUtils.c(e));
        }
    }

    private void dealMuchMoreRunPlanRecordTlvList(int i, RunPlanRecordInfo runPlanRecordInfo, eew eewVar) {
        switch (i) {
            case 18:
                runPlanRecordInfo.setRunPlanRecordInfoRecoveryTime(Integer.parseInt(eewVar.b(), 16));
                break;
            case 19:
                break;
            case 20:
                runPlanRecordInfo.setRunPlanRecordInfoExerciseDuration(((long) Integer.parseInt(eewVar.b(), 16)) * 1000);
                break;
            case 21:
                runPlanRecordInfo.setRunPlanRecordInfoDateInfo(Integer.parseInt(eewVar.b(), 16));
                break;
            default:
                LogUtil.j(TAG, "dealMuchMoreRunPlanRecordTlvList default branch");
                break;
        }
    }

    public void dealNotificationRunPlanRecordInfo(List<ees> list, List<RunPlanRecordInfo> list2) {
        try {
            Iterator<ees> it = list.iterator();
            while (it.hasNext()) {
                List<eew> listE = it.next().e();
                RunPlanRecordInfo runPlanRecordInfo = new RunPlanRecordInfo();
                for (eew eewVar : listE) {
                    switch (Integer.parseInt(eewVar.e(), 16)) {
                        case 2:
                            runPlanRecordInfo.setRunPlanRecordInfoWourkoutId(Integer.parseInt(eewVar.b(), 16));
                            break;
                        case 3:
                            runPlanRecordInfo.setRunPlanRecordInfoStatus(Integer.parseInt(eewVar.b(), 16));
                            break;
                        case 4:
                            runPlanRecordInfo.setRunPlanRecordInfoStartTime(Long.parseLong(eewVar.b(), 16) * 1000);
                            break;
                        case 5:
                            runPlanRecordInfo.setRunPlanRecordInfoEndTime(Long.parseLong(eewVar.b(), 16) * 1000);
                            break;
                        case 6:
                            runPlanRecordInfo.setRunPlanRecordInfoCalorie(Integer.parseInt(eewVar.b(), 16));
                            break;
                        case 7:
                            runPlanRecordInfo.setRunPlanRecordInfoDistance(Integer.parseInt(eewVar.b(), 16));
                            break;
                        default:
                            dealMoreNotificationRunPlanRecordInfo(Integer.parseInt(eewVar.e(), 16), runPlanRecordInfo, eewVar);
                            break;
                    }
                }
                list2.add(runPlanRecordInfo);
            }
        } catch (NumberFormatException unused) {
            LogUtil.e(TAG, "NOTIFICATION_RUN_PLAN_RECORD_INFO");
        }
    }

    private void dealMoreNotificationRunPlanRecordInfo(int i, RunPlanRecordInfo runPlanRecordInfo, eew eewVar) {
        switch (i) {
            case 8:
                runPlanRecordInfo.setRunPlanRecordInfoStep(Integer.parseInt(eewVar.b(), 16));
                break;
            case 9:
                runPlanRecordInfo.setRunPlanRecordInfoTotalTime(Integer.parseInt(eewVar.b(), 16));
                break;
            case 10:
                runPlanRecordInfo.setRunPlanRecordInfoSpeed(Integer.parseInt(eewVar.b(), 16) / 10.0f);
                break;
            case 11:
                runPlanRecordInfo.setRunPlanRecordInfoClimb(Integer.parseInt(eewVar.b(), 16));
                break;
            case 12:
                runPlanRecordInfo.setRunPlanRecordInfoHrabsMin(Integer.parseInt(eewVar.b().substring(0, 2), 16));
                runPlanRecordInfo.setRunPlanRecordInfoHrabsMax(Integer.parseInt(eewVar.b().substring(2, 4), 16));
                break;
            case 13:
                runPlanRecordInfo.setRunPlanRecordInfoLoadPeak(Integer.parseInt(eewVar.b(), 16));
                break;
            case 14:
                runPlanRecordInfo.setRunPlanRecordEtrainingEffect(Integer.parseInt(eewVar.b(), 16));
                break;
            case 15:
                runPlanRecordInfo.setRunPlanRecordAchievePercent(Integer.parseInt(eewVar.b(), 16));
                break;
            case 16:
                runPlanRecordInfo.setRunPlanRecordInfoEpoc(Integer.parseInt(eewVar.b(), 16));
                break;
            default:
                dealMuchMoreNotificationRunPlanRecordInfo(i, runPlanRecordInfo, eewVar);
                break;
        }
    }

    private void dealMuchMoreNotificationRunPlanRecordInfo(int i, RunPlanRecordInfo runPlanRecordInfo, eew eewVar) {
        try {
            switch (i) {
                case 17:
                    runPlanRecordInfo.setRunPlanRecordInfoMaxMet(Integer.parseInt(eewVar.b(), 16));
                    break;
                case 18:
                    runPlanRecordInfo.setRunPlanRecordInfoRecoveryTime(Integer.parseInt(eewVar.b(), 16));
                    break;
                case 19:
                    runPlanRecordInfo.setRunPlanRecordInfoDailyScore(Integer.parseInt(eewVar.b(), 16));
                    break;
                case 20:
                    runPlanRecordInfo.setRunPlanRecordInfoExerciseDuration(((long) Integer.parseInt(eewVar.b(), 16)) * 1000);
                    break;
                case 21:
                    runPlanRecordInfo.setRunPlanRecordInfoDateInfo(Integer.parseInt(eewVar.b(), 16));
                    break;
                default:
                    Object[] objArr = new Object[1];
                    objArr[0] = "dealMuchMoreNotificationRunPlanRecordInfo branch default";
                    LogUtil.j(TAG, objArr);
                    break;
            }
        } catch (NumberFormatException e) {
            ReleaseLogUtil.a(TAG_RELEASE, "dealMuchMoreNotificationRunPlanRecordInfo NumberFormatException : ", ExceptionUtils.c(e));
        }
    }

    public void setSimplifyMore(JSONObject jSONObject, Map<Long, double[]> map, MotionPathSimplify motionPathSimplify) {
        if (jSONObject == null || motionPathSimplify == null) {
            LogUtil.a(TAG, "setSimplifyMore param is null");
            return;
        }
        WorkoutDisplayInfo workoutDisplayInfo = new WorkoutDisplayInfo();
        checkWorkoutDisplayInfo(1, map, workoutDisplayInfo);
        motionPathSimplify.setChiefSportDataType(workoutDisplayInfo.getChiefSportDataType());
        motionPathSimplify.setIsFreeMotion(workoutDisplayInfo.getFreeMotion());
        motionPathSimplify.setSportType(workoutDisplayInfo.getWorkoutType());
        motionPathSimplify.setHasTrackPoint(workoutDisplayInfo.isHasTrackPoint());
        motionPathSimplify.setSportDataSource(workoutDisplayInfo.getSportDataSource());
        try {
            motionPathSimplify.setStartTime(jSONObject.getLong(HwExerciseConstants.JSON_NAME_WORKOUT_RUN_PLAY_START_TIME));
            motionPathSimplify.setEndTime(jSONObject.getLong(HwExerciseConstants.JSON_NAME_WORKOUT_RUN_PLAY_END_TIME));
            motionPathSimplify.setMaxHeartRate(jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_RUN_PLAY_MAX_HEART_RATE));
            motionPathSimplify.setMinHeartRate(jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_RUN_PLAY_MIN_HEART_RATE));
            motionPathSimplify.setTotalDistance(jSONObject.getInt("run_plan_record_info_distance"));
            motionPathSimplify.setTotalCalories(jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_RUN_PLAY_CALORIE) * 1000);
            motionPathSimplify.setCreepingWave(jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_RUN_PLAY_CLIMB));
            if (jSONObject.getInt("run_plan_record_info_distance") == 0 || jSONObject.getInt("run_plan_record_info_exercise_duration") == 0) {
                motionPathSimplify.setAvgPace(0.0f);
            } else {
                motionPathSimplify.setAvgPace(1000.0f / ((jSONObject.getInt("run_plan_record_info_distance") * 1000.0f) / jSONObject.getInt("run_plan_record_info_exercise_duration")));
            }
            if (jSONObject.getInt("run_plan_record_info_exercise_duration") != 0) {
                LogUtil.a(TAG, "record step:", Integer.valueOf(jSONObject.getInt("workout_record_step")));
                motionPathSimplify.setAvgStepRate((int) (((jSONObject.getInt("run_plan_record_info_step") * 1000) / jSONObject.getInt("run_plan_record_info_exercise_duration")) * 60.0f));
            }
        } catch (JSONException unused) {
            LogUtil.e(TAG, "setSimplifyMore Exception");
        }
    }

    public void testRunPlanRecordInfoDebug(SparseArray<JSONObject> sparseArray) {
        String str = "run_plan_record_info_total_time";
        String str2 = TAG;
        try {
            int size = sparseArray.size();
            int i = 0;
            while (i < size) {
                JSONObject jSONObjectValueAt = sparseArray.valueAt(i);
                int i2 = size;
                int i3 = i;
                String str3 = str2;
                try {
                    String str4 = str;
                    str2 = str3;
                    LogUtil.d(str2, "workout id:", jSONObjectValueAt.get(HwExerciseConstants.JSON_NAME_SPORT_DATA_KEY_RECORD_ID), ",workout statuc:", jSONObjectValueAt.get(HwExerciseConstants.JSON_NAME_SPORT_DATA_KEY_RECORD_STATUS), ",startime:", jSONObjectValueAt.get(HwExerciseConstants.JSON_NAME_WORKOUT_RUN_PLAY_START_TIME), ",endtime：", jSONObjectValueAt.get(HwExerciseConstants.JSON_NAME_WORKOUT_RUN_PLAY_END_TIME), "calorie：", jSONObjectValueAt.get(HwExerciseConstants.JSON_NAME_WORKOUT_RUN_PLAY_CALORIE), ",distance:", jSONObjectValueAt.get("run_plan_record_info_distance"), ",step=", jSONObjectValueAt.get("run_plan_record_info_step"), ",time=", jSONObjectValueAt.get(str), ",speed=", jSONObjectValueAt.get(HwExerciseConstants.JSON_NAME_WORKOUT_RUN_PLAY_SPEED), ",climb=", jSONObjectValueAt.get(HwExerciseConstants.JSON_NAME_WORKOUT_RUN_PLAY_CLIMB), "HrMax:", jSONObjectValueAt.get(HwExerciseConstants.JSON_NAME_WORKOUT_RUN_PLAY_MAX_HEART_RATE), ",HrMin=", jSONObjectValueAt.get(HwExerciseConstants.JSON_NAME_WORKOUT_RUN_PLAY_MIN_HEART_RATE), ",loadPeak:", jSONObjectValueAt.get(HwExerciseConstants.JSON_NAME_SPORT_DATA_KEY_RECORD_LOAD_PEAK), ",effect:", jSONObjectValueAt.get(HwExerciseConstants.JSON_NAME_SPORT_DATA_KEY_RECORD_ETRAINING_EFFECT), ",epoc:", jSONObjectValueAt.get(HwExerciseConstants.JSON_NAME_SPORT_DATA_KEY_RECORD_EPOC), "MET:", jSONObjectValueAt.get(HwExerciseConstants.JSON_NAME_SPORT_DATA_KEY_RECORD_MAX_MET), ", finishRate:", jSONObjectValueAt.get(HwExerciseConstants.JSON_NAME_SPORT_DATA_KEY_RECORD_ACHIEVE_PERCENT), ",revoeryTime:", jSONObjectValueAt.get(HwExerciseConstants.JSON_NAME_SPORT_DATA_KEY_RECORD_RECOVERY_TIME), ",duration:", jSONObjectValueAt.get("run_plan_record_info_exercise_duration"), ",date:", jSONObjectValueAt.get("run_plan_record_info_date_info"), "totalTime:", jSONObjectValueAt.get(str));
                    i = i3 + 1;
                    size = i2;
                    str = str4;
                } catch (JSONException unused) {
                    str2 = str3;
                    LogUtil.e(str2, "testRunPlanRecordInfoDebug JSONException");
                    return;
                }
            }
        } catch (JSONException unused2) {
        }
    }

    public void printWorkoutRecordInfo(SparseArray<JSONObject> sparseArray) {
        String str;
        String str2 = HwExerciseConstants.JSON_NAME_WORKOUT_RECORD_TOTAL_TIME;
        String str3 = TAG;
        try {
            int size = sparseArray.size();
            int i = 0;
            while (i < size) {
                JSONObject jSONObjectValueAt = sparseArray.valueAt(i);
                int i2 = size;
                int i3 = i;
                String str4 = str3;
                try {
                    String str5 = str2;
                    Object[] objArr = {"printWorkoutRecordInfo workout id:", jSONObjectValueAt.get("workout_record_id"), ",workout statuc:", jSONObjectValueAt.get(HwExerciseConstants.JSON_NAME_WORKOUT_RECORD_STATUS), ",startime:", jSONObjectValueAt.get(HwExerciseConstants.JSON_NAME_START_TIME), ",endtime:", jSONObjectValueAt.get(HwExerciseConstants.JSON_NAME_END_TIME), "calorie:", jSONObjectValueAt.get(HwExerciseConstants.JSON_NAME_RECORD_CALORIE), ",distance:", jSONObjectValueAt.get("workout_record_distance"), ",step:", jSONObjectValueAt.get("workout_record_step"), ",time:", jSONObjectValueAt.get(str2), ",speed:", jSONObjectValueAt.get("workout_record_speed"), ",climb:", jSONObjectValueAt.get(HwExerciseConstants.JSON_NAME_WORKOUT_CLIMB), "HrMax:", jSONObjectValueAt.get(HwExerciseConstants.JSON_NAME_PEAK_MAX), ",HrMin:", jSONObjectValueAt.get(HwExerciseConstants.JSON_NAME_PEAK_MIN), ",loadPeak:", jSONObjectValueAt.get(HwExerciseConstants.JSON_NAME_WORKOUT_LOAD_PEAK), ",effect:", jSONObjectValueAt.get(HwExerciseConstants.JSON_NAME_ETRAINING_EFFECT), ",epoc:", jSONObjectValueAt.get(HwExerciseConstants.JSON_NAME_WORKOUT_EPOC), "MET:", jSONObjectValueAt.get(HwExerciseConstants.JSON_NAME_MAX_MET), ",revoeryTime:", jSONObjectValueAt.get(HwExerciseConstants.JSON_NAME_RECOVERY_TIME), ",duration:", jSONObjectValueAt.get("workout_exercise_duration"), ",date:", jSONObjectValueAt.get(HwExerciseConstants.JSON_NAME_WORKOUT_RECORD_DATE_INFO), "totalTime:", jSONObjectValueAt.get(str2), ",workout_type:", jSONObjectValueAt.get(HwExerciseConstants.JSON_NAME_WORKOUT_TYPE), "swim, swim_type:", jSONObjectValueAt.get("swim_type"), ",swim_pull_times:", jSONObjectValueAt.get("swim_pull_times"), ",swim_pull_rate:", jSONObjectValueAt.get("swim_pull_rate"), ",swim_pool_length:", jSONObjectValueAt.get("swim_pool_length"), ",swim_trip_times:", jSONObjectValueAt.get("swim_trip_times"), ",swim_avg_swolf:", jSONObjectValueAt.get("swim_avg_swolf")};
                    str = str4;
                    try {
                        LogUtil.d(str, objArr);
                        i = i3 + 1;
                        str3 = str;
                        size = i2;
                        str2 = str5;
                    } catch (JSONException unused) {
                        LogUtil.e(str, "printWorkoutRecordInfo JSONException");
                        return;
                    }
                } catch (JSONException unused2) {
                    str = str4;
                }
            }
        } catch (JSONException unused3) {
            str = str3;
        }
    }

    public static void parseWorkoutCapability(List<eew> list, List<IBaseResponseCallback> list2) {
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        if (list == null || list.isEmpty()) {
            LogUtil.j(TAG, "tlv is empty.");
            responseCallbackList(0, 0, list2);
            return;
        }
        int iV = 0;
        for (eew eewVar : list) {
            int iV2 = CommonUtil.v(eewVar.e());
            if (iV2 == 1) {
                iV = CommonUtil.v(eewVar.b());
            } else if (iV2 != 127) {
                LogUtil.j(TAG, "unSupport tag");
            } else {
                responseCallbackList(CommonUtil.v(eewVar.b()), iV, list2);
                return;
            }
        }
        responseCallbackList(0, iV, list2);
    }

    private static void responseCallbackList(int i, int i2, List<IBaseResponseCallback> list) {
        Iterator<IBaseResponseCallback> it = list.iterator();
        while (it.hasNext()) {
            it.next().a(i, Integer.valueOf(i2));
        }
        list.clear();
    }

    public static String getWorkoutRecordStatisticStructHex(JSONObject jSONObject, int i) {
        if (jSONObject == null) {
            LogUtil.j(TAG, "getWorkoutRecordStatisticStructHex param is null.");
            return "";
        }
        StringBuilder sb = new StringBuilder(16);
        try {
            LogUtil.a(TAG, "the parameters are ", jSONObject.toString(), "deviceCapability : ", Integer.valueOf(i));
            String strE = eeq.e(jSONObject.getInt("workout_record_id"));
            String strB = eeq.b(strE.length() / 2);
            String strD = eeq.d(2);
            String strE2 = eeq.e(jSONObject.getInt(HwExerciseConstants.WORKOUT_DATA_INDEX));
            String strB2 = eeq.b(strE.length() / 2);
            String strD2 = eeq.d(3);
            StringBuilder sb2 = new StringBuilder(16);
            sb2.append(strD);
            sb2.append(strB);
            sb2.append(strE);
            sb2.append(strD2);
            sb2.append(strB2);
            sb2.append(strE2);
            if (isSupportCapability(i, 8)) {
                sb2.append(eeq.d(7));
                sb2.append(eeq.d(0));
            }
            int length = sb2.toString().length() / 2;
            sb.append(eeq.d(129));
            sb.append(eeq.d(length));
            sb.append(sb2.toString());
        } catch (JSONException unused) {
            LogUtil.e(TAG, "getWorkoutRecordStatisticStructHex json exception.");
        }
        return sb.toString();
    }
}
