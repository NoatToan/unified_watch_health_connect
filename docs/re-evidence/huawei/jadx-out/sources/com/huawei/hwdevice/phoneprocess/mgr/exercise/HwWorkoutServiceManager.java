package com.huawei.hwdevice.phoneprocess.mgr.exercise;

import android.content.Context;
import android.os.Bundle;
import androidx.health.connect.client.records.ExerciseSessionRecord;
import com.huawei.datatype.DeviceCommand;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.h5pro.utils.RequestCode;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.healthcloud.plugintrack.golf.bean.GolfCourseInfo;
import com.huawei.hihealth.dictionary.HiHealthDictManager;
import com.huawei.hihealth.dictionary.model.HiHealthDictField;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.binder.ParserInterface;
import com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.dmsmanager.HwDeviceMgrInterface;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.CommonSectionInfo;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.CommonSectionList;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.DataHeader;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.PaceIndexStruct;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.SectionInfo;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.SectionList;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.SportReminder;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.StatisticExtendDataStruct;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.WorkRecordIndexPaceMapList;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.WorkoutDataInfo;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.WorkoutDataStruct;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.WorkoutRealTimeInfo;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.WorkoutRecord;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.WorkoutRecordPaceMap;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.WorkoutRecordStatistic;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.WorkoutRecordStruct;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.multisync.ExtrasDataUtils;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.multisync.HwWorkoutServiceAw70Manager;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.HwExerciseCommandUtil;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.HwWorkoutServiceUtils;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.TriathlonUtils;
import com.huawei.hwfoundationmodel.trackmodel.HeartRateData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.up.model.UserInfomation;
import defpackage.cph;
import defpackage.cpl;
import defpackage.cqi;
import defpackage.cqk;
import defpackage.cql;
import defpackage.eel;
import defpackage.eeq;
import defpackage.ees;
import defpackage.eet;
import defpackage.eeu;
import defpackage.eew;
import defpackage.gzz;
import defpackage.mkf;
import defpackage.mlp;
import defpackage.mxl;
import defpackage.nfo;
import defpackage.xjt;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class HwWorkoutServiceManager implements ParserInterface {
    private static final int DECIMAL_NUM = 10;
    private static final int DEFAULT_VALUE = -1;
    private static final int FIRST_CALLBACK = 0;
    private static final int HALF_LENGTH = 2;
    private static final int MILLISECONDS_IN_SECOND = 1000;
    private static final long MILLISECONDS_TO_SECOND = 1000;
    private static final int RECOVERY_HEART_INTERVAL_TIME = 5000;
    private static final int RECOVERY_HEART_LENGTH = 2;
    private static final int SERVICE_AND_COMMAND_LENGTH = 4;
    private static final String TAG = "HwWorkoutServiceManager";
    private static final String TAG_RELEASE = "BTSYNC_HwWorkoutServiceManager";
    private static HwWorkoutServiceManager sInstance;
    private Context mContext;
    private HwDeviceMgrInterface mHwDeviceMgr;
    private IBaseResponseCallback mSectionListCallback;
    private TriathlonUtils mTriathlonUtils;
    private IBaseResponseCallback mWorkoutCapabilityCallback;
    private IBaseResponseCallback mWorkoutDataCallback;
    private IBaseResponseCallback mWorkoutRecordCallback;
    private IBaseResponseCallback mWorkoutRecordPaceMapListCallback;
    private IBaseResponseCallback mWorkoutRecordStatisticCallback;
    private static final Object SYNC_LOCK = new Object();
    private static final Object COMMAND_CALLBACK_LOCK = new Object();
    private static List<IBaseResponseCallback> sWorkoutRealTimeInfoCallbackList = new ArrayList(16);
    private static List<IBaseResponseCallback> sNotificationWorkoutRealTimeInfoCallbackList = new ArrayList(16);
    private static List<IBaseResponseCallback> sNotificationSportReminderCallbackList = new ArrayList(16);
    private Map<Integer, IBaseResponseCallback> mCommandCallbackMap = new HashMap(16);
    private boolean mIsSupportNewStep = false;
    private boolean mIsSupportNewEllipticalAndRowingMachine = false;

    private HwWorkoutServiceManager(Context context) {
        LogUtil.a(TAG, "HwWorkoutServiceManager construct.");
        this.mContext = context;
        this.mHwDeviceMgr = mkf.e(context);
        this.mTriathlonUtils = TriathlonUtils.getInstance();
    }

    public boolean isSupportNewStep() {
        return this.mIsSupportNewStep;
    }

    public void setIsSupportNewStep(boolean z) {
        this.mIsSupportNewStep = z;
    }

    public boolean getIsSupportNewEllipticalAndRowingMachine() {
        return this.mIsSupportNewEllipticalAndRowingMachine;
    }

    public static HwWorkoutServiceManager getInstance() {
        HwWorkoutServiceManager hwWorkoutServiceManager;
        synchronized (SYNC_LOCK) {
            if (sInstance == null) {
                sInstance = new HwWorkoutServiceManager(BaseApplication.getContext());
            }
            hwWorkoutServiceManager = sInstance;
        }
        return hwWorkoutServiceManager;
    }

    public void getWorkoutRealTimeInfo(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) throws JSONException {
        synchronized (SYNC_LOCK) {
            synchronized (getWorkoutRealTimeInfoCallbackList()) {
                sWorkoutRealTimeInfoCallbackList.add(iBaseResponseCallback);
            }
            this.mHwDeviceMgr.sendDeviceData(HwExerciseCommandUtil.getWorkoutRealtimeInfo(jSONObject));
        }
    }

    public void getWorkoutRecord(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) throws JSONException {
        synchronized (SYNC_LOCK) {
            ReleaseLogUtil.d(TAG_RELEASE, "getWorkoutRecord enter.");
            this.mWorkoutRecordCallback = iBaseResponseCallback;
            this.mHwDeviceMgr.sendDeviceData(HwExerciseCommandUtil.getWorkoutRecordCommand(jSONObject));
        }
    }

    public void getWorkoutRecordStatistic(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) throws JSONException {
        synchronized (SYNC_LOCK) {
            ReleaseLogUtil.d(TAG_RELEASE, "getWorkoutRecordStatistic enter.");
            this.mWorkoutRecordStatisticCallback = iBaseResponseCallback;
            this.mHwDeviceMgr.sendDeviceData(HwExerciseCommandUtil.getWorkoutRecordStatistic(jSONObject));
        }
    }

    public void getWorkoutData(WorkoutDataStruct workoutDataStruct, IBaseResponseCallback iBaseResponseCallback) throws JSONException {
        synchronized (SYNC_LOCK) {
            ReleaseLogUtil.d(TAG_RELEASE, "getWorkoutData enter.");
            this.mWorkoutDataCallback = iBaseResponseCallback;
            this.mHwDeviceMgr.sendDeviceData(HwExerciseCommandUtil.getWorkoutData(workoutDataStruct));
        }
    }

    public void getWorkoutCapability(IBaseResponseCallback iBaseResponseCallback) {
        synchronized (SYNC_LOCK) {
            this.mIsSupportNewStep = false;
            this.mIsSupportNewEllipticalAndRowingMachine = false;
            ReleaseLogUtil.d(TAG_RELEASE, "getWorkoutCapability enter.");
            this.mWorkoutCapabilityCallback = iBaseResponseCallback;
            this.mHwDeviceMgr.sendDeviceData(HwExerciseCommandUtil.getWorkoutCapability());
        }
    }

    public void getSectionListStatistic(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) throws JSONException {
        synchronized (SYNC_LOCK) {
            ReleaseLogUtil.d(TAG_RELEASE, "getSectionListStatistic enter.");
            this.mSectionListCallback = iBaseResponseCallback;
            this.mHwDeviceMgr.sendDeviceData(HwExerciseCommandUtil.getSectionListDeviceCommand(jSONObject));
        }
    }

    public void getCommonSectionListStatistic(CommonSectionList commonSectionList, IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d(TAG_RELEASE, "getCommonSectionListStatistic enter");
        synchronized (SYNC_LOCK) {
            try {
                if (commonSectionList == null) {
                    ReleaseLogUtil.e(TAG_RELEASE, "getCommonSectionListStatistic, input parameters is invalid");
                    return;
                }
                DeviceCommand commonSectionListCommand = HwExerciseCommandUtil.getCommonSectionListCommand(commonSectionList);
                LogUtil.a(TAG, "getCommonSectionListStatistic command data is ", eeq.e(commonSectionListCommand.getDataContent()));
                addCommandToMap(22, iBaseResponseCallback);
                this.mHwDeviceMgr.sendDeviceData(commonSectionListCommand);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void registerNotificationSportReminderCallbackList(IBaseResponseCallback iBaseResponseCallback) {
        synchronized (getNotificationSportReminderCallbackList()) {
            try {
                if (iBaseResponseCallback == null) {
                    ReleaseLogUtil.e(TAG_RELEASE, "registerNotificationSportReminderCallbackList callback is null");
                    return;
                }
                if (sNotificationSportReminderCallbackList.isEmpty() || !sNotificationSportReminderCallbackList.contains(iBaseResponseCallback)) {
                    sNotificationSportReminderCallbackList.add(iBaseResponseCallback);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void getWorkoutRecordPaceMap(PaceIndexStruct paceIndexStruct, IBaseResponseCallback iBaseResponseCallback) {
        synchronized (SYNC_LOCK) {
            try {
                if (paceIndexStruct == null || iBaseResponseCallback == null) {
                    ReleaseLogUtil.e(TAG_RELEASE, "getWorkoutRecordPaceMap, input parameters is invalid");
                    xjt.p("getWorkoutRecordPaceMap, input parameters is invalid");
                } else {
                    ReleaseLogUtil.d(TAG_RELEASE, "getWorkoutRecordPaceMap enter.");
                    this.mWorkoutRecordPaceMapListCallback = iBaseResponseCallback;
                    this.mHwDeviceMgr.sendDeviceData(HwExerciseCommandUtil.getWorkoutRecordPaceMapCommand(paceIndexStruct));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.huawei.hwdevice.phoneprocess.binder.ParserInterface
    public void getResult(DeviceInfo deviceInfo, byte[] bArr) {
        if (eel.d(deviceInfo.getProductType())) {
            HwWorkoutServiceAw70Manager.getInstance().getResult(bArr);
        }
        ReleaseLogUtil.d(TAG_RELEASE, "getResult() to get data info");
        cpl.d(TAG, bArr, "getResult(): ");
        if (bArr.length <= 4) {
            ReleaseLogUtil.d(TAG_RELEASE, "getResult() data is error.");
            xjt.p("getResult() data is error.");
            return;
        }
        try {
            List<cqi> arrayList = new ArrayList<>(0);
            List<cqk> arrayList2 = new ArrayList<>(0);
            List<eew> arrayList3 = new ArrayList<>(0);
            List<ees> arrayList4 = new ArrayList<>(0);
            byte b2 = bArr[1];
            if (b2 == 7 || b2 == 8) {
                cql cqlVar = new cql();
                int length = bArr.length - 2;
                byte[] bArr2 = new byte[length];
                System.arraycopy(bArr, 2, bArr2, 0, length);
                cqk cqkVarB = cqlVar.b(bArr2);
                List<cqi> listD = cqkVarB.d();
                arrayList2 = cqkVarB.c();
                arrayList = listD;
            } else {
                ees eesVarB = new eet().b(eeq.e(bArr).substring(4));
                arrayList3 = eesVarB.e();
                arrayList4 = eesVarB.b();
            }
            switch (bArr[1]) {
                case 4:
                    handleGetWorkoutRealTimeInfo(arrayList3, arrayList4);
                    break;
                case 5:
                    handleNotificationWorkoutRealTimeInfo(arrayList4);
                    break;
                case 6:
                    handleNotificationSportReminder(arrayList4);
                    break;
                case 7:
                    handleWorkoutRecord(arrayList, arrayList2);
                    break;
                case 8:
                    handleGetWorkoutRecordStatistic(arrayList, arrayList2, deviceInfo);
                    break;
                default:
                    handleResultWorkoutRecord(bArr, arrayList3, arrayList4, deviceInfo);
                    break;
            }
        } catch (eeu e) {
            ReleaseLogUtil.a(TAG_RELEASE, "getResult TlvException: ", ExceptionUtils.c(e));
            xjt.p("getResult TlvException:" + ExceptionUtils.c(e));
        } catch (IndexOutOfBoundsException e2) {
            ReleaseLogUtil.a(TAG_RELEASE, "getResult IndexOutOfBoundsException: ", ExceptionUtils.c(e2));
            xjt.p("getResult IndexOutOfBoundsException:" + ExceptionUtils.c(e2));
        } catch (RuntimeException e3) {
            ReleaseLogUtil.a(TAG_RELEASE, "getResult RuntimeException: ", ExceptionUtils.c(e3));
            xjt.p("getResult RuntimeException:" + ExceptionUtils.c(e3));
        } catch (Exception e4) {
            ReleaseLogUtil.a(TAG_RELEASE, "getResult error:", ExceptionUtils.c(e4));
            xjt.p("getResult error:" + ExceptionUtils.c(e4));
        }
    }

    private void handleResultWorkoutRecord(byte[] bArr, List<eew> list, List<ees> list2, DeviceInfo deviceInfo) {
        byte b2 = bArr[1];
        if (b2 == 10) {
            handleGetWorkoutData(list, list2);
            return;
        }
        if (b2 == 12) {
            handleWorkoutRecordPaceMap(list, list2);
            return;
        }
        if (b2 == 14) {
            handleWorkoutRecordSwimSectionList(list2);
            return;
        }
        switch (b2) {
            case 20:
                mlp.a().c(list, list2);
                break;
            case 21:
                handleWorkoutCapability(bArr, list);
                break;
            case 22:
                handleCommonSectionList(list, list2);
                break;
            default:
                HwLinkageServiceManager.getInstance().getResult(deviceInfo, bArr);
                break;
        }
    }

    private void handleGetWorkoutRealTimeInfo(List<eew> list, List<ees> list2) {
        if (!list.isEmpty() && CommonUtil.v(list.get(0).e()) == 127) {
            synchronized (getWorkoutRealTimeInfoCallbackList()) {
                int iV = CommonUtil.v(list.get(0).b());
                if (!sWorkoutRealTimeInfoCallbackList.isEmpty()) {
                    sWorkoutRealTimeInfoCallbackList.get(0).a(iV, nfo.a(Integer.valueOf(iV), "getWorkoutRealTimeInfo"));
                    sWorkoutRealTimeInfoCallbackList.remove(0);
                }
            }
            return;
        }
        WorkoutRealTimeInfo workoutRealTimeInfo = new WorkoutRealTimeInfo();
        Iterator<ees> it = list2.iterator();
        while (it.hasNext()) {
            for (eew eewVar : it.next().e()) {
                switch (CommonUtil.v(eewVar.e())) {
                    case 2:
                    case 3:
                    case 4:
                    case 6:
                        workoutRealTimeInfo.setSportType(CommonUtil.v(eewVar.b()));
                        break;
                    case 5:
                        workoutRealTimeInfo.setClimeInfo(CommonUtil.x(eewVar.b()) * 1000);
                        break;
                    case 7:
                        workoutRealTimeInfo.setDistanceInfo(CommonUtil.x(eewVar.b()));
                        break;
                    case 8:
                        workoutRealTimeInfo.setClimeInfo(CommonUtil.x(eewVar.b()));
                        break;
                    default:
                        LogUtil.d(TAG, "handleGetWorkoutRealTimeInfo else");
                        break;
                }
            }
        }
        synchronized (getWorkoutRealTimeInfoCallbackList()) {
            handleGetWorkoutRealTimeInfoResponse(workoutRealTimeInfo);
        }
    }

    private void handleGetWorkoutRealTimeInfoResponse(WorkoutRealTimeInfo workoutRealTimeInfo) {
        if (sWorkoutRealTimeInfoCallbackList.isEmpty()) {
            return;
        }
        sWorkoutRealTimeInfoCallbackList.get(0).a(100000, nfo.a(workoutRealTimeInfo, "getWorkoutRealTimeInfo"));
        sWorkoutRealTimeInfoCallbackList.remove(0);
    }

    private void handleNotificationWorkoutRealTimeInfo(List<ees> list) {
        WorkoutRealTimeInfo workoutRealTimeInfo = new WorkoutRealTimeInfo();
        Iterator<ees> it = list.iterator();
        while (it.hasNext()) {
            for (eew eewVar : it.next().e()) {
                switch (CommonUtil.v(eewVar.e())) {
                    case 2:
                        workoutRealTimeInfo.setSportType(CommonUtil.v(eewVar.b()));
                        break;
                    case 3:
                        workoutRealTimeInfo.setSpeedInfo(CommonUtil.v(eewVar.b()) / 10.0f);
                        break;
                    case 4:
                        workoutRealTimeInfo.setHeartRateInfo(CommonUtil.v(eewVar.b()));
                        break;
                    case 5:
                        workoutRealTimeInfo.setClimeInfo(CommonUtil.x(eewVar.b()) * 1000);
                        break;
                    case 6:
                        workoutRealTimeInfo.setCalorieInfo(CommonUtil.x(eewVar.b()));
                        break;
                    case 7:
                        workoutRealTimeInfo.setDistanceInfo(CommonUtil.x(eewVar.b()));
                        break;
                    case 8:
                        workoutRealTimeInfo.setClimeInfo(CommonUtil.x(eewVar.b()));
                        break;
                    default:
                        LogUtil.d(TAG, "handleNotificationWorkoutRealTimeInfo else");
                        break;
                }
            }
        }
        synchronized (getNotificationWorkoutRealTimeInfoCallbackList()) {
            Iterator<IBaseResponseCallback> it2 = sNotificationWorkoutRealTimeInfoCallbackList.iterator();
            while (it2.hasNext()) {
                it2.next().a(100000, nfo.a(workoutRealTimeInfo, "notificationWorkoutRealTimeInfo"));
            }
        }
    }

    private void handleNotificationSportReminder(List<ees> list) {
        SportReminder sportReminder = new SportReminder();
        Iterator<ees> it = list.iterator();
        while (it.hasNext()) {
            for (eew eewVar : it.next().e()) {
                switch (CommonUtil.v(eewVar.e())) {
                    case 3:
                        sportReminder.setReminderType(CommonUtil.v(eewVar.b()));
                        break;
                    case 4:
                        sportReminder.setRunPhraseNumber(CommonUtil.v(eewVar.b()));
                        break;
                    case 5:
                        ArrayList arrayList = new ArrayList(16);
                        arrayList.add(Integer.valueOf(CommonUtil.v(eewVar.b().substring(0, 4))));
                        arrayList.add(Integer.valueOf(CommonUtil.v(eewVar.b().substring(4, 8))));
                        sportReminder.setRunPhraseVariable(arrayList);
                        break;
                    case 6:
                        sportReminder.setDistanceInfo(CommonUtil.x(eewVar.b()));
                        break;
                    case 7:
                        sportReminder.setTimeInfo(CommonUtil.x(eewVar.b()));
                        break;
                    case 8:
                        sportReminder.setHrValueInfo(CommonUtil.v(eewVar.b()));
                        break;
                    case 9:
                        sportReminder.setHrStatusInfo(CommonUtil.v(eewVar.b()));
                        break;
                    default:
                        LogUtil.d(TAG, "handleNotificationSportReminder else");
                        break;
                }
            }
        }
        synchronized (getNotificationSportReminderCallbackList()) {
            Iterator<IBaseResponseCallback> it2 = sNotificationSportReminderCallbackList.iterator();
            while (it2.hasNext()) {
                it2.next().a(100000, nfo.a(sportReminder, "notificationSportReminder"));
            }
        }
    }

    private void handleWorkoutRecord(List<cqi> list, List<cqk> list2) {
        if (handleWorkoutRecordError(list)) {
            return;
        }
        WorkoutRecord workoutRecord = new WorkoutRecord();
        ArrayList arrayList = new ArrayList(16);
        for (cqk cqkVar : list2) {
            for (cqi cqiVar : cqkVar.d()) {
                if (cqiVar.c() == 2) {
                    int iA = eeq.a(cqiVar.d(), 0);
                    workoutRecord.setWorkoutRecordCount(iA);
                    ReleaseLogUtil.d(TAG_RELEASE, "need sync record total count is :", Integer.valueOf(iA));
                } else {
                    LogUtil.d(TAG, "handleWorkoutRecord tlv parse else");
                }
            }
            Iterator<cqk> it = cqkVar.c().iterator();
            while (it.hasNext()) {
                List<cqi> listD = it.next().d();
                WorkoutRecordStruct workoutRecordStruct = new WorkoutRecordStruct();
                handleWorkoutRecordDataStruct(listD, workoutRecordStruct);
                arrayList.add(workoutRecordStruct);
            }
        }
        workoutRecord.setWorkoutRecordStructList(arrayList);
        if (!arrayList.isEmpty()) {
            this.mTriathlonUtils.saveLastRecordId(arrayList.get(arrayList.size() - 1).getWorkoutRecordId());
        }
        IBaseResponseCallback iBaseResponseCallback = this.mWorkoutRecordCallback;
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(100000, nfo.a(workoutRecord, "getWorkoutRecord"));
        } else {
            ReleaseLogUtil.e(TAG_RELEASE, "handleWorkoutRecord mWorkoutRecordCallback is null.");
        }
    }

    private void handleWorkoutRecordDataStruct(List<cqi> list, WorkoutRecordStruct workoutRecordStruct) {
        for (cqi cqiVar : list) {
            switch (cqiVar.c()) {
                case 6:
                    workoutRecordStruct.setWorkoutRecordId(eeq.a(cqiVar.d(), 0));
                    break;
                case 7:
                    workoutRecordStruct.setWorkoutIndexCount(eeq.a(cqiVar.d(), 0));
                    break;
                case 8:
                    workoutRecordStruct.setPaceIndexCount(eeq.a(cqiVar.d(), -1));
                    break;
                case 9:
                    workoutRecordStruct.setWorkoutSectionIndex(eeq.a(cqiVar.d(), 0));
                    break;
                case 10:
                case 11:
                default:
                    LogUtil.d(TAG, "handleWorkoutRecord tlvChild parse else");
                    break;
                case 12:
                    workoutRecordStruct.setWorkoutBloodOxygenIndex(eeq.a(cqiVar.d(), 0));
                    break;
                case 13:
                    workoutRecordStruct.setWorkoutSectionNumber(eeq.a(cqiVar.d(), 0));
                    break;
                case 14:
                    workoutRecordStruct.setWorkoutTrajectories(eeq.a(cqiVar.d(), -1));
                    break;
                case 15:
                    workoutRecordStruct.setDivingEvent(eeq.a(cqiVar.d(), 0));
                    break;
                case 16:
                    workoutRecordStruct.setDictType(bytesToString(cqiVar.d()));
                    break;
            }
        }
    }

    private boolean handleWorkoutRecordError(List<cqi> list) {
        if (list.isEmpty() || list.get(0).c() != 127) {
            return false;
        }
        if (this.mWorkoutRecordCallback == null) {
            return true;
        }
        int iA = eeq.a(list.get(0).d(), -1);
        this.mWorkoutRecordCallback.a(iA, nfo.a(Integer.valueOf(iA), "getWorkoutRecord"));
        return true;
    }

    private void handleGetWorkoutRecordStatistic(List<cqi> list, List<cqk> list2, DeviceInfo deviceInfo) {
        if (handleGetWorkoutRecordStatisticError(list)) {
            return;
        }
        WorkoutRecordStatistic workoutRecordStatistic = new WorkoutRecordStatistic();
        boolean zHandleDeviceIsSupportRunPaceConfig = handleDeviceIsSupportRunPaceConfig(deviceInfo);
        ArrayList arrayList = new ArrayList(16);
        for (cqk cqkVar : list2) {
            getStatisticData(cqkVar, workoutRecordStatistic, zHandleDeviceIsSupportRunPaceConfig);
            for (cqk cqkVar2 : cqkVar.c()) {
                StatisticExtendDataStruct statisticExtendDataStruct = new StatisticExtendDataStruct();
                getStatisticExtendData(cqkVar2.d(), statisticExtendDataStruct);
                arrayList.add(statisticExtendDataStruct);
            }
            StatisticExtendDataStruct postureStruct = getPostureStruct(workoutRecordStatistic, arrayList);
            if (postureStruct != null) {
                arrayList.add(postureStruct);
            }
            workoutRecordStatistic.setExtendList(arrayList);
            HwWorkoutServiceUtils.dealTriathlon(cqkVar, workoutRecordStatistic);
        }
        LogUtil.a(TAG, "handleGetWorkoutRecordStatistic workoutRecordStatistic:", workoutRecordStatistic.toString());
        IBaseResponseCallback iBaseResponseCallback = this.mWorkoutRecordStatisticCallback;
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(100000, nfo.a(workoutRecordStatistic, "getWorkoutRecordStatistic"));
        } else {
            ReleaseLogUtil.e(TAG_RELEASE, "handleGetWorkoutRecordStatistic mWorkoutRecordStatisticCallback is null.");
        }
    }

    private static StatisticExtendDataStruct getPostureStruct(WorkoutRecordStatistic workoutRecordStatistic, List<StatisticExtendDataStruct> list) {
        String fieldValue;
        Iterator<StatisticExtendDataStruct> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                fieldValue = "";
                break;
            }
            StatisticExtendDataStruct next = it.next();
            if ("sportHeartPosture".equals(next.getFieldName())) {
                fieldValue = next.getFieldValue();
                break;
            }
        }
        try {
            int i = Integer.parseInt(fieldValue);
            UserInfomation localUserInfo = ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getLocalUserInfo();
            int workoutHeartRateType = workoutRecordStatistic.getWorkoutHeartRateType();
            gzz.a();
            String string = Arrays.toString(gzz.d(workoutHeartRateType, localUserInfo, i));
            StatisticExtendDataStruct statisticExtendDataStruct = new StatisticExtendDataStruct();
            statisticExtendDataStruct.setFieldName("hrZoneConfig");
            statisticExtendDataStruct.setFieldValue(string);
            return statisticExtendDataStruct;
        } catch (NumberFormatException unused) {
            LogUtil.a(TAG, "postureType from device is null");
            return null;
        }
    }

    private String bytesToString(byte[] bArr) {
        String str;
        try {
            str = new String(bArr, "UTF-8");
            try {
                LogUtil.a(TAG, "bytesToString:", str);
                return str;
            } catch (UnsupportedEncodingException e) {
                e = e;
                ReleaseLogUtil.a(TAG, "bytesToString UnsupportedEncodingException :", ExceptionUtils.c(e));
                return str;
            }
        } catch (UnsupportedEncodingException e2) {
            e = e2;
            str = "";
        }
    }

    private void getStatisticData(cqk cqkVar, WorkoutRecordStatistic workoutRecordStatistic, boolean z) {
        for (cqi cqiVar : cqkVar.d()) {
            byte bC = cqiVar.c();
            if (bC == 49) {
                workoutRecordStatistic.setHighestBloodOxygen(eeq.a(cqiVar.d(), 0));
            } else if (bC == 50) {
                workoutRecordStatistic.setLowestBloodOxygen(eeq.a(cqiVar.d(), 0));
            } else if (bC == 77) {
                workoutRecordStatistic.setTargetPercent(eeq.a(cqiVar.d(), -1));
            } else if (bC == 79) {
                workoutRecordStatistic.setExerciseLevel(eeq.a(cqiVar.d(), -1));
            } else if (bC != 102) {
                switch (bC) {
                    case 35:
                        workoutRecordStatistic.setRecordFlag(eeq.a(cqiVar.d(), 0));
                        break;
                    case 36:
                        workoutRecordStatistic.setWorkoutHeartRateType(eeq.a(cqiVar.d(), -1));
                        break;
                    case 37:
                        workoutRecordStatistic.setWorkoutExerciseId(bytesToString(cqiVar.d()));
                        break;
                    default:
                        switch (bC) {
                            case 91:
                                workoutRecordStatistic.setLongestStreak(eeq.a(cqiVar.d(), -1));
                                break;
                            case GolfCourseInfo.DATA_LENGTH /* 92 */:
                                workoutRecordStatistic.setTripped(eeq.a(cqiVar.d(), -1));
                                break;
                            case 93:
                                workoutRecordStatistic.setAlgType(eeq.a(cqiVar.d(), 0));
                                break;
                            default:
                                handleWorkoutGolfAndSkiingBasicData(cqiVar, workoutRecordStatistic);
                                break;
                        }
                        break;
                }
            } else {
                workoutRecordStatistic.setRecoveryHeartRateList(getRecoveryHeartRateData(cqiVar.d(), workoutRecordStatistic.getWorkoutRecordEndTime()));
            }
            if (z) {
                handleWorkoutRecordRunPace(workoutRecordStatistic, cqiVar);
            }
        }
    }

    private void getStatisticExtendData(List<cqi> list, StatisticExtendDataStruct statisticExtendDataStruct) {
        String strB;
        for (cqi cqiVar : list) {
            byte bC = cqiVar.c();
            if (bC == 104) {
                int iA = eeq.a(cqiVar.d(), 0);
                HiHealthDictField hiHealthDictFieldC = HiHealthDictManager.a(this.mContext).c(iA);
                if (hiHealthDictFieldC == null) {
                    strB = "";
                } else {
                    strB = hiHealthDictFieldC.c();
                }
                if (strB.isEmpty()) {
                    strB = DicDataTypeUtil.NonDictDataTransUtil.b(iA);
                }
                statisticExtendDataStruct.setFieldName(strB);
            } else if (bC == 105) {
                statisticExtendDataStruct.setFieldValue(bytesToString(cqiVar.d()));
            } else {
                ReleaseLogUtil.e(TAG_RELEASE, "getStatisticExtendData tlvChild parse else");
            }
        }
    }

    private ArrayList<HeartRateData> getRecoveryHeartRateData(byte[] bArr, long j) {
        ArrayList<HeartRateData> arrayList = new ArrayList<>(16);
        long j2 = j - 5000;
        for (byte b2 : bArr) {
            HeartRateData heartRateData = new HeartRateData();
            heartRateData.saveHeartRate(eeq.a(new byte[]{b2}, 0));
            j2 += 5000;
            heartRateData.saveTime(j2);
            LogUtil.d(TAG, "recovery_heart_rate: ", heartRateData.toString());
            arrayList.add(heartRateData);
        }
        return arrayList;
    }

    private boolean handleDeviceIsSupportRunPaceConfig(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "handleGetWorkoutRecordStatistic deviceInfo is null");
            return false;
        }
        DeviceCapability capability = getCapability(deviceInfo);
        if (capability != null && capability.isSupportRunPaceSetCapability()) {
            return true;
        }
        ReleaseLogUtil.e(TAG_RELEASE, "handleGetWorkoutRecordStatistic isSupportRunPaceCapability is false");
        return false;
    }

    private void handleWorkoutRecordRunPace(WorkoutRecordStatistic workoutRecordStatistic, cqi cqiVar) {
        switch (cqiVar.c()) {
            case 80:
                workoutRecordStatistic.setRompedPaceZoneMinValue(eeq.a(cqiVar.d(), -1));
                break;
            case ExerciseSessionRecord.EXERCISE_TYPE_WEIGHTLIFTING /* 81 */:
                workoutRecordStatistic.setMarathonPaceZoneMinValue(eeq.a(cqiVar.d(), -1));
                break;
            case ExerciseSessionRecord.EXERCISE_TYPE_WHEELCHAIR /* 82 */:
                workoutRecordStatistic.setLacticAcidPaceZoneMinValue(eeq.a(cqiVar.d(), -1));
                break;
            case ExerciseSessionRecord.EXERCISE_TYPE_YOGA /* 83 */:
                workoutRecordStatistic.setAnaerobicPaceZoneMinValue(eeq.a(cqiVar.d(), -1));
                break;
            case 84:
                workoutRecordStatistic.setMaxOxygenPaceZoneMinValue(eeq.a(cqiVar.d(), -1));
                break;
            case Constants.MAX_PRO_BOTTOM_MARGIN /* 85 */:
                workoutRecordStatistic.setMaxOxygenPaceZoneMaxValue(eeq.a(cqiVar.d(), -1));
                break;
            case RequestCode.SCANNER_PERMISSION_REQUEST_CODE /* 86 */:
                workoutRecordStatistic.setRompedTime(eeq.a(cqiVar.d(), -1));
                break;
            case 87:
                workoutRecordStatistic.setMarathonTime(eeq.a(cqiVar.d(), -1));
                break;
            case 88:
                workoutRecordStatistic.setLacticAcidTime(eeq.a(cqiVar.d(), -1));
                break;
            case 89:
                workoutRecordStatistic.setAnaerobicTime(eeq.a(cqiVar.d(), -1));
                break;
            case 90:
                workoutRecordStatistic.setMaxOxygenTime(eeq.a(cqiVar.d(), -1));
                break;
            default:
                LogUtil.d(TAG, "handleWorkoutRecordRunPace tlvChild parse else");
                break;
        }
    }

    private void handleWorkoutGolfAndSkiingBasicData(cqi cqiVar, WorkoutRecordStatistic workoutRecordStatistic) {
        switch (cqiVar.c()) {
            case 62:
                workoutRecordStatistic.setGolfSwingCount(eeq.a(cqiVar.d(), 0));
                break;
            case 63:
                workoutRecordStatistic.setGolfBackSwingTime(eeq.a(cqiVar.d(), 0));
                break;
            case 64:
                workoutRecordStatistic.setGolfDownSwingTime(eeq.a(cqiVar.d(), 0));
                break;
            case 65:
                workoutRecordStatistic.setGolfSwingSpeed(eeq.a(cqiVar.d(), 0));
                break;
            case 66:
                workoutRecordStatistic.setGolfMaxSwingSpeed(eeq.a(cqiVar.d(), 0));
                break;
            case 67:
                workoutRecordStatistic.setGolfSwingTempo(eeq.a(cqiVar.d(), 0));
                break;
            case 68:
                workoutRecordStatistic.setSkiMaxSlopeDegree(eeq.a(cqiVar.d(), -1));
                break;
            case 69:
                workoutRecordStatistic.setSkiMaxSlopePercent(eeq.a(cqiVar.d(), -1));
                break;
            case 70:
                workoutRecordStatistic.setSkiTotalTime(((long) eeq.a(cqiVar.d(), 0)) * 1000);
                break;
            case 71:
                workoutRecordStatistic.setSkiTotalDistance(eeq.a(cqiVar.d(), 0));
                break;
            case ExerciseSessionRecord.EXERCISE_TYPE_SURFING /* 72 */:
                workoutRecordStatistic.setTemperature(cqiVar.d()[0]);
                break;
            case ExerciseSessionRecord.EXERCISE_TYPE_SWIMMING_OPEN_WATER /* 73 */:
                workoutRecordStatistic.setWeather(eeq.a(cqiVar.d(), -1));
                break;
            default:
                handleWorkoutRecordStatisticBasicData(cqiVar, workoutRecordStatistic);
                break;
        }
    }

    private void handleWorkoutRecordStatisticBasicData(cqi cqiVar, WorkoutRecordStatistic workoutRecordStatistic) {
        switch (cqiVar.c()) {
            case 2:
                workoutRecordStatistic.setWorkoutRecordId(eeq.a(cqiVar.d(), 0));
                break;
            case 3:
                workoutRecordStatistic.setWorkoutRecordStatus(eeq.a(cqiVar.d(), 0));
                break;
            case 4:
                workoutRecordStatistic.setWorkoutRecordStartTime(cph.a(cqiVar.d(), 0L) * 1000);
                break;
            case 5:
                workoutRecordStatistic.setWorkoutRecordEndTime(cph.a(cqiVar.d(), 0L) * 1000);
                break;
            case 6:
                workoutRecordStatistic.setWorkoutRecordCalorie(eeq.a(cqiVar.d(), 0));
                break;
            case 7:
                workoutRecordStatistic.setWorkoutRecordDistance(eeq.a(cqiVar.d(), 0));
                break;
            case 8:
                workoutRecordStatistic.setWorkoutRecordStep(eeq.a(cqiVar.d(), 0));
                break;
            case 9:
                workoutRecordStatistic.setWorkoutRecordTotalTime(cph.a(cqiVar.d(), 0L));
                break;
            case 10:
                workoutRecordStatistic.setWorkoutRecordSpeed(eeq.a(cqiVar.d(), 0));
                break;
            case 11:
                workoutRecordStatistic.setWorkoutClimb(cph.a(cqiVar.d(), -1L));
                break;
            case 12:
                workoutRecordStatistic.setWorkoutHrPeakMin(eeq.a(new byte[]{cqiVar.d()[0]}, 0));
                workoutRecordStatistic.setWorkoutHrPeakMax(eeq.a(new byte[]{cqiVar.d()[1]}, 0));
                break;
            case 13:
                workoutRecordStatistic.setWorkoutLoadPeak(eeq.a(cqiVar.d(), 0));
                break;
            case 14:
                workoutRecordStatistic.setWorkoutEtrainingEffect(eeq.a(cqiVar.d(), 0));
                break;
            default:
                handleWorkoutRecordStatisticBasicDataElse(cqiVar, workoutRecordStatistic);
                break;
        }
    }

    private void handleWorkoutRecordStatisticBasicDataElse(cqi cqiVar, WorkoutRecordStatistic workoutRecordStatistic) {
        switch (cqiVar.c()) {
            case 15:
                workoutRecordStatistic.setWorkoutEpoc(eeq.a(cqiVar.d(), 0));
                break;
            case 16:
                workoutRecordStatistic.setWorkoutMaxMet(eeq.a(cqiVar.d(), 0));
                break;
            case 17:
                workoutRecordStatistic.setWorkoutRecoveryTime(eeq.a(cqiVar.d(), 0));
                break;
            case 18:
                workoutRecordStatistic.setWorkoutExerciseDuration(cph.a(cqiVar.d(), 0L) * 1000);
                break;
            case 19:
                workoutRecordStatistic.setWorkoutDateInfo(cph.a(cqiVar.d(), 0L));
                break;
            case 20:
                int iA = eeq.a(cqiVar.d(), 0);
                workoutRecordStatistic.setWorkoutType(iA);
                ReleaseLogUtil.d(TAG_RELEASE, "handleWorkoutRecordStatisticBasicDataElse WorkoutType:", Integer.valueOf(iA));
                break;
            case 21:
                workoutRecordStatistic.setSwimType(eeq.a(cqiVar.d(), -1));
                break;
            case 22:
                workoutRecordStatistic.setSwimPullTimes(eeq.a(cqiVar.d(), -1));
                break;
            case 23:
                workoutRecordStatistic.setSwimPullRate(eeq.a(cqiVar.d(), -1));
                break;
            case 24:
                workoutRecordStatistic.setSwimPoolLength(eeq.a(cqiVar.d(), -1));
                break;
            case 25:
                workoutRecordStatistic.setSwimTripTimes(eeq.a(cqiVar.d(), -1));
                break;
            case 26:
                workoutRecordStatistic.setSwimAvgSwolf(eeq.a(cqiVar.d(), -1));
                break;
            case 27:
                workoutRecordStatistic.setAccumulativeDropHeight(eeq.a(cqiVar.d(), -1));
                break;
            default:
                handleWorkoutRecordStatisticBasicSwim(cqiVar, workoutRecordStatistic);
                break;
        }
    }

    private void handleWorkoutRecordStatisticBasicSwim(cqi cqiVar, WorkoutRecordStatistic workoutRecordStatistic) {
        switch (cqiVar.c()) {
            case 28:
                workoutRecordStatistic.setHighestAltitude((int) cph.a(cqiVar.d(), -1L));
                break;
            case 29:
                workoutRecordStatistic.setLowestAltitude((int) cph.a(cqiVar.d(), -1L));
                break;
            case 30:
                workoutRecordStatistic.setSwolfBaseKm(eeq.a(cqiVar.d(), -1));
                break;
            case 31:
                workoutRecordStatistic.setSwolfBaseMile(eeq.a(cqiVar.d(), -1));
                break;
            case 32:
                workoutRecordStatistic.setAnaerobicTrainingEffect(eeq.a(cqiVar.d(), -1));
                break;
            case 33:
                workoutRecordStatistic.setHalfMarathonTime(eeq.a(cqiVar.d(), -1));
                break;
            case 34:
                workoutRecordStatistic.setTotalMarathonTime(eeq.a(cqiVar.d(), -1));
                break;
            default:
                handleWorkoutRecordStatisticCoursePlan(cqiVar, workoutRecordStatistic);
                break;
        }
    }

    private void handleWorkoutRecordStatisticCoursePlan(cqi cqiVar, WorkoutRecordStatistic workoutRecordStatistic) {
        switch (cqiVar.c()) {
            case 94:
                workoutRecordStatistic.setPlanId(bytesToString(cqiVar.d()));
                break;
            case 95:
                workoutRecordStatistic.setCourseName(bytesToString(cqiVar.d()));
                break;
            case 96:
                workoutRecordStatistic.setPlanCourseTime(eeq.a(cqiVar.d(), -1));
                break;
            case 97:
                workoutRecordStatistic.setCourseTargetType(eeq.a(cqiVar.d(), -1));
                break;
            case Constants.DEFAULT_PRO_BOT_MARGIN_PAD /* 98 */:
                workoutRecordStatistic.setCourseTargetValue(eeq.a(cqiVar.d(), -1));
                break;
            case 99:
                workoutRecordStatistic.setTrainingPoints(eeq.a(cqiVar.d(), -1));
                break;
            case 100:
                workoutRecordStatistic.setTrainingExperience(eeq.a(cqiVar.d(), -1));
                break;
            case 101:
                workoutRecordStatistic.setCourseModifiedTime(eeq.a(cqiVar.d(), -1));
                break;
            default:
                LogUtil.d(TAG, "handleWorkoutRecordStatisticCoursePlan tlvChild parse else");
                break;
        }
    }

    private boolean handleGetWorkoutRecordStatisticError(List<cqi> list) {
        if (list.isEmpty() || list.get(0).c() != 127) {
            return false;
        }
        if (this.mWorkoutRecordStatisticCallback == null) {
            return true;
        }
        int iA = eeq.a(list.get(0).d(), -1);
        this.mWorkoutRecordStatisticCallback.a(iA, nfo.a(Integer.valueOf(iA), "getWorkoutRecordStatistic"));
        return true;
    }

    private void handleGetWorkoutData(List<eew> list, List<ees> list2) {
        if (list != null && !list.isEmpty() && CommonUtil.v(list.get(0).e()) == 127) {
            if (this.mWorkoutDataCallback != null) {
                this.mWorkoutDataCallback.a(CommonUtil.v(list.get(0).b()), "getWorkoutData error");
                return;
            }
            return;
        }
        WorkoutDataStruct workoutDataStruct = new WorkoutDataStruct();
        if (list2 != null && !list2.isEmpty()) {
            Iterator<ees> it = list2.iterator();
            while (it.hasNext()) {
                handleGetWorkoutDataStruct(workoutDataStruct, it.next().e(), new DataHeader(), new ArrayList(16));
            }
        }
        IBaseResponseCallback iBaseResponseCallback = this.mWorkoutDataCallback;
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(100000, workoutDataStruct);
        } else {
            ReleaseLogUtil.e(TAG_RELEASE, "handleGetWorkoutData mWorkoutDataCallback is null.");
            xjt.p("handleGetWorkoutData mWorkoutDataCallback is null.");
        }
    }

    private void handleGetWorkoutDataStruct(WorkoutDataStruct workoutDataStruct, List<eew> list, DataHeader dataHeader, List<WorkoutDataInfo> list2) {
        ArrayList arrayList = new ArrayList(16);
        ExtrasDataUtils extrasDataUtils = new ExtrasDataUtils();
        int iV = 0;
        String extraBitmap = "";
        String strB = null;
        for (eew eewVar : list) {
            int iV2 = CommonUtil.v(eewVar.e());
            if (iV2 == 2) {
                workoutDataStruct.setWorkoutRecordId(CommonUtil.v(eewVar.b()));
            } else if (iV2 == 3) {
                workoutDataStruct.setWorkoutDataIndex(CommonUtil.v(eewVar.b()));
            } else if (iV2 == 4) {
                extrasDataUtils.parseHeader(eewVar.b(), dataHeader);
                handleWorkoutDataHeader(dataHeader, arrayList, eewVar);
            } else if (iV2 == 5) {
                strB = eewVar.b();
            } else if (iV2 == 8) {
                iV = CommonUtil.v(eewVar.b()) * 2;
            } else if (iV2 == 9) {
                extraBitmap = extrasDataUtils.parseExtraBitmap(eewVar.b());
            } else {
                LogUtil.d(TAG, "handleGetWorkoutDataStruct tlvChild parse else");
            }
        }
        ReleaseLogUtil.d(TAG_RELEASE, "ready parse frame data.");
        extrasDataUtils.parseFrameData(strB, iV, extraBitmap, dataHeader, list2);
        dataHeader.setWorkoutDataInfoList(list2);
        workoutDataStruct.setDataHeader(dataHeader);
    }

    private int handleWorkoutDataHeader(DataHeader dataHeader, List<String> list, eew eewVar) {
        int i = 0;
        dataHeader.setSportId(CommonUtil.v(eewVar.b().substring(0, 4)));
        dataHeader.setFrameId(CommonUtil.v(eewVar.b().substring(4, 8)));
        dataHeader.setTime(CommonUtil.x(eewVar.b().substring(8, 16)) * 1000);
        dataHeader.setTimeInterval(CommonUtil.v(eewVar.b().substring(16, 18)));
        int iV = CommonUtil.v(eewVar.b().substring(18, 22));
        String string = new StringBuffer(Integer.toBinaryString(CommonUtil.v(eewVar.b().substring(24, eewVar.b().length())))).reverse().toString();
        int length = string.length();
        while (i < length) {
            int i2 = i + 1;
            if (i2 <= length) {
                list.add(string.substring(i, i2));
            } else {
                list.add("0");
            }
            i = i2;
        }
        dataHeader.setBitMap(list);
        return iV;
    }

    private void handleWorkoutDataRecordCommand(List<WorkoutDataInfo> list, int i, List<String> list2, List<String> list3) {
        for (int i2 = 0; i2 < i; i2++) {
            WorkoutDataInfo workoutDataInfo = new WorkoutDataInfo();
            int size = list2.size();
            for (int i3 = 0; i3 < size; i3++) {
                if ("1".equals(list2.get(i3))) {
                    handleWorkoutDataBitMap(list3, workoutDataInfo, i3);
                    list3.remove(0);
                }
            }
            list.add(workoutDataInfo);
        }
    }

    private void handleWorkoutDataBitMap(List<String> list, WorkoutDataInfo workoutDataInfo, int i) {
        switch (i) {
            case 0:
                workoutDataInfo.setDataHeartRate(CommonUtil.v(list.get(0)));
                break;
            case 1:
                handleWorkoutDataSpeed(list, workoutDataInfo);
                break;
            case 2:
                workoutDataInfo.setDataStepRate(CommonUtil.v(list.get(0)));
                break;
            case 3:
                String str = list.get(0);
                list.remove(0);
                workoutDataInfo.setDataSwolf(CommonUtil.v(str + list.get(0)));
                break;
            case 4:
                String str2 = list.get(0);
                list.remove(0);
                workoutDataInfo.setDataSwimRate(CommonUtil.v(str2 + list.get(0)));
                break;
            case 5:
                handleWorkoutDataAltitude(list, workoutDataInfo);
                break;
            case 6:
                HwWorkoutServiceUtils.parseRunPostureDataInfo(list, workoutDataInfo);
                break;
            case 7:
                workoutDataInfo.setDataCalories(CommonUtil.v(list.get(0)));
                break;
            default:
                handleWorkoutDataBitMapExtendedField(i, list, workoutDataInfo);
                break;
        }
    }

    private void handleWorkoutDataBitMapExtendedField(int i, List<String> list, WorkoutDataInfo workoutDataInfo) {
        switch (i) {
            case 8:
                String str = list.get(0);
                list.remove(0);
                workoutDataInfo.setDataFrequency(CommonUtil.v(str + list.get(0)));
                break;
            case 9:
                String str2 = list.get(0);
                list.remove(0);
                workoutDataInfo.setRidePower(CommonUtil.v(str2 + list.get(0)));
                break;
            case 10:
                workoutDataInfo.setExtendedFieldEleven(CommonUtil.v(list.get(0)));
                break;
            case 11:
                workoutDataInfo.setExtendedFieldTwelve(CommonUtil.v(list.get(0)));
                break;
            case 12:
                workoutDataInfo.setExtendedFieldThirteen(CommonUtil.v(list.get(0)));
                break;
            case 13:
                workoutDataInfo.setExtendedFieldFourteen(CommonUtil.v(list.get(0)));
                break;
            case 14:
                workoutDataInfo.setExtendedFieldFifteen(CommonUtil.v(list.get(0)));
                break;
            case 15:
                workoutDataInfo.setExtendedFieldSixteen(CommonUtil.v(list.get(0)));
                break;
            default:
                LogUtil.d(TAG, "handleWorkoutDataBitMapExtendedField tlvChild parse else");
                break;
        }
    }

    private void handleWorkoutDataSpeed(List<String> list, WorkoutDataInfo workoutDataInfo) {
        String str = list.get(0);
        list.remove(0);
        workoutDataInfo.setDataSpeed(CommonUtil.v(str + list.get(0)));
    }

    private void handleWorkoutDataAltitude(List<String> list, WorkoutDataInfo workoutDataInfo) {
        String str = list.get(0);
        list.remove(0);
        String str2 = list.get(0);
        list.remove(0);
        String str3 = list.get(0);
        list.remove(0);
        workoutDataInfo.setDataAttitude((int) CommonUtil.x(str + str2 + str3 + list.get(0)));
    }

    private void handleWorkoutRecordPaceMap(List<eew> list, List<ees> list2) {
        if (!list.isEmpty() && CommonUtil.v(list.get(0).e()) == 127) {
            if (this.mWorkoutRecordPaceMapListCallback != null) {
                int iV = CommonUtil.v(list.get(0).b());
                this.mWorkoutRecordPaceMapListCallback.a(iV, nfo.a(Integer.valueOf(iV), "getWorkoutRecordPaceMap"));
                return;
            }
            return;
        }
        WorkRecordIndexPaceMapList workRecordIndexPaceMapList = new WorkRecordIndexPaceMapList();
        ArrayList arrayList = new ArrayList(16);
        for (eew eewVar : list2.get(0).e()) {
            if (CommonUtil.v(eewVar.e()) == 2) {
                workRecordIndexPaceMapList.setWorkoutRecordId(CommonUtil.v(eewVar.b()));
            } else if (CommonUtil.v(eewVar.e()) == 8) {
                workRecordIndexPaceMapList.setPaceIndex(CommonUtil.v(eewVar.b()));
            } else {
                ReleaseLogUtil.e(TAG_RELEASE, "tlv.getTag is else");
            }
        }
        for (ees eesVar : list2.get(0).b()) {
            WorkoutRecordPaceMap workoutRecordPaceMap = new WorkoutRecordPaceMap();
            HwWorkoutServiceUtils.parsePaceMapDataStruct(eesVar, workoutRecordPaceMap);
            arrayList.add(workoutRecordPaceMap);
        }
        workRecordIndexPaceMapList.setPaceMapList(arrayList);
        IBaseResponseCallback iBaseResponseCallback = this.mWorkoutRecordPaceMapListCallback;
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(100000, nfo.a(workRecordIndexPaceMapList, "getWorkoutRecordPaceMap"));
        } else {
            ReleaseLogUtil.e(TAG_RELEASE, "handleWorkoutRecordPaceMap mWorkoutRecordPaceMapListCallback is null.");
            xjt.p("handleWorkoutRecordPaceMap mWorkoutRecordPaceMapListCallback is null.");
        }
    }

    private void handleWorkoutRecordSwimSectionList(List<ees> list) {
        SectionList sectionList = new SectionList();
        Iterator<ees> it = list.iterator();
        while (it.hasNext()) {
            for (eew eewVar : it.next().e()) {
                int iV = CommonUtil.v(eewVar.e());
                if (iV == 2) {
                    sectionList.setWorkoutRecordId(CommonUtil.v(eewVar.b()));
                } else if (iV == 8) {
                    sectionList.setSectionIndex(CommonUtil.v(eewVar.b()));
                } else {
                    LogUtil.d(TAG, "parseSectionListStruct tlvChild parse else");
                }
            }
        }
        ArrayList arrayList = new ArrayList(16);
        Iterator<ees> it2 = list.iterator();
        while (it2.hasNext()) {
            for (ees eesVar : it2.next().b()) {
                SectionInfo sectionInfo = new SectionInfo();
                Bundle bundle = new Bundle();
                HwWorkoutServiceUtils.parseSwimSectionDataStruct(eesVar, bundle);
                sectionInfo.setBundle(bundle);
                arrayList.add(sectionInfo);
            }
        }
        sectionList.setSectionInfos(arrayList);
        IBaseResponseCallback iBaseResponseCallback = this.mSectionListCallback;
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(100000, nfo.a(sectionList, "getWorkoutRecordSectionList"));
        } else {
            ReleaseLogUtil.e(TAG_RELEASE, "handleWorkoutRecordSwimSectionList mSectionListCallback is null.");
        }
    }

    private void handleWorkoutCapability(byte[] bArr, List<eew> list) {
        if (this.mWorkoutCapabilityCallback == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "handleWorkoutCapability mWorkoutCapabilityCallback is null");
            xjt.p("handleWorkoutCapability mWorkoutCapabilityCallback is null.");
            this.mIsSupportNewStep = false;
            this.mIsSupportNewEllipticalAndRowingMachine = false;
            return;
        }
        if (handleWorkoutCapabilityError(bArr)) {
            return;
        }
        for (eew eewVar : list) {
            if (CommonUtil.v(eewVar.e()) == 1) {
                LogUtil.d(TAG, "handleWorkoutCapability enter");
                int iV = CommonUtil.v(eewVar.b());
                if ((iV & 2) == 2) {
                    LogUtil.d(TAG, "mIsSupportNewStep is true");
                    this.mIsSupportNewStep = true;
                } else {
                    this.mIsSupportNewStep = false;
                }
                if ((iV & 4) == 4) {
                    this.mIsSupportNewEllipticalAndRowingMachine = true;
                    ReleaseLogUtil.d(TAG_RELEASE, "mIsSupportNewEllipticalAndRowingMachine is true");
                } else {
                    this.mIsSupportNewEllipticalAndRowingMachine = false;
                }
            } else {
                this.mIsSupportNewStep = false;
                this.mIsSupportNewEllipticalAndRowingMachine = false;
            }
        }
        this.mWorkoutCapabilityCallback.a(100000, nfo.a(Boolean.valueOf(this.mIsSupportNewStep), "getWorkoutCapability"));
    }

    private boolean handleWorkoutCapabilityError(byte[] bArr) {
        if (bArr.length != 8 || bArr[2] != 127) {
            return false;
        }
        this.mIsSupportNewStep = false;
        this.mIsSupportNewEllipticalAndRowingMachine = false;
        try {
            this.mWorkoutCapabilityCallback.a(mxl.c(bArr), nfo.a("", "getWorkoutCapability"));
            return true;
        } catch (eeu e) {
            ReleaseLogUtil.a(TAG_RELEASE, "handleWorkoutCapability Exception: ", ExceptionUtils.c(e));
            xjt.p("handleWorkoutCapability Exception: " + ExceptionUtils.c(e));
            this.mWorkoutCapabilityCallback.a(201000, nfo.a("", "getWorkoutCapability"));
            return true;
        }
    }

    private void handleCommonSectionList(List<eew> list, List<ees> list2) {
        CommonSectionList commonSectionList = new CommonSectionList();
        for (eew eewVar : list) {
            int iV = CommonUtil.v(eewVar.e());
            if (iV == 1) {
                commonSectionList.setWorkoutRecordId(CommonUtil.v(eewVar.b()));
            } else if (iV == 2) {
                commonSectionList.setSectionIndex(CommonUtil.v(eewVar.b()));
            } else {
                LogUtil.d(TAG, "deal else value");
            }
        }
        if (list2.isEmpty()) {
            ReleaseLogUtil.e(TAG_RELEASE, "handleCommonSectionList tlvFatherList is empty");
            xjt.p("handleCommonSectionList tlvFatherList is empty");
            processCallback(22, -1, null);
            return;
        }
        LogUtil.a(TAG, "tlvFatherList size:", Integer.valueOf(list2.size()));
        List<CommonSectionInfo> arrayList = new ArrayList<>(16);
        try {
            JSONObject jSONObject = HwExerciseParams.getInstance().getWorkoutRecordsStatisticArray().get(commonSectionList.getWorkoutRecordId());
            if (jSONObject != null) {
                processWorkoutData(list2, arrayList, jSONObject);
            }
        } catch (JSONException e) {
            ReleaseLogUtil.a(TAG_RELEASE, "handleCommonSectionList JSONException:", ExceptionUtils.c(e));
        }
        ReleaseLogUtil.d(TAG_RELEASE, "sectionInfos size: ", Integer.valueOf(arrayList.size()));
        commonSectionList.setSectionInfos(arrayList);
        processCallback(22, 100000, commonSectionList);
    }

    private void processWorkoutData(List<ees> list, List<CommonSectionInfo> list2, JSONObject jSONObject) throws JSONException {
        int i = jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_TYPE);
        if (i == 22 || i == 25) {
            Iterator<ees> it = list.iterator();
            while (it.hasNext()) {
                analyzeCommonSectionInfo(list2, it.next(), i);
            }
            return;
        }
        analyzeCommonSectionInfo(list2, list.get(0), i);
    }

    private void analyzeCommonSectionInfo(List<CommonSectionInfo> list, ees eesVar, int i) {
        for (ees eesVar2 : eesVar.b()) {
            CommonSectionInfo commonSectionInfo = new CommonSectionInfo();
            HwWorkoutServiceUtils.parseCommonSectionData(eesVar2, commonSectionInfo, i);
            list.add(commonSectionInfo);
        }
    }

    private void addCommandToMap(int i, IBaseResponseCallback iBaseResponseCallback) {
        synchronized (COMMAND_CALLBACK_LOCK) {
            if (iBaseResponseCallback != null) {
                this.mCommandCallbackMap.put(Integer.valueOf(i), iBaseResponseCallback);
            }
        }
    }

    private void processCallback(int i, int i2, Object obj) {
        LogUtil.a(TAG, "processCallback callback commandId is ", Integer.valueOf(i), " error is ", Integer.valueOf(i2));
        synchronized (COMMAND_CALLBACK_LOCK) {
            IBaseResponseCallback iBaseResponseCallback = this.mCommandCallbackMap.get(Integer.valueOf(i));
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(i2, obj);
            }
        }
    }

    private static List<IBaseResponseCallback> getWorkoutRealTimeInfoCallbackList() {
        List<IBaseResponseCallback> list;
        synchronized (HwWorkoutServiceManager.class) {
            list = sWorkoutRealTimeInfoCallbackList;
        }
        return list;
    }

    private static List<IBaseResponseCallback> getNotificationWorkoutRealTimeInfoCallbackList() {
        List<IBaseResponseCallback> list;
        synchronized (HwWorkoutServiceManager.class) {
            list = sNotificationWorkoutRealTimeInfoCallbackList;
        }
        return list;
    }

    private static List<IBaseResponseCallback> getNotificationSportReminderCallbackList() {
        List<IBaseResponseCallback> list;
        synchronized (HwWorkoutServiceManager.class) {
            list = sNotificationSportReminderCallbackList;
        }
        return list;
    }

    private DeviceCapability getCapability(DeviceInfo deviceInfo) {
        Map<String, DeviceCapability> mapQueryDeviceCapability = this.mHwDeviceMgr.queryDeviceCapability(1, deviceInfo.getDeviceIdentify(), TAG);
        if (mapQueryDeviceCapability == null || mapQueryDeviceCapability.isEmpty()) {
            ReleaseLogUtil.e(TAG_RELEASE, "getCapability deviceCapabilityHashMaps is null");
            xjt.p("getCapability deviceCapabilityHashMaps is null");
            return null;
        }
        return mapQueryDeviceCapability.get(deviceInfo.getDeviceIdentify());
    }
}
