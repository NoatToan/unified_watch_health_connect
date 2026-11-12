package com.huawei.hwdevice.phoneprocess.mgr.exercise.multisync;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.datatype.DeviceCommand;
import com.huawei.health.device.model.OperatorStatus;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.dmsmanager.HwDeviceMgrInterface;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.DataHeader;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.PaceIndexStruct;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.SportReminder;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.WorkRecordIndexPaceMapList;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.WorkoutDataStruct;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.WorkoutRealTimeInfo;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.WorkoutRecord;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.WorkoutRecordJumpData;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.WorkoutRecordPaceMap;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.WorkoutRecordSpeechPlay;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.WorkoutRecordStatistic;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.WorkoutRecordStruct;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.HwExerciseCommandUtil;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.cpl;
import defpackage.ecu;
import defpackage.eeq;
import defpackage.ees;
import defpackage.eet;
import defpackage.eeu;
import defpackage.eew;
import defpackage.lsk;
import defpackage.mkf;
import defpackage.nfo;
import health.compact.a.CommonUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class HwWorkoutServiceAw70Manager {
    private static final int HALF_LENGTH = 2;
    private static final long MILLISECONDS_TO_SECOND = 1000;
    private static final String TAG = "HwWorkoutServiceAw70Manager";
    private static HwWorkoutServiceAw70Manager sInstance;
    private Context mContext;
    private HwDeviceMgrInterface mHwDeviceManager;
    private static final Object INSTANCE_LOCK = new Object();
    private static final Object LOCK_OBJECT = new Object();
    private static List<IBaseResponseCallback> sSetOperatorCallbackList = new ArrayList(16);
    private static List<IBaseResponseCallback> sGetOperatorCallbackList = new ArrayList(16);
    private static List<IBaseResponseCallback> sGetWorkoutRealTimeInfoCallbackList = new ArrayList(16);
    private static List<IBaseResponseCallback> sGetWorkoutRecordCallbackList = new ArrayList(16);
    private static List<IBaseResponseCallback> sGetWorkoutRecordStatisticCallbackList = new ArrayList(16);
    private static List<IBaseResponseCallback> sGetWorkoutDataCallbackList = new ArrayList(16);
    private static List<IBaseResponseCallback> sGetNotificationStatusCallbackList = new ArrayList(16);
    private static List<IBaseResponseCallback> sGetNotificationWorkoutRealTimeInfoCallbackList = new ArrayList(16);
    private static List<IBaseResponseCallback> sGetNotificationSportReminderCallbackList = new ArrayList(16);
    private static List<IBaseResponseCallback> sGetNotificationGetWorkoutRecordStatisticCallbackList = new ArrayList(16);
    private static List<IBaseResponseCallback> sGetWorkoutOperatorRealTimeDataCallbackList = new ArrayList(16);
    private static List<IBaseResponseCallback> sGetWorkoutRecordPaceMapListCallbackList = new ArrayList(16);
    private static List<IBaseResponseCallback> sGetNotificationWorkoutRecordSpeechPlayCallbackList = new ArrayList(16);
    private static List<IBaseResponseCallback> sWorkoutRecordSliceCallbackList = new ArrayList(16);
    private int mAw70LastRecordId = -1;
    private List<IBaseResponseCallback> mWorkoutCapabilityCallbackList = new Vector(16);

    private HwWorkoutServiceAw70Manager(Context context) {
        this.mContext = context;
        this.mHwDeviceManager = mkf.e(context);
    }

    public static HwWorkoutServiceAw70Manager getInstance() {
        HwWorkoutServiceAw70Manager hwWorkoutServiceAw70Manager;
        synchronized (INSTANCE_LOCK) {
            if (sInstance == null) {
                sInstance = new HwWorkoutServiceAw70Manager(BaseApplication.getContext());
            }
            hwWorkoutServiceAw70Manager = sInstance;
        }
        return hwWorkoutServiceAw70Manager;
    }

    public void setAw70LastRecordId(int i) {
        this.mAw70LastRecordId = i;
    }

    public boolean isAw70LastData(int i) {
        LogUtil.a(TAG, "mAw70LastRecordId is:", Integer.valueOf(this.mAw70LastRecordId), ",recordId is:", Integer.valueOf(i));
        return i == this.mAw70LastRecordId;
    }

    public void getWorkoutRealTimeInfo(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) throws JSONException {
        if (jSONObject == null || iBaseResponseCallback == null) {
            return;
        }
        synchronized (LOCK_OBJECT) {
            DeviceCommand deviceCommand = new DeviceCommand();
            deviceCommand.setServiceID(23);
            deviceCommand.setCommandID(4);
            String aw70Identify = getAw70Identify();
            if (!TextUtils.isEmpty(aw70Identify)) {
                deviceCommand.setmIdentify(aw70Identify);
            }
            StringBuilder realTimeInfoStruct = getRealTimeInfoStruct(jSONObject);
            deviceCommand.setDataLen(realTimeInfoStruct.length() / 2);
            deviceCommand.setDataContent(eeq.c(realTimeInfoStruct.toString()));
            synchronized (getGetWorkoutRealTimeInfoCallbackList()) {
                sGetWorkoutRealTimeInfoCallbackList.add(iBaseResponseCallback);
            }
            this.mHwDeviceManager.sendDeviceData(deviceCommand);
        }
    }

    private StringBuilder getRealTimeInfoStruct(JSONObject jSONObject) throws JSONException {
        String strB = eeq.b(3);
        String strD = eeq.d(1);
        String strD2 = eeq.d(jSONObject.getInt("sport_type"));
        String strB2 = eeq.b(strD2.length() / 2);
        String strD3 = eeq.d(2);
        StringBuilder sb = new StringBuilder(16);
        sb.append(strD);
        sb.append(strB);
        sb.append(strD3);
        sb.append(strB2);
        sb.append(strD2);
        return sb;
    }

    public void getWorkoutRecord(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) throws JSONException {
        if (jSONObject == null || iBaseResponseCallback == null) {
            return;
        }
        synchronized (LOCK_OBJECT) {
            DeviceCommand deviceCommand = new DeviceCommand();
            deviceCommand.setServiceID(23);
            deviceCommand.setCommandID(7);
            String aw70Identify = getAw70Identify();
            if (!TextUtils.isEmpty(aw70Identify)) {
                deviceCommand.setmIdentify(aw70Identify);
            }
            StringBuilder workoutRecordListHex = getWorkoutRecordListHex(jSONObject);
            deviceCommand.setDataLen(workoutRecordListHex.length() / 2);
            deviceCommand.setDataContent(eeq.c(workoutRecordListHex.toString()));
            synchronized (getGetWorkoutRecordCallbackList()) {
                sGetWorkoutRecordCallbackList.add(iBaseResponseCallback);
            }
            this.mHwDeviceManager.sendDeviceData(deviceCommand);
        }
    }

    private StringBuilder getWorkoutRecordListHex(JSONObject jSONObject) throws JSONException {
        String strB = eeq.b(12);
        String strD = eeq.d(129);
        int i = (int) (jSONObject.getLong("startTime") / 1000);
        String str = eeq.d(i >> 24) + eeq.d((i >> 16) & 255) + eeq.d((i >> 8) & 255) + eeq.d(i & 255);
        String strB2 = eeq.b(str.length() / 2);
        String strD2 = eeq.d(3);
        int i2 = (int) (jSONObject.getLong("endTime") / 1000);
        String str2 = eeq.d(i2 >> 24) + eeq.d((i2 >> 16) & 255) + eeq.d((i2 >> 8) & 255) + eeq.d(i2 & 255);
        String strB3 = eeq.b(str2.length() / 2);
        String strD3 = eeq.d(4);
        StringBuilder sb = new StringBuilder(16);
        sb.append(strD);
        sb.append(strB);
        sb.append(strD2);
        sb.append(strB2);
        sb.append(str);
        sb.append(strD3);
        sb.append(strB3);
        sb.append(str2);
        return sb;
    }

    public void getWorkoutRecordStatistic(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) throws JSONException {
        if (jSONObject == null || iBaseResponseCallback == null) {
            return;
        }
        synchronized (LOCK_OBJECT) {
            DeviceCommand deviceCommand = new DeviceCommand();
            deviceCommand.setServiceID(23);
            deviceCommand.setCommandID(8);
            String aw70Identify = getAw70Identify();
            if (!TextUtils.isEmpty(aw70Identify)) {
                deviceCommand.setmIdentify(aw70Identify);
            }
            String strB = eeq.b(4);
            String strD = eeq.d(129);
            LogUtil.a(TAG, "get getWorkoutRecordStatistic id");
            String strE = eeq.e(jSONObject.getInt("id"));
            String strB2 = eeq.b(strE.length() / 2);
            String strD2 = eeq.d(2);
            StringBuilder sb = new StringBuilder(16);
            sb.append(strD);
            sb.append(strB);
            sb.append(strD2);
            sb.append(strB2);
            sb.append(strE);
            deviceCommand.setDataLen(sb.length() / 2);
            deviceCommand.setDataContent(eeq.c(sb.toString()));
            synchronized (getGetWorkoutRecordStatisticCallbackList()) {
                sGetWorkoutRecordStatisticCallbackList.add(iBaseResponseCallback);
            }
            this.mHwDeviceManager.sendDeviceData(deviceCommand);
        }
    }

    private String getAw70Identify() {
        DeviceInfo deviceInfo;
        synchronized (LOCK_OBJECT) {
            List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_AW70_DEVICES, null, TAG);
            deviceInfo = deviceList.size() > 0 ? deviceList.get(0) : null;
        }
        if (deviceInfo != null) {
            return deviceInfo.getDeviceIdentify();
        }
        return null;
    }

    public void getWorkoutData(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback, int i) {
        if (jSONObject == null || iBaseResponseCallback == null) {
            return;
        }
        synchronized (LOCK_OBJECT) {
            DeviceCommand deviceCommand = new DeviceCommand();
            deviceCommand.setServiceID(23);
            deviceCommand.setCommandID(10);
            String aw70Identify = getAw70Identify();
            if (!TextUtils.isEmpty(aw70Identify)) {
                deviceCommand.setmIdentify(aw70Identify);
            }
            String workoutRecordStatisticStructHex = HwExerciseAdviceAw70ManagerUtil.getWorkoutRecordStatisticStructHex(jSONObject, i);
            deviceCommand.setDataLen(workoutRecordStatisticStructHex.length() / 2);
            deviceCommand.setDataContent(eeq.c(workoutRecordStatisticStructHex));
            synchronized (getGetWorkoutDataCallbackList()) {
                sGetWorkoutDataCallbackList.add(iBaseResponseCallback);
            }
            this.mHwDeviceManager.sendDeviceData(deviceCommand);
        }
    }

    public void workoutOperateRealtimeData(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) throws JSONException {
        LogUtil.a(TAG, "setRealTimeData enter");
        if (jSONObject == null || iBaseResponseCallback == null) {
            return;
        }
        synchronized (LOCK_OBJECT) {
            DeviceCommand deviceCommand = new DeviceCommand();
            deviceCommand.setServiceID(23);
            deviceCommand.setCommandID(11);
            String aw70Identify = getAw70Identify();
            if (!TextUtils.isEmpty(aw70Identify)) {
                deviceCommand.setmIdentify(aw70Identify);
            }
            StringBuilder sb = new StringBuilder(16);
            sb.append(eeq.d(129));
            setValues(jSONObject, sb);
            sb.append(eeq.d(5));
            String strE = eeq.e(jSONObject.getInt("speed"));
            sb.append(eeq.b(strE.length() / 2));
            sb.append(strE);
            setPaceValues(jSONObject, sb);
            deviceCommand.setDataLen(sb.length() / 2);
            deviceCommand.setDataContent(eeq.c(sb.toString()));
            synchronized (getGetWorkoutOperatorRealTimeDataCallbackList()) {
                sGetWorkoutOperatorRealTimeDataCallbackList.add(iBaseResponseCallback);
            }
            this.mHwDeviceManager.sendDeviceData(deviceCommand);
        }
    }

    private void setValues(JSONObject jSONObject, StringBuilder sb) throws JSONException {
        String strB;
        if (jSONObject.has("pace")) {
            strB = eeq.b(26);
        } else {
            strB = eeq.b(22);
        }
        String strC = eeq.c(jSONObject.getInt("exercise_duration"));
        String strB2 = eeq.b(strC.length() / 2);
        String strD = eeq.d(2);
        String strC2 = eeq.c(jSONObject.getInt("distance") * 10);
        String strB3 = eeq.b(strC2.length() / 2);
        String strD2 = eeq.d(3);
        String strC3 = eeq.c(jSONObject.getInt("calorie"));
        String strB4 = eeq.b(strC3.length() / 2);
        String strD3 = eeq.d(4);
        sb.append(strB);
        sb.append(strD);
        sb.append(strB2);
        sb.append(strC);
        sb.append(strD2);
        sb.append(strB3);
        sb.append(strC2);
        sb.append(strD3);
        sb.append(strB4);
        sb.append(strC3);
    }

    private void setPaceValues(JSONObject jSONObject, StringBuilder sb) throws JSONException {
        if (jSONObject.has("pace")) {
            String strE = eeq.e(jSONObject.getInt("pace"));
            String strB = eeq.b(strE.length() / 2);
            sb.append(eeq.d(6));
            sb.append(strB);
            sb.append(strE);
        }
    }

    public void setNotificationStatusResponse(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) {
        if (jSONObject == null || iBaseResponseCallback == null) {
            return;
        }
        LogUtil.d(TAG, "response of NotificationStatus info");
        synchronized (LOCK_OBJECT) {
            DeviceCommand deviceCommand = new DeviceCommand();
            deviceCommand.setServiceID(23);
            deviceCommand.setCommandID(2);
            String aw70Identify = getAw70Identify();
            if (!TextUtils.isEmpty(aw70Identify)) {
                deviceCommand.setmIdentify(aw70Identify);
            }
            try {
                String strC = eeq.c(jSONObject.getInt("notification_status_response"));
                String strD = eeq.d(strC.length() / 2);
                String strD2 = eeq.d(127);
                StringBuilder sb = new StringBuilder(16);
                sb.append(strD2);
                sb.append(strD);
                sb.append(strC);
                deviceCommand.setDataLen(sb.length() / 2);
                deviceCommand.setDataContent(eeq.c(sb.toString()));
                this.mHwDeviceManager.sendDeviceData(deviceCommand);
                iBaseResponseCallback.a(100000, nfo.a("success", "setNotificationStatusResponse"));
            } catch (JSONException unused) {
                LogUtil.e(TAG, "json exception");
            }
        }
    }

    public void getWorkoutRecordPaceMap(PaceIndexStruct paceIndexStruct, IBaseResponseCallback iBaseResponseCallback) {
        if (paceIndexStruct == null || iBaseResponseCallback == null) {
            return;
        }
        synchronized (LOCK_OBJECT) {
            DeviceCommand deviceCommand = new DeviceCommand();
            deviceCommand.setServiceID(23);
            deviceCommand.setCommandID(12);
            String aw70Identify = getAw70Identify();
            if (!TextUtils.isEmpty(aw70Identify)) {
                deviceCommand.setmIdentify(aw70Identify);
            }
            StringBuilder sb = new StringBuilder(16);
            setWorkoutRecordValues(paceIndexStruct, sb);
            deviceCommand.setDataLen(sb.length() / 2);
            deviceCommand.setDataContent(eeq.c(sb.toString()));
            synchronized (getGetWorkoutRecordPaceMapListCallbackList()) {
                sGetWorkoutRecordPaceMapListCallbackList.add(iBaseResponseCallback);
            }
            this.mHwDeviceManager.sendDeviceData(deviceCommand);
        }
    }

    private void setWorkoutRecordValues(PaceIndexStruct paceIndexStruct, StringBuilder sb) {
        String strD;
        String str;
        String strB;
        String strB2 = eeq.b(4);
        if (paceIndexStruct.getPaceIndex() < 0) {
            strD = "";
            str = "";
            strB = str;
        } else {
            String strB3 = eeq.b(8);
            String strE = eeq.e(paceIndexStruct.getPaceIndex());
            strB = eeq.b(strE.length() / 2);
            strD = eeq.d(8);
            strB2 = strB3;
            str = strE;
        }
        sb.append(eeq.d(129));
        sb.append(strB2);
        sb.append(eeq.d(2));
        String strE2 = eeq.e(paceIndexStruct.getRecordId());
        sb.append(eeq.b(strE2.length() / 2));
        sb.append(strE2);
        if (paceIndexStruct.getPaceIndex() >= 0) {
            sb.append(strD);
            sb.append(strB);
            sb.append(str);
        }
    }

    public void getWorkoutRecordSliceData(int i, int i2, IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            return;
        }
        synchronized (LOCK_OBJECT) {
            DeviceCommand deviceCommand = new DeviceCommand();
            deviceCommand.setServiceID(23);
            deviceCommand.setCommandID(19);
            String aw70Identify = getAw70Identify();
            if (!TextUtils.isEmpty(aw70Identify)) {
                deviceCommand.setmIdentify(aw70Identify);
            }
            String strD = eeq.d(1);
            String strE = eeq.e(i);
            String strB = eeq.b(strE.length() / 2);
            String strD2 = eeq.d(2);
            String strE2 = eeq.e(i2);
            String strB2 = eeq.b(strE2.length() / 2);
            StringBuilder sb = new StringBuilder(16);
            sb.append(strD);
            sb.append(strB);
            sb.append(strE);
            sb.append(strD2);
            sb.append(strB2);
            sb.append(strE2);
            deviceCommand.setDataLen(sb.length() / 2);
            deviceCommand.setDataContent(eeq.c(sb.toString()));
            synchronized (getWorkoutRecordSliceCallbackList()) {
                sWorkoutRecordSliceCallbackList.add(iBaseResponseCallback);
            }
            this.mHwDeviceManager.sendDeviceData(deviceCommand);
        }
    }

    public void notificationWorkoutRecordSpeechPlayReportStatus(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.d(TAG, "ENTER notificationWorkoutRecordSpeechPlayReportStatus...");
        synchronized (LOCK_OBJECT) {
            if (jSONObject != null) {
                if (jSONObject.optInt("result") == 0) {
                    DeviceCommand deviceCommand = new DeviceCommand();
                    deviceCommand.setServiceID(23);
                    deviceCommand.setCommandID(13);
                    String aw70Identify = getAw70Identify();
                    if (!TextUtils.isEmpty(aw70Identify)) {
                        deviceCommand.setmIdentify(aw70Identify);
                    }
                    String strD = eeq.d(1);
                    String strB = eeq.b(1);
                    String strD2 = eeq.d(2);
                    StringBuilder sb = new StringBuilder(16);
                    sb.append(strD2);
                    sb.append(strB);
                    sb.append(strD);
                    deviceCommand.setDataLen(sb.length() / 2);
                    deviceCommand.setDataContent(eeq.c(sb.toString()));
                    this.mHwDeviceManager.sendDeviceData(deviceCommand);
                }
            }
        }
    }

    public void getResult(byte[] bArr) {
        cpl.d(TAG, bArr, "getResult(): ");
        if (bArr == null) {
            return;
        }
        String strE = eeq.e(bArr);
        if (strE.length() > 4) {
            try {
                ees eesVarB = new eet().b(strE.substring(4, strE.length()));
                List<eew> listE = eesVarB.e();
                List<ees> listB = eesVarB.b();
                byte b2 = bArr[1];
                if (b2 == 1) {
                    parseSetOperator(listE);
                    return;
                }
                if (b2 == 2) {
                    parseNotificationStatus(listB);
                    return;
                }
                if (b2 == 3) {
                    parseGetOperator(listE, listB);
                    return;
                }
                if (b2 == 4) {
                    parseGetWorkoutRealTimeInfo(listE, listB);
                    return;
                } else if (b2 == 5) {
                    parseNotificationWorkoutRealTime(listB);
                    return;
                } else {
                    parseResult(b2, listE, listB);
                    return;
                }
            } catch (eeu e) {
                LogUtil.e(TAG, "error code TlvException ", e.getMessage());
                return;
            } catch (IndexOutOfBoundsException e2) {
                LogUtil.e(TAG, "error code IndexOutOfBoundsException ", e2.getMessage());
                return;
            } catch (Exception unused) {
                LogUtil.e(TAG, "error code Exception");
                return;
            }
        }
        LogUtil.j(TAG, "error code data length less 4");
    }

    public void getWorkoutCapability(IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            return;
        }
        this.mWorkoutCapabilityCallbackList.add(iBaseResponseCallback);
        String aw70Identify = getAw70Identify();
        DeviceCommand workoutCapability = HwExerciseCommandUtil.getWorkoutCapability();
        if (!TextUtils.isEmpty(aw70Identify)) {
            workoutCapability.setmIdentify(aw70Identify);
        }
        synchronized (LOCK_OBJECT) {
            this.mHwDeviceManager.sendDeviceData(workoutCapability);
        }
    }

    private void parseSetOperator(List<eew> list) {
        int iV = CommonUtil.v(list.get(0).b());
        synchronized (getSetOperatorCallbackList()) {
            if (sSetOperatorCallbackList.size() != 0) {
                sSetOperatorCallbackList.get(0).a(iV, nfo.a(Integer.valueOf(iV), "setOperator"));
                sSetOperatorCallbackList.remove(0);
            }
        }
    }

    private void parseNotificationStatus(List<ees> list) {
        OperatorStatus operatorStatus = new OperatorStatus();
        Iterator<ees> it = list.iterator();
        while (it.hasNext()) {
            for (eew eewVar : it.next().e()) {
                int iV = CommonUtil.v(eewVar.e());
                if (iV == 2) {
                    operatorStatus.setOperatorType(CommonUtil.v(eewVar.b()));
                } else if (iV == 3) {
                    operatorStatus.setSportType(CommonUtil.v(eewVar.b()));
                } else if (iV == 4) {
                    operatorStatus.setRunPlanDate(CommonUtil.x(eewVar.b()) * 1000);
                } else if (iV == 5) {
                    operatorStatus.setWorkoutType(CommonUtil.v(eewVar.b()));
                } else if (iV == 6) {
                    operatorStatus.setOperationTime(CommonUtil.x(eewVar.b()));
                } else {
                    LogUtil.j(TAG, "parseNotificationStatus default");
                }
            }
        }
        synchronized (getGetNotificationStatusCallbackList()) {
            Iterator<IBaseResponseCallback> it2 = sGetNotificationStatusCallbackList.iterator();
            while (it2.hasNext()) {
                it2.next().a(100000, nfo.a(operatorStatus, "notificationStatus"));
            }
        }
    }

    private void parseGetOperator(List<eew> list, List<ees> list2) {
        if (list != null && !list.isEmpty() && CommonUtil.v(list.get(0).e()) == 127) {
            synchronized (getGetOperatorCallbackList()) {
                if (sGetOperatorCallbackList.size() != 0) {
                    int iV = CommonUtil.v(list.get(0).b());
                    sGetOperatorCallbackList.get(0).a(iV, nfo.a(Integer.valueOf(iV), "getOperator"));
                    sGetOperatorCallbackList.remove(0);
                }
            }
            return;
        }
        OperatorStatus operatorStatus = getOperatorStatus(list2);
        synchronized (getGetOperatorCallbackList()) {
            if (sGetOperatorCallbackList.size() != 0) {
                sGetOperatorCallbackList.get(0).a(100000, nfo.a(operatorStatus, "getOperator"));
                sGetOperatorCallbackList.remove(0);
            }
        }
    }

    private OperatorStatus getOperatorStatus(List<ees> list) {
        OperatorStatus operatorStatus = new OperatorStatus();
        Iterator<ees> it = list.iterator();
        while (it.hasNext()) {
            for (eew eewVar : it.next().e()) {
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
                    LogUtil.j(TAG, "parseGetOperator default");
                }
            }
        }
        return operatorStatus;
    }

    private void parseGetWorkoutRealTimeInfo(List<eew> list, List<ees> list2) {
        if (list != null && !list.isEmpty() && CommonUtil.v(list.get(0).e()) == 127) {
            synchronized (getGetWorkoutRealTimeInfoCallbackList()) {
                int iV = CommonUtil.v(list.get(0).b());
                sGetWorkoutRealTimeInfoCallbackList.get(0).a(iV, nfo.a(Integer.valueOf(iV), "getWorkoutRealTimeInfo"));
                sGetWorkoutRealTimeInfoCallbackList.remove(0);
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
                        LogUtil.j(TAG, "parseGetWorkoutRealTimeInfo default");
                        break;
                }
            }
        }
        synchronized (getGetWorkoutRealTimeInfoCallbackList()) {
            sGetWorkoutRealTimeInfoCallbackList.get(0).a(100000, nfo.a(workoutRealTimeInfo, "getWorkoutRealTimeInfo"));
            sGetWorkoutRealTimeInfoCallbackList.remove(0);
        }
    }

    private void parseNotificationWorkoutRealTime(List<ees> list) {
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
                        LogUtil.j(TAG, "parseNotificationWorkoutRealTime default");
                        break;
                }
            }
        }
        synchronized (getGetNotificationWorkoutRealTimeInfoCallbackList()) {
            Iterator<IBaseResponseCallback> it2 = sGetNotificationWorkoutRealTimeInfoCallbackList.iterator();
            while (it2.hasNext()) {
                it2.next().a(100000, nfo.a(workoutRealTimeInfo, "notificationWorkoutRealTimeInfo"));
            }
        }
    }

    private void parseResult(byte b2, List<eew> list, List<ees> list2) {
        if (b2 == 19) {
            parseCommandIdWorkoutRecordSliceData(list, list2);
            return;
        }
        if (b2 != 21) {
            switch (b2) {
                case 6:
                    parseNotificationSportReminder(list2);
                    break;
                case 7:
                    parseGetWorkoutRecord(list, list2);
                    break;
                case 8:
                    parseGetWorkoutRecordStatistic(list, list2);
                    break;
                case 9:
                    parseNotificationGetWorkoutRecordStatistic(list2);
                    break;
                case 10:
                    parseGetWorkoutData(list, list2);
                    break;
                case 11:
                    parseWorkoutOperateRealTime(list);
                    break;
                case 12:
                    parseWorkoutRecordPaceMap(list, list2);
                    break;
                case 13:
                    parseNotificationWorkoutRecordSpeechPlay(list);
                    break;
                default:
                    LogUtil.j(TAG, "parseResult default");
                    break;
            }
            return;
        }
        HwExerciseAdviceAw70ManagerUtil.parseWorkoutCapability(list, this.mWorkoutCapabilityCallbackList);
    }

    private void parseNotificationSportReminder(List<ees> list) {
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
                        LogUtil.j(TAG, "parseNotificationSportReminder default");
                        break;
                }
            }
        }
        synchronized (getGetNotificationSportReminderCallbackList()) {
            Iterator<IBaseResponseCallback> it2 = sGetNotificationSportReminderCallbackList.iterator();
            while (it2.hasNext()) {
                it2.next().a(100000, nfo.a(sportReminder, "notificationSportReminder"));
            }
        }
    }

    private void parseGetWorkoutRecord(List<eew> list, List<ees> list2) {
        if (list != null && !list.isEmpty() && CommonUtil.v(list.get(0).e()) == 127) {
            synchronized (getGetWorkoutRecordCallbackList()) {
                if (sGetWorkoutRecordCallbackList.size() != 0) {
                    int iV = CommonUtil.v(list.get(0).b());
                    sGetWorkoutRecordCallbackList.get(0).a(iV, nfo.a(Integer.valueOf(iV), "getWorkoutRecord"));
                    sGetWorkoutRecordCallbackList.remove(0);
                }
            }
            return;
        }
        WorkoutRecord workoutRecord = new WorkoutRecord();
        ArrayList arrayList = new ArrayList(16);
        parseGetWorkoutRecordSecond(list2, workoutRecord, arrayList);
        workoutRecord.setWorkoutRecordStructList(arrayList);
        if (!arrayList.isEmpty()) {
            setAw70LastRecordId(arrayList.get(arrayList.size() - 1).getWorkoutRecordId());
        }
        synchronized (getGetWorkoutRecordCallbackList()) {
            if (sGetWorkoutRecordCallbackList.size() != 0) {
                sGetWorkoutRecordCallbackList.get(0).a(100000, nfo.a(workoutRecord, "getWorkoutRecord"));
                sGetWorkoutRecordCallbackList.remove(0);
            }
        }
    }

    private void parseGetWorkoutRecordSecond(List<ees> list, WorkoutRecord workoutRecord, List<WorkoutRecordStruct> list2) {
        for (ees eesVar : list) {
            for (eew eewVar : eesVar.e()) {
                if (CommonUtil.v(eewVar.e()) == 2) {
                    workoutRecord.setWorkoutRecordCount(CommonUtil.v(eewVar.b()));
                } else {
                    LogUtil.j(TAG, "parseGetWorkoutRecordSecond tlvList default");
                }
            }
            Iterator<ees> it = eesVar.b().iterator();
            while (it.hasNext()) {
                List<eew> listE = it.next().e();
                WorkoutRecordStruct workoutRecordStruct = new WorkoutRecordStruct();
                Iterator<eew> it2 = listE.iterator();
                while (it2.hasNext()) {
                    parseGetWorkoutRecordThird(it2.next(), workoutRecordStruct);
                }
                list2.add(workoutRecordStruct);
            }
        }
    }

    private void parseGetWorkoutRecordThird(eew eewVar, WorkoutRecordStruct workoutRecordStruct) {
        int iV = CommonUtil.v(eewVar.e());
        if (iV == 6) {
            workoutRecordStruct.setWorkoutRecordId(CommonUtil.v(eewVar.b()));
            return;
        }
        if (iV == 7) {
            workoutRecordStruct.setWorkoutIndexCount(CommonUtil.v(eewVar.b()));
            return;
        }
        if (iV == 8) {
            workoutRecordStruct.setPaceIndexCount(CommonUtil.v(eewVar.b()));
        } else if (iV == 10) {
            workoutRecordStruct.setWorkoutSliceNumber(CommonUtil.v(eewVar.b()));
        } else {
            LogUtil.j(TAG, "parseGetWorkoutRecordSecond default");
        }
    }

    private void parseGetWorkoutRecordStatistic(List<eew> list, List<ees> list2) {
        if (list != null && !list.isEmpty() && CommonUtil.v(list.get(0).e()) == 127) {
            synchronized (getGetWorkoutRecordStatisticCallbackList()) {
                if (sGetWorkoutRecordStatisticCallbackList.size() != 0) {
                    int iV = CommonUtil.v(list.get(0).b());
                    sGetWorkoutRecordStatisticCallbackList.get(0).a(iV, nfo.a(Integer.valueOf(iV), "getWorkoutRecordStatistic"));
                    sGetWorkoutRecordStatisticCallbackList.remove(0);
                }
            }
            return;
        }
        WorkoutRecordStatistic workoutRecordStatistic = new WorkoutRecordStatistic();
        Iterator<ees> it = list2.iterator();
        while (it.hasNext()) {
            for (eew eewVar : it.next().e()) {
                int iA = lsk.a(eewVar.e(), 16);
                if (iA == 2) {
                    workoutRecordStatistic.setWorkoutRecordId(lsk.a(eewVar.b(), 16));
                } else if (iA == 3) {
                    workoutRecordStatistic.setWorkoutRecordStatus(lsk.a(eewVar.b(), 16));
                } else if (iA == 4) {
                    workoutRecordStatistic.setWorkoutRecordStartTime(CommonUtil.x(eewVar.b()) * 1000);
                } else {
                    parseGetWorkoutRecordStatisticSecond(eewVar, workoutRecordStatistic);
                }
            }
        }
        synchronized (getGetWorkoutRecordStatisticCallbackList()) {
            if (sGetWorkoutRecordStatisticCallbackList.size() != 0) {
                sGetWorkoutRecordStatisticCallbackList.get(0).a(100000, nfo.a(workoutRecordStatistic, "getWorkoutRecordStatistic"));
                sGetWorkoutRecordStatisticCallbackList.remove(0);
            }
        }
    }

    private void parseGetWorkoutRecordStatisticSecond(eew eewVar, WorkoutRecordStatistic workoutRecordStatistic) {
        switch (lsk.a(eewVar.e(), 16)) {
            case 5:
                workoutRecordStatistic.setWorkoutRecordEndTime(CommonUtil.x(eewVar.b()) * 1000);
                break;
            case 6:
                workoutRecordStatistic.setWorkoutRecordCalorie(lsk.a(eewVar.b(), 16));
                break;
            case 7:
                workoutRecordStatistic.setWorkoutRecordDistance(lsk.a(eewVar.b(), 16));
                break;
            case 8:
                workoutRecordStatistic.setWorkoutRecordStep(CommonUtil.x(eewVar.b()));
                break;
            case 9:
                workoutRecordStatistic.setWorkoutRecordTotalTime(CommonUtil.x(eewVar.b()));
                break;
            case 10:
                workoutRecordStatistic.setWorkoutRecordSpeed(lsk.a(eewVar.b(), 16));
                break;
            case 11:
                workoutRecordStatistic.setWorkoutClimb(CommonUtil.x(eewVar.b()));
                break;
            case 12:
                workoutRecordStatistic.setWorkoutHrPeakMin(lsk.a(eewVar.b().substring(0, 2), 16));
                workoutRecordStatistic.setWorkoutHrPeakMax(lsk.a(eewVar.b().substring(2, 4), 16));
                break;
            case 13:
                workoutRecordStatistic.setWorkoutLoadPeak(lsk.a(eewVar.b(), 16));
                break;
            default:
                parseGetWorkoutRecordStatisticThird(eewVar, workoutRecordStatistic);
                break;
        }
    }

    private void parseGetWorkoutRecordStatisticThird(eew eewVar, WorkoutRecordStatistic workoutRecordStatistic) {
        switch (lsk.a(eewVar.e(), 16)) {
            case 14:
                workoutRecordStatistic.setWorkoutEtrainingEffect(lsk.a(eewVar.b(), 16));
                break;
            case 15:
                workoutRecordStatistic.setWorkoutEpoc(lsk.a(eewVar.b(), 16));
                break;
            case 16:
                workoutRecordStatistic.setWorkoutMaxMet(lsk.a(eewVar.b(), 16));
                break;
            case 17:
                workoutRecordStatistic.setWorkoutRecoveryTime(lsk.a(eewVar.b(), 16));
                break;
            case 18:
                workoutRecordStatistic.setWorkoutExerciseDuration(CommonUtil.x(eewVar.b()) * 1000);
                break;
            case 19:
                workoutRecordStatistic.setWorkoutDateInfo(CommonUtil.x(eewVar.b()));
                break;
            case 20:
                workoutRecordStatistic.setWorkoutType(lsk.a(eewVar.b(), 16));
                break;
            case 21:
                workoutRecordStatistic.setSwimType(lsk.a(eewVar.b(), 16));
                break;
            case 22:
                workoutRecordStatistic.setSwimPullTimes(lsk.a(eewVar.b(), 16));
                break;
            case 23:
                workoutRecordStatistic.setSwimPullRate(lsk.a(eewVar.b(), 16));
                break;
            default:
                parseGetWorkoutRecordStatisticFourth(eewVar, workoutRecordStatistic);
                break;
        }
    }

    private void parseGetWorkoutRecordStatisticFourth(eew eewVar, WorkoutRecordStatistic workoutRecordStatistic) {
        int iA = lsk.a(eewVar.e(), 16);
        switch (iA) {
            case 24:
                workoutRecordStatistic.setSwimPoolLength(lsk.a(eewVar.b(), 16));
                break;
            case 25:
                workoutRecordStatistic.setSwimTripTimes(lsk.a(eewVar.b(), 16));
                break;
            case 26:
                workoutRecordStatistic.setSwimAvgSwolf(lsk.a(eewVar.b(), 16));
                break;
            default:
                switch (iA) {
                    case 49:
                        workoutRecordStatistic.setActiveDuration(lsk.a(eewVar.b(), 16));
                        break;
                    case 50:
                        workoutRecordStatistic.setJumpTimes(lsk.a(eewVar.b(), 16));
                        break;
                    case 51:
                        workoutRecordStatistic.setMaxJumpHeight(lsk.a(eewVar.b(), 16));
                        break;
                    case 52:
                        workoutRecordStatistic.setMaxJumpDuration(lsk.a(eewVar.b(), 16));
                        break;
                    case 53:
                        workoutRecordStatistic.setMaxRunSpeed(lsk.a(eewVar.b(), 16));
                        break;
                    case 54:
                        workoutRecordStatistic.setRunScore(lsk.a(eewVar.b(), 16));
                        break;
                    case 55:
                        workoutRecordStatistic.setMoveScore(lsk.a(eewVar.b(), 16));
                        break;
                    default:
                        parseGetWorkoutRecordStatisticFifth(eewVar, workoutRecordStatistic);
                        break;
                }
                break;
        }
    }

    private void parseGetWorkoutRecordStatisticFifth(eew eewVar, WorkoutRecordStatistic workoutRecordStatistic) {
        switch (lsk.a(eewVar.e(), 16)) {
            case 56:
                workoutRecordStatistic.setJumpScore(lsk.a(eewVar.b(), 16));
                break;
            case 57:
                workoutRecordStatistic.setTotalScore(lsk.a(eewVar.b(), 16));
                break;
            case 58:
                workoutRecordStatistic.setExplosiveScore(lsk.a(eewVar.b(), 16));
                break;
            case 59:
                workoutRecordStatistic.setIntenseScore(lsk.a(eewVar.b(), 16));
                break;
            default:
                LogUtil.j(TAG, "parseGetWorkoutRecordStatisticFifth default");
                break;
        }
    }

    private void parseNotificationGetWorkoutRecordStatistic(List<ees> list) {
        WorkoutRecordStatistic workoutRecordStatistic = new WorkoutRecordStatistic();
        Iterator<ees> it = list.iterator();
        while (it.hasNext()) {
            for (eew eewVar : it.next().e()) {
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
                    default:
                        parseNotificationGetWorkoutRecordStatisticSecond(eewVar, workoutRecordStatistic);
                        break;
                }
            }
        }
        synchronized (getGetNotificationGetWorkoutRecordStatisticCallbackList()) {
            Iterator<IBaseResponseCallback> it2 = sGetNotificationGetWorkoutRecordStatisticCallbackList.iterator();
            while (it2.hasNext()) {
                it2.next().a(100000, nfo.a(workoutRecordStatistic, "notificationGetWorkoutRecordStatistic"));
            }
        }
    }

    private void parseNotificationGetWorkoutRecordStatisticSecond(eew eewVar, WorkoutRecordStatistic workoutRecordStatistic) {
        switch (CommonUtil.v(eewVar.e())) {
            case 9:
                workoutRecordStatistic.setWorkoutRecordTotalTime(CommonUtil.x(eewVar.b()));
                break;
            case 10:
                workoutRecordStatistic.setWorkoutRecordSpeed(CommonUtil.v(eewVar.b()));
                break;
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
                workoutRecordStatistic.setWorkoutMaxMet(CommonUtil.v(eewVar.b()));
                break;
            case 17:
                workoutRecordStatistic.setWorkoutRecoveryTime(CommonUtil.v(eewVar.b()));
                break;
            default:
                LogUtil.j(TAG, "parseNotificationGetWorkoutRecordStatisticSecond default");
                parseNotificationGetWorkoutRecordStatisticThird(eewVar, workoutRecordStatistic);
                break;
        }
    }

    private void parseNotificationGetWorkoutRecordStatisticThird(eew eewVar, WorkoutRecordStatistic workoutRecordStatistic) {
        int iV = CommonUtil.v(eewVar.e());
        if (iV == 18) {
            workoutRecordStatistic.setWorkoutExerciseDuration(CommonUtil.x(eewVar.b()));
        } else if (iV == 19) {
            workoutRecordStatistic.setWorkoutDateInfo(CommonUtil.x(eewVar.b()));
        } else {
            LogUtil.j(TAG, "parseNotificationGetWorkoutRecordStatisticThird default");
        }
    }

    private void parseGetWorkoutData(List<eew> list, List<ees> list2) {
        if (list != null && !list.isEmpty() && CommonUtil.v(list.get(0).e()) == 127) {
            synchronized (getGetWorkoutDataCallbackList()) {
                if (sGetWorkoutDataCallbackList.size() != 0) {
                    int iV = CommonUtil.v(list.get(0).b());
                    sGetWorkoutDataCallbackList.get(0).a(iV, nfo.a(Integer.valueOf(iV), "getWorkoutData"));
                    sGetWorkoutDataCallbackList.remove(0);
                }
            }
            return;
        }
        WorkoutDataStruct workoutDataStruct = new WorkoutDataStruct();
        if (list2 != null && !list2.isEmpty()) {
            Iterator<ees> it = list2.iterator();
            while (it.hasNext()) {
                parseWorkoutData(it.next(), workoutDataStruct);
            }
        }
        synchronized (getGetWorkoutDataCallbackList()) {
            if (sGetWorkoutDataCallbackList.size() != 0) {
                sGetWorkoutDataCallbackList.get(0).a(100000, nfo.a(workoutDataStruct, "getWorkoutData"));
                sGetWorkoutDataCallbackList.remove(0);
            }
        }
    }

    private void parseWorkoutData(ees eesVar, WorkoutDataStruct workoutDataStruct) {
        List<eew> listE = eesVar.e();
        DataHeader dataHeader = new DataHeader();
        ArrayList arrayList = new ArrayList(16);
        ExtrasDataUtils extrasDataUtils = new ExtrasDataUtils();
        String strB = null;
        int iV = 26;
        String extraBitmap = "0000000111111111";
        for (eew eewVar : listE) {
            int iV2 = CommonUtil.v(eewVar.e());
            if (iV2 == 2) {
                workoutDataStruct.setWorkoutRecordId(CommonUtil.v(eewVar.b()));
            } else if (iV2 == 3) {
                workoutDataStruct.setWorkoutDataIndex(CommonUtil.v(eewVar.b()));
            } else if (iV2 == 4) {
                LogUtil.a(TAG, "ready parse header data.");
                extrasDataUtils.parseHeader(eewVar.b(), dataHeader);
            } else if (iV2 == 5) {
                strB = eewVar.b();
            } else if (iV2 == 8) {
                iV = CommonUtil.v(eewVar.b()) * 2;
            } else if (iV2 == 9) {
                extraBitmap = extrasDataUtils.parseExtraBitmap(eewVar.b());
            } else {
                LogUtil.j(TAG, "parseWorkoutData default");
            }
        }
        LogUtil.a(TAG, "ready parse frame data.");
        extrasDataUtils.parseFrameData(strB, iV, extraBitmap, dataHeader, arrayList);
        dataHeader.setWorkoutDataInfoList(arrayList);
        workoutDataStruct.setDataHeader(dataHeader);
    }

    private void parseWorkoutOperateRealTime(List<eew> list) {
        synchronized (getGetWorkoutOperatorRealTimeDataCallbackList()) {
            if (sGetWorkoutOperatorRealTimeDataCallbackList.size() != 0) {
                int iV = CommonUtil.v(list.get(0).b());
                sGetWorkoutOperatorRealTimeDataCallbackList.get(0).a(iV, nfo.a(Integer.valueOf(iV), "workoutOperateRealtimeData"));
                sGetWorkoutOperatorRealTimeDataCallbackList.remove(0);
            }
        }
    }

    private void parseWorkoutRecordPaceMap(List<eew> list, List<ees> list2) {
        if (list != null && !list.isEmpty() && CommonUtil.v(list.get(0).e()) == 127) {
            synchronized (getGetWorkoutRecordPaceMapListCallbackList()) {
                if (sGetWorkoutRecordPaceMapListCallbackList.size() != 0) {
                    int iV = CommonUtil.v(list.get(0).b());
                    sGetWorkoutRecordPaceMapListCallbackList.get(0).a(iV, nfo.a(Integer.valueOf(iV), "getWorkoutRecordPaceMap"));
                    sGetWorkoutRecordPaceMapListCallbackList.remove(0);
                }
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
                LogUtil.j(TAG, "parseWorkoutRecordPaceMap else");
            }
        }
        for (ees eesVar : list2.get(0).b()) {
            WorkoutRecordPaceMap workoutRecordPaceMap = new WorkoutRecordPaceMap();
            parseWorkoutRecordPaceMapSecond(eesVar.e(), workoutRecordPaceMap);
            arrayList.add(workoutRecordPaceMap);
        }
        workRecordIndexPaceMapList.setPaceMapList(arrayList);
        synchronized (getGetWorkoutRecordPaceMapListCallbackList()) {
            if (sGetWorkoutRecordPaceMapListCallbackList.size() != 0) {
                sGetWorkoutRecordPaceMapListCallbackList.get(0).a(100000, nfo.a(workRecordIndexPaceMapList, "getWorkoutRecordPaceMap"));
                sGetWorkoutRecordPaceMapListCallbackList.remove(0);
            }
        }
    }

    private void parseWorkoutRecordPaceMapSecond(List<eew> list, WorkoutRecordPaceMap workoutRecordPaceMap) {
        for (eew eewVar : list) {
            int iV = CommonUtil.v(eewVar.e());
            if (iV == 4) {
                workoutRecordPaceMap.setDistance(CommonUtil.v(eewVar.b()));
            } else if (iV == 5) {
                workoutRecordPaceMap.setUnitType(CommonUtil.v(eewVar.b()));
            } else if (iV == 6) {
                workoutRecordPaceMap.setPace(CommonUtil.v(eewVar.b()));
            } else if (iV == 7) {
                workoutRecordPaceMap.setPointIndex(CommonUtil.v(eewVar.b()));
            } else if (iV == 9) {
                workoutRecordPaceMap.setLastLessDistance(CommonUtil.v(eewVar.b()));
                workoutRecordPaceMap.setIsLastLessDistance(true);
            } else {
                LogUtil.j(TAG, "parseWorkoutRecordPaceMapSecond default");
            }
        }
    }

    private void parseNotificationWorkoutRecordSpeechPlay(List<eew> list) {
        WorkoutRecordSpeechPlay workoutRecordSpeechPlay = new WorkoutRecordSpeechPlay();
        for (eew eewVar : list) {
            if (CommonUtil.v(eewVar.e()) == 1) {
                workoutRecordSpeechPlay.setWorkoutRecordSpeechPlayRequest(CommonUtil.v(eewVar.b()));
            }
        }
        synchronized (getGetNotificationWorkoutRecordSpeechPlayCallbackList()) {
            Iterator<IBaseResponseCallback> it = sGetNotificationWorkoutRecordSpeechPlayCallbackList.iterator();
            while (it.hasNext()) {
                it.next().a(100000, nfo.a(workoutRecordSpeechPlay, "notificationWorkoutRecordSpeechPlay"));
            }
        }
    }

    private void parseCommandIdWorkoutRecordSliceData(List<eew> list, List<ees> list2) {
        ArrayList arrayList = new ArrayList(16);
        int iV = 0;
        for (eew eewVar : list) {
            try {
                if (CommonUtil.v(eewVar.e()) == 1) {
                    iV = CommonUtil.v(eewVar.b());
                    LogUtil.a(TAG, "recordId is ", Integer.valueOf(iV));
                } else if (CommonUtil.v(eewVar.e()) == 2) {
                    LogUtil.a(TAG, "sliceIndex is ", Integer.valueOf(CommonUtil.v(eewVar.b())));
                } else {
                    LogUtil.j(TAG, "tlv.getTag() is ", eewVar.e());
                }
            } catch (NumberFormatException unused) {
                LogUtil.e(TAG, "getResult NumberFormatException");
            }
        }
        Iterator<ees> it = list2.iterator();
        while (it.hasNext()) {
            Iterator<ees> it2 = it.next().b().iterator();
            while (it2.hasNext()) {
                List<eew> listE = it2.next().e();
                WorkoutRecordJumpData workoutRecordJumpData = new WorkoutRecordJumpData();
                workoutRecordJumpData.setRecordId(iV);
                Iterator<eew> it3 = listE.iterator();
                while (it3.hasNext()) {
                    try {
                        configWorkoutRecordJumpData(workoutRecordJumpData, it3.next());
                    } catch (NumberFormatException unused2) {
                        LogUtil.e(TAG, "parseRunPostureDataInfo NumberFormatException1");
                    }
                }
                arrayList.add(workoutRecordJumpData);
            }
        }
        synchronized (getWorkoutRecordSliceCallbackList()) {
            if (sWorkoutRecordSliceCallbackList.size() != 0) {
                sWorkoutRecordSliceCallbackList.get(0).a(100000, nfo.a(arrayList, "getWorkoutRecordSliceData"));
                sWorkoutRecordSliceCallbackList.remove(0);
            }
        }
    }

    private void configWorkoutRecordJumpData(WorkoutRecordJumpData workoutRecordJumpData, eew eewVar) {
        int iV = CommonUtil.v(eewVar.e());
        if (iV == 5) {
            int iV2 = CommonUtil.v(eewVar.b());
            LogUtil.a(TAG, "jump_time is ", Integer.valueOf(iV2));
            workoutRecordJumpData.setJumpTime(iV2);
        } else if (iV == 6) {
            int iV3 = CommonUtil.v(eewVar.b());
            LogUtil.a(TAG, "jump_duration is ", Integer.valueOf(iV3));
            workoutRecordJumpData.setJumpDuration(iV3);
        } else {
            if (iV == 7) {
                int iV4 = CommonUtil.v(eewVar.b());
                LogUtil.a(TAG, "jump_height is ", Integer.valueOf(iV4));
                workoutRecordJumpData.setJumpHeight(iV4);
                return;
            }
            LogUtil.j(TAG, "configWorkoutRecordJumpData default");
        }
    }

    private static List<IBaseResponseCallback> getSetOperatorCallbackList() {
        List<IBaseResponseCallback> list;
        synchronized (HwWorkoutServiceAw70Manager.class) {
            list = sSetOperatorCallbackList;
        }
        return list;
    }

    private static List<IBaseResponseCallback> getGetOperatorCallbackList() {
        List<IBaseResponseCallback> list;
        synchronized (HwWorkoutServiceAw70Manager.class) {
            list = sGetOperatorCallbackList;
        }
        return list;
    }

    private static List<IBaseResponseCallback> getGetWorkoutRealTimeInfoCallbackList() {
        List<IBaseResponseCallback> list;
        synchronized (HwWorkoutServiceAw70Manager.class) {
            list = sGetWorkoutRealTimeInfoCallbackList;
        }
        return list;
    }

    private static List<IBaseResponseCallback> getGetWorkoutRecordCallbackList() {
        List<IBaseResponseCallback> list;
        synchronized (HwWorkoutServiceAw70Manager.class) {
            list = sGetWorkoutRecordCallbackList;
        }
        return list;
    }

    private static List<IBaseResponseCallback> getGetWorkoutRecordStatisticCallbackList() {
        List<IBaseResponseCallback> list;
        synchronized (HwWorkoutServiceAw70Manager.class) {
            list = sGetWorkoutRecordStatisticCallbackList;
        }
        return list;
    }

    private static List<IBaseResponseCallback> getGetWorkoutDataCallbackList() {
        List<IBaseResponseCallback> list;
        synchronized (HwWorkoutServiceAw70Manager.class) {
            list = sGetWorkoutDataCallbackList;
        }
        return list;
    }

    private static List<IBaseResponseCallback> getGetNotificationStatusCallbackList() {
        List<IBaseResponseCallback> list;
        synchronized (HwWorkoutServiceAw70Manager.class) {
            list = sGetNotificationStatusCallbackList;
        }
        return list;
    }

    private static List<IBaseResponseCallback> getGetNotificationWorkoutRealTimeInfoCallbackList() {
        List<IBaseResponseCallback> list;
        synchronized (HwWorkoutServiceAw70Manager.class) {
            list = sGetNotificationWorkoutRealTimeInfoCallbackList;
        }
        return list;
    }

    private static List<IBaseResponseCallback> getGetNotificationSportReminderCallbackList() {
        List<IBaseResponseCallback> list;
        synchronized (HwWorkoutServiceAw70Manager.class) {
            list = sGetNotificationSportReminderCallbackList;
        }
        return list;
    }

    private static List<IBaseResponseCallback> getGetNotificationGetWorkoutRecordStatisticCallbackList() {
        List<IBaseResponseCallback> list;
        synchronized (HwWorkoutServiceAw70Manager.class) {
            list = sGetNotificationGetWorkoutRecordStatisticCallbackList;
        }
        return list;
    }

    private static List<IBaseResponseCallback> getGetWorkoutOperatorRealTimeDataCallbackList() {
        return sGetWorkoutOperatorRealTimeDataCallbackList;
    }

    private static List<IBaseResponseCallback> getGetWorkoutRecordPaceMapListCallbackList() {
        List<IBaseResponseCallback> list;
        synchronized (HwWorkoutServiceAw70Manager.class) {
            list = sGetWorkoutRecordPaceMapListCallbackList;
        }
        return list;
    }

    private static List<IBaseResponseCallback> getWorkoutRecordSliceCallbackList() {
        List<IBaseResponseCallback> list;
        synchronized (HwWorkoutServiceAw70Manager.class) {
            list = sWorkoutRecordSliceCallbackList;
        }
        return list;
    }

    private static List<IBaseResponseCallback> getGetNotificationWorkoutRecordSpeechPlayCallbackList() {
        return sGetNotificationWorkoutRecordSpeechPlayCallbackList;
    }
}
