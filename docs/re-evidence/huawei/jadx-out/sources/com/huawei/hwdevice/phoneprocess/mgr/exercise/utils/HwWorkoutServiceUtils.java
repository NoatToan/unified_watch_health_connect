package com.huawei.hwdevice.phoneprocess.mgr.exercise.utils;

import android.os.Bundle;
import androidx.media3.extractor.ts.TsExtractor;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.CommonSectionInfo;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.StatisticExtendDataStruct;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.TriathlonStruct;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.WorkoutDataInfo;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.WorkoutRecordPaceMap;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.WorkoutRecordStatistic;
import com.huawei.hwfoundationmodel.trackmodel.HeartRateData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsportmodel.GolfShotTrack;
import defpackage.cqi;
import defpackage.cqk;
import defpackage.eeq;
import defpackage.ees;
import defpackage.eew;
import defpackage.gzt;
import defpackage.njw;
import health.compact.a.CommonUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class HwWorkoutServiceUtils {
    private static final int ARRAY_LIST_DEFAULT_SIZE = 12;
    private static final int FIX_HIDE_CODE = 255;
    public static final String HEART_RATE_LIST = "HeartRateList";
    public static final int HEART_RATE_TRUST_VALUE = 254;
    private static final int INT_VALUE_ZERO = 0;
    private static final int INVALID_HEART_RATE_INDEX = -1;
    public static final String INVALID_HEART_RATE_LIST = "InvalidHeartRateList";
    private static final int LINK_HAS_DETAIL_TAG = 1;
    private static final int METER_TURN_METERS = 10;
    private static final int MILL_SECOND_TO_SECOND = 1000;
    private static final int MOVE_RIGHT_ONE_BYTE_BITS = 8;
    private static final int MOVE_RIGHT_THREE_BYTE_BITS = 24;
    private static final int MOVE_RIGHT_TWO_BYTE_BITS = 16;
    private static final String OPERATOR_TYPE = "operator_type";
    private static final long REVERSE_MASK_CODE = -1;
    private static final String RUN_PLAN_DATE = "run_plan_date";
    private static final String SPORT_TYPE = "sport_type";
    private static final String TAG = "HwWorkoutServiceUtils";
    private static final String TAG_RELEASE = "BTSYNC_HwWorkoutServiceUtils";
    private static final int WORKOUT_RELATION_TYPE_DEFAULT = 0;

    private static int transSportType(int i) {
        if (i == 137) {
            return i;
        }
        if (i == 257) {
            return 2;
        }
        if (i == 259) {
            return 3;
        }
        if (i == 279) {
            return 255;
        }
        if (i == 264) {
            return 5;
        }
        if (i == 265) {
            return 7;
        }
        if (i == 273) {
            return 134;
        }
        if (i != 274) {
            return 1;
        }
        return TsExtractor.TS_STREAM_TYPE_E_AC3;
    }

    private HwWorkoutServiceUtils() {
    }

    public static StringBuffer getOperatorTypeStringTlv(StringBuffer stringBuffer, JSONObject jSONObject) throws JSONException {
        if (stringBuffer != null && jSONObject != null) {
            String strD = eeq.d(jSONObject.getInt(OPERATOR_TYPE));
            String strB = eeq.b(strD.length() / 2);
            stringBuffer.append(eeq.d(2));
            stringBuffer.append(strB);
            stringBuffer.append(strD);
        }
        return stringBuffer;
    }

    public static StringBuffer getOperatorSportTypeStringTlv(StringBuffer stringBuffer, JSONObject jSONObject) throws JSONException {
        if (stringBuffer != null && jSONObject != null) {
            String strD = eeq.d(jSONObject.getInt(SPORT_TYPE));
            String strB = eeq.b(strD.length() / 2);
            stringBuffer.append(eeq.d(3));
            stringBuffer.append(strB);
            stringBuffer.append(strD);
        }
        return stringBuffer;
    }

    public static StringBuffer getOperatorRunPlanDateStringTlv(StringBuffer stringBuffer, JSONObject jSONObject) throws JSONException {
        if (stringBuffer != null && jSONObject != null) {
            int i = jSONObject.has(RUN_PLAN_DATE) ? (int) (jSONObject.getLong(RUN_PLAN_DATE) / 1000) : 0;
            String str = eeq.d(i >> 24) + eeq.d((i >> 16) & 255) + eeq.d((i >> 8) & 255) + eeq.d(i & 255);
            String strB = eeq.b(str.length() / 2);
            String strD = eeq.d(4);
            if (jSONObject.getInt(SPORT_TYPE) == 2) {
                stringBuffer.append(strD);
                stringBuffer.append(strB);
                stringBuffer.append(str);
            }
        }
        return stringBuffer;
    }

    public static StringBuffer getOperatorWorkoutTypeStringTlv(StringBuffer stringBuffer, JSONObject jSONObject) throws JSONException {
        if (stringBuffer != null && jSONObject != null) {
            String strD = eeq.d(transSportType(jSONObject.has(HwExerciseConstants.JSON_NAME_WORKOUT_TYPE) ? jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_TYPE) : 258));
            String strB = eeq.b(strD.length() / 2);
            stringBuffer.append(eeq.d(5));
            stringBuffer.append(strB);
            stringBuffer.append(strD);
        }
        return stringBuffer;
    }

    private static StringBuffer getOperationTimeValueHex(StringBuffer stringBuffer, JSONObject jSONObject) throws JSONException {
        if (stringBuffer != null && jSONObject != null) {
            int i = (int) (jSONObject.getLong("operation_time") / 1000);
            String str = eeq.d(i >> 24) + eeq.d((i >> 16) & 255) + eeq.d((i >> 8) & 255) + eeq.d(i & 255);
            String strB = eeq.b(str.length() / 2);
            stringBuffer.append(eeq.d(6));
            stringBuffer.append(strB);
            stringBuffer.append(str);
        }
        return stringBuffer;
    }

    public static StringBuffer getOperatorSonStructStringTlv(StringBuffer stringBuffer, JSONObject jSONObject, int i, String str, String str2) throws JSONException {
        if (stringBuffer != null && jSONObject != null && str != null && str2 != null) {
            stringBuffer = getOperationTimeValueHex(stringBuffer, jSONObject);
            if (i != 0) {
                stringBuffer.append(str2);
                stringBuffer.append(str);
                String strC = eeq.c(jSONObject.has("distance") ? jSONObject.getInt("distance") : 0);
                String strB = eeq.b(strC.length() / 2);
                stringBuffer.append(eeq.d(8));
                stringBuffer.append(strB);
                stringBuffer.append(strC);
                String strC2 = eeq.c(jSONObject.has("calorie") ? jSONObject.getInt("calorie") : 0);
                String strB2 = eeq.b(strC2.length() / 2);
                stringBuffer.append(eeq.d(9));
                stringBuffer.append(strB2);
                stringBuffer.append(strC2);
                String strC3 = eeq.c(jSONObject.has("duration") ? jSONObject.getInt("duration") : 0);
                String strB3 = eeq.b(strC3.length() / 2);
                stringBuffer.append(eeq.d(10));
                stringBuffer.append(strB3);
                stringBuffer.append(strC3);
            }
        }
        return stringBuffer;
    }

    public static StringBuffer getOperatorVersionStringTlv(StringBuffer stringBuffer, JSONObject jSONObject) throws JSONException {
        if (stringBuffer != null && jSONObject != null) {
            String strD = eeq.d(jSONObject.has("version") ? jSONObject.getInt("version") : 0);
            String strB = eeq.b(strD.length() / 2);
            String strD2 = eeq.d(11);
            if (jSONObject.has("version")) {
                stringBuffer.append(strD2);
                stringBuffer.append(strB);
                stringBuffer.append(strD);
            }
        }
        return stringBuffer;
    }

    public static StringBuffer getOperatorStartTimeStringTlv(StringBuffer stringBuffer, JSONObject jSONObject) throws JSONException {
        if (stringBuffer != null && jSONObject != null) {
            int i = jSONObject.has("start_time") ? (int) (jSONObject.getLong("start_time") / 1000) : 0;
            String str = eeq.d(i >> 24) + eeq.d((i >> 16) & 255) + eeq.d((i >> 8) & 255) + eeq.d(i & 255);
            String strB = eeq.b(str.length() / 2);
            stringBuffer.append(eeq.d(12));
            stringBuffer.append(strB);
            stringBuffer.append(str);
            LogUtil.a(TAG, "5.23.1 :", stringBuffer.toString());
        }
        return stringBuffer;
    }

    public static StringBuffer getOperatorRunCourseVersionStringTlv(StringBuffer stringBuffer, JSONObject jSONObject) throws JSONException {
        if (stringBuffer != null && jSONObject != null) {
            String strD = eeq.d(jSONObject.has("run_course_version") ? jSONObject.getInt("run_course_version") : 0);
            String strB = eeq.b(strD.length() / 2);
            String strD2 = eeq.d(13);
            if (jSONObject.has("run_course_version")) {
                stringBuffer.append(strD2);
                stringBuffer.append(strB);
                stringBuffer.append(strD);
            }
        }
        return stringBuffer;
    }

    public static StringBuffer getOperatorForbidPauseStringTlv(StringBuffer stringBuffer, JSONObject jSONObject) throws JSONException {
        if (stringBuffer != null && jSONObject != null) {
            String strD = eeq.d(jSONObject.has("forbid_pause") ? jSONObject.getInt("forbid_pause") : 0);
            String strB = eeq.b(strD.length() / 2);
            stringBuffer.append(eeq.d(14));
            stringBuffer.append(strB);
            stringBuffer.append(strD);
        }
        return stringBuffer;
    }

    private static void getWorkoutAvgSpeed(int i, StringBuffer stringBuffer) {
        if (stringBuffer == null) {
            return;
        }
        String strE = eeq.e(i);
        String strB = eeq.b(strE.length() / 2);
        stringBuffer.append(eeq.d(8));
        stringBuffer.append(strB);
        stringBuffer.append(strE);
    }

    public static void getWorkoutStringTlvIncludeDistance(StringBuffer stringBuffer, JSONObject jSONObject) throws JSONException {
        if (stringBuffer == null || jSONObject == null) {
            return;
        }
        String strC = eeq.c(jSONObject.getInt("exercise_duration"));
        String strB = eeq.b(strC.length() / 2);
        stringBuffer.append(eeq.d(2));
        stringBuffer.append(strB);
        stringBuffer.append(strC);
        String strC2 = eeq.c(jSONObject.getInt("distance") * 10);
        String strB2 = eeq.b(strC2.length() / 2);
        stringBuffer.append(eeq.d(3));
        stringBuffer.append(strB2);
        stringBuffer.append(strC2);
        String strC3 = eeq.c(jSONObject.getInt("calorie"));
        String strB3 = eeq.b(strC3.length() / 2);
        stringBuffer.append(eeq.d(4));
        stringBuffer.append(strB3);
        stringBuffer.append(strC3);
        String strE = eeq.e(jSONObject.getInt("speed"));
        String strB4 = eeq.b(strE.length() / 2);
        stringBuffer.append(eeq.d(5));
        stringBuffer.append(strB4);
        stringBuffer.append(strE);
        String strD = eeq.d(jSONObject.has("hr") ? jSONObject.getInt("hr") : 0);
        String strB5 = eeq.b(strD.length() / 2);
        stringBuffer.append(eeq.d(7));
        stringBuffer.append(strB5);
        stringBuffer.append(strD);
        getWorkoutAvgSpeed(jSONObject.has("avg_speed") ? jSONObject.getInt("avg_speed") : 0, stringBuffer);
    }

    public static void getWorkoutStringTlvIncludeAvgPace(StringBuffer stringBuffer, JSONObject jSONObject) throws JSONException {
        if (stringBuffer == null || jSONObject == null) {
            return;
        }
        String strE = eeq.e(jSONObject.has("avg_pace") ? jSONObject.getInt("avg_pace") : 0);
        String strB = eeq.b(strE.length() / 2);
        stringBuffer.append(eeq.d(9));
        stringBuffer.append(strB);
        stringBuffer.append(strE);
        String strC = eeq.c(jSONObject.has("total_rise") ? jSONObject.getInt("total_rise") : 0);
        String strB2 = eeq.b(strC.length() / 2);
        stringBuffer.append(eeq.d(10));
        stringBuffer.append(strB2);
        stringBuffer.append(strC);
        String strC2 = eeq.c(jSONObject.has("total_descend") ? jSONObject.getInt("total_descend") : 0);
        String strB3 = eeq.b(strC2.length() / 2);
        stringBuffer.append(eeq.d(11));
        stringBuffer.append(strB3);
        stringBuffer.append(strC2);
        String strC3 = eeq.c(jSONObject.has("altitude") ? jSONObject.getInt("altitude") : 0);
        String strB4 = eeq.b(strC3.length() / 2);
        stringBuffer.append(eeq.d(12));
        stringBuffer.append(strB4);
        stringBuffer.append(strC3);
    }

    public static void getWorkoutStringTlvIncludeAerobicTrainEffect(StringBuffer stringBuffer, JSONObject jSONObject) throws JSONException {
        if (stringBuffer == null || jSONObject == null) {
            return;
        }
        String strD = eeq.d(jSONObject.has("aerobic_te") ? jSONObject.getInt("aerobic_te") : 0);
        String strB = eeq.b(strD.length() / 2);
        stringBuffer.append(eeq.d(13));
        stringBuffer.append(strB);
        stringBuffer.append(strD);
        String strD2 = eeq.d(jSONObject.has("anaerobic_te") ? jSONObject.getInt("anaerobic_te") : 0);
        String strB2 = eeq.b(strD2.length() / 2);
        stringBuffer.append(eeq.d(14));
        stringBuffer.append(strB2);
        stringBuffer.append(strD2);
        String strD3 = eeq.d(jSONObject.has("performance_condition") ? jSONObject.getInt("performance_condition") : 0);
        String strB3 = eeq.b(strD3.length() / 2);
        stringBuffer.append(eeq.d(15));
        stringBuffer.append(strB3);
        stringBuffer.append(strD3);
        String strD4 = eeq.d(jSONObject.has(OPERATOR_TYPE) ? jSONObject.getInt(OPERATOR_TYPE) : 0);
        String strB4 = eeq.b(strD4.length() / 2);
        stringBuffer.append(eeq.d(16));
        stringBuffer.append(strB4);
        stringBuffer.append(strD4);
    }

    public static void getWorkoutStringTlvIncludeRunningAction(StringBuffer stringBuffer, JSONObject jSONObject) throws JSONException {
        String string;
        if (stringBuffer == null || jSONObject == null) {
            return;
        }
        String strD = eeq.d(jSONObject.has("running_course_number") ? jSONObject.getInt("running_course_number") : 0);
        String strB = eeq.b(strD.length() / 2);
        stringBuffer.append(eeq.d(17));
        stringBuffer.append(strB);
        stringBuffer.append(strD);
        String strD2 = eeq.d(jSONObject.has("running_course_action_count") ? jSONObject.getInt("running_course_action_count") : 0);
        String strB2 = eeq.b(strD2.length() / 2);
        stringBuffer.append(eeq.d(18));
        stringBuffer.append(strB2);
        stringBuffer.append(strD2);
        if (!jSONObject.has("running_course_action_id")) {
            string = "";
        } else {
            string = jSONObject.getString("running_course_action_id");
        }
        String strA = eeq.a(string);
        String strB3 = eeq.b(strA.length() / 2);
        stringBuffer.append(eeq.d(19));
        stringBuffer.append(strB3);
        stringBuffer.append(strA);
    }

    public static void getWorkoutFifthPartStringTlvIncludeRunningCourse(StringBuffer stringBuffer, JSONObject jSONObject) throws JSONException {
        if (stringBuffer == null || jSONObject == null) {
            return;
        }
        String strD = eeq.d(jSONObject.has("running_course_left_type") ? jSONObject.getInt("running_course_left_type") : 0);
        String strB = eeq.b(strD.length() / 2);
        stringBuffer.append(eeq.d(20));
        stringBuffer.append(strB);
        stringBuffer.append(strD);
    }

    public static void getWorkoutStringTlvIncludeRunningCourseContent(StringBuffer stringBuffer, JSONObject jSONObject) throws JSONException {
        if (stringBuffer == null || jSONObject == null) {
            return;
        }
        String strC = eeq.c(jSONObject.has("running_course_content") ? jSONObject.getInt("running_course_content") : 0);
        String strB = eeq.b(strC.length() / 2);
        stringBuffer.append(eeq.d(21));
        stringBuffer.append(strB);
        stringBuffer.append(strC);
        String strE = eeq.e(jSONObject.has("step_cadence") ? jSONObject.getInt("step_cadence") : 0);
        String strB2 = eeq.b(strE.length() / 2);
        stringBuffer.append(eeq.d(22));
        stringBuffer.append(strB2);
        stringBuffer.append(strE);
        String strC2 = eeq.c(jSONObject.has("step") ? jSONObject.getInt("step") : 0);
        String strB3 = eeq.b(strC2.length() / 2);
        stringBuffer.append(eeq.d(23));
        stringBuffer.append(strB3);
        stringBuffer.append(strC2);
        if (jSONObject.has("pace")) {
            String strE2 = eeq.e(jSONObject.getInt("pace"));
            String strB4 = eeq.b(strE2.length() / 2);
            stringBuffer.append(eeq.d(6));
            stringBuffer.append(strB4);
            stringBuffer.append(strE2);
        }
    }

    public static void getWorkoutStringTlvIncludeNewSpeed(StringBuffer stringBuffer, JSONObject jSONObject) throws JSONException {
        if (stringBuffer == null || jSONObject == null) {
            LogUtil.j(TAG, "getWorkoutStringTlvIncludeNewSpeed, input parameters is illegal");
            return;
        }
        String strE = eeq.e(jSONObject.has("speed_new") ? jSONObject.getInt("speed_new") : 0);
        String strB = eeq.b(strE.length() / 2);
        stringBuffer.append(eeq.d(24));
        stringBuffer.append(strB);
        stringBuffer.append(strE);
        String strE2 = eeq.e(jSONObject.has("avg_speed_new") ? jSONObject.getInt("avg_speed_new") : 0);
        String strB2 = eeq.b(strE2.length() / 2);
        stringBuffer.append(eeq.d(25));
        stringBuffer.append(strB2);
        stringBuffer.append(strE2);
    }

    public static void getWorkoutStringTlvIncludeEquipmentLinkage(StringBuffer stringBuffer, JSONObject jSONObject) throws JSONException {
        if (stringBuffer == null || jSONObject == null) {
            LogUtil.j(TAG, "getWorkoutStringTlvIncludeNewSpeed, input parameters is illegal");
            return;
        }
        if (jSONObject.has("linkage_cadence")) {
            String strE = eeq.e(jSONObject.getInt("linkage_cadence"));
            String strB = eeq.b(strE.length() / 2);
            stringBuffer.append(eeq.d(26));
            stringBuffer.append(strB);
            stringBuffer.append(strE);
        }
        if (jSONObject.has("linkage_pulp_frequency")) {
            String strE2 = eeq.e(jSONObject.getInt("linkage_pulp_frequency"));
            String strB2 = eeq.b(strE2.length() / 2);
            stringBuffer.append(eeq.d(27));
            stringBuffer.append(strB2);
            stringBuffer.append(strE2);
        }
        if (jSONObject.has("linkage_slurry")) {
            String strC = eeq.c(jSONObject.getInt("linkage_slurry"));
            String strB3 = eeq.b(strC.length() / 2);
            stringBuffer.append(eeq.d(28));
            stringBuffer.append(strB3);
            stringBuffer.append(strC);
        }
        if (jSONObject.has("linkage_power")) {
            String strE3 = eeq.e(jSONObject.getInt("linkage_power"));
            String strB4 = eeq.b(strE3.length() / 2);
            stringBuffer.append(eeq.d(29));
            stringBuffer.append(strB4);
            stringBuffer.append(strE3);
        }
        includeEquipmentLinkage(stringBuffer, jSONObject);
    }

    private static void includeEquipmentLinkage(StringBuffer stringBuffer, JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("linkage_resistance_level")) {
            String strD = eeq.d(jSONObject.getInt("linkage_resistance_level"));
            String strB = eeq.b(strD.length() / 2);
            stringBuffer.append(eeq.d(30));
            stringBuffer.append(strB);
            stringBuffer.append(strD);
        }
        if (jSONObject.has("linkage_resistance_level_max")) {
            String strD2 = eeq.d(jSONObject.getInt("linkage_resistance_level_max"));
            String strB2 = eeq.b(strD2.length() / 2);
            stringBuffer.append(eeq.d(31));
            stringBuffer.append(strB2);
            stringBuffer.append(strD2);
        }
        if (jSONObject.has("linkage_resistance_level_min")) {
            String strD3 = eeq.d(jSONObject.getInt("linkage_resistance_level_min"));
            String strB3 = eeq.b(strD3.length() / 2);
            stringBuffer.append(eeq.d(32));
            stringBuffer.append(strB3);
            stringBuffer.append(strD3);
        }
    }

    public static void parseRunPostureDataInfo(List<String> list, WorkoutDataInfo workoutDataInfo) {
        if (list == null || workoutDataInfo == null) {
            LogUtil.j(TAG, "parseRunPostureDataInfo, input parameters is illegal");
            return;
        }
        LogUtil.a(TAG, "parseRunPostureDataInfo enter");
        StringBuilder sb = new StringBuilder(getFirstValueFromList(list));
        list.remove(0);
        sb.append(getFirstValueFromList(list));
        list.remove(0);
        LogUtil.d(TAG, "parseRunPostureDataInfo setCadence info:", sb);
        gzt gztVar = new gzt();
        gztVar.b(CommonUtil.v(sb.toString()));
        sb.setLength(0);
        sb.append(getFirstValueFromList(list));
        list.remove(0);
        sb.append(getFirstValueFromList(list));
        list.remove(0);
        LogUtil.d(TAG, "parseRunPostureDataInfo setStepLength info:", sb);
        gztVar.j(CommonUtil.v(sb.toString()));
        sb.setLength(0);
        sb.append(getFirstValueFromList(list));
        list.remove(0);
        sb.append(getFirstValueFromList(list));
        list.remove(0);
        LogUtil.d(TAG, "parseRunPostureDataInfo setGroundContactTime info:", sb);
        gztVar.a(CommonUtil.v(sb.toString()));
        sb.setLength(0);
        sb.append(getFirstValueFromList(list));
        list.remove(0);
        LogUtil.d(TAG, "parseRunPostureDataInfo setGroundImpactAcceleration info:", sb);
        gztVar.c(CommonUtil.v(sb.toString()));
        parseOtherRunPostureDataInfo(list, sb, gztVar);
        sb.setLength(0);
        sb.append(getFirstValueFromList(list));
        LogUtil.d(TAG, "parseRunPostureDataInfo setEversionExcursion info:", sb);
        gztVar.d(CommonUtil.v(sb.toString()));
        LogUtil.d(TAG, "parseRunPostureDataInfo runPostureDataInfo:", gztVar);
        workoutDataInfo.setRunPostureDataInfo(gztVar);
    }

    private static void parseOtherRunPostureDataInfo(List<String> list, StringBuilder sb, gzt gztVar) {
        sb.setLength(0);
        sb.append(getFirstValueFromList(list));
        list.remove(0);
        sb.append(getFirstValueFromList(list));
        list.remove(0);
        LogUtil.d(TAG, "parseRunPostureDataInfo setSwingAngle info:", sb);
        gztVar.k(CommonUtil.v(sb.toString()));
        sb.setLength(0);
        sb.append(getFirstValueFromList(list));
        list.remove(0);
        LogUtil.d(TAG, "parseRunPostureDataInfo setForeFootStrikePattern info:", sb);
        gztVar.e(CommonUtil.v(sb.toString()));
        sb.setLength(0);
        sb.append(getFirstValueFromList(list));
        list.remove(0);
        LogUtil.d(TAG, "parseRunPostureDataInfo setWholeFootStrikePattern info:", sb);
        gztVar.o(CommonUtil.v(sb.toString()));
        sb.setLength(0);
        sb.append(getFirstValueFromList(list));
        list.remove(0);
        LogUtil.d(TAG, "parseRunPostureDataInfo setHindPawStrikePattern info:", sb);
        gztVar.f(CommonUtil.v(sb.toString()));
    }

    public static void dealTriathlon(cqk cqkVar, WorkoutRecordStatistic workoutRecordStatistic) {
        if (cqkVar == null || workoutRecordStatistic == null) {
            LogUtil.j(TAG, "dealTriathlon, input parameters is illegal");
            return;
        }
        List<cqk> listC = cqkVar.c();
        ArrayList arrayList = new ArrayList(12);
        Iterator<cqk> it = listC.iterator();
        while (it.hasNext()) {
            List<cqi> listD = it.next().d();
            TriathlonStruct triathlonStruct = new TriathlonStruct();
            for (cqi cqiVar : listD) {
                try {
                    switch (cqiVar.c()) {
                        case 40:
                            triathlonStruct.setWorkoutRelationType(eeq.a(cqiVar.d(), 0));
                            break;
                        case 41:
                            triathlonStruct.setWorkoutLinkDetailsType(eeq.a(cqiVar.d(), 0));
                            break;
                        case 42:
                            triathlonStruct.setWorkoutLinkDetailsStartTime(eeq.a(cqiVar.d(), 0));
                            break;
                        case 43:
                            triathlonStruct.setWorkoutLinkDetailsEndTime(eeq.a(cqiVar.d(), 0));
                            break;
                        case 44:
                            triathlonStruct.setWorkoutLinkDetailsTotalTime(eeq.a(cqiVar.d(), 0));
                            break;
                        default:
                            parseOtherTriathlonInfo(cqiVar, triathlonStruct);
                            break;
                    }
                } catch (NumberFormatException e) {
                    LogUtil.e(TAG, e.getMessage());
                }
            }
            if (triathlonStruct.getWorkoutRelationType() != 0) {
                arrayList.add(triathlonStruct);
            }
        }
        if (arrayList.size() != 0) {
            workoutRecordStatistic.setTriathlonStructList(arrayList);
        }
    }

    private static void parseOtherTriathlonInfo(cqi cqiVar, TriathlonStruct triathlonStruct) throws NumberFormatException {
        switch (cqiVar.c()) {
            case 45:
                triathlonStruct.setWorkoutLinkDetailsDistance(eeq.a(cqiVar.d(), 0));
                break;
            case 46:
                triathlonStruct.setWorkoutLinkDetailsCalorie(eeq.a(cqiVar.d(), 0) * 1000);
                break;
            case 47:
                triathlonStruct.setWorkoutLinkTransitionTime(eeq.a(cqiVar.d(), 0));
                break;
            case 48:
                triathlonStruct.setWorkoutLinkHasDetail(eeq.a(cqiVar.d(), 0) == 1);
                break;
            default:
                LogUtil.d(TAG, "parseOtherTriathlonInfo, this type not support parse.");
                break;
        }
    }

    public static void parsePaceMapDataStruct(ees eesVar, WorkoutRecordPaceMap workoutRecordPaceMap) {
        for (eew eewVar : eesVar.e()) {
            int iV = CommonUtil.v(eewVar.e());
            if (iV == 4) {
                workoutRecordPaceMap.setDistance(CommonUtil.v(eewVar.b()));
            } else if (iV == 5) {
                workoutRecordPaceMap.setUnitType(CommonUtil.v(eewVar.b()));
            } else if (iV == 6) {
                workoutRecordPaceMap.setPace((int) Long.parseLong(eewVar.b(), 16));
            } else if (iV == 7) {
                workoutRecordPaceMap.setPointIndex(CommonUtil.v(eewVar.b()));
            } else if (iV == 9) {
                workoutRecordPaceMap.setLastLessDistance(CommonUtil.v(eewVar.b()));
                workoutRecordPaceMap.setIsLastLessDistance(true);
            } else {
                LogUtil.j(TAG, "parsePaceMapDataStruct tlvChild parse else");
            }
        }
    }

    public static void parseSwimSectionDataStruct(ees eesVar, Bundle bundle) {
        for (eew eewVar : eesVar.e()) {
            switch (CommonUtil.v(eewVar.e())) {
                case 4:
                    bundle.putInt("distance", CommonUtil.v(eewVar.b()));
                    break;
                case 5:
                    bundle.putInt("unit", CommonUtil.v(eewVar.b()));
                    break;
                case 6:
                    bundle.putLong("pace", CommonUtil.x(eewVar.b()));
                    break;
                case 7:
                    bundle.putInt(HwExerciseConstants.JSON_NAME_POINT_INDEX, CommonUtil.v(eewVar.b()));
                    break;
                case 8:
                default:
                    LogUtil.j(TAG, "parseSwimSectionDataStruct tlvChild parse else");
                    break;
                case 9:
                    bundle.putInt(HwExerciseConstants.JSON_NAME_SECTION_NUM, CommonUtil.v(eewVar.b()));
                    break;
                case 10:
                    bundle.putInt(HwExerciseConstants.JSON_NAME_SWIM_TYPE, CommonUtil.v(eewVar.b()));
                    break;
                case 11:
                    bundle.putInt(HwExerciseConstants.JSON_NAME_SWIM_PULL_TIMES, CommonUtil.v(eewVar.b()));
                    break;
                case 12:
                    bundle.putInt(HwExerciseConstants.JSON_NAME_SWIM_AVG_SWOLF, CommonUtil.v(eewVar.b()));
                    break;
                case 13:
                    bundle.putLong(HwExerciseConstants.JSON_NAME_SWIM_TIME, CommonUtil.x(eewVar.b()));
                    break;
            }
        }
    }

    public static void parseWorkoutReportPlayData(List<eew> list, njw njwVar) {
        for (eew eewVar : list) {
            switch (CommonUtil.v(eewVar.e())) {
                case 2:
                    njwVar.a(CommonUtil.x(eewVar.b()) * 1000);
                    break;
                case 3:
                    njwVar.o(CommonUtil.v(eewVar.b()));
                    break;
                case 4:
                    njwVar.n(CommonUtil.v(eewVar.b()));
                    break;
                case 5:
                    njwVar.w(CommonUtil.v(eewVar.b()));
                    break;
                case 6:
                    njwVar.f(CommonUtil.v(eewVar.b()));
                    break;
                case 7:
                    njwVar.b(CommonUtil.v(eewVar.b()));
                    break;
                case 8:
                    njwVar.e(CommonUtil.x(eewVar.b()) * 10);
                    break;
                case 9:
                    njwVar.l(CommonUtil.v(eewVar.b()));
                    break;
                case 10:
                    njwVar.ad(CommonUtil.v(eewVar.b()));
                    break;
                default:
                    parseWorkoutReportPlayDataElse(eewVar, njwVar);
                    break;
            }
        }
    }

    private static void parseWorkoutReportPlayDataElse(eew eewVar, njw njwVar) {
        switch (CommonUtil.v(eewVar.e())) {
            case 11:
                njwVar.x(CommonUtil.v(eewVar.b()));
                break;
            case 12:
                njwVar.v((int) CommonUtil.x(eewVar.b()));
                break;
            case 13:
                njwVar.c(CommonUtil.v(eewVar.b()));
                break;
            case 14:
                njwVar.d(CommonUtil.v(eewVar.b()));
                break;
            case 15:
                njwVar.s(CommonUtil.v(eewVar.b()));
                break;
            case 16:
                njwVar.c(CommonUtil.x(eewVar.b()) * 1000);
                break;
            case 17:
                njwVar.q(CommonUtil.b(eewVar.b(), 10));
                break;
            case 18:
                njwVar.d(CommonUtil.x(eewVar.b()));
                break;
            case 19:
                njwVar.b(CommonUtil.v(eewVar.b()));
                break;
            case 20:
                njwVar.a(CommonUtil.v(eewVar.b()));
                break;
            default:
                LogUtil.d(TAG, "parseWorkoutReportPlayDataElse tlvChild parse else");
                break;
        }
    }

    public static void parseCommonSectionData(ees eesVar, CommonSectionInfo commonSectionInfo, int i) {
        if (eesVar == null || commonSectionInfo == null) {
            LogUtil.j(TAG, "tlvFather or commonSectionInfo is null");
            return;
        }
        for (eew eewVar : eesVar.e()) {
            parseRunSectionData(eewVar, commonSectionInfo);
            parseGolfSectionData(eewVar, commonSectionInfo);
            parseSkiSectionData(eewVar, commonSectionInfo);
            parseFitnessSectionData(eewVar, commonSectionInfo);
        }
        List<ees> listB = eesVar.b();
        ArrayList arrayList = new ArrayList(16);
        Iterator<ees> it = listB.iterator();
        while (it.hasNext()) {
            List<eew> listE = it.next().e();
            if (i == 19) {
                parseGolfSectionTrackData(listE, arrayList);
            }
            parseCommonFieldData(listE, commonSectionInfo.getCommonFieldMap());
        }
        commonSectionInfo.setSectionTrackStruct(arrayList);
    }

    private static void parseCommonFieldData(List<eew> list, Map<String, List<String>> map) {
        StatisticExtendDataStruct statisticExtendDataStruct = new StatisticExtendDataStruct();
        for (eew eewVar : list) {
            int iV = CommonUtil.v(eewVar.e());
            if (iV == 56) {
                statisticExtendDataStruct.setFieldName(String.valueOf(CommonUtil.v(eewVar.b())));
            } else if (iV == 57) {
                statisticExtendDataStruct.setFieldValue(eeq.d(eewVar.b()));
            } else {
                LogUtil.d(TAG, "parseCommonFieldData command");
            }
        }
        String fieldName = statisticExtendDataStruct.getFieldName();
        String fieldValue = statisticExtendDataStruct.getFieldValue();
        if (fieldName == null || fieldValue == null) {
            LogUtil.j(TAG, "parseCommonFieldData invalid data.");
        } else {
            if (!map.containsKey(fieldName)) {
                ArrayList arrayList = new ArrayList(16);
                arrayList.add(fieldValue);
                map.put(statisticExtendDataStruct.getFieldName(), arrayList);
                return;
            }
            map.get(fieldName).add(fieldValue);
        }
    }

    private static void parseRunSectionData(eew eewVar, CommonSectionInfo commonSectionInfo) {
        switch (CommonUtil.v(eewVar.e())) {
            case 5:
                commonSectionInfo.setSectionNum(CommonUtil.v(eewVar.b()));
                break;
            case 6:
                commonSectionInfo.setSectionTime(CommonUtil.x(eewVar.b()));
                break;
            case 7:
                commonSectionInfo.setSectionDistance(CommonUtil.x(eewVar.b()));
                break;
            case 8:
                commonSectionInfo.setSectionPace(CommonUtil.v(eewVar.b()));
                break;
            case 9:
                commonSectionInfo.setSectionHeartRate(CommonUtil.v(eewVar.b()));
                break;
            case 10:
                commonSectionInfo.setSectionCadence(CommonUtil.v(eewVar.b()));
                break;
            case 11:
                commonSectionInfo.setSectionStepLength(CommonUtil.v(eewVar.b()));
                break;
            case 12:
                commonSectionInfo.setSectionTotalRise(CommonUtil.x(eewVar.b()));
                break;
            case 13:
                commonSectionInfo.setSectionTotalDescend(CommonUtil.x(eewVar.b()));
                break;
            case 14:
                commonSectionInfo.setSectionGroundContactTime(CommonUtil.v(eewVar.b()));
                break;
            case 15:
                commonSectionInfo.setSectionGroundImpactAcceleration(CommonUtil.v(eewVar.b()));
                break;
            case 16:
                commonSectionInfo.setSectionSwingAngle(CommonUtil.v(eewVar.b()));
                break;
            case 17:
                commonSectionInfo.setSectionEversionExcursion(CommonUtil.v(eewVar.b()));
                break;
            default:
                parseRunSectionDataBranch(eewVar, commonSectionInfo);
                break;
        }
    }

    private static void parseRunSectionDataBranch(eew eewVar, CommonSectionInfo commonSectionInfo) {
        int iV = CommonUtil.v(eewVar.e());
        if (iV == 34) {
            commonSectionInfo.setSectionAvgCadence(CommonUtil.v(eewVar.b()));
            return;
        }
        if (iV == 35) {
            commonSectionInfo.setSectionIntervalTrainingType(CommonUtil.v(eewVar.b()));
            return;
        }
        switch (iV) {
            case 40:
                commonSectionInfo.setSectionDivingMaxDepth(CommonUtil.v(eewVar.b()));
                break;
            case 41:
                commonSectionInfo.setSectionDivingUnderwaterTime(CommonUtil.v(eewVar.b()));
                break;
            case 42:
                commonSectionInfo.setSectionDivingBreakTime(CommonUtil.v(eewVar.b()));
                break;
            default:
                LogUtil.d(TAG, "parseRunSectionDataBranch command");
                break;
        }
    }

    private static void parseGolfSectionData(eew eewVar, CommonSectionInfo commonSectionInfo) {
        int iV = CommonUtil.v(eewVar.e());
        switch (iV) {
            case 18:
                commonSectionInfo.setSectionBackSwingTime(CommonUtil.v(eewVar.b()));
                break;
            case 19:
                commonSectionInfo.setSectionDownSwingTime(CommonUtil.v(eewVar.b()));
                break;
            case 20:
                commonSectionInfo.setSectionHeadSpeed(CommonUtil.v(eewVar.b()));
                break;
            case 21:
                commonSectionInfo.setSectionSwingTempo(CommonUtil.v(eewVar.b()));
                break;
            default:
                switch (iV) {
                    case 43:
                        commonSectionInfo.setSectionHoleId(CommonUtil.x(eewVar.b()));
                        break;
                    case 44:
                        commonSectionInfo.setSectionPar(CommonUtil.v(eewVar.b()));
                        break;
                    case 45:
                        commonSectionInfo.setSectionHoleScore(CommonUtil.v(eewVar.b()));
                        break;
                    case 46:
                        commonSectionInfo.setSectionHolePutts(CommonUtil.v(eewVar.b()));
                        break;
                    case 47:
                        commonSectionInfo.setSectionHolePenalty(CommonUtil.v(eewVar.b()));
                        break;
                    case 48:
                        commonSectionInfo.setSectionHoleHits(CommonUtil.v(eewVar.b()));
                        break;
                    case 49:
                        commonSectionInfo.setSectionHandicap(Integer.valueOf(eewVar.b(), 16).byteValue());
                        break;
                    case 50:
                        commonSectionInfo.setSectionValidTracks(CommonUtil.v(eewVar.b()));
                        break;
                    default:
                        LogUtil.d(TAG, "parseGolfSectionData command");
                        break;
                }
                break;
        }
    }

    private static void parseGolfSectionTrackData(List<eew> list, List<GolfShotTrack> list2) {
        GolfShotTrack.c cVar = new GolfShotTrack.c();
        for (eew eewVar : list) {
            switch (CommonUtil.v(eewVar.e())) {
                case 52:
                    cVar.a(eeq.e(eewVar.b()));
                    break;
                case 53:
                    cVar.e(eeq.e(eewVar.b()));
                    break;
                case 54:
                    cVar.d(CommonUtil.v(eewVar.b()));
                    break;
                default:
                    LogUtil.d(TAG, "parseGolfSectionTrackData command");
                    break;
            }
        }
        list2.add(cVar.d());
    }

    private static void parseSkiSectionData(eew eewVar, CommonSectionInfo commonSectionInfo) {
        switch (CommonUtil.v(eewVar.e())) {
            case 22:
                commonSectionInfo.setSectionMaxSpeed(CommonUtil.v(eewVar.b()));
                break;
            case 23:
                commonSectionInfo.setSectionAvgSpeed(CommonUtil.v(eewVar.b()));
                break;
            case 24:
                commonSectionInfo.setSectionStartGpsPointIndex(CommonUtil.x(eewVar.b()));
                break;
            case 25:
                commonSectionInfo.setSectionEndGpsPointIndex(CommonUtil.x(eewVar.b()));
                break;
            case 26:
                commonSectionInfo.setSectionCableStartGpsPointIndex(CommonUtil.x(eewVar.b()));
                break;
            case 27:
                commonSectionInfo.setSectionCableEndGpsPointIndex(CommonUtil.x(eewVar.b()));
                break;
            case 28:
                commonSectionInfo.setSectionSlopeDegree(CommonUtil.v(eewVar.b()));
                break;
            case 29:
                commonSectionInfo.setSectionSlopePercent(CommonUtil.v(eewVar.b()));
                break;
            default:
                LogUtil.d(TAG, "parseSkiSectionDataElse else command");
                break;
        }
    }

    private static void parseFitnessSectionData(eew eewVar, CommonSectionInfo commonSectionInfo) {
        switch (CommonUtil.v(eewVar.e())) {
            case 30:
                commonSectionInfo.setSectionActionId(eeq.d(eewVar.b()));
                break;
            case 31:
                commonSectionInfo.setSectionActionType(CommonUtil.v(eewVar.b()));
                break;
            case 32:
                commonSectionInfo.setSectionActionResultValue(CommonUtil.v(eewVar.b()));
                break;
            case 33:
                commonSectionInfo.setSectionActionTargetValue(CommonUtil.v(eewVar.b()));
                break;
            default:
                LogUtil.d(TAG, "parseFitnessSectionData else command");
                break;
        }
    }

    private static String getFirstValueFromList(List<String> list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        return list.get(0);
    }

    public static HashMap<String, ArrayList> filterHeartRate(List<HeartRateData> list) {
        int i;
        HashMap<String, ArrayList> map = new HashMap<>(16);
        ArrayList arrayList = new ArrayList(16);
        ArrayList arrayList2 = new ArrayList(16);
        map.put(HEART_RATE_LIST, arrayList);
        map.put(INVALID_HEART_RATE_LIST, arrayList2);
        if (list != null && !list.isEmpty()) {
            int size = list.size() - 1;
            int i2 = size;
            while (true) {
                i = -1;
                if (i2 < 0) {
                    i2 = -1;
                    break;
                }
                HeartRateData heartRateData = list.get(i2);
                if ((i2 == size && heartRateData.acquireHeartRate() != 254) || heartRateData.acquireHeartRate() != 254) {
                    break;
                }
                heartRateData.saveHeartRate(-1);
                arrayList2.add(heartRateData);
                i2--;
            }
            if (i2 != -1) {
                for (int i3 = 0; i3 <= i2; i3++) {
                    HeartRateData heartRateData2 = list.get(i3);
                    if ((i3 == 0 && heartRateData2.acquireHeartRate() != 254) || heartRateData2.acquireHeartRate() != 254) {
                        i = i3;
                        break;
                    }
                    heartRateData2.saveHeartRate(-1);
                    arrayList2.add(heartRateData2);
                }
            }
            filterMiddleHeartRate(list, arrayList, i, i2);
        }
        return map;
    }

    private static void filterMiddleHeartRate(List<HeartRateData> list, List<HeartRateData> list2, int i, int i2) {
        if (i != -1) {
            while (i <= i2) {
                HeartRateData heartRateData = list.get(i);
                if (heartRateData.acquireHeartRate() != 254) {
                    list2.add(heartRateData);
                }
                i++;
            }
        }
    }

    public static void sortListByTime(ArrayList<HeartRateData> arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        Collections.sort(arrayList, new Comparator<HeartRateData>() { // from class: com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.HwWorkoutServiceUtils.1
            @Override // java.util.Comparator
            public int compare(HeartRateData heartRateData, HeartRateData heartRateData2) {
                if (heartRateData.acquireTime() - heartRateData2.acquireTime() > 0) {
                    return 1;
                }
                return heartRateData.acquireTime() - heartRateData2.acquireTime() < 0 ? -1 : 0;
            }
        });
    }
}
