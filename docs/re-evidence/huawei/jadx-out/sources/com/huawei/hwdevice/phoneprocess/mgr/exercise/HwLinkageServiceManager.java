package com.huawei.hwdevice.phoneprocess.mgr.exercise;

import android.content.Context;
import com.huawei.datatype.DeviceCommand;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.device.model.OperatorStatus;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.binder.ParserInterface;
import com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.dmsmanager.HwDeviceMgrInterface;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.StatisticExtendDataStruct;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.WorkoutRecordSpeechPlay;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.WorkoutRecordStatistic;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.HwExerciseCommandUtil;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.HwWorkoutServiceUtils;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.cpl;
import defpackage.ecu;
import defpackage.eel;
import defpackage.eeq;
import defpackage.ees;
import defpackage.eet;
import defpackage.eeu;
import defpackage.eew;
import defpackage.mkf;
import defpackage.nfo;
import defpackage.njw;
import defpackage.xjt;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class HwLinkageServiceManager implements ParserInterface {
    private static final int CONVERT_RADIX_HEX = 16;
    private static final int FIRST_CALLBACK = 0;
    private static final int METER_TURN_METERS = 10;
    private static final int MILLISECONDS_IN_SECOND = 1000;
    private static final long MILLISECONDS_TO_SECOND = 1000;
    private static final int PLACE_HOLDERS = 2;
    private static final String TAG = "HwLinkageServiceManager";
    private static final String TAG_RELEASE = "BTSYNC_HwLinkageServiceManager";
    private static final int TL_NUMBER_STRUCT = 128;
    private static HwLinkageServiceManager sInstance;
    private Context mContext;
    private HwDeviceMgrInterface mHwDeviceMgr;
    private IBaseResponseCallback mRealTimeSportDataListCallback;
    private static final Object SYNC_LOCK = new Object();
    private static List<IBaseResponseCallback> sNotificationOperatorCallbackList = new ArrayList(16);
    private static List<IBaseResponseCallback> sOperatorCallbackList = new ArrayList(16);
    private static List<IBaseResponseCallback> sWorkoutOperatorRealtimeDataCallbackList = new ArrayList(16);
    private static List<IBaseResponseCallback> sNotificationStatusCallbackList = new ArrayList(16);
    private static List<IBaseResponseCallback> sNotificationGetWorkoutRecordStatisticCallbackList = new ArrayList(16);
    private static List<IBaseResponseCallback> sNotificationWorkoutRecordSpeechPlayCallbackList = new ArrayList(16);

    private HwLinkageServiceManager(Context context) {
        ReleaseLogUtil.d(TAG_RELEASE, "HwWorkoutServiceManager construct.");
        this.mContext = context;
        this.mHwDeviceMgr = mkf.e(context);
    }

    public static HwLinkageServiceManager getInstance() {
        HwLinkageServiceManager hwLinkageServiceManager;
        synchronized (SYNC_LOCK) {
            if (sInstance == null) {
                sInstance = new HwLinkageServiceManager(BaseApplication.getContext());
            }
            hwLinkageServiceManager = sInstance;
        }
        return hwLinkageServiceManager;
    }

    @Override // com.huawei.hwdevice.phoneprocess.binder.ParserInterface
    public void getResult(DeviceInfo deviceInfo, byte[] bArr) {
        ReleaseLogUtil.d(TAG_RELEASE, "getDataInfo() to get data info");
        cpl.d(TAG, bArr, "getDataInfo(): ");
        String strE = eeq.e(bArr);
        if (strE.length() > 4) {
            try {
                ees eesVarB = new eet().b(strE.substring(4, strE.length()));
                List<eew> listE = eesVarB.e();
                List<ees> listB = eesVarB.b();
                byte b2 = bArr[1];
                if (b2 == 1) {
                    handleNotificationOperatorStatus(listE);
                    return;
                }
                if (b2 == 2) {
                    handleOperatorStatus(listB);
                    return;
                }
                if (b2 == 3) {
                    handleGetOperatorStatus(listE, listB);
                    return;
                }
                if (b2 == 9) {
                    handleNotificationWorkoutRecordStatistic(listB);
                    return;
                }
                if (b2 == 11) {
                    handleWorkoutOperateRealTimeData(listE);
                    return;
                }
                if (b2 == 13) {
                    handleNotificationWorkoutSpeechPlay(listE);
                    return;
                } else if (b2 == 17) {
                    handleWorkoutReportPlayData(listB, deviceInfo);
                    return;
                } else {
                    ReleaseLogUtil.e(TAG_RELEASE, "getResult error commandId.");
                    return;
                }
            } catch (eeu e) {
                ReleaseLogUtil.a(TAG_RELEASE, "receive command TlvException: ", ExceptionUtils.c(e));
                xjt.v("receive command TlvException: " + ExceptionUtils.c(e));
                return;
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                ReleaseLogUtil.a(TAG_RELEASE, "receive command Exception: ", ExceptionUtils.c(e));
                xjt.v("receive command Exception: " + ExceptionUtils.c(e));
                return;
            } catch (NumberFormatException e3) {
                e = e3;
                ReleaseLogUtil.a(TAG_RELEASE, "receive command Exception: ", ExceptionUtils.c(e));
                xjt.v("receive command Exception: " + ExceptionUtils.c(e));
                return;
            } catch (RuntimeException e4) {
                ReleaseLogUtil.a(TAG_RELEASE, "receive command RuntimeException: ", ExceptionUtils.c(e4));
                xjt.v("receive command RuntimeException: " + ExceptionUtils.c(e4));
                return;
            } catch (Exception e5) {
                ReleaseLogUtil.a(TAG_RELEASE, "receive command error:", ExceptionUtils.c(e5));
                xjt.v("receive command error: " + ExceptionUtils.c(e5));
                return;
            }
        }
        ReleaseLogUtil.e(TAG_RELEASE, "receive command data lenth less 4");
        xjt.v("receive command data lenth less 4");
    }

    public void setOperator(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) throws JSONException {
        if (jSONObject == null || iBaseResponseCallback == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "setOperator parameters is error.");
            xjt.v("setOperator parameters is error.");
            return;
        }
        synchronized (SYNC_LOCK) {
            ReleaseLogUtil.d(TAG_RELEASE, "setOperator OperatorType:", Integer.valueOf(jSONObject.getInt("operator_type")));
            if (this.mHwDeviceMgr == null) {
                iBaseResponseCallback.a(0, nfo.a(100001, "setOperator"));
                xjt.v("mHwDeviceMgr is null.");
                return;
            }
            DeviceInfo connectedDeviceWithoutAw70 = getConnectedDeviceWithoutAw70();
            if (connectedDeviceWithoutAw70 == null) {
                iBaseResponseCallback.a(0, nfo.a(100001, "setOperator"));
                xjt.v("deviceInfo is null.");
            } else {
                synchronized (getNotificationOperatorCallbackList()) {
                    sNotificationOperatorCallbackList.add(iBaseResponseCallback);
                }
                this.mHwDeviceMgr.sendDeviceData(HwExerciseCommandUtil.notifyOperatorStatus(jSONObject, connectedDeviceWithoutAw70));
            }
        }
    }

    public void setNotificationStatusResponse(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) {
        synchronized (SYNC_LOCK) {
            ReleaseLogUtil.d(TAG_RELEASE, "response of NotificationStatus info");
            if (jSONObject == null || iBaseResponseCallback == null) {
                ReleaseLogUtil.e(TAG_RELEASE, "setNotificationStatusResponse, input parameters is illegal");
                xjt.v("setNotificationStatusResponse, input parameters is illegal");
                return;
            }
            try {
                this.mHwDeviceMgr.sendDeviceData(HwExerciseCommandUtil.getNotificationResponseCommand(jSONObject));
                iBaseResponseCallback.a(100000, nfo.a("success", "setNotificationStatusResponse"));
            } catch (JSONException e) {
                ReleaseLogUtil.a(TAG_RELEASE, "setNotificationStatusResponse JSONException:", ExceptionUtils.c(e));
                xjt.v("setNotificationStatusResponse JSONException: " + e.getMessage());
            }
        }
    }

    public void registerNotificationStatusCallbackList(IBaseResponseCallback iBaseResponseCallback) {
        synchronized (getNotificationStatusCallbackList()) {
            try {
                if (iBaseResponseCallback == null) {
                    ReleaseLogUtil.e(TAG_RELEASE, "registerNotificationStatusCallbackList callback is null");
                    xjt.v("registerNotificationStatusCallbackList callback is null");
                } else {
                    if (sNotificationStatusCallbackList.isEmpty() || !sNotificationStatusCallbackList.contains(iBaseResponseCallback)) {
                        sNotificationStatusCallbackList.add(iBaseResponseCallback);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void getOperator(IBaseResponseCallback iBaseResponseCallback) {
        synchronized (SYNC_LOCK) {
            ReleaseLogUtil.d(TAG_RELEASE, "getOperator called");
            if (this.mHwDeviceMgr == null) {
                ReleaseLogUtil.e(TAG_RELEASE, "mHwDeviceMgr is null");
                iBaseResponseCallback.a(0, nfo.a(100001, "getOperator"));
                xjt.v("mHwDeviceMgr is null");
                return;
            }
            DeviceInfo connectedDeviceWithoutAw70 = getConnectedDeviceWithoutAw70();
            if (connectedDeviceWithoutAw70 == null) {
                ReleaseLogUtil.e(TAG_RELEASE, "no device is connected.");
                iBaseResponseCallback.a(0, nfo.a(100001, "getOperator"));
                xjt.v("no device is connected");
            } else {
                synchronized (getGetOperatorCallbackList()) {
                    sOperatorCallbackList.add(iBaseResponseCallback);
                }
                this.mHwDeviceMgr.sendDeviceData(HwExerciseCommandUtil.getOperatorStatus(connectedDeviceWithoutAw70));
            }
        }
    }

    public void workoutOperateRealtimeData(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) throws JSONException {
        synchronized (SYNC_LOCK) {
            ReleaseLogUtil.d(TAG_RELEASE, "workoutOperateRealtimeData enter.");
            DeviceCommand deviceCommand = new DeviceCommand();
            deviceCommand.setServiceID(23);
            deviceCommand.setCommandID(11);
            StringBuffer stringBuffer = new StringBuffer(16);
            HwWorkoutServiceUtils.getWorkoutStringTlvIncludeDistance(stringBuffer, jSONObject);
            HwWorkoutServiceUtils.getWorkoutStringTlvIncludeAvgPace(stringBuffer, jSONObject);
            HwWorkoutServiceUtils.getWorkoutStringTlvIncludeAerobicTrainEffect(stringBuffer, jSONObject);
            HwWorkoutServiceUtils.getWorkoutStringTlvIncludeRunningAction(stringBuffer, jSONObject);
            HwWorkoutServiceUtils.getWorkoutFifthPartStringTlvIncludeRunningCourse(stringBuffer, jSONObject);
            HwWorkoutServiceUtils.getWorkoutStringTlvIncludeRunningCourseContent(stringBuffer, jSONObject);
            DeviceCapability capability = getCapability();
            if (capability != null && capability.isSupportWorkoutCapabilicy()) {
                HwWorkoutServiceUtils.getWorkoutStringTlvIncludeNewSpeed(stringBuffer, jSONObject);
            }
            HwWorkoutServiceUtils.getWorkoutStringTlvIncludeEquipmentLinkage(stringBuffer, jSONObject);
            stringBuffer.insert(0, eeq.d(129) + eeq.b(stringBuffer.length() / 2));
            deviceCommand.setDataLen(stringBuffer.length() / 2);
            deviceCommand.setDataContent(eeq.c(stringBuffer.toString()));
            LogUtil.a(TAG, "5.23.11 setRealTimeData enter: ", deviceCommand.toString());
            synchronized (getWorkoutOperatorRealtimeDataCallbackList()) {
                sWorkoutOperatorRealtimeDataCallbackList.add(iBaseResponseCallback);
            }
            this.mHwDeviceMgr.sendDeviceData(deviceCommand);
        }
    }

    public void notificationWorkoutRecordSpeechPlayReportStatus(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) {
        synchronized (SYNC_LOCK) {
            ReleaseLogUtil.d(TAG_RELEASE, "enter notificationWorkoutRecordSpeechPlayReportStatus");
            if (jSONObject != null) {
                if (jSONObject.optInt("result") == 0) {
                    this.mHwDeviceMgr.sendDeviceData(HwExerciseCommandUtil.getWorkoutRecordSpeechPlayReportCommand());
                }
            } else {
                ReleaseLogUtil.e(TAG_RELEASE, "notificationWorkoutRecordSpeechPlayReportStatus parameters is null.");
                xjt.v("notificationWorkoutRecordSpeechPlayReportStatus parameters is null.");
            }
        }
    }

    public void registerNotificationGetWorkoutRecordStatisticCallbackList(IBaseResponseCallback iBaseResponseCallback) {
        synchronized (getNotificationGetWorkoutRecordStatisticCallbackList()) {
            try {
                if (iBaseResponseCallback == null) {
                    ReleaseLogUtil.e(TAG_RELEASE, "registerNotificationGetWorkoutRecordStatisticCallbackList callback is null");
                    xjt.v("callback is null.");
                } else {
                    if (sNotificationGetWorkoutRecordStatisticCallbackList.isEmpty() || !sNotificationGetWorkoutRecordStatisticCallbackList.contains(iBaseResponseCallback)) {
                        sNotificationGetWorkoutRecordStatisticCallbackList.add(iBaseResponseCallback);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void registerNotificationWorkoutRecordSpeechPlayCallbackList(IBaseResponseCallback iBaseResponseCallback) {
        synchronized (getNotificationWorkoutRecordSpeechPlayCallbackList()) {
            try {
                if (iBaseResponseCallback == null) {
                    ReleaseLogUtil.e(TAG_RELEASE, "registerNotificationWorkoutRecordSpeechPlayCallbackList callback is null");
                    xjt.v("registerNotificationWorkoutRecordSpeechPlayCallbackList callback is null.");
                } else {
                    if (sNotificationWorkoutRecordSpeechPlayCallbackList.isEmpty() || !sNotificationWorkoutRecordSpeechPlayCallbackList.contains(iBaseResponseCallback)) {
                        sNotificationWorkoutRecordSpeechPlayCallbackList.add(iBaseResponseCallback);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void registerGetRealtimeSportDataListCallbackList(IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "registerGetRealtimeSportDataListCallbackList callback is null");
            xjt.v("registerGetRealtimeSportDataListCallbackList callback is null.");
        } else {
            this.mRealTimeSportDataListCallback = iBaseResponseCallback;
        }
    }

    private static List<IBaseResponseCallback> getNotificationOperatorCallbackList() {
        List<IBaseResponseCallback> list;
        synchronized (HwLinkageServiceManager.class) {
            list = sNotificationOperatorCallbackList;
        }
        return list;
    }

    private static List<IBaseResponseCallback> getGetOperatorCallbackList() {
        List<IBaseResponseCallback> list;
        synchronized (HwLinkageServiceManager.class) {
            list = sOperatorCallbackList;
        }
        return list;
    }

    private static List<IBaseResponseCallback> getNotificationStatusCallbackList() {
        List<IBaseResponseCallback> list;
        synchronized (HwLinkageServiceManager.class) {
            list = sNotificationStatusCallbackList;
        }
        return list;
    }

    private static List<IBaseResponseCallback> getNotificationGetWorkoutRecordStatisticCallbackList() {
        List<IBaseResponseCallback> list;
        synchronized (HwLinkageServiceManager.class) {
            list = sNotificationGetWorkoutRecordStatisticCallbackList;
        }
        return list;
    }

    private static List<IBaseResponseCallback> getNotificationWorkoutRecordSpeechPlayCallbackList() {
        return sNotificationWorkoutRecordSpeechPlayCallbackList;
    }

    private static List<IBaseResponseCallback> getWorkoutOperatorRealtimeDataCallbackList() {
        return sWorkoutOperatorRealtimeDataCallbackList;
    }

    private void handleNotificationOperatorStatus(List<eew> list) {
        int iB = CommonUtil.b(list.get(0).b(), 16);
        synchronized (getNotificationOperatorCallbackList()) {
            ReleaseLogUtil.d(TAG_RELEASE, "handleNotificationOperatorStatus info:", Integer.valueOf(iB));
            if (!sNotificationOperatorCallbackList.isEmpty()) {
                sNotificationOperatorCallbackList.get(0).a(iB, nfo.a(Integer.valueOf(iB), "setOperator"));
                sNotificationOperatorCallbackList.remove(0);
            }
        }
    }

    private void handleOperatorStatus(List<ees> list) {
        OperatorStatus operatorStatus = new OperatorStatus();
        Iterator<ees> it = list.iterator();
        while (it.hasNext()) {
            Iterator<eew> it2 = it.next().e().iterator();
            while (it2.hasNext()) {
                handleOperatorStatusTlvData(operatorStatus, it2.next());
            }
        }
        ReleaseLogUtil.d(TAG_RELEASE, "handleOperatorStatus OperatorType:", Integer.valueOf(operatorStatus.getOperatorType()));
        synchronized (getNotificationStatusCallbackList()) {
            Iterator<IBaseResponseCallback> it3 = sNotificationStatusCallbackList.iterator();
            while (it3.hasNext()) {
                it3.next().a(100000, nfo.a(operatorStatus, "notificationStatus"));
            }
        }
    }

    private void handleOperatorStatusTlvData(OperatorStatus operatorStatus, eew eewVar) {
        int iB = CommonUtil.b(eewVar.e(), 16);
        if (iB == 2) {
            operatorStatus.setOperatorType(Integer.parseInt(eewVar.b(), 16));
            return;
        }
        if (iB == 3) {
            operatorStatus.setSportType(Integer.parseInt(eewVar.b(), 16));
            return;
        }
        if (iB == 4) {
            operatorStatus.setRunPlanDate(Long.parseLong(eewVar.b(), 16) * 1000);
            return;
        }
        if (iB != 5) {
            if (iB == 6) {
                operatorStatus.setOperationTime(Long.parseLong(eewVar.b(), 16));
                return;
            } else {
                ReleaseLogUtil.e(TAG_RELEASE, "dealOperatorStatus, not support the tlv type");
                return;
            }
        }
        int i = Integer.parseInt(eewVar.b(), 16);
        if (i == 255) {
            i = OldToNewMotionPath.SPORT_TYPE_OTHER_SPORT;
        }
        operatorStatus.setWorkoutType(i);
    }

    private void handleGetOperatorStatus(List<eew> list, List<ees> list2) {
        if (list != null && !list.isEmpty() && CommonUtil.v(list.get(0).e()) == 127) {
            synchronized (getGetOperatorCallbackList()) {
                int iV = CommonUtil.v(list.get(0).b());
                ReleaseLogUtil.e(TAG_RELEASE, "handleGetOperatorStatus errorCode:", Integer.valueOf(iV));
                if (!sOperatorCallbackList.isEmpty()) {
                    sOperatorCallbackList.get(0).a(iV, nfo.a(Integer.valueOf(iV), "getOperator"));
                    sOperatorCallbackList.remove(0);
                }
            }
            return;
        }
        OperatorStatus operatorStatus = new OperatorStatus();
        Iterator<ees> it = list2.iterator();
        while (it.hasNext()) {
            handleGetOperatorStatusTlvData(operatorStatus, it.next());
        }
        ReleaseLogUtil.d(TAG_RELEASE, "handleGetOperatorStatus OperatorType:", Integer.valueOf(operatorStatus.getOperatorType()), ", TrainMonitorState:", Integer.valueOf(operatorStatus.getTrainMonitorState()));
        synchronized (getGetOperatorCallbackList()) {
            handleGetOperatorStatusResponse(operatorStatus);
        }
    }

    private void handleGetOperatorStatusTlvData(OperatorStatus operatorStatus, ees eesVar) {
        for (eew eewVar : eesVar.e()) {
            int iV = CommonUtil.v(eewVar.e());
            if (iV == 2) {
                operatorStatus.setTrainMonitorState(CommonUtil.v(eewVar.b()));
            } else if (iV == 3) {
                operatorStatus.setOperatorType(CommonUtil.v(eewVar.b()));
            } else if (iV == 4) {
                operatorStatus.setSportType(CommonUtil.v(eewVar.b()));
            } else if (iV == 5) {
                operatorStatus.setRunPlanDate(CommonUtil.x(eewVar.b()) * 1000);
            } else if (iV == 6) {
                operatorStatus.setWorkoutType(CommonUtil.v(eewVar.b()));
            } else {
                ReleaseLogUtil.e(TAG_RELEASE, "handleGetOperatorStatusTlvData else.");
            }
        }
    }

    private void handleGetOperatorStatusResponse(OperatorStatus operatorStatus) {
        if (sOperatorCallbackList.isEmpty()) {
            return;
        }
        sOperatorCallbackList.get(0).a(100000, nfo.a(operatorStatus, "getOperator"));
        sOperatorCallbackList.remove(0);
    }

    private void handleNotificationWorkoutRecordStatistic(List<ees> list) {
        WorkoutRecordStatistic workoutRecordStatistic = new WorkoutRecordStatistic();
        ArrayList arrayList = new ArrayList(16);
        for (ees eesVar : list) {
            handleNotificationWorkoutStatisticDataStruct(eesVar.e(), workoutRecordStatistic);
            Iterator<ees> it = eesVar.b().iterator();
            while (it.hasNext()) {
                arrayList.add(getStatisticExtendData(it.next().e()));
            }
        }
        workoutRecordStatistic.setExtendList(arrayList);
        synchronized (getNotificationGetWorkoutRecordStatisticCallbackList()) {
            Iterator<IBaseResponseCallback> it2 = sNotificationGetWorkoutRecordStatisticCallbackList.iterator();
            while (it2.hasNext()) {
                it2.next().a(100000, nfo.a(workoutRecordStatistic, "notificationGetWorkoutRecordStatistic"));
            }
        }
    }

    private void handleNotificationWorkoutStatisticDataStruct(List<eew> list, WorkoutRecordStatistic workoutRecordStatistic) {
        for (eew eewVar : list) {
            switch (CommonUtil.v(eewVar.e())) {
                case 2:
                    workoutRecordStatistic.setWorkoutRecordId(CommonUtil.v(eewVar.b()));
                    break;
                case 3:
                    workoutRecordStatistic.setWorkoutRecordStatus(CommonUtil.v(eewVar.b()));
                    break;
                case 4:
                    workoutRecordStatistic.setWorkoutRecordStartTime(CommonUtil.x(eewVar.b()) * 1000);
                    break;
                case 5:
                    workoutRecordStatistic.setWorkoutRecordEndTime(CommonUtil.x(eewVar.b()) * 1000);
                    break;
                case 6:
                    workoutRecordStatistic.setWorkoutRecordCalorie(CommonUtil.v(eewVar.b()));
                    break;
                case 7:
                    workoutRecordStatistic.setWorkoutRecordDistance(CommonUtil.v(eewVar.b()));
                    break;
                case 8:
                    workoutRecordStatistic.setWorkoutRecordStep(CommonUtil.x(eewVar.b()));
                    break;
                case 9:
                    workoutRecordStatistic.setWorkoutRecordTotalTime(CommonUtil.x(eewVar.b()));
                    break;
                case 10:
                    workoutRecordStatistic.setWorkoutRecordSpeed(CommonUtil.v(eewVar.b()));
                    break;
                default:
                    handleNotificationWorkoutStatisticDataStructElse(eewVar, workoutRecordStatistic);
                    break;
            }
        }
    }

    private void handleNotificationWorkoutStatisticDataStructElse(eew eewVar, WorkoutRecordStatistic workoutRecordStatistic) {
        switch (CommonUtil.v(eewVar.e())) {
            case 11:
                workoutRecordStatistic.setWorkoutClimb(CommonUtil.x(eewVar.b()));
                break;
            case 12:
                workoutRecordStatistic.setWorkoutHrPeakMax(CommonUtil.v(eewVar.b().substring(0, 2)));
                workoutRecordStatistic.setWorkoutHrPeakMin(CommonUtil.v(eewVar.b().substring(2, 4)));
                break;
            case 13:
                workoutRecordStatistic.setWorkoutLoadPeak(CommonUtil.v(eewVar.b()));
                break;
            case 14:
                workoutRecordStatistic.setWorkoutEtrainingEffect(CommonUtil.v(eewVar.b()));
                break;
            case 15:
                workoutRecordStatistic.setWorkoutEpoc(CommonUtil.v(eewVar.b()));
                break;
            case 16:
                int iV = CommonUtil.v(eewVar.b());
                if (iV == 0) {
                    ReleaseLogUtil.d(TAG_RELEASE, "maxNet is 0.");
                }
                workoutRecordStatistic.setWorkoutMaxMet(iV);
                break;
            case 17:
                workoutRecordStatistic.setWorkoutRecoveryTime(CommonUtil.v(eewVar.b()));
                break;
            case 18:
                workoutRecordStatistic.setWorkoutExerciseDuration(CommonUtil.x(eewVar.b()));
                break;
            case 19:
                workoutRecordStatistic.setWorkoutDateInfo(CommonUtil.x(eewVar.b()));
                break;
            case 20:
                workoutRecordStatistic.setWorkoutType(CommonUtil.v(eewVar.b()));
                break;
            case 21:
                workoutRecordStatistic.setAlgType(CommonUtil.v(eewVar.b()));
                break;
            default:
                ReleaseLogUtil.e(TAG_RELEASE, "handleNotificationWorkoutStatisticDataStructElse tlvChild parse else");
                break;
        }
    }

    private void handleWorkoutOperateRealTimeData(List<eew> list) {
        synchronized (getWorkoutOperatorRealtimeDataCallbackList()) {
            if (!sWorkoutOperatorRealtimeDataCallbackList.isEmpty()) {
                int iV = CommonUtil.v(list.get(0).b());
                ReleaseLogUtil.d(TAG_RELEASE, "handleWorkoutOperateRealTimeData errorCode:", Integer.valueOf(iV));
                sWorkoutOperatorRealtimeDataCallbackList.get(0).a(iV, nfo.a(Integer.valueOf(iV), "workoutOperateRealtimeData"));
                sWorkoutOperatorRealtimeDataCallbackList.remove(0);
            }
        }
    }

    private void handleNotificationWorkoutSpeechPlay(List<eew> list) {
        WorkoutRecordSpeechPlay workoutRecordSpeechPlay = new WorkoutRecordSpeechPlay();
        for (eew eewVar : list) {
            if (CommonUtil.v(eewVar.e()) == 1) {
                workoutRecordSpeechPlay.setWorkoutRecordSpeechPlayRequest(CommonUtil.v(eewVar.b()));
            }
        }
        synchronized (getNotificationWorkoutRecordSpeechPlayCallbackList()) {
            Iterator<IBaseResponseCallback> it = sNotificationWorkoutRecordSpeechPlayCallbackList.iterator();
            while (it.hasNext()) {
                it.next().a(100000, nfo.a(workoutRecordSpeechPlay, "notificationWorkoutRecordSpeechPlay"));
            }
        }
    }

    private void handleWorkoutReportPlayData(List<ees> list, DeviceInfo deviceInfo) {
        ReleaseLogUtil.d(TAG_RELEASE, "handleWorkoutReportPlayData enter.");
        njw njwVar = new njw();
        if (deviceInfo != null) {
            njwVar.c(deviceInfo.getSecurityUuid() + "#ANDROID21");
        }
        Iterator<ees> it = list.iterator();
        while (it.hasNext()) {
            HwWorkoutServiceUtils.parseWorkoutReportPlayData(it.next().e(), njwVar);
        }
        LogUtil.a("5.23.17 data: ", njwVar.toString());
        IBaseResponseCallback iBaseResponseCallback = this.mRealTimeSportDataListCallback;
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(100000, nfo.a(njwVar, "registerGetRTSportDataListCallbackList"));
        }
    }

    private DeviceInfo getConnectedDeviceWithoutAw70() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, TAG);
        if (deviceList == null || deviceList.isEmpty()) {
            ReleaseLogUtil.e(TAG_RELEASE, "getConnectedDeviceWithoutAw70 deviceInfos is null or is empty.");
            xjt.v("getConnectedDeviceWithoutAw70 deviceInfos is null or is empty.");
            return null;
        }
        for (DeviceInfo deviceInfo : deviceList) {
            if (!eel.d(deviceInfo.getProductType())) {
                return deviceInfo;
            }
        }
        return null;
    }

    private DeviceCapability getCapability() {
        Map<String, DeviceCapability> mapQueryDeviceCapability = mkf.e(BaseApplication.getContext()).queryDeviceCapability(4, "", TAG);
        DeviceCapability value = null;
        if (mapQueryDeviceCapability == null || mapQueryDeviceCapability.isEmpty()) {
            ReleaseLogUtil.e(TAG_RELEASE, "getCapability deviceCapabilityHashMaps is null");
            xjt.v("getCapability deviceCapabilityHashMaps is null");
            return null;
        }
        Iterator<Map.Entry<String, DeviceCapability>> it = mapQueryDeviceCapability.entrySet().iterator();
        while (it.hasNext() && (value = it.next().getValue()) == null) {
        }
        return value;
    }

    private StatisticExtendDataStruct getStatisticExtendData(List<eew> list) {
        StatisticExtendDataStruct statisticExtendDataStruct = new StatisticExtendDataStruct();
        for (eew eewVar : list) {
            int iV = CommonUtil.v(eewVar.e());
            if (iV == 104) {
                statisticExtendDataStruct.setFieldName(DicDataTypeUtil.NonDictDataTransUtil.b(CommonUtil.v(eewVar.b())));
            } else if (iV == 105) {
                statisticExtendDataStruct.setFieldValue(eeq.d(eewVar.b()));
            } else {
                ReleaseLogUtil.e(TAG_RELEASE, "getStatisticExtendData tlvChild parse else");
            }
        }
        return statisticExtendDataStruct;
    }
}
