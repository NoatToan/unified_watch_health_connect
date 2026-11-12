package com.huawei.hihealthservice.hihealthkit.util;

import android.text.TextUtils;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hihealth.CharacteristicConstant;
import com.huawei.hihealth.DataReportModel;
import com.huawei.hihealth.HealthKitDictQuery;
import com.huawei.hihealth.HiHealthKitData;
import com.huawei.hihealth.StartSportParam;
import com.huawei.hihealth.TrendQuery;
import com.huawei.hihealth.data.model.EcgMetaData;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hihealth.data.type.HiSyncType;
import com.huawei.hihealth.dictionary.HiHealthDictManager;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.model.EventTypeInfo;
import com.huawei.hihealth.model.Goal;
import com.huawei.hihealth.model.GoalInfo;
import com.huawei.hihealth.model.HealthAlarmInfo;
import com.huawei.hihealth.model.Recurrence;
import com.huawei.hihealth.model.SportStatusInfo;
import com.huawei.hihealth.model.SubscribeModel;
import com.huawei.hihealth.model.Subscriber;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealthservice.hihealthkit.util.HiHealthKitDataChecker;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import defpackage.hcd;
import defpackage.kzw;
import defpackage.lcq;
import defpackage.ldn;
import defpackage.njy;
import health.compact.a.HiDateUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class HiHealthKitDataChecker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<String> f12529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<String> f12530b;

    public enum MethodType {
        SAVE_SAMPLES,
        DELETE_SAMPLES
    }

    private static boolean c(double d) {
        return d < 0.0d;
    }

    static {
        ArrayList arrayList = new ArrayList();
        f12529a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        f12530b = arrayList2;
        arrayList.add("hasTrackPoint");
        arrayList2.add("true");
        arrayList2.add("false");
    }

    public static boolean d(List list, MethodType methodType, boolean z) {
        if (list == null || list.isEmpty()) {
            ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "hiHealthKitDataList is empty");
            return false;
        }
        HashSet hashSet = new HashSet();
        int type = -1;
        for (Object obj : list) {
            if (!(obj instanceof HiHealthKitData)) {
                ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "checkerDataListValid hiHealthKitDataList has error dataType");
                return false;
            }
            HiHealthKitData hiHealthKitData = (HiHealthKitData) obj;
            if (type == -1) {
                type = hiHealthKitData.getType();
            }
            if (z && hiHealthKitData.getType() != type) {
                ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "checkerDataListValid multiple types are not allowed");
                return false;
            }
            hashSet.add(Boolean.valueOf(hiHealthKitData.getBoolean("insertRealTime")));
            if (hashSet.size() > 1) {
                ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "checkerDataListValid real-time data and non-real-time data cannot be inserted together");
                return false;
            }
            if (type == 50001 && list.size() > 1) {
                ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "checkerDataListValid Only one piece of real-time heart rate data can be inserted at a time");
                return false;
            }
            if (!d(hiHealthKitData, methodType)) {
                return false;
            }
        }
        return true;
    }

    private static boolean d(HiHealthKitData hiHealthKitData, MethodType methodType) {
        int iOrdinal = methodType.ordinal();
        if (iOrdinal == 0) {
            return h(hiHealthKitData);
        }
        if (iOrdinal != 1) {
            return false;
        }
        return e(hiHealthKitData);
    }

    private static boolean h(HiHealthKitData hiHealthKitData) {
        if (a(hiHealthKitData) || c(hiHealthKitData)) {
            return false;
        }
        int type = hiHealthKitData.getType();
        if ((HiHealthDictManager.a(BaseApplication.getContext()).k(type) && (hiHealthKitData.getMap() == null || hiHealthKitData.getMap().isEmpty())) || HiHealthDataType.d(type) == HiHealthDataType.Category.POINT || HiHealthDataType.d(type) == HiHealthDataType.Category.SESSION || HiHealthDataType.d(type) == HiHealthDataType.Category.REALTIME || HiHealthDataType.d(type) == HiHealthDataType.Category.SEQUENCE) {
            return true;
        }
        Map map = hiHealthKitData.getMap();
        if (map == null || map.isEmpty()) {
            ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "saveSampleCheckValid map is null");
            return false;
        }
        if (!a(hiHealthKitData, type)) {
            ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "saveSampleCheckValid time error");
            return false;
        }
        if (!d(map, type)) {
            ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "saveSampleCheckValid map error");
            return false;
        }
        return e(map, type);
    }

    private static boolean e(HiHealthKitData hiHealthKitData) {
        if (a(hiHealthKitData)) {
            return false;
        }
        return !d(hiHealthKitData);
    }

    private static boolean a(HiHealthKitData hiHealthKitData, int i) {
        switch (i) {
            case 10002:
            case 10006:
            case 10010:
            case 10062:
            case 61001:
            case 61002:
            case 500010:
                return hiHealthKitData.getStartTime() == hiHealthKitData.getEndTime();
            default:
                return true;
        }
    }

    private static boolean e(Map map, int i) {
        if (d(map)) {
            ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "map contains null");
            return false;
        }
        if (i == DicDataTypeUtil.DataType.OSA_SET.value()) {
            return a(map);
        }
        if (i == 10001 || i == 10002 || i == 10006) {
            return c(map);
        }
        if (i != 10011 && i != 10065) {
            if (i == 30029) {
                return b(map);
            }
            if (i == 31001) {
                return e(map);
            }
            switch (i) {
                case 10067:
                case 10068:
                case 10069:
                    break;
                default:
                    return true;
            }
        }
        return map.get(Integer.valueOf(i)) instanceof String;
    }

    private static boolean a(Map map) {
        Object obj;
        if (map.containsKey(Integer.valueOf(DicDataTypeUtil.DataType.OSA_LEVEL.value()))) {
            try {
                Double dValueOf = Double.valueOf(String.valueOf(map.get(Integer.valueOf(DicDataTypeUtil.DataType.OSA_LEVEL.value()))));
                double dDoubleValue = dValueOf.doubleValue();
                int iIntValue = dValueOf.intValue();
                if (dDoubleValue - ((double) iIntValue) != 0.0d) {
                    ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "checkOsaValue osaLevel is wrong double");
                    return false;
                }
                if (iIntValue < 1 || iIntValue > 4) {
                    ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "checkOsaValue osaLevel error");
                    return false;
                }
            } catch (NumberFormatException e) {
                ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "checkOsaValue osaLevel parse error", LogAnonymous.b(e));
                return false;
            }
        }
        if (map.containsKey(Integer.valueOf(DicDataTypeUtil.DataType.OSA_DETAIL_HALF_HOUR.value())) && ((obj = map.get(Integer.valueOf(DicDataTypeUtil.DataType.OSA_DETAIL_HALF_HOUR.value()))) == null || TextUtils.isEmpty(obj.toString()))) {
            ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "checkOsaValue osaDetailHalfHour is empty");
            return false;
        }
        if (map.containsKey(Integer.valueOf(DicDataTypeUtil.DataType.OSA_AVG_CNT_PER_HOUR.value()))) {
            Object obj2 = map.get(Integer.valueOf(DicDataTypeUtil.DataType.OSA_AVG_CNT_PER_HOUR.value()));
            if (obj2 instanceof Double) {
                double dDoubleValue2 = ((Double) obj2).doubleValue();
                if (dDoubleValue2 < 0.0d || dDoubleValue2 > 1000.0d) {
                    ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "checkOsaValue osaAvgCntPerHour error");
                }
            }
            return false;
        }
        return true;
    }

    private static boolean d(Map map) {
        return map.containsValue(null) || map.containsValue("");
    }

    private static boolean c(Map map) {
        try {
            for (Object obj : map.entrySet()) {
                if (!(obj instanceof Map.Entry) || c(((Double) ((Map.Entry) obj).getValue()).doubleValue())) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException e) {
            ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "checkValueValid ClassCastException: ", e.getMessage());
            return false;
        }
    }

    private static <T> boolean c(Map map, T t) {
        return map.get(t) instanceof String;
    }

    private static <T> boolean d(Map map, T t) {
        return map.get(t) instanceof Integer;
    }

    private static <T> boolean a(Map map, T t) {
        return map.get(t) instanceof Long;
    }

    private static boolean e(Map map) {
        if (!c(map, "detail_data") || !c(map, "simple_data") || !c(map, "meta_data")) {
            ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "ecg data is invalid");
            return false;
        }
        String strC = kzw.c(map, "detail_data");
        String strC2 = kzw.c(map, "simple_data");
        String strC3 = kzw.c(map, "meta_data");
        try {
            List list = (List) HiJsonUtil.d(strC, new TypeToken<List<Float>>() { // from class: com.huawei.hihealthservice.hihealthkit.util.HiHealthKitDataChecker.1
            }.getType());
            List list2 = (List) HiJsonUtil.d(strC2, new TypeToken<List<Float>>() { // from class: com.huawei.hihealthservice.hihealthkit.util.HiHealthKitDataChecker.2
            }.getType());
            EcgMetaData ecgMetaData = (EcgMetaData) HiJsonUtil.d(strC3, EcgMetaData.class);
            if (list != null && list2 != null && ecgMetaData != null) {
                if (ecgMetaData.getAverageHeartRate() >= 0 && ecgMetaData.getEcgDataLength() >= 0) {
                    if (ecgMetaData.getEcgArrhyType() >= 0 && ecgMetaData.getEcgArrhyType() <= 127) {
                        if (ecgMetaData.getUserSymptom() >= 0 && ecgMetaData.getUserSymptom() <= 1023) {
                            return true;
                        }
                        ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "ecg UserSymptom < 0 or UserSymptom > 1023");
                        return false;
                    }
                    ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "ecg EcgArrhyType < 0 or EcgArrhyType > 127");
                    return false;
                }
                ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "ecg AverageHeartRate < 0 or EcgDataLength < 0");
                return false;
            }
            ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "ecg detailData, simpleData or metaData is empty");
            return false;
        } catch (JsonSyntaxException e) {
            ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "checkEcgValueValid JsonSyntaxException: ", e.getMessage());
            return false;
        }
    }

    private static boolean b(Map map) {
        if (!d(map, BleConstants.SPORT_TYPE) || !a(map, "totalTime") || !d(map, BleConstants.TOTAL_CALORIES)) {
            ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "RopeSkip sportType, totalTime or totalCalories is invalid");
            return false;
        }
        if (!c(map, "skipNum") || !c(map, "skipSpeed")) {
            ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "RopeSkip skipNum or skipSpeed is invalid");
            return false;
        }
        try {
            if (kzw.b(map, BleConstants.SPORT_TYPE) != 283) {
                ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "RopeSkip sportType is invalid");
                return false;
            }
            long jA = kzw.a(map, "totalTime");
            int iB = kzw.b(map, BleConstants.TOTAL_CALORIES);
            String strC = kzw.c(map, "skipNum");
            String strC2 = kzw.c(map, "skipSpeed");
            if (jA >= 0 && iB >= 0 && Long.parseLong(strC) >= 0 && Long.parseLong(strC2) >= 0) {
                return true;
            }
            ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "RopeSkip totalTime, totalCalories, skipNum or skipSpeed < 0");
            return false;
        } catch (NumberFormatException e) {
            ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "checkRopeSkipValueValid NumberFormatException: ", e.getMessage());
            return false;
        }
    }

    private static boolean d(Map map, int i) {
        if (i == DicDataTypeUtil.DataType.OSA_SET.value()) {
            return c(map, e(i));
        }
        if (i == 10001) {
            return c(map, (List) lcq.e);
        }
        if (i == 10002) {
            return c(map, (List) lcq.f39916a);
        }
        if (i == 10006) {
            return c(map, (List) lcq.i);
        }
        if (i != 10062) {
            if (i == 10065) {
                return map.containsKey(10065);
            }
            if (i == 10067) {
                return map.containsKey(10067);
            }
            if (i == 30029) {
                return c(map, (List) lcq.f39918c);
            }
            if (i == 31001) {
                return c(map, (List) lcq.d);
            }
            if (i == 10010) {
                return c(map, e(i));
            }
            if (i == 10011) {
                return map.containsKey(10011);
            }
            switch (i) {
                case 61001:
                case 61002:
                    break;
                default:
                    return true;
            }
        }
        return c(map, (List) lcq.f39917b);
    }

    private static List e(int i) {
        int[] iArrE = HiHealthDataType.e(i);
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArrE) {
            arrayList.add(Integer.valueOf(i2));
        }
        return arrayList;
    }

    private static boolean c(Map map, List list) {
        return list.containsAll(map.keySet());
    }

    private static boolean a(HiHealthKitData hiHealthKitData) {
        if (hiHealthKitData == null) {
            return true;
        }
        return j(hiHealthKitData);
    }

    private static boolean j(HiHealthKitData hiHealthKitData) {
        boolean z = true;
        if (hiHealthKitData.getStartTime() < 0 || hiHealthKitData.getEndTime() < 0) {
            ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "isWrongTimeRange startTime or endTime < 0");
            return true;
        }
        if (hiHealthKitData.getType() == 10010) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (hiHealthKitData.getStartTime() <= jCurrentTimeMillis && hiHealthKitData.getEndTime() <= jCurrentTimeMillis) {
            z = false;
        }
        if (z) {
            ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "isWrongTimeRange startTime or endTime > currentTime");
        }
        return z;
    }

    private static boolean d(HiHealthKitData hiHealthKitData) {
        return hiHealthKitData.getStartTime() > hiHealthKitData.getEndTime();
    }

    public static boolean a(long j, long j2) {
        if (j > j2) {
            ReleaseLogUtil.e("HiH_HiHealthKitDataChecker", "startTime > endTime");
        }
        return j > j2;
    }

    public static boolean c(HealthKitDictQuery healthKitDictQuery) {
        ArrayList<String> filterKeys = healthKitDictQuery.getFilterKeys();
        int size = filterKeys == null ? 0 : filterKeys.size();
        ArrayList<String> filterValues = healthKitDictQuery.getFilterValues();
        if (size != (filterValues == null ? 0 : filterValues.size())) {
            ReleaseLogUtil.e("HiH_HiHealthKitDataChecker", "wrong filter size");
            return false;
        }
        if (size == 0) {
            return true;
        }
        ArrayList arrayList = new ArrayList(filterKeys);
        ArrayList arrayList2 = new ArrayList(filterValues);
        arrayList.removeAll(f12529a);
        arrayList2.removeAll(f12530b);
        if (arrayList.isEmpty() && arrayList2.isEmpty()) {
            return true;
        }
        ReleaseLogUtil.e("HiH_HiHealthKitDataChecker", "wrong filter key or value");
        return false;
    }

    private static boolean c(HiHealthKitData hiHealthKitData) {
        if (hiHealthKitData == null) {
            return true;
        }
        if (hiHealthKitData.getType() == DicDataTypeUtil.DataType.SLEEP_ON_OFF_BED_RECORD.value()) {
            return !b(hiHealthKitData);
        }
        return false;
    }

    private static boolean b(HiHealthKitData hiHealthKitData) {
        ReleaseLogUtil.d("HiH_HiHealthKitDataChecker", "enter checkSleepOnOffBedRecordParam");
        long startTime = hiHealthKitData.getStartTime();
        long j = hiHealthKitData.getLong(String.valueOf(DicDataTypeUtil.DataType.SLEEP_ON_OFF_BED_RECORD_BED_TIME.value()));
        long j2 = hiHealthKitData.getLong(String.valueOf(DicDataTypeUtil.DataType.SLEEP_ON_OFF_BED_RECORD_FALL_ASLEEP_TIME.value()));
        long j3 = hiHealthKitData.getLong(String.valueOf(DicDataTypeUtil.DataType.SLEEP_ON_OFF_BED_RECORD_WAKEUP_TIME.value()));
        long j4 = hiHealthKitData.getLong(String.valueOf(DicDataTypeUtil.DataType.SLEEP_ON_OFF_BED_RECORD_RISING_TIME.value()));
        boolean z = false;
        if (!a(hiHealthKitData, hiHealthKitData.getType())) {
            ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "SleepOnOffBedRecord startTime or endTime error");
            return false;
        }
        if (j2 != 0 || j3 != 0 ? !(j <= 0 || j > j2 || j2 >= j3 || j3 > j4 || j4 > startTime) : !(j <= 0 || j >= j4 || j4 > startTime)) {
            z = true;
        }
        if (!z) {
            ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "SleepOnOffBedRecord time error");
        }
        return z;
    }

    public static boolean c(StartSportParam startSportParam) {
        int i = startSportParam.getInt(BleConstants.SPORT_TYPE);
        if (!b(i)) {
            ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "sport type is not supported");
            return false;
        }
        if (!a(startSportParam.getInt("isSaveData", CharacteristicConstant.SportRecordSaveModel.SAVE.getValue()))) {
            ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "sport type is not supported");
            return false;
        }
        if (!hcd.f36390a.contains(Integer.valueOf(i)) && !hcd.d.contains(Integer.valueOf(i))) {
            String string = startSportParam.getString("macAddress");
            if (!TextUtils.isEmpty(string)) {
                return b(string) && startSportParam.getInt("deviceType") != 0;
            }
            ReleaseLogUtil.d("HiH_HiHealthKitDataChecker", "mac address is empty, not check the mac address, return true");
        }
        return true;
    }

    private static boolean a(int i) {
        boolean z = false;
        for (CharacteristicConstant.SportRecordSaveModel sportRecordSaveModel : CharacteristicConstant.SportRecordSaveModel.values()) {
            if (sportRecordSaveModel.getValue() == i) {
                z = true;
            }
        }
        ReleaseLogUtil.d("HiH_HiHealthKitDataChecker", "checkSportRecordSaveModel result = ", Boolean.valueOf(z));
        return z;
    }

    private static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "macAddress == null");
            return false;
        }
        if (Pattern.compile("[0-9A-F]{2}(:[0-9A-F]{2}){5}").matcher(str).find()) {
            return true;
        }
        ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "Invalid MAC address");
        return false;
    }

    private static boolean b(int i) {
        boolean z = false;
        for (CharacteristicConstant.EnhanceSportType enhanceSportType : CharacteristicConstant.EnhanceSportType.values()) {
            if (enhanceSportType.getEnhanceSportTypeValue() == i) {
                z = true;
            }
        }
        ReleaseLogUtil.d("HiH_HiHealthKitDataChecker", "checkSportType result = ", Boolean.valueOf(z));
        return z;
    }

    public static boolean a(DataReportModel dataReportModel) {
        if (dataReportModel == null) {
            return false;
        }
        int dataType = dataReportModel.getDataType();
        if (CharacteristicConstant.ReportDataType.containsType(dataType)) {
            int reportType = dataReportModel.getReportType();
            if (!CharacteristicConstant.ReportType.containsType(reportType)) {
                ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "checkAutoReportModel unsupported report type ", Integer.valueOf(reportType));
                return false;
            }
            if (reportType == CharacteristicConstant.ReportType.TARGET.getReportTypeValue()) {
                LogUtil.a("HiHealthKitDataChecker", "checkAutoReportModel target report type");
                if (dataReportModel.getReportValue() > 0 && dataReportModel.getMaxReportValue() > dataReportModel.getReportValue()) {
                    return true;
                }
            } else {
                if (reportType == CharacteristicConstant.ReportType.VALUE_INTERVAL.getReportTypeValue()) {
                    LogUtil.a("HiHealthKitDataChecker", "checkAutoReportModel interval report type");
                    return (dataType == CharacteristicConstant.ReportDataType.DATA_POINT_STEP_SUM.getDataType() && CharacteristicConstant.StepValueInterval.containsValue(dataReportModel.getReportValue())) || (dataType == CharacteristicConstant.ReportDataType.DATA_POINT_CALORIES_SUM.getDataType() && CharacteristicConstant.CaloriesValueInterval.containsValue(dataReportModel.getReportValue())) || (dataType == CharacteristicConstant.ReportDataType.DATA_POINT_DISTANCE_SUM.getDataType() && CharacteristicConstant.DistanceValueInterval.containsValue(dataReportModel.getReportValue()));
                }
                ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "checkAutoReportModel unsupported report type ", Integer.valueOf(reportType));
                return false;
            }
        }
        ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "checkAutoReportModel fail ", dataReportModel.toString());
        return false;
    }

    public static boolean e(SubscribeModel subscribeModel) {
        for (int i : subscribeModel.getDataTypes()) {
            if (!CharacteristicConstant.SubscribeType.containsType(i)) {
                return false;
            }
        }
        return true;
    }

    public static int c(Subscriber subscriber) {
        Subscriber subscriber2;
        if (subscriber == null || TextUtils.isEmpty(subscriber.getAppId()) || TextUtils.isEmpty(subscriber.getSubscriberId()) || TextUtils.isEmpty(subscriber.getSecret())) {
            ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "subscriber is invalid. ");
            return 2;
        }
        ArrayList arrayList = new ArrayList(10);
        int iD = ldn.d(subscriber.getAppId(), arrayList);
        if (njy.e(arrayList)) {
            ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "There is no subscriber in this appId. ");
            return iD;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                subscriber2 = null;
                break;
            }
            subscriber2 = (Subscriber) it.next();
        } while (!subscriber2.getSubscriberId().equals(subscriber.getSubscriberId()));
        return (subscriber2 != null && subscriber2.getSecret().equals(subscriber.getSecret()) && subscriber2.getMode() == subscriber.getMode() && subscriber2.getMode() == 2) ? 0 : 2;
    }

    public static boolean b(EventTypeInfo eventTypeInfo, boolean z) {
        if (TextUtils.isEmpty(eventTypeInfo.getEventType()) || TextUtils.isEmpty(eventTypeInfo.getSubType())) {
            ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "eventInfo type is invalid. ");
            return false;
        }
        if (eventTypeInfo instanceof HealthAlarmInfo) {
            if (eventTypeInfo.getSubType().equals(HealthAlarmInfo.Type.TACHYCARDIA.getName()) || eventTypeInfo.getSubType().equals(HealthAlarmInfo.Type.BRADYCARDIA.getName())) {
                return true;
            }
            ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "eventInfo subtype is invalid.");
            return false;
        }
        if (eventTypeInfo instanceof SportStatusInfo) {
            if (eventTypeInfo.getSubType().equals(SportStatusInfo.Type.SPORT_START.getName()) || eventTypeInfo.getSubType().equals(SportStatusInfo.Type.SPORT_END.getName())) {
                return true;
            }
            ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "eventInfo subtype is invalid.");
            return false;
        }
        GoalInfo goalInfo = (GoalInfo) eventTypeInfo;
        if (z && goalInfo.getStartDay() < HiDateUtil.d(System.currentTimeMillis())) {
            ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "invalid start day");
            return false;
        }
        Recurrence recurrence = goalInfo.getRecurrence();
        if (recurrence.getUnit() != 1 || recurrence.getCount() <= 0 || recurrence.getCount() > 366) {
            ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "invalid recurrence");
            return false;
        }
        List<Goal> goals = goalInfo.getGoals();
        if (njy.e(goals) || goals.size() > 3) {
            ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "eventInfo goals is invalid. ");
            return false;
        }
        TreeSet treeSet = new TreeSet(new Comparator() { // from class: leq
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return HiHealthKitDataChecker.a((Goal) obj, (Goal) obj2);
            }
        });
        treeSet.addAll(goals);
        if (treeSet.size() >= goals.size()) {
            return true;
        }
        ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "The goalType and dataType can't be same.");
        return false;
    }

    public static /* synthetic */ int a(Goal goal, Goal goal2) {
        return (goal.getGoalType() == goal2.getGoalType() && goal.getDataType() == goal2.getDataType()) ? 0 : 1;
    }

    public static boolean c(int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "syncDataTypes is empty");
            return false;
        }
        for (int i : iArr) {
            if (!HiSyncType.c(i)) {
                ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "syncDataType = ", Integer.valueOf(i), " is not right");
                return false;
            }
        }
        return true;
    }

    public static boolean a(TrendQuery trendQuery, int i) {
        if (trendQuery == null) {
            ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "TrendQuery is null");
            return false;
        }
        if (trendQuery.getDataTypes().length == 0 || trendQuery.getTrendPeriods().length == 0) {
            ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "TrendQuery data is empty");
            return false;
        }
        if (i >= 0) {
            return true;
        }
        ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "TrendQuery timeout < 0");
        return false;
    }

    public static boolean e(String str) {
        LogUtil.a("HiHealthKitDataChecker", "checkDeviceControlInstruction controlOptions:", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("model")) {
                return d(jSONObject.getInt("power"));
            }
            int i = jSONObject.getInt("model");
            if (i == 1) {
                return d(jSONObject.getInt("power"));
            }
            if (i == 2 || i == 3) {
                ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "checkDeviceControlInstruction not supported model:", Integer.valueOf(i));
                return false;
            }
            if (i == 4) {
                return e(jSONObject.getDouble("grade"));
            }
            ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "checkDeviceControlInstruction invalid model:", Integer.valueOf(i));
            return false;
        } catch (JSONException e) {
            ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "checkDeviceControlInstruction JSONException:", ExceptionUtils.c(e));
            return false;
        }
    }

    private static boolean e(double d) {
        if (d <= 2.0d && d >= -2.0d) {
            return true;
        }
        ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "indoor bike slope error");
        return false;
    }

    public static boolean d(int i) {
        if (i > 0 && i <= 32767) {
            return true;
        }
        ReleaseLogUtil.a("HiH_HiHealthKitDataChecker", "indoor bike power error");
        return false;
    }
}
