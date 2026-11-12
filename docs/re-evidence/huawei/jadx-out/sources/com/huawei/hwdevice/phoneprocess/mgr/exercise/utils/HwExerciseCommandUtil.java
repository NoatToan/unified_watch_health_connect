package com.huawei.hwdevice.phoneprocess.mgr.exercise.utils;

import android.text.TextUtils;
import androidx.media3.extractor.ts.TsExtractor;
import com.google.gson.Gson;
import com.huawei.datatype.DeviceCommand;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwWorkoutServiceManager;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.CommonSectionList;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.PaceIndexStruct;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.RunPlanInfo;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.RunPlanReminder;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.RunPlanStruct;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.TrainingStruct;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.WorkoutDataStruct;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.eeq;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class HwExerciseCommandUtil {
    private static final int ALL_F_ONE_BYTE = 255;
    private static final int CHILD_NODE_BASE = 128;
    private static final int INT_VALUE_ZERO = 0;
    private static final int MOVE_RIGHT_ONE_BYTE_BITS = 8;
    private static final int MOVE_RIGHT_THREE_BYTE_BITS = 24;
    private static final int MOVE_RIGHT_TWO_BYTE_BITS = 16;
    private static final String PARAM_END_TIME = "endTime";
    private static final String PARAM_ID = "id";
    private static final String PARAM_START_TIME = "startTime";
    private static final int PLACE_HOLDERS = 2;
    private static final int REALTIME_INFO_LENGTH = 3;
    private static final String SPORT_TYPE = "sport_type";
    private static final String TAG = "HwExerciseCommandUtil";
    private static final int TLV_TYPE_ONE_BYTE_OFFSET = 128;
    private static final int WORKOUT_RECORD_LIST_LENGTH = 12;
    private static final int WORKOUT_RECORD_STATISTIC_LENGTH = 4;
    private static DeviceInfo sDeviceInfo;

    private HwExerciseCommandUtil() {
    }

    public static DeviceCommand getRunPlanParameterCommand() {
        LogUtil.a(TAG, "Enter getRunPlanParameterCommand");
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(22);
        deviceCommand.setCommandID(1);
        String strB = eeq.b(0);
        String strD = eeq.d(129);
        StringBuilder sb = new StringBuilder();
        sb.append(strD);
        sb.append(strB);
        deviceCommand.setDataLen(sb.length() / 2);
        deviceCommand.setDataContent(eeq.c(sb.toString()));
        return deviceCommand;
    }

    public static DeviceCommand getSetRunPlanForHealthParam(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        RunPlanInfo runPlanInfo = (RunPlanInfo) new Gson().fromJson(jSONObject.getString("runPlanInfo"), RunPlanInfo.class);
        List<RunPlanStruct> runPlanStructList = runPlanInfo.getRunPlanStructList();
        LogUtil.a(TAG, "setRunPlanForHealth called", ", setRunPlanForHealth runPlanStructList is null = ", Boolean.valueOf(runPlanStructList == null));
        if (runPlanStructList == null) {
            return null;
        }
        DeviceCommand deviceCommand = new DeviceCommand();
        ArrayList arrayList = new ArrayList(16);
        for (int i = 0; i < runPlanStructList.size(); i++) {
            ArrayList arrayList2 = new ArrayList(16);
            setTrainingStructHexList(runPlanStructList, i, arrayList2);
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                sb.append((String) arrayList2.get(i2));
            }
            setRunPlanStructList(runPlanStructList, arrayList, i, sb);
        }
        String normalPlanValue = setNormalPlanValue(runPlanInfo, arrayList);
        String strB = eeq.b(normalPlanValue.length() / 2);
        String strD = eeq.d(129);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strD);
        sb2.append(strB);
        sb2.append(normalPlanValue);
        deviceCommand.setServiceID(22);
        deviceCommand.setCommandID(2);
        deviceCommand.setDataLen(sb2.length() / 2);
        deviceCommand.setDataContent(eeq.c(sb2.toString()));
        return deviceCommand;
    }

    private static String setNormalPlanValue(RunPlanInfo runPlanInfo, List<String> list) {
        String strB;
        String strA;
        String strB2;
        String runPlanSign = null;
        if (!TextUtils.isEmpty(runPlanInfo.getRunPlanTotalSign())) {
            strA = eeq.a(runPlanInfo.getRunPlanTotalSign());
            strB = eeq.b(strA.length() / 2);
        } else {
            strB = eeq.b(0);
            strA = null;
        }
        String strD = eeq.d(2);
        if (!TextUtils.isEmpty(runPlanInfo.getRunPlanSign())) {
            runPlanSign = runPlanInfo.getRunPlanSign();
            strB2 = eeq.b(runPlanSign.length() / 2);
        } else {
            strB2 = eeq.b(0);
        }
        String strD2 = eeq.d(3);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
        }
        String str = !TextUtils.isEmpty(strA) ? strD + strB + strA : strD + strB;
        String str2 = !TextUtils.isEmpty(runPlanSign) ? str + strD2 + strB2 + runPlanSign : str + strD2 + strB2;
        int runPlanStartDate = (int) (runPlanInfo.getRunPlanStartDate() / 1000);
        String str3 = eeq.d(runPlanStartDate >> 24) + eeq.d((runPlanStartDate >> 16) & 255) + eeq.d((runPlanStartDate >> 8) & 255) + eeq.d(runPlanStartDate & 255);
        return str2 + eeq.d(4) + eeq.b(str3.length() / 2) + str3 + sb.toString();
    }

    private static void setRunPlanStructList(List<RunPlanStruct> list, List<String> list2, int i, StringBuilder sb) {
        String strB = eeq.b(sb.length() / 2);
        String strD = eeq.d(139);
        String strA = eeq.a(list.get(i).getRunPlanName());
        String strB2 = eeq.b(strA.length() / 2);
        String strD2 = eeq.d(6);
        int runPlanDate = (int) (list.get(i).getRunPlanDate() / 1000);
        String str = eeq.d(runPlanDate >> 24) + eeq.d((runPlanDate >> 16) & 255) + eeq.d((runPlanDate >> 8) & 255) + eeq.d(runPlanDate & 255);
        String strB3 = eeq.b(str.length() / 2);
        String strD3 = eeq.d(7);
        String strC = eeq.c(list.get(i).getRunPlanWorkoutId());
        String strB4 = eeq.b(strC.length() / 2);
        String strD4 = eeq.d(18);
        String strD5 = eeq.d(list.get(i).getRunPlanTrainEffect());
        String strB5 = eeq.b(strD5.length() / 2);
        String strD6 = eeq.d(8);
        String strD7 = eeq.d(list.get(i).getRunPlanRepeats());
        String strB6 = eeq.b(strD7.length() / 2);
        String strD8 = eeq.d(9);
        String strC2 = eeq.c(list.get(i).getRunPlanDistance());
        String strB7 = eeq.b(strC2.length() / 2);
        String str2 = strD2 + strB2 + strA + strD3 + strB3 + str + strD6 + strB5 + strD5 + strD8 + strB6 + strD7 + eeq.d(10) + strB7 + strC2 + strD + strB + ((Object) sb) + strD4 + strB4 + strC;
        String strB8 = eeq.b(str2.length() / 2);
        list2.add(eeq.d(OldToNewMotionPath.SPORT_TYPE_VOLLEYBALL) + strB8 + str2);
    }

    private static void setTrainingStructHexList(List<RunPlanStruct> list, int i, List<String> list2) {
        List<TrainingStruct> trainingStructList = list.get(i).getTrainingStructList();
        if (trainingStructList != null) {
            int i2 = 0;
            while (i2 < trainingStructList.size()) {
                String strD = eeq.d(trainingStructList.get(i2).getTrainingType());
                String strB = eeq.b(strD.length() / 2);
                String strD2 = eeq.d(13);
                String str = eeq.d(trainingStructList.get(i2).getTrainingSpeedLimitHigh()) + eeq.d(trainingStructList.get(i2).getTrainingSpeedLimitLow());
                String strB2 = eeq.b(str.length() / 2);
                String strD3 = eeq.d(14);
                String str2 = eeq.d(trainingStructList.get(i2).getTrainingHrLimitHigh()) + eeq.d(trainingStructList.get(i2).getTrainingHrLimitLow());
                String strB3 = eeq.b(str2.length() / 2);
                String strD4 = eeq.d(15);
                String str3 = eeq.d(trainingStructList.get(i2).getTrainingIntensityLimitHigh()) + eeq.d(trainingStructList.get(i2).getTrainingIntensityLimitLow());
                String strB4 = eeq.b(str3.length() / 2);
                String strD5 = eeq.d(16);
                String strE = eeq.e(trainingStructList.get(i2).getTrainingDuration());
                String strB5 = eeq.b(strE.length() / 2);
                List<TrainingStruct> list3 = trainingStructList;
                addTrainingStructHexList(strD2 + strB + strD + strD3 + strB2 + str + strD4 + strB3 + str2 + strD5 + strB4 + str3 + eeq.d(17) + strB5 + strE, list2);
                i2++;
                trainingStructList = list3;
            }
        }
    }

    private static void addTrainingStructHexList(String str, List<String> list) {
        String strB = eeq.b(str.length() / 2);
        list.add(eeq.d(140) + strB + str);
    }

    public static DeviceCommand getRunPlanRecordInfoCommand(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(22);
        deviceCommand.setCommandID(5);
        String strE = eeq.e(jSONObject.getInt("id"));
        String strB = eeq.b(strE.length() / 2);
        String str = eeq.d(2) + strB + strE;
        String strB2 = eeq.b(str.length() / 2);
        String strD = eeq.d(129);
        StringBuilder sb = new StringBuilder();
        sb.append(strD);
        sb.append(strB2);
        sb.append(str);
        deviceCommand.setDataLen(sb.length() / 2);
        deviceCommand.setDataContent(eeq.c(sb.toString()));
        return deviceCommand;
    }

    public static DeviceCommand getRunPlanRecordCommand(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        LogUtil.a(TAG, "getRunPlanRecordCommand startTime:", Long.valueOf(jSONObject.getLong("startTime")), " endTime:", Long.valueOf(jSONObject.getLong("endTime")));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(22);
        deviceCommand.setCommandID(4);
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
        StringBuilder sb = new StringBuilder();
        sb.append(strD);
        sb.append(strB);
        sb.append(strD2);
        sb.append(strB2);
        sb.append(str);
        sb.append(strD3);
        sb.append(strB3);
        sb.append(str2);
        deviceCommand.setDataLen(sb.length() / 2);
        deviceCommand.setDataContent(eeq.c(sb.toString()));
        return deviceCommand;
    }

    public static DeviceCommand getRunPlanReminderSwitchCommand(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        DeviceCommand deviceCommand = new DeviceCommand();
        RunPlanReminder runPlanReminder = (RunPlanReminder) new Gson().fromJson(jSONObject.getString("runPlanReminder"), RunPlanReminder.class);
        deviceCommand.setServiceID(22);
        deviceCommand.setCommandID(3);
        String strD = eeq.d(runPlanReminder.getRunPlanReminderSwitch());
        String strB = eeq.b(strD.length() / 2);
        String strD2 = eeq.d(1);
        String str = eeq.d(runPlanReminder.getRunPlanReminderTimeHour()) + eeq.d(runPlanReminder.getRunPlanReminderTimeMinute());
        String strB2 = eeq.b(str.length() / 2);
        String strD3 = eeq.d(2);
        StringBuilder sb = new StringBuilder();
        sb.append(strD2);
        sb.append(strB);
        sb.append(strD);
        sb.append(strD3);
        sb.append(strB2);
        sb.append(str);
        deviceCommand.setDataLen(sb.length() / 2);
        deviceCommand.setDataContent(eeq.c(sb.toString()));
        return deviceCommand;
    }

    public static DeviceCommand getWorkoutRecordCommand(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            LogUtil.j(TAG, "getWorkoutRecordCommand, input parameters is illegal");
            return null;
        }
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(23);
        deviceCommand.setCommandID(7);
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
        deviceCommand.setDataLen(sb.length() / 2);
        deviceCommand.setDataContent(eeq.c(sb.toString()));
        return deviceCommand;
    }

    public static DeviceCommand notifyOperatorStatus(JSONObject jSONObject, DeviceInfo deviceInfo) throws JSONException {
        String strB;
        if (jSONObject == null) {
            LogUtil.j(TAG, "getOperatorStatus, input parameters is illegal");
            return null;
        }
        int i = jSONObject.has("version") ? 48 : 42;
        if (jSONObject.has("run_course_version")) {
            i += 6;
        }
        sDeviceInfo = deviceInfo;
        DeviceCapability singleDeviceCapability = HwExerciseDeviceUtil.getSingleDeviceCapability(deviceInfo);
        if (singleDeviceCapability != null && singleDeviceCapability.isSupportWorkoutCapabilicy()) {
            i += 6;
        }
        String strD = eeq.d(TsExtractor.TS_STREAM_TYPE_E_AC3);
        String strB2 = eeq.b(18);
        int length = i + strD.length() + 36 + strB2.length();
        if (jSONObject.getInt(SPORT_TYPE) == 2) {
            strB = eeq.b((length + 12) / 2);
        } else {
            strB = eeq.b(length / 2);
        }
        String strD2 = eeq.d(129);
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append(strD2);
        stringBuffer.append(strB);
        getOperatorStringTlv(stringBuffer, jSONObject, 36, strB2, strD);
        return getNotifyOperatorStatusCommand(stringBuffer, deviceInfo);
    }

    private static DeviceCommand getNotifyOperatorStatusCommand(StringBuffer stringBuffer, DeviceInfo deviceInfo) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(23);
        deviceCommand.setCommandID(1);
        deviceCommand.setDataLen(stringBuffer.length() / 2);
        deviceCommand.setDataContent(eeq.c(stringBuffer.toString()));
        deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        return deviceCommand;
    }

    private static void getOperatorStringTlv(StringBuffer stringBuffer, JSONObject jSONObject, int i, String str, String str2) throws JSONException {
        HwWorkoutServiceUtils.getOperatorTypeStringTlv(stringBuffer, jSONObject);
        HwWorkoutServiceUtils.getOperatorSportTypeStringTlv(stringBuffer, jSONObject);
        HwWorkoutServiceUtils.getOperatorRunPlanDateStringTlv(stringBuffer, jSONObject);
        HwWorkoutServiceUtils.getOperatorWorkoutTypeStringTlv(stringBuffer, jSONObject);
        HwWorkoutServiceUtils.getOperatorSonStructStringTlv(stringBuffer, jSONObject, i, str, str2);
        HwWorkoutServiceUtils.getOperatorVersionStringTlv(stringBuffer, jSONObject);
        HwWorkoutServiceUtils.getOperatorStartTimeStringTlv(stringBuffer, jSONObject);
        HwWorkoutServiceUtils.getOperatorRunCourseVersionStringTlv(stringBuffer, jSONObject);
        DeviceCapability singleDeviceCapability = HwExerciseDeviceUtil.getSingleDeviceCapability(sDeviceInfo);
        if (singleDeviceCapability == null || !singleDeviceCapability.isSupportWorkoutCapabilicy()) {
            return;
        }
        HwWorkoutServiceUtils.getOperatorForbidPauseStringTlv(stringBuffer, jSONObject);
    }

    public static DeviceCommand getOperatorStatus(DeviceInfo deviceInfo) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(23);
        deviceCommand.setCommandID(3);
        String strB = eeq.b(0);
        String strD = eeq.d(129);
        StringBuilder sb = new StringBuilder(16);
        sb.append(strD);
        sb.append(strB);
        deviceCommand.setDataLen(sb.length() / 2);
        deviceCommand.setDataContent(eeq.c(sb.toString()));
        deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        return deviceCommand;
    }

    public static DeviceCommand getWorkoutRealtimeInfo(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            LogUtil.j(TAG, "getWorkoutRealTimeInfo, input parameters is illegal");
            return null;
        }
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(23);
        deviceCommand.setCommandID(4);
        String strB = eeq.b(3);
        String strD = eeq.d(1);
        String strD2 = eeq.d(jSONObject.getInt(SPORT_TYPE));
        String strB2 = eeq.b(strD2.length() / 2);
        String strD3 = eeq.d(2);
        StringBuilder sb = new StringBuilder(16);
        sb.append(strD);
        sb.append(strB);
        sb.append(strD3);
        sb.append(strB2);
        sb.append(strD2);
        deviceCommand.setDataLen(sb.length() / 2);
        deviceCommand.setDataContent(eeq.c(sb.toString()));
        return deviceCommand;
    }

    public static DeviceCommand getWorkoutRecordStatistic(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            LogUtil.j(TAG, "getWorkoutRecordStatistic, input parameters is illegal");
            return null;
        }
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(23);
        deviceCommand.setCommandID(8);
        String strB = eeq.b(4);
        String strD = eeq.d(129);
        LogUtil.a(TAG, "get getWorkoutRecordStatistic id ");
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
        return deviceCommand;
    }

    public static DeviceCommand getWorkoutData(WorkoutDataStruct workoutDataStruct) throws JSONException {
        if (workoutDataStruct == null) {
            LogUtil.j(TAG, "getWorkoutData, input parameters is illegal");
            return null;
        }
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(23);
        deviceCommand.setCommandID(10);
        LogUtil.a(TAG, "getWorkoutData id, the parameters are ", workoutDataStruct.toString());
        String strE = eeq.e(workoutDataStruct.getWorkoutRecordId());
        String strB = eeq.b(strE.length() / 2);
        String strD = eeq.d(2);
        String strE2 = eeq.e(workoutDataStruct.getWorkoutDataIndex());
        String strB2 = eeq.b(strE.length() / 2);
        String strD2 = eeq.d(3);
        StringBuilder sb = new StringBuilder(16);
        sb.append(strD);
        sb.append(strB);
        sb.append(strE);
        sb.append(strD2);
        sb.append(strB2);
        sb.append(strE2);
        if (HwWorkoutServiceManager.getInstance().isSupportNewStep()) {
            handleNewStepCommand(sb);
        }
        sb.append(eeq.d(7));
        sb.append(eeq.d(0));
        sb.insert(0, eeq.b(sb.length() / 2)).insert(0, eeq.d(129));
        deviceCommand.setDataLen(sb.length() / 2);
        deviceCommand.setDataContent(eeq.c(sb.toString()));
        return deviceCommand;
    }

    private static void handleNewStepCommand(StringBuilder sb) {
        String strD = eeq.d(6);
        String strB = eeq.b(1);
        String strD2 = eeq.d(1);
        sb.append(strD);
        sb.append(strB);
        sb.append(strD2);
    }

    public static DeviceCommand getWorkoutCapability() {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(23);
        deviceCommand.setCommandID(21);
        String strB = eeq.b(0);
        String strD = eeq.d(1);
        StringBuilder sb = new StringBuilder(16);
        sb.append(strD);
        sb.append(strB);
        deviceCommand.setDataLen(sb.length() / 2);
        deviceCommand.setDataContent(eeq.c(sb.toString()));
        return deviceCommand;
    }

    public static DeviceCommand getSectionListDeviceCommand(JSONObject jSONObject) throws JSONException {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(23);
        deviceCommand.setCommandID(14);
        String strD = eeq.d(129);
        String strE = eeq.e(jSONObject.getInt("id"));
        String strB = eeq.b(strE.length() / 2);
        String strD2 = eeq.d(2);
        String strE2 = eeq.e(jSONObject.getInt("sectionIndex"));
        String strB2 = eeq.b(strE2.length() / 2);
        String strD3 = eeq.d(8);
        String strD4 = eeq.d((((((strE.length() + strB.length()) + strD2.length()) + strE2.length()) + strB2.length()) + strD3.length()) / 2);
        StringBuilder sb = new StringBuilder(16);
        sb.append(strD);
        sb.append(strD4);
        sb.append(strD2);
        sb.append(strB);
        sb.append(strE);
        sb.append(strD3);
        sb.append(strB2);
        sb.append(strE2);
        deviceCommand.setDataLen(sb.length() / 2);
        deviceCommand.setDataContent(eeq.c(sb.toString()));
        return deviceCommand;
    }

    public static DeviceCommand getNotificationResponseCommand(JSONObject jSONObject) throws JSONException {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(23);
        deviceCommand.setCommandID(2);
        String strC = eeq.c(jSONObject.getInt("notification_status_response"));
        String strD = eeq.d(strC.length() / 2);
        String strD2 = eeq.d(127);
        StringBuilder sb = new StringBuilder(16);
        sb.append(strD2);
        sb.append(strD);
        sb.append(strC);
        deviceCommand.setDataLen(sb.length() / 2);
        deviceCommand.setDataContent(eeq.c(sb.toString()));
        return deviceCommand;
    }

    public static DeviceCommand getWorkoutRecordPaceMapCommand(PaceIndexStruct paceIndexStruct) {
        String strD;
        String str;
        String strB;
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(23);
        deviceCommand.setCommandID(12);
        String strD2 = eeq.d(129);
        String strB2 = eeq.b(4);
        String strE = eeq.e(paceIndexStruct.getRecordId());
        if (paceIndexStruct.getPaceIndex() < 0) {
            strD = "";
            str = "";
            strB = str;
        } else {
            String strB3 = eeq.b(8);
            String strE2 = eeq.e(paceIndexStruct.getPaceIndex());
            strB = eeq.b(strE2.length() / 2);
            strD = eeq.d(8);
            strB2 = strB3;
            str = strE2;
        }
        StringBuilder sb = new StringBuilder(16);
        sb.append(strD2);
        String strB4 = eeq.b(strE.length() / 2);
        String strD3 = eeq.d(2);
        sb.append(strB2);
        sb.append(strD3);
        sb.append(strB4);
        sb.append(strE);
        if (paceIndexStruct.getPaceIndex() >= 0) {
            sb.append(strD);
            sb.append(strB);
            sb.append(str);
        }
        deviceCommand.setDataLen(sb.length() / 2);
        deviceCommand.setDataContent(eeq.c(sb.toString()));
        return deviceCommand;
    }

    public static DeviceCommand getWorkoutRecordSpeechPlayReportCommand() {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(23);
        deviceCommand.setCommandID(13);
        String strD = eeq.d(1);
        String strB = eeq.b(1);
        String strD2 = eeq.d(2);
        StringBuilder sb = new StringBuilder(16);
        sb.append(strD2);
        sb.append(strB);
        sb.append(strD);
        deviceCommand.setDataLen(sb.length() / 2);
        deviceCommand.setDataContent(eeq.c(sb.toString()));
        return deviceCommand;
    }

    public static DeviceCommand getCommonSectionListCommand(CommonSectionList commonSectionList) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(23);
        deviceCommand.setCommandID(22);
        String strE = eeq.e(commonSectionList.getWorkoutRecordId());
        String strB = eeq.b(strE.length() / 2);
        String strD = eeq.d(1);
        String strE2 = eeq.e(commonSectionList.getSectionIndex());
        String strB2 = eeq.b(strE2.length() / 2);
        String strD2 = eeq.d(2);
        StringBuilder sb = new StringBuilder(16);
        sb.append(strD);
        sb.append(strB);
        sb.append(strE);
        sb.append(strD2);
        sb.append(strB2);
        sb.append(strE2);
        deviceCommand.setDataLen(sb.length() / 2);
        deviceCommand.setDataContent(eeq.c(sb.toString()));
        return deviceCommand;
    }
}
