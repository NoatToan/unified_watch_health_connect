package com.huawei.hwdevice.phoneprocess.mgr.exercise;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.MotionPath;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.MotionPathSimplify;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.RideAnalogCadence;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.RideAnalogPower;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.RidePower;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.SkippingSpeed;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.StepRateData;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.TrackAltitudeData;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.TrackPullFreqData;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.TrackSpeedData;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.TrackSwolfData;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.WorkoutDataInfo;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.WorkoutDataStruct;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.HwExerciseDeviceUtil;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.HwExerciseRunPlanUtil;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.HwExerciseUtils;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.HwWorkoutServiceUtils;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.TriathlonUtils;
import com.huawei.hwfoundationmodel.trackmodel.HeartRateData;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.ecu;
import defpackage.gzt;
import defpackage.gzv;
import defpackage.mit;
import defpackage.mkf;
import defpackage.nfo;
import defpackage.njj;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class HwExerciseAdviceManagerHelper {
    private static final int CADENCE_DENOMINATOR = 2;
    private static final int ERROR = -1;
    private static final float LESS_VALUE = 0.5f;
    private static final Object LOCK_OBJECT = new Object();
    private static final int MAX_VALUE = 255;
    private static final float MINUTE = 60.0f;
    private static final float NUMBER = 5.0f;
    private static final String TAG = "HwExerciseAdviceManagerHelper";
    private static final String TAG_RELEASE = "BTSYNC_HwExerciseAdviceManagerHelper";
    private static final String TAG_TRUST_HEART_RATE = "1";
    private static HwExerciseAdviceManagerHelper sInstance;
    private HwExerciseParams mParam = HwExerciseParams.getInstance();
    private HwExerciseAdviceManager mHwExerciseAdviceManager = HwExerciseAdviceManager.getInstance();

    public static HwExerciseAdviceManagerHelper getInstance() {
        HwExerciseAdviceManagerHelper hwExerciseAdviceManagerHelper;
        synchronized (LOCK_OBJECT) {
            if (sInstance == null) {
                sInstance = new HwExerciseAdviceManagerHelper();
            }
            hwExerciseAdviceManagerHelper = sInstance;
        }
        return hwExerciseAdviceManagerHelper;
    }

    public DeviceCapability getCapability() {
        Map<String, DeviceCapability> mapQueryDeviceCapability = mkf.e(BaseApplication.getContext()).queryDeviceCapability(4, "", TAG);
        if (mapQueryDeviceCapability == null || mapQueryDeviceCapability.isEmpty()) {
            return null;
        }
        return filterCapability(mapQueryDeviceCapability);
    }

    public void saveSuccessUpdateSuccessList(WorkoutSyncSuccessDetailData workoutSyncSuccessDetailData) {
        synchronized (this) {
            try {
                if (workoutSyncSuccessDetailData == null) {
                    ReleaseLogUtil.e(TAG_RELEASE, "saveSuccessUpdateSuccessList successRecord is null.");
                    return;
                }
                ReleaseLogUtil.d(TAG_RELEASE, "saveSuccessUpdateSuccessList workoutId:", Integer.valueOf(workoutSyncSuccessDetailData.getWorkoutId()), ", startTime:", Long.valueOf(workoutSyncSuccessDetailData.getStartTime()));
                List<WorkoutSyncSuccessDetailData> arrayList = this.mParam.getSucceedRecordMap().get(HwExerciseUtils.getRecordKey(HwExerciseDeviceUtil.getCurrentDeviceId()));
                if (arrayList == null) {
                    arrayList = new ArrayList<>(16);
                }
                WorkoutSyncSuccessDetailData successRecord = getSuccessRecord(workoutSyncSuccessDetailData);
                if (successRecord != null) {
                    arrayList.remove(successRecord);
                }
                arrayList.add(workoutSyncSuccessDetailData);
                ReleaseLogUtil.d(TAG_RELEASE, "saveSuccessUpdateSuccessList succeedList:", arrayList.toString());
                this.mParam.getSucceedRecordMap().put(HwExerciseUtils.getRecordKey(HwExerciseDeviceUtil.getCurrentDeviceId()), arrayList);
                this.mHwExerciseAdviceManager.setSharedPreference(HwExerciseUtils.getRecordKey(HwExerciseDeviceUtil.getCurrentDeviceId()), HiJsonUtil.d(arrayList), null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public WorkoutSyncSuccessDetailData getSuccessRecord(WorkoutSyncSuccessDetailData workoutSyncSuccessDetailData) {
        List<WorkoutSyncSuccessDetailData> list = this.mParam.getSucceedRecordMap().get(HwExerciseUtils.getRecordKey(HwExerciseDeviceUtil.getCurrentDeviceId()));
        if (list == null) {
            LogUtil.j(TAG, "getSuccessRecord succeedList is null.");
            return null;
        }
        for (WorkoutSyncSuccessDetailData workoutSyncSuccessDetailData2 : list) {
            if (workoutSyncSuccessDetailData2 != null && workoutSyncSuccessDetailData2.getWorkoutId() == workoutSyncSuccessDetailData.getWorkoutId() && workoutSyncSuccessDetailData2.getStartTime() == workoutSyncSuccessDetailData.getStartTime()) {
                return workoutSyncSuccessDetailData2;
            }
        }
        return null;
    }

    public void notifySaveData(final MotionPathSimplify motionPathSimplify, final MotionPath motionPath, final int i, final TriathlonUtils triathlonUtils, final HwExerciseAdviceManager hwExerciseAdviceManager) {
        mit.b(TAG, new Runnable() { // from class: com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseAdviceManagerHelper.1
            @Override // java.lang.Runnable
            public void run() {
                if (HwExerciseAdviceManagerHelper.this.mParam.getCurrentDeviceId().equals(HwExerciseDeviceUtil.getCurrentDeviceId())) {
                    motionPathSimplify.setWorkoutTrajectories(HwExerciseAdviceManagerHelper.this.mParam.getWorkoutTrajectories());
                    motionPathSimplify.setDivingEvent(HwExerciseAdviceManagerHelper.this.mParam.getDivingEvent());
                    HwExerciseAdviceManagerHelper.this.mHwExerciseAdviceManager.setIsBeingSavedNewData(true);
                    HwExerciseUtils.saveTrackData(motionPathSimplify, motionPath, i, triathlonUtils, hwExerciseAdviceManager);
                }
            }
        });
    }

    public void saveDataToTrack(JSONObject jSONObject, List<WorkoutDataStruct> list, Map<Long, double[]> map, JSONArray jSONArray, Map<String, Integer> map2) {
        int iIntValue = map2.get(HwExerciseConstants.METHOD_PARAM_WORKOUT_TYPE).intValue();
        int iIntValue2 = map2.get(HwExerciseConstants.JSON_NAME_WORKOUT_RECORD_ID).intValue();
        MotionPath motionPath = new MotionPath();
        MotionPathSimplify motionPathSimplify = new MotionPathSimplify();
        HwExerciseUtils.setMapType(iIntValue, motionPathSimplify, map);
        if (map != null) {
            motionPath.setLbsDataMap(map);
        }
        int iOptInt = jSONObject.optInt(HwExerciseConstants.JSON_NAME_WORKOUT_TYPE);
        if (iOptInt == 231 || iOptInt == 232) {
            motionPath.setIndoorTrajectory(true);
        }
        try {
            int i = (int) jSONObject.getLong(HwExerciseConstants.JSON_NAME_WORKOUT_RUN_PLAY_DURATION);
            Map map3 = new HashMap(16);
            Map map4 = new HashMap(16);
            ReleaseLogUtil.d(TAG_RELEASE, "saveDataToTrack paceArray");
            if (jSONArray != null) {
                Map<Integer, Float> mapChangePaceMapStruct = HwExerciseUtils.changePaceMapStruct(jSONArray, 0);
                motionPath.setPaceMap(mapChangePaceMapStruct);
                motionPathSimplify.setPaceMap(mapChangePaceMapStruct);
                List<njj> listChangePaceListStruct = HwExerciseUtils.changePaceListStruct(jSONArray, 0);
                motionPath.savePaceV2(listChangePaceListStruct);
                motionPathSimplify.savePaceV2(listChangePaceListStruct);
                Map<Integer, Float> mapChangePaceMapStruct2 = HwExerciseUtils.changePaceMapStruct(jSONArray, 1);
                motionPath.setBritishPaceMap(mapChangePaceMapStruct2);
                motionPathSimplify.setBritishPaceMap(mapChangePaceMapStruct2);
                List<njj> listChangePaceListStruct2 = HwExerciseUtils.changePaceListStruct(jSONArray, 1);
                motionPath.saveBriPaceV2(listChangePaceListStruct2);
                motionPathSimplify.saveBriPaceV2(listChangePaceListStruct2);
                map3 = HwExerciseUtils.changePartTimePaceMapStruct(jSONArray, 0);
                map4 = HwExerciseUtils.changePartTimePaceMapStruct(jSONArray, 1);
            }
            HwExerciseUtils.handleSaveBaseInfo(jSONObject, motionPathSimplify, i, map3, map4);
            packTrackData(list, motionPath, motionPathSimplify, jSONObject);
            HwExerciseRunPlanUtil.handleSaveWorkoutDisplayInfo(map, motionPathSimplify);
            HwExerciseUtils.handleSaveSimplifyBaseInfo(jSONObject, motionPathSimplify);
            HwExerciseUtils.handleSaveAltitudeData(jSONObject, motionPathSimplify);
            motionPathSimplify.setSportData(HwExerciseUtils.handleSaveSportDataMap(jSONObject, motionPathSimplify));
            motionPathSimplify.setIsWorkout(false);
        } catch (JSONException unused) {
            ReleaseLogUtil.a(TAG_RELEASE, "saveXxxxx json Exception.");
        }
        notifySaveData(motionPathSimplify, motionPath, iIntValue2, this.mParam.getTriathlonUtils(), this.mHwExerciseAdviceManager);
        ReleaseLogUtil.d(TAG_RELEASE, "save runPlan Record DatatoTrack finish");
    }

    public void packTrackData(List<WorkoutDataStruct> list, MotionPath motionPath, MotionPathSimplify motionPathSimplify, JSONObject jSONObject) {
        HwExerciseAdviceBean hwExerciseAdviceBean = new HwExerciseAdviceBean();
        parseJson(list, motionPathSimplify, jSONObject, hwExerciseAdviceBean);
        LogUtil.a(TAG, "trackSummaryTotalStep: ", Integer.valueOf(hwExerciseAdviceBean.getTrackSummaryTotalStep()), "trackTotalStep: ", Integer.valueOf(hwExerciseAdviceBean.getTrackTotalStep()), " totaltime: ", Long.valueOf((hwExerciseAdviceBean.getTrackTotalTime() / 1000) / 60));
        detailLessValue(hwExerciseAdviceBean);
        buildDetailValue(motionPath, jSONObject, hwExerciseAdviceBean);
        isNotworkType(motionPath, jSONObject, hwExerciseAdviceBean);
        motionPath.saveRunningPostureList(hwExerciseAdviceBean.getPostureDataList());
        motionPath.setExtraDataList(hwExerciseAdviceBean.getExtraDataList());
        motionPath.setAnalogRideAnalogPowerList(getRideAnalogPowerList(hwExerciseAdviceBean));
        motionPath.setRideAnalogCadenceList(getRideAnalogCadenceList(hwExerciseAdviceBean));
        motionPathSimplify.setSportId(hwExerciseAdviceBean.getSportId());
        motionPathSimplify.setSportType(258);
        speedValue(motionPathSimplify, hwExerciseAdviceBean);
        DeviceCapability capability = getCapability();
        if (hwExerciseAdviceBean.getTrackHeartTotalCount() == 0) {
            motionPathSimplify.setAvgHeartRate(0);
        } else {
            if (capability != null && capability.isSupportWorkoutTrustHeartRate()) {
                hwExerciseAdviceBean.setTrackTotalHeart(calculateTotalHeartRate(motionPath.getHeartRateList()));
                hwExerciseAdviceBean.setTrackHeartTotalCount(motionPath.getHeartRateList().size());
            }
            if (hwExerciseAdviceBean.getTrackHeartTotalCount() == 0) {
                motionPathSimplify.setAvgHeartRate(0);
            } else {
                motionPathSimplify.setAvgHeartRate((int) (hwExerciseAdviceBean.getTrackTotalHeart() / ((long) hwExerciseAdviceBean.getTrackHeartTotalCount())));
            }
        }
        LogUtil.d(TAG, "hwExerciseAdviceUtil.getTrackTotalHeart: ", Long.valueOf(hwExerciseAdviceBean.getTrackTotalHeart()), " avgHear: ", Integer.valueOf(motionPathSimplify.getAvgHeartRate()));
        int trackTotalStep = (int) ((hwExerciseAdviceBean.getTrackTotalStep() / (hwExerciseAdviceBean.getTrackTotalCount() * 5.0f)) * 60.0f);
        motionPathSimplify.setAvgStepRate(trackTotalStep);
        motionPathSimplify.addExtendDataMap("crossTrainerCadence", Integer.toString(motionPathSimplify.getAvgStepRate() / 2));
        motionPathSimplify.setBestStepRate(hwExerciseAdviceBean.getTrackMaxStep());
        LogUtil.d(TAG, "bestStep: ", Integer.valueOf(hwExerciseAdviceBean.getTrackMaxStep()), " avgStep: ", Integer.valueOf(trackTotalStep));
        motionPathSimplify.setTrackType(nfo.d(ecu.d().getDeviceList(HwGetDevicesMode.ACTIVE_MAIN_DEVICES, null, TAG)));
    }

    private List<RideAnalogPower> getRideAnalogPowerList(HwExerciseAdviceBean hwExerciseAdviceBean) {
        ReleaseLogUtil.d(TAG_RELEASE, "enter dealRideAnalogPowerList");
        List<LinkedHashMap<String, String>> extraDataList = hwExerciseAdviceBean.getExtraDataList();
        ArrayList arrayList = new ArrayList();
        for (LinkedHashMap<String, String> linkedHashMap : extraDataList) {
            if (linkedHashMap.containsKey(HwExerciseConstants.EXTEND_CYCLE_ANALOG_POWER)) {
                try {
                    RideAnalogPower rideAnalogPower = new RideAnalogPower();
                    long j = Long.parseLong(linkedHashMap.get("timeStamp"));
                    int i = Integer.parseInt(linkedHashMap.get(HwExerciseConstants.EXTEND_CYCLE_ANALOG_POWER));
                    rideAnalogPower.setTime(j);
                    rideAnalogPower.setAnalogPower(i);
                    arrayList.add(rideAnalogPower);
                } catch (NumberFormatException unused) {
                    LogUtil.j(TAG, "save rideAnalogPower error.");
                }
            }
        }
        LogUtil.d(TAG, "analogPowerList: ", arrayList.toString());
        return arrayList;
    }

    private List<RideAnalogCadence> getRideAnalogCadenceList(HwExerciseAdviceBean hwExerciseAdviceBean) {
        ReleaseLogUtil.d(TAG_RELEASE, "enter dealRideAnalogCadenceList");
        List<LinkedHashMap<String, String>> extraDataList = hwExerciseAdviceBean.getExtraDataList();
        ArrayList arrayList = new ArrayList();
        for (LinkedHashMap<String, String> linkedHashMap : extraDataList) {
            if (linkedHashMap.containsKey(HwExerciseConstants.EXTEND_CYCLE_ANALOG_CADENCE)) {
                try {
                    RideAnalogCadence rideAnalogCadence = new RideAnalogCadence();
                    long j = Long.parseLong(linkedHashMap.get("time"));
                    int i = Integer.parseInt(linkedHashMap.get(HwExerciseConstants.EXTEND_CYCLE_ANALOG_CADENCE));
                    rideAnalogCadence.setTime(j);
                    rideAnalogCadence.setAnalogCadence(i);
                    arrayList.add(rideAnalogCadence);
                } catch (NumberFormatException unused) {
                    LogUtil.j(TAG, "save rideAnalogCadence error.");
                }
            }
        }
        LogUtil.d(TAG, "rideAnalogCadenceList: ", arrayList.toString());
        return arrayList;
    }

    private DeviceCapability filterCapability(Map<String, DeviceCapability> map) {
        Iterator<Map.Entry<String, DeviceCapability>> it = map.entrySet().iterator();
        DeviceCapability value = null;
        while (it.hasNext() && (value = it.next().getValue()) == null) {
        }
        return value;
    }

    private void dataValidValue(List<WorkoutDataStruct> list, JSONObject jSONObject, MotionPathSimplify motionPathSimplify, HwExerciseAdviceBean hwExerciseAdviceBean) throws JSONException {
        HwExerciseAdviceData hwExerciseAdviceData = new HwExerciseAdviceData(jSONObject);
        hwExerciseAdviceData.setDeviceCapability(getCapability());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            WorkoutDataStruct workoutDataStruct = list.get(i);
            LogUtil.a(TAG, "dataValidValue data:", HiJsonUtil.d(workoutDataStruct));
            long time = workoutDataStruct.getDataHeader().getTime();
            hwExerciseAdviceData.setTime(time);
            int timeInterval = workoutDataStruct.getDataHeader().getTimeInterval();
            hwExerciseAdviceData.setTimeInterval(timeInterval);
            LogUtil.d(TAG, "timeInterval: ", Integer.valueOf(timeInterval), " time: ", Long.valueOf(time), " detailId: ", Integer.valueOf(workoutDataStruct.getWorkoutRecordId()), " index: ", Integer.valueOf(workoutDataStruct.getWorkoutDataIndex()));
            int size2 = workoutDataStruct.getDataHeader().getWorkoutDataInfoList().size();
            hwExerciseAdviceData.setDataCount(size2);
            List<String> bitMap = workoutDataStruct.getDataHeader().getBitMap();
            hwExerciseAdviceBean.setTrackTotalCount(hwExerciseAdviceBean.getTrackTotalCount() + size2);
            exerciseData(workoutDataStruct, hwExerciseAdviceData, motionPathSimplify, bitMap, hwExerciseAdviceBean);
        }
    }

    private void parseJson(List<WorkoutDataStruct> list, MotionPathSimplify motionPathSimplify, JSONObject jSONObject, HwExerciseAdviceBean hwExerciseAdviceBean) {
        LogUtil.a(TAG, "the size is ", Integer.valueOf(list.size()));
        try {
            hwExerciseAdviceBean.setTrackSummaryTotalStep(motionPathSimplify.getTotalSteps());
            hwExerciseAdviceBean.setTrackTotalTime(motionPathSimplify.getTotalTime());
            dataValidValue(list, jSONObject, motionPathSimplify, hwExerciseAdviceBean);
            if (hwExerciseAdviceBean.isSupportNewStep() || hwExerciseAdviceBean.getTrackMinuteStepCount() % 12 == 0) {
                return;
            }
            StepRateData stepRateData = new StepRateData();
            stepRateData.setTime(hwExerciseAdviceBean.getTrackMinuteStepTimestamp());
            if (hwExerciseAdviceBean.getTrackMinuteStep() >= hwExerciseAdviceBean.getTrackMaxStep()) {
                stepRateData.setStepRate(hwExerciseAdviceBean.getTrackMinuteStep());
                hwExerciseAdviceBean.getStepList().add(stepRateData);
                hwExerciseAdviceBean.setTrackMaxStep(hwExerciseAdviceBean.getTrackMinuteStep());
                hwExerciseAdviceBean.setStepLastIndex(hwExerciseAdviceBean.getStepList().size() - 1);
            } else {
                completionStep(hwExerciseAdviceBean, stepRateData);
            }
            LogUtil.d(TAG, "time: ", Long.valueOf(hwExerciseAdviceBean.getTrackMinuteStepTimestamp()), "trackMinuteStep: ", Integer.valueOf(hwExerciseAdviceBean.getTrackMinuteStep()));
        } catch (JSONException unused) {
            ReleaseLogUtil.a(TAG_RELEASE, "packXxxx json Exception.");
        }
    }

    private void completionStep(HwExerciseAdviceBean hwExerciseAdviceBean, StepRateData stepRateData) {
        int trackMinuteStepCount = hwExerciseAdviceBean.getTrackMinuteStepCount() % 12;
        hwExerciseAdviceBean.setTrackMinuteStep((hwExerciseAdviceBean.getTrackMinuteStep() * 12) / trackMinuteStepCount);
        LogUtil.a(TAG, "packTrackData last one lastStepCount:", Integer.valueOf(trackMinuteStepCount));
        if (hwExerciseAdviceBean.getTrackMinuteStep() > hwExerciseAdviceBean.getTrackMaxStep()) {
            hwExerciseAdviceBean.setTrackMinuteStep(hwExerciseAdviceBean.getStepList().get(hwExerciseAdviceBean.getStepList().size() - 1).getStepRate());
        }
        stepRateData.setStepRate(hwExerciseAdviceBean.getTrackMinuteStep());
        hwExerciseAdviceBean.getStepList().add(stepRateData);
    }

    private void parseStorage(MotionPath motionPath, JSONObject jSONObject) {
        if (jSONObject.has(HwExerciseConstants.JSON_NAME_RECOVERY_HEART_RATE)) {
            try {
                ArrayList<HeartRateData> arrayList = (ArrayList) new Gson().fromJson(jSONObject.get(HwExerciseConstants.JSON_NAME_RECOVERY_HEART_RATE).toString(), new TypeToken<ArrayList<HeartRateData>>() { // from class: com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseAdviceManagerHelper.2
                }.getType());
                LogUtil.a(TAG, "heartList = ", arrayList.toString());
                motionPath.setRecoveryHeartRateList(arrayList);
            } catch (JsonSyntaxException unused) {
                ReleaseLogUtil.a(TAG_RELEASE, "fromJson parse fail json parse exception");
            } catch (JSONException e) {
                ReleaseLogUtil.a(TAG_RELEASE, "fromJson parse fail JSONException:", ExceptionUtils.c(e));
            }
        }
    }

    private void buildDetailValue(MotionPath motionPath, JSONObject jSONObject, HwExerciseAdviceBean hwExerciseAdviceBean) {
        handleHeartRateList(getCapability(), motionPath, hwExerciseAdviceBean.getHeartRateList(), hwExerciseAdviceBean.getInvalidHeartRateList());
        motionPath.setAltitudeList(hwExerciseAdviceBean.getAltitudeList());
        motionPath.setSwolfList(hwExerciseAdviceBean.getSwolfList());
        motionPath.setPullFreqList(hwExerciseAdviceBean.getPullFrequentList());
        motionPath.setSpeedList(hwExerciseAdviceBean.getSpeedList());
        motionPath.setSkippingSpeedList(hwExerciseAdviceBean.getFrequencyList());
        if (hwExerciseAdviceBean.getPowerAccount() == 0) {
            hwExerciseAdviceBean.getRidePowerList().clear();
        }
        motionPath.setRidePowerList(hwExerciseAdviceBean.getRidePowerList());
        LogUtil.a(TAG, "ridePowerList is:", hwExerciseAdviceBean.getRidePowerList().toString());
        parseStorage(motionPath, jSONObject);
    }

    private void detailLessValue(HwExerciseAdviceBean hwExerciseAdviceBean) {
        if (hwExerciseAdviceBean.getTrackSummaryTotalStep() <= hwExerciseAdviceBean.getTrackTotalStep() || hwExerciseAdviceBean.getTrackSummaryTotalStep() - hwExerciseAdviceBean.getTrackTotalStep() <= (hwExerciseAdviceBean.getTrackTotalTime() / 1000) / 60) {
            return;
        }
        int trackSummaryTotalStep = (int) (((hwExerciseAdviceBean.getTrackSummaryTotalStep() - hwExerciseAdviceBean.getTrackTotalStep()) / hwExerciseAdviceBean.getStepList().size()) + 0.5f);
        for (StepRateData stepRateData : hwExerciseAdviceBean.getStepList()) {
            stepRateData.setStepRate(stepRateData.getStepRate() + trackSummaryTotalStep);
        }
        if (hwExerciseAdviceBean.getStepList().size() > hwExerciseAdviceBean.getStepLastIndex()) {
            hwExerciseAdviceBean.setTrackMaxStep(hwExerciseAdviceBean.getStepList().get(hwExerciseAdviceBean.getStepLastIndex()).getStepRate());
        }
    }

    private void isNotworkType(MotionPath motionPath, JSONObject jSONObject, HwExerciseAdviceBean hwExerciseAdviceBean) {
        int i;
        if (jSONObject.has(HwExerciseConstants.JSON_NAME_WORKOUT_TYPE)) {
            try {
                i = jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_TYPE);
            } catch (JSONException unused) {
                ReleaseLogUtil.a(TAG_RELEASE, "get int type JSONException");
                i = -1;
            }
        } else {
            i = -1;
        }
        boolean isSupportNewEllipticalAndRowingMachine = HwWorkoutServiceManager.getInstance().getIsSupportNewEllipticalAndRowingMachine();
        if (isSupportNewEllipticalAndRowingMachine && i == 135) {
            motionPath.setPaddleRateList(hwExerciseAdviceBean.getStepList());
        }
        if (i == 3 || i == 7) {
            motionPath.setCadenceRateList(hwExerciseAdviceBean.getCadenceList());
        }
        if (isSupportNewEllipticalAndRowingMachine && i == 134) {
            if (hwExerciseAdviceBean.getTrackTotalStep() == 0) {
                hwExerciseAdviceBean.getStepList().clear();
            }
            motionPath.setStepRateList(hwExerciseAdviceBean.getStepList());
            hwExerciseAdviceBean.setCadenceList(stepToCadence(hwExerciseAdviceBean.getStepList()));
            motionPath.setCadenceRateList(hwExerciseAdviceBean.getCadenceList());
        }
        if (i != 135 && i != 134 && i != 255) {
            if (hwExerciseAdviceBean.getTrackTotalStep() == 0) {
                hwExerciseAdviceBean.getStepList().clear();
            }
            motionPath.setStepRateList(hwExerciseAdviceBean.getStepList());
            return;
        }
        ReleaseLogUtil.e(TAG_RELEASE, "stepList other workType");
    }

    private void speedValue(MotionPathSimplify motionPathSimplify, HwExerciseAdviceBean hwExerciseAdviceBean) {
        if (hwExerciseAdviceBean.getTrackTotalPace() == 0 || hwExerciseAdviceBean.getTrackTotalCount() == 0) {
            motionPathSimplify.setAvgPace(0.0f);
        } else {
            motionPathSimplify.setAvgPace(3600.0f / ((hwExerciseAdviceBean.getTrackTotalPace() / 10.0f) / hwExerciseAdviceBean.getTrackTotalCount()));
        }
        if (hwExerciseAdviceBean.getTrackMaxPace() == 0) {
            motionPathSimplify.setBestPace(0.0f);
        } else {
            motionPathSimplify.setBestPace(3600.0f / (hwExerciseAdviceBean.getTrackMaxPace() / 10.0f));
        }
        LogUtil.d(TAG, "best pace: ", Float.valueOf(motionPathSimplify.getBestPace()), " sportId: ", hwExerciseAdviceBean.getSportId(), " avg Pace: ", Float.valueOf(motionPathSimplify.getAvgPace()));
    }

    private ArrayList<StepRateData> stepToCadence(ArrayList<StepRateData> arrayList) {
        ArrayList<StepRateData> arrayList2 = new ArrayList(16);
        ArrayList<StepRateData> arrayList3 = new ArrayList<>(16);
        arrayList2.addAll(arrayList);
        for (StepRateData stepRateData : arrayList2) {
            StepRateData stepRateData2 = new StepRateData();
            stepRateData2.setTime(stepRateData.getTime());
            stepRateData2.setStepRate(stepRateData.getStepRate() / 2);
            arrayList3.add(stepRateData2);
        }
        return arrayList3;
    }

    private void handleHeartRateList(DeviceCapability deviceCapability, MotionPath motionPath, ArrayList<HeartRateData> arrayList, ArrayList<HeartRateData> arrayList2) {
        if (deviceCapability != null && deviceCapability.isSupportWorkoutTrustHeartRate()) {
            Map<String, ArrayList> mapFilterHeartRate = HwWorkoutServiceUtils.filterHeartRate(arrayList);
            if (mapFilterHeartRate.containsKey(HwWorkoutServiceUtils.HEART_RATE_LIST)) {
                motionPath.setHeartRateList(mapFilterHeartRate.get(HwWorkoutServiceUtils.HEART_RATE_LIST));
            }
            dealInvalidHeart(mapFilterHeartRate, arrayList2, motionPath);
            return;
        }
        motionPath.setHeartRateList(arrayList);
        motionPath.setInvalidHeartRateList(arrayList2);
    }

    private void dealInvalidHeart(Map<String, ArrayList> map, ArrayList<HeartRateData> arrayList, MotionPath motionPath) {
        if (map.containsKey(HwWorkoutServiceUtils.INVALID_HEART_RATE_LIST)) {
            ArrayList arrayList2 = map.get(HwWorkoutServiceUtils.INVALID_HEART_RATE_LIST);
            if (!arrayList2.isEmpty()) {
                arrayList.addAll(arrayList2);
                HwWorkoutServiceUtils.sortListByTime(arrayList);
            }
            motionPath.setInvalidHeartRateList(arrayList);
        }
    }

    private long calculateTotalHeartRate(List<HeartRateData> list) {
        ReleaseLogUtil.d(TAG_RELEASE, "calculateTotalHeartRate enter");
        long jAcquireHeartRate = 0;
        if (list != null && list.size() > 0) {
            Iterator<HeartRateData> it = list.iterator();
            while (it.hasNext()) {
                jAcquireHeartRate += (long) it.next().acquireHeartRate();
            }
        }
        return jAcquireHeartRate;
    }

    private void exerciseData(WorkoutDataStruct workoutDataStruct, HwExerciseAdviceData hwExerciseAdviceData, MotionPathSimplify motionPathSimplify, List<String> list, HwExerciseAdviceBean hwExerciseAdviceBean) throws JSONException {
        int dataIndex = hwExerciseAdviceData.getDataIndex();
        Gson gson = new Gson();
        for (int i = 0; i < hwExerciseAdviceData.getDataCount(); i++) {
            WorkoutDataInfo workoutDataInfo = workoutDataStruct.getDataHeader().getWorkoutDataInfoList().get(i);
            if (hwExerciseAdviceBean.getTrackMinuteStepCount() % 12 == 0) {
                hwExerciseAdviceBean.setTrackMinuteStepTimestamp(hwExerciseAdviceData.getTime() + (hwExerciseAdviceData.getTimeInterval() * ((long) i) * 1000));
            }
            exerciseDetailsFields(workoutDataInfo, hwExerciseAdviceData, motionPathSimplify, i, hwExerciseAdviceBean);
            int dataSpeed = workoutDataInfo.getDataSpeed();
            TrackSpeedData trackSpeedData = new TrackSpeedData();
            long j = dataIndex;
            trackSpeedData.setTime(hwExerciseAdviceData.getTimeInterval() * j);
            trackSpeedData.setRealTimeSpeed(dataSpeed);
            hwExerciseAdviceBean.getSpeedList().add(trackSpeedData);
            LogUtil.d(TAG, "trackSpeedDataTime: ", Long.valueOf(j * hwExerciseAdviceData.getTimeInterval()), "trackSpeedData speed: ", Integer.valueOf(dataSpeed));
            ridePowerData(list, workoutDataInfo, hwExerciseAdviceData, i, hwExerciseAdviceBean, gson);
            dataIndex++;
            hwExerciseAdviceData.setDataIndex(dataIndex);
        }
    }

    private void exerciseDetailsFields(WorkoutDataInfo workoutDataInfo, HwExerciseAdviceData hwExerciseAdviceData, MotionPathSimplify motionPathSimplify, int i, HwExerciseAdviceBean hwExerciseAdviceBean) throws JSONException {
        int dataHeartRate = workoutDataInfo.getDataHeartRate();
        LogUtil.d(TAG, "heart value: ", Integer.valueOf(dataHeartRate));
        int dataSpeed = workoutDataInfo.getDataSpeed();
        if (dataSpeed > hwExerciseAdviceBean.getTrackMaxPace()) {
            hwExerciseAdviceBean.setTrackMaxPace(dataSpeed);
        }
        long j = i;
        LogUtil.d(TAG, "workoutDataTimestamp: ", Long.valueOf(hwExerciseAdviceData.getTime() + (hwExerciseAdviceData.getTimeInterval() * j * 1000)), "6.9 detailWorkoutData data2 pace: ", Integer.valueOf(dataSpeed));
        hwExerciseAdviceBean.setTrackTotalPace(hwExerciseAdviceBean.getTrackTotalPace() + ((long) dataSpeed));
        int dataStepRate = workoutDataInfo.getDataStepRate();
        LogUtil.d(TAG, "step time: ", Long.valueOf(hwExerciseAdviceData.getTime() + (hwExerciseAdviceData.getTimeInterval() * j * 1000)), "6.9 detailWorkoutData data3 step: ", Integer.valueOf(dataStepRate));
        hwExerciseAdviceBean.setTrackTotalStep(hwExerciseAdviceBean.getTrackTotalStep() + dataStepRate);
        hwExerciseAdviceBean.setTrackMinuteStep(hwExerciseAdviceBean.getTrackMinuteStep() + dataStepRate);
        HeartRateData heartRateData = new HeartRateData();
        heartRateData.saveTime(hwExerciseAdviceData.getTime() + (hwExerciseAdviceData.getTimeInterval() * j * 1000));
        if (dataHeartRate > 0 && dataHeartRate < 255) {
            heartRateData.saveHeartRate(dataHeartRate);
            hwExerciseAdviceBean.setTrackTotalHeart(hwExerciseAdviceBean.getTrackTotalHeart() + ((long) dataHeartRate));
            hwExerciseAdviceBean.setTrackHeartTotalCount(hwExerciseAdviceBean.getTrackHeartTotalCount() + 1);
            hwExerciseAdviceBean.getHeartRateList().add(heartRateData);
            handleTrustHeartRateTag(motionPathSimplify, hwExerciseAdviceData.getDeviceCapability(), dataHeartRate);
        } else {
            heartRateData.saveHeartRate(-1);
            hwExerciseAdviceBean.getInvalidHeartRateList().add(heartRateData);
        }
        hwExerciseAdviceBean.setTrackMinuteStepCount(hwExerciseAdviceBean.getTrackMinuteStepCount() + 1);
        isNotSupportNewStep(hwExerciseAdviceData.getTime(), hwExerciseAdviceData.getTimeInterval(), dataStepRate, i, hwExerciseAdviceBean);
    }

    private void ridePowerData(List<String> list, WorkoutDataInfo workoutDataInfo, HwExerciseAdviceData hwExerciseAdviceData, int i, HwExerciseAdviceBean hwExerciseAdviceBean, Gson gson) throws JSONException {
        int ridePower = workoutDataInfo.getRidePower();
        RidePower ridePower2 = new RidePower();
        ridePower2.setPower(ridePower);
        long j = i;
        ridePower2.setTime(hwExerciseAdviceData.getTime() + (hwExerciseAdviceData.getTimeInterval() * j * 1000));
        hwExerciseAdviceBean.setPowerAccount(ridePower + hwExerciseAdviceBean.getPowerAccount());
        hwExerciseAdviceBean.getRidePowerList().add(ridePower2);
        gzt runPostureDataInfo = workoutDataInfo.getRunPostureDataInfo();
        int i2 = hwExerciseAdviceData.getTotal().has(HwExerciseConstants.JSON_NAME_WORKOUT_TYPE) ? hwExerciseAdviceData.getTotal().getInt(HwExerciseConstants.JSON_NAME_WORKOUT_TYPE) : -1;
        if (runPostureDataInfo != null) {
            StepRateData stepRateData = new StepRateData();
            stepRateData.setTime(hwExerciseAdviceData.getTime() + (hwExerciseAdviceData.getTimeInterval() * j * 1000));
            stepRateData.setStepRate(runPostureDataInfo.h());
            hwExerciseAdviceBean.getCadenceList().add(stepRateData);
        }
        if (runPostureDataInfo != null && i2 != 3 && i2 != 7) {
            LogUtil.a(TAG, "ridePowerData runPostureDataInfo: ", runPostureDataInfo.toString());
            dealRunPostData(runPostureDataInfo, hwExerciseAdviceBean.getPostureDataList(), hwExerciseAdviceData);
        }
        workTypeData(list, workoutDataInfo, hwExerciseAdviceData, i, hwExerciseAdviceBean);
        LinkedHashMap<String, String> extraDataMap = workoutDataInfo.getExtraDataMap();
        if (extraDataMap == null || extraDataMap.isEmpty()) {
            return;
        }
        LogUtil.a(TAG, "extraJsonObject:", HiJsonUtil.d(extraDataMap));
        extraDataMap.put("time", String.valueOf(((long) hwExerciseAdviceData.getDataIndex()) * hwExerciseAdviceData.getTimeInterval()));
        extraDataMap.put("timeStamp", String.valueOf(hwExerciseAdviceData.getTime() + (hwExerciseAdviceData.getTimeInterval() * j * 1000)));
        hwExerciseAdviceBean.getExtraDataList().add(extraDataMap);
    }

    private void dealRunPostData(gzt gztVar, ArrayList<gzv> arrayList, HwExerciseAdviceData hwExerciseAdviceData) {
        gzv gzvVar = new gzv();
        gzvVar.a(((long) hwExerciseAdviceData.getDataIndex()) * hwExerciseAdviceData.getTimeInterval());
        gzvVar.a(gztVar.c());
        int iB = gztVar.b();
        int iF = gztVar.f();
        int iK = gztVar.k();
        int iE = gztVar.e();
        int iA = gztVar.a();
        int iO = gztVar.o();
        int iJ = gztVar.j();
        int iG = gztVar.g();
        int i = gztVar.i();
        int iL = gztVar.l();
        gzvVar.c(iE);
        gzvVar.d(iB);
        gzvVar.b(iF);
        gzvVar.g(iK);
        gzvVar.e(iA);
        gzvVar.j(iO);
        gzvVar.a(iJ);
        gzvVar.i(iG);
        gzvVar.h(i);
        gzvVar.f(iL);
        arrayList.add(gzvVar);
    }

    private void handleTrustHeartRateTag(MotionPathSimplify motionPathSimplify, DeviceCapability deviceCapability, int i) {
        if (deviceCapability != null && deviceCapability.isSupportWorkoutTrustHeartRate() && i == 254) {
            motionPathSimplify.addExtendDataMap("isTrustHeartRate", "1");
        }
    }

    private void isNotSupportNewStep(long j, long j2, int i, int i2, HwExerciseAdviceBean hwExerciseAdviceBean) {
        if (hwExerciseAdviceBean.isSupportNewStep()) {
            StepRateData stepRateData = new StepRateData();
            long j3 = j + (j2 * ((long) i2) * 1000);
            stepRateData.setTime(j3);
            stepRateData.setStepRate(i);
            hwExerciseAdviceBean.getStepList().add(stepRateData);
            hwExerciseAdviceBean.setTrackMinuteStep(i);
            if (hwExerciseAdviceBean.getTrackMinuteStep() > hwExerciseAdviceBean.getTrackMaxStep()) {
                hwExerciseAdviceBean.setTrackMaxStep(hwExerciseAdviceBean.getTrackMinuteStep());
                hwExerciseAdviceBean.setStepLastIndex(hwExerciseAdviceBean.getStepList().size() - 1);
            }
            LogUtil.d(TAG, "newStepTime: ", Long.valueOf(j3), "detailArray data step: ", Integer.valueOf(i), "trackMinuteStep: ", Integer.valueOf(hwExerciseAdviceBean.getTrackMinuteStep()));
            return;
        }
        oldStepDeal(hwExerciseAdviceBean);
    }

    private void oldStepDeal(HwExerciseAdviceBean hwExerciseAdviceBean) {
        if (hwExerciseAdviceBean.getTrackMinuteStepCount() % 12 == 0) {
            StepRateData stepRateData = new StepRateData();
            stepRateData.setTime(hwExerciseAdviceBean.getTrackMinuteStepTimestamp());
            stepRateData.setStepRate(hwExerciseAdviceBean.getTrackMinuteStep());
            hwExerciseAdviceBean.getStepList().add(stepRateData);
            if (hwExerciseAdviceBean.getTrackMinuteStep() > hwExerciseAdviceBean.getTrackMaxStep()) {
                hwExerciseAdviceBean.setTrackMaxStep(hwExerciseAdviceBean.getTrackMinuteStep());
                hwExerciseAdviceBean.setStepLastIndex(hwExerciseAdviceBean.getStepList().size() - 1);
            }
            LogUtil.d(TAG, "trackMinuteStepTimestamp: ", Long.valueOf(hwExerciseAdviceBean.getTrackMinuteStepTimestamp()), " max step: ", Integer.valueOf(hwExerciseAdviceBean.getTrackMinuteStep()));
            hwExerciseAdviceBean.setTrackMinuteStep(0);
        }
    }

    private void workTypeData(List<String> list, WorkoutDataInfo workoutDataInfo, HwExerciseAdviceData hwExerciseAdviceData, int i, HwExerciseAdviceBean hwExerciseAdviceBean) throws JSONException {
        int i2 = hwExerciseAdviceData.getTotal().has(HwExerciseConstants.JSON_NAME_WORKOUT_TYPE) ? hwExerciseAdviceData.getTotal().getInt(HwExerciseConstants.JSON_NAME_WORKOUT_TYPE) : -1;
        if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4) {
            if (i2 == 6 || i2 == 8) {
                swolfBitMap(list, workoutDataInfo, hwExerciseAdviceData, hwExerciseAdviceBean);
                return;
            }
            if (i2 != 11 && i2 != 25 && i2 != 214 && i2 != 222 && i2 != 233) {
                if (i2 == 21) {
                    int dataFrequency = workoutDataInfo.getDataFrequency();
                    SkippingSpeed skippingSpeed = new SkippingSpeed();
                    skippingSpeed.setTime(hwExerciseAdviceData.getTime() + (hwExerciseAdviceData.getTimeInterval() * ((long) i) * 1000));
                    skippingSpeed.setSpeed(dataFrequency);
                    hwExerciseAdviceBean.getFrequencyList().add(skippingSpeed);
                    return;
                }
                if (i2 != 22 && i2 != 226 && i2 != 227 && i2 != 229 && i2 != 230) {
                    switch (i2) {
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                            break;
                        default:
                            LogUtil.d(TAG, "in default");
                            break;
                    }
                    return;
                }
            }
        }
        if (list.size() < 5) {
            return;
        }
        LogUtil.d(TAG, "capacityBitMap altitude: ", list.get(5));
        if ("1".equals(list.get(5))) {
            int dataAttitude = workoutDataInfo.getDataAttitude();
            TrackAltitudeData trackAltitudeData = new TrackAltitudeData();
            long j = i;
            trackAltitudeData.setTime(hwExerciseAdviceData.getTime() + (hwExerciseAdviceData.getTimeInterval() * j * 1000));
            trackAltitudeData.setAltitude(((double) dataAttitude) / 10.0d);
            hwExerciseAdviceBean.getAltitudeList().add(trackAltitudeData);
            LogUtil.d(TAG, "altitude current time: ", Long.valueOf(hwExerciseAdviceData.getTime() + (hwExerciseAdviceData.getTimeInterval() * j * 1000)), "6.9 detailWorkoutData data6 altitude: ", Integer.valueOf(dataAttitude));
        }
    }

    private void swolfBitMap(List<String> list, WorkoutDataInfo workoutDataInfo, HwExerciseAdviceData hwExerciseAdviceData, HwExerciseAdviceBean hwExerciseAdviceBean) {
        LogUtil.a(TAG, "capacityBitMap Swolf, TimeInterval: ", Long.valueOf(hwExerciseAdviceData.getTimeInterval()), " DataIndex: ", Integer.valueOf(hwExerciseAdviceData.getDataIndex()));
        if (list.size() >= 4 && "1".equals(list.get(3))) {
            int dataSwolf = workoutDataInfo.getDataSwolf();
            TrackSwolfData trackSwolfData = new TrackSwolfData();
            trackSwolfData.setTime(((long) hwExerciseAdviceData.getDataIndex()) * hwExerciseAdviceData.getTimeInterval());
            trackSwolfData.setSwolf(dataSwolf);
            hwExerciseAdviceBean.getSwolfList().add(trackSwolfData);
            LogUtil.d(TAG, "time: ", Long.valueOf(((long) hwExerciseAdviceData.getDataIndex()) * hwExerciseAdviceData.getTimeInterval()), "6.9 detailWorkoutData data4 swolf: ", Integer.valueOf(dataSwolf));
        }
        if (list.size() >= 5) {
            LogUtil.d(TAG, "capacityBitMap pullFrequent: ", list.get(4));
            if ("1".equals(list.get(4))) {
                int dataSwimRate = workoutDataInfo.getDataSwimRate();
                TrackPullFreqData trackPullFreqData = new TrackPullFreqData();
                trackPullFreqData.setTime(((long) hwExerciseAdviceData.getDataIndex()) * hwExerciseAdviceData.getTimeInterval());
                trackPullFreqData.setPullFreq(dataSwimRate);
                hwExerciseAdviceBean.getPullFrequentList().add(trackPullFreqData);
                LogUtil.d(TAG, "pullFrequent time: ", Long.valueOf(((long) hwExerciseAdviceData.getDataIndex()) * hwExerciseAdviceData.getTimeInterval()), "6.9 detailWorkoutData data5 pullFrequent: ", Integer.valueOf(dataSwimRate));
            }
        }
    }
}
