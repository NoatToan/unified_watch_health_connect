package com.huawei.healthcloud.plugintrack.golf.h5;

import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.google.gson.JsonSyntaxException;
import com.huawei.health.h5pro.service.anotation.H5ProMethod;
import com.huawei.health.h5pro.service.anotation.H5ProService;
import com.huawei.health.healthdatamgr.api.HealthDataMgrApi;
import com.huawei.healthcloud.plugintrack.golf.Utils;
import com.huawei.healthcloud.plugintrack.golf.bean.GolfCourseData;
import com.huawei.healthcloud.plugintrack.golf.bean.GolfGetLocation;
import com.huawei.healthcloud.plugintrack.golf.bean.GolfHistoryDetail;
import com.huawei.healthcloud.plugintrack.golf.bean.GolfHistoryGraph;
import com.huawei.healthcloud.plugintrack.golf.bean.GolfLocationData;
import com.huawei.healthcloud.plugintrack.golf.device.GolfDeviceProxy;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwfoundationmodel.trackmodel.HeartRateData;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsportmodel.CommonSegment;
import com.huawei.hwsportmodel.TrackGolfCourseSegment;
import com.huawei.operation.ble.BleConstants;
import com.huawei.skinner.internal.OnRegisterSkinAttrsListener;
import defpackage.een;
import defpackage.jac;
import defpackage.jaf;
import defpackage.jpg;
import defpackage.lsg;
import defpackage.njy;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@H5ProService(name = "GolfH5NativeInterface", users = {"", "", "9ea3f06fe2dea3e2c7c21ea1ba1e07c370a786c68417a4a96cb986576883e10f"})
public class GolfH5NativeInterface {
    private static final int BACKGROUND_LOCATION_PERMISSION = 2;
    private static final int DEFAULT_FAILURE_CODE = 1;
    public static final int DEFAULT_SUCCESS_CODE = 0;
    public static final int DEVICE_NOT_SUPPORT_GOLF = 2;
    public static final int DEVICE_SUPPORT_V2_SUCCESS_CODE = 3;
    public static final int DEVICE_SUPPORT_V3_SUCCESS_CODE = 4;
    private static final int ERROR_CODE_FAILURE_LOCATION_PERMISSION = 12;
    private static final String INPUT_SPORT_HISTORY_START_TIME = "input_sport_history_start_time";
    private static final int NO_LOCATION_PERMISSION = 3;
    private static final int RUNNING_LOCATION_PERMISSION = 1;
    private static final String TAG = "Track_GolfH5LogicManager";

    @H5ProMethod(name = "getGolfHistoryDetail")
    public static void getGolfHistoryDetail(long j, long j2, int i, final GolfH5Callback<GolfHistoryDetail> golfH5Callback) {
        LogUtil.a(TAG, "call getGolfHistoryDetail enter startTime:", Long.valueOf(j), " ,endTime:", Long.valueOf(j2), " ,sportType:", Integer.valueOf(i));
        HealthDataMgrApi healthDataMgrApi = (HealthDataMgrApi) Services.d("HWHealthDataMgr", HealthDataMgrApi.class);
        if (healthDataMgrApi == null) {
            LogUtil.j(TAG, "getGolfHistoryDetail healthDataMgrApi is null.");
            golfH5Callback.onFailure(1, "getGolfHistoryDetail healthDataMgrApi is null");
        } else {
            healthDataMgrApi.requestTrackDetailData(j, j2, new IBaseResponseCallback() { // from class: com.huawei.healthcloud.plugintrack.golf.h5.GolfH5NativeInterface.1
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i2, Object obj) {
                    if (i2 != 0) {
                        LogUtil.j(GolfH5NativeInterface.TAG, "HistoryDetail requestTrackDetailData not success");
                        golfH5Callback.onFailure(1, "HistoryDetail requestTrackDetailData not success");
                    }
                    if (obj == null) {
                        LogUtil.j(GolfH5NativeInterface.TAG, "HistoryDetail requestTrackDetailData objData null");
                        golfH5Callback.onFailure(1, "HistoryDetail requestTrackDetailData objData is null");
                    }
                    if (!njy.b(obj, HiHealthData.class)) {
                        LogUtil.j(GolfH5NativeInterface.TAG, "HistoryDetail objData not instanceof List");
                        golfH5Callback.onFailure(1, "HistoryDetail requestTrackDetailData objData not instanceof List");
                    }
                    GolfH5NativeInterface.parsingDetailData(i2, obj, golfH5Callback);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void parsingDetailData(int i, Object obj, GolfH5Callback<GolfHistoryDetail> golfH5Callback) {
        if (obj == null || golfH5Callback == null) {
            LogUtil.j(TAG, "parsingDetailData: objData or callback is null.");
            golfH5Callback.onFailure(1, "objData or callback is null");
            return;
        }
        GolfHistoryDetail golfHistoryDetail = new GolfHistoryDetail();
        List list = (List) obj;
        if (list.isEmpty() || list.get(0) == null) {
            LogUtil.j(TAG, "parsingDetailData list size 0.");
            golfH5Callback.onFailure(1, "parsingDetailData list size 0");
            return;
        }
        HiHealthData hiHealthData = (HiHealthData) list.get(0);
        try {
            HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) HiJsonUtil.d(hiHealthData.getMetaData(), HiTrackMetaData.class);
            int i2 = hiHealthData.getInt("trackdata_deviceType");
            String strB = een.b(i2, BaseApplication.getContext(), BaseApplication.getContext().getPackageName(), hiHealthData.getString("device_prodid"), hiHealthData.getString("device_subprodid"));
            golfHistoryDetail.setDeviceName(strB);
            golfHistoryDetail.setDeviceUniqueCode(hiHealthData.getString("device_uniquecode"));
            LogUtil.a(TAG, "parsingDetailData: deviceType=" + i2, "deviceName=" + strB);
            golfHistoryDetail.setWorkoutStartTime(hiHealthData.getStartTime());
            golfHistoryDetail.setWorkoutEndTime(hiHealthData.getEndTime());
            golfHistoryDetail.setSportTimestamp(hiHealthData.getStartTime());
            setTrackDetailData(golfHistoryDetail, hiTrackMetaData);
            String sequenceFileUrl = hiHealthData.getSequenceFileUrl();
            if (TextUtils.isEmpty(sequenceFileUrl)) {
                LogUtil.j(TAG, "parsingDetailData fileUrl is null");
                golfH5Callback.onFailure(1, "parsingDetailData fileUrl is null");
                return;
            }
            MotionPath motionPathD = jac.d(BaseApplication.getActivity(), sequenceFileUrl, 286);
            if (motionPathD == null) {
                LogUtil.j(TAG, "parsingDetailData motionPath is null");
                golfH5Callback.onFailure(1, "parsingDetailData motionPath is null");
                return;
            }
            List<CommonSegment> listRequestSegmentList = motionPathD.requestSegmentList();
            ArrayList arrayList = new ArrayList();
            Iterator<CommonSegment> it = listRequestSegmentList.iterator();
            while (it.hasNext()) {
                arrayList.add((TrackGolfCourseSegment) it.next());
            }
            golfHistoryDetail.setRecordCard(arrayList);
            golfH5Callback.onSuccess(golfHistoryDetail);
            LogUtil.a(TAG, "parsingDetailData: " + golfHistoryDetail.toString());
        } catch (JsonSyntaxException unused) {
            LogUtil.j(TAG, "analyzeTrackDetailData trackMetaData is error");
            golfH5Callback.onFailure(1, "analyze trackMetaData error");
        }
    }

    private static boolean saveSequenceFile(String str, String str2, List<TrackGolfCourseSegment> list) {
        MotionPath motionPathD = jac.d(BaseApplication.getActivity(), str, 286);
        if (motionPathD == null) {
            LogUtil.e(TAG, "Failed to handleSaveGolfData: motionPath is null");
            return false;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        motionPathD.saveSegmentList(arrayList);
        return jaf.e(BaseApplication.getContext(), motionPathD, str2, true);
    }

    private static HiTrackMetaData getHiTrackMetaData(String str) {
        try {
            return (HiTrackMetaData) HiJsonUtil.d(str, HiTrackMetaData.class);
        } catch (JsonSyntaxException unused) {
            LogUtil.e(TAG, "getHiTrackMetaData trackMetaData is not JSON");
            return null;
        }
    }

    private static HiTrackMetaData getTrackMetaDataFromGolfHistoryDetail(GolfHistoryDetail golfHistoryDetail, HiTrackMetaData hiTrackMetaData) {
        hiTrackMetaData.setSportType(golfHistoryDetail.getWorkoutType());
        hiTrackMetaData.setSportId(golfHistoryDetail.getWorkoutRecordId());
        hiTrackMetaData.setTotalCalories(golfHistoryDetail.getWorkoutCalorie());
        hiTrackMetaData.setTotalSteps(golfHistoryDetail.getWorkoutStep());
        hiTrackMetaData.setTotalTime(golfHistoryDetail.getWorkoutTotalTime());
        hiTrackMetaData.setDuplicated(golfHistoryDetail.getDuplicated());
        HashMap map = new HashMap();
        map.put("golfSwingCount", golfHistoryDetail.getGolfSwingCount());
        map.put("courseId", golfHistoryDetail.getCourseId());
        map.put("branchId1", golfHistoryDetail.getBranchId1());
        map.put("branchId2", golfHistoryDetail.getBranchId2());
        map.put("eagle", golfHistoryDetail.getEagle());
        map.put("birdie", golfHistoryDetail.getBirdie());
        map.put("par", golfHistoryDetail.getPar());
        map.put("bogey", golfHistoryDetail.getBogey());
        map.put("bogey2", golfHistoryDetail.getBogey2());
        map.put("tripleBogey", golfHistoryDetail.getTripleBogey());
        map.put("putts", golfHistoryDetail.getPutts());
        map.put("avgPutts", golfHistoryDetail.getAvgPutts());
        map.put("gir", golfHistoryDetail.getGir());
        map.put("avgPar3", golfHistoryDetail.getAvgPar3());
        map.put("avgPar4", golfHistoryDetail.getAvgPar4());
        map.put("avgPar5", golfHistoryDetail.getAvgPar5());
        map.put("fairwayLeft", golfHistoryDetail.getFairwayLeft());
        map.put("fairwayHits", golfHistoryDetail.getFairwayHits());
        map.put("fairwayRight", golfHistoryDetail.getFairwayRight());
        map.put("avgHandicap", golfHistoryDetail.getAvgHandicap());
        map.put("bestHandicap", golfHistoryDetail.getBestHandicap());
        map.put("totalHandicap", golfHistoryDetail.getTotalHandicap());
        map.put("totalHoles", golfHistoryDetail.getTotalHoles());
        map.put("doubleEagle", golfHistoryDetail.getDoubleEagle());
        map.put(HwExerciseConstants.JSON_NAME_ACTIVECALORIE, golfHistoryDetail.getActiveCalorie());
        hiTrackMetaData.setExtendTrackDataMap(map);
        hiTrackMetaData.setSportDataSource(2);
        return hiTrackMetaData;
    }

    private static void setTrackDetailData(GolfHistoryDetail golfHistoryDetail, HiTrackMetaData hiTrackMetaData) {
        golfHistoryDetail.setWorkoutType(hiTrackMetaData.getSportType());
        golfHistoryDetail.setWorkoutRecordId(hiTrackMetaData.getSportId());
        golfHistoryDetail.setWorkoutCalorie(hiTrackMetaData.getTotalCalories());
        golfHistoryDetail.setWorkoutStep(hiTrackMetaData.getTotalSteps());
        golfHistoryDetail.setWorkoutTotalTime(hiTrackMetaData.getTotalTime());
        golfHistoryDetail.setDuplicated(hiTrackMetaData.getDuplicated());
        golfHistoryDetail.setAvgHeartRate(hiTrackMetaData.getAvgHeartRate());
        Map<String, String> extendTrackMap = hiTrackMetaData.getExtendTrackMap();
        golfHistoryDetail.setGolfSwingCount(extendTrackMap.get("golfSwingCount"));
        golfHistoryDetail.setCourseId(extendTrackMap.get("courseId"));
        golfHistoryDetail.setBranchId1(extendTrackMap.get("branchId1"));
        golfHistoryDetail.setBranchId2(extendTrackMap.get("branchId2"));
        golfHistoryDetail.setEagle(extendTrackMap.get("eagle"));
        golfHistoryDetail.setBirdie(extendTrackMap.get("birdie"));
        golfHistoryDetail.setPar(extendTrackMap.get("par"));
        golfHistoryDetail.setBogey(extendTrackMap.get("bogey"));
        golfHistoryDetail.setBogey2(extendTrackMap.get("bogey2"));
        golfHistoryDetail.setTripleBogey(extendTrackMap.get("tripleBogey"));
        golfHistoryDetail.setPutts(extendTrackMap.get("putts"));
        golfHistoryDetail.setAvgPutts(extendTrackMap.get("avgPutts"));
        golfHistoryDetail.setGir(extendTrackMap.get("gir"));
        golfHistoryDetail.setAvgPar3(extendTrackMap.get("avgPar3"));
        golfHistoryDetail.setAvgPar4(extendTrackMap.get("avgPar4"));
        golfHistoryDetail.setAvgPar5(extendTrackMap.get("avgPar5"));
        golfHistoryDetail.setFairwayLeft(extendTrackMap.get("fairwayLeft"));
        golfHistoryDetail.setFairwayHits(extendTrackMap.get("fairwayHits"));
        golfHistoryDetail.setFairwayRight(extendTrackMap.get("fairwayRight"));
        golfHistoryDetail.setAvgHandicap(extendTrackMap.get("avgHandicap"));
        golfHistoryDetail.setBestHandicap(extendTrackMap.get("bestHandicap"));
        golfHistoryDetail.setTotalHandicap(extendTrackMap.get("totalHandicap"));
        golfHistoryDetail.setTotalHoles(extendTrackMap.get("totalHoles"));
        golfHistoryDetail.setDoubleEagle(extendTrackMap.get("doubleEagle"));
        golfHistoryDetail.setActiveCalorie(extendTrackMap.get(HwExerciseConstants.JSON_NAME_ACTIVECALORIE));
        golfHistoryDetail.setGolfSwingTempo(CommonUtil.n(BaseApplication.getContext(), extendTrackMap.get("golfSwingTempo")));
        golfHistoryDetail.setGolfBackSwingTime(CommonUtil.m(BaseApplication.getContext(), extendTrackMap.get("golfBackSwingTime")));
        golfHistoryDetail.setGolfDownSwingTime(CommonUtil.m(BaseApplication.getContext(), extendTrackMap.get("golfDownSwingTime")));
        golfHistoryDetail.setGolfMaxSwingSpeed(CommonUtil.n(BaseApplication.getContext(), extendTrackMap.get("golfMaxSwingSpeed")));
        golfHistoryDetail.setGolfSwingSpeed(CommonUtil.n(BaseApplication.getContext(), extendTrackMap.get("golfSwingSpeed")));
        golfHistoryDetail.setAlias(extendTrackMap.get("alias"));
        golfHistoryDetail.setGolfCourseName(extendTrackMap.get("golfCourseName"));
    }

    @H5ProMethod(name = "insertGolfData")
    public static void insertGolfData(Long l, Long l2, final GolfHistoryDetail golfHistoryDetail, final GolfH5Callback<Integer> golfH5Callback) {
        if (l == null || l2 == null) {
            LogUtil.e(TAG, "Failed to insertGolfData: startTimeOld or endTimeOld is null");
            golfH5Callback.onFailure(1, "startTimeOld or endTimeOld is null");
        }
        LogUtil.a(TAG, "Start to insertGolfData startTimeOld:", l, ", endTimeOld:", l2, ", startTimeNew:", Long.valueOf(golfHistoryDetail.getWorkoutStartTime()), ", endTimeNew:", Long.valueOf(golfHistoryDetail.getWorkoutEndTime()));
        HealthDataMgrApi healthDataMgrApi = (HealthDataMgrApi) Services.d("HWHealthDataMgr", HealthDataMgrApi.class);
        if (healthDataMgrApi == null) {
            LogUtil.e(TAG, "InsertGolfData : healthDataMgrApi is null.");
            golfH5Callback.onFailure(1, "insertGolfData healthDataMgrApi is null");
        } else {
            healthDataMgrApi.requestTrackDetailData(l.longValue(), l2.longValue(), new IBaseResponseCallback() { // from class: com.huawei.healthcloud.plugintrack.golf.h5.GolfH5NativeInterface$$ExternalSyntheticLambda1
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    GolfH5NativeInterface.lambda$insertGolfData$0(golfH5Callback, golfHistoryDetail, i, obj);
                }
            });
        }
    }

    static /* synthetic */ void lambda$insertGolfData$0(GolfH5Callback golfH5Callback, GolfHistoryDetail golfHistoryDetail, int i, Object obj) {
        if (i != 0) {
            LogUtil.e(TAG, "scoreCard requestTrackDetailData not success, errorCode=", Integer.valueOf(i));
            golfH5Callback.onFailure(1, "scoreCard requestTrackDetailData not success");
        }
        if (obj == null) {
            LogUtil.e(TAG, "scoreCard requestTrackDetailData objData null");
            golfH5Callback.onFailure(1, "scoreCard requestTrackDetailData objData null");
        }
        if (!njy.b(obj, HiHealthData.class)) {
            LogUtil.e(TAG, "scoreCard requestTrackDetailData objData not instanceof List");
            golfH5Callback.onFailure(1, "scoreCard requestTrackDetailData objData not instanceof List");
        }
        List list = (List) obj;
        if (list.isEmpty() || list.get(0) == null) {
            LogUtil.e(TAG, "requestTrackDetailData list size 0.");
            golfH5Callback.onFailure(1, "parsingRecordCardData list size 0");
        } else {
            handleSaveGolfData((HiHealthData) list.get(0), golfHistoryDetail, golfH5Callback);
        }
    }

    private static void handleSaveGolfData(final HiHealthData hiHealthData, GolfHistoryDetail golfHistoryDetail, final GolfH5Callback<Integer> golfH5Callback) {
        HiTrackMetaData hiTrackMetaData = getHiTrackMetaData(hiHealthData.getMetaData());
        if (hiTrackMetaData == null) {
            golfH5Callback.onFailure(1, "Analyze trackMetaData error");
            return;
        }
        if (!handleSequence(hiHealthData, golfHistoryDetail)) {
            LogUtil.e(TAG, "Failed to handleSequence");
            golfH5Callback.onFailure(1, "Failed to handleSequence");
            return;
        }
        final HiTrackMetaData trackMetaDataFromGolfHistoryDetail = getTrackMetaDataFromGolfHistoryDetail(golfHistoryDetail, hiTrackMetaData);
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiHealthData.setType(OnRegisterSkinAttrsListener.REGISTER_BY_SCAN);
        hiHealthData.setSequenceFileUrl("motion_path_golf_copy.txt");
        hiHealthData.setStartTime(golfHistoryDetail.getWorkoutStartTime());
        hiHealthData.setEndTime(golfHistoryDetail.getWorkoutEndTime());
        hiHealthData.setDeviceUuid(golfHistoryDetail.getDeviceUniqueCode());
        hiHealthData.setMetaData(HiJsonUtil.d(trackMetaDataFromGolfHistoryDetail));
        hiHealthData.setSyncStatus(0);
        hiDataInsertOption.addData(hiHealthData);
        HiHealthManager.d(BaseApplication.getContext()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: com.huawei.healthcloud.plugintrack.golf.h5.GolfH5NativeInterface.2
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj) {
                jaf.c(BaseApplication.getContext(), "motion_path_golf_copy.txt");
                if (i != 0) {
                    golfH5Callback.onFailure(i, HiJsonUtil.d(obj));
                } else {
                    GolfH5NativeInterface.refreshSportDataToSportHistory(hiHealthData, trackMetaDataFromGolfHistoryDetail);
                    golfH5Callback.onSuccess(Integer.valueOf(i));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void refreshSportDataToSportHistory(HiHealthData hiHealthData, HiTrackMetaData hiTrackMetaData) {
        Intent intent = new Intent(INPUT_SPORT_HISTORY_START_TIME);
        intent.setClass(BaseApplication.getContext(), GolfH5NativeInterface.class);
        intent.putExtra("startTime", hiHealthData.getStartTime());
        intent.putExtra("endTime", hiHealthData.getEndTime());
        intent.putExtra("chiefType", 6);
        intent.putExtra("trackType", hiTrackMetaData.getTrackType());
        intent.putExtra(BleConstants.SPORT_TYPE, hiTrackMetaData.getSportType());
        intent.putExtra("duration", hiTrackMetaData.getTotalTime());
        intent.putExtra("calorie", hiTrackMetaData.getTotalCalories());
        intent.putExtra("golfSwingCount", hiTrackMetaData.getExtendTrackMap().get("golfSwingCount"));
        intent.putExtra("totalHandicap", hiTrackMetaData.getExtendTrackMap().get("totalHandicap"));
        LogUtil.a(TAG, "refreshSportDataToSportHistory");
        BroadcastManagerUtil.a(BaseApplication.getContext(), intent);
    }

    private static boolean handleSequence(HiHealthData hiHealthData, GolfHistoryDetail golfHistoryDetail) {
        String sequenceFileUrl = hiHealthData.getSequenceFileUrl();
        if (StringUtils.g(sequenceFileUrl)) {
            LogUtil.e(TAG, "sequenceFileUrl is null");
            return false;
        }
        if (saveSequenceFile(sequenceFileUrl, "motion_path_golf_copy.txt", golfHistoryDetail.getRecordCard())) {
            hiHealthData.setSequenceFileUrl("motion_path_golf_copy.txt");
            return true;
        }
        LogUtil.e(TAG, "Failed to saveSequenceFile");
        return false;
    }

    @H5ProMethod(name = "getGolfStartTimeList")
    public static void getGolfStartTimeList(long j, long j2, final GolfH5Callback<List<Long>> golfH5Callback) {
        LogUtil.a(TAG, "Start to getGolfStartTimeList startTime=" + j, ", endTime=", Long.valueOf(j2));
        HealthDataMgrApi healthDataMgrApi = (HealthDataMgrApi) Services.d("HWHealthDataMgr", HealthDataMgrApi.class);
        if (healthDataMgrApi == null) {
            LogUtil.e(TAG, "getGolfStartTimeList healthDataMgrApi is null.");
            golfH5Callback.onFailure(1, "getGolfStartTimeList healthDataMgrApi is null");
        } else {
            healthDataMgrApi.getGolfStartTimeList(j, j2, new IBaseResponseCallback() { // from class: com.huawei.healthcloud.plugintrack.golf.h5.GolfH5NativeInterface$$ExternalSyntheticLambda0
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    GolfH5NativeInterface.lambda$getGolfStartTimeList$1(golfH5Callback, i, obj);
                }
            });
        }
    }

    static /* synthetic */ void lambda$getGolfStartTimeList$1(GolfH5Callback golfH5Callback, int i, Object obj) {
        if (i == 0) {
            golfH5Callback.onSuccess((List) obj);
        } else {
            golfH5Callback.onFailure(-1, "");
        }
    }

    @H5ProMethod(name = "getGolfHistoryGraph")
    public static void getGolfHistoryGraph(long j, long j2, int i, final GolfH5Callback<GolfHistoryGraph> golfH5Callback) {
        LogUtil.a(TAG, "call getGolfHistoryGraph enter startTime:", Long.valueOf(j), " ,endTime:", Long.valueOf(j2), " ,sportType:", Integer.valueOf(i));
        HealthDataMgrApi healthDataMgrApi = (HealthDataMgrApi) Services.d("HWHealthDataMgr", HealthDataMgrApi.class);
        if (healthDataMgrApi == null) {
            LogUtil.j(TAG, "getGolfHistoryGraph healthDataMgrApi is null.");
            golfH5Callback.onFailure(1, "getGolfHistoryGraph healthDataMgrApi is null");
        } else {
            healthDataMgrApi.requestTrackDetailData(j, j2, new IBaseResponseCallback() { // from class: com.huawei.healthcloud.plugintrack.golf.h5.GolfH5NativeInterface.3
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i2, Object obj) {
                    if (i2 != 0) {
                        LogUtil.j(GolfH5NativeInterface.TAG, "HistoryGraph requestTrackDetailData not success");
                        golfH5Callback.onFailure(1, "HistoryGraph requestTrackDetailData not success");
                    }
                    if (obj == null) {
                        LogUtil.j(GolfH5NativeInterface.TAG, "HistoryGraph requestTrackDetailData objData null");
                        golfH5Callback.onFailure(1, "HistoryGraph objData is null");
                    }
                    if (!njy.b(obj, HiHealthData.class)) {
                        LogUtil.j(GolfH5NativeInterface.TAG, "HistoryGraph objData not instanceof List");
                        golfH5Callback.onFailure(1, "objData not instanceof List");
                    }
                    GolfH5NativeInterface.parsingGraphData(i2, obj, golfH5Callback);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void parsingGraphData(int i, Object obj, GolfH5Callback<GolfHistoryGraph> golfH5Callback) {
        if (obj == null || golfH5Callback == null) {
            LogUtil.j(TAG, "parsingGraphData: objData or callback is null.");
            golfH5Callback.onFailure(1, "objData or callback is null");
            return;
        }
        List list = (List) obj;
        if (list.isEmpty() || list.get(0) == null) {
            LogUtil.j(TAG, "parsingGraphData list size 0.");
            golfH5Callback.onFailure(1, "parsingGraphData list size 0");
            return;
        }
        GolfHistoryGraph golfHistoryGraph = new GolfHistoryGraph();
        HiHealthData hiHealthData = (HiHealthData) list.get(0);
        String sequenceFileUrl = hiHealthData.getSequenceFileUrl();
        if (TextUtils.isEmpty(sequenceFileUrl)) {
            LogUtil.j(TAG, "parsingGraphData fileUrl is null");
            golfH5Callback.onFailure(1, "parsingGraphData fileUrl is null");
            return;
        }
        setGraphExtendData(golfHistoryGraph, hiHealthData, golfH5Callback);
        MotionPath motionPathD = jac.d(BaseApplication.getActivity(), sequenceFileUrl, 286);
        if (motionPathD == null) {
            LogUtil.j(TAG, "parsingGraphData motionPath is null");
            golfH5Callback.onFailure(i, "parsingGraphData motionPath is null");
            return;
        }
        List<CommonSegment> listRequestSegmentList = motionPathD.requestSegmentList();
        ArrayList arrayList = new ArrayList();
        Iterator<CommonSegment> it = listRequestSegmentList.iterator();
        while (it.hasNext()) {
            arrayList.add((TrackGolfCourseSegment) it.next());
        }
        golfHistoryGraph.setRecordCard(arrayList);
        ArrayList<HeartRateData> arrayListRequestHeartRateList = motionPathD.requestHeartRateList();
        ArrayList<HeartRateData> arrayListRequestInvalidHeartRateList = motionPathD.requestInvalidHeartRateList();
        golfHistoryGraph.setHeartRateList(arrayListRequestHeartRateList);
        golfHistoryGraph.setInvalidHeartRateList(arrayListRequestInvalidHeartRateList);
        golfH5Callback.onSuccess(golfHistoryGraph);
        LogUtil.a(TAG, "parsingGraphData: " + golfHistoryGraph);
    }

    private static void setGraphExtendData(GolfHistoryGraph golfHistoryGraph, HiHealthData hiHealthData, GolfH5Callback<GolfHistoryGraph> golfH5Callback) {
        if (hiHealthData == null) {
            LogUtil.j(TAG, "setGraphExtendData: hiHealthData is null");
            return;
        }
        try {
            HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) HiJsonUtil.d(hiHealthData.getMetaData(), HiTrackMetaData.class);
            if (hiTrackMetaData == null) {
                LogUtil.j(TAG, "setGraphExtendData: trackMetaData is null");
                return;
            }
            String str = hiTrackMetaData.getExtendTrackMap().get("avgHandicap");
            String str2 = hiTrackMetaData.getExtendTrackMap().get("bestHandicap");
            golfHistoryGraph.setAvgHandicap(str);
            golfHistoryGraph.setBestHandicap(str2);
        } catch (JsonSyntaxException unused) {
            LogUtil.j(TAG, "parsingGraphData analyze trackMetaData is error");
            golfH5Callback.onFailure(1, "parsingGraphData analyze trackMetaData error");
        }
    }

    @H5ProMethod(name = "getGolfHistoryScoreCard")
    public static void getGolfHistoryScoreCard(long j, long j2, final GolfH5Callback<List<TrackGolfCourseSegment>> golfH5Callback) {
        LogUtil.a(TAG, "call getGolfHistoryScoreCard success");
        HealthDataMgrApi healthDataMgrApi = (HealthDataMgrApi) Services.d("HWHealthDataMgr", HealthDataMgrApi.class);
        if (healthDataMgrApi == null) {
            LogUtil.j(TAG, "getGolfHistoryDetail : healthDataMgrApi is null.");
            golfH5Callback.onFailure(1, "getGolfHistoryGraph healthDataMgrApi is null");
        } else {
            healthDataMgrApi.requestTrackDetailData(j, j2, new IBaseResponseCallback() { // from class: com.huawei.healthcloud.plugintrack.golf.h5.GolfH5NativeInterface.4
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    if (i != 0) {
                        LogUtil.j(GolfH5NativeInterface.TAG, "scoreCard requestTrackDetailData not success, errorCode=", Integer.valueOf(i));
                        golfH5Callback.onFailure(1, "scoreCard requestTrackDetailData not success");
                    }
                    if (obj == null) {
                        LogUtil.j(GolfH5NativeInterface.TAG, "scoreCard requestTrackDetailData objData null");
                        golfH5Callback.onFailure(1, "scoreCard requestTrackDetailData objData null");
                    }
                    if (!njy.b(obj, HiHealthData.class)) {
                        LogUtil.j(GolfH5NativeInterface.TAG, "scoreCard requestTrackDetailData objData not instanceof List");
                        golfH5Callback.onFailure(1, "scoreCard requestTrackDetailData objData not instanceof List");
                    }
                    GolfH5NativeInterface.parsingRecordCardData(i, obj, golfH5Callback);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void parsingRecordCardData(int i, Object obj, GolfH5Callback<List<TrackGolfCourseSegment>> golfH5Callback) {
        if (obj == null || golfH5Callback == null) {
            LogUtil.j(TAG, "parsingRecordCardData: objData or callback is null.");
            golfH5Callback.onFailure(1, "objData or callback is null");
            return;
        }
        List list = (List) obj;
        if (list.isEmpty() || list.get(0) == null) {
            LogUtil.j(TAG, "parsingRecordCardData list size 0.");
            golfH5Callback.onFailure(1, "parsingRecordCardData list size 0");
            return;
        }
        String sequenceFileUrl = ((HiHealthData) list.get(0)).getSequenceFileUrl();
        if (TextUtils.isEmpty(sequenceFileUrl)) {
            LogUtil.j(TAG, "parsingRecordCardData fileUrl is null");
            golfH5Callback.onFailure(1, "parsingRecordCardData fileUrl is null");
            return;
        }
        MotionPath motionPathD = jac.d(BaseApplication.getActivity(), sequenceFileUrl, 286);
        if (motionPathD == null) {
            LogUtil.j(TAG, "parsingRecordCardData motionPath is null");
            golfH5Callback.onFailure(1, "parsingRecordCardData motionPath is null");
            return;
        }
        List<CommonSegment> listRequestSegmentList = motionPathD.requestSegmentList();
        ArrayList arrayList = new ArrayList();
        Iterator<CommonSegment> it = listRequestSegmentList.iterator();
        while (it.hasNext()) {
            arrayList.add((TrackGolfCourseSegment) it.next());
        }
        golfH5Callback.onSuccess(arrayList);
        LogUtil.a(TAG, "parsingRecordCardData: " + arrayList);
    }

    @H5ProMethod(name = "checkDeviceConnectedInfo")
    public static void checkDeviceConnectedInfo(GolfH5Callback<String> golfH5Callback) {
        LogUtil.d(TAG, "checkDeviceConnectedInfo");
        if (GolfDeviceProxy.getInstance().isDeviceConnected()) {
            golfH5Callback.onSuccess(Integer.toString(Utils.getGolfResultCode()));
        } else {
            golfH5Callback.onSuccess(Integer.toString(1));
        }
        LogUtil.d(TAG, "call checkDeviceConnectedInfo success");
    }

    @H5ProMethod(name = "setLocationAuth")
    public static void setLocationAuth(int i, final GolfH5Callback<String> golfH5Callback) {
        ReleaseLogUtil.d(TAG, "setLocationAuth mode is ", Integer.valueOf(i));
        if (i > 2) {
            return;
        }
        PermissionUtil.d(BaseApplication.getActivity(), PermissionUtil.PermissionType.LOCATION, new PermissionsResultAction() { // from class: com.huawei.healthcloud.plugintrack.golf.h5.GolfH5NativeInterface.5
            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onGranted() {
                LogUtil.a(GolfH5NativeInterface.TAG, "Permission is onGranted");
                golfH5Callback.onSuccess(String.valueOf(1));
            }

            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onDenied(String str) {
                LogUtil.a(GolfH5NativeInterface.TAG, "Permission is onDenied");
                golfH5Callback.onSuccess(String.valueOf(3));
            }
        });
    }

    @H5ProMethod(name = "getLocationAuth")
    public static void getLocationAuth(GolfH5Callback golfH5Callback) {
        if (lsg.d(BaseApplication.getContext(), new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})) {
            if (29 <= Build.VERSION.SDK_INT && lsg.d(BaseApplication.getActivity(), new String[]{"android.permission.ACCESS_BACKGROUND_LOCATION"})) {
                golfH5Callback.onSuccess(2);
                return;
            } else {
                golfH5Callback.onSuccess(1);
                return;
            }
        }
        golfH5Callback.onSuccess(3);
    }

    @H5ProMethod(name = "getLocation")
    public static void getLocation(final GolfH5Callback<GolfLocationData> golfH5Callback) {
        LogUtil.d(TAG, "call getLocation success");
        if (golfH5Callback == null) {
            ReleaseLogUtil.a(TAG, "callback is null in getLocation");
            return;
        }
        if (!lsg.d(BaseApplication.getContext(), new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})) {
            golfH5Callback.onFailure(12, "no location permissions");
            ReleaseLogUtil.e(TAG, "no location permissions in getLocation");
        } else {
            GolfGetLocation.getInstance().getLocation(new GolfGetLocation.GetLocationCallback() { // from class: com.huawei.healthcloud.plugintrack.golf.h5.GolfH5NativeInterface.6
                @Override // com.huawei.healthcloud.plugintrack.golf.bean.GolfGetLocation.GetLocationCallback
                public void onSuccess(jpg jpgVar) {
                    GolfLocationData golfLocationData = new GolfLocationData();
                    if (jpgVar != null) {
                        golfLocationData.setLatitude(jpgVar.d);
                        golfLocationData.setLongitude(jpgVar.f38787a);
                    }
                    golfH5Callback.onSuccess(golfLocationData);
                    LogUtil.d(GolfH5NativeInterface.TAG, golfLocationData);
                }

                @Override // com.huawei.healthcloud.plugintrack.golf.bean.GolfGetLocation.GetLocationCallback
                public void onFailure(int i, String str) {
                    golfH5Callback.onFailure(i, str);
                }
            });
        }
    }

    @H5ProMethod(name = "getCourseData")
    public static void getCourseData(int i, GolfH5Callback<GolfCourseData> golfH5Callback) {
        golfH5Callback.onSuccess(new GolfCourseData());
        LogUtil.d(TAG, "call getCourseData success");
    }

    @H5ProMethod(name = "getBaseUrl")
    public static void getBaseUrl(GolfH5Callback<String> golfH5Callback) {
        if (golfH5Callback == null) {
            LogUtil.e(TAG, "callback is null");
        } else {
            golfH5Callback.onSuccess("url");
            LogUtil.d(TAG, "call getBaseUrl success");
        }
    }

    @H5ProMethod(name = "getWatchType")
    public static void getWatchType(GolfH5Callback<String> golfH5Callback) {
        if (golfH5Callback == null) {
            LogUtil.e(TAG, "call back is null");
            return;
        }
        LogUtil.d(TAG, "call getWatchType success");
        if (!GolfDeviceProxy.getInstance().isDeviceConnected()) {
            golfH5Callback.onFailure(1, "no device connected");
        } else if (!GolfDeviceProxy.getInstance().isSupportGolf()) {
            golfH5Callback.onFailure(1, "device not support golf");
        } else {
            golfH5Callback.onSuccess(Integer.toString(GolfDeviceProxy.getInstance().getWatchType()));
        }
    }
}
