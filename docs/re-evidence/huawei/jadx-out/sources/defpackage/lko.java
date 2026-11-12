package defpackage;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.HiSampleConfigKey;
import com.huawei.hihealth.HiSampleConfigProcessOption;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hihealth.data.type.HiConfigDataType;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hihealth.dictionary.HiHealthDictManager;
import com.huawei.hihealth.dictionary.expression.Expression;
import com.huawei.hihealth.dictionary.model.HiHealthDictField;
import com.huawei.hihealth.dictionary.model.HiHealthDictType;
import com.huawei.hihealth.dictionary.model.HiHealthSportSequenceCommonFields;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.seuqneceutils.SequenceDetailFieldConfig;
import com.huawei.operation.OperationKey;
import com.huawei.operation.ble.BleConstants;
import health.compact.a.CommonUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiValidatorUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class lko {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f40370a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f40372c;
    private static final List<Integer> d = Arrays.asList(Integer.valueOf(DicDataTypeUtil.DataType.CORONARY_HEART_DISEASE_RISK_STUDY.value()));
    private static final List<Integer> e = Arrays.asList(Integer.valueOf(DicDataTypeUtil.DataType.OVARY_HEALTH_RESULT_SET.value()), Integer.valueOf(DicDataTypeUtil.DataType.FOUR_LEAF_ACHIEVEMENT_DATA_ACHIEVE.value()));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<Integer, List<HiHealthDictField>> f40371b = new HashMap();

    private static int c(int i, int i2) {
        return (30001 != i || i2 == 0) ? i : i + i2;
    }

    private static boolean c(int i) {
        switch (i) {
            case 47401:
            case 47402:
            case 47403:
            case 47404:
            case 47405:
            case 47406:
                return true;
            default:
                return false;
        }
    }

    static {
        c(259, 300010225, "analogRecoveryTime", "Integer", "analogRecoveryTime >= 0 && analogRecoveryTime <= 2160000");
        c(259, 300010226, "analogAerobicTime", "Integer", "analogAerobicTime >= 0 && analogAerobicTime <= 2160000");
        c(259, 300010227, "analogRhythmTime", "Integer", "analogRhythmTime >= 0 && analogRhythmTime <= 2160000");
        c(259, 300010228, "analogLactateTime", "Integer", "analogLactateTime >= 0 && analogLactateTime <= 2160000");
        c(259, 300010229, "analogMaxOxygenTime", "Integer", "analogMaxOxygenTime >= 0 && analogMaxOxygenTime <= 2160000");
        c(259, 300010230, "analogAnaerobicTime", "Integer", "analogAnaerobicTime >= 0 && analogAnaerobicTime <= 2160000");
        c(259, 300010231, "analogSpurtTime", "Integer", "analogSpurtTime >= 0 && analogSpurtTime <= 2160000");
        c(259, 300010202, "avgSlope", "Integer", "avgSlope >= -1000 && avgSlope <= 1000");
        c(259, 300010203, "maxSlope", "Integer", "maxSlope >= -1000 && maxSlope <= 1000");
        c(259, 300010204, "minSlope", "Integer", "minSlope >= -1000 && minSlope <= 1000");
        c(259, 300010205, "avgAnalogPower", "Integer", "avgAnalogPower >= 0 && avgAnalogPower <= 9999");
        c(259, 300010206, "avgPower", "Integer", "avgPower >= 0 && avgPower <= 9999");
        c(259, 300010207, "maxPower", "Integer", "maxPower >= 0 && maxPower <= 9999");
        c(259, 300010208, "avgCadence", "Integer", "avgCadence >= 0 && avgCadence <= 999");
        c(259, 300010209, "maxCadence", "Integer", "maxCadence >= 0 && maxCadence <= 999");
        c(259, 300010212, "avgAnalogCadence", "Integer", "avgAnalogCadence >= 0 && avgAnalogCadence <= 999");
        c(259, 300010352, "slopeInfoNum", "Integer", "slopeInfoNum >= 0");
        c(259, 300010353, "flatDistance", "Float", "flatDistance >= 0.0");
        c(259, 300010354, "flatRatio", "Float", "flatRatio >= 0.0 && flatRatio <= 100.0");
        c(259, 300010355, "upHillDistance", "Float", "upHillDistance >= 0.0");
        c(259, 300010356, "upHillRatio", "Float", "upHillRatio >= 0.0 && upHillRatio <= 100.0");
        c(259, 300010357, "downHillDistance", "Float", "downHillDistance >= 0.0");
        c(259, 300010358, "downHillRatio", "Float", "downHillRatio >= 0.0 && downHillRatio <= 100.0");
        c(258, 300010224, "maxAnalogPower", "Integer", "maxAnalogPower >= 0 && maxAnalogPower <= 9999");
        c(261, 300010299, "avgFloorSpeed", "Float", "avgFloorSpeed >= 0.0 && avgFloorSpeed < 99.9");
        c(129, 300010242, "maxShotSpeed", "Integer", "maxShotSpeed >= 0 && maxShotSpeed <= 500");
        c(129, 300010243, "overhandStroke", "Integer", "overhandStroke >= 0 && overhandStroke <= 10000");
        c(129, 300010244, "underhandStroke", "Integer", "underhandStroke >= 0 && underhandStroke <= 10000");
        c(140, 300010245, "actionCount", "Integer", "actionCount >= 0 && actionCount <= 99");
        c(140, 300010247, "totalTrainingVolume", "Integer", "totalTrainingVolume >= 0 && totalTrainingVolume <= 99999");
        c(140, 300010248, "totalActionGroups", "Integer", "totalActionGroups >= 0 && totalActionGroups <= 99");
        c(140, 300010249, "trainingWeight", "Integer", "trainingWeight >= 0 && trainingWeight <= 999");
        c(140, 300010250, "rpe", "Integer", "rpe >= 1 && rpe <= 10");
        c(130, 300010262, "serve", "Integer", "serve >= 0 && serve <= 10000");
        c(130, 300010263, "forehand", "Integer", "forehand >= 0 && forehand <= 10000");
        c(130, 300010264, "forehandTopspin", "Integer", "forehandTopspin >= 0 && forehandTopspin <= 10000");
        c(130, 300010265, "forehandFlat", "Integer", "forehandFlat >= 0 && forehandFlat <= 10000");
        c(130, 300010252, "forehandBackspin", "Integer", "forehandBackspin >= 0 && forehandBackspin <= 10000");
        c(130, 300010253, "forehandVolley", "Integer", "forehandVolley >= 0 && forehandVolley <= 10000");
        c(130, 300010268, "backhand", "Integer", "backhand >= 0 && backhand <= 10000");
        c(130, 300010269, "backhandTopspin", "Integer", "backhandTopspin >= 0 && backhandTopspin <= 10000");
        c(130, 300010256, "backhandBackspin", "Integer", "backhandBackspin >= 0 && backhandBackspin <= 10000");
        c(130, 300010257, "backhandVolley", "Integer", "backhandVolley >= 0 && backhandVolley <= 20000");
        c(130, 300010260, "swingTimes", "Integer", "swingTimes >= 0 && swingTimes <= 20000");
        c(130, 300010174, "maxContinuousRally", "Integer", "maxContinuousRally >= 0 && maxContinuousRally <= 10000");
        c(270, 300010274, "jumpTimes", "Integer", "jumpTimes >= 0 && jumpTimes <= 10000");
        c(270, 300010275, "maxJumpHeight", "Float", "maxJumpHeight >= 0");
        c(270, 300010276, "sprintTimes", "Integer", "sprintTimes >= 0 && sprintTimes <= 10000");
        c(270, 300010277, "maxAcceleration", "Float", "maxAcceleration >= 0");
        c(270, 300010278, "turnSpeedUpTimes", "Integer", "turnSpeedUpTimes >= 0 && turnSpeedUpTimes <= 10000");
        c(270, 300010279, "swerveSpeedUpTimes", "Integer", "swerveSpeedUpTimes >= 0 && swerveSpeedUpTimes <= 10000");
        c(270, 300010280, "playerPosition", "Integer", "playerPosition >= 0 && playerPosition <= 100");
        c(270, 300010281, "goalsTimes", "Integer", "goalsTimes >= 0 && goalsTimes <= 10000");
        c(270, 300010282, "assistsTimes", "Integer", "assistsTimes >= 0 && assistsTimes <= 10000");
        c(270, 300010283, "savesTimes", "Integer", "savesTimes >= 0 && savesTimes <= 10000");
        f40370a = Pattern.compile("^-?\\d+(\\.0+)?$");
        f40372c = Pattern.compile("^-?\\d+(\\.\\d+)?$");
    }

    public static List<HiHealthData> b(HiDataInsertOption hiDataInsertOption, boolean z) throws lks {
        if (hiDataInsertOption == null) {
            throw new lks("HiDataInsertOption is null");
        }
        return e(hiDataInsertOption.getDatas(), z);
    }

    private static List<HiHealthData> e(List<HiHealthData> list, boolean z) throws lks {
        if (list == null || list.size() == 0 || list.get(0) == null) {
            throw new lks("List<HiHealthData> is null or datas.get(0) null");
        }
        String deviceUuid = list.get(0).getDeviceUuid();
        if (TextUtils.isEmpty(deviceUuid)) {
            throw new lks("deviceUUID is null");
        }
        ArrayList arrayList = new ArrayList(10);
        int ownerId = list.get(0).getOwnerId();
        Iterator<HiHealthData> it = list.iterator();
        while (it.hasNext()) {
            HiHealthData next = it.next();
            try {
                e(next, deviceUuid, ownerId, z);
            } catch (lks e2) {
                if (!e2.e()) {
                    it.remove();
                    arrayList.add(next);
                } else {
                    LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(5);
                    linkedHashMap.put("validInsertStatus", "fail " + e2.getMessage());
                    ljv.d(BaseApplication.getContext()).c(OperationKey.HEALTH_DATA_INSERT_VALID_FAIL_2129013.value(), linkedHashMap, false);
                }
                ReleaseLogUtil.a("HiH_HiDataInsValid", "validHiHealthData Exception = ", e2.getMessage());
            }
        }
        if (HiCommonUtil.b(list)) {
            throw new lks("all datas is invalid!");
        }
        return arrayList;
    }

    private static void e(HiHealthData hiHealthData, String str, int i, boolean z) throws lks {
        if (hiHealthData == null) {
            throw new lks("HiHealthData is null");
        }
        if (!str.equals(hiHealthData.getDeviceUuid())) {
            throw new lks("deviceUUID is not the same");
        }
        if (i != hiHealthData.getOwnerId()) {
            throw new lks("ownerID is not the same");
        }
        if (z && !HiHealthDataType.Category.REALTIME.equals(HiHealthDataType.d(hiHealthData.getType()))) {
            throw new lks("insert realtime invalid");
        }
        long startTime = hiHealthData.getStartTime();
        long endTime = hiHealthData.getEndTime();
        if (startTime > endTime || startTime <= 0) {
            throw new lks("startTime > endTime or startTime <= 0");
        }
        if (String.valueOf(startTime).length() != 13 || String.valueOf(endTime).length() != 13) {
            throw new lks("time length not right");
        }
        if (HiHealthDictManager.a(BaseApplication.getContext()).a(hiHealthData.getType(), hiHealthData.getSubType())) {
            g(hiHealthData);
        } else {
            e(hiHealthData.getType(), hiHealthData);
        }
    }

    /* JADX INFO: renamed from: lko$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[HiHealthDataType.Category.values().length];
            d = iArr;
            try {
                iArr[HiHealthDataType.Category.POINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[HiHealthDataType.Category.SEQUENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[HiHealthDataType.Category.SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                d[HiHealthDataType.Category.STAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                d[HiHealthDataType.Category.SESSION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                d[HiHealthDataType.Category.REALTIME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                d[HiHealthDataType.Category.CONFIG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                d[HiHealthDataType.Category.CONFIGSTAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                d[HiHealthDataType.Category.BUSINESS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    private static void e(int i, HiHealthData hiHealthData) throws lks {
        switch (AnonymousClass1.d[HiHealthDataType.d(i).ordinal()]) {
            case 1:
                b(i, hiHealthData);
                return;
            case 2:
                f(hiHealthData);
                return;
            case 3:
            case 6:
            case 8:
                return;
            case 4:
                c(i, hiHealthData);
                return;
            case 5:
                i(hiHealthData);
                return;
            case 7:
                b(hiHealthData);
                return;
            case 9:
                a(i, hiHealthData);
                return;
            default:
                throw new lks("Unknown data type: " + i);
        }
    }

    private static void g(HiHealthData hiHealthData) throws lks {
        int i = AnonymousClass1.d[HiHealthDataType.d(hiHealthData.getType()).ordinal()];
        if (i == 1) {
            c(hiHealthData);
            return;
        }
        if (i == 2) {
            d(hiHealthData);
            return;
        }
        if (i != 3) {
            if (i == 4) {
                return;
            }
            if (i != 6) {
                throw new lks("Unknown data type: " + hiHealthData.getType());
            }
        }
        a(hiHealthData);
    }

    private static void c(HiHealthData hiHealthData) throws lks {
        HashMap map = new HashMap(1);
        HiHealthDictManager hiHealthDictManagerA = HiHealthDictManager.a(BaseApplication.getContext());
        HiHealthDictField hiHealthDictFieldC = hiHealthDictManagerA.c(hiHealthData.getType());
        if (hiHealthDictFieldC == null) {
            throw new lks("dictField is null, type is: " + hiHealthData.getType());
        }
        map.put(hiHealthDictFieldC.c(), Double.valueOf(hiHealthData.getValue()));
        HiHealthDictType hiHealthDictTypeI = hiHealthDictManagerA.i(hiHealthData.getType());
        if (hiHealthDictTypeI == null) {
            throw new lks("dictType is null, type is: " + hiHealthData.getType());
        }
        if (!hiHealthDictTypeI.d(map)) {
            throw new lks("dic validate result is false, type is: " + hiHealthData.getType() + ", value is " + hiHealthData.getValue());
        }
        if (e.contains(Integer.valueOf(hiHealthDictTypeI.l()))) {
            e(hiHealthData);
        }
    }

    private static void e(HiHealthData hiHealthData) throws lks {
        Double dValueOf = null;
        for (HiHealthDictField hiHealthDictField : HiHealthDictManager.a(BaseApplication.getContext()).i(hiHealthData.getType()).h()) {
            if (hiHealthDictField.e() == hiHealthData.getType()) {
                dValueOf = Double.valueOf(hiHealthData.getValue());
            }
            String strValueOf = String.valueOf(dValueOf);
            if (dValueOf != null && !StringUtils.g(strValueOf)) {
                String strD = hiHealthDictField.d();
                if (!a(strD, strValueOf)) {
                    throw new lks("Invalid FieldName: " + hiHealthDictField.e() + ", Expected an " + strD + " but was " + dValueOf);
                }
            }
        }
    }

    private static void d(HiHealthData hiHealthData) throws lks {
        List listAsList = Arrays.asList(259, Integer.valueOf(OldToNewMotionPath.SPORT_TYPE_INDOOR_BIKE), 258, 264);
        if (DicDataTypeUtil.DataType.ONE_SECOND_SPORT_DATA_TYPE.value() == hiHealthData.getType() && listAsList.contains(Integer.valueOf(hiHealthData.getSubType()))) {
            f(hiHealthData);
            return;
        }
        if (hiHealthData.getSequenceData() == null && hiHealthData.getSequenceFileUrl() == null) {
            throw new lks("SEQUENCE sequenceData and sequenceFileUrl all null");
        }
        if (hiHealthData.getMetaData() == null) {
            return;
        }
        HiHealthDictManager hiHealthDictManagerA = HiHealthDictManager.a(BaseApplication.getContext());
        if (hiHealthDictManagerA == null) {
            throw new lks("dictManager is null, type is: " + hiHealthData.getType());
        }
        HiHealthDictType hiHealthDictTypeA = hiHealthDictManagerA.a(c(hiHealthData.getType(), hiHealthData.getSubType()));
        if (hiHealthDictTypeA == null) {
            throw new lks("dictType is null, type is: " + hiHealthData.getType());
        }
        if (CollectionUtils.a(hiHealthDictTypeA.h())) {
            ReleaseLogUtil.d("HiH_HiDataInsValid", "healthDictType.getFields() is empty");
            return;
        }
        d(hiHealthData, hiHealthDictTypeA);
        if (d.contains(Integer.valueOf(hiHealthData.getType()))) {
            j(hiHealthData);
        }
    }

    public static void d(HiHealthData hiHealthData, HiHealthDictType hiHealthDictType) throws lks {
        try {
            JSONObject jSONObject = new JSONObject(hiHealthData.getMetaData());
            if (jSONObject.has("avgPace") && Float.isInfinite((float) jSONObject.getDouble("avgPace"))) {
                throw new lks("SEQUENCE metaData avgPace is Infinity!");
            }
            JSONArray jSONArrayNames = jSONObject.names();
            if (jSONArrayNames == null) {
                ReleaseLogUtil.a("HiH_HiDataInsValid", "Failed to validateFields, metaData is empty");
                throw new lks("Failed to validateFields, metaData is empty");
            }
            for (int i = 0; i < jSONArrayNames.length(); i++) {
                String str = (String) jSONArrayNames.get(i);
                if (!str.matches("^(?=.*[a-zA-Z])[a-zA-Z0-9]+$")) {
                    throw new lks("field is wrong:" + str);
                }
            }
            JSONObject jSONObject2 = jSONObject.has(BleConstants.EXTEND_TRACK_DATA_MAP) ? new JSONObject(jSONObject.getString(BleConstants.EXTEND_TRACK_DATA_MAP)) : null;
            HashMap map = new HashMap();
            for (HiHealthDictField hiHealthDictField : hiHealthDictType.h()) {
                Object objB = b(hiHealthDictField.c(), jSONObject, jSONObject2);
                c(hiHealthDictField, objB);
                e(hiHealthDictField, objB);
                c(hiHealthDictField, objB, map);
            }
            if (hiHealthDictType.d(map)) {
                return;
            }
            throw new lks("dic validate result is false, type is: " + hiHealthData.getType() + ", metaData is " + hiHealthData.getMetaData());
        } catch (JSONException e2) {
            ReleaseLogUtil.a("HiH_HiDataInsValid", "Failed to validateFields, JSONException: ", ExceptionUtils.c(e2));
            throw new lks("Failed to validateFields, JSONException: metaData");
        }
    }

    private static Object b(String str, JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        if (jSONObject == null && jSONObject2 == null) {
            return null;
        }
        if (jSONObject != null && jSONObject.has(str)) {
            return jSONObject.get(str);
        }
        if (jSONObject2 == null || !jSONObject2.has(str)) {
            return null;
        }
        return jSONObject2.get(str);
    }

    private static void c(HiHealthDictField hiHealthDictField, Object obj) throws lks {
        if (hiHealthDictField.b()) {
            String strC = hiHealthDictField.c();
            if (hiHealthDictField.g() || obj != null) {
                return;
            }
            ReleaseLogUtil.a("HiH_HiDataInsValid", "Invalid FieldName: " + strC + " is mandatory, but is null");
            throw new lks("Invalid FieldName: " + strC + " is mandatory, but is null");
        }
    }

    private static void e(HiHealthDictField hiHealthDictField, Object obj) throws lks {
        String strC = hiHealthDictField.c();
        if (obj == null) {
            return;
        }
        String strD = hiHealthDictField.d();
        if (StringUtils.g(strD) || !hiHealthDictField.b() || a(strD, String.valueOf(obj))) {
            return;
        }
        throw new lks("Invalid FieldName: " + strC + ", Expected an " + strD + " but was " + obj);
    }

    private static void c(HiHealthDictField hiHealthDictField, Object obj, Map<String, Double> map) throws lks {
        if (obj == null) {
            return;
        }
        String strC = hiHealthDictField.c();
        String strValueOf = String.valueOf(obj);
        String lowerCase = hiHealthDictField.d().toLowerCase(Locale.ENGLISH);
        if (StringUtils.g(lowerCase) || "integer[]".equals(lowerCase)) {
            return;
        }
        if ((TypedValues.Custom.S_INT.equals(lowerCase) || "long".equals(lowerCase) || SequenceDetailFieldConfig.DOUBLE.equals(lowerCase)) && !HiCommonUtil.d(String.valueOf(obj))) {
            throw new lks("field isn't number,type:" + hiHealthDictField.e() + ",field:" + strC);
        }
        map.put(strC, Double.valueOf("string".equals(lowerCase.toLowerCase(Locale.ENGLISH)) ? strValueOf.length() : Double.parseDouble(strValueOf)));
    }

    private static void j(HiHealthData hiHealthData) throws lks {
        try {
            HiHealthDictManager hiHealthDictManagerA = HiHealthDictManager.a(BaseApplication.getContext());
            JSONObject jSONObject = new JSONObject(hiHealthData.getMetaData());
            Object obj = null;
            for (HiHealthDictField hiHealthDictField : hiHealthDictManagerA.h(hiHealthData.getType())) {
                String strC = hiHealthDictField.c();
                if (jSONObject.has(strC)) {
                    obj = jSONObject.get(strC);
                }
                String strValueOf = String.valueOf(obj);
                if (obj != null && !StringUtils.g(strValueOf)) {
                    String strD = hiHealthDictField.d();
                    if (!a(strD, strValueOf)) {
                        throw new lks("Invalid FieldName: " + strC + ", Expected an " + strD + " but was " + obj);
                    }
                }
            }
        } catch (JSONException e2) {
            throw new lks("FromJson JSONException " + e2.getMessage());
        }
    }

    private static void a(HiHealthData hiHealthData, List<HiHealthDictField> list) throws lks {
        try {
            if (CollectionUtils.a(list)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(hiHealthData.getMetaData());
            JSONObject jSONObject2 = jSONObject.has(BleConstants.EXTEND_TRACK_DATA_MAP) ? new JSONObject(jSONObject.getString(BleConstants.EXTEND_TRACK_DATA_MAP)) : null;
            ArrayList<Expression> arrayList = new ArrayList();
            HashMap map = new HashMap();
            for (HiHealthDictField hiHealthDictField : list) {
                Object objB = b(hiHealthDictField.c(), jSONObject, jSONObject2);
                c(hiHealthDictField, objB);
                e(hiHealthDictField, objB);
                if (!StringUtils.g(hiHealthDictField.f())) {
                    arrayList.add(com.huawei.hihealth.dictionary.expression.Pattern.b(hiHealthDictField.f()));
                    c(hiHealthDictField, objB, map);
                }
            }
            for (Expression expression : arrayList) {
                if (map.keySet().containsAll(expression.c()) && !expression.a(map)) {
                    ReleaseLogUtil.a("HiH_HiDataInsValid", "expression = ", expression.c());
                    throw new lks("Invalid ExtendTrackMap param");
                }
            }
        } catch (JSONException e2) {
            ReleaseLogUtil.a("HiH_HiDataInsValid", "Failed to checkSequenceCommonFiled, JSONException: ", ExceptionUtils.c(e2));
            throw new lks("Failed to checkSequenceCommonFiled, JSONException: metaData");
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    private static boolean a(String str, String str2) {
        byte b2;
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != -672261858) {
            if (iHashCode != 2374300) {
                if (iHashCode == 2052876273 && str.equals("Double")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("Long")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals("Integer")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0 || b2 == 1) {
            return f40370a.matcher(str2).matches();
        }
        if (b2 != 2) {
            return true;
        }
        return f40372c.matcher(str2).matches();
    }

    private static void a(HiHealthData hiHealthData) throws lks {
        try {
            HashMap map = (HashMap) new Gson().fromJson(hiHealthData.getFieldsValue(), new TypeToken<HashMap<Integer, Double>>() { // from class: com.huawei.hihealthservice.validator.HiDataInsertValid$1
            }.getType());
            if (map == null || map.isEmpty()) {
                return;
            }
            HiHealthDictManager hiHealthDictManagerA = HiHealthDictManager.a(BaseApplication.getContext());
            HashMap map2 = new HashMap(16);
            for (Map.Entry entry : map.entrySet()) {
                HiHealthDictField hiHealthDictFieldC = hiHealthDictManagerA.c(((Integer) entry.getKey()).intValue());
                if (hiHealthDictFieldC != null) {
                    map2.put(hiHealthDictFieldC.c(), (Double) entry.getValue());
                }
            }
            HiHealthDictType hiHealthDictTypeA = hiHealthDictManagerA.a(hiHealthData.getType());
            if (hiHealthDictTypeA == null) {
                throw new lks("dictType is null, type is: " + hiHealthData.getType());
            }
            if (hiHealthDictTypeA.d(map2)) {
                return;
            }
            throw new lks("dic validate result is false, type is: " + hiHealthData.getType() + ", value is " + hiHealthData.getFieldsValue());
        } catch (JsonSyntaxException e2) {
            throw new lks("FromJson JsonSyntaxException " + e2.getMessage());
        }
    }

    private static void a(int i, HiHealthData hiHealthData) throws lks {
        if (HiValidatorUtil.d(i, hiHealthData.getValue())) {
            return;
        }
        throw new lks("BUSINESS businessValue is out of range type = " + i);
    }

    private static void b(HiHealthData hiHealthData) throws lks {
        int type = hiHealthData.getType();
        if (!HiConfigDataType.f(type)) {
            throw new lks("Unknow data type:" + type);
        }
        int iIntValue = HiConfigDataType.a(type).intValue();
        Object objC = HiConfigDataType.c(iIntValue, 3);
        Object objC2 = HiConfigDataType.c(iIntValue, 4);
        if (objC != null && CommonUtil.a(objC.toString()) < hiHealthData.getValue()) {
            throw new lks("max value is too large");
        }
        if (objC2 != null && CommonUtil.a(objC2.toString()) > hiHealthData.getValue()) {
            throw new lks("min value is too little");
        }
    }

    private static void b(int i, HiHealthData hiHealthData) throws lks {
        if (!HiValidatorUtil.b(i, hiHealthData)) {
            throw new lks("POINT pointValue is out of range type = " + i + ", value is " + hiHealthData.getValue(), 901 == i);
        }
        if (!HiHealthDataType.q(i) || e(hiHealthData.getStartTime(), hiHealthData.getEndTime())) {
            return;
        }
        throw new lks("time is not one minite or not currentMinite type = " + i);
    }

    private static void f(HiHealthData hiHealthData) throws lks {
        if (hiHealthData.getMetaData() == null) {
            throw new lks("SEQUENCE metaData is null");
        }
        if (hiHealthData.getSequenceData() == null && hiHealthData.getSequenceFileUrl() == null) {
            throw new lks("SEQUENCE sequenceData and sequenceFileUrl is null");
        }
        try {
            HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) new Gson().fromJson(hiHealthData.getMetaData(), HiTrackMetaData.class);
            if (hiTrackMetaData != null) {
                if (hiTrackMetaData.getPartTimeMap().size() > 10000 || hiTrackMetaData.getPaceMap().size() > 10000) {
                    throw new lks("SEQUENCE metaData partTimeMap is bigger than 10000!");
                }
                if (Float.isInfinite(hiTrackMetaData.getAvgPace())) {
                    throw new lks("SEQUENCE metaData avgPace is Infinity!");
                }
                if (hiTrackMetaData.getPaceMap() != null) {
                    for (Map.Entry<Integer, Float> entry : hiTrackMetaData.getPaceMap().entrySet()) {
                        if (!liq.e(entry.getValue().floatValue(), 1000000.0d, 0.0d)) {
                            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(5);
                            linkedHashMap.put("pace", String.valueOf(entry.getValue()));
                            ljv.d(BaseApplication.getContext()).c(OperationKey.HEALTH_APP_PACE_2129008.value(), linkedHashMap, false);
                        }
                    }
                }
                if (hiTrackMetaData.getPartTimeMap() != null) {
                    for (Map.Entry<Double, Double> entry2 : hiTrackMetaData.getPartTimeMap().entrySet()) {
                        if (!liq.e(entry2.getValue().doubleValue(), 1000000.0d, 0.0d)) {
                            LinkedHashMap<String, String> linkedHashMap2 = new LinkedHashMap<>(5);
                            linkedHashMap2.put("pace", String.valueOf(entry2.getValue()));
                            ljv.d(BaseApplication.getContext()).c(OperationKey.HEALTH_APP_PACE_2129008.value(), linkedHashMap2, false);
                        }
                    }
                }
            }
            a(hiHealthData, HiHealthSportSequenceCommonFields.e());
            a(hiHealthData, f40371b.get(Integer.valueOf(hiHealthData.getSubType())));
        } catch (JsonSyntaxException unused) {
            throw new lks("FromJson JsonSyntaxException");
        }
    }

    private static void c(int i, HiHealthData hiHealthData) throws lks {
        if (HiValidatorUtil.c(i, hiHealthData.getValue())) {
            return;
        }
        throw new lks("STAT statValue is out of range type = " + i + ", value is " + hiHealthData.getValue(), c(i));
    }

    private static void i(HiHealthData hiHealthData) throws lks {
        long startTime = hiHealthData.getStartTime();
        long endTime = hiHealthData.getEndTime();
        if (e(startTime, endTime)) {
            return;
        }
        throw new lks("SESSION time is not one minite or not currentMinite startTime = " + startTime + ",endTime = " + endTime);
    }

    private static boolean e(long j, long j2) {
        return j % 60000 == 0 && j2 % 60000 == 0 && j2 - j == 60000;
    }

    public static List<HiSampleConfig> e(List<HiSampleConfig> list) throws lks {
        if (HiCommonUtil.b(list)) {
            throw new lks("sampleConfigs is null or empty!");
        }
        ArrayList arrayList = new ArrayList(10);
        Iterator<HiSampleConfig> it = list.iterator();
        while (it.hasNext()) {
            HiSampleConfig next = it.next();
            try {
                a(next);
            } catch (lks e2) {
                it.remove();
                arrayList.add(next);
                ReleaseLogUtil.a("HiH_HiDataInsValid", "validSampleConfigs Exception = ", e2.getMessage());
            }
        }
        if (HiCommonUtil.b(list)) {
            throw new lks("all sampleConfigs is invalid!");
        }
        return arrayList;
    }

    private static void a(HiSampleConfig hiSampleConfig) throws lks {
        d(hiSampleConfig);
        c(hiSampleConfig);
    }

    private static void d(HiSampleConfig hiSampleConfig) throws lks {
        if (hiSampleConfig == null) {
            throw new lks("SampleConfig is null!");
        }
        if (TextUtils.isEmpty(hiSampleConfig.getType())) {
            throw new lks("Type is null!");
        }
        if (TextUtils.isEmpty(hiSampleConfig.getConfigId())) {
            throw new lks("ConfigId is null!");
        }
        if (!hiSampleConfig.getConfigId().startsWith(hiSampleConfig.getType())) {
            throw new lks("ConfigId and type not match!");
        }
        if (TextUtils.isEmpty(hiSampleConfig.getScopeApp())) {
            throw new lks("ScopeApp is null!");
        }
        if (TextUtils.isEmpty(hiSampleConfig.getScopeDeviceType())) {
            throw new lks("ScopeDeviceType is null!");
        }
        if (TextUtils.isEmpty(hiSampleConfig.getConfigData())) {
            throw new lks("ConfigData is null!");
        }
        if (TextUtils.isEmpty(hiSampleConfig.getDeviceUniqueId())) {
            throw new lks("DeviceUniqueId is null!");
        }
        if (hiSampleConfig.getModifiedTime() == 0) {
            throw new lks("ModifiedTime is zero!");
        }
    }

    private static void c(HiSampleConfig hiSampleConfig) throws lks {
        if (hiSampleConfig.getType().length() > 100) {
            throw new lks("Type length is greater than 100!");
        }
        if (hiSampleConfig.getConfigId().length() > 100) {
            throw new lks("ConfigId length is greater than 100!");
        }
        if (hiSampleConfig.getScopeApp().length() > 100) {
            throw new lks("AppType length is greater than 100!");
        }
        if (hiSampleConfig.getScopeDeviceType().length() > 100) {
            throw new lks("DeviceUniqueId length is greater than 100!");
        }
        if (hiSampleConfig.getConfigData().length() > 100000) {
            throw new lks("ConfigData length is greater than 100000!");
        }
        if (hiSampleConfig.getConfigDescription() != null && hiSampleConfig.getConfigDescription().length() > 100) {
            throw new lks("ConfigDescription length is greater than 100!");
        }
        if (hiSampleConfig.getMetaData() != null && hiSampleConfig.getMetaData().length() > 100000) {
            throw new lks("MetaData length is greater than 100000!");
        }
    }

    public static void e(HiSampleConfigProcessOption hiSampleConfigProcessOption) throws lks {
        if (hiSampleConfigProcessOption == null) {
            throw new lks("sampleConfigGetOption is null!");
        }
        if (HiCommonUtil.b(hiSampleConfigProcessOption.getSampleConfigKeyList())) {
            throw new lks("SampleConfigKeyList is null or empty!");
        }
        Iterator<HiSampleConfigKey> it = hiSampleConfigProcessOption.getSampleConfigKeyList().iterator();
        while (it.hasNext()) {
            if (it.next().getType() == null) {
                throw new lks("SampleConfigKey type is null!");
            }
        }
    }

    public static void c(HiSampleConfigProcessOption hiSampleConfigProcessOption) throws lks {
        if (hiSampleConfigProcessOption == null) {
            throw new lks("sampleConfigGetOption is null!");
        }
        if (HiCommonUtil.b(hiSampleConfigProcessOption.getSampleConfigKeyList())) {
            throw new lks("SampleConfigKeyList is null or empty!");
        }
        for (HiSampleConfigKey hiSampleConfigKey : hiSampleConfigProcessOption.getSampleConfigKeyList()) {
            if (hiSampleConfigKey.getType() == null) {
                throw new lks("SampleConfigKey type is null!");
            }
            if (hiSampleConfigKey.getScopeApp() == null) {
                throw new lks("SampleConfigKey appType is null!");
            }
            if (hiSampleConfigKey.getScopeDeviceType() == null) {
                throw new lks("SampleConfigKey deviceUniqueId is null!");
            }
        }
    }

    private static void c(int i, int i2, String str, String str2, String str3) {
        f40371b.computeIfAbsent(Integer.valueOf(i), new Function() { // from class: lkn
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return lko.e((Integer) obj);
            }
        }).add(e(i2, str, str2, true, true, str3));
    }

    static /* synthetic */ List e(Integer num) {
        return new ArrayList();
    }

    private static HiHealthDictField e(int i, String str, String str2, boolean z, boolean z2, String str3) {
        HiHealthDictField hiHealthDictField = new HiHealthDictField();
        hiHealthDictField.e(i);
        hiHealthDictField.e(str);
        hiHealthDictField.a(str2);
        hiHealthDictField.c(z);
        hiHealthDictField.a(z2);
        if (str3 != null) {
            hiHealthDictField.b(str3);
        }
        return hiHealthDictField;
    }
}
