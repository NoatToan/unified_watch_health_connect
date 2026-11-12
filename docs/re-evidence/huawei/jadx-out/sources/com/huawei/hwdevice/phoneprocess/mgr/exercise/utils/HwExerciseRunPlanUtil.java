package com.huawei.hwdevice.phoneprocess.mgr.exercise.utils;

import android.os.RemoteException;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.algorithm.api.TrackFeatureExtractionApi;
import com.huawei.health.device.model.OperatorStatus;
import com.huawei.health.devicemgr.business.constant.TransferFileReqType;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.h5pro.utils.GsonUtil;
import com.huawei.health.suggestion.model.FitRunPlayAudio;
import com.huawei.hihealth.data.model.TrackSwimSegment;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseAdviceManager;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseAdviceManagerHelper;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseParams;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwLinkageServiceManager;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.LastSyncTimestampDb;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.CommonSectionInfo;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.MotionPath;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.MotionPathSimplify;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.RunPlanParameter;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.RunPlanRecord;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.RunPlanRecordInfo;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.RunPlanRecordStruct;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.StatisticExtendDataStruct;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.TrackAltitudeData;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.WorkoutDataStruct;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.WorkoutDisplayInfo;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.multisync.HwExerciseAdviceAw70Manager;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.seuqneceutils.DetailsFieldParser;
import com.huawei.hwfoundationmodel.trackmodel.TrackAltPointData;
import com.huawei.hwfoundationmodel.trackmodel.TrackDistanceData;
import com.huawei.hwfoundationmodel.trackmodel.TrackPauseData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback;
import com.huawei.hwsportmodel.CommonSegment;
import com.huawei.operation.OperationKey;
import com.huawei.route.RouteOutputForApp;
import com.huawei.route.RouteTrackInfo;
import com.huawei.route.RouteTrackPoint;
import com.huawei.route.RouteType;
import com.huawei.route.SceneType;
import com.huawei.route.SlopeInfo;
import defpackage.cpl;
import defpackage.eel;
import defpackage.eeq;
import defpackage.ees;
import defpackage.eet;
import defpackage.eeu;
import defpackage.eew;
import defpackage.eey;
import defpackage.mhp;
import defpackage.mkf;
import defpackage.mlp;
import defpackage.mrj;
import defpackage.mvg;
import defpackage.mvj;
import defpackage.mvt;
import defpackage.nff;
import defpackage.nfo;
import defpackage.njj;
import defpackage.peh;
import defpackage.xjt;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class HwExerciseRunPlanUtil {
    private static final int DICT_TYPE = 30288;
    private static final int END_TIME_INDEX = 1;
    private static final int FILE_TYPE = 22;
    private static final int LENGTH_REQUEST_TIME = 2;
    private static final int METER_TO_CENTIMETER = 100;
    private static final int START_TIME_INDEX = 0;
    private static final String TAG = "HwExerciseRunPlanUtil";
    private static final String TAG_RELEASE = "R_HwExerciseRunPlanUtil";
    private static final int TRACK_MAX_TARGET_POINT = 80000;
    private static String mDivingFileName;
    private static String mSequenceFileName;
    private static final Object LOCK_OBJECT = new Object();
    private static List<IBaseResponseCallback> sRunPlanParameterCallbackList = new ArrayList(16);
    private static List<IBaseResponseCallback> sSetRunPlanCallbackList = new ArrayList(16);
    private static List<IBaseResponseCallback> sSetRunPlanReminderSwitchCallbackList = new ArrayList(16);
    private static List<IBaseResponseCallback> sGetRunPlanRecordCallbackList = new ArrayList(16);
    private static List<IBaseResponseCallback> sGetRunPlanRecordInfoCallbackList = new ArrayList(16);
    private static List<IBaseResponseCallback> sNotificationRunPlanRecordInfoCallbackList = new ArrayList(16);

    private HwExerciseRunPlanUtil() {
    }

    public static void parseGetRunPlanParam(List<eew> list, List<ees> list2) {
        if (list != null && !list.isEmpty() && CommonUtil.v(list.get(0).e()) == 127) {
            responseRunPlanParam(CommonUtil.v(list.get(0).b()));
            return;
        }
        RunPlanParameter runPlanParameter = new RunPlanParameter();
        if (list2 == null || list2.isEmpty()) {
            responseRunPlanParam(100001);
            return;
        }
        Iterator<ees> it = list2.iterator();
        while (it.hasNext()) {
            setRunPlanParam(runPlanParameter, it.next().e());
        }
        synchronized (getRunPlanParameterCallbackList()) {
            if (!sRunPlanParameterCallbackList.isEmpty()) {
                int runPlanSyncSize = runPlanParameter.getRunPlanSyncSize();
                runPlanParameter.setRunPlanSyncSizePre(runPlanSyncSize / 256);
                runPlanParameter.setRunPlanSyncSizeSub(runPlanSyncSize % 256);
                sRunPlanParameterCallbackList.get(0).a(100000, nfo.a(runPlanParameter, "getRunPlanParameterforhealth"));
                sRunPlanParameterCallbackList.remove(0);
            }
        }
    }

    private static void setRunPlanParam(RunPlanParameter runPlanParameter, List<eew> list) {
        for (eew eewVar : list) {
            int iV = CommonUtil.v(eewVar.e());
            if (iV == 2) {
                runPlanParameter.setRunPlanTotalSign(eeq.d(eewVar.b()));
            } else if (iV == 3) {
                runPlanParameter.setRunPlanSign(eewVar.b());
            } else if (iV == 4) {
                runPlanParameter.setRunPlanAlgorithmType(CommonUtil.v(eewVar.b()));
            } else if (iV == 5) {
                runPlanParameter.setRunPlanAlgorithmVersion(eeq.d(eewVar.b()));
            } else if (iV == 6) {
                runPlanParameter.setRunPlanSyncSize(CommonUtil.v(eewVar.b()));
            } else {
                LogUtil.j(TAG, "no support tag.");
            }
        }
    }

    private static void responseRunPlanParam(int i) {
        synchronized (getRunPlanParameterCallbackList()) {
            if (!sRunPlanParameterCallbackList.isEmpty()) {
                sRunPlanParameterCallbackList.get(0).a(i, nfo.a(Integer.valueOf(i), "getRunPlanParameterforhealth"));
                sRunPlanParameterCallbackList.remove(0);
            }
        }
    }

    public static void parseSetRunPlan(List<eew> list) {
        int iV = 0;
        for (eew eewVar : list) {
            if (CommonUtil.v(eewVar.e()) == 127) {
                iV = CommonUtil.v(eewVar.b());
            } else {
                LogUtil.j(TAG, "no support tlvList");
            }
        }
        synchronized (getSetRunPlanCallbackList()) {
            if (!sSetRunPlanCallbackList.isEmpty()) {
                sSetRunPlanCallbackList.get(0).a(iV, nfo.a(Integer.valueOf(iV), "setRunPlan"));
                sSetRunPlanCallbackList.remove(0);
            }
        }
    }

    public static void parseRunPlanSwitch(List<eew> list) {
        int iV = 0;
        for (eew eewVar : list) {
            if (CommonUtil.v(eewVar.e()) == 127) {
                iV = CommonUtil.v(eewVar.b());
            } else {
                LogUtil.j(TAG, "no support tlvList.");
            }
        }
        synchronized (getSetRunPlanReminderSwitchCallbackList()) {
            if (!sSetRunPlanReminderSwitchCallbackList.isEmpty()) {
                sSetRunPlanReminderSwitchCallbackList.get(0).a(iV, nfo.a(Integer.valueOf(iV), "setRunPlanReminderSwitch"));
                sSetRunPlanReminderSwitchCallbackList.remove(0);
            }
        }
    }

    public static void parseRunPlanRecord(List<eew> list, List<ees> list2) {
        if (!list.isEmpty() && CommonUtil.v(list.get(0).e()) == 127) {
            synchronized (getGetRunPlanRecordCallbackList()) {
                if (!sGetRunPlanRecordCallbackList.isEmpty()) {
                    int iV = CommonUtil.v(list.get(0).b());
                    sGetRunPlanRecordCallbackList.get(0).a(iV, nfo.a(Integer.valueOf(iV), "getRunPlanRecord"));
                    sGetRunPlanRecordCallbackList.remove(0);
                }
            }
            return;
        }
        RunPlanRecord runPlanRecord = new RunPlanRecord();
        ArrayList arrayList = new ArrayList(16);
        for (ees eesVar : list2) {
            for (eew eewVar : eesVar.e()) {
                if (CommonUtil.v(eewVar.e()) == 2) {
                    runPlanRecord.setRunPlanRecordCount(CommonUtil.v(eewVar.b()));
                } else {
                    LogUtil.j(TAG, "no support tlv.");
                }
            }
            Iterator<ees> it = eesVar.b().iterator();
            while (it.hasNext()) {
                parseAddRunPlanRecordStruct(arrayList, it.next());
            }
        }
        if (!arrayList.isEmpty()) {
            TriathlonUtils.getInstance().saveRunPlayLastRecordId(arrayList.get(arrayList.size() - 1).getRunPlanRecordId());
        }
        runPlanRecord.setRunPlanRecordStructList(arrayList);
        transferRunPlanRecord(runPlanRecord);
    }

    private static void transferRunPlanRecord(RunPlanRecord runPlanRecord) {
        synchronized (getGetRunPlanRecordCallbackList()) {
            if (!sGetRunPlanRecordCallbackList.isEmpty()) {
                sGetRunPlanRecordCallbackList.get(0).a(100000, nfo.a(runPlanRecord, "getRunPlanRecord"));
                sGetRunPlanRecordCallbackList.remove(0);
            } else {
                LogUtil.j(TAG, "parseRunPlanRecord sGetRunPlanRecordCallbackList is empty.");
                if (HwExerciseParams.getInstance().isDetailSyncing()) {
                    HwExerciseParams.getInstance().setIsDetailSyncing(false);
                }
            }
        }
    }

    private static void parseAddRunPlanRecordStruct(List<RunPlanRecordStruct> list, ees eesVar) {
        RunPlanRecordStruct runPlanRecordStruct = new RunPlanRecordStruct();
        for (eew eewVar : eesVar.e()) {
            switch (CommonUtil.v(eewVar.e())) {
                case 6:
                    runPlanRecordStruct.setRunPlanWorkoutId(CommonUtil.v(eewVar.b()));
                    break;
                case 7:
                    runPlanRecordStruct.setRunPlanRecordId(CommonUtil.v(eewVar.b()));
                    break;
                case 8:
                    runPlanRecordStruct.setRunPlanIndexCount(CommonUtil.v(eewVar.b()));
                    break;
                case 9:
                    runPlanRecordStruct.setPaceIndexCount(CommonUtil.v(eewVar.b()));
                    break;
                default:
                    LogUtil.j(TAG, "no support tlv.");
                    break;
            }
        }
        list.add(runPlanRecordStruct);
    }

    public static void parseRunPlanRecordInfo(List<eew> list, List<ees> list2) {
        if (!list.isEmpty() && CommonUtil.v(list.get(0).e()) == 127) {
            synchronized (getGetRunPlanRecordInfoCallbackList()) {
                if (!sGetRunPlanRecordInfoCallbackList.isEmpty()) {
                    int iV = CommonUtil.v(list.get(0).b());
                    sGetRunPlanRecordInfoCallbackList.get(0).a(iV, nfo.a(Integer.valueOf(iV), "getRunPlanRecordInfo"));
                    sGetRunPlanRecordInfoCallbackList.remove(0);
                }
            }
            return;
        }
        ArrayList arrayList = new ArrayList(16);
        Iterator<ees> it = list2.iterator();
        while (it.hasNext()) {
            addRunPlanRecordInfo(arrayList, it.next());
        }
        synchronized (getGetRunPlanRecordInfoCallbackList()) {
            if (!sGetRunPlanRecordInfoCallbackList.isEmpty()) {
                sGetRunPlanRecordInfoCallbackList.get(0).a(100000, nfo.a(arrayList, "getRunPlanRecordInfo"));
                sGetRunPlanRecordInfoCallbackList.remove(0);
            }
        }
    }

    private static void addRunPlanRecordInfo(List<RunPlanRecordInfo> list, ees eesVar) {
        List<eew> listE = eesVar.e();
        RunPlanRecordInfo runPlanRecordInfo = new RunPlanRecordInfo();
        for (eew eewVar : listE) {
            switch (CommonUtil.v(eewVar.e())) {
                case 2:
                    runPlanRecordInfo.setRunPlanRecordInfoId(CommonUtil.v(eewVar.b()));
                    break;
                case 3:
                    runPlanRecordInfo.setRunPlanRecordInfoStatus(CommonUtil.v(eewVar.b()));
                    break;
                case 4:
                    runPlanRecordInfo.setRunPlanRecordInfoStartTime(Long.parseLong(eewVar.b(), 16) * 1000);
                    break;
                case 5:
                    try {
                        runPlanRecordInfo.setRunPlanRecordInfoEndTime(Long.parseLong(eewVar.b(), 16) * 1000);
                    } catch (NumberFormatException e) {
                        ReleaseLogUtil.a(TAG_RELEASE, "setRunPlanRecordInfoEndTime NumberFormatException : ", ExceptionUtils.c(e));
                    }
                    break;
                case 6:
                    runPlanRecordInfo.setRunPlanRecordInfoCalorie(CommonUtil.v(eewVar.b()));
                    break;
                case 7:
                    runPlanRecordInfo.setRunPlanRecordInfoDistance(CommonUtil.v(eewVar.b()));
                    break;
                case 8:
                    runPlanRecordInfo.setRunPlanRecordInfoStep(CommonUtil.v(eewVar.b()));
                    break;
                case 9:
                    runPlanRecordInfo.setRunPlanRecordInfoTotalTime(CommonUtil.v(eewVar.b()));
                    break;
                case 10:
                    runPlanRecordInfo.setRunPlanRecordInfoSpeed(CommonUtil.v(eewVar.b()) / 10.0f);
                    break;
                case 11:
                    runPlanRecordInfo.setRunPlanRecordInfoClimb(CommonUtil.v(eewVar.b()));
                    break;
                default:
                    addRunPlanRecordInfo(CommonUtil.v(eewVar.e()), runPlanRecordInfo, eewVar);
                    break;
            }
        }
        list.add(runPlanRecordInfo);
    }

    private static void addRunPlanRecordInfo(int i, RunPlanRecordInfo runPlanRecordInfo, eew eewVar) {
        switch (i) {
            case 12:
                runPlanRecordInfo.setRunPlanRecordInfoHrabsMin(CommonUtil.v(eewVar.b().substring(0, 2)));
                runPlanRecordInfo.setRunPlanRecordInfoHrabsMax(CommonUtil.v(eewVar.b().substring(2, 4)));
                break;
            case 13:
                runPlanRecordInfo.setRunPlanRecordInfoLoadPeak(CommonUtil.v(eewVar.b()));
                break;
            case 14:
                runPlanRecordInfo.setRunPlanRecordEtrainingEffect(CommonUtil.v(eewVar.b()));
                break;
            case 15:
                runPlanRecordInfo.setRunPlanRecordAchievePercent(CommonUtil.v(eewVar.b()));
                break;
            case 16:
                runPlanRecordInfo.setRunPlanRecordInfoEpoc(CommonUtil.v(eewVar.b()));
                break;
            case 17:
                runPlanRecordInfo.setRunPlanRecordInfoMaxMet(CommonUtil.v(eewVar.b()));
                break;
            case 18:
                runPlanRecordInfo.setRunPlanRecordInfoRecoveryTime(CommonUtil.v(eewVar.b()));
                break;
            case 19:
            default:
                LogUtil.j(TAG, "no support tlv tag.");
                break;
            case 20:
                runPlanRecordInfo.setRunPlanRecordInfoExerciseDuration(((long) CommonUtil.v(eewVar.b())) * 1000);
                break;
            case 21:
                runPlanRecordInfo.setRunPlanRecordInfoDateInfo(CommonUtil.v(eewVar.b()));
                break;
            case 22:
                runPlanRecordInfo.setRunPlanAlgType(CommonUtil.v(eewVar.b()));
                break;
        }
    }

    public static void parseNotificationRunPlanRecordInfo(List<ees> list) {
        ArrayList arrayList = new ArrayList(16);
        Iterator<ees> it = list.iterator();
        while (it.hasNext()) {
            List<eew> listE = it.next().e();
            RunPlanRecordInfo runPlanRecordInfo = new RunPlanRecordInfo();
            for (eew eewVar : listE) {
                switch (CommonUtil.v(eewVar.e())) {
                    case 2:
                        runPlanRecordInfo.setRunPlanRecordInfoWourkoutId(CommonUtil.v(eewVar.b()));
                        break;
                    case 3:
                        runPlanRecordInfo.setRunPlanRecordInfoStatus(CommonUtil.v(eewVar.b()));
                        break;
                    case 4:
                        try {
                            runPlanRecordInfo.setRunPlanRecordInfoStartTime(Long.parseLong(eewVar.b(), 16) * 1000);
                        } catch (NumberFormatException e) {
                            ReleaseLogUtil.a(TAG_RELEASE, "setRunPlanRecordInfoStartTime NumberFormatException : ", ExceptionUtils.c(e));
                        }
                        break;
                    case 5:
                        runPlanRecordInfo.setRunPlanRecordInfoEndTime(Long.parseLong(eewVar.b(), 16) * 1000);
                        break;
                    case 6:
                        runPlanRecordInfo.setRunPlanRecordInfoCalorie(CommonUtil.v(eewVar.b()));
                        break;
                    case 7:
                        runPlanRecordInfo.setRunPlanRecordInfoDistance(CommonUtil.v(eewVar.b()));
                        break;
                    case 8:
                        runPlanRecordInfo.setRunPlanRecordInfoStep(CommonUtil.v(eewVar.b()));
                        break;
                    case 9:
                        runPlanRecordInfo.setRunPlanRecordInfoTotalTime(CommonUtil.v(eewVar.b()));
                        break;
                    default:
                        parseNotificationRunPlanRecordInfo(CommonUtil.v(eewVar.e()), runPlanRecordInfo, eewVar);
                        break;
                }
            }
            arrayList.add(runPlanRecordInfo);
        }
        synchronized (getNotificationRunPlanRecordInfoCallbackList()) {
            Iterator<IBaseResponseCallback> it2 = sNotificationRunPlanRecordInfoCallbackList.iterator();
            while (it2.hasNext()) {
                it2.next().a(100000, nfo.a(arrayList, "registerNotificationRunPlanRecordInfoCallbackList"));
            }
        }
    }

    private static void parseNotificationRunPlanRecordInfo(int i, RunPlanRecordInfo runPlanRecordInfo, eew eewVar) {
        switch (i) {
            case 10:
                runPlanRecordInfo.setRunPlanRecordInfoSpeed(CommonUtil.v(eewVar.b()) / 10.0f);
                break;
            case 11:
                runPlanRecordInfo.setRunPlanRecordInfoClimb(CommonUtil.v(eewVar.b()));
                break;
            case 12:
                runPlanRecordInfo.setRunPlanRecordInfoHrabsMin(CommonUtil.v(eewVar.b().substring(0, 2)));
                runPlanRecordInfo.setRunPlanRecordInfoHrabsMax(CommonUtil.v(eewVar.b().substring(2, 4)));
                break;
            case 13:
                runPlanRecordInfo.setRunPlanRecordInfoLoadPeak(CommonUtil.v(eewVar.b()));
                break;
            case 14:
                runPlanRecordInfo.setRunPlanRecordEtrainingEffect(CommonUtil.v(eewVar.b()));
                break;
            case 15:
                runPlanRecordInfo.setRunPlanRecordAchievePercent(CommonUtil.v(eewVar.b()));
                break;
            case 16:
                runPlanRecordInfo.setRunPlanRecordInfoEpoc(CommonUtil.v(eewVar.b()));
                break;
            case 17:
                runPlanRecordInfo.setRunPlanRecordInfoMaxMet(CommonUtil.v(eewVar.b()));
                break;
            default:
                parseOtherNotificationRunPlanRecordInfo(i, runPlanRecordInfo, eewVar);
                break;
        }
    }

    private static void parseOtherNotificationRunPlanRecordInfo(int i, RunPlanRecordInfo runPlanRecordInfo, eew eewVar) {
        switch (i) {
            case 18:
                runPlanRecordInfo.setRunPlanRecordInfoRecoveryTime(CommonUtil.v(eewVar.b()));
                break;
            case 19:
                runPlanRecordInfo.setRunPlanRecordInfoDailyScore(CommonUtil.v(eewVar.b()));
                break;
            case 20:
                runPlanRecordInfo.setRunPlanRecordInfoExerciseDuration(((long) CommonUtil.v(eewVar.b())) * 1000);
                break;
            case 21:
                runPlanRecordInfo.setRunPlanRecordInfoDateInfo(CommonUtil.v(eewVar.b()));
                break;
            case 22:
                runPlanRecordInfo.setRunPlanAlgType(CommonUtil.v(eewVar.b()));
                break;
            default:
                LogUtil.j(TAG, "no support value.");
                break;
        }
    }

    public static List<IBaseResponseCallback> getRunPlanParameterCallbackList() {
        List<IBaseResponseCallback> list;
        synchronized (HwExerciseRunPlanUtil.class) {
            list = sRunPlanParameterCallbackList;
        }
        return list;
    }

    public static List<IBaseResponseCallback> getSetRunPlanCallbackList() {
        List<IBaseResponseCallback> list;
        synchronized (HwExerciseRunPlanUtil.class) {
            list = sSetRunPlanCallbackList;
        }
        return list;
    }

    public static List<IBaseResponseCallback> getSetRunPlanReminderSwitchCallbackList() {
        List<IBaseResponseCallback> list;
        synchronized (HwExerciseRunPlanUtil.class) {
            list = sSetRunPlanReminderSwitchCallbackList;
        }
        return list;
    }

    public static List<IBaseResponseCallback> getGetRunPlanRecordCallbackList() {
        List<IBaseResponseCallback> list;
        synchronized (HwExerciseRunPlanUtil.class) {
            list = sGetRunPlanRecordCallbackList;
        }
        return list;
    }

    public static List<IBaseResponseCallback> getGetRunPlanRecordInfoCallbackList() {
        List<IBaseResponseCallback> list;
        synchronized (HwExerciseRunPlanUtil.class) {
            list = sGetRunPlanRecordInfoCallbackList;
        }
        return list;
    }

    public static List<IBaseResponseCallback> getNotificationRunPlanRecordInfoCallbackList() {
        List<IBaseResponseCallback> list;
        synchronized (HwExerciseRunPlanUtil.class) {
            list = sNotificationRunPlanRecordInfoCallbackList;
        }
        return list;
    }

    public static void getRunPlanParameter(IBaseResponseCallback iBaseResponseCallback) {
        synchronized (LOCK_OBJECT) {
            try {
                if (iBaseResponseCallback == null) {
                    return;
                }
                synchronized (getRunPlanParameterCallbackList()) {
                    getRunPlanParameterCallbackList().add(iBaseResponseCallback);
                }
                mkf.e(BaseApplication.getContext()).sendDeviceData(HwExerciseCommandUtil.getRunPlanParameterCommand());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void setRunPlanForHealth(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) throws JSONException {
        synchronized (LOCK_OBJECT) {
            try {
                if (iBaseResponseCallback == null) {
                    return;
                }
                synchronized (getSetRunPlanCallbackList()) {
                    getSetRunPlanCallbackList().add(iBaseResponseCallback);
                }
                mkf.e(BaseApplication.getContext()).sendDeviceData(HwExerciseCommandUtil.getSetRunPlanForHealthParam(jSONObject));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void setRunPlanReminderSwitch(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) throws JSONException {
        synchronized (LOCK_OBJECT) {
            try {
                if (iBaseResponseCallback == null) {
                    return;
                }
                synchronized (getSetRunPlanReminderSwitchCallbackList()) {
                    getSetRunPlanReminderSwitchCallbackList().add(iBaseResponseCallback);
                }
                mkf.e(BaseApplication.getContext()).sendDeviceData(HwExerciseCommandUtil.getRunPlanReminderSwitchCommand(jSONObject));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void getRunPlanRecord(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) throws JSONException {
        synchronized (LOCK_OBJECT) {
            try {
                if (iBaseResponseCallback == null) {
                    return;
                }
                synchronized (getGetRunPlanRecordCallbackList()) {
                    getGetRunPlanRecordCallbackList().add(iBaseResponseCallback);
                }
                mkf.e(BaseApplication.getContext()).sendDeviceData(HwExerciseCommandUtil.getRunPlanRecordCommand(jSONObject));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void getRunPlanRecordInfo(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) throws JSONException {
        synchronized (LOCK_OBJECT) {
            try {
                if (jSONObject == null || iBaseResponseCallback == null) {
                    return;
                }
                synchronized (getGetRunPlanRecordInfoCallbackList()) {
                    getGetRunPlanRecordInfoCallbackList().add(iBaseResponseCallback);
                }
                mkf.e(BaseApplication.getContext()).sendDeviceData(HwExerciseCommandUtil.getRunPlanRecordInfoCommand(jSONObject));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void parseResult(DeviceInfo deviceInfo, byte[] bArr) {
        if (deviceInfo == null || bArr == null) {
            LogUtil.j(TAG, "param is null.");
            return;
        }
        cpl.d(TAG, bArr, "HwExerciseAdviceManager getResult(): ");
        if (eel.d(deviceInfo.getProductType())) {
            HwExerciseAdviceAw70Manager.getInstance(HwExerciseAdviceManager.getInstance()).getResult(bArr);
        }
        if (eet.e(bArr)) {
            return;
        }
        String strE = eeq.e(bArr);
        if (strE.length() <= 4) {
            LogUtil.e(TAG, "tlv message is to short.");
            return;
        }
        try {
            ees eesVarB = new eet().b(strE.substring(4, strE.length()));
            List<eew> listE = eesVarB.e();
            List<ees> listB = eesVarB.b();
            switch (bArr[1]) {
                case 1:
                    parseGetRunPlanParam(listE, listB);
                    break;
                case 2:
                    parseSetRunPlan(listE);
                    break;
                case 3:
                    parseRunPlanSwitch(listE);
                    break;
                case 4:
                    parseRunPlanRecord(listE, listB);
                    break;
                case 5:
                    parseRunPlanRecordInfo(listE, listB);
                    break;
                case 6:
                    parseNotificationRunPlanRecordInfo(listB);
                    break;
                default:
                    Object[] objArr = new Object[1];
                    objArr[0] = "unknown tlv tag.";
                    LogUtil.j(TAG, objArr);
                    break;
            }
        } catch (eeu | NumberFormatException e) {
            LogUtil.e(TAG, "wrong tlv message: ", ExceptionUtils.c(e));
        }
    }

    public static void setMetricUnit(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) {
        if (jSONObject != null) {
            try {
                if (jSONObject.has("unit")) {
                    LogUtil.a(TAG, "setMetricUnit unit is set to flag ", Boolean.valueOf(jSONObject.getBoolean("unit")));
                    nff.e(null);
                }
            } catch (JSONException unused) {
                LogUtil.e(TAG, "setMetricUnit JSONException");
            }
        }
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(100001, null);
        }
    }

    public static void setLastSyncTime(long j, HwExerciseAdviceManager hwExerciseAdviceManager) {
        if (hwExerciseAdviceManager == null) {
            LogUtil.j(TAG, "setLastSyncTime manager is null.");
        } else {
            new LastSyncTimestampDb().setLastTimestamp(hwExerciseAdviceManager, j);
        }
    }

    public static void notifyDetailSyncComplete(int i, String str, HwExerciseAdviceManager hwExerciseAdviceManager) {
        LogUtil.a(TAG, "notifyDetailSyncComplete errorCode: ", Integer.valueOf(i), " errorInfo: ", str);
        HwExerciseParams hwExerciseParams = HwExerciseParams.getInstance();
        if (hwExerciseParams.getHwExerciseAdviceManagerHandler() != null) {
            hwExerciseParams.getHwExerciseAdviceManagerHandler().removeMessages(0);
        }
        if (i == 0) {
            hwExerciseAdviceManager.changeRecordSyncMark();
            setLastSyncTime(hwExerciseParams.getCurrentTime(), hwExerciseAdviceManager);
        } else {
            hwExerciseParams.setIsDetailSyncing(false);
        }
    }

    public static boolean handleSaveRunPlayRecord(int i, boolean z, HwExerciseAdviceManager hwExerciseAdviceManager) throws JSONException {
        HwExerciseParams hwExerciseParams = HwExerciseParams.getInstance();
        if (hwExerciseParams.getRunPlanRecord() != null) {
            JSONArray jSONArray = hwExerciseParams.getRunPlanRecord().getJSONArray(HwExerciseConstants.JSON_NAME_WORKOUT_RUN_PLAY_RECORD_STRUCT);
            if (jSONArray.length() > 0) {
                z = true;
            }
            ArrayList arrayList = new ArrayList();
            for (WorkoutDataStruct workoutDataStruct : hwExerciseParams.getWorkoutDetailDataList()) {
                if (i == workoutDataStruct.getWorkoutRecordId()) {
                    arrayList.add(workoutDataStruct);
                }
            }
            JSONArray jSONArray2 = new JSONArray();
            for (JSONObject jSONObject : hwExerciseParams.getWorkoutRecordPaceMapList()) {
                if (i == jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_RECORD_ID)) {
                    jSONArray2.put(jSONObject);
                }
            }
            LogUtil.a(TAG, "runPlayRecordId: ", Integer.valueOf(i), " detailRunPlayDataArray: ", Integer.valueOf(arrayList.size()));
            if (hwExerciseParams.getGpsWorkoutMap().get(Integer.valueOf(i)) != null) {
                LogUtil.a(TAG, "mGpsWorkoutMap size: ", Integer.valueOf(hwExerciseParams.getGpsWorkoutMap().get(Integer.valueOf(i)).size()));
            }
            hwExerciseParams.setSaveDataItemNumber(hwExerciseParams.getSaveDataItemNumber() + 1);
            int iIntValue = hwExerciseParams.getGpsWorkoutAndRunPlanTypeMap().get(Integer.valueOf(i)) != null ? hwExerciseParams.getGpsWorkoutAndRunPlanTypeMap().get(Integer.valueOf(i)).intValue() : -1;
            int workoutId = getWorkoutId(jSONArray, i, 0);
            JSONObject jSONObject2 = hwExerciseParams.getRunPlanRecordsStatisticArray().get(i);
            hwExerciseParams.getWorkoutParamMap().put(HwExerciseConstants.METHOD_PARAM_WORKOUT_ID, Integer.valueOf(workoutId));
            hwExerciseParams.getWorkoutParamMap().put(HwExerciseConstants.METHOD_PARAM_WORKOUT_TYPE, Integer.valueOf(iIntValue));
            hwExerciseParams.getWorkoutParamMap().put(HwExerciseConstants.JSON_NAME_WORKOUT_RECORD_ID, Integer.valueOf(i));
            HwExerciseAdviceManagerHelper.getInstance().saveDataToTrack(jSONObject2, arrayList, hwExerciseParams.getGpsWorkoutMap().get(Integer.valueOf(i)), jSONArray2, hwExerciseParams.getWorkoutParamMap());
        }
        return z;
    }

    private static int getWorkoutId(JSONArray jSONArray, int i, int i2) throws JSONException {
        int length = jSONArray.length();
        for (int i3 = 0; i3 < length; i3++) {
            if (i == jSONArray.getJSONObject(i3).getInt(HwExerciseConstants.JSON_NAME_WORKOUT_RUN_PLAY_RECORD_ID)) {
                return jSONArray.getJSONObject(i3).getInt(HwExerciseConstants.JSON_NAME_WORKOUT_RUN_PLAY_ID);
            }
        }
        return i2;
    }

    public static void handleNotRunToTrackSportData(JSONObject jSONObject, Map<String, Integer> map) throws JSONException {
        map.put("record_id", Integer.valueOf(jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_RECORD_ID)));
        map.put("status", Integer.valueOf(jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_RECORD_STATUS)));
        map.put("load_peak", Integer.valueOf(jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_LOAD_PEAK)));
        map.put("etraining_effect", Integer.valueOf(jSONObject.getInt(HwExerciseConstants.JSON_NAME_ETRAINING_EFFECT)));
        map.put("extra_poc", Integer.valueOf(jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_EPOC)));
        int i = jSONObject.getInt(HwExerciseConstants.JSON_NAME_MAX_MET);
        maxNetEvent(i, jSONObject);
        map.put("max_met", Integer.valueOf(i));
        map.put("recovery_time", Integer.valueOf(jSONObject.getInt(HwExerciseConstants.JSON_NAME_RECOVERY_TIME)));
        if (jSONObject.getInt(HwExerciseConstants.JSON_NAME_SWIM_TYPE) != -1) {
            map.put("swim_stroke", Integer.valueOf(jSONObject.getInt(HwExerciseConstants.JSON_NAME_SWIM_TYPE)));
        }
        if (jSONObject.getInt(HwExerciseConstants.JSON_NAME_SWIM_PULL_TIMES) != -1) {
            map.put(HwExerciseConstants.JSON_NAME_SWIM_PULL_TIMES, Integer.valueOf(jSONObject.getInt(HwExerciseConstants.JSON_NAME_SWIM_PULL_TIMES)));
        }
        if (jSONObject.getInt(HwExerciseConstants.JSON_NAME_SWIM_PULL_RATE) != -1) {
            map.put("swim_pull_freq", Integer.valueOf(jSONObject.getInt(HwExerciseConstants.JSON_NAME_SWIM_PULL_RATE)));
        }
        if (jSONObject.getInt(HwExerciseConstants.JSON_NAME_SWIM_POOL_LENGTH) != -1) {
            map.put(HwExerciseConstants.JSON_NAME_SWIM_POOL_LENGTH, Integer.valueOf(jSONObject.getInt(HwExerciseConstants.JSON_NAME_SWIM_POOL_LENGTH)));
        }
        if (jSONObject.getInt(HwExerciseConstants.JSON_NAME_SWIM_TRIP_TIMES) != -1) {
            map.put("swim_laps", Integer.valueOf(jSONObject.getInt(HwExerciseConstants.JSON_NAME_SWIM_TRIP_TIMES)));
        }
        if (jSONObject.getInt(HwExerciseConstants.JSON_NAME_SWIM_AVG_SWOLF) != -1) {
            map.put(HwExerciseConstants.JSON_NAME_SWIM_AVG_SWOLF, Integer.valueOf(jSONObject.getInt(HwExerciseConstants.JSON_NAME_SWIM_AVG_SWOLF)));
        }
        map.put("anaerobic_exercise_etraining_effect", Integer.valueOf(jSONObject.getInt(HwExerciseConstants.JSON_NAME_ANAEROBIC_TRAINING_EFFECT)));
    }

    private static void maxNetEvent(int i, JSONObject jSONObject) {
        LogUtil.a(TAG, "maxNetEvent()");
        if (i == 0) {
            try {
                if (jSONObject.optInt(HwExerciseConstants.JSON_NAME_WORKOUT_TYPE) == 1 || jSONObject.optInt(HwExerciseConstants.JSON_NAME_WORKOUT_TYPE) == 227 || jSONObject.optInt(HwExerciseConstants.JSON_NAME_WORKOUT_TYPE) == 2) {
                    if (jSONObject.optInt(HwExerciseConstants.JSON_NAME_WORKOUT_RUN_PLAY_MAX_HEART_RATE) == 0 && jSONObject.optInt(HwExerciseConstants.JSON_NAME_PEAK_MAX) == 0) {
                        return;
                    }
                    ReleaseLogUtil.d(TAG_RELEASE, "maxNet is 0");
                    LogUtil.b(TAG, "maxNet is 0, biKey:" + OperationKey.HEALTH_APP_RISK_WARNING_85070037.value());
                    DeviceInfo currentDeviceInfo = HwExerciseDeviceUtil.getCurrentDeviceInfo();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("maxNetError", "maxNet is 0");
                    linkedHashMap.put("sportData", jSONObject);
                    linkedHashMap.put("deviceInfo", currentDeviceInfo);
                    xjt.d(linkedHashMap);
                }
            } catch (Exception e) {
                LogUtil.e(TAG, "maxNetEvent Exception:", LogAnonymous.b(e));
            }
        }
    }

    private static void handleNotRunToTrackSectionStruct(List<JSONArray> list, List<TrackSwimSegment> list2, List<TrackSwimSegment> list3, int i) throws JSONException {
        JSONArray jSONArray = list.get(i);
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            TrackSwimSegment trackSwimSegment = new TrackSwimSegment();
            trackSwimSegment.saveSegmentIndex(jSONObject.getInt(HwExerciseConstants.JSON_NAME_SECTION_NUM));
            trackSwimSegment.saveDuration(jSONObject.getInt(HwExerciseConstants.JSON_NAME_SWIM_TIME));
            trackSwimSegment.savePace(jSONObject.getInt("pace"));
            trackSwimSegment.savePullTimes(jSONObject.getInt(HwExerciseConstants.JSON_NAME_SWIM_PULL_TIMES));
            trackSwimSegment.saveSwolf(jSONObject.getInt(HwExerciseConstants.JSON_NAME_SWIM_AVG_SWOLF));
            trackSwimSegment.saveStrokeType(jSONObject.getInt(HwExerciseConstants.JSON_NAME_SWIM_TYPE));
            trackSwimSegment.saveLocationIndex(jSONObject.getInt(HwExerciseConstants.JSON_NAME_POINT_INDEX));
            int i3 = jSONObject.getInt("distance");
            if (jSONObject.getInt("unit") == 0) {
                trackSwimSegment.saveDistance(i3);
                list2.add(trackSwimSegment);
            } else {
                trackSwimSegment.saveDistance(new BigDecimal(UnitUtil.e(i3, 2)).setScale(0, 4).intValue());
                list3.add(trackSwimSegment);
            }
        }
    }

    private static void handleNotRunToTrackGolfInfo(JSONObject jSONObject, MotionPathSimplify motionPathSimplify) throws JSONException {
        motionPathSimplify.addExtendDataMap("golfSwingCount", String.valueOf(jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_GOLF_SWING_COUNT)));
        motionPathSimplify.addExtendDataMap("golfBackSwingTime", String.valueOf(jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_GOLF_BACK_SWING_TIME)));
        motionPathSimplify.addExtendDataMap("golfDownSwingTime", String.valueOf(jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_GOLF_DOWN_SWING_TIME)));
        motionPathSimplify.addExtendDataMap("golfSwingSpeed", String.valueOf(jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_GOLF_SWING_SPEED)));
        motionPathSimplify.addExtendDataMap("golfMaxSwingSpeed", String.valueOf(jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_GOLF_MAX_SWING_SPEED)));
        motionPathSimplify.addExtendDataMap("golfSwingTempo", String.valueOf(jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_GOLF_SWING_TEMPO)));
    }

    private static void handleNotRunToTrackSkiInfo(JSONObject jSONObject, MotionPathSimplify motionPathSimplify) throws JSONException {
        motionPathSimplify.addExtendDataMap("skiMaxSlopeDegree", String.valueOf(jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_SKI_MAX_SLOPE_DEGREE)));
        motionPathSimplify.addExtendDataMap("skiMaxSlopePercent", String.valueOf(jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_SKI_MAX_SLOPE_PERCENT)));
        motionPathSimplify.addExtendDataMap("skiTotalTime", String.valueOf(jSONObject.getLong(HwExerciseConstants.JSON_NAME_EXERCISE_DURATION)));
        motionPathSimplify.addExtendDataMap("skiTotalDistance", String.valueOf(jSONObject.getInt(HwExerciseConstants.JSON_NAME_RECORD_DISTANCE)));
        motionPathSimplify.setTotalTime(jSONObject.getLong(HwExerciseConstants.JSON_NAME_WORKOUT_SKI_TOTAL_TIME));
        motionPathSimplify.setTotalDistance(Math.round(jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_SKI_TOTAL_DISTANCE) / 100.0f));
        if (jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_TEMPERATURE) != 127) {
            motionPathSimplify.addExtendDataMap(HwExerciseConstants.JSON_NAME_WORKOUT_TEMPERATURE, String.valueOf(jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_TEMPERATURE)));
        }
        motionPathSimplify.addExtendDataMap(HwExerciseConstants.JSON_NAME_WORKOUT_WEATHER, String.valueOf(jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_WEATHER)));
        motionPathSimplify.addExtendDataMap("skiTripTimes", String.valueOf(jSONObject.getInt(HwExerciseConstants.JSON_NAME_SWIM_TRIP_TIMES)));
    }

    public static void handleNotRunToTrackAltitudeInfo(JSONObject jSONObject, MotionPathSimplify motionPathSimplify) throws JSONException {
        motionPathSimplify.setSwolfBase(jSONObject.getInt("swolf_base_km") / 10.0f);
        motionPathSimplify.setBritishSwolfBase(jSONObject.getInt("swolf_base_mile") / 10.0f);
        LogUtil.a(TAG, "record setSwolfBase: ", Float.valueOf(jSONObject.getInt("swolf_base_km") / 10.0f), " setBritishSwolfBase: ", Float.valueOf(jSONObject.getInt("swolf_base_mile") / 10.0f));
        if (jSONObject.getInt("highest_altitude") != Integer.MAX_VALUE) {
            motionPathSimplify.setMaxAlti(jSONObject.getInt("highest_altitude") / 10.0f);
        }
        if (jSONObject.getInt("lowest_altitude") != Integer.MIN_VALUE) {
            motionPathSimplify.setMinAlti(jSONObject.getInt("lowest_altitude") / 10.0f);
        }
        motionPathSimplify.setTotalDescent(jSONObject.getInt("accumulative_drop_height"));
        LogUtil.a(TAG, "record setMaxAlti: ", Float.valueOf(jSONObject.getInt("highest_altitude") / 10.0f), " setMinAlti: ", Float.valueOf(jSONObject.getInt("lowest_altitude") / 10.0f), " setTotalDistance: ", Integer.valueOf(jSONObject.getInt("accumulative_drop_height")));
    }

    public static void handleNotRunToTrackBaseData(JSONObject jSONObject, Map<Long, double[]> map, MotionPathSimplify motionPathSimplify, float f, WorkoutDisplayInfo workoutDisplayInfo) throws JSONException {
        int i = jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_RECORD_HEART_RATE_TYPE);
        LogUtil.a(TAG, "workout_heart_rate_type: ", Integer.valueOf(i));
        if (i == 0) {
            motionPathSimplify.setHeartrateZoneType(2);
        } else if (i == 1) {
            motionPathSimplify.setHeartrateZoneType(1);
        } else if (i == 3) {
            motionPathSimplify.setHeartrateZoneType(3);
        } else {
            motionPathSimplify.setHeartrateZoneType(0);
        }
        if (jSONObject.has(HwExerciseConstants.JSON_NAME_EXERCISE_ID)) {
            motionPathSimplify.setRuncourseId(jSONObject.getString(HwExerciseConstants.JSON_NAME_EXERCISE_ID));
        }
        HwExerciseUtils.handleNotRunToTrackExerciseInfo(jSONObject, motionPathSimplify);
        HwExerciseUtils.handleNotRunToTrackDisplayInfo(jSONObject, map, motionPathSimplify, workoutDisplayInfo);
        if (workoutDisplayInfo.getWorkoutType() == 262 || workoutDisplayInfo.getWorkoutType() == 266) {
            int i2 = jSONObject.getInt(HwExerciseConstants.JSON_NAME_RECORD_DISTANCE);
            if (i2 != 0) {
                float f2 = f / i2;
                LogUtil.a(TAG, "swim speed: ", Float.valueOf(f2));
                motionPathSimplify.setAvgPace(f2);
            } else {
                LogUtil.a(TAG, "swim speed distance is 0");
                motionPathSimplify.setAvgPace(0.0f);
            }
            if (jSONObject.getInt(HwExerciseConstants.JSON_NAME_RECORD_DISTANCE) == 0) {
                motionPathSimplify.setChiefSportDataType(2);
            } else {
                motionPathSimplify.setChiefSportDataType(0);
            }
        }
    }

    public static void handleNotRunToTrackMarathon(JSONObject jSONObject, Map<Double, Double> map, Map<Double, Double> map2) {
        if (jSONObject == null) {
            LogUtil.j(TAG, "handleNotRunToTrackMarathon total is null");
            return;
        }
        if (map == null) {
            LogUtil.j(TAG, "handleNotRunToTrackMarathon partTimePaceMap is null");
            return;
        }
        if (map2 == null) {
            LogUtil.j(TAG, "handleNotRunToTrackMarathon partTimePaceMapEnglish is null");
            return;
        }
        double dOptDouble = jSONObject.optDouble("half_marathon_time");
        double dOptDouble2 = jSONObject.optDouble(HwExerciseConstants.JSON_NAME_TOTAL_MARATHON_TIME);
        LogUtil.a(TAG, "halfMarathonTime: ", Double.valueOf(dOptDouble), " totalMarathonTime: ", Double.valueOf(dOptDouble2));
        if (dOptDouble > 0.0d) {
            map.put(Double.valueOf(21.0975d), Double.valueOf(dOptDouble));
            map2.put(Double.valueOf(13.1099865d), Double.valueOf(dOptDouble));
        }
        if (dOptDouble2 > 0.0d) {
            map.put(Double.valueOf(42.195d), Double.valueOf(dOptDouble2));
            map2.put(Double.valueOf(26.219973d), Double.valueOf(dOptDouble2));
        }
    }

    public static void handleNotRunToTrackBase(JSONObject jSONObject, JSONArray jSONArray, MotionPath motionPath, MotionPathSimplify motionPathSimplify, int i) throws JSONException {
        Map<Double, Double> map = new HashMap<>(16);
        Map<Double, Double> map2 = new HashMap<>(16);
        LogUtil.a(TAG, "saveDataToTrack workout paceArray");
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
            map = HwExerciseUtils.changePartTimePaceMapStruct(jSONArray, 0);
            map2 = HwExerciseUtils.changePartTimePaceMapStruct(jSONArray, 1);
        }
        handleNotRunToTrackMarathon(jSONObject, map, map2);
        motionPathSimplify.setPartTimeMap(map);
        motionPathSimplify.setBritishPartTimeMap(map2);
        motionPathSimplify.setTotalTime(i);
        motionPathSimplify.setTotalSteps(((Integer) jSONObject.get(HwExerciseConstants.JSON_NAME_RECORD_STEP)).intValue());
    }

    public static void printWorkoutRecordInfo() {
        LogUtil.a(TAG, "enter printWorkoutRecordInfo");
        try {
            HwExerciseParams hwExerciseParams = HwExerciseParams.getInstance();
            int size = hwExerciseParams.getWorkoutRecordsStatisticArray().size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObjectValueAt = hwExerciseParams.getWorkoutRecordsStatisticArray().valueAt(i);
                if (jSONObjectValueAt != null) {
                    StringBuilder sb = new StringBuilder(16);
                    sb.append("BloodOxygen: highestBloodOxygen=");
                    sb.append(jSONObjectValueAt.get("highestBloodOxygen"));
                    sb.append(",");
                    sb.append("lowestBloodOxygen=");
                    sb.append(jSONObjectValueAt.get("lowestBloodOxygen"));
                    LogUtil.a(TAG, sb.toString());
                }
            }
        } catch (JSONException unused) {
            LogUtil.e(TAG, "printWorkoutRecordInfo JSONException");
        }
    }

    public static void printWorkoutRecordSectionInfo() {
        HwExerciseParams hwExerciseParams = HwExerciseParams.getInstance();
        LogUtil.a(TAG, "printWorkoutRecordSectionInfo enter mSectionRecordsStatisticJsonObjects.size: ", Integer.valueOf(hwExerciseParams.getSectionRecordsStatisticJsonObjects().size()));
        int size = hwExerciseParams.getSectionRecordsStatisticJsonObjects().size();
        for (int i = 0; i < size; i++) {
            LogUtil.a(TAG, "printWorkoutRecordSectionInfo sectionStruct.length(): ", Integer.valueOf(hwExerciseParams.getSectionRecordsStatisticJsonObjects().get(i).length()));
        }
    }

    public static void printCommonWorkoutRecordSectionInfo() {
        LogUtil.a(TAG, "printCommonWorkoutRecordSectionInfo enter commonRecordStatisticsSectionList size: ", Integer.valueOf(HwExerciseParams.getInstance().getCommonRecordStatisticsSectionList().size()));
    }

    public static void handleSaveWorkoutDisplayInfo(Map<Long, double[]> map, MotionPathSimplify motionPathSimplify) {
        if (map == null || motionPathSimplify == null) {
            LogUtil.j(TAG, "handleSaveWorkoutDisplayInfo param is null.");
            return;
        }
        WorkoutDisplayInfo workoutDisplayInfo = new WorkoutDisplayInfo();
        HwExerciseUtils.checkWorkoutDisplayInfo(1, map, workoutDisplayInfo, motionPathSimplify);
        motionPathSimplify.setChiefSportDataType(workoutDisplayInfo.getChiefSportDataType());
        motionPathSimplify.setIsFreeMotion(workoutDisplayInfo.getFreeMotion());
        motionPathSimplify.setSportType(workoutDisplayInfo.getWorkoutType());
        motionPathSimplify.setHasTrackPoint(workoutDisplayInfo.isHasTrackPoint());
        motionPathSimplify.setSportDataSource(workoutDisplayInfo.getSportDataSource());
    }

    private static void handleNotRunToTrackSpo2(int i, MotionPath motionPath) {
        if (motionPath == null) {
            LogUtil.j(TAG, "handleNotRunToTrackSpo2 motion is null");
        } else {
            mlp.a().c(i, motionPath);
        }
    }

    public static void saveDataNotRunToTrack(JSONObject jSONObject, Map<Long, double[]> map, int i, List<JSONArray> list, Map<String, JSONArray> map2, List<WorkoutDataStruct> list2) {
        JSONArray jSONArray = map2.get(HwExerciseConstants.METHOD_PARAM_WORKOUT_PACE_DATA);
        MotionPath motionPath = new MotionPath();
        if (map != null) {
            motionPath.setLbsDataMap(map);
        }
        int iOptInt = jSONObject.optInt(HwExerciseConstants.JSON_NAME_WORKOUT_TYPE);
        if (iOptInt == 231 || iOptInt == 232) {
            motionPath.setIndoorTrajectory(true);
        }
        MotionPathSimplify motionPathSimplify = new MotionPathSimplify();
        HwExerciseUtils.setMapType(i, motionPathSimplify, map);
        try {
            int i2 = (int) jSONObject.getLong(HwExerciseConstants.JSON_NAME_EXERCISE_DURATION);
            handleNotRunToTrackBase(jSONObject, jSONArray, motionPath, motionPathSimplify, i2);
            HwExerciseAdviceManagerHelper.getInstance().packTrackData(list2, motionPath, motionPathSimplify, jSONObject);
            handleNotRunToTrackBaseData(jSONObject, map, motionPathSimplify, i2, new WorkoutDisplayInfo());
            handleNotRunToTrackAltitudeInfo(jSONObject, motionPathSimplify);
            handleGolfAndSkiStatistic(jSONObject, motionPathSimplify);
            handleDeviceRunPaceCapability(jSONObject, motionPathSimplify);
            handleRopeSkippingDataStatistic(jSONObject, motionPathSimplify);
            handleStatisticExtendData(jSONObject, motionPathSimplify);
            ArrayList arrayList = new ArrayList(16);
            ArrayList arrayList2 = new ArrayList(16);
            ArrayList arrayList3 = new ArrayList(16);
            HwExerciseParams hwExerciseParams = HwExerciseParams.getInstance();
            handleCommonSection(hwExerciseParams, motionPath, motionPathSimplify, arrayList3, jSONObject);
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                handleNotRunToTrackSectionStruct(list, arrayList, arrayList2, i3);
            }
            motionPathSimplify.setSwimSegments(arrayList);
            motionPathSimplify.setBritishSwimSegments(arrayList2);
            LogUtil.a(TAG, "swimSegments.size: ", Integer.valueOf(arrayList.size()), " britishSwimSegments.size: ", Integer.valueOf(arrayList2.size()), " trackCommonSegments.size: ", Integer.valueOf(arrayList3.size()));
            handleNotRunToTrackSpo2(jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_RECORD_ID), motionPath);
            HashMap map3 = new HashMap(16);
            handleNotRunToTrackSportData(jSONObject, map3);
            motionPathSimplify.setSportData(map3);
            motionPathSimplify.setTargetPercent(jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_TARGET_PERCENT));
            motionPathSimplify.setExerciseLevel(jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_EXERCISE_LEVEL));
            HwExerciseUtils.addTriathlonToMotionPathSimplify(jSONObject, motionPathSimplify);
            saveDataNotRunToTrack(jSONObject, motionPathSimplify, hwExerciseParams, motionPath);
            LogUtil.a(TAG, "saveDataNotRunToTrack finish");
        } catch (JSONException e) {
            LogUtil.e(TAG, "saveDataNotRunToTrack workout JSONException:", LogAnonymous.b(e));
        }
    }

    private static void saveDataNotRunToTrack(JSONObject jSONObject, MotionPathSimplify motionPathSimplify, HwExerciseParams hwExerciseParams, MotionPath motionPath) throws JSONException {
        int i = jSONObject.getInt(HwExerciseConstants.JSON_NAME_RECORD_FLAG);
        motionPathSimplify.addExtendDataMap(HwExerciseConstants.JSON_NAME_RECORD_FLAG, String.valueOf(i));
        if (i == 5 || i == 6) {
            hwExerciseParams.getWorkoutRecord().put("workout_record_count", hwExerciseParams.getWorkoutRecord().getInt("workout_record_count") + 1);
            handleRunCourseStatistic(jSONObject, motionPathSimplify);
            HwExerciseUtils.packExerciseData(motionPathSimplify, motionPath);
        }
        motionPathSimplify.getDictTypeList().addAll(hwExerciseParams.getDictTypeList());
        for (Integer num : hwExerciseParams.getDictTypeList()) {
            int iIntValue = num.intValue();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            getSequenceData(jSONObject, motionPathSimplify, iIntValue, countDownLatch, motionPath);
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                LogUtil.e(TAG, "saveDataNotRunToTrack InterruptedException:", ExceptionUtils.c(e));
            }
            LogUtil.a(TAG, "saveDataNotRunToTrack dictId:", num);
        }
        hwExerciseParams.getDictTypeList().clear();
        if (hwExerciseParams.getDivingEvent() == 1) {
            LogUtil.a(TAG, "saveDataNotRunToTrack sync diving data.");
            getDivingData(jSONObject, hwExerciseParams, motionPath, motionPathSimplify);
        } else {
            saveTrackData(motionPathSimplify, motionPath, jSONObject, hwExerciseParams);
        }
    }

    private static void getDivingData(final JSONObject jSONObject, final HwExerciseParams hwExerciseParams, final MotionPath motionPath, final MotionPathSimplify motionPathSimplify) throws JSONException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        mrj.e().a(getTransFileInfo(jSONObject, motionPathSimplify), new ITransferSleepAndDFXFileCallback.Stub() { // from class: com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.HwExerciseRunPlanUtil.1
            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onSuccess(int i, String str, String str2) throws RemoteException {
                LogUtil.a(HwExerciseRunPlanUtil.TAG, "errorCode: ", Integer.valueOf(i), " transferDataContent: ", str);
                String str3 = str.substring(0, str.lastIndexOf(47)) + HwExerciseRunPlanUtil.mDivingFileName;
                LogUtil.a(HwExerciseRunPlanUtil.TAG, "getDivingData newPath:", str3);
                File file = new File(str);
                File file2 = new File(str3);
                if (file2.exists()) {
                    LogUtil.a(HwExerciseRunPlanUtil.TAG, "mDivingSequenceCallback file is delete:", Boolean.valueOf(file2.delete()));
                }
                LogUtil.a(HwExerciseRunPlanUtil.TAG, "mDivingSequenceCallback file is rename:", Boolean.valueOf(file.renameTo(file2)));
                mvg mvgVar = (mvg) mvt.d().execute(5, str3);
                if (mvgVar != null) {
                    LogUtil.a(HwExerciseRunPlanUtil.TAG, "mDivingSequenceCallback sequenceFileData:", mvgVar.toString());
                }
                String sequenceFileDataString = SequenceFileDataUtils.getSequenceFileDataString(mvgVar);
                LogUtil.a(HwExerciseRunPlanUtil.TAG, "mDivingSequenceCallback sampleSequenceFileDataStr:", sequenceFileDataString);
                motionPath.setDivingIncidentData(sequenceFileDataString);
                countDownLatch.countDown();
                HwExerciseRunPlanUtil.saveTrackData(motionPathSimplify, motionPath, jSONObject, hwExerciseParams);
            }

            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onFailure(int i, String str) throws RemoteException {
                LogUtil.j(HwExerciseRunPlanUtil.TAG, "onFailure errorCode:", Integer.valueOf(i));
                countDownLatch.countDown();
                HwExerciseRunPlanUtil.saveTrackData(motionPathSimplify, motionPath, jSONObject, hwExerciseParams);
            }

            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onProgress(int i, String str) throws RemoteException {
                LogUtil.a(HwExerciseRunPlanUtil.TAG, "getDivingData progress: ", Integer.valueOf(i));
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            LogUtil.e(TAG, "saveDataNotRunToTrack InterruptedException:", ExceptionUtils.c(e));
        }
    }

    private static void getSequenceData(JSONObject jSONObject, final MotionPathSimplify motionPathSimplify, int i, final CountDownLatch countDownLatch, final MotionPath motionPath) {
        mrj.e().a(getSequenceTransFileInfo(jSONObject, motionPathSimplify, i), new ITransferSleepAndDFXFileCallback.Stub() { // from class: com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.HwExerciseRunPlanUtil.2
            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onSuccess(int i2, String str, String str2) throws RemoteException {
                LogUtil.a(HwExerciseRunPlanUtil.TAG, "errorCode: ", Integer.valueOf(i2), " transferDataContent: ", str);
                String str3 = str.substring(0, str.lastIndexOf(47)) + HwExerciseRunPlanUtil.mSequenceFileName;
                LogUtil.a(HwExerciseRunPlanUtil.TAG, "getSequenceData newPath:", str3);
                File file = new File(str);
                File file2 = new File(str3);
                if (file2.exists()) {
                    LogUtil.a(HwExerciseRunPlanUtil.TAG, "getSequenceData file is delete:", Boolean.valueOf(file2.delete()));
                }
                LogUtil.a(HwExerciseRunPlanUtil.TAG, "getSequenceData file is rename:", Boolean.valueOf(file.renameTo(file2)));
                parseSequenceData((mvg) mvt.d().execute(5, str3));
                countDownLatch.countDown();
            }

            private void parseSequenceData(mvg mvgVar) {
                if (mvgVar == null) {
                    LogUtil.j(HwExerciseRunPlanUtil.TAG, "parseSequenceData sequenceFileData is null");
                    return;
                }
                LogUtil.a(HwExerciseRunPlanUtil.TAG, "getSequenceData sequenceFileData:", mvgVar.toString(), " sequenceFileData Version :", Integer.valueOf(mvgVar.c()));
                StringBuilder sb = new StringBuilder();
                DetailsFieldParser detailsFieldParser = new DetailsFieldParser();
                if (detailsFieldParser.isOldParseFunc(mvgVar)) {
                    sb.append(detailsFieldParser.detailParse(mvgVar));
                } else {
                    Iterator<mvj> it = mvgVar.b().iterator();
                    while (it.hasNext()) {
                        sb.append(eeq.d(it.next().d()).trim());
                        sb.append(System.lineSeparator());
                    }
                    checkNeedGetRouteTrackDetail(mvgVar, sb);
                }
                motionPath.getSequenceDetailData().append((CharSequence) sb);
                motionPathSimplify.getDictTypeList().remove(Integer.valueOf(mvgVar.d()));
            }

            private void checkNeedGetRouteTrackDetail(mvg mvgVar, StringBuilder sb) {
                if (mvgVar.d() != 390001) {
                    LogUtil.j(HwExerciseRunPlanUtil.TAG, "checkNeedRouteTrackDetail sequence DictTypeId is not pause ande distance detail");
                    return;
                }
                int sportType = motionPathSimplify.getSportType();
                if (sportType != 259) {
                    LogUtil.j(HwExerciseRunPlanUtil.TAG, "checkNeedRouteTrackDetail sportType is not SPORT_TYPE_BIKE");
                    return;
                }
                boolean zD = eey.d(HwExerciseDeviceUtil.getCurrentDeviceInfo(), TypedValues.AttributesType.TYPE_PIVOT_TARGET);
                if (!zD) {
                    LogUtil.j(HwExerciseRunPlanUtil.TAG, "checkNeedRouteTrackDetail is not support bike slope");
                    return;
                }
                LogUtil.a(HwExerciseRunPlanUtil.TAG, "getRouteTrackDetail sportType：", Integer.valueOf(sportType), " supportBikeSlope：", Boolean.valueOf(zD), " dicTypeId：", Integer.valueOf(mvgVar.d()));
                HwExerciseRunPlanUtil.getRouteTrackDetail(motionPathSimplify, motionPath, sb);
            }

            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onFailure(int i2, String str) throws RemoteException {
                LogUtil.j(HwExerciseRunPlanUtil.TAG, "getSequenceData onFailure errorCode:", Integer.valueOf(i2));
                countDownLatch.countDown();
            }

            @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
            public void onProgress(int i2, String str) throws RemoteException {
                LogUtil.a(HwExerciseRunPlanUtil.TAG, "getSequenceData progress: ", Integer.valueOf(i2));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void getRouteTrackDetail(MotionPathSimplify motionPathSimplify, MotionPath motionPath, StringBuilder sb) {
        TrackFeatureExtractionApi trackFeatureExtractionApi = (TrackFeatureExtractionApi) Services.d("TrackFeatureExtractionAlgorithmService", TrackFeatureExtractionApi.class);
        if (trackFeatureExtractionApi == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "getRouteTrackDetail TrackFeatureExtractionApi is null");
            return;
        }
        try {
            RouteTrackInfo routeTrackInfo = new RouteTrackInfo();
            constructBasicData(motionPathSimplify, routeTrackInfo);
            constructAltitudeData(motionPath, routeTrackInfo);
            constructRouteGpsData(motionPath, routeTrackInfo);
            String[] strArrSplit = sb.toString().split(System.lineSeparator());
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            for (String str : strArrSplit) {
                if (str.startsWith(com.huawei.hwfoundationmodel.trackmodel.MotionPath.PAUSE_TAG)) {
                    arrayList.add(str);
                    constructEventList(str, arrayList3);
                } else if (str.startsWith(com.huawei.hwfoundationmodel.trackmodel.MotionPath.DISTANCE_TAG)) {
                    arrayList2.add(str);
                    constructDistanceList(str, arrayList4);
                }
            }
            routeTrackInfo.setPauseInfos(arrayList3);
            routeTrackInfo.setPauseInfosNum(arrayList3.size());
            routeTrackInfo.setDisInfos(arrayList4);
            routeTrackInfo.setDisInfosNum(arrayList4.size());
            LogUtil.a(TAG, "getRouteTrackDetail trackInfo: ", HiJsonUtil.d(routeTrackInfo));
            rebuildTpDetail(sb, arrayList, arrayList2);
            LogUtil.a(TAG, "getRouteTrackDetail rebuild tpDetail: ", sb.toString());
            RouteOutputForApp trackOutputForApp = trackFeatureExtractionApi.getTrackOutputForApp(routeTrackInfo, 80000, 0.0d, false);
            if (trackOutputForApp == null) {
                ReleaseLogUtil.e(TAG_RELEASE, "getRouteTrackDetail mOutPutForApp is null");
                return;
            }
            List<TrackAltPointData> caliAltPoints = trackOutputForApp.getCaliAltPoints();
            if (caliAltPoints != null && !caliAltPoints.isEmpty()) {
                ArrayList<TrackAltitudeData> arrayList5 = new ArrayList<>();
                for (TrackAltPointData trackAltPointData : caliAltPoints) {
                    arrayList5.add(new TrackAltitudeData(trackAltPointData.getTimestamp() * 1000, trackAltPointData.getAlt()));
                }
                motionPath.setAltitudeList(arrayList5);
            }
            saveSlopeDataToExtendData(motionPathSimplify, trackOutputForApp);
            if (trackOutputForApp.getSlopeInfo() != null && trackOutputForApp.getSlopeInfo().size() != 0) {
                for (SlopeInfo slopeInfo : trackOutputForApp.getSlopeInfo()) {
                    slopeInfo.setClimbTime(slopeInfo.getClimbTime() * 1000);
                }
                LogUtil.a(TAG, "getRouteTrackDetail ", GsonUtil.toJson(trackOutputForApp));
                motionPath.setSlopeInfoList(trackOutputForApp.getSlopeInfo());
                return;
            }
            ReleaseLogUtil.e(TAG_RELEASE, "getRouteTrackDetail mOutPutForApp slopeInfo is null");
        } catch (RuntimeException e) {
            LogUtil.e(TAG, "getRouteTrackDetail exception:", ExceptionUtils.c(e));
        }
    }

    private static void rebuildTpDetail(StringBuilder sb, List<String> list, List<String> list2) {
        sb.setLength(0);
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(System.lineSeparator());
        }
        Iterator<String> it2 = list2.iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            sb.append(System.lineSeparator());
        }
    }

    private static void constructBasicData(MotionPathSimplify motionPathSimplify, RouteTrackInfo routeTrackInfo) {
        routeTrackInfo.setSupportClimb(true);
        routeTrackInfo.setUseType(1);
        routeTrackInfo.setTrackType(RouteType.DEFAULT.routeType());
        routeTrackInfo.setWorkoutType(motionPathSimplify.getSportType());
        routeTrackInfo.setSceneType(SceneType.BIKE.sceneType());
        routeTrackInfo.setShowAltitude(true);
        routeTrackInfo.setTotalTime(motionPathSimplify.getTotalTime());
    }

    private static void constructAltitudeData(MotionPath motionPath, RouteTrackInfo routeTrackInfo) {
        ArrayList<TrackAltitudeData> altitudeList = motionPath.getAltitudeList();
        if (altitudeList == null || altitudeList.isEmpty()) {
            LogUtil.j(TAG, "getRouteTrackDetail altitudeList is null");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (TrackAltitudeData trackAltitudeData : altitudeList) {
            arrayList.add(new TrackAltPointData(trackAltitudeData.getTime() / 1000, trackAltitudeData.getAltitude()));
        }
        routeTrackInfo.setAltPoints(arrayList);
        routeTrackInfo.setAltPointsNum(arrayList.size());
    }

    private static void constructRouteGpsData(MotionPath motionPath, RouteTrackInfo routeTrackInfo) {
        Map<Long, double[]> lbsDataMap = motionPath.getLbsDataMap();
        if (lbsDataMap == null || lbsDataMap.isEmpty()) {
            LogUtil.j(TAG, "getRouteTrackDetail lbsDataMap is null");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Long, double[]> entry : lbsDataMap.entrySet()) {
            RouteTrackPoint routeTrackPoint = new RouteTrackPoint();
            if (entry.getValue().length < 4) {
                LogUtil.j(TAG, "lbsData is invalid");
            } else {
                routeTrackPoint.setLatitude(entry.getValue()[0]);
                routeTrackPoint.setLongitude(entry.getValue()[1]);
                routeTrackPoint.setAltitude(entry.getValue()[2]);
                if (String.valueOf((long) entry.getValue()[3]).length() == 13) {
                    routeTrackPoint.setTimestamp((long) (entry.getValue()[3] / 1000.0d));
                } else {
                    routeTrackPoint.setTimestamp((long) entry.getValue()[3]);
                }
                arrayList.add(routeTrackPoint);
            }
        }
        routeTrackInfo.setPoints(arrayList);
        routeTrackInfo.setPointsNum(arrayList.size());
    }

    private static void constructEventList(String str, ArrayList<TrackPauseData> arrayList) {
        String[] strArrSplit = str.split(";");
        if (strArrSplit.length < 4) {
            LogUtil.j(TAG, "constructEventList splitStrs.length is not valid");
            return;
        }
        long j = 0;
        int i = 0;
        int i2 = 0;
        for (String str2 : strArrSplit) {
            String[] strArrSplit2 = str2.split("=");
            if (strArrSplit2.length == 2) {
                if (TextUtils.equals(strArrSplit2[0], CmcdConfiguration.KEY_STREAM_TYPE)) {
                    j = Long.parseLong(strArrSplit2[1]);
                    if (String.valueOf(j).length() == 13) {
                        j /= 1000;
                    }
                } else if (TextUtils.equals(strArrSplit2[0], "ty")) {
                    i2 = Integer.parseInt(strArrSplit2[1]);
                } else if (TextUtils.equals(strArrSplit2[0], FitRunPlayAudio.OPPORTUNITY_E)) {
                    i = Integer.parseInt(strArrSplit2[1]);
                }
            }
        }
        arrayList.add(new TrackPauseData(j, i, i2));
    }

    private static void constructDistanceList(String str, ArrayList<TrackDistanceData> arrayList) {
        String[] strArrSplit = str.split(";");
        if (strArrSplit.length < 3) {
            LogUtil.j(TAG, "constructDistanceList splitStrs.length is not valid");
            return;
        }
        float f = 0.0f;
        int i = 0;
        for (String str2 : strArrSplit) {
            String[] strArrSplit2 = str2.split("=");
            if (strArrSplit2.length == 2) {
                if (TextUtils.equals(strArrSplit2[0], "k")) {
                    i = Integer.parseInt(strArrSplit2[1]);
                } else if (TextUtils.equals(strArrSplit2[0], "v")) {
                    f = Float.parseFloat(strArrSplit2[1]);
                }
            }
        }
        arrayList.add(new TrackDistanceData(i, f));
    }

    private static void saveSlopeDataToExtendData(MotionPathSimplify motionPathSimplify, RouteOutputForApp routeOutputForApp) {
        motionPathSimplify.addExtendDataMap("slopeInfoNum", String.valueOf(routeOutputForApp.getSlopeInfoNum()));
        motionPathSimplify.addExtendDataMap("flatDistance", String.valueOf(routeOutputForApp.getFlatDistance()));
        motionPathSimplify.addExtendDataMap("flatRatio", String.valueOf(routeOutputForApp.getFlatRatio()));
        motionPathSimplify.addExtendDataMap("upHillDistance", String.valueOf(routeOutputForApp.getUpHillDistance()));
        motionPathSimplify.addExtendDataMap("upHillRatio", String.valueOf(routeOutputForApp.getUpHillRatio()));
        motionPathSimplify.addExtendDataMap("downHillDistance", String.valueOf(routeOutputForApp.getDownHillDistance()));
        motionPathSimplify.addExtendDataMap("downHillRatio", String.valueOf(routeOutputForApp.getDownHillRatio()));
    }

    private static mhp getSequenceTransFileInfo(JSONObject jSONObject, MotionPathSimplify motionPathSimplify, int i) {
        mhp mhpVar = new mhp();
        try {
            mSequenceFileName = File.separator + jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_RECORD_ID) + i + "_sequence_data.bin";
            mhpVar.a("sequence_data");
            mhpVar.c(22);
            mhpVar.e((TransferFileReqType) null);
            mhpVar.d(HwExerciseDeviceUtil.getCurrentDeviceMac());
            mhpVar.e(false);
            mhpVar.c(new int[]{Integer.parseInt(String.valueOf(motionPathSimplify.getStartTime() / 1000)), Integer.parseInt(String.valueOf(motionPathSimplify.getEndTime() / 1000))});
            mhpVar.a(i);
            return mhpVar;
        } catch (JSONException e) {
            LogUtil.e(TAG, "getSequenceTransFileInfo JSONException:", ExceptionUtils.c(e));
            return mhpVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void saveTrackData(MotionPathSimplify motionPathSimplify, MotionPath motionPath, JSONObject jSONObject, HwExerciseParams hwExerciseParams) {
        try {
            HwExerciseAdviceManagerHelper.getInstance().notifySaveData(motionPathSimplify, motionPath, jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_RECORD_ID), hwExerciseParams.getTriathlonUtils(), HwExerciseAdviceManager.getInstance());
        } catch (JSONException e) {
            LogUtil.e(TAG, "JSONException:", ExceptionUtils.c(e));
        }
    }

    private static mhp getTransFileInfo(JSONObject jSONObject, MotionPathSimplify motionPathSimplify) throws JSONException {
        mDivingFileName = File.separator + jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_RECORD_ID) + "_diving_sequence_data.bin";
        mhp mhpVar = new mhp();
        mhpVar.a("sequence_data");
        mhpVar.c(22);
        mhpVar.e((TransferFileReqType) null);
        mhpVar.d(HwExerciseDeviceUtil.getCurrentDeviceMac());
        mhpVar.e(false);
        mhpVar.c(new int[]{Integer.parseInt(String.valueOf(motionPathSimplify.getStartTime() / 1000)), Integer.parseInt(String.valueOf(motionPathSimplify.getEndTime() / 1000))});
        mhpVar.a(DICT_TYPE);
        return mhpVar;
    }

    private static void handleDeviceRunPaceCapability(JSONObject jSONObject, MotionPathSimplify motionPathSimplify) throws JSONException {
        DeviceCapability capability = HwExerciseDeviceUtil.getCapability();
        if (capability != null && capability.isSupportRunPaceSetCapability()) {
            handleRunPaceZoneStatistic(jSONObject, motionPathSimplify);
        } else {
            LogUtil.j(TAG, "saveDataNotRunToTrack isSupportRunPaceCapability is false");
        }
    }

    private static void handleRunPaceZoneStatistic(JSONObject jSONObject, MotionPathSimplify motionPathSimplify) throws JSONException {
        motionPathSimplify.addExtendDataMap("runPaceZoneConfig", getRunPaceZoneConfig(jSONObject));
        motionPathSimplify.addExtendDataMap("runPaceZoneStatistics", getRunPaceZoneStatistics(jSONObject));
    }

    private static String getRunPaceZoneConfig(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(jSONObject.getInt(HwExerciseConstants.JSON_NAME_ROMPED_PACE_ZONE_MIN_VALUE));
        jSONArray.put(jSONObject.getInt(HwExerciseConstants.JSON_NAME_MARATHON_PACE_ZONE_MIN_VALUE));
        jSONArray.put(jSONObject.getInt(HwExerciseConstants.JSON_NAME_LACTIC_ACID_PACE_ZONE_MIN_VALUE));
        jSONArray.put(jSONObject.getInt(HwExerciseConstants.JSON_NAME_ANAEROBIC_PACE_ZONE_MIN_VALUE));
        jSONArray.put(jSONObject.getInt(HwExerciseConstants.JSON_NAME_MAX_OXYGEN_PACE_ZONE_MIN_VALUE));
        jSONArray.put(jSONObject.getInt(HwExerciseConstants.JSON_NAME_MAX_OXYGEN_PACE_ZONE_MAX_VALUE));
        LogUtil.a(TAG, "getRunPaceZoneConfig paceZoneConfigArray: ", jSONArray.toString());
        return jSONArray.toString();
    }

    private static String getRunPaceZoneStatistics(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(jSONObject.getLong(HwExerciseConstants.JSON_NAME_ROMPED_TIME));
        jSONArray.put(jSONObject.getLong(HwExerciseConstants.JSON_NAME_MARATHON_TIME));
        jSONArray.put(jSONObject.getLong(HwExerciseConstants.JSON_NAME_LACTIC_ACID_TIME));
        jSONArray.put(jSONObject.getLong(HwExerciseConstants.JSON_NAME_ANAEROBIC_TIME));
        jSONArray.put(jSONObject.getLong(HwExerciseConstants.JSON_NAME_MAX_OXYGEN_TIME));
        LogUtil.a(TAG, "getRunPaceZoneStatistics paceZoneStatisticsArray: ", jSONArray.toString());
        return jSONArray.toString();
    }

    private static void handleGolfAndSkiStatistic(JSONObject jSONObject, MotionPathSimplify motionPathSimplify) throws JSONException {
        if (jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_TYPE) == 15 || jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_TYPE) == 16 || jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_TYPE) == 229 || jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_TYPE) == 230 || jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_TYPE) == 231 || jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_TYPE) == 232) {
            handleNotRunToTrackSkiInfo(jSONObject, motionPathSimplify);
        }
        if (jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_TYPE) == 18) {
            handleNotRunToTrackGolfInfo(jSONObject, motionPathSimplify);
        }
    }

    private static void handleRopeSkippingDataStatistic(JSONObject jSONObject, MotionPathSimplify motionPathSimplify) throws JSONException {
        if (jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_TYPE) == 21) {
            motionPathSimplify.addExtendDataMap("stumblingRope", String.valueOf(jSONObject.getLong(HwExerciseConstants.JSON_NAME_TRIPPED)));
            motionPathSimplify.addExtendDataMap("maxSkippingTimes", String.valueOf(jSONObject.getLong(HwExerciseConstants.JSON_NAME_LONGEST_STREAK)));
            motionPathSimplify.addExtendDataMap("skipNum", String.valueOf(motionPathSimplify.getTotalSteps()));
            motionPathSimplify.addExtendDataMap("skipSpeed", String.valueOf(motionPathSimplify.getAvgStepRate()));
        }
    }

    private static void handleRunCourseStatistic(JSONObject jSONObject, MotionPathSimplify motionPathSimplify) throws JSONException {
        motionPathSimplify.addExtendDataMap("courseName", jSONObject.getString(HwExerciseConstants.JSON_NAME_COURSE_NAME));
        motionPathSimplify.addExtendDataMap(HwExerciseConstants.JSON_NAME_PLAN_ID, jSONObject.getString(HwExerciseConstants.JSON_NAME_PLAN_ID));
        motionPathSimplify.addExtendDataMap(HwExerciseConstants.JSON_NAME_PLAN_COURSE_TIME, String.valueOf(jSONObject.getInt(HwExerciseConstants.JSON_NAME_PLAN_COURSE_TIME)));
        motionPathSimplify.addExtendDataMap(HwExerciseConstants.JSON_NAME_COURSE_TARGET_TYPE, String.valueOf(jSONObject.getInt(HwExerciseConstants.JSON_NAME_COURSE_TARGET_TYPE)));
        motionPathSimplify.addExtendDataMap(HwExerciseConstants.JSON_NAME_COURSE_TARGET_VALUE, String.valueOf(jSONObject.getInt(HwExerciseConstants.JSON_NAME_COURSE_TARGET_VALUE)));
        motionPathSimplify.addExtendDataMap(HwExerciseConstants.JSON_NAME_TRAINING_POINTS, String.valueOf(jSONObject.getInt(HwExerciseConstants.JSON_NAME_TRAINING_POINTS)));
        motionPathSimplify.addExtendDataMap(HwExerciseConstants.JSON_NAME_TRAINING_EXPERIENCE, String.valueOf(jSONObject.getInt(HwExerciseConstants.JSON_NAME_TRAINING_EXPERIENCE)));
        motionPathSimplify.addExtendDataMap(HwExerciseConstants.JSON_NAME_COURSE_MODIFIED_TIME, String.valueOf(jSONObject.getLong(HwExerciseConstants.JSON_NAME_COURSE_MODIFIED_TIME)));
        motionPathSimplify.addExtendDataMap("sportRecordType", String.valueOf(0));
        motionPathSimplify.addExtendDataMap("attachedRecordType", String.valueOf(1));
    }

    private static void handleStatisticExtendData(JSONObject jSONObject, MotionPathSimplify motionPathSimplify) {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("extendList");
            LogUtil.a(TAG, "handleStatisticExtendData jsonArray:", jSONArray);
            List<StatisticExtendDataStruct> listC = peh.c(jSONArray.toString(), StatisticExtendDataStruct[].class);
            LogUtil.a(TAG, "handleStatisticExtendData extendDataList:", listC.toString());
            for (StatisticExtendDataStruct statisticExtendDataStruct : listC) {
                motionPathSimplify.addExtendDataMap(statisticExtendDataStruct.getFieldName(), statisticExtendDataStruct.getFieldValue());
                motionPathSimplify.changeKey(statisticExtendDataStruct.getFieldName(), statisticExtendDataStruct.getFieldValue());
            }
        } catch (JSONException e) {
            LogUtil.e(TAG, "handleStatisticExtendData JSONException:", ExceptionUtils.c(e));
        }
    }

    private static void handleCommonSection(HwExerciseParams hwExerciseParams, MotionPath motionPath, MotionPathSimplify motionPathSimplify, List<CommonSegment> list, JSONObject jSONObject) throws JSONException {
        HwExerciseParams hwExerciseParams2 = HwExerciseParams.getInstance();
        int i = jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_RECORD_ID);
        ArrayList arrayList = new ArrayList(16);
        if (hwExerciseParams2.getWorkoutRecordCommonSectionMap().get(Integer.valueOf(i)) != null) {
            LogUtil.a(TAG, "handleCommonSection workoutRecordId: ", Integer.valueOf(i));
            arrayList.addAll(hwExerciseParams2.getWorkoutRecordCommonSectionMap().get(Integer.valueOf(i)));
        }
        LogUtil.a(TAG, "handleCommonSection commonSectionList size: ", Integer.valueOf(arrayList.size()));
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            handleCommonData(list, i2, jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_TYPE), arrayList, jSONObject.getInt(HwExerciseConstants.JSON_NAME_RECORD_FLAG));
        }
        if (checkNewSectionWorkoutType(jSONObject)) {
            motionPath.setCommonSegments(list);
            motionPathSimplify.addExtendDataMap("segmentNum", String.valueOf(hwExerciseParams.getSectionCommonIndex()));
        }
        arrayList.clear();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0067  */
    /* JADX WARN: Code duplicated, block: B:33:0x006f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    /* JADX WARN: Code duplicated, block: B:36:0x0079  */
    /* JADX WARN: Code duplicated, block: B:40:0x0081  */
    /* JADX WARN: Switch 'out' block B:31:0x0067 for B:25:0x004b already processed. Defaulting to fallback option. */
    private static void handleCommonData(List<CommonSegment> list, int i, int i2, List<List<CommonSectionInfo>> list2, int i3) {
        List<CommonSectionInfo> list3 = list2.get(i);
        int size = list3.size();
        for (int i4 = 0; i4 < size; i4++) {
            CommonSectionInfo commonSectionInfo = list3.get(i4);
            LogUtil.a(TAG, "workout type: ", Integer.valueOf(i2));
            if (i2 == 1) {
                if (i3 != 5 || i3 == 6) {
                    HwExerciseCommonSegmentUtils.handleExerciseSegment(list, commonSectionInfo);
                    HwExerciseCommonSegmentUtils.handleRunSegment(list, commonSectionInfo);
                } else {
                    HwExerciseCommonSegmentUtils.handleRunSegment(list, commonSectionInfo);
                }
            } else if (i2 == 3) {
                HwExerciseCommonSegmentUtils.handleCyclingSegment(list, commonSectionInfo);
            } else if (i2 == 5 || i2 == 11) {
                if (i3 != 5) {
                    HwExerciseCommonSegmentUtils.handleExerciseSegment(list, commonSectionInfo);
                    HwExerciseCommonSegmentUtils.handleRunSegment(list, commonSectionInfo);
                } else {
                    HwExerciseCommonSegmentUtils.handleExerciseSegment(list, commonSectionInfo);
                    HwExerciseCommonSegmentUtils.handleRunSegment(list, commonSectionInfo);
                }
            } else if (i2 == 25) {
                HwExerciseCommonSegmentUtils.handleDivingOrBreathSegment(list, commonSectionInfo);
            } else if (i2 != 227) {
                if (i2 == 255) {
                    HwExerciseCommonSegmentUtils.handleOwnTrainingSegment(list, commonSectionInfo);
                } else if (i2 == 15 || i2 == 16) {
                    HwExerciseCommonSegmentUtils.handleSkiSegment(list, commonSectionInfo);
                } else if (i2 != 22 && i2 != 23) {
                    switch (i2) {
                        case 18:
                            HwExerciseCommonSegmentUtils.handleGolfSegment(list, commonSectionInfo);
                            continue;
                        case 19:
                            HwExerciseCommonSegmentUtils.handleGolfCourseSegment(list, commonSectionInfo);
                            continue;
                        case 20:
                            HwExerciseCommonSegmentUtils.handleExerciseSegment(list, commonSectionInfo);
                            continue;
                        default:
                            switch (i2) {
                                case 229:
                                case 230:
                                case 231:
                                case 232:
                                    HwExerciseCommonSegmentUtils.handleSkiSegment(list, commonSectionInfo);
                                    break;
                                default:
                                    LogUtil.j(TAG, "else workout type");
                                    continue;
                            }
                            break;
                    }
                } else {
                    HwExerciseCommonSegmentUtils.handleDivingOrBreathSegment(list, commonSectionInfo);
                }
            } else if (i3 != 5) {
                HwExerciseCommonSegmentUtils.handleExerciseSegment(list, commonSectionInfo);
                HwExerciseCommonSegmentUtils.handleRunSegment(list, commonSectionInfo);
            } else {
                HwExerciseCommonSegmentUtils.handleExerciseSegment(list, commonSectionInfo);
                HwExerciseCommonSegmentUtils.handleRunSegment(list, commonSectionInfo);
            }
        }
    }

    public static void syncWorkoutDetailData(int i, JSONObject jSONObject) {
        try {
            if (jSONObject == null) {
                LogUtil.j(TAG, "syncWorkoutDetailData jsonObject is null");
                return;
            }
            HwExerciseParams hwExerciseParams = HwExerciseParams.getInstance();
            JSONArray jSONArray = jSONObject.getJSONArray(HwExerciseConstants.JSON_NAME_WORKOUT_RECORD_STRUCT_LIST);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                for (int i3 = 0; i3 < jSONObject2.getInt("workout_index_count"); i3++) {
                    Integer num = jSONObject2.get(HwExerciseConstants.JSON_NAME_WORKOUT_RECORD_ID) instanceof Integer ? (Integer) jSONObject2.get(HwExerciseConstants.JSON_NAME_WORKOUT_RECORD_ID) : null;
                    if (num != null && num.intValue() == i) {
                        WorkoutDataStruct workoutDataStruct = new WorkoutDataStruct();
                        workoutDataStruct.setWorkoutRecordId(jSONObject2.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_RECORD_ID));
                        workoutDataStruct.setWorkoutDataIndex(i3);
                        hwExerciseParams.getWorkoutDataList().add(workoutDataStruct);
                    }
                }
            }
        } catch (JSONException unused) {
            LogUtil.e(TAG, "syncWorkoutDetailData JSONException");
        }
    }

    public static void handleSaveNotRunPlayToTrack(int i, JSONObject jSONObject, List<WorkoutDataStruct> list, JSONArray jSONArray, List<JSONArray> list2) throws JSONException {
        HwExerciseParams hwExerciseParams = HwExerciseParams.getInstance();
        if (hwExerciseParams.getGpsWorkoutMap().get(Integer.valueOf(i)) != null) {
            LogUtil.a(TAG, "mGpsWorkoutMap size: ", Integer.valueOf(hwExerciseParams.getGpsWorkoutMap().get(Integer.valueOf(i)).size()));
        }
        if (HwExerciseUtils.checkSupportWorkoutType(jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_TYPE))) {
            hwExerciseParams.setSaveDataItemNumber(hwExerciseParams.getSaveDataItemNumber() + 1);
            int iIntValue = hwExerciseParams.getGpsWorkoutAndRunPlanTypeMap().get(Integer.valueOf(i)) != null ? hwExerciseParams.getGpsWorkoutAndRunPlanTypeMap().get(Integer.valueOf(i)).intValue() : -1;
            hwExerciseParams.getWorkoutParamJsonArrayMap().put(HwExerciseConstants.METHOD_PARAM_WORKOUT_PACE_DATA, jSONArray);
            saveDataNotRunToTrack(jSONObject, hwExerciseParams.getGpsWorkoutMap().get(Integer.valueOf(i)), iIntValue, list2, hwExerciseParams.getWorkoutParamJsonArrayMap(), list);
        }
    }

    private static void checkEteStatus() {
        HwLinkageServiceManager.getInstance().getOperator(new IBaseResponseCallback() { // from class: com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.HwExerciseRunPlanUtil.3
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i == 100000) {
                    if (!(obj instanceof OperatorStatus)) {
                        LogUtil.j(HwExerciseRunPlanUtil.TAG, "objectData is not OperatorStatus");
                    } else if (((OperatorStatus) obj).getTrainMonitorState() == 1) {
                        HwExerciseParams.getInstance().setIsUsingEte(false);
                    }
                }
            }
        });
    }

    public static void handleDeviceConnected(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j(TAG, "handleDeviceConnected deviceInfo is null.");
            return;
        }
        HwExerciseParams hwExerciseParams = HwExerciseParams.getInstance();
        hwExerciseParams.getHwExerciseAdviceManagerHandler().removeMessages(1);
        hwExerciseParams.getHwExerciseAdviceManagerHandler().removeMessages(1001);
        if (isSupportExercise(deviceInfo)) {
            if (hwExerciseParams.getDeviceIdentify() == null || deviceInfo.getSecurityDeviceId() == null || !hwExerciseParams.getDeviceIdentify().equalsIgnoreCase(deviceInfo.getSecurityDeviceId())) {
                hwExerciseParams.getHwExerciseAdviceManagerHandler().sendEmptyMessage(1);
            }
            if (hwExerciseParams.isUsingEte() && hwExerciseParams.getRunPlanExecuteState() != 3) {
                checkEteStatus();
            }
        } else {
            hwExerciseParams.getHwExerciseAdviceManagerHandler().sendEmptyMessage(1);
        }
        hwExerciseParams.setDeviceIdentify(deviceInfo.getSecurityDeviceId());
    }

    public static boolean isSupportExercise() {
        DeviceCapability capability = HwExerciseDeviceUtil.getCapability();
        boolean zIsSupportExerciseAdvice = capability != null ? capability.isSupportExerciseAdvice() : false;
        LogUtil.a(TAG, "get Device Support isSupportExercise: ", Boolean.valueOf(zIsSupportExerciseAdvice));
        return zIsSupportExerciseAdvice;
    }

    public static boolean isSupportExercise(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j(TAG, "isSupportExercise, deviceInfo is null");
            return false;
        }
        Map<String, DeviceCapability> mapQueryDeviceCapability = mkf.e(BaseApplication.getContext()).queryDeviceCapability(1, deviceInfo.getDeviceIdentify(), TAG);
        if (mapQueryDeviceCapability == null || mapQueryDeviceCapability.isEmpty()) {
            LogUtil.j(TAG, "isSupportExercise, deviceCapabilityHashMaps is empty");
            return false;
        }
        DeviceCapability deviceCapability = mapQueryDeviceCapability.get(deviceInfo.getDeviceIdentify());
        boolean zIsSupportExerciseAdvice = deviceCapability != null ? deviceCapability.isSupportExerciseAdvice() : false;
        LogUtil.a(TAG, "get Device Support isSupportExercise: ", Boolean.valueOf(zIsSupportExerciseAdvice));
        return zIsSupportExerciseAdvice;
    }

    public static boolean handleSaveNotRunPlanRecord(int i, boolean z) throws JSONException {
        HwExerciseParams hwExerciseParams = HwExerciseParams.getInstance();
        if (hwExerciseParams.getWorkoutRecord() != null) {
            if (hwExerciseParams.getWorkoutRecord().getJSONArray(HwExerciseConstants.JSON_NAME_WORKOUT_RECORD_STRUCT_LIST).length() > 0) {
                z = true;
            }
            LogUtil.a(TAG, "saveData recordId: ", Integer.valueOf(i));
            JSONObject jSONObject = hwExerciseParams.getWorkoutRecordsStatisticArray().get(i);
            if (jSONObject == null) {
                LogUtil.j(TAG, "handleSaveNotRunPlanRecord totalData is null");
                return false;
            }
            LogUtil.a(TAG, "totalData: ", jSONObject.toString());
            ArrayList arrayList = new ArrayList();
            for (WorkoutDataStruct workoutDataStruct : hwExerciseParams.getWorkoutDetailDataList()) {
                if (i == workoutDataStruct.getWorkoutRecordId()) {
                    arrayList.add(workoutDataStruct);
                }
            }
            JSONArray jSONArray = new JSONArray();
            for (JSONObject jSONObject2 : hwExerciseParams.getWorkoutRecordPaceMapList()) {
                if (i == jSONObject2.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_RECORD_ID)) {
                    jSONArray.put(jSONObject2);
                }
            }
            ArrayList arrayList2 = new ArrayList(16);
            if (hwExerciseParams.getSwimWorkoutRecordSectionMap().get(Integer.valueOf(i)) != null) {
                arrayList2.addAll((ArrayList) hwExerciseParams.getSwimWorkoutRecordSectionMap().get(Integer.valueOf(i)));
                int size = arrayList2.size();
                LogUtil.a(TAG, "section sectionArrayList size: ", Integer.valueOf(size), " workout type: ", jSONObject.get(HwExerciseConstants.JSON_NAME_WORKOUT_TYPE));
            }
            handleSaveNotRunPlayToTrack(i, jSONObject, arrayList, jSONArray, arrayList2);
        }
        return z;
    }

    public static boolean checkNewSectionWorkoutType(JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt(HwExerciseConstants.JSON_NAME_WORKOUT_TYPE);
        if (iOptInt != 1 && iOptInt != 3 && iOptInt != 5 && iOptInt != 11 && iOptInt != 25 && iOptInt != 227 && iOptInt != 255 && iOptInt != 15 && iOptInt != 16 && iOptInt != 22 && iOptInt != 23) {
            switch (iOptInt) {
                default:
                    switch (iOptInt) {
                        case 229:
                        case 230:
                        case 231:
                        case 232:
                            break;
                        default:
                            LogUtil.j(TAG, "checkNewSectionWorkoutType no support segment.");
                            return false;
                    }
                case 18:
                case 19:
                case 20:
                    return true;
            }
        }
        return true;
    }
}
