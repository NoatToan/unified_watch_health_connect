package com.huawei.hihealth.dictionary.model;

import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.operation.ble.BleConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class HiHealthSportSequenceCommonFields {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<HiHealthDictField> f12293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List<Integer> f12294c = Arrays.asList(217, 218, 219, 229, 230, 231, 232, 233);
    private static final List<HiHealthDictField> d;

    static {
        ArrayList arrayList = new ArrayList();
        d = arrayList;
        arrayList.add(b(300010150, "avgHeartRate", "Integer", false, "avgHeartRate >= 0 && avgHeartRate <= 255"));
        arrayList.add(b(300010186, BleConstants.TOTAL_DISTANCE, "Integer", false, null));
        arrayList.add(b(300010169, "totalSteps", "Integer", false, null));
        arrayList.add(b(300010161, BleConstants.TOTAL_CALORIES, "Integer", false, null));
        arrayList.add(b(300010160, "totalTime", "Integer", false, null));
        arrayList.add(b(300010307, HwExerciseConstants.JSON_NAME_WORKOUT_WEATHER, "Integer", true, "weather >= 0 && weather <= 100"));
        arrayList.add(b(300010308, HwExerciseConstants.JSON_NAME_WORKOUT_TEMPERATURE, "Integer", true, "temperature >= -100 && temperature <= 100"));
        arrayList.add(b(300010309, "apparentTemperature", "Integer", true, "apparentTemperature >= -100 && apparentTemperature <= 100"));
        arrayList.add(b(300010310, "relativeHumidity", "Integer", true, "relativeHumidity >= 0 && relativeHumidity <= 100"));
        arrayList.add(b(300010311, "windDirection", "Integer", true, "windDirection >= 0 && windDirection <= 10"));
        arrayList.add(b(300010312, "windForce", "Integer", true, "windForce >= 0 && windForce <= 20"));
        arrayList.add(b(300010313, "windSpeed", "Integer", true, "windSpeed >= 0 && windSpeed <= 300"));
        arrayList.add(b(300010345, "hrZ1", "Integer", true, "hrZ1 >= 0 && hrZ1 <= 2160000"));
        arrayList.add(b(300010346, "hrZ2", "Integer", true, "hrZ2 >= 0 && hrZ2 <= 2160000"));
        arrayList.add(b(300010347, "hrZ3", "Integer", true, "hrZ3 >= 0 && hrZ3 <= 2160000"));
        arrayList.add(b(300010348, "hrZ4", "Integer", true, "hrZ4 >= 0 && hrZ4 <= 2160000"));
        arrayList.add(b(300010349, "hrZ5", "Integer", true, "hrZ5 >= 0 && hrZ5 <= 2160000"));
        arrayList.add(b(300010369, "avgUpSlope", "Float", true, "avgUpSlope >= 0 && avgUpSlope <= 100"));
        arrayList.add(b(300010370, "avgDownSlope", "Float", true, "avgDownSlope >= -100 && avgDownSlope <= 0"));
        ArrayList arrayList2 = new ArrayList();
        f12293b = arrayList2;
        arrayList2.add(b(300010315, "totalTurnNumber", "Integer", false, "totalTurnNumber >= 0 && totalTurnNumber <= 9999"));
        arrayList2.add(b(300010316, "turnFrequency", "Integer", false, "turnFrequency >= 0 && turnFrequency <= 9999"));
        arrayList2.add(b(300010317, "longRadiusTurn", "Integer", false, "longRadiusTurn >= 0 && longRadiusTurn <= 9999"));
        arrayList2.add(b(300010318, "shortRadiusTurn", "Integer", false, "shortRadiusTurn >= 0 && shortRadiusTurn <= 9999"));
        arrayList2.add(b(300010319, "maxGForce", "Float", false, "maxGForce >= 0 && maxGForce <= 5"));
        arrayList2.add(b(300010320, "averageGForce", "Float", false, "averageGForce >= 0 && averageGForce <= 5"));
        arrayList2.add(b(300010324, "skiPisteRegion", "Integer", false, "skiPisteRegion >= 1 && skiPisteRegion <= 10"));
        arrayList2.add(b(300010325, "advancedPisteDrop", "Integer", false, "advancedPisteDrop >= 0 && advancedPisteDrop <= 65535"));
        arrayList2.add(b(300010326, "intermediatePisteDrop", "Integer", false, "intermediatePisteDrop >= 0 && intermediatePisteDrop <= 65535"));
        arrayList2.add(b(300010327, "easyPisteDrop", "Integer", false, "easyPisteDrop >= 0 && easyPisteDrop <= 65535"));
        arrayList2.add(b(300010328, "novicePisteDrop", "Integer", false, "novicePisteDrop >= 0 && novicePisteDrop <= 65535"));
        arrayList2.add(b(300010329, "advancedPistePercent", "Integer", false, "advancedPistePercent >= 0 && advancedPistePercent <= 100"));
        arrayList2.add(b(300010330, "intermediatePistePercent", "Integer", false, "intermediatePistePercent >= 0 && intermediatePistePercent <= 100"));
        arrayList2.add(b(300010331, "easyPistePercent", "Integer", false, "easyPistePercent >= 0 && easyPistePercent <= 100"));
        arrayList2.add(b(300010332, "novicePistePercent", "Integer", false, "novicePistePercent >= 0 && novicePistePercent <= 100"));
        arrayList2.add(b(300010333, "skiCableTime", "Integer", false, "skiCableTime >= 0"));
        arrayList2.add(b(300010334, "skiFreeTime", "Integer", false, "skiFreeTime >= 0"));
        arrayList2.add(b(300010335, "leftTurnCount", "Integer", false, "leftTurnCount >= 0 && leftTurnCount <= 9999"));
        arrayList2.add(b(300010336, "rightTurnCount", "Integer", false, "rightTurnCount >= 0 && rightTurnCount <= 9999"));
    }

    private static HiHealthDictField b(int i, String str, String str2, boolean z, String str3) {
        HiHealthDictField hiHealthDictField = new HiHealthDictField();
        hiHealthDictField.e(i);
        hiHealthDictField.e(str);
        hiHealthDictField.a(str2);
        hiHealthDictField.c(z);
        if (str3 != null) {
            hiHealthDictField.b(str3);
        }
        return hiHealthDictField;
    }

    public static List<HiHealthDictField> e() {
        return new ArrayList(d);
    }

    public static List<HiHealthDictField> d() {
        return new ArrayList(f12293b);
    }

    public static void a(HiHealthDictType hiHealthDictType) {
        if (hiHealthDictType == null) {
            return;
        }
        if (f12294c.contains(Integer.valueOf(hiHealthDictType.i()))) {
            d(hiHealthDictType, d());
        }
    }

    public static void d(HiHealthDictType hiHealthDictType, List<HiHealthDictField> list) {
        if (hiHealthDictType == null || hiHealthDictType.h() == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(hiHealthDictType.h());
        for (HiHealthDictField hiHealthDictField : list) {
            if (!b(arrayList, hiHealthDictField.c())) {
                arrayList.add(hiHealthDictField);
            }
        }
        hiHealthDictType.d(arrayList);
    }

    private static boolean b(List<HiHealthDictField> list, String str) {
        Iterator<HiHealthDictField> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().c().equals(str)) {
                return true;
            }
        }
        return false;
    }
}
